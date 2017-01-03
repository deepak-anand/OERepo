package com.cardinalhealth.bpm.automation.containers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.cardinalhealth.bpm.automation.browser.BrowserDriver;

public class HomeContainer {
	


	@FindBy(how= How.CLASS_NAME, using = "cahPlNdcUpcTextBox")
	public WebElement ndcCINUPC;
	
	@FindBy(how= How.XPATH, using = "//*[contains(@name, 'frmProductSearch:findProductAJAXButton')]")
	public WebElement findProduct;
	
	@FindBy(how= How.CLASS_NAME, using = "cartMouseOut")
	public WebElement cart ;
	
	@FindBy(how= How.ID, using = "butAddtoCart")
	public WebElement addToCart ;
	
	@FindBy(how= How.LINK_TEXT, using = "Home")
	public WebElement homeLink ;
	
}