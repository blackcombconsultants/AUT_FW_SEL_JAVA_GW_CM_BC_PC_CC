package com.Test.Guidewire.ClaimsCenter;

import org.testng.annotations.Test;

import com.pages.Guidewire.ClaimsCenter.CC_ChooseCoverage;
import com.pages.Guidewire.ClaimsCenter.CC_Exposure;
import com.pages.Guidewire.ClaimsCenter.CC_Financials;
import com.pages.Guidewire.ClaimsCenter.CC_NewClaimWizard;
import com.pages.Guidewire.ClaimsCenter.CC_NewTransaction_Check;
import com.pages.Guidewire.ClaimsCenter.CC_Reserve;
import com.pages.Guidewire.ClaimsCenter.CC_Reusables;

public class Test_NewTransaction_Payment_Part1 {

	@Test

	public void AUT_Payment_Collision_UnspecifiedCostType_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully .
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test

	public void AUT_Payment_Collision_UnspecifiedCostType_Autobody() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test

	public void AUT_Payment_Collision_UnspecifiedCostType_Autoparts() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem
		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test

	public void AUT_Payment_Collision_UnspecifiedCostType_Glass() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test

	public void AUT_Payment_Collision_UnspecifiedCostType_Labor() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test

	public void AUT_Payment_Collision_UnspecifiedCostType_Legal() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test

	public void AUT_Payment_Collision_UnspecifiedCostType_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test

	public void AUT_Payment_Collision_UnspecifiedCostType_Reimbursement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test

	public void AUT_Payment_Collision_UnspecifiedCostType_Rental() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test

	public void AUT_Payment_Collision_UnspecifiedCostType_Salvage() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test

	public void AUT_Payment_Collision_UnspecifiedCostType_Settlement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test

	public void AUT_Payment_Collision_UnspecifiedCostType_Towing() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test

	public void AUT_Payment_Collision_UnspecifiedCostType_Vehicleappraisal() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test

	public void AUT_Payment_Collision_UnspecifiedCostType_Vehicleinspection() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test

	public void AUT_Payment_Collision_ClaimCost_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_NewTransaction_Check.ValidationResults_ClaimCost();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_NewTransaction_Check.ValidationResults_ClaimCost();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test

	public void AUT_Payment_Collision_ClaimCost_Autoparts() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_NewTransaction_Check.ValidationResults_ClaimCost();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_NewTransaction_Check.ValidationResults_ClaimCost();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test

	public void AUT_Payment_Collision_ClaimCost_Glass() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_NewTransaction_Check.ValidationResults_ClaimCost();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_NewTransaction_Check.ValidationResults_ClaimCost();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test

	public void AUT_Payment_Collision_ClaimCost_Labor() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_NewTransaction_Check.ValidationResults_ClaimCost();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_NewTransaction_Check.ValidationResults_ClaimCost();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test

	public void AUT_Payment_Collision_ClaimCost_Legal() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_NewTransaction_Check.ValidationResults_ClaimCost();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_NewTransaction_Check.ValidationResults_ClaimCost();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test

	public void AUT_Payment_Collision_ClaimCost_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_NewTransaction_Check.ValidationResults_ClaimCost();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_NewTransaction_Check.ValidationResults_ClaimCost();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test

	public void AUT_Payment_Collision_ClaimCost_Reimbursement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem
		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_NewTransaction_Check.ValidationResults_ClaimCost();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_NewTransaction_Check.ValidationResults_ClaimCost();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test

	public void AUT_Payment_Collision_ClaimCost_Rental() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_NewTransaction_Check.ValidationResults_ClaimCost();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_NewTransaction_Check.ValidationResults_ClaimCost();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test

	public void AUT_Payment_Collision_ClaimCost_Settlement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_NewTransaction_Check.ValidationResults_ClaimCost();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_NewTransaction_Check.ValidationResults_ClaimCost();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_2();
		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test

	public void AUT_Payment_Collision_ClaimCost_Towing() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_NewTransaction_Check.ValidationResults_ClaimCost();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_NewTransaction_Check.ValidationResults_ClaimCost();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test

	public void AUT_Payment_Collision_ClaimCost_Vehicleinspection() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_NewTransaction_Check.ValidationResults_ClaimCost();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_NewTransaction_Check.ValidationResults_ClaimCost();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test

	public void AUT_Payment_Collision_ExpenseAO_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test

	public void AUT_Payment_Collision_ExpenseAO_Legal() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem
		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test

	public void AUT_Payment_Collision_ExpenseAO_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test

	public void AUT_Payment_Collision_ExpenseAO_Salvage() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test

	public void AUT_Payment_Collision_ExpenseAO_Vehicleappraisal() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test

	public void AUT_Payment_Collision_ExpenseDCC_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
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

	public void AUT_Payment_Collision_ExpenseDCC_Legal() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
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

	public void AUT_Payment_Collision_ExpenseDCC_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
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

	public void AUT_Payment_Collision_ExpenseDCC_Vehicleinspection() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
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

	// -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	@Test

	public void AUT_Payment_Comprehensive_UnspecifiedCostType_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();

	}

	@Test

	public void AUT_Payment_Comprehensive_UnspecifiedCostType_Autobody() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test

	public void AUT_Payment_Comprehensive_UnspecifiedCostType_Autoparts() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test

	public void AUT_Payment_Comprehensive_UnspecifiedCostType_Glass() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();

	}

	@Test

	public void AUT_Payment_Comprehensive_UnspecifiedCostType_Labor() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();

	}

	@Test

	public void AUT_Payment_Comprehensive_UnspecifiedCostType_Legal() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();

	}

	@Test

	public void AUT_Payment_Comprehensive_UnspecifiedCostType_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test

	public void AUT_Payment_Comprehensive_UnspecifiedCostType_Reimbursement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test

	public void AUT_Payment_Comprehensive_UnspecifiedCostType_Rental() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test

	public void AUT_Payment_Comprehensive_UnspecifiedCostType_Salvage() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test

	public void AUT_Payment_Comprehensive_UnspecifiedCostType_Settlement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test

	public void AUT_Payment_Comprehensive_UnspecifiedCostType_Towing() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem
		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test

	public void AUT_Payment_Comprehensive_UnspecifiedCostType_Vehicleappraisal() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test

	public void AUT_Payment_Comprehensive_UnspecifiedCostType_Vehicleinspection() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test

	public void AUT_Payment_Comprehensive_ClaimCost_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_NewTransaction_Check.ValidationResults_ClaimCost();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_NewTransaction_Check.ValidationResults_ClaimCost();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test

	public void AUT_Payment_Comprehensive_ClaimCost_Autoparts() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_NewTransaction_Check.ValidationResults_ClaimCost();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_NewTransaction_Check.ValidationResults_ClaimCost();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();

	}

	@Test

	public void AUT_Payment_Comprehensive_ClaimCost_Glass() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem
		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_NewTransaction_Check.ValidationResults_ClaimCost();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_NewTransaction_Check.ValidationResults_ClaimCost();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();

	}

	@Test

	public void AUT_Payment_Comprehensive_ClaimCost_Labor() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_NewTransaction_Check.ValidationResults_ClaimCost();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_NewTransaction_Check.ValidationResults_ClaimCost();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test

	public void AUT_Payment_Comprehensive_ClaimCost_Legal() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_NewTransaction_Check.ValidationResults_ClaimCost();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_NewTransaction_Check.ValidationResults_ClaimCost();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test

	public void AUT_Payment_Comprehensive_ClaimCost_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_NewTransaction_Check.ValidationResults_ClaimCost();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_NewTransaction_Check.ValidationResults_ClaimCost();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test

	public void AUT_Payment_Comprehensive_ClaimCost_Reimbursement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_NewTransaction_Check.ValidationResults_ClaimCost();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_NewTransaction_Check.ValidationResults_ClaimCost();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test

	public void AUT_Payment_Comprehensive_ClaimCost_Rental() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_NewTransaction_Check.ValidationResults_ClaimCost();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_NewTransaction_Check.ValidationResults_ClaimCost();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test

	public void AUT_Payment_Comprehensive_ClaimCost_Settlement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_NewTransaction_Check.ValidationResults_ClaimCost();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_NewTransaction_Check.ValidationResults_ClaimCost();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test

	public void AUT_Payment_Comprehensive_ClaimCost_Towing() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_NewTransaction_Check.ValidationResults_ClaimCost();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_NewTransaction_Check.ValidationResults_ClaimCost();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test

	public void AUT_Payment_Comprehensive_ClaimCost_Vehicleinspection() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_NewTransaction_Check.ValidationResults_ClaimCost();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_NewTransaction_Check.ValidationResults_ClaimCost();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test

	public void AUT_Payment_Comprehensive_ExpenseAO_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test

	public void AUT_Payment_Comprehensive_ExpenseAO_Legal() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test

	public void AUT_Payment_Comprehensive_ExpenseAO_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test

	public void AUT_Payment_Comprehensive_ExpenseAO_Salvage() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test

	public void AUT_Payment_Comprehensive_ExpenseAO_Vehicleappraisal() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();

	}

	@Test

	public void AUT_Payment_Comprehensive_ExpenseDCC_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
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

	public void AUT_Payment_Comprehensive_ExpenseDCC_Legal() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
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

	public void AUT_Payment_Comprehensive_ExpenseDCC_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
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

	public void AUT_Payment_Comprehensive_ExpenseDCC_Vehicleinspection() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
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

	// -----------------------------------------------------------------------------------------------------
	@Test

	public void AUT_Payment_RentalReimbursement_UnspecifiedCostType_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// Click on "Actions" -> Choose by Coverage -> Vehicle ->
		// RentalReimbursement
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage RentalReimbursement");
		CC_Exposure.AddingExposure("VehicleEditIncident_Rental");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory_Rental();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		// error msg
		CC_NewTransaction_Check.Check_ValidationResults_RentalReimbursement();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		// error msg
		CC_NewTransaction_Check.Check_ValidationResults_RentalReimbursement();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_2();
		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test

	public void AUT_Payment_RentalReimbursement_UnspecifiedCostType_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on "Actions" -> Choose by Coverage -> Vehicle ->
		// RentalReimbursement
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage RentalReimbursement");
		CC_Exposure.AddingExposure("VehicleEditIncident_Rental");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory_Rental();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		// error msg
		CC_NewTransaction_Check.Check_ValidationResults_RentalReimbursement();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		// error msg
		CC_NewTransaction_Check.Check_ValidationResults_RentalReimbursement();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_2();
		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test

	public void AUT_Payment_RentalReimbursement_UnspecifiedCostType_Reimbursement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// Click on "Actions" -> Choose by Coverage -> Vehicle ->
		// RentalReimbursement
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage RentalReimbursement");
		CC_Exposure.AddingExposure("VehicleEditIncident_Rental");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory_Rental();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		// error msg
		CC_NewTransaction_Check.Check_ValidationResults_RentalReimbursement();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		// error msg
		CC_NewTransaction_Check.Check_ValidationResults_RentalReimbursement();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_2();
		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test

	public void AUT_Payment_RentalReimbursement_UnspecifiedCostType_Rental() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// Click on "Actions" -> Choose by Coverage -> Vehicle ->
		// RentalReimbursement
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage RentalReimbursement");
		CC_Exposure.AddingExposure("VehicleEditIncident_Rental");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory_Rental();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		// error msg
		CC_NewTransaction_Check.Check_ValidationResults_RentalReimbursement();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		// error msg
		CC_NewTransaction_Check.Check_ValidationResults_RentalReimbursement();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_2();
		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test

	public void AUT_Payment_RentalReimbursement_ClaimCost_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// Click on "Actions" -> Choose by Coverage -> Vehicle ->
		// RentalReimbursement
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage RentalReimbursement");
		CC_Exposure.AddingExposure("VehicleEditIncident_Rental");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory_Rental();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		// error msg
		CC_NewTransaction_Check.Check_ValidationResults_RentalReimbursement();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		// error msg
		CC_NewTransaction_Check.Check_ValidationResults_RentalReimbursement();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_2();
		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test

	public void AUT_Payment_RentalReimbursement_ClaimCost_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on "Actions" -> Choose by Coverage -> Vehicle ->
		// RentalReimbursement
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage RentalReimbursement");
		CC_Exposure.AddingExposure("VehicleEditIncident_Rental");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory_Rental();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		// error msg
		CC_NewTransaction_Check.Check_ValidationResults_RentalReimbursement();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		// error msg
		CC_NewTransaction_Check.Check_ValidationResults_RentalReimbursement();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_2();
		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test

	public void AUT_Payment_RentalReimbursement_ClaimCost_Reimbursement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on "Actions" -> Choose by Coverage -> Vehicle ->
		// RentalReimbursement
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage RentalReimbursement");
		CC_Exposure.AddingExposure("VehicleEditIncident_Rental");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory_Rental();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		// error msg
		CC_NewTransaction_Check.Check_ValidationResults_RentalReimbursement();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		// error msg
		CC_NewTransaction_Check.Check_ValidationResults_RentalReimbursement();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_2();
		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test

	public void AUT_Payment_RentalReimbursement_ClaimCost_Rental() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// Click on "Actions" -> Choose by Coverage -> Vehicle ->
		// RentalReimbursement
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage RentalReimbursement");
		CC_Exposure.AddingExposure("VehicleEditIncident_Rental");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory_Rental();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		// error msg
		CC_NewTransaction_Check.Check_ValidationResults_RentalReimbursement();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		// error msg
		CC_NewTransaction_Check.Check_ValidationResults_RentalReimbursement();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_2();
		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test

	public void AUT_Payment_RentalReimbursement_ExpenseAO_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// Click on "Actions" -> Choose by Coverage -> Vehicle ->
		// RentalReimbursement
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage RentalReimbursement");
		CC_Exposure.AddingExposure("VehicleEditIncident_Rental");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory_Rental();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		// error msg
		CC_NewTransaction_Check.Check_ValidationResults_RentalReimbursement();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		// error msg
		CC_NewTransaction_Check.Check_ValidationResults_RentalReimbursement();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_2();
		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test

	public void AUT_Payment_RentalReimbursement_ExpenseAO_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// Click on "Actions" -> Choose by Coverage -> Vehicle ->
		// RentalReimbursement
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage RentalReimbursement");
		CC_Exposure.AddingExposure("VehicleEditIncident_Rental");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory_Rental();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		// error msg
		CC_NewTransaction_Check.Check_ValidationResults_RentalReimbursement();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		// error msg
		CC_NewTransaction_Check.Check_ValidationResults_RentalReimbursement();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_2();
		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test

	public void AUT_Payment_RentalReimbursement_ExpenseDCC_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// Click on "Actions" -> Choose by Coverage -> Vehicle ->
		// RentalReimbursement
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage RentalReimbursement");
		CC_Exposure.AddingExposure("VehicleEditIncident_Rental");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory_Rental();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_NewTransaction_Check.Check_ValidationResults_RentalReimbursement();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_1();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test

	public void AUT_Payment_RentalReimbursement_ExpenseDCC_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// Click on "Actions" -> Choose by Coverage -> Vehicle ->
		// RentalReimbursement
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage RentalReimbursement");
		CC_Exposure.AddingExposure("VehicleEditIncident_Rental");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory_Rental();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_NewTransaction_Check.Check_ValidationResults_RentalReimbursement();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_1();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	// ----------------------------------------------------------------------------------------------------
	@Test

	public void AUT_Payment_TowingandLabor_UnspecifiedCostType_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// Click on "Actions" -> Choose by Coverage -> Vehicle ->
		// RentalReimbursement
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage TowingAndLabor");

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

	public void AUT_Payment_TowingandLabor_UnspecifiedCostType_Labor() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// Click on "Actions" -> Choose by Coverage -> Vehicle ->
		// RentalReimbursement
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage TowingAndLabor");

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

	public void AUT_Payment_TowingandLabor_UnspecifiedCostType_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// Click on "Actions" -> Choose by Coverage -> Vehicle ->
		// RentalReimbursement
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage TowingAndLabor");

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

	public void AUT_Payment_TowingandLabor_UnspecifiedCostType_Reimbursement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// Click on "Actions" -> Choose by Coverage -> Vehicle ->
		// RentalReimbursement
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage TowingAndLabor");

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

	public void AUT_Payment_TowingandLabor_UnspecifiedCostType_Towing() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// Click on "Actions" -> Choose by Coverage -> Vehicle ->
		// RentalReimbursement
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage TowingAndLabor");

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

	public void AUT_Payment_TowingandLabor_ClaimCost_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// Click on "Actions" -> Choose by Coverage -> Vehicle ->
		// RentalReimbursement
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage TowingAndLabor");

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

	public void AUT_Payment_TowingandLabor_ClaimCost_Labor() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// Click on "Actions" -> Choose by Coverage -> Vehicle ->
		// RentalReimbursement
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage TowingAndLabor");

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

	public void AUT_Payment_TowingandLabor_ClaimCost_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// Click on "Actions" -> Choose by Coverage -> Vehicle ->
		// RentalReimbursement
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage TowingAndLabor");

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

	public void AUT_Payment_TowingandLabor_ClaimCost_Reimbursement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// Click on "Actions" -> Choose by Coverage -> Vehicle ->
		// RentalReimbursement
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage TowingAndLabor");

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

	public void AUT_Payment_TowingandLabor_ClaimCost_Towing() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// Click on "Actions" -> Choose by Coverage -> Vehicle ->
		// RentalReimbursement
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage TowingAndLabor");

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

	public void AUT_Payment_TowingandLabor_ExpenseAO_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// Click on "Actions" -> Choose by Coverage -> Vehicle ->
		// RentalReimbursement
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage TowingAndLabor");

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

	public void AUT_Payment_TowingandLabor_ExpenseAO_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// Click on "Actions" -> Choose by Coverage -> Vehicle ->
		// RentalReimbursement
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage TowingAndLabor");

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

	public void AUT_Payment_TowingandLabor_ExpenseDCC_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// Click on "Actions" -> Choose by Coverage -> Vehicle ->
		// RentalReimbursement
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage TowingAndLabor");

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

	public void AUT_Payment_TowingandLabor_ExpenseDCC_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// Click on "Actions" -> Choose by Coverage -> Vehicle ->
		// RentalReimbursement
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage TowingAndLabor");

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

	// --------------------------------------------------------------------------------------------------------------------------------------
	@Test

	public void AUT_Payment_CollisionLimitedCoverage_UnspecifiedCostType_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Collision Limited Coverage");
		// Adding NewExposure Collision Limited Coverage
		CC_ChooseCoverage.NewExposureValidation();
		CC_ChooseCoverage.AllClaimant();

		CC_ChooseCoverage.VehicleEditIncident();

		CC_ChooseCoverage.Exposures_Validation();
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

	public void AUT_Payment_CollisionLimitedCoverage_UnspecifiedCostType_Autobody() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Collision Limited Coverage");
		// Adding NewExposure Collision Limited Coverage
		CC_ChooseCoverage.NewExposureValidation();
		CC_ChooseCoverage.AllClaimant();

		CC_ChooseCoverage.VehicleEditIncident();

		CC_ChooseCoverage.Exposures_Validation();
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

	public void AUT_Payment_CollisionLimitedCoverage_UnspecifiedCostType_Autoparts() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Collision Limited Coverage");
		// Adding NewExposure Collision Limited Coverage
		CC_ChooseCoverage.NewExposureValidation();
		CC_ChooseCoverage.AllClaimant();

		CC_ChooseCoverage.VehicleEditIncident();

		CC_ChooseCoverage.Exposures_Validation();
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

	public void AUT_Payment_CollisionLimitedCoverage_UnspecifiedCostType_Glass() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Collision Limited Coverage");
		// Adding NewExposure Collision Limited Coverage
		CC_ChooseCoverage.NewExposureValidation();
		CC_ChooseCoverage.AllClaimant();

		CC_ChooseCoverage.VehicleEditIncident();

		CC_ChooseCoverage.Exposures_Validation();
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

	public void AUT_Payment_CollisionLimitedCoverage_UnspecifiedCostType_Labor() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Collision Limited Coverage");
		// Adding NewExposure Collision Limited Coverage
		CC_ChooseCoverage.NewExposureValidation();
		CC_ChooseCoverage.AllClaimant();

		CC_ChooseCoverage.VehicleEditIncident();

		CC_ChooseCoverage.Exposures_Validation();
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

	public void AUT_Payment_CollisionLimitedCoverage_UnspecifiedCostType_Legal() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Collision Limited Coverage");
		// Adding NewExposure Collision Limited Coverage
		CC_ChooseCoverage.NewExposureValidation();
		CC_ChooseCoverage.AllClaimant();

		CC_ChooseCoverage.VehicleEditIncident();

		CC_ChooseCoverage.Exposures_Validation();
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

	public void AUT_Payment_CollisionLimitedCoverage_UnspecifiedCostType_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Collision Limited Coverage");
		// Adding NewExposure Collision Limited Coverage
		CC_ChooseCoverage.NewExposureValidation();
		CC_ChooseCoverage.AllClaimant();

		CC_ChooseCoverage.VehicleEditIncident();

		CC_ChooseCoverage.Exposures_Validation();
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

	public void AUT_Payment_CollisionLimitedCoverage_UnspecifiedCostType_Reimbursement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Collision Limited Coverage");
		// Adding NewExposure Collision Limited Coverage
		CC_ChooseCoverage.NewExposureValidation();
		CC_ChooseCoverage.AllClaimant();

		CC_ChooseCoverage.VehicleEditIncident();

		CC_ChooseCoverage.Exposures_Validation();
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

	public void AUT_Payment_CollisionLimitedCoverage_UnspecifiedCostType_Rental() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Collision Limited Coverage");
		// Adding NewExposure Collision Limited Coverage
		CC_ChooseCoverage.NewExposureValidation();
		CC_ChooseCoverage.AllClaimant();

		CC_ChooseCoverage.VehicleEditIncident();

		CC_ChooseCoverage.Exposures_Validation();
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

	public void AUT_Payment_CollisionLimitedCoverage_UnspecifiedCostType_Salvage() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Collision Limited Coverage");
		// Adding NewExposure Collision Limited Coverage
		CC_ChooseCoverage.NewExposureValidation();
		CC_ChooseCoverage.AllClaimant();

		CC_ChooseCoverage.VehicleEditIncident();

		CC_ChooseCoverage.Exposures_Validation();
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

	public void AUT_Payment_CollisionLimitedCoverage_UnspecifiedCostType_Settlement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Collision Limited Coverage");
		// Adding NewExposure Collision Limited Coverage
		CC_ChooseCoverage.NewExposureValidation();
		CC_ChooseCoverage.AllClaimant();

		CC_ChooseCoverage.VehicleEditIncident();

		CC_ChooseCoverage.Exposures_Validation();
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

	public void AUT_Payment_CollisionLimitedCoverage_UnspecifiedCostType_Towing() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Collision Limited Coverage");
		// Adding NewExposure Collision Limited Coverage
		CC_ChooseCoverage.NewExposureValidation();
		CC_ChooseCoverage.AllClaimant();

		CC_ChooseCoverage.VehicleEditIncident();

		CC_ChooseCoverage.Exposures_Validation();
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

	public void AUT_Payment_CollisionLimitedCoverage_UnspecifiedCostType_Vehicleappraisal() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Collision Limited Coverage");
		// Adding NewExposure Collision Limited Coverage
		CC_ChooseCoverage.NewExposureValidation();
		CC_ChooseCoverage.AllClaimant();

		CC_ChooseCoverage.VehicleEditIncident();

		CC_ChooseCoverage.Exposures_Validation();
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

	public void AUT_Payment_CollisionLimitedCoverage_UnspecifiedCostType_Vehicleinspection() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Collision Limited Coverage");
		// Adding NewExposure Collision Limited Coverage
		CC_ChooseCoverage.NewExposureValidation();
		CC_ChooseCoverage.AllClaimant();

		CC_ChooseCoverage.VehicleEditIncident();

		CC_ChooseCoverage.Exposures_Validation();
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

	public void AUT_Payment_CollisionLimitedCoverage_ClaimCost_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Collision Limited Coverage");
		// Adding NewExposure Collision Limited Coverage
		CC_ChooseCoverage.NewExposureValidation();
		CC_ChooseCoverage.AllClaimant();

		CC_ChooseCoverage.VehicleEditIncident();

		CC_ChooseCoverage.Exposures_Validation();
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

	public void AUT_Payment_CollisionLimitedCoverage_ClaimCost_Autoparts() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Collision Limited Coverage");
		// Adding NewExposure Collision Limited Coverage
		CC_ChooseCoverage.NewExposureValidation();
		CC_ChooseCoverage.AllClaimant();

		CC_ChooseCoverage.VehicleEditIncident();

		CC_ChooseCoverage.Exposures_Validation();
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

	public void AUT_Payment_CollisionLimitedCoverage_ClaimCost_Glass() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Collision Limited Coverage");
		// Adding NewExposure Collision Limited Coverage
		CC_ChooseCoverage.NewExposureValidation();
		CC_ChooseCoverage.AllClaimant();

		CC_ChooseCoverage.VehicleEditIncident();

		CC_ChooseCoverage.Exposures_Validation();
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

	public void AUT_Payment_CollisionLimitedCoverage_ClaimCost_Labor() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Collision Limited Coverage");
		// Adding NewExposure Collision Limited Coverage
		CC_ChooseCoverage.NewExposureValidation();
		CC_ChooseCoverage.AllClaimant();

		CC_ChooseCoverage.VehicleEditIncident();

		CC_ChooseCoverage.Exposures_Validation();
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

	public void AUT_Payment_CollisionLimitedCoverage_ClaimCost_Legal() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Collision Limited Coverage");
		// Adding NewExposure Collision Limited Coverage
		CC_ChooseCoverage.NewExposureValidation();
		CC_ChooseCoverage.AllClaimant();

		CC_ChooseCoverage.VehicleEditIncident();

		CC_ChooseCoverage.Exposures_Validation();
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

	public void AUT_Payment_CollisionLimitedCoverage_ClaimCost_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Collision Limited Coverage");
		// Adding NewExposure Collision Limited Coverage
		CC_ChooseCoverage.NewExposureValidation();
		CC_ChooseCoverage.AllClaimant();

		CC_ChooseCoverage.VehicleEditIncident();

		CC_ChooseCoverage.Exposures_Validation();
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

	public void AUT_Payment_CollisionLimitedCoverage_ClaimCost_Reimbursement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Collision Limited Coverage");
		// Adding NewExposure Collision Limited Coverage
		CC_ChooseCoverage.NewExposureValidation();
		CC_ChooseCoverage.AllClaimant();

		CC_ChooseCoverage.VehicleEditIncident();

		CC_ChooseCoverage.Exposures_Validation();
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

	public void AUT_Payment_CollisionLimitedCoverage_ClaimCost_Rental() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Collision Limited Coverage");
		// Adding NewExposure Collision Limited Coverage
		CC_ChooseCoverage.NewExposureValidation();
		CC_ChooseCoverage.AllClaimant();

		CC_ChooseCoverage.VehicleEditIncident();

		CC_ChooseCoverage.Exposures_Validation();
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

	public void AUT_Payment_CollisionLimitedCoverage_ClaimCost_Settlement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Collision Limited Coverage");
		// Adding NewExposure Collision Limited Coverage
		CC_ChooseCoverage.NewExposureValidation();
		CC_ChooseCoverage.AllClaimant();

		CC_ChooseCoverage.VehicleEditIncident();

		CC_ChooseCoverage.Exposures_Validation();
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

	public void AUT_Payment_CollisionLimitedCoverage_ClaimCost_Towing() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Collision Limited Coverage");
		// Adding NewExposure Collision Limited Coverage
		CC_ChooseCoverage.NewExposureValidation();
		CC_ChooseCoverage.AllClaimant();

		CC_ChooseCoverage.VehicleEditIncident();

		CC_ChooseCoverage.Exposures_Validation();
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

	public void AUT_Payment_CollisionLimitedCoverage_ClaimCost_Vehicleinspection() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Collision Limited Coverage");
		// Adding NewExposure Collision Limited Coverage
		CC_ChooseCoverage.NewExposureValidation();
		CC_ChooseCoverage.AllClaimant();

		CC_ChooseCoverage.VehicleEditIncident();

		CC_ChooseCoverage.Exposures_Validation();
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

	public void AUT_Payment_CollisionLimitedCoverage_ExpenseAO_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Collision Limited Coverage");
		// Adding NewExposure Collision Limited Coverage
		CC_ChooseCoverage.NewExposureValidation();
		CC_ChooseCoverage.AllClaimant();

		CC_ChooseCoverage.VehicleEditIncident();

		CC_ChooseCoverage.Exposures_Validation();
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

	public void AUT_Payment_CollisionLimitedCoverage_ExpenseAO_Legal() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Collision Limited Coverage");
		// Adding NewExposure Collision Limited Coverage
		CC_ChooseCoverage.NewExposureValidation();
		CC_ChooseCoverage.AllClaimant();

		CC_ChooseCoverage.VehicleEditIncident();

		CC_ChooseCoverage.Exposures_Validation();
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

	public void AUT_Payment_CollisionLimitedCoverage_ExpenseAO_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Collision Limited Coverage");
		// Adding NewExposure Collision Limited Coverage
		CC_ChooseCoverage.NewExposureValidation();
		CC_ChooseCoverage.AllClaimant();

		CC_ChooseCoverage.VehicleEditIncident();

		CC_ChooseCoverage.Exposures_Validation();
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

	public void AUT_Payment_CollisionLimitedCoverage_ExpenseAO_Salvage() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Collision Limited Coverage");
		// Adding NewExposure Collision Limited Coverage
		CC_ChooseCoverage.NewExposureValidation();
		CC_ChooseCoverage.AllClaimant();

		CC_ChooseCoverage.VehicleEditIncident();

		CC_ChooseCoverage.Exposures_Validation();
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

	public void AUT_Payment_CollisionLimitedCoverage_ExpenseAO_Vehicleappraisal() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Collision Limited Coverage");
		// Adding NewExposure Collision Limited Coverage
		CC_ChooseCoverage.NewExposureValidation();
		CC_ChooseCoverage.AllClaimant();

		CC_ChooseCoverage.VehicleEditIncident();

		CC_ChooseCoverage.Exposures_Validation();
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

	public void AUT_Payment_CollisionLimitedCoverage_ExpenseDCC_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Collision Limited Coverage");
		// Adding NewExposure Collision Limited Coverage
		CC_ChooseCoverage.NewExposureValidation();
		CC_ChooseCoverage.AllClaimant();

		CC_ChooseCoverage.VehicleEditIncident();

		CC_ChooseCoverage.Exposures_Validation();
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

	public void AUT_Payment_CollisionLimitedCoverage_ExpenseDCC_Legal() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Collision Limited Coverage");
		// Adding NewExposure Collision Limited Coverage
		CC_ChooseCoverage.NewExposureValidation();
		CC_ChooseCoverage.AllClaimant();

		CC_ChooseCoverage.VehicleEditIncident();

		CC_ChooseCoverage.Exposures_Validation();
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

	public void AUT_Payment_CollisionLimitedCoverage_ExpenseDCC_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Collision Limited Coverage");
		// Adding NewExposure Collision Limited Coverage
		CC_ChooseCoverage.NewExposureValidation();
		CC_ChooseCoverage.AllClaimant();

		CC_ChooseCoverage.VehicleEditIncident();

		CC_ChooseCoverage.Exposures_Validation();
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

	public void AUT_Payment_CollisionLimitedCoverage_ExpenseDCC_Vehicleinspection() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("Collision Limited Coverage");
		// Adding NewExposure Collision Limited Coverage
		CC_ChooseCoverage.NewExposureValidation();
		CC_ChooseCoverage.AllClaimant();

		CC_ChooseCoverage.VehicleEditIncident();

		CC_ChooseCoverage.Exposures_Validation();
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

	// -----------------------------------------------------------------------------------------------------------------------------------------

	@Test

	public void AUT_Payment_DeathDisabilityBenefit_UnspecifiedCostType_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// Click on "Actions" -> Choose by Coverage Type->Death and Disability Benefit
		CC_Reusables.ccMenuNavigation("Death and Disability Benefit");

		// Adding Exposure
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();

	}

	@Test

	public void AUT_Payment_DeathDisabilityBenefit_UnspecifiedCostType_CaseManagement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// Click on "Actions" -> Choose by Coverage Type->Death and Disability Benefit
		CC_Reusables.ccMenuNavigation("Death and Disability Benefit");

		// Adding Exposure
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test

	public void AUT_Payment_DeathDisabilityBenefit_UnspecifiedCostType_DeathBenefits() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// Click on "Actions" -> Choose by Coverage Type->Death and Disability Benefit
		CC_Reusables.ccMenuNavigation("Death and Disability Benefit");

		// Adding Exposure
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test

	public void AUT_Payment_DeathDisabilityBenefit_UnspecifiedCostType_Labor() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// Click on "Actions" -> Choose by Coverage Type->Death and Disability Benefit
		CC_Reusables.ccMenuNavigation("Death and Disability Benefit");

		// Adding Exposure
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test

	public void AUT_Payment_DeathDisabilityBenefit_UnspecifiedCostType_Legal() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// Click on "Actions" -> Choose by Coverage Type->Death and Disability Benefit
		CC_Reusables.ccMenuNavigation("Death and Disability Benefit");

		// Adding Exposure
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test

	public void AUT_Payment__DeathDisabilityBenefit_UnspecifiedCostType_LostWages() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// Click on "Actions" -> Choose by Coverage Type->Death and Disability Benefit
		CC_Reusables.ccMenuNavigation("Death and Disability Benefit");

		// Adding Exposure
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test

	public void AUT_Payment_DeathDisabilityBenefit_UnspecifiedCostType_Othersion_ClaimCost_Reimbursement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// Click on "Actions" -> Choose by Coverage Type->Death and Disability Benefit
		CC_Reusables.ccMenuNavigation("Death and Disability Benefit");

		// Adding Exposure
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test

	public void AUT_Payment_DeathDisabilityBenefit_UnspecifiedCostType_Reimbursement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// Click on "Actions" -> Choose by Coverage Type->Death and Disability Benefit
		CC_Reusables.ccMenuNavigation("Death and Disability Benefit");

		// Adding Exposure
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test

	public void AUT_Payment_DeathDisabilityBenefit_UnspecifiedCostType_Salvage() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// Click on "Actions" -> Choose by Coverage Type->Death and Disability Benefit
		CC_Reusables.ccMenuNavigation("Death and Disability Benefit");

		// Adding Exposure
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test

	public void AUT_Payment_DeathDisabilityBenefit_UnspecifiedCostType_Settlement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// Click on "Actions" -> Choose by Coverage Type->Death and Disability Benefit
		CC_Reusables.ccMenuNavigation("Death and Disability Benefit");

		// Adding Exposure
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test

	public void AUT_Payment_DeathDisabilityBenefit_UnspecifiedCostType_Vehicleappraisal() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// Click on "Actions" -> Choose by Coverage Type->Death and Disability Benefit
		CC_Reusables.ccMenuNavigation("Death and Disability Benefit");

		// Adding Exposure
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test

	public void AUT_Payment_DeathDisabilityBenefit_UnspecifiedCostType_Vehicleinspection() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// Click on "Actions" -> Choose by Coverage Type->Death and Disability Benefit
		CC_Reusables.ccMenuNavigation("Death and Disability Benefit");

		// Adding Exposure
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test

	public void AUT_Payment_DeathDisabilityBenefit_ClaimCost_UnspecifiedCostCategory() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// Click on "Actions" -> Choose by Coverage Type->Death and Disability Benefit
		CC_Reusables.ccMenuNavigation("Death and Disability Benefit");

		// Adding Exposure
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test

	public void AUT_Payment_DeathDisabilityBenefit_ClaimCost_Deathbenefits() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// Click on "Actions" -> Choose by Coverage Type->Death and Disability Benefit
		CC_Reusables.ccMenuNavigation("Death and Disability Benefit");

		// Adding Exposure
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test

	public void AUT_Payment_DeathDisabilityBenefit_ClaimCost_Labor() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// Click on "Actions" -> Choose by Coverage Type->Death and Disability Benefit
		CC_Reusables.ccMenuNavigation("Death and Disability Benefit");

		// Adding Exposure
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test

	public void AUT_Payment_DeathDisabilityBenefit_ClaimCost_Legal() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// Click on "Actions" -> Choose by Coverage Type->Death and Disability Benefit
		CC_Reusables.ccMenuNavigation("Death and Disability Benefit");

		// Adding Exposure
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test

	public void AUT_Payment_DeathDisabilityBenefit_ClaimCost_LostWages() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// Click on "Actions" -> Choose by Coverage Type->Death and Disability Benefit
		CC_Reusables.ccMenuNavigation("Death and Disability Benefit");

		// Adding Exposure
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test

	public void AUT_Payment_DeathDisabilityBenefit_ClaimCost_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// Click on "Actions" -> Choose by Coverage Type->Death and Disability Benefit
		CC_Reusables.ccMenuNavigation("Death and Disability Benefit");

		// Adding Exposure
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test

	public void AUT_Payment_DeathDisabilityBenefit_ClaimCost_Reimbursement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// Click on "Actions" -> Choose by Coverage Type->Death and Disability Benefit
		CC_Reusables.ccMenuNavigation("Death and Disability Benefit");

		// Adding Exposure
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test

	public void AUT_Payment_DeathDisabilityBenefit_ClaimCost_Settlement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// Click on "Actions" -> Choose by Coverage Type->Death and Disability Benefit
		CC_Reusables.ccMenuNavigation("Death and Disability Benefit");

		// Adding Exposure
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test

	public void AUT_Payment_DeathDisabilityBenefit_ClaimCost_Vehicleinspection() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// Click on "Actions" -> Choose by Coverage Type->Death and Disability Benefit
		CC_Reusables.ccMenuNavigation("Death and Disability Benefit");

		// Adding Exposure
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test

	public void AUT_Payment_DeathDisabilityBenefit_ExpenseAO_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// Click on "Actions" -> Choose by Coverage Type->Death and Disability Benefit
		CC_Reusables.ccMenuNavigation("Death and Disability Benefit");

		// Adding Exposure
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test

	public void AUT_Payment_DeathDisabilityBenefit_ExpenseAO_CaseManagement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// Click on "Actions" -> Choose by Coverage Type->Death and Disability Benefit
		CC_Reusables.ccMenuNavigation("Death and Disability Benefit");

		// Adding Exposure
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test

	public void AUT_Payment_DeathDisabilityBenefit_ExpenseAO_Legal() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// Click on "Actions" -> Choose by Coverage Type->Death and Disability Benefit
		CC_Reusables.ccMenuNavigation("Death and Disability Benefit");

		// Adding Exposure
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test

	public void AUT_Payment_DeathDisabilityBenefit_ExpenseAO_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// Click on "Actions" -> Choose by Coverage Type->Death and Disability Benefit
		CC_Reusables.ccMenuNavigation("Death and Disability Benefit");

		// Adding Exposure
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test

	public void AUT_Payment_DeathDisabilityBenefit_ExpenseAO_Salvage() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// Click on "Actions" -> Choose by Coverage Type->Death and Disability Benefit
		CC_Reusables.ccMenuNavigation("Death and Disability Benefit");

		// Adding Exposure
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test

	public void AUT_Payment_DeathDisabilityBenefit_ExpenseAO_Vehicleappraisal() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// Click on "Actions" -> Choose by Coverage Type->Death and Disability Benefit
		CC_Reusables.ccMenuNavigation("Death and Disability Benefit");

		// Adding Exposure
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test

	public void AUT_Payment_DeathDisabilityBenefit_ExpenseAO_Vehicleinspection() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// Click on "Actions" -> Choose by Coverage Type->Death and Disability Benefit
		CC_Reusables.ccMenuNavigation("Death and Disability Benefit");

		// Adding Exposure
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test

	public void AUT_Payment_DeathDisabilityBenefit_ExpenseDCC_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// Click on "Actions" -> Choose by Coverage Type->Death and Disability Benefit
		CC_Reusables.ccMenuNavigation("Death and Disability Benefit");

		// Adding Exposure
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
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

	public void AUT_Payment_DeathDisabilityBenefit_ExpenseDCC_Legal() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// Click on "Actions" -> Choose by Coverage Type->Death and Disability Benefit
		CC_Reusables.ccMenuNavigation("Death and Disability Benefit");

		// Adding Exposure
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
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
	public void AUT_Payment_DeathDisabilityBenefit_ExpenseDCC_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// Click on "Actions" -> Choose by Coverage Type->Death and Disability Benefit
		CC_Reusables.ccMenuNavigation("Death and Disability Benefit");

		// Adding Exposure
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
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
	public void AUT_Payment_DeathDisabilityBenefit_ExpenseDCC_Vehicleinspection() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// Click on "Actions" -> Choose by Coverage Type->Death and Disability Benefit
		CC_Reusables.ccMenuNavigation("Death and Disability Benefit");

		// Adding Exposure
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
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

	// -------------------------------------------------------------------------------------------
	@Test
	public void AUT_Payment_ElectronicEquipment_UnspecifiedCostType_UnspecifiedCostCategory() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// Click on "Actions" -> Choose by Coverage Type->Death and Disability Benefit
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage ElectronicEquipment");

		CC_Exposure.AddingExposure("VehicleEditIncident_Electronic");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// Verify whether a default reserve is created
		CC_Reserve.AddingReserve_EachCostCategory_Electronic();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		// error msg
		CC_NewTransaction_Check.Check_ValidationResults_ElectronicEquipment();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		// error msg
		CC_NewTransaction_Check.Check_ValidationResults_ElectronicEquipment();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_2();
		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();

	}

	@Test
	public void AUT_Payment_ElectronicEquipment_UnspecifiedCostType_Autoparts() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// Click on "Actions" -> Choose by Coverage Type->Death and Disability Benefit
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage ElectronicEquipment");

		CC_Exposure.AddingExposure("VehicleEditIncident_Electronic");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// Verify whether a default reserve is created
		CC_Reserve.AddingReserve_EachCostCategory_Electronic();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		// error msg
		CC_NewTransaction_Check.Check_ValidationResults_ElectronicEquipment();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		// error msg
		CC_NewTransaction_Check.Check_ValidationResults_ElectronicEquipment();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_2();
		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_ElectronicEquipment_UnspecifiedCostType_Labor() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// Click on "Actions" -> Choose by Coverage Type->Death and Disability Benefit
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage ElectronicEquipment");

		CC_Exposure.AddingExposure("VehicleEditIncident_Electronic");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// Verify whether a default reserve is created
		CC_Reserve.AddingReserve_EachCostCategory_Electronic();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		// error msg
		CC_NewTransaction_Check.Check_ValidationResults_ElectronicEquipment();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		// error msg
		CC_NewTransaction_Check.Check_ValidationResults_ElectronicEquipment();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_2();
		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_ElectronicEquipment_UnspecifiedCostType_Legal() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// Click on "Actions" -> Choose by Coverage Type->Death and Disability Benefit
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage ElectronicEquipment");

		CC_Exposure.AddingExposure("VehicleEditIncident_Electronic");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// Verify whether a default reserve is created
		CC_Reserve.AddingReserve_EachCostCategory_Electronic();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		// error msg
		CC_NewTransaction_Check.Check_ValidationResults_ElectronicEquipment();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		// error msg
		CC_NewTransaction_Check.Check_ValidationResults_ElectronicEquipment();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_2();
		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_ElectronicEquipment_UnspecifiedCostType_Other() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// Click on "Actions" -> Choose by Coverage Type->Death and Disability Benefit
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage ElectronicEquipment");

		CC_Exposure.AddingExposure("VehicleEditIncident_Electronic");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// Verify whether a default reserve is created
		CC_Reserve.AddingReserve_EachCostCategory_Electronic();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		// error msg
		CC_NewTransaction_Check.Check_ValidationResults_ElectronicEquipment();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		// error msg
		CC_NewTransaction_Check.Check_ValidationResults_ElectronicEquipment();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_2();
		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_ElectronicEquipment_UnspecifiedCostType_Reimbursement() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// Click on "Actions" -> Choose by Coverage Type->Death and Disability Benefit
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage ElectronicEquipment");

		CC_Exposure.AddingExposure("VehicleEditIncident_Electronic");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// Verify whether a default reserve is created
		CC_Reserve.AddingReserve_EachCostCategory_Electronic();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		// error msg
		CC_NewTransaction_Check.Check_ValidationResults_ElectronicEquipment();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		// error msg
		CC_NewTransaction_Check.Check_ValidationResults_ElectronicEquipment();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_2();
		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_ElectronicEquipment_UnspecifiedCostType_Salvage() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// Click on "Actions" -> Choose by Coverage Type->Death and Disability Benefit
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage ElectronicEquipment");

		CC_Exposure.AddingExposure("VehicleEditIncident_Electronic");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// Verify whether a default reserve is created
		CC_Reserve.AddingReserve_EachCostCategory_Electronic();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		// error msg
		CC_NewTransaction_Check.Check_ValidationResults_ElectronicEquipment();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		// error msg
		CC_NewTransaction_Check.Check_ValidationResults_ElectronicEquipment();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_2();
		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_ElectronicEquipment_UnspecifiedCostType_Settlement() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// Click on "Actions" -> Choose by Coverage Type->Death and Disability Benefit
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage ElectronicEquipment");

		CC_Exposure.AddingExposure("VehicleEditIncident_Electronic");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// Verify whether a default reserve is created
		CC_Reserve.AddingReserve_EachCostCategory_Electronic();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		// error msg
		CC_NewTransaction_Check.Check_ValidationResults_ElectronicEquipment();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		// error msg
		CC_NewTransaction_Check.Check_ValidationResults_ElectronicEquipment();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_2();
		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_ElectronicEquipment_UnspecifiedCostType_Vehicleappraisal() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// Click on "Actions" -> Choose by Coverage Type->Death and Disability Benefit
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage ElectronicEquipment");

		CC_Exposure.AddingExposure("VehicleEditIncident_Electronic");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// Verify whether a default reserve is created
		CC_Reserve.AddingReserve_EachCostCategory_Electronic();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		// error msg
		CC_NewTransaction_Check.Check_ValidationResults_ElectronicEquipment();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		// error msg
		CC_NewTransaction_Check.Check_ValidationResults_ElectronicEquipment();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_2();
		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_ElectronicEquipment_UnspecifiedCostType_Vehicleinspection() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// Click on "Actions" -> Choose by Coverage Type->Death and Disability Benefit
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage ElectronicEquipment");

		CC_Exposure.AddingExposure("VehicleEditIncident_Electronic");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// Verify whether a default reserve is created
		CC_Reserve.AddingReserve_EachCostCategory_Electronic();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		// error msg
		CC_NewTransaction_Check.Check_ValidationResults_ElectronicEquipment();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		// error msg
		CC_NewTransaction_Check.Check_ValidationResults_ElectronicEquipment();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_2();
		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_ElectronicEquipment_ClaimCost_UnspecifiedCostCategory() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// Click on "Actions" -> Choose by Coverage Type->Death and Disability Benefit
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage ElectronicEquipment");

		CC_Exposure.AddingExposure("VehicleEditIncident_Electronic");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// Verify whether a default reserve is created
		CC_Reserve.AddingReserve_EachCostCategory_Electronic();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		// error msg
		CC_NewTransaction_Check.Check_ValidationResults_ElectronicEquipment();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		// error msg
		CC_NewTransaction_Check.Check_ValidationResults_ElectronicEquipment();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_2();
		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_ElectronicEquipment_ClaimCost_Autoparts() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// Click on "Actions" -> Choose by Coverage Type->Death and Disability Benefit
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage ElectronicEquipment");

		CC_Exposure.AddingExposure("VehicleEditIncident_Electronic");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// Verify whether a default reserve is created
		CC_Reserve.AddingReserve_EachCostCategory_Electronic();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		// error msg
		CC_NewTransaction_Check.Check_ValidationResults_ElectronicEquipment();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		// error msg
		CC_NewTransaction_Check.Check_ValidationResults_ElectronicEquipment();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_2();
		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();

	}

	@Test
	public void AUT_Payment_ElectronicEquipment_ClaimCost_Labor() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// Click on "Actions" -> Choose by Coverage Type->Death and Disability Benefit
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage ElectronicEquipment");

		CC_Exposure.AddingExposure("VehicleEditIncident_Electronic");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// Verify whether a default reserve is created
		CC_Reserve.AddingReserve_EachCostCategory_Electronic();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		// error msg
		CC_NewTransaction_Check.Check_ValidationResults_ElectronicEquipment();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		// error msg
		CC_NewTransaction_Check.Check_ValidationResults_ElectronicEquipment();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_2();
		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();

	}

	@Test
	public void AUT_Payment_ElectronicEquipment_ClaimCost_Legal() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// Click on "Actions" -> Choose by Coverage Type->Death and Disability Benefit
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage ElectronicEquipment");

		CC_Exposure.AddingExposure("VehicleEditIncident_Electronic");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// Verify whether a default reserve is created
		CC_Reserve.AddingReserve_EachCostCategory_Electronic();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		// error msg
		CC_NewTransaction_Check.Check_ValidationResults_ElectronicEquipment();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		// error msg
		CC_NewTransaction_Check.Check_ValidationResults_ElectronicEquipment();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_2();
		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_ElectronicEquipment_ClaimCost_Other() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// Click on "Actions" -> Choose by Coverage Type->Death and Disability Benefit
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage ElectronicEquipment");

		CC_Exposure.AddingExposure("VehicleEditIncident_Electronic");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// Verify whether a default reserve is created
		CC_Reserve.AddingReserve_EachCostCategory_Electronic();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		// error msg
		CC_NewTransaction_Check.Check_ValidationResults_ElectronicEquipment();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		// error msg
		CC_NewTransaction_Check.Check_ValidationResults_ElectronicEquipment();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_2();
		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_ElectronicEquipment_ClaimCost_Reimbursement() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// Click on "Actions" -> Choose by Coverage Type->Death and Disability Benefit
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage ElectronicEquipment");

		CC_Exposure.AddingExposure("VehicleEditIncident_Electronic");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// Verify whether a default reserve is created
		CC_Reserve.AddingReserve_EachCostCategory_Electronic();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		// error msg
		CC_NewTransaction_Check.Check_ValidationResults_ElectronicEquipment();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		// error msg
		CC_NewTransaction_Check.Check_ValidationResults_ElectronicEquipment();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_2();
		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_ElectronicEquipment_ClaimCost_Salvage() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// Click on "Actions" -> Choose by Coverage Type->Death and Disability Benefit
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage ElectronicEquipment");

		CC_Exposure.AddingExposure("VehicleEditIncident_Electronic");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// Verify whether a default reserve is created
		CC_Reserve.AddingReserve_EachCostCategory_Electronic();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		// error msg
		CC_NewTransaction_Check.Check_ValidationResults_ElectronicEquipment();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		// error msg
		CC_NewTransaction_Check.Check_ValidationResults_ElectronicEquipment();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_2();
		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_ElectronicEquipment_ClaimCost_Settlement() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// Click on "Actions" -> Choose by Coverage Type->Death and Disability Benefit
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage ElectronicEquipment");

		CC_Exposure.AddingExposure("VehicleEditIncident_Electronic");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// Verify whether a default reserve is created
		CC_Reserve.AddingReserve_EachCostCategory_Electronic();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		// error msg
		CC_NewTransaction_Check.Check_ValidationResults_ElectronicEquipment();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		// error msg
		CC_NewTransaction_Check.Check_ValidationResults_ElectronicEquipment();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_2();
		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_ElectronicEquipment_ClaimCost_Vehicleinspection() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// Click on "Actions" -> Choose by Coverage Type->Death and Disability Benefit
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage ElectronicEquipment");

		CC_Exposure.AddingExposure("VehicleEditIncident_Electronic");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// Verify whether a default reserve is created
		CC_Reserve.AddingReserve_EachCostCategory_Electronic();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		// error msg
		CC_NewTransaction_Check.Check_ValidationResults_ElectronicEquipment();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		// error msg
		CC_NewTransaction_Check.Check_ValidationResults_ElectronicEquipment();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_2();
		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_ElectronicEquipment_ExpenseAO_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// Click on "Actions" -> Choose by Coverage Type->Death and Disability Benefit
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage ElectronicEquipment");

		CC_Exposure.AddingExposure("VehicleEditIncident_Electronic");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// Verify whether a default reserve is created
		CC_Reserve.AddingReserve_EachCostCategory_Electronic();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		// error msg
		CC_NewTransaction_Check.Check_ValidationResults_ElectronicEquipment();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		// error msg
		CC_NewTransaction_Check.Check_ValidationResults_ElectronicEquipment();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_2();
		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_ElectronicEquipment_ExpenseAO_Legal() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// Click on "Actions" -> Choose by Coverage Type->Death and Disability Benefit
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage ElectronicEquipment");

		CC_Exposure.AddingExposure("VehicleEditIncident_Electronic");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// Verify whether a default reserve is created
		CC_Reserve.AddingReserve_EachCostCategory_Electronic();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		// error msg
		CC_NewTransaction_Check.Check_ValidationResults_ElectronicEquipment();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		// error msg
		CC_NewTransaction_Check.Check_ValidationResults_ElectronicEquipment();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_2();
		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_ElectronicEquipment_ExpenseAO_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// Click on "Actions" -> Choose by Coverage Type->Death and Disability Benefit
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage ElectronicEquipment");

		CC_Exposure.AddingExposure("VehicleEditIncident_Electronic");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// Verify whether a default reserve is created
		CC_Reserve.AddingReserve_EachCostCategory_Electronic();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		// error msg
		CC_NewTransaction_Check.Check_ValidationResults_ElectronicEquipment();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		// error msg
		CC_NewTransaction_Check.Check_ValidationResults_ElectronicEquipment();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_2();
		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();

	}

	@Test
	public void AUT_Payment_ElectronicEquipment_ExpenseAO_Salvage() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// Click on "Actions" -> Choose by Coverage Type->Death and Disability Benefit
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage ElectronicEquipment");

		CC_Exposure.AddingExposure("VehicleEditIncident_Electronic");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// Verify whether a default reserve is created
		CC_Reserve.AddingReserve_EachCostCategory_Electronic();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		// error msg
		CC_NewTransaction_Check.Check_ValidationResults_ElectronicEquipment();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		// error msg
		CC_NewTransaction_Check.Check_ValidationResults_ElectronicEquipment();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_2();
		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_ElectronicEquipment_ExpenseAO_Vehicleappraisal() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// Click on "Actions" -> Choose by Coverage Type->Death and Disability Benefit
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage ElectronicEquipment");

		CC_Exposure.AddingExposure("VehicleEditIncident_Electronic");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// Verify whether a default reserve is created
		CC_Reserve.AddingReserve_EachCostCategory_Electronic();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		// error msg
		CC_NewTransaction_Check.Check_ValidationResults_ElectronicEquipment();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		// error msg
		CC_NewTransaction_Check.Check_ValidationResults_ElectronicEquipment();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_2();
		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_ElectronicEquipment_ExpenseDCC_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// Click on "Actions" -> Choose by Coverage Type->Death and Disability Benefit
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage ElectronicEquipment");

		CC_Exposure.AddingExposure("VehicleEditIncident_Electronic");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// Verify whether a default reserve is created
		CC_Reserve.AddingReserve_EachCostCategory_Electronic();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_NewTransaction_Check.Check_ValidationResults_ElectronicEquipment();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_1();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_ElectronicEquipment_ExpenseDCC_Legal() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// Click on "Actions" -> Choose by Coverage Type->Death and Disability Benefit
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage ElectronicEquipment");

		CC_Exposure.AddingExposure("VehicleEditIncident_Electronic");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// Verify whether a default reserve is created
		CC_Reserve.AddingReserve_EachCostCategory_Electronic();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_NewTransaction_Check.Check_ValidationResults_ElectronicEquipment();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_1();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_ElectronicEquipment_ExpenseDCC_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// Click on "Actions" -> Choose by Coverage Type->Death and Disability Benefit
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage ElectronicEquipment");

		CC_Exposure.AddingExposure("VehicleEditIncident_Electronic");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// Verify whether a default reserve is created
		CC_Reserve.AddingReserve_EachCostCategory_Electronic();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_NewTransaction_Check.Check_ValidationResults_ElectronicEquipment();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_1();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_ElectronicEquipment_ExpenseDCC_Vehicleinspection() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// Click on "Actions" -> Choose by Coverage Type->Death and Disability Benefit
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage ElectronicEquipment");

		CC_Exposure.AddingExposure("VehicleEditIncident_Electronic");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// Verify whether a default reserve is created
		CC_Reserve.AddingReserve_EachCostCategory_Electronic();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.ValidationResults_NoValidationErrors();

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_NewTransaction_Check.Check_ValidationResults_ElectronicEquipment();
		CC_Reusables.clickButton("Finish");
		CC_Financials.FinancialsChecks_Verification_1();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	// -------------------------------------------------------------------------------------------
	@Test
	public void AUT_Payment_LiabilityBodilyInjury_UnspecifiedCostType_UnspecifiedCostCategory() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		/// Click on "Actions" -> Choose by Coverage ->Vehicle---->Liability Bodily
		/// Injury
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Liability Bodily Injury");

		// Adding Exposure
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_LiabilityBodilyInjury_UnspecifiedCostType_Autobody() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		/// Click on "Actions" -> Choose by Coverage ->Vehicle---->Liability Bodily
		/// Injury
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Liability Bodily Injury");

		// Adding Exposure
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_LiabilityBodilyInjury_UnspecifiedCostType_Autoparts() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		/// Click on "Actions" -> Choose by Coverage ->Vehicle---->Liability Bodily
		/// Injury
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Liability Bodily Injury");

		// Adding Exposure
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_LiabilityBodilyInjury_UnspecifiedCostType_DeathBenefits() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		/// Click on "Actions" -> Choose by Coverage ->Vehicle---->Liability Bodily
		/// Injury
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Liability Bodily Injury");

		// Adding Exposure
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_LiabilityBodilyInjury_UnspecifiedCostType_EmergencyServices() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		/// Click on "Actions" -> Choose by Coverage ->Vehicle---->Liability Bodily
		/// Injury
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Liability Bodily Injury");

		// Adding Exposure
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_LiabilityBodilyInjury_UnspecifiedCostType_Glass() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		/// Click on "Actions" -> Choose by Coverage ->Vehicle---->Liability Bodily
		/// Injury
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Liability Bodily Injury");

		// Adding Exposure
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_LiabilityBodilyInjury_UnspecifiedCostType_Labor() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		/// Click on "Actions" -> Choose by Coverage ->Vehicle---->Liability Bodily
		/// Injury
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Liability Bodily Injury");

		// Adding Exposure
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_LiabilityBodilyInjury_UnspecifiedCostType_Legal() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		/// Click on "Actions" -> Choose by Coverage ->Vehicle---->Liability Bodily
		/// Injury
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Liability Bodily Injury");

		// Adding Exposure
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_LiabilityBodilyInjury_UnspecifiedCostType_LifetimeBenefits() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		/// Click on "Actions" -> Choose by Coverage ->Vehicle---->Liability Bodily
		/// Injury
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Liability Bodily Injury");

		// Adding Exposure
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_LiabilityBodilyInjury_UnspecifiedCostType_LostWages() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		/// Click on "Actions" -> Choose by Coverage ->Vehicle---->Liability Bodily
		/// Injury
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Liability Bodily Injury");

		// Adding Exposure
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_LiabilityBodilyInjury_UnspecifiedCostType_Medical() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		/// Click on "Actions" -> Choose by Coverage ->Vehicle---->Liability Bodily
		/// Injury
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Liability Bodily Injury");

		// Adding Exposure
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_LiabilityBodilyInjury_UnspecifiedCostType_Other() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		/// Click on "Actions" -> Choose by Coverage ->Vehicle---->Liability Bodily
		/// Injury
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Liability Bodily Injury");

		// Adding Exposure
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_LiabilityBodilyInjury_UnspecifiedCostType_Reimbursement() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		/// Click on "Actions" -> Choose by Coverage ->Vehicle---->Liability Bodily
		/// Injury
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Liability Bodily Injury");

		// Adding Exposure
		CC_Exposure.AddingExposure("InjuryNewIncident_AddBodyPart");

		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Click on "Actions" -> Under "Claim Actions" -> Click on "Validate Claim +
		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");

		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}
	// ------------------------------------------------------------------------------------------------------
}
