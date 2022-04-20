package com.pages.Guidewire.ClaimsCenter;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class CC_PartiesInvolved extends SeleniumWebDriver_Commands {
	public CC_PartiesInvolved(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}
	private static By Summary_Header            = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading']");
	private static By RelatedtoContacts_Tab     = By.xpath("//div[contains(@id,'RelatedContactsCardTab')]//div[@role='tab']");
	private static By RelatedtoContacts_Name    = By.xpath("//select[contains(@name,'0-Contact')]");
	private static By RelatedtoContacts         = By.xpath("//select[contains(@name,'0-Rel')]");
	private static By RelatedtoContacts_1Name   = By.xpath("//select[contains(@name,'1-Contact')]");
	private static By RelatedtoContacts1        = By.xpath("//select[contains(@name,'1-Rel')]");
	private static By Edit_Button               = By.xpath("//div[contains(@id,'Edit')]//div[@role='button']");
	private static By RelatedContacts_AddButton = By.xpath("//div[contains(@id,'RelatedContactsLV_tb-Add')]//div[@role='button']");

	private static By NewContact_Button         = By.xpath("//div[contains(@id,'ClaimContacts_CreateNewContactButton')]//div[@role='button']");
	private static By NewContact_Vendor         = By.xpath("//div[contains(@id,'ClaimContacts_NewVendor')]//div[@role='menuitem']//div[@class='gw-label' and text()='Vendor']");
	private static By NewContact_Vendor_Company = By.xpath("//div[contains(@id,'ClaimContacts_CompanyVendor')]//div[@role='menuitem']//div[@class='gw-label' and text()='Vendor (Company)']");
	private static By VendorCompany_Header      = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading']");
	private static By Company_Header            = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading']");
	private static By VendorSubType             = By.xpath("//div[@class='gw-label' and text()='Vendor']");

	private static By NewContact_Legal                                  = By.xpath("//div[contains(@id,'ClaimContacts_NewLegal')]//div[@class='gw-label' and text()='Legal']");
	private static By NewContact_LawFirm                                = By.xpath("//div[contains(@id,'ClaimContacts_LawFirm')]//div[@class='gw-label' and text()='Law Firm']");
	private static By NewLawFirm_Header                                 = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading']");
	private static By Add_Button                                        = By.xpath("//div[contains(@id,'EditableClaimContactRolesLV_tb-Add')]//div[@role='button']");
	private static By NewLawFirm_Role                                   = By.xpath("//select[contains(@name,'0-Role')]");
	private static By NewLawFirm_TaxID                                  = By.xpath("//div[contains(@id,'V_EIN_Input')]");
	private static By NewLawFirm_Role1                                  = By.xpath("//select[contains(@name,'1-Role')]");
	private static By NewLawFirm_Name                                   = By.xpath("//input[contains(@name,'GlobalContactNameInputSet-Name')]");
	private static By Update_Button                                     = By.xpath("//div[contains(@id,'CustomUpdateButton')]//div[@role='button']");
	private static By NewContact_VendorCompany_W9Received               = By.xpath("//input[contains(@id,'W9received_0')]");
	private static By NewContact_VendorCompany_W9Classification         = By.xpath("//div[contains(@id,'W9Classification_Ext_Input')]");
	private static By NewContact_Vendor_W9Valid                         = By.xpath("//div[contains(@id,'W9ValidTo_Input')]//div[@class='gw-label']");
	private static By NewContact_VendorCompany_W9ClassificationTypelist = By.xpath("//select[contains(@name,'W9Classification_Ext')]");
	private static By NewContact_Company                                = By.xpath("//div[contains(@id,'ClaimContacts_Company')]//div[@role='menuitem']//div[@class='gw-label' and text()='Company']");
	private static By Company_CheckDublicates_Button                    = By.xpath("//div[contains(@id,'CheckDuplicatesButton')]//div[@role='button']");

	private static By NewContact_Country = By.xpath("//select[contains(@name,'GlobalAddressInputSet-Country')]");
	private static By ERROR_Msg          = By.xpath("//div[@id='NewPartyInvolvedPopup-ContactDetailScreen-_msgs-0-0']");

	private static By CompanyDropdown   = By.xpath("//div[contains(@id,'ClaimContacts_CreateNewContactButton-ClaimContacts_Company')]//div[@class='gw-label']");
	private static By Contact_AddButton = By.xpath("//div[contains(@id,'EditableClaimContactRolesLV_tb-Add')]//div[@role='button']");
	private static By Contact_Roles     = By.xpath("//select[contains(@name,'EditableClaimContactRolesLV-0-Role')]");
	private static By Contact_Name      = By.xpath("//input[contains(@name,'GlobalContactNameInputSet-Name')]");
	private static By PersonDropdown    = By.xpath("//div[contains(@id,'ClaimContacts_CreateNewContactButton-ClaimContacts_NewPerson')]//div[@class='gw-label']");
	private static By Contact_LastName  = By.xpath("//input[contains(@name,'GlobalPersonNameInputSet-LastName')]");
	private static By LegalDropdown     = By.xpath("//div[contains(@id,'ClaimContacts_CreateNewContactButton-ClaimContacts_NewLegal')]//div[@class='gw-label' and  text()='Legal']");
	public static void Validate_ContactHeader() throws Throwable {

		try {
			GuidewireAutomate_Validation("Screen Header", Summary_Header, "contains", "Contacts");

		} catch (NoSuchElementException e) {

			e.printStackTrace();
			throw e;
		}
	}
	// Author:Misba
	// Date:17/01/2022
	// Description:The "Tax Info section and one Input Divider bar" should be hidden/Not visable.
	public static void Vendor_TaxInfoandOneDividerishidden() throws Throwable {

		try {
			GuidewireAutomate("New Contact Button", NewContact_Button, "clickAndwait", "click");
			GuidewireAutomate("New Contact Vendor", NewContact_Vendor, "moveToElement", "moveToElement");
			GuidewireAutomate("New Contact Vendor (Company)", NewContact_Vendor_Company, "clickAndwait", "click");
			GuidewireAutomate_Validation("Screen Header", VendorCompany_Header, "contains", "New Vendor (Company)");

		} catch (NoSuchElementException e) {

			e.printStackTrace();
			throw e;
		}
	}
	// Author:Misba
	// Date:17/01/2022
	// Description:The "Tax Info section and one Input Divider bar" should be hidden/Not visable.
	public static void NewContact_Company_ExternalSubrogationFirmisRenamedToSubrogationFirm() throws Throwable {

		try {
			lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("Contacts");

			GuidewireAutomate("New Contact Button", NewContact_Button, "clickAndwait", "click");
			GuidewireAutomate("New Contact Company", NewContact_Company, "clickAndwait", "click");
			Thread.sleep(2000);
			GuidewireAutomate_Validation("Screen Header", Company_Header, "contains", "New Company");
			GuidewireAutomate("Add Button", Add_Button, "clickAndwait", "click");
			GuidewireAutomate("External Subrogation Firm is Renamed to Subrogation Firm", NewLawFirm_Role, "selectByVisibleText", lhm_TestCase_Table_Data.get("NewLawFirm_Role"));

		} catch (NoSuchElementException e) {

			e.printStackTrace();
			throw e;
		}
	}
	public static void NewContact_Company_PossibleDublicateClaimValidateErrorMessage() throws Throwable {

		try {
			lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("Contacts");

			GuidewireAutomate("New Contact Button", NewContact_Button, "clickAndwait", "click");
			GuidewireAutomate("New Contact Company", NewContact_Company, "clickAndwait", "click");
			Thread.sleep(2000);
			GuidewireAutomate_Validation("Screen Header", Company_Header, "contains", "New Company");
			GuidewireAutomate("Add Button", Add_Button, "clickAndwait", "click");
			GuidewireAutomate("Company Role", NewLawFirm_Role, "selectByVisibleText", lhm_TestCase_Table_Data.get("NewLawFirm_Role"));
			getStaleElement("Company Role", NewLawFirm_Role);
			GuidewireAutomate("New Company Name", NewLawFirm_Name, "clearANDsendKeys", lhm_TestCase_Table_Data.get("Name"));
			GuidewireAutomate("Company Country", NewContact_Country, "selectByVisibleText", lhm_TestCase_Table_Data.get("Country"));
			GuidewireAutomate("Update Button", Update_Button, "clickAndwait", "click");
			GuidewireAutomate("New Contact Button", NewContact_Button, "clickAndwait", "click");
			GuidewireAutomate("New Contact Company", NewContact_Company, "clickAndwait", "click");
			Thread.sleep(2000);
			GuidewireAutomate_Validation("Screen Header", Company_Header, "contains", "New Company");
			GuidewireAutomate("Add Button", Add_Button, "clickAndwait", "click");
			GuidewireAutomate("Company Role", NewLawFirm_Role, "selectByVisibleText", lhm_TestCase_Table_Data.get("NewLawFirm_Role1"));
			getStaleElement("Company Role", NewLawFirm_Role);
			GuidewireAutomate("New Company Name", NewLawFirm_Name, "clearANDsendKeys", lhm_TestCase_Table_Data.get("Name1"));
			GuidewireAutomate("Company Country", NewContact_Country, "selectByVisibleText", lhm_TestCase_Table_Data.get("Country1"));
			GuidewireAutomate("Check Duplicates Button", Company_CheckDublicates_Button, "clickAndwait", "click");

			GuidewireAutomate_Validation("validate possible duplicate claim", ERROR_Msg, "contains", "Risk - Required Field Missing: Please supply Name and one");

		} catch (NoSuchElementException e) {

			e.printStackTrace();
			throw e;
		}
	}
	// Author:Misba
	// Date:17/01/2022
	// Description:W9 Classification is Added Below W9 Valid below Options
	public static void Vendor_W9ClassificationisAddedBelowW9ValidbelowOptions() throws Throwable {

		try {
			lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("Contacts");

			GuidewireAutomate("New Contact Button", NewContact_Button, "clickAndwait", "click");
			GuidewireAutomate("New Contact Vendor", NewContact_Vendor, "moveToElement", "moveToElement");
			GuidewireAutomate("New Contact Vendor (Company)", NewContact_Vendor_Company, "clickAndwait", "click");
			Thread.sleep(2000);
			GuidewireAutomate_Validation("Screen Header", VendorCompany_Header, "contains", "New Vendor (Company)");
			GuidewireAutomate_Validation("W9 Valid", NewContact_Vendor_W9Valid, "contains", "W-9 Valid to");
			GuidewireAutomate_Validation("W9 Classification is Below W9 Valid", NewContact_VendorCompany_W9ClassificationTypelist, "getOptionscontains", lhm_TestCase_Table_Data.get("W9ClassificationTypelist"));

		} catch (NoSuchElementException e) {

			e.printStackTrace();
			throw e;
		}
	}
	// Author:Misba
	// Date:17/01/2022
	// Description:Verify the new field of 'W9 Classification' as mandatory if W9 Received? field = Yes, on the contact details screen.
	public static void Vendor_W9ClassificationisMandatory() throws Throwable {

		try {
			GuidewireAutomate("New Contact Button", NewContact_Button, "clickAndwait", "click");
			GuidewireAutomate("New Contact Vendor", NewContact_Vendor, "moveToElement", "moveToElement");
			GuidewireAutomate("New Contact Vendor (Company)", NewContact_Vendor_Company, "clickAndwait", "click");
			Thread.sleep(2000);
			GuidewireAutomate_Validation("Screen Header", VendorCompany_Header, "contains", "New Vendor (Company)");
			GuidewireAutomate(" W9 Received", NewContact_VendorCompany_W9Received, "clickAndwait", "click");
			Thread.sleep(1000);
			GuidewireAutomate_Validation("W9 Classification mandatory ", NewContact_VendorCompany_W9Classification, "contains", "W-9 Classification");

		} catch (NoSuchElementException e) {

			e.printStackTrace();
			throw e;
		}
	}
	public static void VendorCompany_TaxInfoisHidden() throws Throwable {

		try {

			By TaxInfo = By.xpath("//div[@class='gw-label' and text()='TaxInfo']");

			VerifyElementNotExist("Tax Info", TaxInfo);

		} catch (NoSuchElementException e) {

			e.printStackTrace();
			throw e;
		}
	}
	public static void VendorCompany_OneDividerisHidden() throws Throwable {

		try {

			By OneDivider = By.xpath("//div[@class='gw-label' and text()='OneDivider']");

			VerifyElementNotExist("One Divider", OneDivider);

		} catch (NoSuchElementException e) {

			e.printStackTrace();
			throw e;
		}
	}
	// Author:Misba
	// Date:17/01/2022
	// Description:To verify whether 'DBA or Add'l Address' and 'Legal Name and Address' values are added at the top of the 'Relation to Contact'
	// typelist in Contacts screen.
	public static void Contacts_DBAandLegaladdedinRelationToContacts() throws Throwable {

		try {
			lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("Contacts");
			GuidewireAutomate("Related to Contacts Tab", RelatedtoContacts_Tab, "clickAndwait", "click");
			getStaleElement("Related to Contacts Tab", RelatedtoContacts_Tab);
			Thread.sleep(1000);
			GuidewireAutomate("Edit Button", Edit_Button, "clickAndwait", "click");
			Thread.sleep(1000);
			GuidewireAutomate("Add Button", RelatedContacts_AddButton, "clickAndwait", "click");
			// GuidewireAutomate("Related to Contacts Name", RelatedtoContacts_Name, "selectByVisibleText", lhm_TestCase_Table_Data.get("RC_Name"));
			GuidewireAutomate_Validation("Related to Contacts", RelatedtoContacts, "getOptionscontains", lhm_TestCase_Table_Data.get("RelatedtoContacts"));
			// GuidewireAutomate("Related to Contacts Name", RelatedtoContacts_1Name, "selectByVisibleText", lhm_TestCase_Table_Data.get("RC_Name1"));
			// GuidewireAutomate("Related to Contacts", RelatedtoContacts1, "selectByVisibleText", lhm_TestCase_Table_Data.get("RelatedtoContacts1"));
		} catch (NoSuchElementException e) {

			e.printStackTrace();
			throw e;
		}
	}
	// Author:Misba
	// Date:17/01/2022
	// Description:To verify whether the Tax ID field is not mandatory when it's a Plaintiff Law Firm
	public static void Contacts_NewLawFirm_TaxIDIsnotMandatoryforPlatiffLaw() throws Throwable {

		try {
			lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("Contacts");

			GuidewireAutomate("New Contact Button", NewContact_Button, "clickAndwait", "click");
			GuidewireAutomate("New Contact Legal", NewContact_Legal, "moveToElement", "moveToElement");
			GuidewireAutomate("New Contact Law Firm", NewContact_LawFirm, "clickAndwait", "click");
			Thread.sleep(2000);
			GuidewireAutomate_Validation("Screen Header", NewLawFirm_Header, "contains", "New Law Firm");
			GuidewireAutomate("Add Button", Add_Button, "clickAndwait", "click");
			GuidewireAutomate("New Law Firm Role", NewLawFirm_Role, "selectByVisibleText", lhm_TestCase_Table_Data.get("NewLawFirm_Role"));
			getStaleElement("New Law Firm Role", NewLawFirm_Role);
			GuidewireAutomate_Validation("Tax Id is not Mandatory for platiff Law", NewLawFirm_TaxID, "contains", "Tax ID (EIN)");

		} catch (NoSuchElementException e) {

			e.printStackTrace();
			throw e;
		}
	}
	// Author:Misba
	// Date:17/01/2022
	// Description:To verify whether the new vendor is not automatically linked to Address Book/Contact manager when it's a Plaintiff Law Firm
	// (Subtype = Law Firm and Role = Primary Plaintiff Law Firm or Secondary Plaintiff Law Firm)

	public static void Contact_NewLaw_vendorisnotautomaticallylinkedtoAddressBookContactmanager() throws Throwable {

		try {
			lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("Contacts");

			GuidewireAutomate("New Contact Button", NewContact_Button, "clickAndwait", "click");
			GuidewireAutomate("New Contact Legal", NewContact_Legal, "moveToElement", "moveToElement");
			GuidewireAutomate("New Contact Law Firm", NewContact_LawFirm, "clickAndwait", "click");
			Thread.sleep(2000);
			GuidewireAutomate_Validation("Screen Header", NewLawFirm_Header, "contains", "New Law Firm");
			GuidewireAutomate("Add Button", Add_Button, "clickAndwait", "click");
			GuidewireAutomate("New Law Firm Role", NewLawFirm_Role, "selectByVisibleText", lhm_TestCase_Table_Data.get("NewLawFirm_Role"));
			GuidewireAutomate("Add Button", Add_Button, "clickAndwait", "click");
			GuidewireAutomate("New Law Firm Role", NewLawFirm_Role1, "selectByVisibleText", lhm_TestCase_Table_Data.get("NewLawFirm_Role1"));
			getStaleElement("New Law Firm Role", NewLawFirm_Role1);
			GuidewireAutomate("New Law Firm Name", NewLawFirm_Name, "clearANDsendKeys", lhm_TestCase_Table_Data.get("NewLawFirm_Name"));
			GuidewireAutomate("Update Button", Update_Button, "clickAndwait", "click");

		} catch (NoSuchElementException e) {

			e.printStackTrace();
			throw e;
		}
	}
	// Author:Misba
	// Date:17/01/2022
	// Description:Update Typelist for contact roles
	public static void NewContact_Company_updateTypelistContactRoles() throws Throwable {

		try {
			lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("Contacts");

			GuidewireAutomate("New Contact Button", NewContact_Button, "clickAndwait", "click");
			GuidewireAutomate("New Contact Company", NewContact_Company, "clickAndwait", "click");
			Thread.sleep(2000);
			GuidewireAutomate_Validation("Screen Header", Company_Header, "contains", "New Company");
			GuidewireAutomate("Add Button", Add_Button, "clickAndwait", "click");
			GuidewireAutomate_Validation("Contact Roles", NewLawFirm_Role, "getOptionscontains", lhm_TestCase_Table_Data.get("Role"));

		} catch (NoSuchElementException e) {

			e.printStackTrace();
			throw e;
		}
	}
	/*
	 * Owner : Rahul Dixit Date : 14/02/2022
	 */
	public static void CreateNewContactForPlantiffLawFirm() throws Throwable {
		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("Contacts");

		try {

			GuidewireAutomate("New Contact Button", NewContact_Button, "clickAndwait", "clickAndwait");
			GuidewireAutomate("Company DropDown", CompanyDropdown, "clickAndwait", "clickAndwait");
			GuidewireAutomate("Contact Add Button", Contact_AddButton, "clickAndwait", "clickAndwait");
			GuidewireAutomate("Contact_Roles", Contact_Roles, "selectByVisibleText", lhm_TestCase_Table_Data.get("Role"));
			getStaleElement("Contact_Roles", Contact_Roles);
			GuidewireAutomate("Name", Contact_Name, "clearANDsendKeys", lhm_TestCase_Table_Data.get("Name"));
		} catch (NoSuchElementException e) {

			e.printStackTrace();
			throw e;
		}
	}
	/*
	 * Owner : Rahul Dixit Date : 14/02/2022
	 */
	public static void CreateNewContactForPlantiffAttorney() throws Throwable {
		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("Contacts");

		try {

			GuidewireAutomate("New Contact Button", NewContact_Button, "clickAndwait", "clickAndwait");
			GuidewireAutomate("Person DropDown", PersonDropdown, "clickAndwait", "clickAndwait");
			GuidewireAutomate("Contact Add Button", Contact_AddButton, "clickAndwait", "clickAndwait");
			GuidewireAutomate("Contact_Roles", Contact_Roles, "selectByVisibleText", lhm_TestCase_Table_Data.get("Role"));
			getStaleElement("Contact_Roles", Contact_Roles);
			GuidewireAutomate("Name", Contact_LastName, "clearANDsendKeys", lhm_TestCase_Table_Data.get("LastName"));
		} catch (NoSuchElementException e) {

			e.printStackTrace();
			throw e;
		}
	}
	/*
	 * Owner : Rahul Dixit Date : 14/02/2022
	 */
	public static void CreateNewContactForDefenceLawFirm() throws Throwable {
		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("Contacts");

		try {

			GuidewireAutomate("New Contact Button", NewContact_Button, "clickAndwait", "clickAndwait");
			GuidewireAutomate(" Legal dropdown ", LegalDropdown, "moveToElement", "moveToElement");
			GuidewireAutomate("Law Firm Drop down", NewContact_LawFirm, "clickAndwait", "clickAndwait");
			GuidewireAutomate("Contact Add Button", Contact_AddButton, "clickAndwait", "clickAndwait");
			GuidewireAutomate("Contact_Roles", Contact_Roles, "selectByVisibleText", lhm_TestCase_Table_Data.get("Role"));
			getStaleElement("Contact_Roles", Contact_Roles);
			GuidewireAutomate("Name", Contact_Name, "clearANDsendKeys", lhm_TestCase_Table_Data.get("Name"));
		} catch (NoSuchElementException e) {

			e.printStackTrace();
			throw e;
		}
	}

	// Autor:Misba
	// Date:09/3/2022
	public static void UserisNotAbletoseeContactSubtyepinVendor() throws Throwable {

		try {
			GuidewireAutomate("New Contact Button", NewContact_Button, "clickAndwait", "click");
			GuidewireAutomate("New Contact Vendor", NewContact_Vendor, "moveToElement", "moveToElement");
			String TypeList1 = "Autobody Repair Shop ";
			String TypeList2 = " Auto Towing Agency";
			String TypeList3 = "Doctor";
			String TypeList4 = "Medical Care Organization";
			String SubType   = getText_Element(VendorSubType);
			if (SubType.equals(TypeList1) && SubType.equals(TypeList2) && SubType.equals(TypeList3) && SubType.equals(TypeList4)) {
				oExtentTest.log(Status.FAIL, "Contacts Under Subtype Displayed  " + TypeList1 + ", " + TypeList2 + ", " + TypeList3 + "," + TypeList4);
			} else {
				oExtentTest.log(Status.PASS, " Contacts Under Subtype Vendor Not Displayed  " + TypeList1 + ", " + TypeList2 + ", " + TypeList3 + "," + TypeList4);
			}

		} catch (NoSuchElementException e) {

			e.printStackTrace();
			throw e;
		}
	}
	// Autor:Misba
	// Date:09/3/2022
	public static void UserisNotAbletoseeContactAttorneyOptionsinLegal() throws Throwable {

		try {
			GuidewireAutomate("New Contact Button", NewContact_Button, "clickAndwait", "click");
			GuidewireAutomate("New Contact Legal", NewContact_Legal, "moveToElement", "moveToElement");

			By Attorney = By.xpath("//div[@class='gw-label' and text()='Attorney']");

			VerifyElementNotExist("Attorney under Legal", Attorney);
		} catch (NoSuchElementException e) {

			e.printStackTrace();
			throw e;
		}
	}

}
