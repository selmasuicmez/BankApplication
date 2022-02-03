@US_16
Feature: US_16 tests

  Background: user enters gmibank homepage then sign in as a customer
    Given user enters bank homepage
    And user clicks userEntry icon
    And user clicks signIn link
    And user enters customer username "aaabbb"
    And user enters customer password "AaaBbb-21"
    And user clicks signIn button
    Then user clicks customer myOperations link

  @TC1601
  Scenario: TC1601 User should have at least 2 accounts
    Given user clicks My Accounts link
    And user verify Account Type1 "19669" can be seen
    And user verify Account Type2 "19670" can be seen
    Then user signOut from customer Website

  @TC1602
  Scenario: TC1602 User can select the first account as From dropdown where they receive their money from
    Given user clicks Transfer Money link
    And user select first account from From dropdown menu and click
    And user verify the selected account can be seen
    Then user signOut from customer Website

  @TC1603
  Scenario: TC1603 User can select a balance that they want to proceed with
    Given user clicks Transfer Money link
    And user select first account from From dropdown menu and click
    And user select other account from To dropdown menu and click
    And user send "100" to Balance and click tab
    And user click tab and verify the amount can be seen in Balance
    Then user signOut from customer Website

  @TC1604
  Scenario: TC1604 User should provide a description for that transfer
    Given user clicks Transfer Money link
    And user select first account from From dropdown menu and click
    And user select other account from To dropdown menu and click
    And user send "100" to Balance and click tab
    And user send "transfer between accounts" to Description and click tab
    Then user signOut from customer Website

  @TC1605
  Scenario: TC1605 User can make sure transfer is done successfully validating the message an amount of the transaction"
    Given user clicks Transfer Money link
    And user select first account from From dropdown menu and click
    And user select other account from To dropdown menu and click
    And user send "100" to Balance and click tab
    And user send "transfer between accounts" to Description and click tab
    And user click Make Transfer link
    And user clicks customer myOperations link
    And user clicks My Accounts link
    And user click View Transaction link
    And verify the transaction is accomplished
    Then user signOut from customer Website