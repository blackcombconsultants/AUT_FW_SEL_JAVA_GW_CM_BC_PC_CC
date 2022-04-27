package com.Test.Guidewire.CommercialAuto;

import org.testng.annotations.Test;

import com.Utils.Selenium.GW_GetDriver;
import com.pages.Guidewire.GW_CM_PC_BC_CC_Login;
import com.pages.Guidewire.Tab_Menu_Navigation;
import com.pages.Guidewire.PolicyCenter.PC_Account;
import com.pages.Guidewire.PolicyCenter.PC_AccountSummary;
import com.pages.Guidewire.PolicyCenter.PC_Bound;
import com.pages.Guidewire.PolicyCenter.PC_PolicySummary;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Resuables;
import com.pages.Guidewire.PolicyCenter.CommercialAuto.CA_CommercialAutoLine;
import com.pages.Guidewire.PolicyCenter.CommercialAuto.CA_CoveredVehicles;
import com.pages.Guidewire.PolicyCenter.CommercialAuto.CA_Drivers;
import com.pages.Guidewire.PolicyCenter.CommercialAuto.CA_Locations;
import com.pages.Guidewire.PolicyCenter.CommercialAuto.CA_Modifiers;
import com.pages.Guidewire.PolicyCenter.CommercialAuto.CA_PolicyInfo;
import com.pages.Guidewire.PolicyCenter.CommercialAuto.CA_PolicyReview;
import com.pages.Guidewire.PolicyCenter.CommercialAuto.CA_Qualification;
import com.pages.Guidewire.PolicyCenter.CommercialAuto.CA_Quote;
import com.pages.Guidewire.PolicyCenter.CommercialAuto.CA_Reusables;
import com.pages.Guidewire.PolicyCenter.CommercialAuto.CA_RiskAnalysis;
import com.pages.Guidewire.PolicyCenter.CommercialAuto.CA_StateInfo;
import com.pages.Guidewire.PolicyCenter.CommercialAuto.CA_Vehicles;

public class CA_Submission extends GW_GetDriver {
	@Test

	public void AUT_CA_PC_NewSubmission_NewAccount_NewSubmission() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter_User("SuperUser");
		// New submission
		CA_Reusables.SubmissionProcess("New Company Account", "Issue Policy");
		//logout
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_CA_PC_DeclinedNewBusinessSubmission() throws Throwable {

		// login to pc
		GW_CM_PC_BC_CC_Login.login_PolicyCenter_User("SuperUser");
		CA_Reusables.SubmissionProcess("New Company Account", "Quote");
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
