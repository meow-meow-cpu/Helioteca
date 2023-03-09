@B28G45-106
Feature: Default

	@B28G45-105
	Scenario Outline: verify user can access to the contacts module
		Given the user enters correct username "<username>"
		    Then the user enters correct password "<password>"
		    And the user clicks on Log in button
		    When the user clicks the Contacts module
		    Then verify the page title is "Contacts - Helioteca”
		
		    Examples:
		      | username  | password    |
		      | User1     | Userpass123 |
		      | Employee1 | Employee123 |