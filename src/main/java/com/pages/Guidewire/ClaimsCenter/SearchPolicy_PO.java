package com.pages.Guidewire.ClaimsCenter;

import org.openqa.selenium.By;

public interface SearchPolicy_PO {
final By newClaim=By.xpath("//*[@id='TabBar-ClaimTab']/div[3]");
final By optionNewClaim=By.xpath("//*[@id='TabBar-ClaimTab-ClaimTab_FNOLWizard']/div");
final By FindPolicy=By.name("FNOLWizard-FNOLWizard_FindPolicyScreen-ScreenMode");
final By PolicyType=By.name("FNOLWizard-FNOLWizard_FindPolicyScreen-FNOLWizardFindPolicyPanelSet-PolicyType");
final By PolicyNumber=By.name("FNOLWizard-FNOLWizard_FindPolicyScreen-FNOLWizardFindPolicyPanelSet-policyNumber");
final By LossDate=By.name("FNOLWizard-FNOLWizard_FindPolicyScreen-FNOLWizardFindPolicyPanelSet-date");
final By Search=By.id("FNOLWizard-FNOLWizard_FindPolicyScreen-FNOLWizardFindPolicyPanelSet-Search");
final By tabClick=By.id("gw-center-title-toolbar");
final By next=By.id("FNOLWizard-Next");

}
