package com.cardinalhealth.bpm.automation.containers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.cardinalhealth.bpm.automation.browser.BrowserDriver;

public class DiagnosisContainer {
	
	
	@FindBy(how= How.CLASS_NAME, using = "btn-primary")
	public WebElement nextToDoctorsButton;
	
    
  
} 