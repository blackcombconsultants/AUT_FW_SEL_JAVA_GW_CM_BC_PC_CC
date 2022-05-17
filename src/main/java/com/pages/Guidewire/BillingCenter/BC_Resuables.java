
package com.pages.Guidewire.BillingCenter;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Reporting_Utils;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

/*--------------------------------------------------------------------------------------
 * 		Name				:			Reusable
 * 		Author				:			Akula Srikanth
 * 		Description			:			Login, Tab, Menu, Infobar, click buttons
 * 		Date				:			19-Apr 
 * 
 * --------------------------------------------------------------------------------------
 */

public class BC_Resuables extends SeleniumWebDriver_Commands {

	/*
	 * Constructor for driver
	 */
	public BC_Resuables(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	LinkedHashMap<String, String> lhm_Data;

	/*--------------------------------------------------------------------------------------
	 * Page Locators
	 * --------------------------------------------------------------------------------------
	 */

	/*
	 * Login
	 */
	private static By GW_Username     = By.xpath("//input[contains(@name,'LoginDV-username')]");
	private static By GW_Password     = By.xpath("//input[contains(@name,'LoginDV-password')]");
	private static By GW_Login_Button = By.xpath("//div[@id='Login-LoginScreen-LoginDV-submit']//div");

	private static By GW_ToolBar_Link = By.id("TabBar-UnsavedWorkTabBarLink");
	private static By GW_Setting_Link = By.id("gw-TabBarWidget--settings");
	private static By GW_Logout_Link  = By.id("TabBar-LogoutTabBarLink");

	/*
	 * InfoBar
	 */
	private static By InfoBar_SubmissionNumber    = By.xpath("//div[@id='gw-west-center']//div[@class='gw-Wizard--Title' and contains(text(),'Submission ')]");
	private static By InfoBar_ReinstatementNumber = By.xpath("//div[@id='gw-west-center']//div[@class='gw-Wizard--Title' and contains(text(),'Reinstatement ')]");
	private static By InfoBar_RewriteNumber       = By.xpath("//div[@id='gw-west-center']//div[@class='gw-Wizard--Title' and contains(text(),'Rewrite ')]");
	private static By InfoBar_Job                 = By.xpath("//div[contains(@id,'InfoBar-JobLabel')]//div[@class='gw-label']");
	private static By InfoBar_ReinstatementJob    = By.xpath("//div[contains(@id,'InfoBar-ReinstatementLabel')]//div[@class='gw-label']");
	private static By InfoBar_RewriteJob          = By.xpath("//div[contains(@id,'InfoBar-RewriteLabel')]//div[@class='gw-label']");
	private static By InfoBar_Workflow            = By.xpath("//div[contains(@id,'InfoBar-Workflow')]//div[@class='gw-label gw-infoValue']");
	private static By InfoBar_LOB                 = By.xpath("//div[contains(@id,'InfoBar-LOBLabel')]//div[@class='gw-label']");
	private static By InfoBar_Status              = By.xpath("//div[contains(@id,'InfoBar-StatusAndExpDate')]//div[@class='gw-label']");
	private static By InfoBar_EffectiveDate       = By.xpath("//div[contains(@id,'InfoBar-EffectiveDate')]//div[@class='gw-label']");
	private static By InfoBar_AccountName         = By.xpath("//div[contains(@id,'InfoBar-AccountName')]//div[@class='gw-label gw-infoValue']");
	private static By InfoBar_AccountNumber       = By.xpath("//div[contains(@id,'InfoBar-AccountNumber')]//div[@class='gw-label gw-infoValue']");
	private static By InfoBar_PolicyNumber        = By.xpath("//div[contains(@id,'InfoBar-PolicyNumber')]//div[@class='gw-label gw-infoValue']");
	private static By InfoBar_Underwriter         = By.xpath("//div[contains(@id,'InfoBar-Underwriter')]//div[@class='gw-label gw-infoValue']");
	private static By InfoBar_EditLock            = By.xpath("//div[contains(@id,'InfoBar-EditLock')]//div[@class='gw-label gw-infoValue']");

	/*
	 * Headers
	 */
	private static By Producer_Header = By.xpath("//div[contains(@id,'title-toolbar')]//div[text()='Producer']");

	private static By Screen_Header        = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading']");
	private static By CreateAccount_Header = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading'  and text()='Create account']");
	private static By Organizations_Header = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading'  and text()='Organizations']");
	private static By Offerings_Header     = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and text()='Offerings']");
	private static By Qualification_Header = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and text()='Qualification']");
	private static By Quote_Header         = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and text()='Quote']");
	private static By Payment_Header       = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and text()='Payment']");
	private static By Forms_Header         = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and text()='Forms']");
	private static By PolicySummary_Header = By.xpath("//div[@id='PolicyFile_Summary-ttlBar']//div[@class='gw-TitleBar--title' and @role='heading' and contains(text(),'Policy Summary')]");

	private static By Error_Header         = By.xpath("//div[contains(@class,'gw-MessagesWidget--group-CURRENT_PAGE')]//div[@class='gw-subGroupLabel gw-text']");
	private static By Error_Message        = By.xpath("//div[contains(@class,'gw-MessagesWidget--group-CURRENT_PAGE')]//div[@class='gw-WebMessage']//div[@class='gw-message']");
	private static By AllError_Message     = By.xpath("//div[contains(@class,'gw-MessagesWidget--group-CURRENT_PAGE')]//div[@class='gw-WebMessage']//div[@class='gw-message']");
	private static By DiscardUnsavedChange = By.xpath("//div[text()='Discard Unsaved Change']");

	private static By SearchAccountResults_Msg = By.xpath("//div[contains(@class,'gw-MessagesWidget--group-CURRENT_PAGE')]/div[contains(@class,'sub-group')]");
	private static By SearchResults            = By.xpath("//table[@class='gw-ListViewWidget--table gw-table']");
	private static By Select_Button            = By.xpath("//div[contains(@id,'SearchResultsLV-0')]/div[@role='button']");

	/*
	 * Tool Bar Buttons
	 */
	private static By Search_Button = By.xpath("//div[contains(@id,'SearchLinksInputSet-Search')]");
	private static By Reset_Button  = By.xpath("//div[contains(@id,'SearchLinksInputSet-Reset')]");

	private static By Update_Button                           = By.xpath("//div[contains(@id,'Update')]");
	private static By OK_Button                               = By.xpath("//div[contains(@class,'gw-ToolbarButtonWidget')]//div[@class='gw-minimized-view']/following-sibling::div[text()='OK']");
	private static By Cancel_Button                           = By.xpath("//div[@id='gw-center-title-toolbar']//div[contains(@class,'gw-ToolbarButtonWidget')]/div[@role='button']//div[@class='gw-label' and text()='Cancel']");
	private static By Back_Button                             = By.xpath("//div[@id='gw-center-title-toolbar']//div[contains(@class,'gw-ToolbarButtonWidget')]/div[@role='button']//div[@class='gw-label' and text()='Back']");
	private static By Next_Button                             = By.xpath("//div[@id='gw-center-title-toolbar']//div[contains(@class,'gw-ToolbarButtonWidget')]/div[@role='button']//div[@class='gw-label' and text()='Next']");
	private static By Quote_Button                            = By.xpath("//div[@id='gw-center-title-toolbar']//div[contains(@class,'gw-ToolbarButtonWidget')]/div[@role='button']//div[@class='gw-label' and text()='uote']");
	private static By ReleaseLock_Button                      = By.xpath("//div[@id='gw-center-title-toolbar']//div[contains(@id,'Quote')]/div[@role='button']");
	private static By EditPolicyTransaction_Button            = By.xpath("//div[@id='gw-center-title-toolbar']//div[contains(@id,'EditPolicy')]/div[@role='button']");
	private static By SaveDraft_Button                        = By.xpath("//div[@id='gw-center-title-toolbar']//div[contains(@id,'Draft')]/div[@role='button']");
	private static By Versions_Button                         = By.xpath("//div[@id='gw-center-title-toolbar']//div[contains(@id,'Versions')]/div[@role='button']");
	private static By Start_MultiVersion_Button               = By.xpath("//div[@id='gw-center-title-toolbar']//div[contains(@id,'Versions-NewVersion')]/div[@role='menuitem']");
	private static By Start_SideBySide_Button                 = By.xpath("//div[@id='gw-center-title-toolbar']//div[contains(@id,'Versions-SideBySide')]/div[@role='menuitem']");
	private static By BindOptions_Button                      = By.xpath("//div[@id='gw-center-title-toolbar']//div[contains(@id,'BindOptions')]/div[@role='button']");
	private static By BindOptions_BindOnly_Button             = By.xpath("//div[@id='gw-center-title-toolbar']//div[contains(@id,'BindOptions-BindOnly')]/div[@role='menuitem']");
	private static By Bindoptions_IssuePolicy_Button          = By.xpath("//div[@id='gw-center-title-toolbar']//div[contains(@id,'BindOptions-BindAndIssue')]/div[@role='menuitem']");
	private static By CloseOptions_Button                     = By.xpath("//div[@id='gw-center-title-toolbar']//div[contains(@id,'CloseOptions')]/div[@role='button']");
	private static By CloseOptions_WithdrawTransaction_Button = By.xpath("//div[@id='gw-center-title-toolbar']//div[contains(@id,'CloseOptions-WithdrawJob')]/div[@role='menuitem']");
	private static By CloseOptions_Decline_Button             = By.xpath("//div[@id='gw-center-title-toolbar']//div[contains(@id,'CloseOptions-Decline')]/div[@role='menuitem']");
	private static By CloseOptions_NotTaken_Button            = By.xpath("//div[@id='gw-center-title-toolbar']//div[contains(@id,'CloseOptions-NotTakenJob')]/div[@role='menuitem']");
	private static By PrintQuote_Button                       = By.xpath("//div[@id='gw-center-title-toolbar']//div[contains(@id,'CreateSubmissionQuote')]/div[@role='button']");
	private static By WithdrawTransaction_Button              = By.xpath("//div[@id='gw-center-title-toolbar']//div[contains(@id,'BindOptions')]");
	private static By Finish                                  = By.xpath("//div[@id='CreateTroubleTicketWizard-Finish']");

	private static By BatchScreen_Header = By.xpath("//div[contains(@id,'ttlBar')]//div[@role='heading']");

	private static By Batch_Invoices = By.xpath("//div[text()='Invoice']/ancestor::td/following-sibling::td[contains(@id,'RunBatchWithoutNotifyContent')]//div[contains(@id,'RunBatchWithoutNotify')]");
	// Action
	private static By Action_ReturnBillingCenter = By.xpath("//div[contains(@id,'ReturnToApp')]//div[text()='Return to BillingCenter']");
	private static By Internal_Tools             = By.xpath("//div[contains(@id,'TabBar-UnsupportedToolsTab')]//div[@class='gw-icon gw-icon--expand']");
	private static By System_clock               = By.xpath("//div[contains(@id,'TabBar-UnsupportedToolsTab-UnsupportedTools_SystemClock')]");

	/*
	 * ------------------------------------------------------------------------- ----
	 * ------------------------------------------------------------------------- ---- BillingCenter Tabs
	 * ------------------------------------------------------------------------- ----
	 */

	/*
	 * Desktop Tab
	 */
	private static By TabBC_Desktop                    = By.xpath("//div[@id='TabBar-AccountsTab']//div[@class='gw-label']");
	private static By TabBC_Desktop_dd                 = By.xpath("//div[@id='TabBar-DesktopTab']/div[3]");
	private static By TabBC_Desktop_MyActivities       = By.id("TabBar-DesktopTab-DesktopGroup_DesktopActivities");
	private static By TabBC_Desktop_MyApprovalRequests = By.id("TabBar-DesktopTab-DesktopGroup_DesktopApprovals");
	private static By TabBC_Desktop_MyTroubleTickets   = By.id("TabBar-DesktopTab-DesktopGroup_DesktopTroubleTickets");
	private static By TabBC_Desktop_MyDelinquencies    = By.id("TabBar-DesktopTab-DesktopGroup_DesktopDelinquencies");
	private static By TabBC_Desktop_Disbursements      = By.id("TabBar-DesktopTab-DesktopGroup_DesktopDisbursements");
	private static By TabBC_Desktop_SuspensePayments   = By.id("TabBar-DesktopTab-DesktopGroup_DesktopSuspensePayments");
	private static By TabBC_Desktop_MyAgencyItems      = By.id("TabBar-DesktopTab-DesktopGroup_DesktopAgencyItems");
	private static By TabBC_Desktop_HeldCharges        = By.id("TabBar-DesktopTab-DesktopGroup_DesktopHeldCharges");

	private static By Menu_Actions = By.xpath("//div[contains(@id,'MenuActions')]/div[@role='button']/div[2]");

	private static By MenuBC_Desktop_MyActivities       = By.id("DesktopGroup-MenuLinks-DesktopGroup_DesktopActivities");
	private static By MenuBC_Desktop_MyApprovalRequests = By.id("DesktopGroup-MenuLinks-DesktopGroup_DesktopApprovals");
	private static By MenuBC_Desktop_MyTroubleTickets   = By.id("DesktopGroup-MenuLinks-DesktopGroup_DesktopTroubleTickets");
	private static By MenuBC_Desktop_MyDelinquencies    = By.id("DesktopGroup-MenuLinks-DesktopGroup_DesktopDelinquencies");
	private static By MenuBC_Desktop_Disbursements      = By.id("DesktopGroup-MenuLinks-DesktopGroup_DesktopDisbursements");
	private static By MenuBC_Desktop_SuspensePayments   = By.id("DesktopGroup-MenuLinks-DesktopGroup_DesktopSuspensePayments");
	private static By MenuBC_Desktop_MyAgencyItems      = By.id("DesktopGroup-MenuLinks-DesktopGroup_DesktopAgencyItems");
	private static By MenuBC_Desktop_HeldCharges        = By.id("DesktopGroup-MenuLinks-DesktopGroup_DesktopHeldCharges");

	private static By MenuBC_Desktop_Actions_NewAssignedActivity = By.id("DesktopGroup-DesktopMenuActions-NewAssignedActivity");
	private static By MenuBC_Desktop_Actions_NewSharedActivity   = By.id("DesktopGroup-DesktopMenuActions-NewSharedActivity");
	private static By MenuBC_Desktop_Actions_Preferences         = By.id("DesktopGroup-DesktopMenuActions-DesktopMenuActions_UserPreferences");

	/*
	 * Account Tab
	 */
	private static By TabBC_Account                      = By.xpath("//div[@id='TabBar-AccountsTab']//div[@class='gw-label']");
	private static By TabBC_Account_dd                   = By.xpath("//div[@id='TabBar-AccountsTab']/div[3]");
	private static By TabBC_Account_AccountNumber        = By.xpath("//input[@name='TabBar-AccountsTab-AccountNumberSearchItem']");
	private static By TabBC_Account_AccountNumber_Search = By.xpath("//div[@id='TabBar-AccountsTab-AccountNumberSearchItem_Button']/span");
	/*
	 * NewAccount
	 */

	/*
	 * Actions
	 */
	private static By MenuBC_Actions_NewAccount = By.id("AccountsGroup-AccountsMenuActions-AccountsMenuActions_NewAccount");
	private static By MenuBC_Accounts           = By.id("AccountsGroup-MenuLinks-AccountsGroup_Accounts");
	/*
	 * Account
	 */

	/*
	 * Actions
	 */

	private static By MenuBC_Account_Actions_AddPolicy                       = By.id("AccountGroup-AccountDetailMenuActions-AccountDetailMenuActions_NewPolicy");
	private static By MenuBC_Account_Actions_NewPayment                      = By.id("AccountGroup-AccountDetailMenuActions-AccountDetailMenuActions_Payments");
	private static By MenuBC_Account_Actions_NewPayment_NewDirectBillPayment = By.id("AccountGroup-AccountDetailMenuActions-AccountDetailMenuActions_Payments-AccountDetailMenuActions_NewDirectBillPayment");
	private static By MenuBC_Account_Actions_NewTransaction                  = By.id("AccountGroup-AccountDetailMenuActions-AccountDetailMenuActions_NewTransaction");
	private static By MenuBC_Account_Actions_NewTransaction_Disbursement     = By.xpath("//div[contains(@id,'NewTransaction-AccountDetailMenuActions_Disbursement')]//div[@role='menuitem']");
	private static By MenuBC_Account_Actions_TransferPolicies                = By.id("AccountGroup-AccountDetailMenuActions-AccountDetailMenuActions_TransferPolicies");
	private static By MenuBC_Account_Actions_NewNote                         = By.id("AccountGroup-AccountDetailMenuActions-AccountDetailMenuActions_NewNote");
	private static By MenuBC_Account_Actions_NewDocument                     = By.id("AccountGroup-AccountDetailMenuActions-AccountDetailMenuActions_NewDocument");
	private static By MenuBC_Account_Actions_NewDocument_CreateFromTemplate  = By.id("AccountGroup-AccountDetailMenuActions-NewDocument");
	private static By MenuBC_Account_Actions_NewDocument_UploadDocument      = By.id("AccountGroup-AccountDetailMenuActions-NewDocument");
	private static By MenuBC_Account_Actions_NewEmail                        = By.id("AccountGroup-AccountDetailMenuActions-AccountDetailMenuActions_NewEmail");
	private static By MenuBC_Account_Actions_NewEmail_NewEmail               = By.id("AccountGroup-AccountDetailMenuActions-NewEmail");
	private static By MenuBC_Account_Actions_NewEmail_NewEmailTemplete       = By.id("AccountGroup-AccountDetailMenuActions-NewEmail");
	private static By MenuBC_Account_Actions_ChargeReversal                  = By.xpath("//div[contains(@id,'AccountDetailMenuActions_ChargeReversal')]//div[@role='menuitem']");

	private static By MenuBC_Account_Summary        = By.xpath("//div[@id='AccountGroup-MenuLinks-AccountGroup_AccountOverview-AccountOverview_AccountSummary']//div[@class='gw-label']");
	private static By MenuBC_Account_Details        = By.xpath("//div[@id='AccountGroup-MenuLinks-AccountGroup_AccountOverview-AccountOverview_AccountDetailSummary']//div[@class='gw-label']");
	private static By MenuBC_Account_Contacts       = By.xpath("//div[@id='AccountGroup-MenuLinks-AccountGroup_AccountDetailContacts']//div[@class='gw-label']");
	private static By MenuBC_Account_FundsTracking  = By.xpath("//div[@id='AccountGroup-MenuLinks-AccountGroup_AccountDetailFundsTracking']//div[@class='gw-label']");
	private static By MenuBC_Account_Payments       = By.xpath("//div[@id='AccountGroup-MenuLinks-AccountGroup_AccountDetailPayments']//div[@class='gw-label']");
	private static By MenuBC_Account_Charges        = By.xpath("//div[@id='AccountGroup-MenuLinks-AccountGroup_AccountDetailCharges']//div[@class='gw-label']");
	private static By MenuBC_Account_Disbursements  = By.xpath("//div[@id='AccountGroup-MenuLinks-AccountGroup_AccountDetailDisbursements']//div[@class='gw-label']");
	private static By MenuBC_Account_Transactions   = By.xpath("//div[@id='AccountGroup-MenuLinks-AccountGroup_AccountDetailTransactions']//div[@class='gw-label']");
	private static By MenuBC_Account_Collateral     = By.xpath("//div[@id='AccountGroup-MenuLinks-AccountGroup_AccountCollateral']//div[@class='gw-label']");
	private static By MenuBC_Account_Policies       = By.xpath("//div[@id='AccountGroup-MenuLinks-AccountGroup_AccountDetailPolicies']//div[@class='gw-label']");
	private static By MenuBC_Account_History        = By.xpath("//div[@id='AccountGroup-MenuLinks-AccountGroup_AccountDetailHistory']//div[@class='gw-label']");
	private static By MenuBC_Account_Evaluation     = By.xpath("//div[@id='AccountGroup-MenuLinks-AccountGroup_AccountDetailEvaluation']//div[@class='gw-label']");
	private static By MenuBC_Account_Invoices       = By.xpath("//div[@id='AccountGroup-MenuLinks-AccountGroup_AccountDetailInvoices']//div[@class='gw-label']");
	private static By MenuBC_Account_InvoiceStreams = By.xpath("//div[@id='AccountGroup-MenuLinks-AccountGroup_AccountDetailInvoiceStreams']//div[@class='gw-label']");
	private static By MenuBC_Account_TroubleTickets = By.xpath("//div[@id='AccountGroup-MenuLinks-AccountGroup_AccountDetailTroubleTickets']//div[@class='gw-label']");
	private static By MenuBC_Account_Documents      = By.xpath("//div[@id='AccountGroup-MenuLinks-AccountGroup_AccountDetailDocuments']//div[@class='gw-label']");
	private static By MenuBC_Account_Ledger         = By.xpath("//div[@id='AccountGroup-MenuLinks-AccountGroup_AccountDetailLedger]//div[@class='gw-label']");
	private static By MenuBC_Account_Journal        = By.xpath("//div[@id='AccountGroup-MenuLinks-AccountGroup_AccountDetailJournal']//div[@class='gw-label']");
	private static By MenuBC_Account_Delinquencies  = By.xpath("//div[@id='AccountGroup-MenuLinks-AccountGroup_AccountDetailDelinquencies']//div[@class='gw-label']");

	/*
	 * Policy Tab
	 */
	private static By TabBC_Policy                     = By.xpath("//div[@id='TabBar-PolicyTab']/div[@class='gw-label']");
	private static By TabBC_Policy_dd                  = By.xpath("//div[@id='TabBar-PoliciesTab']//div[3]");
	private static By TabBC_Policy_PolicyNumber        = By.xpath("//input[@name='TabBar-PoliciesTab-PolicyNumberSearchItem']");
	private static By TabBC_Policy_PolicyNumber_Search = By.xpath("//div[@id='TabBar-PoliciesTab-PolicyNumberSearchItem_Button']//span[@class='gw-icon']");

	private static By MenuBC_Policy_Summary         = By.xpath("//div[@id='PolicyGroup-MenuLinks-PolicyGroup_PolicyOverview-AccountOverview_AccountSummary']//div[@class='gw-label']");
	private static By MenuBC_Policy_Details         = By.xpath("//div[@id='PolicyGroup-MenuLinks-PolicyGroup_PolicyOverview-AccountOverview_AccountDetailSummary']//div[@class='gw-label']");
	private static By MenuBC_Policy_Contacts        = By.xpath("//div[@id='PolicyGroup-MenuLinks-PolicyGroup_PolicyDetailContacts']//div[@class='gw-label']");
	private static By MenuBC_Policy_Transactions    = By.xpath("//div[@id='PolicyGroup-MenuLinks-PolicyGroup_PolicyDetailTransactions']//div[@class='gw-label']");
	private static By BC_Policy_Charges             = By.xpath("//div[@id='PolicyGroup-MenuLinks-PolicyGroup_PolicyDetailCharges']//div[@class='gw-label']");
	private static By MenuBC_Policy_Disbursements   = By.xpath("//div[@id='PolicyGroup-MenuLinks-PolicyGroup_PolicyDetailDisbursements']//div[@class='gw-label']");
	private static By MenuBC_Policy_PaymentSchedule = By.xpath("//div[@id='PolicyGroup-MenuLinks-PolicyGroup_PolicyDetailPayments']//div[@class='gw-label']");
	private static By MenuBC_Policy_Commissions     = By.xpath("//div[@id='PolicyGroup-MenuLinks-PolicyGroup_PolicyDetailCommissions']//div[@class='gw-label']");
	private static By MenuBC_Policy_TroubleTickets  = By.xpath("//div[@id='PolicyGroup-MenuLinks-PolicyGroup_PolicyDetailTroubleTickets']//div[@class='gw-label']");
	private static By MenuBC_Policy_Documents       = By.xpath("//div[@id='PolicyGroup-MenuLinks-PolicyGroup_PolicyDetailDocuments']//div[@class='gw-label']");
	private static By MenuBC_Policy_PolicyNotes     = By.xpath("//div[@id='PolicyGroup-MenuLinks-PolicyGroup_PolicyDetailNotes']//div[@class='gw-label']");
	private static By MenuBC_Policy_Ledger          = By.xpath("//div[@id='PolicyGroup-MenuLinks-PolicyGroup_PolicyDetailLedger]//div[@class='gw-label']");
	private static By MenuBC_Policy_Journal         = By.xpath("//div[@id='PolicyGroup-MenuLinks-PolicyGroup_PolicyDetailJournal']//div[@class='gw-label']");
	private static By MenuBC_Policy_Delinquencies   = By.xpath("//div[@id='PolicyGroup-MenuLinks-PolicyGroup_PolicyDetailDelinquencies']//div[@class='gw-label']");

	/*
	 * Actions
	 */
	private static By MenuBC_Policy_Actions_ChangePolicy = By.id("PolicyGroup-PolicyDetailMenuActions-PolicyDetailMenuActions_ChangePolicy");
	private static By MenuBC_Policy_Actions_RenewPolicy  = By.id("PolicyGroup-PolicyDetailMenuActions-PolicyDetailMenuActions_Renew");

	/*
	 * Producer Tab
	 */
	private static By TabBC_Producer                    = By.xpath("//div[@id='TabBar-ProducersTab']//div[@class='gw-label']");
	private static By TabBC_Producer_dd                 = By.xpath("//div[contains(@id,'TabBar-ProducersTab')]//div[3]");
	private static By TabBC_Producer_ProducerName       = By.xpath("//*[@id='TabBar-ProducersTab-ProducerNameSearchItem']/div/input");
	private static By TabBC_Producer_ProducerNameSearch = By.xpath("//*[@id='TabBar-ProducersTab-ProducerNameSearchItem_Button']/span");

	private static By TabBC_Producer_Actions_NewProducer = By.id("ProducersGroup-ProducersMenuActions-ProducersMenuActions_NewProducer");

	private static By MenuBC_Producer_Actions_NewCommPayment             = By.xpath("//div[@id='ProducerDetailGroup-ProducerMenuActions-ProducerMenuActions_NewCommissionPayment']//div[@class='gw-label']");
	private static By MenuBC_Producer_Actions_CommissionWriteOff         = By.xpath("//div[@id='ProducerDetailGroup-ProducerMenuActions-ProducerMenuActions_CommissionWriteoff']//div[@class='gw-label']");
	private static By MenuBC_Producer_Actions_CommissionRecoveryWriteOff = By.xpath("//div[@id='ProducerDetailGroup-ProducerMenuActions-ProducerMenuActions_CommissionRecoveryWriteoff']//div[@class='gw-label']");
	private static By MenuBC_Producer_Actions_ReturnCommission           = By.xpath("//div[@id='ProducerDetailGroup-ProducerMenuActions-ProducerMenuActions_ReturnCommission']//div[@class='gw-label']");
	private static By MenuBC_Producer_Actions_NewAgencyBillPayment       = By.xpath("//div[@id='ProducerDetailGroup-ProducerMenuActions-ProducerMenuActions_NewAgencyPayment']//div[@class='gw-label']");
	private static By MenuBC_Producer_Actions_TransferFunds              = By.xpath("//div[@id='ProducerDetailGroup-ProducerMenuActions-ProducerMenuActions_TransferFunds']//div[@class='gw-label']");
	private static By MenuBC_Producer_Actions_WriteOff                   = By.xpath("//div[@id='ProducerDetailGroup-ProducerMenuActions-ProducerMenuActions_Writeoff']//div[@class='gw-label']");
	private static By MenuBC_Producer_Actions_NegativeWriteOff           = By.xpath("//div[@id='ProducerDetailGroup-ProducerMenuActions-ProducerMenuActions_NegativeWriteoff']//div[@class='gw-label']");

	private static By MenuBC_Producer_Summary                        = By.xpath("//div[@id='ProducerDetailGroup-MenuLinks-ProducerDetailGroup_ProducerOverview-AccountOverview_AccountSummary']//div[@class='gw-label']");
	private static By MenuBC_Producer_Contacts                       = By.xpath("//div[@id='ProducerDetailGroup-MenuLinks-ProducerDetailGroup_ProducerDetailContacts']//div[@class='gw-label']");
	private static By MenuBC_Producer_Policies                       = By.xpath("//div[@id='ProducerDetailGroup-MenuLinks-ProducerDetailGroup_ProducerDetailContacts']//div[@class='gw-label']");
	private static By MenuBC_Producer_DirectBillCommissionStatements = By.xpath("//div[@id='ProducerDetailGroup-MenuLinks-ProducerDetailGroup_ProducerStatementOverview']//div[@class='gw-label']");
	private static By MenuBC_Producer_AgencyBillPayments             = By.xpath("//div[@id='ProducerDetailGroup-MenuLinks-ProducerDetailGroup_AgencyBillPayments']//div[@class='gw-label']");
	private static By MenuBC_Producer_AgencyBillDisbursements        = By.xpath("//div[@id='ProducerDetailGroup-MenuLinks-ProducerDetailGroup_AgencyBillDisbursements']//div[@class='gw-label']");
	private static By MenuBC_Producer_TroubleTickets                 = By.xpath("//div[@id='ProducerDetailGroup-MenuLinks-ProducerDetailGroup_ProducerDetailTroubleTickets']//div[@class='gw-label']");
	private static By MenuBC_Producer_Documents                      = By.xpath("//div[@id='ProducerDetailGroup-MenuLinks-ProducerDetailGroup_ProducerDetailDocuments']//div[@class='gw-label']");
	private static By MenuBC_Producer_Notes                          = By.xpath("//div[@id='ProducerDetailGroup-MenuLinks-ProducerDetailGroup_ProducerDetailNotes']//div[@class='gw-label']");
	private static By MenuBC_Producer_Transaction                    = By.xpath("//div[@id='ProducerDetailGroup-MenuLinks-ProducerDetailGroup_ProducerDetailNotes']//div[@class='gw-label']");
	private static By MenuBC_Producer_Ledger                         = By.xpath("//div[@id='ProducerDetailGroup-MenuLinks-ProducerDetailGroup_ProducerDetailLedger]//div[@class='gw-label']");
	private static By MenuBC_Producer_Transactions                   = By.xpath("//div[@id='ProducerDetailGroup-MenuLinks-ProducerDetailGroup_ProducerDetailTransactions']//div[@class='gw-label']");
	private static By MenuBC_Producer_Journal                        = By.xpath("//div[@id='ProducerDetailGroup-MenuLinks-ProducerDetailGroup_ProducerDetailJournal']//div[@class='gw-label']");

	/*
	 * Search Tab
	 */
	private static By TabBC_Search                          = By.xpath("//div[@id='TabBar-SearchTab']/div[@class='gw-label']");
	private static By TabBC_Search_dd                       = By.xpath("//div[@id='TabBar-SearchTab']/div[3]");
	private static By TabBC_Search_Accounts                 = By.id("TabBar-SearchTab-SearchGroup_AccountSearch");
	private static By TabBC_Search_Policies                 = By.id("TabBar-SearchTab-SearchGroup_PolicySearch");
	private static By TabBC_Search_Contacts                 = By.id("TabBar-SearchTab-SearchGroup_ContactSearch");
	private static By TabBC_Search_Invoices                 = By.id("TabBar-SearchTab-SearchGroup_InvoiceSearch");
	private static By TabBC_Search_Payments                 = By.id("TabBar-SearchTab-SearchGroup_PaymentSearch");
	private static By TabBC_Search_Producers                = By.id("TabBar-SearchTab-SearchGroup_ProducerSearch");
	private static By TabBC_Search_Transactions             = By.id("TabBar-SearchTab-SearchGroup_TransactionSearch");
	private static By TabBC_Search_Activities               = By.id("TabBar-SearchTab-SearchGroup_ActivitySearch");
	private static By TabBC_Search_TroubleTickets           = By.id("TabBar-SearchTab-SearchGroup_TroubleTicketSearch");
	private static By TabBC_Search_DelinquencyProcesses     = By.id("TabBar-SearchTab-SearchGroup_DelinquencyProcessSearch");
	private static By TabBC_Search_Disbursements            = By.id("TabBar-SearchTab-SearchGroup_DisbursementSearch");
	private static By TabBC_Search_OutgoingProducerPayments = By.id("TabBar-SearchTab-SearchGroup_OutgoingProducerPaymentSearch");
	private static By TabBC_Search_PaymentRequests          = By.id("TabBar-SearchTab-SearchGroup_PaymentRequestSearch");
	private static By TabBC_Search_DirectBillSuspenseItems  = By.id("TabBar-SearchTab-SearchGroup_DirectBillSuspenseItemSearch");

	/*
	 * Team Tab - SubMenu
	 */

	private static By TabBC_Team = By.xpath("//div[@id='TabBar-TeamTab']//div[@class='gw-label']");

	/*
	 * Administration Tab
	 */
	private static By TabBC_Administration                  = By.xpath("//div[@id='TabBar-AdminTab']/div[@class='gw-label']");
	private static By TabBC_Administration_dd               = By.xpath("//div[@id='TabBar-AdministrationTab']/div[3]");
	private static By TabBC_Administration_UsersAndSecurity = By.xpath("//div[@id='TabBar-AdministrationTab-Admin_UsersAndSecurity']/div[@class='gw-action--expand-button']");
	private static By TabBC_Administration_BusinessSettings = By.xpath("//div[@id='TabBar-AdministrationTab-Admin_BusinessSettings']/div[@class='gw-action--expand-button']");
	private static By TabBC_Administration_Monitoring       = By.xpath("//div[@id='TabBar-AdministrationTab-Admin_Monitoring']/div[@class='gw-action--expand-button']");
	private static By TabBC_Administration_Utilities        = By.xpath("//div[@id='TabBar-AdministrationTab-Admin_Utilities']/div[@class='gw-action--expand-button']");

	private static By MenuBC_Administration_Actions_NewBillingPlan           = By.id("Admin-AdminMenuActions-AdminMenuActions_NewBillingPlan");
	private static By MenuBC_Administration_Actions_NewPaymentPlan           = By.id("Admin-AdminMenuActions-AdminMenuActions_NewPaymentPlan");
	private static By MenuBC_Administration_Actions_NewCommissionPlan        = By.id("Admin-AdminMenuActions-AdminMenuActions_NewCommissionPlan");
	private static By MenuBC_Administration_Actions_NewDelinquencyPlan       = By.id("Admin-AdminMenuActions-AdminMenuActions_NewDelinquencyPlan");
	private static By MenuBC_Administration_Actions_NewAgencyBillPlan        = By.id("Admin-AdminMenuActions-AdminMenuActions_NewAgencyBillPlan");
	private static By MenuBC_Administration_Actions_NewReturnPremiumPlan     = By.id("Admin-AdminMenuActions-AdminMenuActions_NewReturnPremiumPlan");
	private static By MenuBC_Administration_Actions_NewPaymentAllocationPlan = By.id("Admin-AdminMenuActions-AdminMenuActions_NewPaymentAllocationPlan");
	private static By MenuBC_Administration_Actions_NewCollectionAgency      = By.id("Admin-AdminMenuActions-AdminMenuActions_NewCollectionAgency");
	private static By MenuBC_Administration_Actions_NewChargePattern         = By.id("Admin-AdminMenuActions-AdminMenuActions_NewChargePattern");
	private static By MenuBC_Administration_Actions_NewUser                  = By.id("Admin-AdminMenuActions-AdminMenuActions_NewUser");
	private static By MenuBC_Administration_Actions_NewRole                  = By.id("Admin-AdminMenuActions-AdminMenuActions_NewRole");
	private static By MenuBC_Administration_Actions_NewGroup                 = By.id("Admin-AdminMenuActions-AdminMenuActions_NewGroup");
	private static By MenuBC_Administration_Actions_NewAuthorityLimitProfile = By.id("Admin-AdminMenuActions-AdminMenuActions_NewAuthorityLimitProfile");

	private static By MenuBC_Administration_UsersAndSecurity       = By.id("Admin-AdminMenuActions-AdminMenuActions_NewAuthorityLimitProfile");
	private static By MenuBC_Administration_UsersAndSecurity_Users = By.id("Admin-AdminMenuActions-AdminMenuActions_NewAuthorityLimitProfile");

	private static By MenuBC_Administration_BusinessSettings                  = By.id("Admin-AdminMenuActions-AdminMenuActions_NewAuthorityLimitProfile");
	private static By MenuBC_Administration_BusinessSettings_ActivityPatterns = By.id("Admin-AdminMenuActions-AdminMenuActions_NewAuthorityLimitProfile");

	private static By MenuBC_Administration_Monitoring               = By.id("Admin-AdminMenuActions-AdminMenuActions_NewAuthorityLimitProfile");
	private static By MenuBC_Administration_Monitoring_MessageQueues = By.id("Admin-AdminMenuActions-AdminMenuActions_NewAuthorityLimitProfile");

	private static By MenuBC_Administration_Utilities            = By.id("Admin-AdminMenuActions-AdminMenuActions_NewAuthorityLimitProfile");
	private static By MenuBC_Administration_Utilities_ImportData = By.id("Admin-AdminMenuActions-AdminMenuActions_NewAuthorityLimitProfile");

	/*
	 * Menu Options ------------------------------------------------------------------------- ---- -------------------------------------
	 */

	private static By ActionsBC_Newfinal          = By.id("Group-MenuActions-NewAssignedActivity");
	private static By ActionsBC_NewSharedActivity = By.id("Group-MenuActions-NewSharedActivity");
	private static By ActionsBC_Preferences       = By.id("Group-MenuActions-MenuActions_UserPreferences");

	private static By DisbursementRun          = By.xpath("//div[text()='Disbursement']/ancestor::td/following-sibling::td[contains(@id,'RunBatchWithoutNotifyContent')]//div[contains(@id,'RunBatchWithoutNotify')]");
	private static By AutomaticDisbursementRun = By.xpath("//div[text()='Automatic Disbursement']/ancestor::td/following-sibling::td[contains(@id,'RunBatchWithoutNotifyContent')]//div[contains(@id,'RunBatchWithoutNotify')]");

	/*--------------------------------------------------------------------------------------
	 * Methods - Data
	 * --------------------------------------------------------------------------------------
	 */

	public static LinkedHashMap<String, String> getData_BillingCenter(String strTable) throws Throwable {

		return Selenium_Utils_DataBase.getData_MSExcel_WorkBook_WorkSheet_Fillo(pTestDataFile_BillingCenter, strTable, strTestCaseName);

	}

	public static LinkedHashMap<String, String> getData_Row_BillingCenter(String strTable, int SecondKey) throws Throwable {

		return Selenium_Utils_DataBase.getData_MSExcel_WorkBook_WorkSheet_DataSet_Fillo(pTestDataFile_BillingCenter, strTable, strTestCaseName, SecondKey);

	}

	public static void UpdateData_BillingCenter(String strTable, String strColumn, String strValue) throws Throwable {

		Selenium_Utils_DataBase.UpdateData_MSExcel_WorkSheet_Column_Fillo(pTestDataFile_BillingCenter, strTable, strColumn, strValue);

	}

	/*--------------------------------------------------------------------------------------
	 * Methods
	 * --------------------------------------------------------------------------------------
	 */

	public static void launch_BillingCenter() throws Throwable {
		// Kill Policy Center
		// driver.close();

		url               = strURL_BillingCenter;
		pTestDataFilePath = pTestDataFile_BillingCenter;

		/*
		 * GW_GetDriver objdriver= new GW_GetDriver(); objdriver.getDriver();
		 */

		driver.get(url);
		oExtentTest.log(Status.PASS, "Launched BillingCenter Environment = " + StrENVIRONMENT + "URL = " + url);

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		oWebDriverWait = new WebDriverWait(driver, 5);

	}

	public static void login_BillingCenter_User(String strUser) throws Throwable {

		try {
			launch_BillingCenter();

			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkBook_WorkSheet_Fillo(pTestDataFile_BillingCenter, "login", strUser);

			GuidewireAutomate("Username", GW_Username, "sendKeys", lhm_TestCase_Table_Data.get("GW_Username"));
			GuidewireAutomate("Password", GW_Password, "sendKeys", lhm_TestCase_Table_Data.get("GW_Password"));
			// GuidewireAutomate("Password", Password, "sendKeys", new
			// String(Base64.getEncoder().encode(lhm_Data.get("TD_Password").getBytes())));
			oExtentTest.addScreenCaptureFromPath(Selenium_Reporting_Utils.getScreenShot_Robot_createScreenCapture(driver));

			GuidewireAutomate("Login", GW_Login_Button, "clickAndwait", "click");

			oExtentTest.log(Status.PASS, "Login succesful");
			oExtentTest.addScreenCaptureFromPath(Selenium_Reporting_Utils.getScreenShot_Robot_createScreenCapture(driver));
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void logout_BillingCenter() throws Throwable {
		try {

			GuidewireAutomate("Setting", GW_Setting_Link, "clickAndwait", "click");
			GuidewireAutomate("Logout", GW_Logout_Link, "clickAndwait", "click");

			oExtentTest.log(Status.PASS, "Logout is succesful");
			oExtentTest.addScreenCaptureFromPath(Selenium_Reporting_Utils.getScreenShot_Robot_createScreenCapture(driver));
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

	/*--------------------------------------------------------------------------------------
	 * BillingCenter Tabs Methods
	 * --------------------------------------------------------------------------------------
	 */

	public static void bcTabNavigation(String Tab, String Value) throws Throwable {

		switch (Tab) {

			case "My Activities" :
				GuidewireAutomate("Desktop Tab", TabBC_Desktop_dd, "clickAndwait", "click");
				GuidewireAutomate("MyActivities", TabBC_Desktop_MyActivities, "clickAndwait", "click");
				break;
			case "My Approval Requests" :
				GuidewireAutomate("Desktop Tab", TabBC_Desktop_dd, "clickAndwait", "click");
				GuidewireAutomate("MyApprovalRequests", TabBC_Desktop_MyApprovalRequests, "clickAndwait", "click");
				break;
			case "My Trouble Tickets" :
				GuidewireAutomate("Desktop Tab", TabBC_Desktop_dd, "clickAndwait", "click");
				GuidewireAutomate("MyTroubleTickets", TabBC_Desktop_MyTroubleTickets, "clickAndwait", "click");
				break;
			case "My Delinquencies" :
				GuidewireAutomate("Desktop Tab", TabBC_Desktop_dd, "clickAndwait", "click");
				GuidewireAutomate("MyDelinquencies", TabBC_Desktop_MyDelinquencies, "clickAndwait", "click");
				break;
			case "Disbursements" :
				GuidewireAutomate("Desktop Tab", TabBC_Desktop_dd, "clickAndwait", "click");
				GuidewireAutomate("Disbursements", TabBC_Desktop_Disbursements, "clickAndwait", "click");
				break;
			case "Suspense Payments" :
				GuidewireAutomate("Desktop Tab", TabBC_Desktop_dd, "clickAndwait", "click");
				GuidewireAutomate("SuspensePayments", TabBC_Desktop_SuspensePayments, "clickAndwait", "click");
				break;
			case "My Agency Items" :
				GuidewireAutomate("Desktop Tab", TabBC_Desktop_dd, "clickAndwait", "click");
				GuidewireAutomate("MyAgencyItems", TabBC_Desktop_MyAgencyItems, "clickAndwait", "click");
				break;
			case "Held Charges" :
				GuidewireAutomate("Actions", TabBC_Desktop_dd, "clickAndwait", "click");
				GuidewireAutomate("HeldCharges", TabBC_Desktop_HeldCharges, "clickAndwait", "click");
				break;

			case "New Account" :
				GuidewireAutomate("Account", TabBC_Account, "clickAndwait", "click");
				GuidewireAutomate("NewAccount", MenuBC_Actions_NewAccount, "clickAndwait", "click");
				break;
			case "Acct Search" :
				GuidewireAutomate("Account Tab", TabBC_Account_dd, "clickAndwait", "click");
				GuidewireAutomate("Account Number", TabBC_Account_AccountNumber, "clearANDsendKeys", Value);
				GuidewireAutomate("AccountNumberSearch", TabBC_Account_AccountNumber_Search, "clickAndwait", "click");
				break;

			case "Policy Search" :
				GuidewireAutomate("Policy Tab", TabBC_Policy_dd, "clickAndwait", "click");
				getStaleElement("Policy Number", TabBC_Policy_PolicyNumber);
				GuidewireAutomate("Policy Number", TabBC_Policy_PolicyNumber, "clearANDsendKeys", Value);
				GuidewireAutomate("PolicyNumberSearch", TabBC_Policy_PolicyNumber_Search, "clickAndwait", "click");
				break;

			case "Producer Search" :
				GuidewireAutomate("Producer Tab", TabBC_Producer_dd, "clickAndwait", "click");
				GuidewireAutomate("Producer Name", TabBC_Producer_ProducerName, "clearANDsendKeys", Value);
				GuidewireAutomate("ProducerName Search", TabBC_Producer_ProducerNameSearch, "clickAndwait", "click");
				break;

			/*
			 * Search
			 */
			case "Search Accounts" :
				GuidewireAutomate("Search Tab", TabBC_Search_dd, "clickAndwait", "click");
				GuidewireAutomate("Search Accounts", TabBC_Search_Accounts, "clickAndwait", "click");
			case "Search Policies" :
				GuidewireAutomate("Search Tab", TabBC_Search_dd, "clickAndwait", "click");
				GuidewireAutomate("Search Policies", TabBC_Search_Policies, "clickAndwait", "click");
				break;
			case "Search Contacts" :
				GuidewireAutomate("Search Tab", TabBC_Search_dd, "clickAndwait", "click");
				GuidewireAutomate("Search Contacts", TabBC_Search_Contacts, "clickAndwait", "click");
				break;
			case "Search Invoices" :
				GuidewireAutomate("Search Tab", TabBC_Search_dd, "clickAndwait", "click");
				GuidewireAutomate("Search Invoices", TabBC_Search_Invoices, "clickAndwait", "click");
				break;
			case "Search Payments" :
				GuidewireAutomate("Search Tab", TabBC_Search_dd, "clickAndwait", "click");
				GuidewireAutomate("Search Payments", TabBC_Search_Payments, "clickAndwait", "click");
				break;
			case "Search Producers" :
				GuidewireAutomate("Search Tab", TabBC_Search_dd, "clickAndwait", "click");
				GuidewireAutomate("Search Producers", TabBC_Search_Producers, "clickAndwait", "click");
				break;
			case "Search Transactions" :
				GuidewireAutomate("Search Tab", TabBC_Search_dd, "clickAndwait", "click");
				GuidewireAutomate("Search Transactions", TabBC_Search_Transactions, "clickAndwait", "click");
				break;
			case "Search Activities" :
				GuidewireAutomate("Search Tab", TabBC_Search_dd, "clickAndwait", "click");
				GuidewireAutomate("Search Activities", TabBC_Search_Activities, "clickAndwait", "click");
				break;
			case "Search Trouble Tickets" :
				GuidewireAutomate("Search Tab", TabBC_Search_dd, "clickAndwait", "click");
				GuidewireAutomate("Search TroubleTickets", TabBC_Search_TroubleTickets, "clickAndwait", "click");
				break;
			case "Search Delinquency Processes" :
				GuidewireAutomate("Search Tab", TabBC_Search_dd, "clickAndwait", "click");
				GuidewireAutomate("Search DelinquencyProcesses", TabBC_Search_DelinquencyProcesses, "clickAndwait", "click");
				break;
			case "Search Disbursements" :
				GuidewireAutomate("Search Tab", TabBC_Search_dd, "clickAndwait", "click");
				GuidewireAutomate("Search Disbursements", TabBC_Search_Disbursements, "clickAndwait", "click");
				break;
			case "Search Outgoing Producer Payments" :
				GuidewireAutomate("Search Tab", TabBC_Search_dd, "clickAndwait", "click");
				GuidewireAutomate("Search OutgoingProducerPayments", TabBC_Search_OutgoingProducerPayments, "click", "click");
				break;
			case "Search Payment Requests" :
				GuidewireAutomate("Search Tab", TabBC_Search_dd, "clickAndwait", "click");
				GuidewireAutomate("Search PaymentRequests", TabBC_Search_PaymentRequests, "clickAndwait", "click");
				break;
			case "Search Direct Bill Suspense Items " :
				GuidewireAutomate("Search Tab", TabBC_Search_dd, "clickAndwait", "click");
				GuidewireAutomate("Search DirectBillSuspenseItem", TabBC_Search_DirectBillSuspenseItems, "clickAndwait", "click");
				break;

			/*
			 * AdministrationTab
			 */
			case "Users_and_Security" :
				GuidewireAutomate("AdministrationTab", TabBC_Administration_dd, "clickAndwait", "click");
				GuidewireAutomate("Users_and_Security", TabBC_Administration_UsersAndSecurity, "clickAndwait", "click");
				break;
			case "Business Settings" :
				GuidewireAutomate("AdministrationTab", TabBC_Administration_dd, "clickAndwait", "click");
				GuidewireAutomate("Business_Settings", TabBC_Administration_BusinessSettings, "clickAndwait", "click");
				break;
			case "Monitoring" :
				GuidewireAutomate("AdministrationTab", TabBC_Administration_dd, "clickAndwait", "click");
				GuidewireAutomate("Monitoring", TabBC_Administration_Monitoring, "clickAndwait", "click");
				break;
			case "Utilities" :
				GuidewireAutomate("AdministrationTab", TabBC_Administration_dd, "clickAndwait", "click");
				GuidewireAutomate("Utilities", TabBC_Administration_Utilities, "clickAndwait", "click");
				break;

			default :
				throw new IOException("No support for Tab : " + Tab);
		}

		oExtentTest.addScreenCaptureFromPath(SeleniumWebDriver_Commands.getScreenShot_addScreenCaptureFromPath(driver));
		oExtentTest.log(Status.INFO, "Navigation to BillingCenter Tab : " + Tab + " is Succesful");

	}

	/*--------------------------------------------------------------------------------------
	 * BillingCenter menu Methods
	 * --------------------------------------------------------------------------------------
	 */

	public static void bcMenuNavigation(String Menu) throws Throwable {
		switch (Menu) {

			case "My Activities" :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("New Payment", MenuBC_Desktop_MyActivities, "clickAndwait", "click");
				break;

			case "New Assigned Activity" :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("New Payment", MenuBC_Desktop_Actions_NewAssignedActivity, "clickAndwait", "click");
				break;
			case "New Shared Activity" :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("New Shared Activity", MenuBC_Desktop_Actions_NewSharedActivity, "clickAndwait", "click");
				break;
			case "Preferences" :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("Preferences", MenuBC_Desktop_Actions_Preferences, "clickAndwait", "click");
				break;

			case "New Account" :
				GuidewireAutomate("Account Tab", TabBC_Account, "clickAndwait", "click");
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("New Account", MenuBC_Actions_NewAccount, "clickAndwait", "click");
				break;
			case "Accounts" :
				GuidewireAutomate("Account Tab", TabBC_Account, "clickAndwait", "click");
				GuidewireAutomate("New Account", MenuBC_Accounts, "clickAndwait", "click");
				break;

			case "Add Policy" :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("Add Policy", MenuBC_Account_Actions_AddPolicy, "clickAndwait", "click");
				break;
			case "New Payment" :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("New Payment", MenuBC_Account_Actions_NewPayment, "clickAndwait", "click");
				break;
			case "New Direct Bill Payment" :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("New Payment", MenuBC_Account_Actions_NewPayment, "moveToElement", "moveToElement");
				GuidewireAutomate("New Payment", MenuBC_Account_Actions_NewPayment_NewDirectBillPayment, "clickAndwait", "click");
				break;
			case "New Transaction" :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("New Transaction", MenuBC_Account_Actions_NewTransaction, "clickAndwait", "click");
				break;
			case "New Transaction Disbursement" :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("New Transaction", MenuBC_Account_Actions_NewTransaction, "moveToElement", "moveToElement");
				GuidewireAutomate("Disbursement", MenuBC_Account_Actions_NewTransaction_Disbursement, "clickAndwait", "click");
				break;
			case "Transfer Policies " :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("Transfer Policies", MenuBC_Account_Actions_TransferPolicies, "clickAndwait", "click");
				break;
			case "New Note" :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("New Note", MenuBC_Account_Actions_NewNote, "clickAndwait", "click");
				break;
			case "New Document" :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("New Document", MenuBC_Account_Actions_NewDocument, "clickAndwait", "click");
				break;
			case "New Email" :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("New Email", MenuBC_Account_Actions_NewEmail, "clickAndwait", "click");
				break;
			/*
			 * Account Menu Links
			 */
			case "Summary" :
				GuidewireAutomate("Summary", MenuBC_Account_Summary, "clickAndwait", "click");
				break;
			case "Details" :
				GuidewireAutomate("Details", MenuBC_Account_Details, "clickAndwait", "click");
				break;
			case "Contacts" :
				GuidewireAutomate("Contacts", MenuBC_Account_Contacts, "clickAndwait", "click");
				break;
			case "Funds Tracking" :
				GuidewireAutomate("Funds Tracking", MenuBC_Account_FundsTracking, "clickAndwait", "click");
				break;
			case "Payments" :
				getStaleElement("Payments", MenuBC_Account_Payments);
				GuidewireAutomate("Payments", MenuBC_Account_Payments, "clickAndwait", "click");
				break;
			case "Charges" :
				GuidewireAutomate("New Email", MenuBC_Account_Charges, "clickAndwait", "click");
				break;
			case "Charge Reversal" :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("New Transaction", MenuBC_Account_Actions_NewTransaction, "moveToElement", "moveToElement");
				GuidewireAutomate("Charge Reversal", MenuBC_Account_Actions_ChargeReversal, "clickAndwait", "click");
				break;
			case "Disbursements" :
				GuidewireAutomate("Disbursements", MenuBC_Account_Disbursements, "clickAndwait", "click");
				break;
			case "Transactions" :
				GuidewireAutomate("New Email", MenuBC_Account_Transactions, "clickAndwait", "click");
				break;
			case "Collateral" :
				GuidewireAutomate("New Email", MenuBC_Account_Collateral, "clickAndwait", "click");
				break;
			case "Policies" :
				GuidewireAutomate("New Email", MenuBC_Account_Policies, "clickAndwait", "click");
				break;
			case "History" :
				GuidewireAutomate("New Email", MenuBC_Account_History, "clickAndwait", "click");
				break;
			case "Evaluation" :
				GuidewireAutomate("New Email", MenuBC_Account_Evaluation, "clickAndwait", "click");
				break;
			case "Invoices" :
				GuidewireAutomate("Invoices", MenuBC_Account_Invoices, "clickAndwait", "click");
				break;
			case "Invoice Streams" :
				GuidewireAutomate("Invoice Streams", MenuBC_Account_InvoiceStreams, "clickAndwait", "click");
				break;
			case "TroubleTickets" :
				GuidewireAutomate("TroubleTickets", MenuBC_Account_TroubleTickets, "clickAndwait", "click");
				break;
			case "Documents" :
				GuidewireAutomate("Documents", MenuBC_Account_Documents, "clickAndwait", "click");
				break;
			case "Ledger" :
				GuidewireAutomate("Ledger", MenuBC_Account_Ledger, "clickAndwait", "click");
				break;
			case "Journal" :
				GuidewireAutomate("Journal", MenuBC_Account_Journal, "clickAndwait", "click");
				break;
			case "Delinquencies" :
				GuidewireAutomate("Delinquencies", MenuBC_Account_Delinquencies, "clickAndwait", "click");
				break;
			/*
			 * Policy
			 */
			case "Change Policy" :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("Change Policy", MenuBC_Policy_Actions_ChangePolicy, "clickAndwait", "click");
				break;
			case "Renew Policy" :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("Renew Policy", MenuBC_Policy_Actions_RenewPolicy, "clickAndwait", "click");
				break;

			case "Payment Schedule" :
				GuidewireAutomate("Payment Schedule", MenuBC_Policy_PaymentSchedule, "clickAndwait", "click");
				break;

			/*
			 * Producer
			 */
			case "New Producer" :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("New Producer", TabBC_Producer_Actions_NewProducer, "clickAndwait", "click");
				break;

			case "New Comm Payment" :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("New Comm Payment", MenuBC_Producer_Actions_NewCommPayment, "clickAndwait", "click");
				break;
			case "Commission Write-Off" :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("Commission Write-Off", MenuBC_Producer_Actions_CommissionWriteOff, "clickAndwait", "click");
				break;
			case "Commission Recovery Write-Off" :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("Commission Recovery Write-Off", MenuBC_Producer_Actions_CommissionRecoveryWriteOff, "clickAndwait", "click");
				break;
			case "Return Commission" :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("Return Commission", MenuBC_Producer_Actions_ReturnCommission, "clickAndwait", "click");
				break;
			case "New Agency Bill Payment" :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("New Agency Bill Payment", MenuBC_Producer_Actions_NewAgencyBillPayment, "click", "click");
				break;
			case "Transfer Funds" :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("Transfer Funds", MenuBC_Producer_Actions_TransferFunds, "clickAndwait", "click");
				break;
			case "Write-Off" :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("Write-Off", MenuBC_Producer_Actions_WriteOff, "clickAndwait", "click");
				break;
			case "Negative Write-Off" :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("Negative Write-Off", MenuBC_Producer_Actions_NegativeWriteOff, "clickAndwait", "click");
				break;

			case "Direct Bill Commission Statements" :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("Negative Write-Off", MenuBC_Producer_DirectBillCommissionStatements, "clickAndwait", "click");
				break;
			case "Agency Bill Disbursements" :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("Negative Write-Off", MenuBC_Producer_AgencyBillDisbursements, "clickAndwait", "click");
				break;

			/*
			 * Administration
			 */
			case "New Billing Plan" :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("NewBillingPlan", MenuBC_Administration_Actions_NewBillingPlan, "clickAndwait", "click");
				break;
			case "New Payment Plan" :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("NewPaymentPlan", MenuBC_Administration_Actions_NewPaymentPlan, "clickAndwait", "click");
				break;
			case "New Commission Plan" :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("NewCommissionPlan", MenuBC_Administration_Actions_NewCommissionPlan, "clickAndwait", "click");
				break;
			case "New Delinquency Plan" :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("NewDelinquencyPlan", MenuBC_Administration_Actions_NewDelinquencyPlan, "clickAndwait", "click");
				break;
			case "New Agency Bill Plan" :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("NewAgencyBillPlan", MenuBC_Administration_Actions_NewAgencyBillPlan, "clickAndwait", "click");
				break;
			case "New Return Premium Plan" :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("NewReturnPremiumPlan", MenuBC_Administration_Actions_NewReturnPremiumPlan, "click", "click");
				break;
			case "New Payment Allocation Plan" :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("NewPaymentAllocationPlan", MenuBC_Administration_Actions_NewPaymentAllocationPlan, "clickAndwait", "click");
				break;
			case "New Collection Agency" :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("NewCollectionAgency", MenuBC_Administration_Actions_NewCollectionAgency, "click", "click");
				break;
			case "New Charge Pattern" :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("NewChargePattern", MenuBC_Administration_Actions_NewChargePattern, "clickAndwait", "click");
				break;
			case "New User" :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("NewUser", MenuBC_Administration_Actions_NewUser, "clickAndwait", "click");
				break;
			case "New Role" :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("NewRole", MenuBC_Administration_Actions_NewRole, "clickAndwait", "click");
				break;
			case "New Group" :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("NewGroup", MenuBC_Administration_Actions_NewGroup, "clickAndwait", "click");
				break;
			case "New Authority Limit Profile" :
				GuidewireAutomate("Actions", Menu_Actions, "clickAndwait", "click");
				GuidewireAutomate("NewAuthorityLimitProfile", MenuBC_Administration_Actions_NewAuthorityLimitProfile, "clickAndwait", "click");
				break;
			/*
			 * Menu Links
			 */
			case "Users Security" :
				GuidewireAutomate("NewAuthorityLimitProfile", MenuBC_Administration_UsersAndSecurity, "clickAndwait", "click");
				break;
			case "Users" :
				GuidewireAutomate("NewAuthorityLimitProfile", MenuBC_Administration_UsersAndSecurity_Users, "click", "click");
				break;
			case "Business Settings" :
				GuidewireAutomate("NewAuthorityLimitProfile", MenuBC_Administration_BusinessSettings, "clickAndwait", "click");
				break;
			case "Activity Patterns" :
				GuidewireAutomate("NewAuthorityLimitProfile", MenuBC_Administration_BusinessSettings_ActivityPatterns, "clickAndwait", "click");
				break;
			case "Monitoring" :
				GuidewireAutomate("NewAuthorityLimitProfile", MenuBC_Administration_Monitoring, "clickAndwait", "click");
				break;
			case "Message Queues" :
				GuidewireAutomate("NewAuthorityLimitProfile", MenuBC_Administration_Monitoring_MessageQueues, "click", "click");
				break;
			case "Utilities" :
				GuidewireAutomate("NewAuthorityLimitProfile", MenuBC_Administration_Utilities, "clickAndwait", "click");
				break;
			case "Import Data" :
				GuidewireAutomate("NewAuthorityLimitProfile", MenuBC_Administration_Utilities_ImportData, "clickAndwait", "click");
				break;
			default :
				throw new IOException("No support for Tab : " + Menu);
		}
		oExtentTest.addScreenCaptureFromPath(SeleniumWebDriver_Commands.getScreenShot_addScreenCaptureFromPath(driver));
		oExtentTest.log(Status.INFO, "Navigation to BillingCenter Menu : " + Menu + " is succesful");

	}

	/*--------------------------------------------------------------------------------------
	 * BillingCenter infoBar Methods
	 * --------------------------------------------------------------------------------------
	 */

	public static String infoBar(String strLabel) throws Throwable {
		String strInfobar = null;

		switch (strLabel) {
			case "Job" :
				strInfobar = getText_Element(InfoBar_Job);
				UpdateData_BillingCenter("searchValues", "Job", strInfobar);
				break;
			case "SubmissionNumber" :
				strInfobar = getText_Element(InfoBar_SubmissionNumber);
				strInfobar = strInfobar.substring("Submission".length() + 1, strInfobar.length());
				UpdateData_BillingCenter("searchValues", "SubmissionNumber", strInfobar);
				break;
			case "Workflow" :
				strInfobar = getText_Element(InfoBar_Workflow);
				UpdateData_BillingCenter("searchValues", "Workflow", strInfobar);
				break;
			case "LOB" :
				strInfobar = getText_Element(InfoBar_LOB);
				UpdateData_BillingCenter("searchValues", "LOB", strInfobar);
				break;
			case "EffectiveDate" :
				strInfobar = getText_Element(InfoBar_EffectiveDate);
				UpdateData_BillingCenter("searchValues", "EffectiveDate", strInfobar);
				break;
			case "Status" :
				strInfobar = getText_Element(InfoBar_Status);
				UpdateData_BillingCenter("searchValues", "Status", strInfobar);
				break;
			case "AccountName" :
				strInfobar = getText_Element(InfoBar_AccountName);
				UpdateData_BillingCenter("searchValues", "AccountName", strInfobar);
				break;
			case "AccountNumber" :
				strInfobar = getText_Element(InfoBar_AccountNumber);
				UpdateData_BillingCenter("searchValues", "AccountNumber", strInfobar);
				break;
			case "PolicyNumber" :
				strInfobar = getText_Element(InfoBar_PolicyNumber);
				UpdateData_BillingCenter("searchValues", "PolicyNumber", strInfobar);
				break;
			case "EditLock" :
				strInfobar = getText_Element(InfoBar_EditLock);
				break;
			case "Underwriter" :
				strInfobar = getText_Element(InfoBar_Underwriter);
				break;
			default :
				throw new IOException("No support for Label : " + strLabel);
		}
		oExtentTest.log(Status.INFO, " Fetched from Info Bar => " + strLabel + " = " + strInfobar);
		return strInfobar;
	}

	/*--------------------------------------------------------------------------------------
	 * BillingCenter Button menu Methods
	 * --------------------------------------------------------------------------------------
	 */
	public static void clickButton(String ButtonName) throws Throwable {
		switch (ButtonName) {
			case "Search" :
				GuidewireAutomate("Search", Search_Button, "clickAndwait", "click");
				break;
			case "Select" :
				GuidewireAutomate("Select", Select_Button, "clickAndwait", "click");
				break;
			case "Reset" :
				GuidewireAutomate("Reset", Reset_Button, "clickAndwait", "click");
				break;
			case "OK" :
				GuidewireAutomate("OK", OK_Button, "clickAndwait", "click");
				break;
			case "Update" :
				getStaleElement("Update", Update_Button);
				GuidewireAutomate("Update", Update_Button, "clickAndwait", "click");
				break;
			case "Cancel" :
				GuidewireAutomate("Cancel", Cancel_Button, "clickAndwait", "click");
				break;
			case "Back" :
				GuidewireAutomate("Back", Back_Button, "clickAndwait", "click");
				break;
			case "Next" :
				getStaleElement("Next", Next_Button);
				GuidewireAutomate("Next", Next_Button, "clickAndwait", "click");
				break;
			case "Release Lock" :
				GuidewireAutomate("Release Lock", ReleaseLock_Button, "clickAndwait", "click");
				break;
			case "Edit Policy Transaction" :
				GuidewireAutomate("Edit Policy Transaction", EditPolicyTransaction_Button, "clickAndwait", "click");
				GuidewireAutomate_Handle("alertaccept", "NA");
				break;
			case "Quote" :
				GuidewireAutomate("Quote", Quote_Button, "clickAndwait", "click");
				break;
			case "Save Draft" :
				GuidewireAutomate("Save Draft", SaveDraft_Button, "clickAndwait", "click");
				break;
			case "Versions" :
				GuidewireAutomate("Versions", Versions_Button, "clickAndwait", "click");
				break;
			case "Start Multi Version" :
				GuidewireAutomate("Start Multi Version", Start_MultiVersion_Button, "clickAndwait", "click");
				break;
			case "Start Side By Side" :
				GuidewireAutomate("Start Side By Side", Start_SideBySide_Button, "clickAndwait", "click");
				break;
			case "Bind Options" :
				GuidewireAutomate("Bind Options", BindOptions_Button, "click", "");
				break;
			case "Bind Only" :
				GuidewireAutomate("Bind Only", BindOptions_BindOnly_Button, "clickAndwait", "click");
				GuidewireAutomate_Handle("alertaccept", "NA");
				GuidewireAutomate_Validation("Infobar Job", InfoBar_Job, "equals", "Submission (Bound)");
				break;
			case "Issue Policy" :
				GuidewireAutomate("Issue Policy", Bindoptions_IssuePolicy_Button, "clickAndwait", "click");
				GuidewireAutomate_Handle("alertaccept", "NA");
				GuidewireAutomate_Validation("Infobar Job", InfoBar_Job, "equals", "Submission (Bound)");
				break;
			case "Close Options" :
				GuidewireAutomate("Close Options", CloseOptions_Button, "click", "");
				break;
			case "Withdraw Transaction" :
				GuidewireAutomate("Withdraw Transaction", CloseOptions_WithdrawTransaction_Button, "click", "");
				GuidewireAutomate_Handle("alertaccept", "NA");
				GuidewireAutomate_Validation("Infobar Job", InfoBar_Job, "equals", "Submission (Withdrawn)");
				break;
			case "Decline" :
				GuidewireAutomate("Decline", CloseOptions_Decline_Button, "clickAndwait", "click");
				GuidewireAutomate_Handle("alertaccept", "NA");
				break;
			case "Not Taken" :
				GuidewireAutomate("Not Taken", CloseOptions_NotTaken_Button, "clickAndwait", "click");
				GuidewireAutomate_Handle("alertaccept", "NA");
				break;
			case "Print Quote" :
				GuidewireAutomate("Print Quote", PrintQuote_Button, "clickAndwait", "click");
				break;
			case "Withdraw Transaction1" :
				GuidewireAutomate("Withdraw Transaction", WithdrawTransaction_Button, "clickAndwait", "click");
				break;
			case "Finish" :
				GuidewireAutomate("Finish", Finish, "clickAndwait", "click");
				break;

			default :
				throw new IOException("No support for Button : " + ButtonName);
		}
	}

	/*--------------------------------------------------------------------------------------
	 * BillingCenter Tab Search Methods
	 * --------------------------------------------------------------------------------------
	 */

	public static void bcTabNavigation_Acct_Search() throws Throwable {
		lhm_TestCase_Table_Data = getData_BillingCenter("master");

		strAccountNumber = lhm_TestCase_Table_Data.get("AccountNumber");

		bcTabNavigation("Acct Search", strAccountNumber);
		GuidewireAutomate_Validation("Screen Header", BC_AccountSummary.AS_Header, "equals", "Account Summary");
		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();

	}

	public static void bcTabNavigation_Sub_Search() throws Throwable {
		lhm_TestCase_Table_Data = getData_BillingCenter("searchValues");

		strSubmissionNumber = lhm_TestCase_Table_Data.get("SubmissionNumber");

		bcTabNavigation("Sub Search", strSubmissionNumber);

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();

	}

	public static void bcTabNavigation_Policy_Search() throws Throwable {
		lhm_TestCase_Table_Data = getData_BillingCenter("searchValues");

		strPolicyNumber = lhm_TestCase_Table_Data.get("PolicyNumber");

		bcTabNavigation("Policy Search", strPolicyNumber);

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();

	}

	/*--------------------------------------------------------------------------------------
	 * BillingCenter Batch Methods
	 * --------------------------------------------------------------------------------------
	 */

	public static void InternalTools() throws Throwable {

		try {
			GuidewireAutomate(" Internal Tools", Internal_Tools, "clickAndwait", "click");
			GuidewireAutomate("System clock", System_clock, "clickAndwait", "click");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		// GuidewireAutomate_Validation("InvoicesStream Delequencies", InvoicesStream_Delequencies, "equals", "Invoice Streams");

	}
	public static void RunBatch_Invoice() throws Throwable {

		try {

			GuidewireAutomate_Validation("Screen Header", BatchScreen_Header, "equals", "Batch Process Info");
			GuidewireAutomate("Invoice Run", Batch_Invoices, "clickAndwait", "click");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;

		}

	}

	public static void RobotKey() throws Throwable {

		try {
			GuidewireAutomate("System clock", System_clock, "ALTSHIFTT", "click");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

	public static void ReturnToBillingCenter() throws Throwable {

		try {
			GuidewireAutomate("Action Run", Menu_Actions, "clickAndwait", "click");
			GuidewireAutomate("Return To Billing Center", Action_ReturnBillingCenter, "clickAndwait", "click");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void RunBatch_Disbursement() throws Throwable {

		try {
			getStaleElement("Screen Header", Screen_Header);
			GuidewireAutomate_Validation("Screen Header", Screen_Header, "equals", "Batch Process Info");
			GuidewireAutomate("Disbursement Run", DisbursementRun, "clickAndwait", "click");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;

		}

	}
	public static void RunBatch_AutomaticDisbursement() throws Throwable {

		try {

			GuidewireAutomate_Validation("Screen Header", Screen_Header, "equals", "Batch Process Info");
			GuidewireAutomate("Disbursement Run", AutomaticDisbursementRun, "clickAndwait", "click");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;

		}

	}

}
