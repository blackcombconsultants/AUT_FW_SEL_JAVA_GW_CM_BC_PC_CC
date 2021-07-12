package com.pages.Guidewire.ClaimsCenter;

import org.openqa.selenium.By;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;

public interface ClaimCenter_AutoFirstandFinal_PO  {
	/*
	 * Headers
	 */
	
	final By AutoFirstandFinal_Header = By
			.xpath("//div[contains(@id,'AutoFirstAndFinalScreen-ttlBar')]//div[@class='gw-TitleBar--title']");
	final By NewAutoRepairShop_Header = By
			.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading']");
	/*
	 * AutoFirstandFinal
	 */
	final By AFF_Name = By.xpath("//select[contains(@name,'FirstAndFinalScreenInsuredClaimant')]");
	final By AFF_Damage_LossDescription = By.xpath("//textarea[contains(@name,'Description')]");
	final By Location = By.xpath("//select[contains(@name,'Address_Picker')]");
	final By State = By.xpath(
			"//div[contains(@id,'AutoFirstAndFinalScreen-22')]//select[contains(@name,'GlobalAddressInputSet-State')]");
	final By AFF_Claimant_Name = By.xpath("//select[contains(@name,'Claimant_Picker')]");
	final By AFF_Repair = By
			.xpath("//div[contains(@id,'RepairShop_PickerMenuIcon')]//div[@class='gw-action--expand-button']");
	final By AFF_NewAutobodyRepairShop = By.xpath(
			"//div[contains(@id,'RepairShop_PickerMenuIcon')]//div[contains(@id,'AutoRepairShop')]//div[@class='gw-label']");
	final By AFF_AutoRepairShop_Name = By.xpath("//input[contains(@name,'Name')]");
	final By AFF_AutoRepairShop_TaxID = By.xpath("//input[contains(@name,'ContactBasicsDV-V_EIN')]");

	final By AFF_AutoRepairShop_Address1 = By.xpath("//input[contains(@name,'AddressLine1')]");
	final By AFF_AutoRepairShop_City = By.xpath("//input[contains(@name,'City')]");
	final By AFF_AutoRepairShop_County = By.xpath("//input[contains(@name,'County')]");
	final By AFF_AutoRepairShop_State = By.xpath("//select[contains(@name,'GlobalAddressInputSet-State')]");
	final By AFF_AutoRepairShop_ZIPCode = By.xpath("//input[contains(@name,'PostalCode')]");

	final By AFF_Financials_Name = By.xpath("//select[contains(@name,'FNOLWizardCheckDV-Payee_Picker')]");
	final By AFF_Financials_PayeeType = By.xpath("//select[contains(@name,'FNOLWizardCheckDV-PayeeRole')]");

	final By AFF_Financials_Amount = By.xpath("//input[contains(@name,'CheckAmount')]");
	final By AFF_Financials_State = By
			.xpath("//div[contains(@id,'FNOLWizardCheckDV')]//select[contains(@name,'GlobalAddressInputSet-State')]");

	final By Finish_Button = By.xpath("//div[@id='FNOLWizard-Finish']/div[@role='button']");
	final By Update = By.xpath("//div[contains(@id,'CustomUpdateButton')]/div[@role='button']");
	
	/*
	 * SearchRepairShop
	 */
	final By SearchRepairShop=By.xpath("//div[contains(@id,'RepairShop_PickerMenuIcon')]//div[contains(@id,'MenuItem_Search')]//div[@class='gw-label']");
    final By SearchAddressBook_Header=By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading']");
    final By SearchAddressBook_Type=By.xpath("//select[contains(@name,'ContactSubtype')]");
    final By SearchAddressBook_Name=By.xpath("//input[contains(@name,'GlobalContactNameInputSet-Name')]");
    final By SearchAddressBook_Search=By.xpath(" //div[contains(@id,'SearchLinksInputSet-Search')]");
    
}
