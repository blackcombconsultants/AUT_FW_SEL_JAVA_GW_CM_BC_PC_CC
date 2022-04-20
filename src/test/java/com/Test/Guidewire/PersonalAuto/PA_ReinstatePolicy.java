package com.Test.Guidewire.PersonalAuto;

import org.testng.annotations.Test;

import com.Utils.Selenium.GW_GetDriver;
import com.pages.Guidewire.GW_CM_PC_BC_CC_Login;
import com.pages.Guidewire.Tab_Menu_Navigation;
import com.pages.Guidewire.PolicyCenter.PC_Bound;
import com.pages.Guidewire.PolicyCenter.PC_PolicySummary;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Resuables;
import com.pages.Guidewire.PolicyCenter.PersonalAuto.PA_Payments;
import com.pages.Guidewire.PolicyCenter.PersonalAuto.PA_Quote;
import com.pages.Guidewire.PolicyCenter.PersonalAuto.PA_Reusable;
import com.pages.Guidewire.PolicyCenter.PersonalAuto.PA_RiskAnalysis;

public class PA_ReinstatePolicy extends GW_GetDriver {

	@Test
	public void AUT_PA_PC_ReinstatePolicy_01() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PA_Reusable.cancellationProcess();

		Tab_Menu_Navigation.pcMenuNavigation("Reinstate Policy");
		PolicyCenter_Resuables.startReinstatement_PolicyDetails();
		PolicyCenter_Resuables.startReinstatement_AffinityGroup();
		PolicyCenter_Resuables.clickButton("Next");

		strSubmissionNumber = PolicyCenter_Resuables.infoBar("ReinstatementNumber");

		PA_RiskAnalysis.button_Verify();

		PolicyCenter_Resuables.clickButton("Save Draft");
		PolicyCenter_Resuables.clickButton("Quote");
		PA_Quote.quoteDetails();

		strJob           = PolicyCenter_Resuables.infoBar("ReinstatementJob");
		strLOB           = PolicyCenter_Resuables.infoBar("LOB");
		strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter   = PolicyCenter_Resuables.infoBar("Underwriter");

		PA_Quote.quoteDetails();
		PolicyCenter_Resuables.clickButton("Next");
		PA_Payments.premiumSummary();
		PA_Payments.payments();

		PolicyCenter_Resuables.clickButton("Save Draft");
		PolicyCenter_Resuables.clickButton("Reinstate");

		PC_Bound.Reinstatement_ViewYourPolicy();
		PC_PolicySummary.detail_Verify();
		PC_PolicySummary.account_Verify();

		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();

	}

}
