Scenario: User need to open the browser and Login with Valid Credentials

Given User Launch Browser "Chrome"
Given User Navigate to SIB Url "http://172.16.10.48:8080/SIB/#/login"
Then User enter a Username as "maker" and Password as "Test@123"
And User log out the application