package com.pages.Guidewire.ClaimsCenter;

import org.openqa.selenium.By;

public interface CC_NewClaimWizard_PO {

	/*
	 * Buttons
	 */
	final By Ok            = By.xpath("//div[contains(@id,'Update')]/div[@role='button']");
	final By Cancel_Button = By.xpath("//div[contains(@id,'Cancel')]/div[@role='button']");
	final By Back_Button   = By.xpath("//div[contains(@id,'Prev')]/div[@role='button']");
	final By Next_Button   = By.xpath("//div[contains(@id,'Next')]/div[@role='button']");
	final By Finish_Button = By.xpath("//div[contains(@id,'Finish')]/div[@role='button']");
	final By Update_Button = By.xpath("//div[contains(@id,'CustomUpdateButton')]/div[@role='button']");

	/*
	 * CC_NCW_Step1of5_SearchorCreatePolicy
	 */
	final By NCW_SearchorCreatePolicy_Header = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and contains(text(),'Search or Create Policy')]");

	final By SP_NewVehicle = By.xpath("//div[contains(@id,'NewPolicyVehicleScreen-ttlBar')]//div[@class='gw-TitleBar--title']");

	// Find Policy
	final By SCP_FindPolicy = By.xpath("//span[text()='Find Policy']/preceding-sibling::span[@class='gw-radio-wrapper']/input[contains(@name,'FNOLWizard_FindPolicyScreen')]");

	final By SCP_FP_PolicyNumber     = By.xpath("//input[contains(@name,'policyNumber')]");
	final By SCP_FP_FirstName        = By.xpath("//input[contains(@name,'FirstName')]");
	final By SCP_FP_LastName         = By.xpath("//input[contains(@name,'LastName')]");
	final By SCP_FP_OrganizationName = By.xpath("//input[contains(@name,'GlobalContactNameInputSet-Name')]");
	final By SCP_FP_PolicyType       = By.xpath("//select[contains(@name,'PolicyType')]");
	final By SCP_FP_LossDate         = By.xpath("//input[contains(@name,'FNOLWizardFindPolicyPanelSet-date')]");

	final By SCP_FP_SSN     = By.xpath("//input[contains(@name,'FNOLWizard_PolicySearchInputSet-ssn')]");
	final By SCP_FP_Country = By.xpath("//select[contains(@name,'GlobalAddressInputSet-Country')]");
	final By SCP_FP_City    = By.xpath("//input[contains(@name,'GlobalAddressInputSet-City')]");
	final By SCP_FP_State   = By.xpath("//select[contains(@name,'GlobalAddressInputSet-State')]");
	final By SCP_FP_ZIPCode = By.xpath("//input[contains(@name,'GlobalAddressInputSet-PostalCode')]");

	final By SP_FP_Search = By.xpath("//div[contains(@id,'FNOLWizardFindPolicyPanelSet-Search')]");
	final By SP_FP_Reset  = By.xpath("//div[contains(@id,'FNOLWizardFindPolicyPanelSet-Reset')]");

	// Policy Results
	final By SCP_FP_PR_Policy         = By.xpath("//div[contains(@id,'PolicyResultLV-0-PolicyNumber_button')]");
	final By SCP_FP_PR_Insured        = By.xpath("//div[contains(@id,'PolicyResultLV-0-Insured')]");
	final By SCP_FP_PR_EffectiveDate  = By.xpath("//div[contains(@id,'PolicyResultLV-0-Effective')]");
	final By SCP_FP_PR_ExpirationDate = By.xpath("//div[contains(@id,'PolicyResultLV-0-Expiration')]");
	final By SCP_FP_PR_Type           = By.xpath("//div[contains(@id,'PolicyResultLV-0-Type')]");

	// New Claim
	final By SCP_NewClaim            = By.xpath("//div[contains(@class,'gw-boldLabel') and text()='New Claim']");
	final By SCP_NC_LossDate         = By.xpath("//input[contains(@name,'FNOLWizardFindPolicyPanelSet-Claim_LossDate')]");
	final By SCP_NC_Time             = By.xpath("//input[contains(@name,'FNOLWizardFindPolicyPanelSet-Claim_LossDate')]");
	final By SCP_NC_TypeOfClaim_Auto = By.xpath("//span[text()='Auto']//preceding-sibling::span/input[contains(@id,'ClaimMode_0')]");

	// Claims History
	final By SCP_ClaimsHistory = By.xpath("//div[contains(@class,'gw-boldLabel') and text()='Claims History']");

	/*
	 * Step 2 of 5: Basic information
	 */
	final By NCW_BasicInformation_Header = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and text()='Step 2 of 5: Basic information']");

	// ReportedBy
	final By BI_ReportedBy           = By.xpath("//div[contains(@class,'gw-boldLabel') and text()='Reported By']");
	final By BI_RB_HowReported       = By.xpath("//select[contains(@name,'HowReported')]");
	final By BI_RB_Name              = By.xpath("//select[contains(@name,'-ReportedBy_Name')]");
	final By BI_RB_RelationtoInsured = By.xpath("//select[contains(@name,'-Claim_ReportedByType')]");
	final By BI_RB_DateofNotice      = By.xpath("//input[contains(@name,'-Notification_ReportedDate')]");

	// Verify Date of Birth
	final By BI_VerifyDateofBirth = By.xpath("//div[contains(@class,'gw-boldLabel') and text()='Verify Date of Birth']");
	final By BI_VDOB_DateofBirth  = By.xpath("//div[contains(@id,'DOB')]//div[@class='gw-value-readonly-wrapper']");

	// Confirm Contact Info
	final By BI_ConfirmContactInfo = By.xpath("//div[contains(@class,'gw-boldLabel') and text()='Confirm Contact Info']");
	final By BI_CCI_Address        = By.xpath("//div[contains(@id,'reporter_Address')]//div[@class='gw-value-readonly-wrapper']");
	final By BI_CCI_WorkPhone      = By.xpath("//input[contains(@name,'reporter_businessphone')]");
	final By BI_CCI_HomePhone      = By.xpath("//input[contains(@name,'reporter_homephone')]");
	final By BI_CCI_Mobile         = By.xpath("//input[contains(@name,'reporter_mobile')]");
	final By BI_CCI_Email          = By.xpath("//input[contains(@name,'reporter_email')]");
	final By BI_CCI_PrimaryPhone   = By.xpath("//select[contains(@name,'-reporter_primarytype')]");

	// Insured
	final By BI_Insured        = By.xpath("//div[contains(@class,'gw-boldLabel') and text()='Insured']");
	final By BI_I_Name         = By.xpath("//div[contains(@id,'Insured_Name_button')]");
	final By BI_I_Address      = By.xpath("//div[contains(@id,'Insured_Address')]//div[@class='gw-value-readonly-wrapper']");
	final By BI_I_PrimaryPhone = By.xpath("//div[contains(@id,'Insured_WorkPhone')]//div[@class='gw-value-readonly-wrapper']");

	// Main Contact
	final By BI_MainContact                   = By.xpath("//div[contains(@class,'gw-boldLabel') and text()='Main Contact']");
	final By BI_MC_SamePerson_SameAsReporter  = By.xpath("//span[text()='Same as reporter']/preceding-sibling::span/input[@type='radio']");
	final By BI_MC_SamePerson_Differentperson = By.xpath("//span[text()='Different person']/preceding-sibling::span/input[@type='radio']");
	final By BI_MC_Name                       = By.xpath("//select[contains(@name,'MainContact_Name')]");
	final By BI_MC_RelationtoInsured          = By.xpath("//select[contains(@name,'Claim_MainContactType')]");

	// Involved Vehicle
	final By BI_InvolvedVehicle = By.xpath("//div[contains(@class,'gw-boldLabel') and text()='Involved Vehicle(s)']");
	final By BI_IV_Select       = By.xpath("//div[@role='heading' and text()='2000 Acura TX']/preceding-sibling::div//input[@type='checkbox']");

	/*
	 * Step 3 of 5: Add claim information
	 */

	final By AddClaimInformation_Header = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and text()='Step 3 of 5: Add claim information']");

	final By ACI_WhatHappened        = By.xpath("//textarea[contains(@name,'LossDetailsAddressDV-Description')]");
	final By AI_LossDate             = By.xpath("//select[contains(@name,'LossDetailsAddressDV-Claim_LossCause')]");
	final By ACI_LossCause           = By.xpath("//select[contains(@name,'LossDetailsAddressDV-Claim_LossCause')]");
	final By ACI_IncidentOnly        = By.xpath("//input[contains(@name,'LossDetailsAddressDV-IncidentOnly')]");
	final By ACI_Location            = By.xpath("//select[contains(@name,'globalAddressContainer-Address_Picker')]");
	final By ACI_Country             = By.xpath("//select[contains(@name,'GlobalAddressInputSet-Country')]");
	final By ACI_State               = By.xpath("//select[contains(@name,'GlobalAddressInputSet-State')]");
	final By ACI_Address1            = By.xpath("//input[contains(@name,'GlobalAddressInputSet-AddressLine1')]");
	final By ACI_Address2            = By.xpath("//input[contains(@name,'GlobalAddressInputSet-AddressLine2')]");
	final By ACI_Address3            = By.xpath("//input[contains(@name,'GlobalAddressInputSet-AddressLine3')]");
	final By ACI_City                = By.xpath("//input[contains(@name,'GlobalAddressInputSet-County')]");
	final By ACI_County              = By.xpath("//input[contains(@name,'GlobalAddressInputSet-County')]");
	final By ACI_ZIPCode             = By.xpath("//input[contains(@name,'GlobalAddressInputSet-PostalCode')]");
	final By ACI_LocationDescription = By.xpath("//input[contains(@name,'Address_Description')]");
	final By ACI_LocationCode        = By.xpath("//input[contains(@name,'Claim_LocationCode')]");
	final By ACI_Jurisdiction        = By.xpath("//select[contains(@name,'Claim_JurisdictionState')]");

	// VehiclesPeopleProperty
	final By ACI_VehiclesPeopleProperty = By.xpath("//div[@class='gw-TitleBar--title' and @role='heading' and text()='Vehicles, People, & Property']");
	final By ACI_AddVehicle             = By.xpath("//div[contains(@id,'AddVehicleButton')]/div[@role='button']");
	final By ACI_AddPedestrian          = By.xpath("//div[contains(@id,'AddPedestrianButton')]/div[@role='button']");
	final By ACI_AddPropertyDamage      = By.xpath("//div[contains(@id,'AddPropertyDamageButton')]/div[@role='button']");

	// Involved Vehicles
	final By Services_InvolvedVehicles = By.xpath("//div[@class='gw-TitleBar--title' and @role='heading' and text()='Involved Vehicles']");

	final By ACI_AttheScene     = By.xpath("//div[@class='gw-TitleBar--title' and @role='heading' and text()='At the Scene']");
	final By ACI_Categorization = By.xpath("//div[@class='gw-TitleBar--title' and @role='heading' and text()='Categorization']");

	/*
	 * CC_NCW_Step4of5_services
	 * 
	 */
	final By Services_Header = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and text()='Step 4 of 5: Services']");

	/*
	 * CC_NCW_Step5of5_saveandassign
	 * 
	 */
	final By SaveAndAssignClaim_Header = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and text()='Step 5 of 5: Save and Assign Claim']");
	// Assignment
	final By SAC_Assignment                         = By.xpath("//div[contains(@class,'gw-boldLabel') and text()='Assignment']");
	final By SAC_A_CommonAssign                     = By.xpath("//div[contains(@id,'CommonAssignChoice')]//div[@role='radio']");
	final By SAC_A_AssignclaimExposuresto           = By.xpath("//select[contains(@name,'CommonAssign')]");
	final By SAC_A_IndividualAssign                 = By.xpath("//div[contains(@id,'IndividualAssignChoice')]//div[@role='radio']");
	final By SAC_A_AssignClaimExposuresIndividually = By.xpath("//select[contains(@name,'ClaimAssign')]");
	// Exposures
	final By SAC_Exposures = By.xpath("//div[contains(@class,'gw-boldLabel') and text()='Exposures']");

	/*
	 * newClaimSaved
	 */
	final By NewClaimSaved_Header       = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and text()='New Claim Saved']");
	final By NCS_ClaimSaved             = By.xpath("//div[contains(@id,'NewClaimSavedDV-Header')]/div[contains(@class,'gw-boldLabel') and contains(text(),'has been successfully saved')]");
	final By NCS_AssignedGroup          = By.xpath("//div[contains(@id,'NewClaimSavedDV-AssignedGroup_Input')]//div[@class='gw-value-readonly-wrapper' and contains(text(),'Assigned Group:')]");
	final By NCS_AssignedUser           = By.xpath("//div[contains(@id,'NewClaimSavedDV-AssignedUser_Input')]//div[@class='gw-value-readonly-wrapper' and contains(text(),'Assigned User:')]");
	final By NCS_ViewtheNewlySavedClaim = By.xpath("//div[contains(@id,'GoToClaim') and contains(@class,'gw-ValueWidget')]//div[@class='gw-action']");
	final By NCS_CreateAnotherNewClaim  = By.xpath("//div[contains(@id,'CreateNewClaim') and contains(@class,'gw-ValueWidget')]//div[@class='gw-action']");
	final By NCS_AddReservesNewClaim    = By.xpath("//div[contains(@id,'CreateReserve') and contains(@class,'gw-ValueWidget')]//div[@class='gw-action']");
	final By NCS_MakePaymentNewClaim    = By.xpath("//div[contains(@id,'CreatePayment') and contains(@class,'gw-ValueWidget')]//div[@class='gw-action']");

	/*
	 * AutoFirstandFinal
	 */
	final By AutoFirstandFinal_Header = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and text()='Step 2 of 2: Auto First and Final']");

	// Damage
	final By AFF_Damage_LossDescription = By.xpath("//textarea[contains(@name,'Description')]");

	// Claimant
	final By AFF_Name                  = By.xpath("//select[contains(@name,'FirstAndFinalScreenInsuredClaimant')]");
	final By AFF_Claimant_Name         = By.xpath("//select[contains(@name,'Claimant_Picker')]");
	final By AFF_Repair                = By.xpath("//div[contains(@id,'RepairShop_PickerMenuIcon')]//div[@class='gw-action--expand-button']");
	final By AFF_NewAutobodyRepairShop = By.xpath("//div[contains(@id,'RepairShop_PickerMenuIcon')]//div[contains(@id,'AutoRepairShop')]//div[@class='gw-label']");

	final By Location = By.xpath("//select[contains(@name,'Address_Picker')]");
	final By State    = By.xpath("//div[contains(@id,'AutoFirstAndFinalScreen-22')]//select[contains(@name,'GlobalAddressInputSet-State')]");

	final By AFF_AutoRepairShop_Name  = By.xpath("//input[contains(@name,'Name')]");
	final By AFF_AutoRepairShop_TaxID = By.xpath("//input[contains(@name,'ContactBasicsDV-V_EIN')]");

	final By AFF_AutoRepairShop_Address1 = By.xpath("//input[contains(@name,'AddressLine1')]");
	final By AFF_AutoRepairShop_City     = By.xpath("//input[contains(@name,'City')]");
	final By AFF_AutoRepairShop_County   = By.xpath("//input[contains(@name,'County')]");
	final By AFF_AutoRepairShop_State    = By.xpath("//select[contains(@name,'GlobalAddressInputSet-State')]");
	final By AFF_AutoRepairShop_ZIPCode  = By.xpath("//input[contains(@name,'PostalCode')]");

	final By AFF_Financials_Name      = By.xpath("//select[contains(@name,'FNOLWizardCheckDV-Payee_Picker')]");
	final By AFF_Financials_PayeeType = By.xpath("//select[contains(@name,'FNOLWizardCheckDV-PayeeRole')]");

	final By AFF_Financials_Amount = By.xpath("//input[contains(@name,'CheckAmount')]");
	final By AFF_Financials_State  = By.xpath("//div[contains(@id,'FNOLWizardCheckDV')]//select[contains(@name,'GlobalAddressInputSet-State')]");

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

	/*
	 * Select Policy
	 */
	final By SelectPolicy    = By.xpath("//div[contains(@id,'SelectPolicyButton')]//div[@role='button']");
	final By SP_PolicyNumber = By.xpath("//input[contains(@name,'PolicyNumber')]");
	final By SP_Search       = By.xpath("//div[contains(@id,'SearchLinksInputSet-Search')]");
	final By SP_Select       = By.xpath("//div[contains(@id,'PolicySearchResultLV-0-_Select')]");
	/*
	 * DuplicateClaims
	 */
	final By DuplicateClaims_Header            = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading'  and text()='Duplicate Claims']");
	final By DC_PossibleDuplicateClaims_Header = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading'  and text()='Possible Duplicate Claims']");
	final By DC_Possibleduplicateclaimsfound   = By.xpath("//div[contains(@id,'NewClaimDuplicatesScreen')]//div[@class='gw-VerbatimWidget--inner']");
	final By DC_Close                          = By.xpath("//div[contains(@id,'CloseButton')]");
	/*
	 * services Rental
	 */
	final By Assign_Button = By.xpath("//div[contains(@id,'AssignmentPopupScreen_ButtonButton')]//div[@role='button']");

	final By NewAutoRepairShop_Header = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading']");

	/*
	 * SearchRepairShop
	 */
	final By SearchRepairShop         = By.xpath("//div[contains(@id,'RepairShop_PickerMenuIcon')]//div[contains(@id,'MenuItem_Search')]//div[@class='gw-label']");
	final By SearchAddressBook_Header = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading']");
	final By SearchAddressBook_Type   = By.xpath("//select[contains(@name,'ContactSubtype')]");
	final By SearchAddressBook_Name   = By.xpath("//input[contains(@name,'GlobalContactNameInputSet-Name')]");
	final By SearchAddressBook_Search = By.xpath(" //div[contains(@id,'SearchLinksInputSet-Search')]");

	final By QuickClaimAuto_Header = By.xpath("//div[contains(@id,'NewQuickClaimScreen-ttlBar')]//div[@class='gw-TitleBar--title']");
	/*
	 * QuickClaimAuto
	 */
	final By QCA_ReportedBy_Name       = By.xpath("//select[contains(@name,'ReportedBy_Name')]");
	final By QCA_LossDetails_LossCause = By.xpath("//select[contains(@name,'LossCause')]");
	final By QCA_LossDetails_State     = By.xpath("//select[contains(@name,'GlobalAddressInputSet-State')]");
	final By QCA_Location              = By.xpath("//select[contains(@name,'Address_Picker')]");

	final By PolicyGeneral_Header          = By.xpath("//div[contains(@id,'NewClaimSavedScreen-ttlBar')]//div[@class='gw-TitleBar--title']");
	final By SelectPolicy_Header           = By.xpath("//div[contains(@id,'NewClaimSavedScreen-ttlBar')]//div[@class='gw-TitleBar--title']");
	final By Assign_Header                 = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and text()='Assign']");
	final By FinancialsTransactions_Header = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and text()='Financials: Transactions']");
	final By SP_Header                     = By.xpath("//div[@id='FNOLWizard-FNOLWizard_FindPolicyScreen-ttlBar']//div[@class='gw-TitleBar--title']");
	final By Summary_Header                = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and text()='Summary']");

}
