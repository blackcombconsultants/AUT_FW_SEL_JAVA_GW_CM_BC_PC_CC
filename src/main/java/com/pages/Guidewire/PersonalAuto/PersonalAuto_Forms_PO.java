package com.pages.Guidewire.PersonalAuto;

import org.openqa.selenium.By;

public interface PersonalAuto_Forms_PO {

	final By Forms_Header = By.xpath("//div[@id='SubmissionWizard-FormsScreen-ttlBar']/div[1]");
	final By Forms_Validate = By.xpath(
			"//tr[contains(@id,'SubmissionWizard-FormsScreen-FormsDV-FormsLV-0-0')]//td[1]//div[@class='gw-value-readonly-wrapper']");
	final By Description_Validate = By.xpath(
			"//tr[contains(@id,'SubmissionWizard-FormsScreen-FormsDV-FormsLV-0-0')]//td[2]//div[@class='gw-value-readonly-wrapper']");
	final By Endorsement_Validate = By.xpath(
			"//tr[contains(@id,'SubmissionWizard-FormsScreen-FormsDV-FormsLV-0-0')]//td[3]//div[@class='gw-value-readonly-wrapper']");
	final By Replacement_Validate = By.xpath(
			"//tr[contains(@id,'SubmissionWizard-FormsScreen-FormsDV-FormsLV-0-0')]//td[4]//div[@class='gw-value-readonly-wrapper']");

	/*
	 * 
	 * Modules
	 * 
	 * void pa_forms() throws Throwable;
	 * 
	 * void forms_validate(String testtingType) throws Throwable;
	 * 
	 * void description_validate(String testtingType) throws Throwable;
	 */
}
