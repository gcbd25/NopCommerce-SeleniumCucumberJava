package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;
import stepDefinitions.BaseClass;
import utilities.locator.locatorsMenuBar;
import utilities.waitHelper;

public class menuBar extends BaseClass {
	public menuBar(WebDriver rdriver) {
		driver = rdriver;
		PageFactory.initElements(driver, this);
		wait = new waitHelper(driver);
		locMenuBar = new locatorsMenuBar();
	}
	
	public boolean clickMenuOption (String option) {
		try {
			if (option.equals("Customers")) {
				wait.waitVisibilityOfElementLocated(locMenuBar.ddwnCustomers);
				driver.findElement(locMenuBar.ddwnCustomers).click();
			}else if (option.equals("Catalog")) {
				wait.waitPresenceOfElementLocated(locMenuBar.ddwnCatalog);
				driver.findElement(locMenuBar.ddwnCatalog).click();
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
				wait.waitPresenceOfElementLocated(locMenuBar.ddwnCustomersOptionCustomers);
				driver.findElement(locMenuBar.ddwnCustomersOptionCustomers).click();
			}else if (option.equals("Customer Roles")) {
				wait.waitPresenceOfElementLocated(locMenuBar.ddwnCustomersOptionCustomerRoles);
				driver.findElement(locMenuBar.ddwnCustomersOptionCustomerRoles).click();
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
				wait.waitPresenceOfElementLocated(locMenuBar.ddwnCatalogOptionProducts);
				driver.findElement(locMenuBar.ddwnCatalogOptionProducts).click();
			}else if (option.equals("Categories")) {
				wait.waitPresenceOfElementLocated(locMenuBar.ddwnCatalogOptionCategories);
				driver.findElement(locMenuBar.ddwnCatalogOptionCategories).click();
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
