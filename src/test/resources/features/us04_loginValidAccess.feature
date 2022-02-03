@US_04LoginValid
Feature: US_04 Login page feature

  Background: access login page
    Given user on the login page
    And   mouse go to dropDown
    And   mouse click on the signInText

  @LoginValid
  Scenario:TC_01 users enters valid credentials positive
    And   user enters username and password
    When  click on the signIn button
    Then  user sees the success message

  @LoginCancel
  Scenario:TC_02 Login users for GMI Bank
  Then      user verifies that the option the cancel

