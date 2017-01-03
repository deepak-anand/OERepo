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
import com.cardinalhealth.bpm.automation.order.container.PreOrderQuestionsContainer;
import com.cardinalhealth.bpm.automation.util.ConfigurationManager;
import com.cardinalhealth.bpm.automation.util.LogManager;
import com.cardinalhealth.bpm.automation.view.TimeLogger;

public class PreOrderQuestionsView extends TimeLogger{
	public static final String TO_NAME="TO_NAME";
	public static final String TO_NUMBER="TO_NUMBER";
	public static final String COMPANY="COMPANY";
	public static final String FROM_NAME="TO_NUMBER";
	public static final String FROM_NUMBER="FROM_NUMBER";
	public static final String COVER_SHEET_NOTES="COVER_SHEET_NOTES";
	public static final String FAX_IN_NUMBER_DTL="FAX_IN_NUMBER_DTL";

	private static final Logger LOGGER = LogManager.getInstance().getAppLogger();
	private static final PreOrderQuestionsContainer preOrderQuestionsContainer = PageFactory.initElements(BrowserDriver.getCurrentDriver(), PreOrderQuestionsContainer.class);

	public static void isDisplayedCheck() {
		System.out.println(BrowserDriver.waitForElement(preOrderQuestionsContainer.preOrderQuestionsHeaderText).getText());
		}
	public static void clickContinueButton(String write) {
		WriteLog("19_VerifyShippingAddress",write);
		BrowserDriver.waitForElementToBeClickable(preOrderQuestionsContainer.continueButton).click();
		resetTimer();
		}
	public static void selectPreOrderQuestions(String write) {
		BrowserDriver.waitForAMoment();
		BrowserDriver.getCurrentDriver().switchTo().frame("mFrame");
		BrowserDriver.waitForElementToBeClickable(preOrderQuestionsContainer.preOrderQuestionsRadio.get(2));
		WriteLog("20_OrderOrigination",write);
		preOrderQuestionsContainer.preOrderQuestionsRadio.get(1).click();
		preOrderQuestionsContainer.preOrderQuestionsRadio.get(3).click();
		BrowserDriver.waitForAMoment();
		preOrderQuestionsContainer.preOrderQuestionsRadio.get(5).click();
		BrowserDriver.waitForAMoment();
		BrowserDriver.getCurrentDriver().switchTo().defaultContent();
		}

	
	public static void clickPPSContinueButton() {
		resetTimer();
		BrowserDriver.waitForElementToBeClickable(preOrderQuestionsContainer.continueButton).click();
		
		}
}
