package com.Test.Guidewire.ClaimsCenter;

import org.testng.annotations.Test;

import com.pages.Guidewire.ClaimsCenter.CC_Exposure;
import com.pages.Guidewire.ClaimsCenter.CC_Financials;
import com.pages.Guidewire.ClaimsCenter.CC_NewClaimWizard;
import com.pages.Guidewire.ClaimsCenter.CC_NewTransaction_Check;
import com.pages.Guidewire.ClaimsCenter.CC_Reserve;
import com.pages.Guidewire.ClaimsCenter.CC_Reusables;

public class Test_NewTransaction_Payment_Part2 {

	@Test
	public void AUT_Payment_LiabilityBodilyInjury_UnspecifiedCostType_Rental() throws Throwable {

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
	public void AUT_Payment_LiabilityBodilyInjury_UnspecifiedCostType_Salvage() throws Throwable {

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
	public void AUT_Payment_LiabilityBodilyInjury_UnspecifiedCostType_Settlement() throws Throwable {

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
	public void AUT_Payment_LiabilityBodilyInjury_UnspecifiedCostType_Towing() throws Throwable {

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
	public void AUT_Payment_LiabilityBodilyInjury_UnspecifiedCostType_Vehicleappraisal() throws Throwable {

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
	public void AUT_Payment_LiabilityBodilyInjury_UnspecifiedCostType_Vehicleinspection() throws Throwable {

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
	public void AUT_Payment_LiabilityBodilyInjury_ClaimCost_UnspecifiedCostCategory() throws Throwable {

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
	public void AUT_Payment_LiabilityBodilyInjury_ClaimCost_AutoBody() throws Throwable {

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
	public void AUT_Payment_LiabilityBodilyInjury_ClaimCost_Autoparts() throws Throwable {

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
	public void AUT_Payment_LiabilityBodilyInjury_ClaimCost_DeathBenefits() throws Throwable {

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
	public void AUT_Payment_LiabilityBodilyInjury_ClaimCost_EmergencyServices() throws Throwable {

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
	public void AUT_Payment_LiabilityBodilyInjury_ClaimCost_Glass() throws Throwable {

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
	public void AUT_Payment_LiabilityBodilyInjury_ClaimCost_Labor() throws Throwable {

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
	public void AUT_Payment_LiabilityBodilyInjury_ClaimCost_Legal() throws Throwable {

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
	public void AUT_Payment_LiabilityBodilyInjury_ClaimCost_LifetimeBenefits() throws Throwable {

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
	public void AUT_Payment_LiabilityBodilyInjury_ClaimCost_LostWages() throws Throwable {

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
	public void AUT_Payment_LiabilityBodilyInjury_ClaimCost_Medical() throws Throwable {

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
	public void AUT_Payment_LiabilityBodilyInjury_ClaimCost_Other() throws Throwable {

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
	public void AUT_Payment_LiabilityBodilyInjury_ClaimCost_Reimbursement() throws Throwable {

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
	public void AUT_Payment_LiabilityBodilyInjury_ClaimCost_Rental() throws Throwable {

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
	public void AUT_Payment_LiabilityBodilyInjury_ClaimCost_Settlement() throws Throwable {

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
	public void AUT_Payment_LiabilityBodilyInjury_ClaimCost_Towing() throws Throwable {

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
	public void AUT_Payment_LiabilityBodilyInjury_ClaimCost_Vehicleinspection() throws Throwable {

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
	public void AUT_Payment_LiabilityBodilyInjury_ExpenseAO_UnspecifiedCostCategory() throws Throwable {

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
	public void AUT_Payment_LiabilityBodilyInjury_ExpenseAO_Legal() throws Throwable {

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
	public void AUT_Payment_LiabilityBodilyInjury_ExpenseAO_Other() throws Throwable {

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
	public void AUT_Payment_LiabilityBodilyInjury_ExpenseAO_Salvage() throws Throwable {

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
	public void AUT_Payment_LiabilityBodilyInjury_ExpenseAO_Vehicleappraisal() throws Throwable {

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
	public void AUT_Payment_LiabilityBodilyInjury_ExpenseAO_Vehicleinspection() throws Throwable {

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
	public void AUT_Payment_LiabilityBodilyInjury_ExpenseDCC_UnspecifiedCostCategory() throws Throwable {

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
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_1();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_LiabilityBodilyInjury_ExpenseDCC_Legal() throws Throwable {

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
	public void AUT_Payment_LiabilityBodilyInjury_ExpenseDCC_Other() throws Throwable {

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
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_1();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_LiabilityBodilyInjury_ExpenseDCC_Vehicleinspection() throws Throwable {

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
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_1();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	// ---------------------------------------------------------------------------------------------------
	@Test
	public void AUT_Payment_LiabilityPropertyDamage_UnspecifiedCostType_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Liability Property Damage");
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
	public void AUT_Payment_LiabilityPropertyDamage_UnspecifiedCostType_Autobody() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Liability Property Damage");
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
	public void AUT_Payment_LiabilityPropertyDamage_UnspecifiedCostType_Autoparts() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Liability Property Damage");
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
	public void AUT_Payment_LiabilityPropertyDamage_UnspecifiedCostType_DeathBenefits() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Liability Property Damage");
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
	public void AUT_Payment_LiabilityPropertyDamage_UnspecifiedCostType_EmergencyServices() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Liability Property Damage");
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
	public void AUT_Payment_LiabilityPropertyDamage_UnspecifiedCostType_Glass() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Liability Property Damage");
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
	public void AUT_Payment_LiabilityPropertyDamage_UnspecifiedCostType_Labor() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Liability Property Damage");
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
	public void AUT_Payment_LiabilityPropertyDamage_UnspecifiedCostType_Legal() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Liability Property Damage");
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
	public void AUT_Payment_LiabilityPropertyDamage_UnspecifiedCostType_LifetimeBenefits() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Liability Property Damage");
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
	public void AUT_Payment_LiabilityPropertyDamage_UnspecifiedCostType_LostWages() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Liability Property Damage");
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
	public void AUT_Payment_LiabilityPropertyDamage_UnspecifiedCostType_Medical() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Liability Property Damage");
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
	public void AUT_Payment_LiabilityPropertyDamage_UnspecifiedCostType_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Liability Property Damage");
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
	public void AUT_Payment_LiabilityPropertyDamage_UnspecifiedCostType_Reimbursement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Liability Property Damage");
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
	public void AUT_Payment_LiabilityPropertyDamage_UnspecifiedCostType_Rental() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Liability Property Damage");
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
	public void AUT_Payment_LiabilityPropertyDamage_UnspecifiedCostType_Salvage() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Liability Property Damage");
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
	public void AUT_Payment_LiabilityPropertyDamage_UnspecifiedCostType_Settlement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Liability Property Damage");
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
	public void AUT_Payment_LiabilityPropertyDamage_UnspecifiedCostType_Towing() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Liability Property Damage");
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
	public void AUT_Payment_LiabilityPropertyDamage_UnspecifiedCostType_Vehicleappraisal() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Liability Property Damage");
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
	public void AUT_Payment_LiabilityPropertyDamage_UnspecifiedCostType_Vehicleinspection() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Liability Property Damage");
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
	public void AUT_Payment_LiabilityPropertyDamage_ClaimCost_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Liability Property Damage");
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
	public void AUT_Payment_LiabilityPropertyDamage_ClaimCost_AutoBody() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Liability Property Damage");
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
	public void AUT_Payment_LiabilityPropertyDamage_ClaimCost_Autoparts() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Liability Property Damage");
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
	public void AUT_Payment_LiabilityPropertyDamage_ClaimCost_DeathBenefits() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Liability Property Damage");
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
	public void AUT_Payment_LiabilityPropertyDamage_ClaimCost_EmergencyServices() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Liability Property Damage");
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
	public void AUT_Payment_LiabilityPropertyDamage_ClaimCost_Glass() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Liability Property Damage");
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
	public void AUT_Payment_LiabilityPropertyDamage_ClaimCost_Labor() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Liability Property Damage");
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
	public void AUT_Payment_LiabilityPropertyDamage_ClaimCost_Legal() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Liability Property Damage");
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
	public void AUT_Payment_LiabilityPropertyDamage_ClaimCost_LifetimeBenefits() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Liability Property Damage");
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
	public void AUT_Payment_LiabilityPropertyDamage_ClaimCost_LostWages() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Liability Property Damage");
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
	public void AUT_Payment_LiabilityPropertyDamage_ClaimCost_Medical() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Liability Property Damage");
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
	public void AUT_Payment_LiabilityPropertyDamage_ClaimCost_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Liability Property Damage");
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
	public void AUT_Payment_LiabilityPropertyDamage_ClaimCost_Reimbursement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Liability Property Damage");
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
	public void AUT_Payment_LiabilityPropertyDamage_ClaimCost_Rental() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Liability Property Damage");
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
	public void AUT_Payment_LiabilityPropertyDamage_ClaimCost_Settlement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Liability Property Damage");
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
	public void AUT_Payment_LiabilityPropertyDamage_ClaimCost_Towing() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Liability Property Damage");
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
	public void AUT_Payment_LiabilityPropertyDamage_ClaimCost_Vehicleinspection() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Liability Property Damage");
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
	public void AUT_Payment_LiabilityPropertyDamage_ExpenseAO_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Liability Property Damage");
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
	public void AUT_Payment_LiabilityPropertyDamage_ExpenseAO_Legal() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Liability Property Damage");
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
	public void AUT_Payment_LiabilityPropertyDamage_ExpenseAO_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Liability Property Damage");
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
	public void AUT_Payment_LiabilityPropertyDamage_ExpenseAO_Salvage() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Liability Property Damage");
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
	public void AUT_Payment_LiabilityPropertyDamage_ExpenseAO_Vehicleappraisal() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Liability Property Damage");
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
	public void AUT_Payment_LiabilityPropertyDamage_ExpenseAO_Vehicleinspection() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Liability Property Damage");
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
	public void AUT_Payment_LiabilityPropertyDamage_ExpenseDCC_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Liability Property Damage");
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
	public void AUT_Payment_LiabilityPropertyDamage_ExpenseDCC_Legal() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Liability Property Damage");
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
	public void AUT_Payment_LiabilityPropertyDamage_ExpenseDCC_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Liability Property Damage");
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
	public void AUT_Payment_LiabilityPropertyDamage_ExpenseDCC_Vehicleinspection() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Liability Property Damage");
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

	// ------------------------------------------------------------------------------------------------------------------------
	@Test
	public void AUT_Payment_LiabilityVehicle_UnspecifiedCostType_UnspecifiedCostCategory() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		/// Click on "Actions" -> Choose by Coverage ->Vehicle---->Liability Bodily
		/// Injury
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Liability Vehicle Damage");

		// Adding Exposure
		CC_Exposure.AddingExposure("VehicleNewIncident");

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
	public void AUT_Payment_LiabilityVehicle_UnspecifiedCostType_AutoBody() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		/// Click on "Actions" -> Choose by Coverage ->Vehicle---->Liability Bodily
		/// Injury
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Liability Vehicle Damage");

		// Adding Exposure
		CC_Exposure.AddingExposure("VehicleNewIncident");

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
	public void AUT_Payment_LiabilityVehicle_UnspecifiedCostType_AutoParts() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		/// Click on "Actions" -> Choose by Coverage ->Vehicle---->Liability Bodily
		/// Injury
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Liability Vehicle Damage");

		// Adding Exposure
		CC_Exposure.AddingExposure("VehicleNewIncident");

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
	public void AUT_Payment_LiabilityVehicle_UnspecifiedCostType_DeathBenefits() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		/// Click on "Actions" -> Choose by Coverage ->Vehicle---->Liability Bodily
		/// Injury
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Liability Vehicle Damage");

		// Adding Exposure
		CC_Exposure.AddingExposure("VehicleNewIncident");

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
	public void AUT_Payment_LiabilityVehicle_UnspecifiedCostType_EmergencyServices() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		/// Click on "Actions" -> Choose by Coverage ->Vehicle---->Liability Bodily
		/// Injury
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Liability Vehicle Damage");

		// Adding Exposure
		CC_Exposure.AddingExposure("VehicleNewIncident");

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
	public void AUT_Payment_LiabilityVehicle_UnspecifiedCostType_Glass() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		/// Click on "Actions" -> Choose by Coverage ->Vehicle---->Liability Bodily
		/// Injury
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Liability Vehicle Damage");

		// Adding Exposure
		CC_Exposure.AddingExposure("VehicleNewIncident");

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
	public void AUT_Payment_LiabilityVehicle_UnspecifiedCostType_Labor() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		/// Click on "Actions" -> Choose by Coverage ->Vehicle---->Liability Bodily
		/// Injury
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Liability Vehicle Damage");

		// Adding Exposure
		CC_Exposure.AddingExposure("VehicleNewIncident");

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
	public void AUT_Payment_LiabilityVehicle_UnspecifiedCostType_Legal() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		/// Click on "Actions" -> Choose by Coverage ->Vehicle---->Liability Bodily
		/// Injury
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Liability Vehicle Damage");

		// Adding Exposure
		CC_Exposure.AddingExposure("VehicleNewIncident");

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
	public void AUT_Payment_LiabilityVehicle_UnspecifiedCostType_LifetimeBenefits() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		/// Click on "Actions" -> Choose by Coverage ->Vehicle---->Liability Bodily
		/// Injury
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Liability Vehicle Damage");

		// Adding Exposure
		CC_Exposure.AddingExposure("VehicleNewIncident");

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
	public void AUT_Payment_LiabilityVehicle_UnspecifiedCostType_LostWages() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		/// Click on "Actions" -> Choose by Coverage ->Vehicle---->Liability Bodily
		/// Injury
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Liability Vehicle Damage");

		// Adding Exposure
		CC_Exposure.AddingExposure("VehicleNewIncident");

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
	public void AUT_Payment_LiabilityVehicle_UnspecifiedCostType_Medical() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		/// Click on "Actions" -> Choose by Coverage ->Vehicle---->Liability Bodily
		/// Injury
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Liability Vehicle Damage");

		// Adding Exposure
		CC_Exposure.AddingExposure("VehicleNewIncident");

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
	public void AUT_Payment_LiabilityVehicle_UnspecifiedCostType_Other() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		/// Click on "Actions" -> Choose by Coverage ->Vehicle---->Liability Bodily
		/// Injury
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Liability Vehicle Damage");

		// Adding Exposure
		CC_Exposure.AddingExposure("VehicleNewIncident");

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
	public void AUT_Payment_LiabilityVehicle_UnspecifiedCostType_Reimbursement() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		/// Click on "Actions" -> Choose by Coverage ->Vehicle---->Liability Bodily
		/// Injury
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Liability Vehicle Damage");

		// Adding Exposure
		CC_Exposure.AddingExposure("VehicleNewIncident");

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
	public void AUT_Payment_LiabilityVehicle_UnspecifiedCostType_Rental() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		/// Click on "Actions" -> Choose by Coverage ->Vehicle---->Liability Bodily
		/// Injury
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Liability Vehicle Damage");

		// Adding Exposure
		CC_Exposure.AddingExposure("VehicleNewIncident");

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
	public void AUT_Payment_LiabilityVehicle_UnspecifiedCostType_Salvage() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		/// Click on "Actions" -> Choose by Coverage ->Vehicle---->Liability Bodily
		/// Injury
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Liability Vehicle Damage");

		// Adding Exposure
		CC_Exposure.AddingExposure("VehicleNewIncident");

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
	public void AUT_Payment_LiabilityVehicle_UnspecifiedCostType_Settlement() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		/// Click on "Actions" -> Choose by Coverage ->Vehicle---->Liability Bodily
		/// Injury
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Liability Vehicle Damage");

		// Adding Exposure
		CC_Exposure.AddingExposure("VehicleNewIncident");

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
	public void AUT_Payment_LiabilityVehicle_UnspecifiedCostType_Towing() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		/// Click on "Actions" -> Choose by Coverage ->Vehicle---->Liability Bodily
		/// Injury
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Liability Vehicle Damage");

		// Adding Exposure
		CC_Exposure.AddingExposure("VehicleNewIncident");

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
	public void AUT_Payment_LiabilityVehicle_UnspecifiedCostType_Vehicleappraisal() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		/// Click on "Actions" -> Choose by Coverage ->Vehicle---->Liability Bodily
		/// Injury
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Liability Vehicle Damage");

		// Adding Exposure
		CC_Exposure.AddingExposure("VehicleNewIncident");

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
	public void AUT_Payment_LiabilityVehicle_UnspecifiedCostType_Vehicleinspection() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		/// Click on "Actions" -> Choose by Coverage ->Vehicle---->Liability Bodily
		/// Injury
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Liability Vehicle Damage");

		// Adding Exposure
		CC_Exposure.AddingExposure("VehicleNewIncident");

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
	public void AUT_Payment_LiabilityVehicle_ClaimCost_UnspecifiedCostCategory() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		/// Click on "Actions" -> Choose by Coverage ->Vehicle---->Liability Bodily
		/// Injury
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Liability Vehicle Damage");

		// Adding Exposure
		CC_Exposure.AddingExposure("VehicleNewIncident");

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
	public void AUT_Payment_LiabilityVehicle_ClaimCost_AutoParts() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		/// Click on "Actions" -> Choose by Coverage ->Vehicle---->Liability Bodily
		/// Injury
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Liability Vehicle Damage");

		// Adding Exposure
		CC_Exposure.AddingExposure("VehicleNewIncident");

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
	public void AUT_Payment_LiabilityVehicle_ClaimCost_DeathBenefits() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		/// Click on "Actions" -> Choose by Coverage ->Vehicle---->Liability Bodily
		/// Injury
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Liability Vehicle Damage");

		// Adding Exposure
		CC_Exposure.AddingExposure("VehicleNewIncident");

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
	public void AUT_Payment_LiabilityVehicle_ClaimCost_EmergencyServices() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		/// Click on "Actions" -> Choose by Coverage ->Vehicle---->Liability Bodily
		/// Injury
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Liability Vehicle Damage");

		// Adding Exposure
		CC_Exposure.AddingExposure("VehicleNewIncident");

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
	public void AUT_Payment_LiabilityVehicle_ClaimCost_Glass() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		/// Click on "Actions" -> Choose by Coverage ->Vehicle---->Liability Bodily
		/// Injury
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Liability Vehicle Damage");

		// Adding Exposure
		CC_Exposure.AddingExposure("VehicleNewIncident");

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
	public void AUT_Payment_LiabilityVehicle_ClaimCost_Labor() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		/// Click on "Actions" -> Choose by Coverage ->Vehicle---->Liability Bodily
		/// Injury
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Liability Vehicle Damage");

		// Adding Exposure
		CC_Exposure.AddingExposure("VehicleNewIncident");

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
	public void AUT_Payment_LiabilityVehicle_ClaimCost_Legal() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		/// Click on "Actions" -> Choose by Coverage ->Vehicle---->Liability Bodily
		/// Injury
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Liability Vehicle Damage");

		// Adding Exposure
		CC_Exposure.AddingExposure("VehicleNewIncident");

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
	public void AUT_Payment_LiabilityVehicle_ClaimCost_LifetimeBenefits() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		/// Click on "Actions" -> Choose by Coverage ->Vehicle---->Liability Bodily
		/// Injury
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Liability Vehicle Damage");

		// Adding Exposure
		CC_Exposure.AddingExposure("VehicleNewIncident");

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
	public void AUT_Payment_LiabilityVehicle_ClaimCost_LostWages() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		/// Click on "Actions" -> Choose by Coverage ->Vehicle---->Liability Bodily
		/// Injury
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Liability Vehicle Damage");

		// Adding Exposure
		CC_Exposure.AddingExposure("VehicleNewIncident");

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
	public void AUT_Payment_LiabilityVehicle_ClaimCost_Medical() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		/// Click on "Actions" -> Choose by Coverage ->Vehicle---->Liability Bodily
		/// Injury
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Liability Vehicle Damage");

		// Adding Exposure
		CC_Exposure.AddingExposure("VehicleNewIncident");

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
	public void AUT_Payment_LiabilityVehicle_ClaimCost_Other() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		/// Click on "Actions" -> Choose by Coverage ->Vehicle---->Liability Bodily
		/// Injury
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Liability Vehicle Damage");

		// Adding Exposure
		CC_Exposure.AddingExposure("VehicleNewIncident");

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
	public void AUT_Payment_LiabilityVehicle_ClaimCost_Reimbursement() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		/// Click on "Actions" -> Choose by Coverage ->Vehicle---->Liability Bodily
		/// Injury
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Liability Vehicle Damage");

		// Adding Exposure
		CC_Exposure.AddingExposure("VehicleNewIncident");

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
	public void AUT_Payment_LiabilityVehicle_ClaimCost_Rental() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		/// Click on "Actions" -> Choose by Coverage ->Vehicle---->Liability Bodily
		/// Injury
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Liability Vehicle Damage");

		// Adding Exposure
		CC_Exposure.AddingExposure("VehicleNewIncident");

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
	public void AUT_Payment_LiabilityVehicle_ClaimCost_Settlement() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		/// Click on "Actions" -> Choose by Coverage ->Vehicle---->Liability Bodily
		/// Injury
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Liability Vehicle Damage");

		// Adding Exposure
		CC_Exposure.AddingExposure("VehicleNewIncident");

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
	public void AUT_Payment_LiabilityVehicle_ClaimCost_Towing() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		/// Click on "Actions" -> Choose by Coverage ->Vehicle---->Liability Bodily
		/// Injury
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Liability Vehicle Damage");

		// Adding Exposure
		CC_Exposure.AddingExposure("VehicleNewIncident");

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
	public void AUT_Payment_LiabilityVehicle_ClaimCost_Vehicleinspection() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		/// Click on "Actions" -> Choose by Coverage ->Vehicle---->Liability Bodily
		/// Injury
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Liability Vehicle Damage");

		// Adding Exposure
		CC_Exposure.AddingExposure("VehicleNewIncident");

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
	public void AUT_Payment_LiabilityVehicle_ExpenseAO_UnspecifiedCostCategory() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		/// Click on "Actions" -> Choose by Coverage ->Vehicle---->Liability Bodily
		/// Injury
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Liability Vehicle Damage");

		// Adding Exposure
		CC_Exposure.AddingExposure("VehicleNewIncident");

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
	public void AUT_Payment_LiabilityVehicle_ExpenseAO_Legal() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		/// Click on "Actions" -> Choose by Coverage ->Vehicle---->Liability Bodily
		/// Injury
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Liability Vehicle Damage");

		// Adding Exposure
		CC_Exposure.AddingExposure("VehicleNewIncident");

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
	public void AUT_Payment_LiabilityVehicle_ExpenseAO_Other() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		/// Click on "Actions" -> Choose by Coverage ->Vehicle---->Liability Bodily
		/// Injury
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Liability Vehicle Damage");

		// Adding Exposure
		CC_Exposure.AddingExposure("VehicleNewIncident");

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
	public void AUT_Payment_LiabilityVehicle_ExpenseAO_Salvage() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		/// Click on "Actions" -> Choose by Coverage ->Vehicle---->Liability Bodily
		/// Injury
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Liability Vehicle Damage");

		// Adding Exposure
		CC_Exposure.AddingExposure("VehicleNewIncident");

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
	public void AUT_Payment_LiabilityVehicle_ExpenseAO_Vehicleappraisal() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		/// Click on "Actions" -> Choose by Coverage ->Vehicle---->Liability Bodily
		/// Injury
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Liability Vehicle Damage");

		// Adding Exposure
		CC_Exposure.AddingExposure("VehicleNewIncident");

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
	public void AUT_Payment_LiabilityVehicle_ExpenseDCC_UnspecifiedCostCategory() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		/// Click on "Actions" -> Choose by Coverage ->Vehicle---->Liability Bodily
		/// Injury
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Liability Vehicle Damage");

		// Adding Exposure
		CC_Exposure.AddingExposure("VehicleNewIncident");

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
	public void AUT_Payment_LiabilityVehicle_ExpenseDCC_Legal() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		/// Click on "Actions" -> Choose by Coverage ->Vehicle---->Liability Bodily
		/// Injury
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Liability Vehicle Damage");

		// Adding Exposure
		CC_Exposure.AddingExposure("VehicleNewIncident");

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
	public void AUT_Payment_LiabilityVehicle_ExpenseDCC_Other() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		/// Click on "Actions" -> Choose by Coverage ->Vehicle---->Liability Bodily
		/// Injury
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Liability Vehicle Damage");

		// Adding Exposure
		CC_Exposure.AddingExposure("VehicleNewIncident");

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
	public void AUT_Payment_LiabilityVehicle_ExpenseDCC_Vehicleinspection() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		/// Click on "Actions" -> Choose by Coverage ->Vehicle---->Liability Bodily
		/// Injury
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Liability Vehicle Damage");

		// Adding Exposure
		CC_Exposure.AddingExposure("VehicleNewIncident");

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

	// ----------------------------------------------------------------------------------------------------------------

	@Test
	public void AUT_Payment_MexicoCovBI_UnspecifiedCostType_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Mexico Cov BI");
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
	public void AUT_Payment_MexicoCovBI_UnspecifiedCostType_Labor() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Mexico Cov BI");
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
	public void AUT_Payment_MexicoCovBI_UnspecifiedCostType_Legal() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Mexico Cov BI");
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
	public void AUT_Payment_MexicoCovBI_UnspecifiedCostType_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Mexico Cov BI");
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
	public void AUT_Payment_MexicoCovBI_UnspecifiedCostType_Reimbursement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Mexico Cov BI");
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
	public void AUT_Payment_MexicoCovBI_UnspecifiedCostType_Salvage() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Mexico Cov BI");
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
	public void AUT_Payment_MexicoCovBI_UnspecifiedCostType_Settlement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Mexico Cov BI");
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
	public void AUT_Payment_MexicoCovBI_UnspecifiedCostType_Towing() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Mexico Cov BI");
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
	public void AUT_Payment_MexicoCovBI_UnspecifiedCostType_Vehicleappraisal() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Mexico Cov BI");
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
	public void AUT_Payment_MexicoCovBI_UnspecifiedCostType_Vehicleinspection() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Mexico Cov BI");
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
	public void AUT_Payment_MexicoCovBI_ClaimCost_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Mexico Cov BI");
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
	public void AUT_Payment_MexicoCovBI_ClaimCost_Labor() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Mexico Cov BI");
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
	public void AUT_Payment_MexicoCovBI_ClaimCost_Legal() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Mexico Cov BI");
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
	public void AUT_Payment_MexicoCovBI_ClaimCost_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Mexico Cov BI");
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
	public void AUT_Payment_MexicoCovBI_ClaimCost_Reimbursement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Mexico Cov BI");
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
	public void AUT_Payment_MexicoCovBI_ClaimCost_Settlement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Mexico Cov BI");
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
	public void AUT_Payment_MexicoCovBI_ClaimCost_Towing() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Mexico Cov BI");
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
	public void AUT_Payment_MexicoCovBI_ClaimCost_Vehicleinspection() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Mexico Cov BI");
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
	public void AUT_Payment_MexicoCovBI_ExpenseAO_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Mexico Cov BI");
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
	public void AUT_Payment_MexicoCovBI_ExpenseAO_Legal() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Mexico Cov BI");
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
	public void AUT_Payment_MexicoCovBI_ExpenseAO_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Mexico Cov BI");
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
	public void AUT_Payment_MexicoCovBI_ExpenseAO_Salvage() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Mexico Cov BI");
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
	public void AUT_Payment_MexicoCovBI_ExpenseAO_Vehicleappraisal() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Mexico Cov BI");
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
	public void AUT_Payment_MexicoCovBI_ExpenseAO_Vehicleinspection() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Mexico Cov BI");
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
	public void AUT_Payment_MexicoCovBI_ExpenseDCC_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Mexico Cov BI");
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
	public void AUT_Payment_MexicoCovBI_ExpenseDCC_Legal() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Mexico Cov BI");
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
	public void AUT_Payment_MexicoCovBI_ExpenseDCC_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Mexico Cov BI");
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
	public void AUT_Payment_MexicoCovBI_ExpenseDCC_Vehicleinspection() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Mexico Cov BI");
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

	// --------------------------------------------------------------------------------------------------------------------

	@Test
	public void AUT_MexicoCovPD_UnspecifiedCostType_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Mexico Cov PD");
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
	public void AUT_MexicoCovPD_UnspecifiedCostType_Labor() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Mexico Cov PD");
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
	public void AUT_MexicoCovPD_UnspecifiedCostType_Legal() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Mexico Cov PD");
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
	public void AUT_MexicoCovPD_UnspecifiedCostType_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Mexico Cov PD");
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
	public void AUT_MexicoCovPD_UnspecifiedCostType_Reimbursement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Mexico Cov PD");
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
	public void AUT_MexicoCovPD_UnspecifiedCostType_Salvage() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Mexico Cov PD");
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
	public void AUT_MexicoCovPD_UnspecifiedCostType_Settlement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Mexico Cov PD");
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
	public void AUT_MexicoCovPD_UnspecifiedCostType_Towing() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Mexico Cov PD");
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
	public void AUT_MexicoCovPD_UnspecifiedCostType_Vehicleappraisal() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Mexico Cov PD");
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
	public void AUT_MexicoCovPD_UnspecifiedCostType_Vehicleinspection() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Mexico Cov PD");
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
	public void AUT_MexicoCovPD_ClaimCost_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Mexico Cov PD");
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
	public void AUT_MexicoCovPD_ClaimCost_Labor() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Mexico Cov PD");
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
	public void AUT_MexicoCovPD_ClaimCost_Legal() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Mexico Cov PD");
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
	public void AUT_MexicoCovPD_ClaimCost_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Mexico Cov PD");
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
	public void AUT_MexicoCovPD_ClaimCost_Reimbursement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Mexico Cov PD");
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
	public void AUT_MexicoCovPD_ClaimCost_Settlement() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Mexico Cov PD");
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
	public void AUT_MexicoCovPD_ClaimCost_Towing() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Mexico Cov PD");
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
	public void AUT_MexicoCovPD_ClaimCost_Vehicleinspection() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Mexico Cov PD");
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
	public void AUT_MexicoCovPD_ExpenseAO_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Mexico Cov PD");
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
	public void AUT_MexicoCovPD_ExpenseAO_Legal() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Mexico Cov PD");
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
	public void AUT_MexicoCovPD_ExpenseAO_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Mexico Cov PD");
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
	public void AUT_MexicoCovPD_ExpenseAO_Salvage() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Mexico Cov PD");
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
	public void AUT_MexicoCovPD_ExpenseAO_Vehicleappraisal() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Mexico Cov PD");
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
	public void AUT_MexicoCovPD_ExpenseAO_Vehicleinspection() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Mexico Cov PD");
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
	public void AUT_MexicoCovPD_ExpenseDCC_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Mexico Cov PD");
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
	public void AUT_MexicoCovPD_ExpenseDCC_Legal() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Mexico Cov PD");
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
	public void AUT_MexicoCovPD_ExpenseDCC_Other() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Mexico Cov PD");
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
	public void AUT_MexicoCovPD_ExpenseDCC_Vehicleinspection() throws Throwable {
		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		CC_Reusables.ccMenuNavigation("ChoosebyCoverage Mexico Cov PD");
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
	// -------------------------------------------------------------------------------------------------------------------------------

	@Test
	public void AUT_Payment_MexicoCovVehicleDamage_UnspecifiedCostType_UnspecifiedCostCategory() throws Throwable {
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
	public void AUT_Payment_MexicoCovVehicleDamage_UnspecifiedCostType_Labor() throws Throwable {
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
	public void AUT_Payment_MexicoCovVehicleDamage_UnspecifiedCostType_Legal() throws Throwable {
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
	public void AUT_Payment_MexicoCovVehicleDamage_UnspecifiedCostType_Other() throws Throwable {
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
	public void AUT_Payment_MexicoCovVehicleDamage_UnspecifiedCostType_Reimbursement() throws Throwable {
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
	public void AUT_Payment_MexicoCovVehicleDamage_UnspecifiedCostType_Salvage() throws Throwable {
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
	public void AUT_Payment_MexicoCovVehicleDamage_UnspecifiedCostType_Settlement() throws Throwable {
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
	public void AUT_Payment_MexicoCovVehicleDamage_UnspecifiedCostType_Towing() throws Throwable {
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
	public void AUT_Payment_MexicoCovVehicleDamage_UnspecifiedCostType_Vehicleappraisal() throws Throwable {
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
	public void AUT_Payment_MexicoCovVehicleDamage_UnspecifiedCostType_Vehicleinspection() throws Throwable {
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
	public void AUT_Payment_MexicoCovVehicleDamage_ClaimCost_UnspecifiedCostCategory() throws Throwable {
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
	public void AUT_Payment_MexicoCovVehicleDamage_ClaimCost_Labor() throws Throwable {
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
	public void AUT_Payment_MexicoCovVehicleDamage_ClaimCost_Legal() throws Throwable {
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
	public void AUT_Payment_MexicoCovVehicleDamage_ClaimCost_Other() throws Throwable {
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
	public void AUT_Payment_MexicoCovVehicleDamage_ClaimCost_Reimbursement() throws Throwable {
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
	public void AUT_Payment_MexicoCovVehicleDamage_ClaimCost_Settlement() throws Throwable {
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
	public void AUT_Payment_MexicoCovVehicleDamage_ClaimCost_Towing() throws Throwable {
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
	public void AUT_Payment_MexicoCovVehicleDamage_ClaimCost_Vehicleinspection() throws Throwable {
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
	public void AUT_Payment_MexicoCovVehicleDamage_ExpenseAO_UnspecifiedCostCategory() throws Throwable {
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
	public void AUT_Payment_MexicoCovVehicleDamage_ExpenseAO_Legal() throws Throwable {
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
	public void AUT_Payment_MexicoCovVehicleDamage_ExpenseAO_Other() throws Throwable {
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

}
