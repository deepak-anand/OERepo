package com.cardinalhealth.bpm.automation;

import org.apache.log4j.Logger;

import com.cardinalhealth.bpm.automation.browser.BrowserDriver;
import com.cardinalhealth.bpm.automation.constants.InvalidDataException;
import com.cardinalhealth.bpm.automation.navigation.NaviagtorFactory;
import com.cardinalhealth.bpm.automation.util.LogManager;
import com.cardinalhealth.bpm.automation.view.DemographicsView;
import com.cardinalhealth.bpm.automation.view.DoctorsView;
import com.cardinalhealth.bpm.automation.view.LookupView;
import com.cardinalhealth.bpm.automation.view.InsuranceView;
import com.cardinalhealth.bpm.automation.view.DiagnosisView;
import com.cardinalhealth.bpm.automation.order.container.OrderPlacementContainer;
import com.cardinalhealth.bpm.automation.order.view.PreOrderQuestionsView;
import com.cardinalhealth.bpm.automation.order.view.OrderPlacementView;
import com.cardinalhealth.bpm.automation.order.view.OrderCartView;
import com.cardinalhealth.bpm.automation.order.view.OrderSummaryView;
import com.cardinalhealth.bpm.automation.order.view.OrderCartView;

import cucumber.annotation.en.And;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;

public class NewOrderCreationSteps {
	private static final Logger LOGGER = LogManager.getInstance()
			.getAppLogger();

	@When("^I enter phone number$")
	public void I_enter_phone_number() {

		//LookupView.isDisplayedCheck();
		LookupView.enterPhoneNumber();

	}

	@When("^I click on search$")
	public void I_click_on_search() {
		LookupView.clickSearchButton();

	}

	@When("^I click on create new customer button$")
	public void I_click_on_create_new_customer_button() {
		LookupView.clickCreateNewCustomerButton();

	}

	@When("^I am at Demographics page$")
	public void I_am_at_Demographics_page() {
		DemographicsView.isDisplayedCheck();
	}

	@When("^I enter patient first name$")
	public void I_enter_first_name() {
		DemographicsView.enterFirstName();

	}

	@When("^I enter patient last name$")
	public void I_enter_last_name() {
		DemographicsView.enterLastName();

	}

	@When("^I select patient gender$")
	public void I_select_gender() {
		DemographicsView.selectGender();

	}

	@When("^I select patient dob$")
	public void I_select_dob() {
		DemographicsView.enterDOB();

	}

	@When("^I enter street address$")
	public void I_enter_street_address() {
		DemographicsView.enterStreet();

	}

	@When("^I enter zipcode$")
	public void I_enter_zipcode() {
		DemographicsView.enterZip();

	}


	@When("^I see the city name gets populated$")
	public void I_see_the_city_name() {
		DemographicsView.getCityName();

	}
	
	
	@When("^I enter patient phone number$")
	public void I_enter_patient_phone() {
		DemographicsView.enterPhone();

	}

	@When("^I enter caregiver name$")
	public void I_enter_caregiver_name() {
		DemographicsView.enterCaregiverName();

	}

	@When("^I enter caregiver relationship$")
	public void I_enter_caregiver_relationship() {
		DemographicsView.enterCaregiverRelationship();

	}

	@When("^I enter caregiver phone$")
	public void I_enter_caregiver_phone() {
		DemographicsView.enterCaregiverPhone();

	}

	@When("^I click on add referral code button$")
	public void I_click_on_add_referral_code_button() {
		DemographicsView.clickAddReferralCodeButton();
	}

	@When("^I see referral search popup$")
	public void I_see_referral_search_popup() {
		DemographicsView.isReferralSearchPopupDisplayed();
		
	}

	@When("^I select referral type$")
	public void I_select_referral_type() {
		DemographicsView.enterReferralType();
	}

	@When("^I enter referral name$")
	public void I_enter_referral_name() {
		DemographicsView.enterReferralName();
	}

	@When("^I click on save on referral popup$")
	public void I_click_on_save_on_referral_popup() {
		DemographicsView.clickSaveButton();
	}

	@When("^I click on next button$")
	public void I_click_on_next_button() {
		DemographicsView.clickNextButton();
		
	}

	@When("^I see Insurance page$")
	public void I_see_Insurance_page() {
		InsuranceView.isDisplayedCheck();

	}

	@When("^I select medicare insurance$")
	public void I_select_medicare_insurance() {
		InsuranceView.selectMedicareInsurance();

	}

	@When("^I enter policy number$")
	public void I_enter_policy_number() {
		InsuranceView.enterPolicyNumber();
	}

	@When("^I see insurance results popup$")
	public void I_see_insurance_results_popup() {
		InsuranceView.isInsuranceResultsPopupDisplayed();

	}

	@When("^I double click results from the list$")
	public void I_double_click_results_from_the_list() {
		InsuranceView.selectResults();
	}

	
	@When("^I double click doctors results from the list$")
	public void I_double_click_doctors_results_from_the_list() {
		DoctorsView.selectDoctorsResults();
	}

	@When("^I click save and next button$")
	public void I_click_save_and_next_button() {
		InsuranceView.clickSaveAndNextButton();

	}

	@When("^I click on Go to Diagnosis button$")
	public void I_click_on_Go_to_Diagnosis_button() {
		InsuranceView.clickGoToButton();

	}

	@When("^I click on next to Doctors button$")
	public void I_click_on_next_to_Doctors_button() {
		DiagnosisView.clickNextToDoctorsButton();
	}

	@When("^I am at Doctors page$")
	public void I_am_at_Doctors_page() {
		DoctorsView.isDisplayedCheck();

	}

	@When("^I enter doctor last name$")
	public void I_enter_doctor_last_name() {
		DoctorsView.enterDoctorLastName();
	}

	@When("^I enter doctor first name$")
	public void I_enter_doctor_first_name() {
		DoctorsView.enterDoctorFirstName();
	}

	@When("^I click on search for doctors$")
	public void I_click_on_search_for_doctors() {
		DoctorsView.clickSearchButton();
	}

	
	@When("^I click on save$")
	public void I_click_on_save() {
		DoctorsView.clickSaveButton();

	}

	@When("^I click on ok button at the popup$")
	public void I_click_ok_button() {
		DoctorsView.clickPopupOkButton();

	}

	@When("^I click on order placement button$")
	public void I_click_on_order_placement_button() {
		DoctorsView.clickOrderPlacementButton();
	}

	@When("^I am at Order Placement page$")
	public void I_am_at_Order_Placement_page() {
		OrderPlacementView.isDisplayedCheck();
	}

	@When("^I click on yes button as '(.+)'$")
	public void I_click_on_yes_button(String write) {
		OrderPlacementView.clickYesContinueButton(write);
	}

	@Then("^I am at Pre-Order Questions page$")
	public void I_am_at_Pre_Order_Questions_page() {
		PreOrderQuestionsView.isDisplayedCheck();
	}

	@Then("^I click on Continue as '(.+)'$")
	public void I_click_on_Continue(String write) {
		PreOrderQuestionsView.clickContinueButton(write);
	}
	
	@Then("^I click on Continue on PPS$")
	public void I_click_on_Continue_on_PPS() {
		PreOrderQuestionsView.clickPPSContinueButton();
	}

	@Then("^I select no for the three questions as '(.+)'$")
	public void I_select_no_for_the_three_questions(String write) {
		PreOrderQuestionsView.selectPreOrderQuestions(write);

	}

	@Then("^I see Find a product dialog box$")
	public void I_see_Find_a_product_dialog_box() {
		OrderCartView.isDialogBoxDisplayed();

	}

	@Then("^I enter product code$")
	public void I_enter_product_code() {
		OrderCartView.enterProductCode();

	}

	@Then("^I click on search on dialog box$")
	public void I_click_on_search_on_dialog_box() {
		OrderCartView.clickSearchButton();

	}

	@Then("^I see resolve validation errors dialog box$")
	public void I_see_resolve_validation_errors_dialog_box() {
		OrderCartView.isResolveValidationDialogBoxDisplayed();

	}

	@Then("^I click on substitute product$")
	public void I_click_on_substitute_product() {
	
		OrderCartView.clickSubstituteProductButton();

	}

	@Then("^I am at Order cart page$")
	public void I_am_at_Order_cart_page() {
		OrderCartView.isDisplayedCheck();

	}
	
	@Then("^I am at order cart page and see add another item button enabled$")
	public void I_am_at_Order_cart_page_and_see_add_another_item_button_enabled() {
		OrderCartView.isAddAnotherItemButtonEnabled();

	}
	
	

	@Then("^I enter no of days as '(.+)'$")
	public void I_enter_no_of_days(String write) {
		OrderCartView.enterSupply(write);

	}

	@Then("^I enter no of weeks$")
	public void I_enter_no_of_weeks() {
		OrderCartView.enterPeriod();

	}

	@Then("^I click on Continue button on Order Cart page$")
	public void I_click_on_continue_button_on_order_cart() {
		OrderCartView.clickContinueButton();

	}
	@Then("^I enter no of tablets that I have left$")
	public void I_enter_no_of_tablets_that_I_have_left() {
		OrderCartView.enterDrugsRemaining();

	}
	@Then("^I enter supply details$")
	public void I_enter_supply_details() {
		OrderCartView.enterDaysSupply();

	}
	@Then("^I click on calculate ship date button$")
	public void I_click_on_calculate_ship_date_button() {
		OrderCartView.clickCalculateShipDateButton();
	}
	@Then("^I click on apply button$")
	public void I_click_on_apply_button() {
		OrderCartView.clickApplyButton();
		}
	@Then("^I enter initials$")
	public void I_enter_initials() {
		OrderSummaryView.enterInitials();

	}

	@Then("^I click on OK button on dialog box")
	public void I_click_on_OK_button_on_dialog_box() {
		
		OrderSummaryView.clickOkButton();

	}
	
	@Then("^I click on OK button again on dialog box as '(.+)'$")
	public void I_click_on_OK_button_again_on_dialog_box(String write) {
		
		OrderSummaryView.clickOkButtonAgain(write);

	}

	@Then("^I am at Order summary page$")
	public void I_am_at_Order_summary_page() {
		OrderSummaryView.isDisplayedCheck();

	}

	@Then("^I click on proceed to payment button$")
	public void I_click_on_proceed_to_payment_button() {
		OrderSummaryView.clickProceedToPaymentButton();
	}


	@Then("^I click on apply on order compliance questions dialog box$")
	public void I_click_on_apply() {
		OrderSummaryView.clickApplyButton();

	}

	@Then("^I select payment method as check as '(.+)'$")
	public void I_select_payment_method_as_check(String write) {
		OrderPlacementView.selectPaymentMethod(write);

	}

	@Then("^I click on finish and process order$")
	public void I_click_on_finish_and_process_order() {
		OrderPlacementView.clickFinishProcessOrder();

	}

	@Then("^I see finalize order dialog box$")
	public void I_see_finalize_order_dialog_box() {
		OrderPlacementView.clickOKButton();

	}

	@Then("^I am at customer look-up page again as '(.+)'$")
	public void I_am_at_customer_look_up_page_again(String write) {
		LookupView.isDisplayedCheck(write);

	}
	
	@When("^I enter account number$")
	public void I_enter_account_number() {
	   LookupView.enterAccountNumber();
	}

	
	@Then("^I click on Location not changed customer informed button$")
	public void I_click_on_location_not_changed() {
		OrderSummaryView.clickLocationNotChangedButton();

	}

}
