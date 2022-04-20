package com.pages.Guidewire.PolicyCenter.BusinessOwners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.aventstack.extentreports.ExtentTest;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Resuables;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Resuables_PO;
import com.pages.Guidewire.PolicyCenter.PersonalAuto.PA_Reusable;

public class BO_RiskAnalysis extends SeleniumWebDriver_Commands {

	public BO_RiskAnalysis(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	private static By RA_OK_Button     = By.xpath("//div[contains(@class,'gw-ToolbarButtonWidget')]//div[@class='gw-minimized-view']/following-sibling::div[text()='OK']");
	private static By RA_Cancel_Button = By.xpath("//div[contains(@class,'gw-ToolbarButtonWidget')]//div[@class='gw-minimized-view']/following-sibling::div[text()='Cance']");

	private static By RA_Error_header  = By.xpath("//div[@class='gw-subGroupLabel gw-text' and text()='Errors on current page:']");
	private static By RA_Error_message = By.xpath("//div[contains(text(),'Missing required field')]");

	private static By RA_Error_focus = By.xpath("//div[contains(text(),'Missing required field')]");

	private static By RA_Contingency_Cancel     = By.xpath("//div[contains(text(),'Cance')]");
	private static By RA_RequestApproval_Button = By.xpath("//div[@class='gw-label' and text()='Request Approval']");

	/*
	 * CreateNewUWIssue
	 */
	private static By RA_AddUWIssue_Button    = By.xpath("//div[contains(@id,'RiskAnalysisCV_tb-AddManualIssue')]//div[@class='gw-label' and text()='Add UW Issue']");
	private static By RA_AUI_CreateNewUWIssue = By.xpath("//div[@class='gw-TitleBar--title' and text()='Create New UW Issue']");

	private static By RA_AUI_CNUI_IssueType        = By.xpath("//select[contains(@name,'IssueType')]");
	private static By RA_AUI_CNUI_ShortDescription = By.xpath("//input[@type='text' and @value='Special Issue']");
	private static By RA_AUI_CNUI_LongDescription  = By.xpath("//textarea[contains(@name,'LongDescription')]");

	/*
	 * UWIssues Tab
	 */

	private static By RA_Tab_UWIssues          = By.xpath("//div[contains(@id,'RiskAnalysisCV-EvaluationIssuesCardTab')]");
	private static By RA_UI_BlockingIssuance   = By.xpath("//div[contains(@class,'TextValueWidget')]//div[@class='gw-value-readonly-wrapper' and text()='Blocking Issuance']");
	private static By RA_UI_ViewIssuesBlocking = By.xpath("//div[contains(@id,'RiskEvaluationPanelSet-UserViewFilter')]//select[contains(@name,'UserViewFilter')]");

	private static By RA_UI_Reject = By.xpath(
			"//div[contains(@id,'ShortDescription_button') and text()='asmd m,sand,mna,d,msa']/ancestor::td[contains(@id,'ShortDescription_Cell')]/following-sibling::td[contains(@id,'UWIssueRowSet-6')]//div[contains(@id,'UWIssueRowSet-Reject')]");
	private static By RA_UI_Reopen = By.xpath(
			"//div[contains(@id,'ShortDescription_button') and text()='asmd m,sand,mna,d,msa']/ancestor::td[contains(@id,'ShortDescription_Cell')]/following-sibling::td[contains(@id,'UWIssueRowSet-6')]//div[contains(@id,'UWIssueRowSet-Reopen')]");

	/*
	 * Risk Approval Details
	 */

	/*
	 * NewApproval
	 */
	private static By RAD_NewApproval = By.xpath("//div[contains(@class,'gw-ListView--UI--title') and @role = 'heading' and text()='New Approval']");

	private static By RAD_NA_AllowEdit_Yes = By.xpath("//input[contains(@id,'UWApprovalLV-EditBeforeBind_0')]");
	private static By RAD_NA_AllowEdit_No  = By.xpath("//input[contains(@id,'UWApprovalLV-EditBeforeBind_1')]");
	private static By RAD_NA_Through       = By.xpath("//select[contains(@name,'UWApprovalLV-BlockingPoint')]");
	private static By RAD_NA_Validuntil    = By.xpath("//select[contains(@name,'UWApprovalLV-Duration')]");

	/*
	 * History
	 */
	private static By RAD_History = By.xpath("//div[contains(@class,'gw-ListView--UI--title') and @role = 'heading' and text()='History']");

	private static By RAD_H_User              = By.xpath("//tr[contains(@id,'UWIssueHistoryLV')]/td[contains(@id,'ResponsibleUser_Cell')]//div[contains(@id,'ResponsibleUser')]//div[@class='gw-value-readonly-wrapper']");
	private static By RAD_H_Date              = By.xpath("//tr[contains(@id,'UWIssueHistoryLV')]/td[contains(@id,'HistoryCreateDate_Cell')]//div[contains(@id,'HistoryCreateDate')]//div[@class='gw-value-readonly-wrapper']");
	private static By RAD_H_EffectiveDate     = By.xpath("//tr[contains(@id,'UWIssueHistoryLV')]/td[contains(@id,'HistoryEffDate_Cell')]//div[contains(@id,'HistoryEffDate')]//div[@class='gw-value-readonly-wrapper']");
	private static By RAD_H_PolicyTransaction = By.xpath("//tr[contains(@id,'UWIssueHistoryLV')]/td[contains(@id,'Job_Cell')]//div[contains(@id,'Job')]//div[@class='gw-value-readonly-wrapper']");
	private static By RAD_H_AllowEdit         = By.xpath("//tr[contains(@id,'UWIssueHistoryLV')]/td[contains(@id,'EditBeforeBind_Cell')]//div[contains(@id,'EditBeforeBind')]/div");
	private static By RAD_H_Though            = By.xpath("//tr[contains(@id,'UWIssueHistoryLV')]/td[contains(@id,'ThroughValue_Cell')]//div[contains(@id,'ThroughValue')]//div[@class='gw-value-readonly-wrapper']");
	private static By RAD_H_ValidUntil        = By.xpath("//tr[contains(@id,'UWIssueHistoryLV')]/td[contains(@id,'InvalidFrom_Cell')]//div[contains(@id,'InvalidFrom')]/div");
	private static By RAD_H_Status            = By.xpath("//tr[contains(@id,'UWIssueHistoryLV')]/td[contains(@id,'HistoryStatus_Cell')]//div[contains(@id,'HistoryStatus')]//div[@class='gw-label']");

	/*
	 * Contingencies
	 */

	private static By RA_AddContingency_Button = By.xpath("//div[contains(@id,'RiskAnalysisCV_tb-AddNewContingencyButton')]//div[@class='gw-label' and text()='Add Contingency']");
	private static By RA_AC_NewContingency     = By.xpath("//div[@class='gw-TitleBar--title' and text()='New Contingency']");

	private static By RA_AC_NC_Title       = By.xpath("//input[contains(@name,'ContingencyTitle')]");
	private static By RA_AC_NC_Description = By.xpath("//textarea[contains(@name,'ContingencyDescription')]");
	private static By RA_AC_NC_Action      = By.xpath("//select[contains(@name,'ContingencyAction')]");
	private static By RA_AC_NC_DueDate     = By.xpath("//input[contains(@class,'dateInput') and contains(@name,'ContingencyDueDate')]");

	/*
	 * Contingencies Tab
	 */
	private static By RA_Tab_Contingencies = By.xpath("//div[contains(@id,'RiskAnalysisCV-ContingenciesCardTab')]//div[@class='gw-label' and text()='Contingencies']");

	private static By RA_C_Pending         = By.xpath("//div[contains(@class,'gw-ListView--UI-section')]//div[@class='gw-ListView--UI--title' and @role='heading' and text()='Pending']");
	private static By RA_C_Title           = By.xpath("//td[contains(@id,'ContingencyTitle_Cell')]//div[contains(@id,'ContingencyTitle') and contains(@class,'gw-actionValue')]//div[contains(@id,'ContingencyTitle_button')]");
	private static By RA_C_DueDate         = By.xpath(
			"//div[contains(@id,'ContingencyTitle_button') and text()='gdgsdgsdfsdf']/ancestor::td[contains(@id,'ContingencyTitle_Cell')]/following-sibling::td[contains(@id,'DueDate_Cell')]//div[contains(@id,'DueDate')]//div[@class='gw-value-readonly-wrapper']");
	private static By RA_C_PotentialAction = By.xpath(
			"//div[contains(@id,'ContingencyTitle_button') and text()='gdgsdgsdfsdf']/ancestor::td[contains(@id,'ContingencyTitle_Cell')]/following-sibling::td[contains(@id,'PotentialAction_Cell')]//div[contains(@id,'PotentialAction')]//div[@class='gw-value-readonly-wrapper']");
	private static By RA_C_AddedBy         = By.xpath(
			"//div[contains(@id,'ContingencyTitle_button') and text()='gdgsdgsdfsdf']/ancestor::td[contains(@id,'ContingencyTitle_Cell')]/following-sibling::td[contains(@id,'AddedBy_Cell')]//div[contains(@id,'AddedBy')]//div[@class='gw-value-readonly-wrapper']");
	private static By RA_C_On              = By.xpath(
			"//div[contains(@id,'ContingencyTitle_button') and text()='gdgsdgsdfsdf']/ancestor::td[contains(@id,'ContingencyTitle_Cell')]/following-sibling::td[contains(@id,'On_Cell')]//div[contains(@id,'On')]//div[@class='gw-value-readonly-wrapper']");

	/*
	 * 
	 * UW Activity
	 */
	private static By RA_UWA_Subject        = By.xpath("//input[contains(@name,'NewActivityDV-Subject')]");
	private static By RA_UWA_Description    = By.xpath("//input[contains(@name,'NewActivityDV-Description')]");
	private static By RA_UWA_DueDate        = By.xpath("//input[contains(@name,'NewActivityDV-TargetDate')]");
	private static By RA_UWA_EscalationDate = By.xpath("//input[contains(@name,'NewActivityDV-EscalationDate')]");
	private static By RA_UWA_Priority       = By.xpath("//select[contains(@name,'NewActivityDV-Priority')]");
	private static By RA_UWA_Mandatory_Yes  = By.xpath("//input[contains(@id,'NewActivityDV-Mandatory_0')]");
	private static By RA_UWA_Mandatory_No   = By.xpath("//input[contains(@id,'NewActivityDV-Mandatory_1')]");
	private static By RA_UWA_Recurring_Yes  = By.xpath("//input[contains(@id,'NewActivityDV-Recurring_0')]");
	private static By RA_UWA_Recurring_No   = By.xpath("//input[contains(@id,'NewActivityDV-Recurring_1')]");
	private static By RA_UWA_AssignTo       = By.xpath("//select[contains(@name,'NewActivityDV-SelectFromList')]");
	/*
	 * New Note
	 */
	private static By RA_UWA_NewNote = By.xpath("//div[contains(@class,'gw-boldLabel') and text()='New Note']");

	private static By RA_UWA_NN_Topic         = By.xpath("//select[contains(@name,'ActivityDetailNoteDV-Topic')]");
	private static By RA_UWA_NN_Subject       = By.xpath("//input[contains(@name,'ActivityDetailNoteDV-NoteSubject')]");
	private static By RA_UWA_NN_RelatedTo     = By.xpath("//div[contains(@class,'gw-ToolbarButtonWidget')]//div[@class='gw-minimized-view']/following-sibling::div[text()='Cance']");
	private static By RA_UWA_NN_SecurityLevel = By.xpath("//select[contains(@name,'ActivityDetailNoteDV-SecurityLevel')]");
	private static By RA_UWA_NN_Text          = By.xpath("//textarea[contains(@name,'ActivityDetailNoteDV-Text')]");

	private static By RA_UWA_Release = By.xpath("//div[contains(@class,'gw-ToolbarButtonWidget')]//div[@class='gw-minimized-view']/following-sibling::div[text()='Release']");

	/*
	 * Prior Policies Tab
	 */

	private static By RA_Tab_PriorPolicies = By.xpath("//div[contains(@id,'RiskAnalysisCV-PriorPolicyCardTab')]//div[@class='gw-label' and text()='Prior Policies']");

	private static By RA_PP_PriorPolicies = By.xpath("//div[contains(@class,'gw-LabelWidget')]/div[contains(@class,'gw-label') and text()='Prior Policies']");

	private static By RA_PP_Add_Button    = By.xpath("//div[contains(@id,'PriorPolicyLV_tb-Add')]/div[@role='button']");
	private static By RA_PP_Remove_Button = By.xpath("//div[contains(@id,'PriorPolicyLV_tb-Remove')]/div[@role='button']");

	private static By RA_PP_Select = By
			.xpath("//tr[contains(@id,'PriorPolicyLV') and contains(@class,'gw-standard-row')]/td[contains(@class,'gw-impl-cell--CB')]//div[contains(@id,'_Checkbox') and contains(@class,'gw-IteratorEntryCheckBoxWidget')]/input[@type='checkbox']");

	private static By RA_PP_Carrier = By.xpath(
			"//tr[contains(@id,'PriorPolicyLV') and contains(@class,'gw-standard-row')]/td[contains(@id,'Carrier_Cell') and contains(@class,'gw-CellWidget')]//div[contains(@id,'Carrier') and contains(@class,'gw-editable')]//input[contains(@name,'Carrier')]");

	private static By RA_PP_Policy = By.xpath(
			"//tr[contains(@id,'PriorPolicyLV') and contains(@class,'gw-standard-row')]/td[contains(@id,'PolicyNumber_Cell') and contains(@class,'gw-CellWidget')]//div[contains(@id,'PolicyNumber') and contains(@class,'gw-editable')]//input[contains(@name,'PolicyNumber')]");

	private static By RA_PP_EffectiveDate = By.xpath(
			"//tr[contains(@id,'PriorPolicyLV') and contains(@class,'gw-standard-row')]/td[contains(@id,'EffectiveDate_Cell') and contains(@class,'gw-CellWidget')]//div[contains(@id,'EffectiveDate') and contains(@class,'gw-editable')]//input[contains(@name,'EffectiveDate')]");

	private static By RA_PP_ExpirationDate = By.xpath(
			"//tr[contains(@id,'PriorPolicyLV') and contains(@class,'gw-standard-row')]/td[contains(@id,'ExpirationDate_Cell') and contains(@class,'gw-CellWidget')]//div[contains(@id,'ExpirationDate') and contains(@class,'gw-editable')]//input[contains(@name,'ExpirationDate')]");

	private static By RA_PP_AnnualPremium = By.xpath(
			"//tr[contains(@id,'PriorPolicyLV') and contains(@class,'gw-standard-row')]/td[contains(@id,'AnnualPremium_Cell') and contains(@class,'gw-CellWidget')]//div[contains(@id,'AnnualPremium') and contains(@class,'gw-editable')]//input[contains(@name,'AnnualPremium')]");

	private static By RA_PP_Losses = By.xpath(
			"//tr[contains(@id,'PriorPolicyLV') and contains(@class,'gw-standard-row')]/td[contains(@id,'Losses_Cell') and contains(@class,'gw-CellWidget')]//div[contains(@id,'Losses') and contains(@class,'gw-editable')]//input[contains(@name,'Losses')]");

	private static By RA_PP_TotalLosses = By.xpath(
			"//tr[contains(@id,'PriorPolicyLV') and contains(@class,'gw-standard-row')]/td[contains(@id,'TotalLosses_Cell') and contains(@class,'gw-CellWidget')]//div[contains(@id,'TotalLosses') and contains(@class,'gw-editable')]//input[contains(@name,'TotalLosses')]");

	/*
	 * Prior Loses Tab
	 */

	private static By RA_Tab_PriorLosses = By.xpath("//div[contains(@id,'RiskAnalysisCV-LossHistoryCardTab')]//div[@class='gw-label' and text()='Prior Losses']");

	private static By RA_PL_PriorLosses = By.xpath("//div[contains(@class,'gw-LabelWidget')]/div[contains(@class,'gw-label') and text()='Prior Losses']");

	private static By RA_PL_LossHistoryType = By.xpath("//select[contains(@name,'LossHistoryType')]");

	private static By RA_PL_Add_Button    = By.xpath("//div[contains(@id,'ManualLossHistoryLV_tb-Add')]/div[@role='button']");
	private static By RA_PL_Remove_Button = By.xpath("//div[contains(@id,'ManualLossHistoryLV_tb-Remove')]/div[@role='button']");

	private static By RA_PL_Select = By
			.xpath("//tr[contains(@id,'PriorPolicyLV') and contains(@class,'gw-standard-row')]/td[contains(@class,'gw-impl-cell--CB')]//div[contains(@id,'_Checkbox') and contains(@class,'gw-IteratorEntryCheckBoxWidget')]/input[@type='checkbox']");

	private static By RA_PL_OccurrenceDate = By.xpath(
			"//tr[contains(@id,'PriorPolicyLV') and contains(@class,'gw-standard-row')]/td[contains(@id,'Carrier_Cell') and contains(@class,'gw-CellWidget')]//div[contains(@id,'Carrier') and contains(@class,'gw-editable')]//input[contains(@name,'Carrier')]");

	private static By RA_PL_Description = By.xpath(
			"//tr[contains(@id,'PriorPolicyLV') and contains(@class,'gw-standard-row')]/td[contains(@id,'EffectiveDate_Cell') and contains(@class,'gw-CellWidget')]//div[contains(@id,'EffectiveDate') and contains(@class,'gw-editable')]//input[contains(@name,'EffectiveDate')]");

	private static By RA_PL_TotalIncurred = By.xpath(
			"//tr[contains(@id,'PriorPolicyLV') and contains(@class,'gw-standard-row')]/td[contains(@id,'ExpirationDate_Cell') and contains(@class,'gw-CellWidget')]//div[contains(@id,'ExpirationDate') and contains(@class,'gw-editable')]//input[contains(@name,'ExpirationDate')]");

	private static By RA_PL_AmountPaid = By.xpath(
			"//tr[contains(@id,'PriorPolicyLV') and contains(@class,'gw-standard-row')]/td[contains(@id,'AnnualPremium_Cell') and contains(@class,'gw-CellWidget')]//div[contains(@id,'AnnualPremium') and contains(@class,'gw-editable')]//input[contains(@name,'AnnualPremium')]");

	private static By RA_PL_OpenReserve = By.xpath(
			"//tr[contains(@id,'PriorPolicyLV') and contains(@class,'gw-standard-row')]/td[contains(@id,'Losses_Cell') and contains(@class,'gw-CellWidget')]//div[contains(@id,'Losses') and contains(@class,'gw-editable')]//input[contains(@name,'Losses')]");

	private static By RA_PL_Status = By.xpath(
			"//tr[contains(@id,'PriorPolicyLV') and contains(@class,'gw-standard-row')]/td[contains(@id,'TotalLosses_Cell') and contains(@class,'gw-CellWidget')]//div[contains(@id,'TotalLosses') and contains(@class,'gw-editable')]//input[contains(@name,'TotalLosses')]");
	/*
	 * Issues that block issuance
	 */
	private static By     IBA_UWIssuesthatblockissuance = By.xpath("//div[contains(@class,'gw-boldLabel') and text()='UW Issues that block issuance']");
	private static By     IBA_UWI_IssueName             = By.xpath("//div[contains(@id,'ShortDescriptionAndSize_Input')]//div[contains(@class,'gw-ValueWidget')]");
	private static By     IBA_Details_Button            = By.xpath("//div[contains(@id,'DetailsButton')]/div[@role='button']");
	private static String strShortDescription;

	/*
	 * Adding an Underwriter Issue
	 */

	public static void addUWIssue() throws Throwable {

		lhm_TestCase_Table_Data = PA_Reusable.getData_PersonalAuto("riskAnalysis");

		// Validating Risk Analysis screen
		GuidewireAutomate_Validation("Screen Header", PolicyCenter_Resuables_PO.RiskAnalysis_Header, "equals", "Risk Analysis");

		GuidewireAutomate("Add UW Issue", RA_AddUWIssue_Button, "clickAndwait", "NA");

		GuidewireAutomate_Validation("Create New UW Issue", RA_AUI_CreateNewUWIssue, "equals", "Create New UW Issue");

		// Entering value for the fields
		GuidewireAutomate("Issue Type selector", RA_AUI_CNUI_IssueType, "selectByVisibleText", lhm_TestCase_Table_Data.get("RA_AUI_CNUI_IssueType"));
		GuidewireAutomate("Short Description", RA_AUI_CNUI_ShortDescription, "clearANDsendKeys", lhm_TestCase_Table_Data.get("RA_AUI_CNUI_ShortDescription"));
		GuidewireAutomate("Long Description", RA_AUI_CNUI_LongDescription, "clearANDsendKeys", lhm_TestCase_Table_Data.get("RA_AUI_CNUI_LongDescription"));
		// Creating an UW issue
		GuidewireAutomate("Create an UW Issue", RA_OK_Button, "click", "click");

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();

	}

	public static void approveUWIssues() throws Throwable {
		lhm_TestCase_Table_Data = PA_Reusable.getData_PersonalAuto("riskAnalysis");

		/*
		 * UWIssues Tab
		 */
		GuidewireAutomate_Validation("Risk Analysis", PolicyCenter_Resuables_PO.RiskAnalysis_Header, "equals", "Risk Analysis");

		GuidewireAutomate("UWIssues Tab", RA_Tab_UWIssues, "clickAndwait", "NA");

		// GuidewireAutomate_Validation("Blocking Issuance",
		// RA_UI_BlockingIssuance, "equals", "Blocking Issuance");

		GuidewireAutomate("ViewIssuesBlocking", RA_UI_ViewIssuesBlocking, "selectByVisibleText", lhm_TestCase_Table_Data.get("RA_UI_ViewIssuesBlocking"));

		strShortDescription = lhm_TestCase_Table_Data.get("RA_AUI_CNUI_ShortDescription").trim();

		By RA_UI_Select = By
				.xpath("//div[contains(@id,'ShortDescription_button') and text()='" + strShortDescription + "']/ancestor::td[contains(@id,'ShortDescription_Cell')]/preceding-sibling::td[contains(@class,'gw-impl-cell--CB')]//input[@type='checkbox']");
		GuidewireAutomate(strShortDescription, RA_UI_Select, "click", strShortDescription);

		By RA_UI_Name = By.xpath("//td[contains(@id,'ShortDescription_Cell')]//div[contains(@id,'ShortDescription_button') and text()='" + strShortDescription + "']");
		GuidewireAutomate_Validation("Name", RA_UI_Name, "equals", strShortDescription);

		By RA_UI_Approve = By.xpath("//div[contains(@id,'ShortDescription_button') and text()='" + strShortDescription
				+ "']/ancestor::td[contains(@id,'ShortDescription_Cell')]/following-sibling::td[contains(@id,'UWIssueRowSet-6')]//div[contains(@id,'UWIssueRowSet-Approve')]");
		GuidewireAutomate("UWIssues Approve", RA_UI_Approve, "click", strShortDescription);

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	public static void rejectUWIssues() throws Throwable {
		lhm_TestCase_Table_Data = PA_Reusable.getData_PersonalAuto("riskAnalysis");

		/*
		 * UWIssues Tab
		 */
		GuidewireAutomate_Validation("Risk Analysis", PolicyCenter_Resuables_PO.RiskAnalysis_Header, "equals", "Risk Analysis");

		GuidewireAutomate("UWIssues Tab", RA_Tab_UWIssues, "click", "NA");
		GuidewireAutomate_Validation("Blocking Issuance", RA_UI_BlockingIssuance, "equals", "Blocking Issuance");

		GuidewireAutomate("ViewIssuesBlocking", RA_UI_ViewIssuesBlocking, "selectByVisibleText", lhm_TestCase_Table_Data.get("RA_UI_ViewIssuesBlocking"));

		strShortDescription = lhm_TestCase_Table_Data.get("RA_AUI_CNUI_ShortDescription");

		By RA_UI_Select = By
				.xpath("//div[contains(@id,'ShortDescription_button') and text()='" + strShortDescription + "']/ancestor::td[contains(@id,'ShortDescription_Cell')]/preceding-sibling::td[contains(@class,'gw-impl-cell--CB')]//input[@type='checkbox']");
		GuidewireAutomate("ViewIssuesBlocking", RA_UI_Select, "click", strShortDescription);

		By RA_UI_Name = By.xpath("//div[contains(@id,'ShortDescription_button') and text()='" + strShortDescription
				+ "']/ancestor::td[contains(@id,'ShortDescription_Cell')]/following-sibling::td[contains(@id,'UWIssueRowSet-6')]//td[contains(@id,'ShortDescription_Cell')]//div[contains(@id,'ShortDescription') and contains(@class,'gw-actionValue')]");
		GuidewireAutomate_Validation("Name = " + strShortDescription, RA_UI_Name, "equals", strShortDescription);

		GuidewireAutomate("UWIssues Reject", RA_UI_Reject, "click", lhm_TestCase_Table_Data.get("RA_UI_Reject"));

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();

	}

	public static void reopenUWIssues() throws Throwable {
		lhm_TestCase_Table_Data = PA_Reusable.getData_PersonalAuto("riskAnalysis");

		/*
		 * UWIssues Tab
		 */
		GuidewireAutomate_Validation("Risk Analysis", PolicyCenter_Resuables_PO.RiskAnalysis_Header, "equals", "Risk Analysis");

		GuidewireAutomate("UWIssues Tab", RA_Tab_UWIssues, "click", "NA");
		GuidewireAutomate_Validation("Blocking Issuance", RA_UI_BlockingIssuance, "equals", "Blocking Issuance");

		GuidewireAutomate("ViewIssuesBlocking", RA_UI_ViewIssuesBlocking, "selectByVisibleText", lhm_TestCase_Table_Data.get("RA_UI_ViewIssuesBlocking"));

		strShortDescription = lhm_TestCase_Table_Data.get("RA_AUI_CNUI_ShortDescription");

		By RA_UI_Select = By
				.xpath("//div[contains(@id,'ShortDescription_button') and text()='" + strShortDescription + "']/ancestor::td[contains(@id,'ShortDescription_Cell')]/preceding-sibling::td[contains(@class,'gw-impl-cell--CB')]//input[@type='checkbox']");
		GuidewireAutomate("ViewIssuesBlocking", RA_UI_Select, "click", strShortDescription);

		By RA_UI_Name = By.xpath("//div[contains(@id,'ShortDescription_button') and text()='" + strShortDescription
				+ "']/ancestor::td[contains(@id,'ShortDescription_Cell')]/following-sibling::td[contains(@id,'UWIssueRowSet-6')]//td[contains(@id,'ShortDescription_Cell')]//div[contains(@id,'ShortDescription') and contains(@class,'gw-actionValue')]");
		GuidewireAutomate_Validation("Name = " + strShortDescription, RA_UI_Name, "equals", strShortDescription);

		GuidewireAutomate("UWIssues Reopen", RA_UI_Reopen, "click", lhm_TestCase_Table_Data.get("RA_UI_Reopen"));

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();

	}

	public static void riskApprovalDetails() throws Throwable {

		lhm_TestCase_Table_Data = PA_Reusable.getData_PersonalAuto("riskAnalysis");

		// Validating Risk Approval Details screen
		GuidewireAutomate_Validation("Screen Header", PolicyCenter_Resuables_PO.RiskApprovalDetails_Header, "equals", "Risk Approval Details");

		GuidewireAutomate_Validation("New Approval", RAD_NewApproval, "equals", "New Approval");

		if (lhm_TestCase_Table_Data.get("RAD_NA_AllowEdit").equalsIgnoreCase("Yes")) {
			GuidewireAutomate("AllowEdit Yes", RAD_NA_AllowEdit_Yes, "click", lhm_TestCase_Table_Data.get("RAD_NA_AllowEdit"));
		} else if (lhm_TestCase_Table_Data.get("RAD_NA_AllowEdit").equalsIgnoreCase("No")) {
			GuidewireAutomate("AllowEdit No", RAD_NA_AllowEdit_No, "click", lhm_TestCase_Table_Data.get("RAD_NA_AllowEdit"));
		}

		GuidewireAutomate("Action", RAD_NA_Through, "selectByVisibleText", lhm_TestCase_Table_Data.get("RAD_NA_Through"));
		GuidewireAutomate("Action", RAD_NA_Validuntil, "selectByVisibleText", lhm_TestCase_Table_Data.get("RAD_NA_Validuntil"));

		GuidewireAutomate_Validation("History", RAD_History, "equals", "History");

		GuidewireAutomate_Validation("User", RAD_H_User, "equals", lhm_TestCase_Table_Data.get("RAD_H_User"));
		GuidewireAutomate_Validation("Date", RAD_H_Date, "equals", lhm_TestCase_Table_Data.get("RAD_H_Date"));
		GuidewireAutomate_Validation("Effective Date", RAD_H_EffectiveDate, "equals", lhm_TestCase_Table_Data.get("RAD_H_EffectiveDate"));
		GuidewireAutomate_Validation("Policy Transaction", RAD_H_PolicyTransaction, "contains", lhm_TestCase_Table_Data.get("RAD_H_PolicyTransaction"));
		/*
		 * GuidewireAutomate_Validation("Allow Edit", RAD_H_AllowEdit, "equals", lhm_TestCase_Table_Data.get("RAD_H_AllowEdit"));
		 * GuidewireAutomate_Validation("Though", RAD_H_Though, "equals", lhm_TestCase_Table_Data.get("RAD_H_Though"));
		 * GuidewireAutomate_Validation("Valid Until", RAD_H_ValidUntil, "equals", lhm_TestCase_Table_Data.get("RAD_H_ValidUntil"));
		 */

		GuidewireAutomate_Validation("Status", RAD_H_Status, "equals", lhm_TestCase_Table_Data.get("RAD_H_Status"));

		PolicyCenter_Resuables.clickButton("OK");

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	/*
	 * Adding a Contingency
	 */

	public static void addUWContingency() throws Throwable {
		// Validating Contingency screen

		lhm_TestCase_Table_Data = PA_Reusable.getData_PersonalAuto("riskAnalysis");

		GuidewireAutomate_Validation("Risk Analysis", PolicyCenter_Resuables_PO.RiskAnalysis_Header, "equals", "Risk Analysis");
		GuidewireAutomate("Add Contingency", RA_AddContingency_Button, "click", "NA");

		GuidewireAutomate_Validation("New Contingency", RA_AC_NewContingency, "equals", "New Contingency");
		// Creating Contingency
		GuidewireAutomate("Title", RA_AC_NC_Title, "sendKeys", lhm_TestCase_Table_Data.get("RA_AC_NC_Title"));
		GuidewireAutomate("Description", RA_AC_NC_Description, "sendKeys", lhm_TestCase_Table_Data.get("RA_AC_NC_Description"));
		GuidewireAutomate("Action", RA_AC_NC_Action, "selectByVisibleText", lhm_TestCase_Table_Data.get("RA_AC_NC_Action"));
		GuidewireAutomate("Due Date", RA_AC_NC_DueDate, "sendKeys", lhm_TestCase_Table_Data.get("RA_AC_NC_DueDate"));

		GuidewireAutomate("OK", RA_OK_Button, "click", "NA");

		PolicyCenter_Resuables.clickButton("OK");

		/*
		 * Contingencies Tab
		 */
		GuidewireAutomate("UWIssues Tab", RA_Tab_Contingencies, "click", "NA");

		GuidewireAutomate_Validation("Pending", RA_C_Pending, "equals", "Pending");

		GuidewireAutomate_Validation("Title", RA_C_Title, "equals", lhm_TestCase_Table_Data.get("RA_C_Title"));
		/*
		 * GuidewireAutomate_Validation("Due Date", RA_C_DueDate, "equals", lhm_TestCase_Table_Data.get("RA_C_DueDate"));
		 * GuidewireAutomate_Validation("Potential Action", RA_C_PotentialAction, "equals", lhm_TestCase_Table_Data.get("RA_C_PotentialAction"));
		 * GuidewireAutomate_Validation("AddedBy", RA_C_AddedBy, "equals", lhm_TestCase_Table_Data.get("RA_C_AddedBy"));
		 * GuidewireAutomate_Validation("On", RA_C_On, "equals", lhm_TestCase_Table_Data.get("RA_C_On"));
		 */
		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();

	}

	public static void requestApproval() throws Throwable {
		releaseLock();
	}

	public static void RA_LockForReview() throws Throwable {
		GuidewireAutomate_Validation("Risk Analysis", PolicyCenter_Resuables_PO.RiskAnalysis_Header, "equals", "Risk Analysis");

		GuidewireAutomate("Release Lock", RA_RequestApproval_Button, "click", "NA");

	}

	public static void addUWIssue_MandatoryValidation() throws Throwable {

		lhm_TestCase_Table_Data = PA_Reusable.getData_PersonalAuto("riskAnalysis");
		// Enter only short and long description values and click on OK
		GuidewireAutomate_Validation("Risk Analysis", PolicyCenter_Resuables_PO.RiskAnalysis_Header, "equals", "Risk Analysis");
		GuidewireAutomate("Add UW Issue", RA_AddUWIssue_Button, "click", "NA");

		GuidewireAutomate("Create an UW Issue", RA_OK_Button, "click", "NA");
		// Verifying error message and its focus
		GuidewireAutomate_Validation("Risk Analysis header", RA_Error_header, "equals", lhm_TestCase_Table_Data.get("RA_Error_header"));
		GuidewireAutomate_Validation("Risk Analysis message", RA_Error_message, "equals", lhm_TestCase_Table_Data.get("RA_Error_message"));
		GuidewireAutomate("Error message focus", RA_Error_focus, "click", "NA");

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();

	}

	public static void addUWIssue_CancelValidation() throws Throwable {
		// TODO Auto-generated method stub

	}

	public static void approveContingency() throws Throwable {
		// TODO Auto-generated method stub

	}

	public static void rejectContingency() throws Throwable {
		// TODO Auto-generated method stub

	}

	public static void reopenContingency() throws Throwable {
		// TODO Auto-generated method stub

	}

	public static void priorPolicies_Add() throws Throwable {
		lhm_TestCase_Table_Data = PA_Reusable.getData_PersonalAuto("riskAnalysis");

		/*
		 * UWIssues Tab
		 */
		GuidewireAutomate_Validation("Risk Analysis", PolicyCenter_Resuables_PO.RiskAnalysis_Header, "equals", "Risk Analysis");

		GuidewireAutomate("Prior Policies Tab", RA_Tab_PriorPolicies, "click", "NA");

		GuidewireAutomate_Validation("Prior Policies", RA_PP_PriorPolicies, "equals", "Prior Policies");

		GuidewireAutomate("Add", RA_PP_Add_Button, "click", "NA");

		GuidewireAutomate("Carrier", RA_PP_Carrier, "sendKeys", lhm_TestCase_Table_Data.get("RA_PP_Carrier"));
		GuidewireAutomate("Policy", RA_PP_Policy, "sendKeys", lhm_TestCase_Table_Data.get("RA_PP_Policy"));
		GuidewireAutomate("Effective Date", RA_PP_EffectiveDate, "sendKeys", lhm_TestCase_Table_Data.get("RA_PP_ExpirationDate"));
		GuidewireAutomate("Expiration Date", RA_PP_ExpirationDate, "sendKeys", lhm_TestCase_Table_Data.get("RA_PP_ExpirationDate"));
		GuidewireAutomate("Annual Premium", RA_PP_AnnualPremium, "sendKeys", lhm_TestCase_Table_Data.get("RA_PP_AnnualPremium"));
		GuidewireAutomate("Losses", RA_PP_Losses, "sendKeys", lhm_TestCase_Table_Data.get("RA_PP_Losses"));
		GuidewireAutomate("Total Losses", RA_PP_TotalLosses, "sendKeys", lhm_TestCase_Table_Data.get("RA_PP_TotalLosses"));

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();

	}

	public static void priorPolicies_Edit() throws Throwable {

		lhm_TestCase_Table_Data = PA_Reusable.getData_PersonalAuto("riskAnalysis");

		GuidewireAutomate_Validation("Risk Analysis", PolicyCenter_Resuables_PO.RiskAnalysis_Header, "equals", "Risk Analysis");

		GuidewireAutomate("Prior Policies Tab", RA_Tab_PriorPolicies, "click", "NA");

		GuidewireAutomate_Validation("Prior Policies", RA_PP_PriorPolicies, "equals", "Prior Policies");

		GuidewireAutomate("Select", RA_PP_Select, "click", "NA");

		GuidewireAutomate("Carrier", RA_PP_Carrier, "clearANDsendKeys", lhm_TestCase_Table_Data.get("RA_PP_Carrier"));
		GuidewireAutomate("Policy", RA_PP_Policy, "clearANDsendKeys", lhm_TestCase_Table_Data.get("RA_PP_Policy"));
		GuidewireAutomate("Effective Date", RA_PP_EffectiveDate, "clearANDsendKeys", lhm_TestCase_Table_Data.get("RA_PP_ExpirationDate"));
		GuidewireAutomate("Expiration Date", RA_PP_ExpirationDate, "clearANDsendKeys", lhm_TestCase_Table_Data.get("RA_PP_ExpirationDate"));
		GuidewireAutomate("Annual Premium", RA_PP_AnnualPremium, "clearANDsendKeys", lhm_TestCase_Table_Data.get("RA_PP_AnnualPremium"));
		GuidewireAutomate("Losses", RA_PP_Losses, "sendKeys", lhm_TestCase_Table_Data.get("RA_PP_Losses"));
		GuidewireAutomate("Total Losses", RA_PP_TotalLosses, "clearANDsendKeys", lhm_TestCase_Table_Data.get("RA_PP_TotalLosses"));

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();

	}

	public static void priorPolicies_Remove() throws Throwable {
		GuidewireAutomate("Prior Policies Tab", RA_Tab_PriorPolicies, "click", "NA");

		GuidewireAutomate_Validation("Prior Policies", RA_PP_PriorPolicies, "equals", "Prior Policies");

		GuidewireAutomate("Select", RA_PP_Select, "click", "NA");
		GuidewireAutomate("Add", RA_PP_Remove_Button, "click", "NA");

	}

	public static void RA_Claims_Search() throws Throwable {
		// TODO Auto-generated method stub

	}

	public static void priorLosses_Add() throws Throwable {
		lhm_TestCase_Table_Data = PA_Reusable.getData_PersonalAuto("riskAnalysis");

		/*
		 * PriorPolicies Tab
		 */
		GuidewireAutomate("Prior Policies Tab", RA_Tab_PriorPolicies, "click", "NA");

		GuidewireAutomate_Validation("Prior Policies", RA_PP_PriorPolicies, "equals", "Prior Policies");

		GuidewireAutomate("Add", RA_PL_Add_Button, "click", "NA");
		GuidewireAutomate("Loss history type", RA_PL_LossHistoryType, "sendKeys", lhm_TestCase_Table_Data.get("RA_PL_LossHistoryType"));

		GuidewireAutomate("Occurrence Date", RA_PL_OccurrenceDate, "sendKeys", lhm_TestCase_Table_Data.get("RA_PL_OccurrenceDate"));
		GuidewireAutomate("Description", RA_PL_Description, "sendKeys", lhm_TestCase_Table_Data.get("RA_PL_Description"));
		GuidewireAutomate("Total Incurred", RA_PL_TotalIncurred, "sendKeys", lhm_TestCase_Table_Data.get("RA_PL_TotalIncurred"));
		GuidewireAutomate("Amount Paid", RA_PL_AmountPaid, "sendKeys", lhm_TestCase_Table_Data.get("RA_PL_AmountPaid"));
		GuidewireAutomate("Open Reserve", RA_PL_OpenReserve, "sendKeys", lhm_TestCase_Table_Data.get("RA_PL_OpenReserve"));
		GuidewireAutomate("Status", RA_PL_Status, "sendKeys", lhm_TestCase_Table_Data.get("RA_PL_Status"));

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();

	}

	public static void priorLosses_Edit() throws Throwable {
		// TODO Auto-generated method stub

	}

	public static void priorLosses_Remove() throws Throwable {
		// TODO Auto-generated method stub

	}

	public static void RA_MVR_Search_Validate() throws Throwable {
		// TODO Auto-generated method stub

	}

	/*
	 * Verifying Mandatory field and its corresponding error message
	 */

	public static void releaseLock() throws Throwable {
		lhm_TestCase_Table_Data = PA_Reusable.getData_PersonalAuto("riskAnalysis");

		GuidewireAutomate_Validation("UW Activity", PolicyCenter_Resuables_PO.RiskAnalysis_Header, "equals", "UW Activity");

		GuidewireAutomate_Validation("Subject", RA_UWA_Subject, "valueEquals", lhm_TestCase_Table_Data.get("RA_UWA_Subject"));

		GuidewireAutomate("Description", RA_UWA_Description, "sendKeys", lhm_TestCase_Table_Data.get("RA_UWA_Description"));
		GuidewireAutomate("Due Date", RA_UWA_DueDate, "clearANDsendKeys", lhm_TestCase_Table_Data.get("RA_UWA_DueDate"));
		GuidewireAutomate("Escalation Date", RA_UWA_EscalationDate, "clearANDsendKeys", lhm_TestCase_Table_Data.get("RA_UWA_EscalationDate"));
		GuidewireAutomate("Priority", RA_UWA_Priority, "selectByVisibleText", lhm_TestCase_Table_Data.get("RA_UWA_Priority"));
		GuidewireAutomate("Mandatory", RA_UWA_Mandatory_No, "click", lhm_TestCase_Table_Data.get("RA_UWA_Mandatory"));
		GuidewireAutomate("Recurring", RA_UWA_Recurring_No, "click", lhm_TestCase_Table_Data.get("RA_UWA_Recurring"));
		GuidewireAutomate("Assign To", RA_UWA_AssignTo, "selectByVisibleText", lhm_TestCase_Table_Data.get("RA_UWA_AssignTo"));

		GuidewireAutomate_Validation("New Note", RA_UWA_NewNote, "equals", "New Note");
		GuidewireAutomate("Topic", RA_UWA_NN_Topic, "selectByVisibleText", lhm_TestCase_Table_Data.get("RA_UWA_NN_Topic"));
		GuidewireAutomate("Subject", RA_UWA_NN_Subject, "sendKeys", lhm_TestCase_Table_Data.get("RA_UWA_NN_Subject"));
		GuidewireAutomate("Security Level", RA_UWA_NN_SecurityLevel, "selectByVisibleText", lhm_TestCase_Table_Data.get("RA_UWA_NN_SecurityLevel"));
		GuidewireAutomate("Text", RA_UWA_NN_Text, "sendKeys", lhm_TestCase_Table_Data.get("RA_UWA_NN_Text"));

		GuidewireAutomate("Release", RA_UWA_Release, "click", "click");

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();

	}

	public static void button_Verify() throws Throwable {
		// Validating Risk Analysis screen
		GuidewireAutomate_Validation("Screen Header", PolicyCenter_Resuables_PO.RiskAnalysis_Header, "equals", "Risk Analysis");

		GuidewireAutomate_Validation("Add UWIssue", RA_AddUWIssue_Button, "isDisplayed", "true");
		GuidewireAutomate_Validation("Add Contingency", RA_AddContingency_Button, "isDisplayed", "true");
		GuidewireAutomate_Validation("Request Approval", RA_RequestApproval_Button, "isDisplayed", "true");

	}

	public static void issuesthatblockIssuance() throws Throwable {

		// Validating Risk Analysis screen
		GuidewireAutomate_Validation("Screen Header", PolicyCenter_Resuables_PO.IssuesthatblockIssuance_Header, "equals", "Issues that block Issuance");
		GuidewireAutomate_Validation("UW Issues that block issuance", IBA_UWIssuesthatblockissuance, "equals", "UW Issues that block issuance");

		GuidewireAutomate_Validation("New period end date", IBA_UWI_IssueName, "equals", "New period end date does not match end date of previous period.");

		GuidewireAutomate("Details", IBA_Details_Button, "click", "click");

	}

}
