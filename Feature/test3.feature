Feature: Login functionality on login page of Application				

Scenario Outline: Login with numbers of credential

Given Open the Chrome and launch the application				
When Enter the "<username>" and "<password>"				
Then User should be able to login	
				
Examples:                      		

|username|password|		
|user1|password1|		
|user2|password2|		
|user3|password3|
