@US015
Feature:
  Background:
    Given Go to URL "https://bank.com/"
    And Click on dropdown menu
    And Choose Sign-in
    And Type username of customer "AhmetVeli"
    And Type password "AhmetVeli"
    And Click on Sign-in button
    And Click on My Operations dropdown
    And Choose My Account from dropdown menu

  @US015-TC001
  Scenario:TC-001

    And Confirm the seeing of acount types and balance populated

  @US015-TC002
  Scenario:TC-002

    And Click on Transaction button
    And Confirm the seeing of transaction