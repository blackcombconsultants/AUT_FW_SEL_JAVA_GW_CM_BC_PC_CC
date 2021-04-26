package com.pages.Guidewire.PolicyCenter;

import java.util.LinkedHashMap;

import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;
import com.pages.Guidewire.GW_TabNavigation_CM_PC_BC_CC;

public class GW_PolicyCenter_Resuables extends SeleniumWebDriver_Commands implements GW_PolicyCenter_Resuables_PO {

	String strAccountName;
	LinkedHashMap<String, String> lhm_TestCase_Table_Data1;
	Selenium_Utils_DataBase oDB = new Selenium_Utils_DataBase();

	public GW_PolicyCenter_Resuables(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	/*
	 * --------------------------------------------------------------
	 * searchResultsMessage
	 * --------------------------------------------------------------
	 */
	// checking search result message
	public String gettext_SearchAccountResultsMessage() throws Throwable {
		return getText_Element(SearchAccountResults_Msg);
	}

	public void clickButton(String ButtonName) throws Throwable {
		switch (ButtonName) {
		case "Search":
			GuidewireAutomate("Search", Search_Button, "click", "");
			break;
		case "Reset":
			GuidewireAutomate("Reset", Reset_Button, "click", "");
			break;
		case "OK":
			GuidewireAutomate("OK", OK_Button, "click", "");
			break;
		case "Update":
			GuidewireAutomate("Reset", Update_Button, "click", "");
			break;
		case "Cancel":
			GuidewireAutomate("Reset", Cancel_Button, "click", "");
			break;
		case "Back":
			GuidewireAutomate("Back", Back_Button, "click", "");
			break;
		case "Next":
			GuidewireAutomate("Next", Next_Button, "click", "");
			break;
		case "Release Lock":
			GuidewireAutomate("Release Lock", ReleaseLock_Button, "click", "");
			break;
		case "Edit Policy Transaction":
			GuidewireAutomate("Release Lock", EditPolicyTransaction_Button, "click", "");
			break;
		case "Quote":
			GuidewireAutomate("Quote", Quote_Button, "click", "");
			break;
		case "Save Draft":
			GuidewireAutomate("Save Draft", SaveDraft_Button, "click", "");
			break;
		case "Versions":
			GuidewireAutomate("Versions", Versions_Button, "click", "");
			break;
		case "Start Multi Version":
			GuidewireAutomate("Versions", Start_MultiVersion_Button, "click", "");
			break;
		case "Start Side By Side":
			GuidewireAutomate("Versions", Start_SideBySide_Button, "click", "");
			break;
		case "Bind Options":
			GuidewireAutomate("Release Lock", BindOptions_Button, "click", "");
			break;
		case "Bind Only":
			GuidewireAutomate("Release Lock", BindOptions_BindOnly_Button, "click", "");
			break;
		case "Issue Policy":
			GuidewireAutomate("Release Lock", Bindoptions_IssuePolicy_Button, "click", "");
			break;
		case "Withdraw Transaction":
			GuidewireAutomate("Close Options", CloseOptions_WithdrawTransaction_Button, "click", "");
			break;
		case "Decline":
			GuidewireAutomate("Close Options", CloseOptions_Decline_Button, "click", "");
			break;
		case "Not Taken":
			GuidewireAutomate("Close Options", CloseOptions_NotTaken_Button, "click", "");
			break;
		case "Print Quote":
			GuidewireAutomate("Close Options", PrintQuote_Button, "click", "");
			break;
		case "Withdraw Transaction1":
			GuidewireAutomate("Withdraw Transaction", WithdrawTransaction_Button, "click", "");
			break;

		default:
			break;
		}
	}

	@Override
	public String infoBar(String strLabel) throws Throwable {
		String strInfobar = null;

		switch (strLabel) {
		case "Job":
			strInfobar = getText_Element(InfoBar_Job);
			break;
		case "Workflow":
			strInfobar = getText_Element(InfoBar_Workflow);
			break;
		case "LOB":
			strInfobar = getText_Element(InfoBar_LOB);
			break;
		case "EffectiveDate":
			strInfobar = getText_Element(InfoBar_EffectiveDate);
			break;
		case "AccountName":
			strInfobar = getText_Element(InfoBar_AccountName);
			break;
		case "AccountNumber":
			strInfobar = getText_Element(InfoBar_AccountNumber);
			break;
		case "PolicyNumber":
			strInfobar = getText_Element(InfoBar_PolicyNumber);
			break;
		case "EditLock":
			strInfobar = getText_Element(InfoBar_EditLock);
			break;
		default:
			break;
		}

		return strInfobar;
	}

	/*
	 * --------------------------------------------------------------
	 * searchAccountInformation
	 * --------------------------------------------------------------
	 */

	public void pc_SearchAccountInformation(String strAccountName) throws Throwable {

//		// navigate to new account
//		GW_TabNavigation_CM_PC_BC_CC t = new GW_TabNavigation_CM_PC_BC_CC(driver, oExtentTest);
//		//t.navigate_AccountTab_AccountNumberSearch("6800979174");
//		t.navigate_AccountTab_AccountNumberSearch("6800979174");

		GuidewireAutomate("Company Name", SA_CompanyName, "clearAndsendkeys", strAccountName);

		/*
		 * GuidewireAutomate("City", City, "sendkeys", ""); GuidewireAutomate("county",
		 * County, "sendkeys", ""); GuidewireAutomate("ZipCode", ZipCode, "sendkeys",
		 * "");
		 */
		clickButton("Search");

	}

	public void Account_Search_SubTab() throws Throwable {

		GW_TabNavigation_CM_PC_BC_CC t = new GW_TabNavigation_CM_PC_BC_CC(driver, oExtentTest);
		t.navigate_AccountTab_AccountNumberSearch("6800979174");
	}

	@Override
	public void select_SearchResult(LinkedHashMap<String, String> lhm_TestCase_Table_Data) throws Throwable {
		GuidewireAutomate_waitForElement(Select_Button, "elementToBeClickable",
				lhm_TestCase_Table_Data.get("OS_OrganizationName"));
		GuidewireAutomate("Select", Select_Button, "click", lhm_TestCase_Table_Data.get("Select_Button"));
	}

	@Override
	public void organizations(LinkedHashMap<String, String> lhm_TestCase_Table_Data) throws Throwable {

		GuidewireAutomate("OrganizationSearch", CA_SP_OrganizationSearch_Button, "click", "");

		GuidewireAutomate_Validation("Organization Name", Screen_Header, "equals", "Organizations");
		GuidewireAutomate("Organization Name", OS_OrganizationName, "sendkeys",
				lhm_TestCase_Table_Data.get("OS_OrganizationName"));
		GuidewireAutomate("Organization Type", OS_OrganizationType, "selectByVisibleText",
				lhm_TestCase_Table_Data.get("OS_OrganizationType"));

		GuidewireAutomate("Country", GW_Country, "selectByVisibleText", lhm_TestCase_Table_Data.get("GW_Country"));
		GuidewireAutomate("State", GW_State, "selectByVisibleText", lhm_TestCase_Table_Data.get("GW_State"));
		/*
		 * GuidewireAutomate("City", GW_City, "",
		 * lhm_TestCase_Table_Data.get("GW_City")); GuidewireAutomate("County",
		 * GW_County, "", lhm_TestCase_Table_Data.get("GW_County"));
		 * GuidewireAutomate("ZipCode", GW_ZipCode, "",
		 * lhm_TestCase_Table_Data.get("GW_ZipCode"));
		 * 
		 */ // GuidewireAutomate_Validation("Producer Status", ProducerStatus, "equals",
		// "Active");
		GuidewireAutomate("Producer Tier", OS_ProducerTier, "", lhm_TestCase_Table_Data.get("OS_ProducerTier"));
		GuidewireAutomate("Producer Code", OS_ProducerCode, "sendkeys", lhm_TestCase_Table_Data.get("OS_ProducerCode"));
		GuidewireAutomate("Policy", OS_Policy, "", lhm_TestCase_Table_Data.get("OS_Policy"));
		GuidewireAutomate("Account", OS_Account, "", lhm_TestCase_Table_Data.get("OS_Account"));

		GuidewireAutomate("Search_Button", Search_Button, "click", lhm_TestCase_Table_Data.get("Search_Button"));
		GuidewireAutomate("Reset_Button", Reset_Button, "", lhm_TestCase_Table_Data.get("Reset_Button"));
	}

	@Override
	public void industryCodeSearch(LinkedHashMap<String, String> lhm_TestCase_Table_Data) throws Throwable {

		GuidewireAutomate("Search", IndustryCode_Search_Button, "click", "");

		GuidewireAutomate_Validation("Industry Code Search", Screen_Header, "equals", "Industry Code Search");

		GuidewireAutomate("Code", IS_Code, "sendkeys", lhm_TestCase_Table_Data.get("IS_Code"));
		GuidewireAutomate("Classification", IS_Classification, "sendkeys",
				lhm_TestCase_Table_Data.get("IS_Classification"));

		GuidewireAutomate("Search_Button", Search_Button, "click", lhm_TestCase_Table_Data.get("Search_Button"));
		GuidewireAutomate("Reset_Button", Reset_Button, "", lhm_TestCase_Table_Data.get("Reset_Button"));
	}

	@Override
	public void producer(LinkedHashMap<String, String> lhm_TestCase_Table_Data) throws Throwable {

		GuidewireAutomate_Validation("Producer", Screen_Header, "equals", "Producer");

		GuidewireAutomate("ProducerCode", ProducerCode, "sendkeys", "301-008578");
		GuidewireAutomate("ProducerDescription", ProducerDescription, "sendkeys", "301-008578");
		GuidewireAutomate("ParentProducerCode", ParentProducerCode, "sendkeys", "301-008578");
		GuidewireAutomate("Status", Status, "sendkeys", "301-008578");
		GuidewireAutomate("BranchCode", BranchCode, "sendkeys", "ACV Property Insurance");
		GuidewireAutomate("OrganizationName", OrganizationName, "sendkeys", "");
		GuidewireAutomate("AvailableToUser", AvailableToUser, "sendkeys", "");
		GuidewireAutomate("SearchForMissingPreferredUnderwriter", SearchForMissingPreferredUnderwriter, "sendkeys", "");
		GuidewireAutomate("PreferredUnderwriter", PreferredUnderwriter, "sendkeys", "");

		GuidewireAutomate("Country", GW_Country, "selectByVisibleText", lhm_TestCase_Table_Data.get("GW_Country"));
		GuidewireAutomate("City", GW_City, "", lhm_TestCase_Table_Data.get("GW_City"));
		GuidewireAutomate("County", GW_County, "", lhm_TestCase_Table_Data.get("GW_County"));
		GuidewireAutomate("ZipCode", GW_ZipCode, "", lhm_TestCase_Table_Data.get("GW_ZipCode"));
		GuidewireAutomate("State", GW_State, "selectByVisibleText", lhm_TestCase_Table_Data.get("GW_State"));

		GuidewireAutomate("Search_Button", Search_Button, "click", "");
		GuidewireAutomate("Reset_Button", Reset_Button, "", "");
	}

	/*
	 * --------------------------------------------------------------
	 * createPersonAccount
	 * --------------------------------------------------------------
	 */
	@Override
	public void createPersonAccount() throws Throwable {

		lhm_TestCase_Table_Data = oDB.getData_MSExcel_WorkSheet_Fillo("createAccount", strTestCaseName);

		String strFirstName = lhm_TestCase_Table_Data.get("SA_FirstName");
		if (strFirstName.contentEquals("Random")) {
			strFirstName = getRandomAlphabetic(9);
		} else if (strFirstName.contentEquals("Today")) {
			strFirstName = strCurrentDate_ddMMMMyyyy;
		} else if (strFirstName.contentEquals("Now")) {
			strFirstName = strCurrentDate_ddMMMMyyyyHHmmss;
		} else if (strFirstName.contentEquals("Now")) {
			strFirstName = String.valueOf(System.currentTimeMillis());			
		}

		String strLastName = lhm_TestCase_Table_Data.get("SA_LastName");
		if (strLastName.contentEquals("Random")) {
			strLastName = getRandomAlphabetic(9);
		}
		String strAccountNickname = strFirstName + " " + strLastName;

		String strAddress1 = lhm_TestCase_Table_Data.get("CA_Address1");
		if (strAddress1.contentEquals("Random")) {
			strAddress1 = getRandomNumeric(3) + "  " + getRandomAlphabetic(7) + " Suites";
		}
		String strPrimaryEmail = lhm_TestCase_Table_Data.get("CA_PrimaryEmail");
		if (strPrimaryEmail.contentEquals("Random")) {
			strPrimaryEmail = strFirstName + "." + strLastName + "@blackcombconsultants.com";
		}
		String strOfficialID = lhm_TestCase_Table_Data.get("CA_OfficialID");
		if (strOfficialID.contentEquals("Random")) {
			strOfficialID = "999-11-" + getRandomNumeric(4);
		}

		/*
		 * Search
		 */
		GuidewireAutomate_Validation("Enter Account Information", GW_PolicyCenter_Resuables_PO.Screen_Header, "equals",
				"Enter Account Information");
		GuidewireAutomate("First Name", SA_FirstName, "sendkeys", strFirstName);
		GuidewireAutomate("Last Name", SA_LastName, "sendkeys", strLastName);
		GuidewireAutomate("First Name Exact Match", SA_FirstNameExactMatch, "click",
				lhm_TestCase_Table_Data.get("SA_FirstNameExactMatch"));
		GuidewireAutomate("Last Name Exact Match", SA_LastNameExactMatch, "click",
				lhm_TestCase_Table_Data.get("SA_LastNameExactMatch"));

		GuidewireAutomate("Country", GW_Country, "selectByVisibleText", lhm_TestCase_Table_Data.get("GW_Country"));
		GuidewireAutomate("State", GW_State, "selectByVisibleText", lhm_TestCase_Table_Data.get("GW_State"));
		/*
		 * GuidewireAutomate("City", GW_City, "",
		 * lhm_TestCase_Table_Data.get("GW_City")); GuidewireAutomate("County",
		 * GW_County, "", lhm_TestCase_Table_Data.get("GW_County"));
		 * GuidewireAutomate("ZipCode", GW_ZipCode, "",
		 * lhm_TestCase_Table_Data.get("GW_ZIPCode"));
		 * 
		 */ clickButton("Search");

		/*
		 * CreateNewAccount_Button
		 */
		/*
		 * Assert.assertEquals(gettext_SearchAccountResultsMessage(),
		 * "Information for the current page:\n" + "The search returned zero results.");
		 * 
		 */
		GuidewireAutomate_Validation("The search returned zero results", Error_Message, "equals",
				"The search returned zero results.");

		GuidewireAutomate("Create New Account", SA_CreateNewAccount_Button, "click", "");
		GuidewireAutomate("CNA_Person_Button", SA_CNA_Person_Button, "click", "");

		/*
		 * Create account
		 */
		GuidewireAutomate_Validation("Create account", GW_PolicyCenter_Resuables_PO.Screen_Header, "equals",
				"Create account");

		GuidewireAutomate_Validation("Please confirm account information", CA_PleaseConfirmAccountInformation, "equals",
				"Please confirm account information");

		GuidewireAutomate_Validation("First Name", SA_FirstName, "equals", strFirstName);
		GuidewireAutomate_Validation("Last Name", SA_LastName, "equals", strLastName);

		GuidewireAutomate("homephone", CA_HomePhone, "sendkeys", lhm_TestCase_Table_Data.get("CA_HomePhone"));
		GuidewireAutomate("workphone", CA_WorkPhone, "sendkeys", lhm_TestCase_Table_Data.get("CA_WorkPhone"));
		GuidewireAutomate("mobilephone", CA_MobilePhone, "sendkeys", lhm_TestCase_Table_Data.get("CA_MobilePhone"));
		GuidewireAutomate("faxphone", CA_FaxPhone, "sendkeys", lhm_TestCase_Table_Data.get("CA_FaxPhone"));
		GuidewireAutomate("primaryphone", CA_PrimaryPhone, "selectByVisibleText",
				lhm_TestCase_Table_Data.get("CA_PrimaryPhone"));

		GuidewireAutomate("primaryEmail", CA_PrimaryEmail, "sendkeys", strPrimaryEmail);
		GuidewireAutomate("secondaryEmail", CA_SecondaryEmail, "", lhm_TestCase_Table_Data.get("CA_SecondaryEmail"));

		/*
		 * Address
		 */
		GuidewireAutomate_Validation("Address", CA_Address, "equals", "Address");

		GuidewireAutomate("Country", GW_Country, "selectByVisibleText", lhm_TestCase_Table_Data.get("GW_Country"));
		GuidewireAutomate("Address1", CA_A_Address1, "sendkeys", strAddress1);
		GuidewireAutomate("address2", CA_A_Address2, "sendkeys", lhm_TestCase_Table_Data.get("CA_Address2"));
		GuidewireAutomate("address3", CA_A_Address3, "sendkeys", lhm_TestCase_Table_Data.get("CA_Address3"));
		GuidewireAutomate("City", GW_City, "", lhm_TestCase_Table_Data.get("GW_City"));
		GuidewireAutomate("County", GW_County, "", lhm_TestCase_Table_Data.get("GW_County"));
		GuidewireAutomate("ZipCode", GW_ZipCode, "", lhm_TestCase_Table_Data.get("GW_ZipCode"));
		GuidewireAutomate("State", GW_State, "selectByVisibleText", lhm_TestCase_Table_Data.get("GW_State"));

		GuidewireAutomate("addresstype", CA_A_Addresstype, "selectByVisibleText",
				lhm_TestCase_Table_Data.get("CA_AddressType"));

		GuidewireAutomate("description", CA_A_Description, "sendkeys", strFirstName + " " + strLastName + "Likes to ");

		/*
		 * OfficialID
		 */
		GuidewireAutomate_Validation("Official IDs", CA_OfficialID, "equals", "Official IDs");

		GuidewireAutomate("SSN", CA_OID_SSN_FEIN, "sendkeys", strOfficialID);
		GuidewireAutomate("accountnickname", CA_AccountNickname, "sendkeys", strAccountNickname);
		/*
		 * Select Producer
		 */
		GuidewireAutomate_Validation("Select Producer", PC_SelectProducer, "equals", "Select Producer");

		organizations(oDB.getData_MSExcel_WorkSheet_Fillo("organizations", strTestCaseName));
		select_SearchResult(oDB.getData_MSExcel_WorkSheet_Fillo("organizations", strTestCaseName));

		GuidewireAutomate_waitForElement(Update_Button, "visibilityOf", "");
		GuidewireAutomate("Update_Button", Update_Button, "click", "");
		GuidewireAutomate_Validation("Account Summary", GW_TabNavigation_CM_PC_BC_CC.AccountSummary_Name, "contains",
				strAccountNickname);

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();

	}

	/*
	 * --------------------------------------------------------------
	 * pc_CreateCompanyAccount
	 * --------------------------------------------------------------
	 */
	@Override
	public void createCompanyAccount() throws Throwable {

		lhm_TestCase_Table_Data = oDB.getData_MSExcel_WorkSheet_Fillo("createAccount", strTestCaseName);

		String strCompanyName = lhm_TestCase_Table_Data.get("CA_CompanyName");
		if (strCompanyName.contentEquals("Random")) {
			strCompanyName = getRandomAlphabetic(9);
		} else if (strCompanyName.contentEquals("Today")) {
			strCompanyName = strCurrentDate_ddMMMMyyyy;
		} else if (strCompanyName.contentEquals("Now")) {
			strCompanyName = strCurrentDate_ddMMMMyyyyHHmmss;
		} else if (strCompanyName.contentEquals("Now")) {
			strCompanyName = String.valueOf(System.currentTimeMillis());			
		}

		String strAccountNickname = strCompanyName;

		String strAddress1 = lhm_TestCase_Table_Data.get("CA_Address1");
		if (strAddress1.contentEquals("Random")) {
			strAddress1 = getRandomNumeric(3) + "  " + getRandomAlphabetic(7) + " Suites";
		}
		String strPrimaryEmail = lhm_TestCase_Table_Data.get("CA_PrimaryEmail");
		if (strPrimaryEmail.contentEquals("Random")) {
			strPrimaryEmail = strCompanyName + "." + "@blackcombconsultants.com";
		}
		String strOfficialID = lhm_TestCase_Table_Data.get("CA_OfficialID");
		if (strOfficialID.contentEquals("Random")) {
			strOfficialID = "99" + getRandomNumeric(7);
		}

		/*
		 * Search
		 */

		GuidewireAutomate_Validation("Enter Account Information", GW_PolicyCenter_Resuables_PO.Screen_Header, "equals",
				"Enter Account Information");

		GuidewireAutomate("Company Name", SA_CompanyName, "clearANDsendkeys", strCompanyName);
		GuidewireAutomate("Company Name", SA_CompanyNameExactMatch, "click",
				lhm_TestCase_Table_Data.get("SA_CompanyNameExactMatch"));

		GuidewireAutomate("Country", GW_Country, "selectByVisibleText", lhm_TestCase_Table_Data.get("GW_Country"));
		GuidewireAutomate("State", GW_State, "selectByVisibleText", lhm_TestCase_Table_Data.get("GW_State"));
		GuidewireAutomate("Country", GW_Country, "selectByVisibleText", lhm_TestCase_Table_Data.get("GW_Country"));
		GuidewireAutomate("State", GW_State, "selectByVisibleText", lhm_TestCase_Table_Data.get("GW_State"));
		/*
		 * GuidewireAutomate("City", GW_City, "",
		 * lhm_TestCase_Table_Data.get("GW_City")); GuidewireAutomate("County",
		 * GW_County, "", lhm_TestCase_Table_Data.get("GW_County"));
		 * GuidewireAutomate("ZipCode", GW_ZipCode, "",
		 * lhm_TestCase_Table_Data.get("GW_ZIPCode"));
		 * 
		 */ clickButton("Search");

		/*
		 * CreateNewAccount_Button
		 */

		/*
		 * Assert.assertEquals(gettext_SearchAccountResultsMessage(),
		 * "Information for the current page:\n" + "The search returned zero results.");
		 * 
		 */
		GuidewireAutomate_Validation("The search returned zero results", Error_Message, "equals",
				"The search returned zero results.");

		GuidewireAutomate("Create New Account", SA_CreateNewAccount_Button, "click", "");
		GuidewireAutomate("CNA_Person_Button", SA_CNA_Company_Button, "click", "");

		/*
		 * Create account
		 */
		GuidewireAutomate_Validation("Create account", GW_PolicyCenter_Resuables_PO.Screen_Header, "equals",
				"Create account");

		GuidewireAutomate_Validation("Please confirm account information", CA_PleaseConfirmAccountInformation, "equals",
				"Please confirm account information");

		GuidewireAutomate_Validation("Company Name", SA_CompanyName, "equals", strCompanyName);

		GuidewireAutomate("officephone", CA_OfficePhone, "sendkeys", lhm_TestCase_Table_Data.get("CA_OfficePhone"));
		GuidewireAutomate("officephone", CA_FaxPhone, "sendkeys", lhm_TestCase_Table_Data.get("CA_FaxPhone"));
		GuidewireAutomate("primaryEmail", CA_PrimaryEmail, "sendkeys", strPrimaryEmail);
		GuidewireAutomate("secondaryEmail", CA_SecondaryEmail, "", lhm_TestCase_Table_Data.get("CA_SecondaryEmail"));

		/*
		 * Address
		 */
		GuidewireAutomate_Validation("Address", CA_Address, "equals", "Address");

		GuidewireAutomate("Country", GW_Country, "selectByVisibleText", lhm_TestCase_Table_Data.get("GW_Country"));
		GuidewireAutomate("Address1", CA_A_Address1, "sendkeys", strAddress1);
		GuidewireAutomate("address2", CA_A_Address2, "sendkeys", lhm_TestCase_Table_Data.get("CA_A_Address2"));
		GuidewireAutomate("address3", CA_A_Address3, "sendkeys", lhm_TestCase_Table_Data.get("CA_A_Address3"));
		GuidewireAutomate("City", GW_City, "", lhm_TestCase_Table_Data.get("GW_City"));
		GuidewireAutomate("County", GW_County, "", lhm_TestCase_Table_Data.get("GW_County"));
		GuidewireAutomate("ZipCode", GW_ZipCode, "", lhm_TestCase_Table_Data.get("GW_ZipCode"));
		GuidewireAutomate("State", GW_State, "selectByVisibleText", lhm_TestCase_Table_Data.get("GW_State"));

		GuidewireAutomate("addresstype", CA_A_Addresstype, "selectByVisibleText",
				lhm_TestCase_Table_Data.get("CA_AddressType"));

		GuidewireAutomate("description", CA_A_Description, "sendkeys", strCompanyName + " " + "Likes to ");
		GuidewireAutomate("Organization Type", CA_OrganizationType, "selectByVisibleText",
				lhm_TestCase_Table_Data.get("CA_OrganizationType"));

		GuidewireAutomate("Description of Business", CA_DescriptionofBusiness, "sendkeys",
				lhm_TestCase_Table_Data.get("CA_DescriptionofBusiness"));

		/*
		 * OfficialID
		 */
		GuidewireAutomate_Validation("Official IDs", CA_OfficialID, "equals", "Official IDs");
		GuidewireAutomate("FEIN", CA_OID_SSN_FEIN, "sendkeys", strOfficialID);

		GuidewireAutomate("accountnickname", CA_AccountNickname, "sendkeys", strAccountNickname);
		GuidewireAutomate("Preferred Language", GW_Country, "CA_PreferredLanguage",
				lhm_TestCase_Table_Data.get("CA_PreferredLanguage"));

		industryCodeSearch(oDB.getData_MSExcel_WorkSheet_Fillo("industryCode", strTestCaseName));

		/*
		 * Select Producer
		 */
		GuidewireAutomate_Validation("Select Producer", PC_SelectProducer, "equals", "Select Producer");

		organizations(oDB.getData_MSExcel_WorkSheet_Fillo("organizations", strTestCaseName));
		select_SearchResult(oDB.getData_MSExcel_WorkSheet_Fillo("organizations", strTestCaseName));

		GuidewireAutomate_waitForElement(Update_Button, "visibilityOf", "");
		GuidewireAutomate_Validation("ProducerCode", CA_SP_ProducerCode, "equals",
				lhm_TestCase_Table_Data.get("CA_SP_ProducerCode"));

		GuidewireAutomate("Update_Button", Update_Button, "click", "");
		GuidewireAutomate_Validation("Account Summary", GW_TabNavigation_CM_PC_BC_CC.AccountSummary_Name, "contains",
				strAccountNickname);

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();

	}

	@Override

	public void newSubmissions() throws Throwable {

		lhm_TestCase_Table_Data = oDB.getData_MSExcel_WorkSheet_Fillo("newSubmissions", strTestCaseName);

		/*
		 * Select Producer
		 */
		GuidewireAutomate_Validation("Select Producer", PC_SelectProducer, "equals", "Select Producer");

		organizations(oDB.getData_MSExcel_WorkSheet_Fillo("organizations", strTestCaseName));
		select_SearchResult(oDB.getData_MSExcel_WorkSheet_Fillo("organizations", strTestCaseName));

		/*
		 * Product Offers
		 */
		GuidewireAutomate_Validation("Product Offers", PC_ProductOffers, "equals", "Product Offers");

		GuidewireAutomate("Single or Multiple Policies", NS_PO_SingleorMultiplePolicies, "click",
				lhm_TestCase_Table_Data.get("NS_PO_SingleorMultiplePolicies"));
		GuidewireAutomate("Quote Type", NS_PO_QuoteType, "selectByVisibleText",
				lhm_TestCase_Table_Data.get("NS_PO_QuoteType"));
		GuidewireAutomate("Default Base State", NS_PO_DefaultBaseState, "selectByVisibleText",
				lhm_TestCase_Table_Data.get("NS_PO_DefaultBaseState"));
		GuidewireAutomate("Default Effective Date", NS_PO_DefaultEffectiveDate, "sendkeys",
				lhm_TestCase_Table_Data.get("NS_PO_DefaultEffectiveDate"));

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();

	}

}
