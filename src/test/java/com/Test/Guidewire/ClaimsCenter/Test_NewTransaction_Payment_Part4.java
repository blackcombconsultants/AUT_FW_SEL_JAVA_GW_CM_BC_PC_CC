package com.Test.Guidewire.ClaimsCenter;

import org.testng.annotations.Test;

import com.pages.Guidewire.GW_CM_PC_BC_CC_Login;
import com.pages.Guidewire.Tab_Menu_Navigation;
import com.pages.Guidewire.ClaimsCenter.CC_Financials;
import com.pages.Guidewire.ClaimsCenter.CC_NewClaimWizard;
import com.pages.Guidewire.ClaimsCenter.CC_NewTransaction_Check;
import com.pages.Guidewire.ClaimsCenter.ClaimCenter_ClaimExposure;
import com.pages.Guidewire.ClaimsCenter.ClaimCenter_Reserve;

public class Test_NewTransaction_Payment_Part4 {
	@Test
	public void AUT_Payment_PIPKentucky_UnspecifiedCostType_Casemanagement() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Kentucky");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_Payment_PIPKentucky_UnspecifiedCostType_Deathbenefits() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Kentucky");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_Payment_PIPKentucky_UnspecifiedCostType_Emergencyservices() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Kentucky");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_Payment_PIPKentucky_UnspecifiedCostType_Lostwages() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Kentucky");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_Payment_PIPKentucky_UnspecifiedCostType_Medical() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Kentucky");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_Payment_PIPKentucky_UnspecifiedCostType_Other() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Kentucky");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_Payment_PIPKentucky_UnspecifiedCostType_Reimbursement() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Kentucky");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_Payment_PIPKentucky_UnspecifiedCostType_Vocational() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Kentucky");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_Payment_PIPKentucky_ClaimCost_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Kentucky");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_Payment_PIPKentucky_ClaimCost_Burialexpenses() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Kentucky");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_Payment_PIPKentucky_ClaimCost_Deathbenefits() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Kentucky");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_Payment_PIPKentucky_ClaimCost_Emergencyservices() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Kentucky");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_Payment_PIPKentucky_ClaimCost_Lostwages() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Kentucky");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_Payment_PIPKentucky_ClaimCost_Medical() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Kentucky");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_Payment_PIPKentucky_ClaimCost_Other() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Kentucky");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_Payment_PIPKentucky_ClaimCost_Reimbursement() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Kentucky");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_Payment_PIPKentucky_ClaimCost_Vocational() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Kentucky");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_Payment_PIPKentucky_ExpenseAO_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Kentucky");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_Payment_PIPKentucky_ExpenseAO_Casemanagement() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Kentucky");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_Payment_PIPKentucky_ExpenseAO_Other() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Kentucky");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_Payment_PIPKentucky_ExpenseDCC_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Kentucky");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_Payment_PIPKentucky_ExpenseDCC_Other() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Kentucky");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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

//--------------------------------------------------------------------	

	@Test

	public void AUT_PIPMaryland_UnspecifiedCostType_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Maryland");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_PIPMaryland_UnspecifiedCostType_Burialexpenses() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Maryland");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_PIPMaryland_UnspecifiedCostType_Casemanagement() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Maryland");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_PIPMaryland_UnspecifiedCostType_Deathbenefits() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Maryland");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_PIPMaryland_UnspecifiedCostType_Emergencyservices() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Maryland");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_PIPMaryland_UnspecifiedCostType_Lostwages() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Maryland");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_PIPMaryland_UnspecifiedCostType_Medical() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Maryland");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_PIPMaryland_UnspecifiedCostType_Other() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Maryland");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_PIPMaryland_UnspecifiedCostType_Reimbursement() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Maryland");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_PIPMaryland_UnspecifiedCostType_Vocational() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Maryland");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_PIPMaryland_ClaimCost_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Maryland");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_PIPMaryland_ClaimCost_Burialexpenses() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Maryland");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_PIPMaryland_ClaimCost_Deathbenefits() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Maryland");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_PIPMaryland_ClaimCost_Emergencyservices() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Maryland");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_PIPMaryland_ClaimCost_Lostwages() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Maryland");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_PIPMaryland_ClaimCost_Medical() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Maryland");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_PIPMaryland_ClaimCost_Other() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Maryland");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_PIPMaryland_ClaimCost_Reimbursement() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Maryland");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_PIPMaryland_ClaimCost_Vocational() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Maryland");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_PIPMaryland_ExpenseAO_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Maryland");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_PIPMaryland_ExpenseAO_Casemanagement() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Maryland");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_PIPMaryland_ExpenseAO_Other() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Maryland");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_PIPMaryland_ExpenseDCC_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Maryland");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_PIPMaryland_ExpenseDCC_Other() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Maryland");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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

//-------------------------------------------------------------------------------------------------------------

	@Test
	public void AUT_PIPMassachusetts_UnspecifiedCostType_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_PIPMassachusetts_UnspecifiedCostType_Burialexpenses() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Massachusetts");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_PIPMassachusetts_UnspecifiedCostType_Casemanagement() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Massachusetts");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_PIPMassachusetts_UnspecifiedCostType_Deathbenefits() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Massachusetts");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_PIPMassachusetts_UnspecifiedCostType_Emergencyservices() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Massachusetts");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_PIPMassachusetts_UnspecifiedCostType_Lostwages() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Massachusetts");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_PIPMassachusetts_UnspecifiedCostType_Medical() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Massachusetts");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_PIPMassachusetts_UnspecifiedCostType_Other() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Massachusetts");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_PIPMassachusetts_UnspecifiedCostType_Reimbursement() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Massachusetts");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_PIPMassachusetts_UnspecifiedCostType_Vocational() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Massachusetts");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_PIPMassachusetts_ClaimCost_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Massachusetts");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_PIPMassachusetts_ClaimCost_Burialexpenses() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Massachusetts");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_PIPMassachusetts_ClaimCost_Deathbenefits() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Massachusetts");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_PIPMassachusetts_ClaimCost_Emergencyservices() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Massachusetts");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_PIPMassachusetts_ClaimCost_Lostwages() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Massachusetts");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_PIPMassachusetts_ClaimCost_Medical() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Massachusetts");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_PIPMassachusetts_ClaimCost_Other() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Massachusetts");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_PIPMassachusetts_ClaimCost_Reimbursement() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Massachusetts");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_PIPMassachusetts_ClaimCost_Vocational() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Massachusetts");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_PIPMassachusetts_ExpenseAO_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Massachusetts");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_PIPMassachusetts_ExpenseAO_Casemanagement() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Massachusetts");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_PIPMassachusetts_ExpenseAO_Other() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Massachusetts");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_PIPMassachusetts_ExpenseDCC_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Massachusetts");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_PIPMassachusetts_ExpenseDCC_Other() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Massachusetts");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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

//-----------------------------------------------------------------------------------------------------------------	

	@Test

	public void AUT_Payment_PIPMichigans_UnspecifiedCostType_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Michigan");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_Payment_PIPMichigans_UnspecifiedCostType_Burialexpenses() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Michigan");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_Payment_PIPMichigans_UnspecifiedCostType_Casemanagement() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Michigan");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_Payment_PIPMichigans_UnspecifiedCostType_Deathbenefits() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Michigan");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_Payment_PIPMichigans_UnspecifiedCostType_Emergencyservices() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Michigan");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_Payment_PIPMichigans_UnspecifiedCostType_Lostwages() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Michigan");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_Payment_PIPMichigans_UnspecifiedCostType_Medical() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Michigan");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_Payment_PIPMichigans_UnspecifiedCostType_Other() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Michigan");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_Payment_PIPMichigans_UnspecifiedCostType_Reimbursement() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Michigan");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_Payment_PIPMichigans_UnspecifiedCostType_Vocational() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Michigan");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_Payment_PIPMichigans_ClaimCost_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Michigan");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_Payment_PIPMichigans_ClaimCost_Burialexpenses() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Michigan");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_Payment_PIPMichigans_ClaimCost_Deathbenefits() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Michigan");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_Payment_PIPMichigans_ClaimCost_Emergencyservices() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Michigan");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_Payment_PIPMichigans_ClaimCost_Lostwages() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Michigan");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_Payment_PIPMichigans_ClaimCost_Medical() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Michigan");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_Payment_PIPMichigans_ClaimCost_Other() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Michigan");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_Payment_PIPMichigans_ClaimCost_Reimbursement() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Michigan");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_Payment_PIPMichigans_ClaimCost_Vocational() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Michigan");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_Payment_PIPMichigans_ExpenseAO_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Michigan");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_Payment_PIPMichigans_ExpenseAO_Casemanagement() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Michigan");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_Payment_PIPMichigans_ExpenseAO_Other() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Michigan");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_Payment_PIPMichigans_ExpenseDCC_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Michigan");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_Payment_PIPMichigans_ExpenseDCC_Other() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Michigan");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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

//--------------------------------------------------------------------------------------------------------	
	@Test

	public void AUT_PIPMinnesotas_UnspecifiedCostType_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Minnesota");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_PIPMinnesotas_UnspecifiedCostType_Burialexpenses() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Minnesota");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_PIPMinnesotas_UnspecifiedCostType_Casemanagement() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Minnesota");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_PIPMinnesotas_UnspecifiedCostType_Deathbenefits() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Minnesota");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
		GW_CM_PC_BC_CC_Login.logout_ClaimsCenter();// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Minnesota");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_PIPMinnesotas_UnspecifiedCostType_Emergencyservices() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Minnesota");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_PIPMinnesotas_UnspecifiedCostType_Lostwages() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Minnesota");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_PIPMinnesotas_UnspecifiedCostType_Medical() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Minnesota");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_PIPMinnesotas_UnspecifiedCostType_Other() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Minnesota");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_PIPMinnesotas_UnspecifiedCostType_Reimbursement() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Minnesota");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_PIPMinnesotas_UnspecifiedCostType_Vocational() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Minnesota");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_PIPMinnesotas_ClaimCost_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Minnesota");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_PIPMinnesotas_ClaimCost_Burialexpenses() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Minnesota");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_PIPMinnesotas_ClaimCost_Deathbenefits() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Minnesota");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_PIPMinnesotas_ClaimCost_Emergencyservices() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Minnesota");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_PIPMinnesotas_ClaimCost_Lostwages() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Minnesota");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_PIPMinnesotas_ClaimCost_Medical() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Minnesota");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_PIPMinnesotas_ClaimCost_Other() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Minnesota");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_PIPMinnesotas_ClaimCost_Reimbursement() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Minnesota");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_PIPMinnesotas_ClaimCost_Vocational() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Minnesota");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_PIPMinnesotas_ExpenseAO_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Minnesota");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_PIPMinnesotas_ExpenseAO_Casemanagement() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Minnesota");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_PIPMinnesotas_ExpenseAO_Other() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Minnesota");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_PIPMinnesotas_ExpenseDCC_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Minnesota");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
	public void AUT_PIPMinnesotas_ExpenseDCC_Other() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// Click on
		// "Actions" -> Choose by Coverage Type->Collision Limited Coverage
		Tab_Menu_Navigation.ccMenuNavigation("PIP Minnesota");
		// Adding NewExposure Collision Limited Coverage
		ClaimCenter_ClaimExposure.AddingExposure("InjuryNewIncident_PIP");
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
}
