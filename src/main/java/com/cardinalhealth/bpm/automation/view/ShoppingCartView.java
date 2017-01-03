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
import com.cardinalhealth.bpm.automation.containers.ShoppingCartContainer;
//import com.cardinalhealth.vitalpath.automation.containers.OrderSheetContainer;
//import com.cardinalhealth.vitalpath.automation.containers.SelectCabinetContainer;
import com.cardinalhealth.bpm.automation.util.CommonUtils;
import com.cardinalhealth.bpm.automation.util.LogManager;

public class ShoppingCartView extends TimeLogger{
	private static final Logger LOGGER = LogManager.getInstance()
			.getAppLogger();
	private static final ShoppingCartContainer shoppingcartContainer = PageFactory
			.initElements(BrowserDriver.getCurrentDriver(),
					ShoppingCartContainer.class);

	
	public static void isDisplayedCheck() {
		//BrowserDriver.getCurrentDriver().switchTo().frame("iframeid");
		//System.out.println(BrowserDriver.waitForElement(homeContainer.ndcCINUPC));
		
		}
	

	
	public static void enterQty() {
		//BrowserDriver.getCurrentDriver().switchTo().frame(0);
		BrowserDriver.waitForElementToBeClickable(shoppingcartContainer.qty);
		shoppingcartContainer.qty.clear();
		BrowserDriver.waitForElementToBeClickable(shoppingcartContainer.DialogBoxOk);
		shoppingcartContainer.DialogBoxOk.click();
		BrowserDriver.waitForElementToBeClickable(shoppingcartContainer.qty);
		shoppingcartContainer.qty.sendKeys("1");
		shoppingcartContainer.poNumberOrder.click();
	
	}
	
	public static void clickSubmitOrder() {
		//BrowserDriver.getCurrentDriver().switchTo().frame(0);
		BrowserDriver.waitForElementToBeClickable(shoppingcartContainer.submitOrder);
		
		shoppingcartContainer.submitOrder.click();
	
	}
	
	public static void clickOkConfirmDialogBox() {
		//BrowserDriver.getCurrentDriver().switchTo().frame(0);
		BrowserDriver.waitForElementToBeClickable(shoppingcartContainer.DialogBoxOk);
		
		shoppingcartContainer.DialogBoxOk.click();
	
	}
	
	
	public static void clicksubmitOrderVendorInformationDialogBox() {
		//BrowserDriver.getCurrentDriver().switchTo().frame(0);
		BrowserDriver.waitForElementToBeClickable(shoppingcartContainer.submitOrderVendorInformationDialogBox);
		shoppingcartContainer.submitOrderVendorInformationDialogBox.click();
	
	}
	
	
	public static void OrderAckDialogBox() {
		//BrowserDriver.getCurrentDriver().switchTo().frame(0);
		//BrowserDriver.waitForElementToBeClickable(shoppingcartContainer.viewOrderButton);
		BrowserDriver.waitForElement(shoppingcartContainer.closeButton);
		//shoppingcartContainer.closeButton.click();
	
	}
	
	
	public static void clickCloseOrderAckDialogBox() {
		//BrowserDriver.getCurrentDriver().switchTo().frame(0);
		//BrowserDriver.waitForElementToBeClickable(shoppingcartContainer.viewOrderButton);
		shoppingcartContainer.closeButton.click();
		
	
	}
	
}
