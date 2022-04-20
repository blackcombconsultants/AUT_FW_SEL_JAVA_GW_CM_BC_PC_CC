package com.pages.Guidewire.ClaimsCenter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.aventstack.extentreports.ExtentTest;

public class CC_NewTransaction_Check extends SeleniumWebDriver_Commands {

	// private static private static By FT_CostCategory = null;
	public CC_NewTransaction_Check(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	private static By Screen_Header = By.xpath("//div[contains(@id,'ttlBar')]//div[@role='heading']");

	// Setcheckinstructions
	private static By Setcheckinstructions_Header = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and contains(text(),'Step 3 of 3: Set check instructions')]");

	private static By SCI_PayToTheOrderOf = By.xpath("//div[contains(@id,'CheckWizardCheckSummaryInputSet-Check_PayTo')]//div[@class='gw-value-readonly-wrapper']");
	private static By SCI_MailingAddress  = By.xpath("//div[contains(@id,'CheckWizardCheckSummaryInputSet-Check_MailTo_Input')]//div[@class='gw-value-readonly-wrapper']");
	/*
	 * CheckDetails
	 */

	private static By CD_PrimaryPayee_Namee = By.xpath("//select[contains(@name,'PrimaryPayee_Name')]");
	private static By PrimaryPayee_Type     = By.xpath("//select[contains(@name,'PrimaryPayee_Type')]");
	private static By AddJointPayees        = By.xpath("//div[contains(@id,'AddJointPayees')]//div[@role='button']");
	private static By JointPayees           = By.xpath("//select[contains(@name,'PayeeDVPayeesLV-1-PayeeName')]");
	private static By JointPayeesType       = By.xpath("//select[contains(@name,'PayeeDVPayeesLV-1-PayeeType')]");
	private static By CD_PrimaryPayee_City  = By.xpath("//input[contains(@name,'GlobalAddressInputSet-City')]");
	private static By CD_PrimaryPayee_State = By.xpath("//select[contains(@name,'GlobalAddressInputSet-State')]");
	private static By PaymentMethod         = By.xpath("//input[contains(@id,'PaymentMethod_1')]");
	private static By BenefeciaryBankName   = By.xpath("//input[contains(@name,'BeneficiaryCountry_Ext')]");
	private static By NameontheAccount      = By.xpath("//textarea[contains(@name,'BeneficiaryDetails_ExtInputSet-PayTo')]");
	private static By AccntNumber           = By.xpath("//input[contains(@name,'BankAccountNumber')]");
	private static By RBAAccntNumber        = By.xpath("//input[contains(@name,'BankRoutingNumber')]");

	// Payment method
	private static By PM_MethodSection           = By.xpath("//div[contains(@id,'PaymentMethod_Input')]//div[@class='gw-label gw-boldLabel' and text()='Payment Method']");
	private static By PM_Check                   = By.xpath("//input[contains(@id,'DV-PaymentMethod_0')]");
	private static By PM_PayToTheOrderOf         = By.xpath("//textarea[contains(@name,'PayTo')]");
	private static By PM_Electronicfundstransfer = By.xpath("//input[contains(@id,'DV-PaymentMethod_1')]");
	private static By PM_MailToSection           = By.xpath("//div[@class='gw-label gw-boldLabel' and text()='Mail To']");
	private static By PM_CheckDelivery           = By.xpath("//select[contains(@name,'DeliveryMethod')]");
	private static By PM_Recipient               = By.xpath("//input[contains(@name,'MailToContact')]");
	private static By PM_MailingAddress          = By.xpath("//div[contains(@id,'MailingAddress')]//div[@class='gw-value-readonly-wrapper']");

	// Tax Reporting
	private static By TaxReportingSection = By.xpath("//div[@class='gw-label gw-boldLabel' and text()='Tax Reporting']");
	private static By ReportAs            = By.xpath("//select[contains(@name,'Reportability')]");

	private static By CD_CheckIssuance_CheckNumber = By.xpath("//input[contains(@name,'CheckNumber')]");

	/*
	 * Payment Details And Payment
	 */
	private static By PD_ReserveLine               = By.xpath("//select[contains(@name,'ReserveLineInputSet-ReserveLine')]");
	private static By PD_Coverage                  = By.xpath("//div[contains(@id,'ReserveLineInputSet-Coverage')]//div[@class='gw-RangeValue']/div[@class='gw-label']");
	private static By PD_PaymentType               = By.xpath("//select[contains(@name,'Payment_PaymentType')]");
	private static By PD_ErodingYes                = By.xpath("//input[contains(@id,'Payment_Eroding_0')]");
	private static By PD_ErodingNo                 = By.xpath("//input[contains(@id,'Payment_Eroding_1')]");
	private static By PD_AvailableReserves         = By.xpath("//div[contains(@id,'Transaction_AvailableReserves')]//div[@class='gw-vw--value gw-align-h--left']");
	private static By PD_Comments                  = By.xpath("//input[contains(@name,'Transaction_Comments')]");
	private static By PD_Currency                  = By.xpath("//div[contains(@id,'NewPaymentDetailDV-Payment_Currency')]//div[@class='gw-value']");
	private static By PD_CurrencySelect            = By.xpath("//select[contains(@name,'NewPaymentDetailDV-Payment_Currency')]");
	private static By PD_LineItemsCategory         = By.xpath("//select[contains(@name,'LineCategory')]");
	private static By PD_LineItemsCategoryCheckBox = By.xpath("//div[contains(@id,'EditablePaymentLineItemsLV-0-_Checkbox')]//input[@type='checkbox']");
	private static By PD_LineItemsAmount           = By.xpath("//input[contains(@name,'Amount')]");
	private static By PD_LineItemsAdditemButton    = By.xpath("//div[contains(@id,'EditablePaymentLineItemsLV_tb-Add')]//div[@role='button']");
	private static By PD_LineItemsRemoveButton     = By.xpath("//div[contains(@id,'EditablePaymentLineItemsLV_tb-Remove')]//div[@role='button']");
	private static By PD_CostType                  = By.xpath("//select[contains(@name,'CostType')]");

	private static By PD_CostCategory = By.xpath("//select[contains(@name,'ReserveLineInputSet-CostCategory')]");

	/*
	 * LineItems
	 */

	private static By PD_LineItems_Add     = By.xpath("//div[contains(@id,'EditablePaymentLineItemsLV_tb-Add')]//div[@role='button']");
	private static By PD_LineItem_Category = By.xpath("//select[contains(@name,'EditablePaymentLineItemsLV-0-LineCategory')]");
	private static By PD_LineItem_Amount   = By.xpath("//input[contains(@name,'EditablePaymentLineItemsLV-0-Amount')]");
	private static By PD_CheckBox          = By.xpath("//div[contains(@id,'NewPaymentDetailDV-EditablePaymentLineItemsLV-1-_Checkbox')]/input[contains(@name,'EditablePaymentLineItemsLV-1-_Checkbox')]");
	private static By Finish_Button        = By.xpath("//div[contains(@id,'Finish')]//div[@role='button']");

	private static By PD_Remove = By.xpath("//div[contains(@id,'EditablePaymentLineItemsLV_tb-Remove')]/div[@role='button']");
	/*
	 * Setcheckinstructions
	 */
	private static By SI_GrossAmount = By.xpath("//div[contains(@id,'Amount_Gross')]//div[@class='gw-vw--value gw-align-h--left']");
	private static By SI_NetAmount   = By.xpath("//div[contains(@id,'Amount_Net')]//div[@class='gw-vw--value gw-align-h--left']");

	private static By PrimaryPayee = By.xpath("//div[contains(@id,'NewCheckPayeeDV-1')]");

	// Validation Results for Rental Coverages
	private static By ValidationResults_Header          = By.xpath("//div[contains(@id,'wsTabBar')]//div[@class='gw-label' and text()='Validation Results']");
	private static By ValidationResults_Warnings_Header = By.xpath("//div[contains(@id,'WebMessageWorksheetScreen')]//div[text()='Warnings:']");
	private static By ValidationResults_Warning_First   = By.xpath("//div[contains(@id,'WebMessageWorksheetScreen-grpMsgs-0-0')]//div[@class='gw-message' and contains(text(),'gross incurred on exposure')]");
	private static By ValidationResults_Warning_Second  = By.xpath("//div[contains(@id,'WebMessageWorksheetScreen-grpMsgs')]//div[@class='gw-message' and contains(text(),'This check would cause gross incurred on')]");

	// Validation results for claim cost
	private static By Validation_Header = By.xpath("//div[@class='gw-action--inner gw-hasDivider']//div[@class='gw-label' and text()='Validation Results']");
	private static By Clear_Button      = By.xpath("//div[contains(@id,'ClearButton')]//div[@role='button']");
	private static By Next_Button       = By.xpath("//div[contains(@id,'Next')]//div[@role='button']");
	private static By Error_Msg         = By.xpath("//div[contains(@id,'WebMessageWorksheetScreen-grpMsgs')]//div[@class='gw-message']");

	// financial check Page
	private static By FinancialsChecksHeader = By.xpath("//div[contains(@id,'ttlBar')]//div[@role='heading']");
	private static By PayTo                  = By.xpath("//div[contains(@id,'PayTo')]//div[@class='gw-value-readonly-wrapper']");
	private static By GrossAmount            = By.xpath("//div[contains(@class,'gw-CurrencyValue--modelValue gw-ActionValueWidget')]");
	private static By ScheduledSendDate      = By.xpath("//div[contains(@id,'ScheduledSendDate')]//div[@class='gw-value-readonly-wrapper']");
	private static By Status                 = By.xpath("//div[contains(@id,'Status')]//div[@class='gw-RangeValue']");

	public static void Enterpayeeinformation() throws Throwable {
		try {
			lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("NewTransaction_Check");

			GuidewireAutomate_Validation("Screen Header", Screen_Header, "equals", "Step 1 of 3: Enter payee information");
			// GuidewireAutomate_Validation("Primary Payee", PrimaryPayee, "equals", "Primary Payee");
			getStaleElement("Name", CD_PrimaryPayee_Namee);
			GuidewireAutomate("Name", CD_PrimaryPayee_Namee, "selectByVisibleText", lhm_TestCase_Table_Data.get("CD_PrimaryPayee_Namee"));
			if (IsElementDisplayed("State", CD_PrimaryPayee_State)) {
				GuidewireAutomate("State", CD_PrimaryPayee_State, "selectByVisibleText", lhm_TestCase_Table_Data.get("CD_PrimaryPayee_State"));

				getStaleElement("City", CD_PrimaryPayee_City);
				GuidewireAutomate("City", CD_PrimaryPayee_City, "sendKeys", lhm_TestCase_Table_Data.get("CD_PrimaryPayee_City"));
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void PrimaryPayee_AddJointPayees() throws Throwable {
		try {
			lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("EnterCheckBasics");

			GuidewireAutomate_Validation("Verify Primary Payee Name", CD_PrimaryPayee_Namee, "getOptionscontains", lhm_TestCase_Table_Data.get("PrimaryPayeeNameDropDown"));
			GuidewireAutomate("Primary Payee Name Select", CD_PrimaryPayee_Namee, "selectByVisibleText", lhm_TestCase_Table_Data.get("PrimaryPayeeNameSelect"));
			GuidewireAutomate_Validation("Verify Primary Payee Type", PrimaryPayee_Type, "getOptionscontains", lhm_TestCase_Table_Data.get("PrimaryPayeeTypeDropDown"));
			GuidewireAutomate("Primary Payee Type Select", PrimaryPayee_Type, "selectByVisibleText", lhm_TestCase_Table_Data.get("PrimaryPayeeTypeSelect"));

			GuidewireAutomate("AddJointPayees", AddJointPayees, "clickAndwait", "click");

			GuidewireAutomate_Validation("Joint Payees", JointPayees, "getOptionscontains", lhm_TestCase_Table_Data.get("JointPayees"));
			GuidewireAutomate_Validation("Verify Joint Payees Type", JointPayeesType, "getOptionscontains", lhm_TestCase_Table_Data.get("JointPayeesType"));
			GuidewireAutomate("Joint Payees Select", JointPayees, "selectByVisibleText", lhm_TestCase_Table_Data.get("JointPayeesSelect"));

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void PaymentMethod() throws Throwable {
		try {
			lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("EnterCheckBasics");

			GuidewireAutomate_Validation("Payment Method Section", PM_MethodSection, "equals", "Payment Method");
			GuidewireAutomate("Payment Method Check", PM_Check, "clickAndwait", "clickAndwait");
			GuidewireAutomate("Pay To The Order Of", PM_PayToTheOrderOf, "clearANDsendKeys", lhm_TestCase_Table_Data.get("PayToTheOrderOf"));
			GuidewireAutomate_Validation("Mail To Section", PM_MailToSection, "equals", "Mail To");
			GuidewireAutomate_Validation("Verify Check Delivery", PM_CheckDelivery, "getOptionscontains", lhm_TestCase_Table_Data.get("CheckDeliveryDropDown"));
			GuidewireAutomate("Check Delivery", PM_CheckDelivery, "selectByVisibleText", lhm_TestCase_Table_Data.get("CheckDelivery"));
			GuidewireAutomate("Recipient", PM_Recipient, "clearANDsendKeys", lhm_TestCase_Table_Data.get("Recipient"));
			GuidewireAutomate_Validation("Mailing Address", PM_MailingAddress, "equals", lhm_TestCase_Table_Data.get("MailingAddress"));

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void TaxReporting() throws Throwable {
		try {
			lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("EnterCheckBasics");

			GuidewireAutomate_Validation("Tax Reporting Section", TaxReportingSection, "equals", "Tax Reporting");
			GuidewireAutomate_Validation("Verify Report As", ReportAs, "getOptionscontains", lhm_TestCase_Table_Data.get("ReportAsDropDown"));
			GuidewireAutomate("Report As", ReportAs, "selectByVisibleText", lhm_TestCase_Table_Data.get("ReportAs"));
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	public static void Payment() throws Throwable {
		try {
			lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("EnterCheckBasics");

			GuidewireAutomate_Validation("Verify Reserve Line", PD_ReserveLine, "getOptionscontains", lhm_TestCase_Table_Data.get("ReserveLineDropDown"));
			GuidewireAutomate("Reserve Line", PD_ReserveLine, "selectByVisibleText", lhm_TestCase_Table_Data.get("ReserveLine"));
			GuidewireAutomate_Validation("Coverage", PD_Coverage, "equals", lhm_TestCase_Table_Data.get("Coverage"));
			GuidewireAutomate_Validation("Verify Payment Type", PD_PaymentType, "getOptionscontains", lhm_TestCase_Table_Data.get("PaymentTypeDropDown"));
			GuidewireAutomate("Payment Type", PD_PaymentType, "selectByVisibleText", lhm_TestCase_Table_Data.get("PaymentType"));
			GuidewireAutomate_Validation("Available Reserves", PD_AvailableReserves, "equals", lhm_TestCase_Table_Data.get("AvailableReserves"));
			GuidewireAutomate("Comments", PD_Comments, "clearANDsendKeys", lhm_TestCase_Table_Data.get("Comments"));
			GuidewireAutomate_Validation("Verify Line Items Category", PD_LineItemsCategory, "getOptionscontains", lhm_TestCase_Table_Data.get("LineItemsCategoryDropDown"));
			GuidewireAutomate("Line Items Add Item Button", PD_LineItemsAdditemButton, "clickAndwait", "clickAndwait");
			Thread.sleep(500);
			GuidewireAutomate("Line Items Category Check Box", PD_LineItemsCategoryCheckBox, "clickAndwait", "clickAndwait");
			GuidewireAutomate("Line Items Remove Button", PD_LineItemsRemoveButton, "clickAndwait", "clickAndwait");
			Thread.sleep(500);
			GuidewireAutomate("Select Line Items Category", PD_LineItemsCategory, "selectByVisibleText", lhm_TestCase_Table_Data.get("LineItemsCategory"));
			GuidewireAutomate("Amount", PD_LineItemsAmount, "clearANDsendKeys", lhm_TestCase_Table_Data.get("LineItemsAmount"));

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void FinancialsChecks() throws Throwable {
		try {
			lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("FinancialsChecks");

			GuidewireAutomate_Validation("Financials: Checks Header", FinancialsChecksHeader, "equals", "Financials: Checks");
			GuidewireAutomate_Validation("PayTo", PayTo, "equals", lhm_TestCase_Table_Data.get("PayTo"));
			GuidewireAutomate_Validation("Gross Amount", GrossAmount, "equals", lhm_TestCase_Table_Data.get("GrossAmount"));
			GuidewireAutomate_Validation("Scheduled Send Date", ScheduledSendDate, "equals", lhm_TestCase_Table_Data.get("ScheduledSendDate"));
			GuidewireAutomate_Validation("Status", Status, "equals", lhm_TestCase_Table_Data.get("Status"));

		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}

	public static void Enterpaymentinformation() throws Throwable {
		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("NewTransaction_Check");

		try {
			GuidewireAutomate_Validation("Screen Header", Screen_Header, "equals", "Step 2 of 3: Enter payment information");

			GuidewireAutomate("Reserve Line", PD_ReserveLine, "selectByVisibleText", lhm_TestCase_Table_Data.get("ReserveLine"));
			// GuidewireAutomate_Validation("Coverage", PD_Coverage, "equals", lhm_TestCase_Table_Data.get("Coverage"));
			getStaleElement("Reserve Line", PD_ReserveLine);
			GuidewireAutomate("Payment Type", PD_PaymentType, "selectByVisibleText", lhm_TestCase_Table_Data.get("PaymentType"));
			// Eroding

			// Verify whether the below list is displayed in the Category field.
			GuidewireAutomate("LineItem Category", PD_LineItem_Category, "selectByVisibleText", lhm_TestCase_Table_Data.get("LineItems_Category"));

			Thread.sleep(500);
			GuidewireAutomate("Amount", PD_LineItem_Amount, "clearANDsendKeys", lhm_TestCase_Table_Data.get("LineItem_Amount_1"));
			CC_Reusables.clickButton("Next");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;

		}

	}

	/*
	 * owner; Rahul Dixit
	 */
	public static void EnterFullpaymentinformation() throws Throwable {
		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("NewTransaction_Check");

		try {

			GuidewireAutomate("Reserve Line", PD_ReserveLine, "selectByVisibleText", "Claim-level; Expense - A&O/Expense; USD");
			// GuidewireAutomate_Validation("Coverage", PD_Coverage, "equals", lhm_TestCase_Table_Data.get("Coverage"));
			// GuidewireAutomate_Validation("Cost Type", PD_CostType, "selectByVisibleText", lhm_TestCase_Table_Data.get("Cost_Type"));
			// GuidewireAutomate_Validation("Cost Category", PD_CostCategory, "selectByVisibleText", lhm_TestCase_Table_Data.get("Cost_Category"));

			GuidewireAutomate("Payment Type", PD_PaymentType, "selectByVisibleText", lhm_TestCase_Table_Data.get("PaymentType"));
			// Eroding

			// Verify whether the below list is displayed in the Category field.
			GuidewireAutomate_Validation("LineItem Category", PD_LineItem_Category, "getOptionscontains", lhm_TestCase_Table_Data.get("LineItems_Category"));
			GuidewireAutomate("Amount", PD_LineItem_Amount, "clearANDsendKeys", lhm_TestCase_Table_Data.get("LineItem_Amount_1"));

			Thread.sleep(500);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;

		}

	}
	public static void EPI_PolicyDetails_VerifyCurrencyOptions() throws Throwable {
		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("NewTransaction_Check");
		try {
			GuidewireAutomate_Validation("Screen Header", Screen_Header, "equals", "Step 2 of 3: Enter payment information");

			GuidewireAutomate("Reserve Line", PD_ReserveLine, "selectByVisibleText", lhm_TestCase_Table_Data.get("ReserveLine"));

			getStaleElement("Payment Type", PD_PaymentType);
			GuidewireAutomate("Payment Type", PD_PaymentType, "selectByVisibleText", lhm_TestCase_Table_Data.get("PaymentType"));
			// GuidewireAutomate_Validation("Coverage", PD_Coverage, "equals", lhm_TestCase_Table_Data.get("Coverage"))

			// Eroding
			GuidewireAutomate("Eroding Yes", PD_ErodingYes, "clickAndwait", "click");
			GuidewireAutomate("Comments", PD_Comments, "clearANDsendKeys", lhm_TestCase_Table_Data.get("Comments"));
			GuidewireAutomate_Validation("Reserving Currency", PD_Currency, "equals", lhm_TestCase_Table_Data.get("ReservingCurrency"));
			GuidewireAutomate("Select Line Item Category", PD_LineItemsCategory, "selectByVisibleText", lhm_TestCase_Table_Data.get("LineItems_Category"));
			GuidewireAutomate("Amount", PD_LineItemsAmount, "clearANDsendKeys", lhm_TestCase_Table_Data.get("LineItem_Amount_1"));

		} catch (Exception e) {
			e.printStackTrace();
			throw e;

		}
	}

	public static void CreatingCheck_LineItem_Mileagereimbursement() throws Throwable {

		try {
			CC_NewTransaction_Check.Enterpayeeinformation();
			CC_NewTransaction_Check.Enterpaymentinformation();
			CC_NewTransaction_Check.AddItems_Mileagereimbursement();
			CC_Reusables.clickButton("Next");
			CC_Reusables.clickButton("Next");
			CC_NewTransaction_Check.Setcheckinstructions();
			CC_Reusables.clickButton("Finish");
			// oExtentTest.log(Status.PASS, "Check is succcesful");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;

		}
	}

	public static void CreatingCheck_LineItem_Other() throws Throwable {
		try {
			CC_NewTransaction_Check.Enterpayeeinformation();
			CC_NewTransaction_Check.Enterpaymentinformation();
			CC_NewTransaction_Check.AddItem_Others();
			CC_Reusables.clickButton("Next");
			CC_Reusables.clickButton("Next");
			CC_NewTransaction_Check.Setcheckinstructions();
			CC_Reusables.clickButton("Finish");
			// oExtentTest.log(Status.PASS, "Check is succcesful");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;

		}
	}

	public static void ValidationResults_ClaimCost() throws Throwable {
		try {
			GuidewireAutomate_Validation("Validation Header", Validation_Header, "equals", "Validation Results");
			GuidewireAutomate_Validation("Validation Error", Error_Msg, "contains", "There is $500.00 unapplied deductible for");
			GuidewireAutomate("Clear", Clear_Button, "clickAndwait", "click");
			// oExtentTest.log(Status.PASS, "");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;

		}
	}

	public static void AddItems_Mileagereimbursement() throws Throwable {
		try {
			lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("NewTransaction_Check");

			GuidewireAutomate("LineItem Category", PD_LineItem_Category, "selectByVisibleText", lhm_TestCase_Table_Data.get("LineItemCategory_1"));
			GuidewireAutomate("LineItem Category", PD_LineItem_Amount, "clearANDsendKeys", lhm_TestCase_Table_Data.get("LineItem_Amount_1"));
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void AddItem_Others() throws Throwable {
		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("NewTransaction_Check");
		try {
			GuidewireAutomate("LineItem Category", PD_LineItem_Category, "selectByVisibleText", lhm_TestCase_Table_Data.get("LineItemCategory_2"));
			GuidewireAutomate("LineItem Category", PD_LineItem_Amount, "clearANDsendKeys", lhm_TestCase_Table_Data.get("LineItem_Amount_2"));
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void Setcheckinstructions() throws Throwable {

		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("NewTransaction_Check");
		try {
			GuidewireAutomate_Validation("Screen Header", Setcheckinstructions_Header, "equals", "Step 3 of 3: Set check instructions");

			GuidewireAutomate_Validation("PayToTheOrderOf", SCI_PayToTheOrderOf, "equals", lhm_TestCase_Table_Data.get("PayToTheOrderOf"));
			// GuidewireAutomate_Validation("Mailing Address", SCI_MailingAddress, "equals",
			// lhm_TestCase_Table_Data.get("MailingAddress"));
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void Check_ValidationResults_RentalReimbursement() throws Throwable {

		try {
			GuidewireAutomate_Validation("ValidationResults Header", ValidationResults_Header, "equals", "Validation Results");
			GuidewireAutomate_Validation("Warnings Title", ValidationResults_Warnings_Header, "equals", "Warnings:");
			GuidewireAutomate_Validation("Warnings First", ValidationResults_Warning_First, "contains", "This check would cause gross incurred on exposure");
			GuidewireAutomate_Validation("Warnings Second", ValidationResults_Warning_Second, "contains", "This check would cause gross incurred on coverage");

			GuidewireAutomate("Clear", Clear_Button, "clickAndwait", "click");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;

		}
	}

	public static void Check_ValidationResults_ElectronicEquipment() throws Throwable {

		try {
			GuidewireAutomate_Validation("ValidationResults Header", ValidationResults_Header, "equals", "Validation Results");
			GuidewireAutomate_Validation("Warnings Title", ValidationResults_Warnings_Header, "equals", "Warnings:");
			GuidewireAutomate_Validation("Warnings First", ValidationResults_Warning_Second, "contains", "This check would cause gross incurred on coverage");
			GuidewireAutomate("Clear", Clear_Button, "clickAndwait", "click");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;

		}
	}

	public static void SelectCurrencyOtherthanUSD() throws Throwable {
		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("NewTransaction_Check");
		try {
			GuidewireAutomate_Validation("Screen Header", Screen_Header, "equals", "Step 2 of 3: Enter payment information");
			GuidewireAutomate("Reserving Currency", PD_CurrencySelect, "selectByVisibleText", lhm_TestCase_Table_Data.get("ReservingCurrency"));
			By Automaticoption = By.xpath("//div[@class='gw-label' and text()='Automatic option']");

			VerifyElementNotExist("Automatic option hidden under Exchange Rate Model", Automaticoption);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;

		}
	}

	public static void VerifyOptionAutomaticisHiddenExchangeRateModel() throws Throwable {
		try {
			lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("NewTransaction_Check");

			GuidewireAutomate_Validation("Screen Header", Screen_Header, "equals", "Step 1 of 3: Enter payee information");
			getStaleElement("Name", CD_PrimaryPayee_Namee);
			GuidewireAutomate("Name", CD_PrimaryPayee_Namee, "selectByVisibleText", lhm_TestCase_Table_Data.get("CD_PrimaryPayee_Namee"));
			getStaleElement("PaymentMethod", PaymentMethod);
			GuidewireAutomate("PaymentMethod ACH", PaymentMethod, "clickAndwait", "click");
			GuidewireAutomate("NameontheAccount", NameontheAccount, "clearANDsendKeys", "Automation");
			GuidewireAutomate("BeneficiaryBankName", BenefeciaryBankName, "clearANDsendKeys", "Test");
			GuidewireAutomate("State", CD_PrimaryPayee_State, "selectByVisibleText", lhm_TestCase_Table_Data.get("CD_PrimaryPayee_State"));

			getStaleElement("City", CD_PrimaryPayee_City);
			GuidewireAutomate("City", CD_PrimaryPayee_City, "sendKeys", lhm_TestCase_Table_Data.get("CD_PrimaryPayee_City"));
			GuidewireAutomate("AccntNumber", AccntNumber, "clearANDsendKeys", "3456568");
			getStaleElement("RBAAccntNumber", RBAAccntNumber);
			GuidewireAutomate("RBAAccntNumber", RBAAccntNumber, "clearANDsendKeys", "3456568");
			GuidewireAutomate("AccntNumber", AccntNumber, "clearANDsendKeys", "3456568");

			CC_Reusables.clickButton("Next");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
}
