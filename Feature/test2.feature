#https://www.guru99.com/using-cucumber-selenium.html#
Feature: Login page Functionality feature2

Scenario: Test Login with 2
Given user is on login page2
When user enter valid username "Saurabh123"
And user enter valid password "India@123"
Then user should be able to login2
And close the browser2

Scenario: Test Login with 3
Given user is on login page2
When user enter valid username1 "Saurabh1234567"
And user enter valid password "India@123"
Then user should be able to login2
And close the browser2