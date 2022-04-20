package com.Test.Guidewire.CommercialAuto;

import org.testng.annotations.Test;

import com.Utils.Selenium.GW_GetDriver;
import com.pages.Guidewire.GW_CM_PC_BC_CC_Login;
import com.pages.Guidewire.Tab_Menu_Navigation;
import com.pages.Guidewire.PolicyCenter.PC_Account;
import com.pages.Guidewire.PolicyCenter.PC_AccountSummary;
import com.pages.Guidewire.PolicyCenter.PC_Bound;
import com.pages.Guidewire.PolicyCenter.PC_PolicySummary;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Resuables;
import com.pages.Guidewire.PolicyCenter.CommercialAuto.CA_Reusables;

public class CA_ChangePolicy extends GW_GetDriver {

	@Test
	public void AUT_CA_PC_AmendNamedInsured() throws Throwable {

		// login to pc
		GW_CM_PC_BC_CC_Login.login_PolicyCenter_User("SuperUser");
		// search Existing Account
		Tab_Menu_Navigation.pcTabNavigation("Acct Search", "6000114509");
		PolicyCenter_Resuables.PC_AccountFileContacts();
		PolicyCenter_Resuables.clickButton("Update");
		PolicyCenter_Resuables.PC_ChangeAccountHolder();
		// logout
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_CA_PC_AmendNamedInsuredChangePolicy() throws Throwable {

		// login to pc
		GW_CM_PC_BC_CC_Login.login_PolicyCenter_User("SuperUser");
		// New submission
		CA_Reusables.SubmissionProcess("New Company Account", "Issue Policy");
		// Navigate to change policy
		PolicyCenter_Resuables.Policytransactions("Change Policy");
		// View change policy and policy details
		PC_Bound.policyChangeBound_ViewYourPolicy();
		PC_PolicySummary.detail_Verify();
		PC_PolicySummary.account_Verify();
		// logout
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();

	}
	@Test
	public void AUT_CA_PC_VerifyingAddressWithAccountScenario() throws Throwable {
		// Login
		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		// create Company Account
		Tab_Menu_Navigation.pcTabNavigation("New Account", "NA");
		PC_Account.createCompanyAccount();
		PC_AccountSummary.detail_Verify();
		// Navigate to Account Summary Click Edit and Change Address
		PolicyCenter_Resuables.clickButton("AccountSummary_Edit");
		PC_AccountSummary.details_Edit();
		PolicyCenter_Resuables.clickButton("Update");
		// Validate the Address change
		PC_AccountSummary.detail_Verify();
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();

	}
	@Test
	public void AUT_CA_PC_VerifyAddressWithPolicyScenario() throws Throwable {

		// Login
		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		// New submission
		CA_Reusables.SubmissionProcess("New Company Account", "Issue Policy");
		// Navigate to change policy
		PolicyCenter_Resuables.Policytransactions("Change Policy");
		PC_Bound.policyChangeBound_ViewYourPolicy();
		// logout
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();

	}

	@Test
	public void AUT_CA_PC_OutOfSequenceAndPreemptionRules() throws Throwable {
		// login to pc
		GW_CM_PC_BC_CC_Login.login_PolicyCenter_User("SuperUser");
		// New submission
		CA_Reusables.SubmissionProcess("New Company Account", "Issue Policy");
		// Navigate to change policy
		PolicyCenter_Resuables.Policytransactions("Change Policy");
		// View change policy and policy details
		PC_Bound.policyChangeBound_ViewYourPolicy();
		// Navigate to change policy
		PolicyCenter_Resuables.Policytransactions("Change Policy_ChangeConflicts");
		// View change policy and policy details
		PC_Bound.policyChangeBound_ViewYourPolicy();
		// logout
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();

	}

	@Test
	public void AUT_CA_PC_Endorsement_AddLocation() throws Throwable {
		// login to pc
		GW_CM_PC_BC_CC_Login.login_PolicyCenter_User("SuperUser");
		// New submission
		CA_Reusables.SubmissionProcess("New Company Account", "Issue Policy");
		// Navigate to change policy
		PolicyCenter_Resuables.Policytransactions("Change Policy");
	}

	@Test
	public void AUT_PC_CA_Endorsement_StartPolicyChange() throws Throwable {

	}
	@Test
	public void AUT_PC_CA_Endorsement_DraftPolicyChange() throws Throwable {

	}
	@Test
	public void AUT_PC_CA_Endorsement_QuotePolicyChange() throws Throwable {

	}
	@Test
	public void AUT_PC_CA_Endorsement_IssuePolicyChange() throws Throwable {

	}
	@Test
	public void AUT_PC_CA_Endorsement_EditAndReQuotePolicyChange() throws Throwable {

	}
	@Test
	public void AUT_PC_CA_Endorsement_WithdrawPolicyChange() throws Throwable {

	}
	@Test
	public void AUT_PC_CA_Endorsement_Quote_MultiVersion() throws Throwable {

	}
	@Test
	public void AUT_PC_CA_Endorsement_Quote_SideBySide() throws Throwable {

	}
	@Test
	public void AUT_PC_CA_Endorsement_PolicyReview() throws Throwable {

	}
	@Test
	public void AUT_PC_CA_Endorsement_OutOfSequencePolicyChange() throws Throwable {

	}
	@Test
	public void AUT_PC_CA_Endorsement_PreemptedPolicyChange() throws Throwable {

	}
	@Test
	public void AUT_PC_CA_Endorsement_FormsAndDocGeneration() throws Throwable {

	}

}
