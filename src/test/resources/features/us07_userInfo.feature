@UserInfo07

Feature:System should not allow to make updates with invalid credentials

  Background: Go to the User Info

    Given user go to the login page
    And Provide the username
    And Provide the password
    And Enter the Signin button
    And Enter User drop down menu
    And Enter the User info
    And Enter First Name
    And Enter Last Name




  @US07_TC001

  Scenario: negative test update email
    Given Without at sign
    And You should see This field is invalid

  @US07_002
  Scenario: negative test update email2
    Given Without dots com
    And You should see message This field is invalid




  @US07_TC003

  Scenario: There should not be an option of any other language other than English or Turkish
    Given Language dropdown is not have other languages
    And You should see two languages
