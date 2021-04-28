package com.pages.Guidewire.PersonalAuto;

import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;
import com.pages.Guidewire.PolicyCenter.GW_PolicyCenter_Resuables_PO;

public class PersonalAuto_PolicyInfo extends SeleniumWebDriver_Commands implements PersonalAuto_PolicyInfo_PO {
	Selenium_Utils_DataBase oDB = new Selenium_Utils_DataBase();

	public PersonalAuto_PolicyInfo(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	@Override
	public void policyInfo() throws Throwable {

		lhm_TestCase_Table_Data = oDB.getData_MSExcel_WorkSheet_Fillo("policyInfo", strTestCaseName);

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	@Override
	public void primaryNamedInsured() throws Throwable {
		lhm_TestCase_Table_Data = oDB.getData_MSExcel_WorkSheet_Fillo("policyInfo", strTestCaseName);

		GuidewireAutomate_Validation("Screen Header", GW_PolicyCenter_Resuables_PO.Screen_Header, "equals",
				"Policy Info");

		GuidewireAutomate("Date Quote Needed", PI_DateQuoteNeeded, "sendkeys",
				lhm_TestCase_Table_Data.get("PI_DateQuoteNeeded"));

		if (lhm_TestCase_Table_Data.get("PrimaryNI_Name").contains("global")) {
			GuidewireAutomate_Validation("Name", PrimaryNamedInsured_Name, "equals", strAccountName);
		} else if (lhm_TestCase_Table_Data.get("PrimaryNI_Name").contains("refer")) {
			GuidewireAutomate_Validation("Name", PrimaryNamedInsured_Name, "equals",
					lhm_TestCase_Data.get("PrimaryNI_Name"));
		} else {
			GuidewireAutomate_Validation("Name", PrimaryNamedInsured_Name, "equals",
					lhm_TestCase_Table_Data.get("PrimaryNI_Name"));
		}

		GuidewireAutomate_Validation("Phone", PrimaryNamedInsured_Phone, "equals",
				lhm_TestCase_Table_Data.get("PrimaryNI_Phone"));
		GuidewireAutomate_Validation("Policy Address", PrimaryNamedInsured_PolicyAddress, "equals",
				lhm_TestCase_Table_Data.get("PrimaryNI_PolicyAddress"));
		GuidewireAutomate_Validation("County", PrimaryNamedInsured_County, "equals",
				lhm_TestCase_Table_Data.get("PrimaryNI_County"));
		GuidewireAutomate_Validation("Address Type", PrimaryNamedInsured_AddressType, "equals",
				lhm_TestCase_Table_Data.get("PrimaryNI_AddressType"));
		GuidewireAutomate_Validation("Address Description", PrimaryNamedInsured_AddressDescription, "equals",
				lhm_TestCase_Table_Data.get("PrimaryNI_AddressDescription"));

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	@Override
	public void primaryNamedInsured_ChangeTo_NewPerson() throws Throwable {
		lhm_TestCase_Table_Data = oDB.getData_MSExcel_WorkSheet_Fillo("policyInfo", strTestCaseName);

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	@Override
	public void primaryNamedInsured_ChangeTo_FromAddressBook() throws Throwable {
		lhm_TestCase_Table_Data = oDB.getData_MSExcel_WorkSheet_Fillo("policyInfo", strTestCaseName);

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	@Override
	public void primaryNamedInsured_ChangeTo_ExistingContact() throws Throwable {
		lhm_TestCase_Table_Data = oDB.getData_MSExcel_WorkSheet_Fillo("policyInfo", strTestCaseName);

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	@Override
	public void primaryNamedInsured_Edit() throws Throwable {
		lhm_TestCase_Table_Data = oDB.getData_MSExcel_WorkSheet_Fillo("policyInfo", strTestCaseName);

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	@Override
	public void policyAddress() throws Throwable {
		lhm_TestCase_Table_Data = oDB.getData_MSExcel_WorkSheet_Fillo("policyInfo", strTestCaseName);

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();

	}

	@Override
	public void policyAddress_ChangeTo_NewAddress() throws Throwable {
		lhm_TestCase_Table_Data = oDB.getData_MSExcel_WorkSheet_Fillo("policyInfo", strTestCaseName);

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	@Override
	public void policyAddress_ChangeTo_EditCurrentAddress() throws Throwable {
		lhm_TestCase_Table_Data = oDB.getData_MSExcel_WorkSheet_Fillo("policyInfo", strTestCaseName);

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	@Override
	public void pi_OfficialID() throws Throwable {
		lhm_TestCase_Table_Data = oDB.getData_MSExcel_WorkSheet_Fillo("policyInfo", strTestCaseName);

		GuidewireAutomate_Validation("Official IDs", PI_OfficialID, "equals", "Official IDs");

		GuidewireAutomate_Validation("SSN", PI_OI_SSN, "valueEquals", lhm_TestCase_Table_Data.get("PrimaryNI_SSN"));

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	@Override
	public void secondaryInsured_NewPerson() throws Throwable {
		lhm_TestCase_Table_Data = oDB.getData_MSExcel_WorkSheet_Fillo("policyInfo", strTestCaseName);

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	@Override
	public void secondaryInsured_FromAddressBook() throws Throwable {
		lhm_TestCase_Table_Data = oDB.getData_MSExcel_WorkSheet_Fillo("policyInfo", strTestCaseName);

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	@Override
	public void secondaryInsured_ExistingContact() throws Throwable {
		lhm_TestCase_Table_Data = oDB.getData_MSExcel_WorkSheet_Fillo("policyInfo", strTestCaseName);

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	@Override
	public void additionalNamedInsured_Add_NewCompany() throws Throwable {
		lhm_TestCase_Table_Data = oDB.getData_MSExcel_WorkSheet_Fillo("policyInfo", strTestCaseName);

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	@Override
	public void additionalNamedInsured_Add_NewPerson() throws Throwable {
		lhm_TestCase_Table_Data = oDB.getData_MSExcel_WorkSheet_Fillo("policyInfo", strTestCaseName);

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	@Override
	public void additionalNamedInsured_Add_FromAddresssBook() throws Throwable {
		lhm_TestCase_Table_Data = oDB.getData_MSExcel_WorkSheet_Fillo("policyInfo", strTestCaseName);

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	@Override
	public void additionalNamedInsured_Edit() throws Throwable {
		lhm_TestCase_Table_Data = oDB.getData_MSExcel_WorkSheet_Fillo("policyInfo", strTestCaseName);

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	@Override
	public void additionalNamedInsured_Remove() throws Throwable {
		lhm_TestCase_Table_Data = oDB.getData_MSExcel_WorkSheet_Fillo("policyInfo", strTestCaseName);

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	@Override
	public void policyDetails() throws Throwable {
		lhm_TestCase_Table_Data = oDB.getData_MSExcel_WorkSheet_Fillo("policyInfo", strTestCaseName);

		GuidewireAutomate_Validation("Policy Details", PI_PolicyDetails, "equals", "Policy Details");

		GuidewireAutomate("Term Type", PI_PD_TermType, "selectByVisibleText",
				lhm_TestCase_Table_Data.get("PI_PD_TermType"));
		/*
		 * GuidewireAutomate_Validation("Term Number", PI_PD_TermNumber, "equals",
		 * lhm_TestCase_Table_Data.get("PI_PD_TermNumber"));
		 */
		GuidewireAutomate("Effective Date", PI_PD_EffectiveDate, "clearAndsendkeys",
				lhm_TestCase_Table_Data.get("PI_PD_EffectiveDate"));
		GuidewireAutomate_Validation("Expiration Date", PI_PD_ExpirationDate, "equals",
				lhm_TestCase_Table_Data.get("PI_PD_ExpirationDate"));
		GuidewireAutomate("Written Date", PI_PD_WrittenDate, "clearAndsendkeys",
				lhm_TestCase_Table_Data.get("PI_PD_WrittenDate"));
		/*
		 * GuidewireAutomate_Validation("Rate AsOf Date", PI_PD_RateAsOfDate, "equals",
		 * lhm_TestCase_Table_Data.get("PI_PD_RateAsOfDate"));
		 */
		GuidewireAutomate("Preffered Language", PI_PD_PrefferedLanguage, "selectByVisibleText",
				lhm_TestCase_Table_Data.get("PI_PD_PrefferedLanguage"));

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	@Override
	public void affinityGroup() throws Throwable {
		lhm_TestCase_Table_Data = oDB.getData_MSExcel_WorkSheet_Fillo("policyInfo", strTestCaseName);

		GuidewireAutomate_Validation("Affinity Group", PI_AffinityGroup, "equals", "Affinity Group");

		GuidewireAutomate("AffinityGroup_Name", PI_AG_Name, "sendkeys", lhm_TestCase_Table_Data.get("PI_AG_Name"));
		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	@Override
	public void producerOfRecord() throws Throwable {
		lhm_TestCase_Table_Data = oDB.getData_MSExcel_WorkSheet_Fillo("policyInfo", strTestCaseName);

		GuidewireAutomate_Validation("Producer of Record", PI_ProducerofRecord, "equals", "Producer of Record");

		GuidewireAutomate_Validation("Organization", PI_PR_Organization, "valueEquals",
				lhm_TestCase_Table_Data.get("PI_PR_Organization"));
		GuidewireAutomate_Validation("ProducerCode", PI_PR_ProducerCode, "FirstSelectedOptionEquals",
				lhm_TestCase_Table_Data.get("PI_PR_ProducerCode"));
		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	@Override

	public void underWritingCompany() throws Throwable {
		lhm_TestCase_Table_Data = oDB.getData_MSExcel_WorkSheet_Fillo("policyInfo", strTestCaseName);

		GuidewireAutomate_Validation("Underwriting Companies", PI_UnderwritingCompanies, "equals",
				"Underwriting Companies");

		GuidewireAutomate("UC Name", PI_UC_Name, "selectByVisibleText",
				lhm_TestCase_Table_Data.get("PI_UC_Name"));
		
		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

}
