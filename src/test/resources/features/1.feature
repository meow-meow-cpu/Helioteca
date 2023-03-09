@B28G45-96
Feature: Default

  @B28G45-95
  Scenario Outline: US3-AC1: Verify the users can access all main modules.
    Given the user enters correct username "<username>"
    Then the user enters correct password "<password>"
    And the user clicks on Log in button
    Then the user should be on the dashboard
    And the user should see the below modules
      | Files    |
      | Photos   |
      | Activity |
      | Mail     |
      | Contacts |
      | Calendar |
      | Notes    |
      | Deck     |
      | Tasks    |
    Then the user should be able to click on each module and see each module page

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