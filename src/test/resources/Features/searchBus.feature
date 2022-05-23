Feature: To check bus availability with source destination and date filter
  Scenario: To check view Seats function
    Given User launch the browser and enter red bus url
    When User enter from and to station
    And User enter date
    And User click on search buses button
    Then User verify bus availability
