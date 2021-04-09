package com.pages.Guidewire.PolicyCenter;

import org.openqa.selenium.By;

public interface GW_PC_PolicyInfo_PO {

	final By PolicyInfo_Header = By.xpath("div[contains(@id,'Screen-ttlBar')]//div[text()='New Submissions']");

	void pi_primaryInsured_NewPerson() throws Throwable;

	void pi_primaryInsured_FromAddressBook() throws Throwable;

	void pi_primaryInsured_ExistingContact() throws Throwable;

	void pi_primaryNamedInsured_Edit() throws Throwable;

	void pi_PolicyAddress_NewAddress() throws Throwable;

	void pi_PolicyAddress_EditCurrentAddress() throws Throwable;

	void pi_OfficialID() throws Throwable;

	void pi_SecondaryInsured_NewPerson() throws Throwable;

	void pi_SecondaryInsured_FromAddressBook() throws Throwable;

	void pi_SecondaryInsured_ExistingContact() throws Throwable;

	void pi_AdditionalNamedInsured_Add_NewCompany() throws Throwable;

	void pi_AdditionalNamedInsured_Add_NewPerson() throws Throwable;

	void pi_AdditionalNamedInsured_Add_FromAddresssBook() throws Throwable;

	void pi_AdditionalNamedInsured_Edit() throws Throwable;

	void pi_AdditionalNamedInsured_Remove() throws Throwable;

	void pi_PolicyDetails() throws Throwable;

	void pi_AffinityGroup() throws Throwable;

	void pi_ProducerOfRecord() throws Throwable;

	void pi_UnderWritingCompany() throws Throwable;

}
