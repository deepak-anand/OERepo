package com.cardinalhealth.bpm.automation.order.view;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.bcel.generic.Select;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.PageFactory;

import com.cardinalhealth.bpm.automation.browser.BrowserDriver;
import com.cardinalhealth.bpm.automation.order.container.OrderPlacementContainer;
import com.cardinalhealth.bpm.automation.util.ConfigurationManager;
import com.cardinalhealth.bpm.automation.util.LogManager;
import com.cardinalhealth.bpm.automation.view.TimeLogger;

public class OrderPlacementView extends TimeLogger{
	public static final String TO_NAME = "TO_NAME";
	public static final String TO_NUMBER = "TO_NUMBER";
	public static final String COMPANY = "COMPANY";
	public static final String FROM_NAME = "TO_NUMBER";
	public static final String FROM_NUMBER = "FROM_NUMBER";
	public static final String COVER_SHEET_NOTES = "COVER_SHEET_NOTES";
	public static final String FAX_IN_NUMBER_DTL = "FAX_IN_NUMBER_DTL";

	private static final Logger LOGGER = LogManager.getInstance()
			.getAppLogger();
	private static final OrderPlacementContainer orderPlacementContainer = PageFactory
			.initElements(BrowserDriver.getCurrentDriver(),
					OrderPlacementContainer.class);

	public static void isDisplayedCheck() {
		System.out.println(BrowserDriver.waitForElement(
				orderPlacementContainer.orderPlacementHeaderText).getText());
		BrowserDriver.getCurrentDriver().switchTo().frame("iframeid");
	}

	public static void clickYesContinueButton(String write) {
		BrowserDriver
				.waitForElementToBeClickable(orderPlacementContainer.yesContinueButton);
		WriteLog("18_Order_Placement",write);
		orderPlacementContainer.yesContinueButton.click();
		resetTimer();
		BrowserDriver.waitForAMoment();
		}
	public static void clickFinishProcessOrder() {
		
		BrowserDriver.waitForElementToBeClickable(
		orderPlacementContainer.finishProcessOrderButton).click();
		resetTimer();
	}

	public static void selectPaymentMethod(String write) {
		//BrowserDriver.waitForAMoment();
		//BrowserDriver.waitForAMoment();
		WriteLog("28_Proceed_to_Payment",write);
		orderPlacementContainer.paymentMethod.click();
		//BrowserDriver.waitForAMoment();
		BrowserDriver.pressTab();
		//BrowserDriver.waitForAMoment();
	
	}

	public static void clickOKButton() {
		BrowserDriver.waitForElementToBeClickable(orderPlacementContainer.OKButton).click();
	}
	
	public static void clickNewOrderLink() {
	//	driver.findElement(By.linkText(linkName)).click();
		//BrowserDriver.waitForAMoment();
		//BrowserDriver.waitForAMoment();
		BrowserDriver.getCurrentDriver().switchTo().defaultContent();
		BrowserDriver.getCurrentDriver().findElement(By.linkText("New Order")).click();
		BrowserDriver.waitForAMoment();
	//orderPlacementContainer.newOrderLink.click();
		
	}
	
	
}
