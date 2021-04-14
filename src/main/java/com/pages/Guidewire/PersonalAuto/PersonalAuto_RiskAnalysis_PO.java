package com.pages.Guidewire.PersonalAuto;

import org.openqa.selenium.By;

public interface PersonalAuto_RiskAnalysis_PO {

	final By RiskAnalysis_Header = By.xpath("//div[@class='gw-TitleBar--title' and text()='Risk Analysis']");
	final By RA_AddUWIssue_Button = By.xpath("//div[@class=\"gw-label\" and text()=\"Add UW Issue\"]");
	final By RA_CreateNewUWIssue = By.xpath("//div[@class='gw-TitleBar--title' and text()='Create New UW Issue']");
	final By RA_IssueType = By.xpath("//div[@id='l--1' and text()='Issue Type']");
	final By RA_ShortDescription = By.xpath(" //div[@id='l--2' and text()='Short Description']");
	final By RA_LongDescription = By.xpath("//div[@id='l--3' and text()='Long Description']");
	final By ra_addresstype = By.xpath("//div[@class='gw-TitleBar--title' and text()='Risk Analysis']");

	/*
	 * final By RikAnalysis =
	 * By.xpath("//div[@class='gw-TitleBar--title' and text()='Risk Analysis']");
	 */	
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
