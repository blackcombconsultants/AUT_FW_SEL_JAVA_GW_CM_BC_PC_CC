package com.Test.Guidewire.PolicyCenter;

import org.testng.annotations.Test;

import com.Utils.Selenium.GW_GetDriver;
import com.pages.Guidewire.GW_CM_PC_BC_CC_Login;
import com.pages.Guidewire.Tab_Menu_Navigation;
import com.pages.Guidewire.PolicyCenter.PC_Account;

public class Test_Account extends GW_GetDriver {

	@Test
	public void AUT_PA_PC_Account_CreateNewCompanyAccount() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		Tab_Menu_Navigation.pcTabNavigation("New Account", "NA");
		PC_Account.createCompanyAccount();
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();

	}

	@Test(enabled = false)
	public void AUT_PA_PC_Account_CreateNewPersonAccount() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		Tab_Menu_Navigation.pcTabNavigation("New Account", "NA");
		PC_Account.createPersonAccount();
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();

	}

	@Test(enabled = false)
	public void AUT_PA_PC_Account_SearchPerson() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		Tab_Menu_Navigation.pcTabNavigation("New Account", "NA");
		PC_Account.searchPerson();
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
		 

	}

	@Test(enabled = false)
	public void AUT_PA_PC_Account_ModifyPerson() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		Tab_Menu_Navigation.pcTabNavigation("New Account", "NA");
		PC_Account.modifyPerson();
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();

	}

	@Test(enabled = false)
	public void AUT_PA_PC_Account_WithdrawAccount() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		Tab_Menu_Navigation.pcTabNavigation("New Account", "NA");
		PC_Account.withdrawAccount();
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();

	}

	@Test(enabled = false)
	public void AUT_PA_PC_Account_OrganizationModify() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		Tab_Menu_Navigation.pcTabNavigation("New Account", "NA");
		PC_Account.organization_Modify();
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test(enabled = false)
	public void AUT_PA_PC_Account_CheckforDuplicates() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		Tab_Menu_Navigation.pcTabNavigation("New Account", "NA");
		PC_Account.checkDuplicates();
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();

	}

	@Test(enabled = false)
	public void AUT_PA_PC_Account_Summary() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		Tab_Menu_Navigation.pcTabNavigation("New Account", "NA");
		PC_Account.checkDuplicates();
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();

	}

}
