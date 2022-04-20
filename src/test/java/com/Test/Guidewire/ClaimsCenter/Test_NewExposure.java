package com.Test.Guidewire.ClaimsCenter;

import org.testng.annotations.Test;

import com.Utils.Selenium.GW_GetDriver;
import com.pages.Guidewire.ClaimsCenter.CC_Exposure;
import com.pages.Guidewire.ClaimsCenter.CC_NewClaimWizard;
import com.pages.Guidewire.ClaimsCenter.CC_Reusables;

public class Test_NewExposure extends GW_GetDriver {

	@Test
	public void AUT_NewExposure_ChoosebyCoverageType() throws Throwable {

		// ------>Login to CliamCenter
		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// ------>Creating New Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

		// ------->Checking ChoosebyCoverageType_Exposure
		CC_Reusables.ccMenuNavigation("Choose by Coverage Type");

		CC_Exposure.ChoosebyCoverageType_Exposure("C");
		CC_Exposure.ChoosebyCoverageType_Exposure("D");
		CC_Exposure.ChoosebyCoverageType_Exposure("E");
		CC_Exposure.ChoosebyCoverageType_Exposure("L");
		CC_Exposure.ChoosebyCoverageType_Exposure("M");
		CC_Exposure.ChoosebyCoverageType_Exposure("P");

		CC_Exposure.ChoosebyCoverageType_Exposure("R");
		CC_Exposure.ChoosebyCoverageType_Exposure("T");
		CC_Exposure.ChoosebyCoverageType_Exposure("U");

	}

	@Test
	public void AUT_NewExposure_ChoosebyCoverage_MedicalPayments() throws Throwable {

		// ------>Login to CliamCenter
		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// ------>Creating New Claim
		CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");
		// ---->Adding new exposure
		CC_Reusables.ccMenuNavigation("Medical Payments");
		CC_Exposure.newExposure();

	}

}
