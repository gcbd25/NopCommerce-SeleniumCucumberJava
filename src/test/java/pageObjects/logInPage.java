package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;
import utilities.locators;
import utilities.waitHelper;

public class logInPage {
	//Llamamos al driver
	public WebDriver driver;
	//Se instancian lo que se encuentra dentro de el folder de "Utilities"
	waitHelper wait;
	locators loc;
		
	public logInPage(WebDriver rdriver) {
		driver = rdriver;
		PageFactory.initElements(driver, this);
		wait = new waitHelper(driver);
		loc = new locators();
	}
		
	public boolean sendUsername (String user) {
		try {
			wait.waitPresenceOfElementLocated(loc.inpUserNameLogIn);
			driver.findElement(loc.inpUserNameLogIn).clear();
			driver.findElement(loc.inpUserNameLogIn).sendKeys(user);
		}catch(Exception e) {
			driver.quit();
			Assert.fail(e.getMessage());
			//System.out.println(e.getMessage());
			return false;
		}
		return true;
	}
		
	public boolean sendPsw (String psw) {
		try {
			driver.findElement(loc.inpPswLogIn).clear();
			driver.findElement(loc.inpPswLogIn).sendKeys(psw);
		}catch(Exception e) {
			driver.quit();
			Assert.fail(e.getMessage());
			//System.out.println(e.getMessage());
			return false;
		}
		return true;
	}
		
	public boolean clickLogInBtn () {
		try {
			driver.findElement(loc.btnLogIn).click();
		}catch(Exception e) {
			driver.quit();
			Assert.fail(e.getMessage());
			//System.out.println(e.getMessage());
			return false;
		}
		return true;
	}
		
	public String validateErrorMsg () {
		try {
			wait.waitVisibilityOfElementLocated(loc.errorMsgInvalidCred);
			return driver.findElement(loc.errorMsgInvalidCred).getText();
		}catch(Exception e) {
			driver.quit();
			Assert.fail(e.getMessage());
			//System.out.println(e.getMessage());
			return "Something is not working";
		}
	}
		
		
			
}
