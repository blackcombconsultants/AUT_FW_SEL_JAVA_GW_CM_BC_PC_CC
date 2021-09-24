package com.pages.Guidewire.PersonalAuto;

import org.openqa.selenium.By;

public interface PersonalAuto_Reusable_PO {

	final By LOB_PersonalAuto = By.xpath(
			"//div[text()='Personal Auto']/ancestor::td[contains(@id,'Name_Cell')]/preceding-sibling::td//div[contains(@id,'ProductSelection') and text()='Select']");
	final By LOB_GeneralLiability = By.xpath(
			"//div[text()='General Liability']/ancestor::td[contains(@id,'Name_Cell')]/preceding-sibling::td//div[contains(@id,'ProductSelection') and text()='Select']");
	final By SW_Offering = By.xpath("//div[@id='SubmissionWizard-Offering']/div[@role='menuitem']");
	final By SW_PreQualification = By.xpath("//div[@id='SubmissionWizard-PreQualification']/div[@role='menuitem']");
	final By SW_PA_PolicyContract = By.xpath("//div[@id='SubmissionWizard-LOBWizardStepGroup']/div[@role='menuitem']");
	final By SW_PA_PolicyInfo = By
			.xpath("//div[@id='SubmissionWizard-LOBWizardStepGroup-PolicyInfo']/div[@role='menuitem']");
	final By SW_PA_Drivers = By
			.xpath("//div[@id='SubmissionWizard-LOBWizardStepGroup-PADrivers']/div[@role='menuitem']");
	final By SW_PA_Vehicles = By
			.xpath("//div[@id='SubmissionWizard-LOBWizardStepGroup-PersonalVehicles']/div[@role='menuitem']");
	final By SW_PA_PACoverages = By
			.xpath("//div[@id='SubmissionWizard-LOBWizardStepGroup-PALine']/div[@role='menuitem']");
	final By SW_RiskAnalysis = By.xpath("//div[@id='SubmissionWizard-RiskAnalysis']/div[@role='menuitem']");
	final By SW_PolicyReview = By.xpath("//div[@id='SubmissionWizard-PolicyReview']/div[@role='menuitem']");
	final By SW_Quote = By.xpath("//div[@id='SubmissionWizard-ViewQuote']/div[@role='menuitem']");
	final By SW_Forms = By.xpath("//div[@id='SubmissionWizard-Forms']/div[@role='menuitem']");
	final By SW_Payment = By.xpath("//div[@id='SubmissionWizard-BillingInfo']/div[@role='menuitem']");

}
