package com.Test.Guidewire.PersonalAuto;

import org.testng.annotations.Test;

import com.Utils.Selenium.GW_GetDriver;
import com.pages.Guidewire.GW_CM_PC_BC_CC_Login;
import com.pages.Guidewire.Tab_Menu_Navigation;
import com.pages.Guidewire.PolicyCenter.PC_Bound;
import com.pages.Guidewire.PolicyCenter.PC_PolicySummary;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Resuables;
import com.pages.Guidewire.PolicyCenter.PersonalAuto.PA_Coverages;
import com.pages.Guidewire.PolicyCenter.PersonalAuto.PA_Drivers;
import com.pages.Guidewire.PolicyCenter.PersonalAuto.PA_Forms;
import com.pages.Guidewire.PolicyCenter.PersonalAuto.PA_Payments;
import com.pages.Guidewire.PolicyCenter.PersonalAuto.PA_PolicyInfo;
import com.pages.Guidewire.PolicyCenter.PersonalAuto.PA_PolicyReview;
import com.pages.Guidewire.PolicyCenter.PersonalAuto.PA_Quote;
import com.pages.Guidewire.PolicyCenter.PersonalAuto.PA_Reusable;
import com.pages.Guidewire.PolicyCenter.PersonalAuto.PA_RiskAnalysis;
import com.pages.Guidewire.PolicyCenter.PersonalAuto.PA_Vehicles;

public class PA_ChangePolicy extends GW_GetDriver {

	/*
	 * Testcase = Full Quote Issue Policy Author = Arun Date Created = 27/04/21
	 * LOB = Personal Auto Parameter testData
	 * 
	 */

	@Test
	public void AUT_PA_PC_ChangePolicy_01() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PA_Reusable.submissionProcess("New Account", "Issue Policy");

		Tab_Menu_Navigation.pcMenuNavigation("Change Policy");

		strJob              = PolicyCenter_Resuables.infoBar("Job");
		strLOB              = PolicyCenter_Resuables.infoBar("LOB");
		strEffectiveDate    = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strAccountName      = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber    = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber     = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter      = PolicyCenter_Resuables.infoBar("Underwriter");
		strSubmissionNumber = PolicyCenter_Resuables.infoBar("PolicyChangeNumber");

		PolicyCenter_Resuables.offering();

		PolicyCenter_Resuables.clickButton("Next");
		PA_PolicyInfo.primaryNamedInsured();
		PA_PolicyInfo.pi_OfficialID();
		PA_PolicyInfo.policyDetails();
		PA_PolicyInfo.affinityGroup();
		PA_PolicyInfo.producerOfRecord();
		PA_PolicyInfo.underWritingCompany();

		PolicyCenter_Resuables.clickButton("Next");
		PA_Drivers.driver_Edit_ExistingDriver();

		PolicyCenter_Resuables.clickButton("Next");
		PA_Vehicles.Vehicles_Edit();

		PolicyCenter_Resuables.clickButton("Next");
		PA_Coverages.coveragesAppliedtoallVehiclesIn();
		PA_Coverages.coveragesAppliedperVehiclesIn();
		PA_Coverages.additionalcoveragesAppliedtoallVehiclesIn();
		PA_Coverages.additionalcoveragesAppliedperVehiclesIn();

		PolicyCenter_Resuables.clickButton("Next");
		PA_RiskAnalysis.button_Verify();

		PolicyCenter_Resuables.clickButton("Next");
		PA_PolicyReview.clickTab_PolicyReview("Differences");
		PA_PolicyReview.clickTab_PolicyReview("Policy Review");
		PA_PolicyReview.policyLevelCoverages();
		PA_PolicyReview.vehicleLevelCoverages();

		PolicyCenter_Resuables.clickButton("Save Draft");
		PolicyCenter_Resuables.clickButton("Quote");
		PA_Quote.quoteDetails();
		PA_Quote.policyPremium_Garage1();
		PA_Quote.policyPremium_Vehicle1();
		PA_Quote.policyPremium_PremiumSubtotalandTaxes();

		PolicyCenter_Resuables.clickButton("Next");
		PA_Forms.pa_forms();

		PolicyCenter_Resuables.clickButton("Next");
		PA_Payments.premiumSummary();
		PolicyCenter_Resuables.clickButton("Issue Policy for Policy Change");

		strJob           = PolicyCenter_Resuables.infoBar("Job");
		strLOB           = PolicyCenter_Resuables.infoBar("LOB");
		strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PC_Bound.policyChangeBound_ViewYourPolicy();
		PC_PolicySummary.detail_Verify();
		PC_PolicySummary.account_Verify();

		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();

	}

}
