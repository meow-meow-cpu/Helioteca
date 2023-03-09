Feature: Users should be able to write comments to file/folder

  Background: User is already in the log in page
    Given the user is on the login page

  @emily
  Scenario Outline: Verify user can write comments to files/folder
    Given the user enters correct username "<username>"
    Then the user enters correct password "<password>"
    And the user clicks on Log in button
    Then the user should be on the dashboard
    When the user clicks on the Files module
    And the user clicks on action icon from any file on the page
    And the user chooses the Details option
    And the user writes a comment "good material, thank you for sharing!" inside the input box
    And the user clicks the submit button to post it
    Then verify the comment "good material, thank you for sharing!" is displayed in the comment section

    Examples:
      | username  | password    |
      | User1     | Userpass123 |
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