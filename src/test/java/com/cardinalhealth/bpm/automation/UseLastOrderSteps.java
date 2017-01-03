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
import com.cardinalhealth.bpm.automation.order.view.OrderPlacementView;
import com.cardinalhealth.bpm.automation.order.view.OrderCartView;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;

public class UseLastOrderSteps {
	private static final Logger LOGGER = LogManager.getInstance()
			.getAppLogger();

	@When("^I click on New Order link$")
	public void I_click_on_New_Order_link() {
		OrderPlacementView.clickNewOrderLink();

	}
	

	@Then("^I see order number generated as '(.+)'$")
	public void I_see_order_number_generated(String write) {
		DashboardView.isDisplayedCheck();
		DashboardView.isOrderResultsDisplayed(write);
	
	}

	@When("^I click on Use last order button$")
	public void I_click_on_Use_last_order_button() {
		OrderCartView.clickUseLastOrderButton();
	}

	@Then("^I select the product$")
	public void I_select_the_product() {
		OrderCartView.selectProduct();

	}

	@Then("^I click on add to order button$")
	public void I_click_on_add_to_order_button() {

		OrderCartView.clickAddToOrderButton();
	}

}
