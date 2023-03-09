Feature: Users should be able to access Photos module of the app

  Background: User is already in the log in page
    Given the user is on the login page

  @emily
  Scenario Outline: Verify Photos module and the sub-modules are accessible
    Given the user enters correct username "<username>"
    Then the user enters correct password "<password>"
    And the user clicks on Log in button
    Then the user should be on the dashboard
    And the user should be able to click on the Photos module
    Then the user should be able to see the following sub-modules
      | Your photos   |
      | Favorites     |
      | Your albums   |
      | Shared albums |
      | Tagged photos |


    Examples:
      | username | password    |
      | User1    | Userpass123 |
     # | User2     | Userpass123 |
     # | User3     | Userpass123 |
     # | User4     | Userpass123 |
     # | User5     | Userpass123 |
     # | Employee1 | Employee123 |
     # | Employee2 | Employee123 |
     # | Employee3 | Employee123 |
     # | Employee4 | Employee123 |
     # | Employee5 | Employee123 |
      #add more username and password if needed