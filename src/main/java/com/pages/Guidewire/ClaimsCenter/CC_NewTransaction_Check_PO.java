package com.pages.Guidewire.ClaimsCenter;

import org.openqa.selenium.By;

public interface CC_NewTransaction_Check_PO {

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

	final By PrimaryPayee = By.xpath("//div[contains(@id,'NewCheckPayeeDV-1')]");

	// Validation Results for Rental Coverages
	final By ValidationResults_Header = By
			.xpath("//div[contains(@id,'wsTabBar')]//div[@class='gw-label' and text()='Validation Results']");
	final By ValidationResults_Warnings_Header = By
			.xpath("//div[contains(@id,'WebMessageWorksheetScreen')]//div[text()='Warnings:']");
	final By ValidationResults_Warning_First = By.xpath(
			"//div[contains(@id,'WebMessageWorksheetScreen-grpMsgs-0-0')]//div[@class='gw-message' and contains(text(),'gross incurred on exposure')]");
	final By ValidationResults_Warning_Second = By.xpath(
			"//div[contains(@id,'WebMessageWorksheetScreen-grpMsgs')]//div[@class='gw-message' and contains(text(),'This check would cause gross incurred on')]");

	// Validation results for claim cost
	final By Validation_Header = By.xpath(
			"//div[@class='gw-action--inner gw-hasDivider']//div[@class='gw-label' and text()='Validation Results']");
	final By Clear_Button = By.xpath("//div[contains(@id,'ClearButton')]//div[@role='button']");
	final By Next_Button = By.xpath("//div[contains(@id,'Next')]//div[@role='button']");
	final By Error_Msg = By.xpath("//div[contains(@id,'WebMessageWorksheetScreen-grpMsgs')]//div[@class='gw-message']");

}
