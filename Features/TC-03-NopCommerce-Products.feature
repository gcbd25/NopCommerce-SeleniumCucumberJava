Feature: Validate the functionality of Products page on NopCommerce site

  Scenario: As a User, I want to see an error when trying to upload a PNG file
    Given User Launch "Chrome" Browser
    When User Opens URL "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
    And User enters "admin@yourstore.com" as Username
    And User enters "admin" as Password
    And User click LogIn Button
    Then User validates landing on "Dashboard" Page
    And User click "Catalog" from left side Menu
    And User click "Products" option inside Catalog
    Then User validates landing on "Products" Page
    And User click Import Button 
    And User select a "PNG" file to import
    And user click Import Form Excel Button
    Then User validates "For security purposes, the feature you have requested is not available on the demo site." error alert
    And Close Browser
    
    Scenario: As a User, I want to see a success message when uploading an Excel File
    Given User Launch "Chrome" Browser
    When User Opens URL "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
    And User enters "admin@yourstore.com" as Username
    And User enters "admin" as Password
    And User click LogIn Button
    Then User validates landing on "Dashboard" Page
    And User click "Catalog" from left side Menu
    And User click "Products" option inside Catalog
    Then User validates landing on "Products" Page
    And User click Import Button 
    And User select a "Excel" file to import
    And user click Import Form Excel Button
    Then User validates "Success Message" success alert
    And Close Browser