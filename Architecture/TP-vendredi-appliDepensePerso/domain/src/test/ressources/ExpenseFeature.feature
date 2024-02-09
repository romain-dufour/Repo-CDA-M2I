Feature: Create a Spend
  Scenario: Post a Spend
    Given there no spend in the list of spend
    When I create a spend
    Then List with 1 spend should be returned
