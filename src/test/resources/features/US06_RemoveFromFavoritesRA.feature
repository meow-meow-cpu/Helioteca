Feature: Feature: As a user, I should be able to remove files from favorites.


  Background: User is already in the log in page
    Given the user is on the login page

  @wip
  Scenario Outline: verify users to remove files or folders from Favorites
    Given the user enters correct username "<username>"
    Then the user enters correct password "<password>"
    And the user clicks on Log in button
    Given user on the dashboard page
    When the user clicks the "Files" module
    When the user clicks the add icon on the top
    And user creates new folder with "Helioteca" name by clicking "New folder" option
    When the users clicks action icon from any file or folder on the page to remove
    And user choose the "Remove from favorites" option
    And user click the "Favorites" sub module on the left side
    Then Verify that the file is not listed in the Favorites table

    Examples:
      | username   | password    |
      | User45     | Userpass123 |
      | Employee45 | Employee123 |