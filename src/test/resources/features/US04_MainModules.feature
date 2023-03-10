@wip
Feature: Users should be able to login with user and employee credentials


  Background: User is already in the log in page
    Given the user is on the login page


  Scenario Outline: verify users can access to Files module
    Given the user enters correct username "<username>"
    Then the user enters correct password "<password>"
    And the user clicks on Log in button
    Given user on the dashboard page
    When the user clicks the "Files" module
    Then verify the page title is "Files - Helioteca"

    Examples:
      | username    | password    |
      | User129     | Userpass123 |
      | Employee129 | Employee123 |

  @wip
  Scenario Outline: verify users can select all the uploaded files from the page
    Given the user enters correct username "<username>"
    Then the user enters correct password "<password>"
    And the user clicks on Log in button
    Given user on the dashboard page
    When the user clicks the "Files" module
    And user click the top-left checkbox of the table
    Then verify all the files are selected

    Examples:
      | username    | password    |
      | User129     | Userpass123 |
      | Employee129 | Employee123 |


