package com.pages.Guidewire.ClaimsCenter;

import org.openqa.selenium.By;

public interface CC_NewClaimWizard_PO {

    /*
     * Buttons
     */
    final By Ok = By.xpath("//div[contains(@id,'Update')]/div[@role='button']");
    final By Cancel_Button = By.xpath("//div[contains(@id,'Cancel')]/div[@role='button']");
    final By Back_Button = By.xpath("//div[contains(@id,'Prev')]/div[@role='button']");
    final By Next_Button = By.xpath("//div[contains(@id,'Next')]/div[@role='button']");
    final By Finish_Button = By.xpath("//div[contains(@id,'Finish')]/div[@role='button']");
    final By Update_Button = By.xpath("//div[contains(@id,'CustomUpdateButton')]/div[@role='button']");

    /*
    Unsaved Work
     */

    final By NewClaimWizard = By.xpath("//div[contains(@id,'UnsavedWorkTabBarLink')]//div[@class='gw-label']");

    /*

     * CC_NCW_Step1of5_SearchorCreatePolicy
     */
    final By NCW_SearchorCreatePolicy_Header = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and contains(text(),'Search or Create Policy')]");

    final By SP_NewVehicle = By.xpath("//div[contains(@id,'NewPolicyVehicleScreen-ttlBar')]//div[@class='gw-TitleBar--title']");

    // Find Policy
    final By SCP_FindPolicy = By.xpath("//span[text()='Find Policy']/preceding-sibling::span[@class='gw-radio-wrapper']/input[contains(@name,'FNOLWizard_FindPolicyScreen')]");

    final By SCP_FP_PolicyNumber = By.xpath("//input[contains(@name,'policyNumber')]");
    final By SCP_FP_FirstName = By.xpath("//input[contains(@name,'FirstName')]");
    final By SCP_FP_LastName = By.xpath("//input[contains(@name,'LastName')]");
    final By SCP_FP_OrganizationName = By.xpath("//input[contains(@name,'GlobalContactNameInputSet-Name')]");
    final By SCP_FP_PolicyType = By.xpath("//select[contains(@name,'PolicyType')]");
    final By SCP_FP_LossDate = By.xpath("//input[contains(@name,'FNOLWizardFindPolicyPanelSet-date')]");
    final By SCP_FP_PolicyFromEDW = By.xpath("//input[contains(@id,'IncludeEDW_0')]");

    final By NCW_SearchorCreatePolicy_PolicyNumber = By.xpath("//div[contains(@id,'PolicyNumber')]//div[@class='gw-value-readonly-wrapper']");
    final By NCW_SearchorCreatePolicy_Type = By.xpath("//div[contains(@id,'NewClaimPolicyGeneralDV-Type')]//div[@class='gw-RangeValue']/div[@class='gw-label']");

    final By SCP_FP_SSN = By.xpath("//input[contains(@name,'FNOLWizard_PolicySearchInputSet-ssn')]");
    final By SCP_FP_Country = By.xpath("//select[contains(@name,'GlobalAddressInputSet-Country')]");
    final By SCP_FP_City = By.xpath("//input[contains(@name,'GlobalAddressInputSet-City')]");
    final By SCP_FP_State = By.xpath("//select[contains(@name,'GlobalAddressInputSet-State')]");
    final By SCP_FP_ZIPCode = By.xpath("//input[contains(@name,'GlobalAddressInputSet-PostalCode')]");

    final By SP_FP_Search = By.xpath("//div[contains(@id,'FNOLWizardFindPolicyPanelSet-Search')]");
    final By SP_FP_Reset = By.xpath("//div[contains(@id,'FNOLWizardFindPolicyPanelSet-Reset')]");

    // Policy Results
    final By SCP_FP_PR_Policy = By.xpath("//div[contains(@id,'PolicyResultLV-0-PolicyNumber_button')]");
    final By SCP_FP_PR_Insured = By.xpath("//div[contains(@id,'PolicyResultLV-0-Insured')]");
    final By SCP_FP_PR_EffectiveDate = By.xpath("//div[contains(@id,'PolicyResultLV-0-Effective')]");
    final By SCP_FP_PR_ExpirationDate = By.xpath("//div[contains(@id,'PolicyResultLV-0-Expiration')]");
    final By SCP_FP_PR_Type = By.xpath("//div[contains(@id,'PolicyResultLV-0-Type')]");

    // New Claim
    final By SCP_NewClaim = By.xpath("//div[contains(@class,'gw-boldLabel') and text()='New Claim']");
    final By SCP_NC_MigratedClaim = By.xpath("//input[contains(@id,'FNOLWizardFindPolicyPanelSet-MigratedClaim_0')]");
    final By SCP_NC_PreExistingClaimNumber = By.xpath("//input[contains(@name,'FNOLWizardFindPolicyPanelSet-PreExistingClaim')]");
    final By SCP_NC_LossDate = By.xpath("//input[contains(@name,'FNOLWizardFindPolicyPanelSet-Claim_LossDate')]");
    final By SCP_NC_Time = By.xpath("//input[contains(@name,'FNOLWizardFindPolicyPanelSet-Claim_lossTime_time')]");
    final By SCP_NC_TypeOfClaim_Auto = By.xpath("//span[text()='Auto']//preceding-sibling::span/input[contains(@id,'ClaimMode_0')]");

    // Claims History
    final By SCP_ClaimsHistory = By.xpath("//div[contains(@class,'gw-boldLabel') and text()='Claims History']");
    final By ClaimHistoryClaimtans_Headers = By.xpath("//tr[contains(@id,'otherClaimLV-3')]/td[@role='columnheader']");
    final By Claimants = By.xpath("//div[contains(@id,'otherClaimLV-0-Claimants_Ext')]//div[@class='gw-value-readonly-wrapper']");
    /*
     * Step 2 of 5: Basic information
     */
    final By NCW_BasicInformation_Header = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and text()='Step 2 of 4: Basic information']");

    // ReportedBy
    final By BI_ReportedBy = By.xpath("//div[contains(@class,'gw-boldLabel') and text()='Reported By']");
    final By BI_RB_HowReported = By.xpath("//select[contains(@name,'HowReported')]");
    final By BI_RB_Name = By.xpath("//select[contains(@name,'-ReportedBy_Name')]");
    final By BI_RB_RelationtoInsured = By.xpath("//select[contains(@name,'-Claim_ReportedByType')]");
    final By BI_RB_DateReported = By.xpath("//input[contains(@name,'Claim_ReportedDate_Ext')]");

    final By ReportedBy = By.xpath("//div[contains(@id,'ReportedBy_NameMenuIcon')]/div[@role='button']");
    final By ReportedBy_NewPerson = By.xpath("//div[contains(@id,'NewPersonMenuItem')]//div[@class='gw-label']");
    final By RBNewPerson_Header = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and text()='New Person']");
    final By NewCompany_Header = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and text()='New Company']");

    final By RBNewPerson_Firstname = By.xpath("//input[contains(@name,'FirstName')]");
    final By RBNewPerson_Middlename = By.xpath("//input[contains(@name,'MiddleName')]");
    final By RBNewPerson_Lastname = By.xpath("//input[contains(@name,'LastName')]");
    final By CompanyName = By.xpath("//input[contains(@name,'GlobalContactNameInputSet-Name')]");


    // Verify Date of Birth
    final By BI_VerifyDateofBirth = By.xpath("//div[contains(@class,'gw-boldLabel') and text()='Verify Date of Birth']");
    final By BI_VDOB_DateofBirth = By.xpath("//div[contains(@id,'DOB')]//div[@class='gw-value-readonly-wrapper']");

    //Renamed Date Reported
    final By BI_RB_RenamedDateReported = By.xpath("//div[contains(@id,'Notification_ReportedDate_Input')]//div[@class='gw-label' and text()='Date Reported']");

    // error message mandatory for date reported
    final By BI_DateReportedMandatoryErrorMsg = By.xpath("//div[contains(@id,'FNOLWizard_FindPolicyScreen-_msgs')]//div[@class='gw-message'  and contains(text(),'Reported Date : Missing required')]");
    // Confirm Contact Info
    final By BI_ConfirmContactInfo = By.xpath("//div[contains(@class,'gw-boldLabel') and text()='Confirm Contact Info']");
    final By BI_CCI_Address = By.xpath("//div[contains(@id,'reporter_Address')]//div[@class='gw-value-readonly-wrapper']");
    final By BI_CCI_WorkPhone = By.xpath("//input[contains(@name,'reporter_businessphone')]");
    final By BI_CCI_HomePhone = By.xpath("//input[contains(@name,'reporter_homephone')]");
    final By BI_CCI_Mobile = By.xpath("//input[contains(@name,'reporter_mobile')]");
    final By BI_CCI_Email = By.xpath("//input[contains(@name,'reporter_email')]");
    final By BI_CCI_PrimaryPhone = By.xpath("//select[contains(@name,'-reporter_primarytype')]");

    // Insured
    final By BI_Insured = By.xpath("//div[contains(@class,'gw-boldLabel') and text()='Insured']");
    final By BI_I_Name = By.xpath("//div[contains(@id,'Insured_Name_button')]");
    final By BI_I_Address = By.xpath("//div[contains(@id,'Insured_Address')]//div[@class='gw-value-readonly-wrapper']");
    final By BI_I_PrimaryPhone = By.xpath("//div[contains(@id,'Insured_WorkPhone')]//div[@class='gw-value-readonly-wrapper']");

    // Main Contact
    final By BI_MainContact = By.xpath("//div[contains(@class,'gw-boldLabel') and text()='Main Contact']");
    final By BI_MC_SamePerson_SameAsReporter = By.xpath("//span[text()='Same as reporter']/preceding-sibling::span/input[@type='radio']");
    final By BI_MC_SamePerson_Differentperson = By.xpath("//span[text()='Different person']/preceding-sibling::span/input[@type='radio']");
    final By BI_MC_Name = By.xpath("//select[contains(@name,'MainContact_Name')]");
    final By BI_MC_RelationtoInsured = By.xpath("//select[contains(@name,'Claim_MainContactType')]");

    // Involved Vehicle
    final By BI_InvolvedVehicle = By.xpath("//div[contains(@class,'gw-boldLabel') and text()='Involved Vehicle(s)']");
    final By BI_IV_Select = By.xpath("//div[@role='heading' and text()='2000 Acura TX']/preceding-sibling::div//input[@type='checkbox']");

    /*
     * Step 3 of 5: Add claim information
     */

    final By AddClaimInformation_Header = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and text()='Step 3 of 4: Add claim information']");

    final By ACI_WhatHappened = By.xpath("//textarea[contains(@name,'Description')]");
    final By ACI_WhatHappenedError = By.xpath("//div[contains(@id,'NewLossDetailsScreen-_msgs')]//div[contains(text(),'What Happened?')]");
    final By ACI_FirstNoticeSuitError = By.xpath("//div[contains(@id,'NewLossDetailsScreen-_msgs')]//div[contains(text(),'First Notice Suit?')]");

    final By ACI_ReportedDate = By.xpath("//div[contains(@id,'ReportedDate_Ext')]//div[@class='gw-value-readonly-wrapper']");
    final By ACI_LossDate = By.xpath("//div[contains(@id,'Claim_LossDate')]//div[@class='gw-value-readonly-wrapper']");
    final By ACI_LineofBusiness = By.xpath("//div[contains(@id,'Claim_LOBCode') and contains(@class,'TypeKeyValueWidget')]//div[@class='gw-label']");
    final By ACI_PrimaryLossCause = By.xpath("//div[contains(@id,'Primary_LossCause_Ext')]//div[@class='gw-label']");
    final By ACI_SecondaryLossCause = By.xpath("//div[contains(@id,'Secondary_LossCause_Ext')]//div[@class='gw-label']");
    final By ACI_PrimaryLossCauseSelect = By.xpath("//select[contains(@name,'Primary_LossCause')]");
    final By ACI_SecondaryLossCauseSecect = By.xpath("//select[contains(@name,'Secondary_LossCause')]");
    final By ACI_PrimaryLossCause1 = By.xpath("//div[contains(@id,'Primary_LossCause_Ext_Input')]//div[@class='gw-label']");
    final By ACI_SecondaryLossCause1 = By.xpath("//div[contains(@id,'Secondary_LossCause_Ext_Input')]//div[@class='gw-label']");
    final By ACI_PrimaryLossCauseError = By.xpath("//div[contains(@id,'NewLossDetailsScreen-_msgs')]");
    final By ACI_SecondaryLossCauseError = By.xpath("//div[contains(@id,'NewLossDetailsScreen-_msgs')]");
    final By ACI_LossDate2 = By.xpath("//select[contains(@name,'LossDetailsAddressDV-Claim_LossCause')]");
    final By ACI_LossCause = By.xpath("//select[contains(@name,'LossCause')]");
    final By ACI_AllegedCause = By.xpath("//select[contains(@name,'Primary_LossCause_Ext')]");
    final By ACI_DetailedCause = By.xpath("//select[contains(@name,'Secondary_LossCause_Ext')]");
    final By ACI_LOB = By.xpath("//select[contains(@name,'Claim_LOBCode')]");
    final By ACI_LOBProfLiability = By.xpath("//div[contains(@id,'Claim_LOBCode')]//div[@class='gw-label' and text()='Professional Liability']");
    final By ACI_LOBPollutionLiability = By.xpath("//div[contains(@id,'Claim_LOBCode')]//div[@class='gw-label' and text()='Pollution Liability']");
    final By ACI_DefaultLOB = By.xpath("//div[contains(@id,'LiabilityDV-Claim_LOBCode')]//div[@class='gw-RangeValue']");
    final By ACI_NoticeOnly_Yes = By.xpath("//input[contains(@id,'Status_IncidentReport_0')]");
    final By ACI_NoticeOnly_No = By.xpath("//input[contains(@id,'Status_IncidentReport_1')]");
    final By ACI_BordereauReport_Yes = By.xpath("//input[contains(@id,'BordereauReport_0')]");
    final By ACI_BordereauReport_No = By.xpath("//input[contains(@id,'BordereauReport_1')]");
    final By ACI_FirstNoticeSuit_Yes = By.xpath("//input[contains(@id,'FirstNoticeSuit_0')]");
    final By ACI_FirstNoticeSuit_No = By.xpath("//input[contains(@id,'FirstNoticeSuit_1')]");

    // Loss Location
    final By ACI_LossLocation = By.xpath("//div[contains(@class,'gw-boldLabel') and contains(text(),'Loss Location')]");
    final By ACI_PrimaryLocation = By.xpath("//div[contains(@id,'PrimaryLocationChoice_Choice')]//div[@role='radio']");
    final By ACI_OtherLocation = By.xpath("//div[contains(@id,'OtherLocationChoice_Choice')]//div[@role='radio']");
    final By ACI_LossLocationError = By.xpath("//div[contains(@id,'NewLossDetailsScreen-_msgs')]//div[contains(text(),'Loss Location')]");
    final By AI_NoticeOnlyField = By.xpath("//div[contains(@id,'IncidentReport_Input')]//div[@class='gw-label']");
    final By AI_BordereauReportField = By.xpath("//div[contains(@id,'BordereauReport_Input')]//div[@class='gw-label']");
    final By AI_LossDateField = By.xpath("//div[contains(@id,'Claim_LossDate_Input')]//div[@class='gw-label']");
    final By ACI_IncidentOnly = By.xpath("//input[contains(@name,'LossDetailsAddressDV-IncidentOnly')]");
    final By ACI_Location = By.xpath("//select[contains(@name,'globalAddressContainer-Address_Picker')]");
    final By ACI_Country = By.xpath("//select[contains(@name,'GlobalAddressInputSet-Country')]");
    final By ACI_State = By.xpath("//select[contains(@name,'GlobalAddressInputSet-State')]");
    final By ACI_Address1 = By.xpath("//input[contains(@name,'GlobalAddressInputSet-AddressLine1')]");
    final By ACI_Address2 = By.xpath("//input[contains(@name,'GlobalAddressInputSet-AddressLine2')]");
    final By ACI_Address3 = By.xpath("//input[contains(@name,'GlobalAddressInputSet-AddressLine3')]");
    final By ACI_City = By.xpath("//input[contains(@name,'GlobalAddressInputSet-City')]");
    final By ACI_County = By.xpath("//input[contains(@name,'GlobalAddressInputSet-County')]");
    final By ACI_ZIPCode = By.xpath("//input[contains(@name,'GlobalAddressInputSet-PostalCode')]");
    final By ACI_LocationDescription = By.xpath("//input[contains(@name,'Address_Description')]");
    final By ACI_LocationCode = By.xpath("//input[contains(@name,'Claim_LocationCode')]");
    final By ACI_Jurisdiction = By.xpath("//select[contains(@name,'Claim_JurisdictionState')]");
    final By ACI_ADDClaiminfo_Cancel = By.xpath("//div[@id='FNOLWizard-Cancel']//div[@role='button']");

    //Add Claim Info Liability General Damage
    final By ACI_Liability_AddInjury = By.xpath("//div[contains(@id,'AddInjuryButton')]//div[@role='button']");
    final By ACI_Liability_AddInjuryGeneralInjuryType = By.xpath("//select[contains(@name,'InjuryIncidentInputSet-PrimaryInjuryType')]");
    final By ACI_Liability_AddInjuryDetailedInjury = By.xpath("//select[contains(@name,'InjuryIncidentInputSet-DetailedInjuryType')]");
    final By ACI_Liability_AddGeneralDamageButton = By.xpath("//div[contains(@id,'AddGeneralDamageButton')]//div[@role='button']");
    final By ACI_Liability_NewGeneralDamageHeader = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading']");
    final By ACI_Liability_GeneralDamageOwnerLossPartySection = By.xpath("//div[contains(@id,'Owner_Picker_Input')]//div[@class='gw-label' and text()='Owner/Loss Party']");
    final By ACI_Liability_OwnerLossPartyError = By.xpath("//div[contains(@id,'DamageIncident_ExtPopup-_msgs')]//div[@class='gw-message' and contains(text(),'Owner/Loss Party')]");
    final By ACI_LiabilityContactPickerButton = By.xpath("//div[contains(@id,'Picker-Owner_PickerMenuIcon')]/div[@role='button']");
    final By ACI_LiabilityContactPicker = By.xpath("//div[contains(@id,'Owner_Picker')]/div[@role='menuitem']");
    final By ACI_LiabilityContactNewPerson = By.xpath("//div[contains(@id,'NewPersonMenuItem')]//div[@role='menuitem']");
    final By ACI_LiabilityLossParty = By.xpath("//select[contains(@name,'GeneralDamageIncident_ExtDV-Owner_Picker')]");
    final By ACI_LiabilityContactNewCompany = By.xpath("//div[contains(@id,'NewCompanyMenuItem')]//div[@role='menuitem']");
    final By ACI_LiabilityContactDetails = By.xpath("//div[contains(@id,'MenuItem_ViewDetails')]//div[@role='menuitem']");
    final By ACI_LiabilitySeverity = By.xpath("//select[contains(@name,'GeneralDamageIncident_ExtDV-Severity')]");
    final By ACI_LiabilitySeverityErrorMsg = By.xpath("//div[contains(@id,'NewGeneralDamageIncident_ExtPopup-_msgs')]//div[@class='gw-message']");
    final By ACI_LiabilityDamageDescription = By.xpath("//textarea[contains(@name,'ExtDV-DamageDescription_Ext')]");
   // final By ACI_LiabilitySeverityErrorMsg = By.xpath("//div[contains(@id,'NewGeneralDamageIncident_ExtPopup-_msgs')]//div[@class='gw-message']");

    //Add Claim Info Liability Property Incident
    final By ACI_LiabilityPropertyDamageButton = By.xpath("//div[contains(@id,'AddPropertyDamageButton')]//div[@role='button']");
    final By ACI_LiabilityPropertyDamageLossPartySection = By.xpath("//div[contains(@id,'Owner_Input')]//div[@class='gw-label' and text()='Owner/Loss Party']");
    final By ACI_LiabilityPropertyDamageContactPickerButton = By.xpath("//div[contains(@id,'Owner-OwnerMenuIcon')]/div[@role='button']");
    final By ACI_LiabilityPropertyDamageContactPicker = By.xpath("//div[contains(@id,'FixedPropertyIncidentDV-Owner')]/div[@role='menuitem']");

    //Add Claim Info Liability Vehicle Incident
    final By ACI_LiabilityAddVehicleButton = By.xpath("//div[contains(@id,'AddVehicleButton_Ext')]//div[@role='button']");
    final By ACI_LiabilityAddVehicleLossParty = By.xpath("//select[contains(@name,'VehicleIncidentDV-LossParty')]");
    final By ACI_LiabilityAddVehicleContactPickerButton = By.xpath("//div[contains(@id,'Owner_PickerMenuIcon')]/div[@role='button']");
    final By ACI_LiabilityAddVehicleContactPicker = By.xpath("//div[contains(@id,'VehicleIncidentDV-Owner_Picker')]/div[@role='menuitem']");


    //Parties Involved
    final By ACI_PartiesInvolvedName = By.xpath("//div[contains(@id,'NewClaimPeopleInvolvedDetailedLV-0')]//div[@role='button']");

    //Incident ,Bodily,Property,General
    final By ACI_BodilyInjury = By.xpath("//div[contains(@id,'AddInjuryButton')]//div[@role='button']");
    final By Incident_firstname = By.xpath("//input[contains(@name,'PersonNameInputSet-FirstName')]");
    final By Incident_lastname = By.xpath("//input[contains(@name,'PersonNameInputSet-LastName')]");

    //Injuries
    final By ACI_Injuries = By.xpath("//div[contains(@class,'gw-boldLabel') and text()='Injuries']");
    final By Incident_Lossparty = By.xpath("//select[contains(@name,'LossParty')]");
    final By Incident_PartyType = By.xpath("//select[contains(@name,'ContactDV-ClaimContactPerson')]");
    final By Incident_DetailedInjuryType = By.xpath("//select[contains(@name,'DetailedInjuryType')]");

    final By ACI_AddGeneralDamge = By.xpath("//div[contains(@id,'AddGeneralDamageButton_Ext')]/div[@role='button']");
    final By NewGeneralDamageIncident = By.xpath("//div[@class='gw-TitleBar--title' and @role='heading' and text()='New General Damage Incident']");
    final By NGDI_LossParty_Picker = By.xpath("//div[contains(@id,'Owner_PickerMenuIcon')]/div[@role='button']");
    final By NGDI_LossParty_Picker_NewPerson = By.xpath("//div[contains(@id,'NewPersonOnlyPickerMenuItemSet_NewPersonMenuItem')]/div[@role='menuitem']/div[@class='gw-label' and text()='New Person']");
    final By NGDI_LossParty_Picker_NewCompany = By.xpath("//div[contains(@id,'NewCompanyOnlyPickerMenuItemSet_NewCompanyMenuItem')]/div[@role='menuitem']/div[@class='gw-label' and text()='New Company']");
    final By NGDI_LossParty_Picker_ViewContactDetails = By.xpath("//div[contains(@id,'Owner_Picker-MenuItem_ViewDetails')]/div[@role='menuitem']/div[@class='gw-label' and text()='View Contact Details']");
    final By NGDI_LossParty = By.xpath("//select[contains(@name,'Owner_Picker')]");
    final By NGDI_Severity = By.xpath("//select[contains(@name,'Severity_Ext')]");
    final By NGDI_DamageDescription = By.xpath("//textarea[contains(@name,'DamageDescription_Ext')]");
    final By NGDI_LossEstimate = By.xpath("//input[contains(@name,'LossEstimate_Ext')]");

    // VehiclesPeopleProperty
    final By ACI_Incident = By.xpath("//div[@class='gw-TitleBar--title' and @role='heading' and text()='Incident']");
    final By ACI_VehiclesPeopleProperty = By.xpath("//div[@class='gw-TitleBar--title' and @role='heading' and text()='Vehicles, People, & Property']");
    final By ACI_AddVehicle = By.xpath("//div[contains(@id,'AddVehicleButton')]/div[@role='button']");
    final By ACI_AddPedestrian = By.xpath("//div[contains(@id,'AddPedestrianButton')]/div[@role='button']");
    final By ACI_AddPropertyDamage = By.xpath("//div[contains(@id,'AddPropertyDamageButton')]/div[@role='button']");

    // Involved Vehicles
    final By Services_InvolvedVehicles = By.xpath("//div[@class='gw-TitleBar--title' and @role='heading' and text()='Involved Vehicles']");

    final By ACI_AttheScene = By.xpath("//div[@class='gw-TitleBar--title' and @role='heading' and text()='At the Scene']");
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
    final By SaveAndAssignClaim_Header = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and text()='Step 4 of 4: Save and Assign Claim']");
    // Assignment
    final By SAC_Assignment = By.xpath("//div[contains(@class,'gw-boldLabel') and text()='Assignment']");
    final By SAC_A_CommonAssign = By.xpath("//div[contains(@id,'CommonAssignChoice')]//div[@role='radio']");
    final By SAC_A_AssignclaimExposuresto = By.xpath("//select[contains(@name,'CommonAssign')]");
    final By SAC_A_IndividualAssign = By.xpath("//div[contains(@id,'IndividualAssignChoice')]//div[@role='radio']");
    final By SAC_A_AssignClaimExposuresIndividually = By.xpath("//select[contains(@name,'ClaimAssign')]");
    final By SAC_A_AssignToGroup = By.xpath("//select[contains(@name,'AssignToGroup_Ext')]");
    final By SAC_A_AssignToUser = By.xpath("//select[contains(@name,'AssignToUser_Ext')]");

    // Exposures
    final By SAC_Exposures = By.xpath("//div[contains(@class,'gw-boldLabel') and text()='Exposures']");
    final By SAC_Exposure = By.xpath("//div[contains(@id,'FNOLWizard_AssignSaveScreen')]//div[text()='Exposures']");
    final By ExposureHeader = By.xpath(
            "//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and text()='New Exposure']");
    final By ClaimantName = By.xpath("//select[contains(@name,'Claimant_Picker')]");
    final By ClaimantType = By.xpath("//select[contains(@name,'Claimant_Type')]");


    final By SAC_E_NewExposure_Button = By.xpath("//div[contains(@id,'NewExposureLV_tb-AddExposure')]/div[@role='button']");
    final By SAC_E_NewExposure_Menu = By.xpath("//div[contains(@id,'NewExposureLV_tb-AddExposure-0-item')]/div[@role='menuitem']/div[@class='gw-label']");

    /*
     * newClaimSaved
     */
    final By NewClaimSaved_Header = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and text()='New Claim Saved']");
    final By NCS_ClaimSaved = By.xpath("//div[contains(@id,'NewClaimSavedDV-Header')]/div[contains(@class,'gw-boldLabel') and contains(text(),'has been successfully saved')]");
    final By NCS_AssignedGroup = By.xpath("//div[contains(@id,'NewClaimSavedDV-AssignedGroup_Input')]//div[@class='gw-value-readonly-wrapper' and contains(text(),'Assigned Group:')]");
    final By NCS_AssignedUser = By.xpath("//div[contains(@id,'NewClaimSavedDV')]//div[@class='gw-value-readonly-wrapper' and contains(text(),'Assigned User:')]");
    final By NCS_ViewtheNewlySavedClaim = By.xpath("//div[contains(@id,'GoToClaim') and contains(@class,'gw-ValueWidget')]//div[@class='gw-action']");
    final By NCS_CreateAnotherNewClaim = By.xpath("//div[contains(@id,'CreateNewClaim') and contains(@class,'gw-ValueWidget')]//div[@class='gw-action']");
    final By NCS_AddReservesNewClaim = By.xpath("//div[contains(@id,'CreateReserve') and contains(@class,'gw-ValueWidget')]//div[@class='gw-action']");
    final By NCS_MakePaymentNewClaim = By.xpath("//div[contains(@id,'CreatePayment') and contains(@class,'gw-ValueWidget')]//div[@class='gw-action']");
    final By LinkDocumentButton = By.xpath("//div[contains(@id,'Button_Reserve_LinkDocument')]//div[@role='button']");
    final By DocumentSelectButton = By.xpath("//div[contains(@id,'PickExistingDocumentsLV-0-_Select')]//div[@role='button']");

    /*
     * AutoFirstandFinal
     */
    final By AutoFirstandFinal_Header = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and text()='Step 2 of 2: Auto First and Final']");

    final By AFF_Insured_Name = By.xpath("//select[contains(@name,'FirstAndFinalScreenInsuredClaimant')]");

    // Damage
    final By AFF_Damage = By.xpath("//div[contains(@class,'gw-boldLabel') and text()='Damage']");
    final By AFF_Damage_LossDescription = By.xpath("//textarea[contains(@name,'Description')]");

    // Claimant
    final By AFF_Claimant = By.xpath("//div[contains(@class,'gw-boldLabel') and text()='Claimant']");
    final By AFF_ClaimantName = By.xpath("//select[contains(@name,'Claimant_Picker')]");
    final By AFF_ClaimantType = By.xpath("//select[contains(@name,'Claimant_Type')]");

    final By AFF_Location = By.xpath("//select[contains(@name,'globalAddressContainer-Address_Picker')]");
    final By AFF_Country = By.xpath("//select[contains(@name,'GlobalAddressInputSet-Country')]");
    final By AFF_State = By.xpath("//select[contains(@name,'GlobalAddressInputSet-State')]");
    final By AFF_Address1 = By.xpath("//input[contains(@name,'GlobalAddressInputSet-AddressLine-1')]");
    final By AFF_Address2 = By.xpath("//input[contains(@name,'GlobalAddressInputSet-AddressLine2')]");
    final By AFF_Address3 = By.xpath("//input[contains(@name,'GlobalAddressInputSet-AddressLine3')]");

    // Repair
    final By AFF_Repair = By.xpath("//div[contains(@class,'gw-boldLabel') and text()='Repair']");
    final By AFF_Repair_RepairShop = By.xpath("//select[contains(@name,'RepairShop_Picker')]");
    final By AFF_RepairShop_TypeButton = By.xpath("//div[contains(@id,'RepairShop_PickerMenuIcon')]//div[@class='gw-action--expand-button']");
    final By AFF_RepairShop_NewAutobodyRepairShop = By.xpath("//div[contains(@id,'RepairShop_PickerMenuIcon')]//div[contains(@id,'NewContactPickerMenuItemSet_AutoRepairShop')]//div[@class='gw-label']");
    final By AFF_RepairShop_NewVendor_Company = By.xpath("//div[contains(@id,'RepairShop_PickerMenuIcon')]//div[contains(@id,'NewContactPickerMenuItemSet_CompanyVendor')]//div[@class='gw-label']");
    final By AFF_RepairShop_NewVendor_Person = By.xpath("//div[contains(@id,'RepairShop_PickerMenuIcon')]//div[contains(@id,'NewContactPickerMenuItemSet_PersonVendor')]//div[@class='gw-label']");
    final By AFF_RepairShop_Search = By.xpath("//div[contains(@id,'RepairShop_PickerMenuIcon')]//div[contains(@id,'MenuItem_Search')]//div[@class='gw-label']");
    final By AFF_RepairShop_ViewContactDetails = By.xpath("//div[contains(@id,'RepairShop_PickerMenuIcon')]//div[contains(@id,'MenuItem_ViewDetails')]//div[@class='gw-label']");

    /*
     * Search Address Book For Vendors
     */
    final By SearchAddressBookForVendors_Header = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and text()='Search Address Book For Vendors']");
    final By SABFV_Type = By.xpath("//select[contains(@name,'ContactSubtype')]");
    final By SABFV_Name = By.xpath("//input[contains(@name,'GlobalContactNameInputSet-Name')]");
    final By SABFV_Search = By.xpath(" //div[contains(@id,'SearchLinksInputSet-Search')]");

    final By NewAutoRepairShop_Header = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and text()='New Auto Repair Shop']");
    final By NARS_Tab_Basics = By.xpath("//div[contains(@id,'ContactBasicsCardTab')]/div[@role='tab']");
    final By NARS_Tab_Addresses = By.xpath("//div[contains(@id,'ContactAddressesCardTab')]/div[@role='tab']");
    final By NARS_Tab_RelaedContacts = By.xpath("//div[contains(@id,'ContactRelatedContactsCardTab')]/div[@role='tab']");
    final By NARS_Tab_Reviews = By.xpath("//div[contains(@id,'AddressBookContactReviewCardTab')]/div[@role='tab']");

    final By AFF_AutoRepairShop_Name = By.xpath("//input[contains(@name,'Name')]");
    final By AFF_AutoRepairShop_TaxID = By.xpath("//input[contains(@name,'ContactBasicsDV-V_EIN')]");
    final By AFF_AutoRepairShop_Address1 = By.xpath("//input[contains(@name,'AddressLine1')]");
    final By AFF_AutoRepairShop_City = By.xpath("//input[contains(@name,'City')]");
    final By AFF_AutoRepairShop_County = By.xpath("//input[contains(@name,'County')]");
    final By AFF_AutoRepairShop_State = By.xpath("//select[contains(@name,'GlobalAddressInputSet-State')]");
    final By AFF_AutoRepairShop_ZIPCode = By.xpath("//input[contains(@name,'PostalCode')]");

    final By AFF_Financials_Name = By.xpath("//select[contains(@name,'FNOLWizardCheckDV-Payee_Picker')]");
    final By AFF_Financials_PayeeType = By.xpath("//select[contains(@name,'FNOLWizardCheckDV-PayeeRole')]");

    final By AFF_Financials_Amount = By.xpath("//input[contains(@name,'CheckAmount')]");
    final By AFF_Financials_State = By.xpath("//div[contains(@id,'FNOLWizardCheckDV')]//select[contains(@name,'GlobalAddressInputSet-State')]");

    /*
     * Create Unverified Policy
     */
    final By CreateUnverifiedPolicy = By.xpath("//span[@class='gw-label--inner' and text()='Create Unverified Policy']/preceding-sibling::span[@class='gw-radio-wrapper']//input[contains(@name,'ScreenMode')]");
    final By CUP_PolicyNumber = By.xpath("//input[contains(@name,'FNOLWizardFindPolicyPanelSet-PolicyNumber')]");
    final By CUP_Type = By.xpath("//select[contains(@name,'FNOLWizardFindPolicyPanelSet-Type')]");
    final By CUP_TypeofClaim_Auto = By.xpath("//input[contains(@id,'FNOLWizardFindPolicyPanelSet-ClaimMode_0')]");
    final By CUP_TypeofClaim_Auto_AutoFirstandFinal = By.xpath("//span[@class='gw-label--inner' and text()='Auto - Auto First and Final']/preceding-sibling::span[@class='gw-radio-wrapper']//input[contains(@name,'ClaimLossType')]");
    final By CUP_TypeofClaim_AutoAuto_QuickClaimAuto = By.xpath("//input[contains(@id,'FNOLWizardFindPolicyPanelSet-ClaimMode_2')]");
    final By CUP_LossDate = By.xpath("//input[contains(@name,'Claim_LossDate')]");
    final By CUP_ReportedDate = By.xpath("//input[contains(@name,'ReportedDate')]");
    final By CUP_Time = By.xpath("//input[contains(@name,'Claim_lossTime_time')]");
    final By CUP_Liability = By.xpath("//div[contains(@id,'FindPolicyPanelSet-ClaimLossType')]//span[@class='gw-label--inner' and text()='Liability']");
    final By CUP_Property = By.xpath("//div[contains(@id,'FindPolicyPanelSet-ClaimLossType')]//span[@class='gw-label--inner' and text()='Property']");

    final By PolicyLevelCoveragesSection = By.xpath("//div[contains(@id,'PolicyCoverageListDetail')]//div[@role='heading']");
    final By PolicyLevelCoveragesAddButton = By.xpath("//div[contains(@id,'PolicyCoveragesLV_tb-Add')]//div[@role='button']");
    final By PolicyLevelCoveragesTypes = By.xpath("//select[contains(@name,'CoverageType')]");
    final By PolicyLevelCoveragesForm = By.xpath("//select[contains(@name,'coverageForm_Ext')]");
    final By PolicyLevelCoveragesCurrency = By.xpath("//select[contains(@name,'EditableGeneralLiabilityPolicyCoveragesLV-0-Currency')]");
    /*
     * Basic Information
     */
    final By CUP_BasicInformation = By.xpath("//div[contains(@class,'gw-boldLabel') and text()='Basic Information']");
    final By CUP_BI_PolicyNumber = By.xpath("//div[contains(@id,'NewClaimPolicyGeneralDV-PolicyNumber') and contains(@class,'gw-ValueWidget')]//div[@class='gw-value-readonly-wrapper']");
    final By CUP_BI_Type = By.xpath("//div[contains(@id,'NewClaimPolicyGeneralDV-Type') and contains(@class,'gw-ValueWidget')]//div[@class='gw-label']");
    final By CUP_BI_EffectiveDate = By.xpath("//input[contains(@name,'NewClaimPolicyGeneralDV-EffectiveDate')]");
    final By CUP_BI_ExpirationDate = By.xpath("//input[contains(@name,'NewClaimPolicyGeneralDV-ExpirationDate')]");
    final By CUP_BI_CancellationDate = By.xpath("//input[contains(@name,'NewClaimPolicyGeneralDV-CancellationDate')]");
    final By CUP_BI_OriginalEffectiveDate = By.xpath("//input[contains(@name,'NewClaimPolicyGeneralDV-OrigEffectiveDate')]");
    final By CUP_BI_Status = By.xpath("//select[contains(@name,'NewClaimPolicyGeneralDV-Status')]");

    /*
     * Insured
     */
    final By CUP_Insured = By.xpath("//div[contains(@class,'gw-boldLabel') and text()='Insured']");

    final By CUP_Insured_SelectMenu_Button = By.xpath("//div[contains(@id,'Insured_Name-Insured_NameMenuIcon')]");
    final By CUP_Insured_Menu_NewPerson = By.xpath("//div[@class='gw-subMenu gw-open']/div[contains(@class,'gw-MenuItemWidget')]/div[@role='menuitem']//div[text()='New Person']");
    final By CUP_Insured_Menu_NewVendor = By.xpath("//div[@class='gw-subMenu gw-open']/div[contains(@class,'gw-MenuItemWidget')]/div[@role='menuitem']//div[text()='New Vendor']");
    final By CUP_Insured_Menu_NV_AutobodyRepairShop = By.xpath("//div[@class='gw-subMenu gw-open']/div[contains(@class,'gw-MenuItemWidget')]/div[@role='menuitem']//div[text()='Autobody Repair Shop']");
    final By CUP_Insured_Menu_NV_AutoTowingAgency = By.xpath("//div[@class='gw-subMenu gw-open']/div[contains(@class,'gw-MenuItemWidget')]/div[@role='menuitem']//div[text()='Auto Towing Agency']");
    final By CUP_Insured_Menu_NV_Doctor = By.xpath("//div[@class='gw-subMenu gw-open']/div[contains(@class,'gw-MenuItemWidget')]/div[@role='menuitem']//div[text()='Doctor']");
    final By CUP_Insured_Menu_NV_MedicalCareOrganization = By.xpath("//div[@class='gw-subMenu gw-open']/div[contains(@class,'gw-MenuItemWidget')]/div[@role='menuitem']//div[text()='Medical Care Organization']");
    final By CUP_Insured_Menu_NV_VendorCompany = By.xpath("//div[@class='gw-subMenu gw-open']/div[contains(@class,'gw-MenuItemWidget')]/div[@role='menuitem']//div[text()='Vendor (Company)']");
    final By CUP_Insured_Menu_NewCompany = By.xpath("//div[@class='gw-subMenu gw-open']/div[contains(@class,'gw-MenuItemWidget')]/div[@role='menuitem']//div[text()='New Company']");
    final By CUP_Insured_Menu_NewLegal = By.xpath("//div[@class='gw-subMenu gw-open']/div[contains(@class,'gw-MenuItemWidget')]/div[@role='menuitem']//div[text()='New Legal']");
    final By CUP_Insured_Menu_NL_Adjudicator = By.xpath("//div[@class='gw-subMenu gw-open']/div[contains(@class,'gw-MenuItemWidget')]/div[@role='menuitem']//div[text()='Adjudicator']");
    final By CUP_Insured_Menu_NL_Attorney = By.xpath("//div[@class='gw-subMenu gw-open']/div[contains(@class,'gw-MenuItemWidget')]/div[@role='menuitem']//div[text()='Attorney']");
    final By CUP_Insured_Menu_NL_LawFirm = By.xpath("//div[@class='gw-subMenu gw-open']/div[contains(@class,'gw-MenuItemWidget')]/div[@role='menuitem']//div[text()='Law Firm']");
    final By CUP_Insured_Menu_NL_LegalVenue = By.xpath("//div[@class='gw-subMenu gw-open']/div[contains(@class,'gw-MenuItemWidget')]/div[@role='menuitem']//div[text()='Legal Venue']");
    final By CUP_Insured_Menu_Search = By.xpath("//div[@class='gw-subMenu gw-open']/div[contains(@class,'gw-MenuItemWidget')]/div[@role='menuitem']//div[text()='Search']");
    final By CUP_Insured_Menu_ViewContactDetails = By.xpath("//div[@class='gw-subMenu gw-open']/div[contains(@class,'gw-MenuItemWidget')]/div[@role='menuitem']//div[text()='View Contact Details']");

    final By CUP_Underwriting = By.xpath("//div[contains(@id,'NewClaimPolicyGeneralDV')]/div[text()='Underwriting']");
    final By CUP_Underwriting_Organization = By.xpath("//select[contains(@name,'Underwriting_Company')]");

    final By CUP_NP_ThiscontactisnotlinkedtotheAddressBook = By.xpath("//div[contains(@id,'LinkStatusMessage')]//div[@class='gw-value-readonly-wrapper']");
    final By NP_Tab_Basic = By.xpath("//div[contains(@id,'ContactBasicsCardTab')]//div[@role='tab']");
    final By NP_Tab_Addresses = By.xpath("//div[contains(@id,'ContactAddressesCardTab')]//div[@role='tab']");
    final By NP_Tab_RelatedContacts = By.xpath("//div[contains(@id,'ContactRelatedContactsCardTab')]//div[@role='tab']");

    final By CUP_NP_Person = By.xpath("//div[contains(@class,'gw-boldLabel') and text()='Person']");

    final By NP_P_FirstName = By.xpath("//input[contains(@name,'GlobalPersonNameInputSet-FirstName')]");
    final By NP_P_LastName = By.xpath("//input[contains(@name,'GlobalPersonNameInputSet-LastName')]");
    final By NP_P_TaxID = By.xpath("//input[contains(@name,'TaxID')]");

    final By NP_Address1 = By.xpath("//input[contains(@name,'AddressLine1')]");
    final By NP_City = By.xpath("//input[contains(@name,'City')]");
    final By NP_County = By.xpath("//input[contains(@name,'County')]");

    final By NP_State = By.xpath("//select[contains(@name,'GlobalAddressInputSet-State')]");
    final By NP_ZIPCode = By.xpath("//input[contains(@name,'PostalCode')]");

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
    final By CUP_ANV_AddCoverages = By.xpath("//div[contains(@id,'EditableVehicleCoveragesLV_tb-Add' )]//div[@role='button']");
    final By CUP_ANV_CoverageType = By.xpath("//select[contains(@name,'CoverageType')]");
    final By CUP_ANV_ExposureLimit = By.xpath("//input[contains(@name,'ExposureLimit')]");
    final By CUP_ANV_IncidentLimit = By.xpath("//input[contains(@name,'IncidentLimit')]");

    final By dateOfEmployerNotified = By.name("FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-DateReportedtoEmployer");
    final By injuryDescription = By.name("FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-Claim_InjuryDescription");
    final By injury = By.id("FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-InjurySeverity_DeathReport_0");
    final By causeOfInjury = By.name("FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-Claim_InjuryIllnessCause");
    final By detailedInjury = By.name("FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-Claim_DetailedInjury");
    final By medicalAttention = By.id("FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-InjurySeverity_MedicalReport_0");
    final By areaOfBody = By.name("FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-EditableBodyPartDetailsLV-0-PrimaryBodyPart");
    final By bodyPart = By.name("FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-EditableBodyPartDetailsLV-0-DetailedBodyPart");
    final By ppdPercentage = By.name("FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-EditableBodyPartDetailsLV-0-PermamentImpairmentPercentage");
    final By lostTimeFromWork = By.id("FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-InjurySeverity_TimeLossReport_0");
    final By testClickTop = By.id("gw-center-title-toolbar");

    /*
     * Select Policy
     */
    final By SelectPolicy = By.xpath("//div[contains(@id,'SelectPolicyButton')]//div[@role='button']");
    final By SP_PolicyNumber = By.xpath("//input[contains(@name,'PolicyNumber')]");
    final By SP_Search = By.xpath("//div[contains(@id,'SearchLinksInputSet-Search')]");
    final By SP_Select = By.xpath("//div[contains(@id,'PolicySearchResultLV-0-_Select')]");
    /*
     * DuplicateClaims
     */
    final By DuplicateClaims_Header = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading'  and text()='Duplicate Claims']");
    final By DC_PossibleDuplicateClaims_Header = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading'  and text()='Possible Duplicate Claims']");
    final By DC_Possibleduplicateclaimsfound = By.xpath("//div[contains(@id,'NewClaimDuplicatesScreen')]//div[@class='gw-VerbatimWidget--inner']");
    final By DC_Close = By.xpath("//div[contains(@id,'CloseButton')]");
    /*
     * services Rental
     */
    final By Assign_Button = By.xpath("//div[contains(@id,'AssignmentPopupScreen_ButtonButton')]//div[@role='button']");

    final By QuickClaimAuto_Header = By.xpath("//div[contains(@id,'NewQuickClaimScreen-ttlBar')]//div[@class='gw-TitleBar--title']");
    /*
     * QuickClaimAuto
     */
    final By QCA_ReportedBy_Name = By.xpath("//select[contains(@name,'ReportedBy_Name')]");
    final By QCA_LossDetails_LossCause = By.xpath("//select[contains(@name,'LossCause')]");
    final By QCA_LossDetails_State = By.xpath("//select[contains(@name,'GlobalAddressInputSet-State')]");
    final By QCA_Location = By.xpath("//select[contains(@name,'Address_Picker')]");

    final By PolicyGeneral_Header = By.xpath("//div[contains(@id,'NewClaimSavedScreen-ttlBar')]//div[@class='gw-TitleBar--title']");
    final By SelectPolicy_Header = By.xpath("//div[contains(@id,'NewClaimSavedScreen-ttlBar')]//div[@class='gw-TitleBar--title']");
    final By Assign_Header = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and text()='Assign']");
    final By FinancialsTransactions_Header = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and text()='Financials: Transactions']");
    final By SP_Header = By.xpath("//div[@id='FNOLWizard-FNOLWizard_FindPolicyScreen-ttlBar']//div[@class='gw-TitleBar--title']");
    final By Summary_Header = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and text()='Summary']");
    final By InsuredName_Header = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading']");

    //  not mandatory for Ext Reporting Date
    //final By CUP_ReportedDate = By.xpath("//div[contains(@class,'gw-vw--value')]//input[contains(@name,'ReportedDate_Ext')]");
    final By ACI_ExtReportingDate = By.xpath("//div[contains(@class,'gw-vw--value')]//input[contains(@name,'ExtendedRepDate_Ext')]");
    final By EXTReportingDate = By.xpath("//div[contains(@id,'ExtendedRepDate_Ext_Inpu')]//div[@class='gw-label' and  text()='Ext Reporting Date']");

    final By DraftClaimNumber = By.xpath("//div[contains(@id,'ClaimNumber')]//div[@class='gw-label gw-infoValue']");

    final By ReportedDate = By.xpath("//div[contains(@id,'ReportedDate_Ext_Input')]//div[@class='gw-label']");
    final By ExtReportedDate = By.xpath("//div[contains(@class,'InputColumnWidget')]//div[contains(text(),'Ext Reporting Date')]");

    final By ReportedDate_Search = By.xpath("//input[contains(@name,'Claim_ReportedDate_Ext')]");
    final By LossDate_Search = By.xpath("//input[contains(@name,'Claim_LossDate')]");
    final By Next_Search = By.xpath("//div[contains(@id,'FNOLWizard-Next')]//div[@class='gw-action--inner gw-hasDivider']");
    final By AddClaim_Cancel = By.xpath("//div[@id='FNOLWizard-Cancel']//div[@role='button']");


    //
    final By EffectiveDate = By.xpath("//input[contains(@name,'PolicyGeneralDV-EffectiveDate')]");
    final By ExpirationDate = By.xpath("//input[contains(@name,'PolicyGeneralDV-ExpirationDate')]");
    final By ExtDate = By.xpath("//input[contains(@name,'ExtendedRepDate_Ext')]");
    final By ReportedDatee = By.xpath("//input[contains(@name,'ReportedDate_Ext')]");
    final By LossDate = By.xpath("//input[contains(@name,'LossDate') and  @class='gw-min-visible gw-DateValueWidget--dateInput']");
    final By ValidationResults = By.xpath("//div[@id='wsTabBar-wsTab_0']");
    final By ValidationResults_warning = By.xpath("//div[contains(@id,'WebMessageWorksheetScreen-grpMsgs-0-0')]");
    final By warning_OutsideCoverage = By.xpath("//div[contains(@id,'FNOLWizard_BasicInfoScreen-_msgs-0-0')]");
    final By ValidationResults_ClearButton = By.xpath("//div[contains(@id,'WebMessageWorksheet_ClearButton')]//div[@role='button']");
    final By PolicyLevelCoveragesForm_claim = By.xpath("//select[contains(@name,'1-coverageForm_Ext')]");
    final By RetroDate = By.xpath("//div[contains(@class,'gw-vw--value')]//input[contains(@name,'1-RetroActiveDate_Ext')]");
    final By Doc_Checkbox = By.xpath("//input[contains(@name,'DocumentsLV-0-_Checkbox')]");
    final By Doc_Deleteselected = By.xpath("//div[contains(@id,'RemoveDocuments')]//div[@class='gw-label']");
    final By NewMatter_Name = By.xpath("//input[@name='NewMatter-NewMatterScreen-NewMatterDV-Matter_Name']");
    final By SearchActivities_SearchResult = By.xpath("//tr[contains(@id,'ActivitySearch-ActivitySearchScreen-ActivitySearchResultsLV-3')]//td[@role='columnheader']");

    final By ActivityFilter = By.xpath("//select[contains(@name,'DesktopActivitiesFilter')]");
    final By Activity_14DaysDue = By.xpath("//div[contains(@id,'DesktopActivitiesLV')]");
    final By Claims_Header = By.xpath("//tr[@id='DesktopClaims-DesktopClaimsScreen-DesktopClaimsLV-4']//td[@role='columnheader']");
    final By Activity_ReviewNewClaim = By.xpath("//div[@id='DesktopNewClaims_Ext-DesktopNewClaims_ExtLV-0-Subject']");


    final By SAC_A_AssignGroup = By.xpath("//select[contains(@name,'AssignToGroup_Ext')]");


    //misba
    final By PC_Certified = By.xpath("//div[contains(@id,'NewExposureMenuItemSet-0-item-0-item')]//div[@class='gw-label' and text()='Certified Acts of Terrorism']");
    final By PC_BankersProfLiability = By.xpath("//div[contains(@id,'NewExposureMenuItemSet-0-item-1-item')]//div[@class='gw-label' and text()='Bankers Professional Liability-GeneralDamage']");
    final By PC_Bond = By.xpath("//div[contains(@id,'NewExposureMenuItemSet-0-item-2-item')]//div[@class='gw-label' and text()='Bond-GeneralDamage']");
    final By PC_Bond14 = By.xpath("//div[contains(@id,'NewExposureMenuItemSet-0-item-3-item')]//div[@class='gw-label' and text()='Bond Form 14-GeneralDamage']");
    final By PC_Bond15 = By.xpath("//div[contains(@id,'NewExposureMenuItemSet-0-item-4-item')]//div[@class='gw-label' and text()='Bond Form 15-GeneralDamage']");
    final By PC_Bond24 = By.xpath("//div[contains(@id,'NewExposureMenuItemSet-0-item-5-item')]//div[@class='gw-label' and text()='Bond Form 24-GeneralDamage']");
    final By PC_Bond25 = By.xpath("//div[contains(@id,'NewExposureMenuItemSet-0-item-6-item')]//div[@class='gw-label' and text()='Bond Form 25-GeneralDamage']");
    final By PC_Director = By.xpath("//div[contains(@id,'NewExposureMenuItemSet-0-item-7-item')]//div[@class='gw-label' and text()='Directors & Officers Liability-GeneralDamage']");
    final By PC_Employment = By.xpath("//div[contains(@id,'NewExposureMenuItemSet-0-item-8-item')]//div[@class='gw-label' and text()='Employment Practices Liability -GeneralDamage']");
    final By PC_Errors = By.xpath("//div[contains(@id,'NewExposureMenuItemSet-0-item-9-item')]//div[@class='gw-label' and text()='Errors & Omissions-GeneralDamage']");
    final By PC_Insurance = By.xpath("//div[contains(@id,'NewExposureMenuItemSet-0-item-10-item')]//div[@class='gw-label' and text()='Insurance Companies Liability-GeneralDamage']");
    final By PC_Investment = By.xpath("//div[contains(@id,'NewExposureMenuItemSet-0-item-11-item')]//div[@class='gw-label' and text()='Investment Management Liability-GeneralDamage']");
    final By PC_Private = By.xpath("//div[contains(@id,'NewExposureMenuItemSet-0-item-12-item')]//div[@class='gw-label' and text()='Private Equity Liability-GeneralDamage']");
    final By PC_Security = By.xpath("//div[contains(@id,'NewExposureMenuItemSet-0-item-13-item')]//div[@class='gw-label' and text()='Security Broker Dealer Liability-GeneralDamage']");
    final By PC_SideA = By.xpath("//div[contains(@id,'NewExposureMenuItemSet-0-item-14-item')]//div[@class='gw-label' and text()='Side A DIC-GeneralDamage']");
    final By PC_SideGenral = By.xpath("//div[contains(@id,'NewExposureMenuItemSet-0-item-15-item')]//div[@class='gw-label' and text()='Side A Only-GeneralDamage']");
    final By PC_Wage = By.xpath("//div[contains(@id,'NewExposureMenuItemSet-0-item-16-item')]//div[@class='gw-label' and text()='Wage & Hour-GeneralDamage']");
}
