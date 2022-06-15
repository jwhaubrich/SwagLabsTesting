Feature: Logging into the Swag Labs website
  Background: I navigated to the Swag Labs website
    Given I navigated to the SwagLabs website

  Scenario: Login to the website successfully
    When Correct username and password combination are entered
    Then I am logged into the website

  Scenario: User is locked out of their account
    When User entered correct username and password but is locked out
    Then Error was displayed