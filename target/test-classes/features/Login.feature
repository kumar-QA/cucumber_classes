Feature: verifying login functionality

Scenario: Verify login function with valid credentials
Given customer landed on loginpage
When customer enter username and password
And click on login button
Then customer should land on homepage

