package com.Test.Guidewire.ClaimsCenter;

import org.testng.annotations.Test;

import com.Utils.Selenium.GW_GetDriver;
import com.pages.Guidewire.GW_CM_PC_BC_CC_Login;
import com.pages.Guidewire.Tab_Menu_Navigation;
import com.pages.Guidewire.ClaimsCenter.CC_NewClaimWizard;
import com.pages.Guidewire.ClaimsCenter.ClaimCenter_ClaimExposure;
import com.pages.Guidewire.ClaimsCenter.ClaimCenter_Resuables;

public class Test_NewExposure extends GW_GetDriver {

	@Test
	public void AUT_NewExposure_ChoosebyCoverageType() throws Throwable {

		// ------>Login to CliamCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// ------>Creating New Claim
		CC_NewClaimWizard.assignClaimProcess("New Claim", "NewclaimAuto");

		// ------->Checking ChoosebyCoverageType_Exposure
		Tab_Menu_Navigation.ccMenuNavigation("Choose by Coverage Type");

		ClaimCenter_ClaimExposure.ChoosebyCoverageType_Exposure("C");
		ClaimCenter_ClaimExposure.ChoosebyCoverageType_Exposure("D");
		ClaimCenter_ClaimExposure.ChoosebyCoverageType_Exposure("E");
		ClaimCenter_ClaimExposure.ChoosebyCoverageType_Exposure("L");
		ClaimCenter_ClaimExposure.ChoosebyCoverageType_Exposure("M");
		ClaimCenter_ClaimExposure.ChoosebyCoverageType_Exposure("P");

		ClaimCenter_ClaimExposure.ChoosebyCoverageType_Exposure("R");
		ClaimCenter_ClaimExposure.ChoosebyCoverageType_Exposure("T");
		ClaimCenter_ClaimExposure.ChoosebyCoverageType_Exposure("U");

	}

	@Test
	public void AUT_NewExposure_ChoosebyCoverage_MedicalPayments() throws Throwable {

		// ------>Login to CliamCenter
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// ------>Creating New Claim
		CC_NewClaimWizard.assignClaimProcess("New Claim", "NewclaimAuto");
		// ---->Adding new exposure
		Tab_Menu_Navigation.ccMenuNavigation("Medical Payments");
		ClaimCenter_Resuables.newExposure();

	}

}
