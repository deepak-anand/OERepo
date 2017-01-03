package com.cardinalhealth.bpm.automation.containers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.cardinalhealth.bpm.automation.browser.BrowserDriver;

public class DashboardContainer {
	
	@FindBy(how = How.CLASS_NAME, using = "view-header")
	public WebElement dashboardHeaderText;
	
	@FindBy(how = How.CSS, using = ".grid-content-table .grid-content-cell-wrapper .runtime-list-item")
	public List<WebElement> orderResultsText;
  
	@FindBy(how = How.NAME, using = "bEditDemographic")
	public WebElement editDemographicsButton;
	
	
} 