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
		lhm_TestCase_Table_Data = oDB.getData_MSExcel_WorkSheet_Fillo("driver", strTestCaseName);

		GuidewireAutomate_Validation("Drivers Header", Drivers_Header, "equals", "Drivers");
		GuidewireAutomate("Add", DR_DriversDetails_Add_Button, "click", "NA");
		GuidewireAutomate("Existing Driver", DR_DriversDetails_Add_ExistingDriver, "moveToElement", "NA");
		GuidewireAutomate("Existing Driver Name", DR_DriversDetails_Add_ExistingDriver_Name, "click", "NA");
		driver_RetrieveMVR();
		driver_ContatDetails("Verify");
		driver_Roles("Edit");
		driver_Addresses("Verify");
		driver_MotorVehicleRecord("Verify");

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();

	}

	@Override
	public void driver_Remove() throws Throwable {
		lhm_TestCase_Table_Data = oDB.getData_MSExcel_WorkSheet_Fillo("driver", strTestCaseName);

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	@Override
	public void driver_RetrieveMVR() throws Throwable {

		lhm_TestCase_Table_Data = oDB.getData_MSExcel_WorkSheet_Fillo("driver", strTestCaseName);

		GuidewireAutomate("Driver Name", DR_DriversDetails_Name, "click", "NA");
		GuidewireAutomate("Driver Select", DR_DriversDetails_Select, "click", "NA");
		GuidewireAutomate("RetrieveMVR", DR_DriversDetails_RetrieveMVR_Button, "click", "NA");

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	@Override
	public void driver_Edit_ExistingDriver() throws Throwable {
		lhm_TestCase_Table_Data = oDB.getData_MSExcel_WorkSheet_Fillo("driver", strTestCaseName);

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	@Override
	public void driver_ContatDetails(String TestingType) throws Throwable {
		lhm_TestCase_Table_Data = oDB.getData_MSExcel_WorkSheet_Fillo("driver", strTestCaseName);

		GuidewireAutomate("Contat Details", DR_Tab_ContatDetails, "click", "NA");

		switch (TestingType) {
		case "VERIFY":

			GuidewireAutomate_Validation("Person", DR_CD_Person, "equals", "Person");
			GuidewireAutomate_Validation("First name", DR_CD_P_FirstName, "equals",
					lhm_TestCase_Table_Data.get("DR_CD_P_FirstName"));
			GuidewireAutomate_Validation("Last name", DR_CD_P_LastName, "equals",
					lhm_TestCase_Table_Data.get("DR_CD_P_LastName"));

			GuidewireAutomate_Validation("Address", DR_CD_Address, "equals", "Address");
			GuidewireAutomate_Validation("Address1", DR_CD_A_Address1, "equals",
					lhm_TestCase_Table_Data.get("DR_CD_A_Address1"));

			GuidewireAutomate_Validation("License", DR_CD_License, "equals",
					lhm_TestCase_Table_Data.get("DR_CD_License"));

			GuidewireAutomate_Validation("Official IDs", DR_CD_OfficialIDs, "equals", "Official IDs");
			GuidewireAutomate_Validation("SSN", DR_CD_OI_SSN, "equals", lhm_TestCase_Table_Data.get("DR_CD_OI_SSN"));

			break;
		case "EDIT":

			GuidewireAutomate_Validation("Person", DR_CD_Person, "equals", "Person");
			GuidewireAutomate("First name", DR_CD_P_FirstName, "clearAndsendkeys",
					lhm_TestCase_Table_Data.get("DR_CD_P_FirstName"));
			GuidewireAutomate("Last name", DR_CD_P_LastName, "clearAndsendkeys",
					lhm_TestCase_Table_Data.get("DR_CD_P_LastName"));

			GuidewireAutomate_Validation("Address", DR_CD_Address, "equals", "Address");
			GuidewireAutomate("Address1", DR_CD_A_Address1, "clearAndsendkeys",
					lhm_TestCase_Table_Data.get("DR_CD_A_Address1"));

			GuidewireAutomate("License", DR_CD_License, "clearAndsendkeys",
					lhm_TestCase_Table_Data.get("DR_CD_License"));

			GuidewireAutomate_Validation("Official IDs", DR_CD_OfficialIDs, "equals", "Official IDs");
			GuidewireAutomate("SSN", DR_CD_OI_SSN, "clearAndsendkeys", lhm_TestCase_Table_Data.get("DR_CD_OI_SSN"));

			break;
		default:
			break;
		}

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	@Override
	public void driver_Roles(String TestingType) throws Throwable {
		lhm_TestCase_Table_Data = oDB.getData_MSExcel_WorkSheet_Fillo("driver", strTestCaseName);

		GuidewireAutomate("Contat Details", DR_Tab_Roles, "click", "NA");

		switch (TestingType) {
		case "VERIFY":

			break;
		case "EDIT":

			GuidewireAutomate_Validation("Primary Named Insured", DR_R_PrimaryNamedInsured, "equals",
					"Primary Named Insured");
			GuidewireAutomate_Validation("Driver", DR_R_Driver, "equals", "Driver");
			GuidewireAutomate("First name", DR_R_D_DateCompletedTrainingClass, "sendkeys",
					lhm_TestCase_Table_Data.get("DR_R_D_DateCompletedTrainingClass"));
			GuidewireAutomate("Last name", DR_R_D_YearFirstLicensed, "sendkeys",
					lhm_TestCase_Table_Data.get("DR_R_D_YearFirstLicensed"));

			GuidewireAutomate("Excluded?", DR_R_D_Excluded, "click", lhm_TestCase_Table_Data.get("DR_R_D_Excluded"));

			GuidewireAutomate_Validation("Accident/Violation Summary", DR_R_AccidentViolationSummary, "equals",
					"Accident/Violation Summary");
			GuidewireAutomate("NumberOfAccidents_PolicyLevel", DR_R_AVS_NumberOfAccidents_PolicyLevel,
					"selectByVisibleText", lhm_TestCase_Table_Data.get("DR_R_AVS_NumberOfAccidents_PolicyLevel"));
			GuidewireAutomate("NumberOfAccidents_AccountLevel", DR_R_AVS_NumberOfAccidents_AccountLevel,
					"selectByVisibleText", lhm_TestCase_Table_Data.get("DR_R_AVS_NumberOfAccidents_AccountLevel"));
			GuidewireAutomate("NumberOfViolations_PolicyLevel", DR_R_AVS_NumberOfViolations_PolicyLevel,
					"selectByVisibleText", lhm_TestCase_Table_Data.get("DR_R_AVS_NumberOfViolations_PolicyLevel"));
			GuidewireAutomate("NumberOfViolations_AccountLevel", DR_R_AVS_NumberOfViolations_AccountLevel,
					"selectByVisibleText", lhm_TestCase_Table_Data.get("DR_R_AVS_NumberOfViolations_AccountLevel"));

			break;
		default:
			break;
		}

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	@Override
	public void driver_Addresses(String TestingType) throws Throwable {

		lhm_TestCase_Table_Data = oDB.getData_MSExcel_WorkSheet_Fillo("driver", strTestCaseName);

		GuidewireAutomate("Addresses", DR_Tab_Addresses, "click", "NA");
		switch (TestingType) {
		case "VERIFY":

			break;
		case "EDIT":

			break;
		default:
			break;
		}
		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	@Override
	public void driver_MotorVehicleRecord(String TestingType) throws Throwable {

		lhm_TestCase_Table_Data = oDB.getData_MSExcel_WorkSheet_Fillo("driver", strTestCaseName);

		GuidewireAutomate("Addresses", DR_Tab_MotorVehicleRecord, "click", "NA");
		switch (TestingType) {
		case "VERIFY":

			break;
		case "EDIT":

			break;
		default:
			break;
		}

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

}
