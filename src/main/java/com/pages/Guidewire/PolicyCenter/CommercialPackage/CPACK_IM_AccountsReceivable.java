package com.pages.Guidewire.PolicyCenter.CommercialPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;

public class CPACK_IM_AccountsReceivable extends SeleniumWebDriver_Commands {

	public CPACK_IM_AccountsReceivable(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);

	}


	private static By Modifiers_Header = By.xpath("//div[contains(@id,'ttlBar')]//div[@role='heading']");

	// Rating Inputs
	private static By RatingInputs = By.xpath("//div[contains(@id,'ModifiersScreen')]//div[@class='gw-TitleBar--title' and text()='Rating Inputs']");
	private static By Modifier     = By.xpath("//div[contains(@id,'ratingInputName_Input')]//div[@class='gw-label gw-boldLabel' and text()='Modifier']");
	private static By PackageIRPM  = By.xpath("//div[contains(@id,'ratingInputName_Input')]//div[@class='gw-value-readonly-wrapper' and text()='Package IRPM']");

	public static void PartLevelInformation() throws Throwable {
		try {
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcelWorkSheet_Fillo("AccountsReceivable", strTestCaseName);
			GuidewireAutomate_Validation("Screen Header", Modifiers_Header, "equals", "Accounts Receivable");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	public static void AccountsReceivableCoverages() throws Throwable {
		try {
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcelWorkSheet_Fillo("AccountsReceivable", strTestCaseName);
			GuidewireAutomate_Validation("Screen Header", Modifiers_Header, "equals", "Accounts Receivable");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	public static void ExcludedCustomers() throws Throwable {
		try {
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcelWorkSheet_Fillo("AccountsReceivable", strTestCaseName);
			GuidewireAutomate_Validation("Screen Header", Modifiers_Header, "equals", "Accounts Receivable");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

}
