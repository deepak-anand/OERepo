package com.cardinalhealth.bpm.automation.containers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.cardinalhealth.bpm.automation.browser.BrowserDriver;

public class DoctorsContainer {
	
	@FindBy(how = How.CLASS_NAME, using = "view-header")
	public WebElement doctorHeaderText;
	
	
	@FindBy(how = How.NAME, using = "Last Name Text Box")
	public WebElement doctorLastnameInput;
	
	@FindBy(how = How.NAME, using = "First Name Text Box")
	public WebElement doctorFirstnameInput;
	
	//@FindBy(how = How.CSS, using = ".grid-content-table .grid-content-cell-wrapper .runtime-list-item")
	//public List<WebElement> resultsText;
	
	@FindBy(how = How.CSS, using = ".ui-draggable .SourceCode-Forms-Controls-Web-Button")
	public WebElement popupOkButton;
	
	@FindBy(how = How.NAME, using = "OrderPlacementButton")
	public WebElement orderPlacementButton;
	
	@FindBy(how = How.NAME, using = "Save Button")
	public WebElement saveButton;
    
	@FindBy(how = How.NAME, using = "btn_Search")
	public WebElement searchButton;
	
	@FindBy(how = How.CSS, using = ".grid-content-table .grid-content-cell-wrapper .runtime-list-item")
	public List<WebElement> resultsDoctorText;
	
} 