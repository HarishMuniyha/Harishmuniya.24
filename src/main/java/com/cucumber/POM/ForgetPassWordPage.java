package com.cucumber.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgetPassWordPage {

	public WebDriver driver;

	public ForgetPassWordPage(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()='Log in to Facebook']")
	private WebElement forgotPassWordTitle;

	public WebElement getForgotPassWordTitle() {
		return forgotPassWordTitle;
	}

}
