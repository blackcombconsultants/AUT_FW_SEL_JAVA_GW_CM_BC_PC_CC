package com.Test.Guidewire.ClaimsCenter;

import org.testng.annotations.Test;

import com.pages.Guidewire.ClaimsCenter.CC_Matter;
import com.pages.Guidewire.ClaimsCenter.CC_PartiesInvolved;
import com.pages.Guidewire.ClaimsCenter.CC_Reusables;

public class CC1218_HideContactSubTypeList {
	@Test
	public void CC1218_TC001_UserisNotAbletoseeContactSubtyepinVendor() throws Throwable {
		// Step1 : User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// Step2 : Choose Exixting Claim
		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		CC_Reusables.ccMenuNavigation("Parties Involved");

		CC_PartiesInvolved.UserisNotAbletoseeContactSubtyepinVendor();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();

	}
	@Test
	public void CC1218_TC002_UserisNotAbletoseeContactAttorneyOptionsinLegal() throws Throwable {
		// Step1 : User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// Step2 : Choose Exixting Claim
		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		CC_Reusables.ccMenuNavigation("Parties Involved");

		CC_PartiesInvolved.UserisNotAbletoseeContactAttorneyOptionsinLegal();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();

	}
	@Test
	public void CC1218_TC003_NewLegalandAttorneyishiddeninDefenseAttorneyField() throws Throwable {
		// Step1 : User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// Step2 : Choose Exixting Claim
		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		CC_Reusables.ccMenuNavigation("New Matter");

		CC_Matter.NewLegalandAttorneyishiddeninDefenseAttorneyField();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();

	}
	@Test
	public void CC1218_TC004_AutoRepairTowingMedicalDoctorisHiddenunderPlatifSubtypes() throws Throwable {
		// Step1 : User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// Step2 : Choose Exixting Claim
		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		CC_Reusables.ccMenuNavigation("New Matter");

		CC_Matter.AutoRepairTowingMedicalDoctorisHiddenunderPlantifSubtypes();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();

	}
	@Test
	public void CC1218_TC005_AutoRepairTowingMedicalDoctorisHiddenunderDefendentSubtypes() throws Throwable {
		// Step1 : User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// Step2 : Choose Exixting Claim
		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		CC_Reusables.ccMenuNavigation("New Matter");

		CC_Matter.AutoRepairTowingMedicalDoctorisHiddenunderDefendentSubtypes();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();

	}
	@Test
	public void CC1218_TC006_NewLegalandAttorneyishiddeninPlantiff() throws Throwable {
		// Step1 : User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// Step2 : Choose Exixting Claim
		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		CC_Reusables.ccMenuNavigation("New Matter");

		CC_Matter.NewLegalandAttorneyishiddeninPlantiff();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();

	}
	@Test
	public void CC1218_TC007_NewLegalandAttorneyishiddeninDefendent() throws Throwable {
		// Step1 : User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// Step2 : Choose Exixting Claim
		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		CC_Reusables.ccMenuNavigation("New Matter");

		CC_Matter.NewLegalandAttorneyishiddeninDefendent();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();

	}
}
