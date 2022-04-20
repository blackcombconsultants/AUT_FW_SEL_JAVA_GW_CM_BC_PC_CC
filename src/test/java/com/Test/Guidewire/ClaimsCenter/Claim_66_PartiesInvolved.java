package com.Test.Guidewire.ClaimsCenter;

import org.testng.annotations.Test;

import com.pages.Guidewire.ClaimsCenter.CC_PartiesInvolved;
import com.pages.Guidewire.ClaimsCenter.CC_Reusables;

public class Claim_66_PartiesInvolved {
	// Author:Misba
	// Date:17/01/2022
	@Test
	public void CC66_TC001_DBAandLegaladdedinRelationToContacts() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// Claim Search
		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		// parties involved
		CC_Reusables.ccMenuNavigation("Parties Involved");

		CC_PartiesInvolved.Validate_ContactHeader();
		CC_PartiesInvolved.Contacts_DBAandLegaladdedinRelationToContacts();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}
	@Test
	public void CC66_TC002_W9ClassificationisAddedBelowW9ValidbelowOptions() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// Claim Search
		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		// parties involved
		CC_Reusables.ccMenuNavigation("Parties Involved");
		CC_PartiesInvolved.Validate_ContactHeader();
		CC_PartiesInvolved.Vendor_W9ClassificationisAddedBelowW9ValidbelowOptions();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}
	@Test
	public void CC66_TC003_W9ClassificationisMandatory() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// Claim Search
		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		// parties involved
		CC_Reusables.ccMenuNavigation("Parties Involved");

		CC_PartiesInvolved.Validate_ContactHeader();
		CC_PartiesInvolved.Vendor_W9ClassificationisMandatory();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}
	@Test
	public void CC66_TC004_TaxInfoAndOneDividerishidden() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// Claim Search
		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		// parties involved
		CC_Reusables.ccMenuNavigation("Parties Involved");

		CC_PartiesInvolved.Validate_ContactHeader();
		CC_PartiesInvolved.Vendor_TaxInfoandOneDividerishidden();
		CC_PartiesInvolved.VendorCompany_TaxInfoisHidden();
		CC_PartiesInvolved.VendorCompany_OneDividerisHidden();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}
	@Test
	public void CC66_TC005_PossibleDublicateClaimValidateErrorMessage() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// Claim Search
		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		// parties involved
		CC_Reusables.ccMenuNavigation("Parties Involved");
		CC_PartiesInvolved.Validate_ContactHeader();
		CC_PartiesInvolved.NewContact_Company_PossibleDublicateClaimValidateErrorMessage();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}
	@Test
	public void CC66_TC006A_vendorisnotautomaticallylinkedtoAddressBookContactmanager() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// Claim Search
		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		// parties involved
		CC_Reusables.ccMenuNavigation("Parties Involved");
		CC_PartiesInvolved.Validate_ContactHeader();
		CC_PartiesInvolved.Contact_NewLaw_vendorisnotautomaticallylinkedtoAddressBookContactmanager();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}
	@Test
	public void CC66_TC006B_TaxIDIsnotMandatoryforPlatiffLaw() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// Claim Search
		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		// parties involved
		CC_Reusables.ccMenuNavigation("Parties Involved");
		CC_PartiesInvolved.Validate_ContactHeader();
		CC_PartiesInvolved.Contacts_NewLawFirm_TaxIDIsnotMandatoryforPlatiffLaw();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}
	@Test
	public void CC66_TC007_updateTypelistContactRoles() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// Claim Search
		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		// parties involved
		CC_Reusables.ccMenuNavigation("Parties Involved");
		CC_PartiesInvolved.Validate_ContactHeader();
		CC_PartiesInvolved.NewContact_Company_updateTypelistContactRoles();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}
	@Test
	public void CC66_TC008_ExternalSubrogationFirmisRenamedToSubrogationFirm() throws Throwable {
		// User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// Claim Search
		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		// parties involved
		CC_Reusables.ccMenuNavigation("Parties Involved");
		CC_PartiesInvolved.Validate_ContactHeader();
		CC_PartiesInvolved.NewContact_Company_ExternalSubrogationFirmisRenamedToSubrogationFirm();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();
	}

}
