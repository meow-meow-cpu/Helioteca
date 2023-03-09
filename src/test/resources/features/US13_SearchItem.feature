Feature:  As a user, I should be able to search any item/ users from the homepage.

 Background: User is already in the log in page
    Given the user is on the login page
  @wip
  Scenario Outline: Verify login
    Given the user enters correct username "<username>"
    Then the user enters correct password "<password>"
    And the user clicks on Log in button