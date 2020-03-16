package com.cucumber.runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.cucumber.baseclass.BaseClass;
import com.cucumber.listener.Reporter;
import com.cucumber.utilities.ConfigReader;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin={"com.cucumber.listener.ExtentCucumberFormatter:C:\\Users\\Harish\\eclipse-workspace\\CucumberDay1\\src\\test\\resources\\com\\cucumber\\reports_extent\\report.html",
				"pretty",
				"html:src\\test\\resource\\com\\cucumber\\reports\\",
				"json:src\\test\\resource\\com\\cucumber\\reports\\cucumber.json",
				"junit:src\\test\\resource\\com\\cucumber\\reports\\cucumber.xml"},
		features="src\\test\\java\\com\\cucumber\\feature",
		glue="com.cucumber.stepdefinition",
		tags={"@Facebook","~@Ignore"},
		dryRun=false,strict=true,monochrome=true
		)

public class TestRunner {
	
	public static WebDriver driver;
	@BeforeClass
	public static void driverInitilization() throws Exception {
		
		ConfigReader cr=new ConfigReader();
		 driver = BaseClass.getBrowser(cr.getBrowsername());
	}

	@AfterClass
	public static void driverQuit() {
		Reporter.loadXMLConfig(new File ("C:\\Users\\Harish\\eclipse-workspace\\CucumberDay1\\extent-config\\extent-config.xml"));
	
		driver.quit();
	}
}
