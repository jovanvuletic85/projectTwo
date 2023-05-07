package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class Login extends BasePage{

	public Login() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public WebDriver driver;

	By username = By.cssSelector("#user-name");
	By password=By.cssSelector("#password");
	By loginBtn=By.cssSelector("#login-button");
	
	public WebElement getUsername() throws IOException {
		this.driver = getDriver();
		return driver.findElement(username);
	}
	
	public WebElement getPassword() throws IOException {
		this.driver = getDriver();
		return driver.findElement(password);
	}

	public WebElement getLoginBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(loginBtn);
	}
}
