package com.pages.Guidewire.BusinessOwners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;

public class BO_Locations extends SeleniumWebDriver_Commands {

	public BO_Locations(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
		// TODO Auto-generated constructor stub
	}

	private static By Locations_Header = By.xpath(
			"//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and text()='Locations']");

	// New Location
	private static By NewLocation = By.xpath("//div[contains(@id,'LocationsEdit_DP_tb-Add')]/div[@role='button']");

	// Location Information
	private static By LocationInformation_Header = By.xpath(
			"//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and text()='Location Information']");
	private static By LI_Address1 = By.xpath("//input[contains(@name,'GlobalAddressInputSet-AddressLine1')]");
	private static By LI_City = By.xpath("//input[contains(@name,'GlobalAddressInputSet-City')]");
	private static By LI_State = By.xpath("//select[contains(@name,'GlobalAddressInputSet-State')]");
	private static By LI_ZIPCode = By.xpath("//input[contains(@name,'GlobalAddressInputSet-PostalCode')]");
	private static By LI_TerritoryCodeforGeneralLiabilityLine = By
			.xpath("//input[contains(@name,'TerritoryCodeInputSet-0-TerritoryCode')]");

	// Locations Details
	private static By L_D_NonSpecificLocation = By.xpath(
			"//div[contains(@id,'LocationDetailInputSet-NonSpecificLocation')]//div[@class='gw-RangeValue']/div[@class='gw-label']");
	private static By L_D_LocationCode = By.xpath(
			"//div[contains(@id,'LocationDetailInputSet-LocationCode')]//div[@class='gw-value-readonly-wrapper']");
	private static By L_D_LocationName = By.xpath(
			"//div[contains(@id,'LocationDetailInputSet-LocationName')]//div[@class='gw-value-readonly-wrapper']");
	private static By L_D_Country = By.xpath(
			"//div[contains(@id,'GlobalAddressInputSet-Country')]//div[@class='gw-RangeValue']/div[@class='gw-label']");
	private static By L_D_Address1 = By.xpath(
			"//div[contains(@id,'GlobalAddressInputSet-AddressLine1')]//div[@class='gw-value-readonly-wrapper']");
	private static By L_D_Address2 = By.xpath(
			"//div[contains(@id,'GlobalAddressInputSet-AddressLine2')]//div[@class='gw-value-readonly-wrapper']");
	private static By L_D_Address3 = By.xpath(
			"//div[contains(@id,'GlobalAddressInputSet-AddressLine3')]//div[@class='gw-value-readonly-wrapper']");
	private static By L_D_City = By
			.xpath("//div[contains(@id,'GlobalAddressInputSet-City')]//div[@class='gw-value-readonly-wrapper']");
	private static By L_D_County = By
			.xpath("//div[contains(@id,'GlobalAddressInputSet-County')]//div[@class='gw-value-readonly-wrapper']");
	private static By L_D_State = By.xpath(
			"//div[contains(@id,'GlobalAddressInputSet-State')]//div[@class='gw-RangeValue']/div[@class='gw-label']");
	private static By L_D_ZIPCode = By
			.xpath("//div[contains(@id,'GlobalAddressInputSet-PostalCode')]//div[@class='gw-value-readonly-wrapper']");
	private static By L_D_Phone = By
			.xpath("//div[contains(@id,'GlobalPhoneInputSet-PhoneDisplay')]//div[@class='gw-value-readonly-wrapper']");
	private static By L_D_TCGLL = By.xpath(
			"//div[contains(@id,'TerritoryCodeInputSet-0-TerritoryCode')]//div[@class='gw-value-readonly-wrapper']");

	public static void NewLocation() throws Throwable {
		try {

			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("locations",
					strTestCaseName);

			GuidewireAutomate_Validation("Screen Header", Locations_Header, "equals", "Locations");
			GuidewireAutomate("NewLocation", NewLocation, "click", "click");
			GuidewireAutomate_Validation("Screen Header", LocationInformation_Header, "equals", "Location Information");
			GuidewireAutomate("Address1", LI_Address1, "clearANDsendKeys", lhm_TestCase_Table_Data.get("LI_Address1"));
			GuidewireAutomate("City", LI_City, "clearANDsendKeys", lhm_TestCase_Table_Data.get("LI_City"));
			GuidewireAutomate("State", LI_State, "selectByVisibleText", lhm_TestCase_Table_Data.get("LI_State"));
			GuidewireAutomate("ZIPCode", LI_ZIPCode, "clearANDsendKeys", lhm_TestCase_Table_Data.get("LI_ZIPCode"));
			GuidewireAutomate("TerritoryCodeforGeneralLiabilityLine", LI_TerritoryCodeforGeneralLiabilityLine,
					"clearANDsendKeys", lhm_TestCase_Table_Data.get("LI_TCGL"));

		} catch (Exception e) {

		}
	}

	public static void Locations_Details() throws Throwable {
		try {
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("locations",
					strTestCaseName);
			GuidewireAutomate_Validation("Screen Header", Locations_Header, "equals", "Locations");

			GuidewireAutomate_Validation("NonSpecificLocation", L_D_NonSpecificLocation, "equals",
					lhm_TestCase_Table_Data.get("L_D_NonSpecificLocation"));
			GuidewireAutomate_Validation("Country", L_D_Country, "equals", lhm_TestCase_Table_Data.get("L_D_Country"));
		/*	GuidewireAutomate_Validation("Address1", L_D_Address1, "contains",
					lhm_TestCase_Table_Data.get("L_D_Address1"));*/
			GuidewireAutomate_Validation("Address2", L_D_Address2, "equals",
					lhm_TestCase_Table_Data.get("L_D_Address2"));
			GuidewireAutomate_Validation("Address3", L_D_Address3, "equals",
					lhm_TestCase_Table_Data.get("L_D_Address3"));
			GuidewireAutomate_Validation("City", L_D_City, "equals", lhm_TestCase_Table_Data.get("L_D_City"));
			GuidewireAutomate_Validation("County", L_D_County, "equals", lhm_TestCase_Table_Data.get("L_D_County"));
		
		//	GuidewireAutomate_Validation("State", L_D_State, "equals", lhm_TestCase_Table_Data.get("L_D_State"));
			GuidewireAutomate_Validation("ZIPCode", L_D_ZIPCode, "equals", lhm_TestCase_Table_Data.get("L_D_ZIPCode"));
			GuidewireAutomate_Validation("Phone", L_D_Phone, "equals", lhm_TestCase_Table_Data.get("L_D_Phone"));
			GuidewireAutomate_Validation("TCGLL", L_D_TCGLL, "equals", lhm_TestCase_Table_Data.get("L_D_TCGLL"));

		} catch (Exception e) {

		}
	}

}
