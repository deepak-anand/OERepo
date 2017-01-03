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
import com.cardinalhealth.bpm.automation.containers.DoctorsContainer;

//import com.cardinalhealth.vitalpath.automation.containers.OrderSheetContainer;
//import com.cardinalhealth.vitalpath.automation.containers.SelectCabinetContainer;
import com.cardinalhealth.bpm.automation.util.CommonUtils;
import com.cardinalhealth.bpm.automation.util.LogManager;

public class DoctorsView extends TimeLogger{
	private static final Logger LOGGER = LogManager.getInstance()
			.getAppLogger();
	private static final DoctorsContainer doctorsContainer = PageFactory
			.initElements(BrowserDriver.getCurrentDriver(),
					DoctorsContainer.class);

	
	public static void isDisplayedCheck() {
		System.out.println(BrowserDriver.waitForElement(doctorsContainer.doctorHeaderText).getText());
		BrowserDriver.getCurrentDriver().switchTo().frame("iframeid");
		}
	
	public static void enterDoctorLastName() {
		WriteLog("14_Next_ToDoctor");
		doctorsContainer.doctorLastnameInput.sendKeys("smith");
	
	}
	
	public static void enterDoctorFirstName() {
		doctorsContainer.doctorFirstnameInput.sendKeys("amber");
		
	}
	
	public static void clickSearchButton() {
		doctorsContainer.searchButton.click();
		resetTimer();
		BrowserDriver.waitForAMoment();
		
	}
	
	public static void selectDoctorsResults() {
		WriteLog("15_Doctor_Search");
		BrowserDriver.doubleClick(doctorsContainer.resultsDoctorText.get(2));
		resetTimer();
		BrowserDriver.waitForAMoment();
		//BrowserDriver.waitForAMoment();
		}
	
	public static void clickPopupOkButton() {
		BrowserDriver.waitForElementToBeClickable(doctorsContainer.popupOkButton);
		doctorsContainer.popupOkButton.click();
		BrowserDriver.waitForAMoment();
		}
	
	public static void clickSaveButton() {
		WriteLog("16_Select_Doctor");
		doctorsContainer.saveButton.click();
		resetTimer();
		}
	
	public static void clickOrderPlacementButton() {
		BrowserDriver.waitForAMoment();
		BrowserDriver.waitForElementToBeClickable(doctorsContainer.orderPlacementButton);
		WriteLog("17_Select_Doctor_Save");
		doctorsContainer.orderPlacementButton.click();
		resetTimer();
		BrowserDriver.waitForAMoment();
		
	}
	
}
