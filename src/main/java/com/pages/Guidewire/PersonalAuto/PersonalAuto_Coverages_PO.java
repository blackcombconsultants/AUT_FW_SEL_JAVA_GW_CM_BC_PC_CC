package com.pages.Guidewire.PersonalAuto;

import org.openqa.selenium.By;

public interface PersonalAuto_Coverages_PO {

	final By NewSubmisison_Screen_PALOB_Button = By.xpath("//div[contains(@id,'-8-addSubmission')]");
    final By PA_Coverages_Screen_titlebar=By.xpath("//div[contains(@id,'PersonalAutoScreen-ttlBar')]//div[1]//div");
	final By PA_Coverages_Tab=By.xpath("//div[contains(@id,'PersonalAutoScreen-CoveragesTab')]");
	final By PA_Coverages_AdditionalCoveragesTab=By.xpath("//div[contains(@id,'PersonalAutoScreen-AdditionalCoveragesTab')]");
	final By PA_Coverages_ExclusionsAndConditionsCardTab=By.xpath("//div[contains(@id,'PersonalAutoScreen-exclusionsAndConditionsCardTab')]");
    final By PA_Coverages_Auto_Liability_Package=By.xpath("//select[contains(@name,'CovPatternInputGroup-LiabilityTermInput')]");

	void pac_CoveragesAppliedtoallvehicles() throws Throwable;


}
