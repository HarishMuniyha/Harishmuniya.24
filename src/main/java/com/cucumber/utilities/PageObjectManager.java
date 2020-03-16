package com.cucumber.utilities;

import org.openqa.selenium.WebDriver;

import com.cucumber.POM.ForgetPassWordPage;
import com.cucumber.POM.LoginPage;

public class PageObjectManager {
	public WebDriver driver;
	private ForgetPassWordPage fb;
	private LoginPage lp;

	public ForgetPassWordPage getfb() {
		if (fb == null) {
			fb = new ForgetPassWordPage(driver);
		}
		return fb;
	}

	public LoginPage getlp() {
		if (lp == null) {
			lp = new LoginPage(driver);
		}
		return lp;
	}

	public PageObjectManager(WebDriver ldriver) {
		this.driver = ldriver;

	}

}
