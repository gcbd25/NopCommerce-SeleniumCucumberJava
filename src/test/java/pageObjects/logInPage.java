package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import stepDefinitions.BaseClass;
import utilities.locator.locatorsLogInPage;
import utilities.waitHelper;

import static org.testng.AssertJUnit.fail;

public class logInPage extends BaseClass {
	public logInPage(WebDriver rdriver) {
		driver = rdriver;
		PageFactory.initElements(driver, this);
		wait = new waitHelper(driver);
		locLogIn = new locatorsLogInPage();
	}
		
	public boolean sendUsername (String user) {
		try {
			wait.waitPresenceOfElementLocated(locLogIn.inpUserNameLogIn);
			driver.findElement(locLogIn.inpUserNameLogIn).clear();
			driver.findElement(locLogIn.inpUserNameLogIn).sendKeys(user);
		}catch(Exception e) {
            fail();
			return false;
		}
		return true;
	}
		
	public boolean sendPsw (String psw) {
		try {
			driver.findElement(locLogIn.inpPswLogIn).clear();
			driver.findElement(locLogIn.inpPswLogIn).sendKeys(psw);
		}catch(Exception e) {
			fail(e.getMessage());
			return false;
		}
		return true;
	}
		
	public boolean clickLogInBtn () {
		try {
			driver.findElement(locLogIn.btnLogIn).click();
			return true;
		}catch(Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}
		
	public boolean validateErrorMsg (String msg) {
		try {
			wait.waitVisibilityOfElementLocated(locLogIn.errorMsgInvalidCred);
			Assert.assertTrue(driver.findElement(locLogIn.errorMsgInvalidCred).getText().contains(msg));
			return true;
		}catch(Exception e) {
			System.out.println(e.getMessage());
			fail("Error in assertion");
			return false;
		}
	}
			
}
