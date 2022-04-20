package com.Test.Guidewire.CommercialAuto;

import org.testng.annotations.Test;

import com.Utils.Selenium.GW_GetDriver;
import com.pages.Guidewire.GW_CM_PC_BC_CC_Login;
import com.pages.Guidewire.Tab_Menu_Navigation;
import com.pages.Guidewire.PolicyCenter.PC_Bound;
import com.pages.Guidewire.PolicyCenter.PC_PolicySummary;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Resuables;
import com.pages.Guidewire.PolicyCenter.CommercialAuto.CA_Quote;
import com.pages.Guidewire.PolicyCenter.CommercialAuto.CA_Reusables;
import com.pages.Guidewire.PolicyCenter.CommercialAuto.CA_RiskAnalysis;

public class CA_ReinstatePolicy extends GW_GetDriver {

	@Test
	public void AUT_CA_PC_CommercialAuto_Reinstatement() throws Throwable {

		// login to pc
		GW_CM_PC_BC_CC_Login.login_PolicyCenter_User("SuperUser");
		// New submission
		CA_Reusables.SubmissionProcess("New Company Account", "Issue Policy");
		// validating Reinstate Premium
		PC_PolicySummary.completedPolicyTransactions_reinstatePremium();
		// Cancel Policy
		PolicyCenter_Resuables.Policytransactions("CancelPolicy_CancelNow");
		// Reinstate Policy
		Tab_Menu_Navigation.pcMenuNavigation("Reinstate Policy");
		PolicyCenter_Resuables.startReinstatement_PolicyDetails();
		PolicyCenter_Resuables.startReinstatement_AffinityGroup();
		PolicyCenter_Resuables.clickButton("Next");
		CA_RiskAnalysis.button_Verify();
		PolicyCenter_Resuables.clickButton("Save Draft");
		PolicyCenter_Resuables.clickButton("Quote");
		CA_Quote.policyPremium_PremiumSubtotalandTaxes();
		PolicyCenter_Resuables.clickButton("Next");
		PolicyCenter_Resuables.clickButton("Save Draft");
		PolicyCenter_Resuables.clickButton("Reinstate");
		PC_Bound.Reinstatement_ViewYourPolicy();
		// logout
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PC_CA_StartReinstatement() throws Throwable {

	}
	@Test
	public void AUT_PC_CA_Reinstatement_Quote() throws Throwable {

	}
	@Test
	public void AUT_PC_CA_Reinstatement_RiskAnalysis() throws Throwable {

	}
	@Test
	public void AUT_PC_CA_Reinstatement_Withdraw() throws Throwable {

	}
	@Test
	public void AUT_PC_CA_Reinstatement_EditPolicyTransaction() throws Throwable {

	}
	@Test
	public void AUT_PC_CA_Reinstatement_FormsAndDocGeneration() throws Throwable {

	}

}
