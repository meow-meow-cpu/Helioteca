Scenario: Verify users accessing all the main modules of the app.
Given user on the login page
When the users log in with valid credentials
Then Verify the user see the following <modules>
  Examples:
  |modules|
| Dashboard |
| Files |
| Photos |
| Activity |
| Talk. |
| Contacts |
| Circles |
| Calendar |
| Deck |