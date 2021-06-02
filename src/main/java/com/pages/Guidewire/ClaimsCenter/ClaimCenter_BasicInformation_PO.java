package com.pages.Guidewire.ClaimsCenter;

import org.openqa.selenium.By;

public interface ClaimCenter_BasicInformation_PO {

	
	final By basicInfo_Header=By.id("FNOLWizard-FullWizardStepSet-FNOLWizard_BasicInfoScreen-ttlBar");
	final By insuredName=By.xpath("//div[contains(@id,'Insured')]//div[@class='gw-label gw-infoValue']");
	/*
	 * BasicInfo ReportedBy
	 */
	final By BI_RB_Name=By.xpath("//select[contains(@name,'BasicInfoDetailViewPanelDV-ReportedBy_Name')]");
	/*
	 * BasicInfo InvolvedVehicles
	 */
	final By BI_IV_CheckBox=By.xpath("//input[contains(@name,'InsuredVehicleInputGroup-_checkbox')]");

	/*
	 * unverifiedPolicy ReportedBy
	 */
	final By BI_RB_HowReported=By.xpath("");
	
    
}
