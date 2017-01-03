package com.cardinalhealth.bpm.automation.order.container;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OrderCartContainer {
	
	@FindBy(how = How.CLASS_NAME, using = "modal-dialog")
    public WebElement dialogBox;

	@FindBy(how = How.NAME, using = "txtProductCodeExact")
    public WebElement productCodeInput;
    
	@FindBy(how = How.NAME, using = "btnSearchProductExact")
    public WebElement searchDialogBoxButton;
	
	@FindBy(how = How.ID, using = "SUBSTITUTE")
    public WebElement substituteProductButton;
	
	@FindBy(how = How.CSS, using = ".col-supply-period .col-uom")
    public WebElement supplyInput;
	
	@FindBy(how = How.CLASS_NAME, using = "view-header")
	public WebElement orderCartHeaderText;
	
	@FindBy(how = How.CSS, using = ".col-supply-period .ng-pristine")
    public WebElement periodInput;
	
	@FindBy(how = How.ID, using = "btnContinue")
    public WebElement continueButton;
	
	@FindBy(how = How.ID, using = "numberLeft")
    public WebElement drugsRemainingInput;
	
	@FindBy(how = How.ID, using = "daysSupply")
    public WebElement drugsSupplyInput;
	
	@FindBy(how = How.CLASS_NAME, using = "btn-secondary")
    public WebElement calculateShipDateButton;
	
	@FindBy(how = How.ID, using = "APPLY")
    public WebElement applyButton;
	
	@FindBy(how = How.NAME, using = "ButtonLast")
    public WebElement useLastOrderButton;
	
	@FindBy(how = How.ID, using = "chkSel_ZRLB18ET_1")
    public WebElement selectProductCheckBox;
	
	@FindBy(how = How.ID, using = "btnAddToOrder")
    public WebElement addToOrderButton;
	
	
	//chkSel_ZRLB18ET_1  id   
	// btnAddToOrder  id
	
	
}
