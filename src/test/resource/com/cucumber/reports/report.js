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
  "duration": 399300,
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
  "duration": 19362221800,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_should_see_the_facebook_logo_displayed_in_the_header()"
});
formatter.result({
  "duration": 260206700,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_enter_the_Email_address_in_the_emailFeild_in_Login_Page()"
});
formatter.result({
  "duration": 749035100,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_enter_the_password_in_the_passwordFeild_in_Login_Page()"
});
formatter.result({
  "duration": 438242900,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_click_on_the_Login_button_in_the_Login_Page()"
});
formatter.result({
  "duration": 3943982900,
  "error_message": "java.lang.Exception\r\n\tat com.cucumber.baseclass.BaseClass.clickOnWebelement(BaseClass.java:132)\r\n\tat com.cucumber.stepdefinition.Stepdefinition.user_click_on_the_Login_button_in_the_Login_Page(Stepdefinition.java:54)\r\n\tat ✽.And User click on the Login button in the Login Page(FaceBook.feature:10)\r\n",
  "status": "failed"
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
  "duration": 9590800,
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d79.0.3945.130)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LAPTOP-5SPAEEQS\u0027, ip: \u0027192.168.1.100\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_241\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 79.0.3945.130, chrome: {chromedriverVersion: 79.0.3945.36 (3582db32b3389..., userDataDir: C:\\Users\\Harish\\AppData\\Loc...}, goog:chromeOptions: {debuggerAddress: localhost:57586}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: acbe4569915dc26dc4c97df53ec20fbe\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:609)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.getScreenshotAs(RemoteWebDriver.java:295)\r\n\tat com.cucumber.baseclass.BaseClass.takescreenShot(BaseClass.java:144)\r\n\tat com.cucumber.stepdefinition.Hooks.afterHook(Hooks.java:23)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\r\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\r\n\tat cucumber.runtime.Runtime.runHookIfTagsMatch(Runtime.java:224)\r\n\tat cucumber.runtime.Runtime.runHooks(Runtime.java:212)\r\n\tat cucumber.runtime.Runtime.runAfterHooks(Runtime.java:206)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:46)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.internal.runners.statements.RunBefores.evaluate(RunBefores.java:26)\r\n\tat org.junit.internal.runners.statements.RunAfters.evaluate(RunAfters.java:27)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:100)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:89)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:41)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:542)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:770)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:464)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:210)\r\n",
  "status": "failed"
});
});