Feature: As a customer, I'd like the list of all books to include each books Author and Year Published, so that I can be confident that I have found the book I am looking for.

  #OK
  Scenario: As a customer, I'd like to see a list of all books with details
    Given That I'd like to see the list of all books
    And each book must have Author and Year Published
    Then I will be confident that I found the correct book.

  #OK
  Scenario:  The book listing should have columns for this information