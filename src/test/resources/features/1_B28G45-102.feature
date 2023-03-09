@B28G45-109
Feature: Default

	Background:
		#@B28G45-102
		    Given the user is on the login page
		
		

	#{*}Story{*}: As a user, I should be able to add/create folders.           
	#
	#Feature: As a user, I should be able to add/create folders.  
	#
	#  *Scenario:* Verify users can *add* the folder
	#
	#Given user on the dashboard page
	#
	#When the user clicks the "Files" module
	#
	#And user clicks the add icon on the top
	#
	#And user click "new folder”
	#
	#And user write a folder name
	#
	#When the user click submit icon
	#
	#Then Verify the folder is displayed on the page
	@B28G45-103
	Scenario Outline: US8-9AC1 Verify users can add the folder
		Given the user enters correct username "<username>"
		    Then the user enters correct password "<password>"
		    Then the user clicks on Log in button
		    Given user on the dashboard page
		    When the user clicks the "Files" module
		    And user clicks the add icon on the top
		    And user click "new folder”
		    And user write a folder "<name>"
		    When the user click submit icon
		    Then Verify the folder "<name>" is displayed on the page
		
		    Examples:
		      | username   | password    | name             |
		      | User90     | Userpass123 | New Folder1 User |
		      | Employee90 | Employee123 | New Folder1 Emp  |

	#{*}Story{*}: As a user, I should be able to upload files to existing folders on the Files page.           
	#
	#Feature:  As a user, I should be able to upload files to existing folders on the Files page.      
	#
	# 
	#
	#  *Scenario:*  Verify users can *upload* a *file* to an existing folder.
	#
	#Given user on the dashboard page
	#
	#When the user clicks the "Files" module
	#
	#And user choose a folder from the page
	#
	#And user clicks the add icon on the top
	#
	#When the user uploads a file with the upload file option
	#
	#Then Verify the file is displayed on the page
	#
	# 
	@B28G45-104
	Scenario Outline: US8-9AC2Verify users can upload files to existing folder on the Files page
		Given the user enters correct username "<username>"
		    Then the user enters correct password "<password>"
		    Then the user clicks on Log in button
		    Given user on the dashboard page
		    When the user clicks the "Files" module
		    And user choose a folder "<name>" from the page
		    And user clicks the add icon on the top
		    When user uploads file with the “upload file” option
		    Then Verify the file is displayed on the page
		
		    Examples:
		      | username   | password    | name             |
		      | User90    | Userpass123 | New Folder1 User |
		      | Employee90| Employee123 | New Folder1 Emp  |