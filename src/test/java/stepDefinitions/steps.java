package stepDefinitions;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;

import com.google.common.io.Files;


import gherkin.deps.net.iharder.Base64.InputStream;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Allure;
import pageObjects.addNewCustomerPage;
import pageObjects.customersPage;
import pageObjects.editCustomerPage;
import pageObjects.logInPage;
import pageObjects.menuBar;
import pageObjects.productsPage;
import utilities.locators;
import utilities.takeScreenshot;
import utilities.waitHelper;

public class steps extends BaseClass{
	//<----------Steps for first feature file---------->
	@Given("User Launch {string} Browser")
	public void user_launch_browser(String browser) {
        switch (browser) {
            case "Chrome": {
                //Ubicacion del driver Por si se necesita
                //System.setProperty("webdriver.chrome.driver","C:\\Users\\gbrav\\eclipse-workspace\\MvnCucumberOrange\\Drivers\\chromedriver.exe");
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--start-maximized");
                driver = new ChromeDriver(options);
                break;
            }
            case "Edge": {
                //Ubicacion del driver
                EdgeOptions options = new EdgeOptions();
                options.addArguments("--start-maximized");
                driver = new EdgeDriver(options);
                break;
            }
            case "Firefox": {
                //Ubicacion del driver
                FirefoxOptions options = new FirefoxOptions();
                options.addArguments("--start-maximized");
                driver = new FirefoxDriver(options);
                break;
            }
            default:
                driver.quit();
                break;
        }
	    //Utilerias
	  	wait = new waitHelper(driver);
	  	loc = new locators();
	  	screen = new takeScreenshot (driver);
	  	//Page Objects
	  	logIn = new logInPage(driver);
	  	menu = new menuBar(driver);
	  	customer = new customersPage(driver);
	  	addCustomer = new addNewCustomerPage(driver);
	  	editCustomer = new editCustomerPage(driver);
	  	products = new productsPage(driver);
	}

	@When("User Opens URL {string}")
	public void user_opens_url(String link) throws WebDriverException, IOException {
		driver.get(link);
	}
	
	@When("User enters {string} as Username")
	public void user_enters_as_username(String user) throws WebDriverException, IOException{
		logIn.sendUsername(user);
	    screen.screenshot("Input Username");
	}

	@When("User enters {string} as Password")
	public void user_enters_as_password(String psw) throws WebDriverException, IOException{
		logIn.sendPsw(psw);
	    screen.screenshot("Input Password");
	}

	@When("User click LogIn Button")
	public void user_click_log_in_button() throws WebDriverException, IOException{
		logIn.clickLogInBtn();
		screen.screenshot("Click Log In Btn");
	}

	@Then("User validate {string} error message on LogIn page")
	public void user_validate_error_message_on_log_in_page(String msg) throws WebDriverException, IOException{
		Assert.assertTrue(logIn.validateErrorMsg().contains(msg));
		screen.screenshot(logIn.validateErrorMsg() + " Message");
	}
	
	@Then("User validates landing on {string} Page")
	public void user_validates_landing_on_page(String page) throws WebDriverException, IOException {
		Assert.assertTrue(driver.getTitle().contains(page));
		screen.screenshot("Landed on: "+ page);
	}
	
	@Then("Close Browser")
	public void close_browser() {
		driver.quit();	
	}
	
	//<----------Steps for second feature file---------->
	
	@Then("User click {string} from left side Menu")
	public void user_click_from_left_side_menu(String option) throws WebDriverException, IOException {
		menu.clickMenuOption(option);
		screen.screenshot("Clicked " + option + " from menu bar");
	}

	@Then("User click {string} option inside Customers")
	public void user_click_option_inside_customers(String option) throws WebDriverException, IOException {
	    menu.optionInsideCustomers(option);
	    screen.screenshot("Clicked " + option + " inside Customers");
	}

	@Then("User click Add New Button on Customers Page")
	public void user_click_add_new_button_on_customers_page() throws WebDriverException, IOException {
		customer.clickAddNewButton();
		screen.screenshot("Clicked Add New Button");
	}

	@Then("User click Save Button on Add New Customer Page")
	public void user_click_save_button_on_add_new_customer_page() throws WebDriverException, IOException {
	    addCustomer.clickSaveButton();
	    screen.screenshot("Click Save Button");
	}
	
	@Then("User validates {string} error alert")
	public void user_validates_error_alert(String alertMsg) throws WebDriverException, IOException {
		Assert.assertTrue(driver.findElement(loc.alertError).getText().contains(alertMsg));
		screen.screenshot("Alert Message");
	}
	
	@Then("User enters {string} as new Customer Email")
	public void user_enters_as_new_customer_email(String email)  throws WebDriverException, IOException {
	    addCustomer.setEmail(Math.floor(Math.random() * 1000) + email);
	    screen.screenshot("Set " + email + " as customer email");
	}

	@Then("User enters {string} as new Customer Password")
	public void user_enters_as_new_customer_password(String psw)  throws WebDriverException, IOException {
		addCustomer.setPassword(psw);
	    screen.screenshot("Set " + psw + " as customer password");
	}

	@Then("User validates {string} error message under email field")
	public void user_validates_error_message_under_email_field(String errorMsg)  throws WebDriverException, IOException {
		Assert.assertTrue(driver.findElement(loc.errorMsgEmail).getText().contains(errorMsg));
		screen.screenshot("Error Message");
	}
	
	@Then("User enters {string} as new Customer First Name")
	public void user_enters_as_new_customer_first_name(String firstName) throws WebDriverException, IOException{
	    addCustomer.setFirstName(firstName);
	    screen.screenshot("Set " + firstName + " as customer first name");
	}

	@Then("User enters {string} as new Customer Last Name")
	public void user_enters_as_new_customer_last_name(String LastName) throws WebDriverException, IOException{
		addCustomer.setLastName(LastName);
	    screen.screenshot("Set " + LastName + " as customer last name");
	}

	@Then("User set {string} as new Customer Gender")
	public void user_set_as_new_customer_gender(String gender) throws WebDriverException, IOException{
		addCustomer.setGender(gender);
	    screen.screenshot("Set " + gender + " as customer genmder");
	}
	
	@Then("User enters {string} as new Customer Birthday")
	public void user_enters_as_new_customer_birthday(String day) throws WebDriverException, IOException{
		addCustomer.setBirthday(day);
		screen.screenshot("Set " + day + " as customer birthday");
	}
	
	@Then("User enters {string} as new Customer company")
	public void user_enters_as_new_customer_company(String company) throws WebDriverException, IOException{
		addCustomer.setCompany(company);
		screen.screenshot("Set " + company + " as customer company");
	}

	@Then("User selects {string} as new Customer Manager")
	public void user_selects_as_new_customer_manager(String manager) throws WebDriverException, IOException{
		addCustomer.setManager(manager);
		screen.screenshot("Set " + manager + " as customer Manager");
	}
	
	@Then("User validates {string} success alert")
	public void user_validates_success_alert(String alertMsg) throws WebDriverException, IOException{
		Assert.assertTrue(driver.findElement(loc.alertSuccess).getText().contains(alertMsg));
		screen.screenshot("Alert Message");
	}
	
	@Then("User enters {string} on Search First Name field")
	public void user_enters_on_search_first_name_field(String firstName) throws WebDriverException, IOException{
	    customer.searchFirstName(firstName);
	    screen.screenshot("Search " + firstName + " as first name");
	}
	
	@Then("User enters {string} on Search Last Name field")
	public void user_enters_on_search_last_name_field(String lastName) throws WebDriverException, IOException{
		customer.searchLastName(lastName);
	    screen.screenshot("Search " + lastName + " as last name");
	}

	@Then("User click Search Customer Button")
	public void user_click_search_customer_button() throws WebDriverException, IOException{
	    customer.cickSearchButton();
	    screen.screenshot("Click Search Button");
	}
	
	@Then("User click Edit Customer Button")
	public void user_click_edit_customer_button() throws WebDriverException, IOException{
		customer.cickEditCustomerButton();
	    screen.screenshot("Click Edit Customer Button");
	}

	@Then("User click Delete Customer Button")
	public void user_click_delete_customer_button() throws WebDriverException, IOException{
	    editCustomer.clickDeleteButton();
	    screen.screenshot("Click Delete Customer Button");
	}

	@Then("User click Delete Customer Confirmation Button")
	public void user_click_delete_customer_confirmation_button() throws WebDriverException, IOException{
		editCustomer.clickDeleteConfirmationButton();
	    screen.screenshot("Click Delete Confirmation Button");
	}
	
	//<----------Steps for Third feature file---------->
	
	@Then("User click {string} option inside Catalog")
	public void user_click_option_inside_catalog(String option) throws WebDriverException, IOException{
	    menu.optionInsideCatalog(option);
	    screen.screenshot("Clicked " + option + " from menu bar");
	}
	
	@Then("User click Import Button")
	public void user_click_import_button() throws WebDriverException, IOException{
		products.clickImport();
		screen.screenshot("Clicked Import Button");
	}

	@Then("User select a {string} file to import")
	public void user_select_a_file_to_import(String fileType) throws WebDriverException, IOException{
	    products.selectFile(fileType);
	    screen.screenshot("Selected " + fileType + " as file type");
	}

	@Then("user click Import Form Excel Button")
	public void user_click_import_form_excel_button() throws WebDriverException, IOException{
		products.clickImportFromExcel();
		screen.screenshot("Clicked Import From Excel Button");
	}

}



