Feature: Validate the functionality of Customers page on NopCommerce site

  Scenario: As a User, I want to see an error message if I leave empty all fields while creating a user
    Given User Launch "Chrome" Browser
    When User Opens URL "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
    And User enters "admin@yourstore.com" as Username
    And User enters "admin" as Password
    And User click LogIn Button
    Then User validates landing on "Dashboard" Page
    And User click "Customers" from left side Menu
    And User click "Customers" option inside Customers
    Then User validates landing on "Customers" Page
    And User click Add New Button on Customers Page
    Then User validates landing on "Add a new customer" Page
    And User click Save Button on Add New Customer Page
    Then User validates "Valid Email is required for customer to be in 'Registered' role" error alert
    And Close Browser

  Scenario: As a User, I want to see an error message if I enter an invalid email address
    Given User Launch "Edge" Browser
    When User Opens URL "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
    And User enters "admin@yourstore.com" as Username
    And User enters "admin" as Password
    And User click LogIn Button
    Then User validates landing on "Dashboard" Page
    And User click "Customers" from left side Menu
    And User click "Customers" option inside Customers
    Then User validates landing on "Customers" Page
    And User click Add New Button on Customers Page
    Then User validates landing on "Add a new customer" Page
    And User enters "asdasdasdasd.com" as new Customer Email
    And User enters "asdasdasdasd.com" as new Customer Password
    Then User validates "Please enter a valid email address." error message under email field
    And Close Browser

  @Skip
  Scenario: As a User, I want to be able to create a new user
    Given User Launch "Chrome" Browser
    When User Opens URL "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
    And User enters "admin@yourstore.com" as Username
    And User enters "admin" as Password
    And User click LogIn Button
    Then User validates landing on "Dashboard" Page
    And User click "Customers" from left side Menu
    And User click "Customers" option inside Customers
    Then User validates landing on "Customers" Page
    And User click Add New Button on Customers Page
    Then User validates landing on "Add a new customer" Page
    And User enters "asdasd@asdasd.com" as new Customer Email
    And User enters "asdasdasd" as new Customer Password
    And User enters "Carlos" as new Customer First Name
    And User enters "Diaz" as new Customer Last Name
    And User set "Male" as new Customer Gender
    And User enters "20-07-1995" as new Customer Birthday
    And User enters "Test Company" as new Customer company
    And User selects "Vendor 2" as new Customer Manager
    And User click Save Button on Add New Customer Page
    Then User validates "The new customer has been added successfully." success alert
    And Close Browser

  @Skip
  Scenario: As a User, I want to be able to delete
    Given User Launch "Edge" Browser
    When User Opens URL "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
    And User enters "admin@yourstore.com" as Username
    And User enters "admin" as Password
    And User click LogIn Button
    Then User validates landing on "Dashboard" Page
    And User click "Customers" from left side Menu
    And User click "Customers" option inside Customers
    Then User validates landing on "Customers" Page
    And User enters "Carlos" on Search First Name field
    And User enters "Diaz" on Search Last Name field
    And User click Search Customer Button
    And User click Edit Customer Button
    Then User validates landing on "Edit customer" Page
    And User click Delete Customer Button
    And User click Delete Customer Confirmation Button
    Then User validates "The customer has been deleted successfully." success alert
    And Close Browser
