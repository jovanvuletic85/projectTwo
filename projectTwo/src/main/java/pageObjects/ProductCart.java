package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class ProductCart extends BasePage {

	public ProductCart() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public WebDriver driver;

	By removeProdOneBtn = By.cssSelector("#remove-sauce-labs-backpack");
	By continueShopBtn = By.cssSelector("#continue-shopping");
	By checkoutBtn = By.cssSelector("#checkout");
	By itemPrice = By.cssSelector(".inventory_item_price");

	public WebElement getRemoveProdOneBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(removeProdOneBtn);
	}

	public WebElement getContinueShopBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(continueShopBtn);
	}

	public WebElement getCheckoutBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(checkoutBtn);
	}

	public WebElement getItemPrice() throws IOException {
		this.driver = getDriver();
		return driver.findElement(itemPrice);
	}
}
