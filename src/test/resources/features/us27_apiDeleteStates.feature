@US_27
  Feature: US_27 System should allow to delete states using api end point
  Background:delete all states
    Given I send a GET request to REST API end point  "https://www.bank.com/api/tp-states"

  @deleteStates
  Scenario Outline: TC_02 delete second and last states 1 by 1
    And   user deletes a state using api end point  "<endPoint>" and its extension "<id>"
    And user data verifies that it has been deleted with status code 204
    Examples:
      |endPoint|id|
      |https://www.bank.com/api/tp-states/|21559|