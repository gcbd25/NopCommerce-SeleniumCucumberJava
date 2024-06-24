Feature: Validate the functionality of LogIn page on NopCommerce site

  @Skip
  Scenario: As a User, I want to validate the functionality for Log In using Valid Credentials
    Given User Launch "Edge" Browser
    When User Opens URL "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
    And User enters "admin@yourstore.com" as Username
    And User enters "admin" as Password
    And User click LogIn Button
    Then User validates landing on "Dashboard" Page
    And Close Browser

  Scenario Outline: As a User, I want to validate the functionality for Log In using Invalid Credentials
    Given User Launch "Edge" Browser
    When User Opens URL "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
    And User enters "<Username>" as Username
    And User enters "<Password>" as Password
    And User click LogIn Button
    Then User validate "Login was unsuccessful. Please correct the errors and try again." error message on LogIn page
    And Close Browser
    
    Examples: 
      | Username | Password  |
      | admin@yourstore.com    | admin1234 |
      | Admin2@yourstore.com   | admin  |
