package com.cardinalhealth.bpm.automation.containers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.cardinalhealth.bpm.automation.browser.BrowserDriver;

public class LoginContainer {
	


	@FindBy(how= How.CLASS_NAME, using = "PrimaryButton")
	public WebElement loginButton;
	
	@FindBy(how= How.NAME, using = "USER")
	public WebElement userName;
	
	@FindBy(how= How.NAME, using = "PASSWORD")
	public WebElement password;
	
	@FindBy(how= How.CLASS_NAME, using = "cms_footer")
	public WebElement text;
	
	
	
}