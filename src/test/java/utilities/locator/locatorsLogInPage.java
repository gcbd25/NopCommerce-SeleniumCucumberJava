package utilities.locator;

import org.openqa.selenium.By;

public class locatorsLogInPage {
    public By inpUserNameLogIn = By.xpath("//input[@id='Email']");
    public By inpPswLogIn = By.xpath("//input[@id='Password']");
    public By btnLogIn = By.xpath("//button[normalize-space()='Log in']");
    public By errorMsgInvalidCred = By.xpath("//div[@class='message-error validation-summary-errors']");
}
