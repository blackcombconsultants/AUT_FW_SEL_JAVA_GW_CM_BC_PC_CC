package com.pages.Guidewire.PersonalAuto;

import org.openqa.selenium.By;

public interface PersonalAuto_Quote_PO {

	final By NewSubmisison_Screen_PALOB_Button = By.xpath("//div[contains(@id,'-8-addSubmission')]");

	void pr_QuoteDetails() throws Throwable;

	void pr_PolicyPremium() throws Throwable;

	void pr_VehicleCoverage() throws Throwable;

}
