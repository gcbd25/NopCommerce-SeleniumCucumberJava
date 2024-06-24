package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;
import utilities.locators;
import utilities.waitHelper;

public class customersPage {
	//Llamamos al driver
	public WebDriver driver;
	//Se instancian lo que se encuentra dentro de el folder de "Utilities"
	waitHelper wait;
	locators loc;
				
	public customersPage(WebDriver rdriver) {
		driver = rdriver;
		PageFactory.initElements(driver, this);
		wait = new waitHelper(driver);
		loc = new locators();
	}
	
	
	public boolean clickAddNewButton () {
		try {
			wait.waitPresenceOfElementLocated(loc.btnAddNew);
			driver.findElement(loc.btnAddNew).click();
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
			driver.findElement(loc.inpSearchFirstName).clear();
			driver.findElement(loc.inpSearchFirstName).sendKeys(firstName);
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
			driver.findElement(loc.inpSearchLasttName).clear();
			driver.findElement(loc.inpSearchLasttName).sendKeys(lastName);
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
			driver.findElement(loc.btnSearchCustomer).click();
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
			wait.waitPresenceOfElementLocated(loc.btnAddNew);
			driver.findElement(loc.btnEditCustomer).click();
		}catch(Exception e) {
			driver.quit();
			Assert.fail(e.getMessage());
			//System.out.println(e.getMessage());
			return false;
		}
		return true;
	}
}
