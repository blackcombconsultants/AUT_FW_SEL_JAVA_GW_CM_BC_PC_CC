package com.pages.Guidewire.PersonalAuto;

import org.openqa.selenium.By;

public interface PersonalAuto_RiskAnalysis_PO {

	final By RiskAnalysis_Header = By.xpath("//div[@class='gw-TitleBar--title' and text()='Risk Analysis']");

	final By RA_OK_Button = By.xpath("//div[contains(@class,'gw-ToolbarButtonWidget')]//div[@class='gw-minimized-view']/following-sibling::div[text()='OK']");
	final By RA_Cancel_Button = By.xpath("//div[contains(@class,'gw-ToolbarButtonWidget')]//div[@class='gw-minimized-view']/following-sibling::div[text()='Cance']");
	
	final By RA_Error_header = By
			.xpath("//div[@class='gw-subGroupLabel gw-text' and text()='Errors on current page:']");
	final By RA_Error_message = By.xpath("//div[contains(text(),'Missing required field')]");
	

	final By RA_Error_focus = By.xpath("//div[contains(text(),'Missing required field')]");

	final By RA_Contingency_Cancel = By.xpath("//div[contains(text(),'Cance')]");
	final By RA_RequestApproval_Button = By.xpath("//div[@class='gw-label' and text()='Request Approval']");

	
	/*
	 * CreateNewUWIssue
	 */
	final By RA_AddUWIssue_Button = By.xpath(
			"//div[contains(@id,'RiskAnalysisCV_tb-AddManualIssue]//div[@class='gw-label' and text()='Add UW Issue']");
	final By RA_AUI_CreateNewUWIssue = By.xpath("//div[@class='gw-TitleBar--title' and text()='Create New UW Issue']");

	final By RA_AUI_CNUI_IssueType = By.xpath("//select[contains(@name,'IssueType')]");
	final By RA_AUI_CNUI_ShortDescription = By.xpath("//input[@type='text' and @value='Special Issue']");
	final By RA_AUI_CNUI_LongDescription = By.xpath("//textarea[contains(@name,'LongDescription')]");

	/*
	 * UWIssues Tab
	 */

	final By RA_Tab_UWIssues = By.xpath("//div[contains(@id,'Job_RiskAnalysisScreen-EvaluationIssuesCardTab')]");
	final By RA_UI_ViewIssuesBlocking = By.xpath(
			"//div[contains(@id,'RiskEvaluationPanelSet-UserViewFilter')]//select[contains(@name,'UserViewFilter')]");

	final By RA_UI_Select = By.xpath(
			"//div[contains(@id,'ShortDescription_button') and text()='asmd m,sand,mna,d,msa']/ancestor::td[contains(@id,'ShortDescription_Cell')]/preceding-sibling::td[contains(@class,'gw-impl-cell--CB')]//input[@type='checkbox']");
	final By RA_UI_Name = By.xpath(
			"//td[contains(@id,'ShortDescription_Cell')]//div[contains(@id,'ShortDescription') and contains(@class,'gw-actionValue')]//div[contains(@id,'ShortDescription_button')]");
	final By RA_UI_Approve = By.xpath(
			"//div[contains(@id,'ShortDescription_button') and text()='asmd m,sand,mna,d,msa']/ancestor::td[contains(@id,'ShortDescription_Cell')]/following-sibling::td[contains(@id,'UWIssueRowSet-6')]//div[contains(@id,'UWIssueRowSet-Approve')]");
	final By RA_UI_Reject = By.xpath(
			"//div[contains(@id,'ShortDescription_button') and text()='asmd m,sand,mna,d,msa']/ancestor::td[contains(@id,'ShortDescription_Cell')]/following-sibling::td[contains(@id,'UWIssueRowSet-6')]//div[contains(@id,'UWIssueRowSet-Reject')]");
	final By RA_UI_Reopen = By.xpath(
			"//div[contains(@id,'ShortDescription_button') and text()='asmd m,sand,mna,d,msa']/ancestor::td[contains(@id,'ShortDescription_Cell')]/following-sibling::td[contains(@id,'UWIssueRowSet-6')]//div[contains(@id,'UWIssueRowSet-Reopen')]");

	/*
	 * Contingencies
	 */

	final By RA_AddContingency_Button = By.xpath(
			"//div[contains(@id,'RiskAnalysisCV_tb-AddNewContingencyButton')]//div[@class='gw-label' and text()='Add Contingency']");
	final By RA_AC_NewContingency = By.xpath("//div[@class='gw-TitleBar--title' and text()='New Contingency']");

	final By RA_AC_NC_Title = By.xpath("//input[contains(@name,'ContingencyTitle')]");
	final By RA_AC_NC_Description = By.xpath("//textarea[contains(@name,'ContingencyDescription')]");
	final By RA_AC_NC_Action = By.xpath("//select[contains(@name,'ContingencyAction')]");
	final By RA_AC_NC_DueDate = By
			.xpath("//input[contains(@class,'dateInput') and contains(@name,'ContingencyDueDate')]");
	

	/*
	 * Contingencies Tab
	 */
	final By RA_Tab_Contingencies = By.xpath("//div[contains(@id,'RiskAnalysisCV-ContingenciesCardTab')]//div[@class='gw-label' and text()='Contingencies']");

	final By RA_C_Title  = By.xpath(
			"//td[contains(@id,'ContingencyTitle_Cell')]//div[contains(@id,'ContingencyTitle') and contains(@class,'gw-actionValue')]//div[contains(@id,'ContingencyTitle_button')]");
	final By RA_C_DueDate = By.xpath(
			"//div[contains(@id,'ContingencyTitle_button') and text()='gdgsdgsdfsdf']/ancestor::td[contains(@id,'ContingencyTitle_Cell')]/following-sibling::td[contains(@id,'DueDate_Cell')]//div[contains(@id,'DueDate')]//div[@class='gw-value-readonly-wrapper']");
	final By RA_C_PotentialAction = By.xpath(
			"//div[contains(@id,'ContingencyTitle_button') and text()='gdgsdgsdfsdf']/ancestor::td[contains(@id,'ContingencyTitle_Cell')]/following-sibling::td[contains(@id,'PotentialAction_Cell')]//div[contains(@id,'PotentialAction')]//div[@class='gw-value-readonly-wrapper']");
	final By RA_C_AddedBy = By.xpath(
			"//div[contains(@id,'ContingencyTitle_button') and text()='gdgsdgsdfsdf']/ancestor::td[contains(@id,'ContingencyTitle_Cell')]/following-sibling::td[contains(@id,'AddedBy_Cell')]//div[contains(@id,'AddedBy')]//div[@class='gw-value-readonly-wrapper']");
	final By RA_C_On = By.xpath(
			"//div[contains(@id,'ContingencyTitle_button') and text()='gdgsdgsdfsdf']/ancestor::td[contains(@id,'ContingencyTitle_Cell')]/following-sibling::td[contains(@id,'On_Cell')]//div[contains(@id,'On')]//div[@class='gw-value-readonly-wrapper']");



	/*
	 * 
	 * UW Activity
	 */
	final By RA_UWA_Subject = By.xpath("//div[contains(@class,'gw-ToolbarButtonWidget')]//div[@class='gw-minimized-view']/following-sibling::div[text()='Cance']");
	final By RA_UWA_Description = By.xpath("//div[contains(@class,'gw-ToolbarButtonWidget')]//div[@class='gw-minimized-view']/following-sibling::div[text()='Cance']");
	final By RA_UWA_DueDate = By.xpath("//div[contains(@class,'gw-ToolbarButtonWidget')]//div[@class='gw-minimized-view']/following-sibling::div[text()='Cance']");
	final By RA_UWA_EscalationDate = By.xpath("//div[contains(@class,'gw-ToolbarButtonWidget')]//div[@class='gw-minimized-view']/following-sibling::div[text()='Cance']");
	final By RA_UWA_Priority = By.xpath("//div[contains(@class,'gw-ToolbarButtonWidget')]//div[@class='gw-minimized-view']/following-sibling::div[text()='Cance']");
	final By RA_UWA_Mandatory = By.xpath("//div[contains(@class,'gw-ToolbarButtonWidget')]//div[@class='gw-minimized-view']/following-sibling::div[text()='Cance']");
	final By RA_UWA_Recurring = By.xpath("//div[contains(@class,'gw-ToolbarButtonWidget')]//div[@class='gw-minimized-view']/following-sibling::div[text()='Cance']");
	final By RA_UWA_AssignTo = By.xpath("//div[contains(@class,'gw-ToolbarButtonWidget')]//div[@class='gw-minimized-view']/following-sibling::div[text()='Cance']");
	final By RA_UWA_SecurityLevel = By.xpath("//div[contains(@class,'gw-ToolbarButtonWidget')]//div[@class='gw-minimized-view']/following-sibling::div[text()='Cance']");
	final By RA_UWA_Release = By.xpath("//div[contains(@class,'gw-ToolbarButtonWidget')]//div[@class='gw-minimized-view']/following-sibling::div[text()='Cance']");
	
	void riskAnalysis() throws Throwable;

	void RA_AddUWIssue() throws Throwable;

	void RA_AddUWContingency() throws Throwable;

	void RA_RequestApproval() throws Throwable;

	void RA_LockForReview() throws Throwable;
	
	void RA_ReleaseLock() throws Throwable;

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
