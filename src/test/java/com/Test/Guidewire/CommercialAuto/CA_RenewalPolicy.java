package com.Test.Guidewire.CommercialAuto;

import org.testng.annotations.Test;

import com.Utils.Selenium.GW_Base;
import com.Utils.Selenium.GW_GetDriver;
import com.pages.Guidewire.GW_CM_PC_BC_CC_Login;
import com.pages.Guidewire.Tab_Menu_Navigation;
import com.pages.Guidewire.PolicyCenter.PC_Bound;
import com.pages.Guidewire.PolicyCenter.PC_PolicySummary;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Resuables;
import com.pages.Guidewire.PolicyCenter.BusinessOwners.BO_Resuables;
import com.pages.Guidewire.PolicyCenter.CommercialAuto.CA_PolicyInfo;
import com.pages.Guidewire.PolicyCenter.CommercialAuto.CA_Reusables;

public class CA_RenewalPolicy extends GW_GetDriver {

	@Test
	public void AUT_CA_PC_RenewalWorkflow90Days() throws Throwable {

		// login into policy center
		GW_CM_PC_BC_CC_Login.login_PolicyCenter_User("SuperUser");
		// New submission
		CA_Reusables.SubmissionProcess("New Company Account", "Issue Policy");
		// Fetching policy number
		GW_Base.strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");
		// Robot key for Batch process
		Thread.sleep(3000);
		PolicyCenter_Resuables.robotkey();
		// click run button in Batch process
		PolicyCenter_Resuables.PolicyRenewalStart();
		// search existing policy
		Tab_Menu_Navigation.pcTabNavigation("Policy Search By Fetching", "NA");
		// logout
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();

	}
	@Test
	public void AUT_CA_PC_ApplyEndorsementTORenewal() throws Throwable {

		// Login
		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		// New submission
		CA_Reusables.SubmissionProcess("New Company Account", "Issue Policy");
		// Navigate to Renew policy
		Tab_Menu_Navigation.pcMenuNavigation("Renew Policy");
		CA_Reusables.InfoBarPolicyLink();
		// Validating Type and Status
		PC_PolicySummary.VerifyOpenPolicyTransactionDetails();
		// Navigating to Policy change
		PolicyCenter_Resuables.Policytransactions("Change Policy");
		PC_Bound.Renewal_ViewTheUnboundRenewal();
		PolicyCenter_Resuables.clickButton("Next");
		// Validate the Address
		CA_PolicyInfo.policyAddress();
		// Logout
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();

	}

	@Test
	public void AUT_CA_PC_ApplyEndorsementTORenewalAndIssuePolicy() throws Throwable {

		// login
		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		// New submission
		CA_Reusables.SubmissionProcess("New Company Account", "Issue Policy");
		// Navigate to Renew policy
		Tab_Menu_Navigation.pcMenuNavigation("Renew Policy");
		CA_Reusables.InfoBarPolicyLink();
		// Navigating to Policy change
		PolicyCenter_Resuables.Policytransactions("Change Policy");
		PC_Bound.Renewal_ViewTheUnboundRenewal();
		PolicyCenter_Resuables.clickButton("Next");
		// Validate the Address
		CA_PolicyInfo.policyAddress();
		// Renewing the Policy
		PolicyCenter_Resuables.clickButton("Next");
		PolicyCenter_Resuables.clickButton("Quote");
		PolicyCenter_Resuables.clickButton("Renew");
		PolicyCenter_Resuables.renewalDataEntry();
		PC_Bound.ViewYourPolicy();
		// Validating Type and Status
		PC_PolicySummary.VerifyOpenPolicyTransactionDetails();
		// Logout
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();

	}
	@Test
	public void AUT_CA_PC_NonRenewalWithRenewalTransaction() throws Throwable {

		// Login into pc
		GW_CM_PC_BC_CC_Login.login_PolicyCenter_User("SuperUser");
		// New submission
		CA_Reusables.SubmissionProcess("New Company Account", "Issue Policy");
		PolicyCenter_Resuables.Policytransactions("Renew Policy_NonRenewing");
		PC_Bound.ViewYourPolicy_RenewalNonrenewing();
		// create New Notes
		Tab_Menu_Navigation.pcMenuNavigation("New Note");
		PolicyCenter_Resuables.NewNoteDetails();
		PolicyCenter_Resuables.clickButton("Update");
		// logout
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_CA_PC_NonRenewalWithoutRenewalTransaction() throws Throwable {

		// login to pc
		GW_CM_PC_BC_CC_Login.login_PolicyCenter_User("SuperUser");
		// New submission
		CA_Reusables.SubmissionProcess("New Company Account", "Issue Policy");
		Tab_Menu_Navigation.pcMenuNavigation("Pre Renewal Direction");
		// PreRenewal
		PolicyCenter_Resuables.clickButton("Edit");
		PolicyCenter_Resuables.PreRenewalDirection();
		PolicyCenter_Resuables.clickButton("Update");
		// logout
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}
	@Test
	public void AUT_CA_PC_ApplyEndorsementWhenNonRenewing() throws Throwable {

		// login
		GW_CM_PC_BC_CC_Login.login_PolicyCenter_User("SuperUser");
		// New submission
		CA_Reusables.SubmissionProcess("New Company Account", "Issue Policy");
		// non-Renew policy
		PolicyCenter_Resuables.Policytransactions("Renew Policy_NonRenewing");
		PC_Bound.RenewalNonRenewing_ViewYourPolicy();
		PC_PolicySummary.detail_Verify();
		PC_PolicySummary.account_Verify();
		PC_PolicySummary.openPolicyTransactions();
		// change policy
		PolicyCenter_Resuables.Policytransactions("Change Policy");
		PC_Bound.Renewal_ViewTheUnboundRenewal();
		PolicyCenter_Resuables.clickButton("Next");
		CA_PolicyInfo.policyAddress();
		PolicyCenter_Resuables.clickButton("Quote");
		PolicyCenter_Resuables.clickButton("Bind Options");
		PolicyCenter_Resuables.clickButton("Issue Now");
		PC_Bound.RenewalBound_ViewYourPolicy();
		// logout
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PC_CA_Renewal_InitiateManualRenewal() throws Throwable {

	}
	@Test
	public void AUT_PC_CA_Renewal_ManualRenewal_PolicyReview() throws Throwable {

	}
	@Test
	public void AUT_PC_CA_Renewal_ModifyPolicyData() throws Throwable {

	}
	@Test
	public void AUT_PC_CA_Renewal_QuoteRenewal() throws Throwable {

	}
	@Test
	public void AUT_PC_CA_Renewal_EditAndReQuoteRenewal() throws Throwable {

	}
	@Test
	public void AUT_PC_CA_Renewal_WithdrawRenewal() throws Throwable {

	}
	@Test
	public void AUT_PC_CA_Renewal_ManualRenewal_MultiVersion() throws Throwable {

	}
	@Test
	public void AUT_PC_CA_Renewal_BoundConfirmationAndPolicySummary() throws Throwable {
	}

	@Test
	public void AUT_PC_CA_Renewal_ManualRenewal_SideBySideQuotes() throws Throwable {

	}
	@Test
	public void AUT_PC_CA_Renewal_SetPre_RenewalDirection() throws Throwable {

	}
	@Test
	public void AUT_PC_CA_Renewal_PreRenewalQuestionnaires() throws Throwable {

	}
	@Test
	public void AUT_PC_CA_Renewal_InitiateRenewal_RenewalProcess() throws Throwable {

	}
	@Test
	public void AUT_PC_CA_Renewal_ApplyingEndorsements() throws Throwable {

	}
	@Test
	public void AUT_PC_CA_Renewal_RenewalCancellation() throws Throwable {

	}
	@Test
	public void AUT_PC_CA_Renewal_CloseOptions() throws Throwable {

	}

}
