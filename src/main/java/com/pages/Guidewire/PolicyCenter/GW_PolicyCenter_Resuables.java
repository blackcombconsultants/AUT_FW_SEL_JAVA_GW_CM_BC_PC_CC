package com.pages.Guidewire.PolicyCenter;

import java.util.LinkedHashMap;

import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.aventstack.extentreports.ExtentTest;
import com.pages.Guidewire.GW_TabNavigation_CM_PC_BC_CC;

public class GW_PolicyCenter_Resuables extends SeleniumWebDriver_Commands implements GW_PolicyCenter_PO {

	String strAccountName;
	LinkedHashMap<String, String> lhm_Data;
	LinkedHashMap<String, String> lhm_Data1;

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
		case "Next":
			GuidewireAutomate("Next_Button", Next_Button, "click", "");
			break;
		case "Search":
			GuidewireAutomate("Search_Button", Search_Button, "click", "");
			break;

		case "Quote":
			GuidewireAutomate("Search_Button", Quote_Button, "click", "");
			break;

		case "SaveDraft":
			GuidewireAutomate("Search_Button", SaveDraft_Button, "click", "");
			break;

		case "Version":
			GuidewireAutomate("Search_Button", Version_Button, "click", "");
			break;

		case "Closeoptions":
			GuidewireAutomate("Search_Button", Closeoptions_Button, "click", "");
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
		GuidewireAutomate("First Name", firstname, "sendkeys", "");
		GuidewireAutomate("Last Name", lastname, "sendkeys", "");
		GuidewireAutomate("First Name Exact Match", firstnameexactmatch, "sendkeys", "");
		GuidewireAutomate("Last Name Exact Match", lastnameexactmatch, "sendkeys", "");

		GuidewireAutomate("Country", Country, "selectByVisibleText", "United States");
		GuidewireAutomate("State", State_input, "selectByVisibleText", "Alaska");

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

		lhm_Data = getDataFromSheet_Fillo("createAccount", "PersonalAccount1");

		String strFirstName = lhm_Data.get("FirstName");
		if (strFirstName.contentEquals("Random")) {
			strFirstName = getRandomAlphabetic(9);
		}
		String strAccountNickname = strFirstName;

		String strLastName = lhm_Data.get("LastName");
		if (strLastName.contentEquals("Random")) {
			strLastName = getRandomAlphabetic(9);
		}
		String strAddress1 = lhm_Data.get("Address1");
		if (strAddress1.contentEquals("Random")) {
			strAddress1 = getRandomNumeric(3) + "  " + getRandomAlphabetic(7) + " Suites";
		}
		String strPrimaryEmail = lhm_Data.get("PrimaryEmail");
		if (strPrimaryEmail.contentEquals("Random")) {
			strPrimaryEmail = strFirstName + "." + strLastName + "@blackcombconsultants.com";
		}
		String strOfficialID = lhm_Data.get("OfficialID");
		if (strOfficialID.contentEquals("Random")) {
			strOfficialID = "999-11-" + getRandomNumeric(4);
		}

		GuidewireAutomate("CreateNewAccount_Button", CreateNewAccount_Button, "click", "");
		GuidewireAutomate("CNA_Person_Button", CNA_Person_Button, "click", "");
		GuidewireAutomate_Validation("Create account", GW_PolicyCenter_Resuables.CreateAccount_Header, "equals",
				"Create account");

		GuidewireAutomate("First Name", firstname, "sendkeys", strFirstName);
		GuidewireAutomate("Last Name", lastname, "sendkeys", strLastName);

		GuidewireAutomate("homephone", homephone, "sendkeys", lhm_Data.get("HomePhone"));
		GuidewireAutomate("workphone", workphone, "sendkeys", lhm_Data.get("WorkPhone"));
		GuidewireAutomate("mobilephone", mobilephone, "sendkeys", lhm_Data.get("MobilePhone"));
		GuidewireAutomate("faxphone", faxphone, "sendkeys", lhm_Data.get("FaxPhone"));
		GuidewireAutomate("primaryphone", primaryphone, "selectByVisibleText", lhm_Data.get("PrimaryPhone"));

		GuidewireAutomate("primaryEmail", primaryEmail, "sendkeys", strPrimaryEmail);
		GuidewireAutomate("secondaryEmail", secondaryEmail, "", "");

		GuidewireAutomate("Country", Country, "selectByVisibleText", lhm_Data.get("Country"));
		GuidewireAutomate("Address1", address1, "sendkeys", strAddress1);
		GuidewireAutomate("address2", address2, "sendkeys", "South Avenue");
		GuidewireAutomate("address3", address3, "sendkeys", "Small County");
		GuidewireAutomate("City", City, "", "");
		GuidewireAutomate("County", County, "", "");
		GuidewireAutomate("State", State_input, "", "");
		GuidewireAutomate("ZipCode", ZipCode, "", "");
		GuidewireAutomate("addresstype", addresstype, "selectByVisibleText", "Home");

		GuidewireAutomate("description", description, "sendkeys", strFirstName + " " + strLastName + "Likes to ");

		GuidewireAutomate("officialID", officialID, "sendkeys", strOfficialID);
		GuidewireAutomate("accountnickname", accountnickname, "sendkeys", strAccountNickname);

		organizations();
		pc_Select_SearchResult();

		GuidewireAutomate_waitForElement(Update_Button, "visibilityOf", "");
		GuidewireAutomate("ProducerCode", ProducerCode, "selectByVisibleText", "301-008578 ACV Property Insurance");

		GuidewireAutomate("Update_Button", Update_Button, "click", "");
		// GuidewireAutomate_Validation("Account Summary",
		// GW_TabNavigation_CM_PC_BC_CC.AccountSummary_Name, "contains",
		// strAccountName);

	}

	/*
	 * --------------------------------------------------------------
	 * pc_CreateCompanyAccount
	 * --------------------------------------------------------------
	 */
	@Override
	public void pc_CreateCompanyAccount() throws Throwable {

		GuidewireAutomate("CreateNewAccount_Button", CreateNewAccount_Button, "click", "");
		GuidewireAutomate("CNA_Company_Button", CNA_Company_Button, "click", "");

		GuidewireAutomate("officephone", officephone, "sendkeys", "2015551001");
		GuidewireAutomate("primaryEmail", primaryEmail, "sendkeys", "test123@gmail.com");
		GuidewireAutomate("secondaryEmail", secondaryEmail, "sendkeys", "test456@gmail.com");

		GuidewireAutomate("Country", Country, "selectByVisibleText", "United States");
		GuidewireAutomate("address1", address1, "sendkeys", "123 Suites");
		GuidewireAutomate("address2", address2, "sendkeys", "South Avenue");
		GuidewireAutomate("address3", address3, "sendkeys", "Small County");

		GuidewireAutomate("City", City, "", "");
		GuidewireAutomate("County", County, "", "");
		GuidewireAutomate("State", State_input, "", "");
		GuidewireAutomate("ZipCode", ZipCode, "", "");

		GuidewireAutomate("addresstype", addresstype, "selectByVisibleText", "Home");
		GuidewireAutomate("description", description, "sendkeys", "description");

		GuidewireAutomate("officialID", officialID, "sendkeys", "221234567");
		GuidewireAutomate("accountnickname", accountnickname, "sendkeys", "testnickname");

		organizations();
		pc_Select_SearchResult();

		GuidewireAutomate_waitForElement(Update_Button, "visibilityOf", "");
		GuidewireAutomate("ProducerCode", ProducerCode, "selectByVisibleText", "301-008578 ACV Property Insurance");

		GuidewireAutomate("Update_Button", Update_Button, "click", "");
		// GuidewireAutomate_Validation("Account Summary",
		// GW_TabNavigation_CM_PC_BC_CC.AccountSummary_Name, "contains",
		// strAccountName);

	}

	private void pc_Select_SearchResult() throws Throwable {

		GuidewireAutomate_waitForElement(SearchResults, "visibilityOf", "ACV Property Insurance");
		GuidewireAutomate_waitForElement(Select_SearchResult, "elementToBeClickable", "ACV Property Insurance");
		GuidewireAutomate("SearchResult", Select_SearchResult, "click", "");
	}

	public void organizations() throws Throwable {

		lhm_Data1 = getDataFromSheet_Fillo("organizations", "Organization1");

		GuidewireAutomate("OrganizationSearch", OS_Search, "click", "");
		GuidewireAutomate_Validation("Organization Name", OS_Organizations_Header, "equals", "Organizations");
		GuidewireAutomate("Organization Name", OS_OrganizationName, "sendkeys", lhm_Data1.get("OrganizationName"));
		GuidewireAutomate("Organization Type", OS_OrganizationType, "selectByVisibleText",
				lhm_Data1.get("OrganizationType"));

		GuidewireAutomate("Country", Country, "selectByVisibleText", lhm_Data.get("Country"));
		// GuidewireAutomate_waitForElement(State_input, "elementToBeSelected",
		// "Alaska");
		// GuidewireAutomate("State", State_input, "selectByVisibleText",
		// lhm_Data.get("State"));

		// GuidewireAutomate("City", City, "", lhm_Data.get("City"));
		// GuidewireAutomate("ZipCode", ZipCode, "", lhm_Data.get("ZipCode"));

		// GuidewireAutomate_Validation("Producer Status", ProducerStatus, "equals",
		// "Active");
		GuidewireAutomate("Producer Tier", OS_ProducerTier, "", lhm_Data1.get("ProducerTier"));
		GuidewireAutomate("Producer Code", OS_ProducerCode, "sendkeys", lhm_Data1.get("ProducerCode"));
		GuidewireAutomate("Policy", OS_Policy, "", lhm_Data1.get("Policy"));
		GuidewireAutomate("Account", OS_Account, "", lhm_Data1.get("Account"));

		GuidewireAutomate("Search_Button", Search_Button, "click", lhm_Data1.get("Search_Button"));
		GuidewireAutomate("Reset_Button", Reset_Button, "", lhm_Data1.get("Reset_Button"));
	}

	public void pc_SearchProducer() throws Throwable {

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
