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
	final By Setcheckinstructions_Header = By
			.xpath("//div[contains(@id,'CheckInstructionsScreen-ttlBar')]//div[@class='gw-TitleBar--title']");
	/*
	 * CheckDetails
	 */

	final By CD_PrimaryPayee_Namee = By.xpath("//select[contains(@name,'PrimaryPayee_Name')]");
	final By CD_CheckIssuance_CheckNumber = By.xpath("//input[contains(@name,'CheckNumber')]");

	/*
	 * Payment Details
	 */
	final By PD_ReserveLine = By.xpath("//select[contains(@name,'ReserveLineInputSet-ReserveLine')]");
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

	final By PD_Financial_Checks = By
			.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading']");

}
