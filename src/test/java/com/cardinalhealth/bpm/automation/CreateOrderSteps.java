package com.cardinalhealth.bpm.automation;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import com.cardinalhealth.bpm.automation.browser.BrowserDriver;
import com.cardinalhealth.bpm.automation.constants.InvalidDataException;
import com.cardinalhealth.bpm.automation.navigation.NaviagtorFactory;
import com.cardinalhealth.bpm.automation.util.LogManager;
import com.cardinalhealth.bpm.automation.view.DashboardView;
import com.cardinalhealth.bpm.automation.view.HomeView;
import com.cardinalhealth.bpm.automation.view.LookupView;
import com.cardinalhealth.bpm.automation.view.SelfServiceView;
import com.cardinalhealth.bpm.automation.view.ShoppingCartView;
import com.cardinalhealth.bpm.automation.view.InsuranceView;
import com.cardinalhealth.bpm.automation.order.view.OrderPlacementView;
import com.cardinalhealth.bpm.automation.order.view.OrderCartView;
import com.cardinalhealth.bpm.automation.view.LoginView;
import com.cardinalhealth.bpm.automation.view.IncidentView;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;

public class CreateOrderSteps {
	private static final Logger LOGGER = LogManager.getInstance()
			.getAppLogger();

	@When("^I enter CIN$")
	public void I_enter_CIN() {
		//OrderPlacementView.clickNewOrderLink();
		//LoginView.enterUserName();
		//IncidentView.clickLeftNav();
		HomeView.enterNDCCINUPC();
		BrowserDriver.wait(3000);
		

	}
	
	


	@When("^I click on Find Product$")
	public void I_click_on_Find_Product() {
		
		HomeView.clickFindProduct();
		BrowserDriver.wait(3000);
	   
	}

	@When("^I click on Cart$")
	public void I_click_on_Cart() {
		
		HomeView.clickCart();
		BrowserDriver.wait(3000);
	    
	}
	
	@When("^I click on Add to Cart on the dialog box$")
	public void I_click_on_Add_to_Cart_on_the_dialog_box() {
		
		HomeView.clickAddToCart();
		BrowserDriver.wait(3000);
	    
	}
	

	@When("^I note the default Order Number$")
	public void I_note_the_default_Order_Number() {
	  
	}

	@When("^I enter qty$")
	public void I_enter_qty() {
		ShoppingCartView.enterQty();
		BrowserDriver.wait(3000);
		
	  
	}

	
	
	@When("^I click on Submit Order$")
	public void I_click_on_Submit_Order() {
		
		ShoppingCartView.clickSubmitOrder();
		//ShoppingCartView.clickSubmitOrder();
		BrowserDriver.wait(3000);
	   
	}

	@When("^I click on ok button on the dialog box$")
	public void I_click_on_ok_button_on_the_dialog_box() {
		
		ShoppingCartView.clickOkConfirmDialogBox();
		BrowserDriver.wait(3000);
	   
	}
	
	@When("^I click on Submit Order on the Vendor Information dialog box$")
	public void I_click_on_Submit_Order_on_the_Vendor_Information_dialog_box() {
		
		ShoppingCartView.clicksubmitOrderVendorInformationDialogBox();
		//ShoppingCartView.clickSubmitOrder();
		BrowserDriver.wait(3000);
	   
	}
	

	@Then("^I should see Order Acknowledgement dialog box$")
	public void I_should_see_Order_Acknowledgement_dialog_box() {
		
		ShoppingCartView.OrderAckDialogBox();
		BrowserDriver.wait(3000);
	   
	}

	@Then("^I click on close button$")
	public void I_click_on_close_button() {
		
		ShoppingCartView.clickCloseOrderAckDialogBox();
	
	   
	}

	@Then("^I clicked on Home$")
	public void I_clicked_on_Home() {
		HomeView.clickHomeLink();
		BrowserDriver.wait(3000);
		
	   
	}

	@Then("^I see order number under Todays web order$")
	public void I_see_order_number_under_Todays_web_order() {
	   
	}

	

}
