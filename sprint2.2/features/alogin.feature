Feature: Login 

Scenario: User wants to valid login
Given the user in log in page
When he enters a username and password
Then user redirected to home page

Scenario: User wants to login with invalid credentials
Given The user is in the login page
When He enters the invalid username and password
Then User gets a error message