package com.pages.Guidewire.PolicyCenter.PersonalAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Resuables;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Resuables_PO;

public class PA_Payments extends SeleniumWebDriver_Commands {

	Selenium_Utils_DataBase oDB = new Selenium_Utils_DataBase();

	public PA_Payments(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}


	/*
	 * PremiumSummary
	 */
	private static By PA_PremiumSummary = By.xpath("//div[contains(@class,'gw-boldLabel') and text()='Premium Summary']");

	private static By PA_PA_TotalPremium    = By.xpath("//div[contains(@id,'PremiumSummaryInputSet-TotalPremium')]//div[@class='gw-value-readonly-wrapper']");
	private static By PA_PA_TaxesSurcharges = By.xpath("//div[contains(@id,'PremiumSummaryInputSet-TotalTaxesSurcharges')]//div[@class='gw-value-readonly-wrapper']");
	private static By PA_PA_Fees            = By.xpath("//div[contains(@id,'PremiumSummaryInputSet-InstallmentFees')]//div[@class='gw-value-readonly-wrapper']");
	private static By PA_PA_TotalCost       = By.xpath("//div[contains(@id,'PremiumSummaryInputSet-TotalCost')]//div[@class='gw-value-readonly-wrapper']");

	/*
	 * Payments
	 */
	private static By PA_Payments = By.xpath("//div[contains(@class,'gw-boldLabel') and text()='Payments']");

	private static By PA_P_Frequency     = By.xpath("//div[contains(@id,'PaymentsSummaryInputSet-Frequency')]//div[@class='gw-value-readonly-wrapper']");
	private static By PA_P_DownPayment   = By.xpath("//div[contains(@id,'PaymentsSummaryInputSet-DownPayment')]");
	private static By PA_P_Installements = By.xpath("//div[contains(@id,'PaymentsSummaryInputSet-Installments')]");

	/*
	 * Invoicing
	 */
	private static By PA_Invoicing = By.xpath("//div[contains(@class,'gw-boldLabel') and text()='Invoicing']");

	private static By PA_I_Frequency     = By.xpath("//div[contains(@id,'InvoiceStreamInputSet-InvoiceFrequency')]//div[@class='gw-value-readonly-wrapper']");
	private static By PA_I_FixInvoicesby = By.xpath("//div[contains(@id,'InvoiceStreamInputSet-FixInvoicesBy')]//div[@class='gw-value-readonly-wrapper']");
	private static By PA_I_InvoicingDay  = By.xpath("//div[contains(@id,'InvoiceStreamInputSet-DayOfMonth')]//div[@class='gw-value-readonly-wrapper']");
	private static By PA_I_PayUsing      = By.xpath("//div[contains(@id,'InvoiceStreamInputSet-PayUsing')]//div[@class='gw-value-readonly-wrapper']");

	/*
	 * Billing
	 */
	private static By PA_Billing = By.xpath("//div[contains(@class,'gw-boldLabel') and text()='Billing']");

	private static By PA_B_BillingLevel  = By.xpath("//div[contains(@id,'BillingPanel-BillingLevel')]//div[@class='gw-value-readonly-wrapper']");
	private static By PA_B_BillingMethod = By.xpath("//select[contains(@name,'BillingPanel-BillingMethod')]");

	/*
	 * Alternate Billing Account
	 */
	private static By PA_B_AlternateBillingAccount = By.xpath("//div[contains(@id,'AltBillingAccountMenuIcon')]//div[@role='button']");
	private static By PA_B_ABA_Search              = By.xpath("//div[contains(@id,'AltBillingAccount-Search')]//div[@class='gw-label']");
	private static By PA_B_ABA_BillingSubaccounts  = By.xpath("//div[contains(@id,'AltBillingAccount-SubAccounts')]/div[3]");

	private static By pa_Alternate_Billing_Account_Search_titlebar = By.xpath("//div[@id='AccountSearchPopup-AccountSearchScreen-ttlBar']/div[1]/div");

	private static By PA_B_ABA_AccountNumber                     = By.xpath("//div[contains(@id,'AccountSearchDV-AccountNumber')]//input");
	private static By pa_Alternate_Billing_Account_Search_Button = By.xpath("//div[contains(@id,'SearchLinksInputSet-Search')]");
	private static By pa_Alternate_Billing_Account_Search_Select = By.xpath("//div[text()='Select']");

	/*
	 * Billing Contact
	 */
	private static By PA_B_BillingContact             = By.xpath("//div[contains(@id,'BillingContactButtonMenuIcon')]//div[@role='button']");
	private static By PA_B_BC_NewCompany              = By.xpath("//div[contains(@id,'BillingContactButton-0-contactType')]//div[@class='gw-label']");
	private static By PA_B_BC_NewPerson               = By.xpath("//div[contains(@id,'BillingContactButton-1-contactType')]//div[@class='gw-label']");
	private static By PA_B_BC_FromAddressBook         = By.xpath("//div[contains(@id,'BillingABContactAdder')]//div[@class='gw-label']");
	private static By PA_B_BC_ExistingBillingContacts = By.xpath("//div[contains(@id,'ExistingBillingContact')]//div[@class='gw-label']");
	private static By PA_B_BC_OtherContacts           = By.xpath("//div[contains(@id,'OtherExistingContact')]//div[text()='Other Contacts']");

	/*
	 * Payment Schedule
	 */
	private static By PA_PaymentSchedule = By.xpath("//div[contains(@class,'gw-boldLabel') and text()='Payment Schedule']");

	/*
	 * Invoicing Overrides
	 */
	private static By PA_B_InvoicingOverrides = By.xpath("//input[contains(@name,'BillingAdjustmentsPanelSet-OverridesAndPaymentsPanel-Overridden')]");
	private static By PA_B_IO_FixInvoicesBy   = By.xpath("//select[contains(@name,'BillingInvoiceStreamInputSet-Invoice')]");
	private static By PA_B_IO_DayofMonth      = By.xpath("//select[contains(@name,'FirstDayOfMonth')]");
	private static By PA_B_IO_Description     = By.xpath("//input[contains(@name,'BillingInvoiceStreamInputSet-InvoiceStreamDescription')]");

	// ------->PayUsing xpaths
	private static By PA_B_IO_PayUsing_Add = By.xpath("//div[contains(@id,'AddPaymentInstrument')]//div[@class='gw-label' and text()='Add']");

	/*
	 * Demo Payment System
	 */
	private static By DPS_PolicyTransactionNumber = By.xpath("//div[@id='CreateSamplePaymentInstrument-jobNumber']//div[@class='gw-value-readonly-wrapper']");
	private static By DPS_PaymentMethod           = By.xpath("//select[contains(@name,'paymentMethod')]");
	private static By DPS_CardType                = By.xpath("//select[contains(@name,'CreditCardType')]");
	private static By DPS_CreditCardNumber        = By.xpath("//input[contains(@name,'CrediCardNumber')]");
	private static By DPS_ExpDate                 = By.xpath("//input[contains(@name,'PaymentMethodInputSet-ExpirationDate')]");
	private static By DPS_CardHolderName          = By.xpath("//input[contains(@name,'PaymentMethodInputSet-CardHolderName')]");

	/*
	 * Billing Address
	 */

	private static By DPS_BillingAddress = By.xpath("//div[contains(@class,'gw-boldLabel') and text()='Billing Address']");

	private static By DPS_BA_AddressLine1 = By.xpath("//input[contains(@name,'AddressInputSet-AddressLine1')]");
	private static By DPS_BA_AddressLine2 = By.xpath("//input[contains(@name,'AddressInputSet-AddressLine2')]");
	private static By DPS_BA_City         = By.xpath("//input[contains(@name,'AddressInputSet-City')]");
	private static By DPS_BA_State        = By.xpath("//select[contains(@name,'AddressInputSet-State')]");
	private static By DPS_BA_ZIPCode      = By.xpath("//input[contains(@name,'AddressInputSet-PostalCode')]");
	private static By DPS_BA_Country      = By.xpath("//select[contains(@name,'AddressInputSet-Country')]");
	private static By DPS_BA_Notes        = By.xpath("//input[contains(@name,'PaymentMethodInputSet-Notes')]");

	/*
	 * Up-front Payment
	 */
	private static By PA_UpFrontPayment = By.xpath("//div[contains(@class,'gw-boldLabel') and text()='Up-front Payment']");

	private static By PA_UFP_HeldbyAgent       = By.xpath("//div[contains(@id,'AgentChoiceOption_Choice_radio')]");
	private static By PA_UFP_HA_Amount         = By.xpath("//input[contains(@name,'UpFrontPaymentDV-AgentAmount')]");
	private static By PA_UFP_Check             = By.xpath("//div[contains(@id,'CheckChoiceOption_Choice_radio')]");
	private static By PA_UFP_CheckAmount       = By.xpath("//input[contains(@name,'UpFrontPaymentDV-CheckAmount')]");
	private static By PA_UFP_Cash              = By.xpath("//div[contains(@id,'CashChoiceOption_Choice_radio')]");
	private static By PA_UFP_Cash_Amount       = By.xpath("//input[contains(@name,'UpFrontPaymentDV-CashAmount')]");
	private static By PA_UFP_Electronic        = By.xpath("//div[contains(@id,'ElectronicChoiceOption_Choice_radio')]");
	private static By PA_UFP_Electronic_Amount = By.xpath("//input[contains(@name,'ElectronicAmount')]");

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
	 * void billing_AlternateBillingAccount_BillingSubaccounts() throws Throwable;
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

	public static void premiumSummary() throws Throwable {
		lhm_TestCase_Table_Data = PA_Reusable.getData_PersonalAuto("payment");

		GuidewireAutomate_Validation("Screen Header", PolicyCenter_Resuables_PO.Payment_Header, "equals", "Payment");

		GuidewireAutomate_Validation("Premium Summary", PA_PremiumSummary, "equals", "Premium Summary");

		GuidewireAutomate_Validation("Total Premium", PA_PA_TotalPremium, "fetch", lhm_TestCase_Table_Data.get("PA_PA_TotalPremium"));
		GuidewireAutomate_Validation("Taxes And Surcharges", PA_PA_TaxesSurcharges, "fetch", lhm_TestCase_Table_Data.get("PA_PA_TaxesSurcharges"));
		// GuidewireAutomate_Validation("Fees", PA_PA_Fees, "equals",
		// lhm_TestCase_Table_Data.get("PA_PA_Fees"));
		GuidewireAutomate_Validation("Total Cost", PA_PA_TotalCost, "fetch", lhm_TestCase_Table_Data.get("PA_PA_TotalCost"));

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();

	}

	public static void payments() throws Throwable {
		lhm_TestCase_Table_Data = PA_Reusable.getData_PersonalAuto("payment");

		GuidewireAutomate_Validation("Payments", PA_Payments, "equals", "Payments");

		GuidewireAutomate_Validation("Frequency", PA_P_Frequency, "equals", lhm_TestCase_Table_Data.get("PA_P_Frequency"));
		GuidewireAutomate_Validation("Down Payment", PA_P_DownPayment, "fetch", lhm_TestCase_Table_Data.get("PA_P_DownPayment"));
		GuidewireAutomate_Validation("Installements", PA_P_Installements, "fetch", lhm_TestCase_Table_Data.get("PA_P_Installements"));

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();

	}

	public static void invoicing() throws Throwable {
		lhm_TestCase_Table_Data = PA_Reusable.getData_PersonalAuto("payment");

		GuidewireAutomate_Validation("Invoicing", PA_Invoicing, "equals", "Invoicing");

		GuidewireAutomate_Validation("Frequency", PA_I_Frequency, "equals", lhm_TestCase_Table_Data.get("PA_I_Frequency"));
		GuidewireAutomate_Validation("FixInvoicesby", PA_I_FixInvoicesby, "equals", lhm_TestCase_Table_Data.get("PA_I_FixInvoicesby"));
		GuidewireAutomate_Validation("InvoicingDay", PA_I_InvoicingDay, "equals", lhm_TestCase_Table_Data.get("PA_I_InvoicingDay"));
		GuidewireAutomate_Validation("PayUsing", PA_I_PayUsing, "equals", lhm_TestCase_Table_Data.get("PA_I_PayUsing"));

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();

	}

	public static void billing() throws Throwable {
		lhm_TestCase_Table_Data = PA_Reusable.getData_PersonalAuto("payment");

		GuidewireAutomate_Validation("Billing", PA_Billing, "equals", "Billing");

		GuidewireAutomate("BillingLevel", PA_B_BillingLevel, "click", "");
		GuidewireAutomate("Billing_Method", PA_B_BillingMethod, "selectByVisibleText", lhm_TestCase_Table_Data.get("PA_B_BillingMethod"));

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();

	}

	public static void billing_AlternateBillingAccount_Search() throws Throwable {
		lhm_TestCase_Table_Data = PA_Reusable.getData_PersonalAuto("payment");

		GuidewireAutomate_Validation("Search title", pa_Alternate_Billing_Account_Search_titlebar, "equals", "Search Accounts");

		GuidewireAutomate("Alternate Billing Account Search", PA_B_ABA_Search, "click", "");
		GuidewireAutomate("Sending AccountNumber", PA_B_ABA_AccountNumber, "sendKeys", lhm_TestCase_Table_Data.get("PA_B_ABA_AccountNumber"));
		GuidewireAutomate("Search", pa_Alternate_Billing_Account_Search_Button, "click", "");
		GuidewireAutomate("Select", pa_Alternate_Billing_Account_Search_Select, "click", "");

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();

	}

	public static void billing_AlternateBillingAccount_BillingSubaccounts() throws Throwable {
		lhm_TestCase_Table_Data = PA_Reusable.getData_PersonalAuto("payment");

		GuidewireAutomate_Validation("Search title", pa_Alternate_Billing_Account_Search_titlebar, "equals", "Search Accounts");

		GuidewireAutomate("Alternate Billing Account Search", PA_B_BillingContact, "click", "");
		GuidewireAutomate("Sending AccountNumber", PA_B_ABA_AccountNumber, "sendKeys", lhm_TestCase_Table_Data.get("PA_B_ABA_AccountNumber"));
		GuidewireAutomate("Search", pa_Alternate_Billing_Account_Search_Button, "click", "");
		GuidewireAutomate("Select", pa_Alternate_Billing_Account_Search_Select, "click", "");

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();

	}

	public static void billingContact(String Account) throws Throwable {
		lhm_TestCase_Table_Data = PA_Reusable.getData_PersonalAuto("payment");

		GuidewireAutomate("Billing Contact icon", PA_B_BillingContact, "click", "");
		switch (Account) {
			case "New Company" :
				GuidewireAutomate("New Company", PA_B_BC_NewCompany, "click", "");
				break;
			case "New Person" :
				GuidewireAutomate("New Person", PA_B_BC_NewPerson, "click", "");
				break;

			case "From Address Book" :
				GuidewireAutomate("From Address Book", PA_B_BC_FromAddressBook, "click", "");
				break;

			case "Existing Billing Contacts" :
				GuidewireAutomate("Existing Billing Contacts", PA_B_BC_ExistingBillingContacts, "click", "");
				break;

			case "Other Contacts" :
				GuidewireAutomate("Other Contacts", PA_B_BC_OtherContacts, "moveToElement", "");
				break;

			default :
				break;
		}

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();

	}

	public static void paymentSchedule() throws Throwable {
		lhm_TestCase_Table_Data = PA_Reusable.getData_PersonalAuto("payment");

		GuidewireAutomate_Validation("Payment Schedule", PA_PaymentSchedule, "equals", "Payment Schedule");

		String strDynamicXpath   = lhm_TestCase_Table_Data.get("PA_PS_PaymentPlan");
		By     PA_PS_PaymentPlan = By.xpath("//div[text()='" + strDynamicXpath + "']/ancestor::td[contains(@class,'gw-CellWidget')]/preceding-sibling::td[contains(@class,'gw-CellWidget')]//div[@role='radio']");
		By     PA_PS_DownPayment = By
				.xpath("//div[text()='" + strDynamicXpath + "']/ancestor::td[contains(@class,'gw-CellWidget')]/following-sibling::td[contains(@id,'DownPayment') and contains(@class,'gw-FormatCellWidget')]//div[@class='gw-value']/div/div[1]");
		By     PA_PS_Installment = By
				.xpath("//div[text()='" + strDynamicXpath + "']/ancestor::td[contains(@class,'gw-CellWidget')]/following-sibling::td[contains(@id,'-Installment') and contains(@class,'gw-FormatCellWidget')]//div[contains(@id,'InstallmentPreview')]");
		By     PA_PS_Total       = By
				.xpath("//div[text()='" + strDynamicXpath + "']/ancestor::td[contains(@class,'gw-CellWidget')]/following-sibling::td[contains(@id,'Total') and contains(@class,'gw-FormatCellWidget')]//div[@class='gw-value']/div/div[1]");
		// By PA_PS_Total = By.xpath("//div[text()='" + strDynamicXpath +
		// "']/ancestor::td[contains(@class,'gw-CellWidget')]/following-sibling::td['Total'=substring(@id,197,string-length(@id))]//div[@class='gw-value']/div/div[1]");

		GuidewireAutomate("Payment Plan = " + strDynamicXpath, PA_PS_PaymentPlan, "clickAndwait", "click");
		GuidewireAutomate_Validation("Down Payment", PA_PS_DownPayment, "fetch", lhm_TestCase_Table_Data.get("PA_PS_DownPayment"));
		GuidewireAutomate_Validation("Installment", PA_PS_Installment, "fetch", lhm_TestCase_Table_Data.get("PA_PS_Installment"));
		GuidewireAutomate_Validation("Total", PA_PS_Total, "fetch", lhm_TestCase_Table_Data.get("PA_PS_Total"));

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();

	}

	public static void invoicingOverrides() throws Throwable {
		lhm_TestCase_Table_Data = PA_Reusable.getData_PersonalAuto("payment");

		GuidewireAutomate("Invoicing overrides checkbox", PA_B_InvoicingOverrides, "clickAndwait", "");

		GuidewireAutomate("Fix Invoices By", PA_B_IO_FixInvoicesBy, "selectByVisibleTextAndwait", lhm_TestCase_Table_Data.get("PA_B_IO_FixInvoicesBy"));
		GuidewireAutomate("Day of Month", PA_B_IO_DayofMonth, "selectByVisibleTextAndwait", lhm_TestCase_Table_Data.get("PA_B_IO_DayofMonth"));
		GuidewireAutomate("Description", PA_B_IO_Description, "sendKeys", lhm_TestCase_Table_Data.get("PA_B_IO_Description"));
		PolicyCenter_Resuables.clickButton("Save Draft");

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();

	}

	public static void payUsing() throws Throwable {
		lhm_TestCase_Table_Data = PA_Reusable.getData_PersonalAuto("payment");

		PolicyCenter_Resuables.clickButton("Save Draft");

		GuidewireAutomate_Validation("Payments", PA_Payments, "equals", "Payments");

		GuidewireAutomate_Validation("Up-front Payment", PA_UpFrontPayment, "equals", "Up-front Payment");

		GuidewireAutomate("PayUsing Add", PA_B_IO_PayUsing_Add, "clickAndwait", "click");

		GuidewireAutomate_Validation("Screen Header", PolicyCenter_Resuables_PO.Screen_Header, "equals", "Demo Payment System");

		strPolicyNumber = getText_Element(DPS_PolicyTransactionNumber);

		GuidewireAutomate("Payment Method", DPS_PaymentMethod, "selectByVisibleText", lhm_TestCase_Table_Data.get("DPS_PaymentMethod"));
		GuidewireAutomate("Card Type", DPS_CardType, "selectByVisibleText", lhm_TestCase_Table_Data.get("DPS_CardType"));
		if (lhm_TestCase_Table_Data.get("DPS_CreditCardNumber").equalsIgnoreCase("Random")) {
			GuidewireAutomate("Credit_Card_Number", DPS_CreditCardNumber, "sendKeys", getRandomNumeric(16));
		} else {
			GuidewireAutomate("Credit_Card_Number", DPS_CreditCardNumber, "sendKeys", lhm_TestCase_Table_Data.get("DPS_CreditCardNumber"));

		}
		GuidewireAutomate("Exp Date", DPS_ExpDate, "sendKeys", lhm_TestCase_Table_Data.get("DPS_ExpDate"));
		GuidewireAutomate("Card Holder Name", DPS_CardHolderName, "sendKeys", lhm_TestCase_Table_Data.get("DPS_CardHolderName"));

		GuidewireAutomate_Validation("Billing Address", DPS_BillingAddress, "equals", "Billing Address");
		GuidewireAutomate("AddressLine1", DPS_BA_AddressLine1, "sendKeys", lhm_TestCase_Table_Data.get("DPS_BA_AddressLine1"));
		GuidewireAutomate("AddressLine2", DPS_BA_AddressLine2, "sendKeys", lhm_TestCase_Table_Data.get("DPS_BA_AddressLine2"));
		GuidewireAutomate("Country", DPS_BA_Country, "selectByVisibleText", lhm_TestCase_Table_Data.get("DPS_BA_Country"));
		GuidewireAutomate("State", DPS_BA_State, "selectByVisibleText", lhm_TestCase_Table_Data.get("DPS_BA_State"));
		// GuidewireAutomate("City", DPS_BA_City, "sendKeys",
		// lhm_TestCase_Table_Data.get("DPS_BA_City"));
		// GuidewireAutomate("ZIPCode", DPS_BA_ZIPCode, "sendKeys",
		// lhm_TestCase_Table_Data.get("DPS_BA_ZIPCode"));
		GuidewireAutomate("Notes", DPS_BA_Notes, "sendKeys", lhm_TestCase_Table_Data.get("DPS_BA_Notes"));

		GuidewireAutomate("OK", PolicyCenter_Resuables.OK_Button, "clickAndwait", "click");

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();

	}

	public static void upFrontPayment() throws Throwable {
		lhm_TestCase_Table_Data = PA_Reusable.getData_PersonalAuto("payment");

		GuidewireAutomate_Validation("Up-front Payment", PA_UpFrontPayment, "equals", "Up-front Payment");

		if (lhm_TestCase_Table_Data.get("PA_UFP_HeldbyAgent").equalsIgnoreCase("Yes")) {
			GuidewireAutomate("Held by Agent", PA_UFP_HeldbyAgent, "clickAndwait", lhm_TestCase_Table_Data.get("PA_UFP_HeldbyAgent"));
			GuidewireAutomate_Validation("Amount", PA_UFP_HA_Amount, "fetchValue", lhm_TestCase_Table_Data.get("PA_UFP_HA_Amount"));
		}

		if (lhm_TestCase_Table_Data.get("PA_UFP_Check").equalsIgnoreCase("Yes")) {

			GuidewireAutomate("Check", PA_UFP_Check, "clickAndwait", lhm_TestCase_Table_Data.get("PA_UFP_Check"));
			GuidewireAutomate_Validation("Amount", PA_UFP_CheckAmount, "fetchValue", lhm_TestCase_Table_Data.get("PA_UFP_CheckAmount"));
		}

		if (lhm_TestCase_Table_Data.get("PA_UFP_Cash").equalsIgnoreCase("Yes")) {

			GuidewireAutomate("Cash", PA_UFP_Cash, "clickAndwait", lhm_TestCase_Table_Data.get("PA_UFP_Cash"));
			GuidewireAutomate_Validation("Amount", PA_UFP_Cash_Amount, "fetchValue", lhm_TestCase_Table_Data.get("PA_UFP_Cash_Amount"));
		}

		if (lhm_TestCase_Table_Data.get("PA_UFP_Electronic").equalsIgnoreCase("Yes")) {

			GuidewireAutomate("Electronic", PA_UFP_Electronic, "clickAndwait", lhm_TestCase_Table_Data.get("PA_UFP_Electronic"));
			GuidewireAutomate_Validation("Amount", PA_UFP_Electronic_Amount, "fetchValue", lhm_TestCase_Table_Data.get("PA_UFP_Electronic_Amount"));
		}
		PA_Reusable.UpdateData_PersonalAuto("searchValues", "Amount", strFetchValue);

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();

	}

}
