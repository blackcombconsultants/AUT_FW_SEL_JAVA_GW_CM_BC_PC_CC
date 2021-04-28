package com.Test.Guidewire.PolicyCenter;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Utils.Selenium.GW_GetDriver;
import com.pages.Guidewire.GW_LoginCM_PC_BC_CC;
import com.pages.Guidewire.GW_TabNavigation_CM_PC_BC_CC;
import com.pages.Guidewire.PolicyCenter.GW_PolicyCenter_Resuables;

public class GW_PC_AccountCreation extends GW_GetDriver {


	@Test
	public void AUT_PersonalAuto_PolicyCenter_AccountCreation_1_CreateNewPersonAccount() throws Throwable {

		GW_LoginCM_PC_BC_CC lg = new GW_LoginCM_PC_BC_CC(driver, oExtentTest);
		GW_PolicyCenter_Resuables gwPC = new GW_PolicyCenter_Resuables(driver, oExtentTest);
		GW_TabNavigation_CM_PC_BC_CC mn = new GW_TabNavigation_CM_PC_BC_CC(driver, oExtentTest);

		// login_PolicyCenter
		lg.login_PolicyCenter();
		// navigate to new account
		mn.gwPolicyCenter_MenuNavigation("NewAccount");
		// pc_CreatePersonAccount
		gwPC.createPersonAccount();
		lg.logout_PolicyCenter();

	}

	@Test
	public void AUT_PersonalAuto_PolicyCenter_AccountCreation_2_SearchPerson() throws Throwable {

		GW_LoginCM_PC_BC_CC lg = new GW_LoginCM_PC_BC_CC(driver, oExtentTest);
		GW_PolicyCenter_Resuables gwPC = new GW_PolicyCenter_Resuables(driver, oExtentTest);
		GW_TabNavigation_CM_PC_BC_CC mn = new GW_TabNavigation_CM_PC_BC_CC(driver, oExtentTest);

		// login_PolicyCenter
		lg.login_PolicyCenter();
		// navigate to new account
		mn.gwPolicyCenter_MenuNavigation("NewAccount");
		// pc_CreatePersonAccount
		gwPC.createPersonAccount();
		lg.logout_PolicyCenter();

	}

	@Test
	public void AUT_PersonalAuto_PolicyCenter_AccountCreation_3_ModifyPerson() throws Throwable {

		GW_LoginCM_PC_BC_CC lg = new GW_LoginCM_PC_BC_CC(driver, oExtentTest);
		GW_PolicyCenter_Resuables gwPC = new GW_PolicyCenter_Resuables(driver, oExtentTest);
		GW_TabNavigation_CM_PC_BC_CC mn = new GW_TabNavigation_CM_PC_BC_CC(driver, oExtentTest);

		// login_PolicyCenter
		lg.login_PolicyCenter();
		// navigate to new account
		mn.gwPolicyCenter_MenuNavigation("NewAccount");
		// pc_CreatePersonAccount
		gwPC.createPersonAccount();
		lg.logout_PolicyCenter();

	}

	@Test
	public void AUT_PersonalAuto_PolicyCenter_AccountCreation_4_WithdrawAccount() throws Throwable {

		GW_LoginCM_PC_BC_CC lg = new GW_LoginCM_PC_BC_CC(driver, oExtentTest);
		GW_PolicyCenter_Resuables gwPC = new GW_PolicyCenter_Resuables(driver, oExtentTest);
		GW_TabNavigation_CM_PC_BC_CC mn = new GW_TabNavigation_CM_PC_BC_CC(driver, oExtentTest);

		// login_PolicyCenter
		lg.login_PolicyCenter();
		// navigate to new account
		mn.gwPolicyCenter_MenuNavigation("NewAccount");
		// pc_CreatePersonAccount
		gwPC.createPersonAccount();
		lg.logout_PolicyCenter();

	}
	@Test
	public void AUT_PersonalAuto_PolicyCenter_AccountCreation_5_OrganizationModify() throws Throwable {

		GW_LoginCM_PC_BC_CC lg = new GW_LoginCM_PC_BC_CC(driver, oExtentTest);
		GW_PolicyCenter_Resuables gwPC = new GW_PolicyCenter_Resuables(driver, oExtentTest);
		GW_TabNavigation_CM_PC_BC_CC mn = new GW_TabNavigation_CM_PC_BC_CC(driver, oExtentTest);

		// login_PolicyCenter
		lg.login_PolicyCenter();
		// navigate to new account
		mn.gwPolicyCenter_MenuNavigation("NewAccount");
		// pc_CreatePersonAccount
		gwPC.createPersonAccount();
		lg.logout_PolicyCenter();

	}
	@Test
	public void AUT_PersonalAuto_PolicyCenter_AccountCreation_6_CheckforDuplicates() throws Throwable {

		GW_LoginCM_PC_BC_CC lg = new GW_LoginCM_PC_BC_CC(driver, oExtentTest);
		GW_PolicyCenter_Resuables gwPC = new GW_PolicyCenter_Resuables(driver, oExtentTest);
		GW_TabNavigation_CM_PC_BC_CC mn = new GW_TabNavigation_CM_PC_BC_CC(driver, oExtentTest);

		// login_PolicyCenter
		lg.login_PolicyCenter();
		// navigate to new account
		mn.gwPolicyCenter_MenuNavigation("NewAccount");
		// pc_CreatePersonAccount
		gwPC.createPersonAccount();
		lg.logout_PolicyCenter();

	}

	@Test(enabled = false)
	public void AUT_PersonalAuto_PolicyCenter_AccountCreation_1_CreateNewCompanyAccount() throws Throwable {

		GW_LoginCM_PC_BC_CC lg = new GW_LoginCM_PC_BC_CC(driver, oExtentTest);
		GW_PolicyCenter_Resuables gwPC = new GW_PolicyCenter_Resuables(driver, oExtentTest);
		GW_TabNavigation_CM_PC_BC_CC mn = new GW_TabNavigation_CM_PC_BC_CC(driver, oExtentTest);

		// login_PolicyCenter
		lg.login_PolicyCenter();
		// navigate to new account
		mn.gwPolicyCenter_MenuNavigation("NewAccount");

		// pc_CreateCompanyAccount
		gwPC.createCompanyAccount();
		lg.logout_PolicyCenter();

	}

}
