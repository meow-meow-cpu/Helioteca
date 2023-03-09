@B28G45-116
Feature: Default

  @B28G45-115
  Scenario Outline: US14-AC1: Verify the users can access the Photos module.
    Given the user enters correct username "<username>"
    Then the user enters correct password "<password>"
    And the user clicks on Log in button
    Then the user should be on the dashboard
    And the user should be able to click on the Photos module
    Then the user should be able to see the following submodules
      | Your photos   |
      | Favorites     |
      | Your albums   |
      | Shared albums |
      | Tagged photos |


    Examples:
      | username  | password    |
      | User1     | Userpass123 |
      | User2     | Userpass123 |
      | User3     | Userpass123 |
		     # | User4     | Userpass123 |
		     # | User5     | Userpass123 |
      | Employee1 | Employee123 |
      | Employee2 | Employee123 |
      | Employee3 | Employee123 |
		     # | Employee4 | Employee123 |
		     # | Employee5 | Employee123 |
		      #add more username and password if needed