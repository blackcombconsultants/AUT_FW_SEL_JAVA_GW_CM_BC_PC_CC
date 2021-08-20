package com.Test.Guidewire.ClaimsCenter;

import org.testng.annotations.Test;

import com.pages.Guidewire.GW_CM_PC_BC_CC_Login;
import com.pages.Guidewire.Tab_Menu_Navigation;
import com.pages.Guidewire.ClaimsCenter.CC_NewClaimWizard;
import com.pages.Guidewire.ClaimsCenter.CC_NewTransaction_Check;
import com.pages.Guidewire.ClaimsCenter.ClaimCenter_ClaimExposure;
import com.pages.Guidewire.ClaimsCenter.ClaimCenter_Reserve;
import com.sun.xml.bind.v2.schemagen.xmlschema.List;

public class Test_NewTransaction_Payment {
	@Test

	public void AUT_Payment_Collision_UnspecifiedCostType_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// Tab_Menu_Navigation.ccTabNavigation("Claim Search", "");

		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();
		// verifying financial transaction //
		// CC_NewTransaction_Check.FinancialsTransactions();

		Thread.sleep(2000);
		Tab_Menu_Navigation.ccMenuNavigation("Exposures");
		ClaimCenter_ClaimExposure.Validateclaimexposure();
		Thread.sleep(2000);
		Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		ClaimCenter_ClaimExposure.ValidationResults();

		// ----->Click on Action-Check
		Tab_Menu_Navigation.ccMenuNavigation("Check");
		CC_NewTransaction_Check.Enterpayeeinformation();
		CC_NewTransaction_Check.Enterpaymentinformation();

		// CC_NewTransaction_Check.Button();
		CC_NewTransaction_Check.Setcheckinstructions();
		Tab_Menu_Navigation.ccMenuNavigation("Check");
		CC_NewTransaction_Check.Enterpayeeinformation();
		CC_NewTransaction_Check.Enterpaymentinformation();

		// CC_NewTransaction_Check.Button();
		CC_NewTransaction_Check.Setcheckinstructions();
	}

	@Test

	public void AUT_Payment_Collision_UnspecifiedCostType_Autobody() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
			}
	

	@Test

	public void AUT_Payment_Collision_UnspecifiedCostType_Autoparts() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
			}
	

	@Test

	public void AUT_Payment_Collision_UnspecifiedCostType_Glass() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
			}
	
	@Test

	public void AUT_Payment_Collision_UnspecifiedCostType_Labor() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
			}
	
	@Test

	public void AUT_Payment_Collision_UnspecifiedCostType_Legal() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
			}
	
	@Test

	public void AUT_Payment_Collision_UnspecifiedCostType_Other() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
			}

	
	@Test

	public void AUT_Payment_Collision_UnspecifiedCostType_Reimbursement() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
			}
	
	@Test

	public void AUT_Payment_Collision_UnspecifiedCostType_Rental() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
			}
	
	@Test

	public void AUT_Payment_Collision_UnspecifiedCostType_Salvage() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
			}
	
	@Test

	public void AUT_Payment_Collision_UnspecifiedCostType_Settlement() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
			}
	
	@Test

	public void AUT_Payment_Collision_UnspecifiedCostType_Towing() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
			}
	
	@Test

	public void AUT_Payment_Collision_UnspecifiedCostType_Vehicleappraisal() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
			}

	
	@Test

	public void AUT_Payment_Collision_UnspecifiedCostType_Vehicleinspection() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
			}
	
	@Test

	public void AUT_Payment_Collision_ClaimCost_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
			}
	
	@Test

	public void AUT_Payment_Collision_ClaimCost_Autobody() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
			}
	
	@Test

	public void AUT_Payment_Collision_ClaimCost_Autoparts() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
			}
	
	@Test

	public void AUT_Payment_Collision_ClaimCost_Glass() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
			}
	
	@Test

	public void AUT_Payment_Collision_ClaimCost_Labor() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
			}
	
	@Test

	public void AUT_Payment_Collision_ClaimCost_Legal() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
			}
	
	@Test

	public void AUT_Payment_Collision_ClaimCost_Other() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
			}
	
	@Test

	public void AUT_Payment_Collision_ClaimCost_Reimbursement() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_Collision_ClaimCost_Rental() throws Throwable {
	
	// login to ClaimCenter
			GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

			// ----->Assign Claim
			CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
			// ----->Click on Action-Reserve
			Tab_Menu_Navigation.ccMenuNavigation("Reserve");

			// ---> Verify whether a default reserve is created
			ClaimCenter_Reserve.verify_DefaultReserve();

			ClaimCenter_Reserve.VerifyCostType_CostCategory();

			ClaimCenter_Reserve.EditReserves_Save();
			// verifying financial transaction //
			// CC_NewTransaction_Check.FinancialsTransactions();

			Thread.sleep(2000);
			Tab_Menu_Navigation.ccMenuNavigation("Exposures");
			ClaimCenter_ClaimExposure.Validateclaimexposure();
			Thread.sleep(2000);
			Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
			ClaimCenter_ClaimExposure.ValidationResults();

			// ----->Click on Action-Check
			Tab_Menu_Navigation.ccMenuNavigation("Check");
			CC_NewTransaction_Check.Enterpayeeinformation();
			CC_NewTransaction_Check.Enterpaymentinformation();

			// CC_NewTransaction_Check.Button();
			CC_NewTransaction_Check.Setcheckinstructions();
			Tab_Menu_Navigation.ccMenuNavigation("Check");
			CC_NewTransaction_Check.Enterpayeeinformation();
			CC_NewTransaction_Check.Enterpaymentinformation();

			// CC_NewTransaction_Check.Button();
			CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_Collision_ClaimCost_Settlement() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

	}
	@Test

	public void AUT_Payment_Collision_ClaimCost_Towing() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

	}
	@Test

	public void AUT_Payment_Collision_ClaimCost_Vehicleinspection() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();

	}
	
 
	@Test

	public void AUT_Payment_Collision_ExpenseAO_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();

	}
	@Test

	public void AUT_Payment_Collision_ExpenseAO_Legal() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_Collision_ExpenseAO_Other() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_Collision_ExpenseAO_Salvage() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_Collision_ExpenseAO_Vehicleappraisal() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_Collision_ExpenseAO_Vehicleinspection() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_Collision_ExpenseDCC_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_Collision_ExpenseDCC_Legal() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_Collision_ExpenseDCC_Other() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_Collision_ExpenseDCC_Vehicleinspection() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_Comprehensive_UnspecifiedCostType_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_Comprehensive_UnspecifiedCostType_Autobody() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_Comprehensive_UnspecifiedCostType_Autoparts() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_Comprehensive_UnspecifiedCostType_Glass() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

	}
	@Test

	public void AUT_Payment_Comprehensive_UnspecifiedCostType_Labor() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

	}
	@Test

	public void AUT_Payment_Comprehensive_UnspecifiedCostType_Legal() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_Comprehensive_UnspecifiedCostType_Other() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_Comprehensive_UnspecifiedCostType_Reimbursement() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_Comprehensive_UnspecifiedCostType_Rental() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_Comprehensive_UnspecifiedCostType_Salvage() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_Comprehensive_UnspecifiedCostType_Settlement() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_Comprehensive_UnspecifiedCostType_Towing() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_Comprehensive_UnspecifiedCostType_Vehicleappraisal() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_Comprehensive_UnspecifiedCostType_Vehicleinspection() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_Comprehensive_ClaimCost_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_Comprehensive_ClaimCost_Autobody() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_Comprehensive_ClaimCost_Autoparts() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

	}
	@Test

	public void AUT_Payment_Comprehensive_ClaimCost_Glass() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

	}
	@Test

	public void AUT_Payment_Comprehensive_ClaimCost_Labor() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_Comprehensive_ClaimCost_Legal() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_Comprehensive_ClaimCost_Other() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_Comprehensive_ClaimCost_Reimbursement() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_Comprehensive_ClaimCost_Rental() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_Comprehensive_ClaimCost_Settlement() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_Comprehensive_ClaimCost_Towing() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_Comprehensive_ClaimCost_Vehicleinspection() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_Comprehensive_ExpenseAO_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	
	@Test

	public void AUT_Payment_Comprehensive_ExpenseAO_Legal() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_Comprehensive_ExpenseAO_Other() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_Comprehensive_ExpenseAO_Salvage() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_Comprehensive_ExpenseAO_Vehicleappraisal() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

	}
	@Test

	public void AUT_Payment_Comprehensive_ExpenseAO_Vehicleinspection() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_CollisiAUT_Payment_Comprehensive_ExpenseDCC_UnspecifiedCostCategoryon_ClaimCost_Reimbursement() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_Comprehensive_ExpenseDCC_Legal() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_Comprehensive_ExpenseDCC_Other() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_Comprehensive_ExpenseDCC_Vehicleinspection() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_RentalReimbursement_UnspecifiedCostType_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_RentalReimbursement_UnspecifiedCostType_Other() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

	}
	@Test

	public void AUT_Payment_RentalReimbursement_UnspecifiedCostType_Reimbursement() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_RentalReimbursement_UnspecifiedCostType_Rental() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_RentalReimbursement_ClaimCost_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_RentalReimbursement_ClaimCost_Other() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

	}
	@Test

	public void AUT_Payment_RentalReimbursement_ClaimCost_Reimbursement() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

	}
	@Test

	public void AUT_Payment_RentalReimbursement_ClaimCost_Rental() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_RentalReimbursement_ExpenseAO_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_RentalReimbursement_ExpenseAO_Other() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_RentalReimbursement_ExpenseDCC_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_RentalReimbursement_ExpenseDCC_Other() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_TowingandLabor_UnspecifiedCostType_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_TowingandLabor_UnspecifiedCostType_Labor() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_TowingandLabor_UnspecifiedCostType_Other() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_TowingandLabor_UnspecifiedCostType_Reimbursement() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_TowingandLabor_UnspecifiedCostType_Towing() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_TowingandLabor_ClaimCost_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_TowingandLabor_ClaimCost_Labor() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_TowingandLabor_ClaimCost_Other() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_TowingandLabor_ClaimCost_Reimbursement() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_TowingandLabor_ClaimCost_Towing() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_TowingandLabor_ExpenseAO_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_TowingandLabor_ExpenseAO_Other() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_TowingandLabor_ExpenseDCC_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_TowingandLabor_ExpenseDCC_Other() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_CollisionLimitedCoverage_UnspecifiedCostType_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_CollisionLimitedCoverage_UnspecifiedCostType_Autobody() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_CollisionLimitedCoverage_UnspecifiedCostType_Autoparts() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

	}
	@Test

	public void AUT_Payment_CollisionLimitedCoverage_UnspecifiedCostType_Glass() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_CollisionLimitedCoverage_UnspecifiedCostType_Labor() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_CollisionLimitedCoverage_UnspecifiedCostType_Legal() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

	}
	@Test

	public void AUT_Payment_CollisionLimitedCoverage_UnspecifiedCostType_Other() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();
		// verifying financial transaction //
		// CC_NewTransaction_Check.FinancialsTransactions();

		Thread.sleep(2000);
		Tab_Menu_Navigation.ccMenuNavigation("Exposures");
		ClaimCenter_ClaimExposure.Validateclaimexposure();
		Thread.sleep(2000);
		Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		ClaimCenter_ClaimExposure.ValidationResults();

		// ----->Click on Action-Check
		Tab_Menu_Navigation.ccMenuNavigation("Check");
		CC_NewTransaction_Check.Enterpayeeinformation();
		CC_NewTransaction_Check.Enterpaymentinformation();

		// CC_NewTransaction_Check.Button();
		CC_NewTransaction_Check.Setcheckinstructions();
		Tab_Menu_Navigation.ccMenuNavigation("Check");
		CC_NewTransaction_Check.Enterpayeeinformation();
		CC_NewTransaction_Check.Enterpaymentinformation();

		// CC_NewTransaction_Check.Button();
		CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_CollisionLimitedCoverage_UnspecifiedCostType_Reimbursement() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();
		// verifying financial transaction //
		// CC_NewTransaction_Check.FinancialsTransactions();

		Thread.sleep(2000);
		Tab_Menu_Navigation.ccMenuNavigation("Exposures");
		ClaimCenter_ClaimExposure.Validateclaimexposure();
		Thread.sleep(2000);
		Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		ClaimCenter_ClaimExposure.ValidationResults();

		// ----->Click on Action-Check
		Tab_Menu_Navigation.ccMenuNavigation("Check");
		CC_NewTransaction_Check.Enterpayeeinformation();
		CC_NewTransaction_Check.Enterpaymentinformation();

		// CC_NewTransaction_Check.Button();
		CC_NewTransaction_Check.Setcheckinstructions();
		Tab_Menu_Navigation.ccMenuNavigation("Check");
		CC_NewTransaction_Check.Enterpayeeinformation();
		CC_NewTransaction_Check.Enterpaymentinformation();

		// CC_NewTransaction_Check.Button();
		CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_CollisionLimitedCoverage_UnspecifiedCostType_Rental() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();
		// verifying financial transaction //
		// CC_NewTransaction_Check.FinancialsTransactions();

		Thread.sleep(2000);
		Tab_Menu_Navigation.ccMenuNavigation("Exposures");
		ClaimCenter_ClaimExposure.Validateclaimexposure();
		Thread.sleep(2000);
		Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		ClaimCenter_ClaimExposure.ValidationResults();

		// ----->Click on Action-Check
		Tab_Menu_Navigation.ccMenuNavigation("Check");
		CC_NewTransaction_Check.Enterpayeeinformation();
		CC_NewTransaction_Check.Enterpaymentinformation();

		// CC_NewTransaction_Check.Button();
		CC_NewTransaction_Check.Setcheckinstructions();
		Tab_Menu_Navigation.ccMenuNavigation("Check");
		CC_NewTransaction_Check.Enterpayeeinformation();
		CC_NewTransaction_Check.Enterpaymentinformation();

		// CC_NewTransaction_Check.Button();
		CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_CollisionLimitedCoverage_UnspecifiedCostType_Salvage() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();
		// verifying financial transaction //
		// CC_NewTransaction_Check.FinancialsTransactions();

		Thread.sleep(2000);
		Tab_Menu_Navigation.ccMenuNavigation("Exposures");
		ClaimCenter_ClaimExposure.Validateclaimexposure();
		Thread.sleep(2000);
		Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		ClaimCenter_ClaimExposure.ValidationResults();

		// ----->Click on Action-Check
		Tab_Menu_Navigation.ccMenuNavigation("Check");
		CC_NewTransaction_Check.Enterpayeeinformation();
		CC_NewTransaction_Check.Enterpaymentinformation();

		// CC_NewTransaction_Check.Button();
		CC_NewTransaction_Check.Setcheckinstructions();
		Tab_Menu_Navigation.ccMenuNavigation("Check");
		CC_NewTransaction_Check.Enterpayeeinformation();
		CC_NewTransaction_Check.Enterpaymentinformation();

		// CC_NewTransaction_Check.Button();
		CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_CollisionLimitedCoverage_UnspecifiedCostType_Settlement() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();
		// verifying financial transaction //
		// CC_NewTransaction_Check.FinancialsTransactions();

		Thread.sleep(2000);
		Tab_Menu_Navigation.ccMenuNavigation("Exposures");
		ClaimCenter_ClaimExposure.Validateclaimexposure();
		Thread.sleep(2000);
		Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		ClaimCenter_ClaimExposure.ValidationResults();

		// ----->Click on Action-Check
		Tab_Menu_Navigation.ccMenuNavigation("Check");
		CC_NewTransaction_Check.Enterpayeeinformation();
		CC_NewTransaction_Check.Enterpaymentinformation();

		// CC_NewTransaction_Check.Button();
		CC_NewTransaction_Check.Setcheckinstructions();
		Tab_Menu_Navigation.ccMenuNavigation("Check");
		CC_NewTransaction_Check.Enterpayeeinformation();
		CC_NewTransaction_Check.Enterpaymentinformation();

		// CC_NewTransaction_Check.Button();
		CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_CollisionLimitedCoverage_UnspecifiedCostType_Towing() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();
		// verifying financial transaction //
		// CC_NewTransaction_Check.FinancialsTransactions();

		Thread.sleep(2000);
		Tab_Menu_Navigation.ccMenuNavigation("Exposures");
		ClaimCenter_ClaimExposure.Validateclaimexposure();
		Thread.sleep(2000);
		Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		ClaimCenter_ClaimExposure.ValidationResults();

		// ----->Click on Action-Check
		Tab_Menu_Navigation.ccMenuNavigation("Check");
		CC_NewTransaction_Check.Enterpayeeinformation();
		CC_NewTransaction_Check.Enterpaymentinformation();

		// CC_NewTransaction_Check.Button();
		CC_NewTransaction_Check.Setcheckinstructions();
		Tab_Menu_Navigation.ccMenuNavigation("Check");
		CC_NewTransaction_Check.Enterpayeeinformation();
		CC_NewTransaction_Check.Enterpaymentinformation();

		// CC_NewTransaction_Check.Button();
		CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_CollisionLimitedCoverage_UnspecifiedCostType_Vehicleappraisal() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();
		// verifying financial transaction //
		// CC_NewTransaction_Check.FinancialsTransactions();

		Thread.sleep(2000);
		Tab_Menu_Navigation.ccMenuNavigation("Exposures");
		ClaimCenter_ClaimExposure.Validateclaimexposure();
		Thread.sleep(2000);
		Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		ClaimCenter_ClaimExposure.ValidationResults();

		// ----->Click on Action-Check
		Tab_Menu_Navigation.ccMenuNavigation("Check");
		CC_NewTransaction_Check.Enterpayeeinformation();
		CC_NewTransaction_Check.Enterpaymentinformation();

		// CC_NewTransaction_Check.Button();
		CC_NewTransaction_Check.Setcheckinstructions();
		Tab_Menu_Navigation.ccMenuNavigation("Check");
		CC_NewTransaction_Check.Enterpayeeinformation();
		CC_NewTransaction_Check.Enterpaymentinformation();

		// CC_NewTransaction_Check.Button();
		CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_CollisionLimitedCoverage_UnspecifiedCostType_Vehicleinspection() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();
		// verifying financial transaction //
		// CC_NewTransaction_Check.FinancialsTransactions();

		Thread.sleep(2000);
		Tab_Menu_Navigation.ccMenuNavigation("Exposures");
		ClaimCenter_ClaimExposure.Validateclaimexposure();
		Thread.sleep(2000);
		Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		ClaimCenter_ClaimExposure.ValidationResults();

		// ----->Click on Action-Check
		Tab_Menu_Navigation.ccMenuNavigation("Check");
		CC_NewTransaction_Check.Enterpayeeinformation();
		CC_NewTransaction_Check.Enterpaymentinformation();

		// CC_NewTransaction_Check.Button();
		CC_NewTransaction_Check.Setcheckinstructions();
		Tab_Menu_Navigation.ccMenuNavigation("Check");
		CC_NewTransaction_Check.Enterpayeeinformation();
		CC_NewTransaction_Check.Enterpaymentinformation();

		// CC_NewTransaction_Check.Button();
		CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_CollisionLimitedCoverage_ClaimCost_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();
		// verifying financial transaction //
		// CC_NewTransaction_Check.FinancialsTransactions();

		Thread.sleep(2000);
		Tab_Menu_Navigation.ccMenuNavigation("Exposures");
		ClaimCenter_ClaimExposure.Validateclaimexposure();
		Thread.sleep(2000);
		Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		ClaimCenter_ClaimExposure.ValidationResults();

		// ----->Click on Action-Check
		Tab_Menu_Navigation.ccMenuNavigation("Check");
		CC_NewTransaction_Check.Enterpayeeinformation();
		CC_NewTransaction_Check.Enterpaymentinformation();

		// CC_NewTransaction_Check.Button();
		CC_NewTransaction_Check.Setcheckinstructions();
		Tab_Menu_Navigation.ccMenuNavigation("Check");
		CC_NewTransaction_Check.Enterpayeeinformation();
		CC_NewTransaction_Check.Enterpaymentinformation();

		// CC_NewTransaction_Check.Button();
		CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_CollisionLimitedCoverage_ClaimCost_Autobody() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();
		// verifying financial transaction //
		// CC_NewTransaction_Check.FinancialsTransactions();

		Thread.sleep(2000);
		Tab_Menu_Navigation.ccMenuNavigation("Exposures");
		ClaimCenter_ClaimExposure.Validateclaimexposure();
		Thread.sleep(2000);
		Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		ClaimCenter_ClaimExposure.ValidationResults();

		// ----->Click on Action-Check
		Tab_Menu_Navigation.ccMenuNavigation("Check");
		CC_NewTransaction_Check.Enterpayeeinformation();
		CC_NewTransaction_Check.Enterpaymentinformation();

		// CC_NewTransaction_Check.Button();
		CC_NewTransaction_Check.Setcheckinstructions();
		Tab_Menu_Navigation.ccMenuNavigation("Check");
		CC_NewTransaction_Check.Enterpayeeinformation();
		CC_NewTransaction_Check.Enterpaymentinformation();

		// CC_NewTransaction_Check.Button();
		CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_CollisionLimitedCoverage_ClaimCost_Autoparts() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();
		// verifying financial transaction //
		// CC_NewTransaction_Check.FinancialsTransactions();

		Thread.sleep(2000);
		Tab_Menu_Navigation.ccMenuNavigation("Exposures");
		ClaimCenter_ClaimExposure.Validateclaimexposure();
		Thread.sleep(2000);
		Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		ClaimCenter_ClaimExposure.ValidationResults();

		// ----->Click on Action-Check
		Tab_Menu_Navigation.ccMenuNavigation("Check");
		CC_NewTransaction_Check.Enterpayeeinformation();
		CC_NewTransaction_Check.Enterpaymentinformation();

		// CC_NewTransaction_Check.Button();
		CC_NewTransaction_Check.Setcheckinstructions();
		Tab_Menu_Navigation.ccMenuNavigation("Check");
		CC_NewTransaction_Check.Enterpayeeinformation();
		CC_NewTransaction_Check.Enterpaymentinformation();

		// CC_NewTransaction_Check.Button();
		CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_CollisionLimitedCoverage_ClaimCost_Glass() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();
		// verifying financial transaction //
		// CC_NewTransaction_Check.FinancialsTransactions();

		Thread.sleep(2000);
		Tab_Menu_Navigation.ccMenuNavigation("Exposures");
		ClaimCenter_ClaimExposure.Validateclaimexposure();
		Thread.sleep(2000);
		Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		ClaimCenter_ClaimExposure.ValidationResults();

		// ----->Click on Action-Check
		Tab_Menu_Navigation.ccMenuNavigation("Check");
		CC_NewTransaction_Check.Enterpayeeinformation();
		CC_NewTransaction_Check.Enterpaymentinformation();

		// CC_NewTransaction_Check.Button();
		CC_NewTransaction_Check.Setcheckinstructions();
		Tab_Menu_Navigation.ccMenuNavigation("Check");
		CC_NewTransaction_Check.Enterpayeeinformation();
		CC_NewTransaction_Check.Enterpaymentinformation();

		// CC_NewTransaction_Check.Button();
		CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_CollisionLimitedCoverage_ClaimCost_Labor() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();
		// verifying financial transaction //
		// CC_NewTransaction_Check.FinancialsTransactions();

		Thread.sleep(2000);
		Tab_Menu_Navigation.ccMenuNavigation("Exposures");
		ClaimCenter_ClaimExposure.Validateclaimexposure();
		Thread.sleep(2000);
		Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		ClaimCenter_ClaimExposure.ValidationResults();

		// ----->Click on Action-Check
		Tab_Menu_Navigation.ccMenuNavigation("Check");
		CC_NewTransaction_Check.Enterpayeeinformation();
		CC_NewTransaction_Check.Enterpaymentinformation();

		// CC_NewTransaction_Check.Button();
		CC_NewTransaction_Check.Setcheckinstructions();
		Tab_Menu_Navigation.ccMenuNavigation("Check");
		CC_NewTransaction_Check.Enterpayeeinformation();
		CC_NewTransaction_Check.Enterpaymentinformation();

		// CC_NewTransaction_Check.Button();
		CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_CollisionLimitedCoverage_ClaimCost_Legal() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();
		// verifying financial transaction //
		// CC_NewTransaction_Check.FinancialsTransactions();

		Thread.sleep(2000);
		Tab_Menu_Navigation.ccMenuNavigation("Exposures");
		ClaimCenter_ClaimExposure.Validateclaimexposure();
		Thread.sleep(2000);
		Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		ClaimCenter_ClaimExposure.ValidationResults();

		// ----->Click on Action-Check
		Tab_Menu_Navigation.ccMenuNavigation("Check");
		CC_NewTransaction_Check.Enterpayeeinformation();
		CC_NewTransaction_Check.Enterpaymentinformation();

		// CC_NewTransaction_Check.Button();
		CC_NewTransaction_Check.Setcheckinstructions();
		Tab_Menu_Navigation.ccMenuNavigation("Check");
		CC_NewTransaction_Check.Enterpayeeinformation();
		CC_NewTransaction_Check.Enterpaymentinformation();

		// CC_NewTransaction_Check.Button();
		CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_CollisionLimitedCoverage_ClaimCost_Other() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();
		// verifying financial transaction //
		// CC_NewTransaction_Check.FinancialsTransactions();

		Thread.sleep(2000);
		Tab_Menu_Navigation.ccMenuNavigation("Exposures");
		ClaimCenter_ClaimExposure.Validateclaimexposure();
		Thread.sleep(2000);
		Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		ClaimCenter_ClaimExposure.ValidationResults();

		// ----->Click on Action-Check
		Tab_Menu_Navigation.ccMenuNavigation("Check");
		CC_NewTransaction_Check.Enterpayeeinformation();
		CC_NewTransaction_Check.Enterpaymentinformation();

		// CC_NewTransaction_Check.Button();
		CC_NewTransaction_Check.Setcheckinstructions();
		Tab_Menu_Navigation.ccMenuNavigation("Check");
		CC_NewTransaction_Check.Enterpayeeinformation();
		CC_NewTransaction_Check.Enterpaymentinformation();

		// CC_NewTransaction_Check.Button();
		CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_CollisionLimitedCoverage_ClaimCost_Reimbursement() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();
		// verifying financial transaction //
		// CC_NewTransaction_Check.FinancialsTransactions();

		Thread.sleep(2000);
		Tab_Menu_Navigation.ccMenuNavigation("Exposures");
		ClaimCenter_ClaimExposure.Validateclaimexposure();
		Thread.sleep(2000);
		Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		ClaimCenter_ClaimExposure.ValidationResults();

		// ----->Click on Action-Check
		Tab_Menu_Navigation.ccMenuNavigation("Check");
		CC_NewTransaction_Check.Enterpayeeinformation();
		CC_NewTransaction_Check.Enterpaymentinformation();

		// CC_NewTransaction_Check.Button();
		CC_NewTransaction_Check.Setcheckinstructions();
		Tab_Menu_Navigation.ccMenuNavigation("Check");
		CC_NewTransaction_Check.Enterpayeeinformation();
		CC_NewTransaction_Check.Enterpaymentinformation();

		// CC_NewTransaction_Check.Button();
		CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_CollisionLimitedCoverage_ClaimCost_Rental() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();
		// verifying financial transaction //
		// CC_NewTransaction_Check.FinancialsTransactions();

		Thread.sleep(2000);
		Tab_Menu_Navigation.ccMenuNavigation("Exposures");
		ClaimCenter_ClaimExposure.Validateclaimexposure();
		Thread.sleep(2000);
		Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		ClaimCenter_ClaimExposure.ValidationResults();

		// ----->Click on Action-Check
		Tab_Menu_Navigation.ccMenuNavigation("Check");
		CC_NewTransaction_Check.Enterpayeeinformation();
		CC_NewTransaction_Check.Enterpaymentinformation();

		// CC_NewTransaction_Check.Button();
		CC_NewTransaction_Check.Setcheckinstructions();
		Tab_Menu_Navigation.ccMenuNavigation("Check");
		CC_NewTransaction_Check.Enterpayeeinformation();
		CC_NewTransaction_Check.Enterpaymentinformation();

		// CC_NewTransaction_Check.Button();
		CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_CollisionLimitedCoverage_ClaimCost_Settlement() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();
		// verifying financial transaction //
		// CC_NewTransaction_Check.FinancialsTransactions();

		Thread.sleep(2000);
		Tab_Menu_Navigation.ccMenuNavigation("Exposures");
		ClaimCenter_ClaimExposure.Validateclaimexposure();
		Thread.sleep(2000);
		Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		ClaimCenter_ClaimExposure.ValidationResults();

		// ----->Click on Action-Check
		Tab_Menu_Navigation.ccMenuNavigation("Check");
		CC_NewTransaction_Check.Enterpayeeinformation();
		CC_NewTransaction_Check.Enterpaymentinformation();

		// CC_NewTransaction_Check.Button();
		CC_NewTransaction_Check.Setcheckinstructions();
		Tab_Menu_Navigation.ccMenuNavigation("Check");
		CC_NewTransaction_Check.Enterpayeeinformation();
		CC_NewTransaction_Check.Enterpaymentinformation();

		// CC_NewTransaction_Check.Button();
		CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_CollisionLimitedCoverage_ClaimCost_Towing() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_CollisionLimitedCoverage_ClaimCost_Vehicleinspection() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_CollisionLimitedCoverage_ExpenseAO_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_CollisionLimitedCoverage_ExpenseAO_Legal() throws Throwable {
		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

		// ----->Assign Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// ----->Click on Action-Reserve
		// ----->Click on Action-Reserve
		Tab_Menu_Navigation.ccMenuNavigation("Reserve");

		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.verify_DefaultReserve();

		ClaimCenter_Reserve.VerifyCostType_CostCategory();

		ClaimCenter_Reserve.EditReserves_Save();
		// verifying financial transaction //
		// CC_NewTransaction_Check.FinancialsTransactions();

		Thread.sleep(2000);
		Tab_Menu_Navigation.ccMenuNavigation("Exposures");
		ClaimCenter_ClaimExposure.Validateclaimexposure();
		Thread.sleep(2000);
		Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
		ClaimCenter_ClaimExposure.ValidationResults();

		// ----->Click on Action-Check
		Tab_Menu_Navigation.ccMenuNavigation("Check");
		CC_NewTransaction_Check.Enterpayeeinformation();
		CC_NewTransaction_Check.Enterpaymentinformation();

		// CC_NewTransaction_Check.Button();
		CC_NewTransaction_Check.Setcheckinstructions();
		Tab_Menu_Navigation.ccMenuNavigation("Check");
		CC_NewTransaction_Check.Enterpayeeinformation();
		CC_NewTransaction_Check.Enterpaymentinformation();

		// CC_NewTransaction_Check.Button();
		CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_CollisionLimitedCoverage_ExpenseAO_Other() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_CollisionLimitedCoverage_ExpenseAO_Salvage() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_CollisionLimitedCoverage_ExpenseAO_Vehicleappraisal() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_CollisionLimitedCoverage_ExpenseDCC_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_Collision_CAUT_Payment_CollisionLimitedCoverage_ExpenseDCC_LegallaimCost_Reimbursement() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_CollisionLimitedCoverage_ExpenseDCC_Vehicleinspection() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_DeathDisabilityBenefit_UnspecifiedCostType_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_DeathDisabilityBenefit_UnspecifiedCostType_CaseManagement() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_DeathDisabilityBenefit_UnspecifiedCostType_DeathBenefits() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_DeathDisabilityBenefit_UnspecifiedCostType_Labor() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_DeathDisabilityBenefit_UnspecifiedCostType_Legal() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment__DeathDisabilityBenefit_UnspecifiedCostType_LostWages() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_ColliAUT_Payment_DeathDisabilityBenefit_UnspecifiedCostType_Othersion_ClaimCost_Reimbursement() throws Throwable {
	}
	@Test

	public void AUT_Payment_DeathDisabilityBenefit_UnspecifiedCostType_Reimbursement() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_DeathDisabilityBenefit_UnspecifiedCostType_Salvage() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_DeathDisabilityBenefit_UnspecifiedCostType_Settlement() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_DeathDisabilityBenefit_UnspecifiedCostType_Vehicleappraisal() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_DeathDisabilityBenefit_UnspecifiedCostType_Vehicleinspection() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_DeathDisabilityBenefit_ClaimCost_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void  AUT_Payment_DeathDisabilityBenefit_ClaimCost_Deathbenefits() throws Throwable {
	}
	@Test

	public void AUT_Payment_DeathDisabilityBenefit_ClaimCost_Labor() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}

	@Test

	public void AUT_Payment_DeathDisabilityBenefit_ClaimCost_Legal() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_DeathDisabilityBenefit_ClaimCost_LostWages() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_DeathDisabilityBenefit_ClaimCost_Other() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_DeathDisabilityBenefit_ClaimCost_Reimbursement() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_DeathDisabilityBenefit_ClaimCost_Settlement() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_DeathDisabilityBenefit_ClaimCost_Vehicleinspection() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_DeathDisabilityBenefit_ExpenseAO_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_DeathDisabilityBenefit_ExpenseAO_CaseManagement() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_DeathDisabilityBenefit_ExpenseAO_Legal() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	
	@Test

	public void AUT_Payment_DeathDisabilityBenefit_ExpenseAO_Other() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_DeathDisabilityBenefit_ExpenseAO_Salvage() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_DeathDisabilityBenefit_ExpenseAO_Vehicleappraisal() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_DeathDisabilityBenefit_ExpenseAO_Vehicleinspection() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_DeathDisabilityBenefit_ExpenseDCC_UnspecifiedCostCategory() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test

	public void AUT_Payment_DeathDisabilityBenefit_ExpenseDCC_Legal() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	
	@Test
	public void AUT_Payment_DeathDisabilityBenefit_ExpenseDCC_Other() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	@Test
	public void AUT_Payment_DeathDisabilityBenefit_ExpenseDCC_Vehicleinspection() throws Throwable {
		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// login to ClaimCenter
				GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("BettyBaker");

				// ----->Assign Claim
				CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
				// ----->Click on Action-Reserve
				Tab_Menu_Navigation.ccMenuNavigation("Reserve");

				// ---> Verify whether a default reserve is created
				ClaimCenter_Reserve.verify_DefaultReserve();

				ClaimCenter_Reserve.VerifyCostType_CostCategory();

				ClaimCenter_Reserve.EditReserves_Save();
				// verifying financial transaction //
				// CC_NewTransaction_Check.FinancialsTransactions();

				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("Exposures");
				ClaimCenter_ClaimExposure.Validateclaimexposure();
				Thread.sleep(2000);
				Tab_Menu_Navigation.ccMenuNavigation("ValidateClaimExposures AbilityToPay");
				ClaimCenter_ClaimExposure.ValidationResults();

				// ----->Click on Action-Check
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
				Tab_Menu_Navigation.ccMenuNavigation("Check");
				CC_NewTransaction_Check.Enterpayeeinformation();
				CC_NewTransaction_Check.Enterpaymentinformation();

				// CC_NewTransaction_Check.Button();
				CC_NewTransaction_Check.Setcheckinstructions();
	}
	}
