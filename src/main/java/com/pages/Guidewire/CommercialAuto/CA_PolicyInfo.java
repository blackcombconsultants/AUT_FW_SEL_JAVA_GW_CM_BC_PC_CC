package com.pages.Guidewire.CommercialAuto;

import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Resuables_PO;

public class CommercialAuto_PolicyInfo extends SeleniumWebDriver_Commands implements CommercialAuto_PolicyInfo_PO {

	public CommercialAuto_PolicyInfo(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);

	}

	public static void dateQuoteNeeded() throws Throwable {

		try {
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("policyInfo",
					strTestCaseName);

			GuidewireAutomate_Validation("Screen Header", PolicyCenter_Resuables_PO.Screen_Header, "equals",
					"Policy Info");

			GuidewireAutomate("Date Quote Needed", PI_DateQuoteNeeded, "sendKeys",
					lhm_TestCase_Table_Data.get("PI_DateQuoteNeeded"));

			lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
			lhm_TestCase_Table_Data.clear();
		} catch (Exception e) {

		}
	}

	public static void primaryNamedInsured() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("policyInfo",
				strTestCaseName);

		try {
			GuidewireAutomate_Validation("Screen Header", PolicyCenter_Resuables_PO.Screen_Header, "equals",
					"Policy Info");

			GuidewireAutomate_Validation("Name", PrimaryNamedInsured_Name, "equals", strAccountName);

			GuidewireAutomate_Validation("Phone", PrimaryNamedInsured_Phone, "equals",
					lhm_TestCase_Table_Data.get("PrimaryNI_Phone"));
			GuidewireAutomate_Validation("Policy Address", PrimaryNamedInsured_PolicyAddress, "contains",
					lhm_TestCase_Table_Data.get("PrimaryNI_PolicyAddress"));
			GuidewireAutomate_Validation("County", PrimaryNamedInsured_County, "equals",
					lhm_TestCase_Table_Data.get("PrimaryNI_County"));
			GuidewireAutomate_Validation("Address Type", PrimaryNamedInsured_AddressType, "equals",
					lhm_TestCase_Table_Data.get("PrimaryNI_AddressType"));
			/*
			 * GuidewireAutomate_Validation("Address Description",
			 * PrimaryNamedInsured_AddressDescription, "equals",
			 * lhm_TestCase_Table_Data.get("PrimaryNI_AddressDescription"));
			 */
			lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
			lhm_TestCase_Table_Data.clear();
		} catch (Exception e) {

		}
	}

	public static void primaryNamedInsured_ChangeTo_NewPerson() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("policyInfo",
				strTestCaseName);

		try {

			lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
			lhm_TestCase_Table_Data.clear();
		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}

	}

	public static void primaryNamedInsured_ChangeTo_FromAddressBook() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("policyInfo",
				strTestCaseName);
		try {

			lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
			lhm_TestCase_Table_Data.clear();
		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}

	public static void primaryNamedInsured_ChangeTo_ExistingContact() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("policyInfo",
				strTestCaseName);
		try {

			lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
			lhm_TestCase_Table_Data.clear();
		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}

	public static void primaryNamedInsured_Edit() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("policyInfo",
				strTestCaseName);
		try {

			lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
			lhm_TestCase_Table_Data.clear();
		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}

	public static void policyAddress() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("policyInfo",
				strTestCaseName);
		try {

			lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
			lhm_TestCase_Table_Data.clear();
		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}

	}

	public static void policyAddress_ChangeTo_NewAddress() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("policyInfo",
				strTestCaseName);
		try {

			lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
			lhm_TestCase_Table_Data.clear();
		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}

	public static void policyAddress_ChangeTo_EditCurrentAddress() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("policyInfo",
				strTestCaseName);
		try {

			lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
			lhm_TestCase_Table_Data.clear();
		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}

	public static void pi_OfficialID() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("policyInfo",
				strTestCaseName);

		try {
			GuidewireAutomate_Validation("Official IDs", PI_OfficialID, "equals", "Official IDs");

			// GuidewireAutomate_Validation("SSN", PI_OI_SSN, "valueEquals",
			// lhm_TestCase_Table_Data.get("PrimaryNI_SSN"));

			lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
			lhm_TestCase_Table_Data.clear();
		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}

	public static void secondaryInsured_NewPerson() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("policyInfo",
				strTestCaseName);
		try {

			lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
			lhm_TestCase_Table_Data.clear();
		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}

	public static void secondaryInsured_FromAddressBook() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("policyInfo",
				strTestCaseName);
		try {

			lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
			lhm_TestCase_Table_Data.clear();
		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}

	public static void secondaryInsured_ExistingContact() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("policyInfo",
				strTestCaseName);
		try {

			lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
			lhm_TestCase_Table_Data.clear();
		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}

	public static void additionalNamedInsured_Add_NewCompany() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("policyInfo",
				strTestCaseName);
		try {

			lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
			lhm_TestCase_Table_Data.clear();
		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}

	public static void additionalNamedInsured_Add_NewPerson() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("policyInfo",
				strTestCaseName);
		try {

			lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
			lhm_TestCase_Table_Data.clear();
		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}

	public static void additionalNamedInsured_Add_FromAddresssBook() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("policyInfo",
				strTestCaseName);
		try {

			lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
			lhm_TestCase_Table_Data.clear();
		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}

	public static void additionalNamedInsured_Edit() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("policyInfo",
				strTestCaseName);
		try {

			lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
			lhm_TestCase_Table_Data.clear();
		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}

	public static void additionalNamedInsured_Remove() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("policyInfo",
				strTestCaseName);
		try {

			lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
			lhm_TestCase_Table_Data.clear();
		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}

	public static void policyDetails() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("policyInfo",
				strTestCaseName);

		try {
			GuidewireAutomate_Validation("Section", PI_PolicyDetails, "equals", "Policy Details");

			GuidewireAutomate("Term Type", PI_PD_TermType, "selectByVisibleTextAndwait",
					lhm_TestCase_Table_Data.get("PI_PD_TermType"));
			GuidewireAutomate("Effective Date", PI_PD_EffectiveDate, "clearsendKeysTABTAB",
					lhm_TestCase_Table_Data.get("PI_PD_EffectiveDate"));
			GuidewireAutomate("Written Date", PI_PD_WrittenDate, "clearANDsendKeys",
					lhm_TestCase_Table_Data.get("PI_PD_WrittenDate"));
			getStaleElement("Expiration Date", PI_PD_ExpirationDate);
			GuidewireAutomate_Validation("Expiration Date", PI_PD_ExpirationDate, "equals",
					lhm_TestCase_Table_Data.get("PI_PD_ExpirationDate"));
			GuidewireAutomate("Preffered Language", PI_PD_PrefferedLanguage, "selectByVisibleText",
					lhm_TestCase_Table_Data.get("PI_PD_PrefferedLanguage"));

			lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
			lhm_TestCase_Table_Data.clear();
		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}

	}

	public static void policyDetails_fetch() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("policyInfo",
				strTestCaseName);

		try {

			GuidewireAutomate_Validation("Section", PI_PolicyDetails, "equals", "Policy Details");

			GuidewireAutomate_Validation("Effective Date", PI_PD_EffectiveDate, "fetchValue",
					lhm_TestCase_Table_Data.get("PI_PD_EffectiveDate"));
			GuidewireAutomate_Validation("Expiration Date", PI_PD_ExpirationDate, "fetch",
					lhm_TestCase_Table_Data.get("PI_PD_ExpirationDate"));
			GuidewireAutomate_Validation("Written Date", PI_PD_WrittenDate, "fetchValue",
					lhm_TestCase_Table_Data.get("PI_PD_WrittenDate"));

			lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
			lhm_TestCase_Table_Data.clear();
		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}

	}

	public static void policyDetails_Rewrite() throws Throwable {

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("policyInfo",
				strTestCaseName);

		try {
			GuidewireAutomate_Validation("Section", PI_PolicyDetails, "equals", "Policy Details");

			GuidewireAutomate("Term Type", PI_PD_TermType, "selectByVisibleTextAndwait",
					lhm_TestCase_Table_Data.get("PI_PD_TermType"));
			GuidewireAutomate_Validation("Term Number", PI_PD_TermNumber, "equals", "2");
			GuidewireAutomate_Validation("Effective Date", PI_PD_EffectiveDate, "fetch",
					lhm_TestCase_Table_Data.get("PI_PD_EffectiveDate"));
			GuidewireAutomate_Validation("Written Date", PI_PD_WrittenDate, "fetch",
					lhm_TestCase_Table_Data.get("PI_PD_WrittenDate"));
			GuidewireAutomate_Validation("Expiration Date", PI_PD_ExpirationDate, "fetch",
					lhm_TestCase_Table_Data.get("PI_PD_ExpirationDate"));

			lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
			lhm_TestCase_Table_Data.clear();
		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}

	}

	public static void affinityGroup() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("policyInfo",
				strTestCaseName);
		
		try {

			GuidewireAutomate_Validation("Section", PI_AffinityGroup, "equals", "Affinity Group");

			GuidewireAutomate("AffinityGroup_Name", PI_AG_Name, "sendKeys", lhm_TestCase_Table_Data.get("PI_AG_Name"));
			lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
			lhm_TestCase_Table_Data.clear();
		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}

		
	}

	public static void producerOfRecord() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("policyInfo",
				strTestCaseName);
		
		try {
			GuidewireAutomate_Validation("Section", PI_ProducerofRecord, "equals", "Producer of Record");

			GuidewireAutomate_Validation("Organization", PI_PR_Organization, "valueEquals",
					lhm_TestCase_Table_Data.get("PI_PR_Organization"));
			GuidewireAutomate_Validation("ProducerCode", PI_PR_ProducerCode, "FirstSelectedOptionEquals",
					lhm_TestCase_Table_Data.get("PI_PR_ProducerCode"));
			lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
			lhm_TestCase_Table_Data.clear();
		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}

		
	}

	public static void underWritingCompany() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("policyInfo",
				strTestCaseName);
		
		try {
			GuidewireAutomate_Validation("Section", PI_UnderwritingCompanies, "equals", "Underwriting Companies");

			GuidewireAutomate("UC Name", PI_UC_Name, "selectByVisibleText", lhm_TestCase_Table_Data.get("PI_UC_Name"));

			lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
			lhm_TestCase_Table_Data.clear();
		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}

		
	}

}
