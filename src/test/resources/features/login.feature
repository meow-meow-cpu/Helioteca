@login
Feature: Users should be able to login

  Background: User is already in the log in page
    Given the user is on the login page



    #Emily, make it a scenario outline
  @wip
  Scenario: Verify login with different user types
    Given the user logged in as "<userType>"
    Given the user logged in with username as "User1" and password as "UserUser123"


  Scenario Outline: Verify login as User
    Given the User enters correct username "<username>"
    Then the User enters correct password "<password>"
    And the User clicks on Log in button
    Examples:
      | username | password    |
      | User1    | Userpass123 |
      | User2    | Userpass123 |
      | User3    | Userpass123 |
      | User4    | Userpass123 |
      | User5    | Userpass123 |


  Scenario Outline: Verify login as Employee
    Given the Employee enters correct username "<username>"
    Then the Employee enters correct password "<password>"
    And the User clicks on Log in button
    Examples:
      | username  | password    |
      | Employee1 | Employee123 |
      | Employee2 | Employee123 |
      | Employee3 | Employee123 |
      | Employee4 | Employee123 |
      | Employee5 | Employee123 |

