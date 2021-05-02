package com.pages.Guidewire.PolicyCenter;

import org.openqa.selenium.By;

public interface PolicyCenter_Resuables_PO {

	/*
	 * Headers
	 */

	
	
	final By InfoBar_SubmissionNumber = By.xpath("//div[@id='gw-west-center']//div[@class='gw-Wizard--Title' and contains(text(),'Submission ')]");
	final By InfoBar_Job = By.xpath("//div[contains(@id,'InfoBar-JobLabel')]//div[@class='gw-label']");
	final By InfoBar_Workflow = By
			.xpath("//div[contains(@id,'InfoBar-Workflow')]//div[@class='gw-label gw-infoValue']");
	final By InfoBar_LOB = By.xpath("//div[contains(@id,'InfoBar-LOBLabel')]//div[@class='gw-label']");
	final By InfoBar_EffectiveDate = By.xpath("//div[contains(@id,'InfoBar-EffectiveDate')]//div[@class='gw-label']");
	final By InfoBar_AccountName = By
			.xpath("//div[contains(@id,'InfoBar-AccountName')]//div[@class='gw-label gw-infoValue']");
	final By InfoBar_AccountNumber = By
			.xpath("//div[contains(@id,'InfoBar-AccountNumber')]//div[@class='gw-label gw-infoValue']");
	final By InfoBar_PolicyNumber = By
			.xpath("//div[contains(@id,'InfoBar-PolicyNumber')]//div[@class='gw-label gw-infoValue']");
	final By InfoBar_Underwriter = By
			.xpath("//div[contains(@id,'InfoBar-Underwriter')]//div[@class='gw-label gw-infoValue']");
	final By InfoBar_EditLock = By
			.xpath("//div[contains(@id,'InfoBar-EditLock')]//div[@class='gw-label gw-infoValue']");

	final By CreateAccount_Header = By
			.xpath("//div[@class='gw-TitleBar--title' and contains(text(),'Create account')]");
	final By Organizations_Header = By.xpath("//div[contains(@id,'title-toolbar')]//div[text()='Organizations']");
	final By Producer_Header = By.xpath("//div[contains(@id,'title-toolbar')]//div[text()='Producer']");

	final By Screen_Header = By
			.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading']");
	final By Error_Header = By.xpath(
			"//div[contains(@class,'gw-MessagesWidget--group-CURRENT_PAGE')]//div[@class='gw-subGroupLabel gw-text']");
	final By Error_Message = By.xpath(
			"//div[contains(@class,'gw-MessagesWidget--group-CURRENT_PAGE')]//div[@class='gw-WebMessage']//div[@class='gw-message']");
	final By AllError_Message = By.xpath(
			"//div[contains(@class,'gw-MessagesWidget--group-CURRENT_PAGE')]//div[@class='gw-WebMessage']//div[@class='gw-message']");

	final By SearchAccountResults_Msg = By
			.xpath("//div[contains(@class,'gw-MessagesWidget--group-CURRENT_PAGE')]/div[contains(@class,'sub-group')]");
	final By SearchResults = By.xpath("//table[@class='gw-ListViewWidget--table gw-table']");
	final By Select_Button = By.xpath("//div[contains(@id,'SearchResultsLV-0')]/div[@role='button']");

	/*
	 * Tool Bar Buttons
	 */
	final By Search_Button = By.xpath("//div[contains(@id,'SearchLinksInputSet-Search')]");
	final By Reset_Button = By.xpath("//div[contains(@id,'SearchLinksInputSet-Reset')]");

	final By Update_Button = By.xpath("//div[contains(@id,'Update')]");
	final By OK_Button = By.xpath(
			"//div[contains(@class,'gw-ToolbarButtonWidget')]//div[@class='gw-minimized-view']/following-sibling::div[text()='OK']");
	final By Cancel_Button = By.xpath(
			"//div[@id='gw-center-title-toolbar']//div[contains(@class,'gw-ToolbarButtonWidget')]/div[@role='button']//div[@class='gw-label' and text()='Cancel']");
	final By Back_Button = By.xpath(
			"//div[@id='gw-center-title-toolbar']//div[contains(@class,'gw-ToolbarButtonWidget')]/div[@role='button']//div[@class='gw-label' and text()='Back']");
	final By Next_Button = By.xpath(
			"//div[@id='gw-center-title-toolbar']//div[contains(@class,'gw-ToolbarButtonWidget')]/div[@role='button']//div[@class='gw-label' and text()='Next']");
	final By Quote_Button = By.xpath(
			"//div[@id='gw-center-title-toolbar']//div[contains(@class,'gw-ToolbarButtonWidget')]/div[@role='button']//div[@class='gw-label' and text()='uote']");
	final By ReleaseLock_Button = By
			.xpath("//div[@id='gw-center-title-toolbar']//div[contains(@id,'Quote')]/div[@role='button']");
	final By EditPolicyTransaction_Button = By
			.xpath("//div[@id='gw-center-title-toolbar']//div[contains(@id,'EditPolicy')]/div[@role='button']");
	final By SaveDraft_Button = By
			.xpath("//div[@id='gw-center-title-toolbar']//div[contains(@id,'Draft')]/div[@role='button']");
	final By Versions_Button = By
			.xpath("//div[@id='gw-center-title-toolbar']//div[contains(@id,'Versions')]/div[@role='button']");
	final By Start_MultiVersion_Button = By.xpath(
			"//div[@id='gw-center-title-toolbar']//div[contains(@id,'Versions-NewVersion')]/div[@role='menuitem']");
	final By Start_SideBySide_Button = By.xpath(
			"//div[@id='gw-center-title-toolbar']//div[contains(@id,'Versions-SideBySide')]/div[@role='menuitem']");
	final By BindOptions_Button = By
			.xpath("//div[@id='gw-center-title-toolbar']//div[contains(@id,'BindOptions')]/div[@role='button']");
	final By BindOptions_BindOnly_Button = By.xpath(
			"//div[@id='gw-center-title-toolbar']//div[contains(@id,'BindOptions-BindOnly')]/div[@role='menuitem']");
	final By Bindoptions_IssuePolicy_Button = By.xpath(
			"//div[@id='gw-center-title-toolbar']//div[contains(@id,'BindOptions-BindAndIssue')]/div[@role='menuitem']");
	final By CloseOptions_Button = By
			.xpath("//div[@id='gw-center-title-toolbar']//div[contains(@id,'CloseOptions')]/div[@role='button']");
	final By CloseOptions_WithdrawTransaction_Button = By.xpath(
			"//div[@id='gw-center-title-toolbar']//div[contains(@id,'CloseOptions-WithdrawJob')]/div[@role='menuitem']");
	final By CloseOptions_Decline_Button = By.xpath(
			"//div[@id='gw-center-title-toolbar']//div[contains(@id,'CloseOptions-Decline')]/div[@role='menuitem']");
	final By CloseOptions_NotTaken_Button = By.xpath(
			"//div[@id='gw-center-title-toolbar']//div[contains(@id,'CloseOptions-NotTakenJob')]/div[@role='menuitem']");
	final By PrintQuote_Button = By.xpath(
			"//div[@id='gw-center-title-toolbar']//div[contains(@id,'CreateSubmissionQuote')]/div[@role='button']");

	final By WithdrawTransaction_Button = By
			.xpath("//div[@id='gw-center-title-toolbar']//div[contains(@id,'BindOptions')]");

	/*
	 * New Submissions
	 */

	final By NS_PO_SingleorMultiplePolicies = By.xpath("//input[contains(@name,'ProductSettingsDV-CreateSingle')]");
	final By NS_PO_QuoteType = By.xpath("//select[contains(@name,'ProductSettingsDV-QuoteType')]");
	final By NS_PO_DefaultBaseState = By.xpath("//select[contains(@name,'ProductSettingsDV-DefaultBaseState')]");
	final By NS_PO_DefaultEffectiveDate = By.xpath("//input[contains(@name,'DefaultPPEffDate')]");

	/*
	 * select LOB Xpath
	 */
	final By LobBusinessowners = By.xpath(
			"//div[text()='Businessowners']/ancestor::td[contains(@id,'Name_Cell')]/preceding-sibling::td//div[contains(@id,'ProductSelection') and text()='Select']");
	final By LobCommercialAuto = By.xpath(
			"//div[text()='Commercial Auto']/ancestor::td[contains(@id,'Name_Cell')]/preceding-sibling::td//div[contains(@id,'ProductSelection') and text()='Select']");
	final By LobPersonalAuto = By.xpath(
			"//div[text()='Personal Auto']/ancestor::td[contains(@id,'Name_Cell')]/preceding-sibling::td//div[contains(@id,'ProductSelection') and text()='Select']");
	final By LobCommercialPackage = By.xpath(
			"//div[text()='Commercial Package']/ancestor::td[contains(@id,'Name_Cell')]/preceding-sibling::td//div[contains(@id,'ProductSelection') and text()='Select']");
	final By LobCommercialProperty = By.xpath(
			"//div[text()='Commercial Property']/ancestor::td[contains(@id,'Name_Cell')]/preceding-sibling::td//div[contains(@id,'ProductSelection') and text()='Select']");
	final By LobGeneralLiability = By.xpath(
			"//div[text()='General Liability']/ancestor::td[contains(@id,'Name_Cell')]/preceding-sibling::td//div[contains(@id,'ProductSelection') and text()='Select']");
	final By LobInlandMarine = By.xpath(
			"//div[text()='Inland Marine']/ancestor::td[contains(@id,'Name_Cell')]/preceding-sibling::td//div[contains(@id,'ProductSelection') and text()='Select']");
	// final By WorkersCompensation=By.xpath("//div[text()='Workers'
	// Compensation']/ancestor::td[contains(@id,'Name_Cell')]/preceding-sibling::td//div[contains(@id,'ProductSelection')
	// and text()='Select']");

	final By Account_Tab_Dropdown = By.xpath("//div[@id='TabBar-AccountTab']//div[3]");
	final By Account_Tab_Search = By.xpath("//input[@name='TabBar-AccountTab-AccountTab_AccountNumberSearchItem']");
	final By Account_Tab_Search_Button = By
			.xpath("//div[@id='TabBar-AccountTab-AccountTab_AccountNumberSearchItem_Button']");
	final By Account_Actions_Menu = By.xpath("//div[@id='AccountFile-AccountFileMenuActions']");
	final By Account_Actions_NewSubmission = By.xpath(
			"//div[@id=\"AccountFile-AccountFileMenuActions-AccountFileMenuActions_Create-AccountFileMenuActions_NewSubmission\"]");

	final By OrganizationName = By.xpath("//input[contains(@name,'SearchDV-Organization')]");
	final By OrganizationDescription = By.xpath("//input[contains(@name,'SearchDV-Description')]");

	final By Of_OfferingSelection = By.xpath("//select[@name='SubmissionWizard-OfferingScreen-OfferingSelection']");

	/*
	 * Start Policy Change
	 */
	final By SPC_EffectiveDate = By.xpath("//input[contains(@name,'DefaultPPEffDate')]");
	final By SPC_Description = By.xpath("//input[contains(@name,'DefaultPPEffDate')]");

	/*
	 * Start Cancellation For Policy
	 */
	final By SCFP_Source = By.xpath("//input[contains(@name,'DefaultPPEffDate')]");
	final By SCFP_Reason = By.xpath("//select[contains(@name,'DefaultPPEffDate')]");
	final By SCFP_ReasonDescription = By.xpath("//input[contains(@name,'DefaultPPEffDate')]");
	final By SCFP_RefundMethod = By.xpath("//div[contains(@name,'DefaultPPEffDate')]");
	final By SCFP_CancellationEffectiveDate = By.xpath("//input[contains(@name,'DefaultPPEffDate')]");
	final By StartCancellation_Button = By.xpath(
			"//div[@id='gw-center-title-toolbar']//div[contains(@class,'gw-ToolbarButtonWidget')]/div[@role='button']//div[@class='gw-label' and text()='Start Cancellation']");

	final By BindOptions_ScheduleCancellation_Button = By.xpath(
			"//div[@id='gw-center-title-toolbar']//div[contains(@id,'BindOptions-SubmitCancellation')]/div[@role='menuitem']");
	final By Bindoptions_CancelNow_Button = By.xpath(
			"//div[@id='gw-center-title-toolbar']//div[contains(@id,'BindOptions-CancelNow')]/div[@role='menuitem']");

	/*
	 * Start Reinstatement
	 */

	final By SR_PolicyDetails = By.xpath("//div[contains(@class,'boldLabel') and text()='Policy Details']");
	final By SR_PD_TermType = By.xpath("//div[contains(@id,'TermType')]//div[@contains(@class,'gw-label')]");
	final By SR_PD_TermNumber = By.xpath("//div[contains(@id,'TermNumber')]//div[@contains(@class,'gw-label')]");
	final By SR_PD_EffectiveDate = By.xpath("//div[contains(@id,'EffectiveDate')]//div[@contains(@class,'gw-label')]");
	final By SR_PD_ExpirationDate = By
			.xpath("//div[contains(@id,'ExpirationDate')]//div[@contains(@class,'gw-label')]");
	final By SR_PD_WrittenDate = By.xpath("//div[contains(@id,'WrittenDate')]//div[@contains(@class,'gw-label')]");
	final By SR_PD_RateAsOfDate = By.xpath("//div[contains(@id,'RateAsOfDate')]//div[@contains(@class,'gw-label')]");

	final By SR_AffinityGroup = By.xpath("//div[contains(@class,'boldLabel') and text()='Affinity Group']");
	final By SR_AG_Name = By.xpath("//div[contains(@id,'AffinityGroup')]//div[@contains(@class,'gw-label')]");
	final By SR_AG_ReinstatementDate = By
			.xpath("//div[contains(@id,'ReinstatementDate')]//div[@contains(@class,'gw-label')]");
	final By SR_AG_ReasonCode = By.xpath("//select[contains(@id,'ReasonCode')]");
	final By SR_AG_ReasonDescription = By.xpath("//input[contains(@id,'ReasonDescription')]");

}
