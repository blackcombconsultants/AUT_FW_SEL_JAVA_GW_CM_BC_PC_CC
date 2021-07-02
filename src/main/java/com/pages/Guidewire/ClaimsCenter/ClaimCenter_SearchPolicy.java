package com.pages.Guidewire.ClaimsCenter;

import java.util.LinkedHashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;

public class ClaimCenter_SearchPolicy extends SeleniumWebDriver_Commands implements ClaimCenter_SearchPolicy_PO {
	LinkedHashMap<String, String> lhm_Data;

	public ClaimCenter_SearchPolicy(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
		// TODO Auto-generated constructor stub
	}

	public static void fnol_Search_Exitsing_Policy() throws Throwable {

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("SearchPolicy", strTestCaseName);
		// ------> Verifying the page -
		GuidewireAutomate_Validation("Screen Header", SP_Header, "contains", "Search or Create Policy");
		GuidewireAutomate("Policy Number", SP_FP_PolicyNumber, "clearANDsendKeys", lhm_TestCase_Table_Data.get("PolicyNumber"));
		GuidewireAutomate("Search", SP_FP_Search, "click", "");
		GuidewireAutomate("LossDate", SP_FP_LossDate, "clearANDsendKeys", lhm_TestCase_Table_Data.get("LossDate"));

		String strDynamicXpath = lhm_TestCase_Table_Data.get("TypeofClaim");
		By     TypeOfClaim     = By.xpath("//span[@class='gw-label--inner' and text()='" + strDynamicXpath + "']/preceding-sibling::span[@class='gw-radio-wrapper']//input[contains(@name,'ClaimMode')]");

		if (lhm_TestCase_Table_Data.get("TypeofClaim").equalsIgnoreCase("Auto")) {
			GuidewireAutomate("Type of Claim", TypeOfClaim, "click", "");

		} else if (lhm_TestCase_Table_Data.get("TypeofClaim").equalsIgnoreCase("Auto - Auto First and Final")) {
			GuidewireAutomate("TypeofClaim", TypeOfClaim, "click", "");

		} else if (lhm_TestCase_Table_Data.get("TypeofClaim").equalsIgnoreCase("Auto - Quick Claim Auto")) {
			GuidewireAutomate("TypeofClaim", TypeOfClaim, "click", "");

		}

	}

	public static void fnol_Search_UnverifiedPolicy() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("SearchPolicy", strTestCaseName);
		// ------> Verifying the page -
		GuidewireAutomate_Validation("Screen Header", SP_Header, "equals", "Step 1: Search or Create Policy");
		GuidewireAutomate("CreateUnverifiedPolicy", CreateUnverifiedPolicy, "click", "NA");
		GuidewireAutomate("PolicyNumber", CUP_PolicyNumber, "clearANDsendKeys", lhm_TestCase_Table_Data.get("PolicyNumber"));
		GuidewireAutomate("Type", CUP_Type, "selectByVisibleText", lhm_TestCase_Table_Data.get("Type"));

		String strDynamicXpath = lhm_TestCase_Table_Data.get("TypeofClaim");

		By TypeOfClaim = By.xpath("//span[@class='gw-label--inner' and text()='" + strDynamicXpath + "']/preceding-sibling::span[@class='gw-radio-wrapper']//input[contains(@name,'ClaimLossType')]");

		if (strDynamicXpath.equalsIgnoreCase("Auto")) {	
			GuidewireAutomate("TypeOfClaim", TypeOfClaim, "click", "NA");
			GuidewireAutomate("Auto_AutoFirstandFinal", CUP_TypeofClaim_Auto_AutoFirstandFinal, "click", "NA");
			try {
				GuidewireAutomate("TypeOfClaim", TypeOfClaim, "click", "NA");
			} catch (StaleElementReferenceException e) {
				GuidewireAutomate("TypeOfClaim", TypeOfClaim, "click", "NA");

			}
		} else if (strDynamicXpath.equalsIgnoreCase("Auto - Auto First and Final")) {
			GuidewireAutomate("TypeOfClaim", TypeOfClaim, "click", "NA");
			fnol_Search_UnverifiedPolicy_AddVehicle();

		} else if (strDynamicXpath.equalsIgnoreCase("Auto - Quick Claim Auto")) {
			GuidewireAutomate("TypeOfClaim", TypeOfClaim, "click", "NA");

		}
		try {
			GuidewireAutomate("LossDate", CUP_LossDate, "clearANDsendKeys", lhm_TestCase_Table_Data.get("LossDate"));
		} catch (WebDriverException e) {
			GuidewireAutomate("LossDate", CUP_LossDate, "clearANDsendKeys", lhm_TestCase_Table_Data.get("LossDate"));

		}
		GuidewireAutomate("ExpirationDate", CUP_BI_EffectiveDate, "clearANDsendKeys", lhm_TestCase_Table_Data.get("EffectiveDate"));
		GuidewireAutomate("ExpirationDate", CUP_BI_ExpirationDate, "clearANDsendKeys", lhm_TestCase_Table_Data.get("ExpirationDate"));

		SearchPolicy_InsuredName();

	}

	public static void SearchPolicy_InsuredName() throws Throwable {
		try {
			GuidewireAutomate("Insured Name", CUP_Insured_Name, "click", "");
		} catch (WebDriverException e) {
			GuidewireAutomate("Insured Name", CUP_Insured_Name, "clickAndwait", "");
		}
		GuidewireAutomate("New Person", CUP_Insured_NewPerson, "click", "");
		GuidewireAutomate("LastName", CUP_Insured_NewPerson_LastName, "clearANDsendKeys", lhm_TestCase_Table_Data.get("LastName"));
		GuidewireAutomate("TaxID", CUP_Insured_NewPerson_TaxID, "clearANDsendKeys", lhm_TestCase_Table_Data.get("TaxID"));
		GuidewireAutomate("Address1", CUP_Insured_NewPerson_Address1, "clearANDsendKeys", lhm_TestCase_Table_Data.get("Address1"));
		GuidewireAutomate("City", CUP_Insured_NewPerson_City, "clearANDsendKeys", lhm_TestCase_Table_Data.get("City"));
		GuidewireAutomate("County", CUP_Insured_NewPerson_County, "clearANDsendKeys", lhm_TestCase_Table_Data.get("County"));
		GuidewireAutomate("State", CUP_Insured_NewPerson_State, "selectByVisibleText", lhm_TestCase_Table_Data.get("State"));
		GuidewireAutomate("ZIPCode", CUP_Insured_NewPerson_ZIPCode, "clearANDsendKeys", lhm_TestCase_Table_Data.get("ZIPCode"));
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

}
