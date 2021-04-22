package com.pages.Guidewire.PolicyCenter;

import java.util.LinkedHashMap;

import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;
import com.pages.Guidewire.GW_TabNavigation_CM_PC_BC_CC;

public class GW_PolicyCenter_Resuables extends SeleniumWebDriver_Commands implements GW_PolicyCenter_PO {

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
		case "Quote":
			GuidewireAutomate("Quote", Quote_Button, "click", "");
			break;
		case "SaveDraft":
			GuidewireAutomate("Save Draft", SaveDraft_Button, "click", "");
			break;
		case "Versions":
			GuidewireAutomate("Versions", Versions_Button, "click", "");
			break;
		case "Start SideBySide":
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
		case "Close Options":
			GuidewireAutomate("Close Options", CloseOptions_Button, "click", "");
			break;
		case "Withdraw Transaction":
			GuidewireAutomate("Withdraw Transaction", WithdrawTransaction_Button, "click", "");
			break;

		default:
			break;
		}
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

		GuidewireAutomate("Company Name", companyname, "clear", "");
		GuidewireAutomate("Company Name", companyname, "sendkeys", strAccountName);

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

	/*
	 * --------------------------------------------------------------
	 * createPersonAccount
	 * --------------------------------------------------------------
	 */
	@Override
	public void pc_CreatePersonAccount() throws Throwable {

		lhm_TestCase_Table_Data = oDB.getData_MSExcel_WorkSheet_Fillo("createAccount", strTestCaseName);

		String strFirstName = lhm_TestCase_Table_Data.get("FirstName");
		if (strFirstName.contentEquals("Random")) {
			strFirstName = getRandomAlphabetic(9);
		}
		String strAccountNickname = strFirstName;

		String strLastName = lhm_TestCase_Table_Data.get("LastName");
		if (strLastName.contentEquals("Random")) {
			strLastName = getRandomAlphabetic(9);
		}
		String strAddress1 = lhm_TestCase_Table_Data.get("Address1");
		if (strAddress1.contentEquals("Random")) {
			strAddress1 = getRandomNumeric(3) + "  " + getRandomAlphabetic(7) + " Suites";
		}
		String strPrimaryEmail = lhm_TestCase_Table_Data.get("PrimaryEmail");
		if (strPrimaryEmail.contentEquals("Random")) {
			strPrimaryEmail = strFirstName + "." + strLastName + "@blackcombconsultants.com";
		}
		String strOfficialID = lhm_TestCase_Table_Data.get("OfficialID");
		if (strOfficialID.contentEquals("Random")) {
			strOfficialID = "999-11-" + getRandomNumeric(4);
		}

		/*
		 * Search
		 */
		GuidewireAutomate_Validation("Enter Account Information", GW_TabNavigation_CM_PC_BC_CC.EnterAccountInformation,
				"equals", "Enter Account Information");
		GuidewireAutomate("First Name", firstname, "sendkeys", strFirstName);
		GuidewireAutomate("Last Name", lastname, "sendkeys", strLastName);
		GuidewireAutomate("First Name Exact Match", firstnameexactmatch, "sendkeys", "");
		GuidewireAutomate("Last Name Exact Match", lastnameexactmatch, "sendkeys", "");

		GuidewireAutomate("Country", Country, "selectByVisibleText", lhm_TestCase_Table_Data.get("Country"));
		GuidewireAutomate("State", State_input, "selectByVisibleText", lhm_TestCase_Table_Data.get("State"));

		/*
		 * GuidewireAutomate("City", City, "", lhm_TestCase_Table_Data.get("City"));
		 * GuidewireAutomate("County", County, "",
		 * lhm_TestCase_Table_Data.get("County")); GuidewireAutomate("ZipCode", ZipCode,
		 * "", lhm_TestCase_Table_Data.get("ZIPCode"));
		 */
		clickButton("Search");

		/*
		 * CreateNewAccount_Button
		 */
		/*
		 * Assert.assertEquals(gettext_SearchAccountResultsMessage(),
		 * "Information for the current page:\n" + "The search returned zero results.");
		 * 
		 */
		GuidewireAutomate_Validation("SearchAccoun tResults", SearchAccountResults_Msg, "equals",
				"Information for the current page:\n" + "The search returned zero results.");

		GuidewireAutomate("Create New Account", CreateNewAccount_Button, "click", "");
		GuidewireAutomate("CNA_Person_Button", CNA_Person_Button, "click", "");

		/*
		 * Create account
		 */
		GuidewireAutomate_Validation("Create account", GW_PolicyCenter_Resuables.CreateAccount_Header, "equals",
				"Create account");

		//GuidewireAutomate("First Name", firstname, "sendkeys", strFirstName);
		//GuidewireAutomate("Last Name", lastname, "sendkeys", strLastName);

		GuidewireAutomate("homephone", homephone, "sendkeys", lhm_TestCase_Table_Data.get("HomePhone"));
		GuidewireAutomate("workphone", workphone, "sendkeys", lhm_TestCase_Table_Data.get("WorkPhone"));
		GuidewireAutomate("mobilephone", mobilephone, "sendkeys", lhm_TestCase_Table_Data.get("MobilePhone"));
		GuidewireAutomate("faxphone", faxphone, "sendkeys", lhm_TestCase_Table_Data.get("FaxPhone"));
		GuidewireAutomate("primaryphone", primaryphone, "selectByVisibleText",
				lhm_TestCase_Table_Data.get("PrimaryPhone"));

		GuidewireAutomate("primaryEmail", primaryEmail, "sendkeys", strPrimaryEmail);
		GuidewireAutomate("secondaryEmail", secondaryEmail, "", "");

		GuidewireAutomate("Country", Country, "selectByVisibleText", lhm_TestCase_Table_Data.get("Country"));
		GuidewireAutomate("Address1", address1, "sendkeys", strAddress1);
		GuidewireAutomate("address2", address2, "sendkeys", lhm_TestCase_Table_Data.get("Address2"));
		GuidewireAutomate("address3", address3, "sendkeys", lhm_TestCase_Table_Data.get("Address3"));
		GuidewireAutomate("City", City, "", lhm_TestCase_Table_Data.get("City"));
		GuidewireAutomate("County", County, "", lhm_TestCase_Table_Data.get("County"));
		GuidewireAutomate("ZipCode", ZipCode, "", lhm_TestCase_Table_Data.get("ZIPCode"));
		GuidewireAutomate("State", State_input, "", lhm_TestCase_Table_Data.get("State"));

		GuidewireAutomate("addresstype", addresstype, "selectByVisibleText",
				lhm_TestCase_Table_Data.get("AddressType"));

		GuidewireAutomate("description", description, "sendkeys", strFirstName + " " + strLastName + "Likes to ");

		GuidewireAutomate("officialID", officialID, "sendkeys", strOfficialID);
		GuidewireAutomate("accountnickname", accountnickname, "sendkeys", strAccountNickname);

		organizations(oDB.getData_MSExcel_WorkSheet_Fillo("organizations", strTestCaseName));
		pc_Select_SearchResult();

		GuidewireAutomate_waitForElement(Update_Button, "visibilityOf", "");
		GuidewireAutomate("ProducerCode", ProducerCode, "selectByVisibleText", "301-008578 ACV Property Insurance");

		GuidewireAutomate("Update_Button", Update_Button, "click", "");
		GuidewireAutomate_Validation("Account Summary", GW_TabNavigation_CM_PC_BC_CC.AccountSummary_Name, "contains",
				strAccountNickname);
		lhm_TestCase_Table_Data.clear();

	}

	/*
	 * --------------------------------------------------------------
	 * pc_CreateCompanyAccount
	 * --------------------------------------------------------------
	 */
	@Override
	public void pc_CreateCompanyAccount() throws Throwable {

		lhm_TestCase_Table_Data = oDB.getData_MSExcel_WorkSheet_Fillo("createAccount", strTestCaseName);

		String strCompanyName = lhm_TestCase_Table_Data.get("CompanyName");
		if (strCompanyName.contentEquals("Random")) {
			strCompanyName = getRandomAlphabetic(9);
		}
		String strAccountNickname = strCompanyName;

		String strLastName = lhm_TestCase_Table_Data.get("LastName");
		if (strLastName.contentEquals("Random")) {
			strLastName = getRandomAlphabetic(9);
		}
		String strAddress1 = lhm_TestCase_Table_Data.get("Address1");
		if (strAddress1.contentEquals("Random")) {
			strAddress1 = getRandomNumeric(3) + "  " + getRandomAlphabetic(7) + " Suites";
		}
		String strPrimaryEmail = lhm_TestCase_Table_Data.get("PrimaryEmail");
		if (strPrimaryEmail.contentEquals("Random")) {
			strPrimaryEmail = strCompanyName + "." + strLastName + "@blackcombconsultants.com";
		}
		String strOfficialID = lhm_TestCase_Table_Data.get("OfficialID");
		if (strOfficialID.contentEquals("Random")) {
			strOfficialID = "99" + getRandomNumeric(7);
		}

		/*
		 * Search
		 */
		GuidewireAutomate_Validation("Enter Account Information", GW_TabNavigation_CM_PC_BC_CC.EnterAccountInformation,
				"equals", "Enter Account Information");

		GuidewireAutomate("Company Name", companyname, "clear", "");
		GuidewireAutomate("Company Name", companyname, "sendkeys", strCompanyName);

		GuidewireAutomate("Country", Country, "selectByVisibleText", lhm_TestCase_Table_Data.get("Country"));
		GuidewireAutomate("State", State_input, "selectByVisibleText", lhm_TestCase_Table_Data.get("State"));

		/*
		 * GuidewireAutomate("City", City, "", lhm_TestCase_Table_Data.get("City"));
		 * GuidewireAutomate("County", County, "",
		 * lhm_TestCase_Table_Data.get("County")); GuidewireAutomate("ZipCode", ZipCode,
		 * "", lhm_TestCase_Table_Data.get("ZIPCode"));
		 */
		clickButton("Search");

		/*
		 * CNA_Company_Button
		 */
		GuidewireAutomate("CreateNewAccount_Button", CreateNewAccount_Button, "click", "");
		GuidewireAutomate("CNA_Company_Button", CNA_Company_Button, "click", "");

		/*
		 * Create account
		 */
		GuidewireAutomate("officephone", officephone, "sendkeys", lhm_TestCase_Table_Data.get("OfficePhone"));
		GuidewireAutomate("primaryEmail", primaryEmail, "sendkeys", strPrimaryEmail);
		GuidewireAutomate("secondaryEmail", secondaryEmail, "sendkeys", lhm_TestCase_Table_Data.get("SecondaryEmail"));

		GuidewireAutomate("Country", Country, "selectByVisibleText", lhm_TestCase_Table_Data.get("Country"));
		GuidewireAutomate("Address1", address1, "sendkeys", strAddress1);
		GuidewireAutomate("address2", address2, "sendkeys", lhm_TestCase_Table_Data.get("Address2"));
		GuidewireAutomate("address3", address3, "sendkeys", lhm_TestCase_Table_Data.get("Address3"));
		GuidewireAutomate("City", City, "", lhm_TestCase_Table_Data.get("City"));

		GuidewireAutomate("County", County, "", lhm_TestCase_Table_Data.get("County"));
		GuidewireAutomate("ZipCode", ZipCode, "", lhm_TestCase_Table_Data.get("ZIPCode"));
		GuidewireAutomate("State", State_input, "", lhm_TestCase_Table_Data.get("State"));

		GuidewireAutomate("addresstype", addresstype, "selectByVisibleText",
				lhm_TestCase_Table_Data.get("AddressType"));

		GuidewireAutomate("description", description, "sendkeys", strCompanyName + " " + strLastName + "Likes to ");

		GuidewireAutomate("officialID", officialID, "sendkeys", strOfficialID);
		GuidewireAutomate("accountnickname", accountnickname, "sendkeys", strAccountNickname);

		organizations(oDB.getData_MSExcel_WorkSheet_Fillo("organizations", strTestCaseName));
		pc_Select_SearchResult();

		GuidewireAutomate_waitForElement(Update_Button, "visibilityOf", "");
		GuidewireAutomate("ProducerCode", ProducerCode, "selectByVisibleText", "301-008578 ACV Property Insurance");

		GuidewireAutomate("Update_Button", Update_Button, "click", "");
		GuidewireAutomate_Validation("Account Summary", GW_TabNavigation_CM_PC_BC_CC.AccountSummary_Name, "contains",
				strAccountNickname);

		lhm_TestCase_Table_Data.clear();
	}

	private void pc_Select_SearchResult() throws Throwable {

		GuidewireAutomate_waitForElement(SearchResults, "visibilityOf", "ACV Property Insurance");
		GuidewireAutomate_waitForElement(Select_SearchResult, "elementToBeClickable", "ACV Property Insurance");
		GuidewireAutomate("SearchResult", Select_SearchResult, "click", "");
	}

	public void organizations(LinkedHashMap<String, String> lhmData) throws Throwable {

		GuidewireAutomate("OrganizationSearch", OS_Search, "click", "");
		GuidewireAutomate_Validation("Organization Name", OS_Organizations_Header, "equals", "Organizations");
		GuidewireAutomate("Organization Name", OS_OrganizationName, "sendkeys", lhmData.get("OrganizationName"));
		GuidewireAutomate("Organization Type", OS_OrganizationType, "selectByVisibleText",
				lhmData.get("OrganizationType"));

		GuidewireAutomate("Country", Country, "selectByVisibleText", lhmData.get("Country"));
		// GuidewireAutomate_waitForElement(State_input, "elementToBeSelected",
		// "Alaska");
		// GuidewireAutomate("State", State_input, "selectByVisibleText",
		// lhmData.get("State"));

		// GuidewireAutomate("City", City, "", lhmData.get("City"));
		// GuidewireAutomate("ZipCode", ZipCode, "",
		// lhmData.get("ZipCode"));

		// GuidewireAutomate_Validation("Producer Status", ProducerStatus, "equals",
		// "Active");
		GuidewireAutomate("Producer Tier", OS_ProducerTier, "", lhmData.get("ProducerTier"));
		GuidewireAutomate("Producer Code", OS_ProducerCode, "sendkeys", lhmData.get("ProducerCode"));
		GuidewireAutomate("Policy", OS_Policy, "", lhmData.get("Policy"));
		GuidewireAutomate("Account", OS_Account, "", lhmData.get("Account"));

		GuidewireAutomate("Search_Button", Search_Button, "click", lhmData.get("Search_Button"));
		GuidewireAutomate("Reset_Button", Reset_Button, "", lhmData.get("Reset_Button"));
	}

	public void pc_SearchProducer(LinkedHashMap<String, String> lhmData) throws Throwable {

		GuidewireAutomate("ProducerCode", ProducerCode, "sendkeys", "301-008578");
		GuidewireAutomate("ProducerDescription", ProducerDescription, "sendkeys", "301-008578");
		GuidewireAutomate("ParentProducerCode", ParentProducerCode, "sendkeys", "301-008578");
		GuidewireAutomate("Status", Status, "sendkeys", "301-008578");
		GuidewireAutomate("BranchCode", BranchCode, "sendkeys", "ACV Property Insurance");
		GuidewireAutomate("OrganizationName", OrganizationName, "sendkeys", "");
		GuidewireAutomate("AvailableToUser", AvailableToUser, "sendkeys", "");
		GuidewireAutomate("SearchForMissingPreferredUnderwriter", SearchForMissingPreferredUnderwriter, "sendkeys", "");
		GuidewireAutomate("PreferredUnderwriter", PreferredUnderwriter, "sendkeys", "");

		GuidewireAutomate("Country", Country, "United States", "");
		GuidewireAutomate("City", City, "sendkeys", "");
		GuidewireAutomate("County", County, "sendkeys", "");
		GuidewireAutomate("State", State_input, "sendkeys", "");
		GuidewireAutomate("ZipCode", ZipCode, "sendkeys", "");

		GuidewireAutomate("Search_Button", Search_Button, "click", "");
		GuidewireAutomate("Reset_Button", Reset_Button, "", "");
	}

	public void pc_NewSubmission() throws Throwable {

		// GuidewireAutomate("Organization", Organization, "sendkeys", "Allrisk
		// Insurance");
		// GuidewireAutomate("SeaerchButton", OrganizationName_SeaerchButton, "click",
		// "");

		GuidewireAutomate("Producer Code", ProducerCode, "selectByVisibleText", "301-008578 ACV Property Insurance");

		GuidewireAutomate("Quote Type", QuoteType, "selectByVisibleText", "Full Application");
		GuidewireAutomate("Default Base State", DefaultBaseState, "selectByVisibleText", "Ohio");
		// GuidewireAutomate("Default Effective Date", DefaultEffectiveDate, "sendkeys",
		// "04072021");

	}

	@Override
	public void pc_LOB_Forms() {
		// TODO Auto-generated method stub

	}

	@Override
	public void Payment() {
		// TODO Auto-generated method stub

	}

	@Override
	public void Payment_change() {
		// TODO Auto-generated method stub

	}

}
