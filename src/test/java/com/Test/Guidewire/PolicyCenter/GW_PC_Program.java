package com.Test.Guidewire.PolicyCenter;

import org.testng.annotations.Test;

import com.Utils.Selenium.GW_GetDriver;
import com.pages.Guidewire.GW_LoginCM_PC_BC_CC;
import com.pages.Guidewire.PolicyCenter.GW_PC_AccountSummary;
import com.pages.Guidewire.PolicyCenter.GW_PolicyCenter_Resuables;

public class GW_PC_Program extends GW_GetDriver{
	
	@Test
	public void BasicProgram() throws Exception {
		GW_LoginCM_PC_BC_CC lg = new GW_LoginCM_PC_BC_CC(driver, oExtentTest);
		GW_PolicyCenter_Resuables AccSer = new GW_PolicyCenter_Resuables(driver, oExtentTest);
		GW_PC_AccountSummary newSub = new GW_PC_AccountSummary(driver, oExtentTest);
		
		
		lg.login_PolicyCenter();
		AccSer.Account_Search_SubTab();
		newSub.AccountSummary_Actions_NewSubmission();
		
	}
	

}
