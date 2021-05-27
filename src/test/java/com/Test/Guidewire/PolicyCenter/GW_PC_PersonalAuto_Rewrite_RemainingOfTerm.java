package com.Test.Guidewire.PolicyCenter;

import org.testng.annotations.Test;

import com.Utils.Selenium.GW_GetDriver;
import com.pages.Guidewire.GW_CM_PC_BC_CC_Login;
import com.pages.Guidewire.GW_CM_PC_BC_CC_TabNavigation;
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
import com.pages.Guidewire.PolicyCenter.PolicyCenter_PolicySummary;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Resuables;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Bound;

public class GW_PC_PersonalAuto_Rewrite_RemainingOfTerm extends GW_GetDriver {

	@Test
	public void AUT_PA_PC_Rewrite_RemainingOfTerm_01() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PersonalAuto_Reusable.cancellationProcess();

		GW_CM_PC_BC_CC_TabNavigation.pcMenuNavigation("Rewrite Remainder of Term");

		strJob              = PolicyCenter_Resuables.infoBar("Job");
		strLOB              = PolicyCenter_Resuables.infoBar("LOB");
		strEffectiveDate    = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strAccountName      = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber    = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber     = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter      = PolicyCenter_Resuables.infoBar("Underwriter");
		strSubmissionNumber = PolicyCenter_Resuables.infoBar("RewriteNumber");

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
		PersonalAuto_Payments.payments();
		PersonalAuto_Payments.invoicing();
		PersonalAuto_Payments.billing();
		PersonalAuto_Payments.paymentSchedule();
		PolicyCenter_Resuables.clickButton("Issue Policy for Rewrite Remainder of Term");

		strJob           = PolicyCenter_Resuables.infoBar("Job");
		strLOB           = PolicyCenter_Resuables.infoBar("LOB");
		strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_Bound.RewriteRemainderofTermBound_ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

}
