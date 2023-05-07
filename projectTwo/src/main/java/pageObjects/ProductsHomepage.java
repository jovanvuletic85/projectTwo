package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class ProductsHomepage extends BasePage {

	public ProductsHomepage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public WebDriver driver;

	By shoppingCardLink = By.cssSelector(".shopping_cart_link");
	By shoppingCardBadge = By.cssSelector(".shopping_cart_badge");
	By productOne = By.cssSelector(".inventory_list .inventory_item:nth-of-type(1) .inventory_item_name");
	By addProdOne = By.cssSelector("#add-to-cart-sauce-labs-backpack");
	By removeProdOne = By.cssSelector("button#remove-sauce-labs-backpack");
	By productTwo = By.cssSelector(".inventory_list .inventory_item:nth-of-type(2) .inventory_item_name");
	By addProdTwo = By.cssSelector("#add-to-cart-sauce-labs-bike-light");
	By removeProdTwo = By.cssSelector("#remove-sauce-labs-bike-light");
	By productThree = By.cssSelector(".inventory_list .inventory_item:nth-of-type(3) .inventory_item_name");
	By addProdThree = By.cssSelector("#add-to-cart-sauce-labs-bolt-t-shirt");
	By removeProdThree = By.cssSelector("#remove-sauce-labs-bolt-t-shirt");
	By productFour = By.cssSelector(".inventory_list .inventory_item:nth-of-type(4) .inventory_item_name");
	By addProdFour = By.cssSelector("#add-to-cart-sauce-labs-fleece-jacket");
	By removeProdFour = By.cssSelector("#remove-sauce-labs-fleece-jacket");
	By productFive = By.cssSelector(".inventory_list .inventory_item:nth-of-type(5) .inventory_item_name");
	By addProdFive = By.cssSelector("#add-to-cart-sauce-labs-onesie");
	By removeProdFive = By.cssSelector("#remove-sauce-labs-onesie");
	By productSix = By.cssSelector(".inventory_list .inventory_item:nth-of-type(6) .inventory_item_name");
	By addProdSix = By.xpath("/html//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']");
	By removeProdSix = By.xpath("/html//button[@id='remove-test.allthethings()-t-shirt-(red)']");

	public WebElement getShopCardLink() throws IOException {
		this.driver = getDriver();
		return driver.findElement(shoppingCardLink);
	}

	public WebElement getShopCardBadge() throws IOException {
		this.driver = getDriver();
		return driver.findElement(shoppingCardBadge);
	}

	public WebElement getProdOne() throws IOException {
		this.driver = getDriver();
		return driver.findElement(productOne);
	}

	public WebElement getAddProdOne() throws IOException {
		this.driver = getDriver();
		return driver.findElement(addProdOne);
	}

	public WebElement getRemoveProdOne() throws IOException {
		this.driver = getDriver();
		return driver.findElement(removeProdOne);
	}

	public WebElement getProdTwo() throws IOException {
		this.driver = getDriver();
		return driver.findElement(productTwo);
	}

	public WebElement getAddProdTwo() throws IOException {
		this.driver = getDriver();
		return driver.findElement(addProdTwo);
	}

	public WebElement getRemoveProdTwo() throws IOException {
		this.driver = getDriver();
		return driver.findElement(removeProdTwo);
	}

	public WebElement getProdThree() throws IOException {
		this.driver = getDriver();
		return driver.findElement(productThree);
	}

	public WebElement getAddProdThree() throws IOException {
		this.driver = getDriver();
		return driver.findElement(addProdThree);
	}

	public WebElement getRemoveProdThree() throws IOException {
		this.driver = getDriver();
		return driver.findElement(removeProdThree);
	}

	public WebElement getProdFour() throws IOException {
		this.driver = getDriver();
		return driver.findElement(productFour);
	}

	public WebElement getAddProdFour() throws IOException {
		this.driver = getDriver();
		return driver.findElement(addProdFour);
	}

	public WebElement getRemoveProdFour() throws IOException {
		this.driver = getDriver();
		return driver.findElement(removeProdFour);
	}

	public WebElement getProdFive() throws IOException {
		this.driver = getDriver();
		return driver.findElement(productFive);
	}

	public WebElement getAddProdFive() throws IOException {
		this.driver = getDriver();
		return driver.findElement(addProdFive);
	}

	public WebElement getRemoveProdFive() throws IOException {
		this.driver = getDriver();
		return driver.findElement(removeProdFive);
	}

	public WebElement getProdSix() throws IOException {
		this.driver = getDriver();
		return driver.findElement(productSix);
	}

	public WebElement getAddProdSix() throws IOException {
		this.driver = getDriver();
		return driver.findElement(addProdSix);
	}

	public WebElement getRemoveProdSix() throws IOException {
		this.driver = getDriver();
		return driver.findElement(removeProdSix);
	}

}
