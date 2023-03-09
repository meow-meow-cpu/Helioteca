Feature: As a user, I should be able to update settings.


  Background: User is already in the log in page
    Given the user is on the login page

  @wip
  Scenario Outline: Verify login
    Given the user enters correct username "<username>"
    Then the user enters correct password "<password>"
    And the user clicks on Log in button



    Examples:
      | username  | password    |
      | User1     | Userpass123 |
     # | User2     | Userpass123 |
     # | User3     | Userpass123 |
     # | User4     | Userpass123 |
     # | User5     | Userpass123 |
      | Employee1 | Employee123 |
     # | Employee2 | Employee123 |
     # | Employee3 | Employee123 |
     # | Employee4 | Employee123 |
     # | Employee5 | Employee123 |


  Scenario: Verify users update settings
    Given user on the dashboard page
    When the user clicks the "Files" module
    And user clicks Settings on the left bottom corner
    Then the user should be able to click any buttons


