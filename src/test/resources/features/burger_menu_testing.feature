Feature: Top left-hand burger menu operates as intended
  Background: I am logged into the SwagLabs website
    Given I successfully logged into the SwagLabs website

    Scenario: Clicking the top left-hand burger button opens menu
      Then The burger menu was clicked and opens

    Scenario: Clicking on About button directs me to the page
      When The burger menu was clicked
      Then the about section was clicked and opens About webpage