package com.pages.Guidewire.ClaimsCenter;

import org.openqa.selenium.By;

public interface ClaimCenter_AddClaimInformation_PO {
	
	/*
	 * AddClaimInformation
	 */
	 
	final By ADI_WhatHappened=By.xpath("//textarea[contains(@name,'LossDetailsAddressDV-Description')]");
	final By ADI_LossCause=By.xpath("//select[contains(@name,'LossDetailsAddressDV-Claim_LossCause')]");
	final By ADI_location=By.xpath("//select[contains(@name,'globalAddressContainer-Address_Picker')]");
    final By  ADI_State=By.xpath("//select[contains(@name,'GlobalAddressInputSet-State')]");
	final By addClaimInfo_Header=By.id("FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-ttlBar");
	
	
	final By dateOfEmployerNotified=By.name("FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-DateReportedtoEmployer");
	final By injuryDescription=By.name("FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-Claim_InjuryDescription");
	final By injury=By.id("FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-InjurySeverity_DeathReport_0");
	final By causeOfInjury=By.name("FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-Claim_InjuryIllnessCause");
	final By detailedInjury=By.name("FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-Claim_DetailedInjury");
	final By medicalAttention=By.id("FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-InjurySeverity_MedicalReport_0");
	final By areaOfBody=By.name("FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-EditableBodyPartDetailsLV-0-PrimaryBodyPart");
	final By bodyPart=By.name("FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-EditableBodyPartDetailsLV-0-DetailedBodyPart");
	final By ppdPercentage=By.name("FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-EditableBodyPartDetailsLV-0-PermamentImpairmentPercentage");
	final By lostTimeFromWork=By.id("FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-InjurySeverity_TimeLossReport_0");
	final By testClickTop=By.id("gw-center-title-toolbar");
	final By next=By.id("FNOLWizard-Next");
	final By finish=By.id("FNOLWizard-Finish");
	
	

}
