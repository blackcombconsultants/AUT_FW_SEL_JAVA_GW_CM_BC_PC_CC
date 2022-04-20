package com.pages.Guidewire.PolicyCenter.HomeOwners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.aventstack.extentreports.ExtentTest;

public class HO_Reusable  extends SeleniumWebDriver_Commands  {

	public HO_Reusable(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
		
	}
	private static By LOB_HomeOwners= By.xpath("//div[text()='Homeowners']/ancestor::td[contains(@id,'Name_Cell')]/preceding-sibling::td//div[contains(@id,'ProductSelection') and text()='Select']");

	private static By SW_Offering          = By.xpath("//div[@id='SubmissionWizard-Offering']/div[@role='menuitem']");
	private static By SW_PreQualification  = By.xpath("//div[@id='SubmissionWizard-PreQualification']/div[@role='menuitem']");
	private static By SW_PA_PolicyContract = By.xpath("//div[@id='SubmissionWizard-LOBWizardStepGroup']/div[@role='menuitem']");
	private static By SW_PA_PolicyInfo     = By.xpath("//div[@id='SubmissionWizard-LOBWizardStepGroup-PolicyInfo']/div[@role='menuitem']");
	private static By SW_PA_Drivers        = By.xpath("//div[@id='SubmissionWizard-LOBWizardStepGroup-PADrivers']/div[@role='menuitem']");
	private static By SW_PA_Vehicles       = By.xpath("//div[@id='SubmissionWizard-LOBWizardStepGroup-PersonalVehicles']/div[@role='menuitem']");
	private static By SW_PA_PACoverages    = By.xpath("//div[@id='SubmissionWizard-LOBWizardStepGroup-PALine']/div[@role='menuitem']");
	private static By SW_RiskAnalysis      = By.xpath("//div[@id='SubmissionWizard-RiskAnalysis']/div[@role='menuitem']");
	private static By SW_PolicyReview      = By.xpath("//div[@id='SubmissionWizard-PolicyReview']/div[@role='menuitem']");
	private static By SW_Quote             = By.xpath("//div[@id='SubmissionWizard-ViewQuote']/div[@role='menuitem']");
	private static By SW_Forms             = By.xpath("//div[@id='SubmissionWizard-Forms']/div[@role='menuitem']");
	private static By SW_Payment           = By.xpath("//div[@id='SubmissionWizard-BillingInfo']/div[@role='menuitem']");
    
	
    public static void newSubmission_SelectLOB_HomeOwners() throws Throwable {
		GuidewireAutomate("LOB HomeOwners", LOB_HomeOwners, "clickAndwait", "click");
	}

}
