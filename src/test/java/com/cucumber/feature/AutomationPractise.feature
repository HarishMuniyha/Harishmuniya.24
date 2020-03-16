@AutomationPractiseSmoke
Feature: Automation Practise smoke Test cases
This feature file includes Login, Search and Create Account scenarios

@CreateNewAccount 
Scenario: Verify the login functionlaity of the automation practise site
Given Launch the Automation practise web application
Then Verify logo of the page is displayed
And Verify the Page title in Home Page is displayed
When User click on Sign In button in the Home Page
Then Verify the Authentication page is displayed
When User should enter the Email Id  and Password in the EmailID field and Password field in Authentication Page
And User should click on the Sign In button in Create Account Page
Then Verify LogOut button is displayed
And Verify the logged In user name is displayed in HomePage

@Test
Scenario: Verify the search functionlity for registered user in My Account Page
Given Launch the Automation practise web application
Then Verify logo of the page is displayed
When User click on Sign In button in the Home Page
And User should enter the Email Id  and Password in the EmailID field and Password field in Authentication Page
When User enters dress in the search field in the My Account page
And User should click on Search button to display the result of dresses
Then Verify the search results are displayed with the searched text 

@CreateNewAccount @Test
Scenario: Verify the user is able to create new Account successfully in Automation practise application
Given Launch the Automation practise web application
Then Verify logo of the page is displayed
When User click on Sign In button in the Home Page
Then Verify the Authentication page is displayed
When User enters the Email address in the Create Account - Email Id field
When User should click on Create an Account button
When User should enter all the required fields
When User should click on Register button
Then Verify whether user is able create new account successfully



