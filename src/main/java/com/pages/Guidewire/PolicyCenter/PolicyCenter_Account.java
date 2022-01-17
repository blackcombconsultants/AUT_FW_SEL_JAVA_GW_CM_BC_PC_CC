package com.pages.Guidewire.PolicyCenter;

import java.util.LinkedHashMap;

import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;
import com.pages.Guidewire.Tab_Menu_Navigation;

public class PolicyCenter_Account extends SeleniumWebDriver_Commands implements PolicyCenter_Account_PO {

	public static String           strAddress1;
	static String                  strOfficialID;
	LinkedHashMap<String, String>  lhm_TestCase_Table_Data1;
	static Selenium_Utils_DataBase oDB = new Selenium_Utils_DataBase();

	public PolicyCenter_Account(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	public static void select_SearchResult(LinkedHashMap<String, String> lhm_TestCase_Table_Data) throws Throwable {
		GuidewireAutomate_waitForElement(PolicyCenter_Resuables.Select_Button, "elementToBeClickable", lhm_TestCase_Table_Data.get("OS_OrganizationName"));
		GuidewireAutomate("Select", PolicyCenter_Resuables.Select_Button, "click", lhm_TestCase_Table_Data.get("Select_Button"));
	}

	public static void organizations(LinkedHashMap<String, String> lhm_TestCase_Table_Data) throws Throwable {

		GuidewireAutomate("OrganizationSearch", CA_SP_OrganizationSearch_Button, "click", "click");

		GuidewireAutomate_Validation("Organization Name", PolicyCenter_Resuables.Organizations_Header, "equals", "Organizations");

		GuidewireAutomate("Organization Name", OS_OrganizationName, "sendKeys", lhm_TestCase_Table_Data.get("OS_OrganizationName"));
		GuidewireAutomate("Organization Type", OS_OrganizationType, "selectByVisibleText", lhm_TestCase_Table_Data.get("OS_OrganizationType"));

		GuidewireAutomate("Country", GW_Country, "selectByVisibleText", lhm_TestCase_Table_Data.get("GW_Country"));
		// GuidewireAutomate("State", GW_State, "selectByVisibleText",
		// lhm_TestCase_Table_Data.get("GW_State"));
		/*
		 * GuidewireAutomate("City", GW_City, "",
		 * lhm_TestCase_Table_Data.get("GW_City")); GuidewireAutomate("County",
		 * GW_County, "", lhm_TestCase_Table_Data.get("GW_County"));
		 * GuidewireAutomate("ZipCode", GW_ZipCode, "",
		 * lhm_TestCase_Table_Data.get("GW_ZipCode"));
		 * 
		 */ // GuidewireAutomate_Validation("Producer Status", ProducerStatus,
			// "equals",
		// "Active");
		GuidewireAutomate("Producer Tier", OS_ProducerTier, "sendKeys", lhm_TestCase_Table_Data.get("OS_ProducerTier"));
		GuidewireAutomate("Producer Code", OS_ProducerCode, "sendKeys", lhm_TestCase_Table_Data.get("OS_ProducerCode"));
		GuidewireAutomate("Policy", OS_Policy, "sendKeys", lhm_TestCase_Table_Data.get("OS_Policy"));
		GuidewireAutomate("Account", OS_Account, "sendKeys", lhm_TestCase_Table_Data.get("OS_Account"));

		GuidewireAutomate("Search Button", PolicyCenter_Resuables.Search_Button, "click", lhm_TestCase_Table_Data.get("Search_Button"));

		// GuidewireAutomate("Reset Button",
		// PolicyCenter_Resuables.Reset_Button, "click",
		// lhm_TestCase_Table_Data.get("Reset_Button"));

	}

	public static void industryCodeSearch(LinkedHashMap<String, String> lhm_TestCase_Table_Data) throws Throwable {

		GuidewireAutomate("Search", IndustryCode_Search_Button, "click", "click");

		GuidewireAutomate_Validation("Industry Code Search", PolicyCenter_Resuables.Screen_Header, "equals", "Industry Code Search");

		GuidewireAutomate("Code", IS_Code, "sendKeys", lhm_TestCase_Table_Data.get("IS_Code"));
		GuidewireAutomate("Classification", IS_Classification, "sendKeys", lhm_TestCase_Table_Data.get("IS_Classification"));

		GuidewireAutomate("Search_Button", PolicyCenter_Resuables.Search_Button, "click", lhm_TestCase_Table_Data.get("Search_Button"));
		// GuidewireAutomate("Reset_Button",
		// PolicyCenter_Resuables.Reset_Button, "",
		// lhm_TestCase_Table_Data.get("Reset_Button"));
	}

	public static void producer(LinkedHashMap<String, String> lhm_TestCase_Table_Data) throws Throwable {

		GuidewireAutomate_Validation("Producer", PolicyCenter_Resuables_PO.Screen_Header, "equals", "Producer");

		GuidewireAutomate("ProducerCode", ProducerCode, "sendKeys", "301-008578");
		GuidewireAutomate("ProducerDescription", ProducerDescription, "sendKeys", "301-008578");
		GuidewireAutomate("ParentProducerCode", ParentProducerCode, "sendKeys", "301-008578");
		GuidewireAutomate("Status", Status, "sendKeys", "301-008578");
		GuidewireAutomate("BranchCode", BranchCode, "sendKeys", "ACV Property Insurance");
		GuidewireAutomate("OrganizationName", OrganizationName, "sendKeys", "");
		GuidewireAutomate("AvailableToUser", AvailableToUser, "sendKeys", "");
		GuidewireAutomate("SearchForMissingPreferredUnderwriter", SearchForMissingPreferredUnderwriter, "sendKeys", "");
		GuidewireAutomate("PreferredUnderwriter", PreferredUnderwriter, "sendKeys", "");

		GuidewireAutomate("Country", GW_Country, "selectByVisibleText", lhm_TestCase_Table_Data.get("GW_Country"));
		GuidewireAutomate("City", GW_City, "", lhm_TestCase_Table_Data.get("GW_City"));
		GuidewireAutomate("County", GW_County, "", lhm_TestCase_Table_Data.get("GW_County"));
		GuidewireAutomate("ZipCode", GW_ZipCode, "", lhm_TestCase_Table_Data.get("GW_ZipCode"));
		GuidewireAutomate("State", GW_State, "selectByVisibleText", lhm_TestCase_Table_Data.get("GW_State"));

		GuidewireAutomate("Search_Button", PolicyCenter_Resuables_PO.Search_Button, "click", "click");
		GuidewireAutomate("Reset_Button", PolicyCenter_Resuables_PO.Reset_Button, "click", "");
	}

	/*
	 * --------------------------------------------------------------
	 * createPersonAccount
	 * --------------------------------------------------------------
	 */

	public static void createPersonAccount() throws Throwable {

		GuidewireAutomate_Validation("Enter Account Information", PolicyCenter_Resuables_PO.EnterAccountInformation_Header, "equals", "Enter Account Information");

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("createAccount", strTestCaseName);

		String strFirstName = lhm_TestCase_Table_Data.get("SA_FirstName");
		if (strFirstName.contentEquals("Random")) {
			strFirstName = getRandomAlphabetic(9);
		} else if (strFirstName.contentEquals("Today")) {
			strFirstName = strCurrentDate_ddMMMMyyyy;
		} else if (strFirstName.contentEquals("Now")) {
			strFirstName = strCurrentDate_ddMMMMyyyyHHmmss;
		} else if (strFirstName.contentEquals("NowSystem")) {
			strFirstName = String.valueOf(System.currentTimeMillis());
		}

		String strLastName = lhm_TestCase_Table_Data.get("SA_LastName");
		if (strLastName.contentEquals("Random")) {
			strLastName = getRandomAlphabetic(9);
		}
		String strAccountNickname = strFirstName + " " + strLastName;

		strAddress1 = lhm_TestCase_Table_Data.get("CA_Address1");
		if (strAddress1.contentEquals("Random")) {
			strAddress1 = getRandomNumeric(3) + "  " + getRandomAlphabetic(7) + " Suites";
		}
		String strPrimaryEmail = lhm_TestCase_Table_Data.get("CA_PrimaryEmail");
		if (strPrimaryEmail.contentEquals("Random")) {
			strPrimaryEmail = strFirstName + "." + strLastName + "@blackcombconsultants.com";
		}
		strOfficialID = lhm_TestCase_Table_Data.get("CA_OfficialID");
		if (strOfficialID.contentEquals("Random")) {
			strOfficialID = "999-11-" + getRandomNumeric(4);
		}

		/*
		 * Search
		 */
		GuidewireAutomate("First Name", SA_FirstName, "sendKeys", strFirstName);
		GuidewireAutomate("Last Name", SA_LastName, "sendKeys", strLastName);

		GuidewireAutomate("Company Name", SA_CompanyNameExactMatch, "click", lhm_TestCase_Table_Data.get("SA_CompanyNameExactMatch"));
		GuidewireAutomate("First Name Exact Match", SA_FirstNameExactMatch, "click", lhm_TestCase_Table_Data.get("SA_FirstNameExactMatch"));
		GuidewireAutomate("Last Name Exact Match", SA_LastNameExactMatch, "click", lhm_TestCase_Table_Data.get("SA_LastNameExactMatch"));

		GuidewireAutomate("Country", GW_Country, "selectByVisibleTextAndwait", lhm_TestCase_Table_Data.get("GW_Country"));
		GuidewireAutomate("State", GW_State, "selectByVisibleTextAndwait", lhm_TestCase_Table_Data.get("GW_State"));
		/*
		 * GuidewireAutomate("City", GW_City, "",
		 * lhm_TestCase_Table_Data.get("GW_City")); GuidewireAutomate("County",
		 * GW_County, "", lhm_TestCase_Table_Data.get("GW_County"));
		 * GuidewireAutomate("ZipCode", GW_ZipCode, "",
		 * lhm_TestCase_Table_Data.get("GW_ZIPCode"));
		 * 
		 */

		PolicyCenter_Resuables.clickButton("Search");

		/*
		 * CreateNewAccount_Button
		 */
		/*
		 * Assert.assertEquals(gettext_SearchAccountResultsMessage(),
		 * "Information for the current page:\n" +
		 * "The search returned zero results.");
		 * 
		 */
		GuidewireAutomate_Validation("The search returned zero results", PolicyCenter_Resuables_PO.Error_Message, "equals", "The search returned zero results.");

		GuidewireAutomate("Create New Account", SA_CreateNewAccount_Button, "clickAndwait", "Click");
		getStaleElement("Person", SA_CNA_Person_Button);
		GuidewireAutomate("Person", SA_CNA_Person_Button, "clickAndwait", "Click");

		/*
		 * Create account
		 */
		GuidewireAutomate_Validation("Create account", PolicyCenter_Resuables_PO.CreateAccount_Header, "equals", "Create account");

		GuidewireAutomate_Validation("Please confirm account information", CA_PleaseConfirmAccountInformation, "equals", "Please confirm account information");

		GuidewireAutomate_Validation("First Name", SA_FirstName, "valueEquals", strFirstName);
		GuidewireAutomate_Validation("Last Name", SA_LastName, "valueEquals", strLastName);

		GuidewireAutomate("HomePhone", CA_HomePhone, "sendKeys", lhm_TestCase_Table_Data.get("CA_HomePhone"));
		GuidewireAutomate("WorkPhone", CA_WorkPhone, "sendKeys", lhm_TestCase_Table_Data.get("CA_WorkPhone"));
		GuidewireAutomate("MobilePhone", CA_MobilePhone, "sendKeys", lhm_TestCase_Table_Data.get("CA_MobilePhone"));
		GuidewireAutomate("FaxPhone", CA_FaxPhone, "sendKeys", lhm_TestCase_Table_Data.get("CA_FaxPhone"));
		GuidewireAutomate("primaryphone", CA_PrimaryPhone, "selectByVisibleText", lhm_TestCase_Table_Data.get("CA_PrimaryPhone"));

		GuidewireAutomate("Primary Email", CA_PrimaryEmail, "sendKeys", strPrimaryEmail);
		GuidewireAutomate("Secondary Email", CA_SecondaryEmail, "sendKeys", lhm_TestCase_Table_Data.get("CA_SecondaryEmail"));

		/*
		 * Address
		 */
		GuidewireAutomate_Validation("Address", CA_Address, "equals", "Address");

		GuidewireAutomate("Country", GW_Country, "selectByVisibleText", lhm_TestCase_Table_Data.get("GW_Country"));
		GuidewireAutomate("State", GW_State, "selectByVisibleText", lhm_TestCase_Table_Data.get("GW_State"));
		GuidewireAutomate("Address1", CA_A_Address1, "sendKeys", strAddress1);
		GuidewireAutomate("Address2", CA_A_Address2, "sendKeys", lhm_TestCase_Table_Data.get("CA_Address2"));
		GuidewireAutomate("Address3", CA_A_Address3, "sendKeys", lhm_TestCase_Table_Data.get("CA_Address3"));
		//GuidewireAutomate("City", GW_City, "sendKeys", lhm_TestCase_Table_Data.get("GW_City"));
		//GuidewireAutomate("County", GW_County, "sendKeys", lhm_TestCase_Table_Data.get("GW_County"));
		//GuidewireAutomate("ZipCode", GW_ZipCode, "sendKeys", lhm_TestCase_Table_Data.get("GW_ZipCode"));

		GuidewireAutomate("addresstype", CA_A_Addresstype, "selectByVisibleText", lhm_TestCase_Table_Data.get("CA_AddressType"));
		GuidewireAutomate("description", CA_A_Description, "sendKeys", strFirstName + " " + strLastName + "Likes to ");

		/*
		 * OfficialID
		 */
		GuidewireAutomate_Validation("Official IDs", CA_OfficialID, "equals", "Official IDs");

		GuidewireAutomate("SSN", CA_OID_SSN_FEIN, "sendKeys", strOfficialID);
		GuidewireAutomate("accountnickname", CA_AccountNickname, "sendKeys", strAccountNickname);
		/*
		 * Select Producer
		 */
		GuidewireAutomate_Validation("Select Producer", PC_SelectProducer, "equals", "Select Producer");

		organizations(Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("organizations", strTestCaseName));
		select_SearchResult(Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("organizations", strTestCaseName));

		GuidewireAutomate_waitForElement(PolicyCenter_Resuables.Update_Button, "visibilityOf", "");
		GuidewireAutomate("Update Button", PolicyCenter_Resuables.Update_Button, "click", "click");
		GuidewireAutomate_Validation("Account Summary", Tab_Menu_Navigation.AccountSummary_Name, "contains", strAccountNickname);

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();

	}

	/*
	 * --------------------------------------------------------------
	 * pc_CreateCompanyAccount
	 * --------------------------------------------------------------
	 */

	public static void createCompanyAccount() throws Throwable {

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("createAccount", strTestCaseName);

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

		GuidewireAutomate_Validation("Enter Account Information", PolicyCenter_Resuables_PO.Screen_Header, "equals", "Enter Account Information");

		GuidewireAutomate("Company Name", SA_CompanyName, "clearANDsendKeys", strCompanyName);

		GuidewireAutomate("Company Name", SA_CompanyNameExactMatch, "click", lhm_TestCase_Table_Data.get("SA_CompanyNameExactMatch"));
		GuidewireAutomate("First Name Exact Match", SA_FirstNameExactMatch, "click", lhm_TestCase_Table_Data.get("SA_FirstNameExactMatch"));
		GuidewireAutomate("Last Name Exact Match", SA_LastNameExactMatch, "click", lhm_TestCase_Table_Data.get("SA_LastNameExactMatch"));

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
		 */ PolicyCenter_Resuables.clickButton("Search");

		/*
		 * CreateNewAccount_Button
		 */

		/*
		 * Assert.assertEquals(gettext_SearchAccountResultsMessage(),
		 * "Information for the current page:\n" +
		 * "The search returned zero results.");
		 * 
		 */
		GuidewireAutomate_Validation("The search returned zero results", PolicyCenter_Resuables.Error_Message, "equals", "The search returned zero results.");

		GuidewireAutomate("Create New Account", SA_CreateNewAccount_Button, "click", "click");
		GuidewireAutomate("Company Button", SA_CNA_Company_Button, "click", "click");

		/*
		 * Create account
		 */
		GuidewireAutomate_Validation("Create account", PolicyCenter_Resuables_PO.CreateAccount_Header, "equals", "Create account");

		GuidewireAutomate_Validation("Please confirm account information", CA_PleaseConfirmAccountInformation, "equals", "Please confirm account information");

		GuidewireAutomate_Validation("Company Name", SA_CompanyName, "valueEquals", strCompanyName);

		GuidewireAutomate("officephone", CA_OfficePhone, "sendKeys", lhm_TestCase_Table_Data.get("CA_OfficePhone"));
		GuidewireAutomate("officephone", CA_FaxPhone, "sendKeys", lhm_TestCase_Table_Data.get("CA_FaxPhone"));
		GuidewireAutomate("primaryEmail", CA_PrimaryEmail, "sendKeys", strPrimaryEmail);
		GuidewireAutomate("secondaryEmail", CA_SecondaryEmail, "", lhm_TestCase_Table_Data.get("CA_SecondaryEmail"));

		/*
		 * Address
		 */
		GuidewireAutomate_Validation("Address", CA_Address, "equals", "Address");

		GuidewireAutomate("Country", GW_Country, "selectByVisibleText", lhm_TestCase_Table_Data.get("GW_Country"));
		GuidewireAutomate("Address1", CA_A_Address1, "sendKeys", strAddress1);
		GuidewireAutomate("address2", CA_A_Address2, "sendKeys", lhm_TestCase_Table_Data.get("CA_Address2"));
		GuidewireAutomate("address3", CA_A_Address3, "sendKeys", lhm_TestCase_Table_Data.get("CA_Address3"));
		GuidewireAutomate("City", GW_City, "sendKeys", lhm_TestCase_Table_Data.get("GW_City"));
		GuidewireAutomate("County", GW_County, "sendKeys", lhm_TestCase_Table_Data.get("GW_County"));
		GuidewireAutomate("ZipCode", GW_ZipCode, "sendKeys", lhm_TestCase_Table_Data.get("GW_ZipCode"));
		GuidewireAutomate("State", GW_State, "selectByVisibleText", lhm_TestCase_Table_Data.get("GW_State"));

		GuidewireAutomate("addresstype", CA_A_Addresstype, "selectByVisibleText", lhm_TestCase_Table_Data.get("CA_AddressType"));

		GuidewireAutomate("description", CA_A_Description, "sendKeys", strCompanyName + " " + "Likes to ");
		GuidewireAutomate("Organization Type", CA_OrganizationType, "selectByVisibleText", lhm_TestCase_Table_Data.get("CA_OrganizationType"));

		GuidewireAutomate("Description of Business", CA_DescriptionofBusiness, "sendKeys", lhm_TestCase_Table_Data.get("CA_DescriptionofBusiness"));

		/*
		 * OfficialID
		 */
		GuidewireAutomate_Validation("Official IDs", CA_OfficialID, "equals", "Official IDs");
		GuidewireAutomate("FEIN", CA_OID_SSN_FEIN, "sendKeys", strOfficialID);

		GuidewireAutomate("accountnickname", CA_AccountNickname, "sendKeys", strAccountNickname);
	//	GuidewireAutomate("Preferred Language", CA_PreferredLanguage, "valueEquals", lhm_TestCase_Table_Data.get("CA_PreferredLanguage"));

		industryCodeSearch(Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("industryCode", strTestCaseName));

		/*
		 * Select Producer
		 */
		GuidewireAutomate_Validation("Select Producer", PC_SelectProducer, "equals", "Select Producer");

		organizations(Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("organizations", strTestCaseName));
		select_SearchResult(Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("organizations", strTestCaseName));

		GuidewireAutomate_waitForElement(PolicyCenter_Resuables_PO.Update_Button, "visibilityOf", "");
		GuidewireAutomate_Validation("ProducerCode", CA_SP_ProducerCode, "equals", lhm_TestCase_Table_Data.get("CA_SP_ProducerCode"));

		GuidewireAutomate("Update_Button", PolicyCenter_Resuables_PO.Update_Button, "click", "click");
		GuidewireAutomate_Validation("Account Summary", Tab_Menu_Navigation.AccountSummary_Name, "contains", strAccountNickname);

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();

	}

	/*
	 * --------------------------------------------------------------
	 * searchAccountInformation
	 * --------------------------------------------------------------
	 */

	public static void pc_SearchAccountInformation(String strAccountName) throws Throwable {

		// // navigate to new account
		// GW_TabNavigation_CM_PC_BC_CC t = new
		// GW_TabNavigation_CM_PC_BC_CC(driver, oExtentTest);
		// //t.navigate_AccountTab_AccountNumberSearch("6800979174");
		// t.navigate_AccountTab_AccountNumberSearch("6800979174");

		GuidewireAutomate("Company Name", SA_CompanyName, "clearAndsendKeys", strAccountName);

		/*
		 * GuidewireAutomate("City", City, "sendKeys", "");
		 * GuidewireAutomate("county", County, "sendKeys", "");
		 * GuidewireAutomate("ZipCode", ZipCode, "sendKeys", "");
		 */
		PolicyCenter_Resuables.clickButton("Search");

	}

	public static void searchPerson() {
		// TODO Auto-generated method stub

	}

	public static void modifyPerson() {
		// TODO Auto-generated method stub

	}

	public static void withdrawAccount() {
		// TODO Auto-generated method stub

	}

	public static void organization_Modify() {
		// TODO Auto-generated method stub

	}

	public static void checkDuplicates() {
		// TODO Auto-generated method stub

	}

}
