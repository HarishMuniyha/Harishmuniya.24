$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("FaceBook.feature");
formatter.feature({
  "line": 2,
  "name": "Facebook Application smoke test automation scripts",
  "description": "",
  "id": "facebook-application-smoke-test-automation-scripts",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Facebook"
    }
  ]
});
formatter.before({
  "duration": 3812200,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Verify the login functionality of the application with invalid credentials",
  "description": "",
  "id": "facebook-application-smoke-test-automation-scripts;verify-the-login-functionality-of-the-application-with-invalid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@searchFunctionality"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User should be in Facebook Application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User should see the facebook logo displayed in the header",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User enter the Email address in the emailFeild in Login Page",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User enter the password in the passwordFeild in Login Page",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User click on the Login button in the Login Page",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User wait for 3 seconds for page load",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User should see the Login into Facebook title in the Forgot Password Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.user_should_be_in_Facebook_Application()"
});
formatter.result({
  "duration": 2651588900,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_should_see_the_facebook_logo_displayed_in_the_header()"
});
formatter.result({
  "duration": 14222207300,
  "error_message": "java.lang.Exception\r\n\tat com.cucumber.baseclass.BaseClass.elementIsDisplayed(BaseClass.java:70)\r\n\tat com.cucumber.stepdefinition.Stepdefinition.user_should_see_the_facebook_logo_displayed_in_the_header(Stepdefinition.java:26)\r\n\tat ✽.Then User should see the facebook logo displayed in the header(FaceBook.feature:7)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Stepdefinition.user_enter_the_Email_address_in_the_emailFeild_in_Login_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdefinition.user_enter_the_password_in_the_passwordFeild_in_Login_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdefinition.user_click_on_the_Login_button_in_the_Login_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 14
    }
  ],
  "location": "Stepdefinition.user_wait_for_seconds_for_page_load(int)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdefinition.user_should_see_the_Login_into_Facebook_title_in_the_Forgot_Password_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 131600,
  "status": "passed"
});
});