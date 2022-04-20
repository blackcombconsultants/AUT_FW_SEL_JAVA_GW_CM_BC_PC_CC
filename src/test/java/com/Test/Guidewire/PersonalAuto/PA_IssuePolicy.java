package com.Test.Guidewire.PersonalAuto;

import org.testng.annotations.Test;

import com.Utils.Selenium.GW_GetDriver;
import com.pages.Guidewire.GW_CM_PC_BC_CC_Login;
import com.pages.Guidewire.Tab_Menu_Navigation;
import com.pages.Guidewire.PolicyCenter.PC_AccountSummary;
import com.pages.Guidewire.PolicyCenter.PC_Bound;
import com.pages.Guidewire.PolicyCenter.PC_PolicySummary;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Resuables;
import com.pages.Guidewire.PolicyCenter.PersonalAuto.PA_Coverages;
import com.pages.Guidewire.PolicyCenter.PersonalAuto.PA_Drivers;
import com.pages.Guidewire.PolicyCenter.PersonalAuto.PA_Forms;
import com.pages.Guidewire.PolicyCenter.PersonalAuto.PA_Payments;
import com.pages.Guidewire.PolicyCenter.PersonalAuto.PA_PolicyInfo;
import com.pages.Guidewire.PolicyCenter.PersonalAuto.PA_PolicyReview;
import com.pages.Guidewire.PolicyCenter.PersonalAuto.PA_Qualification;
import com.pages.Guidewire.PolicyCenter.PersonalAuto.PA_Quote;
import com.pages.Guidewire.PolicyCenter.PersonalAuto.PA_Reusable;
import com.pages.Guidewire.PolicyCenter.PersonalAuto.PA_RiskAnalysis;
import com.pages.Guidewire.PolicyCenter.PersonalAuto.PA_Vehicles;

public class PA_IssuePolicy extends GW_GetDriver {

	/*
	 * Testcase = Full Quote Issue Policy Author = Arun Date Created = 27/04/21
	 * LOB = Personal Auto Parameter testData
	 * 
	 */

	@Test
	public void AUT_PA_PC_IssuePolicy_01() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PolicyCenter_Resuables.pcTabNavigation_Acct_Search();
		PC_AccountSummary.detail_Verify();

		Tab_Menu_Navigation.pcMenuNavigation("New Submission");
		PolicyCenter_Resuables.newSubmissions_Verify();
		PA_Reusable.newSubmission_SelectLOB_PersonalAuto(); // select
																		// LOB

		strAccountName      = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber    = PolicyCenter_Resuables.infoBar("AccountNumber");
		strSubmissionNumber = PolicyCenter_Resuables.infoBar("SubmissionNumber");

		PolicyCenter_Resuables.offering();

		PolicyCenter_Resuables.clickButton("Next");
		PA_Qualification.qualification();

		PolicyCenter_Resuables.clickButton("Next");
		PA_PolicyInfo.primaryNamedInsured();
		PA_PolicyInfo.pi_OfficialID();
		PA_PolicyInfo.policyDetails();
		PA_PolicyInfo.affinityGroup();
		PA_PolicyInfo.producerOfRecord();
		PA_PolicyInfo.underWritingCompany();

		PolicyCenter_Resuables.clickButton("Next");
		PA_Drivers.driver_Add_ExistingDriver();
		PA_Drivers.driver_ContatDetails("VERIFY");
		PA_Drivers.driver_Roles("EDIT"); //
		PA_Drivers.driver_RetrieveMVR();
		PA_Drivers.driver_Addresses("VERIFY");
		PA_Drivers.driver_MotorVehicleRecord("VERIFY");

		PolicyCenter_Resuables.clickButton("Next");
		PA_Vehicles.createVehicles();
		PA_Vehicles.assignDriver();
		// PersonalAuto_Vehicles.additionalInterest_Add_ExistingAdditionalInterest();

		PolicyCenter_Resuables.clickButton("Next");
		PA_Coverages.coveragesAppliedtoallVehiclesIn();
		PA_Coverages.coveragesAppliedperVehiclesIn();
		PA_Coverages.additionalcoveragesAppliedtoallVehiclesIn();
		PA_Coverages.additionalcoveragesAppliedperVehiclesIn();
		PA_Coverages.exclusionsAndConditions();

		PolicyCenter_Resuables.clickButton("Next");
		PA_RiskAnalysis.addUWIssue();
		PA_RiskAnalysis.approveUWIssues();
		PA_RiskAnalysis.riskApprovalDetails(); //
		PA_RiskAnalysis.addUWContingency(); //
		PA_RiskAnalysis.priorPolicies_Add(); //
		// PersonalAuto_RiskAnalysis.priorLosses_Add();

		PolicyCenter_Resuables.clickButton("Next");
		PA_PolicyReview.policyDetails();
		PA_PolicyReview.policyLevelCoverages();
		PA_PolicyReview.vehicleLevelCoverages(); //
		PA_PolicyReview.vehicleLevelCoverages_VehicleCoverages(); //
		PA_PolicyReview.exclusionsAndConditions();

		PolicyCenter_Resuables.clickButton("Save Draft");
		PolicyCenter_Resuables.clickButton("Quote");
		PA_Quote.quoteDetails();
		PA_Quote.policyPremium_Garage1();
		PA_Quote.policyPremium_Vehicle1();
		PA_Quote.policyPremium_PremiumSubtotalandTaxes();
		strJob           = PolicyCenter_Resuables.infoBar("Job");
		strLOB           = PolicyCenter_Resuables.infoBar("LOB");
		strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");
		String strEditLock = PolicyCenter_Resuables.infoBar("EditLock");

		PolicyCenter_Resuables.clickButton("Release Lock");
		PA_RiskAnalysis.releaseLock();

		PA_Quote.quoteDetails();
		PolicyCenter_Resuables.clickButton("Next");
		PA_Forms.pa_forms();

		PolicyCenter_Resuables.clickButton("Next");
		PA_Payments.premiumSummary();
		PA_Payments.payments();
		PA_Payments.invoicing();
		PA_Payments.billing();
		PA_Payments.paymentSchedule();
		PA_Payments.invoicingOverrides();
		PA_Payments.payUsing();
		PA_Payments.upFrontPayment();

		PolicyCenter_Resuables.clickButton("Bind Options");
		PolicyCenter_Resuables.clickButton("Issue Policy");

		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PC_Bound.ViewYourPolicy();
		PC_PolicySummary.detail_Verify();
		PC_PolicySummary.account_Verify();

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
		PC_PolicySummary.detail_Verify();

		Tab_Menu_Navigation.pcMenuNavigation("Change Policy");
		PolicyCenter_Resuables.newSubmissions_Verify();
		PA_Reusable.newSubmission_SelectLOB_PersonalAuto(); // select
																		// LOB

		strAccountName      = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber    = PolicyCenter_Resuables.infoBar("AccountNumber");
		strSubmissionNumber = PolicyCenter_Resuables.infoBar("SubmissionNumber");

		PolicyCenter_Resuables.offering();

		PolicyCenter_Resuables.clickButton("Next");
		PA_Qualification.qualification();

		PolicyCenter_Resuables.clickButton("Next");
		PA_PolicyInfo.primaryNamedInsured();
		PA_PolicyInfo.pi_OfficialID();
		PA_PolicyInfo.policyDetails();
		PA_PolicyInfo.affinityGroup();
		PA_PolicyInfo.producerOfRecord();
		PA_PolicyInfo.underWritingCompany();

		PolicyCenter_Resuables.clickButton("Next");
		PA_Drivers.driver_Edit_ExistingDriver();
		PA_Drivers.driver_ContatDetails("VERIFY");
		PA_Drivers.driver_Roles("EDIT"); //
		PA_Drivers.driver_RetrieveMVR();
		PA_Drivers.driver_Addresses("VERIFY");
		PA_Drivers.driver_MotorVehicleRecord("VERIFY");

		PolicyCenter_Resuables.clickButton("Next");
		PA_Vehicles.createVehicles();
		PA_Vehicles.assignDriver();
		// PersonalAuto_Vehicles.additionalInterest_Add_ExistingAdditionalInterest();

		PolicyCenter_Resuables.clickButton("Next");
		PA_Coverages.coveragesAppliedtoallVehiclesIn();
		PA_Coverages.coveragesAppliedperVehiclesIn();
		PA_Coverages.additionalcoveragesAppliedtoallVehiclesIn();
		PA_Coverages.additionalcoveragesAppliedperVehiclesIn();
		PA_Coverages.exclusionsAndConditions();

		PolicyCenter_Resuables.clickButton("Next");
		PA_RiskAnalysis.addUWIssue();
		PA_RiskAnalysis.approveUWIssues();
		PA_RiskAnalysis.riskApprovalDetails(); //
		PA_RiskAnalysis.addUWContingency(); //
		PA_RiskAnalysis.priorPolicies_Add(); //
		// PersonalAuto_RiskAnalysis.priorLosses_Add();

		PolicyCenter_Resuables.clickButton("Next");
		PA_PolicyReview.policyDetails();
		PA_PolicyReview.policyLevelCoverages();
		PA_PolicyReview.vehicleLevelCoverages(); //
		PA_PolicyReview.vehicleLevelCoverages_VehicleCoverages(); //
		PA_PolicyReview.exclusionsAndConditions();

		PolicyCenter_Resuables.clickButton("Save Draft");
		PolicyCenter_Resuables.clickButton("Quote");
		PA_Quote.quoteDetails();
		PA_Quote.policyPremium_Garage1();
		PA_Quote.policyPremium_Vehicle1();
		PA_Quote.policyPremium_PremiumSubtotalandTaxes();
		strJob           = PolicyCenter_Resuables.infoBar("Job");
		strLOB           = PolicyCenter_Resuables.infoBar("LOB");
		strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");
		String strEditLock = PolicyCenter_Resuables.infoBar("EditLock");

		PolicyCenter_Resuables.clickButton("Release Lock");
		PA_RiskAnalysis.releaseLock();

		PA_Quote.quoteDetails();
		PolicyCenter_Resuables.clickButton("Next");
		PA_Forms.pa_forms();

		PolicyCenter_Resuables.clickButton("Next");
		PA_Payments.premiumSummary();
		PA_Payments.payments();
		PA_Payments.invoicing();
		PA_Payments.billing();
		PA_Payments.paymentSchedule();
		PA_Payments.invoicingOverrides();
		PA_Payments.payUsing();
		PA_Payments.upFrontPayment();

		PolicyCenter_Resuables.clickButton("Bind Options");
		PolicyCenter_Resuables.clickButton("Issue Policy");

		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PC_Bound.ViewYourPolicy();
		PC_PolicySummary.detail_Verify();
		PC_PolicySummary.account_Verify();

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
