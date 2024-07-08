package pageObjects;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;
import stepDefinitions.BaseClass;
import utilities.locator.locatorsProductPage;
import utilities.waitHelper;

public class productsPage extends BaseClass {
		public productsPage(WebDriver rdriver) {
			driver = rdriver;
			PageFactory.initElements(driver, this);
			wait = new waitHelper(driver);
			locProducts = new locatorsProductPage();
		}
		
		public boolean clickImport () {
			try {
				wait.waitVisibilityOfElementLocated(locProducts.btnImport);
				driver.findElement(locProducts.btnImport).click();
			}catch(Exception e) {
				driver.quit();
				Assert.fail(e.getMessage());
				//System.out.println(e.getMessage());
				return false;
			}
			return true;
		}
		
		public boolean selectFile (String fileType) {
			try {
				if (fileType.equals("Excel")) {
					File uploadFile = new File("C:\\Users\\gbrav\\eclipse-workspace\\MvnCucumberProject\\Files\\Lm5HZeCFSLeuR2XghUi3Vw_fdb1c84394ae45a1b5b1e3fb910809f1_DeliveryTimes_DistanceData_SPA.xlsx");
				    WebElement fileInput = driver.findElement(locProducts.btnSelectFile);
				    fileInput.sendKeys(uploadFile.getAbsolutePath());
				}else if (fileType.equals("PNG")) {
					File uploadFile = new File("C:\\Users\\gbrav\\eclipse-workspace\\MvnCucumberProject\\Files\\Gancho3.png");
				    WebElement fileInput = driver.findElement(locProducts.btnSelectFile);
				    fileInput.sendKeys(uploadFile.getAbsolutePath());
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
		
		public boolean clickImportFromExcel () {
			try {
				wait.waitVisibilityOfElementLocated(locProducts.btnImportFromExcel);
				driver.findElement(locProducts.btnImportFromExcel).click();
			}catch(Exception e) {
				driver.quit();
				Assert.fail(e.getMessage());
				//System.out.println(e.getMessage());
				return false;
			}
			return true;
		}
}
