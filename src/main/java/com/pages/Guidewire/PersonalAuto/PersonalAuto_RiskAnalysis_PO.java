package com.pages.Guidewire.PersonalAuto;

import org.openqa.selenium.By;

public interface PersonalAuto_RiskAnalysis_PO {

	final By RiskAnalysis_Header = By.xpath("//div[@class='gw-TitleBar--title' and text()='Risk Analysis']");

	final By RA_OK_Button = By.xpath(
			"//div[contains(@class,'gw-ToolbarButtonWidget')]//div[@class='gw-minimized-view']/following-sibling::div[text()='OK']");
	final By RA_Cancel_Button = By.xpath(
			"//div[contains(@class,'gw-ToolbarButtonWidget')]//div[@class='gw-minimized-view']/following-sibling::div[text()='Cance']");

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
			"//div[contains(@id,'RiskAnalysisCV_tb-AddManualIssue')]//div[@class='gw-label' and text()='Add UW Issue']");
	final By RA_AUI_CreateNewUWIssue = By.xpath("//div[@class='gw-TitleBar--title' and text()='Create New UW Issue']");

	final By RA_AUI_CNUI_IssueType = By.xpath("//select[contains(@name,'IssueType')]");
	final By RA_AUI_CNUI_ShortDescription = By.xpath("//input[@type='text' and @value='Special Issue']");
	final By RA_AUI_CNUI_LongDescription = By.xpath("//textarea[contains(@name,'LongDescription')]");

	/*
	 * UWIssues Tab
	 */

	final By RA_Tab_UWIssues = By.xpath("//div[contains(@id,'RiskAnalysisCV-EvaluationIssuesCardTab')]");
	final By RA_UI_BlockingIssuance = By.xpath("//div[contains(@class,'TextValueWidget')]//div[@class='gw-value-readonly-wrapper' and text()='Blocking Issuance']");
	final By RA_UI_ViewIssuesBlocking = By.xpath(
			"//div[contains(@id,'RiskEvaluationPanelSet-UserViewFilter')]//select[contains(@name,'UserViewFilter')]");

	final By RA_UI_Reject = By.xpath(
			"//div[contains(@id,'ShortDescription_button') and text()='asmd m,sand,mna,d,msa']/ancestor::td[contains(@id,'ShortDescription_Cell')]/following-sibling::td[contains(@id,'UWIssueRowSet-6')]//div[contains(@id,'UWIssueRowSet-Reject')]");
	final By RA_UI_Reopen = By.xpath(
			"//div[contains(@id,'ShortDescription_button') and text()='asmd m,sand,mna,d,msa']/ancestor::td[contains(@id,'ShortDescription_Cell')]/following-sibling::td[contains(@id,'UWIssueRowSet-6')]//div[contains(@id,'UWIssueRowSet-Reopen')]");

	/*
	 * Risk Approval Details
	 */

	/*
	 * NewApproval
	 */
	final By RAD_NewApproval = By.xpath(
			"//div[contains(@class,'gw-ListView--UI--title') and @role = 'heading' and text()='New Approval']");

	final By RAD_NA_AllowEdit_Yes = By.xpath(
			"//input[contains(@id,'UWApprovalLV-EditBeforeBind_0')]");
	final By RAD_NA_AllowEdit_No = By.xpath(
			"//input[contains(@id,'UWApprovalLV-EditBeforeBind_1')]");
	final By RAD_NA_Through = By.xpath(
			"//select[contains(@name,'UWApprovalLV-BlockingPoint')]");
	final By RAD_NA_Validuntil = By.xpath(
			"//select[contains(@name,'UWApprovalLV-Duration')]");

	/*
	 * History
	 */
	final By RAD_History = By
			.xpath("//div[contains(@class,'gw-ListView--UI--title') and @role = 'heading' and text()='History']");

	final By RAD_H_User = By.xpath(
			"//tr[contains(@id,'UWIssueHistoryLV')]/td[contains(@id,'ResponsibleUser_Cell')]//div[contains(@id,'ResponsibleUser')]//div[@class='gw-value-readonly-wrapper']");
	final By RAD_H_Date = By.xpath(
			"//tr[contains(@id,'UWIssueHistoryLV')]/td[contains(@id,'HistoryCreateDate_Cell')]//div[contains(@id,'HistoryCreateDate')]//div[@class='gw-value-readonly-wrapper']");
	final By RAD_H_EffectiveDate = By.xpath(
			"//tr[contains(@id,'UWIssueHistoryLV')]/td[contains(@id,'HistoryEffDate_Cell')]//div[contains(@id,'HistoryEffDate')]//div[@class='gw-value-readonly-wrapper']");
	final By RAD_H_PolicyTransaction = By.xpath(
			"//tr[contains(@id,'UWIssueHistoryLV')]/td[contains(@id,'Job_Cell')]//div[contains(@id,'Job')]//div[@class='gw-value-readonly-wrapper']");
	final By RAD_H_AllowEdit = By.xpath(
			"//tr[contains(@id,'UWIssueHistoryLV')]/td[contains(@id,'EditBeforeBind_Cell')]//div[contains(@id,'EditBeforeBind')]/div");
	final By RAD_H_Though = By.xpath(
			"//tr[contains(@id,'UWIssueHistoryLV')]/td[contains(@id,'ThroughValue_Cell')]//div[contains(@id,'ThroughValue')]//div[@class='gw-value-readonly-wrapper']");
	final By RAD_H_ValidUntil = By.xpath(
			"//tr[contains(@id,'UWIssueHistoryLV')]/td[contains(@id,'InvalidFrom_Cell')]//div[contains(@id,'InvalidFrom')]/div");
	final By RAD_H_Status = By.xpath(
			"//tr[contains(@id,'UWIssueHistoryLV')]/td[contains(@id,'HistoryStatus_Cell')]//div[contains(@id,'HistoryStatus')]//div[@class='gw-label']");

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
	final By RA_Tab_Contingencies = By.xpath(
			"//div[contains(@id,'RiskAnalysisCV-ContingenciesCardTab')]//div[@class='gw-label' and text()='Contingencies']");

	final By RA_C_Pending = By.xpath(
			"//div[contains(@class,'gw-ListView--UI-section')]//div[@class='gw-ListView--UI--title' and @role='heading' and text()='Pending']");
	final By RA_C_Title = By.xpath(
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
	final By RA_UWA_Subject = By.xpath(
			"//div[contains(@class,'gw-ToolbarButtonWidget')]//div[@class='gw-minimized-view']/following-sibling::div[text()='Cance']");
	final By RA_UWA_Description = By.xpath(
			"//div[contains(@class,'gw-ToolbarButtonWidget')]//div[@class='gw-minimized-view']/following-sibling::div[text()='Cance']");
	final By RA_UWA_DueDate = By.xpath(
			"//div[contains(@class,'gw-ToolbarButtonWidget')]//div[@class='gw-minimized-view']/following-sibling::div[text()='Cance']");
	final By RA_UWA_EscalationDate = By.xpath(
			"//div[contains(@class,'gw-ToolbarButtonWidget')]//div[@class='gw-minimized-view']/following-sibling::div[text()='Cance']");
	final By RA_UWA_Priority = By.xpath(
			"//div[contains(@class,'gw-ToolbarButtonWidget')]//div[@class='gw-minimized-view']/following-sibling::div[text()='Cance']");
	final By RA_UWA_Mandatory = By.xpath(
			"//div[contains(@class,'gw-ToolbarButtonWidget')]//div[@class='gw-minimized-view']/following-sibling::div[text()='Cance']");
	final By RA_UWA_Recurring = By.xpath(
			"//div[contains(@class,'gw-ToolbarButtonWidget')]//div[@class='gw-minimized-view']/following-sibling::div[text()='Cance']");
	final By RA_UWA_AssignTo = By.xpath(
			"//div[contains(@class,'gw-ToolbarButtonWidget')]//div[@class='gw-minimized-view']/following-sibling::div[text()='Cance']");
	final By RA_UWA_SecurityLevel = By.xpath(
			"//div[contains(@class,'gw-ToolbarButtonWidget')]//div[@class='gw-minimized-view']/following-sibling::div[text()='Cance']");
	final By RA_UWA_Release = By.xpath(
			"//div[contains(@class,'gw-ToolbarButtonWidget')]//div[@class='gw-minimized-view']/following-sibling::div[text()='Cance']");

	/*
	 * Prior Policies Tab
	 */

	final By RA_Tab_PriorPolicies = By.xpath(
			"//div[contains(@id,'RiskAnalysisCV-PriorPolicyCardTab')]//div[@class='gw-label' and text()='Prior Policies']");

	final By RA_PP_PriorPolicies = By.xpath(
			"//div[contains(@class,'gw-LabelWidget')]/div[contains(@class,'gw-label') and text()='Prior Policies']");

	final By RA_PP_Add_Button = By.xpath("//div[contains(@id,'PriorPolicyLV_tb-Add')]/div[@role='button']");
	final By RA_PP_Remove_Button = By.xpath("//div[contains(@id,'PriorPolicyLV_tb-Remove')]/div[@role='button']");

	final By RA_PP_Select = By.xpath(
			"//tr[contains(@id,'PriorPolicyLV') and contains(@class,'gw-standard-row')]/td[contains(@class,'gw-impl-cell--CB')]//div[contains(@id,'_Checkbox') and contains(@class,'gw-IteratorEntryCheckBoxWidget')]/input[@type='checkbox']");

	final By RA_PP_Carrier = By.xpath(
			"//tr[contains(@id,'PriorPolicyLV') and contains(@class,'gw-standard-row')]/td[contains(@id,'Carrier_Cell') and contains(@class,'gw-CellWidget')]//div[contains(@id,'Carrier') and contains(@class,'gw-editable')]//input[contains(@name,'Carrier')]");

	final By RA_PP_Policy = By.xpath(
			"//tr[contains(@id,'PriorPolicyLV') and contains(@class,'gw-standard-row')]/td[contains(@id,'PolicyNumber_Cell') and contains(@class,'gw-CellWidget')]//div[contains(@id,'PolicyNumber') and contains(@class,'gw-editable')]//input[contains(@name,'PolicyNumber')]");

	final By RA_PP_EffectiveDate = By.xpath(
			"//tr[contains(@id,'PriorPolicyLV') and contains(@class,'gw-standard-row')]/td[contains(@id,'EffectiveDate_Cell') and contains(@class,'gw-CellWidget')]//div[contains(@id,'EffectiveDate') and contains(@class,'gw-editable')]//input[contains(@name,'EffectiveDate')]");

	final By RA_PP_ExpirationDate = By.xpath(
			"//tr[contains(@id,'PriorPolicyLV') and contains(@class,'gw-standard-row')]/td[contains(@id,'ExpirationDate_Cell') and contains(@class,'gw-CellWidget')]//div[contains(@id,'ExpirationDate') and contains(@class,'gw-editable')]//input[contains(@name,'ExpirationDate')]");

	final By RA_PP_AnnualPremium = By.xpath(
			"//tr[contains(@id,'PriorPolicyLV') and contains(@class,'gw-standard-row')]/td[contains(@id,'AnnualPremium_Cell') and contains(@class,'gw-CellWidget')]//div[contains(@id,'AnnualPremium') and contains(@class,'gw-editable')]//input[contains(@name,'AnnualPremium')]");

	final By RA_PP_Losses = By.xpath(
			"//tr[contains(@id,'PriorPolicyLV') and contains(@class,'gw-standard-row')]/td[contains(@id,'Losses_Cell') and contains(@class,'gw-CellWidget')]//div[contains(@id,'Losses') and contains(@class,'gw-editable')]//input[contains(@name,'Losses')]");

	final By RA_PP_TotalLosses = By.xpath(
			"//tr[contains(@id,'PriorPolicyLV') and contains(@class,'gw-standard-row')]/td[contains(@id,'TotalLosses_Cell') and contains(@class,'gw-CellWidget')]//div[contains(@id,'TotalLosses') and contains(@class,'gw-editable')]//input[contains(@name,'TotalLosses')]");

	/*
	 * Prior Loses Tab
	 */

	final By RA_Tab_PriorLosses = By.xpath(
			"//div[contains(@id,'RiskAnalysisCV-LossHistoryCardTab')]//div[@class='gw-label' and text()='Prior Losses']");

	final By RA_PL_PriorLosses = By.xpath(
			"//div[contains(@class,'gw-LabelWidget')]/div[contains(@class,'gw-label') and text()='Prior Losses']");

	final By RA_PL_LossHistoryType = By.xpath("//select[contains(@name,'LossHistoryType')]");

	final By RA_PL_Add_Button = By.xpath("//div[contains(@id,'ManualLossHistoryLV_tb-Add')]/div[@role='button']");
	final By RA_PL_Remove_Button = By.xpath("//div[contains(@id,'ManualLossHistoryLV_tb-Remove')]/div[@role='button']");

	final By RA_PL_Select = By.xpath(
			"//tr[contains(@id,'PriorPolicyLV') and contains(@class,'gw-standard-row')]/td[contains(@class,'gw-impl-cell--CB')]//div[contains(@id,'_Checkbox') and contains(@class,'gw-IteratorEntryCheckBoxWidget')]/input[@type='checkbox']");

	final By RA_PL_OccurrenceDate = By.xpath(
			"//tr[contains(@id,'PriorPolicyLV') and contains(@class,'gw-standard-row')]/td[contains(@id,'Carrier_Cell') and contains(@class,'gw-CellWidget')]//div[contains(@id,'Carrier') and contains(@class,'gw-editable')]//input[contains(@name,'Carrier')]");

	final By RA_PL_Description = By.xpath(
			"//tr[contains(@id,'PriorPolicyLV') and contains(@class,'gw-standard-row')]/td[contains(@id,'EffectiveDate_Cell') and contains(@class,'gw-CellWidget')]//div[contains(@id,'EffectiveDate') and contains(@class,'gw-editable')]//input[contains(@name,'EffectiveDate')]");

	final By RA_PL_TotalIncurred = By.xpath(
			"//tr[contains(@id,'PriorPolicyLV') and contains(@class,'gw-standard-row')]/td[contains(@id,'ExpirationDate_Cell') and contains(@class,'gw-CellWidget')]//div[contains(@id,'ExpirationDate') and contains(@class,'gw-editable')]//input[contains(@name,'ExpirationDate')]");

	final By RA_PL_AmountPaid = By.xpath(
			"//tr[contains(@id,'PriorPolicyLV') and contains(@class,'gw-standard-row')]/td[contains(@id,'AnnualPremium_Cell') and contains(@class,'gw-CellWidget')]//div[contains(@id,'AnnualPremium') and contains(@class,'gw-editable')]//input[contains(@name,'AnnualPremium')]");

	final By RA_PL_OpenReserve = By.xpath(
			"//tr[contains(@id,'PriorPolicyLV') and contains(@class,'gw-standard-row')]/td[contains(@id,'Losses_Cell') and contains(@class,'gw-CellWidget')]//div[contains(@id,'Losses') and contains(@class,'gw-editable')]//input[contains(@name,'Losses')]");

	final By RA_PL_Status = By.xpath(
			"//tr[contains(@id,'PriorPolicyLV') and contains(@class,'gw-standard-row')]/td[contains(@id,'TotalLosses_Cell') and contains(@class,'gw-CellWidget')]//div[contains(@id,'TotalLosses') and contains(@class,'gw-editable')]//input[contains(@name,'TotalLosses')]");

	/*
	 * Scenarios
	 */

	void addUWIssue() throws Throwable;

	void approveUWIssues() throws Throwable;

	void riskApprovalDetails() throws Throwable;

	void rejectUWIssues() throws Throwable;

	void reopenUWIssues() throws Throwable;

	void addUWIssue_MandatoryValidation() throws Throwable;

	void addUWIssue_CancelValidation() throws Throwable;

	void addUWContingency() throws Throwable;

	void approveContingency() throws Throwable;

	void rejectContingency() throws Throwable;

	void reopenContingency() throws Throwable;

	void priorPolicies_Add() throws Throwable;

	void priorPolicies_Edit() throws Throwable;

	void priorPolicies_Remove() throws Throwable;

	void RA_Claims_Search() throws Throwable;

	void priorLosses_Add() throws Throwable;

	void priorLosses_Edit() throws Throwable;

	void priorLosses_Remove() throws Throwable;

	void RA_MVR_Search_Validate() throws Throwable;

	void RA_LockForReview() throws Throwable;

	void releaseLock() throws Throwable;

	void requestApproval() throws Throwable;

}
