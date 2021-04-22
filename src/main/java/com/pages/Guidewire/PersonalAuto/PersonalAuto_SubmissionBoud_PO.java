package com.pages.Guidewire.PersonalAuto;

import org.openqa.selenium.By;

public interface PersonalAuto_SubmissionBoud_PO {
	// ------>submission bound xpaths
	final By View_your_Submission = By.xpath("//div[contains(text(),'View your submission ')]");
	final By View_your_Policy = By.xpath("//div[contains(text(),'View your policy')]");
	final By Go_to_the_submission_manager_for_this_account = By.xpath("//div[contains(text(),'Go to the submission')]");
	final By Submit_an_application_for_a_different_account = By
			.xpath("//div[contains(text(),'Submit an application')]");
	final By Go_To_Your_Desktop = By.xpath("//div[contains(text(),'Go to your desktop')]");

	final By PA_Quote_Screen_titlebar = By.xpath("//div[contains(@id,'QuoteScreen-ttlBar')]//div[1]/div");
	final By PA_Quote_Address = By.xpath(
			"//div[contains(@id,'GlobalAddressInputSet-AddressSummary_Input')]//div[@class='gw-value-readonly-wrapper']");
	final By PA_Quote_Model_Year = By.xpath(
			"//tr[contains(@id,'RatingCumulDetailsPanelSet-0-0-vehicleLV-5')]//td[1]//div[@class='gw-value-readonly-wrapper']");
	// ----->summary screen xpaths
	final By summary_screen_title = By
			.xpath(" //div[@id='PolicyFile_Summary-ttlBar']//div[@class='gw-TitleBar--title']");
	final By summary_product = By.xpath(
			"//div[contains(@id,'PolicyDetailsDetailViewTile_DV-Product')]//div[@class='gw-value-readonly-wrapper']");
	final By summary_offering = By.xpath(
			"//div[contains(@id,'PolicyDetailsDetailViewTile_DV-Offering')]//div[@class='gw-value-readonly-wrapper']");
	// ------->submission manager screen xpaths
	final By submission_title = By
			.xpath("//div[@id='SubmissionManager-SubmissionManagerScreen-0']//div[@class='gw-TitleBar--title']");
	final By submission_filter = By.xpath("//select[contains(@name,'SubmissionManagerLV-submissionFilter')]");

	void submissionBound() throws Throwable;

	void view_your_Submission() throws Throwable;

	void View_your_Policy() throws Throwable;

	void Go_to_the_submission(String type) throws Throwable;

	void Submit_an_application() throws Throwable;

	void Go_To_Your_Desktop() throws Throwable;

}
