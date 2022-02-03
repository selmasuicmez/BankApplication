@testcasefour
Feature: US_012_TC011 Edit Button and Save date

  Scenario: TC_00011 The Edit portal can allow the user to create or update the user info
    Given Go to the Bank sign in page
    And Type username and password then click on sign in button
    And Click on My Operations dropdown menu
    And Click the Manage Customers button
    And Click on Edit button
    And Clear on the customer Email textbox
    And Click on the customer Email textbox and type a new Email
    And Clear on the customer Mobile Phone Number textbox
    And Click on the customer Mobile Phone Number textbox and type a new Mobile Phone Number
    And Clear on the customer Phone Number textbox
    And Click on the customer Phone Number textbox and type a new Phone Number
    And Clear on the customer Zip Code textbox
    And Click on the customer Zip Code textbox and type a new Zip Code
    And Clear on the customer Address textbox
    And Click on the customer Address textbox and type a new Address
    And Clear on the customer City textbox
    And Click on the customer City textbox and type a new City
    And Clear on the customer Create Date textbox
    And Click on the customer Create Date textbox and type a new Create Date
    And Clear on the customer State textbox
    And Click on the customer State textbox and type a new State
    And Click on Zelle Enrolled
    And Click on Save button
    Then The user should see a message confirming that they have saved the edited information.