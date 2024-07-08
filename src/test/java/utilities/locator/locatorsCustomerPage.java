package utilities.locator;

import org.openqa.selenium.By;

public class locatorsCustomerPage {
    public By btnAddNew = By.xpath("//a[normalize-space()='Add new']");
    public By inpSearchFirstName = By.xpath("//input[@id='SearchFirstName']");
    public By inpSearchLasttName = By.xpath("//input[@id='SearchLastName']");
    public By btnSearchCustomer = By.xpath("//button[@id='search-customers']");
    public By btnEditCustomer = By.xpath("//a[normalize-space()='Edit']");
}
