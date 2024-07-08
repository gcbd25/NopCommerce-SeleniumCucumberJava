package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;
import stepDefinitions.BaseClass;
import utilities.locator.locatorsEditCustomerPage;
import utilities.waitHelper;

public class editCustomerPage extends BaseClass {
	public editCustomerPage(WebDriver rdriver) {
		driver = rdriver;
		PageFactory.initElements(driver, this);
		wait = new waitHelper(driver);
		locEditCustomer = new locatorsEditCustomerPage();
	}
	
	public boolean clickDeleteButton () {
		try {
			wait.waitPresenceOfElementLocated(locEditCustomer.btnDeleteCustomer);
			driver.findElement(locEditCustomer.btnDeleteCustomer).click();
		}catch(Exception e) {
			driver.quit();
			Assert.fail(e.getMessage());
			//System.out.println(e.getMessage());
			return false;
		}
		return true;
	}
	
	public boolean clickDeleteConfirmationButton () {
		try {
			wait.waitPresenceOfElementLocated(locEditCustomer.btnDeleteCustomerConfirmation);
			driver.findElement(locEditCustomer.btnDeleteCustomerConfirmation).click();
		}catch(Exception e) {
			driver.quit();
			Assert.fail(e.getMessage());
			//System.out.println(e.getMessage());
			return false;
		}
		return true;
	}
}
