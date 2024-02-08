Feature: Search all Available Meeting Room
  Scenario: Find all available Meeting Room
    Given there are two available Meeting Rooms between startDate 2024-02-08 11:00:00 and endDate 2024-02-08 12:00:00, one with id 1
      And second with id 2
    When I search for all available Meeting Room
    Then list with 2 available meeting Rooms should be returned