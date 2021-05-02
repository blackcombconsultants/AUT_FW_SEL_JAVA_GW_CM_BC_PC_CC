	package com.Test.Guidewire.PolicyCenter;

import org.testng.annotations.Test;

import com.Utils.Selenium.GW_GetDriver;
import com.pages.Guidewire.GW_CM_PC_BC_CC_Login;
import com.pages.Guidewire.GW_CM_PC_BC_CC_TabNavigation;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_Coverages;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_Drivers;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_Forms;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_Reusable;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_Payments;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_PolicyInfo;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_PolicyReview;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_Quote;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_RiskAnalysis;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_Vehicles;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_SubmissionBound;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Resuables;

public class GW_PC_PersonalAuto_Issuance extends GW_GetDriver {

	/*
	 * Creating object reference for the New submission_Issue
	 */
	GW_CM_PC_BC_CC_Login lg = new GW_CM_PC_BC_CC_Login(driver, oExtentTest);
	GW_CM_PC_BC_CC_TabNavigation tab = new GW_CM_PC_BC_CC_TabNavigation(driver, oExtentTest);
	PolicyCenter_Resuables pcr = new PolicyCenter_Resuables(driver, oExtentTest);

	/*
	 * Personal Auto
	 */
	PersonalAuto_Reusable par = new PersonalAuto_Reusable(driver, oExtentTest);
	PersonalAuto_PolicyInfo pi = new PersonalAuto_PolicyInfo(driver, oExtentTest);
	PersonalAuto_Drivers pad = new PersonalAuto_Drivers(driver, oExtentTest);
	PersonalAuto_Vehicles pav = new PersonalAuto_Vehicles(driver, oExtentTest);
	PersonalAuto_Coverages pac = new PersonalAuto_Coverages(driver, oExtentTest);
	PersonalAuto_RiskAnalysis para = new PersonalAuto_RiskAnalysis(driver, oExtentTest);
	PersonalAuto_PolicyReview papr = new PersonalAuto_PolicyReview(driver, oExtentTest);
	PersonalAuto_Quote paq = new PersonalAuto_Quote(driver, oExtentTest);
	PersonalAuto_Forms forms = new PersonalAuto_Forms(driver, oExtentTest);
	PersonalAuto_Payments payments = new PersonalAuto_Payments(driver, oExtentTest);
	PolicyCenter_SubmissionBound submissionbound = new PolicyCenter_SubmissionBound(driver, oExtentTest);

	/*
	 * Testcase = Full Quote Issue Policy Author = Arun Date Created = 27/04/21 LOB
	 * = Personal Auto Parameter testData
	 * 
	 */

	@Test
	public void AUT_PersonalAuto_PolicyCenter_Issuance_5_IssuePolicy() throws Throwable {

		/*
		 * call the modules/methods
		 */

		// Logging into Policy Center
		lg.login_PolicyCenter();
		// Click Menu New Submission
		// Insert Policy Search method*
		// Insert Policy Summary screen confirmation method*
		// Select Actions->Issue Policy*
		pcr.clickButton("Next");
		// PA LOB line level details
		pcr.clickButton("Quote");
		pcr.clickButton("Next");
		forms.pa_forms();
		pcr.clickButton("Next");
		payments.payments();
		pcr.clickButton("Issue Policy");
		// Confirming submission transaction
		submissionbound.ViewYourPolicy();
		// Verify Policy number

		strJob = pcr.infoBar("Job");
		strWorkflow = pcr.infoBar("Workflow");
		strLOB = pcr.infoBar("LOB");
		strEffectiveDate = pcr.infoBar("EffectiveDate");
		strAccountName = pcr.infoBar("AccountName");
		strAccountNumber = pcr.infoBar("AccountNumber");
		strPolicyNumber = pcr.infoBar("PolicyNumber");
		strAmount = pcr.infoBar("AccountName");

		// Logout PC
		lg.logout_PolicyCenter();

	}

	/*
	 * Testcase = Full Quote - Edit the Policy during Issuance Author = Arun Date
	 * Created = 27/04/21 LOB = Personal Auto Parameter testData
	 * 
	 */

	@Test
	public void AUT_PersonalAuto_PolicyCenter_Issuance_4_Editpolicytransaction() throws Throwable {

		/*
		 * call the modules/methods
		 */

		// Logging into Policy Center
		lg.login_PolicyCenter();
		// Click Menu New Submission
		// Insert Policy Search method*
		// Insert Policy Summary screen confirmation method*
		// Select Actions->Issue Policy*
		// Edit Offering*
		pcr.clickButton("Next");
		// Edit all fields in Policy info screen*
		pi.policyDetails();
		pcr.clickButton("Next");
		// PA LOB line level details
		pad.driver_Edit_ExistingDriver();
		// If any UW issue should get added automatically,Eg: Make Driver age less than
		// 25
		pad.driver_Add_NewPerson();
		pcr.clickButton("Next");
		pav.vehicle_Edit();
		// pav.ve_AssignDriver();
		pcr.clickButton("Next");
		para.approveUWIssues();
		pcr.clickButton("Next");
		papr.policyDetails();
		pcr.clickButton("Next");
		// Policy Review screen*
		pcr.clickButton("Quote");
		// paq.pa_QuoteDetails();
		pcr.clickButton("Next");
		forms.pa_forms();
		pcr.clickButton("Next");
		payments.payments();
		pcr.clickButton("Bind Options");
		pcr.clickButton("Issue Policy");
		// If the submission blocks due to underwriter issues
		// Add method for 'Issues that block Issuance' screen validation*
		// Click button 'Details'*
		para.approveUWIssues();
		pcr.clickButton("Quote");
		pcr.clickButton("Next");
		// Policy Review screen
		pcr.clickButton("Next");
		forms.pa_forms();
		pcr.clickButton("Next");
		payments.payments();
		pcr.clickButton("Bind Options");
		pcr.clickButton("Issue Policy");
		// Confirming submission transaction
		submissionbound.submissionBound();
		// Verify Policy number
		submissionbound.ViewYourPolicy();

		strJob = pcr.infoBar("Job");
		strWorkflow = pcr.infoBar("Workflow");
		strLOB = pcr.infoBar("LOB");
		strEffectiveDate = pcr.infoBar("EffectiveDate");
		strAccountName = pcr.infoBar("AccountName");
		strAccountNumber = pcr.infoBar("AccountNumber");
		strPolicyNumber = pcr.infoBar("PolicyNumber");
		strAmount = pcr.infoBar("AccountName");

		// Logout PC
		lg.logout_PolicyCenter();

	}

	/*
	 * Testcase = Full Quote Issuance withdraw Submission Author = Arun Date Created
	 * = 26/04/21 LOB = Personal Auto Parameter testData
	 * 
	 */
	@Test
	public void AUT_PersonalAuto_PolicyCenter_Issuance_1_WithdrawTransaction() throws Throwable {

		/*
		 * call the modules/methods
		 */

		// Logging into Policy Center
		lg.login_PolicyCenter();
		// Click Menu New Submission
		// Insert Policy Search method*
		// Insert Policy Summary screen confirmation method*
		// Select Actions->Issue Policy*
		// Edit Offering*
		pcr.clickButton("Next");
		// Edit all fields in Policy info screen*
		pi.policyDetails();
		pcr.clickButton("Next");
		// PA LOB line level details
		pad.driver_Edit_ExistingDriver();
		// If any UW issue should get added automatically,Eg: Make Driver age less than
		// 25
		pad.driver_Add_NewPerson();
		pcr.clickButton("Next");
		pav.vehicle_Edit();
		// pav.ve_AssignDriver();
		pcr.clickButton("Next");
		para.approveUWIssues();
		pcr.clickButton("Next");
		papr.policyDetails();
		pcr.clickButton("Next");
		// Policy Review screen*
		pcr.clickButton("Quote");
		// paq.pa_QuoteDetails();
		pcr.clickButton("Next");
		forms.pa_forms();
		pcr.clickButton("Next");
		payments.payments();
		pcr.clickButton("Bind Options");
		pcr.clickButton("Issue Policy");
		// If the submission blocks due to underwriter issues
		// Add method for 'Issues that block Issuance' screen validation*
		// Click button 'Details'*
		para.approveUWIssues();
		pcr.clickButton("Quote");
		pcr.clickButton("Next");
		// Policy Review screen
		pcr.clickButton("Next");
		forms.pa_forms();
		pcr.clickButton("Next");
		payments.payments();
		// Withdraw transaction
		pcr.clickButton("Withdraw Transaction");
		// Insert Close Submission Confirmation screen method

		strJob = pcr.infoBar("Job");
		strWorkflow = pcr.infoBar("Workflow");
		strLOB = pcr.infoBar("LOB");
		strEffectiveDate = pcr.infoBar("EffectiveDate");
		strAccountName = pcr.infoBar("AccountName");
		strAccountNumber = pcr.infoBar("AccountNumber");
		strPolicyNumber = pcr.infoBar("PolicyNumber");
		strAmount = pcr.infoBar("AccountName");

		// Logout PC
		lg.logout_PolicyCenter();
	}
}
