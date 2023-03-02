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
    And user write a folder "name"
    When the user click submit icon
    Then Verify the folder is displayed on the page




    Examples:
      | username  | password    |
      | User1     | Userpass123 |
     # | User2     | Userpass123 |
     # | User3     | Userpass123 |
     # | User4     | Userpass123 |
     # | User5     | Userpass123 |
      | Employee1 | Employee123 |
     # | Employee2 | Employee123 |
     # | Employee3 | Employee123 |
     # | Employee4 | Employee123 |
     # | Employee5 | Employee123 |
      #add more username and password if needed