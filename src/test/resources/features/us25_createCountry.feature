@US_25
Feature: US_25 System should allow to create new countries using api end point

  @US_25_TC_01
  Scenario: US_25_TC_01 User can just create each country 1 by 1
    Given User send a POST request to REST API endpoint "https://www.bank.com/api/tp-countries/" and create "USA" country
    And After creation HTTP Status Code should be "201"
    Then After creation user verifies the created country "USA"