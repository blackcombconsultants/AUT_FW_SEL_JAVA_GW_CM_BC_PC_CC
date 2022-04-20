package com.Test.Guidewire.ClaimsCenter;

import org.testng.annotations.Test;

import com.pages.Guidewire.ClaimsCenter.CC_LossDetails;
import com.pages.Guidewire.ClaimsCenter.CC_NewClaimWizard;
import com.pages.Guidewire.ClaimsCenter.CC_Reusables;

public class CC81_ViewClaimHistory {
	/*
	 * Testcase ID : Claim81_ComplexityChangesInHistoryScreen Owner: Rahul Dixit Description: ComplexityChangesInHistoryScreen Date: 11/01/22
	 */

	@Test
	public void Claim81_TC001_ComplexityChangesInHistoryScreen() throws Throwable {
		// Step: 01 User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// Step: 02 navigating to the Exixting Claim
		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		CC_Reusables.ccMenuNavigation("Loss Details");
		CC_Reusables.clickButton("Edit");
		CC_LossDetails.ChangeComplexityValue();

		CC_Reusables.ccMenuNavigation("History");
		CC_LossDetails.VerifyComplexityChangedInHistoryScreen();

		CC_Reusables.logout_ClaimsCenter();
	}
	/*
	 * Testcase ID : Claim81_TC002_ExposureDeletedInHistoryScreen Owner: Rahul Dixit Description: ExposureDeletedInHistoryScreen Date: 11/01/22
	 */

	@Test
	public void Claim81_TC002_DocumentDeletedInHistoryScreen() throws Throwable {
		// Step: 01 User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// Step: 02 navigating to the Exixting Claim
		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		CC_Reusables.ccMenuNavigation("Documents");
		CC_NewClaimWizard.DeleteDocuments();
		CC_Reusables.ccMenuNavigation("History");
		CC_LossDetails.VerifyDocumentDeletedInHistoryScreen();
		CC_Reusables.logout_ClaimsCenter();
	}

	/*
	 * Testcase ID : Claim81_TC003_MatterShouldBeAdded Owner: Rahul Dixit Description: MatterShouldBeAdded Date: 11/01/22
	 */

	@Test
	public void Claim81_TC003_MatterShouldBeAdded() throws Throwable {
		// Step: 01 User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// Step: 02 navigating to the Exixting Claim
		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		// CC_Resuables.ccMenuNavigation("Actions");
		CC_Reusables.ccMenuNavigation("New Matter");
		CC_NewClaimWizard.NewMatterInfo();
		CC_Reusables.clickButton("Update");
		CC_Reusables.ccMenuNavigation("History");
		CC_LossDetails.VerifyMatterCreatedInHistoryScreen();
		CC_Reusables.logout_ClaimsCenter();
	}
}
