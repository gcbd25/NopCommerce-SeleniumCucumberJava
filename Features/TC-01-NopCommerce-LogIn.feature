Feature: Validate the functionality of LogIn page on NopCommerce site

  @Skip
  Scenario: As a User, I want to validate the functionality for Log In using Valid Credentials
    Given User Launch "Edge" Browser
    When User Opens URL
    And User enters a valid Username
    And User enters a valid Password
    And User click LogIn Button
    Then User validates landing on "Dashboard" Page
    And Close Browser

  @Skip
  Scenario: As a User, I want to validate the functionality for Log In using Invalid Username
    Given User Launch "Chrome" Browser
    When User Opens URL
    And User enters a invalid Username
    And User enters a valid Password
    And User click LogIn Button
    Then User validate "Login was unsuccessful. Please correct the errors and try again." error message on LogIn page
    And Close Browser

  @Skip
  Scenario: As a User, I want to validate the functionality for Log In using Invalid Password
    Given User Launch "Chrome" Browser
    When User Opens URL
    And User enters a valid Username
    And User enters a invalid Password
    And User click LogIn Button
    Then User validate "Login was unsuccessful. Please correct the errors and try again." error message on LogIn page
    And Close Browser

