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

	@Override
	public void RA_AddUWIssue() throws Throwable {

		lhm_TestCase_Table_Data = oDB.getData_MSExcel_WorkSheet_Fillo("createAccount", strTestCaseName);

		// TODO Auto-generated method stub
		GuidewireAutomate_Validation("Risk Analysis", RiskAnalysis_Header, "equals", "Risk Analysis");
		GuidewireAutomate("Add UW Issue", RA_AddUWIssue_Button, "click", "NA");
		GuidewireAutomate_Validation("Create New UW Issue", RA_CreateNewUWIssue, "equals", "Create New UW Issue");
		GuidewireAutomate_Validation("Issue Type", RA_IssueType, "equals", "Issue Type");
		GuidewireAutomate_Validation("Short Description", RA_ShortDescription, "equals", "Short Description");
		GuidewireAutomate_Validation("Long Description", RA_LongDescription, "equals", "Long Description");
		GuidewireAutomate("Issue Type", ra_addresstype, "selectByVisibleText",
				lhm_TestCase_Table_Data.get("TD_Addresstype"));
		/*
		 * click button validate screen +ve flow cancel
		 */

	}

	@Override
	public void RA_AddUWContingency() throws Throwable {
		// TODO Auto-generated method stub

	}

	@Override
	public void RA_RequestApproval() throws Throwable {
		// TODO Auto-generated method stub

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

}
