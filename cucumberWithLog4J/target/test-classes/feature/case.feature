Feature: Capturing Console Logs

Background:
Given Create an empty file.

Scenario: Reading the console file for valid credentials
Given Share URL
When Loggin to Application
Then User is logged into Application

Scenario: Reading the console file for valid credentials
Given Share URL
When Loggin to Application
Then Validation Failed 


