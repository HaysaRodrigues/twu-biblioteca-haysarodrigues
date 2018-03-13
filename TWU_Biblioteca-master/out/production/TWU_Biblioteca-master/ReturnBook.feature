Feature: Return Book

  #OK
  Scenario: Return Book
    Given I am a librarian
    When customers want to return a book so that others customers can check that book out
    Then returned books should appear in the list of library books.

  #OK
  Scenario: Successful Return
    Given I am a customer
    And I would like to be notified if the book I am returning belongs to this library by seeing the message:
    Then “Thank you for returning the book.”, so that I know I returned the book to the right library.


  Scenario: Unsuccessful Return
    Given I am a customer
    And I would like to be notified if the book I am returning has not been added to this library by seeing the message:
    Then “That is not a valid book to return.”, so that I can return it to the correct library or fix my spelling error.
