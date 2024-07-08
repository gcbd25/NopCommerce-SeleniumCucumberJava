package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;
import stepDefinitions.BaseClass;
import utilities.locator.locatorsCustomerPage;
import utilities.waitHelper;

public class customersPage extends BaseClass {
	public customersPage(WebDriver rdriver) {
		driver = rdriver;
		PageFactory.initElements(driver, this);
		wait = new waitHelper(driver);
		locCustomer = new locatorsCustomerPage();
	}
	
	
	public boolean clickAddNewButton () {
		try {
			wait.waitPresenceOfElementLocated(locCustomer.btnAddNew);
			driver.findElement(locCustomer.btnAddNew).click();
		}catch(Exception e) {
			driver.quit();
			Assert.fail(e.getMessage());
			//System.out.println(e.getMessage());
			return false;
		}
		return true;
	}
	
	public boolean searchFirstName (String firstName) {
		try {
			driver.findElement(locCustomer.inpSearchFirstName).clear();
			driver.findElement(locCustomer.inpSearchFirstName).sendKeys(firstName);
		}catch(Exception e) {
			driver.quit();
			Assert.fail(e.getMessage());
			//System.out.println(e.getMessage());
			return false;
		}
		return true;
	}
	
	public boolean searchLastName (String lastName) {
		try {
			driver.findElement(locCustomer.inpSearchLasttName).clear();
			driver.findElement(locCustomer.inpSearchLasttName).sendKeys(lastName);
		}catch(Exception e) {
			driver.quit();
			Assert.fail(e.getMessage());
			//System.out.println(e.getMessage());
			return false;
		}
		return true;
	}
	
	public boolean cickSearchButton () {
		try {
			driver.findElement(locCustomer.btnSearchCustomer).click();
		}catch(Exception e) {
			driver.quit();
			Assert.fail(e.getMessage());
			//System.out.println(e.getMessage());
			return false;
		}
		return true;
	}
	
	public boolean cickEditCustomerButton () {
		try {
			wait.waitPresenceOfElementLocated(locCustomer.btnAddNew);
			driver.findElement(locCustomer.btnEditCustomer).click();
		}catch(Exception e) {
			driver.quit();
			Assert.fail(e.getMessage());
			//System.out.println(e.getMessage());
			return false;
		}
		return true;
	}
}
