package com.Test.Guidewire.ClaimsCenter;

import org.testng.annotations.Test;

import com.Utils.Selenium.GW_GetDriver;
import com.pages.Guidewire.ClaimsCenter.CC_Contacts;
import com.pages.Guidewire.ClaimsCenter.CC_NewClaimWizard;
import com.pages.Guidewire.ClaimsCenter.CC_Reusables;

public class Test_ClaimDetails extends GW_GetDriver {

	@Test
	public void AUT_ClaimDetails_PartiesInvolved_Contacts() throws Throwable {

		// ------>Login to CliamCenter
		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// ------>Creating New Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ---->Adding new contact
		CC_Reusables.ccMenuNavigation("Parties Involved Contacts");
		CC_Contacts.New_Contact();
	}

	@Test
	public void AUT_ClaimDetails_PartiesInvolved_DuplicateContactsVerify() throws Throwable {

		// ------>Login to CliamCenter
		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// ------>Creating New Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ---->Adding new contact
		CC_Reusables.ccMenuNavigation("Parties Involved Contacts");
		CC_Contacts.New_Contact();
		CC_Contacts.NewContact_DuplicateContactFound_Verify();
	}

}
