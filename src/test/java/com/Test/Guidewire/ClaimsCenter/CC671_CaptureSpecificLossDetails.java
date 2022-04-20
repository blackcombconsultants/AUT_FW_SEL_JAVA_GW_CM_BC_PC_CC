package com.Test.Guidewire.ClaimsCenter;

import org.testng.annotations.Test;

import com.Utils.Selenium.GW_GetDriver;
import com.pages.Guidewire.ClaimsCenter.CC_NewClaimWizard;
import com.pages.Guidewire.ClaimsCenter.CC_Reusables;

public class CC671_CaptureSpecificLossDetails extends GW_GetDriver {
	@Test
	public static void CC671_TC001_CC_VerifiedPolicyAddField_OwnerLossParty() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_Reusables.ccTabNavigation("New Claim", "NA");
		// ----->Assign Claim
		CC_NewClaimWizard.ncw_SearchorCreatePolicy_FindPolicy_Search();
		CC_NewClaimWizard.ncw_SearchorCreatePolicy_BasicInformation();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.bi_ReportedBy_NewPerson();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.ncw_PossibleDuplicateClaims();
		CC_NewClaimWizard.ncw_AddClaimInformation_Liability_AddGeneralDamage();

		CC_NewClaimWizard.ncw_AddClaimInformation_Liability_AddGeneralDamage_VerifyOwnerLossParty();

		CC_Reusables.logout_ClaimsCenterWithAlert();

	}

	@Test
	public static void CC671_TC002_CC_VerifiedPolicyContactPicker_OwnerLossParty() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_Reusables.ccTabNavigation("New Claim", "NA");
		// ----->Assign Claim
		CC_NewClaimWizard.ncw_SearchorCreatePolicy_FindPolicy_Search();
		CC_NewClaimWizard.ncw_SearchorCreatePolicy_BasicInformation();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.bi_ReportedBy_NewPerson();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.ncw_PossibleDuplicateClaims();
		CC_NewClaimWizard.ncw_AddClaimInformation_Liability_AddGeneralDamage();

		CC_NewClaimWizard.ncw_AddClaimInformation_Liability_AddGeneralDamage_VerifyContactPicker();

		CC_Reusables.logout_ClaimsCenterWithAlert();

	}
	@Test
	public static void CC671_TC003_CC_VerifiedPolicyContactPicker_NewPerson() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_Reusables.ccTabNavigation("New Claim", "NA");
		// ----->Assign Claim
		CC_NewClaimWizard.ncw_SearchorCreatePolicy_FindPolicy_Search();
		CC_NewClaimWizard.ncw_SearchorCreatePolicy_BasicInformation();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.bi_ReportedBy_NewPerson();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.ncw_PossibleDuplicateClaims();
		CC_NewClaimWizard.ncw_AddClaimInformation_Liability_AddGeneralDamage();

		CC_NewClaimWizard.ncw_AddClaimInformation_Liability_AddGeneralDamage_VerifyContact_NewPerson();

		CC_Reusables.logout_ClaimsCenterWithAlert();

	}
	@Test
	public static void CC671_TC004_CC_VerifiedPolicyContactPicker_NewCompany() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_Reusables.ccTabNavigation("New Claim", "NA");
		// ----->Assign Claim
		CC_NewClaimWizard.ncw_SearchorCreatePolicy_FindPolicy_Search();
		CC_NewClaimWizard.ncw_SearchorCreatePolicy_FindPolicy_NewClaim();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.bi_ReportedBy_NewPerson();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.ncw_PossibleDuplicateClaims();
		CC_NewClaimWizard.ncw_AddClaimInformation_Liability_AddGeneralDamage();

		CC_NewClaimWizard.ncw_AddClaimInformation_Liability_AddGeneralDamage_VerifyContact_NewCompany();

		CC_Reusables.logout_ClaimsCenterWithAlert();

	}

	@Test
	public static void CC671_TC005_CC_VerifiedPolicyContactPicker_ContactDetails() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_Reusables.ccTabNavigation("New Claim", "NA");
		// ----->Assign Claim
		CC_NewClaimWizard.ncw_SearchorCreatePolicy_FindPolicy_Search();
		CC_NewClaimWizard.ncw_SearchorCreatePolicy_FindPolicy_NewClaim();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.bi_ReportedBy_NewPerson();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.ncw_PossibleDuplicateClaims();
		CC_NewClaimWizard.ncw_AddClaimInformation_Liability_AddGeneralDamage();

		CC_NewClaimWizard.ncw_AddClaimInformation_Liability_AddGeneralDamage_VerifyContact_ContactDetails();

		CC_Reusables.logout_ClaimsCenterWithAlert();

	}

	@Test
	public static void CC671_TC006_CC_Policy_ContactAssignedExistingRole() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_Reusables.ccTabNavigation("New Claim", "NA");
		// ----->Assign Claim
		CC_NewClaimWizard.ncw_SearchorCreatePolicy_FindPolicy_Search();
		CC_NewClaimWizard.ncw_SearchorCreatePolicy_FindPolicy_NewClaim();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.bi_ReportedBy_NewPerson();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.ncw_PossibleDuplicateClaims();
		CC_NewClaimWizard.ncw_AddClaimInformation_Liability_AddGeneralDamage();

		CC_NewClaimWizard.ncw_AddClaimInformation_Liability_NewGeneralDamage();

		CC_Reusables.ccMenuNavigation("Parties Involved");

		CC_NewClaimWizard.ncw_AddClaimInformation_PartiesInvolvedVerifyName();
		CC_Reusables.logout_ClaimsCenterWithAlert();

	}

	@Test
	public static void CC671_TC007_CC_Policy_RelableOwnerFieldPropertyIncident() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_Reusables.ccTabNavigation("New Claim", "NA");
		// ----->Assign Claim
		CC_NewClaimWizard.ncw_SearchorCreatePolicy_FindPolicy_Search();
		CC_NewClaimWizard.ncw_SearchorCreatePolicy_FindPolicy_NewClaim();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.bi_ReportedBy_NewPerson();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.ncw_PossibleDuplicateClaims();
		CC_NewClaimWizard.ncw_AddClaimInformation_Liability_AddPropertyDamage();
		CC_NewClaimWizard.ncw_AddClaimInformation_Liability_AddPropertyDamage_LossParty();
		CC_Reusables.logout_ClaimsCenterWithAlert();

	}

	@Test
	public static void CC671_TC008_CC_Policy_RelableOwnerFieldVehicleIncident() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_Reusables.ccTabNavigation("New Claim", "NA");
		// ----->Assign Claim
		CC_NewClaimWizard.ncw_SearchorCreatePolicy_FindPolicy_Search();
		CC_NewClaimWizard.ncw_SearchorCreatePolicy_FindPolicy_NewClaim();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.bi_ReportedBy_NewPerson();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.ncw_PossibleDuplicateClaims();
		CC_NewClaimWizard.ncw_AddClaimInformation_Liability_AddPVehicle();
		CC_NewClaimWizard.ncw_AddClaimInformation_Liability_AddVehicle_LossParty();

		CC_Reusables.logout_ClaimsCenterWithAlert();

	}

	@Test
	public static void CC671_TC009_CC_VerifiedPolicyContactPicker_OwnerLossParty() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_Reusables.ccTabNavigation("New Claim", "NA");
		// ----->Assign Claim
		CC_NewClaimWizard.ncw_SearchorCreatePolicy_FindPolicy_Search();
		CC_NewClaimWizard.ncw_SearchorCreatePolicy_FindPolicy_NewClaim();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.bi_ReportedBy_NewPerson();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.ncw_PossibleDuplicateClaims();
		CC_NewClaimWizard.ncw_AddClaimInformation_Liability_AddPropertyDamage();
		CC_NewClaimWizard.ncw_AddClaimInformation_Liability_AddPropertyDamage_VerifyContactPicker();

		CC_Reusables.logout_ClaimsCenterWithAlert();

	}

	@Test
	public static void CC671_TC0010_CC_VerifiedPolicyContactPicker_OwnerLossParty() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_Reusables.ccTabNavigation("New Claim", "NA");
		// ----->Assign Claim
		CC_NewClaimWizard.ncw_SearchorCreatePolicy_FindPolicy_Search();
		CC_NewClaimWizard.ncw_SearchorCreatePolicy_FindPolicy_NewClaim();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.bi_ReportedBy_NewPerson();
		CC_Reusables.clickButton("Next");
		CC_NewClaimWizard.ncw_PossibleDuplicateClaims();
		CC_NewClaimWizard.ncw_AddClaimInformation_Liability_AddPVehicle();
		CC_NewClaimWizard.ncw_AddClaimInformation_Liability_AddVehicle_LossParty();
		CC_NewClaimWizard.ncw_AddClaimInformation_Liability_AddVehicleDamage_VerifyContactPicker();

		CC_Reusables.logout_ClaimsCenterWithAlert();

	}
}
