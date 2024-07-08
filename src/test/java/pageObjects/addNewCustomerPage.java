package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;
import stepDefinitions.BaseClass;
import utilities.locator.locatorsAddNewCustomer;
import utilities.waitHelper;

import static junit.framework.TestCase.fail;

public class addNewCustomerPage extends BaseClass {
	public addNewCustomerPage(WebDriver rdriver) {
		driver = rdriver;
		PageFactory.initElements(driver, this);
		wait = new waitHelper(driver);
		locAddNewCustomer = new locatorsAddNewCustomer();
	}
	
	public boolean clickSaveButton () {
		try {
			wait.waitPresenceOfElementLocated(locAddNewCustomer.btnSaveNewCustomer);
			driver.findElement(locAddNewCustomer.btnSaveNewCustomer).click();
		}catch(Exception e) {
			driver.quit();
			Assert.fail(e.getMessage());
			//System.out.println(e.getMessage());
			return false;
		}
		return true;
	}
	
	public boolean setEmail (String email) {
		try {
			wait.waitPresenceOfElementLocated(locAddNewCustomer.inpEmailNewCustomer);
			driver.findElement(locAddNewCustomer.inpEmailNewCustomer).clear();
			driver.findElement(locAddNewCustomer.inpEmailNewCustomer).sendKeys(email);
		}catch(Exception e) {
			driver.quit();
			Assert.fail(e.getMessage());
			//System.out.println(e.getMessage());
			return false;
		}
		return true;
	}
	
	public boolean setPassword (String psw) {
		try {
			driver.findElement(locAddNewCustomer.inpPswNewCustomer).clear();
			driver.findElement(locAddNewCustomer.inpPswNewCustomer).sendKeys(psw);
		}catch(Exception e) {
			driver.quit();
			Assert.fail(e.getMessage());
			//System.out.println(e.getMessage());
			return false;
		}
		return true;
	}
	
	public boolean setFirstName (String firstName) {
		try {
			driver.findElement(locAddNewCustomer.inpFirstNameNewCustomer).clear();
			driver.findElement(locAddNewCustomer.inpFirstNameNewCustomer).sendKeys(firstName);
		}catch(Exception e) {
			driver.quit();
			Assert.fail(e.getMessage());
			//System.out.println(e.getMessage());
			return false;
		}
		return true;
	}
	
	public boolean setLastName (String lastName) {
		try {
			driver.findElement(locAddNewCustomer.inpfLastNameNewCustomer).clear();
			driver.findElement(locAddNewCustomer.inpfLastNameNewCustomer).sendKeys(lastName);
		}catch(Exception e) {
			driver.quit();
			Assert.fail(e.getMessage());
			//System.out.println(e.getMessage());
			return false;
		}
		return true;
	}
	
	public boolean setGender (String gender) {
		try {
			if(gender.equals("Male")) {
				driver.findElement(locAddNewCustomer.radioButtonMale).click();
			}else if(gender.equals("Female")) {
				driver.findElement(locAddNewCustomer.radioButtonFemale).click();
			}else {
				driver.quit();
			}
		}catch(Exception e) {
			driver.quit();
			fail();
			//System.out.println(e.getMessage());
			return false;
		}
		return true;
	}
	
	public boolean setBirthday (String day) {
		try {
			driver.findElement(locAddNewCustomer.inpBirthday).clear();
			driver.findElement(locAddNewCustomer.inpBirthday).sendKeys(day);
		}catch(Exception e) {
			driver.quit();
			Assert.fail(e.getMessage());
			//System.out.println(e.getMessage());
			return false;
		}
		return true;
	}
	
	public boolean setCompany (String company) {
		try {
			driver.findElement(locAddNewCustomer.inpCompany).clear();
			driver.findElement(locAddNewCustomer.inpCompany).sendKeys(company);
		}catch(Exception e) {
			driver.quit();
			Assert.fail(e.getMessage());
			//System.out.println(e.getMessage());
			return false;
		}
		return true;
	}
	
	public boolean setManager (String manager) {
		WebElement testDropDown = driver.findElement(By.xpath("//select[@id='VendorId']"));  
		Select dropdown = new Select(testDropDown);  
		try {
			if(manager.equals("Not a vendor")) {
				dropdown.selectByVisibleText("Not a vendor");
			}else if(manager.equals("Vendor 1")) {
				dropdown.selectByVisibleText("Vendor 1");
			}else if(manager.equals("Vendor 2")) {
				dropdown.selectByVisibleText("Vendor 2");
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
