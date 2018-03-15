Feature: User Accounts

  Scenario: Login
    Given that I am a librarian
    And I want to know who has checked out a book
    Then I can hold them accountable for returning it.

  Scenario: Library numbers
    Then Users must now login using their library number (which is in the format xxx-xxxx)
    And a password in order to check-out and return books.
    But User credentials are predefined, so registering new users is not part of this story.

  Scenario: User information
    Given that I am a customer
    Then I want to be able to see my user information (name, email address and phone number)
    And so that I know that the library can contact me.
    But This option should only be available when the customer is logged in and should only display that customer’s information.
