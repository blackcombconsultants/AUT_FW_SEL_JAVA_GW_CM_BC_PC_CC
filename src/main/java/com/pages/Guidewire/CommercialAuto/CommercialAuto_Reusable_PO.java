package com.pages.Guidewire.CommercialAuto;

import org.openqa.selenium.By;

public interface CommercialAuto_Reusable_PO {
	
	final By LOB_CommercialAuto = By.xpath("//div[text()='Commercial Auto']/ancestor::td[contains(@id,'Name_Cell')]/preceding-sibling::td//div[contains(@id,'ProductSelection') and text()='Select']");

	final By SW_Offering          = By.xpath("//div[@id='SubmissionWizard-Offering']/div[@role='menuitem']");
	final By SW_PreQualification  = By.xpath("//div[@id='SubmissionWizard-PreQualification']/div[@role='menuitem']");
	final By SW_CA_PolicyContract = By.xpath("//div[@id='SubmissionWizard-LOBWizardStepGroup']/div[@role='menuitem']");
	final By SW_CA_PolicyInfo     = By.xpath("//div[@id='SubmissionWizard-LOBWizardStepGroup-PolicyInfo']/div[@role='menuitem']");
	final By SW_CA_CommercialAutoLine = By.xpath("//div[@id='SubmissionWizard-LOBWizardStepGroup-baLineStep']/div[@role='menuitem']");
	final By SW_CA_Locations = By.xpath("//div[@id='SubmissionWizard-LOBWizardStepGroup-Locations']/div[@role='menuitem']");
	final By SW_CA_Vehicles       = By.xpath("//div[@id='SubmissionWizard-LOBWizardStepGroup-BusinessVehicles']/div[@role='menuitem']");
	final By SW_CA_StateInfo = By.xpath("//div[@id='SubmissionWizard-LOBWizardStepGroup-StateInfo']/div[@role='menuitem']");
	final By SW_CA_Drivers        = By.xpath("//div[@id='SubmissionWizard-LOBWizardStepGroup-BADrivers']/div[@role='menuitem']");
	final By SW_CA_CoveredVehicles = By.xpath("//div[@id='SubmissionWizard-LOBWizardStepGroup-CoveredAutoSymbols']/div[@role='menuitem']");
	final By SW_CA_Modifiers = By.xpath("//div[@id='SubmissionWizard-LOBWizardStepGroup-Modifiers']/div[@role='menuitem']");
	final By SW_CA_RiskAnalysis      = By.xpath("//div[@id='SubmissionWizard-RiskAnalysis']/div[@role='menuitem']");
	final By SW_CA_PolicyReview      = By.xpath("//div[@id='SubmissionWizard-PolicyReview']/div[@role='menuitem']");
	final By SW_CA_Quote             = By.xpath("//div[@id='SubmissionWizard-ViewQuote']/div[@role='menuitem']");
	final By SW_CA_Forms             = By.xpath("//div[@id='SubmissionWizard-Forms']/div[@role='menuitem']");
	final By SW_CA_Payment           = By.xpath("//div[@id='SubmissionWizard-BillingInfo']/div[@role='menuitem']");

}
