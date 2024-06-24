package utilities;

import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import io.qameta.allure.Allure;

public class takeScreenshot {
	public WebDriver driver;
	
	public takeScreenshot(WebDriver driver) {
		this.driver = driver;
	}
	
	public void screenshot (String name) throws WebDriverException, IOException {
		Allure.addAttachment(name, FileUtils.openInputStream(((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE)));
	}
}
