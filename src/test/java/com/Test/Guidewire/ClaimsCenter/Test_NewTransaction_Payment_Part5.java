package com.Test.Guidewire.ClaimsCenter;

import org.testng.annotations.Test;

import com.pages.Guidewire.ClaimsCenter.CC_Exposure;
import com.pages.Guidewire.ClaimsCenter.CC_Financials;
import com.pages.Guidewire.ClaimsCenter.CC_NewClaimWizard;
import com.pages.Guidewire.ClaimsCenter.CC_NewTransaction_Check;
import com.pages.Guidewire.ClaimsCenter.CC_Reserve;
import com.pages.Guidewire.ClaimsCenter.CC_Reusables;

public class Test_NewTransaction_Payment_Part5 {

	@Test
	public void AUT_PIPOregons_ClaimCost_UnspecifiedCostCategory() throws Throwable {
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
	public void AUT_PIPOregons_ClaimCost_Burialexpenses() throws Throwable {
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
	public void AUT_PIPOregons_ClaimCost_Deathbenefits() throws Throwable {
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
	public void AUT_PIPOregons_ClaimCost_Emergencyservices() throws Throwable {
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
	public void AUT_PIPOregons_ClaimCost_Lostwages() throws Throwable {
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
	public void AUT_PIPOregons_ClaimCost_Medical() throws Throwable {
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
	public void AUT_PIPOregons_ClaimCost_Other() throws Throwable {
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
	public void AUT_PIPOregons_ClaimCost_Reimbursement() throws Throwable {
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
	public void AUT_PIPOregons_ClaimCost_Vocational() throws Throwable {
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
	public void AUT_PIPOregons_ExpenseAO_UnspecifiedCostCategory() throws Throwable {
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
	public void AUT_PIPOregons_ExpenseAO_Casemanagement() throws Throwable {
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
	public void AUT_PIPOregons_ExpenseAO_Other() throws Throwable {
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
	public void AUT_PIPOregons_ExpenseDCC_UnspecifiedCostCategory() throws Throwable {
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
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_1();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPOregons_ExpenseDCC_Other() throws Throwable {
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
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_1();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	// -----------------------------------------------------------------------------------------------------------
	@Test

	public void AUT_Payment_PIPPennsylvanias_UnspecifiedCostType_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Pennsylvania");
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
	public void AUT_Payment_PIPPennsylvanias_UnspecifiedCostType_Burialexpenses() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Pennsylvania");
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
	public void AUT_Payment_PIPPennsylvanias_UnspecifiedCostType_Casemanagement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Pennsylvania");
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
	public void AUT_Payment_PIPPennsylvanias_UnspecifiedCostType_Deathbenefits() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Pennsylvania");
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
	public void AUT_Payment_PIPPennsylvanias_UnspecifiedCostType_Emergencyservices() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Pennsylvania");
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
	public void AUT_Payment_PIPPennsylvanias_UnspecifiedCostType_Lostwages() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Pennsylvania");
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
	public void AUT_Payment_PIPPennsylvanias_UnspecifiedCostType_Medical() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Pennsylvania");
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
	public void AUT_Payment_PIPPennsylvanias_UnspecifiedCostType_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Pennsylvania");
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
	public void AUT_Payment_PIPPennsylvanias_UnspecifiedCostType_Reimbursement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Pennsylvania");
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
	public void AUT_Payment_PIPPennsylvanias_UnspecifiedCostType_Vocational() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Pennsylvania");
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
	public void AUT_Payment_PIPPennsylvanias_ClaimCost_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Pennsylvania");
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
	public void AUT_Payment_PIPPennsylvanias_ClaimCost_Burialexpenses() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Pennsylvania");
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
	public void AUT_Payment_PIPPennsylvanias_ClaimCost_Deathbenefits() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Pennsylvania");
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
	public void AUT_Payment_PIPPennsylvanias_ClaimCost_Emergencyservices() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Pennsylvania");
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
	public void AUT_Payment_PIPPennsylvanias_ClaimCost_Lostwages() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Pennsylvania");
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
	public void AUT_Payment_PIPPennsylvanias_ClaimCost_Medical() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Pennsylvania");
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
	public void AUT_Payment_PIPPennsylvanias_ClaimCost_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Pennsylvania");
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
	public void AUT_Payment_PIPPennsylvanias_ClaimCost_Reimbursement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Pennsylvania");
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
	public void AUT_Payment_PIPPennsylvanias_ClaimCost_Vocational() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Pennsylvania");
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
	public void AUT_Payment_PIPPennsylvanias_ExpenseAO_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Pennsylvania");
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
	public void AUT_Payment_PIPPennsylvanias_ExpenseAO_Casemanagement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Pennsylvania");
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
	public void AUT_Payment_PIPPennsylvanias_ExpenseAO_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Pennsylvania");
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
	public void AUT_Payment_PIPPennsylvanias_ExpenseDCC_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Pennsylvania");
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
	public void AUT_Payment_PIPPennsylvanias_ExpenseDCC_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Pennsylvania");
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
	// -----------------------------------------------------------------------------------------------

	@Test

	public void AUT_Payment_PIPTexas_UnspecifiedCostType_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Texas");
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
	public void AUT_Payment_PIPTexas_UnspecifiedCostType_Burialexpenses() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Texas");
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
	public void AUT_Payment_PIPTexas_UnspecifiedCostType_Casemanagement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Texas");
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
	public void AUT_Payment_PIPTexas_UnspecifiedCostType_Deathbenefits() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Texas");
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
	public void AUT_Payment_PIPTexas_UnspecifiedCostType_Emergencyservices() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Texas");
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
	public void AUT_Payment_PIPTexas_UnspecifiedCostType_Lostwages() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Texas");
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
	public void AUT_Payment_PIPTexas_UnspecifiedCostType_Medical() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Texas");
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
	public void AUT_Payment_PIPTexas_UnspecifiedCostType_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Texas");
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
	public void AUT_Payment_PIPTexas_UnspecifiedCostType_Reimbursement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Texas");
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
	public void AUT_Payment_PIPTexas_UnspecifiedCostType_Vocational() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Texas");
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
	public void AUT_Payment_PIPTexas_ClaimCost_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Texas");
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
	public void AUT_Payment_PIPTexas_ClaimCost_Burialexpenses() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Texas");
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
	public void AUT_Payment_PIPTexas_ClaimCost_Deathbenefits() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Texas");
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
	public void AUT_Payment_PIPTexas_ClaimCost_Emergencyservices() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Texas");
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
	public void AUT_Payment_PIPTexas_ClaimCost_Lostwages() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Texas");
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
	public void AUT_Payment_PIPTexas_ClaimCost_Medical() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Texas");
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
	public void AUT_Payment_PIPTexas_ClaimCost_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Texas");
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
	public void AUT_Payment_PIPTexas_ClaimCost_Reimbursement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Texas");
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
	public void AUT_Payment_PIPTexas_ClaimCost_Vocational() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Texas");
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
	public void AUT_Payment_PIPTexas_ExpenseAO_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Texas");
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
	public void AUT_Payment_PIPTexas_ExpenseAO_Casemanagement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Texas");
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
	public void AUT_Payment_PIPTexas_ExpenseAO_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Texas");
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
	public void AUT_Payment_PIPTexas_ExpenseDCC_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Texas");
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
	public void AUT_Payment_PIPTexas_ExpenseDCC_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Texas");
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
	public void AUT_Payment_PIPUtah_UnspecifiedCostType_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Utah");
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
	public void AUT_Payment_PIPUtah_UnspecifiedCostType_Burialexpenses() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Utah");
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
	public void AUT_Payment_PIPUtah_UnspecifiedCostType_Casemanagement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Utah");
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
	public void AUT_Payment_PIPUtah_UnspecifiedCostType_Deathbenefits() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Utah");
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
	public void AUT_Payment_PIPUtah_UnspecifiedCostType_Emergencyservices() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Utah");
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
	public void AUT_Payment_PIPUtah_UnspecifiedCostType_Lostwages() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Utah");
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
	public void AUT_Payment_PIPUtah_UnspecifiedCostType_Medical() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Utah");
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
	public void AUT_Payment_PIPUtah_UnspecifiedCostType_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Utah");
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
	public void AUT_Payment_PIPUtah_UnspecifiedCostType_Reimbursement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Utah");
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
	public void AUT_Payment_PIPUtah_UnspecifiedCostType_Vocational() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Utah");
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
	public void AUT_Payment_PIPUtah_ClaimCost_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Utah");
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
	public void AUT_Payment_PIPUtah_ClaimCost_Burialexpenses() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Utah");
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
	public void AUT_Payment_PIPUtah_ClaimCost_Deathbenefits() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Utah");
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
	public void AUT_Payment_PIPUtah_ClaimCost_Emergencyservices() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Utah");
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
	public void AUT_Payment_PIPUtah_ClaimCost_Lostwages() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Utah");
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
	public void AUT_Payment_PIPUtah_ClaimCost_Medical() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Utah");
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
	public void AUT_Payment_PIPUtah_ClaimCost_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Utah");
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
	public void AUT_Payment_PIPUtah_ClaimCost_Reimbursement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Utah");
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
	public void AUT_Payment_PIPUtah_ClaimCost_Vocational() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Utah");
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
	public void AUT_Payment_PIPUtah_ExpenseAO_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Utah");
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
	public void AUT_Payment_PIPUtah_ExpenseAO_Casemanagement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Utah");
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
	public void AUT_Payment_PIPUtah_ExpenseAO_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Utah");
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
	public void AUT_Payment_PIPUtah_ExpenseDCC_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Utah");
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
	public void AUT_Payment_PIPUtah_ExpenseDCC_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Utah");
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

	// -------------------------------------------------------------------------------------------------
	@Test
	public void AUT_Payment_PIPWashington_UnspecifiedCostType_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Washington");
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
	public void AUT_Payment_PIPWashington_UnspecifiedCostType_Burialexpenses() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Washington");
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
	public void AUT_Payment_PIPWashington_UnspecifiedCostType_Casemanagement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Washington");
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
	public void AUT_Payment_PIPWashington_UnspecifiedCostType_Deathbenefits() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Washington");
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
	public void AUT_Payment_PIPWashington_UnspecifiedCostType_Emergencyservices() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Washington");
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
	public void AUT_Payment_PIPWashington_UnspecifiedCostType_Lostwages() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Washington");
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
	public void AUT_Payment_PIPWashington_UnspecifiedCostType_Medical() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Washington");
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
	public void AUT_Payment_PIPWashington_UnspecifiedCostType_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Washington");
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
	public void AUT_Payment_PIPWashington_UnspecifiedCostType_Reimbursement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Washington");
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
	public void AUT_Payment_PIPWashington_UnspecifiedCostType_Vocational() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Washington");
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
	public void AUT_Payment_PIPWashington_ClaimCost_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Washington");
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
	public void AUT_Payment_PIPWashington_ClaimCost_Burialexpenses() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Washington");
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
	public void AUT_Payment_PIPWashington_ClaimCost_Deathbenefits() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Washington");
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
	public void AUT_Payment_PIPWashington_ClaimCost_Emergencyservices() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Washington");
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
	public void AUT_Payment_PIPWashington_ClaimCost_Lostwages() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Washington");
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
	public void AUT_Payment_PIPWashington_ClaimCost_Medical() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Washington");
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
	public void AUT_Payment_PIPWashington_ClaimCost_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Washington");
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
	public void AUT_Payment_PIPWashington_ClaimCost_Reimbursement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Washington");
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
	public void AUT_Payment_PIPWashington_ClaimCost_Vocational() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Washington");
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
	public void AUT_Payment_PIPWashington_ExpenseAO_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Washington");
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
	public void AUT_Payment_PIPWashington_ExpenseAO_Casemanagement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Washington");
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
	public void AUT_Payment_PIPWashington_ExpenseAO_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Washington");
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
	public void AUT_Payment_PIPWashington_ExpenseDCC_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Washington");
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
	public void AUT_Payment_PIPWashington_ExpenseDCC_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Washington");
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

	public void AUT_PropertyProtectionInsurance_UnspecifiedCostType_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Property Protection Insurance");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("PropertyNewIncident");
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
	public void AUT_PropertyProtectionInsurance_UnspecifiedCostType_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Property Protection Insurance");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("PropertyNewIncident");
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
	public void AUT_PropertyProtectionInsurance_UnspecifiedCostType_Reimbursement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Property Protection Insurance");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("PropertyNewIncident");
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
	public void AUT_PropertyProtectionInsurance_UnspecifiedCostType_Salvage() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Property Protection Insurance");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("PropertyNewIncident");
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
	public void AUT_PropertyProtectionInsurance_UnspecifiedCostType_Settlement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Property Protection Insurance");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("PropertyNewIncident");
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
	public void AUT_PropertyProtectionInsurance_UnspecifiedCostType_Vehicleappraisal() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Property Protection Insurance");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("PropertyNewIncident");
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
	public void AUT_PropertyProtectionInsurance_ClaimCost_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Property Protection Insurance");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("PropertyNewIncident");
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
	public void AUT_PropertyProtectionInsurance_ClaimCost_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Property Protection Insurance");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("PropertyNewIncident");
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
	public void AUT_PropertyProtectionInsurance_ClaimCost_Reimbursement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Property Protection Insurance");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("PropertyNewIncident");
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
	public void AUT_PropertyProtectionInsurance_ClaimCost_Settlement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Property Protection Insurance");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("PropertyNewIncident");
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
	public void AUT_PropertyProtectionInsurance_ExpenseAO_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Property Protection Insurance");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("PropertyNewIncident");
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
	public void AUT_PropertyProtectionInsurance_ExpenseAO_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Property Protection Insurance");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("PropertyNewIncident");
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
	public void AUT_PropertyProtectionInsurance_ExpenseAO_Salvage() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Property Protection Insurance");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("PropertyNewIncident");
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
	public void AUT_PropertyProtectionInsurance_ExpenseAO_Vehicleappraisal() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Property Protection Insurance");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("PropertyNewIncident");
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
	public void AUT_PropertyProtectionInsurance_ExpenseDCC_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Property Protection Insurance");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("PropertyNewIncident");
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
	public void AUT_PropertyProtectionInsurance_ExpenseDCC_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Property Protection Insurance");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("PropertyNewIncident");
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
	public void AUT_UnderinsuredMotorist_BodilyInjury_UnspecifiedCostType_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Underinsured Motorist Bodily Injury");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");
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
	public void AUT_UnderinsuredMotorist_BodilInjury_UnspecifiedCostType_Burialexpenses() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Underinsured Motorist Bodily Injury");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");
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
	public void AUT_UnderinsuredMotorist_BodilInjury_UnspecifiedCostType_Deathbenefits() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Underinsured Motorist Bodily Injury");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");
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
	public void AUT_UnderinsuredMotorist_BodilInjury_UnspecifiedCostType_Emergencyservices() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Underinsured Motorist Bodily Injury");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");
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
	public void AUT_UnderinsuredMotorist_BodilInjury_UnspecifiedCostType_Legal() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Underinsured Motorist Bodily Injury");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");
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
	public void AUT_UnderinsuredMotorist_BodilInjury_UnspecifiedCostType_Lifetimebenefits() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Underinsured Motorist Bodily Injury");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");
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
	public void AUT_UnderinsuredMotorist_BodilInjury_UnspecifiedCostType_Lostwages() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Underinsured Motorist Bodily Injury");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");
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
	public void AUT_UnderinsuredMotorist_BodilInjury_UnspecifiedCostType_Medical() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Underinsured Motorist Bodily Injury");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");
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
	public void AUT_UnderinsuredMotorist_BodilInjury_UnspecifiedCostType_Mileagereimbusment() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Underinsured Motorist Bodily Injury");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");
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
	public void AUT_UnderinsuredMotorist_BodilInjury_UnspecifiedCostType_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Underinsured Motorist Bodily Injury");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");
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
	public void AUT_UnderinsuredMotorist_BodilInjury_UnspecifiedCostType_Reimbursement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Underinsured Motorist Bodily Injury");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");
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
	public void AUT_UnderinsuredMotorist_BodilInjury_UnspecifiedCostType_Settlement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Underinsured Motorist Bodily Injury");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");
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
	public void AUT_UnderinsuredMotorist_BodilInjury_UnspecifiedCostType_Vocational() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Underinsured Motorist Bodily Injury");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");
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
	public void AUT_UnderinsuredMotorist_BodilInjury_ClaimCost_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Underinsured Motorist Bodily Injury");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");
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
	public void AUT_UnderinsuredMotorist_BodilInjury_ClaimCost_Burialexpenses() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Underinsured Motorist Bodily Injury");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");
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
	public void AUT_UnderinsuredMotorist_BodilInjury_ClaimCost_Deathbenefits() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Underinsured Motorist Bodily Injury");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");
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
	public void AUT_UnderinsuredMotorist_BodilInjury_ClaimCost_Emergencyservices() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Underinsured Motorist Bodily Injury");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");
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
	public void AUT_UnderinsuredMotorist_BodilInjury_ClaimCost_Legal() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Underinsured Motorist Bodily Injury");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");
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
	public void AUT_UnderinsuredMotorist_BodilInjury_ClaimCost_Lifetimebenefits() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Underinsured Motorist Bodily Injury");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");
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
	public void AUT_UnderinsuredMotorist_BodilInjury_ClaimCost_Lostwages() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Underinsured Motorist Bodily Injury");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");
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
	public void AUT_UnderinsuredMotorist_BodilInjury_ClaimCost_Medical() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Underinsured Motorist Bodily Injury");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");
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
	public void AUT_UnderinsuredMotorist_BodilInjury_ClaimCost_Mileagereimbusment() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Underinsured Motorist Bodily Injury");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");
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
	public void AUT_UnderinsuredMotorist_BodilInjury_ClaimCost_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Underinsured Motorist Bodily Injury");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");
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
	public void AUT_UnderinsuredMotorist_BodilInjury_ClaimCost_Reimbursement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Underinsured Motorist Bodily Injury");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");
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
	public void AUT_UnderinsuredMotorist_BodilInjury_ClaimCost_Settlement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Underinsured Motorist Bodily Injury");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");
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
	public void AUT_UnderinsuredMotorist_BodilInjury_ClaimCost_Vocational() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Underinsured Motorist Bodily Injury");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");
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
	public void AUT_UnderinsuredMotorist_BodilInjury_ExpenseAO_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Underinsured Motorist Bodily Injury");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");
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
	public void AUT_UnderinsuredMotorist_BodilInjury_ExpenseAO_Legal() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Underinsured Motorist Bodily Injury");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");
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
	public void AUT_UnderinsuredMotorist_BodilInjury_ExpenseAO_Mileagereimbusment() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Underinsured Motorist Bodily Injury");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");
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
	public void AUT_UnderinsuredMotorist_BodilInjury_ExpenseAO_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Underinsured Motorist Bodily Injury");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");
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
	public void AUT_UnderinsuredMotorist_BodilInjury_ExpenseDCC_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Underinsured Motorist Bodily Injury");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");
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
	public void AUT_UnderinsuredMotorist_BodilInjury_ExpenseDCC_Legal() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Underinsured Motorist Bodily Injury");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");
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
	public void AUT_UnderinsuredMotorist_BodilInjury_ExpenseDCC_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Underinsured Motorist Bodily Injury");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");
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
	public void AUT_UnderinsuredMotoristPropertyDamage_UnspecifiedCostType_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Underinsured Motorist Property Damage");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("VehicleEditIncident");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();
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
	public void AUT_UnderinsuredMotoristPropertyDamage_UnspecifiedCostType_AutoBody() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Underinsured Motorist Property Damage");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("VehicleEditIncident");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();
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
	public void AUT_UnderinsuredMotoristPropertyDamage_UnspecifiedCostType_AutoParts() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Underinsured Motorist Property Damage");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("VehicleEditIncident");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();
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
	public void AUT_UnderinsuredMotoristPropertyDamage_UnspecifiedCostType_Glass() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Underinsured Motorist Property Damage");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("VehicleEditIncident");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();
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
	public void AUT_UnderinsuredMotoristPropertyDamage_UnspecifiedCostType_Labor() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Underinsured Motorist Property Damage");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("VehicleEditIncident");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();
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
	public void AUT_UnderinsuredMotoristPropertyDamage_UnspecifiedCostType_Legal() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Underinsured Motorist Property Damage");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("VehicleEditIncident");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();
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
	public void AUT_UnderinsuredMotoristPropertyDamage_UnspecifiedCostType_Mileagereimbusment() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Underinsured Motorist Property Damage");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("VehicleEditIncident");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();
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
	public void AUT_UnderinsuredMotoristPropertyDamage_UnspecifiedCostType_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Underinsured Motorist Property Damage");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("VehicleEditIncident");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();
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
	public void AUT_UnderinsuredMotoristPropertyDamage_UnspecifiedCostType_Reimbursement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Underinsured Motorist Property Damage");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("VehicleEditIncident");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();
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
	public void AUT_UnderinsuredMotoristPropertyDamage_UnspecifiedCostType_Rental() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Underinsured Motorist Property Damage");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("VehicleEditIncident");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();
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
	public void AUT_UnderinsuredMotoristPropertyDamage_UnspecifiedCostType_Salvage() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Underinsured Motorist Property Damage");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("VehicleEditIncident");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();
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
	public void AUT_UnderinsuredMotoristPropertyDamage_UnspecifiedCostType_Settlement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Underinsured Motorist Property Damage");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("VehicleEditIncident");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();
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
	public void AUT_UnderinsuredMotoristPropertyDamage_UnspecifiedCostType_Supplementalearnings() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Underinsured Motorist Property Damage");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("VehicleEditIncident");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();
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
	public void AUT_UnderinsuredMotoristPropertyDamage_UnspecifiedCostType_Towing() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Underinsured Motorist Property Damage");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("VehicleEditIncident");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();
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
	public void AUT_UnderinsuredMotoristPropertyDamage_UnspecifiedCostType_VehicleAppraisal() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Underinsured Motorist Property Damage");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("VehicleEditIncident");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();
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
	public void AUT_UnderinsuredMotoristPropertyDamage_UnspecifiedCostType_Vehicleinspection() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Underinsured Motorist Property Damage");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("VehicleEditIncident");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();
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
	public void AUT_UnderinsuredMotoristPropertyDamage_ClaimCost_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Underinsured Motorist Property Damage");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("VehicleEditIncident");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();
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
	public void AUT_UnderinsuredMotoristPropertyDamage_ClaimCost_Autoparts() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Underinsured Motorist Property Damage");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("VehicleEditIncident");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();
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
	public void AUT_UnderinsuredMotoristPropertyDamage_ClaimCost_Glass() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Underinsured Motorist Property Damage");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("VehicleEditIncident");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();
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
	public void AUT_UnderinsuredMotoristPropertyDamage_ClaimCost_Labor() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Underinsured Motorist Property Damage");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("VehicleEditIncident");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();
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
	public void AUT_UnderinsuredMotoristPropertyDamage_ClaimCost_Legal() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Underinsured Motorist Property Damage");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("VehicleEditIncident");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();
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
	public void AUT_UnderinsuredMotoristPropertyDamage_ClaimCost_Mileagereimbusment() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Underinsured Motorist Property Damage");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("VehicleEditIncident");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();
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
	public void AUT_UnderinsuredMotoristPropertyDamage_ClaimCost_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Underinsured Motorist Property Damage");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("VehicleEditIncident");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();
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
	public void AUT_UnderinsuredMotoristPropertyDamage_ClaimCost_Reimbursement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Underinsured Motorist Property Damage");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("VehicleEditIncident");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();
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
	public void AUT_UnderinsuredMotoristPropertyDamage_ClaimCost_Rental() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Underinsured Motorist Property Damage");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("VehicleEditIncident");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();
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
	public void AUT_UnderinsuredMotoristPropertyDamage_ClaimCost_Settlement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Underinsured Motorist Property Damage");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("VehicleEditIncident");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();
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
	public void AUT_UnderinsuredMotoristPropertyDamage_ClaimCost_Supplementalearnings() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Underinsured Motorist Property Damage");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("VehicleEditIncident");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();
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
	public void AUT_UnderinsuredMotoristPropertyDamage_ClaimCost_Towing() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Underinsured Motorist Property Damage");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("VehicleEditIncident");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();
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
	public void AUT_UnderinsuredMotoristPropertyDamage_ClaimCost_Vehicleinspection() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Underinsured Motorist Property Damage");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("VehicleEditIncident");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();
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
	public void AUT_UnderinsuredMotoristPropertyDamage_ExpenseAO_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Underinsured Motorist Property Damage");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("VehicleEditIncident");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();
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
	public void AUT_UnderinsuredMotoristPropertyDamage_ExpenseAO_Legal() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Underinsured Motorist Property Damage");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("VehicleEditIncident");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();
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
	public void AUT_UnderinsuredMotoristPropertyDamage_ExpenseAO_Mileagereimbusment() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Underinsured Motorist Property Damage");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("VehicleEditIncident");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();
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
	public void AUT_UnderinsuredMotoristPropertyDamage_ExpenseAO_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Underinsured Motorist Property Damage");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("VehicleEditIncident");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();
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
	public void AUT_UnderinsuredMotoristPropertyDamage_ExpenseAO_Salvage() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Underinsured Motorist Property Damage");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("VehicleEditIncident");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();
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
	public void AUT_UnderinsuredMotoristPropertyDamage_ExpenseAO_Vehicleappraisal() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Underinsured Motorist Property Damage");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("VehicleEditIncident");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();
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
	public void AUT_UnderinsuredMotoristPropertyDamage_ExpenseDCC_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Underinsured Motorist Property Damage");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("VehicleEditIncident");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_1();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_UnderinsuredMotoristPropertyDamage_ExpenseDCC_Legal() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Underinsured Motorist Property Damage");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("VehicleEditIncident");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_1();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_UnderinsuredMotoristPropertyDamage_ExpenseDCC_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Underinsured Motorist Property Damage");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("VehicleEditIncident");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_1();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_UnderinsuredMotoristPropertyDamage_ExpenseDCC_Vehicleinspection() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Underinsured Motorist Property Damage");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("VehicleEditIncident");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();
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
	public void AUT_UninsuredMotoristBodilyInjury_UnspecifiedCostType_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Uninsured Motorist Bodily Injury");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");
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
	public void AUT_UninsuredMotoristBodilyInjury_UnspecifiedCostType_Burialexpenses() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Uninsured Motorist Bodily Injury");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");
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
	public void AUT_UninsuredMotoristBodilyInjury_UnspecifiedCostType_Deathbenefits() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Uninsured Motorist Bodily Injury");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");
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
	public void AUT_UninsuredMotoristBodilyInjury_UnspecifiedCostType_Emergencyservices() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Uninsured Motorist Bodily Injury");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");
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
	public void AUT_UninsuredMotoristBodilyInjury_UnspecifiedCostType_Legal() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Uninsured Motorist Bodily Injury");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");
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
	public void AUT_UninsuredMotoristBodilyInjury_UnspecifiedCostType_Lifetimebenefits() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Uninsured Motorist Bodily Injury");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");
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
	public void AUT_UninsuredMotoristBodilyInjury_UnspecifiedCostType_Lostwages() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Uninsured Motorist Bodily Injury");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");
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
	public void AUT_UninsuredMotoristBodilyInjury_UnspecifiedCostType_Medical() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Uninsured Motorist Bodily Injury");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");
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
	public void AUT_UninsuredMotoristBodilyInjury_UnspecifiedCostType_Mileagereimbusment() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Uninsured Motorist Bodily Injury");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");
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
	public void AUT_UninsuredMotoristBodilyInjury_UnspecifiedCostType_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Uninsured Motorist Bodily Injury");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");
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
	public void AUT_UninsuredMotoristBodilyInjury_UnspecifiedCostType_Reimbursement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Uninsured Motorist Bodily Injury");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");
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
	public void AUT_UninsuredMotoristBodilyInjury_UnspecifiedCostType_Settlement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Uninsured Motorist Bodily Injury");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");
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
	public void AUT_UninsuredMotoristBodilyInjury_UnspecifiedCostType_Vocational() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Uninsured Motorist Bodily Injury");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");
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
	public void AUT_UninsuredMotoristBodilyInjury_ClaimCost_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Uninsured Motorist Bodily Injury");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");
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
	public void AUT_UninsuredMotoristBodilyInjury_ClaimCost_Burialexpenses() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Uninsured Motorist Bodily Injury");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");
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
	public void AUT_UninsuredMotoristBodilyInjury_ClaimCost_Deathbenefits() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Uninsured Motorist Bodily Injury");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");
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
	public void AUT_UninsuredMotoristBodilyInjury_ClaimCost_Emergencyservices() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Uninsured Motorist Bodily Injury");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");
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
	public void AUT_UninsuredMotoristBodilyInjury_ClaimCost_Legal() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Uninsured Motorist Bodily Injury");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");
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
	public void AUT_UninsuredMotoristBodilyInjury_ClaimCost_Lifetimebenefits() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Uninsured Motorist Bodily Injury");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");
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
	public void AUT_UninsuredMotoristBodilyInjury_ClaimCost_Lostwages() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Uninsured Motorist Bodily Injury");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");
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
	public void AUT_UninsuredMotoristBodilyInjury_ClaimCost_Medical() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Uninsured Motorist Bodily Injury");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");
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
	public void AUT_UninsuredMotoristBodilyInjury_ClaimCost_Mileagereimbusment() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Uninsured Motorist Bodily Injury");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");
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
	public void AUT_UninsuredMotoristBodilyInjury_ClaimCost_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Uninsured Motorist Bodily Injury");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");
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
	public void AUT_UninsuredMotoristBodilyInjury_ClaimCost_Reimbursement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Uninsured Motorist Bodily Injury");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");
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
	public void AUT_UninsuredMotoristBodilyInjury_ClaimCost_Settlement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Uninsured Motorist Bodily Injury");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");
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
	public void AUT_UninsuredMotoristBodilyInjury_ClaimCost_Vocational() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Uninsured Motorist Bodily Injury");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");
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
	public void AUT_UninsuredMotoristBodilyInjury_ExpenseAO_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Uninsured Motorist Bodily Injury");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");
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
	public void AUT_UninsuredMotoristBodilyInjury_ExpenseAO_Legal() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Uninsured Motorist Bodily Injury");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");
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
	public void AUT_UninsuredMotoristBodilyInjury_ExpenseAO_Mileagereimbusment() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Uninsured Motorist Bodily Injury");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");
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
	public void AUT_UninsuredMotoristBodilyInjury_ExpenseAO_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Uninsured Motorist Bodily Injury");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");
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
	public void AUT_UninsuredMotoristBodilyInjury_ExpenseDCC_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Uninsured Motorist Bodily Injury");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");
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
	public void AUT_UninsuredMotoristBodilyInjury_ExpenseDCC_Legal() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Uninsured Motorist Bodily Injury");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");
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
	public void AUT_UninsuredMotoristBodilyInjury_ExpenseDCC_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Uninsured Motorist Bodily Injury");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");
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

	// -------------------------------------------------------------------------------------------------------------------
	@Test
	public void AUT_Payment_UninsuredMotoristPropertyDamage_UnspecifiedCostType_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage ->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Uninsured Motorist Property Damage");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("VehicleEditIncident");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();
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
	public void AUT_Payment_UninsuredMotoristPropertyDamage_UnspecifiedCostType_Autobody() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage ->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Uninsured Motorist Property Damage");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("VehicleEditIncident");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();
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
	public void AUT_Payment_UninsuredMotoristPropertyDamage_UnspecifiedCostType_AutoParts() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage ->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Uninsured Motorist Property Damage");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("VehicleEditIncident");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();
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
	public void AUT_Payment_UninsuredMotoristPropertyDamage_UnspecifiedCostType_Glass() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage ->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Uninsured Motorist Property Damage");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("VehicleEditIncident");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();
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
	public void AUT_Payment_UninsuredMotoristPropertyDamage_UnspecifiedCostType_Labor() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage ->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Uninsured Motorist Property Damage");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("VehicleEditIncident");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();
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
	public void AUT_Payment_UninsuredMotoristPropertyDamage_UnspecifiedCostType_Legal() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage ->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Uninsured Motorist Property Damage");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("VehicleEditIncident");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();
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
	public void AUT_Payment_UninsuredMotoristPropertyDamage_UnspecifiedCostType_MileageReimbursement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage ->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Uninsured Motorist Property Damage");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("VehicleEditIncident");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();
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
	public void AUT_Payment_UninsuredMotoristPropertyDamage_UnspecifiedCostType_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage ->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Uninsured Motorist Property Damage");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("VehicleEditIncident");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();
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
	public void AUT_Payment_UninsuredMotoristPropertyDamage_UnspecifiedCostType_Reimbursement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage ->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Uninsured Motorist Property Damage");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("VehicleEditIncident");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();
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
	public void AUT_Payment_UninsuredMotoristPropertyDamage_UnspecifiedCostType_Rental() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage ->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Uninsured Motorist Property Damage");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("VehicleEditIncident");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();
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
	public void AUT_Payment_UninsuredMotoristPropertyDamage_UnspecifiedCostType_Salvage() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage ->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Uninsured Motorist Property Damage");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("VehicleEditIncident");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();
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
	public void AUT_Payment_UninsuredMotoristPropertyDamage_UnspecifiedCostType_Settlement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage ->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Uninsured Motorist Property Damage");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("VehicleEditIncident");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();
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
	public void AUT_Payment_UninsuredMotoristPropertyDamage_UnspecifiedCostType_SupplementalEarnings() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage ->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Uninsured Motorist Property Damage");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("VehicleEditIncident");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();
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
	public void AUT_Payment_UninsuredMotoristPropertyDamage_UnspecifiedCostType_Towing() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage ->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Uninsured Motorist Property Damage");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("VehicleEditIncident");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();
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
	public void AUT_Payment_UninsuredMotoristPropertyDamage_UnspecifiedCostType_VehicleAppraisal() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage ->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Uninsured Motorist Property Damage");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("VehicleEditIncident");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();
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
	public void AUT_Payment_UninsuredMotoristPropertyDamage_UnspecifiedCostType_VehicleInspection() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage ->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Uninsured Motorist Property Damage");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("VehicleEditIncident");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();
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
	public void AUT_Payment_UninsuredMotoristPropertyDamage_ClaimCost_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage ->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Uninsured Motorist Property Damage");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("VehicleEditIncident");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();
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
	public void AUT_Payment_UninsuredMotoristPropertyDamage_ClaimCost_AutoParts() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage ->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Uninsured Motorist Property Damage");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("VehicleEditIncident");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();
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
	public void AUT_Payment_UninsuredMotoristPropertyDamage_ClaimCost_Glass() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage ->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Uninsured Motorist Property Damage");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("VehicleEditIncident");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();
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
	public void AUT_Payment_UninsuredMotoristPropertyDamage_ClaimCost_Labor() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage ->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Uninsured Motorist Property Damage");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("VehicleEditIncident");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();
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
	public void AUT_Payment_UninsuredMotoristPropertyDamage_ClaimCost_Legal() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage ->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Uninsured Motorist Property Damage");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("VehicleEditIncident");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();
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
	public void AUT_Payment_UninsuredMotoristPropertyDamage_ClaimCost_MileageReimbursement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage ->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Uninsured Motorist Property Damage");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("VehicleEditIncident");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();
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
	public void AUT_Payment_UninsuredMotoristPropertyDamage_ClaimCost_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage ->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Uninsured Motorist Property Damage");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("VehicleEditIncident");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();
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
	public void AUT_Payment_UninsuredMotoristPropertyDamage_ClaimCost_Reimbursement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage ->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Uninsured Motorist Property Damage");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("VehicleEditIncident");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();
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
	public void AUT_Payment_UninsuredMotoristPropertyDamage_ClaimCost_Rental() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage ->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Uninsured Motorist Property Damage");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("VehicleEditIncident");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();
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
	public void AUT_Payment_UninsuredMotoristPropertyDamage_ClaimCost_Settlement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage ->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Uninsured Motorist Property Damage");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("VehicleEditIncident");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();
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
	public void AUT_Payment_UninsuredMotoristPropertyDamage_ClaimCost_SupplementalEarnings() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage ->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Uninsured Motorist Property Damage");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("VehicleEditIncident");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();
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
	public void AUT_Payment_UninsuredMotoristPropertyDamage_ClaimCost_Towing() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage ->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Uninsured Motorist Property Damage");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("VehicleEditIncident");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();
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
	public void AUT_Payment_UninsuredMotoristPropertyDamage_ClaimCost_VehicleInspection() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage ->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Uninsured Motorist Property Damage");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("VehicleEditIncident");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();
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
	public void AUT_Payment_UninsuredMotoristPropertyDamage_ExpenseAO_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage ->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Uninsured Motorist Property Damage");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("VehicleEditIncident");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();
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
	public void AUT_Payment_UninsuredMotoristPropertyDamage_ExpenseAO_Legal() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage ->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Uninsured Motorist Property Damage");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("VehicleEditIncident");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();
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
	public void AUT_Payment_UninsuredMotoristPropertyDamage_ExpenseAO_MileageReimbursement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage ->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Uninsured Motorist Property Damage");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("VehicleEditIncident");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();
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
	public void AUT_Payment_UninsuredMotoristPropertyDamage_ExpenseAO_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage ->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Uninsured Motorist Property Damage");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("VehicleEditIncident");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();
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
	public void AUT_Payment_UninsuredMotoristPropertyDamage_ExpenseAO_Salvage() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage ->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Uninsured Motorist Property Damage");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("VehicleEditIncident");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();
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
	public void AUT_Payment_UninsuredMotoristPropertyDamage_ExpenseAO_VehicleAppraisal() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage ->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Uninsured Motorist Property Damage");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("VehicleEditIncident");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();
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
	public void AUT_Payment_UninsuredMotoristPropertyDamage_ExpenseDCC_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage ->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Uninsured Motorist Property Damage");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("VehicleEditIncident");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_1();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_UninsuredMotoristPropertyDamage_ExpenseDCC_Legal() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage ->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Uninsured Motorist Property Damage");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("VehicleEditIncident");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_1();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_UninsuredMotoristPropertyDamage_ExpenseDCC_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage ->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Uninsured Motorist Property Damage");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("VehicleEditIncident");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_1();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_UninsuredMotoristPropertyDamage_ExpenseDCC_VehicleInspection() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage ->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Uninsured Motorist Property Damage");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("VehicleEditIncident");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_1();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}
	// --------------------------------------------------------------------------------------------------------------

	@Test
	public void AUT_TapeDiscMedia_UnspecifiedCostType_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Tape Disc Media");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("AddingExposureDescription");
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
	public void AUT_TapeDiscMedia_UnspecifiedCostType_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Tape Disc Media");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("AddingExposureDescription");
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
	public void AUT_TapeDiscMedia_UnspecifiedCostType_Reimbursement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Tape Disc Media");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("AddingExposureDescription");
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
	public void AUT_TapeDiscMedia_UnspecifiedCostType_Settlement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Tape Disc Media");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("AddingExposureDescription");
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
	public void AUT_TapeDiscMedia_UnspecifiedCostType_Vehicleinspection() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Tape Disc Media");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("AddingExposureDescription");
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
	public void AUT_TapeDiscMedia_ClaimCost_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Tape Disc Media");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("AddingExposureDescription");
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
	public void AUT_TapeDiscMedia_ClaimCost_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Tape Disc Media");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("AddingExposureDescription");
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
	public void AUT_TapeDiscMedia_ClaimCost_Reimbursement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Tape Disc Media");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("AddingExposureDescription");
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
	public void AUT_TapeDiscMedia_ClaimCost_Settlement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Tape Disc Media");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("AddingExposureDescription");
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
	public void AUT_TapeDiscMedia_ClaimCost_Vehicleinspection() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Tape Disc Media");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("AddingExposureDescription");
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
	public void AUT_TapeDiscMedia_ExpenseAO_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Tape Disc Media");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("AddingExposureDescription");
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
	public void AUT_TapeDiscMedia_ExpenseA0_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Tape Disc Media");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("AddingExposureDescription");
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
	public void AUT_TapeDiscMedia_ExpenseA0_Vehicleinspection() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Tape Disc Media");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("AddingExposureDescription");
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
	public void AUT_TapeDiscMedia_ExpenseDCC_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Tape Disc Media");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("AddingExposureDescription");
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
	public void AUT_TapeDiscMedia_ExpenseDCC_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Tape Disc Media");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("AddingExposureDescription");
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
	public void AUT_TapeDiscMedia_ExpenseDCC_Vehicleinspection() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Tape Disc Media");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("AddingExposureDescription");
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

}
