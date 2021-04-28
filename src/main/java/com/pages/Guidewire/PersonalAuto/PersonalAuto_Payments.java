package com.pages.Guidewire.PersonalAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;

public class PersonalAuto_Payments extends SeleniumWebDriver_Commands implements PersonalAuto_Payments_PO {

	Selenium_Utils_DataBase oDB = new Selenium_Utils_DataBase();

	public PersonalAuto_Payments(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	@Override
	public void premiumSummary() throws Throwable {
		lhm_TestCase_Table_Data = oDB.getData_MSExcel_WorkSheet_Fillo("payment", strTestCaseName);

		GuidewireAutomate_Validation("Payment titlebar", Payment_titlebar, "equals", "Payment");

		GuidewireAutomate_Validation("Total Premium", Total_Premium, "equals",
				lhm_TestCase_Table_Data.get("TotalPremium"));
		GuidewireAutomate_Validation(" TaxesAndSurcharges", Taxes_And_Surcharges, "equals",
				lhm_TestCase_Table_Data.get("TaxesandSurcharges"));
	}

	@Override
	public void payments() throws Throwable {
		GuidewireAutomate_Validation("Frequency", Frequency, "equals", lhm_TestCase_Table_Data.get("Frequency"));
		GuidewireAutomate_Validation("Installements", Installements, "equals",
				lhm_TestCase_Table_Data.get("Installments"));
	}

	@Override
	public void invoicing() throws Throwable {
		GuidewireAutomate_Validation("Frequency", Frequency, "equals", lhm_TestCase_Table_Data.get("Frequency"));

	}

	@Override
	public void billing() throws Throwable {
		GuidewireAutomate("Billing Method", Billing_Method, "click", "");
		GuidewireAutomate("Billing_Method", Billing_Method, "selectByVisibleTex",
				lhm_TestCase_Table_Data.get("BillingMethod"));
	}

	@Override
	public void billing_AlternateBillingAccount_Search() throws Throwable {

		GuidewireAutomate_Validation("Search title", pa_Alternate_Billing_Account_Search_titlebar, "equals",
				"Search Accounts");
		GuidewireAutomate("Alternate Billing Account Search", Alternate_Billing_Account_Search, "click", "");
		GuidewireAutomate("Sending AccountNumber", pa_Alternate_Billing_Account_AccountNumber, "sendKeys",
				lhm_TestCase_Table_Data.get("AccountNumber"));
		GuidewireAutomate("Search", pa_Alternate_Billing_Account_Search_Button, "click", "");
		GuidewireAutomate("Select", pa_Alternate_Billing_Account_Search_Select, "click", "");

	}

	@Override
	public void billing_AlternateBillingAccount_BillingSubaccounts() throws Throwable {
		GuidewireAutomate_Validation("Search title", pa_Alternate_Billing_Account_Search_titlebar, "equals",
				"Search Accounts");

		GuidewireAutomate("Alternate Billing Account Search", Alternate_Billing_Account_Search, "click", "");
		GuidewireAutomate("Sending AccountNumber", pa_Alternate_Billing_Account_AccountNumber, "sendKeys",
				lhm_TestCase_Table_Data.get("AccountNumber"));
		GuidewireAutomate("Search", pa_Alternate_Billing_Account_Search_Button, "click", "");
		GuidewireAutomate("Select", pa_Alternate_Billing_Account_Search_Select, "click", "");

	}

	@Override
	public void billingContact(String Account) throws Throwable {
		GuidewireAutomate("Billing Contact icon", Billing_Contact_icon, "click", "");
		switch (Account) {
		case "New Company":
			GuidewireAutomate("New Company", Billing_Contact_NewCompany, "click", "");
			break;
		case "New Person":
			GuidewireAutomate("New Person", Billing_Contact_NewPerson, "click", "");
			break;

		case "From Address Book":
			GuidewireAutomate("From Address Book", Billing_Contact_FromAddressBook, "click", "");
			break;

		case "Existing Billing Contacts":
			GuidewireAutomate("Existing Billing Contacts", Billing_Contact_ExistingBillingContacts, "click", "");
			break;

		case "Other Contacts":
			GuidewireAutomate("Other Contacts", Billing_Contact_OtherContacts, "moveToElement", "");
			break;

		default:
			break;
		}

	}

	@Override
	public void paymentSchedule() throws Throwable {
		String strDynamicXpath = lhm_TestCase_Table_Data.get("PaymentPlan");
		By Payment_Plan = By.xpath("//div[text()='" + strDynamicXpath
				+ "']/ancestor::td[contains(@class,'gw-CellWidget')]/preceding-sibling::td[contains(@class,'gw-CellWidget')]//input[@name='InstallmentsPlansGroup_Radio']");
		By Installment = By.xpath("//div[text()='" + strDynamicXpath
				+ "']/ancestor::td[contains(@class,'gw-CellWidget')]/following-sibling::td['Installment'=substring(@id,197,string-length(@id))]//div[@class='gw-value']/div/div[1]");
		By Total = By.xpath("//div[text()='" + strDynamicXpath
				+ "']/ancestor::td[contains(@class,'gw-CellWidget')]/following-sibling::td['Total'=substring(@id,197,string-length(@id))]//div[@class='gw-value']/div/div[1]");
		By DownPayment = By.xpath("//div[text()='" + strDynamicXpath
				+ "']/ancestor::td[contains(@class,'gw-CellWidget')]/following-sibling::td['DownPayment'=substring(@id,197,string-length(@id))]//div[@class='gw-value']/div/div[1]");

		GuidewireAutomate("Payment Plan", Payment_Plan, "click", "");
		GuidewireAutomate_Validation("Installment", Installment, "equals", lhm_TestCase_Table_Data.get("Installment"));
		GuidewireAutomate_Validation("Total", Total, "equals", lhm_TestCase_Table_Data.get("Total"));
		GuidewireAutomate_Validation("DownPayment", DownPayment, "equals", lhm_TestCase_Table_Data.get("DownPayment"));

	}

	@Override
	public void invoicingOverrides() throws Throwable {
		GuidewireAutomate("Invoicing overrides checkbox", Invoicing_overrides_checkbox, "click", "");
		GuidewireAutomate("Fix Invoices By", Fix_Invoices_By, "click", "");
		GuidewireAutomate("Fix Invoices By", Fix_Invoices_By, "selectByVisibleTex",
				lhm_TestCase_Table_Data.get("FixInvoicesBy"));
		GuidewireAutomate("Day of Month", Day_of_Month, "click", "");
		GuidewireAutomate("Day of Month", Day_of_Month, "selectByVisibleTex",
				lhm_TestCase_Table_Data.get("DayofMonth"));
		GuidewireAutomate("Description", Description, "sendKeys", lhm_TestCase_Table_Data.get("Description"));

	}

	@Override
	public void upFrontPayment() throws Throwable {
		GuidewireAutomate("Invoicing overrides checkbox", Invoicing_overrides_checkbox, "click", "");
		GuidewireAutomate("Fix Invoices By", Fix_Invoices_By, "click", "");
		GuidewireAutomate("Fix Invoices By", Fix_Invoices_By, "selectByVisibleTex",
				lhm_TestCase_Table_Data.get("FixInvoicesBy"));
		GuidewireAutomate("Day of Month", Day_of_Month, "click", "");
		GuidewireAutomate("Day of Month", Day_of_Month, "selectByVisibleTex",
				lhm_TestCase_Table_Data.get("DayofMonth"));
		GuidewireAutomate("Description", Description, "sendKeys", lhm_TestCase_Table_Data.get("Description"));

	}

	@Override
	public void payUsing() throws Throwable {
		GuidewireAutomate_Validation("PayUsing titlebar", PayUsing_titlebar, "equals", "Demo Payment System");
		GuidewireAutomate_Validation("Policy Transaction Number", Policy_Transaction_Number, "equals",
				lhm_TestCase_Table_Data.get("PolicyTransactionNumber"));

		GuidewireAutomate("Payment_Method", Payment_Method, "selectByVisibleTex",
				lhm_TestCase_Table_Data.get("PaymentMethod"));
		GuidewireAutomate("Card_Type", Card_Type, "selectByVisibleTex", lhm_TestCase_Table_Data.get("CardType"));
		GuidewireAutomate("Credit_Card_Number", Credit_Card_Number, "sendKeys",
				lhm_TestCase_Table_Data.get("CreditCardNumber"));
		GuidewireAutomate("Exp_Date", Exp_Date, "sendKeys", lhm_TestCase_Table_Data.get("ExpDate"));
		GuidewireAutomate("Card_Holder_Name", Card_Holder_Name, "sendKeys",
				lhm_TestCase_Table_Data.get("CardHolderName"));
		GuidewireAutomate("pa_State", pa_State, "selectByVisibleTex", lhm_TestCase_Table_Data.get("State"));
		GuidewireAutomate("pa_Notes", pa_Notes, "sendKeys", lhm_TestCase_Table_Data.get("Notes"));
		GuidewireAutomate("pa_OK_button", pa_OK_button, "click", "");
	}
}
