Feature: Find All Books
  Scenario: getAll Books
    Given there are some books in the library
    When I ask for all books
    Then all books should be returned