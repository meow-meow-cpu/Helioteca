Feature: As a user, I should be able to remove files from the favorites and upload a file directly

  Background: User is already in the log in page
    Given the user is on the login page

  @wip
  Scenario Outline: Verify users can add the folder
    Given the user enters correct username "<username>"
    Then the user enters correct password "<password>"
    Then the user clicks on Log in button
    Given user on the dashboard page
    When the user clicks the Files module
    And user clicks the add icon on the top
    And user click "new folder”
    And user write a folder "<name>"
    When the user click submit icon
    Then Verify the folder "<name>" is displayed on the page

    Examples:
      | username   | password    | name             |
      | User64     | Userpass123 | New Folder5 User |
      | Employee64 | Employee123 | New Folder5 Emp  |

  @wip
  Scenario Outline: Verify users can upload a file inside a folder
    Given the user enters correct username "<username>"
    Then the user enters correct password "<password>"
    Then the user clicks on Log in button
    Given user on the dashboard page
    When the user clicks the Files module
    And user choose a folder "<name>" from the page
    And user clicks the add icon on the top
    When the user uploads a file with the upload file option
    Then Verify the file is displayed on the page



    Examples:
      | username   | password    | name             |
      | User64     | Userpass123 | New Folder5 User |
      | Employee64 | Employee123 | New Folder5 Emp  |