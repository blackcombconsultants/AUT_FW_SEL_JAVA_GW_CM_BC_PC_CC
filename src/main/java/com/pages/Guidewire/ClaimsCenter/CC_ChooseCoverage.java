package com.pages.Guidewire.ClaimsCenter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class CC_ChooseCoverage extends SeleniumWebDriver_Commands {

	public CC_ChooseCoverage(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);

	}

	// New Exposure Page
	private static By NewExposureHeader       = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and contains(text(),'New Exposure')]");
	private static By ExposureTitle           = By.xpath("//div[text()='Exposure' and @class='gw-label gw-boldLabel']");
	private static By NewExposureUpdateButton = By.xpath("//div[contains(@id,'NewExposure-NewExposureScreen-Update')]//div[@role='button']");
	// New Exposure Page
	private static By ExposureHeader   = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and text()='Exposures']");
	private static By ExposureCheckBox = By.xpath("//input[contains(@name,'ExposuresLV-_Checkbox')]");

	// New Exposure Page for Edit Incident Vehicle
	private static By EditIncidentClaimantTitle = By.xpath("//div[text()='Claimant' and @class='gw-label gw-boldLabel']");
	// private static By EditIncidentClaimant = By.xpath("//select[contains(@name,'Claimant_Picker')]");

	private static By EditIncident_IncidentOverviewTitle = By.xpath("//div[contains(@id,'NewExposureDV') and @role='group']//div[text()='Incident Overview']");
	private static By EditIncident_VehicleEditButton     = By.xpath("//div[contains(@id,'IncidentMenuIcon')]//div[@class='gw-action--expand-button']");
	private static By EditIncident_VehicleNewIncident    = By.xpath("//div[contains(@id,'GeneralDamage_IncidentMenuIcon')]/div[@role='menu']/div[contains(@id,'DV_NewIncidentMenuItem')]//div[contains(text(),'New Incident')]");
	private static By EditIncident_VehicleEditIncident   = By.xpath("//div[contains(@id,'EditIncidentMenuItem')]//div[@role='menuitem']");

	// Edit Vehicle Incident Page
	private static By EditVehicleIncidentHeader = By.xpath("//div[contains(@id,'IncidentScreen')]//div[@role='heading' and @class='gw-TitleBar--title']");
	private static By InvolvedVehicleTitle      = By.xpath("//div[contains(@id,'VehIncidentDetailDV-VehicleIncidentDV')]//div[text()='Involved Vehicle']");

	private static By DriverOfInvolvedVehicleTitle = By.xpath("//div[contains(@id,'VehIncidentDetailDV-VehicleIncidentDV')]//div[text()='Driver of Involved Vehicle']");
	private static By DriverName                   = By.xpath("//select[contains(@name,'VehicleIncidentDV-Driver_Picker')]");

	private static By LoanInformationTitle   = By.xpath("//div[contains(@id,'VehIncidentDetailDV-VehicleIncidentDV')]//div[text()='Loan Information']");
	private static By ServicesToPerformTitle = By.xpath("//div[contains(@id,'VehIncidentDetailDV-VehicleIncidentDV')]//div[text()='Services to Perform']");
	private static By DamageDescriptionTitle = By.xpath("//div[contains(@id,'VehIncidentDetailDV-VehicleIncidentDV')]//div[text()='Damage Description']");
	private static By DamageDescription      = By.xpath("//div[contains(@id,'VehicleIncidentDV-Description')]//textarea[contains(@name,'VehicleIncidentDV-Description')]");
	// exposure
	private static By DamageDescription_Exposure = By.xpath("//div[contains(@id,'Description')]//textarea[contains(@name,'Description')]");

	private static By DetailsTitle        = By.xpath("//div[contains(@id,'VehIncidentDetailDV-VehicleIncidentDV')]//div[text()='Details']");
	private static By DetailsLossOccurred = By.xpath("//select[contains(@name,'VehicleIncidentDV-LossOccured')]");

	private static By EditIncident_OkButton = By.xpath("//div[contains(@id,'Screen-Update')]//div[@role='button']");

	// New Exposure Page for New Incident Injury
	private static By NewIncident_Description       = By.xpath("//div[contains(@id,'BIDamageInputSet-Incident_Description_Input')]");
	private static By NE_IncidentOverviewTitle      = By.xpath("//div[@class='gw-label gw-boldLabel' and contains(text(),'Incident Overview')]");
	private static By NewIncident_InjuryEditButton  = By.xpath("//div[contains(@id,'IncidentMenuIcon')]//div[@class='gw-action--expand-button']");
	private static By NewIncident_InjuryNewIncident = By.xpath("//div[contains(@id,'NewIncidentMenuItem')]//div[@role='menuitem']");

	// New Injury Incident Page
	private static By NewInjuryIncident_InjuryDetailsTitle = By.xpath("//div[contains(@id,'NewInjuryIncidentScreen-InjuryIncidentDV')]//div[text()='Injury Details']");
	private static By NewInjuryIncident_InjuredPerson      = By.xpath("//select[contains(@name,'InjuryIncidentDV-Injured_Picker')]");
	private static By NewInjuryIncident_LossParty          = By.xpath("//select[contains(@name,'InjuryIncidentInputSet-LossParty')]");
	private static By NewInjuryIncident_DescribeInjuries   = By.xpath("//div[contains(@id,'InjuryIncidentInputSet-InjuryDescription')]//textarea[contains(@name,'InjuryIncidentInputSet-InjuryDescription')]");
	private static By NewInjuryIncident_OkButton           = By.xpath("//div[contains(@id,'NewInjuryIncidentScreen-Update')]//div[@role='button']");

	private static By NewInjuryIncident_AddButton = By.xpath("//div[contains(@id,'InjuryIncidentInputSet-EditableBodyPartDetailsLV_tb-Add')]//div[@role='button']");

	private static By NewInjuryIncident_AreaOfBody    = By.xpath("//select[contains(@name,'PrimaryBodyPart')]");
	private static By NewInjuryIncident_BodyPart      = By.xpath("//select[contains(@name,'DetailedBodyPart')]");
	private static By NewInjuryIncident_PPDPercenrage = By.xpath("//input[contains(@name,'PermamentImpairmentPercentage')]");

	// New Exposure Page for Edit Property
	private static By PropertyEdit_ClaimantTitle = By.xpath("//div[contains(@id,'NewExposureDV-NewClaimPropertyDamageDV-4') and @role='group']//div[text()='Claimant']");
	// private static By PropertyEdit_Claimant = By.xpath("//select[contains(@name,'Claimant_Picker')]");
	private static By PropertyEdit_IncidentOverviewTitle  = By.xpath("//div[contains(@id,'NewExposureDV-NewClaimPropertyDamageDV') and @role='group']//div[text()='Incident Overview']");
	private static By PropertyEdit_PropertyNameEditButton = By.xpath("//div[contains(@id,'Incident-Property_IncidentMenuIcon')]//div[@class='gw-action--expand-button']");
	private static By PropertyEdit_NewIncident            = By.xpath("//div[contains(@id,'NewClaimPropertyDamageDV_NewIncidentMenuItem')]//div[@role='menuitem']");

	// New Property Incident
	private static By NewPropertyIncident_DetailsTitle        = By.xpath("//div[contains(@id,'Vehicle_DetailsCardTab')]//div[text()='Details']");
	private static By NewPropertyIncident_DamageTitle         = By.xpath("//div[contains(@id,'FixedPropertyIncidentDV')]//div[text()='Damage']");
	private static By NewPropertyIncident_PropertyDescription = By.xpath("//div[contains(@id,'PropertyDescription')]//input[contains(@name,'PropertyDescription')]");
	private static By NewPropertyIncident_DamageDescription   = By.xpath("//div[contains(@id,'Description')]//textarea[contains(@name,'Description')]");
	private static By NewPropertyIncident_PropertyTitle       = By.xpath("//div[contains(@id,'FixedPropertyIncidentDV')]//div[text()='Property']");
	private static By NewPropertyIncident_Owner               = By.xpath("//select[contains(@name,'FixedPropertyIncidentDV-Owner')]");
	private static By NewPropertyIncident_PropertyName        = By.xpath("//select[contains(@name,'CCAddressInputSet-globalAddressContainer-Address_Picker')]");
	private static By NewPropertyIncident_State               = By.xpath("//select[contains(@name,'GlobalAddressInputSet-State')]");
	private static By NewPropertyIncident_OkButton            = By.xpath("//div[contains(@id,'NewFixedPropertyIncidentScreen-Update')]//div[@role='button']");
	private static By NewPropertyIncident_Address             = By.xpath("//input[contains(@name,'AddressLine1')]");
	private static By NewPropertyIncident_Country             = By.xpath("//select[contains(@name,'GlobalAddressInputSet-Country')]");
	// New Vehicle Incident
	private static By NewVehicleIncident_Header        = By.xpath("//div[contains(@id,'IncidentScreen')]//div[@class='gw-TitleBar--title']");
	private static By NewVehicleIncident_DetailsTitle  = By.xpath("//div[contains(@id,'Vehicle_DetailsCardTab')]//div[text()='Details']");
	private static By NewVehicleIncident_SelectVehicle = By.xpath("//select[contains(@name,'VehicleIncidentDV-Vehicle_Picker')]");
	private static By NewVehicleIncident_Year          = By.xpath("//input[contains(@name,'VehicleIncidentDV-Vehicle_Year')]");
	private static By NewVehicleIncident_Make          = By.xpath("//input[contains(@name,'VehicleIncidentDV-Vehicle_Make')]");
	private static By NewVehicleIncident_Model         = By.xpath("//input[contains(@name,'VehicleIncidentDV-Vehicle_Model')]");
	private static By Incident_OkButton                = By.xpath("//div[contains(@id,'Update')]//div[@role='button']");

	// New Exposure PIP
	private static By PIPNewExposure_ClaimantTitle               = By.xpath("//div[contains(@id,'NewExposureDV-NewPIPSummaryDV-4') and @role='group']//div[text()='Claimant']");
	private static By PIPNewExposure_Claimant                    = By.xpath("//select[contains(@name,'PIPDamages_Claimant')]");
	private static By PIPNewExposure_InjuryIncidentOverviewTitle = By.xpath("//div[contains(@id,'NewPIPSummaryDV-BIDamageInputSet') and @role='group']//div[text()='Injury Incident Overview']");
	private static By PIPNewExposure_InjuryEditButton            = By.xpath("//div[contains(@id,'Incident-Injury_IncidentMenuIcon')]//div[@class='gw-action--expand-button']");
	private static By PIPNewExposure_InjuryNewIncident           = By.xpath("//div[contains(@id,'NewIncidentMenuItem')]//div[@role='menuitem']");

	// New Exposure Rental Car Loss of Use
	private static By NewExposureLocation = By.xpath("//select[contains(@name,'globalAddressContainer-Address_Picker')]");

	// Towing and labor Edit vehicle incident
	private static By TowingAndLabor_ClaimantTitle    = By.xpath("//div[contains(@id,'NewClaimTowOnlyDV-4') and @role='group']//div[text()='Claimant']");
	private static By TowingAndLabor_IncidentOverview = By.xpath("//div[contains(@id,'NewExposureDV-NewClaimTowOnlyDV') and @role='group']//div[text()='Incident Overview']");

	// validate Error Message
	private static By ValidationResults_Header         = By.xpath("//div[contains(@id,'wsTabBar')]//div[@class='gw-label' and text()='Validation Results']");
	private static By ValidationResults_WarningTitle   = By.xpath("//div[contains(@id,'WebMessageWorksheetScreen')]//div[text()='Warnings:']");
	private static By ValidationResults_Warning_First  = By.xpath("//div[contains(@id,'WebMessageWorksheetScreen')]//div[contains(text(),'($2,500.00) exceeds the exposure')]");
	private static By ValidationResults_Warning_Second = By.xpath("//div[contains(@id,'WebMessageWorksheetScreen')]//div[contains(text(),'incident limit of $450.00')]");
	private static By ValidationResults_ClearButton    = By.xpath("//div[contains(@id,'WebMessageWorksheet_ClearButton')]//div[@role='button']");

	// New Exposure General
	private static By NewExposureGeneral_Header = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and contains(text(),'New Exposure - General')]");
	// private static By General_Claimant = By.xpath("//select[@name='NewExposure-NewExposureScreen-NewExposureDV-Claimant_Picker']");
	// private static By GeneralClaimant_Type = By.xpath("//select[@name='NewExposure-NewExposureScreen-NewExposureDV-Claimant_Type']");
	private static By GDI_Open                      = By.xpath("//div[contains(@id,'GeneralDamage_Incident-GeneralDamage_IncidentMenuIcon')]/div[@role='button']");
	private static By GDI_NewIncident               = By.xpath("//div[@role='menu']/div[contains(@id,'DV_NewIncidentMenuItem')]//div[contains(text(),'New Incident')]");
	private static By GDI_EditIncident              = By.xpath("//div[contains(@id,'GeneralDamage_IncidentMenuIcon')]/div[@role='menu']/div[contains(@id,'DV_NewIncidentMenuItem')]//div[contains(text(),'Edit Incident')]");
	private static By NewIncident_GeneralEditButton = By.xpath("//div[contains(@id,'GeneralDamage_Incident-GeneralDamage_IncidentMenuIcon')]/div[@role='button']");
	private static By Damage_Severity               = By.xpath("//select[contains(@name,'Severity_Ext')]");
	private static By General_LossParty             = By.xpath("//select[contains(@name,'ExtDV-Owner_Picker')]");

	private static By NewGeneralDamageIncident_Header = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and contains(text(),'New General Damage Incident')]");
	private static By Exposure_GeneralCheckBox        = By.xpath("//input[contains(@name,'ExposuresLV-1-_Checkbox')]");
	private static By GeneralDamageIncidentOverview   = By.xpath("//div[contains(@id,'NewExposureScreen-NewExposureDV')]//div[@class='gw-label gw-boldLabel' and text()='General Damage Incident Overview']");

	// New Exposure General
	private static By CloseExposure_Header   = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and contains(text(),'Close Exposure')]");
	private static By E_CloseExposure_Button = By.xpath("//div[contains(@id,'ClaimExposures_CloseExposure')]//div[@role='button']");

	private static By CE_Note                 = By.xpath("//textarea[contains(@name,'Note')]");
	private static By CE_Outcome              = By.xpath("//select[contains(@name,'CloseExposureInfoDV-Outcome')]");
	private static By CE_CloseExposure_Button = By.xpath("//div[contains(@id,'CloseExposureScreen-Update')]//div[@role='button']");

	// Policy level Coverages
	private static By PLC_BodilyInjury = By.xpath("//div[contains(@id,'NewExposureMenuItemSet')]//div[@class='gw-label' and contains(text(),'Bodily')]");

	private static By PLC_GeneralDamage        = By.xpath("//div[contains(@id,'NewExposureMenuItemSet')]//div[@class='gw-label' and contains(text(),'GeneralDamage')]");
	private static By PLC_GeneralDamage2       = By.xpath("//div[contains(@id,'NewExposureMenuItemSet-0-item-1-item')]//div[@class='gw-label' and contains(text(),'General Damage')]");
	private static By PLC_GeneralDamageInsured = By.xpath("//div[contains(@id,'NewExposureMenuItemSet')]//div[@class='gw-label' and contains(text(),'General Damage - Insured')]");
	private static By PLC_GeneralDamageThird   = By.xpath("//div[contains(@id,'NewExposureMenuItemSet')]//div[@class='gw-label' and contains(text(),'General Damage - Third')]");

	private static By PLC_Property         = By.xpath("//div[contains(@id,'NewExposureMenuItemSet')]//div[@class='gw-label' and contains(text(),'Property')]");
	private static By PLC_LossPartyBodily  = By.xpath("//div[contains(@id,'NewExposureDV-LossParty')]//div[@class='gw-RangeValue']");
	private static By PLC_LossPartyGeneral = By.xpath("//div[contains(@id,'Exposure_LossParty')]//div[@class='gw-RangeValue']");

	// Existing Exposure
	private static By Exposure1            = By.xpath("//div[contains(@id,'ClaimExposuresScreen-ExposuresLV-0-Type')]//div[@class='gw-link gw-label']");
	private static By ExposureEditButton   = By.xpath("//div[@id='ExposureDetail-ExposureDetailScreen-Edit']//div[@role='button']");
	private static By ExposureClaimantType = By.xpath("//select[contains(@name,'Claimant_Type')]");

	private static By ExposureReopenButton = By.xpath("//div[contains(@id,'ReopenButton')]//div[@role='button']");
	private static By ExposureReopenReason = By.xpath("//select[contains(@name,'ReopenExposureInfoDV-Reason')]");

	// Claimant

	private static By Claimant_PickerMenu      = By.xpath("//div[contains(@id,'Claimant_PickerMenuIcon')]/div[@role='button']");
	private static By Claimant_Menu_NewPerson  = By.xpath("//div[contains(@id,'Claimant_PickerMenuIcon')]//div[contains(@id,'NewContactPickerMenuItemSet_NewPerson')]/div[@role='menuitem']");
	private static By ClaimantName             = By.xpath("//select[contains(@name,'Claimant_Picker')]");
	private static By ClaimantType             = By.xpath("//select[contains(@name,'Claimant_Type')]");
	private static By Add_InjuryButton         = By.xpath("//div[contains(@id,'IncidentMenuIcon')]//div[@role='button']");
	private static By AddPolicyLevel_Type      = By.xpath("//select[contains(@name,'EditableGeneralLiabilityPolicyCoveragesLV-0-CoverageType')]");
	private static By AddPolicyLevel_Form      = By.xpath("//select[contains(@name,'EditableGeneralLiabilityPolicyCoveragesLV-0-coverageForm_Ext')]");
	private static By AddPolicyLevel_RetroDate = By.xpath("//input[contains(@name,'-RetroActiveDate_Ext')]");

	private static By Add_NewIncident = By.xpath("//div[contains(@id,'NewIncidentMenuItem')]//div[@class='gw-label']");
	private static By LossParty       = By.xpath("//select[contains(@name,'-InjuryIncidentInputSet-LossParty')]");
	private static By Owner           = By.xpath("//select[contains(@name,'ExtDV-Owner_Picker')]");
	private static By Severity        = By.xpath("//select[contains(@name,'GeneralDamageIncident_ExtDV-Severity_Ext')]");
	private static By Damage          = By.xpath("//textarea[contains(@name,'ExtDV-DamageDescription_Ext')]");

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

	public static void Claimant_Hans() throws Throwable {

		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("newExposure");
		try {
			// GuidewireAutomate_Validation("Claimant Title", EditIncidentClaimantTitle, "equals", "Claimant");
			GuidewireAutomate("Select Claimant", ClaimantName, "selectByVisibleText", lhm_TestCase_Table_Data.get("ClaimantName1"));

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void Exposures_Validation() throws Throwable {
		// Add code to fetch (Type, Coverage)
		try {
			lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("newExposure");

			GuidewireAutomate_Validation("Screen Header", ExposureHeader, "equals", "Exposures");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

	public static void ValidationResults() throws Throwable {

		try {
			lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("asBasicInfo");
			GuidewireAutomate_Validation("ValidationResults Header", ValidationResults_Header, "equals", "Validation Results");
			GuidewireAutomate_Validation("Warnings Title", ValidationResults_WarningTitle, "equals", "Warnings:");
			GuidewireAutomate_Validation("Warnings First", ValidationResults_Warning_First, "contains", "Validation errors were found in an object of type ReserveSet that was auto-created by rules:");
			String strChoosebyCoverage_Vehicle = lhm_TestCase_Table_Data.get("BI_IV_Select");

			By ValidationResults_Warning_Second = By.xpath("//div[contains(@id,'WebMessageWorksheetScreen')]//div[contains(text(),'Gross incurred for " + strChoosebyCoverage_Vehicle + "')]");

			GuidewireAutomate_Validation("Warnings Second", ValidationResults_Warning_Second, "contains", "Validation errors were found in an object of type ReserveSet that was auto-created by rules:");
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
			lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("asBasicInfo");
			String strChoosebyCoverage_Vehicle = lhm_TestCase_Table_Data.get("BI_IV_Select");

			GuidewireAutomate_Validation("ValidationResults Header", ValidationResults_Header, "equals", "Validation Results");
			GuidewireAutomate_Validation("Warnings Title", ValidationResults_WarningTitle, "equals", "Warnings:");
			By ValidationResults_Warning_First = By.xpath("//div[contains(@id,'WebMessageWorksheetScreen')]//div[contains(text(),'Gross incurred for " + strChoosebyCoverage_Vehicle + "')]");
			GuidewireAutomate_Validation("Warnings First", ValidationResults_Warning_First, "contains", "Validation errors were found in an object of type ReserveSet that was auto-created by rules:");

			GuidewireAutomate("Clear Button", ValidationResults_ClearButton, "clickAndwait", "click");
			GuidewireAutomate("Update Button", NewExposureUpdateButton, "clickAndwait", "click");
			GuidewireAutomate_Validation("Exposure Header", ExposureHeader, "equals", "Exposures");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void AddDescription() throws Throwable {
		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("newExposure");

		try {

			GuidewireAutomate("Damage Description", DamageDescription_Exposure, "clearANDsendKeys", lhm_TestCase_Table_Data.get("DamageDescription"));
			GuidewireAutomate("Update Button", NewExposureUpdateButton, "clickAndwait", "click");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void AllClaimant() throws Throwable {

		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("newExposure");
		try {
			GuidewireAutomate_Validation("Claimant Title", EditIncidentClaimantTitle, "equals", "Claimant");
			GuidewireAutomate("Name", ClaimantName, "selectByVisibleText", lhm_TestCase_Table_Data.get("ClaimantName"));

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void PIPClaimant() throws Throwable {
		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("newExposure");

		try {
			GuidewireAutomate_Validation("Section", EditIncidentClaimantTitle, "equals", "Claimant");
			GuidewireAutomate("Select Claimant", PIPNewExposure_Claimant, "selectByVisibleText", lhm_TestCase_Table_Data.get("ClaimantName"));

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void VehicleNewIncident() throws Throwable {
		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("newExposure");

		try {
			GuidewireAutomate("NewIncident_Description", NewIncident_Description, "moveToElement", "NewIncident_Description");
			GuidewireAutomate_Validation("Description", NewIncident_Description, "equals", "Description");

			GuidewireAutomate_Validation("IncidentOverview Title", EditIncident_IncidentOverviewTitle, "equals", "Incident Overview");
			GuidewireAutomate("NewIncident Button", EditIncident_VehicleEditButton, "clickAndwait", "click");
			GuidewireAutomate("New Incident", EditIncident_VehicleNewIncident, "clickAndwait", "click");
			GuidewireAutomate_Validation("NewVehicleIncident Header", NewVehicleIncident_Header, "equals", "New Vehicle Incident");
			GuidewireAutomate_Validation("Details Title", NewVehicleIncident_DetailsTitle, "equals", "Details");
			GuidewireAutomate_Validation("InvolvedVehicle Title", InvolvedVehicleTitle, "equals", "Involved Vehicle");
			GuidewireAutomate("Select vehicle", NewVehicleIncident_SelectVehicle, "selectByVisibleText", "New...");
			GuidewireAutomate("Year", NewVehicleIncident_Year, "clearANDsendKeys", lhm_TestCase_Table_Data.get("VehicleYear"));
			GuidewireAutomate("Make", NewVehicleIncident_Make, "clearANDsendKeys", lhm_TestCase_Table_Data.get("VehicleMake"));
			GuidewireAutomate("Model", NewVehicleIncident_Model, "clearANDsendKeys", lhm_TestCase_Table_Data.get("VehicleModel"));
			GuidewireAutomate_Validation("DriverOfInvolvedVehicle Title", DriverOfInvolvedVehicleTitle, "equals", "Driver of Involved Vehicle");
			GuidewireAutomate("Driver Name", DriverName, "selectByVisibleText", lhm_TestCase_Table_Data.get("DriverName"));
			GuidewireAutomate_Validation("LoanInformation Title", LoanInformationTitle, "equals", "Loan Information");
			GuidewireAutomate_Validation("ServicesToPerform Title", ServicesToPerformTitle, "equals", "Services to Perform");
			GuidewireAutomate_Validation("DamageDescription Title", DamageDescriptionTitle, "equals", "Damage Description");
			GuidewireAutomate("Damage Description", DamageDescription, "clearANDsendKeys", lhm_TestCase_Table_Data.get("DamageDescription"));
			GuidewireAutomate_Validation("Details Title", DetailsTitle, "equals", "Details");
			GuidewireAutomate("Loss Occurred", DetailsLossOccurred, "selectByVisibleText", lhm_TestCase_Table_Data.get("LossOccurred"));
			GuidewireAutomate("Ok Button", Incident_OkButton, "clickAndwait", "click");
			GuidewireAutomate("Update Button", NewExposureUpdateButton, "clickAndwait", "click");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void VehicleEditIncident() throws Throwable {
		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("newExposure");

		try {

			GuidewireAutomate("NewIncident_Description", NewIncident_Description, "moveToElement", "NewIncident_Description");
			GuidewireAutomate_Validation("Description", NewIncident_Description, "equals", "Description");

			GuidewireAutomate_Validation("IncidentOverview Title", EditIncident_IncidentOverviewTitle, "equals", "Incident Overview");
			GuidewireAutomate("Edit Incident Button", EditIncident_VehicleEditButton, "clickAndwait", "click");
			GuidewireAutomate("Edit Incident", EditIncident_VehicleEditIncident, "clickAndwait", "click");
			GuidewireAutomate_Validation("VehicleIncident Header", EditVehicleIncidentHeader, "equals", "Vehicle Incident");
			GuidewireAutomate_Validation("Details Title", NewVehicleIncident_DetailsTitle, "equals", "Details");
			GuidewireAutomate_Validation("DriverOfInvolvedVehicle Title", DriverOfInvolvedVehicleTitle, "equals", "Driver of Involved Vehicle");
			GuidewireAutomate("Driver Name", DriverName, "selectByVisibleText", lhm_TestCase_Table_Data.get("DriverName"));
			GuidewireAutomate_Validation("LoanInformation Title", LoanInformationTitle, "equals", "Loan Information");
			GuidewireAutomate_Validation("ServicesToPerform Title", ServicesToPerformTitle, "equals", "Services to Perform");
			GuidewireAutomate_Validation("DamageDescription Title", DamageDescriptionTitle, "equals", "Damage Description");
			GuidewireAutomate("Damage Description", DamageDescription, "clearANDsendKeys", lhm_TestCase_Table_Data.get("DamageDescription"));
			GuidewireAutomate_Validation("Details Title", DetailsTitle, "equals", "Details");
			GuidewireAutomate("Loss Occurred", DetailsLossOccurred, "selectByVisibleText", lhm_TestCase_Table_Data.get("LossOccurred"));
			GuidewireAutomate("Ok Button", Incident_OkButton, "clickAndwait", "click");
			GuidewireAutomate("Update Button", NewExposureUpdateButton, "clickAndwait", "click");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void InjuryNewIncident() throws Throwable {
		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("newExposure");

		try {

			GuidewireAutomate("NewIncident_Description", NewIncident_Description, "moveToElement", "NewIncident_Description");
			GuidewireAutomate_Validation("Description", NewIncident_Description, "equals", "Description");

			GuidewireAutomate_Validation("Injury Incident Overview", NE_IncidentOverviewTitle, "equals", "Injury Incident Overview");
			GuidewireAutomate("EditIncident Button", NewIncident_InjuryEditButton, "clickAndwait", "click");
			GuidewireAutomate("Edit Incident", EditIncident_VehicleNewIncident, "clickAndwait", "click");
			GuidewireAutomate_Validation("InjuryIncident Header", EditVehicleIncidentHeader, "equals", "Injury Incident");
			GuidewireAutomate_Validation("InjuryDetails Title", NewInjuryIncident_InjuryDetailsTitle, "equals", "Injury Details");
			GuidewireAutomate("Injured Person", NewInjuryIncident_InjuredPerson, "selectByVisibleText", lhm_TestCase_Table_Data.get("InjuredPersonName"));
			GuidewireAutomate("Loss Party", NewInjuryIncident_LossParty, "selectByVisibleText", lhm_TestCase_Table_Data.get("LossParty"));
			GuidewireAutomate("Describe Injuries", NewInjuryIncident_DescribeInjuries, "clearANDsendKeys", lhm_TestCase_Table_Data.get("DescribeInjuries"));
			GuidewireAutomate("Ok Button", Incident_OkButton, "clickAndwait", "click");
			GuidewireAutomate("Update Button", NewExposureUpdateButton, "clickAndwait", "click");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void InjuryNewIncident_AddBodyPart() throws Throwable {
		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("newExposure");

		try {
			GuidewireAutomate("NewIncident_Description", NewIncident_Description, "moveToElement", "NewIncident_Description");
			GuidewireAutomate_Validation("Description", NewIncident_Description, "equals", "Description");

			GuidewireAutomate_Validation("Injury Incident Overview", NE_IncidentOverviewTitle, "equals", "Injury Incident Overview");
			GuidewireAutomate("EditIncident Button", NewIncident_InjuryEditButton, "clickAndwait", "click");
			GuidewireAutomate("Edit Incident", EditIncident_VehicleNewIncident, "clickAndwait", "click");
			GuidewireAutomate_Validation("InjuryIncident Header", EditVehicleIncidentHeader, "equals", "Injury Incident");
			GuidewireAutomate_Validation("InjuryDetails Title", NewInjuryIncident_InjuryDetailsTitle, "equals", "Injury Details");
			GuidewireAutomate("Injured Person", NewInjuryIncident_InjuredPerson, "selectByVisibleText", lhm_TestCase_Table_Data.get("InjuredPersonName"));
			GuidewireAutomate("Loss Party", NewInjuryIncident_LossParty, "selectByVisibleText", lhm_TestCase_Table_Data.get("LossParty"));
			GuidewireAutomate("Describe Injuries", NewInjuryIncident_DescribeInjuries, "clearANDsendKeys", lhm_TestCase_Table_Data.get("DescribeInjuries"));
			GuidewireAutomate("Add Button Body Parts", NewInjuryIncident_AddButton, "clickAndwait", "click");
			GuidewireAutomate("Area of Body", NewInjuryIncident_AreaOfBody, "selectByVisibleTextAndwait", "Neck");
			Thread.sleep(500);
			GuidewireAutomate("Body Part", NewInjuryIncident_BodyPart, "selectByVisibleTextAndwait", "Vertebrae");
			Thread.sleep(500);
			GuidewireAutomate("PPD Percentage", NewInjuryIncident_PPDPercenrage, "clearANDsendKeys", "5");
			GuidewireAutomate("Ok Button", Incident_OkButton, "clickAndwait", "click");
			GuidewireAutomate("Update Button", NewExposureUpdateButton, "clickAndwait", "click");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void PropertyNewIncident() throws Throwable {
		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("newExposure");

		try {
			GuidewireAutomate_Validation("IncidentOverview Title", EditIncident_IncidentOverviewTitle, "equals", "Incident Overview");
			GuidewireAutomate("EditIncident Button", NewIncident_InjuryEditButton, "clickAndwait", "click");
			GuidewireAutomate("Edit Incident", EditIncident_VehicleNewIncident, "clickAndwait", "click");

			GuidewireAutomate_Validation("NewPropertyIncident Header", EditVehicleIncidentHeader, "equals", "New Property Incident");
			GuidewireAutomate_Validation("Details Title", NewVehicleIncident_DetailsTitle, "equals", "Details");

			GuidewireAutomate_Validation("Damage Title", NewPropertyIncident_DamageTitle, "equals", "Damage");
			GuidewireAutomate("Property Description", NewPropertyIncident_PropertyDescription, "clearANDsendKeys", lhm_TestCase_Table_Data.get("PropertyDescription"));
			GuidewireAutomate("Damage Description", NewPropertyIncident_DamageDescription, "clearANDsendKeys", lhm_TestCase_Table_Data.get("DamageDescription"));

			GuidewireAutomate_Validation("Property Title", NewPropertyIncident_PropertyTitle, "equals", "Property");
			GuidewireAutomate("Property Owner", NewPropertyIncident_Owner, "selectByVisibleText", lhm_TestCase_Table_Data.get("ClaimantName"));
			GuidewireAutomate("Property Name", NewPropertyIncident_PropertyName, "selectByVisibleTextAndwait", "New...");
			getStaleElement("Country", NewPropertyIncident_Country);
			GuidewireAutomate("Country", NewPropertyIncident_Country, "selectByVisibleTextAndwait", "United States");
			GuidewireAutomate("State", NewPropertyIncident_State, "selectByVisibleTextAndwait", lhm_TestCase_Table_Data.get("StateName"));
			GuidewireAutomate("Address", NewPropertyIncident_Address, "clearANDsendKeys", "123 valley Main road");

			GuidewireAutomate("Ok Button", Incident_OkButton, "clickAndwait", "click");

			GuidewireAutomate("Update Button", NewExposureUpdateButton, "clickAndwait", "click");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void Location() throws Throwable {
		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("newExposure");

		try {
			GuidewireAutomate("Location", NewExposureLocation, "selectByVisibleText", lhm_TestCase_Table_Data.get("Location"));
			GuidewireAutomate("Update Button", NewExposureUpdateButton, "clickAndwait", "click");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void UpdateButton() throws Throwable {
		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("newExposure");

		try {

			GuidewireAutomate("Update Button", NewExposureUpdateButton, "clickAndwait", "click");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void ValidatioErrorMessage() throws Throwable {

		try {
			GuidewireAutomate_Validation("ValidationResults Header", ValidationResults_Header, "equals", "Validation Results");

			GuidewireAutomate_Validation("Warnings Title", ValidationResults_WarningTitle, "equals", "Warnings:");
			GuidewireAutomate_Validation("Warnings First", ValidationResults_Warning_First, "contains", "(2) 1st Party Vehicle - PGNUtwMRX Automation ($2,500.00) exceeds the exposure limit of $15.00");
			GuidewireAutomate_Validation("Warnings Second", ValidationResults_Warning_Second, "contains", "2002 Acura RL ($2,500.00) of type Rental Reimbursement exceeds the incident limit of $450.00");

			GuidewireAutomate("Clear Button", ValidationResults_ClearButton, "clickAndwait", "click");

			GuidewireAutomate("Update Button", NewExposureUpdateButton, "clickAndwait", "click");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	// Autor:Pankaj
	// Date :22/12/2021
	// Description: validate Open exposure Reason
	public static void Reopen_Exposure_VerifyOutcome() throws Throwable {
		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("newExposure");

		try {
			GuidewireAutomate_Validation("Screen Header", ExposureHeader, "equals", "Exposures");
			GuidewireAutomate("Exposure", Exposure1, "clickAndwait", "click");
			GuidewireAutomate("Reopen Button", ExposureReopenButton, "clickAndwait", "click");
			GuidewireAutomate_Validation("Reason", ExposureReopenReason, "getOptionscontains", lhm_TestCase_Table_Data.get("Reopen_Reason"));

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	// Autor:MISBA
	// Date :2/12/2021
	// Description: validate claimant type list values
	public static void Exposure_ClaimantType() throws Throwable {
		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("newExposure");

		try {
			GuidewireAutomate_Validation("Screen Header", ExposureHeader, "equals", "Exposures");
			GuidewireAutomate("Exposure", Exposure1, "clickAndwait", "click");
			GuidewireAutomate("Edit Button", ExposureEditButton, "clickAndwait", "click");
			Thread.sleep(500);
			GuidewireAutomate_Validation("Claimant Type", ExposureClaimantType, "getOptionscontains", lhm_TestCase_Table_Data.get("Claimant_Type"));

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	// Autor:MISBA
	// Date :6/12/2021
	// Description: Both "Insured's loss and Third-party liability" should be displayed in the Loss Party field
	public static void NewExposureGeneral_InsuredAndThirdPartyShouldDisplay() throws Throwable {
		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("newExposure");

		try {
			GuidewireAutomate("General Damage", PLC_GeneralDamage2, "clickAndwait", "click");
			Thread.sleep(500);
			GuidewireAutomate_Validation("Screen Header", NewExposureGeneral_Header, "equals", "New Exposure - General");

			GuidewireAutomate("Name", ClaimantName, "selectByVisibleText", lhm_TestCase_Table_Data.get("ClaimantName"));
			GuidewireAutomate("GeneralDamageIncident", GeneralDamageIncidentOverview, "moveToElement", "General Damage Incident Overview");
			GuidewireAutomate_Validation("General Damage Incident Overview", GeneralDamageIncidentOverview, "equals", "General Damage Incident Overview");
			GuidewireAutomate("NewIncident Button", NewIncident_GeneralEditButton, "moveToElement", "moveToElement");

			GuidewireAutomate("NewIncident Button", NewIncident_GeneralEditButton, "clickAndwait", "click");
			Thread.sleep(500);
			//
			GuidewireAutomate("New Incident", EditIncident_VehicleNewIncident, "clickAndwait", "click");
			GuidewireAutomate_Validation("Screen Header", NewGeneralDamageIncident_Header, "equals", "New General Damage Incident");

			GuidewireAutomate_Validation("Damage Severity", Damage_Severity, "getOptionscontains", lhm_TestCase_Table_Data.get("Damage_Severity"));
			Thread.sleep(500);
			GuidewireAutomate("Damage Description", NewPropertyIncident_DamageDescription, "clearANDsendKeys", "Test");

		} catch (Exception e) {
			GuidewireAutomate("NewIncident Button", NewIncident_GeneralEditButton, "moveToElement", "moveToElement");

			GuidewireAutomate("NewIncident Button", NewIncident_GeneralEditButton, "clickAndwait", "click");
			Thread.sleep(500);
			//
			GuidewireAutomate("New Incident", EditIncident_VehicleNewIncident, "clickAndwait", "click");
			GuidewireAutomate_Validation("Screen Header", NewGeneralDamageIncident_Header, "equals", "New General Damage Incident");

			GuidewireAutomate_Validation("Damage Severity", Damage_Severity, "getOptionscontains", lhm_TestCase_Table_Data.get("Damage_Severity"));
			Thread.sleep(500);
			GuidewireAutomate("Damage Description", NewPropertyIncident_DamageDescription, "clearANDsendKeys", "Test");
			e.printStackTrace();
			throw e;
		}
	}

	// Autor:MISBA
	// Date :2/12/2021
	// Description: Verify whether user should not see the values of 'Unnecessary' in the Outcome typelist when closing the Exposure
	public static void NewExposureGeneral_OutcomeTypeList() throws Throwable {
		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("newExposure");

		try {
			Thread.sleep(500);
			GuidewireAutomate("General Damage", PLC_GeneralDamage2, "clickAndwait", "click");
			Thread.sleep(500);
			GuidewireAutomate_Validation("Screen Header", NewExposureGeneral_Header, "equals", "New Exposure - General");

			GuidewireAutomate("Claimant", ClaimantName, "selectByVisibleText", lhm_TestCase_Table_Data.get("ClaimantName"));
			GuidewireAutomate("GeneralDamageIncident", GeneralDamageIncidentOverview, "moveToElement", "General Damage Incident Overview");
			GuidewireAutomate_Validation("General Damage Incident Overview", GeneralDamageIncidentOverview, "equals", "General Damage Incident Overview");
			GuidewireAutomate("NewIncident Button", NewIncident_GeneralEditButton, "moveToElement", "moveToElement");

			GuidewireAutomate("NewIncident Button", NewIncident_GeneralEditButton, "clickAndwait", "click");
			Thread.sleep(500);
			//
			GuidewireAutomate("New Incident", EditIncident_VehicleNewIncident, "clickAndwait", "click");
			GuidewireAutomate_Validation("Screen Header", NewGeneralDamageIncident_Header, "equals", "New General Damage Incident");
			GuidewireAutomate("Select Loss Party", General_LossParty, "selectByVisibleText", lhm_TestCase_Table_Data.get("General_Claimant"));
			Thread.sleep(500);
			GuidewireAutomate("Damage Severity", Damage_Severity, "selectByVisibleText", lhm_TestCase_Table_Data.get("Damage_Severity"));
			Thread.sleep(500);
			GuidewireAutomate("Damage Description", NewPropertyIncident_DamageDescription, "clearANDsendKeys", "Test");
			GuidewireAutomate("Ok Button", Incident_OkButton, "clickAndwait", "click");
			GuidewireAutomate("Update Button", NewExposureUpdateButton, "clickAndwait", "click");

			By Warning      = By.xpath("//div[@id='wsTabBar-wsTab_0']//div[@role='tab']");
			By WarningClear = By.xpath("//div[contains(@id,'WebMessageWorksheet_ClearButton')]//div[@role='button']");
			GuidewireAutomate_Validation("Warning", Warning, "equals", "Validation Results");
			GuidewireAutomate("Clear", WarningClear, "clickAndwait", "click");
			GuidewireAutomate("Update Button", NewExposureUpdateButton, "clickAndwait", "click");

			GuidewireAutomate_Validation("Exposure Header", ExposureHeader, "equals", "Exposures");
			GuidewireAutomate("Exposure GeneralCheckBox", Exposure_GeneralCheckBox, "clickAndwait", "click");
			GuidewireAutomate("CloseExposure Button", E_CloseExposure_Button, "clickAndwait", "click");
			GuidewireAutomate_Validation("CloseExposure Outcome", CE_Outcome, "getOptionscontains", lhm_TestCase_Table_Data.get("CloseExposureOutcome"));

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Author:Pankaj Date :12/12/2021 Description: Create Exposure
	 * 
	 */
	public static void CreateNewExposure() throws Throwable {
		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("newExposure");

		try {
			GuidewireAutomate_Validation("Screen Header", NewExposureHeader, "contains", "New Exposure");

			GuidewireAutomate("Claimant", ClaimantName, "selectByVisibleText", lhm_TestCase_Table_Data.get("ClaimantName"));
			GuidewireAutomate("Claimant Type", ClaimantType, "selectByVisibleText", lhm_TestCase_Table_Data.get("ClaimantType"));

			// General Damage Incident Overview
			getStaleElement("General Damage Incident Overview", GeneralDamageIncidentOverview);
			GuidewireAutomate("General Damage Incident Overview", GeneralDamageIncidentOverview, "moveToElement", "General Damage Incident Overview");
			GuidewireAutomate_Validation("General Damage Incident Overview", GeneralDamageIncidentOverview, "equals", "General Damage Incident Overview");
			Thread.sleep(3000);
			GuidewireAutomate("General Damage Incident Type", GDI_Open, "clickAndwait", "click");

			GuidewireAutomate("New Incident", GDI_NewIncident, "clickAndwait", "click");

			GuidewireAutomate_Validation("Screen Header", NewGeneralDamageIncident_Header, "equals", "New General Damage Incident");
			GuidewireAutomate("Select Loss Party", General_LossParty, "selectByVisibleText", lhm_TestCase_Table_Data.get("ClaimantName"));

			GuidewireAutomate("Damage Severity", Damage_Severity, "selectByVisibleText", lhm_TestCase_Table_Data.get("Damage_Severity"));
			getStaleElement("Damage Description", NewPropertyIncident_DamageDescription);
			GuidewireAutomate("Damage Description", NewPropertyIncident_DamageDescription, "clearANDsendKeys", "Test");
			getStaleElement("Ok Button", Incident_OkButton);
			GuidewireAutomate("Ok Button", Incident_OkButton, "clickAndwait", "click");

			getStaleElement("Update Button", NewExposureUpdateButton);
			GuidewireAutomate("Update Button", NewExposureUpdateButton, "clickAndwait", "click");

			/*
			 * By Warning = By.xpath("//div[@id='wsTabBar-wsTab_0']//div[@role='tab']"); By WarningClear =
			 * By.xpath("//div[contains(@id,'WebMessageWorksheet_ClearButton')]//div[@role='button']");
			 * 
			 * GuidewireAutomate_Validation("Warning", Warning, "equals", "Validation Results"); GuidewireAutomate("Clear", WarningClear,
			 * "clickAndwait", "click");
			 */

			/*
			 * getStaleElement("Update Button", NewExposureUpdateButton); GuidewireAutomate("Update Button", NewExposureUpdateButton, "clickAndwait",
			 * "click");
			 */
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Author:Pankaj Date :12/12/2021 Description: Create Exposure
	 * 
	 */
	public static void CreateNewExposureWithInciddent() throws Throwable {
		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("newExposure");

		try {
			GuidewireAutomate_Validation("Screen Header", NewExposureHeader, "contains", "New Exposure");

			GuidewireAutomate("Name", ClaimantName, "selectByVisibleText", lhm_TestCase_Table_Data.get("ClaimantName"));
			GuidewireAutomate("Claimant Type", ClaimantType, "selectByVisibleText", lhm_TestCase_Table_Data.get("ClaimantType"));

			// General Damage Incident Overview
			getStaleElement("General Damage Incident Overview", GeneralDamageIncidentOverview);
			GuidewireAutomate("General Damage Incident Overview", GeneralDamageIncidentOverview, "moveToElement", "General Damage Incident Overview");
			GuidewireAutomate_Validation("General Damage Incident Overview", GeneralDamageIncidentOverview, "equals", "General Damage Incident Overview");
			GuidewireAutomate("General Damage Incident Type", GDI_Open, "clickAndwait", "click");
			GuidewireAutomate("New Incident", GDI_NewIncident, "clickAndwait", "click");

			GuidewireAutomate_Validation("Screen Header", NewGeneralDamageIncident_Header, "equals", "New General Damage Incident");
			GuidewireAutomate("Select Loss Party", General_LossParty, "selectByVisibleText", lhm_TestCase_Table_Data.get("General_Claimant"));

			GuidewireAutomate("Damage Severity", Damage_Severity, "selectByVisibleText", lhm_TestCase_Table_Data.get("Damage_Severity"));
			getStaleElement("Damage Description", NewPropertyIncident_DamageDescription);
			GuidewireAutomate("Damage Description", NewPropertyIncident_DamageDescription, "clearANDsendKeys", "Test");
			getStaleElement("Ok Button", Incident_OkButton);
			GuidewireAutomate("Ok Button", Incident_OkButton, "clickAndwait", "click");

			getStaleElement("Update Button", NewExposureUpdateButton);
			GuidewireAutomate("Update Button", NewExposureUpdateButton, "clickAndwait", "click");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Author:Pankaj Date :12/12/2021 Description: Close Exposure
	 * 
	 */
	public static void CloseExposure(int RownNo) throws Throwable {

		try {

			lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("newExposure");

			if (!lhm_TestCase_Table_Data.get("CloseExposureOutcome").trim().isEmpty()) {

				GuidewireAutomate_Validation("Screen Header", ExposureHeader, "equals", "Exposures");
				By Exposure = By.xpath("//input[contains(@name,'ExposuresLV-" + (RownNo - 1) + "-_Checkbox')]");

				GuidewireAutomate("Exposure Check Box", Exposure, "clickAndwait", "click");
				GuidewireAutomate("Close Exposure", E_CloseExposure_Button, "clickAndwait", "click");

				GuidewireAutomate_Validation("Screen Header", CloseExposure_Header, "contains", "Close Exposure");
				getStaleElement("Out Come", CE_Outcome);

				GuidewireAutomate("Note", CE_Note, "clearANDsendKeys", lhm_TestCase_Table_Data.get("CloseExposureNote"));
				GuidewireAutomate("Out Come", CE_Outcome, "selectByVisibleText", lhm_TestCase_Table_Data.get("CloseExposureOutcome"));
				GuidewireAutomate("Close Exposure Button", CE_CloseExposure_Button, "clickAndwait", "click");

				GuidewireAutomate_Validation("Screen Header", ExposureHeader, "equals", "Exposures");
				By EXP_status = By.xpath("//td[contains(@id,'ExposuresLV-" + (RownNo - 1) + "-Status')]//div[text()='Closed']");
				GuidewireAutomate_Validation("Status", EXP_status, "equals", "Closed");

				oExtentTest.log(Status.PASS, "Close Exposure is Successful");
			}

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Author - Pankaj Date - 01/12/2021 Description - Check in Action Menu ->Policy Level Coverages "Validate BodilyInjury"
	 */
	public static void PolicyLevelCoverages_BodilyInjury() throws Throwable {
		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("newExposure");
		try {
			GuidewireAutomate_Validation("Bodily Injury", PLC_BodilyInjury, "equals", lhm_TestCase_Table_Data.get("PolicyLevelCoverage1"));
			GuidewireAutomate("Bodily Injury", PLC_BodilyInjury, "clickAndwait", "click");
			GuidewireAutomate_Validation("Bodily Injury Header", NewExposureHeader, "equals", lhm_TestCase_Table_Data.get("ExposureType1"));
			GuidewireAutomate_Validation("Loss Party", PLC_LossPartyBodily, "equals", lhm_TestCase_Table_Data.get("LossParty1"));

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Author - Pankaj Date - 01/12/2021 Description - Check in Action Menu ->Policy Level Coverages "Validate General Damage"
	 */
	public static void PolicyLevelCoverages_GeneralDamage() throws Throwable {
		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("newExposure");

		try {
			GuidewireAutomate_Validation("General Damage", PLC_GeneralDamage, "equals", lhm_TestCase_Table_Data.get("PolicyLevelCoverage2"));
			GuidewireAutomate("General Damage", PLC_GeneralDamage, "clickAndwait", "click");
			GuidewireAutomate_Validation("General Damage Header", NewExposureHeader, "equals", lhm_TestCase_Table_Data.get("ExposureType2"));
			GuidewireAutomate_Validation("Loss Party", PLC_LossPartyGeneral, "equals", lhm_TestCase_Table_Data.get("LossParty2"));

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Author - Pankaj Date - 01/12/2021 Description - Check in Action Menu ->Policy Level Coverages "Validate General Damage"
	 */
	public static void PolicyLevelCoverages_Property() throws Throwable {
		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("newExposure");

		try {
			GuidewireAutomate_Validation("Property", PLC_Property, "equals", lhm_TestCase_Table_Data.get("PolicyLevelCoverage3"));
			GuidewireAutomate("Property", PLC_Property, "clickAndwait", "click");
			GuidewireAutomate_Validation("Property Header", NewExposureHeader, "equals", lhm_TestCase_Table_Data.get("ExposureType3"));
			GuidewireAutomate_Validation("Loss Party", PLC_LossPartyGeneral, "equals", lhm_TestCase_Table_Data.get("LossParty3"));

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Author - Pankaj Date - 01/12/2021 Description - Check in Action Menu ->Policy Level Coverages "Validate General Damage Insured Party"
	 */
	public static void PolicyLevelCoverages_GeneralDamageInsured() throws Throwable {
		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("newExposure");

		try {
			GuidewireAutomate_Validation("General Damage Insured", PLC_GeneralDamageInsured, "equals", lhm_TestCase_Table_Data.get("PolicyLevelCoverage1"));
			GuidewireAutomate("General Damage Insured", PLC_GeneralDamageInsured, "clickAndwait", "click");
			GuidewireAutomate_Validation("General Damage Header", NewExposureHeader, "equals", lhm_TestCase_Table_Data.get("ExposureType2"));
			GuidewireAutomate_Validation("Loss Party", PLC_LossPartyGeneral, "equals", lhm_TestCase_Table_Data.get("LossParty1"));

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Owner : Rahul Dixit
	 */
	public static void AllClaimantInfo() throws Throwable {
		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("newExposure");
		try {
			GuidewireAutomate("Claimant name", ClaimantName, "selectByVisibleText", lhm_TestCase_Table_Data.get("ClaimantName"));
			GuidewireAutomate("Claimant Type", ClaimantType, "selectByVisibleText", lhm_TestCase_Table_Data.get("Claimant_Type"));

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Owner : Rahul Dixit
	 */
	public static void AddPolicylevelCoverage() throws Throwable {
		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("newExposure");
		try {
			GuidewireAutomate("Claimant Type", AddPolicyLevel_Type, "selectByVisibleText", lhm_TestCase_Table_Data.get("ClaimantName"));
			GuidewireAutomate("Claimant Form", AddPolicyLevel_Form, "selectByVisibleText", lhm_TestCase_Table_Data.get("Claimant_Type"));
			GuidewireAutomate("Retro Date", AddPolicyLevel_RetroDate, "clearANDsendKeys", lhm_TestCase_Table_Data.get("RetroDate"));
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Owner:Rahul Dixit
	 */
	public static void AddInjury() throws Throwable {
		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("newExposure");

		try {
			GuidewireAutomate("Add Injury Button", Add_InjuryButton, "clickAndwait", "click");
			GuidewireAutomate("New Incident", Add_NewIncident, "clickAndwait", "click");
			Thread.sleep(500);
			GuidewireAutomate("Loss Party", LossParty, "selectByVisibleText", lhm_TestCase_Table_Data.get("LossParty"));
			CC_Reusables.clickButton("OK");
			Thread.sleep(500);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Owner:Rahul Dixit
	 */
	public static void AddInjuryAfterFNOL() throws Throwable {

		try {
			lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("newExposure");

			GuidewireAutomate("Add Injury Button", Add_InjuryButton, "clickAndwait", "click");
			GuidewireAutomate("New Incident", Add_NewIncident, "clickAndwait", "click");
			Thread.sleep(500);
			GuidewireAutomate("Owner", Owner, "selectByVisibleText", lhm_TestCase_Table_Data.get("LossParty"));
			GuidewireAutomate("Severity", Severity, "selectByVisibleText", lhm_TestCase_Table_Data.get("Damage_Severity"));
			GuidewireAutomate("Damage Description", Damage, "clearANDsendKeys", lhm_TestCase_Table_Data.get("DamageDescription"));

			CC_Reusables.clickButton("OK");
			Thread.sleep(500);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Author - Pankaj Date - 01/12/2021 Description - Check in Action Menu ->Policy Level Coverages "Validate General Damage Third Party"
	 */
	public static void PolicyLevelCoverages_GeneralDamageThird() throws Throwable {
		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("newExposure");

		try {
			GuidewireAutomate_Validation("General Damage Third Party", PLC_GeneralDamageThird, "equals", lhm_TestCase_Table_Data.get("PolicyLevelCoverage2"));
			GuidewireAutomate("General Damage Third", PLC_GeneralDamageThird, "clickAndwait", "click");
			GuidewireAutomate_Validation("General Damage Header", NewExposureHeader, "equals", lhm_TestCase_Table_Data.get("ExposureType2"));
			GuidewireAutomate_Validation("Loss Party", PLC_LossPartyGeneral, "equals", lhm_TestCase_Table_Data.get("LossParty2"));

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void PolicyLevelCoverages_RemovedExposure() throws Throwable {
		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("newExposure");

		try {
			// String ExposureList = null;
			String ExposureList = lhm_TestCase_Table_Data.get("ExposureType");
			By     Exposure     = By.xpath("//div[@class='gw-label' and text()='Liability']");

			VerifyElementNotExist(ExposureList + " Liability: ", Exposure);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void newExposure(int intRowNO) throws Throwable {

		try {

			lhm_TestCase_Table_Data = CC_Reusables.getData_Row_ClaimsCenter("newExposure", intRowNO);

			GuidewireAutomate_Validation("Section", CC_NewClaimWizard.SAC_Exposures, "equals", "Exposures");

			String strNewExposure_Menu1 = lhm_TestCase_Table_Data.get("NewExposure_Menu1").trim();
			String strNewExposure_Menu2 = lhm_TestCase_Table_Data.get("NewExposure_Menu2").trim();
			String strNewExposure_Menu3 = lhm_TestCase_Table_Data.get("NewExposure_Menu3").trim();

			if (!strNewExposure_Menu1.isEmpty()) {

				// if (IsElementDisplayed("No data to display", ClaimCenter_Resuables_PO.Nodatatodisplay)) {
				GuidewireAutomate("New Exposure", CC_NewClaimWizard.SAC_E_NewExposure_Button, "clickAndwait", "click");
				Thread.sleep(2000);
				if (!strNewExposure_Menu1.isEmpty()) {
					By SAC_E_NewExposure_Menu = By.xpath("//div[contains(@id,'NewExposureLV_tb-AddExposure-0-item')]/div[@role='menuitem']/div[@class='gw-label' and text()='" + strNewExposure_Menu1 + "']");
					GuidewireAutomate("Menu1 =" + strNewExposure_Menu1, SAC_E_NewExposure_Menu, "moveToElement", "click");
				}
				if (!strNewExposure_Menu2.isEmpty()) {
					By SAC_E_NewExposure_Menu = By.xpath("//div[contains(@id,'NewExposureLV_tb-AddExposure-0-item')]/div[@role='menuitem']/div[@class='gw-label' and text()='" + strNewExposure_Menu2 + "']");
					GuidewireAutomate("Menu2 =" + strNewExposure_Menu2, SAC_E_NewExposure_Menu, "moveToElement", "click");
					if (strNewExposure_Menu3.isEmpty()) {
						GuidewireAutomate("Menu3 =" + strNewExposure_Menu3, SAC_E_NewExposure_Menu, "click", "click");
					}
				}
				if (!strNewExposure_Menu3.isEmpty()) {
					By SAC_E_NewExposure_Menu = By.xpath("//div[contains(@id,'NewExposureLV_tb-AddExposure-0-item')]/div[@role='menuitem']/div[@class='gw-label' and text()='" + strNewExposure_Menu3 + "']");
					GuidewireAutomate("Menu " + strNewExposure_Menu3, SAC_E_NewExposure_Menu, "clickAndwait", "click");
				}

				// }

				GuidewireAutomate_Validation("Screen Header", NewExposureHeader, "contains", "New Exposure");

				GuidewireAutomate_Validation("Section", ExposureTitle, "equals", "Exposure");

				GuidewireAutomate_Validation("Section", EditIncidentClaimantTitle, "equals", "Claimant");
				String strClaimantName = lhm_TestCase_Table_Data.get("Claimant_NP_FirstName") + " " + lhm_TestCase_Table_Data.get("Claimant_NP_LastName");
				strClaimantName = lhm_TestCase_Table_Data.get("ClaimantName");
				if (getOptions_Element(ClaimantName).contains(strClaimantName)) {
					GuidewireAutomate("Claimant name", ClaimantName, "selectByVisibleText", strClaimantName);
					GuidewireAutomate("Claimant Type", ClaimantType, "selectByVisibleText", lhm_TestCase_Table_Data.get("ClaimantType"));
				} else {
					GuidewireAutomate("Select", Claimant_PickerMenu, "clickAndwait", "click");
					getStaleElement("NewPerson", Claimant_Menu_NewPerson);
					GuidewireAutomate("NewPerson", Claimant_Menu_NewPerson, "clickAndwait", "click");

					GuidewireAutomate_Validation("Screen Header", CC_NewClaimWizard_PO.RBNewPerson_Header, "equals", "New Person");
					GuidewireAutomate("First Name", CC_NewClaimWizard_PO.RBNewPerson_Firstname, "clearANDsendKeys", lhm_TestCase_Table_Data.get("FirstName"));
					GuidewireAutomate("Last Name", CC_NewClaimWizard_PO.RBNewPerson_Lastname, "clearANDsendKeys", lhm_TestCase_Table_Data.get("LastName"));
					CC_Reusables.clickButton("Update");

					GuidewireAutomate_Validation("Screen Header", NewExposureHeader, "contains", "New Exposure");

				}
				// GuidewireAutomate_Validation("Section", NE_IncidentOverviewTitle, "contains", "Incident Overview");

				GuidewireAutomate("OK", EditIncident_OkButton, "clickAndwait", "click");
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

}
