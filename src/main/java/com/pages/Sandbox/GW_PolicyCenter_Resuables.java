package com.pages.Sandbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;

public class GW_PolicyCenter_Resuables extends GW_Utils_SeleniumWebDriver implements GW_PolicyCenter_PO {

	private static final By Zipcode = null;
	public WebDriver driver;

	public GW_PolicyCenter_Resuables(WebDriver driver, ExtentReports er) {
		super(driver, er);
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

		gwAutomate(companyname, "sendkeys", "QA Automation2");
		gwAutomate(companyname, "clear", "");
		gwAutomate(firstname, "sendkeys", "QA");
		gwAutomate(lastname, "sendkeys", "Automation2");
		gwAutomate(firstnameexactmatch, "sendkeys", "");
		gwAutomate(lastnameexactmatch, "sendkeys", "");
		
		gwAutomate(Country, "sendkeys", "");
		gwAutomate(City, "sendkeys", "");
		gwAutomate(County, "sendkeys", "");
		gwAutomate(State, "sendkeys", "");
		gwAutomate(Zipcode, "sendkeys", "");
		
		gwAutomate(Search_Button, "click", "");

	}

	/*
	 * --------------------------------------------------------------
	 * createPersonAccount
	 * --------------------------------------------------------------
	 */
	@Override
	public void pc_CreatePersonAccount() {
		gwAutomate(CreateNewAccount_Button, "click", "");
		gwAutomate(CNA_Person_Button, "click", "");

		gwAutomate(homephone, "sendkeys", "999111000");
		gwAutomate(workphone, "sendkeys", "881110001");
		gwAutomate(mobilephone, "sendkeys", "7771110001");
		gwAutomate(faxphone, "sendkeys", "6661110001");
		gwAutomate(primaryphone, "selectByVisibleText", "Work");

		gwAutomate(primaryEmail, "sendkeys", "test123@gmail.com");
		gwAutomate(secondaryEmail, "sendkeys", "test456@gmail.com");

		gwAutomate(Country, "selectByVisibleText", "United States");
		gwAutomate(address1, "sendkeys", "123 Suites");
		gwAutomate(address2, "sendkeys", "South Avenue");
		gwAutomate(address3, "sendkeys", "Small County");
		gwAutomate(City, "sendkeys", "Alaska");
		gwAutomate(County, "sendkeys", "Anchorage");
		gwAutomate(State, "selectByVisibleText", "Alaska");
		gwAutomate(Zipcode, "sendkeys", "99501");
		gwAutomate(addresstype, "selectByVisibleText", "Home");
		gwAutomate(description, "sendkeys", "description");

		gwAutomate(officialID, "sendkeys", "999-11-0001");
		gwAutomate(accountnickname, "sendkeys", "testnickname");

		gwAutomate(Organization, "sendkeys", "ACV Property Insurance");
		gwAutomate(ProducerCode, "selectByVisibleText", "301-008578 ACV Property Insurance");

		gwAutomate(Update_Button, "click", "");

	}
	
	/*
	 * --------------------------------------------------------------
	 * pc_CreateCompanyAccount
	 * --------------------------------------------------------------
	 */
	@Override
	public void pc_CreateCompanyAccount() {
		gwAutomate(CreateNewAccount_Button, "click", "");
		gwAutomate(CNA_Company_Button, "click", "");

		gwAutomate(officephone, "sendkeys", "999111000");
		gwAutomate(primaryEmail, "sendkeys", "test123@gmail.com");
		gwAutomate(secondaryEmail, "sendkeys", "test456@gmail.com");

		gwAutomate(Country, "selectByVisibleText", "United States");
		gwAutomate(address1, "sendkeys", "123 Suites");
		gwAutomate(address2, "sendkeys", "South Avenue");
		gwAutomate(address3, "sendkeys", "Small County");
		
		gwAutomate(City, "sendkeys", "Alaska");
		gwAutomate(County, "sendkeys", "Anchorage");
		gwAutomate(State, "selectByVisibleText", "Alaska");
		gwAutomate(ZipCode, "sendkeys", "99501");
		gwAutomate(addresstype, "selectByVisibleText", "Home");
		gwAutomate(description, "sendkeys", "description");

		gwAutomate(officialID, "sendkeys", "999-11-0001");
		gwAutomate(accountnickname, "sendkeys", "testnickname");

		pc_SearchOrganizations();
		gwAutomate(Update_Button, "click", "");
	}
	
	
	public void pc_SearchOrganizations() {
		
		gwAutomate(OrganizationName, "sendkeys", "ACV Property Insurance");
		gwAutomate(OrganizationType, "Agency", "");
		
		gwAutomate(Country, "United States", "");
		gwAutomate(City, "sendkeys", "");
		gwAutomate(County, "sendkeys", "");
		gwAutomate(State, "sendkeys", "");
		gwAutomate(ZipCode, "sendkeys", "");
		
		//gwAutomate(ProducerStatus, "sendkeys", "");
		gwAutomate(ProducerTier, "", "");
		gwAutomate(ProducerCode, "sendkeys", "301-008578 ACV Property Insurance");
		gwAutomate(Policy, "sendkeys", "");
		gwAutomate(Account, "sendkeys", "");
		
		gwAutomate(Search_Button, "click", "");
		gwAutomate(Reset_Button, "", "");
	}
	
	
	public void pc_SearchProducer() {
		
		gwAutomate(ProducerCode, "sendkeys", "301-008578");
		gwAutomate(ProducerDescription, "sendkeys", "301-008578");
		gwAutomate(ParentProducerCode, "sendkeys", "301-008578");
		gwAutomate(Status, "sendkeys", "301-008578");
		gwAutomate(BranchCode, "sendkeys", "ACV Property Insurance");
		gwAutomate(OrganizationName, "sendkeys", "");
		gwAutomate(AvailableToUser, "sendkeys", "");
		gwAutomate(SearchForMissingPreferredUnderwriter, "sendkeys", "");
		gwAutomate(PreferredUnderwriter, "sendkeys", "");
		
		gwAutomate(Country, "United States", "");
		gwAutomate(City, "sendkeys", "");
		gwAutomate(County, "sendkeys", "");
		gwAutomate(State, "sendkeys", "");
		gwAutomate(Zipcode, "sendkeys", "");
		
		gwAutomate(Search_Button, "click", "");
		gwAutomate(Reset_Button, "", "");
	}


}
