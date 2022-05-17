package com.pages.Guidewire.PolicyCenter.InlineMarine;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;

public class IM_BuildingsandLocations extends SeleniumWebDriver_Commands {


	public IM_BuildingsandLocations(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	private static By BuildingsandLocations_Header = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and text()='Buildings and Locations']");

	// Add Building
	private static By Add            = By.xpath(" //div[contains(@id,'Actions-ActionsMenuIcon')]/div[@class='gw-action--expand-button']");
	private static By AddBuilding    = By.xpath(" //div[contains(@id,'Actions-AddBuilding')]//div[@class='gw-label' and text()='Add Building']");
	private static By AB_NewBuilding = By.xpath(" //div[contains(@id,'Actions-AddBuilding')]//div[@class='gw-label' and text()='New Building']");

	// New Building
	private static By NewBuilding_Header = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and text()='New Building']");

	// New Building -Details
	private static By NB_Details_Description = By.xpath("//input[contains(@name,'Description')]");

	// Building Construction
	private static By NB_BC_YearBuilt        = By.xpath("//input[contains(@name,'YearBuilt')]");
	private static By NB_BC_ConstructionType = By.xpath("//select[contains(@name,'ConstructionType')]");
	private static By NB_BC_ofStories        = By.xpath("//input[contains(@name,'NumStories')]");
	private static By NB_BC_ofBasements      = By.xpath("//input[contains(@name,'NumBasements')]");

	// Building Improvement
	private static By NB_BI_YearofLastUpdateHeating  = By.xpath("//input[contains(@name,'LastUpdateHeating')]");
	private static By NB_BI_YearofLastUpdatePlumbing = By.xpath("//input[contains(@name,'LastUpdatePlumbing')]");
	private static By NB_BI_YearofLastUpdateRoofing  = By.xpath("//input[contains(@name,'LastUpdateRoofing')]");

	public static void AddNewBuilding() throws Throwable {
		try {

			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcelWorkSheet_Fillo("buildingsandLocations", strTestCaseName);
			GuidewireAutomate_Validation("Screen Header", BuildingsandLocations_Header, "equals", "Buildings and Locations");
			GuidewireAutomate("Add", Add, "click", "click");
			GuidewireAutomate("AddBuilding", AddBuilding, "moveToElement", "moveToElement");
			GuidewireAutomate("NewBuilding", AB_NewBuilding, "click", "click");

		} catch (Exception e) {

		}
	}

	public static void NewBuilding_Details() throws Throwable {
		try {
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcelWorkSheet_Fillo("buildingsandLocations", strTestCaseName);
			GuidewireAutomate_Validation("Screen Header", NewBuilding_Header, "equals", "New Building");
			GuidewireAutomate("Description", NB_Details_Description, "clearANDsendKeys", lhm_TestCase_Table_Data.get("NB_Details_Description"));

			GuidewireAutomate("YearBuilt", NB_BC_YearBuilt, "clearANDsendKeys", lhm_TestCase_Table_Data.get("NB_BC_YearBuilt"));
			GuidewireAutomate("ConstructionType", NB_BC_ConstructionType, "selectByVisibleText", lhm_TestCase_Table_Data.get("NB_BC_ConstructionType"));
			GuidewireAutomate("Number of Stories", NB_BC_ofStories, "clearANDsendKeys", lhm_TestCase_Table_Data.get("NB_BC_ofStories"));
			GuidewireAutomate("Number of Basements", NB_BC_ofBasements, "clearANDsendKeys", lhm_TestCase_Table_Data.get("NB_BC_ofBasements"));

			GuidewireAutomate("Year of LastUpdateHeating", NB_BI_YearofLastUpdateHeating, "clearANDsendKeys", lhm_TestCase_Table_Data.get("NB_BI_YearofLastUpdateHeating"));
			getStaleElement("Year of LastUpdatePlumbing", NB_BI_YearofLastUpdatePlumbing);

			GuidewireAutomate("Year of LastUpdatePlumbing", NB_BI_YearofLastUpdatePlumbing, "clearANDsendKeys", lhm_TestCase_Table_Data.get("NB_BI_YearofLastUpdatePlumbing"));
			GuidewireAutomate("Year of LastUpdateRoofing", NB_BI_YearofLastUpdateRoofing, "clearANDsendKeys", lhm_TestCase_Table_Data.get("NB_BI_YearofLastUpdateRoofing"));

		} catch (Exception e) {

		}
	}

}
