@US008
Feature:Update Password
  Background: Sign in
    Given Go to URL "https://bank.com/"
    And Click on dropdown menu
    And Choose Sign-in
    And Type username of customer "team2customer"
    And Type password "customerteam2"
    And Click on Sign-in button
    And Click on User dropdown menu
    And Choose password from dropdown menu
    And Click on Current Password box


  @US0008-TC001
  Scenario: TC-001

    And Type Current Password as the "customerteam2"
    And Click on New Password box
    And Type New Password as the "customerteam2"
    And Click on New Password confirmation box
    And Type New Password confirmation box as the "customerteam2"
    And Click-on Save button
    Then Confirm the warning message

  @US0008-TC002
  Scenario: TC-002

    And Type Current Password as the "Rt7&oac"
    And Click on New Password box
    And Type New Password as the "LLLLLLLLr"
    And Confirm the the level chart change after typing last lowercase letter accorgingly


  @US0008-TC003
  Scenario: TC-003

    And Type Current Password as the "Rt7&oac"
    And Click on New Password box
    And Type New Password as the "kkkkkkkkK"
    And Confirm the the level chart change after typing last uppercase letter accorgingly


  @US0008-TC004
  Scenario: TC-004

    And Type Current Password as the "Rt7&oac"
    And Click on New Password box
    And Type New Password as the "mmmmmmmm=2"
    And Confirm the the level chart change after typing last digit accorgingly


  @US0008-TC005
  Scenario: TC-005

    And Type Current Password as the "Rt7&oac"
    And Click on New Password box
    And Type New Password as the "rrrrrrrrR2["
    Then Confirm the the level chart change after typing the last character accorgingly


  @US0008-TC006
  Scenario: TC-006

    And Type Current Password as the "Rt7&oac"
    And Click on New Password box
    And Type New Password as the "rrrghjFg#1"
    Then Confirm the the level chart change after typing 7th char accorgingly


  @US0008-TC007
  Scenario: TC-007

    And Type Current Password as the "customerteam2"
    And Click on New Password box
    And Type New Password as the "customerteam2"
    And Click on New Password confirmation box
    And Type New Password confirmation box as the "customerteam2"
    And Click-on Save button
    Then Confirm the warning message