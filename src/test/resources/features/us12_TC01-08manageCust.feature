@testcaseone
Feature: US_012_Manage Customers Page

  @customeralldate
  Scenario: TC_0001_TC_0008 All customers should show up on manage customers module populating the account
  information of the customer First Name Last Name Middle Initial Email
  Mobile Phone Number Phone Number Address Create Date
    Given Go to the GMIBank sign in page
    And Type username and password then click on sign in button
    And Click on My Operations dropdown menu
    And Click the Manage Customers button
    And Click the button to last page
    And On the customer page, the user should see the customer's First Name
    And On the customer page, the user should see the customer's Last Name
    And On the customer page, the user should see the customer's Middle Initial
    And on the customer page, the user should see the customer's Email
    And On the customer page, the user should see the customer's Mobile Phone Number
    And On the customer page, the user should see the customer's Phone Number
    And on the customer page, the user should see the customer's Address
    Then On the customer page, the user should see the customer's Create Date



