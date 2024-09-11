Feature: Verify Login Success Module
	Verify the login functionality for Germany Is Calling Application
	
	Background: user is on login page
	

  @GermanyLoginTest
  Scenario: Verify that the user is able to login the Germany Is Calling Application
  Given user is on Germany Is Calling login page
  When user enters username and password
  When user click on login button
  Then user should navigate to Germany Is Calling landing page