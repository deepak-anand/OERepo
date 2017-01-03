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
import com.cardinalhealth.bpm.automation.containers.HomeContainer;

//import com.cardinalhealth.vitalpath.automation.containers.OrderSheetContainer;
//import com.cardinalhealth.vitalpath.automation.containers.SelectCabinetContainer;
import com.cardinalhealth.bpm.automation.util.CommonUtils;
import com.cardinalhealth.bpm.automation.util.LogManager;

public class HomeView extends TimeLogger{
	private static final Logger LOGGER = LogManager.getInstance()
			.getAppLogger();
	private static final HomeContainer homeContainer = PageFactory
			.initElements(BrowserDriver.getCurrentDriver(),
					HomeContainer.class);

	
	public static void isDisplayedCheck() {
		//BrowserDriver.getCurrentDriver().switchTo().frame("iframeid");
		System.out.println(BrowserDriver.waitForElement(homeContainer.ndcCINUPC));
		
		}
	
	public static void enterNDCCINUPC() {
		//BrowserDriver.getCurrentDriver().switchTo().frame(0);
		BrowserDriver.waitForElementToBeClickable(homeContainer.ndcCINUPC);
		homeContainer.ndcCINUPC.sendKeys("1059856");
	
	}
	
	public static void clickFindProduct() {
		//BrowserDriver.getCurrentDriver().switchTo().frame(0);
		//BrowserDriver.waitForElementToBeClickable(homeContainer.ndcCINUPC);
		homeContainer.findProduct.click();
	
	}
	
	public static void clickCart() {
		//BrowserDriver.getCurrentDriver().switchTo().frame(0);
		//BrowserDriver.waitForElementToBeClickable(homeContainer.ndcCINUPC);
		homeContainer.cart.click();
	
	}
	
	public static void clickAddToCart() {
		//BrowserDriver.getCurrentDriver().switchTo().frame(0);
		//BrowserDriver.waitForElementToBeClickable(homeContainer.ndcCINUPC);
		homeContainer.addToCart.click();
	
	}
	
	public static void clickHomeLink() {
		//BrowserDriver.getCurrentDriver().switchTo().frame(0);
		//BrowserDriver.waitForElementToBeClickable(homeContainer.ndcCINUPC);
		homeContainer.homeLink.click();
	
	}
	
}
