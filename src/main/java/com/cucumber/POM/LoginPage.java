package com.cucumber.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver driver;
	
	public LoginPage(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//i[contains(@class, 'fb_logo')]")
	private WebElement fbLogo;

	@FindBy(id = "email")
	private WebElement emailFeild;

	@FindBy(id = "pass") 
	private WebElement passWordFeild;

	@FindBy(xpath="//input[@type='submit']")
	private WebElement loginButton;

	public WebElement getFbLogo() {
		return fbLogo;
	}

	public WebElement getEmailFeild() {
		return emailFeild;
	}

	public WebElement getPassWordFeild() {
		return passWordFeild;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	
}
