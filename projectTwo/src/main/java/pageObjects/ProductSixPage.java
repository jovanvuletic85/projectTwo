package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class ProductSixPage extends BasePage {

	public ProductSixPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public WebDriver driver;

	By backBtn = By.cssSelector("#back-to-products");
	By addProduct = By.cssSelector("button#add-to-cart-test\\.allthethings\\(\\)-t-shirt-\\(red\\)");
	By removeProduct = By.cssSelector("[name='remove-test\\.allthethings\\(\\)-t-shirt-\\(red\\)']");
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
