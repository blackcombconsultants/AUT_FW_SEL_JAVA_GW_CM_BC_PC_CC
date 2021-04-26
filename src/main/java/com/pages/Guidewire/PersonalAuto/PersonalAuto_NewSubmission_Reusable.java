package com.pages.Guidewire.PersonalAuto;

import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;

public class PersonalAuto_NewSubmission_Reusable extends SeleniumWebDriver_Commands
		implements PersonalAuto_NewSubmission_ReusablePO {
	Selenium_Utils_DataBase oDB = new Selenium_Utils_DataBase();

	public PersonalAuto_NewSubmission_Reusable(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	@Override
	public void newSubmission_LOB() throws Throwable {
		GuidewireAutomate("LOB", LOB_PersonalAuto, "click", "");
	}

	@Override
	public void offering() throws Throwable {
		lhm_TestCase_Table_Data = oDB.getData_MSExcel_WorkSheet_Fillo("offering", strTestCaseName);

		GuidewireAutomate_Validation("Screen Header", Screen_Header, " equals", "Offerings");
		GuidewireAutomate("Offering Selection", Of_OfferingSelection, "selectByVisibleText",
				lhm_TestCase_Table_Data.get("Of_OfferingSelection"));
		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	@Override

	public void qualification() throws Throwable {
		lhm_TestCase_Table_Data = oDB.getData_MSExcel_WorkSheet_Fillo("qualification", strTestCaseName);

		GuidewireAutomate_Validation("Screen Header", Screen_Header, " equals", "Qualifications");
		GuidewireAutomate("QU_IsApplicantCurrentlyInsured", QU_IsApplicantCurrentlyInsured, "selectByVisibleText",
				lhm_TestCase_Table_Data.get("QU_IsApplicantCurrentlyInsured"));
		GuidewireAutomate("QU_IsApplicantLicenseCurrently_suspended_canceled_Revoked",
				QU_IsApplicantLicenseCurrently_suspended_canceled_Revoked, "click",
				lhm_TestCase_Table_Data.get("QU_IsApplicantLicenseCurrently_suspended_canceled_Revoked"));
		GuidewireAutomate("Has_the_applicants_license_ever_been_canceled_suspended_or_revoked",
				QU_Has_the_applicants_license_ever_been_canceled_suspended_or_revoked, "click",
				lhm_TestCase_Table_Data.get("QU_Has_the_applicants_license_ever_been_canceled_suspended_or_revoked"));
		GuidewireAutomate("Anydriverswithconvictionsformovingtrafficviolationswithinthepast3years",
				QU_Anydriverswithconvictionsformovingtrafficviolationswithinthepast3years, "click",
				lhm_TestCase_Table_Data
						.get("QU_Anydriverswithconvictionsformovingtrafficviolationswithinthepast3years"));
		GuidewireAutomate("Hasanypolicyorcoveragebeendeclined_canceled_NonRenewedduringtheprior3years",
				QU_Hasanypolicyorcoveragebeendeclined_canceled_NonRenewedduringtheprior3years, "click",
				lhm_TestCase_Table_Data
						.get("QU_Hasanypolicyorcoveragebeendeclined_canceled_NonRenewedduringtheprior3years"));
		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();

	}

	@Override
	public void forms() throws Throwable {
		lhm_TestCase_Table_Data = oDB.getData_MSExcel_WorkSheet_Fillo("forms", strTestCaseName);

		GuidewireAutomate_Validation("Screen Header", Screen_Header, " equals", "Forms");

	}

	@Override
	public void payments() throws Throwable {
		lhm_TestCase_Table_Data = oDB.getData_MSExcel_WorkSheet_Fillo("payments", strTestCaseName);

		GuidewireAutomate_Validation("Screen Header", Screen_Header, " equals", "Payment");
		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();

	}

	@Override

	public void validationResults() throws Throwable {
		lhm_TestCase_Table_Data = oDB.getData_MSExcel_WorkSheet_Fillo("payments", strTestCaseName);

		GuidewireAutomate_Validation("Screen Header", Screen_Header, " equals", "Payment");
		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	@Override

	public void submissionBound() throws Throwable {
		lhm_TestCase_Table_Data = oDB.getData_MSExcel_WorkSheet_Fillo("payments", strTestCaseName);

		GuidewireAutomate_Validation("Screen Header", Screen_Header, " equals", "Payment");
		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	@Override

	public void getRandomVIN(String vingenerator) throws Throwable {
		switch (vingenerator) {
		case "vingenerator":
			url = "https://vingenerator.org/";
			break;
		case "randomvin":
			url = "https://randomvin.com/";
			break;

		default:
			driver_ThirdPartyTool = getDriver();
			driver_ThirdPartyTool.navigate().to("https://vingenerator.org/");
		}
		
		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

}
