package com.Test.Guidewire.BusinessOwners;

import org.testng.annotations.Test;

import com.Utils.Selenium.GW_GetDriver;
import com.pages.Guidewire.GW_CM_PC_BC_CC_Login;
import com.pages.Guidewire.Tab_Menu_Navigation;
import com.pages.Guidewire.PolicyCenter.PC_Account;
import com.pages.Guidewire.PolicyCenter.PC_AccountSummary;
import com.pages.Guidewire.PolicyCenter.PC_Bound;
import com.pages.Guidewire.PolicyCenter.PC_PolicySummary;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Resuables;
import com.pages.Guidewire.PolicyCenter.BusinessOwners.BO_Building;
import com.pages.Guidewire.PolicyCenter.BusinessOwners.BO_BusinessOwners_Line;
import com.pages.Guidewire.PolicyCenter.BusinessOwners.BO_Forms;
import com.pages.Guidewire.PolicyCenter.BusinessOwners.BO_Locations;
import com.pages.Guidewire.PolicyCenter.BusinessOwners.BO_Modifiers;
import com.pages.Guidewire.PolicyCenter.BusinessOwners.BO_Offering;
import com.pages.Guidewire.PolicyCenter.BusinessOwners.BO_Payment;
import com.pages.Guidewire.PolicyCenter.BusinessOwners.BO_PolicyInfo;
import com.pages.Guidewire.PolicyCenter.BusinessOwners.BO_PolicyReview;
import com.pages.Guidewire.PolicyCenter.BusinessOwners.BO_Qualification;
import com.pages.Guidewire.PolicyCenter.BusinessOwners.BO_Quote;
import com.pages.Guidewire.PolicyCenter.BusinessOwners.BO_RiskAnalysis;

public class BO_Submission extends GW_GetDriver {

	/*
	 * Testcase = Full Quote Issue Policy Author = Arun Date Created = 27/04/21 LOB = Personal Auto Parameter testData
	 * 
	 */

	@Test
	public void AUT_BO_PC_NewSubmission_NewAccount_NewSubmission() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter_User("SuperUser");
		/*
		 * // Account Search PolicyCenter_Resuables.pcTabNavigation_Acct_Search(); PC_AccountSummary.detail_Verify();
		 * 
		 * 
		 * 
		 * Tab_Menu_Navigation.pcMenuNavigation("New Submission"); PolicyCenter_Resuables.newSubmissions_Verify();
		 */
		// Create person Account
		Tab_Menu_Navigation.pcTabNavigation("New Account", "NA");
		PC_Account.createPersonAccount();
		PC_AccountSummary.detail_Verify();

		Tab_Menu_Navigation.pcMenuNavigation("New Submission");
		PolicyCenter_Resuables.newSubmissions_Verify();
		BO_Offering.newSubmission_SelectLOB_Businessowners(); // select
																// LOB
		strAccountName      = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber    = PolicyCenter_Resuables.infoBar("AccountNumber");
		strSubmissionNumber = PolicyCenter_Resuables.infoBar("SubmissionNumber");
		BO_Offering.offering();
		BO_Offering.BOPOfferingQuestions();
		PolicyCenter_Resuables.clickButton("Next");

		BO_Qualification.qualification();
		PolicyCenter_Resuables.clickButton("Next");

		// Policy Info

		BO_PolicyInfo.dateQuoteNeeded();
		BO_PolicyInfo.primaryNamedInsured();
		BO_PolicyInfo.OrganizationType();

		BO_PolicyInfo.affinityGroup();
		BO_PolicyInfo.pi_OfficialID();
		BO_PolicyInfo.policyDetails();
		BO_PolicyInfo.producerOfRecord();
		PolicyCenter_Resuables.clickButton("Next");

		// BusinessOwnersLine
		BO_BusinessOwners_Line.Businessowners();
		BO_BusinessOwners_Line.PropertyCoverage();
		BO_BusinessOwners_Line.OtherIncludedCoverages();

		BO_BusinessOwners_Line.AdditionalCoveragesTab();
		PolicyCenter_Resuables.clickButton("Next");

		// Locations
		BO_Locations.Locations_Details();
		PolicyCenter_Resuables.clickButton("Next");

		// Buildings
		BO_Building.Buildings();

		BO_Building.buildingDetails();

		BO_Building.ClassCodeSearch();
		BO_Building.BuildingConstruction();
		BO_Building.BuildingImprovement();
		BO_Building.BurglarAlarm();
		PolicyCenter_Resuables.clickButton("Next");

		// Modifiers
		BO_Modifiers.RatingInputs();
		PolicyCenter_Resuables.clickButton("Next");

		// Risk Analysis
		BO_RiskAnalysis.button_Verify();
		PolicyCenter_Resuables.clickButton("Next");

		BO_PolicyReview.PR_PrimaryInsured();
		PolicyCenter_Resuables.clickButton("Quote");

		// Quote
		BO_Quote.quoteDetails();
		PolicyCenter_Resuables.clickButton("Next");

		// Forms
		BO_Forms.pa_forms();
		BO_Forms.forms_validate("VERIFY");
		BO_Forms.description_validate("VERIFY");
		PolicyCenter_Resuables.clickButton("Next");

		// Payment
		BO_Payment.premiumSummary();
		BO_Payment.payments();
		BO_Payment.invoicing();
		BO_Payment.billing();

		PolicyCenter_Resuables.clickButton("Bind Options");
		PolicyCenter_Resuables.clickButton("Issue Policy");
		strJob          = PolicyCenter_Resuables.infoBar("Job");
		strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");

		PC_Bound.ViewYourPolicy();
		PC_PolicySummary.detail_Verify();
		PC_PolicySummary.account_Verify();
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PC_BO_Initiation_IssuanceDraft() throws Throwable {

	}
	@Test
	public void AUT_PC_BO_IssuanceReview() throws Throwable {

	}
	@Test
	public void AUT_PC_BO_WithdrawTransaction() throws Throwable {

	}
	@Test
	public void AUT_PC_BO_IssuanceQuoted() throws Throwable {

	}
	@Test
	public void AUT_PC_BO_EditIssuance() throws Throwable {

	}
	@Test
	public void AUT_PC_BO_Initiation_IssuePolicy() throws Throwable {

	}
	@Test
	public void AUT_PC_BO_PM_Coverages() throws Throwable {

	}
	@Test
	public void AUT_PC_BO_PM_AdditionalCoverages() throws Throwable {

	}
	@Test
	public void AUT_PC_BO_PM_Discount() throws Throwable {

	}
	@Test
	public void AUT_PC_BO_RateTableConfig() throws Throwable {

	}
	@Test
	public void AUT_PC_BO_RateRoutineConfig() throws Throwable {

	}
	@Test
	public void AUT_PC_BO_RateBookConfig() throws Throwable {

	}
	@Test
	public void AUT_PC_BO_ExternalRatingSystem() throws Throwable {

	}
	@Test
	public void AUT_PC_BO_ComparativeRater() throws Throwable {

	}
	@Test
	public void AUT_PC_BO_Forms_InferenceLogic() throws Throwable {

	}
}
