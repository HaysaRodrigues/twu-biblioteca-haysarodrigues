Feature: Checkout Book

  #OK
  Scenario: Customers check-out a book
    Given that I'm a librarian I would like customers to be able to check-out a book.
    Then Checked out books should not appear in the list of all library books.

  #OK
  Scenario: Successful Checkout
    Given That I am a customer
    Then I would like to know that a book has been checked out by seeing the message “Thank you! Enjoy the book”.

  Scenario: Unsuccessful Checkout
    Given I'm a customer
    When I tried to check-out a book that is not available
    Then I will see the message “That book is not available.”, so that I know that I need to select a different book or fix my spelling error.

