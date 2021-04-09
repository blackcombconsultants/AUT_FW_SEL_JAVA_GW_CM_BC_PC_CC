package com.Test.Guidewire.ClaimsCenter;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.Utils.Selenium.GW_GetDriver;
import com.aventstack.extentreports.ExtentTest;
import com.pages.Guidewire.GW_LoginCM_PC_BC_CC;
import com.pages.Guidewire.GW_TabNavigation_CM_PC_BC_CC;
import com.pages.Guidewire.ClaimsCenter.GW_CC_AddClaimInformation;
import com.pages.Guidewire.ClaimsCenter.GW_CC_BasicInformation;
import com.pages.Guidewire.ClaimsCenter.GW_CC_SearchPolicy;

public class GW_CC_CreateClaim extends GW_GetDriver {
 
	
	@Test
	public void createClaim() throws Throwable {
		GW_LoginCM_PC_BC_CC lg = new GW_LoginCM_PC_BC_CC(driver, oExtentTest);
		GW_TabNavigation_CM_PC_BC_CC mn = new GW_TabNavigation_CM_PC_BC_CC(driver, oExtentTest);
		GW_CC_SearchPolicy gs=new GW_CC_SearchPolicy(driver, oExtentTest);
		GW_CC_BasicInformation bi=new GW_CC_BasicInformation(driver, oExtentTest);
		GW_CC_AddClaimInformation ac=new GW_CC_AddClaimInformation(driver, oExtentTest);
  
		//-------->login to claimCenter
		lg.login_ClaimsCenter();
		// ------> navigate to new claim
		mn.gwClaimsCenter_TabNavigation("NewClaim");
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
