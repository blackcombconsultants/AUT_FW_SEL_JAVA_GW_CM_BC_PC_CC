package com.pages.Guidewire.PersonalAuto;

import org.openqa.selenium.By;

public interface PersonalAuto_Payments_PO {

	/*
	 * PremiumSummary
	 */
	final By PA_PremiumSummary = By.xpath("//div[contains(@class,'gw-boldLabel') and text()='Premium Summary']");

	final By PA_PA_TotalPremium    = By.xpath("//div[contains(@id,'PremiumSummaryInputSet-TotalPremium')]//div[@class='gw-value-readonly-wrapper']");
	final By PA_PA_TaxesSurcharges = By.xpath("//div[contains(@id,'PremiumSummaryInputSet-TotalTaxesSurcharges')]//div[@class='gw-value-readonly-wrapper']");
	final By PA_PA_Fees            = By.xpath("//div[contains(@id,'PremiumSummaryInputSet-InstallmentFees')]//div[@class='gw-value-readonly-wrapper']");
	final By PA_PA_TotalCost       = By.xpath("//div[contains(@id,'PremiumSummaryInputSet-TotalCost')]//div[@class='gw-value-readonly-wrapper']");

	/*
	 * Payments
	 */
	final By PA_Payments = By.xpath("//div[contains(@class,'gw-boldLabel') and text()='Payments']");

	final By PA_P_Frequency     = By.xpath("//div[contains(@id,'PaymentsSummaryInputSet-Frequency')]//div[@class='gw-value-readonly-wrapper']");
	final By PA_P_DownPayment   = By.xpath("//div[contains(@id,'PaymentsSummaryInputSet-DownPayment')]");
	final By PA_P_Installements = By.xpath("//div[contains(@id,'PaymentsSummaryInputSet-Installments')]");

	/*
	 * Invoicing
	 */
	final By PA_Invoicing = By.xpath("//div[contains(@class,'gw-boldLabel') and text()='Invoicing']");

	final By PA_I_Frequency     = By.xpath("//div[contains(@id,'InvoiceStreamInputSet-InvoiceFrequency')]//div[@class='gw-value-readonly-wrapper']");
	final By PA_I_FixInvoicesby = By.xpath("//div[contains(@id,'InvoiceStreamInputSet-FixInvoicesBy')]//div[@class='gw-value-readonly-wrapper']");
	final By PA_I_InvoicingDay  = By.xpath("//div[contains(@id,'InvoiceStreamInputSet-DayOfMonth')]//div[@class='gw-value-readonly-wrapper']");
	final By PA_I_PayUsing      = By.xpath("//div[contains(@id,'InvoiceStreamInputSet-PayUsing')]//div[@class='gw-value-readonly-wrapper']");

	/*
	 * Billing
	 */
	final By PA_Billing = By.xpath("//div[contains(@class,'gw-boldLabel') and text()='Billing']");

	final By PA_B_BillingLevel  = By.xpath("//div[contains(@id,'BillingPanel-BillingLevel')]//div[@class='gw-value-readonly-wrapper']");
	final By PA_B_BillingMethod = By.xpath("//select[contains(@name,'BillingPanel-BillingMethod')]");

	/*
	 * Alternate Billing Account
	 */
	final By PA_B_AlternateBillingAccount = By.xpath("//div[contains(@id,'AltBillingAccountMenuIcon')]//div[@role='button']");
	final By PA_B_ABA_Search              = By.xpath("//div[contains(@id,'AltBillingAccount-Search')]//div[@class='gw-label']");
	final By PA_B_ABA_BillingSubaccounts  = By.xpath("//div[contains(@id,'AltBillingAccount-SubAccounts')]/div[3]");

	final By pa_Alternate_Billing_Account_Search_titlebar = By.xpath("//div[@id='AccountSearchPopup-AccountSearchScreen-ttlBar']/div[1]/div");

	final By PA_B_ABA_AccountNumber                     = By.xpath("//div[contains(@id,'AccountSearchDV-AccountNumber')]//input");
	final By pa_Alternate_Billing_Account_Search_Button = By.xpath("//div[contains(@id,'SearchLinksInputSet-Search')]");
	final By pa_Alternate_Billing_Account_Search_Select = By.xpath("//div[text()='Select']");

	/*
	 * Billing Contact
	 */
	final By PA_B_BillingContact             = By.xpath("//div[contains(@id,'BillingContactButtonMenuIcon')]//div[@role='button']");
	final By PA_B_BC_NewCompany              = By.xpath("//div[contains(@id,'BillingContactButton-0-contactType')]//div[@class='gw-label']");
	final By PA_B_BC_NewPerson               = By.xpath("//div[contains(@id,'BillingContactButton-1-contactType')]//div[@class='gw-label']");
	final By PA_B_BC_FromAddressBook         = By.xpath("//div[contains(@id,'BillingABContactAdder')]//div[@class='gw-label']");
	final By PA_B_BC_ExistingBillingContacts = By.xpath("//div[contains(@id,'ExistingBillingContact')]//div[@class='gw-label']");
	final By PA_B_BC_OtherContacts           = By.xpath("//div[contains(@id,'OtherExistingContact')]//div[text()='Other Contacts']");

	/*
	 * Payment Schedule
	 */
	final By PA_PaymentSchedule = By.xpath("//div[contains(@class,'gw-boldLabel') and text()='Payment Schedule']");

	/*
	 * Invoicing Overrides
	 */
	final By PA_B_InvoicingOverrides = By.xpath("//input[contains(@name,'BillingAdjustmentsPanelSet-OverridesAndPaymentsPanel-Overridden')]");
	final By PA_B_IO_FixInvoicesBy   = By.xpath("//select[contains(@name,'BillingInvoiceStreamInputSet-Invoice')]");
	final By PA_B_IO_DayofMonth      = By.xpath("//select[contains(@name,'FirstDayOfMonth')]");
	final By PA_B_IO_Description     = By.xpath("//input[contains(@name,'BillingInvoiceStreamInputSet-InvoiceStreamDescription')]");

	// ------->PayUsing xpaths
	final By PA_B_IO_PayUsing_Add = By.xpath("//div[contains(@id,'AddPaymentInstrument')]//div[@class='gw-label' and text()='Add']");

	/*
	 * Demo Payment System
	 */
	final By DPS_PolicyTransactionNumber = By.xpath("//div[@id='CreateSamplePaymentInstrument-jobNumber']//div[@class='gw-value-readonly-wrapper']");
	final By DPS_PaymentMethod           = By.xpath("//select[contains(@name,'paymentMethod')]");
	final By DPS_CardType                = By.xpath("//select[contains(@name,'CreditCardType')]");
	final By DPS_CreditCardNumber        = By.xpath("//input[contains(@name,'CrediCardNumber')]");
	final By DPS_ExpDate                 = By.xpath("//input[contains(@name,'PaymentMethodInputSet-ExpirationDate')]");
	final By DPS_CardHolderName          = By.xpath("//input[contains(@name,'PaymentMethodInputSet-CardHolderName')]");

	/*
	 * Billing Address
	 */

	final By DPS_BillingAddress = By.xpath("//div[contains(@class,'gw-boldLabel') and text()='Billing Address']");

	final By DPS_BA_AddressLine1 = By.xpath("//input[contains(@name,'AddressInputSet-AddressLine1')]");
	final By DPS_BA_AddressLine2 = By.xpath("//input[contains(@name,'AddressInputSet-AddressLine2')]");
	final By DPS_BA_City         = By.xpath("//input[contains(@name,'AddressInputSet-City')]");
	final By DPS_BA_State        = By.xpath("//select[contains(@name,'AddressInputSet-State')]");
	final By DPS_BA_ZIPCode      = By.xpath("//input[contains(@name,'AddressInputSet-PostalCode')]");
	final By DPS_BA_Country      = By.xpath("//select[contains(@name,'AddressInputSet-Country')]");
	final By DPS_BA_Notes        = By.xpath("//input[contains(@name,'PaymentMethodInputSet-Notes')]");

	/*
	 * Up-front Payment
	 */
	final By PA_UpFrontPayment = By.xpath("//div[contains(@class,'gw-boldLabel') and text()='Up-front Payment']");

	final By PA_UFP_HeldbyAgent       = By.xpath("//div[contains(@id,'AgentChoiceOption_Choice_radio')]");
	final By PA_UFP_HA_Amount         = By.xpath("//input[contains(@name,'UpFrontPaymentDV-AgentAmount')]");
	final By PA_UFP_Check             = By.xpath("//div[contains(@id,'CheckChoiceOption_Choice_radio')]");
	final By PA_UFP_CheckAmount       = By.xpath("//input[contains(@name,'UpFrontPaymentDV-CheckAmount')]");
	final By PA_UFP_Cash              = By.xpath("//div[contains(@id,'CashChoiceOption_Choice_radio')]");
	final By PA_UFP_Cash_Amount       = By.xpath("//input[contains(@name,'UpFrontPaymentDV-CashAmount')]");
	final By PA_UFP_Electronic        = By.xpath("//div[contains(@id,'ElectronicChoiceOption_Choice_radio')]");
	final By PA_UFP_Electronic_Amount = By.xpath("//input[contains(@name,'ElectronicAmount')]");

	/*
	 * 
	 * Modules
	 * 
	 * void premiumSummary() throws Throwable;
	 * 
	 * void payments() throws Throwable;
	 * 
	 * void invoicing() throws Throwable;
	 * 
	 * void billing() throws Throwable;
	 * 
	 * void billing_AlternateBillingAccount_Search() throws Throwable;
	 * 
	 * void billing_AlternateBillingAccount_BillingSubaccounts() throws
	 * Throwable;
	 * 
	 * void billingContact(String Account) throws Throwable;
	 * 
	 * void paymentSchedule() throws Throwable;
	 * 
	 * void invoicingOverrides() throws Throwable;
	 * 
	 * void upFrontPayment() throws Throwable;
	 * 
	 * void payUsing() throws Throwable;
	 */
}
