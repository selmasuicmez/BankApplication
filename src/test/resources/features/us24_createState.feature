@US_24
Feature: US_24_TC_01 System should allow creating new countries using the API endpoint

  @US_24_TC_01
  Scenario: US_24_TC_01 User can Just create each state 1 by 1
    Given Given The user sends a POST request to REST API endpoint "https://www.bank.com/api/tp-states" and create "TEXAS1" state
    And After creation, the HTTP Status Code should be "201"
    Then After creation user verifies the created state "TEXAS1"