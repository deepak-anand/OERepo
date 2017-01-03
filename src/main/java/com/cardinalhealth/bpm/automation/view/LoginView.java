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
import com.cardinalhealth.bpm.automation.containers.LoginContainer;

//import com.cardinalhealth.vitalpath.automation.containers.OrderSheetContainer;
//import com.cardinalhealth.vitalpath.automation.containers.SelectCabinetContainer;
import com.cardinalhealth.bpm.automation.util.CommonUtils;
import com.cardinalhealth.bpm.automation.util.LogManager;

public class LoginView extends TimeLogger{
	private static final Logger LOGGER = LogManager.getInstance()
			.getAppLogger();
	private static final LoginContainer loginContainer = PageFactory
			.initElements(BrowserDriver.getCurrentDriver(),
					LoginContainer.class);

	
	public static void isDisplayedCheck() {
		//BrowserDriver.getCurrentDriver().switchTo().frame("iframeid");
		System.out.println(BrowserDriver.waitForElement(loginContainer.userName));
		
		}
	
	public static void enterUserName() {
		//BrowserDriver.getCurrentDriver().switchTo().frame(0);
		BrowserDriver.waitForElementToBeClickable(loginContainer.userName);
		loginContainer.userName.sendKeys("riqa_dc19");
	
	}
	
	public static void enterPassword() {
		
		loginContainer.password.sendKeys("Cardinal1");
		
	}
	
	public static void clickLoginButton() {
		//doctorsContainer.searchButton.click();
		loginContainer.loginButton.click();
		BrowserDriver.wait(3000);
		//loginContainer.text.
		//loginContainer.loginButton.click();
		//resetTimer();
		//BrowserDriver.waitForAMoment();
		
	}
	
	
	
}
