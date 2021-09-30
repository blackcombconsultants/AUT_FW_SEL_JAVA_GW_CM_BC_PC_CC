package com.pages.Guidewire.CommercialProperty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;

public class CP_Blankets extends SeleniumWebDriver_Commands {

	public CP_Blankets(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
		
	}

private static By ScreenHeader = By.xpath("//div[contains(@id,'ttlBar')]//div[@role='heading']");
private static By AddBlanketButton = By.xpath("//div[contains(@id,'CPBlanket_tb-AddBlanket')]//div[@role='button']");

private static By BlanketType = By.xpath("//select[@name='CPBlanketPopup-BlanketType']");
private static By GroupType = By.xpath("//select[@name='CPBlanketPopup-BlanketGroupType']");
private static By Description = By.xpath("//input[@name='CPBlanketPopup-Description']");
private static By Location = By.xpath("//select[@name='CPBlanketPopup-BlanketLocation']");
private static By Limit = By.xpath("//input[@name='CPBlanketPopup-CPBlanketCovLimitId-CovTermDirectInputSet-DirectTermInput']");
private static By Deductible = By.xpath("//select[@name='CPBlanketPopup-CPBlanketCovDeductible']");

private static By ShowCoveragesButton = By.xpath("//div[contains(@id,'CPBlanketPopup-CPBlanketCovLV_tb-ShowCoverages')]//div[@role='button']");
private static By LocationCheckBox = By.xpath("//div[contains(@id,'CPBlanketPopup-CPBlanketCovLV-_Checkbox')]//input[@type='checkbox']");
private static By IncludeSelectedInBlanketButton = By.xpath("//div[contains(@id,'CPBlanketPopup-CPBlanketCovLV_tb-AddCoverages')]//div[@role='button']");

private static By OkButton = By.xpath("//div[@id='CPBlanketPopup-Update']//div[@role='button']");


public static void Blankets() throws Throwable {
	
	try {
		
		GuidewireAutomate_Validation("Blankets Header", ScreenHeader, "equals","Blankets");
		GuidewireAutomate("Add Blanket Button", AddBlanketButton, "clickAndwait", "clickAndwait");
		Thread.sleep(2000);
			
	
	} catch (Exception e) {

		e.printStackTrace();
		throw e;
	}

}

public static void BlanketDetails() throws Throwable {
	
	try {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("Blankets",
				strTestCaseName);
		
		GuidewireAutomate_Validation("Blankets Header", ScreenHeader, "equals","Blanket Details");
		GuidewireAutomate("Blanket Type", BlanketType, "selectByVisibleTextAndwait", lhm_TestCase_Table_Data.get("BlanketType"));
		GuidewireAutomate("Group Type", GroupType, "selectByVisibleTextAndwait", lhm_TestCase_Table_Data.get("GroupType"));
		GuidewireAutomate("Description", Description, "clearANDsendKeys", lhm_TestCase_Table_Data.get("Description"));
		GuidewireAutomate("Location", Location, "selectByIndex", "1");
		GuidewireAutomate("Limit", Limit, "clearANDsendKeys", lhm_TestCase_Table_Data.get("Limit"));
		GuidewireAutomate("Deductible", Deductible, "selectByVisibleTextAndwait", lhm_TestCase_Table_Data.get("Deductible"));
		
		GuidewireAutomate("Show Coverages Button", ShowCoveragesButton, "clickAndwait", "clickAndwait");
		GuidewireAutomate("Location Check Box", LocationCheckBox, "clickAndwait", "clickAndwait");
		GuidewireAutomate("Include Selected In Blanket Button", IncludeSelectedInBlanketButton, "clickAndwait", "clickAndwait");
		GuidewireAutomate("Ok Button", OkButton, "clickAndwait", "clickAndwait");
			
	
	} catch (Exception e) {

		e.printStackTrace();
		throw e;
	}

}




	
}
