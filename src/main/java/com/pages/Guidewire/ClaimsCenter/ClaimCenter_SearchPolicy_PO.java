package com.pages.Guidewire.ClaimsCenter;

import org.openqa.selenium.By;

public interface ClaimCenter_SearchPolicy_PO {
	/*
	 * 
	 */
	final By SP_Header = By
			.xpath("//div[@id='FNOLWizard-FNOLWizard_FindPolicyScreen-ttlBar']//div[@class='gw-TitleBar--title']");
	final By SP_NewVehicle = By
			.xpath("//div[contains(@id,'NewPolicyVehicleScreen-ttlBar')]//div[@class='gw-TitleBar--title']");
	/*
	 * Find Policy
	 */

	final By SP_FP_PolicyNumber = By.xpath("//input[contains(@name,'FNOLWizardFindPolicyPanelSet-policyNumber')]");
	final By SP_FP_LossDate = By.xpath("//input[contains(@name,'FNOLWizardFindPolicyPanelSet-Claim_LossDate')]");
	final By SP_FP_Search = By.xpath("//div[contains(@id,'FNOLWizardFindPolicyPanelSet-Search')]");

	/*
	 * Create Unverified Policy
	 */
	final By CreateUnverifiedPolicy = By.xpath(
			"//span[@class='gw-label--inner' and text()='Create Unverified Policy']/preceding-sibling::span[@class='gw-radio-wrapper']//input[contains(@name,'ScreenMode')]");
	final By CUP_PolicyNumber = By.xpath("//input[contains(@name,'FNOLWizardFindPolicyPanelSet-PolicyNumber')]");
	final By CUP_Type = By.xpath("//select[contains(@name,'FNOLWizardFindPolicyPanelSet-Type')]");
	final By CUP_TypeofClaim_Auto = By.xpath("//input[contains(@id,'FNOLWizardFindPolicyPanelSet-ClaimMode_0')]");
	final By CUP_TypeofClaim_Auto_AutoFirstandFinal = By.xpath(
			"//span[@class='gw-label--inner' and text()='Auto - Auto First and Final']/preceding-sibling::span[@class='gw-radio-wrapper']//input[contains(@name,'ClaimLossType')]");
	final By CUP_TypeofClaim_AutoAuto_QuickClaimAuto = By
			.xpath("//input[contains(@id,'FNOLWizardFindPolicyPanelSet-ClaimMode_2')]");
	final By CUP_LossDate = By.xpath("//input[contains(@name,'FNOLWizardFindPolicyPanelSet-Claim_LossDate')]");
	/*
	 * Basic Information
	 */
	final By CUP_BI_EffectiveDate = By.xpath("//input[contains(@name,'EffectiveDate')]");
	final By CUP_BI_ExpirationDate = By.xpath("//input[contains(@name,'ExpirationDate')]");

	/*
	 * InsuredName-NewPerson
	 */
	final By CUP_Insured_Name = By
			.xpath("//div[contains(@id,'Insured_NameMenuIcon')]//div[@class='gw-action--expand-button']");
	final By CUP_Insured_NewPerson = By
			.xpath("//div[contains(@id,'NewPerson' )]//div[@class='gw-label' and text()='New Person']");
	final By CUP_Insured_NewPerson_LastName = By.xpath("//input[contains(@name,'GlobalPersonNameInputSet-LastName')]");
    final By CUP_Insured_NewPerson_TaxID=By.xpath("//input[contains(@name,'TaxID')]");
	
    final By CUP_Insured_NewPerson_Address1=By.xpath("//input[contains(@name,'AddressLine1')]");
	final By CUP_Insured_NewPerson_City=By.xpath("//input[contains(@name,'City')]");
	final By CUP_Insured_NewPerson_County=By.xpath("//input[contains(@name,'County')]");

	final By CUP_Insured_NewPerson_State=By.xpath("//select[contains(@name,'GlobalAddressInputSet-State')]");
	final By CUP_Insured_NewPerson_ZIPCode=By.xpath("//input[contains(@name,'PostalCode')]");

	

    
    
    /*
	 * CreateUnverifiedPolicy_AddNewVehicle
	 */
	final By CUP_ANV_AddVehicle = By.xpath("//div[contains(@id,'NewClaimVehiclesLV_tb-Add' )]//div[@role='button']");
	final By CUP_ANV_Make = By.xpath("//input[contains(@name,'Make')]");
	final By CUP_ANV_Model = By.xpath("//input[contains(@name,'Model')]");
	final By CUP_ANV_Year = By.xpath("//input[contains(@name,'Year')]");

	/*
	 * NewVehicle-Coverages
	 */
	final By CUP_ANV_AddCoverages=By.xpath("//div[contains(@id,'EditableVehicleCoveragesLV_tb-Add' )]//div[@role='button']");
    final By CUP_ANV_CoverageType=By.xpath("//select[contains(@name,'CoverageType')]");
    final By CUP_ANV_ExposureLimit=By.xpath("//input[contains(@name,'ExposureLimit')]");
    final By  CUP_ANV_IncidentLimit=By.xpath("//input[contains(@name,'IncidentLimit')]");
    final By Ok=By.xpath("//div[contains(@id,'Update')]");

}
