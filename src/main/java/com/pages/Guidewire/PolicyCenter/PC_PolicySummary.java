package com.pages.Guidewire.PolicyCenter;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;
import com.pages.Guidewire.Tab_Menu_Navigation;

public class PC_PolicySummary extends SeleniumWebDriver_Commands {


	private static By PS_Details = By.xpath("//div[@class='gw-TitleSection']/div[@role='heading']/span[text()='Details']");

	private static By PS_D_PolicyNumber        = By.xpath("//div[contains(@id,'PolicyDetailsDetailViewTile_DV-PolicyNumber')]//div[@class='gw-value-readonly-wrapper']");
	private static By PS_D_Product             = By.xpath("//div[contains(@id,'PolicyDetailsDetailViewTile_DV-Product')]//div[@class='gw-value-readonly-wrapper']");
	private static By PS_D_Offering            = By.xpath("//div[contains(@id,'PolicyDetailsDetailViewTile_DV-Offering')]//div[@class='gw-value-readonly-wrapper']");
	private static By PS_D_PrimaryNamedInsured = By.xpath("//div[contains(@id,'PolicyDetailsDetailViewTile_DV-PrimaryNamedInsured_button')]");
	private static By PS_D_Underwriter         = By.xpath("//div[contains(@id,'PolicyDetailsDetailViewTile_DV-Underwriter')]//div[@class='gw-value-readonly-wrapper']");
	private static By PS_D_EffectiveDate       = By.xpath("//div[contains(@id,'PolicyDetailsDetailViewTile_DV-EffectiveDate')]//div[@class='gw-value-readonly-wrapper']");
	private static By PS_D_ExpirationDate      = By.xpath("//div[contains(@id,'PolicyDetailsDetailViewTile_DV-ExpirationDate')]//div[@class='gw-value-readonly-wrapper']");


	private static By PS_Account                     = By.xpath("//div[@class='gw-TitleSection']/div[@role='heading']/span[text()='Account']");
	private static By PS_TermFinancials              = By.xpath("//div[@class='gw-TitleSection']/div[@role='heading']/span[text()='Term Financials']");
	private static By PS_CurrentActivities           = By.xpath("//div[@class='gw-TitleSection']/div[@role='heading']/span[text()='Current Activities']");
	private static By PS_OpenPolicyTransactions      = By.xpath("//div[@class='gw-TitleSection']/div[@role='heading']/span[text()='Open Policy Transactions']");
	private static By PS_PolicyLink                  = By.xpath("//div[contains(@id,'PendingPolicyTransactionsListViewTile_LV-0-JobNumber_button')]");
	private static By PS_TransactionType             = By.xpath("//div[@class='gw-value-readonly-wrapper'][text()='Renewal']");
	private static By Ps_TransactionStatus           = By.xpath("//div[@class='gw-value-readonly-wrapper'][text()='Non-renewing']");
	private static By PS_Renewal_TransactionsType    = By.xpath("//td[contains(@id,'PendingPolicyTransactionsListViewTile_LV-0-JobInProgressType_Cell')]");
	private static By Ps_Renewal_TransactionStatus   = By.xpath("//td[contains(@id,'PendingPolicyTransactionsListViewTile_LV-0-Status_Cell')]");
	private static By PS_Claims                      = By.xpath("//div[@class='gw-TitleSection']/div[@role='heading']/span[text()='Claims']");
	private static By PS_CompletedPolicyTransactions = By.xpath("//div[@class='gw-TitleSection']/div[@role='heading']/span[text()='Completed Policy Transactions']");
	private static By PS_TransactionsType            = By.xpath("//div[contains(@id,'CompletedPolicyTransactionsListViewTile_LV-0-Type')]");
	private static By PS_PremiumCost                 = By.xpath("//div[contains(@id,'CompletedPolicyTransactionsListViewTile_LV-0-Premium')]");
	private static By PS_EffectiveDate               = By.xpath("//td[contains(@id,'CompletedPolicyTransactionsListViewTile_LV-0-EffectiveDate_Cell')]");
	private static By PS_CloseDate                   = By.xpath("//td[contains(@id,'CompletedPolicyTransactionsListViewTile_LV-0-CloseDate_Cell')]");
	private static By PS_Notes                       = By.xpath("//div[@class='gw-TitleSection']/div[@role='heading']/span[text()='Notes']");
	private static By PS_Billing                     = By.xpath("//div[@class='gw-TitleSection']/div[@role='heading']/span[text()='Billing']");
	private static By PS_PaymentSchedule             = By.xpath("//div[@class='gw-TitleSection']/div[@role='heading']/span[text()='Payment Schedule']");
	private static By PS_Contacts                    = By.xpath("//div[@class='gw-TitleSection']/div[@role='heading']/span[text()='Contacts']");
	private static By PS_Producer                    = By.xpath("//div[@class='gw-TitleSection']/div[@role='heading']/span[text()='Producer']");

	// toolsBilling
	private static By Tools_Billing       = By.xpath("//div[contains(@id,'PolicyFile_Billing')]/div[@role='menuitem']");
	private static By Billing_Name        = By.xpath("//div[contains(@id,'BillingScreen-ttlBar')]");
	private static By ViewBillingStatus   = By.xpath("//div[contains(@id,'ViewAccount')]");
	private static By BillingStatus       = By.xpath("//div[contains(@id,'BillingPoliciesLV-1-Status')]//div[contains(text(),'In Good Standing')]");
	private static By PolicyNumber        = By.xpath("//div[contains(@id,'BillingPoliciesLV-3-PolicyNumber_button')]");
	private static By PS_OPT_DataDisplay  = By.xpath("//div[contains(@id,'PendingPolicyTransactionsListViewTile_LV-0-JobInProgressType')]");
	private static By PS_OPT_PolicyNumber = By.xpath("//div[contains(@id,'PendingPolicyTransactionsListViewTile_LV-0-JobNumber_button')]");
	private static By CPT_Header          = By.xpath("//div[contains(@id,'CompletedPolicyTransactionsListViewTile')]//span[@class='gw-TitleText']");
	private static By CPT_Premium         = By.xpath("//div[contains(@id,'CompletedPolicyTransactionsListViewTile_LV-0-Premium')]//div[@class='gw-value-readonly-wrapper']");
	private static By OPT_Type            = By.xpath("//div[contains(@id,'PendingPolicyTransactionsListViewTile_LV-0-JobInProgressType')]//div[@class='gw-value-readonly-wrapper']");
	private static By OPT_Status          = By.xpath("//div[contains(@id,'PendingPolicyTransactionsListViewTile_LV-0-Status')]//div[@class='gw-value-readonly-wrapper']");

	private static By NodataDisplay = By.xpath("//div[contains(@id,'PendingPolicyTransactionsListViewTile_LV')]//div[@class='gw-ListView--empty-info-cell']");

	/*
	 * 
	 */
	public PC_PolicySummary(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	/*
	 * 
	 */
	public static void detail_Verify() throws Throwable {

		GuidewireAutomate_Validation("Screen Header", PolicyCenter_Resuables_PO.PolicySummary_Header, "contains", "Policy Summary");

		GuidewireAutomate_Validation("Details", PS_Details, "equals", "Details");

		GuidewireAutomate_Validation("Policy Number", PS_D_PolicyNumber, "equals", strPolicyNumber);
		// GuidewireAutomate_Validation("Product", PS_D_Product, "equals",
		// strLOB);
		// GuidewireAutomate_Validation("Offering", PS_D_Offering, "contains",
		// "Program");
		// GuidewireAutomate_Validation("Primary Named Insured",
		// PS_D_PrimaryNamedInsured, "equals", strAccountName);
		// GuidewireAutomate_Validation("Underwriter", PS_D_Underwriter,
		// "equals", strUnderwriter);
		// GuidewireAutomate_Validation("Effective Date", PS_D_EffectiveDate,
		// "equals", strEffectiveDate);
		// GuidewireAutomate_Validation("Expiration Date", PS_D_ExpirationDate,
		// "equals", strUnderwriter);

	}

	public static void account_Verify() throws Throwable {
		GuidewireAutomate_Validation("Account", PS_Account, "equals", "Account");

	}

	public static void termFinancials() throws Throwable {
		GuidewireAutomate_Validation("Term Financials", PS_TermFinancials, "equals", "Term Financials");

	}

	public static void currentActivities() throws Throwable {
		GuidewireAutomate_Validation("Current Activities", PS_CurrentActivities, "equals", "Current Activities");

	}
	/*
	 * Name:shanta Date:29/03/2022
	 */
	public static void openPolicyTransactions() throws Throwable {
		getStaleElement("Open Policy Transactions", PS_OpenPolicyTransactions);
		GuidewireAutomate_Validation("Open Policy Transactions", PS_OpenPolicyTransactions, "equals", "Open Policy Transactions");
		GuidewireAutomate_Validation("type", PS_TransactionsType, "equals", "Submission");
		GuidewireAutomate_Validation("Status", Ps_TransactionStatus, "equals", "Non-renewing");

	}
	/*
	 * Name:shanta Date:31/03/2022
	 */
	public static void openPolicyTransactions_RenewalWorkflow() throws Throwable {
		GuidewireAutomate_Validation("Open Policy Transactions", PS_OpenPolicyTransactions, "equals", "Open Policy Transactions");
		GuidewireAutomate_Validation("type", PS_Renewal_TransactionsType, "equals", "Renewal");
		GuidewireAutomate_Validation("Status", Ps_Renewal_TransactionStatus, "equals", "Renewing");

	}
	/*
	 * Name:shanta Date:31/03/2022
	 */
	public static void openPolicyTransaction_ClickPolicyLink() throws Throwable {
		GuidewireAutomate_Validation("Open Policy Transactions", PS_OpenPolicyTransactions, "equals", "Open Policy Transactions");
		GuidewireAutomate("ClickPolicyLink", PS_PolicyLink, "clickAndwait", "click");
	}

	public static void claims() throws Throwable {
		GuidewireAutomate_Validation("Claims", PS_Claims, "equals", "Claims");

	}

	public static void completedPolicyTransactions() throws Throwable {
		getStaleElement("Completed Policy Transactions", PS_CompletedPolicyTransactions);
		GuidewireAutomate_Validation("Completed Policy Transactions", PS_CompletedPolicyTransactions, "equals", "Completed Policy Transactions");
		GuidewireAutomate_Validation("TransactionsType", PS_TransactionsType, "equals", "Cancellation");
	}

	/*
	 * Name:shanta date:04/04/2022
	 */
	public static void completedPolicyTransactions_reinstatePremium() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcelWorkSheet_Fillo("PolicySummary", strTestCaseName);
		getStaleElement("Completed Policy Transactions", PS_CompletedPolicyTransactions);
		GuidewireAutomate_Validation("Completed Policy Transactions", PS_CompletedPolicyTransactions, "equals", "Completed Policy Transactions");
		GuidewireAutomate_Validation("TransactionsType", PS_TransactionsType, "equals", lhm_TestCase_Table_Data.get("PS_TransactionsType"));
		GuidewireAutomate_Validation("Premiumcost", PS_PremiumCost, "equals", lhm_TestCase_Table_Data.get("PS_PremiumCost"));
	}

	public static void notes() throws Throwable {
		GuidewireAutomate_Validation("Notes", PS_Notes, "equals", "Notes");

	}

	public static void billing() throws Throwable {
		GuidewireAutomate_Validation("Billing", PS_Billing, "equals", "Billing");

	}

	public static void paymentSchedule() throws Throwable {
		GuidewireAutomate_Validation("Payment Schedule", PS_PaymentSchedule, "equals", "Payment Schedule");

	}

	public static void contacts() throws Throwable {
		GuidewireAutomate_Validation("Contacts", PS_Contacts, "equals", "Contacts");

	}

	public static void producer() throws Throwable {
		GuidewireAutomate_Validation("Producer", PS_Producer, "equals", "Producer");

	}

	public static void tools_Billing() throws Throwable {
		getStaleElement("Billing", Tools_Billing);
		GuidewireAutomate("Billing", Tools_Billing, "clickAndwait", "click");
		GuidewireAutomate_Validation("Screen Header", Billing_Name, "equals", "Billing");
		GuidewireAutomate("View Account Billing Status", ViewBillingStatus, "clickAndwait", "click");
		GuidewireAutomate_Validation("In Good Standing", BillingStatus, "equals", "In Good Standing");
		// GuidewireAutomate("PolicyNumber",PolicyNumber,"clickAndwait","click");

	}

	public static void tools_Contacts() throws Throwable {

	}

	public static void tools_Participants() throws Throwable {

	}

	public static void tools_Notes() throws Throwable {

	}

	public static void tools_Documents() throws Throwable {

	}

	public static void tools_PolicyTransactions() throws Throwable {

	}

	public static void tools_RiskAnalysis() throws Throwable {

	}

	public static void tools_ReInsurance() throws Throwable {

	}

	public static void tools_History() throws Throwable {

	}

	public static void tools_FinancialTransactions() throws Throwable {

	}

	public static void new_Transaction(String type) throws Throwable {

		switch (type) {
			case "Issue Policy" :
				break;

			case "Cancel Policy" :
				break;

			default :
				break;
		}
	}

	/*
	 * Owner: Rahul Dixit Date: 23-March-2022
	 */
	public static void OpenPolicyTransaction_ClickPolicyLink() throws Throwable {

		try {
			String Result = getText_Element(PS_OPT_DataDisplay);
			if (Result.contains("Renewal")) {

				GuidewireAutomate_Validation("Open Policy Transactions", PS_OpenPolicyTransactions, "equals", "Open Policy Transactions");
				GuidewireAutomate_Validation("Data Row", PS_OPT_DataDisplay, "contains", "Renewal");
				GuidewireAutomate("Policy Number", PS_OPT_PolicyNumber, "clickAndwait", "click");
				PolicyCenter_Resuables.clickButton("Edit Policy Transaction");
				Thread.sleep(2000);
				PolicyCenter_Resuables.clickButton("Non Renew");
			}

		} catch (NoSuchElementException e) {
			String Result2 = getText_Element(NodataDisplay);

			if (Result2.contains("No data")) {

				Tab_Menu_Navigation.pcMenuNavigation("Renew Policy");
				Thread.sleep(2000);
				PolicyCenter_Resuables.clickButton("Next");
				PolicyCenter_Resuables.clickButton("Edit Policy Transaction");
				Thread.sleep(2000);
				PolicyCenter_Resuables.clickButton("Non Renew");
				e.printStackTrace();
			}
		}
	}

	/*
	 * Owner: Rahul Dixit Date: 28-March-2022
	 */

	public static void VerifyOpenPolicyTransactionDetails() throws Throwable {
		try {
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcelWorkSheet_Fillo("PolicySummary", strTestCaseName);

			GuidewireAutomate_Validation("Complete Policy Transaction Header", CPT_Header, "equals", "Completed Policy Transactions");
			getStaleElement("Type", OPT_Type);
			GuidewireAutomate_Validation("Type", OPT_Type, "equals", lhm_TestCase_Table_Data.get("Type"));
			GuidewireAutomate_Validation("Status", OPT_Status, "equals", lhm_TestCase_Table_Data.get("Status"));

		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Owner: Rahul Dixit Date: 24-March-2022
	 */

	public static void VerifyPremiumInCompletePolicytransaction() throws Throwable {
		try {

			GuidewireAutomate_Validation("Complete Policy Transaction Header", CPT_Header, "equals", "Completed Policy Transactions");
			getStaleElement("CPT_Premium", CPT_Premium);
			GuidewireAutomate_Validation("CPT_Premium", CPT_Premium, "equals", "($459.00)");

		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}

}
