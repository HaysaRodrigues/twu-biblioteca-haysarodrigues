Feature: Welcome Message

  #OK
  Scenario: As a customer, I would like to see a welcome message when I start the application
  so that I feel welcome and know that Biblioteca is available.
    Given I have a welcome message
    When I start the application
    Then I feel welcome
    And know that Biblioteca is available


