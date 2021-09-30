package com.pages.Guidewire.BusinessOwners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;

public class BO_Building extends SeleniumWebDriver_Commands {

	public BO_Building(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	private static By BO_BuildingHeader = By.xpath("//div[contains(@id,'BOPBuildingsScreen-ttlBar')]");
	/*
	 * BuildingsTab
	 */
	private static By Buildings_Tab = By.xpath("//div[contains(@id,'BOPLocationBuildingsPanelSet-BuildingCardTab')]");
	private static By Add_button = By.xpath("//div[contains(@id,'Add')]//div[@role='button']");
	/***
	 * Building Details
	 */
	private static By BO_DetailsHeader = By.xpath("//div[contains(@id,'ttlBar')]//div[@role='heading']");
	private static By BO_BuildingInformation = By.xpath(
			"//div[contains(@id,'BOPBuilding_DetailsDV')]//div[@class='gw-label gw-boldLabel' and text()='Building Information']");
	private static By BO_Number = By
			.xpath("//div[contains(@id,'DetailsDV-Number')]//div[@class='gw-value-readonly-wrapper' and text()='1']");
	private static By BO_Description = By
			.xpath("//input[contains(@name,'DetailsDV-Description')]");
	private static By BO_Searchbutton = By.xpath("//div[contains(@id,'BOPBuildingClassCodePicker')]");
	/****
	 * Class Code Search
	 */
	private static By BO_ClassCodeSearchHeader = By.xpath("//div[contains(@id,'ttlBar')]//div[@role='heading']");
	private static By BO_Code = By.xpath("//input[contains(@name,'BOPClassCodeSearchDV-Code')]");
	private static By BO_ClassCode_Searchbutton = By.xpath("//div[contains(@id,'SearchLinksInputSet-Search')]");
	private static By BO_ClassCode_Selectbutton = By.xpath("//div[contains(@id,'_Select')]//div[@role='button']");
	private static By BO_BuildingLimit = By
			.xpath("//input[contains(@name,'BOPBldgCovLimit-CovTermDirectInputSet-DirectTermInput')]");
	private static By BO_BusinessPersonalPropertyLimit = By
			.xpath("//input[contains(@name,'BOPPersonalPropCovLimit-CovTermDirectInputSet-DirectTermInput')]");
	private static By BO_OrdinanceorLaw_checkbox = By.xpath(
			"//input[contains(@name,'BOPBuilding_DetailsDV-2-CoverageInputSet-CovPatternInputGroup-_checkbox')]");
	private static By BO_OrdinanceorLaw_IncomeExpense = By
			.xpath("//input[contains(@id,'CovPatternInputGroup-0-CovTermInputSet-BooleanTermInput_1')]");
	private static By BO_AccountsReceivable_checkbox = By.xpath(
			"//input[contains(@name,'BOPBuilding_DetailsDV-3-CoverageInputSet-CovPatternInputGroup-_checkbox')]");
	private static By BO_ValuablePapers_checkbox = By.xpath(
			"//input[contains(@name,'BOPBuilding_DetailsDV-4-CoverageInputSet-CovPatternInputGroup-_checkbox')]");
	/***
	 * Building Construction
	 */
	private static By BO_BuildingConstruction = By.xpath(
			"//div[contains(@id,'BOPBuilding_DetailsDV')]//div[@class='gw-label gw-boldLabel' and text()='Building Construction']");
	private static By BO_YearBuilt = By.xpath("//input[contains(@name,'YearBuilt')]");
	/*****
	 * BuildingImprovement
	 */
	private static By BO_BuildingImprovement = By.xpath(
			"//div[contains(@id,'BOPBuilding_DetailsDV')]//div[@class='gw-label gw-boldLabel' and text()='Building Improvement']");
	private static By BO_LastUpdateHeating = By.xpath("//input[contains(@name,'LastUpdateHeating')]");
	/****
	 * Burglar Alarm
	 */
	private static By BO_BurglarAlarm = By.xpath(
			"//div[contains(@id,'BOPBuilding_DetailsDV')]//div[@class='gw-label gw-boldLabel' and text()='Burglar Alarm']");
	private static By BO_BuildingAlarmType = By.xpath("//select[contains(@name,'BuildingAlarmType')]");

	private static By BO_Update_button = By.xpath("//div[contains(@id,'Update')]//div[@role='button']");

	public static void Buildings() throws Throwable {

		try {
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("Buildings",
					strTestCaseName);

			GuidewireAutomate_Validation("Screen Header", BO_BuildingHeader, "equals", "Buildings");
			GuidewireAutomate("Buildings tab", Buildings_Tab, "click", "click");
			GuidewireAutomate("Add button", Add_button, "click", "click");
		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}

	public static void buildingDetails() throws Throwable {

		try {
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("Buildings",
					strTestCaseName);

			GuidewireAutomate_Validation("Details", BO_DetailsHeader, "equals", "Details");
			GuidewireAutomate_Validation("Building Information", BO_BuildingInformation, "equals",
					"Building Information");
			GuidewireAutomate_Validation("Number", BO_Number, "equals", lhm_TestCase_Table_Data.get("BO_Number"));

			GuidewireAutomate("Description", BO_Description, "clearANDsendKeys",
					lhm_TestCase_Table_Data.get("BO_Description"));
			GuidewireAutomate("Search button", BO_Searchbutton, "click", "click");
		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}

	public static void ClassCodeSearch() throws Throwable {

		try {
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("Buildings",
					strTestCaseName);

			GuidewireAutomate_Validation("Class Code Search", BO_ClassCodeSearchHeader, "equals", "Class Code Search");

			GuidewireAutomate("Code", BO_Code, "clearANDsendKeys", lhm_TestCase_Table_Data.get("BO_Code"));
			GuidewireAutomate("Search button", BO_ClassCode_Searchbutton, "clickAndwait", "click");
			Thread.sleep(2000);
			GuidewireAutomate("Select button", BO_ClassCode_Selectbutton, "clickAndwait", "click");
			GuidewireAutomate("BuildingLimit", BO_BuildingLimit, "clearANDsendKeys",
					lhm_TestCase_Table_Data.get("BO_BuildingLimit"));
			GuidewireAutomate("Business Personal PropertyLimit", BO_BusinessPersonalPropertyLimit, "clearANDsendKeys",
					lhm_TestCase_Table_Data.get("BO_BusinessPersonalPropertyLimit"));
			GuidewireAutomate("Ordinance o rLaw checkbox", BO_OrdinanceorLaw_checkbox, "clickAndwait", "click");

			GuidewireAutomate("Ordinance or Law Income Expense", BO_OrdinanceorLaw_IncomeExpense, "clickAndwait",
					lhm_TestCase_Table_Data.get("BO_OrdinanceorLaw_IncomeExpense"));

			GuidewireAutomate("Accounts Receivable checkbox", BO_AccountsReceivable_checkbox, "clickAndwait", "click");
			GuidewireAutomate("Valuable Papers checkbox", BO_ValuablePapers_checkbox, "clickAndwait", "click");

		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}
	public static void BuildingConstruction() throws Throwable {

		try {
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("Buildings",
					strTestCaseName);

			GuidewireAutomate_Validation("Building Construction", BO_BuildingConstruction, "equals", "Building Construction");
			GuidewireAutomate("Year Built", BO_YearBuilt, "clearANDsendKeys",
					lhm_TestCase_Table_Data.get("BO_YearBuilt"));
		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}
	public static void BuildingImprovement() throws Throwable {

		try {
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("Buildings",
					strTestCaseName);

			GuidewireAutomate_Validation("Building Improvement", BO_BuildingImprovement, "equals", "Building Improvement");
			GuidewireAutomate("Last Update Heating", BO_LastUpdateHeating, "clearANDsendKeys",
					lhm_TestCase_Table_Data.get("BO_LastUpdateHeating"));
		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}
	public static void BurglarAlarm() throws Throwable {

		try {
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("Buildings",
					strTestCaseName);

			GuidewireAutomate_Validation("Burglar Alarm", BO_BurglarAlarm, "equals", "Burglar Alarm");
			GuidewireAutomate("Building Alarm Type", BO_BuildingAlarmType, "selectByVisibleText",
					lhm_TestCase_Table_Data.get("BO_BuildingAlarmType"));
			GuidewireAutomate("Update button", BO_Update_button, "click", "click");

		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}
}
