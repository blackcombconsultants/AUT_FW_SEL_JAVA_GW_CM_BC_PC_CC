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

	public String getHeader_Screen() throws Throwable {
		return getText_Element(Screen_Header);
	}

	public void NewSubmisisons_SelectLOB() throws Throwable {
		GuidewireAutomate("Lob PersonalAuto", LobPersonalAuto, "click", "");
	}

	@Override
	public void offering() throws Throwable {
		lhm_TestCase_Table_Data = oDB.getData_MSExcel_WorkSheet_Fillo("offering", strTestCaseName);

		
		GuidewireAutomate_Validation("Screen Header", Screen_Header, " equals", "Offerings");
		GuidewireAutomate("Offering Selection", OfferingSelection, "selectByVisibleText", "Basic Program");
	}

	@Override

	public void qualification() throws Throwable {
		lhm_TestCase_Table_Data = oDB.getData_MSExcel_WorkSheet_Fillo("qualification", strTestCaseName);

		
		GuidewireAutomate_Validation("Screen Header", Screen_Header, " equals", "Qualifications");
		GuidewireAutomate("IstApplicantCurrentlyInsured",
				IstApplicantCurrentlyInsured, "selectByVisibleText", "No - New Driver");
		GuidewireAutomate("IsApplicantLicenseCurrently_suspended_canceled_Rrevoked", IsApplicantLicenseCurrently_suspended_canceled_Rrevoked, "click", "No");
		GuidewireAutomate("Has_the_applicants_license_ever_been_canceled_suspended_or_revoked", Has_the_applicants_license_ever_been_canceled_suspended_or_revoked, "click", "No");
		GuidewireAutomate("Anydriverswithconvictionsformovingtrafficviolationswithinthepast3years", Anydriverswithconvictionsformovingtrafficviolationswithinthepast3years,
				"click", "No");
		GuidewireAutomate("Hasanypolicyorcoveragebeendeclined_canceled_NonRenewedduringtheprior3years",
				Hasanypolicyorcoveragebeendeclined_canceled_NonRenewedduringtheprior3years, "click", "No");

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

	}
	
	@Override

	public void validationResults() throws Throwable {
		lhm_TestCase_Table_Data = oDB.getData_MSExcel_WorkSheet_Fillo("payments", strTestCaseName);
		
		GuidewireAutomate_Validation("Screen Header", Screen_Header, " equals", "Payment");

	}
	
	@Override

	public void submissionBound() throws Throwable {
		lhm_TestCase_Table_Data = oDB.getData_MSExcel_WorkSheet_Fillo("payments", strTestCaseName);
		
		GuidewireAutomate_Validation("Screen Header", Screen_Header, " equals", "Payment");

	}
	
}
