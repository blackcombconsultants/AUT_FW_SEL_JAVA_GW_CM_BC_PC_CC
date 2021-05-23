package com.Test.Guidewire.PolicyCenter;

import org.testng.annotations.Test;

import com.Utils.Selenium.GW_GetDriver;
import com.pages.Guidewire.GW_CM_PC_BC_CC_Login;
import com.pages.Guidewire.GW_CM_PC_BC_CC_TabNavigation;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_Payments;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_Quote;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_RiskAnalysis;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_PolicySummary;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Resuables;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_SubmissionBound;

public class GW_PC_PersonalAuto_ReinstatePolicy extends GW_GetDriver {

	@Test
	public void AUT_PA_PC_ReinstatePolicy_01() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PolicyCenter_Resuables.pcTabNavigation_Policy_Search();
		
		strAccountName = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
				
		PolicyCenter_PolicySummary.detail_Verify();
		GW_CM_PC_BC_CC_TabNavigation.pcMenuNavigation("Reinstate Policy");
		PolicyCenter_Resuables.startReinstatement_PolicyDetails();
		PolicyCenter_Resuables.startReinstatement_AffinityGroup();
		PolicyCenter_Resuables.clickButton("Next");

		strSubmissionNumber = PolicyCenter_Resuables.infoBar("SubmissionNumber");

		PersonalAuto_RiskAnalysis.button_Verify();
				
		PolicyCenter_Resuables.clickButton("Save Draft");
		PolicyCenter_Resuables.clickButton("Quote");
		PersonalAuto_Quote.quoteDetails();
		
		strJob = PolicyCenter_Resuables.infoBar("Job");
		strLOB = PolicyCenter_Resuables.infoBar("LOB");
		strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");
		
		PersonalAuto_Quote.quoteDetails();
		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Payments.premiumSummary();
		PersonalAuto_Payments.payments();
		
		PolicyCenter_Resuables.clickButton("Save Draft");
		PolicyCenter_Resuables.clickButton("Reinstate");
		
		PolicyCenter_SubmissionBound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");
		strJob = PolicyCenter_Resuables.infoBar("Status");
		
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();

	}

}
