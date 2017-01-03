package com.cardinalhealth.bpm.automation.order.container;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OrderSummaryContainer {

	@FindBy(how = How.CLASS_NAME, using = "modal-dialog")
    public WebElement dialogBox;
    
	@FindBy(how = How.ID, using = "auditInitials")
    public WebElement initialsInput;
	
	@FindBy(how = How.ID, using = "OK")
    public WebElement okButton;
	
	@FindBy(how = How.CLASS_NAME, using = "view-header")
	public WebElement orderSummaryHeaderText;
	
	@FindBy(how = How.CLASS_NAME, using = "btn-primary")
    public List<WebElement> proceedToPaymentButton;
	
	@FindBy(how = How.ID, using = "APPLY")
    public WebElement applyButton;
		
	@FindBy(how = How.ID, using = "APPLY")
    public WebElement infoButton;

	
	@FindBy(how = How.CSS, using = ".modal-footer .btn-secondary")
    public List<WebElement> locationNotChangedButton;
}
