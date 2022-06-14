Feature: Logging into the Swag Labs website
  Background: I navigated to the Swag Labs website
    Given I navigated to the Swag Labs website

  Scenario: Login to the website successfully
    When Correct username and password combination are entered
    Then I am logged into the website