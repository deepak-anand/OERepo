package com.cardinalhealth.bpm.automation.order.container;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OrderPlacementContainer {

	@FindBy(how = How.CLASS_NAME, using = "view-header")
	public WebElement orderPlacementHeaderText;
	
	@FindBy(how = How.NAME, using = "bContinue")
    public WebElement yesContinueButton;
    
	@FindBy(how = How.ID, using = "btnFinish")
	public WebElement finishProcessOrderButton;
	
	@FindBy(how = How.XPATH, using = "//fieldset/table/tbody/tr[3]/td[3]/div/table/tbody/tr[4]/td[2]/select/option[3]")
	public WebElement paymentMethod;
	
	@FindBy(how = How.CSS, using = ".modal-dialog .btn-primary")
	public WebElement OKButton;

//	@FindBy(how = How.LINK_TEXT, using = "New Order")
//	public WebElement newOrderLink;

	
	
}


