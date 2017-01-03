package com.cardinalhealth.bpm.automation.view;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.cardinalhealth.bpm.automation.browser.BrowserDriver;
import com.cardinalhealth.bpm.automation.containers.DemographicsContainer;
import com.cardinalhealth.bpm.automation.containers.CommonContainer;
//import com.cardinalhealth.vitalpath.automation.containers.OrderSheetContainer;
//import com.cardinalhealth.vitalpath.automation.containers.SelectCabinetContainer;
import com.cardinalhealth.bpm.automation.util.CommonUtils;
import com.cardinalhealth.bpm.automation.util.LogManager;

public class IncidentView extends TimeLogger {
	private static final Logger LOGGER = LogManager.getInstance()
			.getAppLogger();
	private static final CommonContainer commonContainer = PageFactory
			.initElements(BrowserDriver.getCurrentDriver(),
					CommonContainer.class);
	public static String uniqueLastName = null;
	
	
	public static void isDisplayedCheck() {
		
		//BrowserDriver.wait(10000);
		//BrowserDriver.waitForElementToBeClickable(commonContainer.letfNavigation);
		
	}
	
	public static void clickLeftNav() {
		String leftNavLink = null;
		leftNavLink = commonContainer.letfNavigation.get(5).getText();
		commonContainer.letfNavigation.get(5).click();
		System.out.println("leftNavLink:-" +leftNavLink);
		//BrowserDriver.wait(5000);
		
		
		/*String customerHeader =insuranceContainer.accountNumberText.getText();
		System.out.println("customerHeader:-" +customerHeader);
		System.out.println("spaceindex:-" +customerHeader.indexOf(" "));
		accountInfo=customerHeader.substring(0,10);
		System.out.println("accountInfo:-"+accountInfo);
		*/
		//WriteLog("04_Create_New_customer");
		//demographicsContainer.firstNameInput.sendKeys("deepak");
		

	}
	
	
	}
	

