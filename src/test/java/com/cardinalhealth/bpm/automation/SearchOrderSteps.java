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
import com.cardinalhealth.bpm.automation.view.DashboardView;
import com.cardinalhealth.bpm.automation.view.LookupView;
import com.cardinalhealth.bpm.automation.view.InsuranceView;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;

public class SearchOrderSteps {
	private static final Logger LOGGER = LogManager.getInstance()
			.getAppLogger();

	
	

	@Then("^I double click on results$")
	public void I_double_click_results_from_the_list() {
		
		LookupView.selectResults();
	   
	}

	
	@Then("^And I click on order number$")
	public void I_click_on_order_number() {
		
	
	}
	
	@Then("^I should see order status generated$")
	public void I_should_see_order_status_generated() {
		
	}
	
	
	}

	

