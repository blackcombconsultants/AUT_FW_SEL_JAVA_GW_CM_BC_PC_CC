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
	
	public static void New_Contact() throws Throwable
	{
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("contacts",
				strTestCaseName);
		GuidewireAutomate_Validation("Screen Header",Contacts_Header, "equals", "Contacts");
		GuidewireAutomate("NewContact", NewContact, "click", "NA");

		String strDynamicxpath=lhm_TestCase_Table_Data.get("TD_NewContact");
		
		final By NewContact_Person=By.xpath("//div[contains(@id,'ClaimContacts_CreateNewContactButton-ClaimContacts')]//div[@class='gw-label' and text()='"+strDynamicxpath+"']");
		final By NewContact_Vendor=By.xpath("//div[contains(@id,'ClaimContacts_CreateNewContactButton-ClaimContacts')]//div[@class='gw-label' and text()='"+strDynamicxpath+"']");
		final By NewContact_Company=By.xpath("//div[contains(@id,'ClaimContacts_CreateNewContactButton-ClaimContacts')]//div[@class='gw-label' and text()='"+strDynamicxpath+"']");
		final By NewContact_Legal=By.xpath("//div[contains(@id,'ClaimContacts_CreateNewContactButton-ClaimContacts')]//div[@class='gw-label' and text()='"+strDynamicxpath+"']");
		GuidewireAutomate("NewContact Person", NewContact_Vendor, "moveToElement", "NA");
		GuidewireAutomate("Autobody Repair Shop", NC_V_AutobodyRepairShop, "click", "NA");
		GuidewireAutomate_Validation("Screen Header",NC_V_ARS_Header, "equals", "New Auto Repair Shop");
		GuidewireAutomate("Add", NC_V_Add, "click", "NA");
		GuidewireAutomate("Role", NC_V_Role, "selectByVisibleText", lhm_TestCase_Table_Data.get("TD_Role"));
		GuidewireAutomate("Comments", NC_V_Comments, "clearANDsendKeys", lhm_TestCase_Table_Data.get("TD_Comments"));
		GuidewireAutomate("Name", NC_V_ARS_Name, "clearANDsendKeys", lhm_TestCase_Table_Data.get("TD_Name"));
		GuidewireAutomate("Address1", NC_V_PA_Address1, "clearANDsendKeys", lhm_TestCase_Table_Data.get("TD_Address1"));
		GuidewireAutomate("State", NC_V_PA_State, "selectByVisibleText", lhm_TestCase_Table_Data.get("TD_State"));
		GuidewireAutomate("Comments", NC_V_TI_TaxID, "clearANDsendKeys", lhm_TestCase_Table_Data.get("TD_TaxID"));

		GuidewireAutomate("Update", NC_V_Update, "click", "NA");


	}

}
