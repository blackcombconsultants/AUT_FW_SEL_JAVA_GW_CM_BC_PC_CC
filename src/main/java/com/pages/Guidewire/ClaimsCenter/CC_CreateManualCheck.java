package com.pages.Guidewire.ClaimsCenter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.aventstack.extentreports.ExtentTest;

public class CC_CreateManualCheck extends SeleniumWebDriver_Commands {

	public CC_CreateManualCheck(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	private static By clicknAction  = By.xpath("//*[@id='Claim-ClaimMenuActions']/div[1]/div[2]/div");
	private static By actinSubmenu1 = By.xpath("//*[@id='Claim-ClaimMenuActions']/div[3]");
	private static By actinSubmenu2 = By.xpath("//*[@id='Claim-ClaimMenuActions-ClaimMenuActions_NewTransaction-ClaimMenuActions_NewTransaction_CheckSet']/div/div[2]");
	private static By payeeName     = By.name("NormalCreateCheckWizard-CheckWizard_CheckPayeesScreen-NewCheckPayeeDV-PrimaryPayee_Name");
	private static By type          = By.name("NormalCreateCheckWizard-CheckWizard_CheckPayeesScreen-NewCheckPayeeDV-PrimaryPayee_Type");
	private static By next          = By.id("NormalCreateCheckWizard-Next");

	private static By Enterpayeeinformation_Header   = By.xpath("//div[contains(@id,'CheckPayeesScreen-ttlBar')]//div[@class='gw-TitleBar--title']");
	private static By Enterpaymentinformation_Header = By.xpath("//div[contains(@id,'CheckPaymentsScreen-ttlBar')]//div[@class='gw-TitleBar--title']");
	// Setcheckinstructions
	private static By Setcheckinstructions_Header = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and contains(text(),'Step 3 of 3: Set check instructions')]");

	private static By SCI_PayToTheOrderOf = By.xpath("//div[contains(@id,'CheckWizardCheckSummaryInputSet-Check_PayTo')]//div[@class='gw-value-readonly-wrapper']");
	private static By SCI_MailingAddress  = By.xpath("//div[contains(@id,'CheckWizardCheckSummaryInputSet-Check_MailTo_Input')]//div[@class='gw-value-readonly-wrapper']");
	/*
	 * CheckDetails
	 */

	private static By CD_PrimaryPayee_Namee        = By.xpath("//select[contains(@name,'PrimaryPayee_Name')]");
	private static By CD_CheckIssuance_CheckNumber = By.xpath("//input[contains(@name,'CheckNumber')]");

	/*
	 * Payment Details
	 */
	private static By PD_ReserveLine  = By.xpath("//select[contains(@name,'ReserveLineInputSet-ReserveLine')]");
	private static By PD_Coverage     = By.xpath("//div[contains(@id,'ReserveLineInputSet-Coverage')]//div[@class='gw-RangeValue']/div[@class='gw-label']");
	private static By PD_PaymentType  = By.xpath("//select[contains(@name,'Payment_PaymentType')]");
	private static By PD_CostType     = By.xpath("//select[contains(@name,'ReserveLineInputSet-CostType')]");
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

	private static By Next_Button = By.xpath("//div[contains(@id,'Next')]//div[@role='button']");

	private static By PrimaryPayee = By.xpath("//div[contains(@id,'NewCheckPayeeDV-1')]");

	private static By FinancialTranscations_Header = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and contains(text(),'Financials: Transactions')]");

	private static By FinancialsTransactions_CreateDate   = By.xpath("//div[contains(@id,'ClaimFinancialsTransactionsScreen-TransactionsLV-2-CreateDate')]");
	private static By FinancialsTransactions_Amount       = By.xpath("//div[contains(@id,'ClaimFinancialsTransactionsScreen-TransactionsLV-2-Amount')]");
	private static By FinancialsTransactions_Coverage     = By.xpath("//div[contains(@id,'ClaimFinancialsTransactionsScreen-TransactionsLV-2-CoverageType')]");
	private static By FinancialsTransactions_CostType     = By.xpath("//div[contains(@id,'ClaimFinancialsTransactionsScreen-TransactionsLV-2-CostType')]");
	private static By FinancialsTransactions_CostCategory = By.xpath("//div[contains(@id,'ClaimFinancialsTransactionsScreen-TransactionsLV-2-CostCategory')]");
	private static By FinancialsTransactions_Status       = By.xpath("//div[contains(@id,'ClaimFinancialsTransactionsScreen-TransactionsLV-2-Status')]");

	// Financial Checks
	private static By FinancialChecks_Header = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and contains(text(),'Financials: Checks')]");

	private static By FinancialChecks_PayTo_1  = By.xpath("//div[contains(@id,'ClaimFinancialsChecksScreen-ChecksLV-0-PayTo')]//div[@class='gw-value-readonly-wrapper']");
	private static By FinancialChecks_Status_1 = By.xpath("//div[contains(@id,'ClaimFinancialsChecksScreen-ChecksLV-0-Status')]//div[@class='gw-label']");

	private static By FinancialChecks_PayTo_2  = By.xpath("//div[contains(@id,'ClaimFinancialsChecksScreen-ChecksLV-1-PayTo')]//div[@class='gw-value-readonly-wrapper']");
	private static By FinancialChecks_Status_2 = By.xpath("//div[contains(@id,'ClaimFinancialsChecksScreen-ChecksLV-1-Status')]//div[@class='gw-label']");

	public static void Enterpayeeinformation() throws Throwable {
		String insuredName = driver.findElement(By.xpath("//div[contains(@id,'Insured')]//div[@class='gw-label gw-infoValue']")).getText();

		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("manualCheck");
		GuidewireAutomate_Validation("Screen Header", Enterpayeeinformation_Header, "equals", "Sftep 1 of 3: Enter payee information");
		GuidewireAutomate("Name", CD_PrimaryPayee_Namee, "selectByVisibleText", insuredName);
		Thread.sleep(2000);
	}

	public static void Enterpaymentinformation() throws Throwable {
		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("manualCheck");

		GuidewireAutomate_Validation("Screen Header", Enterpaymentinformation_Header, "equals", "Step 2 of 3: Enter payment information");
		GuidewireAutomate("Reserve Line", PD_ReserveLine, "selectByVisibleText", lhm_TestCase_Table_Data.get("ReserveLine"));

		GuidewireAutomate("CostType", PD_CostType, "selectByVisibleText", lhm_TestCase_Table_Data.get("CostType"));
		GuidewireAutomate_Validation("Screen Header", Enterpaymentinformation_Header, "equals", "Step 2 of 3: Enter payment information");
		GuidewireAutomate("CostCategory", PD_CostCategory, "selectByVisibleTextAndwait", lhm_TestCase_Table_Data.get("CostCategory"));

		GuidewireAutomate("Payment Type", PD_PaymentType, "selectByVisibleTextAndwait", lhm_TestCase_Table_Data.get("PaymentType"));

		// GuidewireAutomate("LineItems Add", PD_LineItems_Add, "clickAndwait", "NA");
		GuidewireAutomate("LineItem Category", PD_LineItem_Category, "selectByVisibleText", lhm_TestCase_Table_Data.get("LineItemCategory"));
		GuidewireAutomate("LineItem Amount", PD_LineItem_Amount, "clearANDsendKeys", lhm_TestCase_Table_Data.get("LineItemAmount"));

		/*
		 * GuidewireAutomate("PD_CheckBox", PD_CheckBox, "clickAndwait", "");
		 * 
		 * GuidewireAutomate("PD_Remove", PD_Remove, "click", "");
		 */
		Thread.sleep(2000);
	}
	public static void Setcheckinstructions() throws Throwable {

		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("manualCheck");

		GuidewireAutomate_Validation("Screen Header", Setcheckinstructions_Header, "equals", "Step 3 of 3: Set check instructions");
		GuidewireAutomate_Validation("Gross Amount", SI_GrossAmount, "fetch", lhm_TestCase_Table_Data.get("GrossAmount"));
		GuidewireAutomate_Validation("Net Amount", SI_NetAmount, "fetch", lhm_TestCase_Table_Data.get("NetAmount"));
		GuidewireAutomate("Finish_Button", Finish_Button, "click", "");
	}
}
