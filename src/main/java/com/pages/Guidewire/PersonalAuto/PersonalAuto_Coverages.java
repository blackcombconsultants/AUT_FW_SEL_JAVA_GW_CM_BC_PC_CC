package com.pages.Guidewire.PersonalAuto;

import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;

public class PersonalAuto_Coverages extends SeleniumWebDriver_Commands implements PersonalAuto_Coverages_PO {

	Selenium_Utils_DataBase oDB = new Selenium_Utils_DataBase();

	public PersonalAuto_Coverages(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	@Override
	public void pa_Coverages() throws Throwable {
		lhm_TestCase_Table_Data = oDB.getData_MSExcel_WorkSheet_Fillo("paCoverages", strTestCaseName);
		GuidewireAutomate_Validation("Coverages Header", PA_Coverages_Screen_titlebar, "equals", "PA Coverages");
		CoveragesAppliedtoallvehicles("EDIT");
		CoveragesAppliedtoallvehicles("VERIFY");
		AdditionalCoverages("EDIT");
		ExclusionsAndConditions("EDIT");
		SearchAddExclusionorCondition("EDIT");

	}

	@Override
	public void CoveragesAppliedtoallvehicles(String testingType) throws Throwable {
		switch (testingType) {
		case "EDIT":
			// --------> selecting AutoLiabilityPackage
			GuidewireAutomate("PA Coverages Auto Liability Package", PA_Coverages_Auto_Liability_Package,
					"selectByVisibleText", lhm_TestCase_Table_Data.get("AutoLiabilityPackage"));
			// -------->selecting the Medical Limit
			GuidewireAutomate("Medical Limit", PA_Coverages_Medical_Limit, "selectByVisibleText",
					lhm_TestCase_Table_Data.get("MedicalLimit"));
			// selecting Underinsured Motorist - Property Damage Limit
			GuidewireAutomate("Underinsured Motorist Property Damage Limit",
					PA_Coverages_Underinsured_Motorist_Property_Damage_Limit, "selectByVisibleText",
					lhm_TestCase_Table_Data.get("UnderinsuredMotoristPropertyDamageLimit"));
		case "VERIFY":
			// -------->checking Liability Bodily Injury and Property Damage CheckBox is
			// disabled
			GuidewireAutomate_Validation("Liability Bodily Injury and Property Damage CheckBox",
					PA_Coverages_Liability_Bodily_Injury_and_Property_Damage_CheckBox, "isDisabled",
					lhm_TestCase_Table_Data.get(""));
			// -------->checking Medical Payments CheckBox CheckBox is checked
			GuidewireAutomate_Validation("Medical Payments CheckBox", PA_Coverages_Medical_Payments_CheckBox,
					"isChecked", lhm_TestCase_Table_Data.get(""));
			// -------->checking Uninsured Motorist Property Damage CheckBox is unchecked
			GuidewireAutomate_Validation("Uninsured Motorist Property Damage CheckBox",
					PA_Coverages_Uninsured_Motorist_Property_Damage_CheckBox, "isUnchecked",
					lhm_TestCase_Table_Data.get(""));
			break;
		default:
			break;
		}

	}

	@Override
	public void AdditionalCoverages(String testingType) throws Throwable {
		switch (testingType) {
		case "EDIT":
			// ------>clicking on Additional Coverages tab
			GuidewireAutomate("Additional Coverages tab", PA_Coverages_AdditionalCoveragesTab, "click", "");
			// ----->clicking on Rental Car Loss of Use CheckBox
			GuidewireAutomate("Rental Car Loss of Use CheckBox", PA_Coverages_Rental_Car_Loss_of_Use_CheckBox, "click",
					"");
			// ------>selecting Rental Car Loss of Use Limit
			GuidewireAutomate("Rental Car Loss of Use Limit", PA_Coverages_Rental_Car_Loss_of_Use_Limit,
					"selectByVisibleText", lhm_TestCase_Table_Data.get("RentalCarLossofUseLimit"));
		case "VERIFY":

		default:
			break;
		}
	}

	@Override
	public void ExclusionsAndConditions(String testingType) throws Throwable {
		switch (testingType) {
		case "EDIT":
			// ----->clicking on Exclusions and Conditions tab
			GuidewireAutomate("Exclusions and Conditions tab", PA_Coverages_ExclusionsAndConditionsCardTab, "click",
					"");

		default:
			break;
		}
	}

	@Override
	public void SearchAddExclusionorCondition(String testingType) throws Throwable {
		switch (testingType) {
		case "EDIT":
			// ----->clicking on Add Exclusion or Condition
			GuidewireAutomate("Add Exclusion or Condition", PA_Coverages_Add_Exclusion_or_Condition, "click", "");
			// ------>selecting PA_Category
			GuidewireAutomate("PA_Category", PA_Coverages_Category, "selectByVisibleText",
					lhm_TestCase_Table_Data.get("Category"));
			// ----->clicking on search button
			GuidewireAutomate("search button", PA_Coverages_SearchButton, "click", "");
			// ------>clicking on Coverage Checkbox
			GuidewireAutomate("Coverage Checkbox", PA_Coverages_Coverage_CheckBox, "click", "");
			// ----->clicking on Add Selected Exclusions And Conditions button
			GuidewireAutomate("Add Selected Exclusions And Conditions button",
					PA_Coverages_Add_Selected_Exclusions_And_Conditions_button, "click", "");

		case "VERIFY":
			// ------->Verifying Search Exclusions And Conditions for Personal Auto Line
			GuidewireAutomate_Validation("Search Exclusions And Conditions for Personal Auto Line title",
					PA_Coverages_Search_Exclusions_And_Conditions_for_Personal_Auto_Line_titlebar, "equals",
					"Search Exclusions And Conditions for Personal Auto Line");
		default:
			break;
		}
	}

}
