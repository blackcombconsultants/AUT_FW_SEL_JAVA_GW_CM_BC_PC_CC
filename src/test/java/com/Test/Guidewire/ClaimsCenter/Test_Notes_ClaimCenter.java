package com.Test.Guidewire.ClaimsCenter;

import org.testng.*;
import org.testng.annotations.Test;

import com.pages.Guidewire.GW_CM_PC_BC_CC_Login;
import com.pages.Guidewire.Tab_Menu_Navigation;
import com.pages.Guidewire.ClaimsCenter.CC_Financials;
import com.pages.Guidewire.ClaimsCenter.CC_NewClaimWizard;
import com.pages.Guidewire.ClaimsCenter.CC_NewTransaction_Check;
import com.pages.Guidewire.ClaimsCenter.CC_Notes;
import com.pages.Guidewire.ClaimsCenter.ClaimCenter_ClaimExposure;
import com.pages.Guidewire.ClaimsCenter.ClaimCenter_Reserve;

public class Test_Notes_ClaimCenter {

	@Test

	public void AUT_CreateANewNoteAndUpdate() throws Throwable {

		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		Tab_Menu_Navigation.ccTabNavigation("Claim Search", "NA");
		// Click on Notes
		Tab_Menu_Navigation.ccMenuNavigation("Notes");

		CC_Notes.CreateANewNote();

		// -----> logout Claim Center
		GW_CM_PC_BC_CC_Login.logout_ClaimsCenter();
	}
	
	@Test

	public void AUT_CreateANewNoteFromTemplate() throws Throwable {

		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		Tab_Menu_Navigation.ccTabNavigation("Claim Search", "NA");
		// Click on Notes
		Tab_Menu_Navigation.ccMenuNavigation("Notes");

		CC_Notes.CreateANewNoteFromTemplate();

		// -----> logout Claim Center
		GW_CM_PC_BC_CC_Login.logout_ClaimsCenter();
	}
	@Test

	public void AUT_CreateANewNoteAndCancel() throws Throwable {

		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		Tab_Menu_Navigation.ccTabNavigation("Claim Search", "NA");
		// Click on Notes
		Tab_Menu_Navigation.ccMenuNavigation("Notes");

		CC_Notes.CreateANewNoteAndCancel();

		// -----> logout Claim Center
		GW_CM_PC_BC_CC_Login.logout_ClaimsCenter();
	}
	@Test

	public void AUT_EditAnExistingNote() throws Throwable {

		// login to ClaimCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		Tab_Menu_Navigation.ccTabNavigation("Claim Search", "NA");
		// Click on Notes
		Tab_Menu_Navigation.ccMenuNavigation("Notes");

		CC_Notes.EditAnExistingNote();

		// -----> logout Claim Center
		GW_CM_PC_BC_CC_Login.logout_ClaimsCenter();
	}
}
