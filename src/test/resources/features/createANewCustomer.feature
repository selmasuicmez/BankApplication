@US09_createANewCustomer
  Feature: US09 Create A New Customer Feature

    Background:US09 access login page
      Given US09 user on the login page "http://gmibank.com/login"
      And US09 send username to "team2manager"
      And US09 send password to "managerteam2"
      And US09 click sign in
      And US09 click to my operations
      And US09 click to manage customers
      And US09 click to create a new customer

    @SSN_box_search
    Scenario: TC_01 valid SSN numbers and search a new applicant
      Given US09 TC01 type a valid SSN "876-13-9772"
      And US09 TC01 click search
      And US09 getText from firstname
      And US09 getText from lastname
      And US09 getText from email
      And US09 getText from mobile phone number
      And US09 getText from phone number
      And US09 getText from phone ssn



    @TC_03
      Scenario Outline: TC_03 "First Name" ,"Last Name" and "Middle Initial" must be writable
        Given US09 TC03 Send strings to firstname "<firstname>"
        And US09 TC03 Send strings to lastname "<lastname>"
        Then US09 TC03 Send strings to Middle Initial "<middleinitial>"

      Examples:

      |firstname|lastname|middleinitial|
      |Ayse     |Fatma   |Hayriye      |
      |Selim95  |Ali49   |//Serhat     |

    @TC_04
      Scenario Outline: Email box must accept valid email
        Given US09 Send emails to "<emailbox>"

      Examples:

      |emailbox|
      |aaa@gmail.com|
      |asdf.gmail.tr|

    @TC_05
      Scenario Outline:"Mobile" , "Phone"  and "Zip Code" number consist of numbers
        Given US09 Send numbers and string to mobile "<mobile>"
        And US09 Send numbers and string to phone "<phone>"
        And US09 Send numbers and string to zip code "<zipcode>"

      Examples:

      |mobile|phone |zipcode|
      |1547a |57841d|57846s |

    @TC_06
      Scenario: "Address" and "City" must be writable
        Given US09 Send adress to adress box "florida caminin yani"
        And Us09 Send city to city box "florida"

    @TC_07
       Scenario: Second SSN numbers  must be only numbers
         Given US09 TC07 send numbers to "147-98-3365"

    @TC_08
       Scenario: "Create Date " box must be selectable
         Given US09 TC08 select date "11/22/2020"

    @TC_09
       Scenario: "Country" box must be dropdown and selectable
         Given USO9 TC09 select country dropdown and select "GERMANY"

    @TC_10
       Scenario: "State" box must be writable
         Given US09 TC10 send some strings to state box "Arizona"

    @TC_11
       Scenario: "User" box be dropdown and selectable
         Given US09 TC11 select user dropdown and select "john John Doe"

    @TC_12
       Scenario: "Account" must be dropdown and selectable
         Given US09 TC12 select "ticari kredi talebi"

    @TC_13
       Scenario: "Zelle Enrolled" must be enabled
         Given US09 TC13 zelle enrolled enabled

    @TC_14
       Scenario: "Back" box must be clickalbe
         Given US09 TC14 back clickable

    @TC_15
        Scenario: "Save" box must be clickalbe
          Given US09 TC15 save clickable


