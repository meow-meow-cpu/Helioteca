Feature: As a user, I should be able to access to Files module - Favorites button


  Background: User is already in the log in page
    Given the user is on the login page
  @wip
  Scenario Outline: Verify users to add files to Favorites
    Given the user enters correct username "<username>"
    Then the user enters correct password "<password>"
    And the user clicks on Log in button
    Given user on the dashboard page
    When the user clicks the Files module
    When the user clicks action-icon from any file on the page
    And user choose the Add to favorites option
    And user click the Favorites sub-module on the left side
    Then Verify the chosen file is listed on the table



    Examples:
      | username  | password    |
      | User1     | Userpass123 |


  #Scenario: Verify login with different user types
  #  Given the user logged in as "<userType>"
  #  Given the user logged in with username as "User1" and password as "UserUser123"


