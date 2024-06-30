package stepDefinitions;

import dataProvider.ConfigFileReader;
import org.openqa.selenium.WebDriver;

import pageObjects.addNewCustomerPage;
import pageObjects.customersPage;
import pageObjects.editCustomerPage;
import pageObjects.logInPage;
import pageObjects.menuBar;
import pageObjects.productsPage;
import utilities.locators;
import utilities.takeScreenshot;
import utilities.waitHelper;


public class BaseClass {
	//Driver
	public WebDriver driver;
	//Se instancia los archivos de "Utilities" para usarlos en Steps.java
	public waitHelper wait;
	public locators loc;
	public takeScreenshot screen;
	//Se instancian los archivos de "Page Object" para usarlos en Steps.java
	public logInPage logIn;
	public menuBar menu;
	public customersPage customer;
	public addNewCustomerPage addCustomer;
	public editCustomerPage editCustomer;
	public productsPage products;
	public static ConfigFileReader configFileReader;
}
