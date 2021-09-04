package com.Test.Guidewire.ClaimsCenter;

import org.testng.annotations.Test;

import com.pages.Guidewire.GW_CM_PC_BC_CC_Login;
import com.pages.Guidewire.Tab_Menu_Navigation;
import com.pages.Guidewire.ClaimsCenter.CC_Financials;
import com.pages.Guidewire.ClaimsCenter.CC_NewClaimWizard;
import com.pages.Guidewire.ClaimsCenter.CC_NewTransaction_Check;
import com.pages.Guidewire.ClaimsCenter.ClaimCenter_ClaimExposure;
import com.pages.Guidewire.ClaimsCenter.ClaimCenter_Reserve;

public class Test_NewTransaction_Payment_Part3 {
	@Test
	public void AUT_Payment_MexicoCovVehicleDamage_ExpenseAO_Salvage() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("ChoosebyCoverage Mexico Cov Vehicle Damage");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("VehicleNewIncident");
		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		ClaimCenter_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		ClaimCenter_ClaimExposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		Tab_Menu_Navigation.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		Tab_Menu_Navigation.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();
		// -----> logout Claim Center
		GW_CM_PC_BC_CC_Login.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_MexicoCovVehicleDamage_ExpenseAO_Vehicleappraisal() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("ChoosebyCoverage Mexico Cov Vehicle Damage");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("VehicleNewIncident");
		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		ClaimCenter_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		ClaimCenter_ClaimExposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		Tab_Menu_Navigation.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		Tab_Menu_Navigation.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();
		// -----> logout Claim Center
		GW_CM_PC_BC_CC_Login.logout_ClaimsCenter();
	}

	@Test
	public void AUT_Payment_MexicoCovVehicleDamage_ExpenseDCC_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("ChoosebyCoverage Mexico Cov Vehicle Damage");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("VehicleNewIncident");
		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		ClaimCenter_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		ClaimCenter_ClaimExposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		Tab_Menu_Navigation.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_1();

		// -----> logout Claim Center
		GW_CM_PC_BC_CC_Login.logout_ClaimsCenter();

	}

	@Test
	public void AUT_Payment_MexicoCovVehicleDamage_ExpenseDCC_Legal() throws Throwable {// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("ChoosebyCoverage Mexico Cov Vehicle Damage");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("VehicleNewIncident");
		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		ClaimCenter_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		ClaimCenter_ClaimExposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem
		Tab_Menu_Navigation.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_1();

		// -----> logout Claim Center
		GW_CM_PC_BC_CC_Login.logout_ClaimsCenter();

	}

	@Test
	public void AUT_Payment_MexicoCovVehicleDamage_ExpenseDCC_Other() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("ChoosebyCoverage Mexico Cov Vehicle Damage");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("VehicleNewIncident");
		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		ClaimCenter_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		ClaimCenter_ClaimExposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		Tab_Menu_Navigation.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_1();

		// -----> logout Claim Center
		GW_CM_PC_BC_CC_Login.logout_ClaimsCenter();

	}

	@Test
	public void AUT_Payment_MexicoCovVehicleDamage_ExpenseDCC_Vehicleinspection() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("ChoosebyCoverage Mexico Cov Vehicle Damage");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("VehicleNewIncident");
		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		ClaimCenter_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		ClaimCenter_ClaimExposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		Tab_Menu_Navigation.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_1();

		// -----> logout Claim Center
		GW_CM_PC_BC_CC_Login.logout_ClaimsCenter();

	}

//-----------------------------------------------------------------------------------------------------------

	@Test
	public void AUT_MexicoCovGenDamages_UnspecifiedCostType_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("ChoosebyCoverage Mexico Cov Gen Damages");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("AddingExposureDescription");
		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		ClaimCenter_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		ClaimCenter_ClaimExposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		Tab_Menu_Navigation.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		Tab_Menu_Navigation.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		GW_CM_PC_BC_CC_Login.logout_ClaimsCenter();
	}

	@Test
	public void AUT_MexicoCovGenDamages_UnspecifiedCostType_Labor() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("ChoosebyCoverage Mexico Cov Gen Damages");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("AddingExposureDescription");
		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		ClaimCenter_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		ClaimCenter_ClaimExposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		Tab_Menu_Navigation.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		Tab_Menu_Navigation.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		GW_CM_PC_BC_CC_Login.logout_ClaimsCenter();
	}

	@Test
	public void AUT_MexicoCovGenDamagesDamages_UnspecifiedCostType_Legal() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("ChoosebyCoverage Mexico Cov Gen Damages");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("AddingExposureDescription");
		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		ClaimCenter_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		ClaimCenter_ClaimExposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		Tab_Menu_Navigation.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		Tab_Menu_Navigation.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		GW_CM_PC_BC_CC_Login.logout_ClaimsCenter();
	}

	@Test
	public void AUT_MexicoCovGenDamagesDamages_UnspecifiedCostType_Other() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("ChoosebyCoverage Mexico Cov Gen Damages");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("AddingExposureDescription");
		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		ClaimCenter_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		ClaimCenter_ClaimExposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		Tab_Menu_Navigation.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		Tab_Menu_Navigation.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		GW_CM_PC_BC_CC_Login.logout_ClaimsCenter();
	}

	@Test
	public void AUT_MexicoCovGenDamagesDamages_UnspecifiedCostType_Reimbursement() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("ChoosebyCoverage Mexico Cov Gen Damages");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("AddingExposureDescription");
		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		ClaimCenter_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		ClaimCenter_ClaimExposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		Tab_Menu_Navigation.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		Tab_Menu_Navigation.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		GW_CM_PC_BC_CC_Login.logout_ClaimsCenter();
	}

	@Test
	public void AUT_MexicoCovGenDamagesDamages_UnspecifiedCostType_Salvage() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("ChoosebyCoverage Mexico Cov Gen Damages");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("AddingExposureDescription");
		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		ClaimCenter_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		ClaimCenter_ClaimExposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		Tab_Menu_Navigation.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		Tab_Menu_Navigation.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		GW_CM_PC_BC_CC_Login.logout_ClaimsCenter();
	}

	@Test
	public void AUT_MexicoCovGenDamagesDamages_UnspecifiedCostType_Settlement() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("ChoosebyCoverage Mexico Cov Gen Damages");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("AddingExposureDescription");
		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		ClaimCenter_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		ClaimCenter_ClaimExposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		Tab_Menu_Navigation.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		Tab_Menu_Navigation.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		GW_CM_PC_BC_CC_Login.logout_ClaimsCenter();
	}

	@Test
	public void AUT_MexicoCovGenDamagesDamages_UnspecifiedCostType_Towing() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("ChoosebyCoverage Mexico Cov Gen Damages");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("AddingExposureDescription");
		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		ClaimCenter_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		ClaimCenter_ClaimExposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		Tab_Menu_Navigation.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		Tab_Menu_Navigation.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		GW_CM_PC_BC_CC_Login.logout_ClaimsCenter();
	}

	@Test
	public void AUT_MexicoCovGenDamagesDamages_UnspecifiedCostType_Vehicleappraisal() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("ChoosebyCoverage Mexico Cov Gen Damages");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("AddingExposureDescription");
		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		ClaimCenter_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		ClaimCenter_ClaimExposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		Tab_Menu_Navigation.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		Tab_Menu_Navigation.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		GW_CM_PC_BC_CC_Login.logout_ClaimsCenter();
	}

	@Test
	public void AUT_MexicoCovGenDamagesDamages_UnspecifiedCostType_Vehicleinspection() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("ChoosebyCoverage Mexico Cov Gen Damages");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("AddingExposureDescription");
		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		ClaimCenter_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		ClaimCenter_ClaimExposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		Tab_Menu_Navigation.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		Tab_Menu_Navigation.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		GW_CM_PC_BC_CC_Login.logout_ClaimsCenter();
	}

	@Test
	public void AUT_MexicoCovGenDamagesDamages_ClaimCost_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("ChoosebyCoverage Mexico Cov Gen Damages");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("AddingExposureDescription");
		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		ClaimCenter_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		ClaimCenter_ClaimExposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		Tab_Menu_Navigation.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		Tab_Menu_Navigation.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		GW_CM_PC_BC_CC_Login.logout_ClaimsCenter();
	}

	@Test
	public void AUT_MexicoCovGenDamagesDamages_ClaimCost_Labor() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("ChoosebyCoverage Mexico Cov Gen Damages");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("AddingExposureDescription");
		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		ClaimCenter_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		ClaimCenter_ClaimExposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		Tab_Menu_Navigation.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		Tab_Menu_Navigation.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		GW_CM_PC_BC_CC_Login.logout_ClaimsCenter();
	}

	@Test
	public void AUT_MexicoCovGenDamagesDamages_ClaimCost_Legal() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("ChoosebyCoverage Mexico Cov Gen Damages");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("AddingExposureDescription");
		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		ClaimCenter_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		ClaimCenter_ClaimExposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		Tab_Menu_Navigation.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		Tab_Menu_Navigation.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		GW_CM_PC_BC_CC_Login.logout_ClaimsCenter();
	}

	@Test
	public void AUT_MexicoCovGenDamagesDamages_ClaimCost_Other() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("ChoosebyCoverage Mexico Cov Gen Damages");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("AddingExposureDescription");
		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		ClaimCenter_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		ClaimCenter_ClaimExposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		Tab_Menu_Navigation.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		Tab_Menu_Navigation.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		GW_CM_PC_BC_CC_Login.logout_ClaimsCenter();
	}

	@Test
	public void AUT_MexicoCovGenDamagesDamages_ClaimCost_Reimbursement() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("ChoosebyCoverage Mexico Cov Gen Damages");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("AddingExposureDescription");
		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		ClaimCenter_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		ClaimCenter_ClaimExposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		Tab_Menu_Navigation.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		Tab_Menu_Navigation.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		GW_CM_PC_BC_CC_Login.logout_ClaimsCenter();
	}

	@Test
	public void AUT_MexicoCovGenDamagesDamages_ClaimCost_Settlement() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("ChoosebyCoverage Mexico Cov Gen Damages");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("AddingExposureDescription");
		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		ClaimCenter_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		ClaimCenter_ClaimExposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		Tab_Menu_Navigation.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		Tab_Menu_Navigation.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		GW_CM_PC_BC_CC_Login.logout_ClaimsCenter();
	}

	@Test
	public void AUT_MexicoCovGenDamagesDamages_ClaimCost_Towing() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("ChoosebyCoverage Mexico Cov Gen Damages");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("AddingExposureDescription");
		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		ClaimCenter_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		ClaimCenter_ClaimExposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		Tab_Menu_Navigation.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		Tab_Menu_Navigation.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		GW_CM_PC_BC_CC_Login.logout_ClaimsCenter();
	}

	@Test
	public void AUT_MexicoCovGenDamagesDamages_ClaimCost_Vehicleinspection() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("ChoosebyCoverage Mexico Cov Gen Damages");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("AddingExposureDescription");
		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		ClaimCenter_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		ClaimCenter_ClaimExposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		Tab_Menu_Navigation.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		Tab_Menu_Navigation.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		GW_CM_PC_BC_CC_Login.logout_ClaimsCenter();
	}

	@Test
	public void AUT_MexicoCovGenDamagesDamages_ExpenseAO_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("ChoosebyCoverage Mexico Cov Gen Damages");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("AddingExposureDescription");
		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		ClaimCenter_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		ClaimCenter_ClaimExposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		Tab_Menu_Navigation.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		Tab_Menu_Navigation.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		GW_CM_PC_BC_CC_Login.logout_ClaimsCenter();
	}

	@Test
	public void AUT_MexicoCovGenDamagesDamages_ExpenseAO_Legal() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("ChoosebyCoverage Mexico Cov Gen Damages");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("AddingExposureDescription");
		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		ClaimCenter_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		ClaimCenter_ClaimExposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		Tab_Menu_Navigation.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		Tab_Menu_Navigation.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		GW_CM_PC_BC_CC_Login.logout_ClaimsCenter();
	}

	@Test
	public void AUT_MexicoCovGenDamagesDamages_ExpenseAO_Other() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("ChoosebyCoverage Mexico Cov Gen Damages");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("AddingExposureDescription");
		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		ClaimCenter_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		ClaimCenter_ClaimExposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		Tab_Menu_Navigation.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		Tab_Menu_Navigation.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		GW_CM_PC_BC_CC_Login.logout_ClaimsCenter();
	}

	@Test
	public void AUT_MexicoCovGenDamagesDamages_ExpenseAO_Salvage() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("ChoosebyCoverage Mexico Cov Gen Damages");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("AddingExposureDescription");
		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		ClaimCenter_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		ClaimCenter_ClaimExposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		Tab_Menu_Navigation.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		Tab_Menu_Navigation.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		GW_CM_PC_BC_CC_Login.logout_ClaimsCenter();
	}

	@Test
	public void AUT_MexicoCovGenDamagesDamages_ExpenseAO_Vehicleappraisal() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("ChoosebyCoverage Mexico Cov Gen Damages");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("AddingExposureDescription");
		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		ClaimCenter_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		ClaimCenter_ClaimExposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		Tab_Menu_Navigation.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		Tab_Menu_Navigation.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		GW_CM_PC_BC_CC_Login.logout_ClaimsCenter();
	}

	@Test
	public void AUT_MexicoCovGenDamagesDamages_ExpenseAO_Vehicleinspection() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("ChoosebyCoverage Mexico Cov Gen Damages");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("AddingExposureDescription");
		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		ClaimCenter_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		ClaimCenter_ClaimExposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		Tab_Menu_Navigation.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Mileagereimbursement();
		CC_Financials.FinancialsChecks_Verification_1();

		Tab_Menu_Navigation.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_2();

		// -----> logout Claim Center
		GW_CM_PC_BC_CC_Login.logout_ClaimsCenter();
	}

	@Test
	public void AUT_MexicoCovGenDamagesDamages_ExpenseDCC_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("ChoosebyCoverage Mexico Cov Gen Damages");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("AddingExposureDescription");
		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		ClaimCenter_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		ClaimCenter_ClaimExposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		Tab_Menu_Navigation.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_1();

		// -----> logout Claim Center
		GW_CM_PC_BC_CC_Login.logout_ClaimsCenter();
	}

	@Test
	public void AUT_MexicoCovGenDamagesDamages_ExpenseDCC_Legal() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("ChoosebyCoverage Mexico Cov Gen Damages");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("AddingExposureDescription");
		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		ClaimCenter_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		ClaimCenter_ClaimExposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		Tab_Menu_Navigation.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_1();

		// -----> logout Claim Center
		GW_CM_PC_BC_CC_Login.logout_ClaimsCenter();
	}

	@Test
	public void AUT_MexicoCovGenDamagesDamages_ExpenseDCC_Other() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("ChoosebyCoverage Mexico Cov Gen Damages");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("AddingExposureDescription");
		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		ClaimCenter_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		ClaimCenter_ClaimExposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		Tab_Menu_Navigation.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_1();

		// -----> logout Claim Center
		GW_CM_PC_BC_CC_Login.logout_ClaimsCenter();
	}

	@Test
	public void AUT_MexicoCovGenDamagesDamages_ExpenseDCC_Vehicleinspection() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("ChoosebyCoverage Mexico Cov Gen Damages");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("AddingExposureDescription");
		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// CostCategory" is displayed with the below list and in the same order.
		// verifying financial transaction-> Reserve should be created successfully.
		ClaimCenter_Reserve.AddingReserve_EachCostCategory();

		// Exposure" -> "Ability to Pay".
		Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		ClaimCenter_ClaimExposure.AddingExposure("AddVehicleDescription");
		// Click on Action-Check Adding Mileagereimbursement LineItem
		// Click on Action-Check Adding Other LineItem

		Tab_Menu_Navigation.ccMenuNavigation("Check");
		CC_NewTransaction_Check.CreatingCheck_LineItem_Other();
		CC_Financials.FinancialsChecks_Verification_1();

		// -----> logout Claim Center
		GW_CM_PC_BC_CC_Login.logout_ClaimsCenter();
	}
//-----------------------------------------------------------------------------------------------------------
}
