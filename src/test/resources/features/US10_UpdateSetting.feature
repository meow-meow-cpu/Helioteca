Feature: As a user, I should be able to update settings.


  Background: User is already in the log in page
    Given the user is on the login page

  Scenario Outline: Verify users update settings
    Given the user enters correct username "<username>"
    Then the user enters correct password "<password>"
    And the user clicks on Log in button
    Given user on the dashboard page
    When the user clicks the "Files" module
    And user clicks Settings on the left bottom corner
    Then the user should be able to click any buttons


    Examples:
      | username  | password    |
      | User1     | Userpass123 |
      | Employee1 | Employee123 |




