package com.saucedemo;

import org.testng.annotations.Test;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;

import base.ExtentManager;
import base.Hooks;

import org.testng.Assert;
import pageObjects.Login;
import pageObjects.ProductsHomepage;

@Listeners(resources.Listeners.class)

public class ShoppingCartTest extends Hooks {

	public ShoppingCartTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test
	public void numbersOfItem() throws InterruptedException, IOException {

		ExtentManager.log("Starting shopping test");
		Login log = new Login();
		log.getUsername().sendKeys("standard_user");
		log.getPassword().sendKeys("secret_sauce");
		log.getLoginBtn().click();

		ProductsHomepage home = new ProductsHomepage();
		ExtentManager.pass("Reach the homepage");
		home.getAddProdOne().click();
		home.getAddProdTwo().click();

		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(2));
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector(".shopping_cart_badge"), "2"));

		try {
			Assert.assertEquals(home.getShopCardBadge().getText(), "2");
			ExtentManager.pass("Two items are added to basket");
		} catch (Exception e) {
			ExtentManager.fail("Total number of items is not correct");
		}

	}

}
