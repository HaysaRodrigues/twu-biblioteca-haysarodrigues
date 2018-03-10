Feature: Main menu

  #OK
  Scenario: As a customer, instead of automatically seeing the book list, I would like to see a list of options and be able to choose one.
    Given that the only option should be 'List Books'
    And All future options should be added to this menu also

  #O
  Scenario: Invalid Menu Option
    Given That I'm a customer,
    When I choose invalid option
    Then I would like to be notified with the message “Select a valid option!”
    And so that I can know when I need to re-enter my choice.






