Feature: Users should be able to access Photos module of the app

  Background: User is already in the log in page
    Given the user is on the login page

  Scenario Outline: Verify Photos module and the sub-modules are accessible
    Given the user enters correct username "<username>"
    Then the user enters correct password "<password>"
    And the user clicks on Log in button
    Then the user should be on the dashboard
    And the user clicks the "Photos" module
    Then the user should be able to see the following submodules
      | Your photos   |
      | Favorites     |
      | Your albums   |
      | Shared albums |
      | Tagged photos |


    Examples:
      | username  | password    |
      | User1     | Userpass123 |
      # bug found for User1
      | Employee1 | Employee123 |
