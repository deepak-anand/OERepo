package com.cardinalhealth.bpm.automation.containers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.cardinalhealth.bpm.automation.browser.BrowserDriver;

public class ShoppingCartContainer {
	

	
	@FindBy(how= How.CSS, using = ".cahShoppingCartPortlet .cahQuantityTextBox")
	public WebElement qty;
	
	//@FindBy(how= How.XPATH, using = "//*[contains(@id, 'cmdSubmitSalesOrder')]")
	//public WebElement submitOrder;
	
	@FindBy(how= How.ID, using = "ok")
	public WebElement DialogBoxOk;
	
	
	@FindBy(how= How.ID, using = "cmdRegularSubmitCart")
	public WebElement submitOrder;
	
	
	@FindBy(how= How.XPATH, using = "//*[contains(@id, 'purchaseOrderNumber:')]")
	public WebElement poNumberOrder;
	
	
	@FindBy(how= How.ID, using = "btnVendorSubmit")
	public WebElement submitOrderVendorInformationDialogBox;
	
	@FindBy(how= How.ID, using = "btnViewOrder")
	public WebElement viewOrderButton;
	
	@FindBy(how= How.CSS, using = ".orderAcknowledgementLayer .cmdGoToDashboardOrder")
	public WebElement closeButton;
	
	
	
}