package com.Test.Guidewire.BusinessOwners;

import org.testng.annotations.Test;

import com.Utils.Selenium.GW_Base;
import com.pages.Guidewire.GW_CM_PC_BC_CC_Login;
import com.pages.Guidewire.Tab_Menu_Navigation;
import com.pages.Guidewire.PolicyCenter.PC_Bound;
import com.pages.Guidewire.PolicyCenter.PC_PolicySummary;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Resuables;
import com.pages.Guidewire.PolicyCenter.BusinessOwners.BO_PolicyInfo;
import com.pages.Guidewire.PolicyCenter.BusinessOwners.BO_Resuables;

public class BO_RenewPolicy {

	@Test
	public void RenewalProcess90Days() throws Throwable {

		// Login Into Policy Center-------------------------------
		GW_CM_PC_BC_CC_Login.login_PolicyCenter();

		// New Company Account Creation and New Submission-------------------------------------------
		BO_Resuables.submissionProcess("New Account", "Issue Policy");

		// Fetching Policy Number from Info bar--------------------------------
		GW_Base.strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");

		// Robot Key For Batch Process Page-----------------------------------
		Thread.sleep(3000);
		BO_Resuables.RobotKey();

		// Click Run of Renewal Process and Return to policy Center---------------------
		BO_Resuables.RunBatch_Renewal();
		BO_Resuables.ReturnToPolicyCenter();

		// Navigate to Open Existing Policy-------------------------------------------------
		Tab_Menu_Navigation.pcTabNavigation("Policy Search By Policy Number", "NA");

		// Validation of Open Policy transaction Details------------------------
		PC_PolicySummary.VerifyOpenPolicyTransactionDetails();

		// Logout From Policy Center--------------------------------------------
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}
	@Test
	public void NonRenewalWithRenewalTransaction() throws Throwable {

		// Login Into Policy Center--------------------------
		GW_CM_PC_BC_CC_Login.login_PolicyCenter();

		// New Company Account Creation and New Submission-------------------------------------------
		BO_Resuables.submissionProcess("New Account", "Issue Policy");

		// Navigating to Non Renew--------------------------------
		PC_PolicySummary.OpenPolicyTransaction_ClickPolicyLink();

		// Non Renewal Info-------------------------------
		PolicyCenter_Resuables.NonRenewalDataEntry();
		PolicyCenter_Resuables.clickButton("OK");
		PC_Bound.ViewYourPolicy();

		// New Note Creation--------------------------------
		Tab_Menu_Navigation.pcMenuNavigation("New Note");
		BO_Resuables.NewNoteDetails();
		PolicyCenter_Resuables.clickButton("Update");

		// New Note Verify----------------------------------
		BO_Resuables.NewNoteVerify();

		// Logout Policy Center-------------------------------
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();

	}

	@Test
	public void NonRenewalWithoutRenewalTransaction() throws Throwable {

		// Login Into Policy Center--------------------------
		GW_CM_PC_BC_CC_Login.login_PolicyCenter();

		// New Account Company Creation and New Submission-------------------------------------------
		BO_Resuables.submissionProcess("New Account", "Issue Policy");

		// Navigating to PreRenewal Direction and Info Entry-------------------------
		Tab_Menu_Navigation.pcMenuNavigation("Pre Renewal Direction");
		PolicyCenter_Resuables.clickButton("Edit");
		BO_Resuables.PreRenewalDirectionInfo("Pre Renewal Data Info");
		PolicyCenter_Resuables.clickButton("Update");

		// Logout Policy Center-----------------------------
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();

	}
	@Test
	public void ApplyEndorsementTORenewal() throws Throwable {

		// Login Into Policy Center-------------------------------------------------
		GW_CM_PC_BC_CC_Login.login_PolicyCenter();

		// New Company Account Creation and Submission-------------------------------------------
		BO_Resuables.submissionProcess("New Account", "Issue Policy");

		// Renew Policy--------------------------------------------------------------------
		Tab_Menu_Navigation.pcMenuNavigation("Renew Policy");
		BO_Resuables.InfoBarPolicyLink();

		// Change Policy---------------------------------------------------------------------
		Tab_Menu_Navigation.pcMenuNavigation("Change Policy");
		BO_Resuables.StartPolicyChange_Details();
		PolicyCenter_Resuables.clickButton("Next");

		// Change Address to New Address------------------------------------------------------
		BO_PolicyInfo.policyAddress_ChangeTo_NewAddress();

		// Quote and Issue the policy Change---------------------------------------
		PolicyCenter_Resuables.clickButton("Quote");
		PolicyCenter_Resuables.clickButton("IssuePolicy for ChangePolicy");

		// Click on the policy change Bound Link---------------------------------------
		PC_Bound.ViewYourPolicy();

		// Validate the Address Fetching Out Before Validation--------------------------------
		BO_Resuables.ValidateStatusInCompletePolicyTransaction();

		// Logout from Policy Center--------------------------
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();

	}
	@Test
	public void ApplyEndorsementTORenewalAndIssuePolicy() throws Throwable {

		// Login Into Policy Center-------------------------------------------------
		GW_CM_PC_BC_CC_Login.login_PolicyCenter();

		// New Company Account Creation and Submission-------------------------------------------
		BO_Resuables.submissionProcess("New Account", "Issue Policy");

		// Renew Policy--------------------------------------------------------------------
		Tab_Menu_Navigation.pcMenuNavigation("Renew Policy");
		BO_Resuables.InfoBarPolicyLink();

		// Change Policy----------------------------------------------------------------------
		Tab_Menu_Navigation.pcMenuNavigation("Change Policy");
		BO_Resuables.StartPolicyChange_Details();
		PolicyCenter_Resuables.clickButton("Next");

		// Change Address to New Address-----------------------------------------------------
		BO_PolicyInfo.policyAddress_ChangeTo_NewAddress();

		// Quote and Issue the policy Change---------------------------------------
		PolicyCenter_Resuables.clickButton("Quote");
		PolicyCenter_Resuables.clickButton("IssuePolicy for ChangePolicy");

		// Click on the policy change Bound Link---------------------------------------
		PC_Bound.policyChangeBound_PolicyChange();
		PolicyCenter_Resuables.clickButton("Next");

		// Quote and Renewing the Policy----------------------------------------------
		PolicyCenter_Resuables.clickButton("Quote");
		PolicyCenter_Resuables.clickButton("Bind Options");
		PolicyCenter_Resuables.clickButton("Renew");
		Thread.sleep(1000);

		// Renewal Data --------------------------------------------------------
		PolicyCenter_Resuables.renewalDataEntry();
		Thread.sleep(2000);
		// View Renewal Policy--------------------------------------------------------
		PC_Bound.RenewalRenewing_ViewYourPolicy();

		// Validating Type and Status in Open Policy Transaction-------------------------------
		PC_PolicySummary.VerifyOpenPolicyTransactionDetails();

		// Logout from Policy Center--------------------------
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();

	}
	@Test
	public void ApplyEndorsementWhenNonRenewing() throws Throwable {

		// Login Into Policy Center-------------------------------------------------
		GW_CM_PC_BC_CC_Login.login_PolicyCenter();

		// New Company Account Creation and Submission-------------------------------------------
		BO_Resuables.submissionProcess("New Account", "Issue Policy");

		// Renew Policy--------------------------------------------------------------------
		Tab_Menu_Navigation.pcMenuNavigation("Renew Policy");
		PolicyCenter_Resuables.clickButton("Next");
		PolicyCenter_Resuables.clickButton("Edit Policy Transaction");
		PolicyCenter_Resuables.clickButton("Close Options NonRenew");

		// Non Renewal Data Info-------------------------------------------------------------
		PolicyCenter_Resuables.NonRenewalDataEntry();
		PolicyCenter_Resuables.clickButton("OK");

		// View Your Renewal Policy----------------------------------------------------------
		PC_Bound.RenewalNonRenewing_ViewYourPolicy();

		// Verify Open Policy Transaction Details--------------------------------------------
		PC_PolicySummary.VerifyOpenPolicyTransactionDetails();

		// Logout from Policy Center--------------------------
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();

	}
	@Test
	public void AUT_PC_BO_InitiateManualRenewal() throws Throwable {

	}
	@Test
	public void AUT_PC_BO_ManualRenewal_PolicyReview() throws Throwable {

	}
	@Test
	public void AUT_PC_BO_ModifyPolicyData() throws Throwable {

	}
	@Test
	public void AUT_PC_BO_QuoteRenewal() throws Throwable {

	}
	@Test
	public void AUT_PC_BO_EditAndRequoteRenewal() throws Throwable {

	}
	@Test
	public void AUT_PC_BO_WithdrawRenewal() throws Throwable {

	}
	@Test
	public void AUT_PC_BO_ManualRenewal_Multiversion() throws Throwable {

	}
	@Test
	public void AUT_PC_BO_BoundConfirmationAndPolicySummary() throws Throwable {

	}
	@Test
	public void AUT_PC_BO_ManualRenewal_SideBySideQuotes() throws Throwable {

	}
	@Test
	public void AUT_PC_BO_SetPreRenewalDirection() throws Throwable {

	}
	@Test
	public void AUT_PC_BO_PreRenewalQuestionnaires() throws Throwable {

	}
	@Test
	public void AUT_PC_BO_InitiateRenewal_RenewalProcess() throws Throwable {

	}
	@Test
	public void AUT_PC_BO_ApplyEndorsement() throws Throwable {

	}
	@Test
	public void AUT_PC_BO_RenewalCancellation() throws Throwable {

	}
	@Test
	public void AUT_PC_BO_CloseOptions() throws Throwable {

	}
}