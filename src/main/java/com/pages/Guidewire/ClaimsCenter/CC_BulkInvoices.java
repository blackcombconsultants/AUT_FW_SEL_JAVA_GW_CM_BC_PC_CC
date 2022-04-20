package com.pages.Guidewire.ClaimsCenter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.aventstack.extentreports.ExtentTest;

public class CC_BulkInvoices extends SeleniumWebDriver_Commands {

	public CC_BulkInvoices(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	// Bulk Invoices
	private static By BulkInvoices_Header = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and text()='Bulk Invoices']");
	private static By BI_CreateNew        = By.xpath("//div[contains(@id,'CreateNewButton')]/div[@role='button']");

	// Bulk Invoice Details
	private static By BID_Header = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and text()='Bulk Invoice Details']");

	// BID Invoice
	private static By BID_I_Invoice                             = By.xpath("//input[contains(@name,'BulkInvoiceDetailDV-InvoiceNumber')]");
	private static By BID_I_DateReceived                        = By.xpath("//input[contains(@name,'BulkInvoiceDetailDV-ReceivedDate')]");
	private static By BID_I_Distribution_Distributeamountevenly = By.xpath("//input[contains(@id,'BulkInvoiceDetailDV-SplitEqually_0')]");
	private static By BID_I_Distribution_Amounttodistribute     = By.xpath("//input[contains(@name,'BulkInvoiceDetailDV-TotalAmount')]");

	// BID Invoice Item Details
	private static By BID_IID_DefaultCostType     = By.xpath("//select[contains(@name,'BulkInvoiceDetailDV-DefaultCostType')]");
	private static By BID_IID_DefaultCostCategory = By.xpath("//select[contains(@name,'BulkInvoiceDetailDV-DefaultCostCategory')]");
	private static By BID_IID_DefaultPaymentType  = By.xpath("//select[contains(@name,'BulkInvoiceDetailDV-DefaultPaymentType')]");

	// Check Details
	private static By CD_Payee = By.xpath("//div[contains(@id,'PaymentMethodInputSet-Payee')]//div[@class='gw-value-readonly-wrapper' and text()='<none selected>']");

	private static By Payee             = By.xpath("//div[contains(@id,'PayeeMenuIcon')]//div[@class='gw-action--expand-button']");
	private static By Payee_Search      = By.xpath("//div[contains(@id,'Payee-MenuItem_Search')]");
	private static By CD_PaymentMethod  = By.xpath("//input[contains(@id,'PaymentMethod_0')]");
	private static By CD_Check          = By.xpath("//input[contains(@name,'CheckNumber')]");
	private static By CD_DeliveryMethod = By.xpath("//select[contains(@name,'DeliveryMethod')]");

	// Search Address Book
	private static By SearchAddressBook_Header = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and text()='Search Address Book']");

	private static By SAB_Type      = By.xpath("//select[contains(@name,'ContactSubtype')]");
	private static By SAB_FirstName = By.xpath("//input[contains(@name,'GlobalPersonNameInputSet-FirstName')]");
	private static By SAB_LastName  = By.xpath("//input[contains(@name,'GlobalPersonNameInputSet-LastName')]");
	private static By SAB_Search    = By.xpath("//div[contains(@id,'SearchLinksInputSet-Search')]");
	private static By SAB_Select    = By.xpath("//div[contains(@id,'AddressBookSearchLV-0-_Select')]");

	// Payment Instructions
	private static By PI_SendDate          = By.xpath("//input[contains(@name,'ScheduledSendDate')]");
	private static By PI_CheckInstructions = By.xpath("//select[contains(@name,'BulkInvoiceDetailDV-CheckInstructions')]");
	private static By PI_Memo              = By.xpath("//input[contains(@name,'BulkInvoiceDetailDV-Memo')]");

	// Add Claim
	private static By Add_Button      = By.xpath("//div[contains(@id,'BulkInvoiceItemsLV_tb-Add')]//div[@role='button']");
	private static By AddClaim        = By.xpath("//div[contains(@id,'BulkInvoiceItemsLV_ClaimNumberMenuIcon')]//div[@class='gw-action--expand-button']");
	private static By AddClaim_Search = By.xpath("//div[contains(@id,'InvoiceItemClaimSearchPicker')]");
	private static By ReserveLine     = By.xpath("//select[contains(@name,'BulkInvoiceItemsLV_ReserveLine')]");
	private static By Exposure        = By.xpath("//select[contains(@name,'BulkInvoiceItemsLV_Exposure')]");
	private static By PaymentType     = By.xpath("//select[contains(@name,'BulkInvoiceItemsLV_PaymentType')]");
	private static By Amount          = By.xpath("//input[contains(@name,'BulkInvoiceItemsLV_Amount')]");
	private static By ServiceDate     = By.xpath("//input[contains(@name,'BulkInvoiceItemsLV_ServiceDate')]");
	private static By Description     = By.xpath("//input[contains(@name,'BulkInvoiceItemsLV_Description')]");
	private static By Status          = By.xpath(" //div[contains(@id,'BulkInvoiceItemsLV-0-BulkInvoiceItemsLV_Status')]//div[@class='gw-label']");
	private static By Update          = By.xpath("//div[contains(@id,'BulkInvoiceDetailScreen-Update')]");

	// Search Claims
	private static By SC_Header = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and text()='Search Claims']");
	private static By SC_Claim  = By.xpath("//input[contains(@name,'ClaimSearchRequiredInputSet-ClaimNumber')]");
	private static By SC_Search = By.xpath("//div[contains(@id,'ClaimSearchAndResetInputSet-Search')]");
	private static By SC_Select = By.xpath("//div[contains(@id,'ClaimSearchResultsLV-0-_Select')]");

	// Bulk Invoice Details
	private static By BID_Invoice             = By.xpath("//div[contains(@id,'InvoiceNumber')]//div[@class='gw-value-readonly-wrapper']");
	private static By BID_DateReceived        = By.xpath("//div[contains(@id,'ReceivedDate')]//div[@class='gw-value-readonly-wrapper']");
	private static By BID_Status              = By.xpath("//div[contains(@id,'BulkInvoiceDetailDV-Status')]//div[@class='gw-RangeValue']/div[@class='gw-label']");
	private static By BID_DefaultCostType     = By.xpath("//div[contains(@id,'DefaultCostType')]//div[@class='gw-RangeValue']/div[@class='gw-label']");
	private static By BID_DefaultCostCategory = By.xpath("//div[contains(@id,'DefaultCostCategory')]//div[@class='gw-RangeValue']/div[@class='gw-label']");
	private static By BID_DefaultPaymentType  = By.xpath("//div[contains(@id,'DefaultPaymentType')]//div[@class='gw-RangeValue']/div[@class='gw-label']");
	private static By BID_Check               = By.xpath("//div[contains(@id,'CheckNumber')]//div[@class='gw-value-readonly-wrapper']");
	private static By BID_DeliveryMethod      = By.xpath("//div[contains(@id,'DeliveryMethod')]//div[@class='gw-RangeValue']/div[@class='gw-label']");

	/*
	 * 
	 */
	public static void BulkInvoices_CreateNew() throws Throwable {
		try {

			lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("bulkInvoices");
			GuidewireAutomate_Validation("Screen Header", BulkInvoices_Header, "equals", "Bulk Invoices");
			GuidewireAutomate("Create New", BI_CreateNew, "click", "click");
			GuidewireAutomate_Validation("Screen Header", BID_Header, "equals", "Bulk Invoice Details");

		} catch (Exception e) {

		}
	}

	public static void BID_Invoice() throws Throwable {
		try {
			lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("bulkInvoices");
			GuidewireAutomate("Invoice", BID_I_Invoice, "clearANDsendKeys", lhm_TestCase_Table_Data.get("BID_I_Invoice"));
			GuidewireAutomate("DateReceived", BID_I_DateReceived, "clearANDsendKeys", lhm_TestCase_Table_Data.get("BID_I_DateReceived"));
			GuidewireAutomate("Distribute amount evenly", BID_I_Distribution_Distributeamountevenly, "click", "click");
			GuidewireAutomate("Amount to distribute", BID_I_Distribution_Amounttodistribute, "clearANDsendKeys", lhm_TestCase_Table_Data.get("BID_I_Distribution_Amounttodistribute"));
		} catch (Exception e) {

		}
	}

	public static void BID_InvoiceItemDetails() throws Throwable {
		try {
			lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("bulkInvoices");
			GuidewireAutomate_Validation("DefaultCostType Values", BID_IID_DefaultCostType, "getOptionscontains", lhm_TestCase_Table_Data.get("BID_IID_DefaultCostType_Values"));
			GuidewireAutomate("Default Cost Type", BID_IID_DefaultCostType, "selectByVisibleText", lhm_TestCase_Table_Data.get("BID_IID_DefaultCostType"));

			GuidewireAutomate_Validation("DefaultCostCategory Values", BID_IID_DefaultCostCategory, "getOptionscontains", lhm_TestCase_Table_Data.get("BID_IID_DefaultCostCategory_Values"));
			GuidewireAutomate("Default Cost Category", BID_IID_DefaultCostCategory, "selectByVisibleText", lhm_TestCase_Table_Data.get("BID_IID_DefaultCostCategory"));

			GuidewireAutomate_Validation("DefaultPaymentType Values", BID_IID_DefaultPaymentType, "getOptionscontains", lhm_TestCase_Table_Data.get("BID_IID_DefaultPaymentType_Values"));
			GuidewireAutomate("Default PaymentType", BID_IID_DefaultPaymentType, "selectByVisibleText", lhm_TestCase_Table_Data.get("BID_IID_DefaultPaymentType"));
		} catch (Exception e) {

		}
	}

	public static void CheckDetails_Search() throws Throwable {
		try {
			lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("bulkInvoices");
			GuidewireAutomate_Validation("Payee", CD_Payee, "equals", "<none selected>");
			GuidewireAutomate("Payee", Payee, "clickAndwait", "click");
			GuidewireAutomate("Payee Search", Payee_Search, "clickAndwait", "click");
			GuidewireAutomate_Validation("Screen Header", SearchAddressBook_Header, "equals", "Search Address Book");
			GuidewireAutomate("Type", SAB_Type, "selectByVisibleText", lhm_TestCase_Table_Data.get("SAB_Type"));
			GuidewireAutomate("FirstName", SAB_FirstName, "clearANDsendKeys", lhm_TestCase_Table_Data.get("SAB_FirstName"));
			GuidewireAutomate("LastName", SAB_LastName, "clearANDsendKeys", lhm_TestCase_Table_Data.get("SAB_LastName"));
			GuidewireAutomate("Search", SAB_Search, "click", "click");
			GuidewireAutomate("Select", SAB_Select, "click", "click");
			GuidewireAutomate("Payment Method", CD_PaymentMethod, "click", "click");
			GuidewireAutomate("Check", CD_Check, "clearANDsendKeys", lhm_TestCase_Table_Data.get("CD_Check"));
			GuidewireAutomate_Validation("Delivery Method", CD_DeliveryMethod, "getOptionscontains", lhm_TestCase_Table_Data.get("CD_DeliveryMethod_Values"));
			GuidewireAutomate("Delivery Method", CD_DeliveryMethod, "selectByVisibleText", lhm_TestCase_Table_Data.get("CD_DeliveryMethod"));

		} catch (Exception e) {

		}
	}

	public static void BID_PaymentInstructions() throws Throwable {
		try {
			lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("bulkInvoices");
			GuidewireAutomate("Check Instructions", PI_CheckInstructions, "selectByVisibleText", lhm_TestCase_Table_Data.get("PI_CheckInstructions"));
			GuidewireAutomate("Memo", PI_Memo, "clearANDsendKeys", lhm_TestCase_Table_Data.get("PI_Memo"));

		} catch (Exception e) {

		}
	}

	public static void BID_Add() throws Throwable {
		try {
			lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("bulkInvoices");
			GuidewireAutomate("Add Button", Add_Button, "clickAndwait", "click");
			GuidewireAutomate("AddClaim", AddClaim, "clickAndwait", "click");
			GuidewireAutomate("Add ClaimSearch", AddClaim_Search, "clickAndwait", "click");
			GuidewireAutomate_Validation("Screen Header", SC_Header, "equals", "Search Claims");
			GuidewireAutomate("Claim", SC_Claim, "clearANDsendKeys", lhm_TestCase_Table_Data.get("SC_Claim"));
			GuidewireAutomate("Search", SC_Search, "click", "click");
			GuidewireAutomate("Select", SC_Select, "click", "click");

			GuidewireAutomate("ReserveLine", ReserveLine, "selectByVisibleText", lhm_TestCase_Table_Data.get("ReserveLine"));
			// GuidewireAutomate("Exposure", Exposure, "selectByVisibleText",
			// lhm_TestCase_Table_Data.get("Exposure"));
			getStaleElement("Payment Type", PaymentType);

			GuidewireAutomate_Validation("Payment Type", PaymentType, "FirstSelectedOptionEquals", lhm_TestCase_Table_Data.get("PaymentType"));

			// GuidewireAutomate("Amount", Amount, "clearANDsendKeys",
			// lhm_TestCase_Table_Data.get("Amount"));
			GuidewireAutomate("ServiceDate", ServiceDate, "clearANDsendKeys", lhm_TestCase_Table_Data.get("ServiceDate"));
			GuidewireAutomate("Description", Description, "clearANDsendKeys", lhm_TestCase_Table_Data.get("Description"));

			GuidewireAutomate_Validation("Status", Status, "equals", lhm_TestCase_Table_Data.get("Status"));
			GuidewireAutomate("Update", Update, "clickAndwait", "click");

		} catch (Exception e) {

		}
	}

	public static void BulkInvoiceDetails() throws Throwable {
		try {

			lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("bulkInvoices");
			GuidewireAutomate_Validation("Screen Header", BID_Header, "equals", "Bulk Invoice Details");

			GuidewireAutomate_Validation("Invoice", BID_Invoice, "equals", lhm_TestCase_Table_Data.get("BID_I_Invoice"));
			GuidewireAutomate_Validation("DateReceived", BID_DateReceived, "equals", lhm_TestCase_Table_Data.get("BID_I_DateReceived"));
			GuidewireAutomate_Validation("Status", BID_Status, "equals", lhm_TestCase_Table_Data.get("Status"));
			GuidewireAutomate_Validation("DefaultCostType", BID_DefaultCostType, "equals", lhm_TestCase_Table_Data.get("BID_IID_DefaultCostType"));
			GuidewireAutomate_Validation("DefaultCostCategory", BID_DefaultCostCategory, "equals", lhm_TestCase_Table_Data.get("BID_IID_DefaultCostCategory"));
			GuidewireAutomate_Validation("DefaultPaymentType", BID_DefaultPaymentType, "equals", lhm_TestCase_Table_Data.get("BID_IID_DefaultPaymentType"));
			GuidewireAutomate_Validation("Check", BID_Check, "equals", lhm_TestCase_Table_Data.get("CD_Check"));
			GuidewireAutomate_Validation("DeliveryMethod", BID_DeliveryMethod, "equals", lhm_TestCase_Table_Data.get("CD_DeliveryMethod"));

		} catch (Exception e) {

		}
	}

}
