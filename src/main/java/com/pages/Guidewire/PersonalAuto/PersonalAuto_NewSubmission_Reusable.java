package com.pages.Guidewire.PersonalAuto;

import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.aventstack.extentreports.ExtentTest;

public class PersonalAuto_NewSubmission_Reusable extends SeleniumWebDriver_Commands
		implements PersonalAuto_NewSubmission_ReusablePO {

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
		GuidewireAutomate_Validation("Offerings Header", Screen_Header, " equals", "Offerings");
		GuidewireAutomate("Offering Selection", OfferingSelection, "selectByVisibleText", "Basic Program");
	}

	@Override

	public void Qualification() throws Throwable {
		GuidewireAutomate_Validation("Qualifications Header", Screen_Header, " equals", "Qualifications");
		GuidewireAutomate("IstApplicantCurrentlyInsured",
				IstApplicantCurrentlyInsured, "selectByVisibleText", "No - New Driver");
		GuidewireAutomate("IsApplicantLicenseCurrently_suspended_canceled_Rrevoked", IsApplicantLicenseCurrently_suspended_canceled_Rrevoked, "click", "No");
		GuidewireAutomate("Has_the_applicants_license_ever_been_canceled_suspended_or_revoked", Has_the_applicants_license_ever_been_canceled_suspended_or_revoked, "click", "No");
		GuidewireAutomate("Anydriverswithconvictionsformovingtrafficviolationswithinthepast3years", Anydriverswithconvictionsformovingtrafficviolationswithinthepast3years,
				"click", "No");
		GuidewireAutomate("Hasanypolicyorcoveragebeendeclined_canceled_NonRenewedduringtheprior3years",
				Hasanypolicyorcoveragebeendeclined_canceled_NonRenewedduringtheprior3years, "click", "No");

	}

}
