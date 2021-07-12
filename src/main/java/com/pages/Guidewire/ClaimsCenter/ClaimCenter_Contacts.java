package com.pages.Guidewire.ClaimsCenter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;

public class ClaimCenter_Contacts extends SeleniumWebDriver_Commands implements ClaimCenter_Contacts_PO {

	public ClaimCenter_Contacts(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
		// TODO Auto-generated constructor stub
	}

	public static void New_Contact() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("contacts", strTestCaseName);
		GuidewireAutomate_Validation("Screen Header", Contacts_Header, "equals", "Contacts");
		GuidewireAutomate("NewContact", NewContact, "click", "NA");

		String strDynamicxpath = lhm_TestCase_Table_Data.get("NewContact");

		By NewContact_Person  = By.xpath("//div[contains(@id,'ClaimContacts_CreateNewContactButton-ClaimContacts')]//div[@class='gw-label' and text()='" + strDynamicxpath + "']");
		By NewContact_Vendor  = By.xpath("//div[contains(@id,'ClaimContacts_CreateNewContactButton-ClaimContacts')]//div[@class='gw-label' and text()='" + strDynamicxpath + "']");
		By NewContact_Company = By.xpath("//div[contains(@id,'ClaimContacts_CreateNewContactButton-ClaimContacts')]//div[@class='gw-label' and text()='" + strDynamicxpath + "']");
		By NewContact_Legal   = By.xpath("//div[contains(@id,'ClaimContacts_CreateNewContactButton-ClaimContacts')]//div[@class='gw-label' and text()='" + strDynamicxpath + "']");

		GuidewireAutomate("NewContact Person", NewContact_Vendor, "moveToElement", "NA");
		GuidewireAutomate("Autobody Repair Shop", NC_V_AutobodyRepairShop, "click", "NA");
		GuidewireAutomate_Validation("Screen Header", NC_V_ARS_Header, "equals", "New Auto Repair Shop");
		GuidewireAutomate("Add", NC_V_Add, "click", "NA");
		GuidewireAutomate("Role", NC_V_Role, "selectByVisibleText", lhm_TestCase_Table_Data.get("Role"));
		GuidewireAutomate("Comments", NC_V_Comments, "clearANDsendKeys", lhm_TestCase_Table_Data.get("Comments"));

		String strFirstName = lhm_TestCase_Table_Data.get("Name");
		if (strFirstName.equalsIgnoreCase("Random")) {
			strFirstName = getRandomAlphabetic(9);
		}
		GuidewireAutomate("Name", NC_V_ARS_Name, "clearANDsendKeys", strFirstName);
		GuidewireAutomate("Address1", NC_V_PA_Address1, "clearANDsendKeys", lhm_TestCase_Table_Data.get("Address1"));
		GuidewireAutomate("State", NC_V_PA_State, "selectByVisibleText", lhm_TestCase_Table_Data.get("State"));

		GuidewireAutomate("Comments", NC_V_TI_TaxID, "clearANDsendKeys", lhm_TestCase_Table_Data.get("TaxID"));

		GuidewireAutomate("Update", NC_V_Update, "click", "NA");

	}

	public static void NewContact_DuplicateContactFound_Verify() throws Throwable {

		GuidewireAutomate_Validation("Screen Header", DuplicateContactFound_Header, "equals", "Duplicate Contact Found");

		GuidewireAutomate_Validation("Error Message", DuplicateContactFound_ErrorMessage, "contains", "Contact Manager contains entries that matches your new contact");
        GuidewireAutomate("Cancel", Cancel_Button, "click", "NA");

	}

}
