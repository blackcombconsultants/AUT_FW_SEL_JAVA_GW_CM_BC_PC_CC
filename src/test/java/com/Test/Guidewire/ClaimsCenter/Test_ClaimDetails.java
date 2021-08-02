package com.Test.Guidewire.ClaimsCenter;

import org.testng.annotations.Test;

import com.Utils.Selenium.GW_GetDriver;
import com.pages.Guidewire.GW_CM_PC_BC_CC_Login;
import com.pages.Guidewire.Tab_Menu_Navigation;
import com.pages.Guidewire.ClaimsCenter.CC_NewClaimWizard;
import com.pages.Guidewire.ClaimsCenter.ClaimCenter_Contacts;

public class Test_ClaimDetails extends GW_GetDriver {

	@Test
	public void AUT_ClaimDetails_PartiesInvolved_Contacts() throws Throwable {

		// ------>Login to CliamCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// ------>Creating New Claim
		CC_NewClaimWizard.assignClaimProcess("New Claim", "NewclaimAuto");

		// ---->Adding new contact
		Tab_Menu_Navigation.ccMenuNavigation("Parties Involved Contacts");
		ClaimCenter_Contacts.New_Contact();
	}

	@Test
	public void AUT_ClaimDetails_PartiesInvolved_DuplicateContactsVerify() throws Throwable {

		// ------>Login to CliamCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// ------>Creating New Claim
		CC_NewClaimWizard.assignClaimProcess("New Claim", "NewclaimAuto");

		// ---->Adding new contact
		Tab_Menu_Navigation.ccMenuNavigation("Parties Involved Contacts");
		ClaimCenter_Contacts.New_Contact();
		ClaimCenter_Contacts.NewContact_DuplicateContactFound_Verify();
	}

}
