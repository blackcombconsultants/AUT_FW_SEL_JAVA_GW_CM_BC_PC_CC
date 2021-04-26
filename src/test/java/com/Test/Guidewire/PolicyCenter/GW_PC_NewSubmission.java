package com.Test.Guidewire.PolicyCenter;

import org.testng.annotations.Test;

import com.Utils.Selenium.GW_GetDriver;
import com.pages.Guidewire.GW_LoginCM_PC_BC_CC;
import com.pages.Guidewire.GW_TabNavigation_CM_PC_BC_CC;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_Coverages;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_Drivers;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_Forms;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_NewSubmission_Reusable;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_PolicyInfo;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_PolicyReview;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_Quote;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_RiskAnalysis;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_Vehicles;
import com.pages.Guidewire.PolicyCenter.GW_PolicyCenter_Resuables;

public class GW_PC_NewSubmission extends GW_GetDriver {

	@Test
	public void AUT_PC_NS_01() throws Throwable {
		GW_LoginCM_PC_BC_CC lg = new GW_LoginCM_PC_BC_CC(driver, oExtentTest);
		GW_TabNavigation_CM_PC_BC_CC tab = new GW_TabNavigation_CM_PC_BC_CC(driver, oExtentTest);

		GW_PolicyCenter_Resuables pcr = new GW_PolicyCenter_Resuables(driver, oExtentTest);
		PersonalAuto_NewSubmission_Reusable par = new PersonalAuto_NewSubmission_Reusable(driver, oExtentTest);
		PersonalAuto_PolicyInfo pi = new PersonalAuto_PolicyInfo(driver, oExtentTest);
		PersonalAuto_Drivers pad = new PersonalAuto_Drivers(driver, oExtentTest);
		PersonalAuto_Vehicles pav = new PersonalAuto_Vehicles(driver, oExtentTest);
		PersonalAuto_Coverages pac = new PersonalAuto_Coverages(driver, oExtentTest);
		PersonalAuto_RiskAnalysis para = new PersonalAuto_RiskAnalysis(driver, oExtentTest);
		PersonalAuto_PolicyReview papr = new PersonalAuto_PolicyReview(driver, oExtentTest);
		PersonalAuto_Quote paq = new PersonalAuto_Quote(driver, oExtentTest);
		PersonalAuto_Forms paf = new PersonalAuto_Forms(driver, oExtentTest);

		lg.login_PolicyCenter();
		tab.gwPolicyCenter_TabNavigation("NewAccount");
		pcr.createPersonAccount();
		tab.gwPolicyCenter_MenuNavigation("NewSubmission");
		pcr.newSubmissions();
		par.newSubmission_LOB();
		par.offering();
		pcr.clickButton("Next");
		par.qualification();
		pcr.clickButton("Next");
		pi.pi_PrimaryNamedInsured();
		pi.pi_OfficialID();
		pi.pi_PolicyDetails();
		pi.pi_AffinityGroup();
		pi.pi_ProducerOfRecord();
		pi.pi_UnderWritingCompany();
		pcr.clickButton("Next");
		pad.driver_Add_ExistingDriver();
		pcr.clickButton("Next");
		pav.ve_CreateVehicles();
		pav.ve_AssaignDriver();
		pav.ve_AdditionalInterest_Add_NewPerson();
		pcr.clickButton("Next");
		para.RA_ApproveUWIssues();
		pcr.clickButton("Next");
		papr.pr_policyDetails();
		papr.pr_PolicyLevelCoverages();
		papr.pr_VehicleLevelCoverages();
		pcr.clickButton("Quote");
		// paq.pa_QuoteDetails();
		// paq.pa_PolicyPremium();
		pcr.clickButton("Next");
		paf.forms_validate("Edit");

		strJob = pcr.infoBar("Job");
		strWorkflow = pcr.infoBar("Workflow");
		strLOB = pcr.infoBar("LOB");
		strEffectiveDate = pcr.infoBar("EffectiveDate");
		strAccountName = pcr.infoBar("AccountName");
		strAccountNumber = pcr.infoBar("AccountNumber");
		strPolicyNumber = pcr.infoBar("PolicyNumber");
		strAmount = pcr.infoBar("AccountName");
	}
}
