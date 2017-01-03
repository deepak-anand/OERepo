package com.cardinalhealth.bpm.automation.view;

import junit.framework.Assert;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.cardinalhealth.bpm.automation.browser.BrowserDriver;
import com.cardinalhealth.bpm.automation.containers.DashboardContainer;
import com.cardinalhealth.bpm.automation.util.LogManager;
//import com.cardinalhealth.vitalpath.automation.containers.OrderSheetContainer;
//import com.cardinalhealth.vitalpath.automation.containers.SelectCabinetContainer;

public class DashboardView extends TimeLogger {
	private static final Logger LOGGER = LogManager.getInstance()
			.getAppLogger();
	private static final DashboardContainer dashboardContainer = PageFactory
			.initElements(BrowserDriver.getCurrentDriver(),
					DashboardContainer.class);

	public static void isDisplayedCheck() {
		BrowserDriver.waitForAMoment();
		System.out.println(BrowserDriver.waitForElement(
				dashboardContainer.dashboardHeaderText).getText());
		BrowserDriver.getCurrentDriver().switchTo().frame("iframeid");

	}

	public static void isOrderResultsDisplayed(String write) {
		// System.out.println(BrowserDriver.waitForElement(dashboardContainer.orderResultsText).
		BrowserDriver
				.waitForElementToBeClickable(dashboardContainer.editDemographicsButton);
		// BrowserDriver.doubleClick(dashboardContainer.orderResultsText.get(2));
		WriteLog("30_Member_Dashboard", write);
		Assert.assertEquals(true, dashboardContainer.orderResultsText.get(2)
				.isDisplayed());
		BrowserDriver.waitForAMoment();

	}

}
