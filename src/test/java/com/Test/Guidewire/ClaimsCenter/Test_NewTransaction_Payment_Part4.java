package com.Test.Guidewire.ClaimsCenter;

import org.testng.annotations.Test;

import com.pages.Guidewire.ClaimsCenter.CC_Exposure;
import com.pages.Guidewire.ClaimsCenter.CC_Financials;
import com.pages.Guidewire.ClaimsCenter.CC_NewClaimWizard;
import com.pages.Guidewire.ClaimsCenter.CC_NewTransaction_Check;
import com.pages.Guidewire.ClaimsCenter.CC_Reserve;
import com.pages.Guidewire.ClaimsCenter.CC_Reusables;

public class Test_NewTransaction_Payment_Part4 {
	@Test
	public void AUT_Payment_PIPKentucky_UnspecifiedCostType_Casemanagement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Kentucky");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPKentucky_UnspecifiedCostType_Deathbenefits() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Kentucky");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPKentucky_UnspecifiedCostType_Emergencyservices() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Kentucky");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPKentucky_UnspecifiedCostType_Lostwages() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Kentucky");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPKentucky_UnspecifiedCostType_Medical() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Kentucky");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPKentucky_UnspecifiedCostType_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Kentucky");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPKentucky_UnspecifiedCostType_Reimbursement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Kentucky");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPKentucky_UnspecifiedCostType_Vocational() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Kentucky");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPKentucky_ClaimCost_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Kentucky");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPKentucky_ClaimCost_Burialexpenses() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Kentucky");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPKentucky_ClaimCost_Deathbenefits() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Kentucky");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPKentucky_ClaimCost_Emergencyservices() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Kentucky");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPKentucky_ClaimCost_Lostwages() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Kentucky");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPKentucky_ClaimCost_Medical() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Kentucky");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPKentucky_ClaimCost_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Kentucky");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPKentucky_ClaimCost_Reimbursement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Kentucky");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPKentucky_ClaimCost_Vocational() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Kentucky");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPKentucky_ExpenseAO_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Kentucky");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPKentucky_ExpenseAO_Casemanagement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Kentucky");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPKentucky_ExpenseAO_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Kentucky");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPKentucky_ExpenseDCC_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Kentucky");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_1();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPKentucky_ExpenseDCC_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Kentucky");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_1();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	// --------------------------------------------------------------------

	@Test

	public void AUT_PIPMaryland_UnspecifiedCostType_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Maryland");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPMaryland_UnspecifiedCostType_Burialexpenses() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Maryland");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPMaryland_UnspecifiedCostType_Casemanagement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Maryland");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPMaryland_UnspecifiedCostType_Deathbenefits() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Maryland");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPMaryland_UnspecifiedCostType_Emergencyservices() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Maryland");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPMaryland_UnspecifiedCostType_Lostwages() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Maryland");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPMaryland_UnspecifiedCostType_Medical() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Maryland");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPMaryland_UnspecifiedCostType_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Maryland");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPMaryland_UnspecifiedCostType_Reimbursement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Maryland");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPMaryland_UnspecifiedCostType_Vocational() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Maryland");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPMaryland_ClaimCost_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Maryland");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPMaryland_ClaimCost_Burialexpenses() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Maryland");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPMaryland_ClaimCost_Deathbenefits() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Maryland");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPMaryland_ClaimCost_Emergencyservices() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Maryland");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPMaryland_ClaimCost_Lostwages() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Maryland");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPMaryland_ClaimCost_Medical() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Maryland");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPMaryland_ClaimCost_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Maryland");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPMaryland_ClaimCost_Reimbursement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Maryland");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPMaryland_ClaimCost_Vocational() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Maryland");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPMaryland_ExpenseAO_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Maryland");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPMaryland_ExpenseAO_Casemanagement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Maryland");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPMaryland_ExpenseAO_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Maryland");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPMaryland_ExpenseDCC_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Maryland");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_1();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPMaryland_ExpenseDCC_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Maryland");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_1();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	// -------------------------------------------------------------------------------------------------------------

	@Test
	public void AUT_PIPMassachusetts_UnspecifiedCostType_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();

	}

	@Test
	public void AUT_PIPMassachusetts_UnspecifiedCostType_Burialexpenses() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Massachusetts");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();

	}

	@Test
	public void AUT_PIPMassachusetts_UnspecifiedCostType_Casemanagement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Massachusetts");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();

	}

	@Test
	public void AUT_PIPMassachusetts_UnspecifiedCostType_Deathbenefits() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Massachusetts");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();

	}

	@Test
	public void AUT_PIPMassachusetts_UnspecifiedCostType_Emergencyservices() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Massachusetts");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();

	}

	@Test
	public void AUT_PIPMassachusetts_UnspecifiedCostType_Lostwages() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Massachusetts");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();

	}

	@Test
	public void AUT_PIPMassachusetts_UnspecifiedCostType_Medical() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Massachusetts");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();

	}

	@Test
	public void AUT_PIPMassachusetts_UnspecifiedCostType_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Massachusetts");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();

	}

	@Test
	public void AUT_PIPMassachusetts_UnspecifiedCostType_Reimbursement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Massachusetts");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();

	}

	@Test
	public void AUT_PIPMassachusetts_UnspecifiedCostType_Vocational() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Massachusetts");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();

	}

	@Test
	public void AUT_PIPMassachusetts_ClaimCost_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Massachusetts");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();

	}

	@Test
	public void AUT_PIPMassachusetts_ClaimCost_Burialexpenses() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Massachusetts");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();

	}

	@Test
	public void AUT_PIPMassachusetts_ClaimCost_Deathbenefits() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Massachusetts");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();

	}

	@Test
	public void AUT_PIPMassachusetts_ClaimCost_Emergencyservices() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Massachusetts");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();

	}

	@Test
	public void AUT_PIPMassachusetts_ClaimCost_Lostwages() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Massachusetts");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();

	}

	@Test
	public void AUT_PIPMassachusetts_ClaimCost_Medical() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Massachusetts");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();

	}

	@Test
	public void AUT_PIPMassachusetts_ClaimCost_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Massachusetts");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();

	}

	@Test
	public void AUT_PIPMassachusetts_ClaimCost_Reimbursement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Massachusetts");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();

	}

	@Test
	public void AUT_PIPMassachusetts_ClaimCost_Vocational() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Massachusetts");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();

	}

	@Test
	public void AUT_PIPMassachusetts_ExpenseAO_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Massachusetts");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();

	}

	@Test
	public void AUT_PIPMassachusetts_ExpenseAO_Casemanagement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Massachusetts");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();

	}

	@Test
	public void AUT_PIPMassachusetts_ExpenseAO_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Massachusetts");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();

	}

	@Test
	public void AUT_PIPMassachusetts_ExpenseDCC_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Massachusetts");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_1();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();

	}

	@Test
	public void AUT_PIPMassachusetts_ExpenseDCC_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Massachusetts");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_1();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	// -----------------------------------------------------------------------------------------------------------------

	@Test

	public void AUT_Payment_PIPMichigans_UnspecifiedCostType_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Michigan");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPMichigans_UnspecifiedCostType_Burialexpenses() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Michigan");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPMichigans_UnspecifiedCostType_Casemanagement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Michigan");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPMichigans_UnspecifiedCostType_Deathbenefits() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Michigan");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPMichigans_UnspecifiedCostType_Emergencyservices() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Michigan");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPMichigans_UnspecifiedCostType_Lostwages() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Michigan");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPMichigans_UnspecifiedCostType_Medical() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Michigan");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPMichigans_UnspecifiedCostType_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Michigan");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPMichigans_UnspecifiedCostType_Reimbursement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Michigan");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPMichigans_UnspecifiedCostType_Vocational() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Michigan");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPMichigans_ClaimCost_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Michigan");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPMichigans_ClaimCost_Burialexpenses() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Michigan");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPMichigans_ClaimCost_Deathbenefits() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Michigan");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPMichigans_ClaimCost_Emergencyservices() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Michigan");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPMichigans_ClaimCost_Lostwages() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Michigan");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPMichigans_ClaimCost_Medical() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Michigan");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPMichigans_ClaimCost_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Michigan");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPMichigans_ClaimCost_Reimbursement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Michigan");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPMichigans_ClaimCost_Vocational() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Michigan");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPMichigans_ExpenseAO_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Michigan");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPMichigans_ExpenseAO_Casemanagement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Michigan");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPMichigans_ExpenseAO_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Michigan");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPMichigans_ExpenseDCC_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Michigan");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_1();
		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPMichigans_ExpenseDCC_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Michigan");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_1();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	// --------------------------------------------------------------------------------------------------------
	@Test

	public void AUT_PIPMinnesotas_UnspecifiedCostType_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Minnesota");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPMinnesotas_UnspecifiedCostType_Burialexpenses() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Minnesota");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPMinnesotas_UnspecifiedCostType_Casemanagement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Minnesota");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPMinnesotas_UnspecifiedCostType_Deathbenefits() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Minnesota");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Minnesota");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPMinnesotas_UnspecifiedCostType_Emergencyservices() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Minnesota");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPMinnesotas_UnspecifiedCostType_Lostwages() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Minnesota");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPMinnesotas_UnspecifiedCostType_Medical() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Minnesota");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPMinnesotas_UnspecifiedCostType_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Minnesota");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPMinnesotas_UnspecifiedCostType_Reimbursement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Minnesota");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPMinnesotas_UnspecifiedCostType_Vocational() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Minnesota");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPMinnesotas_ClaimCost_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Minnesota");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPMinnesotas_ClaimCost_Burialexpenses() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Minnesota");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPMinnesotas_ClaimCost_Deathbenefits() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Minnesota");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPMinnesotas_ClaimCost_Emergencyservices() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Minnesota");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPMinnesotas_ClaimCost_Lostwages() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Minnesota");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPMinnesotas_ClaimCost_Medical() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Minnesota");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPMinnesotas_ClaimCost_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Minnesota");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPMinnesotas_ClaimCost_Reimbursement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Minnesota");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPMinnesotas_ClaimCost_Vocational() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Minnesota");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPMinnesotas_ExpenseAO_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Minnesota");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPMinnesotas_ExpenseAO_Casemanagement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Minnesota");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPMinnesotas_ExpenseAO_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Minnesota");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPMinnesotas_ExpenseDCC_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Minnesota");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_1();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPMinnesotas_ExpenseDCC_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Minnesota");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_1();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	// ----------------------------------------------------------------------------------------------------------------

	@Test
	public void AUT_Payment_PIPNewJersey_UnspecifiedCostType_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP NewJersey");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();

	}

	@Test
	public void AUT_Payment_PIPNewJersey_UnspecifiedCostType_Burialexpenses() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP NewJersey");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPNewJersey_UnspecifiedCostType_Casemanagement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP NewJersey");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPNewJersey_UnspecifiedCostType_Deathbenefits() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP NewJersey");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPNewJersey_UnspecifiedCostType_Emergencyservices() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP NewJersey");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPNewJersey_UnspecifiedCostType_Lostwages() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP NewJersey");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPNewJersey_UnspecifiedCostType_Medical() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP NewJersey");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPNewJersey_UnspecifiedCostType_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP NewJersey");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPNewJersey_UnspecifiedCostType_Reimbursement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP NewJersey");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPNewJersey_UnspecifiedCostType_Vocational() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP NewJersey");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPNewJersey_ClaimCost_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP NewJersey");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPNewJersey_ClaimCost_Burialexpenses() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP NewJersey");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPNewJersey_ClaimCost_Deathbenefits() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP NewJersey");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPNewJersey_ClaimCost_Emergencyservices() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP NewJersey");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPNewJersey_ClaimCost_Lostwages() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP NewJersey");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPNewJersey_ClaimCost_Medical() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP NewJersey");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPNewJersey_ClaimCost_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP NewJersey");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPNewJersey_ClaimCost_Reimbursement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP NewJersey");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPNewJersey_ClaimCost_Vocational() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP NewJersey");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPNewJersey_ExpenseAO_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP NewJersey");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPNewJersey_ExpenseAO_Casemanagement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP NewJersey");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPNewJersey_ExpenseAO_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP NewJersey");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPNewJersey_ExpenseDCC_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP NewJersey");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_1();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPNewJersey_ExpenseDCC_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP NewJersey");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_1();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	/// ---------------------------------------------------------------------------------------------------
	@Test
	public void AUT_Payment_PIPNewYork_UnspecifiedCostType_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP NewYork");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPNewYork_UnspecifiedCostType_Burialexpenses() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP NewYork");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPNewYork_UnspecifiedCostType_Casemanagement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP NewYork");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPNewYork_UnspecifiedCostType_Deathbenefits() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP NewYork");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPNewYork_UnspecifiedCostType_Emergencyservices() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP NewYork");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPNewYork_UnspecifiedCostType_Lostwages() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP NewYork");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPNewYork_UnspecifiedCostType_Medical() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP NewYork");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPNewYork_UnspecifiedCostType_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP NewYork");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPNewYork_UnspecifiedCostType_Reimbursement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP NewYork");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPNewYork_UnspecifiedCostType_Vocational() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP NewYork");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPNewYork_ClaimCost_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP NewYork");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPNewYork_ClaimCost_Burialexpenses() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP NewYork");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPNewYork_ClaimCost_Deathbenefits() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP NewYork");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPNewYork_ClaimCost_Emergencyservices() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP NewYork");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPNewYork_ClaimCost_Lostwages() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP NewYork");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPNewYork_ClaimCost_Medical() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP NewYork");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPNewYork_ClaimCost_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP NewYork");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPNewYork_ClaimCost_Reimbursement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP NewYork");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPNewYork_ClaimCost_Vocational() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP NewYork");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPNewYork_ExpenseAO_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP NewYork");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPNewYork_ExpenseAO_Casemanagement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP NewYork");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPNewYork_ExpenseAO_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP NewYork");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPNewYork_ExpenseDCC_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP NewYork");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_1();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPNewYork_ExpenseDCC_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP NewYork");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_1();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	// ------------------------------------------------------------------------------------------------
	@Test
	public void AUT_PIPNorthDakotas_UnspecifiedCostType_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP NorthDakota");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPNorthDakotas_UnspecifiedCostType_Burialexpenses() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP NorthDakota");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPNorthDakotas_UnspecifiedCostType_Casemanagement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP NorthDakota");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPNorthDakotas_UnspecifiedCostType_Deathbenefits() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP NorthDakota");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPNorthDakotas_UnspecifiedCostType_Emergencyservices() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP NorthDakota");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPNorthDakotas_UnspecifiedCostType_Lostwages() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP NorthDakota");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPNorthDakotas_UnspecifiedCostType_Medical() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP NorthDakota");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPNorthDakotas_UnspecifiedCostType_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP NorthDakota");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPNorthDakotas_UnspecifiedCostType_Reimbursement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP NorthDakota");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPNorthDakotas_UnspecifiedCostType_Vocational() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP NorthDakota");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPNorthDakotas_ClaimCost_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP NorthDakota");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPNorthDakotas_ClaimCost_Burialexpenses() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP NorthDakota");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPNorthDakotas_ClaimCost_Deathbenefits() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP NorthDakota");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPNorthDakotas_ClaimCost_Emergencyservices() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP NorthDakota");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPNorthDakotas_ClaimCost_Lostwages() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP NorthDakota");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPNorthDakotas_ClaimCost_Medical() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP NorthDakota");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPNorthDakotas_ClaimCost_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP NorthDakota");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPNorthDakotas_ClaimCost_Reimbursement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP NorthDakota");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPNorthDakotas_ClaimCost_Vocational() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP NorthDakota");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPNorthDakotas_ExpenseAO_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP NorthDakota");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPNorthDakotas_ExpenseAO_Casemanagement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP NorthDakota");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPNorthDakotas_ExpenseAO_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP NorthDakota");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPNorthDakotas_ExpenseDCC_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP NorthDakota");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_1();
		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPNorthDakotas_ExpenseDCC_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP NorthDakota");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_1();
		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	// ------------------------------------------------------------------------------------------

	@Test
	public void AUT_PIPOregons_UnspecifiedCostType_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Oregon");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPOregons_UnspecifiedCostType_Burialexpenses() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Oregon");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPOregons_UnspecifiedCostType_Casemanagement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Oregon");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPOregons_UnspecifiedCostType_Deathbenefits() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Oregon");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPOregons_UnspecifiedCostType_Emergencyservices() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Oregon");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPOregons_UnspecifiedCostType_Lostwages() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Oregon");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPOregons_UnspecifiedCostType_Medical() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Oregon");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPOregons_UnspecifiedCostType_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Oregon");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPOregons_UnspecifiedCostType_Reimbursement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Oregon");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPOregons_UnspecifiedCostType_Vocational() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Oregon");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}
	// ------------------------------------------------------------------------------------------------------------
}
