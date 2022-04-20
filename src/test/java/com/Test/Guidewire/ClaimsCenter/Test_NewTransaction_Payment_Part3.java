package com.Test.Guidewire.ClaimsCenter;

import org.testng.annotations.Test;

import com.pages.Guidewire.ClaimsCenter.CC_Exposure;
import com.pages.Guidewire.ClaimsCenter.CC_Financials;
import com.pages.Guidewire.ClaimsCenter.CC_NewClaimWizard;
import com.pages.Guidewire.ClaimsCenter.CC_NewTransaction_Check;
import com.pages.Guidewire.ClaimsCenter.CC_Reserve;
import com.pages.Guidewire.ClaimsCenter.CC_Reusables;

public class Test_NewTransaction_Payment_Part3 {
	@Test
	public void AUT_Payment_MexicoCovVehicleDamage_ExpenseAO_Salvage() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Mexico Cov Vehicle Damage");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("VehicleNewIncident");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();
		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_MexicoCovVehicleDamage_ExpenseAO_Vehicleappraisal() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Mexico Cov Vehicle Damage");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("VehicleNewIncident");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();
		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_MexicoCovVehicleDamage_ExpenseDCC_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Mexico Cov Vehicle Damage");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("VehicleNewIncident");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
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
	public void AUT_Payment_MexicoCovVehicleDamage_ExpenseDCC_Legal() throws Throwable {// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Mexico Cov Vehicle Damage");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("VehicleNewIncident");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
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
	public void AUT_Payment_MexicoCovVehicleDamage_ExpenseDCC_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Mexico Cov Vehicle Damage");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("VehicleNewIncident");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
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
	public void AUT_Payment_MexicoCovVehicleDamage_ExpenseDCC_Vehicleinspection() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Mexico Cov Vehicle Damage");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("VehicleNewIncident");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
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
	public void AUT_MexicoCovGenDamages_UnspecifiedCostType_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Mexico Cov Gen Damages");
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
	public void AUT_MexicoCovGenDamages_UnspecifiedCostType_Labor() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Mexico Cov Gen Damages");
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
	public void AUT_MexicoCovGenDamagesDamages_UnspecifiedCostType_Legal() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Mexico Cov Gen Damages");
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
	public void AUT_MexicoCovGenDamagesDamages_UnspecifiedCostType_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Mexico Cov Gen Damages");
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
	public void AUT_MexicoCovGenDamagesDamages_UnspecifiedCostType_Reimbursement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Mexico Cov Gen Damages");
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
	public void AUT_MexicoCovGenDamagesDamages_UnspecifiedCostType_Salvage() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Mexico Cov Gen Damages");
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
	public void AUT_MexicoCovGenDamagesDamages_UnspecifiedCostType_Settlement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Mexico Cov Gen Damages");
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
	public void AUT_MexicoCovGenDamagesDamages_UnspecifiedCostType_Towing() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Mexico Cov Gen Damages");
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
	public void AUT_MexicoCovGenDamagesDamages_UnspecifiedCostType_Vehicleappraisal() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Mexico Cov Gen Damages");
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
	public void AUT_MexicoCovGenDamagesDamages_UnspecifiedCostType_Vehicleinspection() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Mexico Cov Gen Damages");
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
	public void AUT_MexicoCovGenDamagesDamages_ClaimCost_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Mexico Cov Gen Damages");
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
	public void AUT_MexicoCovGenDamagesDamages_ClaimCost_Labor() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Mexico Cov Gen Damages");
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
	public void AUT_MexicoCovGenDamagesDamages_ClaimCost_Legal() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Mexico Cov Gen Damages");
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
	public void AUT_MexicoCovGenDamagesDamages_ClaimCost_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Mexico Cov Gen Damages");
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
	public void AUT_MexicoCovGenDamagesDamages_ClaimCost_Reimbursement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Mexico Cov Gen Damages");
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
	public void AUT_MexicoCovGenDamagesDamages_ClaimCost_Settlement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Mexico Cov Gen Damages");
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
	public void AUT_MexicoCovGenDamagesDamages_ClaimCost_Towing() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Mexico Cov Gen Damages");
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
	public void AUT_MexicoCovGenDamagesDamages_ClaimCost_Vehicleinspection() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Mexico Cov Gen Damages");
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
	public void AUT_MexicoCovGenDamagesDamages_ExpenseAO_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Mexico Cov Gen Damages");
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
	public void AUT_MexicoCovGenDamagesDamages_ExpenseAO_Legal() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Mexico Cov Gen Damages");
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
	public void AUT_MexicoCovGenDamagesDamages_ExpenseAO_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Mexico Cov Gen Damages");
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
	public void AUT_MexicoCovGenDamagesDamages_ExpenseAO_Salvage() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Mexico Cov Gen Damages");
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
	public void AUT_MexicoCovGenDamagesDamages_ExpenseAO_Vehicleappraisal() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Mexico Cov Gen Damages");
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
	public void AUT_MexicoCovGenDamagesDamages_ExpenseAO_Vehicleinspection() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Mexico Cov Gen Damages");
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
	public void AUT_MexicoCovGenDamagesDamages_ExpenseDCC_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Mexico Cov Gen Damages");
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
	public void AUT_MexicoCovGenDamagesDamages_ExpenseDCC_Legal() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Mexico Cov Gen Damages");
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
	public void AUT_MexicoCovGenDamagesDamages_ExpenseDCC_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Mexico Cov Gen Damages");
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
	public void AUT_MexicoCovGenDamagesDamages_ExpenseDCC_Vehicleinspection() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Mexico Cov Gen Damages");
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

	// -----------------------------------------------------------------------------------------------------------

	@Test
	public void AUT_MedicalPayments_UnspecifiedCostType_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Medical Payments");
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
	public void AUT_MedicalPayments_UnspecifiedCostType_LifetimeBenefits() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Medical Payments");
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
	public void AUT_MedicalPayments_UnspecifiedCostType_Medical() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Medical Payments");
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
	public void AUT_MedicalPayments_UnspecifiedCostType_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Medical Payments");
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
	public void AUT_MedicalPayments_UnspecifiedCostType_Reimbursement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Medical Payments");
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
	public void AUT_MedicalPayments_UnspecifiedCostType_Salvage() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Medical Payments");
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
	public void AUT_MedicalPayments_UnspecifiedCostType_Settlement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Medical Payments");
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
	public void AUT_MedicalPayments_UnspecifiedCostType_Vehicleappraisal() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Medical Payments");
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
	public void AUT_MedicalPayments_ClaimCost_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Medical Payments");
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
	public void AUT_MedicalPayments_ClaimCost_LifetimeBenefits() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Medical Payments");
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
	public void AUT_MedicalPayments_ClaimCost_Medical() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Medical Payments");
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
	public void AUT_MedicalPayments_ClaimCost_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Medical Payments");
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
	public void AUT_MedicalPayments_ClaimCost_Reimbursement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Medical Payments");
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
	public void AUT_MedicalPayments_ClaimCost_Settlement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Medical Payments");
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
	public void AUT_MedicalPayments_ExpenseAO_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Medical Payments");
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
	public void AUT_MedicalPayments_ExpenseAO_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Medical Payments");
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
	public void AUT_MedicalPayments_ExpenseAO_Salvage() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Medical Payments");
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
	public void AUT_MedicalPayments_ExpenseAO_Vehicleappraisal() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Medical Payments");
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
	public void AUT_MedicalPayments_ExpenseDCC_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Medical Payments");
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
	public void AUT_MedicalPayments_ExpenseDCC_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Medical Payments");
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

	// -------------------------------------------------------------------------------------------------
	@Test
	public void AUT_Payment_PIPArkansas_UnspecifiedCostType_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Arkansas");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPArkansas_UnspecifiedCostType_Burialexpenses() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Arkansas");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPArkansas_UnspecifiedCostType_Casemanagement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Arkansas");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPArkansas_UnspecifiedCostType_Deathbenefits() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Arkansas");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPArkansas_UnspecifiedCostType_Emergencyservices() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Arkansas");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPArkansas_UnspecifiedCostType_Lostwages() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Arkansas");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPArkansas_UnspecifiedCostType_Medical() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Arkansas");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPArkansas_UnspecifiedCostType_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Arkansas");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPArkansas_UnspecifiedCostType_Reimbursement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Arkansas");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPArkansas_UnspecifiedCostType_Vocational() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Arkansas");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPArkansas_ClaimCost_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Arkansas");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPArkansas_ClaimCost_Burialexpenses() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Arkansas");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPArkansas_ClaimCost_Deathbenefits() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Arkansas");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPArkansas_ClaimCost_Emergencyservices() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Arkansas");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPArkansas_ClaimCost_Lostwages() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Arkansas");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPArkansas_ClaimCost_Medical() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Arkansas");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPArkansas_ClaimCost_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Arkansas");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPArkansas_ClaimCost_Reimbursement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Arkansas");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPArkansas_ClaimCost_Vocational() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Arkansas");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPArkansas_ExpenseAO_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Arkansas");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPArkansas_ExpenseAO_Casemanagement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Arkansas");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPArkansas_ExpenseAO_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Arkansas");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPArkansas_ExpenseDCC_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Arkansas");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
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
	public void AUT_Payment_PIPArkansas_ExpenseDCC_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Arkansas");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
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

	// ------------------------------------------------------------------------------------
	@Test
	public void AUT_PIPDelaware_UnspecifiedCostType_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Delaware");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPDelaware_UnspecifiedCostType_Burialexpenses() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Delaware");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPDelaware_UnspecifiedCostType_Casemanagement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Delaware");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPDelaware_UnspecifiedCostType_Deathbenefits() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Delaware");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPDelaware_UnspecifiedCostType_Emergencyservices() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Delaware");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPDelaware_UnspecifiedCostType_Lostwages() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Delaware");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPDelaware_UnspecifiedCostType_Medical() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Delaware");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPDelaware_UnspecifiedCostType_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Delaware");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPDelaware_UnspecifiedCostType_Reimbursement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Delaware");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPDelaware_UnspecifiedCostType_Vocational() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Delaware");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPDelaware_ClaimCost_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Delaware");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPDelaware_ClaimCost_Burialexpenses() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Delaware");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPDelaware_ClaimCost_Deathbenefits() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Delaware");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPDelaware_ClaimCost_Emergencyservices() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Delaware");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPDelaware_ClaimCost_Lostwages() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Delaware");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPDelaware_ClaimCost_Medical() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Delaware");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPDelaware_ClaimCost_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Delaware");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPDelaware_ClaimCost_Reimbursement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Delaware");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPDelaware_ClaimCost_Vocational() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Delaware");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPDelaware_ExpenseAO_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Delaware");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPDelaware_ExpenseAO_Casemanagement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Delaware");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPDelaware_ExpenseAO_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Delaware");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPDelaware_ExpenseDCC_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Delaware");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
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
	public void AUT_PIPDelaware_ExpenseDCC_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Delaware");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
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

	// -------------------------------------------------------------------------------------------------------------------------------------------------------------------

	@Test
	public void AUT_Payment_PIPDistrictofColumbia_UnspecifiedCostType_UnspecifiedCostCategory() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP District of Columbia");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPDistrictofColumbia_UnspecifiedCostType_BurialExpenses() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP District of Columbia");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPDistrictofColumbia_UnspecifiedCostType_CaseManagement() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP District of Columbia");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPDistrictofColumbia_UnspecifiedCostType_DeathBenefits() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP District of Columbia");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPDistrictofColumbia_UnspecifiedCostType_EmergencyServices() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP District of Columbia");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPDistrictofColumbia_UnspecifiedCostType_LostWages() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP District of Columbia");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPDistrictofColumbia_UnspecifiedCostType_Medical() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP District of Columbia");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPDistrictofColumbia_UnspecifiedCostType_Other() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP District of Columbia");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPDistrictofColumbia_UnspecifiedCostType_Reimbursement() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP District of Columbia");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPDistrictofColumbia_UnspecifiedCostType_Vocational() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP District of Columbia");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPDistrictofColumbia_ClaimCost_UnspecifiedCostCategory() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP District of Columbia");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPDistrictofColumbia_ClaimCost_BurialExpenses() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP District of Columbia");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPDistrictofColumbia_ClaimCost_DeathBenefits() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP District of Columbia");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPDistrictofColumbia_ClaimCost_EmergencyServices() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP District of Columbia");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPDistrictofColumbia_ClaimCost_LostWages() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP District of Columbia");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPDistrictofColumbia_ClaimCost_Medical() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP District of Columbia");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPDistrictofColumbia_ClaimCost_Other() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP District of Columbia");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPDistrictofColumbia_ClaimCost_Reimbursement() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP District of Columbia");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPDistrictofColumbia_ClaimCost_Vocational() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP District of Columbia");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPDistrictofColumbia_ExpenseAO_UnspecifiedCostCategory() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP District of Columbia");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPDistrictofColumbia_ExpenseAO_CaseManagement() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP District of Columbia");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPDistrictofColumbia_ExpenseAO_Other() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP District of Columbia");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPDistrictofColumbia_ExpenseDCC_UnspecifiedCostCategory() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP District of Columbia");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
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
	public void AUT_Payment_PIPDistrictofColumbia_ExpenseDCC_Other() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP District of Columbia");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
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
	public void AUT_Payment_PIPFlorida_UnspecifiedCostType_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Florida");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPFlorida_UnspecifiedCostType_Burialexpenses() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Florida");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPFlorida_UnspecifiedCostType_Casemanagement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Florida");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPFlorida_UnspecifiedCostType_Deathbenefits() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Florida");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPFlorida_UnspecifiedCostType_Emergencyservices() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Florida");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPFlorida_UnspecifiedCostType_Lostwages() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Florida");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPFlorida_UnspecifiedCostType_Medical() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Florida");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPFlorida_UnspecifiedCostType_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Florida");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPFlorida_UnspecifiedCostType_Reimbursement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Florida");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPFlorida_UnspecifiedCostType_Vocational() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Florida");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPFlorida_ClaimCost_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Florida");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPFlorida_ClaimCost_Burialexpenses() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Florida");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPFlorida_ClaimCost_Deathbenefits() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Florida");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPFlorida_ClaimCost_Emergencyservices() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Florida");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPFlorida_ClaimCost_Lostwages() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Florida");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPFlorida_ClaimCost_Medical() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Florida");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPFlorida_ClaimCost_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Florida");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPFlorida_ClaimCost_Reimbursement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Florida");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPFlorida_ClaimCost_Vocational() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Florida");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPFlorida_ExpenseAO_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Florida");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPFlorida_ExpenseAO_Casemanagement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Florida");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPFlorida_ExpenseAO_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Florida");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_PIPFlorida_ExpenseDCC_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Florida");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
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
	public void AUT_Payment_PIPFlorida_ExpenseDCC_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Florida");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
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

	// --------------------------------------------------------------------------------------------------

	@Test
	public void AUT_PIPHawaii_UnspecifiedCostType_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Hawaii");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPHawaii_UnspecifiedCostType_Burialexpenses() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Hawaii");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPHawaii_UnspecifiedCostType_Casemanagement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Hawaii");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPHawaii_UnspecifiedCostType_Deathbenefits() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Hawaii");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPHawaii_UnspecifiedCostType_Emergencyservices() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Hawaii");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPHawaii_UnspecifiedCostType_Lostwages() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Hawaii");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPHawaii_UnspecifiedCostType_Medical() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Hawaii");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPHawaii_UnspecifiedCostType_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Hawaii");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPHawaii_UnspecifiedCostType_Reimbursement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Hawaii");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPHawaii_UnspecifiedCostType_Vocational() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Hawaii");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPHawaii_ClaimCost_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Hawaii");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPHawaii_ClaimCost_Burialexpenses() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Hawaii");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPHawaii_ClaimCost_Deathbenefits() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Hawaii");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPHawaii_ClaimCost_Emergencyservices() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Hawaii");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPHawaii_ClaimCost_Lostwages() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Hawaii");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPHawaii_ClaimCost_Medical() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Hawaii");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPHawaii_ClaimCost_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Hawaii");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPHawaii_ClaimCost_Reimbursement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Hawaii");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPHawaii_ClaimCost_Vocational() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Hawaii");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPHawaii_ExpenseAO_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Hawaii");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPHawaii_ExpenseAO_Casemanagement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Hawaii");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPHawaii_ExpenseAO_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Hawaii");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPHawaii_ExpenseDCC_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Hawaii");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
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
	public void AUT_PIPHawaii_ExpenseDCC_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Hawaii");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
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

	// ----------------------------------------------------------------------------------------------------------

	@Test
	public void AUT_PIPKansas_UnspecifiedCostType_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Kansas");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();

	}

	@Test
	public void AUT_PIPKansas_UnspecifiedCostType_Burialexpenses() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Kansas");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();

	}

	@Test
	public void AUT_PIPKansas_UnspecifiedCostType_Casemanagement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Kansas");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();

	}

	@Test
	public void AUT_PIPKansas_UnspecifiedCostType_Deathbenefits() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Kansas");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();

	}

	@Test
	public void AUT_PIPKansas_UnspecifiedCostType_Emergencyservices() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Kansas");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();

	}

	@Test
	public void AUT_PIPKansas_UnspecifiedCostType_Lostwages() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Kansas");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();

	}

	@Test
	public void AUT_PIPKansas_UnspecifiedCostType_Medical() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Kansas");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();

	}

	@Test
	public void AUT_PIPKansas_UnspecifiedCostType_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Kansas");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();

	}

	@Test
	public void AUT_PIPKansas_UnspecifiedCostType_Reimbursement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Kansas");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();

	}

	@Test
	public void AUT_PIPKansas_UnspecifiedCostType_Vocational() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Kansas");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();

	}

	@Test
	public void AUT_PIPKansas_ClaimCost_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Kansas");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();

	}

	@Test
	public void AUT_PIPKansas_ClaimCost_Burialexpenses() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Kansas");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();

	}

	@Test
	public void AUT_PIPKansas_ClaimCost_Deathbenefits() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Kansas");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();

	}

	@Test
	public void AUT_PIPKansas_ClaimCost_Emergencyservices() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Kansas");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();

	}

	@Test
	public void AUT_PIPKansas_ClaimCost_Lostwages() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Kansas");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_PIPKansas_ClaimCost_Medical() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Kansas");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();

	}

	@Test
	public void AUT_PIPKansas_ClaimCost_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Kansas");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();

	}

	@Test
	public void AUT_PIPKansas_ClaimCost_Reimbursement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Kansas");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();

	}

	@Test
	public void AUT_PIPKansas_ClaimCost_Vocational() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Kansas");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();

	}

	@Test
	public void AUT_PIPKansas_ExpenseAO_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Kansas");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();

	}

	@Test
	public void AUT_PIPKansas_ExpenseAO_Casemanagement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Kansas");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();

	}

	@Test
	public void AUT_PIPKansas_ExpenseAO_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Kansas");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		CC_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		CC_Reusables.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		CC_Exposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();

	}

	@Test
	public void AUT_PIPKansas_ExpenseDCC_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Kansas");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
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
	public void AUT_PIPKansas_ExpenseDCC_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("PIP Kansas");
		// Adding NewExposure Collision Limited Coverage
		CC_Exposure.AddingExposure("InjuryNewIncident_PIP");
		// ----->Click on Action-Reserve
		CC_Reusables.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
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

	// -----------------------------------------------------------------------------------------------------

	@Test

	public void AUT_Payment_PIPKentucky_UnspecifiedCostType_UnspecifiedCostCategory() throws Throwable {
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
	public void AUT_Payment_PIPKentucky_UnspecifiedCostType_Burialexpenses() throws Throwable {
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

}
