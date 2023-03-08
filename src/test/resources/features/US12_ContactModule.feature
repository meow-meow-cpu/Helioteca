Feature: As a user, I should be able to access to Contacts module.

  Background: User is already in the log in page
    Given the user is on the login page

  @wip
  Scenario Outline: verify user access to the contacts module
    Given the user enters correct username "<username>"
    Then the user enters correct password "<password>"
    And the user clicks on Log in button
    When the user clicks the Contacts module
    Then verify the page title is "Contacts - Helioteca”

    Examples:
      | username  | password    |
      | User1     | Userpass123 |
      | Employee1 | Employee123 |