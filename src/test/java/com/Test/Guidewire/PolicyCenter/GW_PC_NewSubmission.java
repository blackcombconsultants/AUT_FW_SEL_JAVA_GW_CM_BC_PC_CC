package com.Test.Guidewire.PolicyCenter;

import org.testng.annotations.Test;

import com.Utils.Selenium.GW_GetDriver;
import com.pages.Guidewire.GW_LoginCM_PC_BC_CC;
import com.pages.Guidewire.GW_TabNavigation_CM_PC_BC_CC;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_Reusable;
import com.pages.Guidewire.PolicyCenter.GW_PolicyCenter_Resuables;

public class GW_PC_NewSubmission extends GW_GetDriver {

	@Test
	public void AUT_TS_01() throws Throwable {
		GW_LoginCM_PC_BC_CC lg = new GW_LoginCM_PC_BC_CC(driver, oExtentTest);
		GW_TabNavigation_CM_PC_BC_CC tab = new GW_TabNavigation_CM_PC_BC_CC(driver, oExtentTest);

		GW_PolicyCenter_Resuables pcr = new GW_PolicyCenter_Resuables(driver, oExtentTest);
		PersonalAuto_Reusable par = new PersonalAuto_Reusable(driver, oExtentTest);
		
		lg.login_PolicyCenter();
		tab.navigate_AccountTab_AccountNumberSearch("6800979174");
		tab.gwPolicyCenter_MenuNavigation("NewSubmission");
		pcr.pc_NewSubmission();
		par.NewSubmisisons_SelectLOB();
		par.offering();
		pcr.clickButton("Next");
		par.Qualification();
	}
}
