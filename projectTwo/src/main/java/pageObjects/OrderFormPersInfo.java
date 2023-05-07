package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class OrderFormPersInfo extends BasePage {

	public OrderFormPersInfo() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public WebDriver driver;

	By firstName = By.cssSelector("#first-name");
	By lastName = By.cssSelector("#last-name");
	By postalCode = By.cssSelector("#postal-code");
	By cancelBtn = By.cssSelector("#cancel");
	By continueBtn = By.cssSelector("#continue");

	public WebElement getFirstName() throws IOException {
		this.driver = getDriver();
		return driver.findElement(firstName);
	}

	public WebElement getLastName() throws IOException {
		this.driver = getDriver();
		return driver.findElement(lastName);
	}

	public WebElement getCancelBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(cancelBtn);
	}

	public WebElement getContinueBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(continueBtn);
	}

	public WebElement getPostalCode() throws IOException {
		this.driver = getDriver();
		return driver.findElement(postalCode);
	}
}
