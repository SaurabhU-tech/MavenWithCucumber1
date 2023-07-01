#https://www.guru99.com/using-cucumber-selenium.html#
Feature: Login page Functionality feature

Scenario: Test Login with credentials
Given user is on login page
When user enter valid credentials
Then user should be able to login
And close the browser