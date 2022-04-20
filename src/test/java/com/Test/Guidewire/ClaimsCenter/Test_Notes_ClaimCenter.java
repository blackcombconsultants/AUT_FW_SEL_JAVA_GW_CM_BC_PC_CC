package com.Test.Guidewire.ClaimsCenter;

import org.testng.annotations.Test;

import com.pages.Guidewire.ClaimsCenter.CC_Notes;
import com.pages.Guidewire.ClaimsCenter.CC_Reusables;

public class Test_Notes_ClaimCenter {

	@Test

	public void AUT_CreateANewNoteAndUpdate() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		// Click on Notes
		CC_Reusables.ccMenuNavigation("Notes");

		CC_Notes.CreateANewNote();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test

	public void AUT_CreateANewNoteFromTemplate() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		// Click on Notes
		CC_Reusables.ccMenuNavigation("Notes");

		CC_Notes.CreateANewNoteFromTemplate();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}
	@Test

	public void AUT_CreateANewNoteAndCancel() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		// Click on Notes
		CC_Reusables.ccMenuNavigation("Notes");

		CC_Notes.CreateANewNoteAndCancel();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}
	@Test

	public void AUT_EditAnExistingNote() throws Throwable {

		// login to ClaimCenter
		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		// Click on Notes
		CC_Reusables.ccMenuNavigation("Notes");

		CC_Notes.EditAnExistingNote();

		// -----> logout Claim Center
		CC_Reusables.logout_ClaimsCenter();
	}
}
