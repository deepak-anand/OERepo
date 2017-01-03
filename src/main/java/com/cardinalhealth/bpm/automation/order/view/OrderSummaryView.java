package com.cardinalhealth.bpm.automation.order.view;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.PageFactory;

import com.cardinalhealth.bpm.automation.browser.BrowserDriver;
import com.cardinalhealth.bpm.automation.order.container.OrderSummaryContainer;
import com.cardinalhealth.bpm.automation.util.ConfigurationManager;
import com.cardinalhealth.bpm.automation.util.LogManager;
import com.cardinalhealth.bpm.automation.view.TimeLogger;

public class OrderSummaryView extends TimeLogger{
	public static final String TO_NAME = "TO_NAME";
	public static final String TO_NUMBER = "TO_NUMBER";
	public static final String COMPANY = "COMPANY";
	public static final String FROM_NAME = "TO_NUMBER";
	public static final String FROM_NUMBER = "FROM_NUMBER";
	public static final String COVER_SHEET_NOTES = "COVER_SHEET_NOTES";
	public static final String FAX_IN_NUMBER_DTL = "FAX_IN_NUMBER_DTL";

	private static final Logger LOGGER = LogManager.getInstance()
			.getAppLogger();
	private static final OrderSummaryContainer orderSummaryContainer = PageFactory
			.initElements(BrowserDriver.getCurrentDriver(),
					OrderSummaryContainer.class);

	public static void isDisplayedCheck() {
		System.out.println(BrowserDriver
				.waitForElement(orderSummaryContainer.orderSummaryHeaderText));
		// BrowserDriver.getCurrentDriver().switchTo().frame("iframeid");
	}

	public static void enterInitials() {
		BrowserDriver.waitForElement(orderSummaryContainer.initialsInput);
		orderSummaryContainer.initialsInput.sendKeys("dk");
	}

	public static void clickOkButton() {
		
		BrowserDriver.waitForElementToBeClickable(orderSummaryContainer.okButton);
		//WriteLog("31_Finish_Process_Order",write);
		orderSummaryContainer.okButton.click();
		//resetTimer();
	}

	public static void clickOkButtonAgain(String write) {
		
		BrowserDriver.waitForElementToBeClickable(orderSummaryContainer.okButton);
		WriteLog("31_Finish_Process_Order",write);
		orderSummaryContainer.okButton.click();
		resetTimer();
	}
	
	public static void clickProceedToPaymentButton() {
		//BrowserDriver.waitForElementToBeClickable(orderSummaryContainer.proceedToPaymentButton);
		BrowserDriver.waitForAMoment();
		orderSummaryContainer.proceedToPaymentButton.get(2).click();
		resetTimer();
		
		
	}

	public static void clickApplyButton() {
		BrowserDriver.waitForElement(orderSummaryContainer.applyButton);
		//WriteLog("28_Proceed_to_Payment");
		//BrowserDriver.waitForElementToBeClickable(orderSummaryContainer.applyButton);
		orderSummaryContainer.applyButton.click();
		BrowserDriver.waitForAMoment();
		BrowserDriver.waitForAMoment();
	}
	
	
public static void clickLocationNotChangedButton() {
	/*	try {
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO: handle exception
		}*/
		
		System.out.println("cool"+orderSummaryContainer.locationNotChangedButton.size());
		BrowserDriver.waitForElement(orderSummaryContainer.locationNotChangedButton.get(0));
		orderSummaryContainer.locationNotChangedButton.get(0).click();
	}
	
}
