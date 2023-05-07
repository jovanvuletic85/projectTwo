package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class CheckoutPage extends BasePage {

	public CheckoutPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public WebDriver driver;

	By itemBtn = By.cssSelector(".inventory_item_name");
	By shoppingCardBtn = By.cssSelector(".shopping_cart_link");
	By checkoutBtn = By.cssSelector("button#finish");
	By cancelBtn = By.cssSelector("button#cancel");

	public WebElement getItemBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(itemBtn);
	}

	public WebElement getShopCardBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(shoppingCardBtn);
	}

	public WebElement getCheckoutBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(checkoutBtn);
	}

	public WebElement getContinueBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(cancelBtn);
	}

}
