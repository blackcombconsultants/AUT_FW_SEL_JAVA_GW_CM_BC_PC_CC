package com.pages.Guidewire.PersonalAuto;

import org.openqa.selenium.By;

public interface PersonalAuto_RiskAnalysis_PO {

	final By NewSubmisison_Screen_PALOB_Button = By.xpath("//div[contains(@id,'-8-addSubmission')]");

	void RA_AddUWIssue() throws Throwable;

	void RA_AddUWContingency() throws Throwable;

	void RA_RequestApproval() throws Throwable;

	void RA_LockForReview() throws Throwable;

	void RA_ApproveUWIssues() throws Throwable;

	void RA_RejectUWIssues() throws Throwable;

	void ve_RemoveVehicles() throws Throwable;

	void RA_ApproveContingency() throws Throwable;

	void RA_RejectContingency() throws Throwable;

	void RA_Add_PriorLosses() throws Throwable;

	void RA_Edit_PriorLosses() throws Throwable;

	void RA_Remove_PriorLosses() throws Throwable;

	void RA_Claims_Search() throws Throwable;

	void RA_MVR_Search_Validate() throws Throwable;

}
