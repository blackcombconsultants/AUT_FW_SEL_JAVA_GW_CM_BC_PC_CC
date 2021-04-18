package com.pages.Guidewire.PersonalAuto;

import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;

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
		GuidewireAutomate_Validation("Risk Analysis", RiskAnalysis_Header, "equals", "Risk Analysis");
		GuidewireAutomate("Add UW Issue", RA_AddUWIssue_Button, "click", "NA");
		GuidewireAutomate_Validation("Create New UW Issue", RA_CreateNewUWIssue, "equals", "Create New UW Issue");
		GuidewireAutomate_Validation("Issue Type", RA_IssueType, "equals", "Issue Type");
		GuidewireAutomate_Validation("Short Description", RA_ShortDescription, "equals", "Short Description");
		GuidewireAutomate_Validation("Long Description", RA_LongDescription, "equals", "Long Description");
		// Entering value for the fields
		GuidewireAutomate("Issue Type selector", RA_IssueTypeselector, "selectByVisibleText",
				lhm_TestCase_Table_Data.get("RA_Issue_Type"));
		GuidewireAutomate_Validation("Short Description", RA_SDvalue, "equals",
				lhm_TestCase_Table_Data.get("Short_Description"));
		GuidewireAutomate_Validation("Long Description", RA_LDvalue, "sendkeys",
				lhm_TestCase_Table_Data.get("Long_Description"));
		// Creating an UW issue
		GuidewireAutomate("Create an UW Issue", RA_OK_Button, "click", "NA");

	}

	/*
	 * Adding a Contingency
	 */

	@Override
	public void RA_AddUWContingency() throws Throwable {
		// Validating Contingency screen

		GuidewireAutomate_Validation("Risk Analysis", RiskAnalysis_Header, "equals", "Risk Analysis");
		GuidewireAutomate("Add Contingency", RA_AddContingency_Button, "click", "NA");
		GuidewireAutomate_Validation("New Contingency", RA_Contingency_Header, "equals", "New Contingency");
		// Creating Contingency
		GuidewireAutomate_Validation("Title", RA_Contingencytitle, "sendkeys", lhm_TestCase_Table_Data.get("Title"));
		GuidewireAutomate_Validation("Description", RA_ContingencyDescription, "sendkeys",
				lhm_TestCase_Table_Data.get("Description"));
		GuidewireAutomate_Validation("Action", RA_ContingencyAction, "selectByVisibleText",
				lhm_TestCase_Table_Data.get("Action"));
		GuidewireAutomate_Validation("Due Date", RA_ContingencyDueDate, "sendkeys",
				lhm_TestCase_Table_Data.get("Due_Date"));
		GuidewireAutomate("Create a Contingency", RA_Contingency_OK, "click", "NA");

	}

	@Override
	public void RA_RequestApproval() throws Throwable {
		// Validating Request Approval screen

		GuidewireAutomate_Validation("Risk Analysis", RiskAnalysis_Header, "equals", "Risk Analysis");
		GuidewireAutomate("Add Request Approval", RA_AddRequestApproval_Button, "click", "NA");
		GuidewireAutomate_Validation("Request Approval", RA_RequestApproval_Header, "equals", "UW Activity");

	}

	@Override
	public void RA_LockForReview() throws Throwable {
		// TODO Auto-generated method stub

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
		GuidewireAutomate_Validation("Short Description", RA_SDvalue, "equals",
				lhm_TestCase_Table_Data.get("RA_Short_Description"));
		GuidewireAutomate_Validation("Long Description", RA_LDvalue, "equals",
				lhm_TestCase_Table_Data.get("RA_Long_Description"));
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

}
