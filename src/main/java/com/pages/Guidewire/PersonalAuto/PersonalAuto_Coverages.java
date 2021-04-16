package com.pages.Guidewire.PersonalAuto;

import java.util.LinkedHashMap;

import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.aventstack.extentreports.ExtentTest;

public class PersonalAuto_Coverages extends SeleniumWebDriver_Commands implements PersonalAuto_Coverages_PO {

	
	LinkedHashMap<String, String> lhm_Data;
	public PersonalAuto_Coverages(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	@Override
	
	public void pac_CoveragesAppliedtoallvehicles() throws Throwable {
		lhm_Data = getDataFromSheet_Fillo("PA_Coverages",strTestCaseName);
	 //------->Verify the Page Name
	 GuidewireAutomate_Validation("PA_Coverages_Screen_titlebar", PA_Coverages_Screen_titlebar, "equals", "PA Coverages");
	 //--------> selecting AutoLiabilityPackage
	 GuidewireAutomate("PA Coverages Auto Liability Package" ,PA_Coverages_Auto_Liability_Package, "selectByVisibleText",lhm_Data.get("AutoLiabilityPackage"));
	 //-------->selecting the Medical Limit
	 GuidewireAutomate("Medical Limit" ,PA_Coverages_Medical_Limit,"selectByVisibleText",lhm_Data.get("MedicalLimit"));
     //-------->checking Liability Bodily Injury and Property Damage CheckBox disabled
	 GuidewireAutomate_Validation("PA_Coverages_Screen_titlebar", PA_Coverages_Screen_titlebar, "isChecked", "true");
	 //------->clicking on Underinsured Motorist - Property Damage ChecKBox
	 GuidewireAutomate("Underinsured Motorist - Property Damage ChecKBox" ,PA_Coverages_Underinsured_Motorist_Property_Damage_CheckBox,"click","");
	 //selecting Underinsured Motorist - Property Damage Limit
	 GuidewireAutomate("Underinsured Motorist Property Damage Limit" ,PA_Coverages_Underinsured_Motorist_Property_Damage_Limit,"selectByVisibleText",lhm_Data.get("UnderinsuredMotoristPropertyDamageLimit"));
	 //----->verifying the Coverages applied per vehicle in Alaska title
	 GuidewireAutomate_Validation("Coverages applied per vehicle in Alaska title", PA_Coverages_Coverages_applied_per_vehicle_in_alaska_titlevalidation, "equals", "Coverages applied per vehicle in Alaska");
	//------>clicking on Additional Coverages tab
	 GuidewireAutomate("Additional Coverages tab" ,PA_Coverages_AdditionalCoveragesTab,"click","");
	 //----->clicking on Rental Car Loss of Use CheckBox
	 GuidewireAutomate("Rental Car Loss of Use CheckBox" ,PA_Coverages_Rental_Car_Loss_of_Use_CheckBox,"click","");
	 //------>selecting Rental Car Loss of Use Limit
	 GuidewireAutomate("Rental Car Loss of Use Limit" ,PA_Coverages_Rental_Car_Loss_of_Use_Limit,"selectByVisibleText",lhm_Data.get("RentalCarLossofUseLimit"));
	 //----->clicking on Exclusions and Conditions tab
	 GuidewireAutomate("Exclusions and Conditions tab" ,PA_Coverages_ExclusionsAndConditionsCardTab,"click","");
	
	 }

	@Override
	public void pac_SearchAddExclusionorCondition() throws Throwable {
		 //----->clicking on Add Exclusion or Condition
		 GuidewireAutomate("Add Exclusion or Condition" ,PA_Coverages_Add_Exclusion_or_Condition,"click","");
		 //------->Verifying Search Exclusions And Conditions for Personal Auto Line title
		 GuidewireAutomate_Validation("Search Exclusions And Conditions for Personal Auto Line title", PA_Coverages_Search_Exclusions_And_Conditions_for_Personal_Auto_Line_titlebar, "equals", "Search Exclusions And Conditions for Personal Auto Line");
		//------>selecting PA_Category
		 GuidewireAutomate("PA_Category" ,PA_Coverages_Category,"selectByVisibleText",lhm_Data.get("Category"));
		 //----->clicking on search button
		 GuidewireAutomate("search button" ,PA_Coverages_SearchButton,"click","");
		 //---->verifying Add Selected Exclusions And Conditions button is disabled
		 GuidewireAutomate_Validation("Add Selected Exclusions And Conditions button", PA_Coverages_Add_Selected_Exclusions_And_Conditions_button, "isDisabled", "true");
		 //------>clicking on Coverage Checkbox
		 GuidewireAutomate("Coverage Checkbox" ,PA_Coverages_Coverage_CheckBox,"click","");
		 //---->verifying Add Selected Exclusions And Conditions button is isEnabled
		 GuidewireAutomate_Validation("Add Selected Exclusions And Conditions button", PA_Coverages_Add_Selected_Exclusions_And_Conditions_button, "isEnabled", "true");
         //----->clicking on Add Selected Exclusions And Conditions button
		 GuidewireAutomate("Add Selected Exclusions And Conditions button" ,PA_Coverages_Add_Selected_Exclusions_And_Conditions_button,"click","");
         


	}

	

	

}
