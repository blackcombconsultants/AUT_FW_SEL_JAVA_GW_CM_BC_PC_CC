package com.Test.Guidewire.ClaimsCenter;

import org.testng.annotations.Test;

import com.pages.Guidewire.ClaimsCenter.CC_NewClaimWizard;
import com.pages.Guidewire.ClaimsCenter.CC_NewTransaction_Check;
import com.pages.Guidewire.ClaimsCenter.CC_Reusables;
import com.pages.Guidewire.ClaimsCenter.CC_Workplan;

public class CC92_TransactionApprovals {
	/*
	 * /* Testcase ID : Claim92_TC001 Decription : CheckRoutedToExposureOwnerForApproval Owner : Rahul Dixit Date : -01-2022
	 */

	@Test
	public void Claim92_TC001_CheckRoutedToExposureOwnerForApproval() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.Enterpayeeinformation();
		CC_Reusables.clickButton("Next");
		CC_NewTransaction_Check.Enterpaymentinformation();

		// CC_NewClaimWizard.LinkDocuments();
		/*
		 * CC_Resuables.ccMenuNavigation("Workplan"); ClaimCenter_Workplan.Verify_WorkplanElements();
		 */
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();

	}

	/*
	 * Testcase ID : Claim92_TC002 Decription :CheckRoutedToSupervisorExposureOwningGroupForApproval Owner : Rahul Dixit Date : 19-01-2022
	 */

	@Test
	public void Claim92_TC002_CheckRoutedToSupervisorExposureOwningGroupForApproval() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.Enterpayeeinformation();
		CC_Reusables.clickButton("Next");
		CC_NewTransaction_Check.Enterpaymentinformation();
		CC_NewClaimWizard.LinkDocuments();
		CC_Reusables.ccMenuNavigation("Workplan");
		CC_Workplan.Verify_CheckRoutedToSupervisorExposureOwningGroupForApproval();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();

	}

	/*
	 * Testcase ID : Claim92_TC003 Decription : CheckRoutedToClaimOwnerForApproval Owner : Rahul Dixit Date : 19-01-2022
	 */

	@Test
	public void Claim92_TC003_CheckRoutedToClaimOwnerForApproval() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.Enterpayeeinformation();
		CC_Reusables.clickButton("Next");
		CC_NewTransaction_Check.Enterpaymentinformation();
		// CC_NewClaimWizard.LinkDocuments();
		CC_Reusables.ccMenuNavigation("Workplan");
		CC_Workplan.Verify_CheckRoutedToClaimOwnerForApproval();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();

	}
	/*
	 * Testcase ID : Claim92_TC003 Decription : CheckRoutedToClaimOwnerForApproval Owner : Rahul Dixit Date : 19-01-2022
	 */
	@Test
	public void Claim92_TC004_CheckRoutedToSupervisorOfClaimOwningGroup() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		CC_Reusables.ccMenuNavigation("Check");
		CC_NewTransaction_Check.Enterpayeeinformation();
		CC_Reusables.clickButton("Next");
		CC_NewTransaction_Check.Enterpaymentinformation();
		CC_NewClaimWizard.LinkDocuments();
		CC_Reusables.ccMenuNavigation("Workplan");
		CC_Workplan.Verify_CheckRoutedToClaimOwnerForApproval();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();

	}
}
