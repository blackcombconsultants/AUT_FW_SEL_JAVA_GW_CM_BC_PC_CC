package com.pages.Guidewire.PolicyCenter.WorkersCompensation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.aventstack.extentreports.ExtentTest;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Resuables_PO;

public class WC_PolicyInfo extends SeleniumWebDriver_Commands {

	public WC_PolicyInfo(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}


	/*
	 * Page Objects
	 */
	private static By PolicyInfo_Header = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and text()='Policy Info']");

	private static By PI_DateQuoteNeeded  = By.xpath("//input[contains(@name,'DateQuoteNeeded')]");
	private static By PI_EstimatedPremium = By.xpath("//input[contains(@name,'estimatedPremiumInput')]");

	private static By PrimaryNamedInsured_ChangeTo_Button          = By.xpath("//div[contains(@id,'ChangePrimaryNamedInsuredButtonMenuIcon')]");
	private static By PrimaryNamedInsured_ChangeTo_NewPerson       = By.xpath("//div[contains(@id,'ChangePrimaryNamedInsuredButtonMenuIcon')]/div[@class='gw-subMenu gw-open']//div[@class='gw-label' and text()='New Person']");
	private static By PrimaryNamedInsured_ChangeTo_FromAddressBook = By.xpath("//div[contains(@id,'ChangePrimaryNamedInsuredButtonMenuIcon')]/div[@class='gw-subMenu gw-open']//div[@class='gw-label' and text()='From Address Book']");
	private static By PrimaryNamedInsured_ChangeTo_ExistingContact = By.xpath("//div[contains(@id,'ChangePrimaryNamedInsuredButtonMenuIcon')]/div[@class='gw-subMenu gw-open']//div[@class='gw-label' and text()='Existing Contact']");
	private static By PrimaryNamedInsured_Name                     = By.xpath("//div[contains(@id,'AccountInfoInputSet-Name')]//div[contains(@id,'AccountInfoInputSet-Name_button')]");
	private static By PrimaryNamedInsured_Phone                    = By.xpath("//div[contains(@id,'AccountInfoInputSet-Phone-GlobalPhoneInputSet-PhoneDisplay')]//div[contains(@class,'gw-value-readonly-wrapper')]");

	private static By PolicyAddress_ChangeTo_Button             = By.xpath("//div[contains(@id,'ChangePolicyAddressButton-ChangePolicyAddressButtonMenuIcon')]");
	private static By PolicyAddress_ChangeTo_NewAdress          = By.xpath("//div[contains(@id,'ChangePolicyAddressButton-ChangePolicyAddressButtonMenuIcon')]/div[@class='gw-subMenu gw-open']//div[@class='gw-label' and text()='New Person']");
	private static By PolicyAddress_ChangeTo_EditCurrentAddress = By
			.xpath("//div[contains(@id,'ChangePolicyAddressButton-ChangePolicyAddressButtonMenuIcon')]/div[@class='gw-subMenu gw-open']//div[@class='gw-label' and text()='Edit Current Address']");
	private static By PolicyAddress                             = By.xpath("//div[contains(@id,'GlobalAddressInputSet-AddressSummary')]//div[contains(@class,'gw-value-readonly-wrapper')]");
	private static By PolicyAddress_County                      = By.xpath("//div[contains(@id,'GlobalAddressInputSet-County')]//div[contains(@class,'gw-value-readonly-wrapper')]");
	private static By PolicyAddress_AddressType                 = By.xpath("//div[contains(@id,'AddressType') and contains(@class,'gw-ValueWidget')]//div[contains(@class,'gw-label')]");
	private static By PolicyAddress_AddressDescription          = By.xpath("//div[contains(@id,'AddressDescription') and contains(@class,'gw-ValueWidget')]//div[contains(@class,'gw-value-readonly-wrapper')]");

	// Official IDs
	private static By PI_OfficialID   = By.xpath("//div[contains(@class,'gw-LabelWidget')]/div[contains(@class,'gw-label') and text()='Official IDs']");
	private static By OI_FEIN         = By.xpath("//input[contains(@name,'OfficialIDDV_Input')]");
	private static By OI_InsustryCode = By.xpath("//input[contains(@name,'AccountInfoInputSet-IndustryCode')]");

	// Business and Operations
	private static By PI_BusinessandOperations              = By.xpath("//div[contains(@class,'gw-LabelWidget')]/div[contains(@class,'gw-label') and text()='Business and Operations']");
	private static By BO_YearBusinessStarted                = By.xpath("//input[contains(@name,'YearBusinessStarted')]");
	private static By BO_Descriptionofbusinessandoperations = By.xpath("//textarea[contains(@name,'CommercialInputSet-BusOps')]");
	private static By BO_OrganizationType                   = By.xpath("//select[contains(@name,'OrganizationType')]");

	// Secondary Named Insured
	private static By PI_SecondaryNamedInsured = By.xpath("//div[contains(@class,'gw-boldLabel') and text()='Secondary Named Insured']");

	private static By SecondaryNamedInsured_Add_Button          = By.xpath("//div[contains(@id,'ChangeSecondaryNamedInsuredButtonMenuIcon')]");
	private static By SecondaryNamedInsured_Add_NewPerson       = By.xpath("//div[contains(@id,'ChangeSecondaryNamedInsuredButtonMenuIcon')]/div[@class='gw-subMenu gw-open']//div[@class='gw-label' and text()='New Person']");
	private static By SecondaryNamedInsured_Add_FromAddressBook = By.xpath("//div[contains(@id,'ChangeSecondaryNamedInsuredButtonMenuIcon')]/div[@class='gw-subMenu gw-open']//div[@class='gw-label' and text()='From Address Book']");
	private static By SecondaryNamedInsured_Add_ExistingContact = By.xpath("//div[contains(@id,'ChangeSecondaryNamedInsuredButtonMenuIcon')]/div[@class='gw-subMenu gw-open']//div[@class='gw-label' and text()='Existing Contact']");

	// Additional Named Insureds
	private static By PI_AdditionalNamedInsureds = By.xpath("//div[contains(@class,'gw-boldLabel') and text()='Additional Named Insureds']");

	private static By AdditionalNamedInsured_Add_Button          = By.xpath("//div[contains(@id,'AdditionalNamedInsuredInputSet-NamedInsuredsLV_tb-AddContactsButton')]//div[text()='Add']");
	private static By AdditionalNamedInsured_Add_NewPerson       = By
			.xpath("//div[contains(@id,'AdditionalNamedInsuredInputSet-NamedInsuredsLV_tb-AddContactsButton')]/div[@class='gw-subMenu gw-open']//div[@class='gw-label' and text()='New Person']");
	private static By AdditionalNamedInsured_Add_FromAddressBook = By
			.xpath("//div[contains(@id,'AdditionalNamedInsuredInputSet-NamedInsuredsLV_tb-AddContactsButton')]/div[@class='gw-subMenu gw-open']//div[@class='gw-label' and text()='From Address Book']");
	private static By AdditionalNamedInsured_Add_ExistingContact = By
			.xpath("//div[contains(@id,'AdditionalNamedInsuredInputSet-NamedInsuredsLV_tb-AddContactsButton')]/div[@class='gw-subMenu gw-open']//div[@class='gw-label' and text()='Existing Contact']");

	// Policy Details
	private static By PI_PolicyDetails = By.xpath("//div[contains(@class,'gw-boldLabel') and text()='Policy Details']");

	private static By PI_PD_TermType           = By.xpath("//select[contains(@name,'PolicyInfoInputSet-TermType')]");
	private static By PI_PD_TermNumber         = By.xpath("//div[contains(@id,'PolicyInfoInputSet-TermNumber')]//div[contains(@class,'gw-value-readonly-wrapper')]");
	private static By PI_PD_EffectiveDate      = By.xpath("//input[contains(@name,'PolicyInfoInputSet-EffectiveDate')]");
	private static By PI_PD_ExpirationDateEdit = By.xpath("//input[contains(@name,'PolicyInfoInputSet-ExpirationDate')]");
	private static By PI_PD_ExpirationDate     = By.xpath("//div[contains(@id,'PolicyInfoInputSet-ExpirationDate')]//div[contains(@class,'gw-value-readonly-wrapper')]");
	private static By PI_PD_WrittenDate        = By.xpath("//input[contains(@name,'PolicyInfoInputSet-WrittenDate')]");
	private static By PI_PD_RateAsOfDate       = By.xpath("//div[contains(@id,'PolicyInfoInputSet-RateAsOfDate')]//div[contains(@class,'gw-value-readonly-wrapper')]");

	private static By PI_PD_PrefferedLanguage = By.xpath("//select[contains(@name,'PolicyInfoInputSet-PrimaryLanguage')]");

	// Affinity Group
	private static By PI_AffinityGroup = By.xpath("//div[contains(@class,'gw-boldLabel') and text()='Affinity Group']");

	private static By PI_AG_Name = By.xpath("//input[contains(@name,'PolicyInfoInputSet-AffinityGroup')]");

	// Producer of Record
	private static By PI_ProducerofRecord = By.xpath("//div[contains(@class,'gw-boldLabel') and text()='Producer of Record']");

	private static By PI_PR_Organization = By.xpath("//input[contains(@name,'PolicyInfoProducerOfRecordInputSet-Producer')]");
	private static By PI_PR_ProducerCode = By.xpath("//select[contains(@name,'PolicyInfoProducerOfRecordInputSet-ProducerCode')]");

	// Underwriting Companies
	private static By PI_UnderwritingCompanies = By.xpath("//div[contains(@class,'gw-boldLabel') and text()='Underwriting Companies']");

	private static By PI_UC_Name = By.xpath("//select[contains(@name,'UWCompanyInputSet-UWCompany')]");

	/*
	 * Methods
	 */
	public static void discardUnsavedChange(String DataSet) throws Throwable {
		GuidewireAutomate_Validation("Screen Header", PolicyCenter_Resuables_PO.Screen_Header, "equals", "Policy Info");

		GuidewireAutomate_Validation("The object you are trying to update was changed by another user", PolicyCenter_Resuables_PO.Error_Message, "equals",
				"The object you are trying to update was changed by another user. Please try your change again.");
		GuidewireAutomate("AffinityGroup_Name", PolicyCenter_Resuables_PO.DiscardUnsavedChange, "clickAndwait", "click");

	}

	public static void dateQuoteNeeded(String DataSet) throws Throwable {

		lhm_TestCase_Table_Data = WC_Reusables.getData_WorkersCompensation("policyInfo", DataSet);

		GuidewireAutomate_Validation("Screen Header", PolicyInfo_Header, "equals", "Policy Info");

		GuidewireAutomate("Date Quote Needed", PI_DateQuoteNeeded, "sendKeys", lhm_TestCase_Table_Data.get("PI_DateQuoteNeeded"));
		GuidewireAutomate("Estimated Premium", PI_EstimatedPremium, "sendKeys", lhm_TestCase_Table_Data.get("PI_EstimatedPremium"));

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	public static void primaryNamedInsured(String DataSet) throws Throwable {
		lhm_TestCase_Table_Data = WC_Reusables.getData_WorkersCompensation("policyInfo", DataSet);

		GuidewireAutomate_Validation("Screen Header", PolicyCenter_Resuables_PO.Screen_Header, "equals", "Policy Info");

		GuidewireAutomate_Validation("Name", PrimaryNamedInsured_Name, "equals", strAccountName);
		GuidewireAutomate_Validation("Phone", PrimaryNamedInsured_Phone, "equals", lhm_TestCase_Table_Data.get("PrimaryNI_Phone"));

		GuidewireAutomate_Validation("Policy Address", PolicyAddress, "contains", lhm_TestCase_Table_Data.get("PrimaryNI_PolicyAddress"));
		GuidewireAutomate_Validation("County", PolicyAddress_County, "equals", lhm_TestCase_Table_Data.get("PrimaryNI_County"));
		GuidewireAutomate_Validation("Address Type", PolicyAddress_AddressType, "equals", lhm_TestCase_Table_Data.get("PrimaryNI_AddressType"));
		/*
		 * GuidewireAutomate_Validation("Address Description", PrimaryNamedInsured_AddressDescription, "equals",
		 * lhm_TestCase_Table_Data.get("PrimaryNI_AddressDescription"));
		 */
		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	public static void primaryNamedInsured_ChangeTo_NewPerson(String DataSet) throws Throwable {
		lhm_TestCase_Table_Data = WC_Reusables.getData_WorkersCompensation("policyInfo", DataSet);

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	public static void primaryNamedInsured_ChangeTo_FromAddressBook(String DataSet) throws Throwable {
		lhm_TestCase_Table_Data = WC_Reusables.getData_WorkersCompensation("policyInfo", DataSet);

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	public static void primaryNamedInsured_ChangeTo_ExistingContact(String DataSet) throws Throwable {
		lhm_TestCase_Table_Data = WC_Reusables.getData_WorkersCompensation("policyInfo", DataSet);

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	public static void primaryNamedInsured_Edit(String DataSet) throws Throwable {
		lhm_TestCase_Table_Data = WC_Reusables.getData_WorkersCompensation("policyInfo", DataSet);

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	public static void policyAddress(String DataSet) throws Throwable {
		lhm_TestCase_Table_Data = WC_Reusables.getData_WorkersCompensation("policyInfo", DataSet);

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();

	}

	public static void policyAddress_ChangeTo_NewAddress(String DataSet) throws Throwable {
		lhm_TestCase_Table_Data = WC_Reusables.getData_WorkersCompensation("policyInfo", DataSet);

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	public static void policyAddress_ChangeTo_EditCurrentAddress(String DataSet) throws Throwable {
		lhm_TestCase_Table_Data = WC_Reusables.getData_WorkersCompensation("policyInfo", DataSet);

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	public static void OfficialID(String DataSet) throws Throwable {
		lhm_TestCase_Table_Data = WC_Reusables.getData_WorkersCompensation("policyInfo", DataSet);

		GuidewireAutomate_Validation("Official IDs", PI_OfficialID, "equals", "Official IDs");

		GuidewireAutomate_Validation("SSN", OI_FEIN, "valueEquals", lhm_TestCase_Table_Data.get("OI_FEIN"));
		GuidewireAutomate_Validation("InsustryCode", OI_InsustryCode, "sendKeys", lhm_TestCase_Table_Data.get("OI_InsustryCode"));

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}
	public static void BusinessandOperations(String DataSet) throws Throwable {
		lhm_TestCase_Table_Data = WC_Reusables.getData_WorkersCompensation("policyInfo", DataSet);

		GuidewireAutomate_Validation("Official IDs", PI_BusinessandOperations, "equals", "Business and Operations");

		GuidewireAutomate_Validation("Year Business Started", BO_YearBusinessStarted, "sendKeys", lhm_TestCase_Table_Data.get("BO_YearBusinessStarted"));
		GuidewireAutomate_Validation("Description of business and operations", BO_Descriptionofbusinessandoperations, "sendKeys", lhm_TestCase_Table_Data.get("BO_Description"));
		GuidewireAutomate_Validation("Organization Type", BO_OrganizationType, "sendKeys", lhm_TestCase_Table_Data.get("BO_OrganizationType"));

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	public static void secondaryInsured_NewPerson(String DataSet) throws Throwable {
		lhm_TestCase_Table_Data = WC_Reusables.getData_WorkersCompensation("policyInfo", DataSet);

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	public static void secondaryInsured_FromAddressBook(String DataSet) throws Throwable {
		lhm_TestCase_Table_Data = WC_Reusables.getData_WorkersCompensation("policyInfo", DataSet);

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	public static void secondaryInsured_ExistingContact(String DataSet) throws Throwable {
		lhm_TestCase_Table_Data = WC_Reusables.getData_WorkersCompensation("policyInfo", DataSet);

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	public static void additionalNamedInsured_Add_NewCompany(String DataSet) throws Throwable {
		lhm_TestCase_Table_Data = WC_Reusables.getData_WorkersCompensation("policyInfo", DataSet);

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	public static void additionalNamedInsured_Add_NewPerson(String DataSet) throws Throwable {
		lhm_TestCase_Table_Data = WC_Reusables.getData_WorkersCompensation("policyInfo", DataSet);

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	public static void additionalNamedInsured_Add_FromAddresssBook(String DataSet) throws Throwable {
		lhm_TestCase_Table_Data = WC_Reusables.getData_WorkersCompensation("policyInfo", DataSet);

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	public static void additionalNamedInsured_Edit(String DataSet) throws Throwable {
		lhm_TestCase_Table_Data = WC_Reusables.getData_WorkersCompensation("policyInfo", DataSet);

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	public static void additionalNamedInsured_Remove(String DataSet) throws Throwable {
		lhm_TestCase_Table_Data = WC_Reusables.getData_WorkersCompensation("policyInfo", DataSet);

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	public static void policyDetails(String DataSet) throws Throwable {
		lhm_TestCase_Table_Data = WC_Reusables.getData_WorkersCompensation("policyInfo", DataSet);

		GuidewireAutomate_Validation("Section", PI_PolicyDetails, "equals", "Policy Details");

		GuidewireAutomate("Term Type", PI_PD_TermType, "selectByVisibleTextAndwait", lhm_TestCase_Table_Data.get("PI_PD_TermType"));
		GuidewireAutomate("Effective Date", PI_PD_EffectiveDate, "clearsendKeysTABTAB", lhm_TestCase_Table_Data.get("PI_PD_EffectiveDate"));
		GuidewireAutomate("Written Date", PI_PD_WrittenDate, "clearANDsendKeys", lhm_TestCase_Table_Data.get("PI_PD_WrittenDate"));
		getStaleElement("Expiration Date", PI_PD_ExpirationDate);
		GuidewireAutomate_Validation("Expiration Date", PI_PD_ExpirationDate, "equals", lhm_TestCase_Table_Data.get("PI_PD_ExpirationDate"));
		GuidewireAutomate("Preffered Language", PI_PD_PrefferedLanguage, "selectByVisibleText", lhm_TestCase_Table_Data.get("PI_PD_PrefferedLanguage"));

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	public static void policyDetails_fetch(String DataSet) throws Throwable {
		lhm_TestCase_Table_Data = WC_Reusables.getData_WorkersCompensation("policyInfo", DataSet);

		GuidewireAutomate_Validation("Section", PI_PolicyDetails, "equals", "Policy Details");

		GuidewireAutomate_Validation("Effective Date", PI_PD_EffectiveDate, "fetchValue", lhm_TestCase_Table_Data.get("PI_PD_EffectiveDate"));
		GuidewireAutomate_Validation("Expiration Date", PI_PD_ExpirationDate, "fetch", lhm_TestCase_Table_Data.get("PI_PD_ExpirationDate"));
		GuidewireAutomate_Validation("Written Date", PI_PD_WrittenDate, "fetchValue", lhm_TestCase_Table_Data.get("PI_PD_WrittenDate"));

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	public static void policyDetails_Rewrite(String DataSet) throws Throwable {

		lhm_TestCase_Table_Data = WC_Reusables.getData_WorkersCompensation("policyInfo", DataSet);

		GuidewireAutomate_Validation("Section", PI_PolicyDetails, "equals", "Policy Details");

		GuidewireAutomate("Term Type", PI_PD_TermType, "selectByVisibleTextAndwait", lhm_TestCase_Table_Data.get("PI_PD_TermType"));
		GuidewireAutomate_Validation("Term Number", PI_PD_TermNumber, "equals", "2");
		GuidewireAutomate_Validation("Effective Date", PI_PD_EffectiveDate, "fetch", lhm_TestCase_Table_Data.get("PI_PD_EffectiveDate"));
		GuidewireAutomate_Validation("Written Date", PI_PD_WrittenDate, "fetch", lhm_TestCase_Table_Data.get("PI_PD_WrittenDate"));
		GuidewireAutomate_Validation("Expiration Date", PI_PD_ExpirationDate, "fetch", lhm_TestCase_Table_Data.get("PI_PD_ExpirationDate"));

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	public static void affinityGroup(String DataSet) throws Throwable {
		lhm_TestCase_Table_Data = WC_Reusables.getData_WorkersCompensation("policyInfo", DataSet);

		GuidewireAutomate_Validation("Section", PI_AffinityGroup, "equals", "Affinity Group");

		GuidewireAutomate("AffinityGroup_Name", PI_AG_Name, "sendKeys", lhm_TestCase_Table_Data.get("PI_AG_Name"));
		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	public static void producerOfRecord(String DataSet) throws Throwable {
		lhm_TestCase_Table_Data = WC_Reusables.getData_WorkersCompensation("policyInfo", DataSet);

		GuidewireAutomate_Validation("Section", PI_ProducerofRecord, "equals", "Producer of Record");

		GuidewireAutomate_Validation("Organization", PI_PR_Organization, "valueEquals", lhm_TestCase_Table_Data.get("PI_PR_Organization"));
		GuidewireAutomate_Validation("ProducerCode", PI_PR_ProducerCode, "FirstSelectedOptionEquals", lhm_TestCase_Table_Data.get("PI_PR_ProducerCode"));
		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	public static void underWritingCompany(String DataSet) throws Throwable {
		lhm_TestCase_Table_Data = WC_Reusables.getData_WorkersCompensation("policyInfo", DataSet);

		GuidewireAutomate_Validation("Section", PI_UnderwritingCompanies, "equals", "Underwriting Companies");

		GuidewireAutomate("UC Name", PI_UC_Name, "selectByVisibleText", lhm_TestCase_Table_Data.get("PI_UC_Name"));

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}
}
