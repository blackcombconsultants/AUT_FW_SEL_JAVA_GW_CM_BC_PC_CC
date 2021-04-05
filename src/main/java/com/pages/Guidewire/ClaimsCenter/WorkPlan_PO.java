package com.pages.Guidewire.ClaimsCenter;

import org.openqa.selenium.By;




public interface WorkPlan_PO {
	final By workplan=By.id("Claim-MenuLinks-Claim_ClaimWorkplan");
	final By subject=By.id("ClaimWorkplan-ClaimWorkplanScreen-WorkplanLV-4-Subject_button");
	final By sampleText1=By.xpath("//*[@id='l--2']");
    final By updateLossDecision=By.xpath("//*[@id='ActivityDetailWorksheet-ActivityDetailScreen-ActivityDV-ActivityCompensableInputSet-UpdateCompensability']/div/div[2]");
    final By closeWorksheet=By.xpath("//*[@id='ActivityDetailWorksheet-ActivityDetailScreen-Close']/div/div[2]");
    final By injuryDuringEmployment=By.id("ClaimLossDetails-ClaimLossDetailsScreen-LossDetailsPanelSet-LossDetailsCardCV-LossDetailsDV-CompensabilityFactorsInputSet-Claim_EmploymentInjury_1");
    final By performingRegularJob=By.id("ClaimLossDetails-ClaimLossDetailsScreen-LossDetailsPanelSet-LossDetailsCardCV-LossDetailsDV-CompensabilityFactorsInputSet-InjuredOnRegularJob_1");
    final By employerQuestionsClaim=By.id("ClaimLossDetails-ClaimLossDetailsScreen-LossDetailsPanelSet-LossDetailsCardCV-LossDetailsDV-CompensabilityFactorsInputSet-EmployerQuestionsValidity_1");
    final By safetyEquipmentProvided=By.id("ClaimLossDetails-ClaimLossDetailsScreen-LossDetailsPanelSet-LossDetailsCardCV-LossDetailsDV-CompensabilityFactorsInputSet-SafetyEquipmentProvided_1");
    final By safetyEquipmentUsed=By.id("ClaimLossDetails-ClaimLossDetailsScreen-LossDetailsPanelSet-LossDetailsCardCV-LossDetailsDV-CompensabilityFactorsInputSet-SafetyEquipmentUsed_0");
    final By drugsInvolved=By.id("ClaimLossDetails-ClaimLossDetailsScreen-LossDetailsPanelSet-LossDetailsCardCV-LossDetailsDV-CompensabilityFactorsInputSet-DrugsInvolved_2");
    final By sampleTest2=By.id("ClaimLossDetails-ClaimLossDetailsScreen-LossDetailsPanelSet-LossDetailsCardCV-LossDetailsDV-Classification");
    final By compensability=By.name("ClaimLossDetails-ClaimLossDetailsScreen-LossDetailsPanelSet-LossDetailsCardCV-LossDetailsDV-CompensabilityFactorsInputSet-CompensableInputSet-CompensableStatus");
    final By reasonforDecision=By.name("ClaimLossDetails-ClaimLossDetailsScreen-LossDetailsPanelSet-LossDetailsCardCV-LossDetailsDV-CompensabilityFactorsInputSet-CompensableInputSet-CompensabilityDecision_BenefitsDecisionReason");
    final By update=By.xpath("//*[@id='ClaimLossDetails-ClaimLossDetailsScreen-Update']/div/div[2]/div");
    final By workplanCheckBox=By.id("ClaimWorkplan-ClaimWorkplanScreen-WorkplanLV-_Checkbox");
    final By complete=By.id("ClaimWorkplan-ClaimWorkplanScreen-ClaimWorkplan_CompleteButton");
    
    
	
}
