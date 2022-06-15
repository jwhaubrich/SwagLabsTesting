Feature: User logs in and completes successful purchase order

  Scenario: I log into the application, add items to my cart, and checkout
    Given I login to SwagLabs successfully
    When I add items to my cart
    And I navigate to the webpage with checkout
    Then when I click checkout I see confirmation