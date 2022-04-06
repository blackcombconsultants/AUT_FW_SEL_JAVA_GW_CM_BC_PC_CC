package com.pages.Guidewire.PolicyCenter;

import org.openqa.selenium.By;

public interface PolicyCenter_Bound_PO {
	// ------>submission bound xpaths
	final By SB_ViewYourSubmission                         = By.xpath("//div[contains(@id,'JobCompleteDV-ViewJob')]//div[contains(text(),'View your submission')]");
	final By SB_ViewYourPolicy                             = By.xpath("//div[contains(@id,'JobCompleteDV-ViewPolicy')]//div[contains(text(),'View your policy')]");
	final By SB_ViewChangePolicyLink                             = By.xpath("//div[contains(@id,'-ResolveWithFutureUnboundPeriods')]//div[@class='gw-action']");
	final By Go_to_the_submission_manager_for_this_account = By.xpath("//div[contains(@id,'JobCompleteDV-SubmissionManager')]//div[text()='Go to the submission manager for this account']");
	final By Submit_an_application_for_a_different_account = By.xpath("//div[contains(@id,'JobCompleteDV-SubmitAnother')]//div[text()='Submit an application for a different account']");
	final By PB_ViewUnboundRenewal = By.xpath("//div[contains(@id,'ResolveWithFutureUnboundPeriods')]//div[@class='gw-action' and contains(text(),'There is a later unbound renewal')]");
	final By CloseOption = By.xpath("//div[contains(@id,'PreemptionConflictScreen-CloseButton')]");
	final By GoToYourDesktop    = By.xpath("//div[contains(@id,'JobCompleteDV-ReturnToDesktop')]//div[text()='Go to your desktop']");
	final By ReviewChanges      = By.xpath("//div[contains(@id,'ReviewChanges')]//div[text()='Review Changes']");
	final By SB_ViewYourrenewal = By.xpath("//div[contains(@id,'ViewJob')]//div[contains(text(),'View your renewal')]");

	final By PA_Quote_Screen_titlebar = By.xpath("//div[contains(@id,'QuoteScreen-ttlBar')]//div[1]/div");
	final By PA_Quote_Address         = By.xpath("//div[contains(@id,'GlobalAddressInputSet-AddressSummary_Input')]//div[@class='gw-value-readonly-wrapper']");
	final By PA_Quote_Model_Year      = By.xpath("//tr[contains(@id,'RatingCumulDetailsPanelSet-0-0-vehicleLV-5')]//td[1]//div[@class='gw-value-readonly-wrapper']");
	// ----->summary screen xpaths
	final By summary_screen_title = By.xpath(" //div[@id='PolicyFile_Summary-ttlBar']//div[@class='gw-TitleBar--title']");
	final By summary_product      = By.xpath("//div[contains(@id,'PolicyDetailsDetailViewTile_DV-Product')]//div[@class='gw-value-readonly-wrapper']");
	final By summary_offering     = By.xpath("//div[contains(@id,'PolicyDetailsDetailViewTile_DV-Offering')]//div[@class='gw-value-readonly-wrapper']");
	// ------->submission manager screen xpaths
	final By submission_title  = By.xpath("//div[@id='SubmissionManager-SubmissionManagerScreen-0']//div[@class='gw-TitleBar--title']");
	final By submission_filter = By.xpath("//select[contains(@name,'SubmissionManagerLV-submissionFilter')]");

	/*
	 * 
	 * Modules
	 * 
	 * void submissionBound() throws Throwable;
	 * 
	 * void view_your_Submission() throws Throwable;
	 * 
	 * void View_your_Policy() throws Throwable;
	 * 
	 * void Go_to_the_submission(String type) throws Throwable;
	 * 
	 * void Submit_an_application() throws Throwable;
	 * 
	 * void Go_To_Your_Desktop() throws Throwable;
	 * 
	 * void submissionManager() throws Throwable;
	 * 
	 * void NotTaken() throws Throwable;
	 * 
	 * void SubmissionDecline() throws Throwable;
	 */
}
