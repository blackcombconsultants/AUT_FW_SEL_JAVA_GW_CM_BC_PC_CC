package com.Test.Guidewire.PolicyCenter;

import org.testng.annotations.Test;

import com.Utils.Selenium.GW_GetDriver;
import com.pages.Guidewire.GW_CM_PC_BC_CC_Login;
import com.pages.Guidewire.GW_CM_PC_BC_CC_TabNavigation;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_Coverages;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_Drivers;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_Forms;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_Payments;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_PolicyReview;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_Quote;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_RiskAnalysis;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_PolicySummary;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Resuables;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_SubmissionBound;

public class GW_PC_PersonalAuto_Rewrite_NewTerm extends GW_GetDriver {

	@Test
	public void AUT_PA_PC_Rewrite_NewTerm_01() throws Throwable {
		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PolicyCenter_Resuables.pcTabNavigation_Policy_Search();

		strAccountName = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");

		PolicyCenter_PolicySummary.detail_Verify();

		GW_CM_PC_BC_CC_TabNavigation.pcMenuNavigation("Rewrite New Term");

		PolicyCenter_Resuables.offering();

		PolicyCenter_Resuables.clickButton("Next");

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Drivers.driver_Add_NewPerson();

		PolicyCenter_Resuables.clickButton("Next");

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Coverages.coveragesAppliedtoallVehiclesIn();
		PersonalAuto_Coverages.coveragesAppliedperVehiclesIn();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_RiskAnalysis.button_Verify();

		PolicyCenter_Resuables.clickButton("Next");
		PolicyCenter_Resuables.clickButton("Policy Review");
		PersonalAuto_PolicyReview.clickTab_PolicyReview("Policy Review");
		PersonalAuto_PolicyReview.policyLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages_VehicleCoverages();

		PolicyCenter_Resuables.clickButton("Save Draft");
		PolicyCenter_Resuables.clickButton("Quote");
		PersonalAuto_Quote.quoteDetails();
		PersonalAuto_Quote.policyPremium_Garage1();
		PersonalAuto_Quote.policyPremium_Vehicle1();
		PersonalAuto_Quote.policyPremium_PremiumSubtotalandTaxes();
		strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");
		String strEditLock = PolicyCenter_Resuables.infoBar("EditLock");

		PersonalAuto_Quote.quoteDetails();
		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Forms.pa_forms();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Payments.premiumSummary();
		PersonalAuto_Payments.payments();

		PolicyCenter_Resuables.clickButton("Issue Policy for Other Transactions");
		strJob = PolicyCenter_Resuables.infoBar("Job");
		strLOB = PolicyCenter_Resuables.infoBar("LOB");
		strAccountName = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_SubmissionBound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

}
