package com.pages.Guidewire.PersonalAuto;

import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Resuables_PO;

public class PersonalAuto_Qualification extends SeleniumWebDriver_Commands implements PersonalAuto_Qualification_PO {
	Selenium_Utils_DataBase oDB = new Selenium_Utils_DataBase();

	public PersonalAuto_Qualification(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	public static void qualification() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("qualification",
				strTestCaseName);

		GuidewireAutomate_Validation("Screen Header", PolicyCenter_Resuables_PO.Qualification_Header, "equals",
				"Qualification");

		GuidewireAutomate_Validation("PA Pre-Qualification", QU_PA_PreQualification, "equals", "PA Pre-Qualification");

		GuidewireAutomate("Is the applicant currently insured?", QU_IsApplicantCurrentlyInsured, "selectByVisibleText",
				lhm_TestCase_Table_Data.get("QU_IsApplicantCurrentlyInsured"));
		GuidewireAutomate("Is the applicant's license currently suspended, canceled, or revoked?",
				QU_IsApplicantLicenseCurrently_suspended_canceled_Revoked, "click",
				lhm_TestCase_Table_Data.get("QU_IsApplicantLicenseCurrently_suspended_canceled_Revoked"));
		GuidewireAutomate("Has the applicant's license ever been canceled, suspended or revoked?",
				QU_Has_the_applicants_license_ever_been_canceled_suspended_or_revoked, "click",
				lhm_TestCase_Table_Data.get("QU_Has_the_applicants_license_ever_been_canceled_suspended_or_revoked"));
		GuidewireAutomate(
				"Any drivers with convictions for moving traffic violations within the past 3 years? If 'Yes' please explain",
				QU_Anydriverswithconvictionsformovingtrafficviolationswithinthepast3years, "click",
				lhm_TestCase_Table_Data
						.get("QU_Anydriverswithconvictionsformovingtrafficviolationswithinthepast3years"));
		GuidewireAutomate(
				"Has any policy or coverage been declined, canceled, or non-renewed during the prior 3 years?",
				QU_Hasanypolicyorcoveragebeendeclined_canceled_NonRenewedduringtheprior3years, "click",
				lhm_TestCase_Table_Data
						.get("QU_Hasanypolicyorcoveragebeendeclined_canceled_NonRenewedduringtheprior3years"));

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();

	}

}
