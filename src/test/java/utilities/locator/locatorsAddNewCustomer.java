package utilities.locator;

import org.openqa.selenium.By;

public class locatorsAddNewCustomer {
    public By btnSaveNewCustomer = By.xpath("//button[@name='save']");
    public By inpEmailNewCustomer = By.xpath("//input[@id='Email']");
    public By errorMsgEmail = By.xpath("//span[@class='field-validation-error']");
    public By inpPswNewCustomer = By.xpath("//input[@id='Password']");
    public By inpFirstNameNewCustomer = By.xpath("//input[@id='FirstName']");
    public By inpfLastNameNewCustomer = By.xpath("//input[@id='LastName']");
    public By radioButtonMale = By.xpath("//input[@id='Gender_Male']");
    public By radioButtonFemale = By.xpath("//input[@id='Gender_Female']");
    public By inpBirthday = By.xpath("//input[@id='DateOfBirth']");
    public By inpCompany = By.xpath("//input[@id='Company']");
}
