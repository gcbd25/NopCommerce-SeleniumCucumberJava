package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;
import utilities.locators;
import utilities.waitHelper;

public class editCustomerPage {
	//Llamamos al driver
	public WebDriver driver;
	//Se instancian lo que se encuentra dentro de el folder de "Utilities"
	waitHelper wait;
	locators loc;
			
	public editCustomerPage(WebDriver rdriver) {
		driver = rdriver;
		PageFactory.initElements(driver, this);
		wait = new waitHelper(driver);
		loc = new locators();
	}
	
	public boolean clickDeleteButton () {
		try {
			wait.waitPresenceOfElementLocated(loc.btnDeleteCustomer);
			driver.findElement(loc.btnDeleteCustomer).click();
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
			wait.waitPresenceOfElementLocated(loc.btnDeleteCustomerConfirmation);
			driver.findElement(loc.btnDeleteCustomerConfirmation).click();
		}catch(Exception e) {
			driver.quit();
			Assert.fail(e.getMessage());
			//System.out.println(e.getMessage());
			return false;
		}
		return true;
	}
}
