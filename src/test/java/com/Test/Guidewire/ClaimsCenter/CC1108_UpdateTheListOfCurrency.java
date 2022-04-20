package com.Test.Guidewire.ClaimsCenter;

import org.testng.annotations.Test;

import com.pages.Guidewire.ClaimsCenter.CC_CreateRecovery;
import com.pages.Guidewire.ClaimsCenter.CC_Financials;
import com.pages.Guidewire.ClaimsCenter.CC_NewClaimWizard;
import com.pages.Guidewire.ClaimsCenter.CC_NewTransaction_Check;
import com.pages.Guidewire.ClaimsCenter.CC_Reserve;
import com.pages.Guidewire.ClaimsCenter.CC_Reusables;

public class CC1108_UpdateTheListOfCurrency {

	@Test
	public void CC1108_TC001_VerifyNewCurrencyAddedinPolicyLevelCoverage() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// NewClaim
		CC_Reusables.ccTabNavigation("New Claim", "NA");
		// ----->Assign Claim
		// ----->Assign Claim
		CC_NewClaimWizard.ncw_SearchorCreatePolicy_CreateUnverifiedPolicy();
		CC_NewClaimWizard.ncw_CreateUnverifiedPolicy_BasicInformation();
		CC_NewClaimWizard.ncw_CreateUnverifiedPolicy_Insured_NewPerson();
		CC_Reusables.clickButton("Update");
		CC_NewClaimWizard.ncw_CreateUnverifiedPolicy_LevelCoverages_VerifyCurrency();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public void CC1108_TC002_CC_OpenExistingClaimNewCurrencies() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// Claim Search
		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		// Action reserve
		CC_Reusables.ccMenuNavigation("Financials Transactions");
		Thread.sleep(2000);
		CC_Financials.FinancialsTransactions_Reserve1();
		Thread.sleep(1000);
		CC_Reserve.ReserveDetails_VerifyNewCurrencyAdd();
		CC_Reserve.ReserveDetails_VerifyNewCurrencyAddedUSD();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}
	@Test
	public void CC1108_TC004_VerifyNewCurrencyAddedinReserve() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// Claim Search
		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		// Action reserve
		CC_Reusables.ccMenuNavigation("Reserve");
		CC_Reserve.ReserveDetails_VerifyNewCurrencyAddedUSD();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}
	@Test
	public void CC1108_TC005_VerifyNewCurrencyAddedinCreateRecovery() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// Claim Search
		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		// Action reserve
		CC_Reusables.ccMenuNavigation("Recovery");
		CC_CreateRecovery.VerifyCurrencyAdded();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}

	@Test
	public void CC1108_TC006_VerifyNewCurrencyAddedinCheck() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// Claim Search
		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		// Action reserve
		CC_Reusables.ccMenuNavigation("Manual Check");
		CC_NewTransaction_Check.Enterpayeeinformation();
		CC_Reusables.clickButton("Next");
		CC_Reserve.ReserveDetails_VerifyNewCurrencyAdded();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenterWithAlert();
	}
}
