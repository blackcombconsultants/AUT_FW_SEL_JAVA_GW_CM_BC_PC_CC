package com.Test.Guidewire.PolicyCenter;

import org.testng.annotations.Test;

import com.Utils.Selenium.GW_GetDriver;
import com.pages.Guidewire.GW_CM_PC_BC_CC_Login;
import com.pages.Guidewire.GW_CM_PC_BC_CC_TabNavigation;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_Reusable;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_PolicySummary;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Resuables;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_SubmissionBound;

public class GW_PC_PersonalAuto_CancelPolicy extends GW_GetDriver {

	private String strEditLock;

	@Test

	public void AUT_PA_PC_CancelPolicy_01() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PersonalAuto_Reusable.submissionProcess("New Account", "Issue Policy");
		GW_CM_PC_BC_CC_TabNavigation.pcMenuNavigation("Cancel Policy");
		PolicyCenter_Resuables.startCancellationForPolicy();
		PolicyCenter_Resuables.Confirmation();
		PolicyCenter_Resuables.clickButton("Bind Options");
		PolicyCenter_Resuables.clickButton("Cancel Now");
		PolicyCenter_SubmissionBound.Cancellation_ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();

		strLOB           = PolicyCenter_Resuables.infoBar("LOB");
		strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber  = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strEffectiveDate = PolicyCenter_Resuables.infoBar("Status");

		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test(enabled = false)
	public void AUT_PA_PC_CancelPolicy_02() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PolicyCenter_Resuables.pcTabNavigation_Policy_Search();
		PolicyCenter_PolicySummary.detail_Verify();
		GW_CM_PC_BC_CC_TabNavigation.pcMenuNavigation("Cancel Policy");
		PolicyCenter_Resuables.startCancellationForPolicy();
		// PolicyCenter_Resuables.VerifyCancellationerros();
		strAccountName   = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strJob           = PolicyCenter_Resuables.infoBar("Status");

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

}
