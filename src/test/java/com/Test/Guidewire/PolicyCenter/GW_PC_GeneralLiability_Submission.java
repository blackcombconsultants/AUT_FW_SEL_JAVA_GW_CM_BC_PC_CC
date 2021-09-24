package com.Test.Guidewire.PolicyCenter;

import org.testng.annotations.Test;

import com.Utils.Selenium.GW_GetDriver;
import com.pages.Guidewire.GW_CM_PC_BC_CC_Login;
import com.pages.Guidewire.Tab_Menu_Navigation;
import com.pages.Guidewire.GeneralLiability.GL_Coverages;
import com.pages.Guidewire.GeneralLiability.GL_Exposures;
import com.pages.Guidewire.GeneralLiability.GL_Forms;
import com.pages.Guidewire.GeneralLiability.GL_Locations;
import com.pages.Guidewire.GeneralLiability.GL_Modifiers;
import com.pages.Guidewire.GeneralLiability.GL_Payment;
import com.pages.Guidewire.GeneralLiability.GL_PolicyInfo;
import com.pages.Guidewire.GeneralLiability.GL_PolicyReview;
import com.pages.Guidewire.GeneralLiability.GL_Qualification;
import com.pages.Guidewire.GeneralLiability.GL_Quote;
import com.pages.Guidewire.GeneralLiability.GL_RiskAnalysis;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_Coverages;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_Forms;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_Payments;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_PolicyReview;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_Quote;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_Reusable;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_RiskAnalysis;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_Vehicles;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Account;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_AccountSummary;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Bound;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_PolicySummary;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Resuables;

public class GW_PC_GeneralLiability_Submission extends GW_GetDriver {

	@Test
	public void AUT_GL_PC_NewSubmission_SearchAccount_NewSubmission() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter_User("SuperUser");
		// Account Search
		PolicyCenter_Resuables.pcTabNavigation_Acct_Search();
		PolicyCenter_AccountSummary.detail_Verify();

		Tab_Menu_Navigation.pcMenuNavigation("New Submission");
		PolicyCenter_Resuables.newSubmissions_Verify();
		PersonalAuto_Reusable.newSubmission_SelectLOB_GeneralLiability(); // select
																			// LOB
		strAccountName = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strSubmissionNumber = PolicyCenter_Resuables.infoBar("SubmissionNumber");

		PolicyCenter_Resuables.offering();

		PolicyCenter_Resuables.clickButton("Next");
		GL_Qualification.qualification();

		PolicyCenter_Resuables.clickButton("Next");
		GL_PolicyInfo.dateQuoteNeeded();
		GL_PolicyInfo.primaryNamedInsured();
		GL_PolicyInfo.OfficialID();
		GL_PolicyInfo.businessandOperations();
		GL_PolicyInfo.OrganizationType();
		GL_PolicyInfo.policyDetails();
		GL_PolicyInfo.affinityGroup();
		GL_PolicyInfo.producerOfRecord();

		PolicyCenter_Resuables.clickButton("Next");
		GL_Locations.Locations_Details();

		PolicyCenter_Resuables.clickButton("Next");

		GL_Coverages.StandardCoverages();

		PolicyCenter_Resuables.clickButton("Next");

		GL_Exposures.ExposureValuesbylocation_Add();
		PolicyCenter_Resuables.clickButton("Next");

		GL_Modifiers.RatingInputs();
		PolicyCenter_Resuables.clickButton("Next");

		GL_RiskAnalysis.button_Verify();
		PolicyCenter_Resuables.clickButton("Next");

		GL_PolicyReview.PrimaryNamedInsured();
		GL_PolicyReview.PolicyDetails();
		PolicyCenter_Resuables.clickButton("Save Draft");
		PolicyCenter_Resuables.clickButton("Quote");
		GL_Quote.QuoteDetails();

		strJob = PolicyCenter_Resuables.infoBar("Job");
		strLOB = PolicyCenter_Resuables.infoBar("LOB");
		strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strAccountName = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Resuables.clickButton("Next");
		GL_Forms.pa_forms();
		PolicyCenter_Resuables.clickButton("Next");

		GL_Payment.premiumSummary();
		GL_Payment.payments();
		GL_Payment.invoicing();
		GL_Payment.billing();

		PolicyCenter_Resuables.clickButton("Bind Options");
		PolicyCenter_Resuables.clickButton("Issue Policy");
		strJob = PolicyCenter_Resuables.infoBar("Job");
		strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();

	}
              
	@Test
	public void AUT_GL_PC_NewSubmission_NewAccount_NewSubmission() throws Throwable {
		// Login
		GW_CM_PC_BC_CC_Login.login_PolicyCenter_User("SuperUser");

		// Create person Account
		Tab_Menu_Navigation.pcTabNavigation("New Account", "NA");
		PolicyCenter_Account.createPersonAccount();
		PolicyCenter_AccountSummary.detail_Verify();
		
		Tab_Menu_Navigation.pcMenuNavigation("New Submission");
		PolicyCenter_Resuables.newSubmissions_Verify();
		PersonalAuto_Reusable.newSubmission_SelectLOB_GeneralLiability(); // select
																			// LOB
		strAccountName = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strSubmissionNumber = PolicyCenter_Resuables.infoBar("SubmissionNumber");

		PolicyCenter_Resuables.offering();

		PolicyCenter_Resuables.clickButton("Next");
		GL_Qualification.qualification();

		PolicyCenter_Resuables.clickButton("Next");
		GL_PolicyInfo.dateQuoteNeeded();
		GL_PolicyInfo.primaryNamedInsured();
		GL_PolicyInfo.OfficialID();
		GL_PolicyInfo.businessandOperations();
		GL_PolicyInfo.OrganizationType();
		GL_PolicyInfo.policyDetails();
		GL_PolicyInfo.affinityGroup();
		GL_PolicyInfo.producerOfRecord();

		PolicyCenter_Resuables.clickButton("Next");
		GL_Locations.Locations_Details();

		PolicyCenter_Resuables.clickButton("Next");

		GL_Coverages.StandardCoverages();

		PolicyCenter_Resuables.clickButton("Next");

		GL_Exposures.ExposureValuesbylocation_Add();
		PolicyCenter_Resuables.clickButton("Next");

		GL_Modifiers.RatingInputs();
		PolicyCenter_Resuables.clickButton("Next");

		GL_RiskAnalysis.button_Verify();
		PolicyCenter_Resuables.clickButton("Next");

		GL_PolicyReview.PrimaryNamedInsured();
		GL_PolicyReview.PolicyDetails();
		PolicyCenter_Resuables.clickButton("Save Draft");
		PolicyCenter_Resuables.clickButton("Quote");
		GL_Quote.QuoteDetails();

		strJob = PolicyCenter_Resuables.infoBar("Job");
		strLOB = PolicyCenter_Resuables.infoBar("LOB");
		strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strAccountName = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Resuables.clickButton("Next");
		GL_Forms.pa_forms();
		PolicyCenter_Resuables.clickButton("Next");

		GL_Payment.premiumSummary();
		GL_Payment.payments();
		GL_Payment.invoicing();
		GL_Payment.billing();

		PolicyCenter_Resuables.clickButton("Bind Options");
		PolicyCenter_Resuables.clickButton("Issue Policy");
		strJob = PolicyCenter_Resuables.infoBar("Job");
		strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();

	}

}
