package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class locators {
	//Log In Page Xpaths
	public By inpUserNameLogIn = By.xpath("//input[@id='Email']");
	public By inpPswLogIn = By.xpath("//input[@id='Password']");
	public By btnLogIn = By.xpath("//button[normalize-space()='Log in']");
	public By errorMsgInvalidCred = By.xpath("//div[@class='message-error validation-summary-errors']");
	//Dashboard Page Xpaths
	public By title = By.xpath("//h1[@class='float-left']");
	//Left side Menu Xpaths
	public By ddwnCustomers = By.xpath("//a[@href='#']//p[contains(text(),'Customers')]");
	public By ddwnCustomersOptionCustomers = By.xpath("//a[@href='/Admin/Customer/List']//p[contains(text(),'Customers')]");
	public By ddwnCustomersOptionCustomerRoles = By.xpath("//p[normalize-space()='Customer roles']");
	public By ddwnCatalog = By.xpath("//p[normalize-space()='Catalog']");
	public By ddwnCatalogOptionProducts = By.xpath("//p[normalize-space()='Products']");
	public By ddwnCatalogOptionCategories = By.xpath("//p[normalize-space()='Categories']");
	//Customer Page Xpaths 
	public By btnAddNew = By.xpath("//a[normalize-space()='Add new']");
	public By inpSearchFirstName = By.xpath("//input[@id='SearchFirstName']");
	public By inpSearchLasttName = By.xpath("//input[@id='SearchLastName']");
	public By btnSearchCustomer = By.xpath("//button[@id='search-customers']");
	public By btnEditCustomer = By.xpath("//a[normalize-space()='Edit']");
	//Add a new customer Page Xpaths
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
	public By ddwnManager = By.xpath("//select[@id='VendorId']");
	//Alerts
	public By alertError = By.xpath("//div[@class='alert alert-danger alert-dismissable']");
	public By alertSuccess = By.xpath("//div[@class='alert alert-success alert-dismissable']");
	//Edit Customers Page Xpaths
	public By btnDeleteCustomer = By.xpath("//span[@id='customer-delete']");
	public By btnDeleteCustomerConfirmation = By.xpath("//button[normalize-space()='Delete']");
	//Products Page Xpaths
	public By btnImport = By.xpath("//button[@name='importexcel']");
	public By btnSelectFile = By.xpath("//input[@id='importexcelfile']");
	public By btnImportFromExcel = By.xpath("//button[normalize-space()='Import from Excel']");
}
