package com.Test.Guidewire.PolicyCenter;

import org.testng.annotations.Test;

import com.Utils.Selenium.GW_GetDriver;
import com.pages.Guidewire.GW_CM_PC_BC_CC_Login;
import com.pages.Guidewire.GW_CM_PC_BC_CC_TabNavigation;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Account;

public class GW_PC_AccountCreation extends GW_GetDriver {

	@Test
	public void AUT_PersonalAuto_PolicyCenter_AccountCreation_1_CreateNewPersonAccount() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		GW_CM_PC_BC_CC_TabNavigation.pcTabNavigation("NewAccount", "NA");
		PolicyCenter_Account.createPersonAccount();
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();

	}

	@Test
	public void AUT_PersonalAuto_PolicyCenter_AccountCreation_2_SearchPerson() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		GW_CM_PC_BC_CC_TabNavigation.pcTabNavigation("NewAccount", "NA");
		PolicyCenter_Account.searchPerson();
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();

	}

	@Test
	public void AUT_PersonalAuto_PolicyCenter_AccountCreation_3_ModifyPerson() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		GW_CM_PC_BC_CC_TabNavigation.pcTabNavigation("NewAccount", "NA");
		PolicyCenter_Account.modifyPerson();
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();

	}

	@Test
	public void AUT_PersonalAuto_PolicyCenter_AccountCreation_4_WithdrawAccount() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		GW_CM_PC_BC_CC_TabNavigation.pcTabNavigation("NewAccount", "NA");
		PolicyCenter_Account.withdrawAccount();
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();

	}

	@Test
	public void AUT_PersonalAuto_PolicyCenter_AccountCreation_5_OrganizationModify() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		GW_CM_PC_BC_CC_TabNavigation.pcTabNavigation("NewAccount", "NA");
		PolicyCenter_Account.organization_Modify();
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PersonalAuto_PolicyCenter_AccountCreation_6_CheckforDuplicates() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		GW_CM_PC_BC_CC_TabNavigation.pcTabNavigation("NewAccount", "NA");
		PolicyCenter_Account.checkDuplicates();
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();

	}

	@Test(enabled = false)
	public void AUT_PersonalAuto_PolicyCenter_AccountCreation_1_CreateNewCompanyAccount() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		GW_CM_PC_BC_CC_TabNavigation.pcTabNavigation("NewAccount", "NA");
		PolicyCenter_Account.createCompanyAccount();
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();

	}

}
