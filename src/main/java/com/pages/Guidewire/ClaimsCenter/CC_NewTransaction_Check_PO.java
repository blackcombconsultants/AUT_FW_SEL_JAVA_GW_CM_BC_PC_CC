package com.pages.Guidewire.ClaimsCenter;

import org.openqa.selenium.By;

public interface CC_NewTransaction_Check_PO {

	final By Screen_Header = By.xpath("//div[contains(@id,'ttlBar')]//div[@role='heading']");
	
	// Setcheckinstructions
	final By Setcheckinstructions_Header = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and contains(text(),'Step 3 of 3: Set check instructions')]");

	final By SCI_PayToTheOrderOf = By.xpath("//div[contains(@id,'CheckWizardCheckSummaryInputSet-Check_PayTo')]//div[@class='gw-value-readonly-wrapper']");
	final By SCI_MailingAddress = By.xpath("//div[contains(@id,'CheckWizardCheckSummaryInputSet-Check_MailTo_Input')]//div[@class='gw-value-readonly-wrapper']");
	/*
	 * CheckDetails
	 */

	final By CD_PrimaryPayee_Namee = By.xpath("//select[contains(@name,'PrimaryPayee_Name')]");
	final By PrimaryPayee_Type=By.xpath("//select[contains(@name,'PrimaryPayee_Type')]");
	final By AddJointPayees=By.xpath("//div[contains(@id,'AddJointPayees')]//div[@role='button']");
	final By JointPayees=By.xpath("//select[contains(@name,'PayeeDVPayeesLV-1-PayeeName')]");
	final By JointPayeesType = By.xpath("//select[contains(@name,'PayeeDVPayeesLV-1-PayeeType')]");
	
	
	
	//Payment method
	final By PM_MethodSection = By.xpath("//div[contains(@id,'PaymentMethod_Input')]//div[@class='gw-label gw-boldLabel' and text()='Payment Method']");
	final By PM_Check=By.xpath("//input[contains(@id,'DV-PaymentMethod_0')]");
	final By PM_PayToTheOrderOf = By.xpath("//textarea[contains(@name,'PayTo')]");
	final By PM_Electronicfundstransfer=By.xpath("//input[contains(@id,'DV-PaymentMethod_1')]");
	final By PM_MailToSection =  By.xpath("//div[@class='gw-label gw-boldLabel' and text()='Mail To']");
	final By PM_CheckDelivery=By.xpath("//select[contains(@name,'DeliveryMethod')]");
	final By PM_Recipient = By.xpath("//input[contains(@name,'MailToContact')]");
	final By PM_MailingAddress = By.xpath("//div[contains(@id,'MailingAddress')]//div[@class='gw-value-readonly-wrapper']");
	
	//Tax Reporting
	final By TaxReportingSection = By.xpath("//div[@class='gw-label gw-boldLabel' and text()='Tax Reporting']");
	final By ReportAs = By.xpath("//select[contains(@name,'Reportability')]");
	
	final By CD_CheckIssuance_CheckNumber = By.xpath("//input[contains(@name,'CheckNumber')]");

	/*
	 * Payment Details And Payment
	 */
	final By PD_ReserveLine = By.xpath("//select[contains(@name,'ReserveLineInputSet-ReserveLine')]");
	final By PD_Coverage = By.xpath("//div[contains(@id,'ReserveLineInputSet-Coverage')]//div[@class='gw-RangeValue']/div[@class='gw-label']");
	final By PD_PaymentType = By.xpath("//select[contains(@name,'Payment_PaymentType')]");
	final By PD_ErodingYes = By.xpath("//input[contains(@id,'Payment_Eroding_0')]");
	final By PD_ErodingNo = By.xpath("//input[contains(@id,'Payment_Eroding_1')]");
	final By PD_AvailableReserves = By.xpath("//div[contains(@id,'Transaction_AvailableReserves')]//div[@class='gw-vw--value gw-align-h--left']");
	final By PD_Comments = By.xpath("//input[contains(@name,'Transaction_Comments')]");
	final By PD_LineItemsCategory = By.xpath("//select[contains(@name,'LineCategory')]");
	final By PD_LineItemsCategoryCheckBox = By.xpath("//div[contains(@id,'EditablePaymentLineItemsLV-0-_Checkbox')]//input[@type='checkbox']");
	final By PD_LineItemsAmount = By.xpath("//input[contains(@name,'Amount')]");
	final By PD_LineItemsAdditemButton = By.xpath("//div[contains(@id,'EditablePaymentLineItemsLV_tb-Add')]//div[@role='button']");
	final By PD_LineItemsRemoveButton = By.xpath("//div[contains(@id,'EditablePaymentLineItemsLV_tb-Remove')]//div[@role='button']");
	
	
	final By PD_CostType = By.xpath("//select[contains(@name,'ReserveLineInputSet-CostType')]");
	final By PD_CostCategory = By.xpath("//select[contains(@name,'ReserveLineInputSet-CostCategory')]");

	
	
	/*
	 * LineItems
	 */

	final By PD_LineItems_Add = By.xpath("//div[contains(@id,'EditablePaymentLineItemsLV_tb-Add')]//div[@role='button']");
	final By PD_LineItem_Category = By.xpath("//select[contains(@name,'EditablePaymentLineItemsLV-0-LineCategory')]");
	final By PD_LineItem_Amount = By.xpath("//input[contains(@name,'EditablePaymentLineItemsLV-0-Amount')]");
	final By PD_CheckBox = By.xpath("//div[contains(@id,'NewPaymentDetailDV-EditablePaymentLineItemsLV-1-_Checkbox')]/input[contains(@name,'EditablePaymentLineItemsLV-1-_Checkbox')]");
	final By Finish_Button = By.xpath("//div[contains(@id,'Finish')]//div[@role='button']");

	final By PD_Remove = By.xpath("//div[contains(@id,'EditablePaymentLineItemsLV_tb-Remove')]/div[@role='button']");
	/*
	 * Setcheckinstructions
	 */
	final By SI_GrossAmount = By.xpath("//div[contains(@id,'Amount_Gross')]//div[@class='gw-vw--value gw-align-h--left']");
	final By SI_NetAmount = By.xpath("//div[contains(@id,'Amount_Net')]//div[@class='gw-vw--value gw-align-h--left']");

	final By PrimaryPayee = By.xpath("//div[contains(@id,'NewCheckPayeeDV-1')]");

	// Validation Results for Rental Coverages
	final By ValidationResults_Header = By.xpath("//div[contains(@id,'wsTabBar')]//div[@class='gw-label' and text()='Validation Results']");
	final By ValidationResults_Warnings_Header = By.xpath("//div[contains(@id,'WebMessageWorksheetScreen')]//div[text()='Warnings:']");
	final By ValidationResults_Warning_First = By.xpath("//div[contains(@id,'WebMessageWorksheetScreen-grpMsgs-0-0')]//div[@class='gw-message' and contains(text(),'gross incurred on exposure')]");
	final By ValidationResults_Warning_Second = By.xpath("//div[contains(@id,'WebMessageWorksheetScreen-grpMsgs')]//div[@class='gw-message' and contains(text(),'This check would cause gross incurred on')]");

	// Validation results for claim cost
	final By Validation_Header = By.xpath("//div[@class='gw-action--inner gw-hasDivider']//div[@class='gw-label' and text()='Validation Results']");
	final By Clear_Button = By.xpath("//div[contains(@id,'ClearButton')]//div[@role='button']");
	final By Next_Button = By.xpath("//div[contains(@id,'Next')]//div[@role='button']");
	final By Error_Msg = By.xpath("//div[contains(@id,'WebMessageWorksheetScreen-grpMsgs')]//div[@class='gw-message']");
	
	//financial check Page
	final By FinancialsChecksHeader = By.xpath("//div[contains(@id,'ttlBar')]//div[@role='heading']");
	final By PayTo = By.xpath("//div[contains(@id,'PayTo')]//div[@class='gw-value-readonly-wrapper']");
	final By GrossAmount = By.xpath("//div[contains(@class,'gw-CurrencyValue--modelValue gw-ActionValueWidget')]");
	final By ScheduledSendDate = By.xpath("//div[contains(@id,'ScheduledSendDate')]//div[@class='gw-value-readonly-wrapper']");
	final By Status = By.xpath("//div[contains(@id,'Status')]//div[@class='gw-RangeValue']");
	
}
