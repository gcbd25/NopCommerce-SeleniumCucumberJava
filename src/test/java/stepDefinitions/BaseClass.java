package stepDefinitions;

import dataProvider.ConfigFileReader;
import org.openqa.selenium.WebDriver;

import pageObjects.addNewCustomerPage;
import pageObjects.customersPage;
import pageObjects.editCustomerPage;
import pageObjects.logInPage;
import pageObjects.menuBar;
import pageObjects.productsPage;
import utilities.locator.*;
import utilities.takeScreenshot;
import utilities.waitHelper;


public class BaseClass {
	//Driver
	public WebDriver driver;
	//Se instancia los archivos de "Utilities" para usarlos en Steps.java
	public waitHelper wait;
	public takeScreenshot screen;
	//Xpaths for Page Objects
	public locatorsLogInPage locLogIn;
	public locatorsMenuBar locMenuBar;
	public locatorsCustomerPage locCustomer;
	public locatorsAddNewCustomer locAddNewCustomer;
	public locatorsEditCustomerPage locEditCustomer;
	public locatorsProductPage locProducts;
	public locatorsCommon locCommon;
	//"Page Object"
	public logInPage logIn;
	public menuBar menu;
	public customersPage customer;
	public addNewCustomerPage addCustomer;
	public editCustomerPage editCustomer;
	public productsPage products;
	public static ConfigFileReader configFileReader;
}
