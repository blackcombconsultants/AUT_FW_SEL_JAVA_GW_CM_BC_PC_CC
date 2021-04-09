package com.pages.Guidewire.PersonalAuto;

import org.openqa.selenium.By;

public interface PersonalAuto_Coverages_PO {

	final By NewSubmisison_Screen_PALOB_Button = By.xpath("//div[contains(@id,'-8-addSubmission')]");

	void pac_CoveragesAppliedtoallvehicles() throws Throwable;

	void ve_AssaignDriver() throws Throwable;

	void ve_AdditionalInterest_Add_NewCompany() throws Throwable;

	void ve_AdditionalInterest_Add_NewPerson() throws Throwable;

	void ve_AdditionalInterest_Add_FromAddressBook() throws Throwable;

	void ve_AdditionalInterest_Add_OtherContacts() throws Throwable;

	void ve_RemoveVehicles() throws Throwable;

	void ve_Garage_NewLocation() throws Throwable;

	void ve_Garage_EditLocation() throws Throwable;

}
