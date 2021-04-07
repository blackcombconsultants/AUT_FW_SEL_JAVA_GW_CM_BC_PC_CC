package com.Test.Guidewire.ClaimsCenter;

import org.testng.annotations.Test;

import com.Utils.Selenium.GW_GetDriver;
import com.pages.Guidewire.GW_LoginCM_PC_BC_CC;
import com.pages.Guidewire.GW_TabNavigation_CM_PC_BC_CC;

public class GW_CC_CreateClaim extends GW_GetDriver {

	@Test
	public void createClaim() throws Throwable {
		GW_LoginCM_PC_BC_CC lg = new GW_LoginCM_PC_BC_CC(driver, oExtentTest);
		GW_TabNavigation_CM_PC_BC_CC mn = new GW_TabNavigation_CM_PC_BC_CC(driver, oExtentTest);

		lg.login_ClaimsCenter();
		mn.gwClaimsCenter_TabNavigation("NewAccount");
	}
}
