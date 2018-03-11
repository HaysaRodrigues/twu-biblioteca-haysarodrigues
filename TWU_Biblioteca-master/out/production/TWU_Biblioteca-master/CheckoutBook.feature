Feature: Checkout Book

  Scenario: Customers check-out a book
    Given that I'm a librarian I would like customers to be able to check-out a book.
    Then Checked out books should not appear in the list of all library books.
