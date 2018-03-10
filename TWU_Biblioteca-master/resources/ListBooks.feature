Feature: List Books

  #OK
  Scenario: As a customer, after the welcome message appears I would like to see a list of all library books, so that I can browse for books I might want to check-out.
  Assume that there is a pre-existing list of books. You don't need to support adding or removing books from the library.

    Given that the welcome message appears
    And I would like to see a list of all books
    Then I can browse for books I might want to check-out
    But Assume that there is a pre-existing list of books. You don't need to support adding or removing books from the library.