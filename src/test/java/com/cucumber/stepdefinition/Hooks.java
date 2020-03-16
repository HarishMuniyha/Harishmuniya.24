package com.cucumber.stepdefinition;

import java.io.File;
import java.io.IOException;

import com.cucumber.baseclass.BaseClass;
import com.cucumber.listener.Reporter;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	@Before
	public void beforeHook() {
		System.out.println("Before Hook");
	}
	
	@After
	public void afterHook(Scenario variable) throws IOException {
		if (variable.isFailed()) {
			File des= BaseClass.takescreenShot(variable.getName());
			Reporter.addScreenCaptureFromPath(des.getAbsolutePath());
			
			
		}

	}

}