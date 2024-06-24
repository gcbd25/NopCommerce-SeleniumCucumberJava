package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;
import utilities.locators;
import utilities.waitHelper;

public class addNewCustomerPage {
	//Llamamos al driver
	public WebDriver driver;
	//Se instancian lo que se encuentra dentro de el folder de "Utilities"
	waitHelper wait;
	locators loc;
		
	public addNewCustomerPage(WebDriver rdriver) {
		driver = rdriver;
		PageFactory.initElements(driver, this);
		wait = new waitHelper(driver);
		loc = new locators();
	}
	
	public boolean clickSaveButton () {
		try {
			wait.waitPresenceOfElementLocated(loc.btnSaveNewCustomer);
			driver.findElement(loc.btnSaveNewCustomer).click();
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
			wait.waitPresenceOfElementLocated(loc.inpEmailNewCustomer);
			driver.findElement(loc.inpEmailNewCustomer).clear();
			driver.findElement(loc.inpEmailNewCustomer).sendKeys(email);
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
			driver.findElement(loc.inpPswNewCustomer).clear();
			driver.findElement(loc.inpPswNewCustomer).sendKeys(psw);
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
			driver.findElement(loc.inpFirstNameNewCustomer).clear();
			driver.findElement(loc.inpFirstNameNewCustomer).sendKeys(firstName);
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
			driver.findElement(loc.inpfLastNameNewCustomer).clear();
			driver.findElement(loc.inpfLastNameNewCustomer).sendKeys(lastName);
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
				driver.findElement(loc.radioButtonMale).click();
			}else if(gender.equals("Female")) {
				driver.findElement(loc.radioButtonFemale).click();
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
	
	public boolean setBirthday (String day) {
		try {
			driver.findElement(loc.inpBirthday).clear();
			driver.findElement(loc.inpBirthday).sendKeys(day);
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
			driver.findElement(loc.inpCompany).clear();
			driver.findElement(loc.inpCompany).sendKeys(company);
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
