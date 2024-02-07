Feature: Delete Book
  Scenario: delete A Book
    Given there are a book in the library with id 1
    When i delete the book with id 1
    Then empty list books should be returned