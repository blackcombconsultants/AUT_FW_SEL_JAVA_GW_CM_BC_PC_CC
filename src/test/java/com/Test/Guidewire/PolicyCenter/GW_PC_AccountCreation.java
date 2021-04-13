package com.Test.Guidewire.PolicyCenter;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Utils.Selenium.GW_GetDriver;
import com.pages.Guidewire.GW_LoginCM_PC_BC_CC;
import com.pages.Guidewire.GW_TabNavigation_CM_PC_BC_CC;
import com.pages.Guidewire.PolicyCenter.GW_PolicyCenter_Resuables;

public class GW_PC_AccountCreation extends GW_GetDriver {

	//
	@Test(enabled = false)
	public void AUT_PC_AC_01() throws Throwable {

		GW_LoginCM_PC_BC_CC lg = new GW_LoginCM_PC_BC_CC(driver, oExtentTest);
		GW_PolicyCenter_Resuables gwPC = new GW_PolicyCenter_Resuables(driver, oExtentTest);
		GW_TabNavigation_CM_PC_BC_CC mn = new GW_TabNavigation_CM_PC_BC_CC(driver, oExtentTest);

		lg.login_PolicyCenter();
		// navigate to new account
		mn.gwPolicyCenter_MenuNavigation("NewAccount");

		// pc_SearchAccountInformation
		gwPC.pc_SearchAccountInformation("asdasdas");
		Assert.assertEquals(gwPC.gettext_SearchAccountResultsMessage(),
				"Information for the current page:\n" + "The search returned zero results.");
		lg.logout_PolicyCenter();

	}

	@Test
	public void AUT_PC_AC_02() throws Throwable {

		GW_LoginCM_PC_BC_CC lg = new GW_LoginCM_PC_BC_CC(driver, oExtentTest);
		GW_PolicyCenter_Resuables gwPC = new GW_PolicyCenter_Resuables(driver, oExtentTest);
		GW_TabNavigation_CM_PC_BC_CC mn = new GW_TabNavigation_CM_PC_BC_CC(driver, oExtentTest);

		// login_PolicyCenter
		lg.login_PolicyCenter();
		// navigate to new account
		mn.gwPolicyCenter_MenuNavigation("NewAccount");
		// pc_CreatePersonAccount
		gwPC.pc_CreatePersonAccount();
		lg.logout_PolicyCenter();

	}

	@Test
	public void AUT_PC_AC_03() throws Throwable {

		GW_LoginCM_PC_BC_CC lg = new GW_LoginCM_PC_BC_CC(driver, oExtentTest);
		GW_PolicyCenter_Resuables gwPC = new GW_PolicyCenter_Resuables(driver, oExtentTest);
		GW_TabNavigation_CM_PC_BC_CC mn = new GW_TabNavigation_CM_PC_BC_CC(driver, oExtentTest);

		// login_PolicyCenter
		lg.login_PolicyCenter();
		// navigate to new account
		mn.gwPolicyCenter_MenuNavigation("NewAccount");

		// pc_CreateCompanyAccount
		gwPC.pc_CreateCompanyAccount();
		lg.logout_PolicyCenter();

	}

}
