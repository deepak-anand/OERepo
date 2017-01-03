package com.cardinalhealth.bpm.automation.order.container;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PreOrderQuestionsContainer {

	@FindBy(how = How.CLASS_NAME, using = "view-header")
	public WebElement preOrderQuestionsHeaderText;
	
	@FindBy(how = How.ID, using = "btnSave")
	public WebElement continueButton;

	@FindBy(how = How.CLASS_NAME, using = "diagAutoPost")
	public List<WebElement> preOrderQuestionsRadio;
	
	
    

}
