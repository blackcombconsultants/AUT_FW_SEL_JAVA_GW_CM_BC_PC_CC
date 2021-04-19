package com.pages.Guidewire.PersonalAuto;

import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;

public class PersonalAuto_Drivers extends SeleniumWebDriver_Commands implements PersonalAuto_Drivers_PO {
	Selenium_Utils_DataBase oDB = new Selenium_Utils_DataBase();

	public PersonalAuto_Drivers(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	@Override
	public void driver_Add_NewPerson() throws Throwable {
		// TODO Auto-generated method stub
		// GuidewireAutomate("Organization Name", OS_OrganizationName, "sendkeys",
		// lhm_Data.get("TD_OrganizationName"));

	}

	@Override
	public void driver_Add_FromAddressBook() throws Throwable {
		// TODO Auto-generated method stub

	}

	@Override
	public void driver_Add_ExistingDriver() throws Throwable {
		lhm_TestCase_Table_Data = oDB.getData_MSExcel_WorkSheet_Fillo("policyInfo", strTestCaseName);

		GuidewireAutomate_Validation("Drivers Header", Drivers_Header, "equals", "Drivers");
		GuidewireAutomate("Add", DR_DriversDetails_Add_Button, "click", "NA");
		GuidewireAutomate("Existing Driver", DR_DriversDetails_Add_ExistingDriver, "moveToElement", "NA");
		GuidewireAutomate("Existing Driver Name", DR_DriversDetails_Add_ExistingDriver_Name, "click", "NA");
		driver_RetrieveMVR();
		driver_ContatDetails("Verify");
		driver_Roles("Edit");
		driver_Addresses("Verify");
		driver_MotorVehicleRecord("Verify");

	}

	@Override
	public void driver_Remove() throws Throwable {
		// TODO Auto-generated method stub

	}

	@Override
	public void driver_RetrieveMVR() throws Throwable {
		GuidewireAutomate("Driver Name", DR_DriversDetails_Name, "click", "NA");
		GuidewireAutomate("Driver Select", DR_DriversDetails_Select, "click", "NA");
		GuidewireAutomate("RetrieveMVR", DR_DriversDetails_RetrieveMVR_Button, "click", "NA");

	}

	@Override
	public void driver_Edit_ExistingDriver() throws Throwable {
		// TODO Auto-generated method stub

	}

	@Override
	public void driver_ContatDetails(String TestingType) throws Throwable {
		GuidewireAutomate("Contat Details", DR_Tab_ContatDetails, "click", "NA");

		switch (TestingType) {
		case "VERIFY":
			GuidewireAutomate_Validation("First name", DR_ContactDetails_FirstName, "equals",
					lhm_TestCase_Table_Data.get("DR_FirstName"));
			GuidewireAutomate_Validation("Last name", DR_ContactDetails_LastName, "equals",
					lhm_TestCase_Table_Data.get("DR_LastName"));

			GuidewireAutomate_Validation("Address1", DR_ContactDetails_Address1, "equals",
					lhm_TestCase_Table_Data.get("DR_Address1"));

			GuidewireAutomate_Validation("License", DR_ContactDetails_License, "equals",
					lhm_TestCase_Table_Data.get("DR_License"));

			break;
		case "EDIT":
			GuidewireAutomate("First name", DR_ContactDetails_FirstName, "sendkeys",
					lhm_TestCase_Table_Data.get("DR_FirstName"));
			GuidewireAutomate("Last name", DR_ContactDetails_LastName, "sendkeys",
					lhm_TestCase_Table_Data.get("DR_LastName"));
			GuidewireAutomate("Address1", DR_ContactDetails_Address1, "sendkeys",
					lhm_TestCase_Table_Data.get("DR_Address1"));
			GuidewireAutomate("License", DR_ContactDetails_License, "sendkeys",
					lhm_TestCase_Table_Data.get("DR_License"));

			break;
		default:
			break;
		}

	}

	@Override
	public void driver_Roles(String TestingType) throws Throwable {
		
		GuidewireAutomate("Contat Details", DR_Tab_Roles, "click", "NA");

		switch (TestingType) {
		case "VERIFY":

			break;
		case "EDIT":
			GuidewireAutomate("First name", DR_Role_DateCompletedTrainingClass, "sendkeys",
					lhm_TestCase_Table_Data.get("DR_Role_DateCompletedTrainingClass"));
			GuidewireAutomate("Last name", DR_Role_YearFirstLicensed, "sendkeys",
					lhm_TestCase_Table_Data.get("DR_Role_YearFirstLicensed"));

			GuidewireAutomate("NumberOfAccidents_PolicyLevel", DR_Role_AVSummary_NumberOfAccidents_PolicyLevel,
					"selectByVisibleText",
					lhm_TestCase_Table_Data.get("DR_Role_AVSummary_NumberOfAccidents_PolicyLevel"));
			GuidewireAutomate("NumberOfAccidents_AccountLevel", DR_Role_AVSummary_NumberOfAccidents_AccountLevel,
					"selectByVisibleText",
					lhm_TestCase_Table_Data.get("DR_Role_AVSummary_NumberOfAccidents_AccountLevel"));

			GuidewireAutomate("NumberOfViolations_PolicyLevel", DR_Role_AVSummary_NumberOfViolations_PolicyLevel,
					"selectByVisibleText",
					lhm_TestCase_Table_Data.get("DR_Role_AVSummary_NumberOfViolations_PolicyLevel"));
			GuidewireAutomate("NumberOfViolations_AccountLevel", DR_Role_AVSummary_NumberOfViolations_AccountLevel,
					"selectByVisibleText",
					lhm_TestCase_Table_Data.get("DR_Role_AVSummary_NumberOfViolations_AccountLevel"));

			break;
		default:
			break;
		}

	}

	@Override
	public void driver_Addresses(String TestingType) throws Throwable {
		GuidewireAutomate("Addresses", DR_Tab_Addresses, "click", "NA");
		switch (TestingType) {
		case "VERIFY":

			break;
		case "EDIT":

			break;
		default:
			break;
		}
	}

	@Override
	public void driver_MotorVehicleRecord(String TestingType) throws Throwable {
		GuidewireAutomate("Addresses", DR_Tab_MotorVehicleRecord, "click", "NA");
		switch (TestingType) {
		case "VERIFY":

			break;
		case "EDIT":

			break;
		default:
			break;
		}
	}

}
