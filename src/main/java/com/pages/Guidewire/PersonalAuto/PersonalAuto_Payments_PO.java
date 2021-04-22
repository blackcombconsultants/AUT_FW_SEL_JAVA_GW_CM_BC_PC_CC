package com.pages.Guidewire.PersonalAuto;

import org.openqa.selenium.By;

public interface PersonalAuto_Payments_PO {
	// -------->Premium Summary xpaths
	final By Payment_titlebar = By
			.xpath("//div[@id='SubmissionWizard-SubmissionWizard_PaymentScreen-ttlBar']/div[1]/div");

	final By Total_Premium = By.xpath("//div[contains(@id,'PremiumSummaryInputSet-TotalPremium')]/div[1]/div");
	final By Taxes_And_Surcharges = By
			.xpath("//div[contains(@id,'PremiumSummaryInputSet-TotalTaxesSurcharges')]/div[1]/div");

	// -------->Payments Xpaths
	final By Frequency = By.xpath("//div[contains(@id,'PaymentsSummaryInputSet-Frequency')]/div[1]/div");
	final By Installements = By
			.xpath("//div[contains(@id,'PaymentsSummaryInputSet-Installments')]//div[@role='button']");

	// ------>Billing Method xpaths
	final By Billing_Method = By.xpath("//select[contains(@name,'BillingPanel-BillingMethod')]");

	// ----->Alternate Billing Account xapths
	final By Alternate_Billing_Account_icon = By
			.xpath("//div[contains(@id,'AltBillingAccountMenuIcon')]//div[@role='button']");

	final By Alternate_Billing_Account_Search = By
			.xpath("//div[contains(@id,'AltBillingAccount-Search')]//div[@class='gw-label']");

	final By Billing_Subaccounts_icon = By.xpath("//div[contains(@id,'AltBillingAccount-SubAccounts')]/div[3]");

	final By pa_Alternate_Billing_Account_Search_titlebar = By
			.xpath("//div[@id='AccountSearchPopup-AccountSearchScreen-ttlBar']/div[1]/div");
	final By pa_Alternate_Billing_Account_AccountNumber = By
			.xpath("//div[contains(@id,'AccountSearchDV-AccountNumber')]//input");
	final By pa_Alternate_Billing_Account_Search_Button = By.xpath("//div[contains(@id,'SearchLinksInputSet-Search')]");
	final By pa_Alternate_Billing_Account_Search_Select = By.xpath("//div[text()='Select']");

	// ------>Billing Contact xpaths
	final By Billing_Contact_icon = By
			.xpath("//div[contains(@id,'BillingContactButtonMenuIcon')]//div[@role='button']");
	final By Billing_Contact_NewCompany = By
			.xpath("//div[contains(@id,'BillingContactButton-0-contactType')]//div[@class='gw-label']");
	final By Billing_Contact_NewPerson = By
			.xpath("//div[contains(@id,'BillingContactButton-1-contactType')]//div[@class='gw-label']");
	final By Billing_Contact_FromAddressBook = By
			.xpath("//div[contains(@id,'BillingABContactAdder')]//div[@class='gw-label']");
	final By Billing_Contact_ExistingBillingContacts = By
			.xpath("//div[contains(@id,'ExistingBillingContact')]//div[@class='gw-label']");
	final By Billing_Contact_OtherContacts = By
			.xpath("//div[contains(@id,'OtherExistingContact')]//div[text()='Other Contacts']");

	// ------>Invoicing overrides
	final By Invoicing_overrides_checkbox = By
			.xpath("//div[contains(@id,'OverridesAndPaymentsPanel-Overridden')]//input[@type='checkbox']");
	final By Fix_Invoices_By = By.xpath("//select[contains(@name,'BillingInvoiceStreamInputSet-Invoice')]");
	final By Day_of_Month = By.xpath("//select[contains(@name,'FirstDayOfMonth')]");
	final By Description = By.xpath("//div[contains(@id,'OverridesAndPaymentsPanel-Overridden')]//input[@type='text']");

	// ------->PayUsing xpaths
	final By PayUsing_Add = By.xpath("//div[contains(@id,'AddPaymentInstrument')]//div[@class='gw-label']");
	final By PayUsing_titlebar = By
			.xpath("//div[@id='CreateSamplePaymentInstrument-ttlBar']//div[@class='gw-TitleBar--title']");
	final By Policy_Transaction_Number = By
			.xpath("//div[@id='CreateSamplePaymentInstrument-jobNumber']//div[@class='gw-value-readonly-wrapper']");
	final By Payment_Method = By.xpath("//select[contains(@name,'paymentMethod')]");
	final By Card_Type = By.xpath("//select[contains(@name,'CreditCardType')]");
	final By Credit_Card_Number = By.xpath("//div[contains(@id,'CrediCardNumber')]//input[@type='text']");
	final By Exp_Date = By.xpath("//div[contains(@id,'ExpirationDate')]//input[@type='text']");
	final By Card_Holder_Name = By.xpath("//div[contains(@id,'CardHolderName')]//input[@type='text']");
	final By pa_State = By.xpath("//select[contains(@name,'AddressInputSet-State')]");
	final By pa_Notes = By.xpath("//div[contains(@id,'PaymentMethodInputSet-Notes')]//input[@type='text']");
	final By pa_OK_button = By.xpath("//div[text()='OK']");

	void pa_Payment() throws Throwable;

	void pa_Premium_Summary(String testingType) throws Throwable;

	void pa_payments(String Type) throws Throwable;

	void pa_BillingMethod(String Type) throws Throwable;

	void pa_Alternate_Billing_Account(String Type) throws Throwable;

	void pa_Alternate_Billing_Account_Search(String Type) throws Throwable;

	void pa_Billing_Contact(String Type) throws Throwable;

	void pa_Payment_Schedule(String Type) throws Throwable;

	void pa_Invoicing_Overrides() throws Throwable;

	void pa_Pay_Using(String type) throws Throwable;

}
