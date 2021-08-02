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
	final By EnterAccountInformation_Header = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading'  and text()='Enter Account Information']");
	final By CreateAccount_Header           = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading'  and text()='Create account']");
	final By Organizations_Header           = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading'  and text()='Organizations']");
	final By Offerings_Header               = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and text()='Offerings']");
	final By Qualification_Header           = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and text()='Qualification']");
	final By Drivers_Header                 = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and text()='Drivers']");
	final By Vehicles_Header                = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and text()='Vehicles']");
	final By PACoverages_Header             = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and text()='PA Coverages']");
	final By RiskAnalysis_Header            = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and text()='Risk Analysis']");
	final By IssuesthatblockIssuance_Header = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and text()='Issues that block Issuance']");
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
	final By Rewrite_IssuePolicy_Button              = By.xpath("//div[contains(@id,'BindRewrite')]");
	final By CloseOptions_Button                     = By.xpath("//div[@id='gw-center-title-toolbar']//div[contains(@id,'CloseOptions')]/div[@role='button']");
	final By CloseOptions_WithdrawTransaction_Button = By.xpath("//div[@id='gw-center-title-toolbar']//div[contains(@id,'CloseOptions-WithdrawJob')]/div[@role='menuitem']");
	final By CloseOptions_Decline_Button             = By.xpath("//div[@id='gw-center-title-toolbar']//div[contains(@id,'CloseOptions-Decline')]/div[@role='menuitem']");
	final By CloseOptions_NotTaken_Button            = By.xpath("//div[@id='gw-center-title-toolbar']//div[contains(@id,'CloseOptions-NotTakenJob')]/div[@role='menuitem']");
	final By PrintQuote_Button                       = By.xpath("//div[@id='gw-center-title-toolbar']//div[contains(@id,'CreateSubmissionQuote')]/div[@role='button']");
	final By WithdrawTransaction_Button              = By.xpath("//div[@id='gw-center-title-toolbar']//div[contains(@id,'BindOptions')]");
	final By Reinstate_Button                        = By.xpath("//div[contains(@id,'ToolbarButtonSet-Reinstate')]/div[@role='button']");

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

	/*
	 * Start Cancellation For Policy
	 */
	final By StartCancellationForPolicy_Header = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and contains(text(),'Start Cancellation For Policy')]");

	final By SCFP_Source                    = By.xpath("//select[@name='StartCancellation-StartCancellationScreen-CancelPolicyDV-Source']");
	final By SCFP_Reason                    = By.xpath("//select[@name='StartCancellation-StartCancellationScreen-CancelPolicyDV-Reason']");
	final By SCFP_ReasonDescription         = By.xpath("//div[contains(@id,'CancelPolicyDV-ReasonDescription')]//textarea[contains(@name,'CancelPolicyDV-ReasonDescription')]");
	final By SCFP_RefundMethod              = By.xpath("//div[contains(@id,'CancelPolicyDV-CalcMethod')]//div[@class='gw-label' and text()='Flat']");
	final By SCFP_CancellationEffectiveDate = By.xpath("//div[contains(@id,'CancelPolicyDV-CancelDate')]//input[@class='gw-min-visible gw-DateValueWidget--dateInput']");
	final By StartCancellation_Button       = By.xpath("//div[@id='gw-center-title-toolbar']//div[contains(@class,'gw-ToolbarButtonWidget')]/div[@role='button']//div[@class='gw-label' and text()='Start Cancellation']");

	final By Confirmation_Header = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and text()='Confirmation']");

	final By SCFP_PolicyNumber        = By.xpath("//div[contains(@id,'SummaryDV-PolicyNumber')]//div[@class='gw-value-readonly-wrapper']");
	final By SCFP_PrimaryNamedInsured = By.xpath("//div[contains(@id,'Quote_SummaryDV-Insured')]//div[@class='gw-value-readonly-wrapper']");
	final By SCFP_Address             = By.xpath("//div[contains(@id,'GlobalAddressInputSet-AddressSummary')]//div[@class='gw-value-readonly-wrapper']");
	final By SCFP_County              = By.xpath("//div[contains(@id,'GlobalAddressInputSet-County')]//div[@class='gw-value-readonly-wrapper']");
	final By SCFP_AddressType         = By.xpath("//div[contains(@id,'PolicyAddressDisplayInputSet-AddressType') and contains(@class,'gw-ValueWidget')]//div[@class='gw-label']");
	final By SCFP_AddressDescription  = By.xpath("//div[contains(@id,'PolicyAddressDisplayInputSet-AddressDescription')]//div[@class='gw-value-readonly-wrapper']");

	final By BindOptions_ScheduleCancellation_Button = By.xpath("//div[@id='gw-center-title-toolbar']//div[contains(@id,'BindOptions-SubmitCancellation')]/div[@role='menuitem']");
	final By Bindoptions_CancelNow_Button            = By.xpath("//div[@id='gw-center-title-toolbar']//div[contains(@id,'BindOptions-CancelNow')]/div[@role='menuitem']");

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

	/*
	 * Start Policy Change
	 */
	final By SPC_ScreenHeader = By.xpath("//div[@id='StartPolicyChange-StartPolicyChangeScreen-ttlBar']//div[text()='Start Policy Change']");

	final By SPC_EffectiveDate = By.xpath("//div[contains(@id,'ReinstatementDate')]//div[@class='gw-value-readonly-wrapper']");
	final By SPC_Description   = By.xpath("//textarea[contains(@name,'ReinstatePolicyDV-ReasonDescription')]");

	/*
	 * renewal
	 */
	final By RDE_RenewalCode = By.xpath("//select[contains(@name,'RenewalCode')]");

}
