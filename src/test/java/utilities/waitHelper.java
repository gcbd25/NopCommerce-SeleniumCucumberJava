package utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class waitHelper {
	public WebDriver driver;
	
	public waitHelper(WebDriver driver) {
		this.driver = driver;
	}
	
	public void waitVisibilityOfElementLocated (By element) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30L)).pollingEvery(Duration.ofSeconds(5L)).ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.visibilityOfElementLocated(element));
	}
	
	public void waitElementToBeClickable (By element) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30L)).pollingEvery(Duration.ofSeconds(5L)).ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public void waitPresenceOfElementLocated (By element) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30L)).pollingEvery(Duration.ofSeconds(5L)).ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.presenceOfElementLocated(element));
	}

}
