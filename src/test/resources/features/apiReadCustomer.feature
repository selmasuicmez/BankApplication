@ApiRead

Feature: System should allow to read all customers info using api end point
  Background: api end point is being set in response
    Given user provides the ap end point to set response using "https://www.gmibank.com/api/tp-customers"

  Scenario: validate all customers' data
    Given manipulate all customers' data
    And user set the data in correspondent files
    Then user validate all data