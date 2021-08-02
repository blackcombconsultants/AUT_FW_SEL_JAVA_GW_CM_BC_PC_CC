package com.pages.Guidewire.ClaimsCenter;

import java.util.LinkedHashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.pages.Guidewire.Tab_Menu_Navigation;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Resuables_PO;

public class CC_NewClaimWizard extends SeleniumWebDriver_Commands implements CC_NewClaimWizard_PO {
	LinkedHashMap<String, String> lhm_Data;

	public CC_NewClaimWizard(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
		// TODO Auto-generated constructor stub
	}

	public static void ncw_SearchorCreatePolicy_FindPolicy_Search() throws Throwable {

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("ncwStep1", strTestCaseName);

		strPolicyNumber = null;
		strPolicyNumber = lhm_TestCase_Table_Data.get("SCP_PolicyNumber");

		// ------> Verifying the page -
		GuidewireAutomate_Validation("Screen Header", NCW_SearchorCreatePolicy_Header, "equals", "Step 1 of 5: Search or Create Policy");

		GuidewireAutomate("Find Policy", SCP_FindPolicy, "click", "click");

		GuidewireAutomate("Policy Number", SCP_FP_PolicyNumber, "clearANDsendKeys", strPolicyNumber);
		GuidewireAutomate("First Name", SCP_FP_FirstName, "clearANDsendKeys", lhm_TestCase_Table_Data.get("SCP_FP_FirstName"));
		GuidewireAutomate("Last Name", SCP_FP_LastName, "clearANDsendKeys", lhm_TestCase_Table_Data.get("SCP_FP_LastName"));
		GuidewireAutomate("Organization Name", SCP_FP_OrganizationName, "clearANDsendKeys", lhm_TestCase_Table_Data.get("SCP_FP_OrganizationName"));
		GuidewireAutomate("Policy Type", SCP_FP_PolicyType, "clearANDsendKeys", lhm_TestCase_Table_Data.get("SCP_FP_PolicyType"));

		// ----->Verify Policy should be retrieved and displayed.
		GuidewireAutomate("Search", SP_FP_Search, "click", "click");

		GuidewireAutomate_Validation("Policy", SCP_FP_PR_Policy, "equals", strPolicyNumber);
		GuidewireAutomate_Validation("Insured", SCP_FP_PR_Insured, "equals", lhm_TestCase_Table_Data.get("SCP_FP_PR_Insured"));
		GuidewireAutomate_Validation("EffectiveDate", SCP_FP_PR_EffectiveDate, "fetch", lhm_TestCase_Table_Data.get("SCP_FP_PR_EffectiveDate"));
		GuidewireAutomate_Validation("ExpirationDate", SCP_FP_PR_ExpirationDate, "fetch", lhm_TestCase_Table_Data.get("SCP_FP_PR_ExpirationDate"));
		GuidewireAutomate_Validation("Type", SCP_FP_PR_Type, "equals", lhm_TestCase_Table_Data.get("SCP_FP_PR_Type"));

		oExtentTest.log(Status.INFO, "Search PolicyNumber = [" + strPolicyNumber + "] is succesful");

	}

	public static void ncw_SearchorCreatePolicy_FindPolicy_NewClaim() throws Throwable {

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("ncwStep1", strTestCaseName);

		GuidewireAutomate_Validation("New Claim", SCP_NewClaim, "equals", "New Claim");

		GuidewireAutomate("LossDate", SCP_NC_LossDate, "clearANDsendKeys", lhm_TestCase_Table_Data.get("SCP_NC_LossDate"));
		GuidewireAutomate("Time", SCP_NC_Time, "clearANDsendKeys", lhm_TestCase_Table_Data.get("SCP_NC_Time"));

		String strSCP_NC_TypeofClaim = lhm_TestCase_Table_Data.get("SCP_TypeOfClaim");
		By     SCP_NC_TypeofClaim    = By.xpath("//span[@class='gw-label--inner' and text()='" + strSCP_NC_TypeofClaim + "']/preceding-sibling::span[@class='gw-radio-wrapper']//input[contains(@name,'ClaimMode')]");
		GuidewireAutomate("TypeofClaim = " + strSCP_NC_TypeofClaim, SCP_NC_TypeofClaim, "click", "click");

		oExtentTest.log(Status.INFO, "New Claim Type = [" + strSCP_NC_TypeofClaim + "] selection is succesful");

	}

	public static void ncw_SearchorCreatePolicy_FindPolicy_ClaimsHistory() throws Throwable {

		/*
		 * <All fields should be added> <20-july-2021> <Akula Srikanh>
		 */

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("ncwStep1", strTestCaseName);

		GuidewireAutomate_Validation("Claims History", SCP_ClaimsHistory, "equals", "Claims History");

	}

	public static void ncw_SearchorCreatePolicy_CreateUnverifiedPolicy() throws Throwable {

		strPolicyNumber = null;
		strPolicyNumber = lhm_TestCase_Table_Data.get("SCP_PolicyNumber");
		String strTypeOfClaim = lhm_TestCase_Table_Data.get("SCP_TypeOfClaim");

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("ncwStep1", strTestCaseName);
		// ------> Verifying the page -
		GuidewireAutomate_Validation("Screen Header", NCW_SearchorCreatePolicy_Header, "equals", "Step 1 of 5: Search or Create Policy");

		GuidewireAutomate("Create Unverified Policy", CreateUnverifiedPolicy, "click", "click");
		GuidewireAutomate("Policy Number", CUP_PolicyNumber, "clearANDsendKeys", strPolicyNumber);
		GuidewireAutomate("Type", CUP_Type, "selectByVisibleText", lhm_TestCase_Table_Data.get("Type"));

		By TypeOfClaim = By.xpath("//span[@class='gw-label--inner' and text()='" + strTypeOfClaim + "']/preceding-sibling::span[@class='gw-radio-wrapper']//input[contains(@name,'ClaimLossType')]");
		GuidewireAutomate("Type Of Claim = " + strTypeOfClaim, TypeOfClaim, "click", "click");

		GuidewireAutomate("Loss Date", CUP_LossDate, "clearANDsendKeys", lhm_TestCase_Table_Data.get("LossDate"));
		GuidewireAutomate("Time", CUP_Time, "clearANDsendKeys", lhm_TestCase_Table_Data.get("LossDate"));

	}

	public static void ncw_CreateUnverifiedPolicy_BasicInformation() throws Throwable {

		strPolicyNumber = null;
		strPolicyNumber = lhm_TestCase_Table_Data.get("SCP_PolicyNumber");

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("CUPstep1", strTestCaseName);

		GuidewireAutomate_Validation("Basic Information", CUP_BasicInformation, "equals", "Basic Information");

		GuidewireAutomate_Validation("Policy Number", NCW_SearchorCreatePolicy_Header, "equals", strPolicyNumber);
		GuidewireAutomate_Validation("Type", NCW_SearchorCreatePolicy_Header, "equals", lhm_TestCase_Table_Data.get("Type"));
		GuidewireAutomate("Effective Date", CUP_BI_EffectiveDate, "clearANDsendKeys", lhm_TestCase_Table_Data.get("Type"));
		GuidewireAutomate("Expiration Date", CUP_BI_ExpirationDate, "clearANDsendKeys", lhm_TestCase_Table_Data.get("ExpirationDate"));
		GuidewireAutomate("Cancellation Date", CUP_BI_ExpirationDate, "clearANDsendKeys", lhm_TestCase_Table_Data.get("CancellationDate"));
		GuidewireAutomate("Original Effective Date", CUP_BI_ExpirationDate, "clearANDsendKeys", lhm_TestCase_Table_Data.get("OriginalEffectiveDate"));
		GuidewireAutomate("Status", CUP_BI_ExpirationDate, "selectByVisibleText", lhm_TestCase_Table_Data.get("Status"));

	}

	public static void ncw_CreateUnverifiedPolicy_Insured_Search() throws Throwable {

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("CUPstep1", strTestCaseName);

		GuidewireAutomate("Insured Select", CUP_Insured_SelectMenu_Button, "click", "click");
		GuidewireAutomate("Search", CUP_Insured_Menu_Search, "clickAndwait", "click");
		GuidewireAutomate_Validation("Screen Header", PolicyCenter_Resuables_PO.Screen_Header, "equals", "Search Address Book");

		GuidewireAutomate("LastName", NP_P_LastName, "clearANDsendKeys", lhm_TestCase_Table_Data.get("LastName"));
		GuidewireAutomate("TaxID", NP_P_TaxID, "clearANDsendKeys", lhm_TestCase_Table_Data.get("TaxID"));
		GuidewireAutomate("Address1", NP_Address1, "clearANDsendKeys", lhm_TestCase_Table_Data.get("Address1"));

	}
	public static void ncw_CreateUnverifiedPolicy_Insured_NewPerson() throws Throwable {

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("CUPstep1", strTestCaseName);

		GuidewireAutomate("Insured Select", CUP_Insured_SelectMenu_Button, "click", "click");
		GuidewireAutomate("New Person", CUP_Insured_Menu_NewPerson, "click", "click");
		GuidewireAutomate_Validation("Screen Header", PolicyCenter_Resuables_PO.Screen_Header, "equals", "New Person");

		GuidewireAutomate_Validation("Section", PolicyCenter_Resuables_PO.Screen_Header, "equals", "This contact is not linked to the Address Book");

		GuidewireAutomate_Validation("Section", PolicyCenter_Resuables_PO.Screen_Header, "equals", "Person");
		GuidewireAutomate("LastName", NP_P_LastName, "clearANDsendKeys", lhm_TestCase_Table_Data.get("LastName"));
		GuidewireAutomate("TaxID", NP_P_TaxID, "clearANDsendKeys", lhm_TestCase_Table_Data.get("TaxID"));

	}

	public static void fnol_Search_UnverifiedPolicy_AddVehicle() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("SearchPolicy", strTestCaseName);

		try {
			GuidewireAutomate("AddVehicle", CUP_ANV_AddVehicle, "click", "NA");

		} catch (WebDriverException e) {
			GuidewireAutomate("AddVehicle", CUP_ANV_AddVehicle, "click", "NA");

		}

		GuidewireAutomate_Validation("Screen Header", SP_NewVehicle, "equals", "New Vehicle");
		GuidewireAutomate("Make", CUP_ANV_Make, "clearANDsendKeys", lhm_TestCase_Table_Data.get("Make"));
		GuidewireAutomate("Model", CUP_ANV_Model, "clearANDsendKeys", lhm_TestCase_Table_Data.get("Model"));
		GuidewireAutomate("Year", CUP_ANV_Year, "clearANDsendKeys", lhm_TestCase_Table_Data.get("Year"));

		try {
			GuidewireAutomate("AddCoverages", CUP_ANV_AddCoverages, "click", "NA");
		} catch (WebDriverException e) {
			GuidewireAutomate("AddCoverages", CUP_ANV_AddCoverages, "click", "NA");

		}
		GuidewireAutomate("CoverageType", CUP_ANV_CoverageType, "selectByVisibleText", lhm_TestCase_Table_Data.get("CoverageType"));
		GuidewireAutomate("ExposureLimit", CUP_ANV_ExposureLimit, "clearANDsendKeys", lhm_TestCase_Table_Data.get("ExposureLimit"));
		GuidewireAutomate("IncidentLimit", CUP_ANV_IncidentLimit, "clearANDsendKeys", lhm_TestCase_Table_Data.get("IncidentLimit"));
		GuidewireAutomate("Ok", Ok, "click", "NA");
	}

	public static void basicInfo() throws Throwable {

		String insuredName = ClaimCenter_Resuables.infoBar("InsuredName");
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("basicInfo", strTestCaseName);
		GuidewireAutomate_Validation("Screen Header", basicInfo_Header, "equals", "Step 2 of 5: Basic information");

		GuidewireAutomate("Name", BI_RB_Name, "selectByVisibleText", insuredName);

	}

	public static void basicInfoAssignClaim() throws Throwable {

		String insuredName = ClaimCenter_Resuables.infoBar("InsuredName");
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("basicInfo", strTestCaseName);
		GuidewireAutomate_Validation("Screen Header", basicInfo_Header, "equals", "Step 2 of 5: Basic information");
		GuidewireAutomate("Name", BI_RB_Name, "selectByVisibleText", insuredName);
		GuidewireAutomate("Insred Vehicle", BI_IV, "click", " ");

	}

	public static void addClaimInfo() throws Throwable {

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("addClaimInfo", strTestCaseName);

		GuidewireAutomate_Validation("addClaimInfoScreen", addClaimInfo_Header, "equals", "Step 3 of 5: Add claim information");
		GuidewireAutomate("WhatHappened", ADI_WhatHappened, "clearANDsendKeys", lhm_TestCase_Table_Data.get("WhatHappened"));
		GuidewireAutomate("losscause", ADI_LossCause, "selectByVisibleText", lhm_TestCase_Table_Data.get("LossCause"));
		GuidewireAutomate("location", ADI_location, "selectByVisibleText", lhm_TestCase_Table_Data.get("Location"));
		GuidewireAutomate("Address1", ADI_Address1, "clearANDsendKeys", lhm_TestCase_Table_Data.get("Address1"));
		GuidewireAutomate("State", ADI_State, "selectByVisibleText", lhm_TestCase_Table_Data.get("State"));
		GuidewireAutomate_Validation("Screen Header", ClaimCenter_Resuables_PO.DuplicateClaims_Header, "equals", "Possible Duplicate Claims");
		GuidewireAutomate_Validation("ErrorMsg", DuplicateClaims_ErrorMsg, "contains", "Possible duplicate claims found");
		GuidewireAutomate("DuplicateClaims_Close", DuplicateClaims_Close, "click", "NA");

		// _---->Add the address1 script 09-07-2021 dinesh
	}

	public static void services() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("services", strTestCaseName);
		GuidewireAutomate_Validation("Screen Header", services_Header, "equals", "Step 4 of 5: Services");
		// String strDynamicXpath = lhm_TestCase_Table_Data.get("Rental");
		// By services_Rental = By.xpath("//div[contains(text(),'" +
		// strDynamicXpath+
		// "')]/preceding-sibling::div[contains(@id,'RentalInputGroup-_checkbox')]");
		// GuidewireAutomate("services Rental", services_Rental, "clickAndwait",
		// "NA");
		// GuidewireAutomate("Rental BeginDate", SR_RentalBeginDate,
		// "clearANDsendKeys", lhm_TestCase_Table_Data.get("RentalBeginDate"));
		// GuidewireAutomate("Rental EndDate", SR_RentalEndDate,
		// "clearANDsendKeys", lhm_TestCase_Table_Data.get("RentalEndDate"));
		// GuidewireAutomate("Rental DailyRate", SR_RentalDailyRate,
		// "clearANDsendKeys", lhm_TestCase_Table_Data.get("RentalDailyRate"));
		// GuidewireAutomate("Rental Agency", SR_RentalAgency,
		// "selectByVisibleText", lhm_TestCase_Table_Data.get("RentalAgency"));
		// GuidewireAutomate("Pick upLocation", SR_PickupLocation,
		// "selectByVisibleTextAndwait",
		// lhm_TestCase_Table_Data.get("PickupLocation"));
		//
	}

	public static void saveandAssign() throws Throwable {
		// ---->Add script to Select a user 09-07-2021 dinesh
		GuidewireAutomate_Validation("Screen Header", saveandassign_Header, "equals", "Step 5 of 5: Save and Assign Claim");

	}

	public static void newClaimSaved() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("newClaimSaved", strTestCaseName);
		GuidewireAutomate_Validation("Screen Header", newClaimSaved_Header, "equals", "New Claim Saved");

		String strDynamicXpath                        = lhm_TestCase_Table_Data.get("NewClaimSaved");
		By     View_the_newly_saved_claim             = By.xpath("//div[contains(text(),'" + strDynamicXpath + "')]");
		By     Create_another_new_claim               = By.xpath("//div[contains(text(),'" + strDynamicXpath + "')]");
		By     Add_Reserves_to_the_newly_saved_claim  = By.xpath("//div[contains(text(),'" + strDynamicXpath + "')]");
		By     Make_Payments_on_the_newly_saved_claim = By.xpath("//div[contains(text(),'" + strDynamicXpath + "')]");

		GuidewireAutomate("View the newly saved claim", View_the_newly_saved_claim, "clickAndwait", "NA");

	}

	public static void assignClaimProcess(String strTemp, String ClaimType) throws Throwable {

		Tab_Menu_Navigation.ccTabNavigation("New Claim", "NA");

		switch (ClaimType) {
			case "VerifiedPolicy_AssignClaimAuto" :

				break;

			case "Auto" :

				break;
			case "AutoFirstandFinal" :

				break;
			case "QuickClaimAuto" :

				break;

		}
	}

}
