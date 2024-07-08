package utilities.locator;

import org.openqa.selenium.By;

public class locatorsMenuBar {
    public By ddwnCustomers = By.xpath("//a[@href='#']//p[contains(text(),'Customers')]");
    public By ddwnCustomersOptionCustomers = By.xpath("//a[@href='/Admin/Customer/List']//p[contains(text(),'Customers')]");
    public By ddwnCustomersOptionCustomerRoles = By.xpath("//p[normalize-space()='Customer roles']");
    public By ddwnCatalog = By.xpath("//p[normalize-space()='Catalog']");
    public By ddwnCatalogOptionProducts = By.xpath("//p[normalize-space()='Products']");
    public By ddwnCatalogOptionCategories = By.xpath("//p[normalize-space()='Categories']");
}
