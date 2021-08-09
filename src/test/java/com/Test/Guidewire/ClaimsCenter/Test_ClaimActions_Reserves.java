package com.Test.Guidewire.ClaimsCenter;

import org.testng.annotations.Test;

import com.pages.Guidewire.GW_CM_PC_BC_CC_Login;
import com.pages.Guidewire.Tab_Menu_Navigation;
import com.pages.Guidewire.ClaimsCenter.ClaimCenter_Reserve;

public class Test_ClaimActions_Reserves {

	@Test

	public void AUT_CollisionReserves_UnspecifiedCostType() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// ----->Search for Claim
		Tab_Menu_Navigation.ccTabNavigation("Claim Search", "");

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.Saving_Reserves();

	}

	@Test
	public void AUT_CollisionReserves_ClaimCostType() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// ----->Search for Claim
		Tab_Menu_Navigation.ccTabNavigation("Claim Search", "");

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.Saving_Reserves();

	}

	@Test
	public void AUT_CollisionReserves_ExpenseAO() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// ----->Search for Claim
		Tab_Menu_Navigation.ccTabNavigation("Claim Search", "");

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.Saving_Reserves();

	}

	@Test
	public void AUT_CollisionReserves_ExpenseDCC() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// ----->Search for Claim
		Tab_Menu_Navigation.ccTabNavigation("Claim Search", "");

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.Saving_Reserves();

	}

	// -----------------------------------------------------------------------------------------------------------------------
	@Test
	public void AUT_ComprehensiveCoverage_UnspecifiedCostType() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// ----->Search for Claim
		Tab_Menu_Navigation.ccTabNavigation("Claim Search", "");

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.Saving_Reserves();

	}

	@Test
	public void AUT_ComprehensiveCovearge_ClaimCost() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// ----->Search for Claim
		Tab_Menu_Navigation.ccTabNavigation("Claim Search", "");

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		// ClaimCenter_Reserve.Saving_Reserves();

	}

	@Test
	public void AUT_ComprehensiveCovearge_ExpenseAO() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// ----->Search for Claim
		Tab_Menu_Navigation.ccTabNavigation("Claim Search", "");

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		// ClaimCenter_Reserve.Saving_Reserves();

	}

	@Test
	public void AUT_ComprehensiveCovearge_ExpenseDCC() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// ----->Search for Claim
		Tab_Menu_Navigation.ccTabNavigation("Claim Search", "");

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.Saving_Reserves();

	}

	// --------------------------------------------------------------------------------------------------->
	@Test
	public void AUT_RentalReimbursementCovearge_UnspecifiedCostType() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// ----->Search for Claim
		Tab_Menu_Navigation.ccTabNavigation("Claim Search", "");

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.Saving_Reserves();

	}

	@Test
	public void AUT_RentalReimbursementCovearge_ClaimCost() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// ----->Search for Claim
		Tab_Menu_Navigation.ccTabNavigation("Claim Search", "");

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.Saving_Reserves();

	}

	@Test
	public void AUT_RentalReimbursementCovearge_ExpenseAO() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// ----->Search for Claim
		Tab_Menu_Navigation.ccTabNavigation("Claim Search", "");

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		// ClaimCenter_Reserve.Saving_Reserves();

	}

	@Test
	public void AUT_RentalReimbursementCovearge_ExpenseDCC() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// ----->Search for Claim
		Tab_Menu_Navigation.ccTabNavigation("Claim Search", "");

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		// ClaimCenter_Reserve.Saving_Reserves();

	}
	// --------------------------------------------------------------------------------------------------------->

	@Test
	public void AUT_TowingandLaborCoverage_UnspecifiedCostType() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// ----->Search for Claim
		Tab_Menu_Navigation.ccTabNavigation("Claim Search", "");

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.Saving_Reserves();

	}

	@Test
	public void AUT_TowingandLaborCoverage_ClaimCost() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// ----->Search for Claim
		Tab_Menu_Navigation.ccTabNavigation("Claim Search", "");

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		// ClaimCenter_Reserve.Saving_Reserves();

	}

	@Test
	public void AUT_TowingandLaborCoverage_ExpenseAO() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// ----->Search for Claim
		Tab_Menu_Navigation.ccTabNavigation("Claim Search", "");

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		// ClaimCenter_Reserve.Saving_Reserves();

	}

	@Test
	public void AUT_TowingandLaborCoverage_ExpenseDCC() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// ----->Search for Claim
		Tab_Menu_Navigation.ccTabNavigation("Claim Search", "");

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.Saving_Reserves();

	}
	// ---------------------------------------------------------------------------------------------------------

	@Test
	public void AUT_CollisionLimitedCoverage_UnspecifiedCostType() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// ----->Search for Claim
		Tab_Menu_Navigation.ccTabNavigation("Claim Search", "");

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.Saving_Reserves();

	}

	@Test
	public void AUT_CollisionLimitedCoverage_ClaimCost() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// ----->Search for Claim
		Tab_Menu_Navigation.ccTabNavigation("Claim Search", "");

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		// ClaimCenter_Reserve.Saving_Reserves();

	}

	@Test
	public void AUT_CollisionLimitedCoverage_ExpenseAO() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// ----->Search for Claim
		Tab_Menu_Navigation.ccTabNavigation("Claim Search", "");

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		// ClaimCenter_Reserve.Saving_Reserves();

	}

	@Test
	public void AUT_CollisionLimitedCoverage_ExpenseDCC() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// ----->Search for Claim
		Tab_Menu_Navigation.ccTabNavigation("Claim Search", "");

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.Saving_Reserves();

	}
	// ------------------------------------------------------------------------------------------------------------

}
