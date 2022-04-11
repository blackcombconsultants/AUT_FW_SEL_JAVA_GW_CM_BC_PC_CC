package com.Test.Guidewire.PersonalAuto;

import org.testng.annotations.Test;

import com.Utils.Selenium.GW_GetDriver;
import com.pages.Guidewire.GW_CM_PC_BC_CC_Login;
import com.pages.Guidewire.Tab_Menu_Navigation;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_Coverages;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_Drivers;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_Forms;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_Payments;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_PolicyInfo;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_PolicyReview;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_Quote;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_Reusable;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_RiskAnalysis;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_Vehicles;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Bound;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_PolicySummary;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Resuables;

public class GW_PC_PersonalAuto_ChangePolicy extends GW_GetDriver {

	/*
	 * Testcase = Full Quote Issue Policy Author = Arun Date Created = 27/04/21
	 * LOB = Personal Auto Parameter testData
	 * 
	 */

	@Test
	public void AUT_PA_PC_ChangePolicy_01() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PersonalAuto_Reusable.submissionProcess("New Account", "Issue Policy");

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
		PersonalAuto_PolicyInfo.primaryNamedInsured();
		PersonalAuto_PolicyInfo.pi_OfficialID();
		PersonalAuto_PolicyInfo.policyDetails();
		PersonalAuto_PolicyInfo.affinityGroup();
		PersonalAuto_PolicyInfo.producerOfRecord();
		PersonalAuto_PolicyInfo.underWritingCompany();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Drivers.driver_Edit_ExistingDriver();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Vehicles.Vehicles_Edit();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Coverages.coveragesAppliedtoallVehiclesIn();
		PersonalAuto_Coverages.coveragesAppliedperVehiclesIn();
		PersonalAuto_Coverages.additionalcoveragesAppliedtoallVehiclesIn();
		PersonalAuto_Coverages.additionalcoveragesAppliedperVehiclesIn();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_RiskAnalysis.button_Verify();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyReview.clickTab_PolicyReview("Differences");
		PersonalAuto_PolicyReview.clickTab_PolicyReview("Policy Review");
		PersonalAuto_PolicyReview.policyLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages();

		PolicyCenter_Resuables.clickButton("Save Draft");
		PolicyCenter_Resuables.clickButton("Quote");
		PersonalAuto_Quote.quoteDetails();
		PersonalAuto_Quote.policyPremium_Garage1();
		PersonalAuto_Quote.policyPremium_Vehicle1();
		PersonalAuto_Quote.policyPremium_PremiumSubtotalandTaxes();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Forms.pa_forms();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Payments.premiumSummary();
		PolicyCenter_Resuables.clickButton("Issue Policy for Policy Change");

		strJob           = PolicyCenter_Resuables.infoBar("Job");
		strLOB           = PolicyCenter_Resuables.infoBar("LOB");
		strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.policyChangeBound_ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();

	}

}
