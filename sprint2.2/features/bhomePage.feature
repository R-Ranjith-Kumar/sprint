Feature: Homepage


Scenario: User clicks fish link
Given the user in homepage
When user clicks the fish link
Then user is redirected to fish page


Scenario: User clicks dog link
Given the user is in homepage
When user clicks the dog link
Then user is redirected to dog page

