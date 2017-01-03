package com.cardinalhealth.bpm.automation.view;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.cardinalhealth.bpm.automation.browser.BrowserDriver;
import com.cardinalhealth.bpm.automation.containers.DemographicsContainer;
//import com.cardinalhealth.vitalpath.automation.containers.OrderSheetContainer;
//import com.cardinalhealth.vitalpath.automation.containers.SelectCabinetContainer;
import com.cardinalhealth.bpm.automation.util.CommonUtils;
import com.cardinalhealth.bpm.automation.util.LogManager;

public class DemographicsView extends TimeLogger {
	private static final Logger LOGGER = LogManager.getInstance()
			.getAppLogger();
	private static final DemographicsContainer demographicsContainer = PageFactory
			.initElements(BrowserDriver.getCurrentDriver(),
					DemographicsContainer.class);
	public static String uniqueLastName = null;
	
	
	public static void isDisplayedCheck() {
		System.out.println(BrowserDriver.waitForElement(demographicsContainer.demographicsheaderText).getText());
		BrowserDriver.getCurrentDriver().switchTo().frame("iframeid");
		BrowserDriver.waitForElementToBeClickable(demographicsContainer.firstNameInput);
		
	}
	
	public static void enterFirstName() {
		WriteLog("04_Create_New_customer");
		demographicsContainer.firstNameInput.sendKeys("deepak");

	}
	
	
	public static void enterLastName() {
		uniqueLastName = CommonUtils.getDateAndTimeString();
		demographicsContainer.lastNameInput.sendKeys(uniqueLastName);
	}
	
	public static void selectGender() {
		demographicsContainer.genderInput.sendKeys("Male");
		BrowserDriver.pressTab();
		
	}
	
public static void enterDOB() {
	demographicsContainer.DOBInput.sendKeys("10/11/1980");
		
	}
	
	public static void enterPhone() {
		
		demographicsContainer.homePhoneInput.sendKeys("6544578765");
	}

	public static void enterCaregiverName() {
		demographicsContainer.caregiverNameInput.sendKeys("John");
		BrowserDriver.pressTab();
	}
	public static void enterCaregiverRelationship() {
		WebElement relationship=demographicsContainer.caregiverRelationshipInput.get(2);
		relationship.sendKeys("w");
		BrowserDriver.pressTab();
	}
	public static void enterCaregiverPhone() {
		demographicsContainer.caregiverPhoneInput.sendKeys("6545678767");
	}
	
	public static void enterStreet() {
		demographicsContainer.streetInput.sendKeys("6000 parkwood pl");
	}
	
	public static void enterZip() {
		demographicsContainer.zipInput.sendKeys("43016");
		BrowserDriver.pressTab();
		resetTimer();
	}
	
	public static void clickAddReferralCodeButton() {

		demographicsContainer.addReferralCodeButton.click();
		resetTimer();
		//BrowserDriver.waitForElementToBeClickable(lookupContainer.closeButton);
		//BrowserDriver.waitForAMoment();
	}
	
	public static void isReferralSearchPopupDisplayed() {
		//BrowserDriver.waitForAMoment();
		BrowserDriver.getCurrentDriver().switchTo().frame(1);
		//BrowserDriver.waitForAMoment();
		
		
	}
	
	public static void enterReferralType() {
		BrowserDriver.waitForElementToBeClickable(demographicsContainer.facilityNameInput);
		WriteLog("06_Add_ReferralCode");
		demographicsContainer.referralTypeInput.get(1).sendKeys("d");
		BrowserDriver.pressTab();
	}
	
	public static void enterReferralName() {
		demographicsContainer.referralNameInput.sendKeys("Dr. Smith");
	}
	
	public static void clickSaveButton() {
		demographicsContainer.saveButton.click();
		BrowserDriver.waitForAMoment();
	}
	
	public static void clickNextButton() {
		BrowserDriver.getCurrentDriver().switchTo().frame(0);
		demographicsContainer.nextButton.click();
		resetTimer();
		//BrowserDriver.waitForAMoment();
		//BrowserDriver.waitForAMoment();
		//BrowserDriver.waitForAMoment();
		
		}
	
	public static void getCityName() {
		System.out.println(BrowserDriver.waitForElement(demographicsContainer.cityInput).getText());
		WriteLog("05_Enter_Primary_Address");
		
	}
	
	
	}
	

