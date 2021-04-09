package com.pages.Guidewire.PersonalAuto;

import org.openqa.selenium.By;

public interface PersonalAuto_Drivers_PO {

	final By NewSubmisison_Screen_PALOB_Button = By.xpath("//div[contains(@id,'-8-addSubmission')]");

	void dr_Add_NewPerson() throws Throwable;

	void dr_Add_FromAddressBook() throws Throwable;

	void dr_Add_ExistingDriver() throws Throwable;

	void dr_Edit_ExistingDriver() throws Throwable;

	void dr_Remove() throws Throwable;

	void dr_RetrieveMVR() throws Throwable;

}
