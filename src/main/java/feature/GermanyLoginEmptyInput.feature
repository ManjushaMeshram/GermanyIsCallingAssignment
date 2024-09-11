Feature: Verify Login Failure with empty input
	Verify the login functionality for Germany Is Calling Application
	
	Background: user is on login page
	

  @GermanyLoginTest
  Scenario: Verify that the user will not be able to login the Germany Is Calling Application
  Given user should be on Germany Is Calling login page
  When user enters username and keep password will be empty
  When user will be click on login button
  Then user should display the error message as Password: This field is required.