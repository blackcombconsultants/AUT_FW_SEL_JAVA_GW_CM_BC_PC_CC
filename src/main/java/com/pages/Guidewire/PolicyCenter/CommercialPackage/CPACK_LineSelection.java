package com.pages.Guidewire.PolicyCenter.CommercialPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;

public class CPACK_LineSelection extends SeleniumWebDriver_Commands {

	public CPACK_LineSelection(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}
	private static By LineSelection_Header = By.xpath("//div[contains(@id,'ttlBar')]//div[@role='heading']");
	private static By LS_CoveragePart      = By.xpath("//div[contains(@id,'CPPLineSelectionDV')]//div[@class='gw-label gw-boldLabel' and text()='Coverage Part Selection']");
	private static By LS_PackageRiskType   = By.xpath("//select[contains(@name,'PackageRisk')]");
	public static void lineSelection() throws Throwable {
		try {
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcelWorkSheet_Fillo("lineSelection", strTestCaseName);

			GuidewireAutomate_Validation("Screen Header", LineSelection_Header, "equals", "Line Selection");
			GuidewireAutomate_Validation("Coverage Part Selection", LS_CoveragePart, "equals", "Coverage Part Selection");

			GuidewireAutomate("Package Risk Type", LS_PackageRiskType, "selectByVisibleText", lhm_TestCase_Table_Data.get("LS_PackageRiskType"));
			lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
			lhm_TestCase_Table_Data.clear();
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
}
