Feature: Search for an Item

Scenario: User need to search a valid item
Given the user is in search bar
When he enters the item name
Then user should be able to see the details of the item entered

Scenario: User need to search a invalid item
Given the user is accessing the search bar
When he enters the invalid item name
Then user should get error message
