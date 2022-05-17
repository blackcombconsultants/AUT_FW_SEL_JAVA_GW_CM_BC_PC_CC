package com.pages.Guidewire.PolicyCenter.HomeOwners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class HO_DwellingConstruction extends SeleniumWebDriver_Commands {

	public HO_DwellingConstruction(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}
	private static By DWC_Header         = By.xpath("//div[contains(@id,'HOPDwellingConstructionScreen-ttlBar')]");
	private static By DWC_YearBuilt      = By.xpath("//input[contains(@name,'YearBuilt')]");
	private static By DWC_Garage         = By.xpath("//select[contains(@name,'GarageType')]");
	private static By DWC_Foundation     = By.xpath("//select[contains(@name,'FoundationType')]");
	private static By DWC_Roof           = By.xpath("//select[contains(@name,'RoofType')]");
	private static By DWC_PrimaryHeating = By.xpath("//select[contains(@name,'PrimaryHeatingType')]");


	/********
	 * Anyofthefollowingupgraded
	 ***/
	private static By DWC_Anyofthefollowingupgraded = By.xpath("//div[contains(@id,'HOPDwellingConstructionDetailsDV')]//div[@class='gw-label gw-boldLabel']");
	private static By DWC_HeatingYear               = By.xpath("//input[contains(@name,'HeatingUpgradeDate')]");
	private static By DWC_RoofYear                  = By.xpath("//input[contains(@name,'RoofingUpgradeDate')]");

	public static void DwellingConstructionDetails() throws Throwable {

		try {
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcelWorkSheet_Fillo("dwellingConstruction", strTestCaseName);

			GuidewireAutomate_Validation("Screen Header", DWC_Header, "equals", "Dwelling Construction");

			GuidewireAutomate("DWC YearBuilt", DWC_YearBuilt, "sendKeys", lhm_TestCase_Table_Data.get("DWC_YearBuilt"));
			GuidewireAutomate("DWC Garage", DWC_Garage, "sendKeys", lhm_TestCase_Table_Data.get("DWC_Garage"));
			GuidewireAutomate("DWC Foundation ", DWC_Foundation, "sendKeys", lhm_TestCase_Table_Data.get("DWC_Foundation"));
			GuidewireAutomate("DWC Roof", DWC_Roof, "sendKeys", lhm_TestCase_Table_Data.get("DWC_Roof"));
			GuidewireAutomate("DWC PrimaryHeating", DWC_PrimaryHeating, "sendKeys", lhm_TestCase_Table_Data.get("DWC_PrimaryHeating"));

			GuidewireAutomate_Validation("DWC Anyofthefollowingupgraded", DWC_Anyofthefollowingupgraded, "equals", "Any of the following upgraded?");
			GuidewireAutomate("DWC HeatingYear", DWC_HeatingYear, "sendKeys", lhm_TestCase_Table_Data.get("DWC_HeatingYear"));
			GuidewireAutomate("DWC RoofYear", DWC_RoofYear, "sendKeys", lhm_TestCase_Table_Data.get("DWC_RoofYear"));

			lhm_TestCase_Table_Data.clear();

			oExtentTest.log(Status.PASS, "Search PolicyNumber = [" + strPolicyNumber + "] is succesful");
		} catch (Exception e) {
			oExtentTest.log(Status.FAIL, "Search PolicyNumber = [" + strPolicyNumber + "] is Unsuccesful");
			e.printStackTrace();
			throw e;
		}
	}
}
