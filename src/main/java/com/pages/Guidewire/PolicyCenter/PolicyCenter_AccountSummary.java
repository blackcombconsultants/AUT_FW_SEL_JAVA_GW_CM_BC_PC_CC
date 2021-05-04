package com.pages.Guidewire.PolicyCenter;

import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.aventstack.extentreports.ExtentTest;

public class PolicyCenter_AccountSummary extends SeleniumWebDriver_Commands implements PolicyCenter_AccountSummary_PO {

	public PolicyCenter_AccountSummary(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	public static void detail_Verify() throws Throwable {
		
		GuidewireAutomate_Validation("Screen Header", PolicyCenter_Resuables_PO.Screen_Header, "contains",
				"My Summary");

		GuidewireAutomate_Validation("Details", AS_Details, "equals", "Details");

		GuidewireAutomate_Validation("AccountNo", AS_D_AccountNo, "equals", strAccountNumber);
		//GuidewireAutomate_Validation("AccountHolder", AS_D_AccountHolder, "equals", strAccountName);
		//GuidewireAutomate_Validation("HomeAddress", AS_D_HomeAddress, "equals", strAccountName);
		//GuidewireAutomate_Validation("Description", AS_D_Description, "contains", "temp");
		GuidewireAutomate_Validation("Status", AS_D_Status, "equals", "Active");

	}

	public static void details_Edit() throws Throwable {
		// TODO Auto-generated method stub

	}

	public static void CurrentActivities_Verify() throws Throwable {
		// TODO Auto-generated method stub

	}

	public static void PolicyTerms_Verify() throws Throwable {
		// TODO Auto-generated method stub

	}

	public static void OpenPolicyTransactions_Verify() throws Throwable {
		// TODO Auto-generated method stub

	}

	public static void Claims_Verify() throws Throwable {
		// TODO Auto-generated method stub

	}

	public static void Overview_Verify() throws Throwable {
		// TODO Auto-generated method stub

	}

	public static void Billing_Verify() throws Throwable {
		// TODO Auto-generated method stub

	}

	public static void Contacts_Verify() throws Throwable {
		// TODO Auto-generated method stub

	}

	public static void Producers_Verify() throws Throwable {
		// TODO Auto-generated method stub

	}

	public static void Locations_Verify() throws Throwable {
		// TODO Auto-generated method stub

	}

	public static void RelatedAccounts_Verify() throws Throwable {
		// TODO Auto-generated method stub

	}

	public static void Notes_Verify() throws Throwable {
		// TODO Auto-generated method stub

	}

	public static void accountHolderSummary() throws Throwable {
		// TODO Auto-generated method stub

	}

	public static void accountHolderSummary_Details_Edit() throws Throwable {
		// TODO Auto-generated method stub

	}

	public static void accountHolderSummary_Details_Verify() throws Throwable {
		// TODO Auto-generated method stub

	}

	public static void accountHolderSummary_Policies_Verify() throws Throwable {
		// TODO Auto-generated method stub

	}

	public static void accountHolderSummary_OpenPolicyTransactions_Verify() throws Throwable {
		// TODO Auto-generated method stub

	}

	public static void accountHolderSummary_Claims_Verify() throws Throwable {
		// TODO Auto-generated method stub

	}

	public static void accountHolderSummary_Overview_Verify() throws Throwable {
		// TODO Auto-generated method stub

	}

	public static void accountHolderSummary_Billing_Verify() throws Throwable {
		// TODO Auto-generated method stub

	}

	public static void accountHolderSummary_Notes_Verify() throws Throwable {
		// TODO Auto-generated method stub

	}

}
