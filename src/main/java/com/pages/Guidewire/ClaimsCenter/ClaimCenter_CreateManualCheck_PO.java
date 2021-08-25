package com.pages.Guidewire.ClaimsCenter;

import org.openqa.selenium.By;

public interface ClaimCenter_CreateManualCheck_PO {

	final By clicknAction = By.xpath("//*[@id='Claim-ClaimMenuActions']/div[1]/div[2]/div");
	final By actinSubmenu1 = By.xpath("//*[@id='Claim-ClaimMenuActions']/div[3]");
	final By actinSubmenu2 = By.xpath(
			"//*[@id='Claim-ClaimMenuActions-ClaimMenuActions_NewTransaction-ClaimMenuActions_NewTransaction_CheckSet']/div/div[2]");
	final By payeeName = By
			.name("NormalCreateCheckWizard-CheckWizard_CheckPayeesScreen-NewCheckPayeeDV-PrimaryPayee_Name");
	final By type = By.name("NormalCreateCheckWizard-CheckWizard_CheckPayeesScreen-NewCheckPayeeDV-PrimaryPayee_Type");
	final By next = By.id("NormalCreateCheckWizard-Next");

	final By Enterpayeeinformation_Header = By
			.xpath("//div[contains(@id,'CheckPayeesScreen-ttlBar')]//div[@class='gw-TitleBar--title']");
	final By Enterpaymentinformation_Header = By
			.xpath("//div[contains(@id,'CheckPaymentsScreen-ttlBar')]//div[@class='gw-TitleBar--title']");
	// Setcheckinstructions
	final By Setcheckinstructions_Header = By.xpath(
			"//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and contains(text(),'Step 3 of 3: Set check instructions')]");

	final By SCI_PayToTheOrderOf = By.xpath(
			"//div[contains(@id,'CheckWizardCheckSummaryInputSet-Check_PayTo')]//div[@class='gw-value-readonly-wrapper']");
	final By SCI_MailingAddress = By.xpath(
			"//div[contains(@id,'CheckWizardCheckSummaryInputSet-Check_MailTo_Input')]//div[@class='gw-value-readonly-wrapper']");
	/*
	 * CheckDetails
	 */

	final By CD_PrimaryPayee_Namee = By.xpath("//select[contains(@name,'PrimaryPayee_Name')]");
	final By CD_CheckIssuance_CheckNumber = By.xpath("//input[contains(@name,'CheckNumber')]");

	/*
	 * Payment Details
	 */
	final By PD_ReserveLine = By.xpath("//select[contains(@name,'ReserveLineInputSet-ReserveLine')]");
	final By PD_Coverage = By.xpath(
			"//div[contains(@id,'ReserveLineInputSet-Coverage')]//div[@class='gw-RangeValue']/div[@class='gw-label']");
	final By PD_PaymentType = By.xpath("//select[contains(@name,'Payment_PaymentType')]");
	final By PD_CostType = By.xpath("//select[contains(@name,'ReserveLineInputSet-CostType')]");
	final By PD_CostCategory = By.xpath("//select[contains(@name,'ReserveLineInputSet-CostCategory')]");

	/*
	 * LineItems
	 */

	final By PD_LineItems_Add = By
			.xpath("//div[contains(@id,'EditablePaymentLineItemsLV_tb-Add')]//div[@role='button']");
	final By PD_LineItem_Category = By.xpath("//select[contains(@name,'EditablePaymentLineItemsLV-0-LineCategory')]");
	final By PD_LineItem_Amount = By.xpath("//input[contains(@name,'EditablePaymentLineItemsLV-0-Amount')]");
	final By PD_CheckBox = By.xpath(
			"//div[contains(@id,'NewPaymentDetailDV-EditablePaymentLineItemsLV-1-_Checkbox')]/input[contains(@name,'EditablePaymentLineItemsLV-1-_Checkbox')]");
	final By Finish_Button = By.xpath("//div[contains(@id,'Finish')]//div[@role='button']");

	final By PD_Remove = By.xpath("//div[contains(@id,'EditablePaymentLineItemsLV_tb-Remove')]/div[@role='button']");
	/*
	 * Setcheckinstructions
	 */
	final By SI_GrossAmount = By
			.xpath("//div[contains(@id,'Amount_Gross')]//div[@class='gw-vw--value gw-align-h--left']");
	final By SI_NetAmount = By.xpath("//div[contains(@id,'Amount_Net')]//div[@class='gw-vw--value gw-align-h--left']");

	final By Next_Button = By.xpath("//div[contains(@id,'Next')]//div[@role='button']");

	final By PrimaryPayee = By.xpath("//div[contains(@id,'NewCheckPayeeDV-1')]");

	final By FinancialTranscations_Header = By.xpath(
			"//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and contains(text(),'Financials: Transactions')]");

	By FinancialsTransactions_CreateDate = By
			.xpath("//div[contains(@id,'ClaimFinancialsTransactionsScreen-TransactionsLV-2-CreateDate')]");
	By FinancialsTransactions_Amount = By
			.xpath("//div[contains(@id,'ClaimFinancialsTransactionsScreen-TransactionsLV-2-Amount')]");
	By FinancialsTransactions_Coverage = By
			.xpath("//div[contains(@id,'ClaimFinancialsTransactionsScreen-TransactionsLV-2-CoverageType')]");
	By FinancialsTransactions_CostType = By
			.xpath("//div[contains(@id,'ClaimFinancialsTransactionsScreen-TransactionsLV-2-CostType')]");
	By FinancialsTransactions_CostCategory = By
			.xpath("//div[contains(@id,'ClaimFinancialsTransactionsScreen-TransactionsLV-2-CostCategory')]");
	By FinancialsTransactions_Status = By
			.xpath("//div[contains(@id,'ClaimFinancialsTransactionsScreen-TransactionsLV-2-Status')]");

	// Financial Checks
	final By FinancialChecks_Header = By.xpath(
			"//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and contains(text(),'Financials: Checks')]");

	final By FinancialChecks_PayTo_1 = By.xpath(
			"//div[contains(@id,'ClaimFinancialsChecksScreen-ChecksLV-0-PayTo')]//div[@class='gw-value-readonly-wrapper']");
	final By FinancialChecks_Status_1 = By
			.xpath("//div[contains(@id,'ClaimFinancialsChecksScreen-ChecksLV-0-Status')]//div[@class='gw-label']");

	final By FinancialChecks_PayTo_2 = By.xpath(
			"//div[contains(@id,'ClaimFinancialsChecksScreen-ChecksLV-1-PayTo')]//div[@class='gw-value-readonly-wrapper']");
	final By FinancialChecks_Status_2 = By
			.xpath("//div[contains(@id,'ClaimFinancialsChecksScreen-ChecksLV-1-Status')]//div[@class='gw-label']");

}
