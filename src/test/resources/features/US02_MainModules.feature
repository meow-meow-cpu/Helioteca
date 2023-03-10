Feature: Users should be able to login with user and employee credentials


  #Background: User is already in the log in page

  @WIP
  Scenario Outline:Verify login with valid credentials
    Given the user is on the login page
    When user enter invalid "<username>" and "<password>"
    And user click the login button
    Then verify Wrong username or password. message should be displayed

    Examples:
      | username | password    |
      | User9    | Wrong       |
      | abc   | Userpass123 |
      | bbn   | Userpass555     |