@testcasetwo
  Feature: US_012_TC09 View Button


    @viewbutton
    Scenario:  TC_0009 There should be a View option where customer can be navigated to all customer info and see edit button there
      Given Go to the GMIBank sign in page
      And Type username and password then click on sign in button
      And Click on My Operations dropdown menu
      And Click the Manage Customers button
      And Click the button to last page
      Then Then there should be a View option
