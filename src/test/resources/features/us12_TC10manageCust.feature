@testcasethree
Feature: US_012_TC10 Edit Button

    @editbutton
    Scenario:  TC_0010 There should be an Edit button where all customer information can be populated
        Given Go to the GMIBank sign in page
        And Type username and password then click on sign in button
        And Click on My Operations dropdown menu
        And Click the Manage Customers button
        And Click the button to last page
        Then there should be an Edit button