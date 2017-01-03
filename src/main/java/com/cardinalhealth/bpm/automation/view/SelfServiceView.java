package com.cardinalhealth.bpm.automation.view;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.cardinalhealth.bpm.automation.browser.BrowserDriver;
import com.cardinalhealth.bpm.automation.containers.DemographicsContainer;
import com.cardinalhealth.bpm.automation.containers.SelfServiceContainer;
import com.cardinalhealth.bpm.automation.containers.CommonContainer;
//import com.cardinalhealth.vitalpath.automation.containers.OrderSheetContainer;
//import com.cardinalhealth.vitalpath.automation.containers.SelectCabinetContainer;
import com.cardinalhealth.bpm.automation.util.CommonUtils;
import com.cardinalhealth.bpm.automation.util.LogManager;

public class SelfServiceView extends TimeLogger {
	private static final Logger LOGGER = LogManager.getInstance()
			.getAppLogger();
	private static final SelfServiceContainer selfserviceContainer = PageFactory
			.initElements(BrowserDriver.getCurrentDriver(),
					SelfServiceContainer.class);
	public static String uniqueLastName = null;
	
	
	public static void isDisplayedCheck() {
		
		//BrowserDriver.wait(10000);
		//BrowserDriver.waitForElementToBeClickable(commonContainer.letfNavigation);
		
	}
	
	
	public static void click2() {
		
		//BrowserDriver.loadPage("https://www.google.com/?gws_rd=ssl");
		//BrowserDriver.getDropDownOptions(selfserviceContainer.navigationBar);
		BrowserDriver.wait(3000);
		BrowserDriver.getCurrentDriver().switchTo().frame(0);
		//BrowserDriver.
		//BrowserDriver.waitForElementToBeClickable(selfserviceContainer.navigationBar);
		
		//BrowserDriver.findAllLinks(selfserviceContainer.navigationBar);
		BrowserDriver.findAllLinks2(selfserviceContainer.navigationBar,"Support");
		//BrowserDriver.getDropDownOption(selfserviceContainer.navigationBar, "Support");
		
		//System.out.println("Parent" + BrowserDriver.getParent(selfserviceContainer.navigationBar));
		
	}
	
	public static void clickResolveAnIssue() {
		BrowserDriver.wait(3000);
		//BrowserDriver.getCurrentDriver().switchTo().frame(0);
		//BrowserDriver.
		//BrowserDriver.waitForElementToBeClickable(selfserviceContainer.navigationBar);
		
		//BrowserDriver.findAllLinks(selfserviceContainer.navigationBar);
		BrowserDriver.findAllLinks2(selfserviceContainer.navigationBar,"Resolve an Issue");
		
	}
	
	public static void selectCriticalIssue() {
		BrowserDriver.wait(3000);
		//BrowserDriver.getCurrentDriver().switchTo().frame(0);
		//BrowserDriver.
		//BrowserDriver.waitForElementToBeClickable(selfserviceContainer.navigationBar);
		
		//BrowserDriver.findAllLinks(selfserviceContainer.navigationBar);
		BrowserDriver.getCurrentDriver().switchTo().frame(0);
		BrowserDriver.getDropDownOption2(selfserviceContainer.criticalIssue,"No");
		BrowserDriver.wait(3000);
	}
	
	public static void enterTitle() {
		BrowserDriver.wait(3000);
		//BrowserDriver.getCurrentDriver().switchTo().frame(0);
		//BrowserDriver.
		//BrowserDriver.waitForElementToBeClickable(selfserviceContainer.navigationBar);
		
		//BrowserDriver.findAllLinks(selfserviceContainer.navigationBar);
		//BrowserDriver.getCurrentDriver().switchTo().frame(0);
		//BrowserDriver.getDropDownOption2(selfserviceContainer.titleRequest,"No");
		
		WebElement parentNode =null;
		String label = null;
		//parentNode = BrowserDriver.getParent(selfserviceContainer.titleRequest);
		label = parentNode.getText();
		
		System.out.println("Text:-"+label);
		
		BrowserDriver.wait(3000);
		
	}
	
	public static void enterTitle2() {
		BrowserDriver.wait(3000);
		//BrowserDriver.getCurrentDriver().switchTo().frame(0);
		//BrowserDriver.
		//BrowserDriver.waitForElementToBeClickable(selfserviceContainer.navigationBar);
		
		//BrowserDriver.findAllLinks(selfserviceContainer.navigationBar);
		//BrowserDriver.getCurrentDriver().switchTo().frame(0);
		//BrowserDriver.getDropDownOption2(selfserviceContainer.titleRequest,"No");
		
		
		WebElement parentNode =null;
		String label = null;
		//parentNode = 
				//BrowserDriver.findAllTextFields(selfserviceContainer.titleRequest);
		//label = parentNode.getText();
		
		//System.out.println("Text:-"+label);
		BrowserDriver.findAllTextFields2(selfserviceContainer.titleRequest);
		
		BrowserDriver.wait(3000);
		
	}
	
   
	
	/*public static void clickNav() {
		String topNavLink = null;
		BrowserDriver.wait(5000);
		BrowserDriver.getCurrentDriver().switchTo().frame(0);
		topNavLink = selfserviceContainer..get(1).getText();
		//selfserviceContainer.navigationBar.get(1).click();
		int topNavLinkLength;
		topNavLinkLength = selfserviceContainer.navigationBar.size();
		
		
		
		for (int i=0;i<topNavLinkLength;i++)
		{
			System.out.println("i" +i);
			System.out.println(selfserviceContainer.navigationBar.get(i).getText());
			//selfserviceContainer.navigationBar.
			
			
			
			//BrowserDriver.
			//BrowserDriver.wait(1000);
			if (selfserviceContainer.navigationBar.get(i).getText()=="Support")
			{
				selfserviceContainer.navigationBar.get(i).click();
				BrowserDriver.wait(5000);
			}
		}
		
		
		
		System.out.println("topNavLink:-" +topNavLink);
		System.out.println("topNavLinkLength:-" +topNavLinkLength);
		BrowserDriver.wait(5000);
		
	
	}
	
	*/
	}
	

