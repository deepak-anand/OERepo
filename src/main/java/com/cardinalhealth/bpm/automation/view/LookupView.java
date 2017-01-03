package com.cardinalhealth.bpm.automation.view;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

import junit.framework.Assert;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.cardinalhealth.bpm.automation.browser.BrowserDriver;
import com.cardinalhealth.bpm.automation.constants.InvalidDataException;
import com.cardinalhealth.bpm.automation.containers.LookupContainer;

//import com.cardinalhealth.vitalpath.automation.containers.OrderSheetContainer;
//import com.cardinalhealth.vitalpath.automation.containers.SelectCabinetContainer;
import com.cardinalhealth.bpm.automation.util.CommonUtils;
import com.cardinalhealth.bpm.automation.util.LogManager;

public class LookupView extends TimeLogger {
	private static final Logger LOGGER = LogManager.getInstance()
			.getAppLogger();
	private static final LookupContainer lookupContainer = PageFactory
			.initElements(BrowserDriver.getCurrentDriver(),
					LookupContainer.class);
	
	public static void isDisplayedCheck(String write) {
		System.out.println(BrowserDriver.waitForElement(lookupContainer.lookupHeaderText).getText());
		WriteLog("32_Click_Ok",write);
		//BrowserDriver.waitForElementToBeClickable(demographicsContainer.firstNameInput);
	}

	public static void enterPhoneNumber() {
		//BrowserDriver.getCurrentDriver().switchTo().frame("iframeid");
		//BrowserDriver.getCurrentDriver().switchTo().frame("iframeid");
		BrowserDriver.waitForElementToBeClickable(lookupContainer.phoneNumberInput);
		lookupContainer.phoneNumberInput.sendKeys("4345674567");

	}

	public static void clickSearchButton() {
		lookupContainer.searchButton.click();
		resetTimer();
		//WriteLog("search button clicked");
		
		//BrowserDriver.waitForAMoment();
		
		//BrowserDriver.waitForAMoment();

	}

	public static void clickCreateNewCustomerButton() {
		BrowserDriver.waitForElementToBeClickable(lookupContainer.closeButton);
		//BrowserDriver.waitForAMoment();
		BrowserDriver.getCurrentDriver().switchTo().frame(1);
		BrowserDriver.waitForElementToBeClickable(lookupContainer.createNewCustomerButton);
		WriteLog("03_CustomerLookup");
        lookupContainer.createNewCustomerButton.click();
        resetTimer();

	}

	public static void enterAccountNumber() {
	
		//System.out.println("Rock"+InsuranceView.accountInfo);
		//lookupContainer.accountNumberInput.sendKeys(InsuranceView.accountInfo);
		lookupContainer.accountNumberInput.sendKeys("0909643730");
	}

	public static void selectResults() {
		BrowserDriver.waitForElementToBeClickable(lookupContainer.closeButton);
		BrowserDriver.getCurrentDriver().switchTo().frame(1);
		BrowserDriver.waitForElementToBeClickable(lookupContainer.createNewCustomerButton);
		BrowserDriver.doubleClick(lookupContainer.resultsText.get(2)); 
		resetTimer();
		
		
		
		
	}

}
