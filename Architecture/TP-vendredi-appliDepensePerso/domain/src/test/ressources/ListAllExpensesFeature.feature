Feature: List all Spends
  Scenario: Get all Spends
    Given there two spends in the list of spends, one with id 1
      And second with id 2
    When I get the list of spends
    Then List with 2 spends should be returned
