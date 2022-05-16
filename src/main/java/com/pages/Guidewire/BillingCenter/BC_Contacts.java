package com.pages.Guidewire.BillingCenter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.aventstack.extentreports.ExtentTest;

public class BC_Contacts extends SeleniumWebDriver_Commands {

	private static By Contacts_Header     = By.xpath("//div[@id='AccountDetailContacts-AccountDetailContactsScreen-ttlBar']//div[ @class='gw-TitleBar--title']");
	private static By Contacts_EditButton = By.xpath("//div[@id='AccountDetailContacts-AccountDetailContactsScreen-Edit']//div[@role='button']");

	private static By Contacts_CI_Type  = By.xpath("//div[contains(@id,'AccountContactDetailDV-Type')]//div[@class='gw-value-readonly-wrapper']");
	private static By Contacts_CI_Name  = By.xpath("//div[contains(@id,'GlobalContactNameInputSet-Name')]//div[@class='gw-value-readonly-wrapper']");
	private static By Contacts_CI_Email = By.xpath("//div[contains(@id,'AccountContactDetailDV-Email')]//div[@class='gw-value-readonly-wrapper']");

	private static By Contats_CI_Address1  = By.xpath("//div[contains(@id,'GlobalAddressInputSet-AddressLine1')]//input[@type='text']");
	private static By Contacts_CI_Address2 = By.xpath("//div[contains(@id,'GlobalAddressInputSet-AddressLine2')]//input[@type='text']");
	private static By Contacts_CI_State    = By.xpath("//select[contains(@name,'GlobalAddressInputSet-State')]");

	public BC_Contacts(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	public static void C_ContactInfo_Verify() throws Throwable {
		lhm_TestCase_Table_Data = BC_Resuables.getData_BillingCenter("Contacts");
		GuidewireAutomate_Validation("Screen Header", Contacts_Header, "equals", "Contacts");

		GuidewireAutomate_Validation("CI Type", Contacts_CI_Type, "equals", lhm_TestCase_Table_Data.get("TD_Type"));
		GuidewireAutomate_Validation("CI Name", Contacts_CI_Name, "equals", lhm_TestCase_Table_Data.get("TD_Name"));
		GuidewireAutomate_Validation("CI_Email", Contacts_CI_Email, "contains", lhm_TestCase_Table_Data.get("TD_Email"));
	}

	public static void C_ContactInfo_Edit() throws Throwable {
		lhm_TestCase_Table_Data = BC_Resuables.getData_BillingCenter("Contacts");
		GuidewireAutomate_Validation("Screen Header", Contacts_Header, "equals", "Contacts");
		GuidewireAutomate("Edit Button", Contacts_EditButton, "clickAndwait", "click");

		GuidewireAutomate("CI Address1", Contats_CI_Address1, "clearANDsendKeys", lhm_TestCase_Table_Data.get("TD_Address1"));
		GuidewireAutomate("CI Address2", Contacts_CI_Address2, "clearANDsendKeys", lhm_TestCase_Table_Data.get("TD_Address2"));
		GuidewireAutomate("CI State", Contacts_CI_State, "selectByVisibleText", lhm_TestCase_Table_Data.get("TD_State"));

	}

}
