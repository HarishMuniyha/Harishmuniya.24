package com.cucumber.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.cucumber.POM.ForgetPassWordPage;
import com.cucumber.POM.LoginPage;
import com.cucumber.baseclass.BaseClass;
import com.cucumber.runner.TestRunner;
import com.cucumber.utilities.ConfigReader;
import com.cucumber.utilities.PageObjectManager;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class Stepdefinition extends BaseClass {

	public static WebDriver driver = TestRunner.driver;

	public static PageObjectManager pg = new PageObjectManager(driver);
		
	@And("^User should see the facebook logo displayed in the header$")
	public void user_should_see_the_facebook_logo_displayed_in_the_header() throws Throwable {
		elementIsDisplayed(pg.getlp().getFbLogo());
	}

	@Given("^User should be in Facebook Application$")
	public void user_should_be_in_Facebook_Application() throws Throwable {
		System.out.println("Background");
		ConfigReader cr=new ConfigReader();
		getUrl(cr.getUrl());
	}

	@When("^User enter the Email address in the emailFeild in Login Page$")
	public void user_enter_the_Email_address_in_the_emailFeild_in_Login_Page() throws Throwable {
		sendKeys(pg.getlp().getEmailFeild(), "sharax001@gmail.com");
	}

	@When("^User enter the '(.*)' in the email Id field$")
	public void user_enter_the_testuser_gmail_com_in_the_email_Id_field(String username) throws Throwable {
		sendKeys(pg.getlp().getEmailFeild(), username);
	}

	@When("^User enter the '(.*)' in the password field$")
	public void user_enter_the_xyz_in_the_password_field(String pwd) throws Throwable {
		sendKeys(pg.getlp().getPassWordFeild(), pwd);

	}

	@When("^User click on the Login button in the Login Page$")
	public void user_click_on_the_Login_button_in_the_Login_Page() throws Throwable {
		clickOnWebelement(pg.getlp().getLoginButton());
	}

	@When("^User wait for (\\d+) seconds for page load$")
	public void user_wait_for_seconds_for_page_load(int sec) throws Throwable {
		Thread.sleep(sec * 1000);
	}

	@Then("^User should see the Login into Facebook title in the Forgot Password Page$")
	public void user_should_see_the_Login_into_Facebook_title_in_the_Forgot_Password_Page() throws Throwable {
		String Actualtext = getTextFromWebElement(pg.getfb().getForgotPassWordTitle());
		Assert.assertEquals("Log in to Facebook", Actualtext);
	}

	@When("^User enter the password in the passwordFeild in Login Page$")
	public void user_enter_the_password_in_the_passwordFeild_in_Login_Page() throws Throwable {
	
		sendKeys(pg.getlp().getPassWordFeild(), "123345");
	}

	
	@When("^User should verify the '(.*)' in the header$")
	public void user_shoulde_verify(String username) {
			
	}
	
}
