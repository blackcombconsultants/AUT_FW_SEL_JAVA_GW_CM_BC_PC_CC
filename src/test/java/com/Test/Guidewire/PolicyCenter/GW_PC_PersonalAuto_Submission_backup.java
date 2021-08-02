package com.Test.Guidewire.PolicyCenter;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
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
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Account;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_AccountSummary;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Bound;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_PolicySummary;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Resuables;

public class GW_PC_PersonalAuto_Submission_backup extends GW_GetDriver {

	@BeforeTest
	public void driver_ObjReference_Initiate() {
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("@BeforeTest");
		System.out.println("-------------------------------------------------------------------------");
	}

	@AfterTest
	public void driver_ObjReference_Garbage() {
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("@AfterTest");
		System.out.println("-------------------------------------------------------------------------");
	}

	@Test(enabled = false)
	public void AUT_PA_PC_NewSubmission_6_Single_QuickQuote() throws Throwable {

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
		PolicyCenter_Resuables.clickButton("Bind Only");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_9_Single_QuickQuote_Driver_Add() throws Throwable {

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
		PolicyCenter_Resuables.clickButton("Bind Only");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_12_Single_QuickQuote_VehicleRemove() throws Throwable {

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
		PolicyCenter_Resuables.clickButton("Bind Only");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_15_Single_QuickQuote_FullApplication() throws Throwable {

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
		PolicyCenter_Resuables.clickButton("Bind Only");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_36_PI_PrimaryNamedInsured_ChangeTo_From_AddressBook() throws Throwable {

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
		PolicyCenter_Resuables.clickButton("Bind Only");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_39_PI_Policy_Address_ChangeTo_EditCurrent_Address() throws Throwable {

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
		PolicyCenter_Resuables.clickButton("Bind Only");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_43_PI_AdditionalInsured_Delete() throws Throwable {

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
		PolicyCenter_Resuables.clickButton("Bind Only");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_46_PI_SecondaryNamedInsured_Delete() throws Throwable {

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
		PolicyCenter_Resuables.clickButton("Bind Only");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_49_PI_EffectiveDate_FutureDated() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		Tab_Menu_Navigation.pcTabNavigation("New Account", "NA");
		PolicyCenter_Account.createPersonAccount();
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

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Vehicles.createVehicles();
		PersonalAuto_Vehicles.assignDriver();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Coverages.coveragesAppliedtoallVehiclesIn();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_RiskAnalysis.button_Verify();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyReview.policyDetails();
		PersonalAuto_PolicyReview.policyLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages();

		PolicyCenter_Resuables.clickButton("Save Draft");
		PolicyCenter_Resuables.clickButton("Quote");
		PersonalAuto_Quote.quoteDetails();
		PersonalAuto_Quote.policyPremium_Garage1();
		PersonalAuto_Quote.policyPremium_Vehicle1();
		PersonalAuto_Quote.policyPremium_PremiumSubtotalandTaxes();
		strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");
		String strEditLock = PolicyCenter_Resuables.infoBar("EditLock");

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Forms.pa_forms();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Payments.premiumSummary();
		PersonalAuto_Payments.payments();
		PersonalAuto_Payments.invoicing();
		PersonalAuto_Payments.billing();
		PersonalAuto_Payments.paymentSchedule();
		PersonalAuto_Payments.upFrontPayment();

		PolicyCenter_Resuables.clickButton("Bind Options");
		PolicyCenter_Resuables.clickButton("Bind Only");
		strJob           = PolicyCenter_Resuables.infoBar("Job");
		strLOB           = PolicyCenter_Resuables.infoBar("LOB");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_52_PI_AffinityGoup() throws Throwable {

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
		PolicyCenter_Resuables.clickButton("Bind Only");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_55_PI_Negative_EffectiveDate() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		Tab_Menu_Navigation.pcTabNavigation("New Account", "NA");
		PolicyCenter_Account.createPersonAccount();
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

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Vehicles.createVehicles();
		PersonalAuto_Vehicles.assignDriver();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Coverages.coveragesAppliedtoallVehiclesIn();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_RiskAnalysis.button_Verify();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyReview.policyDetails();
		PersonalAuto_PolicyReview.policyLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages();

		PolicyCenter_Resuables.clickButton("Save Draft");
		PolicyCenter_Resuables.clickButton("Quote");
		PersonalAuto_Quote.quoteDetails();
		PersonalAuto_Quote.policyPremium_Garage1();
		PersonalAuto_Quote.policyPremium_Vehicle1();
		PersonalAuto_Quote.policyPremium_PremiumSubtotalandTaxes();
		strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");
		String strEditLock = PolicyCenter_Resuables.infoBar("EditLock");

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Forms.pa_forms();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Payments.premiumSummary();
		PersonalAuto_Payments.payments();
		PersonalAuto_Payments.invoicing();
		PersonalAuto_Payments.billing();
		PersonalAuto_Payments.paymentSchedule();
		PersonalAuto_Payments.upFrontPayment();

		PolicyCenter_Resuables.clickButton("Bind Options");
		PolicyCenter_Resuables.clickButton("Bind Only");
		strJob           = PolicyCenter_Resuables.infoBar("Job");
		strLOB           = PolicyCenter_Resuables.infoBar("LOB");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_58_PA_Driver_Add_ExistingDriver() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		Tab_Menu_Navigation.pcTabNavigation("New Account", "NA");
		PolicyCenter_Account.createPersonAccount();
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

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Vehicles.createVehicles();
		PersonalAuto_Vehicles.assignDriver();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Coverages.coveragesAppliedtoallVehiclesIn();
		PersonalAuto_Coverages.coveragesAppliedperVehiclesIn();
		PersonalAuto_Coverages.additionalcoveragesAppliedtoallVehiclesIn();
		PersonalAuto_Coverages.additionalcoveragesAppliedperVehiclesIn();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_RiskAnalysis.button_Verify();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyReview.policyDetails();
		PersonalAuto_PolicyReview.policyLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages_VehicleCoverages();

		PolicyCenter_Resuables.clickButton("Save Draft");
		PolicyCenter_Resuables.clickButton("Quote");
		PersonalAuto_Quote.quoteDetails();
		PersonalAuto_Quote.policyPremium_Garage1();
		PersonalAuto_Quote.policyPremium_Vehicle1();
		PersonalAuto_Quote.policyPremium_PremiumSubtotalandTaxes();
		strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");
		String strEditLock = PolicyCenter_Resuables.infoBar("EditLock");

		PersonalAuto_Quote.quoteDetails();
		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Forms.pa_forms();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Payments.premiumSummary();
		PersonalAuto_Payments.payments();
		PersonalAuto_Payments.invoicing();
		PersonalAuto_Payments.billing();
		PersonalAuto_Payments.paymentSchedule();
		PersonalAuto_Payments.upFrontPayment();

		PolicyCenter_Resuables.clickButton("Bind Options");
		PolicyCenter_Resuables.clickButton("Bind Only");
		strJob           = PolicyCenter_Resuables.infoBar("Job");
		strLOB           = PolicyCenter_Resuables.infoBar("LOB");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_61_PA_Driver_Modify_Roles() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PolicyCenter_Resuables.pcTabNavigation_Sub_Search();

		strAccountName      = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber    = PolicyCenter_Resuables.infoBar("AccountNumber");
		strSubmissionNumber = PolicyCenter_Resuables.infoBar("SubmissionNumber");

		PersonalAuto_Quote.quoteDetails();

		PolicyCenter_Resuables.clickButton("Edit Policy Transaction");
		PersonalAuto_PolicyReview.policyDetails();

		PersonalAuto_Reusable.paMenuNavigation("Offering");
		PolicyCenter_Resuables.offering();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Qualification.qualification();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyInfo.primaryNamedInsured();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Drivers.driver_ContatDetails("EDIT");
		PersonalAuto_Drivers.driver_Roles("EDIT");

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Vehicles.Vehicles_Verify();

		PolicyCenter_Resuables.clickButton("Save Draft");
		PolicyCenter_Resuables.clickButton("Quote");
		PersonalAuto_Quote.quoteDetails();
		PersonalAuto_Quote.policyPremium_Garage1();
		PersonalAuto_Quote.policyPremium_Vehicle1();
		PersonalAuto_Quote.policyPremium_PremiumSubtotalandTaxes();
		strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");
		String strEditLock = PolicyCenter_Resuables.infoBar("EditLock");

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Forms.pa_forms();

		strJob           = PolicyCenter_Resuables.infoBar("Job");
		strLOB           = PolicyCenter_Resuables.infoBar("LOB");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_64_PA_Driver_MVRReportDetails() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		Tab_Menu_Navigation.pcTabNavigation("New Account", "NA");
		PolicyCenter_Account.createPersonAccount();
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

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Vehicles.createVehicles();
		PersonalAuto_Vehicles.assignDriver();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Coverages.coveragesAppliedtoallVehiclesIn();
		PersonalAuto_Coverages.coveragesAppliedperVehiclesIn();
		PersonalAuto_Coverages.additionalcoveragesAppliedtoallVehiclesIn();
		PersonalAuto_Coverages.additionalcoveragesAppliedperVehiclesIn();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_RiskAnalysis.button_Verify();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyReview.policyDetails();
		PersonalAuto_PolicyReview.policyLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages_VehicleCoverages();

		PolicyCenter_Resuables.clickButton("Save Draft");
		PolicyCenter_Resuables.clickButton("Quote");
		PersonalAuto_Quote.quoteDetails();
		PersonalAuto_Quote.policyPremium_Garage1();
		PersonalAuto_Quote.policyPremium_Vehicle1();
		PersonalAuto_Quote.policyPremium_PremiumSubtotalandTaxes();
		strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");
		String strEditLock = PolicyCenter_Resuables.infoBar("EditLock");

		PersonalAuto_Quote.quoteDetails();
		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Forms.pa_forms();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Payments.premiumSummary();
		PersonalAuto_Payments.payments();
		PersonalAuto_Payments.invoicing();
		PersonalAuto_Payments.billing();
		PersonalAuto_Payments.paymentSchedule();
		PersonalAuto_Payments.upFrontPayment();

		PolicyCenter_Resuables.clickButton("Bind Options");
		PolicyCenter_Resuables.clickButton("Bind Only");
		strJob           = PolicyCenter_Resuables.infoBar("Job");
		strLOB           = PolicyCenter_Resuables.infoBar("LOB");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_67_PA_Driver_Negative_Roles() throws Throwable {

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
		PolicyCenter_Resuables.clickButton("Bind Only");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_70_PA_Vehicle_Modify() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PolicyCenter_Resuables.pcTabNavigation_Sub_Search();

		strAccountName      = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber    = PolicyCenter_Resuables.infoBar("AccountNumber");
		strSubmissionNumber = PolicyCenter_Resuables.infoBar("SubmissionNumber");

		PersonalAuto_Quote.quoteDetails();

		PolicyCenter_Resuables.clickButton("Edit Policy Transaction");
		PersonalAuto_PolicyReview.policyDetails();

		PersonalAuto_Reusable.paMenuNavigation("Vehicles");
		PersonalAuto_Vehicles.Vehicles_Edit();

		PolicyCenter_Resuables.clickButton("Save Draft");
		PolicyCenter_Resuables.clickButton("Quote");
		PersonalAuto_Quote.quoteDetails();
		PersonalAuto_Quote.policyPremium_Garage1();
		PersonalAuto_Quote.policyPremium_Vehicle1();
		PersonalAuto_Quote.policyPremium_PremiumSubtotalandTaxes();
		strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");
		String strEditLock = PolicyCenter_Resuables.infoBar("EditLock");

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Forms.pa_forms();

		strJob           = PolicyCenter_Resuables.infoBar("Job");
		strLOB           = PolicyCenter_Resuables.infoBar("LOB");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_73_PA_Vehicle_AdditionalInterest_Add_NewCompany() throws Throwable {

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
		PolicyCenter_Resuables.clickButton("Bind Only");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_76_PA_Vehicle_Negative_Atleast1Vehicle() throws Throwable {

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
		PolicyCenter_Resuables.clickButton("Bind Only");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_79_PA_Vehicle_Negative_LicenseState() throws Throwable {

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
		PolicyCenter_Resuables.clickButton("Bind Only");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_82_PA_Coverages_AllVehicles_Modify() throws Throwable {

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
		PolicyCenter_Resuables.clickButton("Bind Only");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_85_PA_Coverages_PerVehicle_Modify() throws Throwable {

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
		PolicyCenter_Resuables.clickButton("Bind Only");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_88_PA_AdditionalCoverages_AllVehicles_Modify() throws Throwable {

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
		PolicyCenter_Resuables.clickButton("Bind Only");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_91_PA_AdditionalCoverages_PerVehicle_Modify() throws Throwable {

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
		PolicyCenter_Resuables.clickButton("Bind Only");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_94_PA_ExclusionandCondition_Add_Condition() throws Throwable {

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
		PolicyCenter_Resuables.clickButton("Bind Only");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_97_PA_ExclusionandCondition_Modify_Condition() throws Throwable {

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
		PolicyCenter_Resuables.clickButton("Bind Only");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_100_RiskAnalysis_AddUWIssue() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		Tab_Menu_Navigation.pcTabNavigation("New Account", "NA");
		PolicyCenter_Account.createPersonAccount();
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

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Vehicles.createVehicles();
		PersonalAuto_Vehicles.assignDriver();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Coverages.coveragesAppliedtoallVehiclesIn();
		PersonalAuto_Coverages.coveragesAppliedperVehiclesIn();
		PersonalAuto_Coverages.additionalcoveragesAppliedtoallVehiclesIn();
		PersonalAuto_Coverages.additionalcoveragesAppliedperVehiclesIn();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_RiskAnalysis.addUWIssue();
		PersonalAuto_RiskAnalysis.approveUWIssues();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyReview.policyDetails();
		PersonalAuto_PolicyReview.policyLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages_VehicleCoverages();

		PolicyCenter_Resuables.clickButton("Save Draft");
		PolicyCenter_Resuables.clickButton("Quote");
		PersonalAuto_Quote.quoteDetails();
		PersonalAuto_Quote.policyPremium_Garage1();
		PersonalAuto_Quote.policyPremium_Vehicle1();
		PersonalAuto_Quote.policyPremium_PremiumSubtotalandTaxes();
		strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");
		String strEditLock = PolicyCenter_Resuables.infoBar("EditLock");

		PersonalAuto_Quote.quoteDetails();
		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Forms.pa_forms();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Payments.premiumSummary();
		PersonalAuto_Payments.payments();
		PersonalAuto_Payments.invoicing();
		PersonalAuto_Payments.billing();
		PersonalAuto_Payments.paymentSchedule();
		PersonalAuto_Payments.upFrontPayment();

		PolicyCenter_Resuables.clickButton("Bind Options");
		PolicyCenter_Resuables.clickButton("Bind Only");
		strJob           = PolicyCenter_Resuables.infoBar("Job");
		strLOB           = PolicyCenter_Resuables.infoBar("LOB");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_103_RiskAnalysis_LockforReview() throws Throwable {

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
		PolicyCenter_Resuables.clickButton("Bind Only");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_106_RiskAnalysis_PriorPolicies_Modify() throws Throwable {

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
		PolicyCenter_Resuables.clickButton("Bind Only");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_109_RiskAnalysis_PriorLosses_Add() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		Tab_Menu_Navigation.pcTabNavigation("New Account", "NA");
		PolicyCenter_Account.createPersonAccount();
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

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Vehicles.createVehicles();
		PersonalAuto_Vehicles.assignDriver();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Coverages.coveragesAppliedtoallVehiclesIn();
		PersonalAuto_Coverages.coveragesAppliedperVehiclesIn();
		PersonalAuto_Coverages.additionalcoveragesAppliedtoallVehiclesIn();
		PersonalAuto_Coverages.additionalcoveragesAppliedperVehiclesIn();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_RiskAnalysis.priorLosses_Add();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyReview.policyDetails();
		PersonalAuto_PolicyReview.policyLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages_VehicleCoverages();

		PolicyCenter_Resuables.clickButton("Save Draft");
		PolicyCenter_Resuables.clickButton("Quote");
		PersonalAuto_Quote.quoteDetails();
		PersonalAuto_Quote.policyPremium_Garage1();
		PersonalAuto_Quote.policyPremium_Vehicle1();
		PersonalAuto_Quote.policyPremium_PremiumSubtotalandTaxes();
		strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");
		String strEditLock = PolicyCenter_Resuables.infoBar("EditLock");

		PersonalAuto_Quote.quoteDetails();
		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Forms.pa_forms();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Payments.premiumSummary();
		PersonalAuto_Payments.payments();
		PersonalAuto_Payments.invoicing();
		PersonalAuto_Payments.billing();
		PersonalAuto_Payments.paymentSchedule();
		PersonalAuto_Payments.upFrontPayment();

		PolicyCenter_Resuables.clickButton("Bind Options");
		PolicyCenter_Resuables.clickButton("Bind Only");
		strJob           = PolicyCenter_Resuables.infoBar("Job");
		strLOB           = PolicyCenter_Resuables.infoBar("LOB");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();

	}

	@Test
	public void AUT_PA_PC_NewSubmission_112_PolicyReview_InsuredDetais() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		Tab_Menu_Navigation.pcTabNavigation("New Account", "NA");
		PolicyCenter_Account.createPersonAccount();
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

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Vehicles.createVehicles();
		PersonalAuto_Vehicles.assignDriver();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Coverages.coveragesAppliedtoallVehiclesIn();
		PersonalAuto_Coverages.coveragesAppliedperVehiclesIn();
		PersonalAuto_Coverages.additionalcoveragesAppliedtoallVehiclesIn();
		PersonalAuto_Coverages.additionalcoveragesAppliedperVehiclesIn();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_RiskAnalysis.button_Verify();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyReview.policyDetails();
		PersonalAuto_PolicyReview.policyLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages_VehicleCoverages();

		PolicyCenter_Resuables.clickButton("Save Draft");
		PolicyCenter_Resuables.clickButton("Quote");
		PersonalAuto_Quote.quoteDetails();
		PersonalAuto_Quote.policyPremium_Garage1();
		PersonalAuto_Quote.policyPremium_Vehicle1();
		PersonalAuto_Quote.policyPremium_PremiumSubtotalandTaxes();
		strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");
		String strEditLock = PolicyCenter_Resuables.infoBar("EditLock");

		PersonalAuto_Quote.quoteDetails();
		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Forms.pa_forms();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Payments.premiumSummary();
		PersonalAuto_Payments.payments();
		PersonalAuto_Payments.invoicing();
		PersonalAuto_Payments.billing();
		PersonalAuto_Payments.paymentSchedule();
		PersonalAuto_Payments.upFrontPayment();

		PolicyCenter_Resuables.clickButton("Bind Options");
		PolicyCenter_Resuables.clickButton("Bind Only");
		strJob           = PolicyCenter_Resuables.infoBar("Job");
		strLOB           = PolicyCenter_Resuables.infoBar("LOB");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_115_PA_Quote() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		Tab_Menu_Navigation.pcTabNavigation("New Account", "NA");
		PolicyCenter_Account.createPersonAccount();
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

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Vehicles.createVehicles();
		PersonalAuto_Vehicles.assignDriver();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Coverages.coveragesAppliedtoallVehiclesIn();
		PersonalAuto_Coverages.coveragesAppliedperVehiclesIn();
		PersonalAuto_Coverages.additionalcoveragesAppliedtoallVehiclesIn();
		PersonalAuto_Coverages.additionalcoveragesAppliedperVehiclesIn();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_RiskAnalysis.button_Verify();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyReview.policyDetails();
		PersonalAuto_PolicyReview.policyLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages_VehicleCoverages();

		PolicyCenter_Resuables.clickButton("Save Draft");
		PolicyCenter_Resuables.clickButton("Quote");
		PersonalAuto_Quote.quoteDetails();
		PersonalAuto_Quote.policyPremium_Garage1();
		PersonalAuto_Quote.policyPremium_Vehicle1();
		PersonalAuto_Quote.policyPremium_PremiumSubtotalandTaxes();
		strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");
		String strEditLock = PolicyCenter_Resuables.infoBar("EditLock");

		PersonalAuto_Quote.quoteDetails();
		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Forms.pa_forms();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Payments.premiumSummary();
		PersonalAuto_Payments.payments();
		PersonalAuto_Payments.invoicing();
		PersonalAuto_Payments.billing();
		PersonalAuto_Payments.paymentSchedule();
		PersonalAuto_Payments.upFrontPayment();

		PolicyCenter_Resuables.clickButton("Bind Options");
		PolicyCenter_Resuables.clickButton("Bind Only");
		strJob           = PolicyCenter_Resuables.infoBar("Job");
		strLOB           = PolicyCenter_Resuables.infoBar("LOB");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_118_Pay_BillingMethod_ListBill() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		Tab_Menu_Navigation.pcTabNavigation("New Account", "NA");
		PolicyCenter_Account.createPersonAccount();
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

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Vehicles.createVehicles();
		PersonalAuto_Vehicles.assignDriver();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Coverages.coveragesAppliedtoallVehiclesIn();
		PersonalAuto_Coverages.coveragesAppliedperVehiclesIn();
		PersonalAuto_Coverages.additionalcoveragesAppliedtoallVehiclesIn();
		PersonalAuto_Coverages.additionalcoveragesAppliedperVehiclesIn();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_RiskAnalysis.button_Verify();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyReview.policyDetails();
		PersonalAuto_PolicyReview.policyLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages_VehicleCoverages();

		PolicyCenter_Resuables.clickButton("Save Draft");
		PolicyCenter_Resuables.clickButton("Quote");
		PersonalAuto_Quote.quoteDetails();
		PersonalAuto_Quote.policyPremium_Garage1();
		PersonalAuto_Quote.policyPremium_Vehicle1();
		PersonalAuto_Quote.policyPremium_PremiumSubtotalandTaxes();
		strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");
		String strEditLock = PolicyCenter_Resuables.infoBar("EditLock");

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
		PolicyCenter_Resuables.clickButton("Bind Only");
		strJob           = PolicyCenter_Resuables.infoBar("Job");
		strLOB           = PolicyCenter_Resuables.infoBar("LOB");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();

	}

	@Test
	public void AUT_PA_PC_NewSubmission_121_Pay_AlternateBillingContact_NewCompany() throws Throwable {

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
		PolicyCenter_Resuables.clickButton("Bind Only");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_124_Pay_AlternateBillingContact_ExistingBillingContact() throws Throwable {

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
		PolicyCenter_Resuables.clickButton("Bind Only");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_127_Pay_PaymentSchedule_B() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		Tab_Menu_Navigation.pcTabNavigation("New Account", "NA");
		PolicyCenter_Account.createPersonAccount();
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

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Vehicles.createVehicles();
		PersonalAuto_Vehicles.assignDriver();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Coverages.coveragesAppliedtoallVehiclesIn();
		PersonalAuto_Coverages.coveragesAppliedperVehiclesIn();
		PersonalAuto_Coverages.additionalcoveragesAppliedtoallVehiclesIn();
		PersonalAuto_Coverages.additionalcoveragesAppliedperVehiclesIn();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_RiskAnalysis.button_Verify();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyReview.policyDetails();
		PersonalAuto_PolicyReview.policyLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages_VehicleCoverages();

		PolicyCenter_Resuables.clickButton("Save Draft");
		PolicyCenter_Resuables.clickButton("Quote");
		PersonalAuto_Quote.quoteDetails();
		PersonalAuto_Quote.policyPremium_Garage1();
		PersonalAuto_Quote.policyPremium_Vehicle1();
		PersonalAuto_Quote.policyPremium_PremiumSubtotalandTaxes();
		strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");
		String strEditLock = PolicyCenter_Resuables.infoBar("EditLock");

		PersonalAuto_Quote.quoteDetails();
		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Forms.pa_forms();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Payments.premiumSummary();
		PersonalAuto_Payments.payments();
		PersonalAuto_Payments.invoicing();
		PersonalAuto_Payments.billing();
		PersonalAuto_Payments.paymentSchedule();
		PersonalAuto_Payments.upFrontPayment();

		PolicyCenter_Resuables.clickButton("Bind Options");
		PolicyCenter_Resuables.clickButton("Bind Only");
		strJob           = PolicyCenter_Resuables.infoBar("Job");
		strLOB           = PolicyCenter_Resuables.infoBar("LOB");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_130_Pay_PaymentSchedule_E() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		Tab_Menu_Navigation.pcTabNavigation("New Account", "NA");
		PolicyCenter_Account.createPersonAccount();
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

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Vehicles.createVehicles();
		PersonalAuto_Vehicles.assignDriver();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Coverages.coveragesAppliedtoallVehiclesIn();
		PersonalAuto_Coverages.coveragesAppliedperVehiclesIn();
		PersonalAuto_Coverages.additionalcoveragesAppliedtoallVehiclesIn();
		PersonalAuto_Coverages.additionalcoveragesAppliedperVehiclesIn();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_RiskAnalysis.button_Verify();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyReview.policyDetails();
		PersonalAuto_PolicyReview.policyLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages_VehicleCoverages();

		PolicyCenter_Resuables.clickButton("Save Draft");
		PolicyCenter_Resuables.clickButton("Quote");
		PersonalAuto_Quote.quoteDetails();
		PersonalAuto_Quote.policyPremium_Garage1();
		PersonalAuto_Quote.policyPremium_Vehicle1();
		PersonalAuto_Quote.policyPremium_PremiumSubtotalandTaxes();
		strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");
		String strEditLock = PolicyCenter_Resuables.infoBar("EditLock");

		PersonalAuto_Quote.quoteDetails();
		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Forms.pa_forms();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Payments.premiumSummary();
		PersonalAuto_Payments.payments();
		PersonalAuto_Payments.invoicing();
		PersonalAuto_Payments.billing();
		PersonalAuto_Payments.paymentSchedule();
		PersonalAuto_Payments.upFrontPayment();

		PolicyCenter_Resuables.clickButton("Bind Options");
		PolicyCenter_Resuables.clickButton("Bind Only");
		strJob           = PolicyCenter_Resuables.infoBar("Job");
		strLOB           = PolicyCenter_Resuables.infoBar("LOB");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_133_Pay_PaymentSchedule_Monthly2() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		Tab_Menu_Navigation.pcTabNavigation("New Account", "NA");
		PolicyCenter_Account.createPersonAccount();
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

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Vehicles.createVehicles();
		PersonalAuto_Vehicles.assignDriver();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Coverages.coveragesAppliedtoallVehiclesIn();
		PersonalAuto_Coverages.coveragesAppliedperVehiclesIn();
		PersonalAuto_Coverages.additionalcoveragesAppliedtoallVehiclesIn();
		PersonalAuto_Coverages.additionalcoveragesAppliedperVehiclesIn();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_RiskAnalysis.button_Verify();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyReview.policyDetails();
		PersonalAuto_PolicyReview.policyLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages_VehicleCoverages();

		PolicyCenter_Resuables.clickButton("Save Draft");
		PolicyCenter_Resuables.clickButton("Quote");
		PersonalAuto_Quote.quoteDetails();
		PersonalAuto_Quote.policyPremium_Garage1();
		PersonalAuto_Quote.policyPremium_Vehicle1();
		PersonalAuto_Quote.policyPremium_PremiumSubtotalandTaxes();
		strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");
		String strEditLock = PolicyCenter_Resuables.infoBar("EditLock");

		PersonalAuto_Quote.quoteDetails();
		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Forms.pa_forms();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Payments.premiumSummary();
		PersonalAuto_Payments.payments();
		PersonalAuto_Payments.invoicing();
		PersonalAuto_Payments.billing();
		PersonalAuto_Payments.paymentSchedule();
		PersonalAuto_Payments.upFrontPayment();

		PolicyCenter_Resuables.clickButton("Bind Options");
		PolicyCenter_Resuables.clickButton("Bind Only");
		strJob           = PolicyCenter_Resuables.infoBar("Job");
		strLOB           = PolicyCenter_Resuables.infoBar("LOB");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_136_Pay_FixInvoice_BillDute() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		Tab_Menu_Navigation.pcTabNavigation("New Account", "NA");
		PolicyCenter_Account.createPersonAccount();
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

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Vehicles.createVehicles();
		PersonalAuto_Vehicles.assignDriver();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Coverages.coveragesAppliedtoallVehiclesIn();
		PersonalAuto_Coverages.coveragesAppliedperVehiclesIn();
		PersonalAuto_Coverages.additionalcoveragesAppliedtoallVehiclesIn();
		PersonalAuto_Coverages.additionalcoveragesAppliedperVehiclesIn();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_RiskAnalysis.button_Verify();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyReview.policyDetails();
		PersonalAuto_PolicyReview.policyLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages_VehicleCoverages();

		PolicyCenter_Resuables.clickButton("Save Draft");
		PolicyCenter_Resuables.clickButton("Quote");
		PersonalAuto_Quote.quoteDetails();
		PersonalAuto_Quote.policyPremium_Garage1();
		PersonalAuto_Quote.policyPremium_Vehicle1();
		PersonalAuto_Quote.policyPremium_PremiumSubtotalandTaxes();
		strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");
		String strEditLock = PolicyCenter_Resuables.infoBar("EditLock");

		PersonalAuto_Quote.quoteDetails();
		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Forms.pa_forms();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Payments.premiumSummary();
		PersonalAuto_Payments.payments();
		PersonalAuto_Payments.invoicing();
		PersonalAuto_Payments.billing();
		PersonalAuto_Payments.invoicingOverrides();
		PersonalAuto_Payments.paymentSchedule();
		PersonalAuto_Payments.upFrontPayment();

		PolicyCenter_Resuables.clickButton("Bind Options");
		PolicyCenter_Resuables.clickButton("Bind Only");
		strJob           = PolicyCenter_Resuables.infoBar("Job");
		strLOB           = PolicyCenter_Resuables.infoBar("LOB");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_139_Pay_PayUsing_CreditCard() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		Tab_Menu_Navigation.pcTabNavigation("New Account", "NA");
		PolicyCenter_Account.createPersonAccount();
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

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Vehicles.createVehicles();
		PersonalAuto_Vehicles.assignDriver();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Coverages.coveragesAppliedtoallVehiclesIn();
		PersonalAuto_Coverages.coveragesAppliedperVehiclesIn();
		PersonalAuto_Coverages.additionalcoveragesAppliedtoallVehiclesIn();
		PersonalAuto_Coverages.additionalcoveragesAppliedperVehiclesIn();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_RiskAnalysis.button_Verify();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyReview.policyDetails();
		PersonalAuto_PolicyReview.policyLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages_VehicleCoverages();

		PolicyCenter_Resuables.clickButton("Save Draft");
		PolicyCenter_Resuables.clickButton("Quote");
		PersonalAuto_Quote.quoteDetails();
		PersonalAuto_Quote.policyPremium_Garage1();
		PersonalAuto_Quote.policyPremium_Vehicle1();
		PersonalAuto_Quote.policyPremium_PremiumSubtotalandTaxes();
		strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");
		String strEditLock = PolicyCenter_Resuables.infoBar("EditLock");

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
		PolicyCenter_Resuables.clickButton("Bind Only");
		strJob           = PolicyCenter_Resuables.infoBar("Job");
		strLOB           = PolicyCenter_Resuables.infoBar("LOB");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();

	}

	@Test
	public void AUT_PA_PC_NewSubmission_142_Pay_UpFrontPayment_Cash() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		Tab_Menu_Navigation.pcTabNavigation("New Account", "NA");
		PolicyCenter_Account.createPersonAccount();
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

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Vehicles.createVehicles();
		PersonalAuto_Vehicles.assignDriver();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Coverages.coveragesAppliedtoallVehiclesIn();
		PersonalAuto_Coverages.coveragesAppliedperVehiclesIn();
		PersonalAuto_Coverages.additionalcoveragesAppliedtoallVehiclesIn();
		PersonalAuto_Coverages.additionalcoveragesAppliedperVehiclesIn();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_RiskAnalysis.button_Verify();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyReview.policyDetails();
		PersonalAuto_PolicyReview.policyLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages_VehicleCoverages();

		PolicyCenter_Resuables.clickButton("Save Draft");
		PolicyCenter_Resuables.clickButton("Quote");
		PersonalAuto_Quote.quoteDetails();
		PersonalAuto_Quote.policyPremium_Garage1();
		PersonalAuto_Quote.policyPremium_Vehicle1();
		PersonalAuto_Quote.policyPremium_PremiumSubtotalandTaxes();
		strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");
		String strEditLock = PolicyCenter_Resuables.infoBar("EditLock");

		PersonalAuto_Quote.quoteDetails();
		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Forms.pa_forms();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Payments.premiumSummary();
		PersonalAuto_Payments.payments();
		PersonalAuto_Payments.invoicing();
		PersonalAuto_Payments.billing();
		PersonalAuto_Payments.paymentSchedule();
		PersonalAuto_Payments.upFrontPayment();

		PolicyCenter_Resuables.clickButton("Bind Options");
		PolicyCenter_Resuables.clickButton("Bind Only");
		strJob           = PolicyCenter_Resuables.infoBar("Job");
		strLOB           = PolicyCenter_Resuables.infoBar("LOB");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_145_Versions_Multiple_FullApplication() throws Throwable {

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
		PolicyCenter_Resuables.clickButton("Bind Only");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_148_Versions_Multiple_QuickQuote() throws Throwable {

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
		PolicyCenter_Resuables.clickButton("Bind Only");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_151_Versions_SideBySide() throws Throwable {

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
		PolicyCenter_Resuables.clickButton("Bind Only");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_154_Quote_CloseOptions_NotTaken() throws Throwable {

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
		PolicyCenter_Resuables.clickButton("Bind Only");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_157_SubmissionManager() throws Throwable {

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
		PolicyCenter_Resuables.clickButton("Bind Only");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_160_ReleaseLock() throws Throwable {

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
		PolicyCenter_Resuables.clickButton("Bind Only");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_5_Producercode_Modify() throws Throwable {

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
		PolicyCenter_Resuables.clickButton("Bind Only");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_8_Single_QuickQuote_DefaultEffectiveDate_Modify() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		Tab_Menu_Navigation.pcTabNavigation("New Account", "NA");
		PolicyCenter_Account.createPersonAccount();
		PolicyCenter_AccountSummary.detail_Verify();

		Tab_Menu_Navigation.pcMenuNavigation("New Submission");
		PolicyCenter_Resuables.newSubmissions_Edit();
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
		PolicyCenter_Resuables.clickButton("Bind Only");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_11_Single_QuickQuote_Vehicle_Add() throws Throwable {

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
		PolicyCenter_Resuables.clickButton("Bind Only");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_14_Single_QuickQuote_Quote() throws Throwable {

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
		PolicyCenter_Resuables.clickButton("Bind Only");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_17_Single_QuickQuote_Version_FullApplication() throws Throwable {

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
		PolicyCenter_Resuables.clickButton("Bind Only");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_20_Single_FullApplication_DefaultEffectiveDate_Modify() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		Tab_Menu_Navigation.pcTabNavigation("New Account", "NA");
		PolicyCenter_Account.createPersonAccount();
		PolicyCenter_AccountSummary.detail_Verify();

		Tab_Menu_Navigation.pcMenuNavigation("New Submission");
		PolicyCenter_Resuables.newSubmissions_Edit();
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

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Vehicles.createVehicles();
		PersonalAuto_Vehicles.assignDriver();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Coverages.coveragesAppliedtoallVehiclesIn();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_RiskAnalysis.button_Verify();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyReview.policyDetails();
		PersonalAuto_PolicyReview.policyLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages();

		PolicyCenter_Resuables.clickButton("Save Draft");
		PolicyCenter_Resuables.clickButton("Quote");
		PersonalAuto_Quote.quoteDetails();
		PersonalAuto_Quote.policyPremium_Garage1();
		PersonalAuto_Quote.policyPremium_Vehicle1();
		PersonalAuto_Quote.policyPremium_PremiumSubtotalandTaxes();
		strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");
		String strEditLock = PolicyCenter_Resuables.infoBar("EditLock");

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Forms.pa_forms();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Payments.premiumSummary();
		PersonalAuto_Payments.payments();
		PersonalAuto_Payments.invoicing();
		PersonalAuto_Payments.billing();
		PersonalAuto_Payments.paymentSchedule();
		PersonalAuto_Payments.upFrontPayment();

		PolicyCenter_Resuables.clickButton("Bind Options");
		PolicyCenter_Resuables.clickButton("Bind Only");
		strJob           = PolicyCenter_Resuables.infoBar("Job");
		strLOB           = PolicyCenter_Resuables.infoBar("LOB");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_23_Offering_StandardProgram() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		Tab_Menu_Navigation.pcTabNavigation("New Account", "NA");
		PolicyCenter_Account.createPersonAccount();
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

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Vehicles.createVehicles();
		PersonalAuto_Vehicles.assignDriver();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Coverages.coveragesAppliedtoallVehiclesIn();
		PersonalAuto_Coverages.coveragesAppliedperVehiclesIn();
		PersonalAuto_Coverages.additionalcoveragesAppliedtoallVehiclesIn();
		PersonalAuto_Coverages.additionalcoveragesAppliedperVehiclesIn();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_RiskAnalysis.button_Verify();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyReview.policyDetails();
		PersonalAuto_PolicyReview.policyLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages_VehicleCoverages();

		PolicyCenter_Resuables.clickButton("Save Draft");
		PolicyCenter_Resuables.clickButton("Quote");
		PersonalAuto_Quote.quoteDetails();
		PersonalAuto_Quote.policyPremium_Garage1();
		PersonalAuto_Quote.policyPremium_Vehicle1();
		PersonalAuto_Quote.policyPremium_PremiumSubtotalandTaxes();
		strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");
		String strEditLock = PolicyCenter_Resuables.infoBar("EditLock");

		PersonalAuto_Quote.quoteDetails();
		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Forms.pa_forms();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Payments.premiumSummary();
		PersonalAuto_Payments.payments();
		PersonalAuto_Payments.invoicing();
		PersonalAuto_Payments.billing();
		PersonalAuto_Payments.paymentSchedule();
		PersonalAuto_Payments.upFrontPayment();

		PolicyCenter_Resuables.clickButton("Bind Options");
		PolicyCenter_Resuables.clickButton("Bind Only");
		strJob           = PolicyCenter_Resuables.infoBar("Job");
		strLOB           = PolicyCenter_Resuables.infoBar("LOB");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_35_PI_PrimaryNamedInsured_ChangeTo_NewPerson() throws Throwable {

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
		PolicyCenter_Resuables.clickButton("Bind Only");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_38_PI_Policy_Address_ChangeTo_New_Address() throws Throwable {

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
		PolicyCenter_Resuables.clickButton("Bind Only");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_42_PI_AdditionalInsured_Modify() throws Throwable {

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
		PolicyCenter_Resuables.clickButton("Bind Only");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_45_PI_SecondaryNamedInsured_Modify() throws Throwable {

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
		PolicyCenter_Resuables.clickButton("Bind Only");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_48_PI_EffectiveDate_BackDated() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		Tab_Menu_Navigation.pcTabNavigation("New Account", "NA");
		PolicyCenter_Account.createPersonAccount();
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

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Vehicles.createVehicles();
		PersonalAuto_Vehicles.assignDriver();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Coverages.coveragesAppliedtoallVehiclesIn();
		PersonalAuto_Coverages.coveragesAppliedperVehiclesIn();
		PersonalAuto_Coverages.additionalcoveragesAppliedtoallVehiclesIn();
		PersonalAuto_Coverages.additionalcoveragesAppliedperVehiclesIn();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_RiskAnalysis.button_Verify();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyReview.policyDetails();
		PersonalAuto_PolicyReview.policyLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages_VehicleCoverages();

		PolicyCenter_Resuables.clickButton("Save Draft");
		PolicyCenter_Resuables.clickButton("Quote");
		PersonalAuto_Quote.quoteDetails();
		PersonalAuto_Quote.policyPremium_Garage1();
		PersonalAuto_Quote.policyPremium_Vehicle1();
		PersonalAuto_Quote.policyPremium_PremiumSubtotalandTaxes();
		strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");
		String strEditLock = PolicyCenter_Resuables.infoBar("EditLock");

		PersonalAuto_Quote.quoteDetails();
		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Forms.pa_forms();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Payments.premiumSummary();
		PersonalAuto_Payments.payments();
		PersonalAuto_Payments.invoicing();
		PersonalAuto_Payments.billing();
		PersonalAuto_Payments.paymentSchedule();
		PersonalAuto_Payments.upFrontPayment();

		PolicyCenter_Resuables.clickButton("Bind Options");
		PolicyCenter_Resuables.clickButton("Bind Only");
		strJob           = PolicyCenter_Resuables.infoBar("Job");
		strLOB           = PolicyCenter_Resuables.infoBar("LOB");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_51_PI_WrittenDate_FutureDated() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		Tab_Menu_Navigation.pcTabNavigation("New Account", "NA");
		PolicyCenter_Account.createPersonAccount();
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

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Vehicles.createVehicles();
		PersonalAuto_Vehicles.assignDriver();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Coverages.coveragesAppliedtoallVehiclesIn();
		PersonalAuto_Coverages.coveragesAppliedperVehiclesIn();
		PersonalAuto_Coverages.additionalcoveragesAppliedtoallVehiclesIn();
		PersonalAuto_Coverages.additionalcoveragesAppliedperVehiclesIn();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_RiskAnalysis.button_Verify();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyReview.policyDetails();
		PersonalAuto_PolicyReview.policyLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages_VehicleCoverages();

		PolicyCenter_Resuables.clickButton("Save Draft");
		PolicyCenter_Resuables.clickButton("Quote");
		PersonalAuto_Quote.quoteDetails();
		PersonalAuto_Quote.policyPremium_Garage1();
		PersonalAuto_Quote.policyPremium_Vehicle1();
		PersonalAuto_Quote.policyPremium_PremiumSubtotalandTaxes();
		strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");
		String strEditLock = PolicyCenter_Resuables.infoBar("EditLock");

		PersonalAuto_Quote.quoteDetails();
		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Forms.pa_forms();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Payments.premiumSummary();
		PersonalAuto_Payments.payments();
		PersonalAuto_Payments.invoicing();
		PersonalAuto_Payments.billing();
		PersonalAuto_Payments.paymentSchedule();
		PersonalAuto_Payments.upFrontPayment();

		PolicyCenter_Resuables.clickButton("Bind Options");
		PolicyCenter_Resuables.clickButton("Bind Only");
		strJob           = PolicyCenter_Resuables.infoBar("Job");
		strLOB           = PolicyCenter_Resuables.infoBar("LOB");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_54_PI_UnderwritingCompany() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		Tab_Menu_Navigation.pcTabNavigation("New Account", "NA");
		PolicyCenter_Account.createPersonAccount();
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

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Vehicles.createVehicles();
		PersonalAuto_Vehicles.assignDriver();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Coverages.coveragesAppliedtoallVehiclesIn();
		PersonalAuto_Coverages.coveragesAppliedperVehiclesIn();
		PersonalAuto_Coverages.additionalcoveragesAppliedtoallVehiclesIn();
		PersonalAuto_Coverages.additionalcoveragesAppliedperVehiclesIn();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_RiskAnalysis.button_Verify();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyReview.policyDetails();
		PersonalAuto_PolicyReview.policyLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages_VehicleCoverages();

		PolicyCenter_Resuables.clickButton("Save Draft");
		PolicyCenter_Resuables.clickButton("Quote");
		PersonalAuto_Quote.quoteDetails();
		PersonalAuto_Quote.policyPremium_Garage1();
		PersonalAuto_Quote.policyPremium_Vehicle1();
		PersonalAuto_Quote.policyPremium_PremiumSubtotalandTaxes();
		strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");
		String strEditLock = PolicyCenter_Resuables.infoBar("EditLock");

		PersonalAuto_Quote.quoteDetails();
		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Forms.pa_forms();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Payments.premiumSummary();
		PersonalAuto_Payments.payments();
		PersonalAuto_Payments.invoicing();
		PersonalAuto_Payments.billing();
		PersonalAuto_Payments.paymentSchedule();
		PersonalAuto_Payments.upFrontPayment();

		PolicyCenter_Resuables.clickButton("Bind Options");
		PolicyCenter_Resuables.clickButton("Bind Only");
		strJob           = PolicyCenter_Resuables.infoBar("Job");
		strLOB           = PolicyCenter_Resuables.infoBar("LOB");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_57_PA_Driver_Add_From_Addressbook() throws Throwable {

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
		PolicyCenter_Resuables.clickButton("Bind Only");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_60_PA_Driver_Modify_ContactDetails() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PolicyCenter_Resuables.pcTabNavigation_Sub_Search();

		strAccountName      = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber    = PolicyCenter_Resuables.infoBar("AccountNumber");
		strSubmissionNumber = PolicyCenter_Resuables.infoBar("SubmissionNumber");

		PersonalAuto_Quote.quoteDetails();

		PolicyCenter_Resuables.clickButton("Edit Policy Transaction");
		PersonalAuto_PolicyReview.policyDetails();

		PersonalAuto_Reusable.paMenuNavigation("Offering");
		PolicyCenter_Resuables.offering();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Qualification.qualification();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyInfo.primaryNamedInsured();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Drivers.driver_ContatDetails("EDIT");

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Vehicles.Vehicles_Verify();

		PolicyCenter_Resuables.clickButton("Save Draft");
		PolicyCenter_Resuables.clickButton("Quote");
		PersonalAuto_Quote.quoteDetails();
		PersonalAuto_Quote.policyPremium_Garage1();
		PersonalAuto_Quote.policyPremium_Vehicle1();
		PersonalAuto_Quote.policyPremium_PremiumSubtotalandTaxes();
		strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");
		String strEditLock = PolicyCenter_Resuables.infoBar("EditLock");

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Forms.pa_forms();

		strJob           = PolicyCenter_Resuables.infoBar("Job");
		strLOB           = PolicyCenter_Resuables.infoBar("LOB");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();

	}

	@Test
	public void AUT_PA_PC_NewSubmission_63_PA_Driver_Modify_Addresses_Modify() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PolicyCenter_Resuables.pcTabNavigation_Sub_Search();

		strAccountName      = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber    = PolicyCenter_Resuables.infoBar("AccountNumber");
		strSubmissionNumber = PolicyCenter_Resuables.infoBar("SubmissionNumber");

		PersonalAuto_Quote.quoteDetails();

		PolicyCenter_Resuables.clickButton("Edit Policy Transaction");
		PersonalAuto_PolicyReview.policyDetails();

		PersonalAuto_Reusable.paMenuNavigation("Drivers");
		PersonalAuto_Drivers.driver_Addresses("EDIT");

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Vehicles.Vehicles_Verify();

		PolicyCenter_Resuables.clickButton("Save Draft");
		PolicyCenter_Resuables.clickButton("Quote");
		PersonalAuto_Quote.quoteDetails();
		PersonalAuto_Quote.policyPremium_Garage1();
		PersonalAuto_Quote.policyPremium_Vehicle1();
		PersonalAuto_Quote.policyPremium_PremiumSubtotalandTaxes();
		strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");
		String strEditLock = PolicyCenter_Resuables.infoBar("EditLock");

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Forms.pa_forms();

		strJob           = PolicyCenter_Resuables.infoBar("Job");
		strLOB           = PolicyCenter_Resuables.infoBar("LOB");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_66_PA_Driver_Negative_Atleast1Driver() throws Throwable {

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
		PolicyCenter_Resuables.clickButton("Bind Only");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_69_PA_CreateVehicle() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		Tab_Menu_Navigation.pcTabNavigation("New Account", "NA");
		PolicyCenter_Account.createPersonAccount();
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

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Vehicles.createVehicles();
		PersonalAuto_Vehicles.assignDriver();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Coverages.coveragesAppliedtoallVehiclesIn();
		PersonalAuto_Coverages.coveragesAppliedperVehiclesIn();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_RiskAnalysis.button_Verify();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyReview.policyDetails();
		PersonalAuto_PolicyReview.policyLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages();

		PolicyCenter_Resuables.clickButton("Save Draft");
		PolicyCenter_Resuables.clickButton("Quote");
		PersonalAuto_Quote.quoteDetails();
		PersonalAuto_Quote.policyPremium_Garage1();
		PersonalAuto_Quote.policyPremium_Vehicle1();
		PersonalAuto_Quote.policyPremium_PremiumSubtotalandTaxes();
		strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");
		String strEditLock = PolicyCenter_Resuables.infoBar("EditLock");

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Forms.pa_forms();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Payments.premiumSummary();
		PersonalAuto_Payments.payments();
		PersonalAuto_Payments.invoicing();
		PersonalAuto_Payments.billing();
		PersonalAuto_Payments.paymentSchedule();
		PersonalAuto_Payments.upFrontPayment();

		PolicyCenter_Resuables.clickButton("Bind Options");
		PolicyCenter_Resuables.clickButton("Bind Only");
		strJob           = PolicyCenter_Resuables.infoBar("Job");
		strLOB           = PolicyCenter_Resuables.infoBar("LOB");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_72_PA_Vehicle_AdditionalInterest_Add_NewPerson() throws Throwable {

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
		PolicyCenter_Resuables.clickButton("Bind Only");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_75_PA_Vehicle_AdditionalInterest_Add_OtherContacts() throws Throwable {

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
		PolicyCenter_Resuables.clickButton("Bind Only");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_78_PA_Vehicle_Negative_VIN() throws Throwable {

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
		PolicyCenter_Resuables.clickButton("Bind Only");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_81_PA_Coverages_AllVehicles_Add() throws Throwable {

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
		PolicyCenter_Resuables.clickButton("Bind Only");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_84_PA_Coverages_PerVehicle_Add() throws Throwable {

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
		PolicyCenter_Resuables.clickButton("Bind Only");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_87_PA_AdditionalCoverages_AllVehicles_Add() throws Throwable {

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
		PolicyCenter_Resuables.clickButton("Bind Only");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_90_PA_AdditionalCoverages_PerVehicle_Add() throws Throwable {

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
		PolicyCenter_Resuables.clickButton("Bind Only");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_93_PA_ExclusionandCondition_Add_Exclusion() throws Throwable {

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
		PolicyCenter_Resuables.clickButton("Bind Only");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_96_PA_ExclusionandCondition_Modify_Exclusion() throws Throwable {

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
		PolicyCenter_Resuables.clickButton("Bind Only");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_99_PA_RiskAnalysis_ApproveUWIssue() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		Tab_Menu_Navigation.pcTabNavigation("New Account", "NA");
		PolicyCenter_Account.createPersonAccount();
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

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Vehicles.createVehicles();
		PersonalAuto_Vehicles.assignDriver();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Coverages.coveragesAppliedtoallVehiclesIn();
		PersonalAuto_Coverages.coveragesAppliedperVehiclesIn();
		PersonalAuto_Coverages.additionalcoveragesAppliedtoallVehiclesIn();
		PersonalAuto_Coverages.additionalcoveragesAppliedperVehiclesIn();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_RiskAnalysis.addUWIssue();
		PersonalAuto_RiskAnalysis.approveUWIssues();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyReview.policyDetails();
		PersonalAuto_PolicyReview.policyLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages(); //
		PersonalAuto_PolicyReview.vehicleLevelCoverages_VehicleCoverages(); //

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
		PersonalAuto_Payments.upFrontPayment();

		PolicyCenter_Resuables.clickButton("Bind Options");
		PolicyCenter_Resuables.clickButton("Bind Only");
		strJob           = PolicyCenter_Resuables.infoBar("Job");
		strLOB           = PolicyCenter_Resuables.infoBar("LOB");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_102_RiskAnalysis_AddContingency() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		Tab_Menu_Navigation.pcTabNavigation("New Account", "NA");
		PolicyCenter_Account.createPersonAccount();
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

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Vehicles.createVehicles();
		PersonalAuto_Vehicles.assignDriver();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Coverages.coveragesAppliedtoallVehiclesIn();
		PersonalAuto_Coverages.coveragesAppliedperVehiclesIn();
		PersonalAuto_Coverages.additionalcoveragesAppliedtoallVehiclesIn();
		PersonalAuto_Coverages.additionalcoveragesAppliedperVehiclesIn();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_RiskAnalysis.addUWContingency();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyReview.policyDetails();
		PersonalAuto_PolicyReview.policyLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages_VehicleCoverages();

		PolicyCenter_Resuables.clickButton("Save Draft");
		PolicyCenter_Resuables.clickButton("Quote");
		PersonalAuto_Quote.quoteDetails();
		PersonalAuto_Quote.policyPremium_Garage1();
		PersonalAuto_Quote.policyPremium_Vehicle1();
		PersonalAuto_Quote.policyPremium_PremiumSubtotalandTaxes();
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
		PersonalAuto_Payments.upFrontPayment();

		PolicyCenter_Resuables.clickButton("Bind Options");
		PolicyCenter_Resuables.clickButton("Bind Only");
		strJob           = PolicyCenter_Resuables.infoBar("Job");
		strLOB           = PolicyCenter_Resuables.infoBar("LOB");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();

	}

	@Test
	public void AUT_PA_PC_NewSubmission_105_RiskAnalysis_PriorPolicies_Add() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		Tab_Menu_Navigation.pcTabNavigation("New Account", "NA");
		PolicyCenter_Account.createPersonAccount();
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

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Vehicles.createVehicles();
		PersonalAuto_Vehicles.assignDriver();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Coverages.coveragesAppliedtoallVehiclesIn();
		PersonalAuto_Coverages.coveragesAppliedperVehiclesIn();
		PersonalAuto_Coverages.additionalcoveragesAppliedtoallVehiclesIn();
		PersonalAuto_Coverages.additionalcoveragesAppliedperVehiclesIn();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_RiskAnalysis.priorPolicies_Add(); //

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyReview.policyDetails();
		PersonalAuto_PolicyReview.policyLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages_VehicleCoverages();

		PolicyCenter_Resuables.clickButton("Save Draft");
		PolicyCenter_Resuables.clickButton("Quote");
		PersonalAuto_Quote.quoteDetails();
		PersonalAuto_Quote.policyPremium_Garage1();
		PersonalAuto_Quote.policyPremium_Vehicle1();
		PersonalAuto_Quote.policyPremium_PremiumSubtotalandTaxes();
		strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");
		String strEditLock = PolicyCenter_Resuables.infoBar("EditLock");

		PersonalAuto_Quote.quoteDetails();
		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Forms.pa_forms();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Payments.premiumSummary();
		PersonalAuto_Payments.payments();
		PersonalAuto_Payments.invoicing();
		PersonalAuto_Payments.billing();
		PersonalAuto_Payments.paymentSchedule();
		PersonalAuto_Payments.upFrontPayment();

		PolicyCenter_Resuables.clickButton("Bind Options");
		PolicyCenter_Resuables.clickButton("Bind Only");
		strJob           = PolicyCenter_Resuables.infoBar("Job");
		strLOB           = PolicyCenter_Resuables.infoBar("LOB");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_108_RiskAnalysis_Claims() throws Throwable {

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
		PolicyCenter_Resuables.clickButton("Bind Only");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_111_RiskAnalysis_PriorLosses_Remove() throws Throwable {

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
		PolicyCenter_Resuables.clickButton("Bind Only");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_114_Quote_InsuredDetais() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		Tab_Menu_Navigation.pcTabNavigation("New Account", "NA");
		PolicyCenter_Account.createPersonAccount();
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

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Vehicles.createVehicles();
		PersonalAuto_Vehicles.assignDriver();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Coverages.coveragesAppliedtoallVehiclesIn();
		PersonalAuto_Coverages.coveragesAppliedperVehiclesIn();
		PersonalAuto_Coverages.additionalcoveragesAppliedtoallVehiclesIn();
		PersonalAuto_Coverages.additionalcoveragesAppliedperVehiclesIn();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_RiskAnalysis.button_Verify();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyReview.policyDetails();
		PersonalAuto_PolicyReview.policyLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages_VehicleCoverages();

		PolicyCenter_Resuables.clickButton("Save Draft");
		PolicyCenter_Resuables.clickButton("Quote");
		PersonalAuto_Quote.quoteDetails();
		PersonalAuto_Quote.policyPremium_Garage1();
		PersonalAuto_Quote.policyPremium_Vehicle1();
		PersonalAuto_Quote.policyPremium_PremiumSubtotalandTaxes();
		strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");
		String strEditLock = PolicyCenter_Resuables.infoBar("EditLock");

		PersonalAuto_Quote.quoteDetails();
		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Forms.pa_forms();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Payments.premiumSummary();
		PersonalAuto_Payments.payments();
		PersonalAuto_Payments.invoicing();
		PersonalAuto_Payments.billing();
		PersonalAuto_Payments.paymentSchedule();
		PersonalAuto_Payments.upFrontPayment();

		PolicyCenter_Resuables.clickButton("Bind Options");
		PolicyCenter_Resuables.clickButton("Bind Only");
		strJob           = PolicyCenter_Resuables.infoBar("Job");
		strLOB           = PolicyCenter_Resuables.infoBar("LOB");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_117_Pay_BillingMethod_DirectBill() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		Tab_Menu_Navigation.pcTabNavigation("New Account", "NA");
		PolicyCenter_Account.createPersonAccount();
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

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Vehicles.createVehicles();
		PersonalAuto_Vehicles.assignDriver();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Coverages.coveragesAppliedtoallVehiclesIn();
		PersonalAuto_Coverages.coveragesAppliedperVehiclesIn();
		PersonalAuto_Coverages.additionalcoveragesAppliedtoallVehiclesIn();
		PersonalAuto_Coverages.additionalcoveragesAppliedperVehiclesIn();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_RiskAnalysis.button_Verify();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyReview.policyDetails();
		PersonalAuto_PolicyReview.policyLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages_VehicleCoverages();

		PolicyCenter_Resuables.clickButton("Save Draft");
		PolicyCenter_Resuables.clickButton("Quote");
		PersonalAuto_Quote.quoteDetails();
		PersonalAuto_Quote.policyPremium_Garage1();
		PersonalAuto_Quote.policyPremium_Vehicle1();
		PersonalAuto_Quote.policyPremium_PremiumSubtotalandTaxes();
		strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");
		String strEditLock = PolicyCenter_Resuables.infoBar("EditLock");

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
		PolicyCenter_Resuables.clickButton("Bind Only");
		strJob           = PolicyCenter_Resuables.infoBar("Job");
		strLOB           = PolicyCenter_Resuables.infoBar("LOB");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_120_Pay_AlternateBillingAccount_BillingSubAccount() throws Throwable {

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
		PolicyCenter_Resuables.clickButton("Bind Only");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_123_Pay_AlternateBillingContact_From_AddressBook() throws Throwable {

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
		PolicyCenter_Resuables.clickButton("Bind Only");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_126_Pay_PaymentSchedule_A() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		Tab_Menu_Navigation.pcTabNavigation("New Account", "NA");
		PolicyCenter_Account.createPersonAccount();
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

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Vehicles.createVehicles();
		PersonalAuto_Vehicles.assignDriver();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Coverages.coveragesAppliedtoallVehiclesIn();
		PersonalAuto_Coverages.coveragesAppliedperVehiclesIn();
		PersonalAuto_Coverages.additionalcoveragesAppliedtoallVehiclesIn();
		PersonalAuto_Coverages.additionalcoveragesAppliedperVehiclesIn();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_RiskAnalysis.button_Verify();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyReview.policyDetails();
		PersonalAuto_PolicyReview.policyLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages_VehicleCoverages();

		PolicyCenter_Resuables.clickButton("Save Draft");
		PolicyCenter_Resuables.clickButton("Quote");
		PersonalAuto_Quote.quoteDetails();
		PersonalAuto_Quote.policyPremium_Garage1();
		PersonalAuto_Quote.policyPremium_Vehicle1();
		PersonalAuto_Quote.policyPremium_PremiumSubtotalandTaxes();
		strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");
		String strEditLock = PolicyCenter_Resuables.infoBar("EditLock");

		PersonalAuto_Quote.quoteDetails();
		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Forms.pa_forms();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Payments.premiumSummary();
		PersonalAuto_Payments.payments();
		PersonalAuto_Payments.invoicing();
		PersonalAuto_Payments.billing();
		PersonalAuto_Payments.paymentSchedule();
		PersonalAuto_Payments.upFrontPayment();

		PolicyCenter_Resuables.clickButton("Bind Options");
		PolicyCenter_Resuables.clickButton("Bind Only");
		strJob           = PolicyCenter_Resuables.infoBar("Job");
		strLOB           = PolicyCenter_Resuables.infoBar("LOB");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_129_Pay_PaymentSchedule_D() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		Tab_Menu_Navigation.pcTabNavigation("New Account", "NA");
		PolicyCenter_Account.createPersonAccount();
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

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Vehicles.createVehicles();
		PersonalAuto_Vehicles.assignDriver();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Coverages.coveragesAppliedtoallVehiclesIn();
		PersonalAuto_Coverages.coveragesAppliedperVehiclesIn();
		PersonalAuto_Coverages.additionalcoveragesAppliedtoallVehiclesIn();
		PersonalAuto_Coverages.additionalcoveragesAppliedperVehiclesIn();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_RiskAnalysis.button_Verify();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyReview.policyDetails();
		PersonalAuto_PolicyReview.policyLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages_VehicleCoverages();

		PolicyCenter_Resuables.clickButton("Save Draft");
		PolicyCenter_Resuables.clickButton("Quote");
		PersonalAuto_Quote.quoteDetails();
		PersonalAuto_Quote.policyPremium_Garage1();
		PersonalAuto_Quote.policyPremium_Vehicle1();
		PersonalAuto_Quote.policyPremium_PremiumSubtotalandTaxes();
		strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");
		String strEditLock = PolicyCenter_Resuables.infoBar("EditLock");

		PersonalAuto_Quote.quoteDetails();
		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Forms.pa_forms();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Payments.premiumSummary();
		PersonalAuto_Payments.payments();
		PersonalAuto_Payments.invoicing();
		PersonalAuto_Payments.billing();
		PersonalAuto_Payments.paymentSchedule();
		PersonalAuto_Payments.upFrontPayment();

		PolicyCenter_Resuables.clickButton("Bind Options");
		PolicyCenter_Resuables.clickButton("Bind Only");
		strJob           = PolicyCenter_Resuables.infoBar("Job");
		strLOB           = PolicyCenter_Resuables.infoBar("LOB");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_132_Pay_PaymentSchedule_Monthly() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		Tab_Menu_Navigation.pcTabNavigation("New Account", "NA");
		PolicyCenter_Account.createPersonAccount();
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

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Vehicles.createVehicles();
		PersonalAuto_Vehicles.assignDriver();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Coverages.coveragesAppliedtoallVehiclesIn();
		PersonalAuto_Coverages.coveragesAppliedperVehiclesIn();
		PersonalAuto_Coverages.additionalcoveragesAppliedtoallVehiclesIn();
		PersonalAuto_Coverages.additionalcoveragesAppliedperVehiclesIn();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_RiskAnalysis.button_Verify();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyReview.policyDetails();
		PersonalAuto_PolicyReview.policyLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages_VehicleCoverages();

		PolicyCenter_Resuables.clickButton("Save Draft");
		PolicyCenter_Resuables.clickButton("Quote");
		PersonalAuto_Quote.quoteDetails();
		PersonalAuto_Quote.policyPremium_Garage1();
		PersonalAuto_Quote.policyPremium_Vehicle1();
		PersonalAuto_Quote.policyPremium_PremiumSubtotalandTaxes();
		strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");
		String strEditLock = PolicyCenter_Resuables.infoBar("EditLock");

		PersonalAuto_Quote.quoteDetails();
		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Forms.pa_forms();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Payments.premiumSummary();
		PersonalAuto_Payments.payments();
		PersonalAuto_Payments.invoicing();
		PersonalAuto_Payments.billing();
		PersonalAuto_Payments.paymentSchedule();
		PersonalAuto_Payments.upFrontPayment();

		PolicyCenter_Resuables.clickButton("Bind Options");
		PolicyCenter_Resuables.clickButton("Bind Only");
		strJob           = PolicyCenter_Resuables.infoBar("Job");
		strLOB           = PolicyCenter_Resuables.infoBar("LOB");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_135_Pay_PaymentSchedule_EveryOtherWeek() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		Tab_Menu_Navigation.pcTabNavigation("New Account", "NA");
		PolicyCenter_Account.createPersonAccount();
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

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Vehicles.createVehicles();
		PersonalAuto_Vehicles.assignDriver();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Coverages.coveragesAppliedtoallVehiclesIn();
		PersonalAuto_Coverages.coveragesAppliedperVehiclesIn();
		PersonalAuto_Coverages.additionalcoveragesAppliedtoallVehiclesIn();
		PersonalAuto_Coverages.additionalcoveragesAppliedperVehiclesIn();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_RiskAnalysis.button_Verify();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyReview.policyDetails();
		PersonalAuto_PolicyReview.policyLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages_VehicleCoverages();

		PolicyCenter_Resuables.clickButton("Save Draft");
		PolicyCenter_Resuables.clickButton("Quote");
		PersonalAuto_Quote.quoteDetails();
		PersonalAuto_Quote.policyPremium_Garage1();
		PersonalAuto_Quote.policyPremium_Vehicle1();
		PersonalAuto_Quote.policyPremium_PremiumSubtotalandTaxes();
		strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");
		String strEditLock = PolicyCenter_Resuables.infoBar("EditLock");

		PersonalAuto_Quote.quoteDetails();
		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Forms.pa_forms();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Payments.premiumSummary();
		PersonalAuto_Payments.payments();
		PersonalAuto_Payments.invoicing();
		PersonalAuto_Payments.billing();
		PersonalAuto_Payments.paymentSchedule();
		PersonalAuto_Payments.upFrontPayment();

		PolicyCenter_Resuables.clickButton("Bind Options");
		PolicyCenter_Resuables.clickButton("Bind Only");
		strJob           = PolicyCenter_Resuables.infoBar("Job");
		strLOB           = PolicyCenter_Resuables.infoBar("LOB");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_138_Pay_PayUsing_ACH_EFT() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		Tab_Menu_Navigation.pcTabNavigation("New Account", "NA");
		PolicyCenter_Account.createPersonAccount();
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

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Vehicles.createVehicles();
		PersonalAuto_Vehicles.assignDriver();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Coverages.coveragesAppliedtoallVehiclesIn();
		PersonalAuto_Coverages.coveragesAppliedperVehiclesIn();
		PersonalAuto_Coverages.additionalcoveragesAppliedtoallVehiclesIn();
		PersonalAuto_Coverages.additionalcoveragesAppliedperVehiclesIn();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_RiskAnalysis.button_Verify();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyReview.policyDetails();
		PersonalAuto_PolicyReview.policyLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages_VehicleCoverages();

		PolicyCenter_Resuables.clickButton("Save Draft");
		PolicyCenter_Resuables.clickButton("Quote");
		PersonalAuto_Quote.quoteDetails();
		PersonalAuto_Quote.policyPremium_Garage1();
		PersonalAuto_Quote.policyPremium_Vehicle1();
		PersonalAuto_Quote.policyPremium_PremiumSubtotalandTaxes();
		strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");
		String strEditLock = PolicyCenter_Resuables.infoBar("EditLock");

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
		PolicyCenter_Resuables.clickButton("Bind Only");
		strJob           = PolicyCenter_Resuables.infoBar("Job");
		strLOB           = PolicyCenter_Resuables.infoBar("LOB");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_141_Pay_UpFrontPayment_Check() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		Tab_Menu_Navigation.pcTabNavigation("New Account", "NA");
		PolicyCenter_Account.createPersonAccount();
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

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Vehicles.createVehicles();
		PersonalAuto_Vehicles.assignDriver();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Coverages.coveragesAppliedtoallVehiclesIn();
		PersonalAuto_Coverages.coveragesAppliedperVehiclesIn();
		PersonalAuto_Coverages.additionalcoveragesAppliedtoallVehiclesIn();
		PersonalAuto_Coverages.additionalcoveragesAppliedperVehiclesIn();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_RiskAnalysis.button_Verify();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyReview.policyDetails();
		PersonalAuto_PolicyReview.policyLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages_VehicleCoverages();

		PolicyCenter_Resuables.clickButton("Save Draft");
		PolicyCenter_Resuables.clickButton("Quote");
		PersonalAuto_Quote.quoteDetails();
		PersonalAuto_Quote.policyPremium_Garage1();
		PersonalAuto_Quote.policyPremium_Vehicle1();
		PersonalAuto_Quote.policyPremium_PremiumSubtotalandTaxes();
		strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");
		String strEditLock = PolicyCenter_Resuables.infoBar("EditLock");

		PersonalAuto_Quote.quoteDetails();
		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Forms.pa_forms();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Payments.premiumSummary();
		PersonalAuto_Payments.payments();
		PersonalAuto_Payments.invoicing();
		PersonalAuto_Payments.billing();
		PersonalAuto_Payments.paymentSchedule();
		PersonalAuto_Payments.upFrontPayment();

		PolicyCenter_Resuables.clickButton("Bind Options");
		PolicyCenter_Resuables.clickButton("Bind Only");
		strJob           = PolicyCenter_Resuables.infoBar("Job");
		strLOB           = PolicyCenter_Resuables.infoBar("LOB");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_144_Policy_NewSubmission() throws Throwable {

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
		PolicyCenter_Resuables.clickButton("Bind Only");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_147_Versions_Multiple_FA_Defaulteffectivedate() throws Throwable {

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
		PolicyCenter_Resuables.clickButton("Bind Only");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_150_Versions_Multiple_QQ_Defaulteffectivedate() throws Throwable {

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
		PolicyCenter_Resuables.clickButton("Bind Only");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_153_Quote_CloseOptions_Decline() throws Throwable {

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
		PolicyCenter_Resuables.clickButton("Bind Only");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_156_SubmissionBound_PolicyNumberValidation() throws Throwable {

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
		PolicyCenter_Resuables.clickButton("Bind Only");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_159_EditPolicyTransaction() throws Throwable {

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
		PolicyCenter_Resuables.clickButton("Bind Only");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_7_Single_QuickQuote_DefaultBaseState_Modify() throws Throwable {
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
		PolicyCenter_Resuables.clickButton("Bind Only");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		// strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_10_Single_QuickQuote_DriverRemove() throws Throwable {
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
		PolicyCenter_Resuables.clickButton("Bind Only");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		// strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_13_Single_QuickQuote_UseDefault() throws Throwable {
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
		PolicyCenter_Resuables.clickButton("Bind Only");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		// strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_16_Single_QuickQuote_Version() throws Throwable {
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
		PolicyCenter_Resuables.clickButton("Bind Only");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		// strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_19_Single_FullApplication_DefaultBaseState_Modify() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		Tab_Menu_Navigation.pcTabNavigation("New Account", "NA");
		PolicyCenter_Account.createPersonAccount();
		PolicyCenter_AccountSummary.detail_Verify();

		Tab_Menu_Navigation.pcMenuNavigation("New Submission");
		PolicyCenter_Resuables.newSubmissions_Edit();
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

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Vehicles.createVehicles();
		PersonalAuto_Vehicles.assignDriver();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Coverages.coveragesAppliedtoallVehiclesIn();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_RiskAnalysis.button_Verify();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyReview.policyDetails();
		PersonalAuto_PolicyReview.policyLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages();

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
		PolicyCenter_Resuables.clickButton("Bind Only");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_22_Offering_PremiumProgram() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		Tab_Menu_Navigation.pcTabNavigation("New Account", "NA");
		PolicyCenter_Account.createPersonAccount();
		PolicyCenter_AccountSummary.detail_Verify();

		Tab_Menu_Navigation.pcMenuNavigation("New Submission");
		PolicyCenter_Resuables.newSubmissions_Verify();
		PersonalAuto_Reusable.newSubmission_SelectLOB_PersonalAuto(); // select
																		// LOB

		strAccountName      = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber    = PolicyCenter_Resuables.infoBar("AccountNumber");
		strSubmissionNumber = PolicyCenter_Resuables.infoBar("SubmissionNumber");
		strJob              = PolicyCenter_Resuables.infoBar("Job");

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

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Vehicles.createVehicles();
		PersonalAuto_Vehicles.assignDriver();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Coverages.coveragesAppliedtoallVehiclesIn();
		PersonalAuto_Coverages.coveragesAppliedperVehiclesIn();
		PersonalAuto_Coverages.additionalcoveragesAppliedtoallVehiclesIn();
		PersonalAuto_Coverages.additionalcoveragesAppliedperVehiclesIn();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_RiskAnalysis.button_Verify();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyReview.policyDetails();
		PersonalAuto_PolicyReview.policyLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages_VehicleCoverages();

		PolicyCenter_Resuables.clickButton("Save Draft");
		PolicyCenter_Resuables.clickButton("Quote");
		PersonalAuto_Quote.quoteDetails();
		PersonalAuto_Quote.policyPremium_Garage1();
		PersonalAuto_Quote.policyPremium_Vehicle1();
		PersonalAuto_Quote.policyPremium_PremiumSubtotalandTaxes();
		strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");
		String strEditLock = PolicyCenter_Resuables.infoBar("EditLock");

		PersonalAuto_Quote.quoteDetails();
		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Forms.pa_forms();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Payments.premiumSummary();
		PersonalAuto_Payments.payments();
		PersonalAuto_Payments.invoicing();
		PersonalAuto_Payments.billing();
		PersonalAuto_Payments.paymentSchedule();
		PersonalAuto_Payments.upFrontPayment();

		PolicyCenter_Resuables.clickButton("Bind Options");
		PolicyCenter_Resuables.clickButton("Bind Only");
		strJob           = PolicyCenter_Resuables.infoBar("Job");
		strLOB           = PolicyCenter_Resuables.infoBar("LOB");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_34_PI_QuoteNeeded_FutureDate() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		Tab_Menu_Navigation.pcTabNavigation("New Account", "NA");
		PolicyCenter_Account.createPersonAccount();
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

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Vehicles.createVehicles();
		PersonalAuto_Vehicles.assignDriver();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Coverages.coveragesAppliedtoallVehiclesIn();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_RiskAnalysis.button_Verify();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyReview.policyDetails();
		PersonalAuto_PolicyReview.policyLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages();

		PolicyCenter_Resuables.clickButton("Save Draft");
		PolicyCenter_Resuables.clickButton("Quote");
		PersonalAuto_Quote.quoteDetails();
		PersonalAuto_Quote.policyPremium_Garage1();
		PersonalAuto_Quote.policyPremium_Vehicle1();
		PersonalAuto_Quote.policyPremium_PremiumSubtotalandTaxes();
		strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");
		String strEditLock = PolicyCenter_Resuables.infoBar("EditLock");

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Forms.pa_forms();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Payments.premiumSummary();
		PersonalAuto_Payments.payments();
		PersonalAuto_Payments.invoicing();
		PersonalAuto_Payments.billing();
		PersonalAuto_Payments.paymentSchedule();
		PersonalAuto_Payments.upFrontPayment();

		PolicyCenter_Resuables.clickButton("Bind Options");
		PolicyCenter_Resuables.clickButton("Bind Only");
		strJob           = PolicyCenter_Resuables.infoBar("Job");
		strLOB           = PolicyCenter_Resuables.infoBar("LOB");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_37_PI_Policy_Address_ChangeTo_Existing_Address() throws Throwable {
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
		PolicyCenter_Resuables.clickButton("Bind Only");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		// strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_41_PI_AdditionalInsured_Add() throws Throwable {
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
		PolicyCenter_Resuables.clickButton("Bind Only");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		// strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_44_PI_SecondaryNamedInsured_Add() throws Throwable {
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
		PolicyCenter_Resuables.clickButton("Bind Only");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		// strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_47_PI_TermType_Annual() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		Tab_Menu_Navigation.pcTabNavigation("New Account", "NA");
		PolicyCenter_Account.createPersonAccount();
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

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Vehicles.createVehicles();
		PersonalAuto_Vehicles.assignDriver();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Coverages.coveragesAppliedtoallVehiclesIn();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_RiskAnalysis.button_Verify();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyReview.policyDetails();
		PersonalAuto_PolicyReview.policyLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages();

		PolicyCenter_Resuables.clickButton("Save Draft");
		PolicyCenter_Resuables.clickButton("Quote");
		PersonalAuto_Quote.quoteDetails();
		PersonalAuto_Quote.policyPremium_Garage1();
		PersonalAuto_Quote.policyPremium_Vehicle1();
		PersonalAuto_Quote.policyPremium_PremiumSubtotalandTaxes();
		strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");
		String strEditLock = PolicyCenter_Resuables.infoBar("EditLock");

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Forms.pa_forms();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Payments.premiumSummary();
		PersonalAuto_Payments.payments();
		PersonalAuto_Payments.invoicing();
		PersonalAuto_Payments.billing();
		PersonalAuto_Payments.paymentSchedule();
		PersonalAuto_Payments.upFrontPayment();

		PolicyCenter_Resuables.clickButton("Bind Options");
		PolicyCenter_Resuables.clickButton("Bind Only");
		strJob           = PolicyCenter_Resuables.infoBar("Job");
		strLOB           = PolicyCenter_Resuables.infoBar("LOB");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_50_PI_WrittenDate_BackDated() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		Tab_Menu_Navigation.pcTabNavigation("New Account", "NA");
		PolicyCenter_Account.createPersonAccount();
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

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Vehicles.createVehicles();
		PersonalAuto_Vehicles.assignDriver();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Coverages.coveragesAppliedtoallVehiclesIn();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_RiskAnalysis.button_Verify();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyReview.policyDetails();
		PersonalAuto_PolicyReview.policyLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages();

		PolicyCenter_Resuables.clickButton("Save Draft");
		PolicyCenter_Resuables.clickButton("Quote");
		PersonalAuto_Quote.quoteDetails();
		PersonalAuto_Quote.policyPremium_Garage1();
		PersonalAuto_Quote.policyPremium_Vehicle1();
		PersonalAuto_Quote.policyPremium_PremiumSubtotalandTaxes();
		strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");
		String strEditLock = PolicyCenter_Resuables.infoBar("EditLock");

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Forms.pa_forms();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Payments.premiumSummary();
		PersonalAuto_Payments.payments();
		PersonalAuto_Payments.invoicing();
		PersonalAuto_Payments.billing();
		PersonalAuto_Payments.paymentSchedule();
		PersonalAuto_Payments.upFrontPayment();

		PolicyCenter_Resuables.clickButton("Bind Options");
		PolicyCenter_Resuables.clickButton("Bind Only");
		strJob           = PolicyCenter_Resuables.infoBar("Job");
		strLOB           = PolicyCenter_Resuables.infoBar("LOB");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_53_PI_Organization_Modify() throws Throwable {
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
		PolicyCenter_Resuables.clickButton("Bind Only");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		// strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_56_PA_Driver_Add_NewPerson() throws Throwable {
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
		PolicyCenter_Resuables.clickButton("Bind Only");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		// strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_59_PA_Driver_Modify() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PolicyCenter_Resuables.pcTabNavigation_Sub_Search();

		strAccountName      = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber    = PolicyCenter_Resuables.infoBar("AccountNumber");
		strSubmissionNumber = PolicyCenter_Resuables.infoBar("SubmissionNumber");

		PersonalAuto_Quote.quoteDetails();

		PolicyCenter_Resuables.clickButton("Edit Policy Transaction");
		PersonalAuto_PolicyReview.policyDetails();

		PersonalAuto_Reusable.paMenuNavigation("Offering");
		PolicyCenter_Resuables.offering();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Qualification.qualification();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyInfo.primaryNamedInsured();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Drivers.driver_ContatDetails("EDIT");

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Vehicles.Vehicles_Verify();

		PolicyCenter_Resuables.clickButton("Save Draft");
		PolicyCenter_Resuables.clickButton("Quote");
		PersonalAuto_Quote.quoteDetails();
		PersonalAuto_Quote.policyPremium_Garage1();
		PersonalAuto_Quote.policyPremium_Vehicle1();
		PersonalAuto_Quote.policyPremium_PremiumSubtotalandTaxes();
		strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");
		String strEditLock = PolicyCenter_Resuables.infoBar("EditLock");

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Forms.pa_forms();

		strJob           = PolicyCenter_Resuables.infoBar("Job");
		strLOB           = PolicyCenter_Resuables.infoBar("LOB");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_62_PA_Driver_Modify_Addresses_Add() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PolicyCenter_Resuables.pcTabNavigation_Sub_Search();

		strAccountName      = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber    = PolicyCenter_Resuables.infoBar("AccountNumber");
		strSubmissionNumber = PolicyCenter_Resuables.infoBar("SubmissionNumber");

		PersonalAuto_Quote.quoteDetails();

		PolicyCenter_Resuables.clickButton("Edit Policy Transaction");
		PersonalAuto_PolicyReview.policyDetails();

		PersonalAuto_Reusable.paMenuNavigation("Drivers");
		PersonalAuto_Drivers.driver_Addresses("ADD");

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Vehicles.Vehicles_Verify();

		PolicyCenter_Resuables.clickButton("Save Draft");
		PolicyCenter_Resuables.clickButton("Quote");
		PersonalAuto_Quote.quoteDetails();
		PersonalAuto_Quote.policyPremium_Garage1();
		PersonalAuto_Quote.policyPremium_Vehicle1();
		PersonalAuto_Quote.policyPremium_PremiumSubtotalandTaxes();
		strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");
		String strEditLock = PolicyCenter_Resuables.infoBar("EditLock");

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Forms.pa_forms();

		strJob           = PolicyCenter_Resuables.infoBar("Job");
		strLOB           = PolicyCenter_Resuables.infoBar("LOB");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_65_PA_Driver_Remove() throws Throwable {
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
		PolicyCenter_Resuables.clickButton("Bind Only");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		// strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test

	public void AUT_PA_PC_NewSubmission_68_PA_Driver_Negative_AgeLessThan25() throws Throwable {
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
		PolicyCenter_Resuables.clickButton("Bind Only");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		// strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_71_PA_RemoveVehicle() throws Throwable {
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
		PolicyCenter_Resuables.clickButton("Bind Only");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		// strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_74_PA_Vehicle_AdditionalInterest_Add_From_Addressbook() throws Throwable {
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
		PolicyCenter_Resuables.clickButton("Bind Only");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		// strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_77_PA_Vehicle_Negative_AssignDriver() throws Throwable {
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
		PolicyCenter_Resuables.clickButton("Bind Only");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		// strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_80_PA_Vehicle_Negative_CostNew() throws Throwable {
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
		PolicyCenter_Resuables.clickButton("Bind Only");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		// strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
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
		// String strEditLock = PolicyCenter_Resuables.infoBar("EditLock");

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
		PolicyCenter_Resuables.clickButton("Bind Only");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		// strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_83_PA_Coverages_AllVehicles_Remove() throws Throwable {
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
		PolicyCenter_Resuables.clickButton("Bind Only");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		// strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_86_PA_Coverages_PerVehicle_Remove() throws Throwable {
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
		PolicyCenter_Resuables.clickButton("Bind Only");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		// strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_89_PA_AdditionalCoverages_AllVehicles_Remove() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		Tab_Menu_Navigation.pcTabNavigation("New Account", "NA");
		PolicyCenter_Account.createPersonAccount();
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

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Vehicles.createVehicles();
		PersonalAuto_Vehicles.assignDriver();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Coverages.coveragesAppliedtoallVehiclesIn();
		PersonalAuto_Coverages.coveragesAppliedperVehiclesIn();
		PersonalAuto_Coverages.additionalcoveragesAppliedtoallVehiclesIn();
		PersonalAuto_Coverages.additionalcoveragesAppliedperVehiclesIn();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_RiskAnalysis.button_Verify();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyReview.policyDetails();
		PersonalAuto_PolicyReview.policyLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages_VehicleCoverages();

		PolicyCenter_Resuables.clickButton("Save Draft");
		PolicyCenter_Resuables.clickButton("Quote");
		PersonalAuto_Quote.quoteDetails();
		PersonalAuto_Quote.policyPremium_Garage1();
		PersonalAuto_Quote.policyPremium_Vehicle1();
		PersonalAuto_Quote.policyPremium_PremiumSubtotalandTaxes();
		strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");
		String strEditLock = PolicyCenter_Resuables.infoBar("EditLock");

		PersonalAuto_Quote.quoteDetails();
		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Forms.pa_forms();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Payments.premiumSummary();
		PersonalAuto_Payments.payments();
		PersonalAuto_Payments.invoicing();
		PersonalAuto_Payments.billing();
		PersonalAuto_Payments.paymentSchedule();
		PersonalAuto_Payments.upFrontPayment();

		PolicyCenter_Resuables.clickButton("Bind Options");
		PolicyCenter_Resuables.clickButton("Bind Only");
		strJob           = PolicyCenter_Resuables.infoBar("Job");
		strLOB           = PolicyCenter_Resuables.infoBar("LOB");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_92_PA_AdditionalCoverages_PerVehicle_Remove() throws Throwable {
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
		PolicyCenter_Resuables.clickButton("Bind Only");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		// strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_95_PA_ExclusionandCondition_Add_ExclusionandCondition() throws Throwable {
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
		PolicyCenter_Resuables.clickButton("Bind Only");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		// strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_98_PA_ExclusionandCondition_Modify_ExclusionandCondition() throws Throwable {
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
		PolicyCenter_Resuables.clickButton("Bind Only");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		// strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_101_RiskAnalysis_ApproveUWIssue() throws Throwable {
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
		PolicyCenter_Resuables.clickButton("Bind Only");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		// strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_104_RiskAnalysis_RequestApproval() throws Throwable {
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
		PolicyCenter_Resuables.clickButton("Bind Only");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		// strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_107_RiskAnalysis_PriorPolicies_Remove() throws Throwable {
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
		PolicyCenter_Resuables.clickButton("Bind Only");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		// strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_110_RiskAnalysis_PriorLosses_Modify() throws Throwable {
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
		PolicyCenter_Resuables.clickButton("Bind Only");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		// strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_113_PA_PolicyReview() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		Tab_Menu_Navigation.pcTabNavigation("New Account", "NA");
		PolicyCenter_Account.createPersonAccount();
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

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Vehicles.createVehicles();
		PersonalAuto_Vehicles.assignDriver();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Coverages.coveragesAppliedtoallVehiclesIn();
		PersonalAuto_Coverages.coveragesAppliedperVehiclesIn();
		PersonalAuto_Coverages.additionalcoveragesAppliedtoallVehiclesIn();
		PersonalAuto_Coverages.additionalcoveragesAppliedperVehiclesIn();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_RiskAnalysis.button_Verify();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyReview.policyDetails();
		PersonalAuto_PolicyReview.policyLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages_VehicleCoverages();

		PolicyCenter_Resuables.clickButton("Save Draft");
		PolicyCenter_Resuables.clickButton("Quote");
		PersonalAuto_Quote.quoteDetails();
		PersonalAuto_Quote.policyPremium_Garage1();
		PersonalAuto_Quote.policyPremium_Vehicle1();
		PersonalAuto_Quote.policyPremium_PremiumSubtotalandTaxes();
		strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");
		String strEditLock = PolicyCenter_Resuables.infoBar("EditLock");

		PersonalAuto_Quote.quoteDetails();
		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Forms.pa_forms();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Payments.premiumSummary();
		PersonalAuto_Payments.payments();
		PersonalAuto_Payments.invoicing();
		PersonalAuto_Payments.billing();
		PersonalAuto_Payments.paymentSchedule();
		PersonalAuto_Payments.upFrontPayment();

		PolicyCenter_Resuables.clickButton("Bind Options");
		PolicyCenter_Resuables.clickButton("Bind Only");
		strJob           = PolicyCenter_Resuables.infoBar("Job");
		strLOB           = PolicyCenter_Resuables.infoBar("LOB");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_116_PA_Forms() throws Throwable {
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
		PolicyCenter_Resuables.clickButton("Bind Only");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		// strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_119_Pay_AlternateBillingAccount_Search() throws Throwable {
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
		PolicyCenter_Resuables.clickButton("Bind Only");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		// strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_122_Pay_AlternateBillingContact_NewPerson() throws Throwable {
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
		PolicyCenter_Resuables.clickButton("Bind Only");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		// strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_125_Pay_AlternateBillingContact_OtherContact() throws Throwable {
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
		PolicyCenter_Resuables.clickButton("Bind Only");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		// strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_128_Pay_PaymentSchedule_C() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		Tab_Menu_Navigation.pcTabNavigation("New Account", "NA");
		PolicyCenter_Account.createPersonAccount();
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

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Vehicles.createVehicles();
		PersonalAuto_Vehicles.assignDriver();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Coverages.coveragesAppliedtoallVehiclesIn();
		PersonalAuto_Coverages.coveragesAppliedperVehiclesIn();
		PersonalAuto_Coverages.additionalcoveragesAppliedtoallVehiclesIn();
		PersonalAuto_Coverages.additionalcoveragesAppliedperVehiclesIn();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_RiskAnalysis.button_Verify();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyReview.policyDetails();
		PersonalAuto_PolicyReview.policyLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages_VehicleCoverages();

		PolicyCenter_Resuables.clickButton("Save Draft");
		PolicyCenter_Resuables.clickButton("Quote");
		PersonalAuto_Quote.quoteDetails();
		PersonalAuto_Quote.policyPremium_Garage1();
		PersonalAuto_Quote.policyPremium_Vehicle1();
		PersonalAuto_Quote.policyPremium_PremiumSubtotalandTaxes();
		strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");
		String strEditLock = PolicyCenter_Resuables.infoBar("EditLock");

		PersonalAuto_Quote.quoteDetails();
		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Forms.pa_forms();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Payments.premiumSummary();
		PersonalAuto_Payments.payments();
		PersonalAuto_Payments.invoicing();
		PersonalAuto_Payments.billing();
		PersonalAuto_Payments.paymentSchedule();
		PersonalAuto_Payments.upFrontPayment();

		PolicyCenter_Resuables.clickButton("Bind Options");
		PolicyCenter_Resuables.clickButton("Bind Only");
		strJob           = PolicyCenter_Resuables.infoBar("Job");
		strLOB           = PolicyCenter_Resuables.infoBar("LOB");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_131_Pay_PaymentSchedule_F() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		Tab_Menu_Navigation.pcTabNavigation("New Account", "NA");
		PolicyCenter_Account.createPersonAccount();
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

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Vehicles.createVehicles();
		PersonalAuto_Vehicles.assignDriver();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Coverages.coveragesAppliedtoallVehiclesIn();
		PersonalAuto_Coverages.coveragesAppliedperVehiclesIn();
		PersonalAuto_Coverages.additionalcoveragesAppliedtoallVehiclesIn();
		PersonalAuto_Coverages.additionalcoveragesAppliedperVehiclesIn();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_RiskAnalysis.button_Verify();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyReview.policyDetails();
		PersonalAuto_PolicyReview.policyLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages_VehicleCoverages();

		PolicyCenter_Resuables.clickButton("Save Draft");
		PolicyCenter_Resuables.clickButton("Quote");
		PersonalAuto_Quote.quoteDetails();
		PersonalAuto_Quote.policyPremium_Garage1();
		PersonalAuto_Quote.policyPremium_Vehicle1();
		PersonalAuto_Quote.policyPremium_PremiumSubtotalandTaxes();
		strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");
		String strEditLock = PolicyCenter_Resuables.infoBar("EditLock");

		PersonalAuto_Quote.quoteDetails();
		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Forms.pa_forms();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Payments.premiumSummary();
		PersonalAuto_Payments.payments();
		PersonalAuto_Payments.invoicing();
		PersonalAuto_Payments.billing();
		PersonalAuto_Payments.paymentSchedule();
		PersonalAuto_Payments.upFrontPayment();

		PolicyCenter_Resuables.clickButton("Bind Options");
		PolicyCenter_Resuables.clickButton("Bind Only");
		strJob           = PolicyCenter_Resuables.infoBar("Job");
		strLOB           = PolicyCenter_Resuables.infoBar("LOB");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_134_Pay_PaymentSchedule_Monthly3() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		Tab_Menu_Navigation.pcTabNavigation("New Account", "NA");
		PolicyCenter_Account.createPersonAccount();
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

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Vehicles.createVehicles();
		PersonalAuto_Vehicles.assignDriver();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Coverages.coveragesAppliedtoallVehiclesIn();
		PersonalAuto_Coverages.coveragesAppliedperVehiclesIn();
		PersonalAuto_Coverages.additionalcoveragesAppliedtoallVehiclesIn();
		PersonalAuto_Coverages.additionalcoveragesAppliedperVehiclesIn();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_RiskAnalysis.button_Verify();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyReview.policyDetails();
		PersonalAuto_PolicyReview.policyLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages_VehicleCoverages();

		PolicyCenter_Resuables.clickButton("Save Draft");
		PolicyCenter_Resuables.clickButton("Quote");
		PersonalAuto_Quote.quoteDetails();
		PersonalAuto_Quote.policyPremium_Garage1();
		PersonalAuto_Quote.policyPremium_Vehicle1();
		PersonalAuto_Quote.policyPremium_PremiumSubtotalandTaxes();
		strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");
		String strEditLock = PolicyCenter_Resuables.infoBar("EditLock");

		PersonalAuto_Quote.quoteDetails();
		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Forms.pa_forms();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Payments.premiumSummary();
		PersonalAuto_Payments.payments();
		PersonalAuto_Payments.invoicing();
		PersonalAuto_Payments.billing();
		PersonalAuto_Payments.paymentSchedule();
		PersonalAuto_Payments.upFrontPayment();

		PolicyCenter_Resuables.clickButton("Bind Options");
		PolicyCenter_Resuables.clickButton("Bind Only");
		strJob           = PolicyCenter_Resuables.infoBar("Job");
		strLOB           = PolicyCenter_Resuables.infoBar("LOB");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_137_Pay_FixInvoice_DueDute() throws Throwable {
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
		PolicyCenter_Resuables.clickButton("Bind Only");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		// strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_140_Pay_UpFrontPayment_HeldByAgent() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		Tab_Menu_Navigation.pcTabNavigation("New Account", "NA");
		PolicyCenter_Account.createPersonAccount();
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

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Vehicles.createVehicles();
		PersonalAuto_Vehicles.assignDriver();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Coverages.coveragesAppliedtoallVehiclesIn();
		PersonalAuto_Coverages.coveragesAppliedperVehiclesIn();
		PersonalAuto_Coverages.additionalcoveragesAppliedtoallVehiclesIn();
		PersonalAuto_Coverages.additionalcoveragesAppliedperVehiclesIn();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_RiskAnalysis.button_Verify();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyReview.policyDetails();
		PersonalAuto_PolicyReview.policyLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages_VehicleCoverages();

		PolicyCenter_Resuables.clickButton("Save Draft");
		PolicyCenter_Resuables.clickButton("Quote");
		PersonalAuto_Quote.quoteDetails();
		PersonalAuto_Quote.policyPremium_Garage1();
		PersonalAuto_Quote.policyPremium_Vehicle1();
		PersonalAuto_Quote.policyPremium_PremiumSubtotalandTaxes();
		strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");
		String strEditLock = PolicyCenter_Resuables.infoBar("EditLock");

		PersonalAuto_Quote.quoteDetails();
		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Forms.pa_forms();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Payments.premiumSummary();
		PersonalAuto_Payments.payments();
		PersonalAuto_Payments.invoicing();
		PersonalAuto_Payments.billing();
		PersonalAuto_Payments.paymentSchedule();
		PersonalAuto_Payments.upFrontPayment();

		PolicyCenter_Resuables.clickButton("Bind Options");
		PolicyCenter_Resuables.clickButton("Bind Only");
		strJob           = PolicyCenter_Resuables.infoBar("Job");
		strLOB           = PolicyCenter_Resuables.infoBar("LOB");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_143_Pay_UpFrontPayment_Electronic() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		Tab_Menu_Navigation.pcTabNavigation("New Account", "NA");
		PolicyCenter_Account.createPersonAccount();
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

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Vehicles.createVehicles();
		PersonalAuto_Vehicles.assignDriver();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Coverages.coveragesAppliedtoallVehiclesIn();
		PersonalAuto_Coverages.coveragesAppliedperVehiclesIn();
		PersonalAuto_Coverages.additionalcoveragesAppliedtoallVehiclesIn();
		PersonalAuto_Coverages.additionalcoveragesAppliedperVehiclesIn();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_RiskAnalysis.button_Verify();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyReview.policyDetails();
		PersonalAuto_PolicyReview.policyLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages_VehicleCoverages();

		PolicyCenter_Resuables.clickButton("Save Draft");
		PolicyCenter_Resuables.clickButton("Quote");
		PersonalAuto_Quote.quoteDetails();
		PersonalAuto_Quote.policyPremium_Garage1();
		PersonalAuto_Quote.policyPremium_Vehicle1();
		PersonalAuto_Quote.policyPremium_PremiumSubtotalandTaxes();
		strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");
		String strEditLock = PolicyCenter_Resuables.infoBar("EditLock");

		PersonalAuto_Quote.quoteDetails();
		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Forms.pa_forms();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Payments.premiumSummary();
		PersonalAuto_Payments.payments();
		PersonalAuto_Payments.invoicing();
		PersonalAuto_Payments.billing();
		PersonalAuto_Payments.paymentSchedule();
		PersonalAuto_Payments.upFrontPayment();

		PolicyCenter_Resuables.clickButton("Bind Options");
		PolicyCenter_Resuables.clickButton("Bind Only");
		strJob           = PolicyCenter_Resuables.infoBar("Job");
		strLOB           = PolicyCenter_Resuables.infoBar("LOB");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_146_Versions_Multiple_FA_DefaultbaseState() throws Throwable {
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
		PolicyCenter_Resuables.clickButton("Bind Only");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		// strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_149_Versions_Multiple_QQ_DefaultbaseState() throws Throwable {
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
		PolicyCenter_Resuables.clickButton("Bind Only");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		// strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_152_Quote_CloseOptions_Withdraw() throws Throwable {
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
		PolicyCenter_Resuables.clickButton("Bind Only");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		// strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_155_Quote_BindOption_BindOnly() throws Throwable {
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
		PolicyCenter_Resuables.clickButton("Bind Only");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		// strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_158_SaveDraft() throws Throwable {
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
		PolicyCenter_Resuables.clickButton("Bind Only");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		// strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_161_BureauID() throws Throwable {
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
		PolicyCenter_Resuables.clickButton("Bind Only");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		// strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

}
