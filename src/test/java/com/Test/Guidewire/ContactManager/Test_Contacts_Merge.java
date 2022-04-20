package com.Test.Guidewire.ContactManager;

import org.testng.annotations.Test;

import com.Utils.Selenium.GW_GetDriver;
import com.pages.Guidewire.GW_CM_PC_BC_CC_Login;

public class Test_Contacts_Merge extends GW_GetDriver {

	@Test
	public void AUT_Test_Contacts_merge() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter_User("SuperUser");

		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();

	}

}
