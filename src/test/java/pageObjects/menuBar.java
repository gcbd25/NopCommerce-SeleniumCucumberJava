package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;
import utilities.locators;
import utilities.waitHelper;

public class menuBar {
	//Llamamos al driver
	public WebDriver driver;
	//Se instancian lo que se encuentra dentro de el folder de "Utilities"
	waitHelper wait;
	locators loc;
			
	public menuBar(WebDriver rdriver) {
		driver = rdriver;
		PageFactory.initElements(driver, this);
		wait = new waitHelper(driver);
		loc = new locators();
	}
	
	public boolean clickMenuOption (String option) {
		try {
			if (option.equals("Customers")) {
				wait.waitVisibilityOfElementLocated(loc.ddwnCustomers);
				driver.findElement(loc.ddwnCustomers).click();
			}else if (option.equals("Catalog")) {
				wait.waitPresenceOfElementLocated(loc.ddwnCatalog);
				driver.findElement(loc.ddwnCatalog).click();
			}else {
				driver.quit();
			}
		}catch(Exception e) {
			driver.quit();
			Assert.fail(e.getMessage());
			//System.out.println(e.getMessage());
			return false;
		}
		return true;
	}
	
	public boolean optionInsideCustomers (String option) {
		try {
			if (option.equals("Customers")) {
				wait.waitPresenceOfElementLocated(loc.ddwnCustomersOptionCustomers);
				driver.findElement(loc.ddwnCustomersOptionCustomers).click();
			}else if (option.equals("Customer Roles")) {
				wait.waitPresenceOfElementLocated(loc.ddwnCustomersOptionCustomerRoles);
				driver.findElement(loc.ddwnCustomersOptionCustomerRoles).click();
			}else {
				driver.quit();
			}
		}catch(Exception e) {
			driver.quit();
			Assert.fail(e.getMessage());
			//System.out.println(e.getMessage());
			return false;
		}
		return true;
	}
	
	public boolean optionInsideCatalog (String option) {
		try {
			if (option.equals("Products")) {
				wait.waitPresenceOfElementLocated(loc.ddwnCatalogOptionProducts);
				driver.findElement(loc.ddwnCatalogOptionProducts).click();
			}else if (option.equals("Categories")) {
				wait.waitPresenceOfElementLocated(loc.ddwnCatalogOptionCategories);
				driver.findElement(loc.ddwnCatalogOptionCategories).click();
			}else {
				driver.quit();
			}
		}catch(Exception e) {
			driver.quit();
			Assert.fail(e.getMessage());
			//System.out.println(e.getMessage());
			return false;
		}
		return true;
	}
}
