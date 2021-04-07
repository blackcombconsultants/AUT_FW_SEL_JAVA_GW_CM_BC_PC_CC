package com.pages.Guidewire.PolicyCenter;

import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.aventstack.extentreports.ExtentTest;
import com.pages.Guidewire.GW_TabNavigation_CM_PC_BC_CC;

public class GW_PolicyCenter_Resuables extends SeleniumWebDriver_Commands implements GW_PolicyCenter_PO {

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
			GuidewireAutomate("Search_Button", Search_Button, "click", "");
			break;

		case "SaveDraft":
			GuidewireAutomate("Search_Button", Search_Button, "click", "");
			break;

		case "Version":
			GuidewireAutomate("Search_Button", Search_Button, "click", "");
			break;

		case "Closeoptions":
			GuidewireAutomate("Search_Button", Search_Button, "click", "");
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

	public void pc_SearchAccountInformation() throws Throwable {

//		// navigate to new account
//		GW_TabNavigation_CM_PC_BC_CC t = new GW_TabNavigation_CM_PC_BC_CC(driver, oExtentTest);
//		//t.navigate_AccountTab_AccountNumberSearch("6800979174");
//		t.navigate_AccountTab_AccountNumberSearch("6800979174");

		
		GuidewireAutomate("Company Name", companyname, "clear", "");
		GuidewireAutomate("Company Name", companyname, "sendkeys", strCurrentDate_ddMMMMyyyy);
		GuidewireAutomate("First Name", firstname, "sendkeys", "");
		GuidewireAutomate("Last Name", lastname, "sendkeys", "");
		GuidewireAutomate("First Name Exact Match", firstnameexactmatch, "sendkeys", "");
		GuidewireAutomate("Last Name Exact Match", lastnameexactmatch, "sendkeys", "");

		GuidewireAutomate("Country", Country, "selectByVisibleText", "United States");
		GuidewireAutomate("State", State, "selectByVisibleText", "Alaska");

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
		GuidewireAutomate("CreateNewAccount_Button", CreateNewAccount_Button, "click", "");
		GuidewireAutomate("CNA_Person_Button", CNA_Person_Button, "click", "");

		GuidewireAutomate("homephone", homephone, "sendkeys", "999111000");
		GuidewireAutomate("workphone", workphone, "sendkeys", "881110001");
		GuidewireAutomate("mobilephone", mobilephone, "sendkeys", "7771110001");
		GuidewireAutomate("faxphone", faxphone, "sendkeys", "6661110001");
		GuidewireAutomate("primaryphone", primaryphone, "selectByVisibleText", "Work");

		GuidewireAutomate("primaryEmail", primaryEmail, "sendkeys", "test123@gmail.com");
		GuidewireAutomate("secondaryEmail", secondaryEmail, "sendkeys", "test456@gmail.com");

		GuidewireAutomate("Country", Country, "selectByVisibleText", "United States");
		GuidewireAutomate("address1", address1, "sendkeys", "123 Suites");
		GuidewireAutomate("address2", address2, "sendkeys", "South Avenue");
		GuidewireAutomate("address3", address3, "sendkeys", "Small County");
		GuidewireAutomate("City", City, "sendkeys", "Alaska");
		GuidewireAutomate("County", County, "sendkeys", "Anchorage");
		GuidewireAutomate("State", State, "selectByVisibleText", "Alaska");
		GuidewireAutomate("ZipCode", ZipCode, "sendkeys", "99501");
		GuidewireAutomate("addresstype", addresstype, "selectByVisibleText", "Home");
		GuidewireAutomate("description", description, "sendkeys", "description");

		GuidewireAutomate("officialID", officialID, "sendkeys", "999-11-0001");
		GuidewireAutomate("accountnickname", accountnickname, "sendkeys", "testnickname");

		GuidewireAutomate("Organization", Organization, "sendkeys", "ACV Property Insurance");
		GuidewireAutomate("ProducerCode", ProducerCode, "selectByVisibleText", "301-008578 ACV Property Insurance");

		GuidewireAutomate("Update_Button", Update_Button, "click", "");

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

		/*
		 * GuidewireAutomate("City", City, "sendkeys", "Alaska");
		 * GuidewireAutomate("County", County, "sendkeys", "Anchorage");
		 * GuidewireAutomate("State", State, "selectByVisibleText", "Alaska");
		 * GuidewireAutomate("ZipCode", ZipCode, "sendkeys", "99501");
		 */
		GuidewireAutomate("addresstype", addresstype, "selectByVisibleText", "Home");
		GuidewireAutomate("description", description, "sendkeys", "description");

		GuidewireAutomate("officialID", officialID, "sendkeys", "999-11-0001");
		GuidewireAutomate("accountnickname", accountnickname, "sendkeys", "testnickname");

		GuidewireAutomate("OrganizationName", OrganizationName, "sendkeys", "ACV Property Insurance");

		// pc_SearchOrganizations();
		GuidewireAutomate("Update_Button", Update_Button, "click", "");

	}

	public void pc_SearchOrganizations() throws Throwable {

		GuidewireAutomate("OrganizationName", OrganizationName, "sendkeys", "ACV Property Insurance");
		GuidewireAutomate("OrganizationType", OrganizationType, "Agency", "");

		GuidewireAutomate("Country", Country, "United States", "");
		GuidewireAutomate("City", City, "sendkeys", "");
		GuidewireAutomate("County", County, "sendkeys", "");
		GuidewireAutomate("State", State, "sendkeys", "");
		GuidewireAutomate("ZipCode", ZipCode, "sendkeys", "");

		GuidewireAutomate("ProducerStatus", ProducerStatus, "sendkeys", "");
		GuidewireAutomate("ProducerTier", ProducerTier, "", "");
		GuidewireAutomate("ProducerCode", ProducerCode, "sendkeys", "301-008578 ACV Property Insurance");
		GuidewireAutomate("Policy", Policy, "sendkeys", "");
		GuidewireAutomate("Account", Account, "sendkeys", "");

		GuidewireAutomate("Search_Button", Search_Button, "click", "");
		GuidewireAutomate("Reset_Button", Reset_Button, "", "");
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
		GuidewireAutomate("State", State, "sendkeys", "");
		GuidewireAutomate("ZipCode", ZipCode, "sendkeys", "");

		GuidewireAutomate("Search_Button", Search_Button, "click", "");
		GuidewireAutomate("Reset_Button", Reset_Button, "", "");
	}

	public void pc_NewSubmission() throws Throwable {

		// GuidewireAutomate("Organization", Organization, "sendkeys", "Allrisk
		// Insurance");
		// GuidewireAutomate("SeaerchButton", OrganizationName_SeaerchButton, "click",
		// "");

		GuidewireAutomate("Producer Code", ProducerCode, "selectByVisibleText", "501-002552 Allrisk Insurance");

		GuidewireAutomate("Quote Type", QuoteType, "selectByVisibleText", "Full Application");
		GuidewireAutomate("Default Base State", DefaultBaseState, "selectByVisibleText", "Ohio");
		// GuidewireAutomate("Default Effective Date", DefaultEffectiveDate, "sendkeys",
		// "04072021");

	}

}
