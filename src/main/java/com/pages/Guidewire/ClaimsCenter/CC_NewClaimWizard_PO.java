package com.pages.Guidewire.ClaimsCenter;

import org.openqa.selenium.By;

public interface CC_NewClaimWizard_PO {
	/*
	 * CC_NCW_Step1of5_SearchorCreatePolicy
	 */
	final By NCW_SearchorCreatePolicy_Header = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading'  and text()='Step 1 of 5: Search or Create Policy']");

	final By SP_NewVehicle = By.xpath("//div[contains(@id,'NewPolicyVehicleScreen-ttlBar')]//div[@class='gw-TitleBar--title']");

	/*
	 * Find Policy
	 */
	final By SCP_FindPolicy = By.xpath("//span[text()='Find Policy']/preceding-sibling::span[@class='gw-radio-wrapper']/input[contains(@name,'FNOLWizard_FindPolicyScreen')]");

	final By SCP_FP_PolicyNumber     = By.xpath("//input[contains(@name,'FNOLWizardFindPolicyPanelSet-policyNumber')]");
	final By SCP_FP_FirstName        = By.xpath("//input[contains(@name,'FNOLWizardFindPolicyPanelSet-FirstName')]");
	final By SCP_FP_LastName         = By.xpath("//input[contains(@name,'FNOLWizardFindPolicyPanelSet-LastName')]");
	final By SCP_FP_OrganizationName = By.xpath("//input[contains(@name,'FNOLWizardFindPolicyPanelSet-Name')]");
	final By SCP_FP_PolicyType       = By.xpath("//select[contains(@name,'FNOLWizardFindPolicyPanelSet-PolicyType')]");
	final By SCP_FP_LossDate         = By.xpath("//input[contains(@name,'FNOLWizardFindPolicyPanelSet-date')]");

	final By SCP_FP_SSN     = By.xpath("//input[contains(@name,'FNOLWizard_PolicySearchInputSet-ssn')]");
	final By SCP_FP_Country = By.xpath("//select[contains(@name,'GlobalAddressInputSet-Country')]");
	final By SCP_FP_City    = By.xpath("//input[contains(@name,'GlobalAddressInputSet-City')]");
	final By SCP_FP_State   = By.xpath("//select[contains(@name,'GlobalAddressInputSet-State')]");
	final By SCP_FP_ZIPCode = By.xpath("//input[contains(@name,'GlobalAddressInputSet-PostalCode')]");

	final By SP_FP_Search = By.xpath("//div[contains(@id,'FNOLWizardFindPolicyPanelSet-Search')]");
	final By SP_FP_Reset  = By.xpath("//div[contains(@id,'FNOLWizardFindPolicyPanelSet-Reset')]");
	/*
	 * Policy Results
	 */
	final By SCP_FP_PR_Policy         = By.xpath("//div[contains(@id,'PolicyResultLV-0-PolicyNumber_button')]");
	final By SCP_FP_PR_Insured        = By.xpath("//div[contains(@name,'PolicyResultLV-0-Insured')]");
	final By SCP_FP_PR_EffectiveDate  = By.xpath("//div[contains(@id,'PolicyResultLV-0-Effective')]");
	final By SCP_FP_PR_ExpirationDate = By.xpath("//div[contains(@id,'PolicyResultLV-0-Expiration')]");
	final By SCP_FP_PR_Type           = By.xpath("//div[contains(@id,'PolicyResultLV-0-Type')]");

	/*
	 * New Claim
	 */

	final By SCP_NewClaim            = By.xpath("//div[contains(@class,'gw-boldLabel') and text()='New Claim']");
	final By SCP_NC_LossDate         = By.xpath("//input[contains(@name,'FNOLWizardFindPolicyPanelSet-Claim_LossDate')]");
	final By SCP_NC_Time             = By.xpath("//input[contains(@name,'FNOLWizardFindPolicyPanelSet-Claim_LossDate')]");
	final By SCP_NC_TypeOfClaim_Auto = By.xpath("//span[text()='Auto']//preceding-sibling::span/input[contains(@id,'ClaimMode_0')]");

	/*
	 * Claims History
	 */
	final By SCP_ClaimsHistory = By.xpath("//div[contains(@class,'gw-boldLabel') and text()='Claims History']");

	/*
	 * Create Unverified Policy
	 */
	final By CreateUnverifiedPolicy                  = By.xpath("//span[@class='gw-label--inner' and text()='Create Unverified Policy']/preceding-sibling::span[@class='gw-radio-wrapper']//input[contains(@name,'ScreenMode')]");
	final By CUP_PolicyNumber                        = By.xpath("//input[contains(@name,'FNOLWizardFindPolicyPanelSet-PolicyNumber')]");
	final By CUP_Type                                = By.xpath("//select[contains(@name,'FNOLWizardFindPolicyPanelSet-Type')]");
	final By CUP_TypeofClaim_Auto                    = By.xpath("//input[contains(@id,'FNOLWizardFindPolicyPanelSet-ClaimMode_0')]");
	final By CUP_TypeofClaim_Auto_AutoFirstandFinal  = By.xpath("//span[@class='gw-label--inner' and text()='Auto - Auto First and Final']/preceding-sibling::span[@class='gw-radio-wrapper']//input[contains(@name,'ClaimLossType')]");
	final By CUP_TypeofClaim_AutoAuto_QuickClaimAuto = By.xpath("//input[contains(@id,'FNOLWizardFindPolicyPanelSet-ClaimMode_2')]");
	final By CUP_LossDate                            = By.xpath("//input[contains(@name,'Claim_LossDate')]");
	final By CUP_Time                                = By.xpath("//input[contains(@name,'Claim_lossTime_time')]");
	/*
	 * Basic Information
	 */
	final By CUP_BasicInformation         = By.xpath("//div[contains(@class,'gw-boldLabel') and text()='Basic Information']");
	final By CUP_BI_PolicyNumber          = By.xpath("//div[contains(@id,'NewClaimPolicyGeneralDV-PolicyNumber') and contains(@class,'gw-ValueWidget')]//div[@class='gw-value-readonly-wrapper']");
	final By CUP_BI_Type                  = By.xpath("//div[contains(@id,'NewClaimPolicyGeneralDV-Type') and contains(@class,'gw-ValueWidget')]//div[@class='gw-label']");
	final By CUP_BI_EffectiveDate         = By.xpath("//input[contains(@name,'NewClaimPolicyGeneralDV-EffectiveDate')]");
	final By CUP_BI_ExpirationDate        = By.xpath("//input[contains(@name,'NewClaimPolicyGeneralDV-ExpirationDate')]");
	final By CUP_BI_CancellationDate      = By.xpath("//input[contains(@name,'NewClaimPolicyGeneralDV-CancellationDate')]");
	final By CUP_BI_OriginalEffectiveDate = By.xpath("//input[contains(@name,'NewClaimPolicyGeneralDV-OrigEffectiveDate')]");
	final By CUP_BI_Status                = By.xpath("//select[contains(@name,'NewClaimPolicyGeneralDV-Status')]");

	/*
	 * Insured
	 */
	final By CUP_Insured = By.xpath("//div[contains(@class,'gw-boldLabel') and text()='Insured']");

	final By CUP_Insured_SelectMenu_Button               = By.xpath("//div[contains(@id,'Insured_NameMenuIcon')]/div[@role='button']");
	final By CUP_Insured_Menu_NewPerson                  = By.xpath("//div[@class='gw-subMenu gw-open']/div[contains(@class,'gw-MenuItemWidget')]/div[@role='menuitem']//div[text()='New Person']");
	final By CUP_Insured_Menu_NewVendor                  = By.xpath("//div[@class='gw-subMenu gw-open']/div[contains(@class,'gw-MenuItemWidget')]/div[@role='menuitem']//div[text()='New Vendor']");
	final By CUP_Insured_Menu_NV_AutobodyRepairShop      = By.xpath("//div[@class='gw-subMenu gw-open']/div[contains(@class,'gw-MenuItemWidget')]/div[@role='menuitem']//div[text()='Autobody Repair Shop']");
	final By CUP_Insured_Menu_NV_AutoTowingAgency        = By.xpath("//div[@class='gw-subMenu gw-open']/div[contains(@class,'gw-MenuItemWidget')]/div[@role='menuitem']//div[text()='Auto Towing Agency']");
	final By CUP_Insured_Menu_NV_Doctor                  = By.xpath("//div[@class='gw-subMenu gw-open']/div[contains(@class,'gw-MenuItemWidget')]/div[@role='menuitem']//div[text()='Doctor']");
	final By CUP_Insured_Menu_NV_MedicalCareOrganization = By.xpath("//div[@class='gw-subMenu gw-open']/div[contains(@class,'gw-MenuItemWidget')]/div[@role='menuitem']//div[text()='Medical Care Organization']");
	final By CUP_Insured_Menu_NV_VendorCompany           = By.xpath("//div[@class='gw-subMenu gw-open']/div[contains(@class,'gw-MenuItemWidget')]/div[@role='menuitem']//div[text()='Vendor (Company)']");
	final By CUP_Insured_Menu_NewCompany                 = By.xpath("//div[@class='gw-subMenu gw-open']/div[contains(@class,'gw-MenuItemWidget')]/div[@role='menuitem']//div[text()='New Company']");
	final By CUP_Insured_Menu_NewLegal                   = By.xpath("//div[@class='gw-subMenu gw-open']/div[contains(@class,'gw-MenuItemWidget')]/div[@role='menuitem']//div[text()='New Legal']");
	final By CUP_Insured_Menu_NL_Adjudicator             = By.xpath("//div[@class='gw-subMenu gw-open']/div[contains(@class,'gw-MenuItemWidget')]/div[@role='menuitem']//div[text()='Adjudicator']");
	final By CUP_Insured_Menu_NL_Attorney                = By.xpath("//div[@class='gw-subMenu gw-open']/div[contains(@class,'gw-MenuItemWidget')]/div[@role='menuitem']//div[text()='Attorney']");
	final By CUP_Insured_Menu_NL_LawFirm                 = By.xpath("//div[@class='gw-subMenu gw-open']/div[contains(@class,'gw-MenuItemWidget')]/div[@role='menuitem']//div[text()='Law Firm']");
	final By CUP_Insured_Menu_NL_LegalVenue              = By.xpath("//div[@class='gw-subMenu gw-open']/div[contains(@class,'gw-MenuItemWidget')]/div[@role='menuitem']//div[text()='Legal Venue']");
	final By CUP_Insured_Menu_Search                     = By.xpath("//div[@class='gw-subMenu gw-open']/div[contains(@class,'gw-MenuItemWidget')]/div[@role='menuitem']//div[text()='Search']");
	final By CUP_Insured_Menu_ViewContactDetails         = By.xpath("//div[@class='gw-subMenu gw-open']/div[contains(@class,'gw-MenuItemWidget')]/div[@role='menuitem']//div[text()='View Contact Details']");

	final By CUP_NP_ThiscontactisnotlinkedtotheAddressBook = By.xpath("//div[contains(@class,'gw-boldLabel') and text()='This contact is not linked to the Address Book']");
	final By NP_Tab_Basic                                  = By.xpath("//div[contains(@id,'ContactBasicsCardTab')]//div[@role='tab']");
	final By NP_Tab_Addresses                              = By.xpath("//div[contains(@id,'ContactAddressesCardTab')]//div[@role='tab']");
	final By NP_Tab_RelatedContacts                        = By.xpath("//div[contains(@id,'ContactRelatedContactsCardTab')]//div[@role='tab']");

	final By CUP_NP_Person  = By.xpath("//div[contains(@class,'gw-boldLabel') and text()='Person']");
	final By NP_P_FirstName = By.xpath("//input[contains(@name,'GlobalPersonNameInputSet-FirstName')]");
	final By NP_P_LastName  = By.xpath("//input[contains(@name,'GlobalPersonNameInputSet-LastName')]");
	final By NP_P_TaxID     = By.xpath("//input[contains(@name,'TaxID')]");

	final By NP_Address1 = By.xpath("//input[contains(@name,'AddressLine1')]");
	final By NP_City     = By.xpath("//input[contains(@name,'City')]");
	final By NP_County   = By.xpath("//input[contains(@name,'County')]");

	final By NP_State   = By.xpath("//select[contains(@name,'GlobalAddressInputSet-State')]");
	final By NP_ZIPCode = By.xpath("//input[contains(@name,'PostalCode')]");

	/*
	 * CreateUnverifiedPolicy_AddNewVehicle
	 */
	final By CUP_ANV_AddVehicle = By.xpath("//div[contains(@id,'NewClaimVehiclesLV_tb-Add' )]//div[@role='button']");
	final By CUP_ANV_Make       = By.xpath("//input[contains(@name,'Make')]");
	final By CUP_ANV_Model      = By.xpath("//input[contains(@name,'Model')]");
	final By CUP_ANV_Year       = By.xpath("//input[contains(@name,'Year')]");

	/*
	 * NewVehicle-Coverages
	 */
	final By CUP_ANV_AddCoverages  = By.xpath("//div[contains(@id,'EditableVehicleCoveragesLV_tb-Add' )]//div[@role='button']");
	final By CUP_ANV_CoverageType  = By.xpath("//select[contains(@name,'CoverageType')]");
	final By CUP_ANV_ExposureLimit = By.xpath("//input[contains(@name,'ExposureLimit')]");
	final By CUP_ANV_IncidentLimit = By.xpath("//input[contains(@name,'IncidentLimit')]");
	final By Ok                    = By.xpath("//div[contains(@id,'Update')]");

	/*
	 * CC_NCW_Step2of5_BasicInformation_PO
	 */
	final By basicInfo_Header = By.id("FNOLWizard-FullWizardStepSet-FNOLWizard_BasicInfoScreen-ttlBar");
	final By insuredName      = By.xpath("//div[contains(@id,'Insured')]//div[@class='gw-label gw-infoValue']");
	/*
	 * BasicInfo ReportedBy
	 */
	final By BI_RB_Name = By.xpath("//select[contains(@name,'BasicInfoDetailViewPanelDV-ReportedBy_Name')]");
	/*
	 * BasicInfo InvolvedVehicles
	 */
	final By BI_IV = By.xpath("//input[contains(@name,'InsuredVehicleInputGroup-_checkbox')]");

	/*
	 * unverifiedPolicy ReportedBy
	 */
	final By BI_RB_HowReported = By.xpath("");

	/*
	 * CC_NCW_Step3of5_AddClaimInformation_PO
	 * 
	 */

	/*
	 * AddClaimInformation
	 */

	final By ADI_WhatHappened = By.xpath("//textarea[contains(@name,'LossDetailsAddressDV-Description')]");
	final By ADI_LossCause    = By.xpath("//select[contains(@name,'LossDetailsAddressDV-Claim_LossCause')]");
	final By ADI_location     = By.xpath("//select[contains(@name,'globalAddressContainer-Address_Picker')]");
	final By ADI_State        = By.xpath("//select[contains(@name,'GlobalAddressInputSet-State')]");
	final By ADI_Address1     = By.xpath("//input[contains(@name,'AddressLine1')]");

	final By addClaimInfo_Header = By.id("FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-ttlBar");

	/*
	 * DuplicateClaims
	 */
	final By DuplicateClaims_ErrorMsg = By.xpath("//div[contains(@id,'NewClaimDuplicatesScreen')]//div[@class='gw-VerbatimWidget--inner']");
	final By DuplicateClaims_Close    = By.xpath("//div[contains(@id,'CloseButton')]");

	final By dateOfEmployerNotified = By.name("FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-DateReportedtoEmployer");
	final By injuryDescription      = By.name("FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-Claim_InjuryDescription");
	final By injury                 = By.id("FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-InjurySeverity_DeathReport_0");
	final By causeOfInjury          = By.name("FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-Claim_InjuryIllnessCause");
	final By detailedInjury         = By.name("FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-Claim_DetailedInjury");
	final By medicalAttention       = By.id("FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-InjurySeverity_MedicalReport_0");
	final By areaOfBody             = By.name("FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-EditableBodyPartDetailsLV-0-PrimaryBodyPart");
	final By bodyPart               = By.name("FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-EditableBodyPartDetailsLV-0-DetailedBodyPart");
	final By ppdPercentage          = By.name("FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-EditableBodyPartDetailsLV-0-PermamentImpairmentPercentage");
	final By lostTimeFromWork       = By.id("FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-InjurySeverity_TimeLossReport_0");
	final By testClickTop           = By.id("gw-center-title-toolbar");
	final By next                   = By.id("FNOLWizard-Next");
	final By finish                 = By.id("FNOLWizard-Finish");

	/*
	 * CC_NCW_Step4of5_services
	 * 
	 */
	final By services_Header = By.xpath("//div[contains(@id,'ServicesScreen-ttlBar')]//div[@class='gw-TitleBar--title']");

	/*
	 * CC_NCW_Step5of5_saveandassign
	 * 
	 */

	final By saveandassign_Header = By.xpath("//div[contains(@id,'AssignSaveScreen-ttlBar')]//div[@class='gw-TitleBar--title']");

	/*
	 * newClaimSaved
	 */

	final By newClaimSaved_Header = By.xpath("//div[contains(@id,'NewClaimSavedScreen-ttlBar')]//div[@class='gw-TitleBar--title']");

}
