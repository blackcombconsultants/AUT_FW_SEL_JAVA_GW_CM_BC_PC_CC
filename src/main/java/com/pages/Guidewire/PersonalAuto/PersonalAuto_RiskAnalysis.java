package com.pages.Guidewire.PersonalAuto;

import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;
import com.pages.Guidewire.PolicyCenter.GW_PolicyCenter_Resuables;

public class PersonalAuto_RiskAnalysis extends SeleniumWebDriver_Commands implements PersonalAuto_RiskAnalysis_PO {
	Selenium_Utils_DataBase oDB = new Selenium_Utils_DataBase();

	public PersonalAuto_RiskAnalysis(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	/*
	 * Adding an Underwriter Issue
	 */
	@Override
	public void RA_AddUWIssue() throws Throwable {

		// Validating Risk Analysis screen
		GuidewireAutomate_Validation("Screen Header", PersonalAuto_NewSubmission_ReusablePO.Screen_Header, "equals",
				"Risk Analysis");

		GuidewireAutomate("Add UW Issue", RA_AddUWIssue_Button, "click", "NA");

		GuidewireAutomate_Validation("Create New UW Issue", RA_AUI_CreateNewUWIssue, "equals", "Create New UW Issue");

		// Entering value for the fields
		GuidewireAutomate("Issue Type selector", RA_AUI_CNUI_IssueType, "selectByVisibleText",
				lhm_TestCase_Table_Data.get("RA_AUI_CNUI_IssueType"));
		GuidewireAutomate_Validation("Short Description", RA_AUI_CNUI_ShortDescription, "equals",
				lhm_TestCase_Table_Data.get("RA_AUI_CNUI_ShortDescription"));
		GuidewireAutomate_Validation("Long Description", RA_AUI_CNUI_LongDescription, "sendkeys",
				lhm_TestCase_Table_Data.get("RA_AUI_CNUI_LongDescription"));
		// Creating an UW issue
		GuidewireAutomate("Create an UW Issue", RA_OK_Button, "click", "NA");

		/*
		 * UWIssues Tab
		 */
		GuidewireAutomate("UWIssues Tab", RA_Tab_UWIssues, "click", "NA");
		GuidewireAutomate_Validation("ViewIssuesBlocking", RA_UI_ViewIssuesBlocking, "selectByVisibleText",
				lhm_TestCase_Table_Data.get("RA_UI_ViewIssuesBlocking"));

		GuidewireAutomate("UWIssues Select", RA_UI_Select, "click", lhm_TestCase_Table_Data.get("RA_UI_Select"));
		GuidewireAutomate_Validation("Name", RA_UI_Name, "equals", lhm_TestCase_Table_Data.get("RA_UI_Name"));
		
		GuidewireAutomate("UWIssues Approve", RA_UI_Approve, "click", lhm_TestCase_Table_Data.get("RA_UI_Approve"));
		GuidewireAutomate("UWIssues Reject", RA_UI_Reject, "click", lhm_TestCase_Table_Data.get("RA_UI_Reject"));
		GuidewireAutomate("UWIssues Reopen", RA_UI_Reopen, "click", lhm_TestCase_Table_Data.get("RA_UI_Reopen"));
	}

	/*
	 * Adding a Contingency
	 */

	@Override
	public void RA_AddUWContingency() throws Throwable {
		// Validating Contingency screen

		GuidewireAutomate_Validation("Risk Analysis", RiskAnalysis_Header, "equals", "Risk Analysis");
		GuidewireAutomate("Add Contingency", RA_AddContingency_Button, "click", "NA");
		
		GuidewireAutomate_Validation("New Contingency", RA_AC_NewContingency, "equals", "New Contingency");
		// Creating Contingency
		GuidewireAutomate_Validation("Title", RA_AC_NC_Title, "sendkeys", lhm_TestCase_Table_Data.get("Title"));
		GuidewireAutomate_Validation("Description", RA_AC_NC_Description, "sendkeys",
				lhm_TestCase_Table_Data.get("Description"));
		GuidewireAutomate_Validation("Action", RA_AC_NC_Action, "selectByVisibleText",
				lhm_TestCase_Table_Data.get("Action"));
		GuidewireAutomate_Validation("Due Date", RA_AC_NC_DueDate, "sendkeys",
				lhm_TestCase_Table_Data.get("Due_Date"));
		
		GuidewireAutomate("Create a Contingency", RA_OK_Button, "click", "NA");

		

		/*
		 * Contingencies Tab
		 */
		GuidewireAutomate("UWIssues Tab", RA_Tab_Contingencies, "click", "NA");

		GuidewireAutomate_Validation("Title", RA_C_Title, "equals", lhm_TestCase_Table_Data.get("RA_C_Title"));
		GuidewireAutomate_Validation("Due Date", RA_C_DueDate, "equals", lhm_TestCase_Table_Data.get("RA_C_DueDate"));
		GuidewireAutomate_Validation("Potential Action", RA_C_PotentialAction, "equals", lhm_TestCase_Table_Data.get("RA_C_PotentialAction"));
		GuidewireAutomate_Validation("AddedBy", RA_C_AddedBy, "equals", lhm_TestCase_Table_Data.get("RA_C_AddedBy"));
		GuidewireAutomate_Validation("On", RA_C_On, "equals", lhm_TestCase_Table_Data.get("RA_C_On"));
		
	}

	@Override
	public void RA_RequestApproval() throws Throwable {
		// Validating Request Approval screen


		lhm_TestCase_Table_Data = oDB.getData_MSExcel_WorkSheet_Fillo("Risk_Analysis", strTestCaseName);

		GuidewireAutomate_Validation("Risk Analysis", GW_PolicyCenter_Resuables.Screen_Header, "equals", "Risk Analysis");

		GuidewireAutomate("Release Lock", RA_RequestApproval_Button, "click", "NA");		
		
		GuidewireAutomate_Validation("UW Activity", GW_PolicyCenter_Resuables.Screen_Header, "equals", "UW Activity");

		GuidewireAutomate_Validation("Subject", RA_UWA_Subject, "sendkeys", lhm_TestCase_Table_Data.get("RA_UWA_Subject"));

		GuidewireAutomate_Validation("Description", RA_UWA_Description, "sendkeys", lhm_TestCase_Table_Data.get("RA_UWA_Description"));
		GuidewireAutomate_Validation("Due Date", RA_UWA_DueDate, "sendkeys", lhm_TestCase_Table_Data.get("RA_UWA_DueDate"));
		GuidewireAutomate_Validation("Escalation Date", RA_UWA_EscalationDate, "sendkeys", lhm_TestCase_Table_Data.get("RA_UWA_EscalationDate"));
		
		GuidewireAutomate_Validation("Priority", RA_UWA_Priority, "selectByVisibleText", lhm_TestCase_Table_Data.get("RA_UWA_Priority"));
		GuidewireAutomate_Validation("Mandatory", RA_UWA_Mandatory, "click", lhm_TestCase_Table_Data.get("RA_UWA_Mandatory"));
		GuidewireAutomate_Validation("Recurring", RA_UWA_Recurring, "click", lhm_TestCase_Table_Data.get("RA_UWA_Recurring"));
		GuidewireAutomate_Validation("Assign To", RA_UWA_AssignTo, "selectByVisibleText", lhm_TestCase_Table_Data.get("RA_UWA_AssignTo"));
		GuidewireAutomate_Validation("Security Level", RA_UWA_SecurityLevel, "selectByVisibleText", lhm_TestCase_Table_Data.get("RA_UWA_SecurityLevel"));

		GuidewireAutomate_Validation("Release", RA_UWA_Release, "click", lhm_TestCase_Table_Data.get("RA_UWA_Release"));

	}

	@Override
	public void RA_LockForReview() throws Throwable {
		GuidewireAutomate_Validation("Risk Analysis", GW_PolicyCenter_Resuables.Screen_Header, "equals", "Risk Analysis");

		GuidewireAutomate("Release Lock", RA_RequestApproval_Button, "click", "NA");		

	}

	@Override
	public void RA_ApproveUWIssues() throws Throwable {
		// TODO Auto-generated method stub

	}

	@Override
	public void RA_RejectUWIssues() throws Throwable {
		// TODO Auto-generated method stub

	}

	@Override
	public void ve_RemoveVehicles() throws Throwable {
		// TODO Auto-generated method stub

	}

	@Override
	public void RA_ApproveContingency() throws Throwable {
		// TODO Auto-generated method stub

	}

	@Override
	public void RA_RejectContingency() throws Throwable {
		// TODO Auto-generated method stub

	}

	@Override
	public void RA_Add_PriorLosses() throws Throwable {
		// TODO Auto-generated method stub

	}

	@Override
	public void RA_Edit_PriorLosses() throws Throwable {
		// TODO Auto-generated method stub

	}

	@Override
	public void RA_Remove_PriorLosses() throws Throwable {
		// TODO Auto-generated method stub

	}

	@Override
	public void RA_Claims_Search() throws Throwable {
		// TODO Auto-generated method stub

	}

	@Override
	public void RA_MVR_Search_Validate() throws Throwable {
		// TODO Auto-generated method stub

	}

	/*
	 * Verifying Mandatory field and its corresponding error message
	 */

	@Override
	public void RA_AddUWIssue_MandatoryValidation() throws Throwable {

		lhm_TestCase_Table_Data = oDB.getData_MSExcel_WorkSheet_Fillo("Risk_Analysis", strTestCaseName);
		// Enter only short and long description values and click on OK
		GuidewireAutomate_Validation("Risk Analysis", RiskAnalysis_Header, "equals", "Risk Analysis");
		GuidewireAutomate("Add UW Issue", RA_AddUWIssue_Button, "click", "NA");

		GuidewireAutomate("Create an UW Issue", RA_OK_Button, "click", "NA");
		// Verifying error message and its focus
		GuidewireAutomate_Validation("Risk Analysis header", RA_Error_header, "equals",
				lhm_TestCase_Table_Data.get("RA_Error_header"));
		GuidewireAutomate_Validation("Risk Analysis message", RA_Error_message, "equals",
				lhm_TestCase_Table_Data.get("RA_Error_message"));
		GuidewireAutomate("Error message focus", RA_Error_focus, "click", "NA");

	}

	@Override
	public void RA_AddUWIssue_CancelValidation() throws Throwable {
		// TODO Auto-generated method stub

	}

	@Override
	public void riskAnalysis() throws Throwable {
		lhm_TestCase_Table_Data = oDB.getData_MSExcel_WorkSheet_Fillo("riskAnalysis", strTestCaseName);

		RA_AddUWIssue();
		RA_AddUWContingency();
		RA_RequestApproval();

	}

	@Override
	public void RA_ReleaseLock() throws Throwable {
		lhm_TestCase_Table_Data = oDB.getData_MSExcel_WorkSheet_Fillo("Risk_Analysis", strTestCaseName);

		GuidewireAutomate_Validation("Risk Analysis", GW_PolicyCenter_Resuables.Screen_Header, "equals", "Risk Analysis");

		GuidewireAutomate("Release Lock", GW_PolicyCenter_Resuables.ReleaseLock_Button, "click", "NA");		
		
		GuidewireAutomate_Validation("UW Activity", GW_PolicyCenter_Resuables.Screen_Header, "equals", "UW Activity");

		GuidewireAutomate_Validation("Subject", RA_UWA_Subject, "sendkeys", lhm_TestCase_Table_Data.get("RA_UWA_Subject"));

		GuidewireAutomate_Validation("Description", RA_UWA_Description, "sendkeys", lhm_TestCase_Table_Data.get("RA_UWA_Description"));
		GuidewireAutomate_Validation("Due Date", RA_UWA_DueDate, "sendkeys", lhm_TestCase_Table_Data.get("RA_UWA_DueDate"));
		GuidewireAutomate_Validation("Escalation Date", RA_UWA_EscalationDate, "sendkeys", lhm_TestCase_Table_Data.get("RA_UWA_EscalationDate"));
		
		GuidewireAutomate_Validation("Priority", RA_UWA_Priority, "selectByVisibleText", lhm_TestCase_Table_Data.get("RA_UWA_Priority"));
		GuidewireAutomate_Validation("Mandatory", RA_UWA_Mandatory, "click", lhm_TestCase_Table_Data.get("RA_UWA_Mandatory"));
		GuidewireAutomate_Validation("Recurring", RA_UWA_Recurring, "click", lhm_TestCase_Table_Data.get("RA_UWA_Recurring"));
		GuidewireAutomate_Validation("Assign To", RA_UWA_AssignTo, "selectByVisibleText", lhm_TestCase_Table_Data.get("RA_UWA_AssignTo"));
		GuidewireAutomate_Validation("Security Level", RA_UWA_SecurityLevel, "selectByVisibleText", lhm_TestCase_Table_Data.get("RA_UWA_SecurityLevel"));

		GuidewireAutomate_Validation("Release", RA_UWA_Release, "click", lhm_TestCase_Table_Data.get("RA_UWA_Release"));

	}

	
	
}
