package com.pages.Guidewire.PersonalAuto;

import org.openqa.selenium.By;

public interface PersonalAuto_RiskAnalysis_PO {

	final By RiskAnalysis_Header = By.xpath("//div[@class='gw-TitleBar--title' and text()='Risk Analysis']");
	
	final By RA_AddUWIssue_Button = By.xpath("//div[@class=\"gw-label\" and text()=\"Add UW Issue\"]");
	final By RA_CreateNewUWIssue = By.xpath("//div[@class='gw-TitleBar--title' and text()='Create New UW Issue']");
	final By RA_IssueType = By.xpath("//div[@id='l--1' and text()='Issue Type']");
	final By RA_ShortDescription = By.xpath(" //div[@id='l--2' and text()='Short Description']");
	final By RA_LongDescription = By.xpath("//div[@id='l--3' and text()='Long Description']");
	final By RA_IssueTypeselector = By.xpath("//select[contains(@name,'IssueType')]");
	final By RA_SDvalue = By.xpath("//input[@type='text' and @value='Special Issue']");
	final By RA_LDvalue = By.xpath("//textarea[contains(@name,'LongDescription')]");
	final By RA_OK_Button = By.xpath("//div[@class='gw-minimized-view']/following-sibling::div[text()='OK']");
	final By RA_Cancel_Button = By.xpath("//div[contains(text(),'Cance')]");
	final By RA_Error_header = By
			.xpath("//div[@class='gw-subGroupLabel gw-text' and text()='Errors on current page:']");
	final By RA_Error_message = By.xpath("//div[contains(text(),'Missing required field')]");
	final By RA_Error_focus = By.xpath("//div[contains(text(),'Missing required field')]");
	final By RA_AddContingency_Button = By.xpath("//div[@class='gw-label' and text()='Add Contingency']");
	final By RA_Contingency_Header = By.xpath("//div[@class='gw-TitleBar--title' and text()='New Contingency']");
	final By RA_Contingencytitle = By.xpath("//input[contains(@name,'ContingencyTitle')]");
	final By RA_ContingencyDescription = By.xpath("//textarea[contains(@name,'ContingencyDescription')]");
	final By RA_ContingencyAction = By.xpath("//select[contains(@name,'ContingencyAction')]");
	final By RA_ContingencyDueDate = By
			.xpath("//input[contains(@class,'dateInput') and contains(@name,'ContingencyDueDate')]");
	final By RA_Contingency_OK = By.xpath("//div[@class='gw-minimized-view']/following-sibling::div[text()='OK']");
	final By RA_Contingency_Cancel = By.xpath("//div[contains(text(),'Cance')]");
	final By RA_AddRequestApproval_Button = By.xpath("//div[@class='gw-label' and text()='Request Approval']");
	final By RA_RequestApproval_Header = By.xpath("//div[@class='gw-TitleBar--title' and text()='UW Activity']");

	void riskAnalysis() throws Throwable;

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

	void RA_AddUWIssue_MandatoryValidation() throws Throwable;

	void RA_AddUWIssue_CancelValidation() throws Throwable;
}
