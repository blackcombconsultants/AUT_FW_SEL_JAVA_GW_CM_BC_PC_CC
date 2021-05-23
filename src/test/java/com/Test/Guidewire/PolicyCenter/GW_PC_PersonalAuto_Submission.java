package com.Test.Guidewire.PolicyCenter;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Utils.Selenium.GW_GetDriver;
import com.pages.Guidewire.GW_CM_PC_BC_CC_Login;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_Reusable;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Resuables;

public class GW_PC_PersonalAuto_Submission extends GW_GetDriver {

	@BeforeTest
	public void driver_ObjReference_Initiate() {
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("@BeforeTest");
		System.out.println("-------------------------------------------------------------------------");
	}

	@AfterTest
	public void driver_ObjReference_Garbage() {
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("@AfterTest");
		System.out.println("-------------------------------------------------------------------------");
	}
	@Test(enabled = false)
	public void AUT_PA_PC_NewSubmission_Account_OpenPolicyTransaction_NewSubmission() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PersonalAuto_Reusable.submissionProcess("Account Search", "Issue Policy");
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_NewAccount_NewSubmission() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PersonalAuto_Reusable.submissionProcess("New Account", "Issue Policy");
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}
	@Test(enabled = false)
	public void AUT_PA_PC_NewSubmission_SearchAccount_NewSubmission() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PersonalAuto_Reusable.submissionProcess("Account Search", "Issue Policy");
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}
	@Test(enabled = false)
	public void AUT_PA_PC_NewSubmission_Organization_Modify() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PersonalAuto_Reusable.submissionProcess("New Account", "Issue Policy");
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}
	@Test(enabled = false)
	public void AUT_PA_PC_NewSubmission_Producercode_Modify() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PersonalAuto_Reusable.submissionProcess("New Account", "Issue Policy");
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}
	@Test
	public void AUT_PA_PC_NewSubmission_SaveDraft() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PersonalAuto_Reusable.submissionProcess("New Account", "Save Draft");
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}
	@Test
	public void AUT_PA_PC_NewSubmission_BindOption_BindOnly() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PersonalAuto_Reusable.submissionProcess("New Account", "Bind Only");
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}
	@Test
	public void AUT_PA_PC_NewSubmission_BindOption_IssuePolicy() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PersonalAuto_Reusable.submissionProcess("New Account", "Issue Policy");
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}
	@Test
	public void AUT_PA_PC_NewSubmission_CloseOptions_Withdraw() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PersonalAuto_Reusable.submissionProcess("New Account", "Quote");

		PolicyCenter_Resuables.clickButton("Bind Options");
		PolicyCenter_Resuables.clickButton("Bind Only");
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

}
