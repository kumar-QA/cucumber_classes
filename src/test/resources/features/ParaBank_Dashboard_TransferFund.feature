Feature: verify transferfund functionality in dashBoard

Scenario: verify with giving valid data in Trasferfund link

Given use should landed on Dashboard page
Then User enter account no "sbi2123456789" and username "prasanna"
Then user should enter amount 50000
And user should branch name "Madhapur" and ifsce code "Sbi123456"
