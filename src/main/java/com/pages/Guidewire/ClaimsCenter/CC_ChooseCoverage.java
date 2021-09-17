package com.pages.Guidewire.ClaimsCenter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;

public class CC_ChooseCoverage extends SeleniumWebDriver_Commands implements CC_ChooseCoverage_PO {

	public CC_ChooseCoverage(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);

	}

	public static void NewExposureValidation() throws Throwable {

		// Add code to verify (Loss Party,Primary Coverage)
		try {
			GuidewireAutomate_Validation("Screen Header", NewExposureHeader, "contains", "New Exposure");
			GuidewireAutomate_Validation("Section", ExposureTitle, "equals", "Exposure");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

	public static void Exposures_Validation() throws Throwable {
		// Add code to fetch (Type, Coverage)

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("newExposure",
				strTestCaseName);
		try {

			GuidewireAutomate_Validation("Screen Header", ExposureHeader, "equals", "Exposures");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

	public static void ValidationResults() throws Throwable {

		try {
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_ClaimsCenter("asBasicInfo");
			GuidewireAutomate_Validation("ValidationResults Header", ValidationResults_Header, "equals",
					"Validation Results");
			GuidewireAutomate_Validation("Warnings Title", ValidationResults_WarningTitle, "equals", "Warnings:");
			GuidewireAutomate_Validation("Warnings First", ValidationResults_Warning_First, "contains",
					"Validation errors were found in an object of type ReserveSet that was auto-created by rules:");
			String strChoosebyCoverage_Vehicle = lhm_TestCase_Table_Data.get("BI_IV_Select");

			By ValidationResults_Warning_Second = By
					.xpath("//div[contains(@id,'WebMessageWorksheetScreen')]//div[contains(text(),'Gross incurred for "
							+ strChoosebyCoverage_Vehicle + "')]");

			GuidewireAutomate_Validation("Warnings Second", ValidationResults_Warning_Second, "contains",
					"Validation errors were found in an object of type ReserveSet that was auto-created by rules:");
			GuidewireAutomate("Clear Button", ValidationResults_ClearButton, "clickAndwait", "click");
			GuidewireAutomate("Update Button", NewExposureUpdateButton, "clickAndwait", "click");
			GuidewireAutomate_Validation("Exposure Header", ExposureHeader, "equals", "Exposures");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void ValidationResults_ElectronicEquipment() throws Throwable {

		try {
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_ClaimsCenter("asBasicInfo");
			String strChoosebyCoverage_Vehicle = lhm_TestCase_Table_Data.get("BI_IV_Select");

			GuidewireAutomate_Validation("ValidationResults Header", ValidationResults_Header, "equals",
					"Validation Results");
			GuidewireAutomate_Validation("Warnings Title", ValidationResults_WarningTitle, "equals", "Warnings:");
			By ValidationResults_Warning_First = By
					.xpath("//div[contains(@id,'WebMessageWorksheetScreen')]//div[contains(text(),'Gross incurred for "
							+ strChoosebyCoverage_Vehicle + "')]");
			GuidewireAutomate_Validation("Warnings First", ValidationResults_Warning_First, "contains",
					"Validation errors were found in an object of type ReserveSet that was auto-created by rules:");

			GuidewireAutomate("Clear Button", ValidationResults_ClearButton, "clickAndwait", "click");
			GuidewireAutomate("Update Button", NewExposureUpdateButton, "clickAndwait", "click");
			GuidewireAutomate_Validation("Exposure Header", ExposureHeader, "equals", "Exposures");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void AllClaimant() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("newExposure",
				strTestCaseName);
		try {
			GuidewireAutomate_Validation("Claimant Title", EditIncidentClaimantTitle, "equals", "Claimant");
			GuidewireAutomate("Select Claimant", EditIncidentClaimant, "selectByVisibleText",
					lhm_TestCase_Table_Data.get("ClaimantName"));

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void AddDescription() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("newExposure",
				strTestCaseName);
		try {

			GuidewireAutomate("Damage Description", DamageDescription_Exposure, "clearANDsendKeys",
					lhm_TestCase_Table_Data.get("DamageDescription"));
			GuidewireAutomate("Update Button", NewExposureUpdateButton, "clickAndwait", "click");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void PIPClaimant() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("newExposure",
				strTestCaseName);
		try {
			GuidewireAutomate_Validation("Section", EditIncidentClaimantTitle, "equals", "Claimant");
			GuidewireAutomate("Select Claimant", PIPNewExposure_Claimant, "selectByVisibleText",
					lhm_TestCase_Table_Data.get("ClaimantName"));

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void VehicleNewIncident() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("newExposure",
				strTestCaseName);
		try {
			GuidewireAutomate("NewIncident_Description", NewIncident_Description, "moveToElement",
					"NewIncident_Description");
			GuidewireAutomate_Validation("Description", NewIncident_Description, "equals", "Description");
			
			GuidewireAutomate_Validation("IncidentOverview Title", EditIncident_IncidentOverviewTitle, "equals",
					"Incident Overview");
			GuidewireAutomate("NewIncident Button", EditIncident_VehicleEditButton, "clickAndwait", "click");
			GuidewireAutomate("New Incident", EditIncident_VehicleNewIncident, "clickAndwait", "click");
			GuidewireAutomate_Validation("NewVehicleIncident Header", NewVehicleIncident_Header, "equals",
					"New Vehicle Incident");
			GuidewireAutomate_Validation("Details Title", NewVehicleIncident_DetailsTitle, "equals", "Details");
			GuidewireAutomate_Validation("InvolvedVehicle Title", InvolvedVehicleTitle, "equals", "Involved Vehicle");
			GuidewireAutomate("Select vehicle", NewVehicleIncident_SelectVehicle, "selectByVisibleText", "New...");
			GuidewireAutomate("Year", NewVehicleIncident_Year, "clearANDsendKeys",
					lhm_TestCase_Table_Data.get("VehicleYear"));
			GuidewireAutomate("Make", NewVehicleIncident_Make, "clearANDsendKeys",
					lhm_TestCase_Table_Data.get("VehicleMake"));
			GuidewireAutomate("Model", NewVehicleIncident_Model, "clearANDsendKeys",
					lhm_TestCase_Table_Data.get("VehicleModel"));
			GuidewireAutomate_Validation("DriverOfInvolvedVehicle Title", DriverOfInvolvedVehicleTitle, "equals",
					"Driver of Involved Vehicle");
			GuidewireAutomate("Driver Name", DriverName, "selectByVisibleText",
					lhm_TestCase_Table_Data.get("DriverName"));
			GuidewireAutomate_Validation("LoanInformation Title", LoanInformationTitle, "equals", "Loan Information");
			GuidewireAutomate_Validation("ServicesToPerform Title", ServicesToPerformTitle, "equals",
					"Services to Perform");
			GuidewireAutomate_Validation("DamageDescription Title", DamageDescriptionTitle, "equals",
					"Damage Description");
			GuidewireAutomate("Damage Description", DamageDescription, "clearANDsendKeys",
					lhm_TestCase_Table_Data.get("DamageDescription"));
			GuidewireAutomate_Validation("Details Title", DetailsTitle, "equals", "Details");
			GuidewireAutomate("Loss Occurred", DetailsLossOccurred, "selectByVisibleText",
					lhm_TestCase_Table_Data.get("LossOccurred"));
			GuidewireAutomate("Ok Button", Incident_OkButton, "clickAndwait", "click");
			GuidewireAutomate("Update Button", NewExposureUpdateButton, "clickAndwait", "click");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void VehicleEditIncident() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("newExposure",
				strTestCaseName);
		try {

			GuidewireAutomate("NewIncident_Description", NewIncident_Description, "moveToElement",
					"NewIncident_Description");
			GuidewireAutomate_Validation("Description", NewIncident_Description, "equals", "Description");

			
			GuidewireAutomate_Validation("IncidentOverview Title", EditIncident_IncidentOverviewTitle, "equals",
					"Incident Overview");
			GuidewireAutomate("Edit Incident Button", EditIncident_VehicleEditButton, "clickAndwait", "click");
			GuidewireAutomate("Edit Incident", EditIncident_VehicleEditIncident, "clickAndwait", "click");
			GuidewireAutomate_Validation("VehicleIncident Header", EditVehicleIncidentHeader, "equals",
					"Vehicle Incident");
			GuidewireAutomate_Validation("Details Title", NewVehicleIncident_DetailsTitle, "equals", "Details");
			GuidewireAutomate_Validation("DriverOfInvolvedVehicle Title", DriverOfInvolvedVehicleTitle, "equals",
					"Driver of Involved Vehicle");
			GuidewireAutomate("Driver Name", DriverName, "selectByVisibleText",
					lhm_TestCase_Table_Data.get("DriverName"));
			GuidewireAutomate_Validation("LoanInformation Title", LoanInformationTitle, "equals", "Loan Information");
			GuidewireAutomate_Validation("ServicesToPerform Title", ServicesToPerformTitle, "equals",
					"Services to Perform");
			GuidewireAutomate_Validation("DamageDescription Title", DamageDescriptionTitle, "equals",
					"Damage Description");
			GuidewireAutomate("Damage Description", DamageDescription, "clearANDsendKeys",
					lhm_TestCase_Table_Data.get("DamageDescription"));
			GuidewireAutomate_Validation("Details Title", DetailsTitle, "equals", "Details");
			GuidewireAutomate("Loss Occurred", DetailsLossOccurred, "selectByVisibleText",
					lhm_TestCase_Table_Data.get("LossOccurred"));
			GuidewireAutomate("Ok Button", Incident_OkButton, "clickAndwait", "click");
			GuidewireAutomate("Update Button", NewExposureUpdateButton, "clickAndwait", "click");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void InjuryNewIncident() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("newExposure",
				strTestCaseName);
		try {

			GuidewireAutomate("NewIncident_Description", NewIncident_Description, "moveToElement",
					"NewIncident_Description");
			GuidewireAutomate_Validation("Description", NewIncident_Description, "equals", "Description");

			GuidewireAutomate_Validation("Injury Incident Overview", NewIncident_InjuryIncidentOverviewTitle, "equals",
					"Injury Incident Overview");
			GuidewireAutomate("EditIncident Button", NewIncident_InjuryEditButton, "clickAndwait", "click");
			GuidewireAutomate("Edit Incident", EditIncident_VehicleNewIncident, "clickAndwait", "click");
			GuidewireAutomate_Validation("InjuryIncident Header", EditVehicleIncidentHeader, "equals",
					"Injury Incident");
			GuidewireAutomate_Validation("InjuryDetails Title", NewInjuryIncident_InjuryDetailsTitle, "equals",
					"Injury Details");
			GuidewireAutomate("Injured Person", NewInjuryIncident_InjuredPerson, "selectByVisibleText",
					lhm_TestCase_Table_Data.get("InjuredPersonName"));
			GuidewireAutomate("Loss Party", NewInjuryIncident_LossParty, "selectByVisibleText",
					lhm_TestCase_Table_Data.get("LossParty"));
			GuidewireAutomate("Describe Injuries", NewInjuryIncident_DescribeInjuries, "clearANDsendKeys",
					lhm_TestCase_Table_Data.get("DescribeInjuries"));
			GuidewireAutomate("Ok Button", Incident_OkButton, "clickAndwait", "click");
			GuidewireAutomate("Update Button", NewExposureUpdateButton, "clickAndwait", "click");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void InjuryNewIncident_AddBodyPart() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("newExposure",
				strTestCaseName);
		try {
			GuidewireAutomate("NewIncident_Description", NewIncident_Description, "moveToElement",
					"NewIncident_Description");
			GuidewireAutomate_Validation("Description", NewIncident_Description, "equals", "Description");

			GuidewireAutomate_Validation("Injury Incident Overview", NewIncident_InjuryIncidentOverviewTitle, "equals",
					"Injury Incident Overview");
			GuidewireAutomate("EditIncident Button", NewIncident_InjuryEditButton, "clickAndwait", "click");
			GuidewireAutomate("Edit Incident", EditIncident_VehicleNewIncident, "clickAndwait", "click");
			GuidewireAutomate_Validation("InjuryIncident Header", EditVehicleIncidentHeader, "equals",
					"Injury Incident");
			GuidewireAutomate_Validation("InjuryDetails Title", NewInjuryIncident_InjuryDetailsTitle, "equals",
					"Injury Details");
			GuidewireAutomate("Injured Person", NewInjuryIncident_InjuredPerson, "selectByVisibleText",
					lhm_TestCase_Table_Data.get("InjuredPersonName"));
			GuidewireAutomate("Loss Party", NewInjuryIncident_LossParty, "selectByVisibleText",
					lhm_TestCase_Table_Data.get("LossParty"));
			GuidewireAutomate("Describe Injuries", NewInjuryIncident_DescribeInjuries, "clearANDsendKeys",
					lhm_TestCase_Table_Data.get("DescribeInjuries"));
			GuidewireAutomate("Add Button Body Parts", NewInjuryIncident_AddButton, "clickAndwait", "clickAndwait");
			GuidewireAutomate("Area of Body", NewInjuryIncident_AreaOfBody, "selectByVisibleTextAndwait", "Neck");
			Thread.sleep(2000);
			GuidewireAutomate("Body Part", NewInjuryIncident_BodyPart, "selectByVisibleTextAndwait", "Vertebrae");
			Thread.sleep(2000);
			GuidewireAutomate("PPD Percentage", NewInjuryIncident_PPDPercenrage, "clearANDsendKeys", "5");
			GuidewireAutomate("Ok Button", Incident_OkButton, "clickAndwait", "click");
			GuidewireAutomate("Update Button", NewExposureUpdateButton, "clickAndwait", "click");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void PropertyNewIncident() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("newExposure",
				strTestCaseName);
		try {
			GuidewireAutomate_Validation("IncidentOverview Title", EditIncident_IncidentOverviewTitle, "equals",
					"Incident Overview");
			GuidewireAutomate("EditIncident Button", NewIncident_InjuryEditButton, "clickAndwait", "click");
			GuidewireAutomate("Edit Incident", EditIncident_VehicleNewIncident, "clickAndwait", "click");

			GuidewireAutomate_Validation("NewPropertyIncident Header", EditVehicleIncidentHeader, "equals",
					"New Property Incident");
			GuidewireAutomate_Validation("Details Title", NewVehicleIncident_DetailsTitle, "equals", "Details");

			GuidewireAutomate_Validation("Damage Title", NewPropertyIncident_DamageTitle, "equals", "Damage");
			GuidewireAutomate("Property Description", NewPropertyIncident_PropertyDescription, "clearANDsendKeys",
					lhm_TestCase_Table_Data.get("PropertyDescription"));
			GuidewireAutomate("Damage Description", NewPropertyIncident_DamageDescription, "clearANDsendKeys",
					lhm_TestCase_Table_Data.get("DamageDescription"));

			GuidewireAutomate_Validation("Property Title", NewPropertyIncident_PropertyTitle, "equals", "Property");
			GuidewireAutomate("Property Owner", NewPropertyIncident_Owner, "selectByVisibleText",
					lhm_TestCase_Table_Data.get("ClaimantName"));
			GuidewireAutomate("Property Name", NewPropertyIncident_PropertyName, "selectByVisibleTextAndwait",
					"New...");
			getStaleElement("Country", NewPropertyIncident_Country);
			GuidewireAutomate("Country", NewPropertyIncident_Country, "selectByVisibleTextAndwait", "United States");
			GuidewireAutomate("State", NewPropertyIncident_State, "selectByVisibleTextAndwait",
					lhm_TestCase_Table_Data.get("StateName"));
			GuidewireAutomate("Address", NewPropertyIncident_Address, "clearANDsendKeys", "123 valley Main road");

			GuidewireAutomate("Ok Button", Incident_OkButton, "clickAndwait", "click");

			GuidewireAutomate("Update Button", NewExposureUpdateButton, "clickAndwait", "click");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void Location() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("newExposure",
				strTestCaseName);
		try {
			GuidewireAutomate("Location", NewExposureLocation, "selectByVisibleText",
					lhm_TestCase_Table_Data.get("Location"));
			GuidewireAutomate("Update Button", NewExposureUpdateButton, "clickAndwait", "click");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void UpdateButton() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("newExposure",
				strTestCaseName);
		try {

			GuidewireAutomate("Update Button", NewExposureUpdateButton, "clickAndwait", "click");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void ValidatioErrorMessage() throws Throwable {

		try {
			GuidewireAutomate_Validation("ValidationResults Header", ValidationResults_Header, "equals",
					"Validation Results");

			GuidewireAutomate_Validation("Warnings Title", ValidationResults_WarningTitle, "equals", "Warnings:");
			GuidewireAutomate_Validation("Warnings First", ValidationResults_Warning_First, "contains",
					"(2) 1st Party Vehicle - PGNUtwMRX Automation ($2,500.00) exceeds the exposure limit of $15.00");
			GuidewireAutomate_Validation("Warnings Second", ValidationResults_Warning_Second, "contains",
					"2002 Acura RL ($2,500.00) of type Rental Reimbursement exceeds the incident limit of $450.00");

			GuidewireAutomate("Clear Button", ValidationResults_ClearButton, "clickAndwait", "click");

			GuidewireAutomate("Update Button", NewExposureUpdateButton, "clickAndwait", "click");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
}
