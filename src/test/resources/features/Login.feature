@ALL
Feature: verifying login functionality

Background:


@SmokeTest
Scenario: Verify login function with valid credentials
Given customer landed on loginpage
When customer enter username and password
Then customer should land on homepage
And click on login button


@Regression
Scenario: Verify login function with valid username and invalid password
Given customer landed on loginpage
When customer enter username and password
Then it should throw some error
And click on login button

@Regression
Scenario: Verify login function with Invalid username and valid password
Given customer landed on loginpage
When customer enter username and password
Then it should throw some error invalid username
And click on login button



Scenario: statment
stament1
stament2
stament3
stament4


Scenario: statments
stament1
stament2
stament4
stament3
