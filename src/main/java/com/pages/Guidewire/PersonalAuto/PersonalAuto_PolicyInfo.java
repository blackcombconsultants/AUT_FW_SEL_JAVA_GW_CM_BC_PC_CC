package com.pages.Guidewire.PersonalAuto;

import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;

public class PersonalAuto_PolicyInfo extends SeleniumWebDriver_Commands implements PersonalAuto_PolicyInfo_PO {
	Selenium_Utils_DataBase oDB = new Selenium_Utils_DataBase();

	public PersonalAuto_PolicyInfo(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	@Override
	public void pi_primaryInsured_NewPerson() throws Throwable {
		// TODO Auto-generated method stub

	}

	@Override
	public void pi_primaryInsured_FromAddressBook() throws Throwable {
		// TODO Auto-generated method stub

	}

	@Override
	public void pi_primaryInsured_ExistingContact() throws Throwable {
		// TODO Auto-generated method stub

	}

	@Override
	public void pi_primaryNamedInsured_Edit() throws Throwable {
		// TODO Auto-generated method stub

	}

	@Override
	public void pi_PolicyAddress_NewAddress() throws Throwable {
		// TODO Auto-generated method stub

	}

	@Override
	public void pi_PolicyAddress_EditCurrentAddress() throws Throwable {
		// TODO Auto-generated method stub

	}

	@Override
	public void pi_OfficialID() throws Throwable {
		// TODO Auto-generated method stub

	}

	@Override
	public void pi_SecondaryInsured_NewPerson() throws Throwable {
		// TODO Auto-generated method stub

	}

	@Override
	public void pi_SecondaryInsured_FromAddressBook() throws Throwable {
		// TODO Auto-generated method stub

	}

	@Override
	public void pi_SecondaryInsured_ExistingContact() throws Throwable {
		// TODO Auto-generated method stub

	}

	@Override
	public void pi_AdditionalNamedInsured_Add_NewCompany() throws Throwable {
		// TODO Auto-generated method stub

	}

	@Override
	public void pi_AdditionalNamedInsured_Add_NewPerson() throws Throwable {
		// TODO Auto-generated method stub

	}

	@Override
	public void pi_AdditionalNamedInsured_Add_FromAddresssBook() throws Throwable {
		// TODO Auto-generated method stub

	}

	@Override
	public void pi_AdditionalNamedInsured_Edit() throws Throwable {
		// TODO Auto-generated method stub

	}

	@Override
	public void pi_AdditionalNamedInsured_Remove() throws Throwable {
		// TODO Auto-generated method stub

	}

	@Override
	public void pi_PolicyDetails() throws Throwable {
		// TODO Auto-generated method stub

	}

	@Override
	public void pi_AffinityGroup() throws Throwable {
		// TODO Auto-generated method stub

	}

	@Override
	public void pi_ProducerOfRecord() throws Throwable {
		// TODO Auto-generated method stub

	}

	@Override
	public void pi_UnderWritingCompany() throws Throwable {
		// TODO Auto-generated method stub

	}

	@Override
	public void policyInfo() throws Throwable {

		lhm_TestCase_Table_Data = oDB.getData_MSExcel_WorkSheet_Fillo("policyInfo", strTestCaseName);

		GuidewireAutomate_Validation("Policy Info", PolicyInfo_Header, "equal", "Policy Info");

		GuidewireAutomate("Date Quote Needed", PI_DateQuoteNeeded, "sendkeys",
				lhm_TestCase_Table_Data.get("PI_DateQuoteNeeded"));

		GuidewireAutomate_Validation("Name", PrimaryNamedInsured_Name, "equal",
				lhm_TestCase_Table_Data.get("PrimaryNI_Name"));
		GuidewireAutomate_Validation("Phone", PrimaryNamedInsured_Phone, "equal",
				lhm_TestCase_Table_Data.get("PrimaryNI_Phone"));
		GuidewireAutomate_Validation("Policy Address", PrimaryNamedInsured_PolicyAddress, "equal",
				lhm_TestCase_Table_Data.get("PrimaryNI_PolicyAddress"));
		GuidewireAutomate_Validation("County", PrimaryNamedInsured_County, "equal",
				lhm_TestCase_Table_Data.get("PrimaryNI_County"));
		GuidewireAutomate_Validation("Address Type", PrimaryNamedInsured_AddressType, "equal",
				lhm_TestCase_Table_Data.get("PrimaryNI_AddressType"));
		GuidewireAutomate_Validation("Address Description", PrimaryNamedInsured_AddressDescription, "equal",
				lhm_TestCase_Table_Data.get("PrimaryNI_AddressDescription"));
		GuidewireAutomate_Validation("PrimaryNI SSN", PrimaryNamedInsured_SSN, "equal",
				lhm_TestCase_Table_Data.get("PrimaryNI_SSN"));

		GuidewireAutomate("Term Type", PolicyDetails_TermType, "selectByVisibleText",
				lhm_TestCase_Table_Data.get("PolicyDetails_TermType"));
		GuidewireAutomate_Validation("Term Number", PolicyDetails_TermNumber, "equal",
				lhm_TestCase_Table_Data.get("PolicyDetails_TermNumber"));

		GuidewireAutomate("Effective Date", PolicyDetails_EffectiveDate, "sendkeys",
				lhm_TestCase_Table_Data.get("PolicyDetails_EffectiveDate"));
		GuidewireAutomate_Validation("Expiration Date", PolicyDetails_ExpirationDate, "equal",
				lhm_TestCase_Table_Data.get("PolicyDetails_ExpirationDate"));
		GuidewireAutomate("Written Date", PolicyDetails_WrittenDate, "sendkeys",
				lhm_TestCase_Table_Data.get("PolicyDetails_WrittenDate"));
		GuidewireAutomate_Validation("Rate AsOf Date", PolicyDetails_RateAsOfDate, "equal",
				lhm_TestCase_Table_Data.get("PolicyDetails_RateAsOfDate"));

		GuidewireAutomate("Preffered Language", PolicyDetails_PrefferedLanguage, "selectByVisibleText",
				lhm_TestCase_Table_Data.get("PolicyDetails_PrefferedLanguage"));

		GuidewireAutomate("AffinityGroup_Name", AffinityGroup_Name, "sendkeys",
				lhm_TestCase_Table_Data.get("AffinityGroup_Name"));

		GuidewireAutomate("Organization", ProducerofRecord_Organization, "sendkeys",
				lhm_TestCase_Table_Data.get("ProducerofRecord_Organization"));
		GuidewireAutomate("ProducerCode", ProducerofRecord_ProducerCode, "selectByVisibleText",
				lhm_TestCase_Table_Data.get("ProducerofRecord_ProducerCode"));

		GuidewireAutomate("Underwriting Companies", UnderwritingCompanies, "selectByVisibleText",
				lhm_TestCase_Table_Data.get("UnderwritingCompanies"));

	}

}
