package com.Test.Guidewire.BusinessOwners;

import org.testng.annotations.Test;

import com.Utils.Selenium.GW_Base;
import com.pages.Guidewire.GW_CM_PC_BC_CC_Login;
import com.pages.Guidewire.Tab_Menu_Navigation;
import com.pages.Guidewire.PolicyCenter.PC_Account;
import com.pages.Guidewire.PolicyCenter.PC_AccountSummary;
import com.pages.Guidewire.PolicyCenter.PC_Bound;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Resuables;
import com.pages.Guidewire.PolicyCenter.BusinessOwners.BO_PolicyInfo;
import com.pages.Guidewire.PolicyCenter.BusinessOwners.BO_PolicyReview;
import com.pages.Guidewire.PolicyCenter.BusinessOwners.BO_Resuables;

public class BO_ChangePolicy {
	@Test
	public void VerifyAddressWithAccountScenario() throws Throwable {

		// Login Into Policy Center-------------------------------
		GW_CM_PC_BC_CC_Login.login_PolicyCenter();

		// New Company Account Creation and Submission-------------------------------------------
		Tab_Menu_Navigation.pcTabNavigation("New Account", "NA");
		PC_Account.createCompanyAccount();

		// Edit Account Address------------------------------------------------
		BO_Resuables.EditAccount_Address();
		PolicyCenter_Resuables.clickButton("Update");

		// Validate the Address change in the Account Summary screen----------------
		PC_AccountSummary.detail_Verify();

		// Logout from Policy Center---------------------------------------
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}
	@Test
	public void VerifyAddressWithPolicyScenario() throws Throwable {

		// Login Into Policy Center-------------------------------
		GW_CM_PC_BC_CC_Login.login_PolicyCenter();

		// New Company Account Creation and Submission-------------------------------------------
		BO_Resuables.submissionProcess("New Account", "Issue Policy");

		// Navigate to Change Policy and Make Changes------------------------------
		Tab_Menu_Navigation.pcMenuNavigation("Change Policy");
		BO_Resuables.StartPolicyChange_Details();
		PolicyCenter_Resuables.clickButton("Next");

		// Change to New Address------------------------------
		BO_PolicyInfo.policyAddress_ChangeTo_NewAddress();
		PolicyCenter_Resuables.clickButton("Quote");

		// Fetching Out thr Policy Details For Validation------------------------------
		GW_Base.strAccountName = PolicyCenter_Resuables.infoBar("AccountName");

		// Issue Policy Unbound Change---------------------------------------------------
		PolicyCenter_Resuables.clickButton("IssuePolicy for ChangePolicy");
		PC_Bound.policyChangeBound_ViewYourPolicy();

		// Validation of Policy Change -------------------------------------
		BO_Resuables.ValidateStatusInCompletePolicyTransaction();

		// Logout From the PPolicy Center-----------------------------------------
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();

	}
	@Test
	public void OutOfSequenceAndPreemptionRules() throws Throwable {

		// Login Into Policy Center--------------------------------------
		GW_CM_PC_BC_CC_Login.login_PolicyCenter();

		// New Company Account Creation and New Submission-------------------------------------------
		BO_Resuables.submissionProcess("New Account", "Issue Policy");

		// Navigating to Policy change and Make Changes ---------------------------------
		Tab_Menu_Navigation.pcMenuNavigation("Change Policy");
		BO_Resuables.StartPolicyChange_Details();
		PolicyCenter_Resuables.clickButton("Next");

		// Change Address to New Address------------------------------------------------------
		BO_PolicyInfo.policyAddress_ChangeTo_NewAddress();

		// Quote and Issue the Policy-------------------------------------------------
		PolicyCenter_Resuables.clickButton("Quote");
		PolicyCenter_Resuables.clickButton("IssuePolicy for ChangePolicy");

		// View Your Policy and make changes----------------------------------------------
		PC_Bound.ViewYourPolicy();

		// Change Policy Past Date------------------------------------------------
		Tab_Menu_Navigation.pcMenuNavigation("Change Policy");
		BO_Resuables.StartPolicyChangePastDate_Details();

		// Verify Out Of Sequence Error-------------------------------------------
		BO_Resuables.Verify_OutOfsequenceError();
		PolicyCenter_Resuables.clickButton("Next");

		// Change Address to New Address---------------------------------------------
		BO_PolicyInfo.policyAddress_ChangeTo_NewAddress();

		// Navigate TO Policy Review Screen--------------------------------
		PolicyCenter_Resuables.clickButton("Quote");
		BO_Resuables.JumpPolicyReviewScreen();

		// Validate the Override and Policy Change--------------------------------------
		BO_PolicyReview.Verify_PolicyChange();
		BO_Resuables.OverrideChangeConflicts();

		// Quote and View Your Policy---------------------------------------------
		PolicyCenter_Resuables.clickButton("Quote");
		PolicyCenter_Resuables.clickButton("IssuePolicy for ChangePolicy");
		PC_Bound.ViewYourPolicy();

		// Logout from the Policy Center-------------------------------
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();

	}
	@Test
	public void AUT_PC_BO_StartPolicyChange() throws Throwable {

	}
	@Test
	public void AUT_PC_BO_DraftPolicyChange() throws Throwable {

	}
	@Test
	public void AUT_PC_BO_QuotePolicyChange() throws Throwable {

	}
	@Test
	public void AUT_PC_BO_IssuePolicyChange() throws Throwable {

	}
	@Test
	public void AUT_PC_BO_EditAndRequotePolicyChange() throws Throwable {

	}
	@Test
	public void AUT_PC_BO_WithdrawPolicyChange() throws Throwable {

	}
	@Test
	public void AUT_PC_BO_Quote_Multiversion() throws Throwable {

	}
	@Test
	public void AUT_PC_BO_Quote_SideBySide() throws Throwable {

	}
	@Test
	public void AUT_PC_BO_RiskAnalysis() throws Throwable {

	}
	@Test
	public void AUT_PC_BO_PolicyReview() throws Throwable {

	}
	@Test
	public void AUT_PC_BO_OutOfSequencePolicyChange() throws Throwable {

	}
	@Test
	public void AUT_PC_BO_PreemptedPolicyChange() throws Throwable {

	}
	@Test
	public void AUT_PC_BO_FormAndDocGeneration() throws Throwable {

	}
}
