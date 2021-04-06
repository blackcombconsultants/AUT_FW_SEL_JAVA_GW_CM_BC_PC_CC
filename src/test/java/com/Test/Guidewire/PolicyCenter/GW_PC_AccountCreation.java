package com.Test.Guidewire.PolicyCenter;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Utils.Selenium.GW_Base;
import com.pages.Guidewire.GW_LoginCM_PC_BC_CC;
import com.pages.Guidewire.GW_MenuNavigation_CM_PC_BC_CC;
import com.pages.Guidewire.PolicyCenter.GW_PolicyCenter_Resuables;

public class GW_PC_AccountCreation extends GW_Base {

	//
	@Test
	public void pc_SearchAccountInformation() throws Exception {

		GW_LoginCM_PC_BC_CC lg = new GW_LoginCM_PC_BC_CC(driver, oExtentTest);
		GW_PolicyCenter_Resuables gwPC = new GW_PolicyCenter_Resuables(driver, oExtentTest);
		GW_MenuNavigation_CM_PC_BC_CC mn = new GW_MenuNavigation_CM_PC_BC_CC(driver, oExtentTest);

		// login_PolicyCenter
		lg.login_PolicyCenter();
		// navigate to new account
		mn.gwPolicyCenter_MenuNavigation("NewAccount");
		// Verifying the page -
		Assert.assertEquals(gwPC.getHeader_EnterAccountInformation(), "Enter Account Information");
		// pc_SearchAccountInformation
		gwPC.pc_SearchAccountInformation();
		Assert.assertEquals(gwPC.gettext_SearchAccountResultsMessage(),
				"Information for the current page:\n" + "The search returned zero results.");

	}

	@Test
	public void pc_CreatePersonAccount() throws Exception {

		GW_LoginCM_PC_BC_CC lg = new GW_LoginCM_PC_BC_CC(driver, oExtentTest);
		GW_PolicyCenter_Resuables gwPC = new GW_PolicyCenter_Resuables(driver, oExtentTest);
		GW_MenuNavigation_CM_PC_BC_CC mn = new GW_MenuNavigation_CM_PC_BC_CC(driver, oExtentTest);

		// login_PolicyCenter
		lg.login_PolicyCenter();
		// navigate to new account
		mn.gwPolicyCenter_MenuNavigation("NewAccount");
		// Verifying the page -
		Assert.assertEquals(gwPC.getHeader_EnterAccountInformation(), "Enter Account Information");
		// pc_SearchAccountInformation
		gwPC.pc_SearchAccountInformation();
		Assert.assertEquals(gwPC.gettext_SearchAccountResultsMessage(),
				"Information for the current page:\n" + "The search returned zero results.");
		// pc_CreatePersonAccount
		gwPC.pc_CreatePersonAccount();
		Assert.assertEquals(gwPC.getHeader_AccountSummary(), "Account Summary");

	}

	@Test
	public void pc_CreateCompanyAccount() throws Exception {

		GW_LoginCM_PC_BC_CC lg = new GW_LoginCM_PC_BC_CC(driver, oExtentTest);
		GW_PolicyCenter_Resuables gwPC = new GW_PolicyCenter_Resuables(driver, oExtentTest);
		GW_MenuNavigation_CM_PC_BC_CC mn = new GW_MenuNavigation_CM_PC_BC_CC(driver, oExtentTest);

		// login_PolicyCenter
		lg.login_PolicyCenter();
		// navigate to new account
		mn.gwPolicyCenter_MenuNavigation("NewAccount");
		// Verifying the page -
		Assert.assertEquals(gwPC.getHeader_EnterAccountInformation(), "Enter Account Information");
		// pc_SearchAccountInformation
		gwPC.pc_SearchAccountInformation();
		Assert.assertEquals(gwPC.gettext_SearchAccountResultsMessage(),
				"Information for the current page:\n" + "The search returned zero results.");
		// pc_CreatePersonAccount
		gwPC.pc_CreateCompanyAccount();
		Assert.assertEquals(gwPC.getHeader_AccountSummary(), "Account Summary");

	}

}
