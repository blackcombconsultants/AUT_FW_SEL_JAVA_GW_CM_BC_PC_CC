package com.pages.Guidewire.PolicyCenter.GeneralLiability;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;

public class GL_Coverages extends SeleniumWebDriver_Commands {

	public GL_Coverages(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}


	private static By Coverages_Header = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and text()='Coverages']");
	// Standard Coverages
	private static By StandardCoverages_Tab = By.xpath("//div[contains(@id,'GeneralLiability_IncludedCardTab')]");
	private static By SC_PolicyBasis        = By.xpath("//select[contains(@name,'GLPolicyClaimsMade')]");
	private static By SC_SplitBIPDLimits    = By.xpath("//input[contains(@id,'GLPolicySplitLimits_1')]");

	private static By AdditionalCoverages_Tab  = By.xpath("//div[contains(@id,'AdditionalCoveragesCardTab')]");
	private static By ExclusionsConditions_Tab = By.xpath("//div[contains(@id,'ExclusionsAndConditionsCardTab')]");
	private static By AdditionalInsureds_Tab   = By.xpath("//div[contains(@id,'AdditionalInsuredCardTab')]");

	public static void StandardCoverages() throws Throwable {
		try {
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcelWorkSheet_Fillo("locations", strTestCaseName);
			GuidewireAutomate_Validation("Screen Header", Coverages_Header, "equals", "Coverages");
			GuidewireAutomate("Standard Coverages", StandardCoverages_Tab, "click", "click");
			GuidewireAutomate_Validation("Policy Basis", SC_PolicyBasis, "FirstSelectedOptionEquals", lhm_TestCase_Table_Data.get("SC_PolicyBasis"));
			GuidewireAutomate("SplitBIPDLimits", SC_SplitBIPDLimits, "click", "click");

		} catch (Exception e) {

		}
	}

	public static void AdditionalCoverages() throws Throwable {
		try {
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcelWorkSheet_Fillo("locations", strTestCaseName);
			GuidewireAutomate("Additional Coverages", AdditionalCoverages_Tab, "click", "click");
		} catch (Exception e) {

		}
	}

	public static void ExclusionsConditions() throws Throwable {
		try {
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcelWorkSheet_Fillo("locations", strTestCaseName);
			GuidewireAutomate("Exclusions Conditions", ExclusionsConditions_Tab, "click", "click");
		} catch (Exception e) {

		}
	}

	public static void AdditionalInsureds_AddNewCompany() throws Throwable {
		try {
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcelWorkSheet_Fillo("locations", strTestCaseName);
			GuidewireAutomate("AdditionalInsureds", AdditionalInsureds_Tab, "click", "click");

		} catch (Exception e) {

		}
	}

	public static void AdditionalInsureds_AddNewPerson() throws Throwable {
		try {
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcelWorkSheet_Fillo("locations", strTestCaseName);
			GuidewireAutomate_Validation("Screen Header", Coverages_Header, "equals", "Coverages");
			GuidewireAutomate("AdditionalInsureds", AdditionalInsureds_Tab, "click", "click");
		} catch (Exception e) {

		}
	}

	public static void AdditionalInsureds_AddFromAddressBook() throws Throwable {
		try {
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcelWorkSheet_Fillo("locations", strTestCaseName);
			GuidewireAutomate_Validation("Screen Header", Coverages_Header, "equals", "Coverages");
			GuidewireAutomate("AdditionalInsureds", AdditionalInsureds_Tab, "click", "click");
		} catch (Exception e) {

		}
	}

	public static void AdditionalInsureds_AddExistingAdditionalInsured() throws Throwable {
		try {
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcelWorkSheet_Fillo("locations", strTestCaseName);
			GuidewireAutomate_Validation("Screen Header", Coverages_Header, "equals", "Coverages");
			GuidewireAutomate("AdditionalInsureds", AdditionalInsureds_Tab, "click", "click");
		} catch (Exception e) {

		}
	}

	public static void AdditionalInsureds_AddOther() throws Throwable {
		try {
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcelWorkSheet_Fillo("locations", strTestCaseName);
			GuidewireAutomate_Validation("Screen Header", Coverages_Header, "equals", "Coverages");
			GuidewireAutomate("AdditionalInsureds", AdditionalInsureds_Tab, "click", "click");
		} catch (Exception e) {

		}
	}

}
