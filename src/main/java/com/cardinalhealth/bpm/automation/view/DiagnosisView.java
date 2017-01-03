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
import com.cardinalhealth.bpm.automation.containers.DiagnosisContainer;

//import com.cardinalhealth.vitalpath.automation.containers.OrderSheetContainer;
//import com.cardinalhealth.vitalpath.automation.containers.SelectCabinetContainer;
import com.cardinalhealth.bpm.automation.util.CommonUtils;
import com.cardinalhealth.bpm.automation.util.LogManager;

public class DiagnosisView extends TimeLogger{
	private static final Logger LOGGER = LogManager.getInstance()
			.getAppLogger();
	private static final DiagnosisContainer diagnosisContainer = PageFactory
			.initElements(BrowserDriver.getCurrentDriver(),
					DiagnosisContainer.class);

	public static void clickNextToDoctorsButton() {
		BrowserDriver.waitForElementToBeClickable(diagnosisContainer.nextToDoctorsButton);
		WriteLog("12_GO_To_Diagnosis");
		diagnosisContainer.nextToDoctorsButton.click();
		resetTimer();
		BrowserDriver.waitForAMoment();
	}
	
	
}
