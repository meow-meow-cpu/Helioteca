Feature:  As a user, I should be able to search any item/ users from the homepage.

  Background: User is already in the log in page
    Given the user is on the login page

  Scenario Outline: Verify users can search any files/folder/users from the search box.
    Given the user enters correct username "<username>"
    Then the user enters correct password "<password>"
    And the user clicks on Log in button
    When the user clicks the magnifier icon on the right top
    And users search any existing file, folder, contact("Bob")
    Then verify the app displays the expected result "Bob" option

    Examples:
      | username    | password    |
      | User64      | Userpass123 |
      | Employee172 | Employee123 |