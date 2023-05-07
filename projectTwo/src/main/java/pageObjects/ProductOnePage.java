package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class ProductOnePage extends BasePage {

	public ProductOnePage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public WebDriver driver;

	By backBtn = By.cssSelector("#back-to-products");
	By addProduct = By.cssSelector("#add-to-cart-sauce-labs-backpack");
	By removeProduct = By.cssSelector("#remove-sauce-labs-backpack");
	By shoppingCardLink = By.cssSelector("div#shopping_cart_container > .shopping_cart_link");

	public WebElement getBackBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(backBtn);
	}

	public WebElement getAddProd() throws IOException {
		this.driver = getDriver();
		return driver.findElement(addProduct);
	}

	public WebElement getRemoveProd() throws IOException {
		this.driver = getDriver();
		return driver.findElement(removeProduct);
	}

	public WebElement getShopCardLink() throws IOException {
		this.driver = getDriver();
		return driver.findElement(shoppingCardLink);
	}

}
