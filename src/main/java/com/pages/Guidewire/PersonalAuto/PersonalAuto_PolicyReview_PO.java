package com.pages.Guidewire.PersonalAuto;

import org.openqa.selenium.By;

public interface PersonalAuto_PolicyReview_PO {

	final By NewSubmisison_Screen_PALOB_Button = By.xpath("//div[contains(@id,'-8-addSubmission')]");

	void pr_policyDetails() throws Throwable;

	void pr_Coverages() throws Throwable;

	void pr_VehiclesLevelCoverages() throws Throwable;


}
