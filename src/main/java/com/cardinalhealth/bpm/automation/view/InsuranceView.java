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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cardinalhealth.bpm.automation.browser.BrowserDriver;
import com.cardinalhealth.bpm.automation.constants.InvalidDataException;
import com.cardinalhealth.bpm.automation.containers.InsuranceContainer;

//import com.cardinalhealth.vitalpath.automation.containers.OrderSheetContainer;
//import com.cardinalhealth.vitalpath.automation.containers.SelectCabinetContainer;
import com.cardinalhealth.bpm.automation.util.CommonUtils;
import com.cardinalhealth.bpm.automation.util.LogManager;

public class InsuranceView extends TimeLogger{
	private static final Logger LOGGER = LogManager.getInstance()
			.getAppLogger();
	private static final InsuranceContainer insuranceContainer = PageFactory
			.initElements(BrowserDriver.getCurrentDriver(),
					InsuranceContainer.class);
	public static String accountInfo;

	public static void isDisplayedCheck() {
		System.out.println(BrowserDriver.waitForElement(insuranceContainer.insuranceHeaderText).getText());
		getAccountNumber();
	}
	
	public static String getAccountNumber() {
		String customerHeader =insuranceContainer.accountNumberText.getText();
		System.out.println("customerHeader:-" +customerHeader);
		System.out.println("spaceindex:-" +customerHeader.indexOf(" "));
		accountInfo=customerHeader.substring(0,10);
		System.out.println("accountInfo:-"+accountInfo);
		return accountInfo;
	}
	
	public static void selectMedicareInsurance() {
		
		BrowserDriver.getCurrentDriver().switchTo().frame("iframeid");
		BrowserDriver.waitForAMoment(); 
		WriteLog("07_Create_New_Customer_Next");
		insuranceContainer.medicareInsuranceRadio.get(2).click();
	}
	
	public static void enterPolicyNumber() {
		insuranceContainer.policyNumberInput.sendKeys("912023456j");
		
	}
	
	public static void clickSearch() {
		insuranceContainer.searchButton.click();
		resetTimer();
	}
	
	public static void isInsuranceResultsPopupDisplayed() {
		BrowserDriver.waitForAMoment();
		BrowserDriver.getCurrentDriver().switchTo().frame(1);
		
		//BrowserDriver.waitForAMoment();
		}
	
	public static void selectResults() {
		WriteLog("09_Load_Insurance_Search_Page");
		BrowserDriver.doubleClick(insuranceContainer.resultsText.get(2));
		resetTimer();
		BrowserDriver.waitForAMoment();
		BrowserDriver.waitForAMoment();
		}
	public static void clickSaveAndNextButton() {
		BrowserDriver.getCurrentDriver().switchTo().frame(0);
		//BrowserDriver.getCurrentDriver().switchTo().defaultContent();
		BrowserDriver.waitForElement(insuranceContainer.saveAndNextButton);
		BrowserDriver.waitForElementToBeClickable(insuranceContainer.saveAndNextButton);
		WriteLog("10_Select_Insurance");
		insuranceContainer.saveAndNextButton.click();
		resetTimer();
		BrowserDriver.waitForAMoment();
		//BrowserDriver.waitForAMoment();
		//BrowserDriver.waitForAMoment();
		
		
		
	}
	public static void clickGoToButton() {
		BrowserDriver.waitForElement(insuranceContainer.goToDiagnosisButton);
		BrowserDriver.waitForElementToBeClickable(insuranceContainer.goToDiagnosisButton);
		WriteLog("11_Save&Next_Insurance");
		insuranceContainer.goToDiagnosisButton.click();
		resetTimer();
		
		
	}

	
	
}
