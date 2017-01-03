package com.cardinalhealth.bpm.automation.containers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.cardinalhealth.bpm.automation.browser.BrowserDriver;

public class InsuranceContainer {
	
	@FindBy(how = How.CLASS_NAME, using = "view-header")
	public WebElement insuranceHeaderText;
	
	@FindBy(how = How.XPATH, using = "//div[3]/div[2]/div[2]/span[2]")
	public WebElement accountNumberText;

	@FindBy(how = How.CSS, using = ".multi-select-box-list-item .input-control-img")
	public List<WebElement> medicareInsuranceRadio;
	
	@FindBy(how= How.NAME, using = "policyNumberTxt")
	public WebElement policyNumberInput;
    
	@FindBy(how= How.NAME, using = "btn_Search")
	public WebElement searchButton;
	
	@FindBy(how = How.CSS, using = ".grid-content-table .grid-content-cell-wrapper .runtime-list-item")
	public List<WebElement> resultsText;
	
	@FindBy(how= How.NAME, using = "SaveAndNextBtn")
	public WebElement saveAndNextButton;
	
	@FindBy(how= How.NAME, using = "GotoButton")
	public WebElement goToDiagnosisButton;
	
	@FindBy(how= How.NAME, using = "ProviderPhoneTxt")
	public WebElement providerPhoneInput;
	
	@FindBy(how= How.ID, using = "iframeid")
	public WebElement insuranceFrame;
	
	
	
} 