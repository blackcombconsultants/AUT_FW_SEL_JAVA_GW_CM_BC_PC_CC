package com.pages.Guidewire.ClaimsCenter;

import org.openqa.selenium.By;

public interface ClaimCenter_Contacts_PO {

	final By Contacts_Header=By.xpath("//div[@id='ClaimContacts-ClaimContactsScreen-ttlBar']//div[@class='gw-TitleBar--title']");

/*
 *  Contacts NewContact
 */
 final By NewContact=By.xpath("//div[contains(@id,'CreateNewContactButton')]//div[@role='button']");
 final By NC_V_Update=By.xpath("//div[contains(@id,'CustomUpdateButton')]//div[@role='button']");
 /*
  * NC Vendor AutobodyRepairShop
  */
 final By NC_V_AutobodyRepairShop=By.xpath("//div[contains(@id,'ClaimContacts_AutoRepairShop')]//div[@class='gw-label']");
 final By NC_V_ARS_Header=By.xpath("//div[@id='NewPartyInvolvedPopup-ContactDetailScreen-ttlBar']//div[@class='gw-TitleBar--title']");
 final By NC_V_Add=By.xpath("//div[contains(@id,'EditableClaimContactRolesLV_tb-Add')]//div[@role='button']");
 final By  NC_V_Role=By.xpath("//select[contains(@name,'EditableClaimContactRolesLV-0-Role')]");
 final By  NC_V_Comments=By.xpath("//input[contains(@name,'EditableClaimContactRolesLV-0-Comments')]");
 final By NC_V_ARS_Name=By.xpath("//input[contains(@name,'GlobalContactNameInputSet-Name')]");
/*
 * NC Vendor Primary Address
 */
 final By NC_V_PA_Address1=By.xpath("//input[contains(@name,'GlobalAddressInputSet-AddressLine1')]");
 final By NC_V_PA_State=By.xpath("//select[contains(@name,'GlobalAddressInputSet-State')]");
 /*
  * Tax Info
  */
 final By NC_V_TI_TaxID=By.xpath("//input[contains(@name,'ContactBasicsDV-V_EIN')]");
 
 /*
  * DuplicateContactFound
  */
 
 final By DuplicateContactFound_Header=By.xpath("//div[@id='DuplicateContactPopup-ttlBar']//div[@class='gw-TitleBar--title']");
 final By DuplicateContactFound_ErrorMessage=By.xpath("//div[@id='DuplicateContactPopup-matchMessage']//div[@class='gw-VerbatimWidget--inner']");
}
