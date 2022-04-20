package com.pages.Guidewire.PolicyCenter.CommercialProperty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;

public class CP_BuildingsAndLocations extends SeleniumWebDriver_Commands {

	public CP_BuildingsAndLocations(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);

	}
	private static By ScreenHeader = By.xpath("//div[contains(@id,'ttlBar')]//div[@role='heading']");

	private static By AddBuildingButton = By.xpath("//div[contains(@id,'CPBuildingsAndLocationsLV-0-Actions-ActionsMenuIcon')]//div[@class='gw-icon gw-icon--expand']");
	private static By AddBuilding       = By.xpath("//div[contains(@id,'CPBuildingsAndLocationsLV-0-Actions-AddBuilding')]//div[@class='gw-label' and text()='Add Building']");
	private static By NewBuilding       = By.xpath("//div[contains(@id,'CPBuildingsAndLocationsLV-0-Actions-AddBuilding')]//div[@class='gw-label' and text()='New Building']");

	// New Building Details
	private static By DetailsTab                 = By.xpath("//div[@id='CPBuildingPopup-BuildingDetailsTab']//div[@role='tab']");
	private static By BuildingInformationSection = By.xpath("//div[@id='CPBuildingPopup-DetailsDV-1']//div[@class='gw-label gw-boldLabel']");

	private static By BuildingInfoDescription       = By.xpath("//input[@name='CPBuildingPopup-DetailsDV-Description']");
	private static By BuildingInfoPropertyClassCode = By.xpath("//input[@name='CPBuildingPopup-DetailsDV-ClassCode']");
	private static By BuildingInfoCoverageForm      = By.xpath("//select[@name='CPBuildingPopup-DetailsDV-CoverageForm']");

	private static By RatingSection = By.xpath("//div[@id='CPBuildingPopup-DetailsDV']//div[text()='Rating']");
	private static By RateType      = By.xpath("//select[@name='CPBuildingPopup-DetailsDV-RateType']");

	private static By ConstructionSection      = By.xpath("//div[@id='CPBuildingPopup-DetailsDV']//div[text()='Construction']");
	private static By ConstructionYearBuilt    = By.xpath("//input[@name='CPBuildingPopup-DetailsDV-YearBuilt']");
	private static By ConstructionType         = By.xpath("//select[@name='CPBuildingPopup-DetailsDV-ConstructionType']");
	private static By ConstructionStories      = By.xpath("//input[@name='CPBuildingPopup-DetailsDV-NumStories']");
	private static By ConstructionBasements    = By.xpath("//input[@name='CPBuildingPopup-DetailsDV-NumBasements']");
	private static By ConstructionTotalArea    = By.xpath("//input[@name='CPBuildingPopup-DetailsDV-TotalArea']");
	private static By ConstructionBasementArea = By.xpath("//input[@name='CPBuildingPopup-DetailsDV-BasementArea']");
	private static By ConstructionSprinklered  = By.xpath("//select[@name='CPBuildingPopup-DetailsDV-PercentSprinklered']");
	private static By ConstructionRoofType     = By.xpath("//select[@name='CPBuildingPopup-DetailsDV-RoofType']");
	private static By ConstructionWindRating   = By.xpath("//select[@name='CPBuildingPopup-DetailsDV-WindRating']");

	private static By BurglarAlarmSection = By.xpath("//div[@id='CPBuildingPopup-DetailsDV']//div[text()='Burglar Alarm']");
	private static By BurglarySafeguard   = By.xpath("//select[@name='CPBuildingPopup-DetailsDV-BurglarySafeguard']");

	private static By ImprovementsSection = By.xpath("//div[@id='CPBuildingPopup-DetailsDV']//div[text()='Improvements']");
	private static By LastUpdateHeating   = By.xpath("//input[@name='CPBuildingPopup-DetailsDV-LastUpdateHeating']");
	private static By LastUpdatePlumbing  = By.xpath("//input[@name='CPBuildingPopup-DetailsDV-LastUpdatePlumbing']");
	private static By LastUpdateRoofing   = By.xpath("//input[@name='CPBuildingPopup-DetailsDV-LastUpdateRoofing']");
	private static By LastUpdateWiring    = By.xpath("//input[@name='CPBuildingPopup-DetailsDV-LastUpdateWiring']");

	// New Building Coverages // Building Coverage
	private static By CoveragesTab                = By.xpath("//div[@id='CPBuildingPopup-BuildingCoveragesTab']//div[@class='gw-label']");
	private static By BuildingCoverageSection     = By.xpath("//div[@class='gw-InputGroup--header--label' and text()='Building Coverage']");
	private static By BuildingCoverageLimit       = By.xpath("//input[contains(@name,'CPBldgCovLimit-CovTermDirectInputSet-DirectTermInput')]");
	private static By BuildingCoverageCauseOfLoss = By.xpath("//select[contains(@name,'CPBldgCovCauseOfLoss')]");
	private static By BuildingCoverageDeductible  = By.xpath("//select[contains(@name,'CPBldgCovDeductible')]");

	// New Building Coverages // Business Personal Property Coverage
	private static By BusinessPersonalPropertyCoverageSection     = By.xpath("//div[@class='gw-InputGroup--header--label' and text()='Business Personal Property Coverage']");
	private static By BusinessPersonalPropertyCoverageLimit       = By.xpath("//input[contains(@name,'CPBPPCovLimit-CovTermDirectInputSet-DirectTermInput')]");
	private static By BusinessPersonalPropertyCoverageCauseOfLoss = By.xpath("//select[contains(@name,'CPBPPCovCauseOfLoss')]");
	private static By BusinessPersonalPropertyCoverageDeductible  = By.xpath("//select[contains(@name,'CPBPPCovDeductible')]");

	// New Building Coverages // Business Income Coverage
	private static By BusinessIncomeCoverageSection = By.xpath("//div[@class='gw-InputGroup--header--label' and text()='Business Income Coverage']");
	private static By IncomeLimitNotMfgOrRental     = By.xpath("//input[contains(@name,'IncomeAndExpenseIterator-0-CoverageInputSet-CovPatternInputGroup-0')]");
	private static By IncomeLimitMfgOnly            = By.xpath("//input[contains(@name,'IncomeAndExpenseIterator-0-CoverageInputSet-CovPatternInputGroup-1')]");
	private static By IncomeLimitRentalOnly         = By.xpath("//input[contains(@name,'IncomeAndExpenseIterator-0-CoverageInputSet-CovPatternInputGroup-2')]");

	private static By OkButton = By.xpath("//div[@id='CPBuildingPopup-Update']//div[@role='button']");

	public static void BuildingsAndLocations() throws Throwable {

		try {

			GuidewireAutomate_Validation("Buildings and Locations Header", ScreenHeader, "equals", "Buildings and Locations");
			GuidewireAutomate("Add Building Button", AddBuildingButton, "clickAndwait", "click");
			GuidewireAutomate("Add Building", AddBuilding, "moveToElement", "moveToElement");
			GuidewireAutomate("New Building", NewBuilding, "clickAndwait", "click");
			Thread.sleep(2000);

		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}

	}
	public static void NewBuildingDetails() throws Throwable {

		try {
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcelWorkSheet_Fillo("NewBuilding", strTestCaseName);

			GuidewireAutomate_Validation("New Building Header", ScreenHeader, "equals", "New Building");
			GuidewireAutomate_Validation("Details Tab", DetailsTab, "equals", "Details");
			GuidewireAutomate_Validation("Building Information Section", BuildingInformationSection, "equals", "Building Information");

			GuidewireAutomate("Description", BuildingInfoDescription, "clearANDsendKeys", lhm_TestCase_Table_Data.get("BuildingInfoDescription"));
			GuidewireAutomate("Property Class Code", BuildingInfoPropertyClassCode, "clearANDsendKeys", lhm_TestCase_Table_Data.get("BuildingInfoPropertyClassCode"));
			GuidewireAutomate("Coverage Form", BuildingInfoCoverageForm, "selectByVisibleTextAndwait", lhm_TestCase_Table_Data.get("BuildingInfoCoverageForm"));

			GuidewireAutomate_Validation("Rating Section", RatingSection, "equals", "Rating");
			GuidewireAutomate("Rate Type", RateType, "selectByVisibleTextAndwait", lhm_TestCase_Table_Data.get("RateType"));

			GuidewireAutomate_Validation("Construction Section", ConstructionSection, "equals", "Construction");
			GuidewireAutomate("Year Built", ConstructionYearBuilt, "clearANDsendKeys", lhm_TestCase_Table_Data.get("ConstructionYearBuilt"));
			GuidewireAutomate("Construction Type", ConstructionType, "selectByVisibleTextAndwait", lhm_TestCase_Table_Data.get("ConstructionType"));
			GuidewireAutomate("Construction Stories", ConstructionStories, "clearANDsendKeys", lhm_TestCase_Table_Data.get("ConstructionStories"));
			GuidewireAutomate("Construction Basements", ConstructionBasements, "clearANDsendKeys", lhm_TestCase_Table_Data.get("ConstructionBasements"));
			GuidewireAutomate("Construction Total Area", ConstructionTotalArea, "clearANDsendKeys", lhm_TestCase_Table_Data.get("ConstructionTotalArea"));
			GuidewireAutomate("Construction Basement Area", ConstructionBasementArea, "clearANDsendKeys", lhm_TestCase_Table_Data.get("ConstructionBasementArea"));
			GuidewireAutomate("Construction Sprinklered", ConstructionSprinklered, "selectByVisibleTextAndwait", lhm_TestCase_Table_Data.get("ConstructionSprinklered"));
			GuidewireAutomate("Construction Roof Type", ConstructionRoofType, "selectByVisibleTextAndwait", lhm_TestCase_Table_Data.get("ConstructionRoofType"));
			GuidewireAutomate("Construction Wind Rating", ConstructionWindRating, "selectByVisibleTextAndwait", lhm_TestCase_Table_Data.get("ConstructionWindRating"));

			GuidewireAutomate_Validation("Burglar Alarm Section", BurglarAlarmSection, "equals", "Burglar Alarm");
			GuidewireAutomate("Burglary Safe guard", BurglarySafeguard, "selectByVisibleTextAndwait", lhm_TestCase_Table_Data.get("BurglarySafeguard"));

			GuidewireAutomate_Validation("Improvements Section", ImprovementsSection, "equals", "Improvements");
			GuidewireAutomate("Last Update Heating", LastUpdateHeating, "clearANDsendKeys", lhm_TestCase_Table_Data.get("YearLastUpdateHeating"));
			GuidewireAutomate("Last Update Plumbing", LastUpdatePlumbing, "clearANDsendKeys", lhm_TestCase_Table_Data.get("YearLastUpdatePlumbing"));
			GuidewireAutomate("Last Update Roofing", LastUpdateRoofing, "clearANDsendKeys", lhm_TestCase_Table_Data.get("YearLastUpdateRoofing"));
			GuidewireAutomate("Last Update Wiring", LastUpdateWiring, "clearANDsendKeys", lhm_TestCase_Table_Data.get("YearLastUpdateWiring"));

		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}

	}
	public static void NewBuildingCoverages() throws Throwable {

		try {
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcelWorkSheet_Fillo("NewBuilding", strTestCaseName);

			GuidewireAutomate_Validation("Coverages Tab", CoveragesTab, "equals", "Coverages");
			GuidewireAutomate("Coverages", CoveragesTab, "clickAndwait", "click");
			GuidewireAutomate_Validation("Building Coverage Section", BuildingCoverageSection, "equals", "Building Coverage");
			GuidewireAutomate("Building Coverage Limit", BuildingCoverageLimit, "clearANDsendKeys", lhm_TestCase_Table_Data.get("BuildingCoverageLimit"));
			GuidewireAutomate("Building Coverage Cause Of Loss", BuildingCoverageCauseOfLoss, "selectByVisibleTextAndwait", lhm_TestCase_Table_Data.get("CauseOfLoss"));
			GuidewireAutomate("Building Coverage Deductible", BuildingCoverageDeductible, "selectByVisibleTextAndwait", lhm_TestCase_Table_Data.get("Deductible"));

			GuidewireAutomate_Validation("Business Personal Property Coverage Section", BusinessPersonalPropertyCoverageSection, "equals", "Business Personal Property Coverage");
			GuidewireAutomate("Business Personal Property Coverage Limit", BusinessPersonalPropertyCoverageLimit, "clearANDsendKeys", lhm_TestCase_Table_Data.get("BuildingCoverageLimit"));
			GuidewireAutomate("Business Personal Property Coverage Cause Of Loss", BusinessPersonalPropertyCoverageCauseOfLoss, "selectByVisibleTextAndwait", lhm_TestCase_Table_Data.get("CauseOfLoss"));
			GuidewireAutomate("Business Personal Property Coverage Deductible", BusinessPersonalPropertyCoverageDeductible, "selectByVisibleTextAndwait", lhm_TestCase_Table_Data.get("Deductible"));

			GuidewireAutomate_Validation("Business Income Coverage Section", BusinessIncomeCoverageSection, "equals", "Business Income Coverage");
			GuidewireAutomate("Income Limit Not Mfg Or Rental", IncomeLimitNotMfgOrRental, "clearANDsendKeys", lhm_TestCase_Table_Data.get("IncomeLimitNotMfgOrRental"));
			GuidewireAutomate("Income Limit Mfg Only", IncomeLimitMfgOnly, "clearANDsendKeys", lhm_TestCase_Table_Data.get("IncomeLimitMfgOnly"));
			GuidewireAutomate("Income Limit Rental Only", IncomeLimitRentalOnly, "clearANDsendKeys", lhm_TestCase_Table_Data.get("IncomeLimitRentalOnly"));

			GuidewireAutomate("Ok Button", OkButton, "clickAndwait", "click");

		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}

	}

}
