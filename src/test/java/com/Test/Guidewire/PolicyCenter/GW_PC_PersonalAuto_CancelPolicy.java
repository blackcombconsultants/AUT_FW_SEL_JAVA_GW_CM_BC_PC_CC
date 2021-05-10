package com.Test.Guidewire.PolicyCenter;

import org.testng.annotations.Test;

import com.Utils.Selenium.GW_GetDriver;
import com.pages.Guidewire.GW_CM_PC_BC_CC_Login;
import com.pages.Guidewire.GW_CM_PC_BC_CC_TabNavigation;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Resuables;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_SubmissionBound;

public class GW_PC_PersonalAuto_CancelPolicy extends GW_GetDriver {

	@Test

	public void AUT_PA_PC_CancelPolicy_01() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PolicyCenter_Resuables.pcTabNavigation_Policy_Search();
		// PolicyCenter_PolicySummary.detail_Verify();
		GW_CM_PC_BC_CC_TabNavigation.pcMenuNavigation("Cancel Policy");
		PolicyCenter_Resuables.startCancellationForPolicy();
		PolicyCenter_Resuables.Confirmation();
		PolicyCenter_Resuables.clickButton("Cancel Policy");
		PolicyCenter_SubmissionBound.ViewYourPolicy();
		strAccountName = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strSubmissionNumber = PolicyCenter_Resuables.infoBar("SubmissionNumber");

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

}
