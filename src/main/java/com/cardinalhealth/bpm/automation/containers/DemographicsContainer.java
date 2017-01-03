package com.cardinalhealth.bpm.automation.containers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.cardinalhealth.bpm.automation.browser.BrowserDriver;

public class DemographicsContainer {
	
	@FindBy(how = How.CLASS_NAME, using = "view-header")
	public WebElement demographicsheaderText;
	
	@FindBy(how = How.NAME, using = "tFirstName")
	public WebElement firstNameInput;
	
	@FindBy(how = How.NAME, using = "tLastName")
	public WebElement lastNameInput;
	
	@FindBy(how = How.CSS, using = ".styling-outer-wrapper .input-control")
	public WebElement genderInput;
	
	@FindBy(how = How.CSS, using = ".calendar-control .input-control")
	public WebElement DOBInput;

	@FindBy(how = How.NAME, using = "tStreet1")
	public WebElement streetInput;
	
	@FindBy(how = How.NAME, using = "tZip")
	public WebElement zipInput;
	
	@FindBy(how = How.NAME, using = "tCity")
	public WebElement cityInput;
	
	@FindBy(how = How.NAME, using = "txt_Phone")
	public WebElement stateInput;
	
	@FindBy(how = How.NAME, using = "tPrimaryPhone")
	public WebElement homePhoneInput;
	
	@FindBy(how = How.NAME, using = "tCaregiverFirstName")
	public WebElement caregiverNameInput;
	
	@FindBy(how = How.CSS, using = ".styling-outer-wrapper .input-control")
	public List<WebElement> caregiverRelationshipInput;
	
	@FindBy(how = How.NAME, using = "tCaregiverPhone")
	public WebElement caregiverPhoneInput;
	
	@FindBy(how = How.NAME, using = "bReferral")
	public WebElement addReferralCodeButton;
	
	@FindBy(how = How.CSS, using = ".styling-outer-wrapper .input-control")
	public List<WebElement> referralTypeInput;
	
	@FindBy(how = How.NAME, using = "dName")
	public WebElement referralNameInput;
	
	@FindBy(how = How.NAME, using = "bSaveReferralType")
	public WebElement saveButton;
	
	@FindBy(how = How.NAME, using = "bNext")
	public WebElement nextButton;
	
	@FindBy(how = How.NAME, using = "tFacilityName")
	public WebElement facilityNameInput;

	
	 
} 