@testcasefive
Feature: US_012_TC012 Delete Button

  @deletbutton
  Scenario: TC_0012 User can delete a customer, but seeing a message if the user is sure about the deletion
    Given Go to the GMIBank sign in page
    And Type username and password then click on sign in button
    And Click on My Operations dropdown menu
    And Click the Manage Customers button
    And Click on Delete button
    And The user should see the Alert message: -Are you sure you want to delete Customer ....?-
    And Click on Delete button in Alert window
    Then The user should not see error message