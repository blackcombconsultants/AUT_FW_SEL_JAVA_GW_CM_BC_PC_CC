package com.pages.Guidewire.ClaimsCenter;

import org.openqa.selenium.By;

public interface ClaimCenter_SearchPolicy_PO {
	/*
	 * 
	 */
	final By SP_Header = By.xpath("//div[@id='FNOLWizard-FNOLWizard_FindPolicyScreen-ttlBar']//div[@class='gw-TitleBar--title']");
	
	/*
	 * Find Policy 
	 */
	
	final By SP_FP_PolicyNumber = By.xpath("//input[contains(@name,'FNOLWizardFindPolicyPanelSet-policyNumber')]");
	final By SP_FP_LossDate = By.xpath("//input[contains(@name,'FNOLWizardFindPolicyPanelSet-Claim_LossDate')]");
    final By SP_FP_Search=By.xpath("//div[contains(@id,'FNOLWizardFindPolicyPanelSet-Search')]");


	

}
