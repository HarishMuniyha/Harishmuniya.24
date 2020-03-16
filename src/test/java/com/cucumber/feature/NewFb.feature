@NewFB
Feature: New Facebook scenario to validate valid login details

Background: Launch the Application 
Given User should be in Facebook Application

Scenario: Verify Login functionliaty
#Then User should see the facebook logo displayed in the header
When User enter the 'Hello' in the email Id field
And User enter the 'Test' in the password field
And User click on the Login button in the Login Page
And User should verify the 'Test' in the header


Scenario Outline: Verify Login functionliaty
#Then User should see the facebook logo displayed in the header
When User enter the '<UserName>' in the email Id field
And User enter the '<PassWord>' in the password field
And User click on the Login button in the Login Page
And User should verify the '<UserName>' in the header

Examples:
|UserName	|PassWord	|
|testUser	|Test123 	|
|testUser2	|Test345 	|
|testUser3	|Test567	|