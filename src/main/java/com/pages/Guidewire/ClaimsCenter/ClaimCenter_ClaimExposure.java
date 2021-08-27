package com.pages.Guidewire.ClaimsCenter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;
import com.pages.Guidewire.Tab_Menu_Navigation;

public class ClaimCenter_ClaimExposure extends SeleniumWebDriver_Commands implements ClaimCenter_ClaimExposure_PO {

	public ClaimCenter_ClaimExposure(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	private static By Exposure_Header          = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and contains(text(),'Exposures')]");
	private static By Exposure_Vehicle         = By.xpath("//div[contains(@id,'ExposuresLV-0-Type')]//div[@class='gw-RangeValue']");
	private static By FirstPartyVehicle_Header = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and contains(text(),'1st Party Vehicle')]");

	private static By Edit_Button = By.xpath("//div[contains(@id,'Edit')]//div[@role='button']");

	private static By EditIncident_IncidentOverview = By.xpath("//div[contains(@id,'VehicleDamageDV-7') and @role='group']//div[text()='Incident Overview']");
	private static By IncidentOverview_button       = By.xpath("//div[contains(@id,'Incident-Vehicle_IncidentMenuIcon')]//div[@class='gw-action--expand-button']");

	private static By IncidentOverview_EditIncident = By.xpath("//div[@class='gw-action--inner gw-hasDivider']//div[@class='gw-label' and text()='Edit Incident Details...']");
	private static By VehicleIncident_Header        = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and contains(text(),'Vehicle Incident')]");

	private static By DriverofInvolvedVehicle = By.xpath("//div[contains(@id,'VehicleIncidentDV-3')]//div[@class='gw-label gw-boldLabel']");

	private static By Drivername          = By.xpath("//select[contains(@name,'Driver_Picker')]");
	private static By RelationToInsured   = By.xpath("//select[contains(@name,'RelationToInsured')]");
	private static By Damage_Description  = By.xpath("//div[contains(@id,'Description_Input')]//div[@class='gw-label gw-boldLabel']");
	private static By Damage_Text         = By.xpath("//div[contains(@id,'VehicleIncidentDV-Description')]//textarea[contains(@name,'VehicleIncidentDV-Description')]");
	private static By Details             = By.xpath("//div[contains(@id,'VehicleIncidentDV-10')]");
	private static By Details_lossoccured = By.xpath("//select[contains(@name,'LossOccured')]");
	private static By UptoExposures       = By.xpath("//div[@id='ExposureDetail-ExposureDetail_UpLink']");
	private static By ExposureHeader      = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and text()='Exposures']");
	// div[@id='ExposureDetail-ExposureDetail_Up Link']

	private static By Ok_Button                 = By.xpath("//div[contains(@id,'Update')]//div[@role='button']");
	private static By Update_Button             = By.xpath("//div[contains(@id,'ExposureDetailScreen-Update')]//div[@role='button']");
	private static By FirstPartyVehicle_Header2 = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and contains(text(),'1st Party Vehicle')]");
	private static By Validation_Header         = By.xpath("//div[@class='gw-action--inner gw-hasDivider']//div[@class='gw-label' and text()='Validation Results']");

	private static By Error_Msg = By.xpath("//div[contains(@id,'WebMessageWorksheetScreen-grpMsgs')]//div[contains(text(),'Vehicle incident description must not be empty')]");

	private static By NO_Error     = By.xpath("//div[@class='gw-message']");
	private static By Clear_Button = By.xpath("//div[contains(@id,'ClearButton')]//div[@role='button']");

	public static void ChoosebyCoverageType_Exposure(String value) throws Throwable {
		switch (value) {
			case "C" :
				GuidewireAutomate("ChoosebyCoverageType_C", ChoosebyCoverageType_C, "moveToElement", " ");
				GuidewireAutomate_Validation("Collision", ChoosebyCoverageType_C_Collision, "isDisplayed", "");
				GuidewireAutomate_Validation("CollisionLimitedCoverage", ChoosebyCoverageType_C_CollisionLimitedCoverage, "isDisplayed", "Element is Displayed");
				GuidewireAutomate_Validation("Comprehensive", ChoosebyCoverageType_C_Comprehensive, "isDisplayed", "Element is Displayed");
				break;
			case "D" :
				GuidewireAutomate("ChoosebyCoverageType_D", ChoosebyCoverageType_D, "moveToElement", " ");
				GuidewireAutomate_Validation("DeathandDisabilityBenefit", ChoosebyCoverageType_D_DeathandDisabilityBenefit, "isDisplayed", "Element is Displayed");
				break;
			case "E" :
				GuidewireAutomate("ChoosebyCoverageType_E", ChoosebyCoverageType_E, "moveToElement", " ");
				GuidewireAutomate_Validation("ElectronicEquipment", ChoosebyCoverageType_E_ElectronicEquipment, "isDisplayed", "Element is Displayed");
				break;
			case "L" :
				GuidewireAutomate("ChoosebyCoverageType_L", ChoosebyCoverageType_L, "moveToElement", " ");
				GuidewireAutomate_Validation("LiabilityBodilyInjury", ChoosebyCoverageType_L_LiabilityBodilyInjury, "isDisplayed", "Element is Displayed");
				GuidewireAutomate_Validation("LiabilityPropertyDamagey", ChoosebyCoverageType_L_LiabilityPropertyDamagey, "isDisplayed", "Element is Displayed");
				GuidewireAutomate_Validation("LiabilityVehicleDamage", ChoosebyCoverageType_L_LiabilityVehicleDamage, "isDisplayed", "Element is Displayed");
				break;
			case "M" :
				GuidewireAutomate("ChoosebyCoverageType_M", ChoosebyCoverageType_M, "moveToElement", " ");
				GuidewireAutomate("MexicoCoverageLimited", ChoosebyCoverageType_M_MexicoCoverageLimited, "moveToElement", "");
				GuidewireAutomate_Validation("MexicoCovBI", ChoosebyCoverageType_M_MexicoCovBI, "isDisplayed", "Element is Displayed");
				GuidewireAutomate_Validation("MexicoCovPD", ChoosebyCoverageType_M_MexicoCovPD, "isDisplayed", "Element is Displayed");
				GuidewireAutomate_Validation("MexicoCovVehicleDamage", ChoosebyCoverageType_M_MexicoCovVehicleDamage, "isDisplayed", "Element is Displayed");
				GuidewireAutomate_Validation("MexicoCovGenDamages", ChoosebyCoverageType_M_MexicoCovGenDamages, "isDisplayed", "Element is Displayed");
				GuidewireAutomate_Validation("MedicalPayments", ChoosebyCoverageType_M_MedicalPayments, "isDisplayed", "Element is Displayed");
				break;
			case "P" :
				GuidewireAutomate("ChoosebyCoverageType_P", ChoosebyCoverageType_P, "moveToElement", " ");

				GuidewireAutomate_Validation("PIPArkansas", ChoosebyCoverageType_P_PIPArkansas, "isDisplayed", "Element is Displayed");
				GuidewireAutomate_Validation("PIPDelaware", ChoosebyCoverageType_P_PIPDelaware, "isDisplayed", "Element is Displayed");

				GuidewireAutomate_Validation("PIPDistrictofColumbia", ChoosebyCoverageType_P_PIPDistrictofColumbia, "isDisplayed", "Element is Displayed");
				GuidewireAutomate_Validation("PIPFlorida", ChoosebyCoverageType_P_PIPFlorida, "isDisplayed", "Element is Displayed");
				GuidewireAutomate_Validation("PIPHawaii", ChoosebyCoverageType_P_PIPHawaii, "isDisplayed", "Element is Displayed");
				GuidewireAutomate_Validation("PIPKansas", ChoosebyCoverageType_P_PIPKansas, "isDisplayed", "Element is Displayed");
				GuidewireAutomate_Validation("PIPKentucky", ChoosebyCoverageType_P_PIPKentucky, "isDisplayed", "Element is Displayed");
				GuidewireAutomate_Validation("PIPMaryland", ChoosebyCoverageType_P_PIPMaryland, "isDisplayed", "Element is Displayed");
				GuidewireAutomate_Validation("PIPMassachusetts", ChoosebyCoverageType_P_PIPMassachusetts, "isDisplayed", "Element is Displayed");
				GuidewireAutomate_Validation("PIPMichigan", ChoosebyCoverageType_P_PIPMichigan, "isDisplayed", "Element is Displayed");
				GuidewireAutomate_Validation("PIPMinnesota", ChoosebyCoverageType_P_PIPMinnesota, "isDisplayed", "Element is Displayed");
				GuidewireAutomate_Validation("PIPNewJersey", ChoosebyCoverageType_P_PIPNewJersey, "isDisplayed", "Element is Displayed");
				GuidewireAutomate_Validation("PIPNewYork", ChoosebyCoverageType_P_PIPNewYork, "isDisplayed", "Element is Displayed");
				GuidewireAutomate_Validation("PIPNorthDakota", ChoosebyCoverageType_P_PIPNorthDakota, "isDisplayed", "Element is Displayed");
				GuidewireAutomate_Validation("PIPOregon", ChoosebyCoverageType_P_PIPOregon, "isDisplayed", "Element is Displayed");
				GuidewireAutomate_Validation("PIPPennsylvanian", ChoosebyCoverageType_P_PIPPennsylvanian, "isDisplayed", "Element is Displayed");
				GuidewireAutomate_Validation("PIPTexas", ChoosebyCoverageType_P_PIPTexas, "isDisplayed", "Element is Displayed");
				GuidewireAutomate_Validation("PIPUtah", ChoosebyCoverageType_P_PIPUtah, "isDisplayed", "Element is Displayed");
				GuidewireAutomate_Validation("PIPWashington", ChoosebyCoverageType_P_PIPWashington, "isDisplayed", "Element is Displayed");

				break;

			case "R" :
				GuidewireAutomate("ChoosebyCoverageType_R", ChoosebyCoverageType_R, "moveToElement", " ");
				GuidewireAutomate_Validation("RentalCarLossofUse", ChoosebyCoverageType_R_RentalCarLossofUse, "isDisplayed", "Element is Displayed");
				GuidewireAutomate_Validation("RentalReimbursement", ChoosebyCoverageType_R_RentalReimbursement, "isDisplayed", "Element is Displayed");
				break;
			case "T" :
				Thread.sleep(2000);
				GuidewireAutomate("ChoosebyCoverageType_T", ChoosebyCoverageType_T, "moveToElement", " ");
				GuidewireAutomate_Validation("TapeDiscMedia", ChoosebyCoverageType_T_TapeDiscMedia, "isDisplayed", "Element is Displayed");
				GuidewireAutomate_Validation("TowingandLabor", ChoosebyCoverageType_T_TowingandLabor, "isDisplayed", "Element is Displayed");
				break;
			case "U" :
				GuidewireAutomate("ChoosebyCoverageType_U", ChoosebyCoverageType_U, "moveToElement", " ");
				GuidewireAutomate_Validation("UnderinsuredMotoristBodilyInjury", ChoosebyCoverageType_U_UnderinsuredMotoristBodilyInjury, "isDisplayed", "Element is Displayed");
				GuidewireAutomate_Validation("UnderinsuredMotoristPropertyDamage", ChoosebyCoverageType_U_UnderinsuredMotoristPropertyDamage, "isDisplayed", "Element is Displayed");
				GuidewireAutomate_Validation("UninsuredMotoristBodilyInjury", ChoosebyCoverageType_U_UninsuredMotoristBodilyInjury, "isDisplayed", "Element is Displayed");
				GuidewireAutomate_Validation("UninsuredMotorisPropertyDamag", ChoosebyCoverageType_U_UninsuredMotorisPropertyDamage, "isDisplayed", "Element is Displayed");

				break;

		}

	}

	public static void ChoosebyCoverage_Collison() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("newExposure", strTestCaseName);
		GuidewireAutomate("CBC_Vehicle", CBC_Vehicle, "moveToElement", " ");
		GuidewireAutomate("CBC_Vehicle", CBC_Vehicle_Collision, "click", " ");
		GuidewireAutomate_Validation("Screen Header", CBC_Vehicle_Header, "equals", "New Exposure - Vehicle");
		String insuredName = ClaimCenter_Resuables.infoBar("InsuredName");
		GuidewireAutomate("Claimant", CBC_V_C_Claimant, "selectByVisibleText", insuredName);
		GuidewireAutomate("CBC_Vehicle", CBC_V_C_IncidentOverviewVehicle, "clickAndwait", " ");
		GuidewireAutomate("CBC_Vehicle", CBC_V_C_IncidentOverviewEditIncidentDetails, "clickAndwait", " ");
		GuidewireAutomate_Validation("Screen Header", CBC_VehicleIncident_Header, "equals", "Vehicle Incident");
		GuidewireAutomate("DamageDescription", CBC_VehicleIncident_DamageDescription, "clearANDsendKeys", lhm_TestCase_Table_Data.get("DamageDescription"));
		GuidewireAutomate("LossOccurred", CBC_VehicleIncident_LossOccurred, "selectByVisibleText", lhm_TestCase_Table_Data.get("LossOccurred"));
		GuidewireAutomate("DriverName", CBC_VehicleIncident_DriverName, "selectByVisibleText", insuredName);
		GuidewireAutomate("Ok", Ok, "click", " ");
		GuidewireAutomate_Validation("Screen Header", CBC_Vehicle_Header, "equals", "New Exposure - Vehicle");
		GuidewireAutomate("Update_Button", Update_Button, "click", " ");
		GuidewireAutomate_Validation("Expsoure_Header", Expsoure_Header, "equals", "Exposures");

	}

	public static void Validateclaimexposure() throws Throwable {

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("newExposure", strTestCaseName);

		try {

			GuidewireAutomate_Validation("FirstPartyVehicle", FirstPartyVehicle_Header, "contains", "(1) 1st Party Vehicle");
			GuidewireAutomate("Edit", Edit_Button, "clickAndwait", "click");
			Thread.sleep(2000);

			GuidewireAutomate("Section", EditIncident_IncidentOverview, "moveToElement", "Incident Overview");
			GuidewireAutomate_Validation("Section", EditIncident_IncidentOverview, "contains", "Incident Overview");
			GuidewireAutomate("IncidentOverviewbutton", IncidentOverview_button, "clickAndwait", "click");
			GuidewireAutomate("IncidentOverview_EditIncident", IncidentOverview_EditIncident, "clickAndwait", "click");

			GuidewireAutomate_Validation("ScreenHeader", VehicleIncident_Header, "contains", "Vehicle Incident");

			GuidewireAutomate("Section", DriverofInvolvedVehicle, "moveToElement", "Driver of InvolvedVehicle");
			GuidewireAutomate_Validation("Section", DriverofInvolvedVehicle, "equals", "Driver of Involved Vehicle");
			GuidewireAutomate("Drivername", Drivername, "selectByVisibleText", lhm_TestCase_Table_Data.get("DriverName"));
			GuidewireAutomate_Validation("RelationToInsured", RelationToInsured, "contains", "Self/Insured");

			GuidewireAutomate("Section", Damage_Description, "moveToElement", " Damage Description");
			GuidewireAutomate_Validation("Section", Damage_Description, "contains", "Damage Description");
			GuidewireAutomate("Damage Value", Damage_Text, "clearANDsendKeys", lhm_TestCase_Table_Data.get("DamageDescription"));

			GuidewireAutomate("Section", Details, "moveToElement", "Details");
			GuidewireAutomate_Validation("Section", Details, "contains", "Details");
			GuidewireAutomate("Details_lossoccured", Details_lossoccured, "selectByVisibleText", lhm_TestCase_Table_Data.get("LossOccurred"));

			GuidewireAutomate("Ok", Ok_Button, "clickAndwait", "click");

			GuidewireAutomate("Update", Update_Button, "clickAndwait", "click");

			GuidewireAutomate("UptoExposures", UptoExposures, "clickAndwait", "click");

			GuidewireAutomate_Validation("Screen Header", ExposureHeader, "equals", "Exposures");

		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}

	public static void AddingExposure(String Exposure) throws Throwable {
		switch (Exposure) {
			case "Collision" :
				ClaimCenter_ClaimExposure.ValidationResults_VehicleIncidentDescription();
				ClaimCenter_ClaimExposure.Validateclaimexposure();

				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults_NoValidationErrors();
				break;
			case "Comprehensive" :
				ClaimCenter_ClaimExposure.ValidationResults_VehicleIncidentDescription();
				ClaimCenter_ClaimExposure.Validateclaimexposure();

				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults_NoValidationErrors();
				break;
			case "VehicleEditIncident_Rental" :
				// Adding NewExposure
				CC_ChooseCoverage.NewExposureValidation();
				CC_ChooseCoverage.AllClaimant();
				CC_ChooseCoverage.VehicleEditIncident();

				CC_ChooseCoverage.ValidationResults();
				break;
			case "VehicleEditIncident" :
				// Adding NewExposure TowingandLabor
				CC_ChooseCoverage.NewExposureValidation();
				CC_ChooseCoverage.AllClaimant();
				CC_ChooseCoverage.VehicleEditIncident();
				CC_ChooseCoverage.Exposures_Validation();
				break;
		}
	}

	public static void ValidationResults_NoValidationErrors() throws Throwable {

		GuidewireAutomate_Validation("Validation Header", Validation_Header, "equals", "Validation Results");
		GuidewireAutomate_Validation("No Validation Error", NO_Error, "equals", "No Validation errors.");
		GuidewireAutomate("Clear", Clear_Button, "clickAndwait", "click");
		Thread.sleep(2000);

	}

	public static void ValidationResults_VehicleIncidentDescription() throws Throwable {
		GuidewireAutomate_Validation("Validation Header", Validation_Header, "equals", "Validation Results");
		GuidewireAutomate_Validation("Error Msg", Error_Msg, "equals", "Vehicle incident description must not be empty");
		GuidewireAutomate("Error Msg", Error_Msg, "clickAndwait", "click");
		GuidewireAutomate("Clear", Clear_Button, "clickAndwait", "click");
		Thread.sleep(2000);

	}

}
