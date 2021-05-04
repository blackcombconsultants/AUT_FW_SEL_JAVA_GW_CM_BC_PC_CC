package com.pages.Guidewire.PersonalAuto;

import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Resuables_PO;

public class PersonalAuto_Coverages extends SeleniumWebDriver_Commands implements PersonalAuto_Coverages_PO {

	Selenium_Utils_DataBase oDB = new Selenium_Utils_DataBase();

	public PersonalAuto_Coverages(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	
	public static void pa_Coverages() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("paCoverages", strTestCaseName);
		coveragesAppliedtoallVehiclesIn("EDIT");
		coveragesAppliedperVehiclesIn("VERIFY");
		additionalcoveragesAppliedtoallVehiclesIn("EDIT");
		additionalcoveragesAppliedperVehiclesIn("EDIT");
		exclusionsAndConditions();
		SearchAddExclusionorCondition();

	}

	
	public static void coveragesAppliedtoallVehiclesIn(String testingType) throws Throwable {

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("paCoverages", strTestCaseName);

		GuidewireAutomate_Validation("Screen_Header", PolicyCenter_Resuables_PO.Screen_Header, "equals",
				"PA Coverages");

		GuidewireAutomate("Coverages tab", PACoverages_CoveragesTab, "click", "");

		GuidewireAutomate_Validation("Coverages applied to all vehicles", PAC_CT_CoveragesAppliedtoAllVehicles,
				"contains", "Coverages applied to all vehicles");

		switch (testingType) {

		case "EDIT":

		case "VERIFY":
			// -------->checking Liability Bodily Injury and Property Damage CheckBox is
			// disabled
			GuidewireAutomate_Validation("Liability Bodily Injury and Property Damage CheckBox",
					PAC_CT_CATAV_Liability_Bodily_Injury_and_Property_Damage, "isDisabled",
					lhm_TestCase_Table_Data.get("PAC_CT_CATAV_Liability_BodilyInjuryPropertyDamage"));
			GuidewireAutomate_Validation("AutoLiabilityPackage", PAC_CT_CATAV_LBIPD_AutoLiabilityPackage,
					"FirstSelectedOptionEquals",
					lhm_TestCase_Table_Data.get("PAC_CT_CATAV_LBIPD_AutoLiabilityPackage"));

			// -------->checking Medical Payments CheckBox CheckBox is checked
			GuidewireAutomate_Validation("Medical Payments CheckBox", PAC_CT_CATAV_MedicalPayments, "isSelected",
					lhm_TestCase_Table_Data.get("PAC_CT_CATAV_MedicalPayments"));
			GuidewireAutomate_Validation("AutoLiabilityPackage", PAC_CT_CATAV_MP_MedicalLimit,
					"FirstSelectedOptionEquals", lhm_TestCase_Table_Data.get("PAC_CT_CATAV_MP_MedicalLimit"));

			break;
		default:
			break;
		}

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	
	public static void coveragesAppliedperVehiclesIn(String testingType) throws Throwable {

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("paCoverages", strTestCaseName);

		GuidewireAutomate_Validation("Screen_Header", PolicyCenter_Resuables_PO.Screen_Header, "equals",
				"PA Coverages");

		GuidewireAutomate("Coverages tab", PACoverages_CoveragesTab, "click", "");

		GuidewireAutomate_Validation("Coverages applied per vehicle in", PAC_CT_CoveragesAppliedPerVehicleIn,
				"contains", "Coverages applied per vehicle in");

		switch (testingType) {

		case "EDIT":
			GuidewireAutomate("Comprehensive", PAC_CT_CAPV_Comprehensive, "click",
					lhm_TestCase_Table_Data.get("PAC_CT_CAPV_Comprehensive"));
			GuidewireAutomate("Comprehensive Deductible", PAC_CT_CAPV_C_ComprehensiveDeductible, "selectByVisibleText",
					lhm_TestCase_Table_Data.get("PAC_CT_CAPV_C_ComprehensiveDeductible"));

		case "VERIFY":
			GuidewireAutomate_Validation("Comprehensive", PAC_CT_CAPV_Comprehensive, "isSelected",
					lhm_TestCase_Table_Data.get("PAC_CT_CAPV_Comprehensive"));
			GuidewireAutomate_Validation("Comprehensive Deductible", PAC_CT_CAPV_C_ComprehensiveDeductible, "FirstSelectedOptionEquals",
					lhm_TestCase_Table_Data.get("PAC_CT_CAPV_C_ComprehensiveDeductible"));
			break;
		default:
			break;
		}

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	
	public static void additionalcoveragesAppliedtoallVehiclesIn(String testingType) throws Throwable {

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("paCoverages", strTestCaseName);

		GuidewireAutomate("Additional Coverages tab", PACoverages_AdditionalCoveragesTab, "click", "");

		GuidewireAutomate_Validation("Coverages applied to all vehicles", PAC_ACT_CoveragesAppliedtoAllVehicles,
				"contains", "Coverages applied to all vehicles");

		switch (testingType) {
		case "EDIT":

			// ------>clicking on Additional Coverages tab
			if (lhm_TestCase_Table_Data.get("PAC_ACT_CATAV_Rental_Car_Loss_of_Use")
					.equalsIgnoreCase("Rental Car Loss of Use")) {
				GuidewireAutomate("Rental Car Loss of Use", PAC_ACT_CATAV_Rental_Car_Loss_of_Use, "click",
						lhm_TestCase_Table_Data.get("PAC_ACT_CATAV_Rental_Car_Loss_of_Use"));
				GuidewireAutomate("Rental Car Loss of Use Limit", PAC_ACT_CATAV_RCL_Rental_Car_Loss_of_Use_Limit,
						"selectByVisibleText",
						lhm_TestCase_Table_Data.get("PAC_ACT_CATAV_RCL_Rental_Car_Loss_of_Use_Limit"));
			}

		case "VERIFY":

		default:
			break;
		}

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	
	public static void additionalcoveragesAppliedperVehiclesIn(String testingType) throws Throwable {

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("paCoverages", strTestCaseName);

		GuidewireAutomate("Additional Coverages tab", PACoverages_AdditionalCoveragesTab, "click", "");

		GuidewireAutomate_Validation("Coverages applied per vehicle in", PAC_ACT_CoveragesAppliedPerVehicleIn,
				"contains", "Coverages applied per vehicle in");

		switch (testingType) {
		case "EDIT":

			// ------>clicking on Additional Coverages tab
			if (lhm_TestCase_Table_Data.get("PAC_ACT_CAPV_ElectronicEquipment")
					.equalsIgnoreCase("Electronic Equipment")) {
				GuidewireAutomate("Electronic Equipment", PAC_ACT_CAPV_ElectronicEquipment, "click",
						lhm_TestCase_Table_Data.get("PAC_ACT_CAPV_ElectronicEquipment"));
				GuidewireAutomate("Increased Limit", PAC_ACT_CAPV_EE_IncreasedLimit, "selectByVisibleText",
						lhm_TestCase_Table_Data.get("PAC_ACT_CAPV_EE_IncreasedLimit"));
			}

		case "VERIFY":

		default:
			break;
		}

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	
	public static void exclusionsAndConditions() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("paCoverages", strTestCaseName);

		GuidewireAutomate("ExclusionsAndConditionsCardTab", PACoverages_ExclusionsAndConditionsCardTab, "click", "");
		GuidewireAutomate("AddExclusionCondition", PAC_ECT_AddExclusionCondition, "click", "");

		SearchAddExclusionorCondition();

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	
	public static void SearchAddExclusionorCondition() throws Throwable {
		// ------->Verifying Search Exclusions And Conditions for Personal Auto Line
		GuidewireAutomate_Validation("Search Exclusions And Conditions for Personal Auto Line title",
				PAC_ECT_Search_Exclusions_And_Conditions_for_Personal_Auto_Line_titlebar, "equals",
				"Search Exclusions And Conditions for Personal Auto Line");
		GuidewireAutomate("Category", PAC_ECT_SEC_PAL_Category, "selectByVisibleText",
				lhm_TestCase_Table_Data.get("PAC_ECT_SEC_PAL_Category"));
		GuidewireAutomate("Keyword", PAC_ECT_SEC_PAL_Keyword, "clearANDsendKeys",
				lhm_TestCase_Table_Data.get("PAC_ECT_SEC_PAL_Keyword"));
		// ----->clicking on search button
		GuidewireAutomate("Type_ExclusionandCondition", PAC_ECT_SEC_PAL_Type_ExclusionandCondition, "click", "");
		GuidewireAutomate("SearchButton", PAC_ECT_SEC_PAL_SearchButton, "click", "");
		// ------>clicking on Coverage Checkbox
		GuidewireAutomate("Coverage Checkbox", PAC_ECT_SEC_PAL_SearchResult_Select, "click", "");
		// ----->clicking on Add Selected Exclusions And Conditions button
		GuidewireAutomate("Add Selected Exclusions And Conditions button",
				PAC_ECT_SEC_PAL_AddSelectedExclusionsAndConditions_button, "click", "");
	}

}
