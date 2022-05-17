package com.pages.Guidewire.PolicyCenter.InlineMarine;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;

public class IM_PolicyInfo extends SeleniumWebDriver_Commands {

	public IM_PolicyInfo(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}


	private static By PolicyInfo_Header  = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and text()='Policy Info']");
	private static By PI_DateQuoteNeeded = By.xpath("//input[contains(@name,'DateQuoteNeeded')]");
	private static By Next               = By.xpath("//div[@id='SubmissionWizard-Next']/div[@role='button']");
	// Primary Named Insured
	private static By PI_PNI              = By.xpath("//div[contains(@id,'ChangePrimaryNamedInsuredButton_Input')]/div[ text()='Primary Named Insured']");
	private static By PI_PNI_Name         = By.xpath("//div[contains(@id,'AccountInfoInputSet-Name')]//div[ @class='gw-ActionValueWidget']");
	private static By PI_PNI__AddressType = By.xpath("//div[contains(@id,'AddressType') and contains(@class,'gw-ValueWidget')]//div[contains(@class,'gw-label')]");

	// Business and Operations
	private static By PI_BO = By.xpath("//div[contains(@id,'CommercialInputSet-1')]/div[ text()='Business and Operations']");

	private static By PI_OrganizationType = By.xpath("//select[contains(@name,'PolicyInfoDV-AccountInfoInputSet-OrganizationType')]");

	// Official IDs
	private static By PI_OfficialID = By.xpath("//div[contains(@class,'gw-LabelWidget')]/div[contains(@class,'gw-label') and text()='Official IDs']");

	// Affinity Group
	private static By PI_AffinityGroup = By.xpath("//div[contains(@class,'gw-boldLabel') and text()='Affinity Group']");
	private static By PI_AG_Name       = By.xpath("//input[contains(@name,'PolicyInfoInputSet-AffinityGroup')]");

	// Policy Details
	private static By PI_PolicyDetails    = By.xpath("//div[contains(@class,'gw-boldLabel') and text()='Policy Details']");
	private static By PI_PD_TermType      = By.xpath("//select[contains(@name,'PolicyInfoInputSet-TermType')]");
	private static By PI_PD_TermNumber    = By.xpath("//div[contains(@id,'PolicyInfoInputSet-TermNumber')]//div[contains(@class,'gw-value-readonly-wrapper')]");
	private static By PI_PD_EffectiveDate = By.xpath("//input[contains(@name,'PolicyInfoInputSet-EffectiveDate')]");

	private static By PI_PD_ExpirationDate    = By.xpath("//div[contains(@id,'PolicyInfoInputSet-ExpirationDate')]//div[contains(@class,'gw-value-readonly-wrapper')]");
	private static By PI_PD_WrittenDate       = By.xpath("//input[contains(@name,'PolicyInfoInputSet-WrittenDate')]");
	private static By PI_PD_RateAsOfDate      = By.xpath("//div[contains(@id,'PolicyInfoInputSet-RateAsOfDate')]//div[contains(@class,'gw-value-readonly-wrapper')]");
	private static By PI_PD_PrefferedLanguage = By.xpath("//select[contains(@name,'PolicyInfoInputSet-PrimaryLanguage')]");

	// Producer of Record
	private static By PI_ProducerofRecord = By.xpath("//div[contains(@class,'gw-boldLabel') and text()='Producer of Record']");
	private static By PI_PR_Organization  = By.xpath("//input[contains(@name,'PolicyInfoProducerOfRecordInputSet-Producer')]");
	private static By PI_PR_ProducerCode  = By.xpath("//select[contains(@name,'PolicyInfoProducerOfRecordInputSet-ProducerCode')]");

	// Underwriting Companies
	private static By PI_UnderwritingCompanies = By.xpath("//div[contains(@class,'gw-boldLabel') and text()='Underwriting Companies']");
	private static By PI_UC_Name               = By.xpath("//select[contains(@name,'UWCompanyInputSet-UWCompany')]");

	public static void dateQuoteNeeded() throws Throwable {

		try {
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcelWorkSheet_Fillo("policyInfo", strTestCaseName);

			GuidewireAutomate_Validation("Screen Header", PolicyInfo_Header, "equals", "Policy Info");

			GuidewireAutomate("Date Quote Needed", PI_DateQuoteNeeded, "clearANDsendKeys", lhm_TestCase_Table_Data.get("PI_DateQuoteNeeded"));

			lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
			lhm_TestCase_Table_Data.clear();
		} catch (Exception e) {

		}
	}

	public static void primaryNamedInsured() throws Throwable {
		try {
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcelWorkSheet_Fillo("policyInfo", strTestCaseName);

			GuidewireAutomate_Validation("Primary Named Insured ", PI_PNI, "equals", "Primary Named Insured");
			GuidewireAutomate_Validation("Name", PI_PNI_Name, "equals", strAccountName);
			GuidewireAutomate_Validation("AddressType", PI_PNI__AddressType, "equals", lhm_TestCase_Table_Data.get("PI_PNI__AddressType"));

			lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
			lhm_TestCase_Table_Data.clear();
		} catch (Exception e) {

		}
	}

	public static void businessandOperations() throws Throwable {
		try {
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcelWorkSheet_Fillo("policyInfo", strTestCaseName);
			GuidewireAutomate_Validation("Business and Operations", PI_BO, "equals", "Business and Operations");

		} catch (Exception e) {

		}
	}

	public static void OrganizationType() throws Throwable {
		try {
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcelWorkSheet_Fillo("policyInfo", strTestCaseName);

			GuidewireAutomate("OrganizationType", PI_OrganizationType, "selectByVisibleText", lhm_TestCase_Table_Data.get("PI_OrganizationType"));
			/*
			 * GuidewireAutomate("Description", PI_Description, "clearANDsendKeys", lhm_TestCase_Table_Data.get("PI_Description"));
			 */

		} catch (Exception e) {

		}
	}

	public static void OfficialID() throws Throwable {
		try {
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcelWorkSheet_Fillo("policyInfo", strTestCaseName);

			GuidewireAutomate_Validation("Official IDs", PI_OfficialID, "equals", "Official IDs");

			lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
			lhm_TestCase_Table_Data.clear();
		} catch (Exception e) {

		}
	}

	public static void policyDetails() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcelWorkSheet_Fillo("policyInfo", strTestCaseName);

		GuidewireAutomate_Validation("Section", PI_PolicyDetails, "equals", "Policy Details");

		GuidewireAutomate_Validation("Term Type", PI_PD_TermType, "FirstSelectedOptionEquals", lhm_TestCase_Table_Data.get("PI_PD_TermType"));

		GuidewireAutomate("Effective Date", PI_PD_EffectiveDate, "clearsendKeysTABTAB", lhm_TestCase_Table_Data.get("PI_PD_EffectiveDate"));
		GuidewireAutomate("Written Date", PI_PD_WrittenDate, "clearANDsendKeys", lhm_TestCase_Table_Data.get("PI_PD_WrittenDate"));
		getStaleElement("Expiration Date", PI_PD_ExpirationDate);
		GuidewireAutomate_Validation("Expiration Date", PI_PD_ExpirationDate, "equals", lhm_TestCase_Table_Data.get("PI_PD_ExpirationDate"));
		GuidewireAutomate("Preffered Language", PI_PD_PrefferedLanguage, "selectByVisibleText", lhm_TestCase_Table_Data.get("PI_PD_PrefferedLanguage"));

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	public static void affinityGroup() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcelWorkSheet_Fillo("policyInfo", strTestCaseName);

		GuidewireAutomate_Validation("Section", PI_AffinityGroup, "equals", "Affinity Group");

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	public static void producerOfRecord() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcelWorkSheet_Fillo("policyInfo", strTestCaseName);

		GuidewireAutomate_Validation("Section", PI_ProducerofRecord, "equals", "Producer of Record");

		GuidewireAutomate_Validation("Organization", PI_PR_Organization, "valueEquals", lhm_TestCase_Table_Data.get("PI_PR_Organization"));
		GuidewireAutomate_Validation("ProducerCode", PI_PR_ProducerCode, "FirstSelectedOptionEquals", lhm_TestCase_Table_Data.get("PI_PR_ProducerCode"));
		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	public static void underWritingCompany() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcelWorkSheet_Fillo("policyInfo", strTestCaseName);

		GuidewireAutomate_Validation("Section", PI_UnderwritingCompanies, "equals", "Underwriting Companies");

		GuidewireAutomate("UC Name", PI_UC_Name, "selectByVisibleText", lhm_TestCase_Table_Data.get("PI_UC_Name"));

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

}
