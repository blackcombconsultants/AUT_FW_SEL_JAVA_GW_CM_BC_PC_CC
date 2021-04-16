package com.Test.Guidewire.PolicyCenter;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.Utils.Selenium.GW_GetDriver;
import com.aventstack.extentreports.ExtentTest;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_Coverages;

public class GW_PC_PersonalAuto_Coverages extends GW_GetDriver{

	@Test
	public void AUT_PC_AC_05() throws Throwable
	{
		PersonalAuto_Coverages pc=new PersonalAuto_Coverages(driver, oExtentTest);
		//---->adding coverages applied to all vehicles
		pc.pac_CoveragesAppliedtoallvehicles();
		//---->searching AddExclusionorCondition
		pc.pac_SearchAddExclusionorCondition();
	}
}
