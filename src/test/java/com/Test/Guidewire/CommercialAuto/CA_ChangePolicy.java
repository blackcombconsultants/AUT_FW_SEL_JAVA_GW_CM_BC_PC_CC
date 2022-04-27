package com.Test.Guidewire.CommercialAuto;

import com.pages.Guidewire.PolicyCenter.CommercialAuto.CA_Drivers;
import com.pages.Guidewire.PolicyCenter.CommercialAuto.CA_Locations;
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
		// create Company Account
		Tab_Menu_Navigation.pcTabNavigation("New Account", "NA");
		PC_Account.createCompanyAccount();
		PC_AccountSummary.detail_Verify();
		//add contact
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
		// login to pc
		GW_CM_PC_BC_CC_Login.login_PolicyCenter_User("SuperUser");
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

		// login to pc
		GW_CM_PC_BC_CC_Login.login_PolicyCenter_User("SuperUser");
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
		Tab_Menu_Navigation.pcMenuNavigation("Change Policy");
		strLOB = PolicyCenter_Resuables.infoBar("LOB");
		strAccountName = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");
		PolicyCenter_Resuables.PC_ChangePolicy();
		CA_Reusables.submissionMenuNavigation("Locations");
		//adding new location
		CA_Locations.Location();
		CA_Locations.NewLocation();
		PolicyCenter_Resuables.clickButton("Next");
		CA_Reusables.submissionMenuNavigation("Drivers");
		//adding new driver
		CA_Drivers.Driver();
		CA_Drivers.DriverDetails();
		PolicyCenter_Resuables.clickButton("Next");
		CA_Reusables.submissionMenuNavigation("Policy Review");
		PolicyCenter_Resuables.PolicyReview_Preemption();
		PolicyCenter_Resuables.clickButton("Quote");
		PolicyCenter_Resuables.clickButton("IssuePolicy for ChangePolicy");
		strJob = PolicyCenter_Resuables.infoBar("Job");
		strLOB = PolicyCenter_Resuables.infoBar("LOB");
		strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strAccountName = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");
		// View change policy and policy details
		PC_Bound.policyChangeBound_ViewYourPolicy();
		// logout
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_CA_PC_Endorsement_DeleteLocation() throws Throwable {
		// login to pc
		GW_CM_PC_BC_CC_Login.login_PolicyCenter_User("SuperUser");
		// New submission
		CA_Reusables.SubmissionProcess("New Company Account", "Issue Policy");
		// Navigate to change policy
		Tab_Menu_Navigation.pcMenuNavigation("Change Policy");
		strLOB = PolicyCenter_Resuables.infoBar("LOB");
		strAccountName = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");
		PolicyCenter_Resuables.PC_ChangePolicy();
		CA_Reusables.submissionMenuNavigation("Locations");
		//adding new location
		CA_Locations.Location();
		CA_Locations.NewLocation();
		PolicyCenter_Resuables.clickButton("Next");
		CA_Reusables.submissionMenuNavigation("Drivers");
		//adding new driver
		CA_Drivers.Driver();
		CA_Drivers.DriverDetails();
		PolicyCenter_Resuables.clickButton("Next");
		CA_Reusables.submissionMenuNavigation("Policy Review");
		PolicyCenter_Resuables.PolicyReview_Preemption();
		//navigate to locations and deleting location
		CA_Reusables.submissionMenuNavigation("Locations");
        CA_Locations.RemoveLocation();
		PolicyCenter_Resuables.clickButton("Next");
		//deleting driver
		CA_Reusables.submissionMenuNavigation("Drivers");
        CA_Drivers.RemoveDriver();
		PolicyCenter_Resuables.clickButton("Quote");
		PolicyCenter_Resuables.clickButton("IssuePolicy for ChangePolicy");
		strJob = PolicyCenter_Resuables.infoBar("Job");
		strLOB = PolicyCenter_Resuables.infoBar("LOB");
		strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strAccountName = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");
		// View change policy and policy details
		PC_Bound.policyChangeBound_ViewYourPolicy();
		// logout
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
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
