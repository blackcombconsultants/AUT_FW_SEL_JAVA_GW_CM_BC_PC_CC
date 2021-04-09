package com.pages.Guidewire.PersonalAuto;

import org.openqa.selenium.By;

public interface PersonalAuto_NewSubmission_ReusablePO {

	final By NewSubmisison_Screen_PALOB_Button = By.xpath("//div[contains(@id,'-8-addSubmission')]");

	final By LobPersonalAuto = By.xpath(
			"//div[text()='Personal Auto']/ancestor::td[contains(@id,'Name_Cell')]/preceding-sibling::td//div[contains(@id,'ProductSelection') and text()='Select']");

	final By Screen_Header = By.xpath("//div[@class='gw-TitleBar--title']");
	
	final By OfferingSelection = By
			.xpath("//select[@name='SubmissionWizard-OfferingScreen-OfferingSelection']");
	
	
	final By Qualification_Screen_Header = By.xpath("div[class='gw-TitleBar--title']");
	final By IstApplicantCurrentlyInsured = By.xpath("//input[contains(@id,'QuestionSetLV-1-QuestionModalInput-BooleanRadioInput_NoPost_1')]");
	final By IsApplicantLicenseCurrently_suspended_canceled_Rrevoked = By.xpath("//input[contains(@id,'QuestionSetLV-1-QuestionModalInput-BooleanRadioInput_NoPost_1')]");
	final By Has_the_applicants_license_ever_been_canceled_suspended_or_revoked = By.xpath("//input[contains(@id,'QuestionSetLV-2-QuestionModalInput-BooleanRadioInput_NoPost_1')]");
	final By Anydriverswithconvictionsformovingtrafficviolationswithinthepast3years = By.xpath("//input[contains(@id,'QuestionSetLV-3-QuestionModalInput-BooleanRadioInput_1')]");
	final By Hasanypolicyorcoveragebeendeclined_canceled_NonRenewedduringtheprior3years = By.xpath("//input[contains(@id,'QuestionSetLV-4-QuestionModalInput-BooleanRadioInput_NoPost_1')]");

	void offering() throws Throwable;

	void Qualification() throws Throwable;

}
