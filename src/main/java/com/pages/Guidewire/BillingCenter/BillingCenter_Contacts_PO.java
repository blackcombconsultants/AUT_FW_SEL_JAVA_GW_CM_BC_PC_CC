package com.pages.Guidewire.BillingCenter;

import org.openqa.selenium.By;

public interface BillingCenter_Contacts_PO {
    final By Contacts_Header=By.xpath("//div[@id='AccountDetailContacts-AccountDetailContactsScreen-ttlBar']//div[ @class='gw-TitleBar--title']");
	final By Contacts_EditButton=By.xpath("//div[@id='AccountDetailContacts-AccountDetailContactsScreen-Edit']//div[@role='button']");
   
	
	final By Contacts_CI_Type=By.xpath("//div[contains(@id,'AccountContactDetailDV-Type')]//div[@class='gw-value-readonly-wrapper']");
    final By Contacts_CI_Name=By.xpath("//div[contains(@id,'AccountContactDetailDV-NameInputSet-GlobalContactNameInputSet-Name')]//div[@class='gw-value-readonly-wrapper']");
	final By Contacts_CI_Email=By.xpath("//div[contains(@id,'AccountContactDetailDV-Email')]//div[@class='gw-value-readonly-wrapper']");

	final By Contats_CI_Address1=By.xpath("//div[contains(@id,'GlobalAddressInputSet-AddressLine1')]//input[@type='text']");
	final By Contacts_CI_Address2=By.xpath("//div[contains(@id,'GlobalAddressInputSet-AddressLine2')]//input[@type='text']");
	final By Contacts_CI_State=By.xpath("//select[contains(@name,'GlobalAddressInputSet-State')]");
	
}
