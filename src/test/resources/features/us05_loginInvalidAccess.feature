@US_05LoginInvalid

Feature:US_05 Login page feature

  Background:US_05 access login page
    Given user on the login page
    And   mouse go to dropDown
    And   mouse click on the signInText

  @AccessInvalid
  Scenario Outline:TC_1_2_3_ users enters invalid credentials negative
  And   users enter username and password as "<username>" and "<password>"
  When  users click on the signIn button
  Then  user sees the success message"Failed to sign in!"

  Examples:
  | username          | password        |
  | teamadmin         | adminteam2      |
  | team2admin        | adminteam       |
  | adminteam         | adminteam       |
  |                   |                 |

  @ResetYourPassword
  Scenario:TC_04 users click option to password
    And   users enter username and invalidPassword
    And   users click on the signIn button
    And   users see the text:"Did you forget your password?"
    And   users click the text
    Then  users see new the text:"Reset your password"

  @AgainRegister
  Scenario: TC_05 users click option to navigate to the register
    And    users see the text:"You don't have an account yet?
    When   users click on the text
    Then   users see the register title:"Registration"

