package com.Test.Guidewire.CommercialAuto;

import org.testng.annotations.Test;

import com.Utils.Selenium.GW_Base;
import com.Utils.Selenium.GW_GetDriver;
import com.pages.Guidewire.GW_CM_PC_BC_CC_Login;
import com.pages.Guidewire.Tab_Menu_Navigation;
import com.pages.Guidewire.PolicyCenter.PC_PolicySummary;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Resuables;
import com.pages.Guidewire.PolicyCenter.CommercialAuto.CA_Reusables;

public class CA_CancelPolicy extends GW_GetDriver {

	@Test
	public void AUT_CA_PC_CommercialAuto_CancellationByCarrier() throws Throwable {

		// login to pc
		GW_CM_PC_BC_CC_Login.login_PolicyCenter_User("SuperUser");
		// New submission
		CA_Reusables.SubmissionProcess("New Company Account", "Issue Policy");
		// Fetching policy number
		GW_Base.strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");
		// Validating Billing Status
		PC_PolicySummary.tools_Billing();
		// search existing policy
		Tab_Menu_Navigation.pcTabNavigation("Policy Search By Fetching", "NA");
		// cancel policy
		PolicyCenter_Resuables.Policytransactions("CancelPolicy_Schedule Cancellation");
		// logout
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_CA_PC_CommercialAuto_CancellationByCarrierWithLaterDate() throws Throwable {

		// login to pc
		GW_CM_PC_BC_CC_Login.login_PolicyCenter_User("SuperUser");
		// New submission
		CA_Reusables.SubmissionProcess("New Company Account", "Issue Policy");
		// Fetching policy number
		GW_Base.strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");
		// Validating Billing Status
		PC_PolicySummary.tools_Billing();
		// search existing policy
		Tab_Menu_Navigation.pcTabNavigation("Policy Search By Fetching", "NA");
		// cancel policy
		PolicyCenter_Resuables.Policytransactions("CancelPolicy_Schedule CancellationLaterDate");
		// logout
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_CA_PC_CommercialAuto_CancellationByInsured() throws Throwable {

		// login to pc
		GW_CM_PC_BC_CC_Login.login_PolicyCenter_User("SuperUser");
		// New submission
		CA_Reusables.SubmissionProcess("New Company Account", "Issue Policy");
		// Fetching policy number
		GW_Base.strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");
		// Validating Billing Status
		PC_PolicySummary.tools_Billing();
		// search existing policy
		Tab_Menu_Navigation.pcTabNavigation("Policy Search By Fetching", "NA");
		// cancel policy
		PolicyCenter_Resuables.Policytransactions("CancelPolicy_CancelNow");
		// validate completed policyTransaction
		PC_PolicySummary.completedPolicyTransactions();
		// logout
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}
	@Test
	public void AUT_PC_CA_Cancel_StartCancellation() throws Throwable {

	}
	@Test
	public void AUT_PC_CA_Cancel_QuoteCancellation_Confirmation() throws Throwable {

	}
	@Test
	public void AUT_PC_CA_Cancel_PolicySummary() throws Throwable {

	}
	@Test
	public void AUT_PC_CA_Cancel_ScheduleCancellation() throws Throwable {

	}
	@Test
	public void AUT_PC_CA_Cancel_RescindCancellation() throws Throwable {

	}
	@Test
	public void AUT_PC_CA_Cancel_WithdrawTransaction() throws Throwable {

	}
	@Test
	public void AUT_PC_CA_Cancel_FormsAndDocGeneration() throws Throwable {

	}
	@Test
	public void AUT_PC_CA_Cancel_CancelPendingRenewals() throws Throwable {

	}
	@Test
	public void AUT_PC_CA_Cancel_NonPayCancel() throws Throwable {

	}

}
