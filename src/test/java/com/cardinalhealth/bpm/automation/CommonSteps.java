package com.cardinalhealth.bpm.automation;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import com.cardinalhealth.bpm.automation.browser.BrowserDriver;
import com.cardinalhealth.bpm.automation.constants.InvalidDataException;
import com.cardinalhealth.bpm.automation.navigation.NaviagtorFactory;
import com.cardinalhealth.bpm.automation.util.LogManager;


import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;

public class CommonSteps {
	private static final Logger LOGGER = LogManager.getInstance()
			.getAppLogger();

	
	
	@Given("^I am at OE Login Page")
	public void given_I_Login_to_vitalpath_application()
			throws InvalidDataException {
		
		NaviagtorFactory.getNavigator()
				.given_I_navigate_to_the_vitalpath_application();
		
		
	}


	
	
	
	}

	

