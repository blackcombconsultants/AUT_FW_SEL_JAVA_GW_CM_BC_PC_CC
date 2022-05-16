package com.pages.Guidewire.PolicyCenter;

import org.openqa.selenium.By;

public interface PolicyCenter_Resuables_PO {

	/*
	 * InfoBar
	 */

	final By InfoBar_SubmissionNumber    = By.xpath("//div[@id='gw-west-center']//div[@class='gw-Wizard--Title' and contains(text(),'Submission ')]");
	final By InfoBar_ReinstatementNumber = By.xpath("//div[@id='gw-west-center']//div[@class='gw-Wizard--Title' and contains(text(),'Reinstatement ')]");
	final By InfoBar_RewriteNumber       = By.xpath("//div[@id='gw-west-center']//div[@class='gw-Wizard--Title' and contains(text(),'Rewrite ')]");
	final By InfoBar_Job                 = By.xpath("//div[contains(@id,'InfoBar-JobLabel')]//div[@class='gw-label']");
	final By InfoBar_Job_SubmissionBound = By.xpath("//div[contains(@id,'InfoBar-JobLabel')]//div[@class='gw-label' and text()='Submission (Bound)']");
	final By InfoBar_ReinstatementJob    = By.xpath("//div[contains(@id,'InfoBar-ReinstatementLabel')]//div[@class='gw-label']");
	final By InfoBar_RewriteJob          = By.xpath("//div[contains(@id,'InfoBar-RewriteLabel')]//div[@class='gw-label']");
	final By InfoBar_Workflow            = By.xpath("//div[contains(@id,'InfoBar-Workflow')]//div[@class='gw-label gw-infoValue']");
	final By InfoBar_LOB                 = By.xpath("//div[contains(@id,'InfoBar-LOBLabel')]//div[@class='gw-label']");
	final By InfoBar_Status              = By.xpath("//div[contains(@id,'InfoBar-StatusAndExpDate')]//div[@class='gw-label']");
	final By InfoBar_EffectiveDate       = By.xpath("//div[contains(@id,'InfoBar-EffectiveDate')]//div[@class='gw-label']");
	final By InfoBar_AccountName         = By.xpath("//div[contains(@id,'InfoBar-AccountName')]//div[@class='gw-label gw-infoValue']");
	final By InfoBar_AccountNumber       = By.xpath("//div[contains(@id,'InfoBar-AccountNumber')]//div[@class='gw-label gw-infoValue']");
	final By InfoBar_PolicyNumber        = By.xpath("//div[contains(@id,'InfoBar-PolicyNumber')]//div[@class='gw-label gw-infoValue']");
	final By InfoBar_Underwriter         = By.xpath("//div[contains(@id,'InfoBar-Underwriter')]//div[@class='gw-label gw-infoValue']");
	final By InfoBar_EditLock            = By.xpath("//div[contains(@id,'InfoBar-EditLock')]//div[@class='gw-label gw-infoValue']");

	/*
	 * Headers
	 */
	final By Producer_Header = By.xpath("//div[contains(@id,'title-toolbar')]//div[text()='Producer']");

	final By Screen_Header                  = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading']");
	final By Screen_Header1                  = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading']");
	final By EnterAccountInformation_Header = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading'  and text()='Enter Account Information']");
	final By CreateAccount_Header           = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading'  and text()='Create account']");
	final By Organizations_Header           = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading'  and text()='Organizations']");
	final By Offerings_Header               = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and text()='Offerings']");
	final By Qualification_Header           = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and text()='Qualification (Step 1 of 12)']");
	final By Drivers_Header                 = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and text()='Drivers']");
	final By Vehicles_Header                = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and text()='Vehicles']");
	final By PACoverages_Header             = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and text()='PA Coverages']");
	final By RiskAnalysis_Header            = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and text()='Risk Analysis']");
	final By RiskApprovalDetails_Header     = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and text()='Risk Approval Details']");
	final By IssuesthatblockIssuance_Header = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and text()='Issues that block Issuance']");
	final By PolicyReview_Header            = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and text()='Policy Review']");
	final By Quote_Header                   = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and text()='Quote']");
	final By Payment_Header                 = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and text()='Payment']");
	final By Forms_Header                   = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and text()='Forms']");
	final By PolicySummary_Header           = By.xpath("//div[@id='PolicyFile_Summary-ttlBar']//div[@class='gw-TitleBar--title' and @role='heading' and contains(text(),'Policy Summary')]");



	final By Error_Header         = By.xpath("//div[contains(@class,'gw-MessagesWidget--group-CURRENT_PAGE')]//div[@class='gw-subGroupLabel gw-text']");
	final By Error_Message        = By.xpath("//div[contains(@class,'gw-MessagesWidget--group-CURRENT_PAGE')]//div[@class='gw-WebMessage']//div[@class='gw-message']");
	final By AllError_Message     = By.xpath("//div[contains(@class,'gw-MessagesWidget--group-CURRENT_PAGE')]//div[@class='gw-WebMessage']//div[@class='gw-message']");
	final By DiscardUnsavedChange = By.xpath("//div[text()='Discard Unsaved Change']");

	final By SearchAccountResults_Msg = By.xpath("//div[contains(@class,'gw-MessagesWidget--group-CURRENT_PAGE')]/div[contains(@class,'sub-group')]");
	final By SearchResults            = By.xpath("//table[@class='gw-ListViewWidget--table gw-table']");
	final By Select_Button            = By.xpath("//div[contains(@id,'SearchResultsLV-0')]/div[@role='button']");

	/*
	 * Tool Bar Buttons
	 */
	final By Search_Button = By.xpath("//div[contains(@id,'SearchLinksInputSet-Search')]");
	final By Reset_Button  = By.xpath("//div[contains(@id,'SearchLinksInputSet-Reset')]");

	final By Update_Button                           = By.xpath("//div[contains(@id,'Update')]");
	final By OK_Button                               = By.xpath("//div[contains(@class,'gw-ToolbarButtonWidget')]//div[@class='gw-minimized-view']/following-sibling::div[text()='OK']");
	final By Cancel_Button                           = By.xpath("//div[@id='gw-center-title-toolbar']//div[contains(@class,'gw-ToolbarButtonWidget')]/div[@role='button']//div[@class='gw-label' and text()='Cancel']");
	final By Back_Button                             = By.xpath("//div[@id='gw-center-title-toolbar']//div[contains(@class,'gw-ToolbarButtonWidget')]/div[@role='button']//div[@class='gw-label' and text()='Back']");
	final By Next_Button                             = By.xpath("//div[@id='gw-center-title-toolbar']//div[contains(@class,'gw-ToolbarButtonWidget')]/div[@role='button']//div[@class='gw-label' and text()='Next']");
	final By SaveAndNext_Button                             = By.xpath("//div[@id='gw-center-title-toolbar']//div[contains(@class,'gw-ToolbarButtonWidget')]/div[@role='button']//div[@class='gw-label' and text()='Save and Next']");
	final By Edit_Button                             = By.xpath("//div[@id='PreRenewalDirectionPage-PreRenewalDirectionScreen-Edit']");
	final By Quote_Button                            = By.xpath("//div[@id='gw-center-title-toolbar']//div[contains(@class,'gw-ToolbarButtonWidget')]/div[@role='button']//div[@class='gw-label' and text()='uote']");
	final By ReleaseLock_Button                      = By.xpath("//div[@id='gw-center-title-toolbar']//div[contains(@id,'Quote')]/div[@role='button']");
	final By EditPolicyTransaction_Button            = By.xpath("//div[@id='gw-center-title-toolbar']//div[contains(@id,'EditPolicy')]/div[@role='button']");
	final By SaveDraft_Button                        = By.xpath("//div[@id='gw-center-title-toolbar']//div[contains(@id,'Draft')]/div[@role='button']");
	final By Versions_Button                         = By.xpath("//div[@id='gw-center-title-toolbar']//div[contains(@id,'Versions')]/div[@role='button']");
	final By Start_MultiVersion_Button               = By.xpath("//div[@id='gw-center-title-toolbar']//div[contains(@id,'Versions-NewVersion')]/div[@role='menuitem']");
	final By Start_SideBySide_Button                 = By.xpath("//div[@id='gw-center-title-toolbar']//div[contains(@id,'Versions-SideBySide')]/div[@role='menuitem']");
	final By BindOptions_Button                      = By.xpath("//div[@id='gw-center-title-toolbar']//div[contains(@id,'BindOptions')]/div[@role='button']");
	final By BindOptions_BindOnly_Button             = By.xpath("//div[@id='gw-center-title-toolbar']//div[contains(@id,'BindOptions-BindOnly')]/div[@role='menuitem']");
	final By Bindoptions_IssuePolicy_Button          = By.xpath("//div[@id='gw-center-title-toolbar']//div[contains(@id,'BindOptions-BindAndIssue')]/div[@role='menuitem']");
	final By Rewrite_IssuePolicy_Button              = By.xpath("//div[contains(@id,'BindRewrite')]/div[@role='button']");
	final By CloseOptions_Button                     = By.xpath("//div[@id='gw-center-title-toolbar']//div[contains(@id,'CloseOptions')]/div[@role='button']");
	final By CloseOptions_WithdrawTransaction_Button = By.xpath("//div[@id='gw-center-title-toolbar']//div[contains(@id,'CloseOptions-WithdrawJob')]/div[@role='menuitem']");
	final By CloseOptions_Decline_Button             = By.xpath("//div[@id='gw-center-title-toolbar']//div[contains(@id,'CloseOptions-Decline')]/div[@role='menuitem']");
	final By CloseOptions_NotTaken_Button            = By.xpath("//div[@id='gw-center-title-toolbar']//div[contains(@id,'CloseOptions-NotTakenJob')]/div[@role='menuitem']");
	final By PrintQuote_Button                       = By.xpath("//div[@id='gw-center-title-toolbar']//div[contains(@id,'CreateSubmissionQuote')]/div[@role='button']");
	final By WithdrawTransaction_Button              = By.xpath("//div[@id='gw-center-title-toolbar']//div[contains(@id,'BindOptions')]");
	final By Reinstate_Button                        = By.xpath("//div[contains(@id,'ToolbarButtonSet-Reinstate')]/div[@role='button']");
    final By IssuePolicyButton                       = By.xpath("//div[contains(@id,'JobWizardToolbarButtonSet-BindPolicyChange')]");
	final By NonRenew                                = By.xpath("//div[contains(@id,'SendToNonRenewal')]//div[@role='menuitem']");

	/*
	 * New Submissions
	 */

	final By NS_PO_SingleorMultiplePolicies = By.xpath("//input[contains(@name,'ProductSettingsDV-CreateSingle')]");
	final By NS_PO_QuoteType                = By.xpath("//select[contains(@name,'ProductSettingsDV-QuoteType')]");
	final By NS_PO_DefaultBaseState         = By.xpath("//select[contains(@name,'ProductSettingsDV-DefaultBaseState')]");
	final By NS_PO_DefaultEffectiveDate     = By.xpath("//input[contains(@name,'DefaultPPEffDate')]");

	/*
	 * select LOB Xpath
	 */
	final By LobBusinessowners     = By.xpath("//div[text()='Businessowners']/ancestor::td[contains(@id,'Name_Cell')]/preceding-sibling::td//div[contains(@id,'ProductSelection') and text()='Select']");
	final By LobCommercialAuto     = By.xpath("//div[text()='Commercial Auto']/ancestor::td[contains(@id,'Name_Cell')]/preceding-sibling::td//div[contains(@id,'ProductSelection') and text()='Select']");
	final By LobPersonalAuto       = By.xpath("//div[text()='Personal Auto']/ancestor::td[contains(@id,'Name_Cell')]/preceding-sibling::td//div[contains(@id,'ProductSelection') and text()='Select']");
	final By LobCommercialPackage  = By.xpath("//div[text()='Commercial Package']/ancestor::td[contains(@id,'Name_Cell')]/preceding-sibling::td//div[contains(@id,'ProductSelection') and text()='Select']");
	final By LobCommercialProperty = By.xpath("//div[text()='Commercial Property']/ancestor::td[contains(@id,'Name_Cell')]/preceding-sibling::td//div[contains(@id,'ProductSelection') and text()='Select']");
	final By LobGeneralLiability   = By.xpath("//div[text()='General Liability']/ancestor::td[contains(@id,'Name_Cell')]/preceding-sibling::td//div[contains(@id,'ProductSelection') and text()='Select']");
	final By LobInlandMarine       = By.xpath("//div[text()='Inland Marine']/ancestor::td[contains(@id,'Name_Cell')]/preceding-sibling::td//div[contains(@id,'ProductSelection') and text()='Select']");
	// final By WorkersCompensation=By.xpath("//div[text()='Workers'
	// Compensation']/ancestor::td[contains(@id,'Name_Cell')]/preceding-sibling::td//div[contains(@id,'ProductSelection')
	// and text()='Select']");

	final By OrganizationName        = By.xpath("//input[contains(@name,'SearchDV-Organization')]");
	final By OrganizationDescription = By.xpath("//input[contains(@name,'SearchDV-Description')]");

	final By Of_OfferingSelection = By.xpath("//select[contains(@name,'OfferingScreen-OfferingSelection')]");
	final By AS_Edit_Button       = By.xpath("//div[contains(@id,'EditAccount')]//div[@role='menuitem']");
	/*
	 * Start Cancellation For Policy
	 */
	final By StartCancellationForPolicy_Header = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and contains(text(),'Start Cancellation')]");

	final By SCFP_Source                    = By.xpath("//select[@name='StartCancellation-StartCancellationScreen-CancelPolicyDV-Source']");
	final By SCFP_Reason                    = By.xpath("//select[@name='StartCancellation-StartCancellationScreen-CancelPolicyDV-Reason']");
	final By SCFP_ReasonDescription         = By.xpath("//div[contains(@id,'CancelPolicyDV-ReasonDescription')]//textarea[contains(@name,'CancelPolicyDV-ReasonDescription')]");
	final By SCFP_RefundMethod_flatrate     = By.xpath("//div[contains(@id,'CancelPolicyDV-CalcMethod')]//div[@class='gw-label' and text()='Flat']");
	final By SCFP_RefundMethod_prorate      = By.xpath("//div[contains(@id,'CancelPolicyDV-CalcMethod')]//div[@class='gw-label' and text()='Pro rata']");
	final By SCFP_RefundMethod_Shortrate      = By.xpath("//div[contains(@id,'CancelPolicyDV-CalcMethod')]//div[@class='gw-label' and text()='Short rate']");
	final By SCFP_CancellationEffectiveDate = By.xpath("//div[contains(@id,'CancelPolicyDV-CancelDate')]//input[@class='gw-min-visible gw-DateValueWidget--dateInput']");
	final By SCFP_CancellationEffectiveDateIcon = By.xpath("//div[contains(@id,'CancelDate_dateIcon')]");
	final By StartCancellation_Button       = By.xpath("//div[@id='StartCancellation-StartCancellationScreen-NewCancellation']//div[@role='button']");

	final By Confirmation_Header = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and text()='Confirmation']");
	final By PolicyReviewScreen = By.xpath("//div[@id='PolicyChangeWizard-PolicyReview']//div[@class='gw-label']");
	final By SCFP_PolicyNumber        = By.xpath("//div[contains(@id,'SummaryDV-PolicyNumber')]//div[@class='gw-value-readonly-wrapper']");
	final By SCFP_PrimaryNamedInsured = By.xpath("//div[contains(@id,'Quote_SummaryDV-Insured')]//div[@class='gw-value-readonly-wrapper']");
	final By SCFP_Address             = By.xpath("//div[contains(@id,'GlobalAddressInputSet-AddressSummary')]//div[@class='gw-value-readonly-wrapper']");
	final By SCFP_County              = By.xpath("//div[contains(@id,'GlobalAddressInputSet-County')]//div[@class='gw-value-readonly-wrapper']");
	final By SCFP_AddressType         = By.xpath("//div[contains(@id,'PolicyAddressDisplayInputSet-AddressType') and contains(@class,'gw-ValueWidget')]//div[@class='gw-label']");
	final By SCFP_AddressDescription  = By.xpath("//div[contains(@id,'PolicyAddressDisplayInputSet-AddressDescription')]//div[@class='gw-value-readonly-wrapper']");

	final By BindOptions_ScheduleCancellation_Button = By.xpath("//div[@id='gw-center-title-toolbar']//div[contains(@id,'BindOptions-SubmitCancellation')]/div[@role='menuitem']");
	final By Bindoptions_CancelNow_Button            = By.xpath("//div[@id='gw-center-title-toolbar']//div[contains(@id,'BindOptions-CancelNow')]/div[@role='menuitem']");
    final By Bindoptions_IssueNow_Button             = By.xpath("//div[@id='gw-center-title-toolbar']//div[contains(@id,'BindOptions-IssueNow')]/div[@role='menuitem']");
	/*
	 * Start Reinstatement
	 */

	final By SR_PolicyDetails     = By.xpath("//div[contains(@class,'boldLabel') and text()='Policy Details']");
	final By SR_PD_TermType       = By.xpath("//div[contains(@id,'TermType') and contains(@class,'gw-ValueWidget')]//div[contains(@class,'gw-label')]");
	final By SR_PD_TermNumber     = By.xpath("//div[contains(@id,'TermNumber')]//div[@contains(@class,'gw-label')]");
	final By SR_PD_EffectiveDate  = By.xpath("//div[contains(@id,'EffectiveDate')]//div[@class='gw-value-readonly-wrapper']");
	final By SR_PD_ExpirationDate = By.xpath("//div[contains(@id,'ExpirationDate')]//div[@class='gw-value-readonly-wrapper']");
	final By SR_PD_WrittenDate    = By.xpath("//div[contains(@id,'WrittenDate')]//div[@class='gw-value-readonly-wrapper']");
	final By SR_PD_RateAsOfDate   = By.xpath("//div[contains(@id,'RateAsOfDate')]//div[@class='gw-value-readonly-wrapper']");

	final By SR_AffinityGroup        = By.xpath("//div[contains(@class,'boldLabel') and text()='Affinity Group']");
	final By SR_AG_Name              = By.xpath("//div[contains(@id,'AffinityGroup')]//div[@class='gw-value-readonly-wrapper']");
	final By SR_AG_ReinstatementDate = By.xpath("//div[contains(@id,'ReinstatementDate')]//div[@class='gw-value-readonly-wrapper']");
	final By SR_AG_ReasonCode        = By.xpath("//select[contains(@name,'ReinstatePolicyDV-ReasonCode')]");
	final By SR_AG_ReasonDescription = By.xpath("//textarea[contains(@name,'ReinstatePolicyDV-ReasonDescription')]");
//submission declined
	final By SD_SubmissionDeclined = By.xpath("//div[contains(@id,'RejectScreen-ttlBar')]//div[@role='heading']");
	final By SD_ReasonCode = By.xpath("//select[@name='DeclineReasonPopup-RejectScreen-RejectReasonDV-RejectReason']");
	final By SD_ReasonText = By.xpath("//textarea[@name='DeclineReasonPopup-RejectScreen-RejectReasonDV-RejectReasonText']");
	final By SD_DeclineButton = By.xpath("//div[contains(@id,'RejectScreen-Update')]//div[@class='gw-label']");
	final By SD_ReasonCodeHeader = By.xpath("//div[contains(@id,'RejectReason_Input')]//div[@class='gw-label']");
	/*
	 * Start Policy Change
	 */
	final By SPC_ScreenHeader = By.xpath("//div[@id='StartPolicyChange-StartPolicyChangeScreen-ttlBar']//div[text()='Start Policy Change']");

	final By SPC_EffectiveDate = By.xpath("//div[contains(@id,'ReinstatementDate')]//div[@class='gw-value-readonly-wrapper']");
	final By SPC_Description   = By.xpath("//textarea[contains(@name,'ReinstatePolicyDV-ReasonDescription')]");
	final By Tab_Differences  = By.xpath("//div[contains(@id,'DiffsTab')]");
	final By PolicyItem       = By.xpath("//div[contains(@id,'DiffTreePanelLV-itemHeader_inner')]");
	final By ExistingPolicy   = By.xpath("//div[contains(@id,'DiffTreePanelLV-value1Header_inner')]");
	final By Preemption       = By.xpath("//div[contains(@id,'DiffTreePanelLV-value2Header_inner')]");
	final By PR_ChangeConflicts = By.xpath("//div[contains(@id,'DifferencesScreen-OOSConflictsTab')]//div[@class='gw-label']");
	final By Conflicts_OverrideAll = By.xpath("//div[contains(@id,'ConflictTableLV_tb-OverrideAll')]//div[@role='button']");
	final By Conflicts_Submit = By.xpath("//div[contains(@id,'OOSConflictPanelSet-ConflictTableLV-Done')]");
	final By Tab_PolicyReview = By.xpath("//div[contains(@id,'RewriteWizard_DifferencesScreen-PolicyReviewTab')]");
	/*
	 * renewal
	 */
	final By RDE_RenewalCode = By.xpath("//select[contains(@name,'RenewalCode')]");

	/*
	*Nonrenewal
	 */
	final By NonRenewReasonHeader = By.xpath("//div[@class='gw-label']  [text()='Non-Renew Reason']");
	final By NonRenewReason = By.xpath("//select[contains(@name,'NonRenewScreen-NonRenewReason')]");
	final By NonRenewAdditionalTextHeader = By.xpath("//div[@class='gw-label']  [text()='Non-Renew Additional Text']");
	final By NonRenewAdditionalText = By.xpath("//textarea[contains(@name,'NonRenewScreen-NonRenewAddExpl')]");
	final By SelectedNonRenewalExplanations = By.xpath("//div[@class='gw-ListView--UI--title']");
	final By AddExplanation = By.xpath("//div[contains(@id,'SelectedNonRenewalExplanationsLV_tb-Add')]");
    final By SelectNonRenewalExplanations = By.xpath("//input[contains(@name,'NonRenewalExplanationPatternsLV-1-_Checkbox')]");
    final By AddButton = By.xpath("//div[contains(@id,'AddButton')]//div[@role='button']");

	/*
*contacts
 */
    final By MenuPC_Account_Contacts = By
		.xpath("//div[@id='AccountFile-MenuLinks-AccountFile_AccountFile_Contacts']//div[@role='menuitem']");
	final By AccountFileContacts = By.xpath("//div[contains(@id,'ContactsScreen-ttlBar')]//div[@role='heading']");
	final By CreateNewContact = By.xpath("//div[contains(@id,'addContactButton')]//div[@role='button']");
	final By NamedInsured = By.xpath("//div[contains(@id,'addContactButton-9-roleType')]//div[contains(@class,'expand-button')]");
	final By NewCompany = By.xpath("//div[contains(@id,'addContactButton-9-roleType-0-contactType')]//div[@role='menuitem']");
	final By NewNamedInsured = By.xpath("//div[contains(@id,'ContactDetailScreen-ttlBar')]//div[@class='gw-TitleBar--title']");
	final By CompanyHeader = By.xpath("//div[contains(@id,'ContactNameInputSet-0')]//div[@class='gw-label gw-boldLabel']");
	final By CompanyName = By.xpath("//div[contains(@id,'GlobalContactNameInputSet-Name')]//input[@type='text']");
	final By Address = By.xpath("//div[contains(@id,'LinkAddressMenuMenuIcon')]");
	final By AccountHolder = By.xpath("//div[contains(@id,'LinkAddressMenu-0-contactDetail')]//div[contains(@class,'expand-button')]");
	final By AccountHolderAddress = By.xpath("//div[contains(@id,'LinkAddressMenu-0-contactDetail-PrimaryAddress')]//div[@role='menuitem']");
	final By ChangeAccountHolder = By.xpath("//div[@id='AccountFile_Contacts-AccountFile_ContactsScreen-ChangeAccountHolder']");
	final By CompanyDetails = By.xpath("//div[contains(@id,'ChangeAccountHolderMenuItemSet-0-UnassignedContact')]");

	/*
	*changepolicy
	 */
	final By StartPolicyChange = By.xpath("//div[contains(@id,'StartPolicyChangeScreen-ttlBar')]//div[@class='gw-TitleBar--titles--container']");
    final By Description = By.xpath("//input[contains(@name,'StartPolicyChangeDV-Description')]");
	final By EffectiveDate = By.xpath("//div[contains(@id,'StartPolicyChangeDV-EffectiveDate')]//input[@type='text']");
    final By NextButton = By.xpath("//div[contains(@id,'NewPolicyChange')]//div[@role='button']");
	final By OutOfsequenceError = By.xpath("//div[contains(@id,'-Warning')]//div[@class='gw-PanelIteratorEntryWidget gw-styleTag--PanelRefWidget']");
	/*
	Run Batch process
	 */
   final By PolicyRenewalStart = By.xpath("//div[contains(@id,'BatchProcessesLV-39-BatchProcess')]");
   final By RunButton = By.xpath("//div[contains(@id,'BatchProcessesLV-39-RunBatchWithoutNotify')]");

   /*
   Return to policy center
    */
   final By Menu_Actions = By.xpath("//div[contains(@id,'MenuActions')]/div[@role='button']/div[2]");
  final By ReturnToPC = By.xpath("//div[contains(@id,'ReturnToApp')]//div[@role='menuitem']");

  /*
  New Note
   */
  final By NewNoteTopic = By.xpath("//select[@name='NewNoteWorksheet-NewNoteScreen-NewNoteDV-Topic']");
  final By NewNoteText = By.xpath("//textarea[@name='NewNoteWorksheet-NewNoteScreen-NewNoteDV-Text']");

  /*
  prerenewal direction
   */
 final By DetailsHeader = By.xpath("//div[@id='PreRenewalDirectionPage-PreRenewalDirectionScreen-7']");
 final By DirectionDetails = By.xpath("//select[@name='PreRenewalDirectionPage-PreRenewalDirectionScreen-PreRenewalDirection']");
 final By NonrenewalReason = By.xpath("//select[@name='PreRenewalDirectionPage-PreRenewalDirectionScreen-NonRenewReason']");
 final By NoteHeader = By.xpath("//div[@id='PreRenewalDirectionPage-PreRenewalDirectionScreen-11']");
 final By NoteText = By.xpath("//textarea[@name='PreRenewalDirectionPage-PreRenewalDirectionScreen-Text']");


}