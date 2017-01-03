package com.cardinalhealth.bpm.automation.order.view;
import java.util.ArrayList;
import java.util.HashMap;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.cardinalhealth.bpm.automation.browser.BrowserDriver;
import com.cardinalhealth.bpm.automation.order.container.OrderCartContainer;
import com.cardinalhealth.bpm.automation.util.ConfigurationManager;
import com.cardinalhealth.bpm.automation.util.LogManager;
import com.cardinalhealth.bpm.automation.view.TimeLogger;

public class OrderCartView extends TimeLogger{
	public static final String TO_NAME="TO_NAME";
	public static final String TO_NUMBER="TO_NUMBER";
	public static final String COMPANY="COMPANY";
	public static final String FROM_NAME="TO_NUMBER";
	public static final String FROM_NUMBER="FROM_NUMBER";
	public static final String COVER_SHEET_NOTES="COVER_SHEET_NOTES";
	public static final String FAX_IN_NUMBER_DTL="FAX_IN_NUMBER_DTL";

	private static final Logger LOGGER = LogManager.getInstance().getAppLogger();
	private static final OrderCartContainer orderCartContainer = PageFactory.initElements(BrowserDriver.getCurrentDriver(), OrderCartContainer.class);

	public static void isDisplayedCheck() {
		System.out.println(BrowserDriver.waitForElement(orderCartContainer.orderCartHeaderText).getText());
	}
	public static void isDialogBoxDisplayed() {
		BrowserDriver.waitForAMoment();
		BrowserDriver.waitForElement(orderCartContainer.dialogBox);
		BrowserDriver.getCurrentDriver().switchTo().frame(0);
	}
	public static void enterProductCode() {
		WriteLog("21_Order_PPS");
		orderCartContainer.productCodeInput.sendKeys("509345");
	}
	public static void clickSearchButton() {
		orderCartContainer.searchDialogBoxButton.click();
		resetTimer();
		//BrowserDriver.waitForAMoment();
	}
	public static void isResolveValidationDialogBoxDisplayed() {
		//BrowserDriver.waitForAMoment();
		BrowserDriver.getCurrentDriver().switchTo().defaultContent();
		BrowserDriver.waitForElementToBeClickable(orderCartContainer.substituteProductButton);
	}
	public static void clickSubstituteProductButton() {
		WriteLog("22_Product_Search");
		orderCartContainer.substituteProductButton.click();
		resetTimer();
		BrowserDriver.waitForAMoment();
	}
	public static void enterSupply(String write) {
		BrowserDriver.waitForElement((orderCartContainer.supplyInput));
		WriteLog("24_Substitute_Product",write);
		

		orderCartContainer.supplyInput.sendKeys("3");
		BrowserDriver.pressTab();
	}
	
	public static void isAddAnotherItemButtonEnabled() {
		BrowserDriver.waitForElement((orderCartContainer.supplyInput));
		
		WriteLog("23_Select_AddToOrder");
		//orderCartContainer.supplyInput.sendKeys("3");
		//BrowserDriver.pressTab();
	}
	
	
	public static void enterPeriod() {
		orderCartContainer.periodInput.sendKeys("m");
		BrowserDriver.pressTab();
	}
	public static void enterDrugsRemaining() {
		//BrowserDriver.waitForAMoment();
		BrowserDriver.waitForElement(orderCartContainer.drugsRemainingInput);
		WriteLog("25_Click_Continue");
		orderCartContainer.drugsRemainingInput.sendKeys("0");
	}
	public static void enterDaysSupply() {
		orderCartContainer.drugsSupplyInput.sendKeys("21");
	}
	public static void clickContinueButton() {
		BrowserDriver.waitForAMoment();
		BrowserDriver.waitForElementToBeClickable(orderCartContainer.continueButton);
		orderCartContainer.continueButton.click();
		resetTimer();
	}
	public static void clickCalculateShipDateButton() {
		orderCartContainer.calculateShipDateButton.click();
		//BrowserDriver.waitForAMoment();
	
	}
	public static void clickApplyButton() {
		BrowserDriver.waitForElement(orderCartContainer.applyButton);
		orderCartContainer.applyButton.click();
	}
	
	
	public static void clickUseLastOrderButton() {
		BrowserDriver.waitForElement(orderCartContainer.useLastOrderButton);
		orderCartContainer.useLastOrderButton.click();
		resetTimer();
	}
	
	public static void selectProduct() {
		BrowserDriver.waitForElementToBeClickable(orderCartContainer.selectProductCheckBox);
		WriteLog("22_UseLastOrder");
		orderCartContainer.selectProductCheckBox.click();
		
	}
	
	
	public static void clickAddToOrderButton() {
		orderCartContainer.addToOrderButton.click();
		resetTimer();
	}
}
