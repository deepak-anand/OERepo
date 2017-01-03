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
import com.cardinalhealth.bpm.automation.view.LoginView;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;

public class LoginSteps {
	private static final Logger LOGGER = LogManager.getInstance()
			.getAppLogger();

	@When("^I enter OE username$")
	public void I_enter_username() {
		//OrderPlacementView.clickNewOrderLink();
		LoginView.enterUserName();

	}
	

	@When("^I enter OE password$")
	public void I_enter_password() {
		//DashboardView.isDisplayedCheck();
		LoginView.enterPassword();
		//DashboardView.isOrderResultsDisplayed(write);
	
	}

	@When("^I click on Sign in$")
	public void I_click_on_Login() {
		//OrderCartView.clickUseLastOrderButton();
		LoginView.clickLoginButton();
	}


}
