Feature: As a user, I should be able to upload a file.

  Background: User is already in the log in page
    Given the user is on the login page

  Scenario Outline: verify users to upload a file from Files
    Given the user enters correct username "<username>"
    Then the user enters correct password "<password>"
    And the user clicks on Log in button
    Given user on the dashboard page
    When the user clicks the "Files" module
    When the user clicks the add icon on the top
    And users uploads file with the “upload file” option
    Then verify the file is displayed on the page

    Examples:
      | username   | password    |
      | User45     | Userpass123 |
      | Employee45 | Employee123 |