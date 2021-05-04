package com.pages.Guidewire.PolicyCenter;

import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.aventstack.extentreports.ExtentTest;

public class PolicyCenter_PolicySummary extends SeleniumWebDriver_Commands implements PolicyCenter_PolicySummary_PO {

	public PolicyCenter_PolicySummary(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	public static void detail_Verify() throws Throwable {
		GuidewireAutomate_Validation("Screen Header", PolicyCenter_Resuables_PO.Screen_Header, "contains", "Policy Summary");

		GuidewireAutomate_Validation("Details", PS_Details, "equals", "Details");

		//GuidewireAutomate_Validation("Policy Number", PS_D_PolicyNumber, "equals", strPolicyNumber);
		GuidewireAutomate_Validation("Product", PS_D_Product, "equals", strLOB);
		//GuidewireAutomate_Validation("Offering", PS_D_Offering, "equals", strPolicyNumber);
		GuidewireAutomate_Validation("Primary Named Insured", PS_D_PrimaryNamedInsured, "equals", strAccountName);
		GuidewireAutomate_Validation("Underwriter", PS_D_Underwriter, "equals", strUnderwriter);
		//GuidewireAutomate_Validation("Effective Date", PS_D_EffectiveDate, "equals", strEffectiveDate);
		//GuidewireAutomate_Validation("Expiration Date", PS_D_ExpirationDate, "equals", strUnderwriter);

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

	public static void openPolicyTransactions() throws Throwable {
		GuidewireAutomate_Validation("Open Policy Transactions", PS_OpenPolicyTransactions, "equals", "Open Policy Transactions");

	}

	public static void claims() throws Throwable {
		GuidewireAutomate_Validation("Claims", PS_Claims, "equals", "Claims");

	}

	public static void completedPolicyTransactions() throws Throwable {
		GuidewireAutomate_Validation("Completed Policy Transactions", PS_CompletedPolicyTransactions, "equals", "Completed Policy Transactions");

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
		case "Issue Policy":
			break;

		case "Cancel Policy":
			break;

		default:
			break;
		}
	}

}
