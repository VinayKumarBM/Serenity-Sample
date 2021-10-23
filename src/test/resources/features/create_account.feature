@createAccount
Feature: Create Account

  @createNewAccount
  Scenario Outline: To create a new Account
    Given I am on the application
    When I navigate to Login Page by clicking on Sign In button
    And I enter valid email id and click on create account button
    And I enter valid <content_firstName> and register the user
    Then I should be navigated to My account screen
    Examples:
    |content_firstName	|
    |Jane				|
    |John				|