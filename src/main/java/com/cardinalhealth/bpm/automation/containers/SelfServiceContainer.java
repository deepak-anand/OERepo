package com.cardinalhealth.bpm.automation.containers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.cardinalhealth.bpm.automation.browser.BrowserDriver;

public class SelfServiceContainer {
	
    
   // @FindBy(how = How.CLASS_NAME, using = ".navbar-nav")
	
	//@FindBy(how = How.CSS, using = ".input_controls")
	//public List<WebElement> titleRequest;
    
    @FindBy(how = How.CLASS_NAME, using = "drop-zone-content")
	public WebElement navigationBar;
    
    @FindBy(how = How.CSS, using = " .cat_item_option")
	public WebElement criticalIssue;
   
    @FindBy(how = How.CSS, using = ".iotd .sc-row .col-xs-6 .cat_item_option")
	public WebElement titleRequest;
    
	
	//@FindBy(how = How.CSS, using = ".dropdown .dropdown-menu")
	//public List<WebElement> navigationBar;
} 	

