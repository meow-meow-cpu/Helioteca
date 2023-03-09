
Feature: Users should be able to login with user and employee credentials


 Background: User is already in the log in page
    Given the user is on the login page
    
  Scenario Outline: Verify login
    Given the user enters correct username "<username>"
    Then the user enters correct password "<password>"
    And the user clicks on Log in button

    Examples:
      | username  | password    |
      | User1     | Userpass123 |
      | User2     | Userpass123 |
      | User3     | Userpass123 |
      | Employee1 | Employee123 |
      | Employee2 | Employee123 |
      | Employee3 | Employee123 |



  #Scenario: Verify login with different user types
  #  Given the user logged in as "<userType>"
  #  Given the user logged in with username as "User1" and password as "UserUser123"
