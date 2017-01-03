package com.cardinalhealth.bpm.automation.containers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.cardinalhealth.bpm.automation.browser.BrowserDriver;

public class NewOrderContainer {
	
	
	@FindBy(how = How.ID_OR_NAME, using = "txt_Phone")
	public WebElement phoneNumberInput;
	
	@FindBy(how = How.CLASS_NAME, using = "view-header")
	public WebElement headerText;
	
    @FindBy(how = How.NAME, using = "btn_Search")
	public WebElement searchButton;
	
    @FindBy(how = How.NAME, using = "btn_NewCust")
   	public WebElement createNewCustomerButton;
    
    @FindBy(how = How.CLASS_NAME, using = "close")
   	public WebElement closeButton;
    
    
   
} 