package com.Test.Guidewire.PolicyCenter;

import org.testng.annotations.Test;

import com.Utils.Selenium.GW_GetDriver;
import com.pages.Guidewire.GW_LoginCM_PC_BC_CC;
import com.pages.Guidewire.GW_TabNavigation_CM_PC_BC_CC;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_Coverages;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_Coverages_PO;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_Drivers;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_Drivers_PO;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_NewSubmission_Reusable;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_PolicyReview;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_Quote;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_RiskAnalysis;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_Vehicles;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_VehiclesPO;
import com.pages.Guidewire.PolicyCenter.GW_PC_PolicyInfo;
import com.pages.Guidewire.PolicyCenter.GW_PC_PolicyInfo_PO;
import com.pages.Guidewire.PolicyCenter.GW_PolicyCenter_Resuables;

public class GW_PC_NewSubmission extends GW_GetDriver {

	@Test
	public void AUT_TS_01() throws Throwable {
		GW_LoginCM_PC_BC_CC lg = new GW_LoginCM_PC_BC_CC(driver, oExtentTest);
		GW_TabNavigation_CM_PC_BC_CC tab = new GW_TabNavigation_CM_PC_BC_CC(driver, oExtentTest);

		GW_PolicyCenter_Resuables pcr = new GW_PolicyCenter_Resuables(driver, oExtentTest);
		PersonalAuto_NewSubmission_Reusable par = new PersonalAuto_NewSubmission_Reusable(driver, oExtentTest);
		GW_PC_PolicyInfo pi = new GW_PC_PolicyInfo(driver, oExtentTest);
		PersonalAuto_Drivers pad = new PersonalAuto_Drivers(driver, oExtentTest);
		PersonalAuto_Vehicles pav = new PersonalAuto_Vehicles(driver, oExtentTest);
		PersonalAuto_Coverages pac = new PersonalAuto_Coverages(driver, oExtentTest);
		PersonalAuto_RiskAnalysis para = new PersonalAuto_RiskAnalysis(driver, oExtentTest);
		PersonalAuto_PolicyReview papr = new PersonalAuto_PolicyReview(driver, oExtentTest);
		PersonalAuto_Quote paq = new PersonalAuto_Quote(driver, oExtentTest);

		lg.login_PolicyCenter();
		tab.navigate_AccountTab_AccountNumberSearch("9747537483");
		tab.gwPolicyCenter_MenuNavigation("NewSubmission");
		pcr.pc_NewSubmission();
		par.NewSubmisisons_SelectLOB();
		par.offering();
		pcr.clickButton("Next");
		par.Qualification();
		pcr.clickButton("Next");
		pi.pi_PolicyDetails();
		pi.pi_primaryInsured_NewPerson();
		pi.pi_AdditionalNamedInsured_Add_NewPerson();
		pi.pi_OfficialID();
		pi.pi_SecondaryInsured_NewPerson();
		pi.pi_AffinityGroup();
		pi.pi_ProducerOfRecord();
		pi.pi_UnderWritingCompany();
		pcr.clickButton("Next");
		pad.dr_Add_NewPerson();
		pcr.clickButton("Next");
		pav.ve_CreateVehicles();
		pav.ve_AssaignDriver();
		pav.ve_AdditionalInterest_Add_NewPerson();
		pcr.clickButton("Next");
		para.RA_ApproveUWIssues();
		pcr.clickButton("Next");
		papr.pr_VehiclesLevelCoverages();
		pcr.clickButton("Quote");
		paq.pr_QuoteDetails();
		paq.pr_PolicyPremium();
		pcr.clickButton("Next");
		pcr.pc_LOB_Forms();
		pcr.clickButton("Next");

		
		
		
		
		
	}
}
