Feature: Find All Books
  Scenario: getAll Books
    Given there are some books in the library
    When I search for books with title started with "toto"
    Then all books should be returned