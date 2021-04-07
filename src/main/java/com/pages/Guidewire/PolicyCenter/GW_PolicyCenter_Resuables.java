package com.pages.Guidewire.PolicyCenter;

import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.aventstack.extentreports.ExtentTest;

public class GW_PolicyCenter_Resuables extends SeleniumWebDriver_Commands implements GW_PolicyCenter_PO {

	public GW_PolicyCenter_Resuables(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	/*
	 * --------------------------------------------------------------
	 * getAccountInformationHeader
	 * --------------------------------------------------------------
	 */ public String getHeader_EnterAccountInformation() {
		return getText_Element(EnterAccountInformation);
	}

	/*
	 * --------------------------------------------------------------
	 * getAccountInformationHeader
	 * --------------------------------------------------------------
	 */ public String getHeader_AccountSummary() {
		return getText_Element(AccountSummary);
	}

	/*
	 * --------------------------------------------------------------
	 * searchResultsMessage
	 * --------------------------------------------------------------
	 */
	// checking search result message
	public String gettext_SearchAccountResultsMessage() {
		return getText_Element(SearchAccountResults_Msg);
	}

	/*
	 * --------------------------------------------------------------
	 * searchAccountInformation
	 * --------------------------------------------------------------
	 */

	public void pc_SearchAccountInformation() {

		GuidewireAutomate("Company Name", companyname, "sendkeys", "QA Automation2");
		GuidewireAutomate("Company Name", companyname, "clear", "");
		GuidewireAutomate("First Name", firstname, "sendkeys", "QA");
		GuidewireAutomate("Last Name", lastname, "sendkeys", "Automation2");
		GuidewireAutomate("First Name Exact Match", firstnameexactmatch, "sendkeys", "");
		GuidewireAutomate("Last Name Exact Match", lastnameexactmatch, "sendkeys", "");

		GuidewireAutomate("Country", Country, "sendkeys", "");
		GuidewireAutomate("City", City, "sendkeys", "");
		GuidewireAutomate("county", County, "sendkeys", "");
		GuidewireAutomate("State", State, "sendkeys", "");
		GuidewireAutomate("ZipCode", ZipCode, "sendkeys", "");

		GuidewireAutomate("Search_Button", Search_Button, "click", "");

	}
	
	public void Account_Search_SubTab() {

		GuidewireAutomate("Account_Tab_Dropdown", Account_Tab_Dropdown, "click", "");
		GuidewireAutomate("Account_Tab_Search", Account_Tab_Search,"sendkeys", "4095103645");
		GuidewireAutomate("Account_Tab_Search_Button", Account_Tab_Search_Button, "click", "");
        // Validating the page header
        
	}

	/*
	 * --------------------------------------------------------------
	 * createPersonAccount
	 * --------------------------------------------------------------
	 */
	@Override
	public void pc_CreatePersonAccount() {
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
	public void pc_CreateCompanyAccount() {
		GuidewireAutomate("CreateNewAccount_Button", CreateNewAccount_Button, "click", "");
		GuidewireAutomate("CNA_Company_Button",CNA_Company_Button, "click", "");

		GuidewireAutomate("officephone", officephone, "sendkeys", "999111000");
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

		//pc_SearchOrganizations();
		GuidewireAutomate("Update_Button", Update_Button, "click", "");
	}

	
	  public void pc_SearchOrganizations() {
	  
	  GuidewireAutomate("OrganizationName", OrganizationName, "sendkeys","ACV Property Insurance"); 
	  GuidewireAutomate("OrganizationType",OrganizationType, "Agency", "");
	  
	  GuidewireAutomate("Country", Country, "United States", "");
	  GuidewireAutomate("City", City, "sendkeys", ""); 
	  GuidewireAutomate("County",County, "sendkeys", ""); 
	  GuidewireAutomate("State", State, "sendkeys", "");
	  GuidewireAutomate("ZipCode", ZipCode, "sendkeys", "");
	  
	  GuidewireAutomate("ProducerStatus", ProducerStatus, "sendkeys", "");
	  GuidewireAutomate("ProducerTier", ProducerTier, "", "");
	  GuidewireAutomate("ProducerCode", ProducerCode, "sendkeys","301-008578 ACV Property Insurance"); 
	  GuidewireAutomate("Policy", Policy, "sendkeys",""); 
	  GuidewireAutomate("Account", Account, "sendkeys", "");
	  
	  GuidewireAutomate("Search_Button", Search_Button, "click", "");
	  GuidewireAutomate("Reset_Button", Reset_Button, "", ""); }
	  
	  public void pc_SearchProducer() {
	  
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
	  GuidewireAutomate("City", City,"sendkeys", ""); 
	  GuidewireAutomate("County", County, "sendkeys", "");
	  GuidewireAutomate("State", State, "sendkeys", ""); 
	  GuidewireAutomate("ZipCode", ZipCode,"sendkeys", "");
	  
	  GuidewireAutomate("Search_Button", Search_Button, "click", "");
	  GuidewireAutomate("Reset_Button", Reset_Button, "", ""); }
	 
}
