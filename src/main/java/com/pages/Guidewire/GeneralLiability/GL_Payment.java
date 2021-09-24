package com.pages.Guidewire.GeneralLiability;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Resuables_PO;

public class GL_Payment extends SeleniumWebDriver_Commands {

	public GL_Payment(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
		// TODO Auto-generated constructor stub
	}

	// PremiumSummary
	private static By PA_PremiumSummary = By.xpath("//div[contains(@class,'gw-boldLabel') and text()='Premium Summary']");
	
	// Payments
	private static By PA_Payments = By.xpath("//div[contains(@class,'gw-boldLabel') and text()='Payments']");

	private static By PA_P_Frequency = By
			.xpath("//div[contains(@id,'PaymentsSummaryInputSet-Frequency')]//div[@class='gw-value-readonly-wrapper']");
	
	// Invoicing
	private static By PA_Invoicing = By.xpath("//div[contains(@class,'gw-boldLabel') and text()='Invoicing']");
	private static By PA_I_Frequency = By.xpath(
			"//div[contains(@id,'InvoiceStreamInputSet-InvoiceFrequency')]//div[@class='gw-value-readonly-wrapper']");
	private static By PA_I_FixInvoicesby = By.xpath(
			"//div[contains(@id,'InvoiceStreamInputSet-FixInvoicesBy')]//div[@class='gw-value-readonly-wrapper']");
	private static By PA_I_InvoicingDay = By
			.xpath("//div[contains(@id,'InvoiceStreamInputSet-DayOfMonth')]//div[@class='gw-value-readonly-wrapper']");
	private static By PA_I_PayUsing = By
			.xpath("//div[contains(@id,'InvoiceStreamInputSet-PayUsing')]//div[@class='gw-value-readonly-wrapper']");

	// Billing
	private static By PA_Billing = By.xpath("//div[contains(@class,'gw-boldLabel') and text()='Billing']");

	private static By PA_B_BillingLevel = By
			.xpath("//div[contains(@id,'BillingPanel-BillingLevel')]//div[@class='gw-value-readonly-wrapper']");
	private static By PA_B_BillingMethod = By.xpath("//select[contains(@name,'BillingPanel-BillingMethod')]");

	// PaymentSchedule
	private static By PA_PaymentSchedule = By.xpath("//div[contains(@class,'gw-boldLabel') and text()='Payment Schedule']");

	public static void premiumSummary() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("payment", strTestCaseName);

		GuidewireAutomate_Validation("Screen Header", PolicyCenter_Resuables_PO.Payment_Header, "equals", "Payment");

		GuidewireAutomate_Validation("Premium Summary", PA_PremiumSummary, "equals", "Premium Summary");

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();

	}

	public static void payments() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("payment", strTestCaseName);

		GuidewireAutomate_Validation("Payments", PA_Payments, "equals", "Payments");

		GuidewireAutomate_Validation("Frequency", PA_P_Frequency, "equals",
				lhm_TestCase_Table_Data.get("PA_P_Frequency"));

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	public static void invoicing() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("payment", strTestCaseName);

		GuidewireAutomate_Validation("Invoicing", PA_Invoicing, "equals", "Invoicing");

		GuidewireAutomate_Validation("Frequency", PA_I_Frequency, "equals",
				lhm_TestCase_Table_Data.get("PA_I_Frequency"));
		GuidewireAutomate_Validation("FixInvoicesby", PA_I_FixInvoicesby, "equals",
				lhm_TestCase_Table_Data.get("PA_I_FixInvoicesby"));
		GuidewireAutomate_Validation("InvoicingDay", PA_I_InvoicingDay, "equals",
				lhm_TestCase_Table_Data.get("PA_I_InvoicingDay"));
		GuidewireAutomate_Validation("PayUsing", PA_I_PayUsing, "equals", lhm_TestCase_Table_Data.get("PA_I_PayUsing"));

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	public static void billing() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("payment", strTestCaseName);

		GuidewireAutomate_Validation("Billing", PA_Billing, "equals", "Billing");

		GuidewireAutomate("BillingLevel", PA_B_BillingLevel, "click", "");
		GuidewireAutomate("Billing_Method", PA_B_BillingMethod, "selectByVisibleText",
				lhm_TestCase_Table_Data.get("PA_B_BillingMethod"));

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();

	}

	public static void paymentSchedule() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("payment", strTestCaseName);

		GuidewireAutomate_Validation("Payment Schedule", PA_PaymentSchedule, "equals", "Payment Schedule");

		String strDynamicXpath = lhm_TestCase_Table_Data.get("PA_PS_PaymentPlan");
		By PA_PS_PaymentPlan = By.xpath("//div[text()='" + strDynamicXpath
				+ "']/ancestor::td[contains(@class,'gw-CellWidget')]/preceding-sibling::td[contains(@class,'gw-CellWidget')]//div[@role='radio']");
		By PA_PS_DownPayment = By.xpath("//div[text()='" + strDynamicXpath
				+ "']/ancestor::td[contains(@class,'gw-CellWidget')]/following-sibling::td[contains(@id,'DownPayment') and contains(@class,'gw-FormatCellWidget')]//div[@class='gw-value']/div/div[1]");
		By PA_PS_Installment = By.xpath("//div[text()='" + strDynamicXpath
				+ "']/ancestor::td[contains(@class,'gw-CellWidget')]/following-sibling::td[contains(@id,'-Installment') and contains(@class,'gw-FormatCellWidget')]//div[contains(@id,'InstallmentPreview')]");
		By PA_PS_Total = By.xpath("//div[text()='" + strDynamicXpath
				+ "']/ancestor::td[contains(@class,'gw-CellWidget')]/following-sibling::td[contains(@id,'Total') and contains(@class,'gw-FormatCellWidget')]//div[@class='gw-value']/div/div[1]");
		// By PA_PS_Total = By.xpath("//div[text()='" + strDynamicXpath +
		// "']/ancestor::td[contains(@class,'gw-CellWidget')]/following-sibling::td['Total'=substring(@id,197,string-length(@id))]//div[@class='gw-value']/div/div[1]");

		GuidewireAutomate("Payment Plan = " + strDynamicXpath, PA_PS_PaymentPlan, "clickAndwait", "click");
		GuidewireAutomate_Validation("Down Payment", PA_PS_DownPayment, "fetch",
				lhm_TestCase_Table_Data.get("PA_PS_DownPayment"));
		GuidewireAutomate_Validation("Installment", PA_PS_Installment, "fetch",
				lhm_TestCase_Table_Data.get("PA_PS_Installment"));
		GuidewireAutomate_Validation("Total", PA_PS_Total, "fetch", lhm_TestCase_Table_Data.get("PA_PS_Total"));

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();

	}
}
