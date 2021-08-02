package com.Test.Guidewire.PolicyCenter;

import org.testng.annotations.Test;

import com.Utils.Selenium.GW_GetDriver;
import com.pages.Guidewire.GW_CM_PC_BC_CC_Login;
import com.pages.Guidewire.Tab_Menu_Navigation;
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
import com.pages.Guidewire.PolicyCenter.PolicyCenter_AccountSummary;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Bound;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_PolicySummary;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Resuables;

public class GW_PC_PersonalAuto_IssuePolicy extends GW_GetDriver {

	/*
	 * Testcase = Full Quote Issue Policy Author = Arun Date Created = 27/04/21
	 * LOB = Personal Auto Parameter testData
	 * 
	 */

	@Test
	public void AUT_PA_PC_IssuePolicy_01() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PolicyCenter_Resuables.pcTabNavigation_Acct_Search();
		PolicyCenter_AccountSummary.detail_Verify();

		Tab_Menu_Navigation.pcMenuNavigation("New Submission");
		PolicyCenter_Resuables.newSubmissions_Verify();
		PersonalAuto_Reusable.newSubmission_SelectLOB_PersonalAuto(); // select
																		// LOB

		strAccountName      = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber    = PolicyCenter_Resuables.infoBar("AccountNumber");
		strSubmissionNumber = PolicyCenter_Resuables.infoBar("SubmissionNumber");

		PolicyCenter_Resuables.offering();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Qualification.qualification();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyInfo.primaryNamedInsured();
		PersonalAuto_PolicyInfo.pi_OfficialID();
		PersonalAuto_PolicyInfo.policyDetails();
		PersonalAuto_PolicyInfo.affinityGroup();
		PersonalAuto_PolicyInfo.producerOfRecord();
		PersonalAuto_PolicyInfo.underWritingCompany();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Drivers.driver_Add_ExistingDriver();
		PersonalAuto_Drivers.driver_ContatDetails("VERIFY");
		PersonalAuto_Drivers.driver_Roles("EDIT"); //
		PersonalAuto_Drivers.driver_RetrieveMVR();
		PersonalAuto_Drivers.driver_Addresses("VERIFY");
		PersonalAuto_Drivers.driver_MotorVehicleRecord("VERIFY");

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Vehicles.createVehicles();
		PersonalAuto_Vehicles.assignDriver();
		// PersonalAuto_Vehicles.additionalInterest_Add_ExistingAdditionalInterest();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Coverages.coveragesAppliedtoallVehiclesIn();
		PersonalAuto_Coverages.coveragesAppliedperVehiclesIn();
		PersonalAuto_Coverages.additionalcoveragesAppliedtoallVehiclesIn();
		PersonalAuto_Coverages.additionalcoveragesAppliedperVehiclesIn();
		PersonalAuto_Coverages.exclusionsAndConditions();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_RiskAnalysis.addUWIssue();
		PersonalAuto_RiskAnalysis.approveUWIssues();
		PersonalAuto_RiskAnalysis.riskApprovalDetails(); //
		PersonalAuto_RiskAnalysis.addUWContingency(); //
		PersonalAuto_RiskAnalysis.priorPolicies_Add(); //
		// PersonalAuto_RiskAnalysis.priorLosses_Add();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyReview.policyDetails();
		PersonalAuto_PolicyReview.policyLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages(); //
		PersonalAuto_PolicyReview.vehicleLevelCoverages_VehicleCoverages(); //
		PersonalAuto_PolicyReview.exclusionsAndConditions();

		PolicyCenter_Resuables.clickButton("Save Draft");
		PolicyCenter_Resuables.clickButton("Quote");
		PersonalAuto_Quote.quoteDetails();
		PersonalAuto_Quote.policyPremium_Garage1();
		PersonalAuto_Quote.policyPremium_Vehicle1();
		PersonalAuto_Quote.policyPremium_PremiumSubtotalandTaxes();
		strJob           = PolicyCenter_Resuables.infoBar("Job");
		strLOB           = PolicyCenter_Resuables.infoBar("LOB");
		strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");
		String strEditLock = PolicyCenter_Resuables.infoBar("EditLock");

		PolicyCenter_Resuables.clickButton("Release Lock");
		PersonalAuto_RiskAnalysis.releaseLock();

		PersonalAuto_Quote.quoteDetails();
		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Forms.pa_forms();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Payments.premiumSummary();
		PersonalAuto_Payments.payments();
		PersonalAuto_Payments.invoicing();
		PersonalAuto_Payments.billing();
		PersonalAuto_Payments.paymentSchedule();
		PersonalAuto_Payments.invoicingOverrides();
		PersonalAuto_Payments.payUsing();
		PersonalAuto_Payments.upFrontPayment();

		PolicyCenter_Resuables.clickButton("Bind Options");
		PolicyCenter_Resuables.clickButton("Issue Policy");

		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();

	}

	/*
	 * Testcase = Full Quote - Edit the Policy during Issuance Author = Arun
	 * Date Created = 27/04/21 LOB = Personal Auto Parameter testData
	 * 
	 */

	@Test
	public void AUT_PA_PC_Issuance_4_Editpolicytransaction() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PolicyCenter_Resuables.pcTabNavigation_Policy_Search();
		PolicyCenter_PolicySummary.detail_Verify();

		Tab_Menu_Navigation.pcMenuNavigation("Change Policy");
		PolicyCenter_Resuables.newSubmissions_Verify();
		PersonalAuto_Reusable.newSubmission_SelectLOB_PersonalAuto(); // select
																		// LOB

		strAccountName      = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber    = PolicyCenter_Resuables.infoBar("AccountNumber");
		strSubmissionNumber = PolicyCenter_Resuables.infoBar("SubmissionNumber");

		PolicyCenter_Resuables.offering();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Qualification.qualification();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyInfo.primaryNamedInsured();
		PersonalAuto_PolicyInfo.pi_OfficialID();
		PersonalAuto_PolicyInfo.policyDetails();
		PersonalAuto_PolicyInfo.affinityGroup();
		PersonalAuto_PolicyInfo.producerOfRecord();
		PersonalAuto_PolicyInfo.underWritingCompany();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Drivers.driver_Edit_ExistingDriver();
		PersonalAuto_Drivers.driver_ContatDetails("VERIFY");
		PersonalAuto_Drivers.driver_Roles("EDIT"); //
		PersonalAuto_Drivers.driver_RetrieveMVR();
		PersonalAuto_Drivers.driver_Addresses("VERIFY");
		PersonalAuto_Drivers.driver_MotorVehicleRecord("VERIFY");

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Vehicles.createVehicles();
		PersonalAuto_Vehicles.assignDriver();
		// PersonalAuto_Vehicles.additionalInterest_Add_ExistingAdditionalInterest();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Coverages.coveragesAppliedtoallVehiclesIn();
		PersonalAuto_Coverages.coveragesAppliedperVehiclesIn();
		PersonalAuto_Coverages.additionalcoveragesAppliedtoallVehiclesIn();
		PersonalAuto_Coverages.additionalcoveragesAppliedperVehiclesIn();
		PersonalAuto_Coverages.exclusionsAndConditions();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_RiskAnalysis.addUWIssue();
		PersonalAuto_RiskAnalysis.approveUWIssues();
		PersonalAuto_RiskAnalysis.riskApprovalDetails(); //
		PersonalAuto_RiskAnalysis.addUWContingency(); //
		PersonalAuto_RiskAnalysis.priorPolicies_Add(); //
		// PersonalAuto_RiskAnalysis.priorLosses_Add();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyReview.policyDetails();
		PersonalAuto_PolicyReview.policyLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages(); //
		PersonalAuto_PolicyReview.vehicleLevelCoverages_VehicleCoverages(); //
		PersonalAuto_PolicyReview.exclusionsAndConditions();

		PolicyCenter_Resuables.clickButton("Save Draft");
		PolicyCenter_Resuables.clickButton("Quote");
		PersonalAuto_Quote.quoteDetails();
		PersonalAuto_Quote.policyPremium_Garage1();
		PersonalAuto_Quote.policyPremium_Vehicle1();
		PersonalAuto_Quote.policyPremium_PremiumSubtotalandTaxes();
		strJob           = PolicyCenter_Resuables.infoBar("Job");
		strLOB           = PolicyCenter_Resuables.infoBar("LOB");
		strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");
		String strEditLock = PolicyCenter_Resuables.infoBar("EditLock");

		PolicyCenter_Resuables.clickButton("Release Lock");
		PersonalAuto_RiskAnalysis.releaseLock();

		PersonalAuto_Quote.quoteDetails();
		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Forms.pa_forms();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Payments.premiumSummary();
		PersonalAuto_Payments.payments();
		PersonalAuto_Payments.invoicing();
		PersonalAuto_Payments.billing();
		PersonalAuto_Payments.paymentSchedule();
		PersonalAuto_Payments.invoicingOverrides();
		PersonalAuto_Payments.payUsing();
		PersonalAuto_Payments.upFrontPayment();

		PolicyCenter_Resuables.clickButton("Bind Options");
		PolicyCenter_Resuables.clickButton("Issue Policy");

		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();

	}

	/*
	 * Testcase = Full Quote Issuance withdraw Submission Author = Arun Date
	 * Created = 26/04/21 LOB = Personal Auto Parameter testData
	 * 
	 */
	@Test
	public void AUT_PA_PC_Issuance_1_WithdrawTransaction() throws Throwable {

	}
}
