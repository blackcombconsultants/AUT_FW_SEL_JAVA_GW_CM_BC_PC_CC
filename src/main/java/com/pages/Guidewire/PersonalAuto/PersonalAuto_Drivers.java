package com.pages.Guidewire.PersonalAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Resuables_PO;

public class PersonalAuto_Drivers extends SeleniumWebDriver_Commands implements PersonalAuto_Drivers_PO {
	Selenium_Utils_DataBase oDB = new Selenium_Utils_DataBase();

	public PersonalAuto_Drivers(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	public static void driver_Add_NewPerson() throws Throwable {
		// TODO Auto-generated method stub
		// GuidewireAutomate("Organization Name", OS_OrganizationName, "sendKeys",
		// lhm_Data.get("TD_OrganizationName"));

	}

	public static void driver_Add_FromAddressBook() throws Throwable {
		// TODO Auto-generated method stub

	}

	public static void driver_Add_ExistingDriver() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("drivers", strTestCaseName);

		GuidewireAutomate_Validation("Screen Header", PolicyCenter_Resuables_PO.Screen_Header, "equals", "Drivers");

		GuidewireAutomate("Add", DR_DriversDetails_Add_Button, "click", lhm_TestCase_Table_Data.get("DR_Add"));
		GuidewireAutomate("Existing Driver", DR_DriversDetails_Add_ExistingDriver, "moveToElement",
				lhm_TestCase_Table_Data.get("DR_Add"));

		// Hande Dynamic Element - Click Existing driver
		if (lhm_TestCase_Table_Data.get("DR_Add_DD_Name").contains("refer")) {
			strAccountName = lhm_TestCase_Data.get("PrimaryNI_Name");
		} else {
			strAccountName = lhm_TestCase_Table_Data.get("DR_Add_DD_Name");
		}
		By DR_DriversDetails_Add_ExistingDriver_Name = By.xpath(
				"//div[contains(@id,'DriversListDetailPanel-DriversLV_tb-AddDriver') and contains(@class,'gw-AddButtonWidget')]/div[@class='gw-subMenu gw-open']/div[contains(@id,'DriversLV_tb-AddDriver-AddExistingContact')]//div[contains(@id,'UnassignedDriver')]//div[@class='gw-label' and text()='"
						+ strAccountName + "']");
		GuidewireAutomate("Existing Driver Name", DR_DriversDetails_Add_ExistingDriver_Name, "click", strAccountName);
		// Hande Dynamic Element - Click Existing driver - Completed

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();

	}

	public static void driver_Remove() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("drivers", strTestCaseName);

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	public static void driver_RetrieveMVR() throws Throwable {

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("drivers", strTestCaseName);

		// Hande Dynamic Element - Click Existing driver
		if (lhm_TestCase_Table_Data.get("DR_Add_DD_Name").contains("refer")) {
			strAccountName = lhm_TestCase_Data.get("PrimaryNI_Name");
		} else {
			strAccountName = lhm_TestCase_Table_Data.get("DR_Add_DD_Name");
		}

		By DR_DriversDetails_Name = By
				.xpath("//td[contains(@id,'Name_Cell') and contains(@class,'gw-CellWidget')]//div[text()='"
						+ strAccountName + "']");
		GuidewireAutomate("Driver " + strAccountName, DR_DriversDetails_Name, "click", strAccountName);

		GuidewireAutomate("Driver Select", DR_DriversDetails_Select, "click", "NA");
		GuidewireAutomate("RetrieveMVR", DR_DriversDetails_RetrieveMVR_Button, "clickAndwait", "NA");

		GuidewireAutomate_Validation("MVR Status", DR_DriversDetails_MVRStatus, "equals", "Received");

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	public static void driver_Edit_ExistingDriver() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("drivers", strTestCaseName);

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	public static void driver_ContatDetails(String TestingType) throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("drivers", strTestCaseName);

		GuidewireAutomate("Contat Details Tab", DR_Tab_ContatDetails, "click", "NA");
		String LicenseNumber = lhm_TestCase_Table_Data.get("DR_CD_LicenseNumber");
		switch (TestingType) {
		case "VERIFY":

			GuidewireAutomate_Validation("Person", DR_CD_Person, "equals", "Person");

			GuidewireAutomate_Validation("First name", DR_CD_P_FirstName, "valueEquals",
					lhm_TestCase_Table_Data.get("DR_CD_P_FirstName"));
			GuidewireAutomate_Validation("Last name", DR_CD_P_LastName, "valueEquals",
					lhm_TestCase_Table_Data.get("DR_CD_P_LastName"));
			
			GuidewireAutomate("Date Of Birth", DR_CD_DateofBirth, "clearANDsendKeys",lhm_TestCase_Table_Data.get("DR_CD_DateofBirth"));

			GuidewireAutomate_Validation("Address", DR_CD_Address, "equals", "Address");
			GuidewireAutomate_Validation("Address1", DR_CD_A_Address1, "valueEquals",
					lhm_TestCase_Table_Data.get("DR_CD_A_Address1"));

			GuidewireAutomate_Validation("SSN", DR_CD_OI_SSN, "valuecontains",
					lhm_TestCase_Table_Data.get("DR_CD_OI_SSN"));
		
			GuidewireAutomate("LicenseNumber", DR_CD_LicenseNumber, "clearANDsendKeys",lhm_TestCase_Table_Data.get("DR_CD_LicenseNumber"));

			GuidewireAutomate("LicenseState", DR_CD_LicenseState, "selectByVisibleText",
					lhm_TestCase_Table_Data.get("DR_CD_LicenseState"));

			lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
			lhm_TestCase_Table_Data.clear();
			break;
			
		case "EDIT":

			GuidewireAutomate_Validation("Person", DR_CD_Person, "equals", "Person");
			GuidewireAutomate("First name", DR_CD_P_FirstName, "clearAndsendKeys",
					lhm_TestCase_Table_Data.get("DR_CD_P_FirstName"));
			GuidewireAutomate("Last name", DR_CD_P_LastName, "clearAndsendKeys",
					lhm_TestCase_Table_Data.get("DR_CD_P_LastName"));
			GuidewireAutomate("DateofBirth", DR_CD_DateofBirth, "clearAndsendKeys",
					lhm_TestCase_Table_Data.get("DR_CD_DateofBirth"));

			GuidewireAutomate_Validation("Address", DR_CD_Address, "equals", "Address");
			GuidewireAutomate("Address1", DR_CD_A_Address1, "clearAndsendKeys",
					lhm_TestCase_Table_Data.get("DR_CD_A_Address1"));

			GuidewireAutomate_Validation("Official IDs", DR_CD_OfficialIDs, "equals", "Official IDs");
			GuidewireAutomate("SSN", DR_CD_OI_SSN, "clearAndsendKeys", lhm_TestCase_Table_Data.get("DR_CD_OI_SSN"));
			
			if (LicenseNumber.equalsIgnoreCase("Random")) {
				LicenseNumber = getRandomAlphabetic(9);
			} else if (LicenseNumber.equalsIgnoreCase("Today")) {
				LicenseNumber = strCurrentDate_ddMMMMyyyy;
			} else if (LicenseNumber.equalsIgnoreCase("CurrentTime")) {
				LicenseNumber = strCurrentDate_ddMMMMyyyyHHmmss;
			} else if (LicenseNumber.equalsIgnoreCase("NowSystem")) {
				LicenseNumber = String.valueOf(System.currentTimeMillis());
			} else {
				LicenseNumber = lhm_TestCase_Table_Data.get("DR_CD_LicenseNumber");
			}

			
			GuidewireAutomate("LicenseNumber", DR_CD_LicenseNumber, "clearAndsendKeys", LicenseNumber);
			GuidewireAutomate("LicenseState", DR_CD_LicenseState, "selectByVisibleText",
					lhm_TestCase_Table_Data.get("DR_CD_LicenseState"));

			lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
			lhm_TestCase_Table_Data.clear();
			break;
		default:
			break;

		}

		
	}

	public static void driver_Roles(String TestingType) throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("drivers", strTestCaseName);

		GuidewireAutomate("Roles Tab", DR_Tab_Roles, "click", "NA");

		GuidewireAutomate_Validation("Primary Named Insured", DR_R_PrimaryNamedInsured, "equals",
				"Primary Named Insured");
		
		GuidewireAutomate_Validation("Driver", DR_R_Driver, "equals", "Driver");

		switch (TestingType) {
		case "VERIFY":

			break;
		case "EDIT":

			GuidewireAutomate("DateCompletedTrainingClass", DR_R_D_DateCompletedTrainingClass, "clearANDsendKeys",
					lhm_TestCase_Table_Data.get("DR_R_D_DateCompletedTrainingClass"));
			GuidewireAutomate("YearFirstLicensed", DR_R_D_YearFirstLicensed, "clearANDsendKeys",
					lhm_TestCase_Table_Data.get("DR_R_D_YearFirstLicensed"));

			GuidewireAutomate("Excluded?", DR_R_D_ExcludedNo, "click", lhm_TestCase_Table_Data.get("DR_R_D_Excluded"));
			// GuidewireAutomate("Do Not Order MVR", DR_R_D_DoNotOrderMVR, "click",
			// lhm_TestCase_Table_Data.get("DR_R_D_DoNotOrderMVR"));

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

	public static void driver_Addresses(String TestingType) throws Throwable {

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("drivers", strTestCaseName);

		GuidewireAutomate("Addresses Tab", DR_Tab_Addresses, "click", "NA");

		GuidewireAutomate_Validation("This is currently the policy address", DR_A_CurrentlyPolicyAddress, "equals",
				"This is currently the policy address");

		switch (TestingType) {
		case "VERIFY":
			GuidewireAutomate_Validation("First Address1", DR_A_AD_Address1, "valueEquals",
					lhm_TestCase_Table_Data.get("DR_A_AD_Address1"));

			break;
		case "EDIT":
			GuidewireAutomate("Address1", DR_A_AD_Address1, "clearANDsendKeys",
					lhm_TestCase_Table_Data.get("DR_A_AD_Address1"));
			GuidewireAutomate("Address Type", DR_A_AD_AddressType, "selectByVisibleText",
					lhm_TestCase_Table_Data.get("DR_A_AD_AddressType"));
			
			break;
		case "ADD":
			
			GuidewireAutomate("Addresses Add", DR_A_AD_ADD, "clickAndwait", "NA");
		
			GuidewireAutomate("Address1", DR_A_AD_Address1, "clearANDsendKeys",
					lhm_TestCase_Table_Data.get("DR_A_AD_Address1"));
			GuidewireAutomate("Address State", DR_A_AD_State, "selectByVisibleText",
					lhm_TestCase_Table_Data.get("DR_A_AD_State"));
			GuidewireAutomate("Address Type", DR_A_AD_AddressType, "selectByVisibleText",
					lhm_TestCase_Table_Data.get("DR_A_AD_AddressType"));
			GuidewireAutomate("DR_A_AD_Primary", DR_A_AD_Primary, "clickAndwait", "NA");
			
			
			
			break;
		default:
			break;
		}
		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	public static void driver_MotorVehicleRecord(String TestingType) throws Throwable {

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("drivers", strTestCaseName);

		GuidewireAutomate("MotorVehicleRecord Tab", DR_Tab_MotorVehicleRecord, "click", "NA");
		switch (TestingType) {
		case "VERIFY":
			GuidewireAutomate_Validation("Name", DR_MVR_Name, "equals",
					lhm_TestCase_Table_Data.get("DR_MVR_Name"));

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
