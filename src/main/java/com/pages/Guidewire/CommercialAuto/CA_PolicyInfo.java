package com.pages.Guidewire.CommercialAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Resuables_PO;

public class CA_PolicyInfo extends SeleniumWebDriver_Commands  {

	public CA_PolicyInfo(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);

	}  
	private static By PolicyInfo_Header = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[text()='Policy Info']");

	private static By PI_DateQuoteNeeded                                            = By.xpath("//input[contains(@name,'DateQuoteNeeded')]");
	private static By PrimaryNamedInsured_ChangeTo_Button                           = By.xpath("//div[contains(@id,'ChangePrimaryNamedInsuredButtonMenuIcon')]");
	private static By PrimaryNamedInsured_ChangeTo_NewPerson                        = By.xpath("//div[contains(@id,'ChangePrimaryNamedInsuredButtonMenuIcon')]/div[@class='gw-subMenu gw-open']//div[@class='gw-label' and text()='New Person']");
	private static By PrimaryNamedInsured_ChangeTo_FromAddressBook                  = By.xpath("//div[contains(@id,'ChangePrimaryNamedInsuredButtonMenuIcon')]/div[@class='gw-subMenu gw-open']//div[@class='gw-label' and text()='From Address Book']");
	private static By PrimaryNamedInsured_ChangeTo_ExistingContact                  = By.xpath("//div[contains(@id,'ChangePrimaryNamedInsuredButtonMenuIcon')]/div[@class='gw-subMenu gw-open']//div[@class='gw-label' and text()='Existing Contact']");
	private static By PrimaryNamedInsured_Name                                      = By.xpath("//div[contains(@id,'AccountInfoInputSet-Name')]//div[contains(@id,'AccountInfoInputSet-Name_button')]");
	private static By PrimaryNamedInsured_Phone                                     = By.xpath("//div[contains(@id,'AccountInfoInputSet-Phone-GlobalPhoneInputSet-PhoneDisplay')]//div[contains(@class,'gw-value-readonly-wrapper')]");
	private static By PrimaryNamedInsured_PolicyAddress_ChangeTo_Button             = By.xpath("//div[contains(@id,'ChangePolicyAddressButton-ChangePolicyAddressButtonMenuIcon')]");
	private static By PrimaryNamedInsured_PolicyAddress_ChangeTo_NewAdress          = By
			.xpath("//div[contains(@id,'ChangePolicyAddressButton-ChangePolicyAddressButtonMenuIcon')]/div[@class='gw-subMenu gw-open']//div[@class='gw-label' and text()='New Person']");
	private static By PrimaryNamedInsured_PolicyAddress_ChangeTo_EditCurrentAddress = By
			.xpath("//div[contains(@id,'ChangePolicyAddressButton-ChangePolicyAddressButtonMenuIcon')]/div[@class='gw-subMenu gw-open']//div[@class='gw-label' and text()='Edit Current Address']");
	private static By PrimaryNamedInsured_PolicyAddress                             = By.xpath("//div[contains(@id,'GlobalAddressInputSet-AddressSummary')]//div[contains(@class,'gw-value-readonly-wrapper')]");
	private static By PrimaryNamedInsured_County                                    = By.xpath("//div[contains(@id,'GlobalAddressInputSet-County')]//div[contains(@class,'gw-value-readonly-wrapper')]");
	private static By PrimaryNamedInsured_AddressType                               = By.xpath("//div[contains(@id,'AddressType') and contains(@class,'gw-ValueWidget')]//div[contains(@class,'gw-label')]");
	private static By PrimaryNamedInsured_AddressDescription                        = By.xpath("//div[contains(@id,'AddressDescription') and contains(@class,'gw-ValueWidget')]//div[contains(@class,'gw-value-readonly-wrapper')]");

	static By NewPrimaryNamedInsured = By.xpath("//div[contains(@id,'ContactDetailScreen-ttlBar')]//div[@class='gw-TitleBar--title']");
	static By PI_AddNewPerson = By.xpath("//div[contains(@id,'PolicyContactRoleNameInputSet-0')]");
	static By PI_Firstname = By.xpath("//input[contains(@name,'GlobalPersonNameInputSet-FirstName')]");
	static By PI_Lastname = By.xpath("//input[contains(@name,'GlobalPersonNameInputSet-LastName')]");
	static By PI_Address_1 = By.xpath("//input[contains(@name,'GlobalAddressInputSet-AddressLine1')]");
	static By PI_StateName = By.xpath("//select[contains(@Name,'globalAddressContainer-GlobalAddressInputSet-State')]");
	static By PI_AddressType = By.xpath("//select[contains(@name,'PolicyContactDetailsDV-AddressType')]");



	/*
	 * Official IDs
	 */
	private static By PI_OfficialID = By.xpath("//div[contains(@class,'gw-LabelWidget')]/div[contains(@class,'gw-label') and text()='Official IDs']");
	private static By PI_OI_SSN     = By.xpath("//input[contains(@name,'OfficialIDDV_Input')]");
	
	//Organization Type
	private static By OrganizationTypeSection = By.xpath("//div[contains(@id,'OrganizationType_Input')]//div[@class='gw-label']");
	private static By OrganizationType = By.xpath("//select[contains(@name,'AccountInfoInputSet-OrganizationType')]");

	/*
	 * Secondary Named Insured
	 */
	private static By PI_SecondaryNamedInsured = By.xpath("//div[contains(@class,'gw-boldLabel') and text()='Secondary Named Insured']");

	private static By SecondaryNamedInsured_Add_Button          = By.xpath("//div[contains(@id,'ChangeSecondaryNamedInsuredButtonMenuIcon')]");
	private static By SecondaryNamedInsured_Add_NewPerson       = By.xpath("//div[contains(@id,'ChangeSecondaryNamedInsuredButtonMenuIcon')]/div[@class='gw-subMenu gw-open']//div[@class='gw-label' and text()='New Person']");
	private static By SecondaryNamedInsured_Add_FromAddressBook = By.xpath("//div[contains(@id,'ChangeSecondaryNamedInsuredButtonMenuIcon')]/div[@class='gw-subMenu gw-open']//div[@class='gw-label' and text()='From Address Book']");
	private static By SecondaryNamedInsured_Add_ExistingContact = By.xpath("//div[contains(@id,'ChangeSecondaryNamedInsuredButtonMenuIcon')]/div[@class='gw-subMenu gw-open']//div[@class='gw-label' and text()='Existing Contact']");

	/*
	 * Additional Named Insureds
	 */
	private static By PI_AdditionalNamedInsureds = By.xpath("//div[contains(@class,'gw-boldLabel') and text()='Additional Named Insureds']");

	private static By AdditionalNamedInsured_Add_Button          = By.xpath("//div[contains(@id,'AdditionalNamedInsuredInputSet-NamedInsuredsLV_tb-AddContactsButton')]//div[text()='Add']");
	private static By AdditionalNamedInsured_Add_NewPerson       = By.xpath("//div[contains(@id,'AdditionalNamedInsuredInputSet-NamedInsuredsLV_tb-AddContactsButton')]/div[@class='gw-subMenu gw-open']//div[@class='gw-label' and text()='New Person']");
	private static By AdditionalNamedInsured_Add_FromAddressBook = By.xpath("//div[contains(@id,'AdditionalNamedInsuredInputSet-NamedInsuredsLV_tb-AddContactsButton')]/div[@class='gw-subMenu gw-open']//div[@class='gw-label' and text()='From Address Book']");
	private static By AdditionalNamedInsured_Add_ExistingContact = By.xpath("//div[contains(@id,'AdditionalNamedInsuredInputSet-NamedInsuredsLV_tb-AddContactsButton')]/div[@class='gw-subMenu gw-open']//div[@class='gw-label' and text()='Existing Contact']");

	/*
	 * Policy Details
	 */
	private static By PI_PolicyDetails = By.xpath("//div[contains(@class,'gw-boldLabel') and text()='Policy Details']");

	private static By PI_PD_TermType           = By.xpath("//select[contains(@name,'PolicyInfoInputSet-TermType')]");
	private static By PI_PD_TermNumber         = By.xpath("//div[contains(@id,'PolicyInfoInputSet-TermNumber')]//div[contains(@class,'gw-value-readonly-wrapper')]");
	private static By PI_PD_EffectiveDate      = By.xpath("//input[contains(@name,'PolicyInfoInputSet-EffectiveDate')]");
	private static By PI_PD_ExpirationDateEdit = By.xpath("//input[contains(@name,'PolicyInfoInputSet-ExpirationDate')]");
	private static By PI_PD_ExpirationDate     = By.xpath("//div[contains(@id,'PolicyInfoInputSet-ExpirationDate')]//div[contains(@class,'gw-value-readonly-wrapper')]");
	private static By PI_PD_WrittenDate        = By.xpath("//input[contains(@name,'PolicyInfoInputSet-WrittenDate')]");
	private static By PI_PD_RateAsOfDate       = By.xpath("//div[contains(@id,'PolicyInfoInputSet-RateAsOfDate')]//div[contains(@class,'gw-value-readonly-wrapper')]");
	private static By PI_PD_RateAsOfDateBaseState = By.xpath("//select[contains(@name,'InfoInputSet-BaseState')]");

	private static By PI_PD_PrefferedLanguage = By.xpath("//select[contains(@name,'PolicyInfoInputSet-PrimaryLanguage')]");

	/*
	 * Affinity Group
	 */
	private static By PI_AffinityGroup = By.xpath("//div[contains(@class,'gw-boldLabel') and text()='Affinity Group']");

	private static By PI_AG_Name = By.xpath("//input[contains(@name,'PolicyInfoInputSet-AffinityGroup')]");

	/*
	 * Producer of Record
	 */
	private static By PI_ProducerofRecord = By.xpath("//div[contains(@class,'gw-boldLabel') and text()='Producer of Record']");

	private static By PI_PR_Organization = By.xpath("//input[contains(@name,'PolicyInfoProducerOfRecordInputSet-Producer')]");
	private static By PI_PR_ProducerCode = By.xpath("//select[contains(@name,'PolicyInfoProducerOfRecordInputSet-ProducerCode')]");

	/*
	 * Underwriting Companies
	 * 
	 */
	private static By PI_UnderwritingCompanies = By.xpath("//div[contains(@class,'gw-boldLabel') and text()='Underwriting Companies']");

	private static By PI_UC_Name = By.xpath("//select[contains(@name,'UWCompanyInputSet-UWCompany')]");

	public static void dateQuoteNeeded() throws Throwable {

		try {
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_CommercialAuto("policyInfo");

			GuidewireAutomate_Validation("Screen Header", PolicyInfo_Header, "equals","Policy Info");

			GuidewireAutomate("Date Quote Needed", PI_DateQuoteNeeded, "clearANDsendKeys",lhm_TestCase_Table_Data.get("PI_DateQuoteNeeded"));

			lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
			lhm_TestCase_Table_Data.clear();
		} catch (Exception e) {

		}
	}

	public static void primaryNamedInsured() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_CommercialAuto("policyInfo");

		try {

			GuidewireAutomate_Validation("Screen Header", PolicyCenter_Resuables_PO.Screen_Header, "equals",
					"Policy Info");

			GuidewireAutomate_Validation("Name", PrimaryNamedInsured_Name, "equals", strAccountName);

			GuidewireAutomate_Validation("Phone", PrimaryNamedInsured_Phone, "equals",
					lhm_TestCase_Table_Data.get("PrimaryNI_Phone"));

//			GuidewireAutomate_Validation("Policy Address",
//					PrimaryNamedInsured_PolicyAddress, "contains",
//					lhm_TestCase_Table_Data.get("PrimaryNI_PolicyAddress"));

			GuidewireAutomate_Validation("County", PrimaryNamedInsured_County, "equals",
					lhm_TestCase_Table_Data.get("PrimaryNI_County"));
			GuidewireAutomate_Validation("Address Type", PrimaryNamedInsured_AddressType, "equals",
					lhm_TestCase_Table_Data.get("PrimaryNI_AddressType"));
			lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
			lhm_TestCase_Table_Data.clear();
			
			
			 
			lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
			lhm_TestCase_Table_Data.clear();
		} catch (Exception e) {

		}
	}

	public static void primaryNamedInsured_ChangeTo_NewPerson() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_CommercialAuto("policyInfo");
		getStaleElement("Screen Header", PolicyCenter_Resuables_PO.Screen_Header);
		GuidewireAutomate_Validation("Screen Header", PolicyCenter_Resuables_PO.Screen_Header, "equals", "Policy Info");
		GuidewireAutomate("ChangeTo",PrimaryNamedInsured_ChangeTo_Button, "clickAndwait", "clickAndwait");
		GuidewireAutomate("NewPerson",PrimaryNamedInsured_ChangeTo_NewPerson,"clickAndwait","click");
		GuidewireAutomate_Validation("Screen Header",NewPrimaryNamedInsured, "equals", "New Primary Named Insured");
		GuidewireAutomate_Validation("PersonName",PI_AddNewPerson,"equals", "Person");
		GuidewireAutomate("FirstName",PI_Firstname, "sendKeys", lhm_TestCase_Table_Data.get("PI_FirstName"));
		GuidewireAutomate("LastName",PI_Lastname, "sendKeys", lhm_TestCase_Table_Data.get("PI_LastName"));
		GuidewireAutomate("Address1",PI_Address_1, "sendKeys", lhm_TestCase_Table_Data.get("PI_Address_1"));
		getStaleElement("State",PI_StateName);
		GuidewireAutomate("State",PI_StateName, "selectByVisibleTextAndwait", lhm_TestCase_Table_Data.get("PI_StateName"));
		GuidewireAutomate("AddressType",PI_AddressType, "selectByVisibleTextAndwait", lhm_TestCase_Table_Data.get("PI_AddressType"));


		try {

			lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
			lhm_TestCase_Table_Data.clear();
		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}

	}

	public static void primaryNamedInsured_ChangeTo_FromAddressBook() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_CommercialAuto("policyInfo");
		try {

			lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
			lhm_TestCase_Table_Data.clear();
		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}

	public static void primaryNamedInsured_ChangeTo_ExistingContact() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_CommercialAuto("policyInfo");
		try {

			lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
			lhm_TestCase_Table_Data.clear();
		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}

	public static void primaryNamedInsured_Edit() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_CommercialAuto("policyInfo");
		try {

			lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
			lhm_TestCase_Table_Data.clear();
		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}

	public static void policyAddress() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_CommercialAuto("policyInfo");
		try {
			GuidewireAutomate_Validation("Phone", PrimaryNamedInsured_Phone, "equals",lhm_TestCase_Table_Data.get("PrimaryNI_Phone"));
			GuidewireAutomate_Validation("Policy Address",PrimaryNamedInsured_PolicyAddress, "contains",lhm_TestCase_Table_Data.get("PI_PolicyAddress"));
			GuidewireAutomate_Validation("County", PrimaryNamedInsured_County, "equals",lhm_TestCase_Table_Data.get("PI_County"));
			 
			GuidewireAutomate_Validation("Address Type", PrimaryNamedInsured_AddressType, "contains",lhm_TestCase_Table_Data.get("CA_AddressType"));
			
			GuidewireAutomate_Validation("Address Description",PrimaryNamedInsured_AddressDescription, "contains",lhm_TestCase_Table_Data.get("CA_AddressDescription"));

			lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
			lhm_TestCase_Table_Data.clear();
		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}

	}

	public static void policyAddress_ChangeTo_NewAddress() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_CommercialAuto("policyInfo");
		try {

			lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
			lhm_TestCase_Table_Data.clear();
		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}

	public static void policyAddress_ChangeTo_EditCurrentAddress() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_CommercialAuto("policyInfo");
		try {

			lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
			lhm_TestCase_Table_Data.clear();
		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}

	public static void OfficialID() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_CommercialAuto("policyInfo");

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
	public static void OrganizationType() throws Throwable {

		try {
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_CommercialAuto("policyInfo");
			getStaleElement("Organization Type", OrganizationTypeSection);
			GuidewireAutomate_Validation("Organization Type", OrganizationTypeSection, "equals", "Organization Type");
			GuidewireAutomate("Product", OrganizationType, "selectByVisibleText",lhm_TestCase_Table_Data.get("PI_OrganizationType"));
			GuidewireAutomate("Product", OrganizationType, "selectByVisibleText",lhm_TestCase_Table_Data.get("PI_OrganizationType"));

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
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_CommercialAuto("policyInfo");
		try {

			lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
			lhm_TestCase_Table_Data.clear();
		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}

	public static void secondaryInsured_FromAddressBook() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_CommercialAuto("policyInfo");
		try {

			lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
			lhm_TestCase_Table_Data.clear();
		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}

	public static void secondaryInsured_ExistingContact() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_CommercialAuto("policyInfo");
		try {

			lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
			lhm_TestCase_Table_Data.clear();
		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}

	public static void additionalNamedInsured_Add_NewCompany() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_CommercialAuto("policyInfo");
		try {

			lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
			lhm_TestCase_Table_Data.clear();
		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}

	public static void additionalNamedInsured_Add_NewPerson() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_CommercialAuto("policyInfo");
		try {

			lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
			lhm_TestCase_Table_Data.clear();
		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}

	public static void additionalNamedInsured_Add_FromAddresssBook() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_CommercialAuto("policyInfo");
		try {

			lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
			lhm_TestCase_Table_Data.clear();
		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}

	public static void additionalNamedInsured_Edit() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_CommercialAuto("policyInfo");
		try {

			lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
			lhm_TestCase_Table_Data.clear();
		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}

	public static void additionalNamedInsured_Remove() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_CommercialAuto("policyInfo");
		try {

			lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
			lhm_TestCase_Table_Data.clear();
		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}

	public static void policyDetails() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_CommercialAuto("policyInfo");

		try {
			GuidewireAutomate_Validation("Section", PI_PolicyDetails, "equals", "Policy Details");

			GuidewireAutomate("Term Type", PI_PD_TermType, "selectByVisibleTextAndwait",lhm_TestCase_Table_Data.get("PI_PD_TermType"));
			GuidewireAutomate("Effective Date", PI_PD_EffectiveDate, "clearsendKeysTABTAB",lhm_TestCase_Table_Data.get("PI_PD_EffectiveDate"));
			GuidewireAutomate_Validation("Expiration Date", PI_PD_ExpirationDate, "equals",lhm_TestCase_Table_Data.get("PI_PD_ExpirationDate"));
			GuidewireAutomate("Written Date", PI_PD_WrittenDate, "clearANDsendKeys",lhm_TestCase_Table_Data.get("PI_PD_WrittenDate"));
			getStaleElement("Expiration Date", PI_PD_ExpirationDate);
			
			GuidewireAutomate("Base State", PI_PD_RateAsOfDateBaseState, "selectByVisibleText", lhm_TestCase_Table_Data.get("PI_PD_BaseState"));
			GuidewireAutomate("Preffered Language", PI_PD_PrefferedLanguage, "selectByVisibleText", lhm_TestCase_Table_Data.get("PI_PD_PrefferedLanguage"));

			lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
			lhm_TestCase_Table_Data.clear();
		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}

	}

	public static void policyDetails_fetch() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_CommercialAuto("policyInfo");

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

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_CommercialAuto("policyInfo");

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
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_CommercialAuto("policyInfo");
		
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
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_CommercialAuto("policyInfo");
		
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
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_CommercialAuto("policyInfo");
		
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
