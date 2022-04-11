package com.Test.Guidewire.BusinessOwners;

import org.testng.annotations.Test;

import com.Utils.Selenium.GW_GetDriver;
import com.pages.Guidewire.GW_CM_PC_BC_CC_Login;
import com.pages.Guidewire.Tab_Menu_Navigation;
import com.pages.Guidewire.BusinessOwners.BO_Building;
import com.pages.Guidewire.BusinessOwners.BO_BusinessOwners_Line;
import com.pages.Guidewire.BusinessOwners.BO_Forms;
import com.pages.Guidewire.BusinessOwners.BO_Locations;
import com.pages.Guidewire.BusinessOwners.BO_Modifiers;
import com.pages.Guidewire.BusinessOwners.BO_Offering;
import com.pages.Guidewire.BusinessOwners.BO_Payment;
import com.pages.Guidewire.BusinessOwners.BO_PolicyInfo;
import com.pages.Guidewire.BusinessOwners.BO_PolicyReview;
import com.pages.Guidewire.BusinessOwners.BO_Qualification;
import com.pages.Guidewire.BusinessOwners.BO_Quote;
import com.pages.Guidewire.BusinessOwners.BO_RiskAnalysis;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_Coverages;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_Drivers;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_Forms;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_Payments;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_PolicyInfo;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_PolicyReview;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_Qualification;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_Quote;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_Reusable;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_RiskAnalysis;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_Vehicles;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Account;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_AccountSummary;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Bound;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_PolicySummary;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Resuables;

public class GW_PC_BusinessOwners_Submission extends GW_GetDriver {

	/*
	 * Testcase = Full Quote Issue Policy Author = Arun Date Created = 27/04/21 LOB
	 * = Personal Auto Parameter testData
	 * 
	 */

	@Test
	public void AUT_BO_PC_NewSubmission_NewAccount_NewSubmission() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter_User("SuperUser");
		/*
		 * // Account Search PolicyCenter_Resuables.pcTabNavigation_Acct_Search();
		 * PolicyCenter_AccountSummary.detail_Verify();
		 * 
		 * 
		 * 
		 * Tab_Menu_Navigation.pcMenuNavigation("New Submission");
		 * PolicyCenter_Resuables.newSubmissions_Verify();
		 */
		// Create person Account
		Tab_Menu_Navigation.pcTabNavigation("New Account", "NA");
		PolicyCenter_Account.createPersonAccount();
		PolicyCenter_AccountSummary.detail_Verify();

		Tab_Menu_Navigation.pcMenuNavigation("New Submission");
		PolicyCenter_Resuables.newSubmissions_Verify();
		BO_Offering.newSubmission_SelectLOB_Businessowners(); // select
																// LOB
		strAccountName = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strSubmissionNumber = PolicyCenter_Resuables.infoBar("SubmissionNumber");
		BO_Offering.offering();
		BO_Offering.BOPOfferingQuestions();
		PolicyCenter_Resuables.clickButton("Next");

		BO_Qualification.qualification();
		PolicyCenter_Resuables.clickButton("Next");

		// Policy Info
		Thread.sleep(2000);
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
		Thread.sleep(2000);
		BO_BusinessOwners_Line.AdditionalCoveragesTab();
		PolicyCenter_Resuables.clickButton("Next");

		// Locations
		BO_Locations.Locations_Details();
		PolicyCenter_Resuables.clickButton("Next");

		// Buildings
		BO_Building.Buildings();
		Thread.sleep(2000);
		BO_Building.buildingDetails();
		Thread.sleep(2000);
		BO_Building.ClassCodeSearch();
		BO_Building.BuildingConstruction();
		BO_Building.BuildingImprovement();
		BO_Building.BurglarAlarm();
		PolicyCenter_Resuables.clickButton("Next");

		// Modifiers
		BO_Modifiers.RatingInputs();
		PolicyCenter_Resuables.clickButton("Next");

		// Risk Analysis
		BO_RiskAnalysis.RiskAnalysis();
		PolicyCenter_Resuables.clickButton("Next");

		BO_PolicyReview.PR_PrimaryInsured();
		PolicyCenter_Resuables.clickButton("Quote");

		 Thread.sleep(2000);
		// Quote
		BO_Quote.quoteDetails();
		PolicyCenter_Resuables.clickButton("Next");
		 Thread.sleep(2000);
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
		strJob = PolicyCenter_Resuables.infoBar("Job");
		strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}
}
