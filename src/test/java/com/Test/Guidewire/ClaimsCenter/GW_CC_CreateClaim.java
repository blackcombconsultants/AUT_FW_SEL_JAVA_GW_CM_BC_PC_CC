package com.Test.Guidewire.ClaimsCenter;

import org.testng.annotations.Test;

import com.Utils.Selenium.GW_GetDriver;
import com.pages.Guidewire.GW_CM_PC_BC_CC_Login;
import com.pages.Guidewire.GW_CM_PC_BC_CC_TabNavigation;
import com.pages.Guidewire.ClaimsCenter.GW_CC_AddClaimInformation;
import com.pages.Guidewire.ClaimsCenter.GW_CC_BasicInformation;
import com.pages.Guidewire.ClaimsCenter.GW_CC_SearchPolicy;

public class GW_CC_CreateClaim extends GW_GetDriver {
 
	
	@Test
	 public void Aut_CC_01() throws Throwable {
		GW_CM_PC_BC_CC_Login lg = new GW_CM_PC_BC_CC_Login(driver, oExtentTest);
		GW_CM_PC_BC_CC_TabNavigation mn = new GW_CM_PC_BC_CC_TabNavigation(driver, oExtentTest);
		GW_CC_SearchPolicy gs=new GW_CC_SearchPolicy(driver, oExtentTest);
		GW_CC_BasicInformation bi=new GW_CC_BasicInformation(driver, oExtentTest);
		GW_CC_AddClaimInformation ac=new GW_CC_AddClaimInformation(driver, oExtentTest);
  
		//-------->login to claimCenter
		lg.login_ClaimsCenter();
		// ------> navigate to new claim
		GW_CM_PC_BC_CC_TabNavigation.ccTabNavigation("NewClaim","NA");
		//-------->searching policy
		gs.fnol_Search_Exitsing_Policy();
		//------->entering basic information
		bi.basicInfo();
		//------->adding add claim information
		ac.addClaimInfo();
		//------->services
		ac.services();
		//------->save and assign Claim
		ac.saveandAssign();
	}

	
}
