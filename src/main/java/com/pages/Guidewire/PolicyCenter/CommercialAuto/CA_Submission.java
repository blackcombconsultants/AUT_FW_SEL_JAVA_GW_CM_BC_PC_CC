package com.pages.Guidewire.PolicyCenter.CommercialAuto;

import com.pages.Guidewire.PolicyCenter.CommercialAuto.*;
import org.testng.annotations.Test;

import com.Utils.Selenium.GW_GetDriver;
import com.pages.Guidewire.GW_CM_PC_BC_CC_Login;
import com.pages.Guidewire.Tab_Menu_Navigation;
import com.pages.Guidewire.PolicyCenter.PC_Account;
import com.pages.Guidewire.PolicyCenter.PC_AccountSummary;
import com.pages.Guidewire.PolicyCenter.PC_Bound;
import com.pages.Guidewire.PolicyCenter.PC_PolicySummary;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Resuables;

public class CA_Submission extends GW_GetDriver {
	@Test

	public void AUT_CA_PC_NewSubmission_NewAccount_NewSubmission() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter_User("SuperUser");
		CA_Reusables.SubmissionProcess("New Company Account", "Issue Policy");

	}

	@Test
	public void AUT_CA_PC_DeclinedNewBusinessSubmission() throws Throwable {

		// login to pc
		GW_CM_PC_BC_CC_Login.login_PolicyCenter_User("SuperUser");
		// create person account
		Tab_Menu_Navigation.pcTabNavigation("New Account", "NA");
		PC_Account.createPersonAccount();
		PC_AccountSummary.detail_Verify();
		// Navigate to New submission
		Tab_Menu_Navigation.pcMenuNavigation("New Submission");
		PolicyCenter_Resuables.newSubmissions_Verify();
		// select LOB
		CA_Reusables.newSubmission_SelectLOB_CommercialAuto();

		strAccountName      = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber    = PolicyCenter_Resuables.infoBar("AccountNumber");
		strSubmissionNumber = PolicyCenter_Resuables.infoBar("SubmissionNumber");

		// new submission
		PolicyCenter_Resuables.offering();
		PolicyCenter_Resuables.clickButton("Next");
		CA_Qualification.qualification();
		PolicyCenter_Resuables.clickButton("Next");
		CA_PolicyInfo.dateQuoteNeeded();
		CA_PolicyInfo.primaryNamedInsured();
		CA_PolicyInfo.policyAddress();
		CA_PolicyInfo.OfficialID();
		CA_PolicyInfo.OrganizationType();
		CA_PolicyInfo.policyDetails();
		PolicyCenter_Resuables.clickButton("Next");
		CA_CommercialAutoLine.coverages_Product();
		CA_CommercialAutoLine.coverages_Fleet();
		CA_CommercialAutoLine.coverages_SeasonalTrailerLiability();
		PolicyCenter_Resuables.clickButton("Next");
		CA_Locations.Location();
		PolicyCenter_Resuables.clickButton("Next");
		CA_Vehicles.VehicleInformation();
		PolicyCenter_Resuables.clickButton("Next");
		CA_StateInfo.Stateinfo();
		PolicyCenter_Resuables.clickButton("Next");
		CA_Drivers.Driver();
		CA_Drivers.DriverDetails();
		PolicyCenter_Resuables.clickButton("Next");
		CA_CoveredVehicles.CoveredVehicles();
		PolicyCenter_Resuables.clickButton("Next");
		CA_Modifiers.Modifiers();
		PolicyCenter_Resuables.clickButton("Next");
		CA_RiskAnalysis.button_Verify();
		PolicyCenter_Resuables.clickButton("Next");
		CA_PolicyReview.PolicyReview();
		CA_PolicyReview.PolicyDetails();
		PolicyCenter_Resuables.clickButton("Quote");
		CA_Reusables.CaValidationError();
		CA_Reusables.submissionMenuNavigation("Commercial Auto Line");
		CA_Reusables.CaValidationError();
		PolicyCenter_Resuables.clickButton("Quote");
		CA_Quote.quoteDetails();
		PolicyCenter_Resuables.clickButton("Close Options");
		PolicyCenter_Resuables.clickButton("Decline");
		// submission declined
		PolicyCenter_Resuables.Submission_Declined();
		PC_Bound.viewYourSubmissionDeclined();
		// logout pc
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	// Bind
	@Test
	public void AUT_PC_CA_Issuance_Initiation_IssuanceDraft() throws Throwable {

	}
	@Test
	public void AUT_PC_CA_Issuance_IssuanceReview() throws Throwable {

	}
	@Test
	public void AUT_PC_CA_Issuance_WithdrawTransaction() throws Throwable {

	}
	@Test
	public void AUT_PC_CA_Issuance_IssuanceQuoted() throws Throwable {

	}
	@Test
	public void AUT_PC_CA_Issuance_EditIssuance() throws Throwable {

	}
	@Test
	public void AUT_PC_CA_Issuance_IssuePolicy() throws Throwable {

	}
	// Forms
	@Test
	public void AUT_PC_CA_FormsInferenceLogic() throws Throwable {

	}
	// Product Model
	@Test
	public void AUT_PC_CA_ProductModel_Coverages() throws Throwable {

	}
	@Test
	public void AUT_PC_CA_ProductModel_AdditionalCoverages() throws Throwable {

	}
	@Test
	public void AUT_PC_CA_ProductModel_Discounts() throws Throwable {

	}
	// Rating
	@Test
	public void AUT_PC_CA_Rate_TableConfig() throws Throwable {

	}
	@Test
	public void AUT_PC_CA_Rate_RoutineConfig() throws Throwable {

	}
	@Test
	public void AUT_PC_CA_Rate_BookConfig() throws Throwable {

	}
	@Test
	public void AUT_PC_CA_ExternalRatingSystem() throws Throwable {

	}
	@Test
	public void AUT_PC_CA_ComparativeRater() throws Throwable {

	}

}
