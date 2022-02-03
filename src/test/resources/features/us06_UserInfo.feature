@US06_UserInfo
Feature:User info segment (User Settings) should be editable on Homepage
  Background: User Info

    Given Click to the login page
    And Enter the username
    And Enter the password
    And Click to Sign in button
    And Click to User drop down menu
    And Click to User info

  @US06_TC001
  Scenario: There should be user info being populated when navigating to user info
  "firstname, lastname email and language"
    Given First Name
    And Last Name
    And Email
    And Save button
    Then You should see save settings

  @US06_TC002

  Scenario: There should be an option to update firstname
    Given Update to First Name
    And Save button
    Then see save settings

  @US06_TC003
  Scenario: There should be an option to update lastname
    Given Update to Last Name
    And Save button
    Then You should see save settings

  @US06_TC004
  Scenario: There should be an option to update email id adding "@" sign and ".com" extension
    Given Update to Email
    And Save button
    Then You should see save settings

