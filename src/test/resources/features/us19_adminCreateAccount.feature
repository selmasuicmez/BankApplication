@US19
Feature: US_19 Admin Manage Account

  Background: Admin can creates a new account
    Given go to the sign in link
    And type username and password than click on sign in button
    And click on the  My Operations
    And click on the Manage Accounts


    @US19_TC01
    Scenario: TC_01 Description text box should not be blank
      And click on  the +Create a new Account
      Then  type some descriptions in the Descriptions text box

    @US19_TC02
    Scenario: TC_02 Provide a balance for the account creation
      And click on  the +Create a new Account
      Then type a balance in the Balance text box

    @US19_TC03
    Scenario: TC_03 User selects an account type
      And click on  the +Create a new Account
      Then select an account type as CHECKING, SAVING,CREDIT_CARD or INVESTING

    @US19_TC04
    Scenario: TC_04 User defines an account status
      And click on  the +Create a new Account
      Then select an account status type as ACTIVE, SUSPENDED or CLOSED

    @US19_TC05
    Scenario: TC_05 User selects an employee
      And click on  the +Create a new Account
      Then select an employee from the Employee dropdown

