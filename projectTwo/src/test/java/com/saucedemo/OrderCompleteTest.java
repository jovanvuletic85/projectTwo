package com.saucedemo;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.ExtentManager;
import base.Hooks;
import pageObjects.CheckoutCompletePage;
import pageObjects.CheckoutPage;
import pageObjects.Login;
import pageObjects.OrderFormPersInfo;
import pageObjects.ProductCart;
import pageObjects.ProductsHomepage;

@Listeners(resources.Listeners.class)

public class OrderCompleteTest extends Hooks {

	public OrderCompleteTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test
	public void endToEndTest() throws IOException {

		FileInputStream workBookLocation = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\java\\resources\\LoginData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(workBookLocation);
		XSSFSheet sheet = workbook.getSheetAt(0);
		Row row1 = sheet.getRow(1);
		Cell cellR1C0 = row1.getCell(0);
		Cell cellR1C1 = row1.getCell(1);

		String usernameRow1 = cellR1C0.toString();
		String passwordRow1 = cellR1C1.toString();
		
		ExtentManager.log("Starting order test");
		Login log = new Login();
		log.getUsername().sendKeys(usernameRow1);
		log.getPassword().sendKeys(passwordRow1);
		log.getLoginBtn().click();
		

		ProductsHomepage homepage = new ProductsHomepage();
		ExtentManager.pass("Reach the homepage");
		homepage.getAddProdOne().click();
		homepage.getShopCardLink().click();

		ProductCart product = new ProductCart();
		product.getCheckoutBtn().click();

		OrderFormPersInfo persInfo = new OrderFormPersInfo();
		persInfo.getFirstName().sendKeys("Petar");
		persInfo.getLastName().sendKeys("Petrovic");
		persInfo.getPostalCode().sendKeys("21000");
		ExtentManager.pass("Have successfully fill person data");
		persInfo.getContinueBtn().click();

		CheckoutPage checkout = new CheckoutPage();
		ExtentManager.pass("Reach the checkout");
		checkout.getCheckoutBtn().click();

		CheckoutCompletePage checkoutComp = new CheckoutCompletePage();
		checkoutComp.getBackToProdBtn().click();

	}
}
