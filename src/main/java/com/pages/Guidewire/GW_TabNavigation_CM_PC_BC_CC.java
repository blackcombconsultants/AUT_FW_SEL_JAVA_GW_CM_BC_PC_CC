package com.pages.Guidewire;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class GW_TabNavigation_CM_PC_BC_CC extends SeleniumWebDriver_Commands
		implements GW_TabNavigation_CM_PC_BC_CC_PO {

	public GW_TabNavigation_CM_PC_BC_CC(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	public void navigate_AccountTab() throws Throwable {
		GuidewireAutomate("Tab_Account", Tab_Account, "click", "Null");
	}

	public void navigate_AccountTab_NewAccount() throws Throwable {
		GuidewireAutomate("Account", Tab_Account_dd, "click", "Null");
		GuidewireAutomate("NewAccount", AccountTab_NewAccount, "click", "Null");
		GuidewireAutomate_waitForElement(EnterAccountInformation, "visibilityOf", "true");
		Assert.assertEquals(getText_Element(EnterAccountInformation), "Enter Account Information");

	}

	public void navigate_AccountTab_AccountNumberSearch(String strValue) throws Throwable {
		GuidewireAutomate("Account", Tab_Account_dd, "click", "Null");
		GuidewireAutomate("AccountNumber", AccountTab_AccountNumber, "sendkeys", strValue);
		GuidewireAutomate("Search", AccountTab_AccountNumberSearch, "click", "Null");
	}

	public void navigate_ClaimTab() throws Throwable {
		GuidewireAutomate("ClaimTab", ClaimTab, "click", "Null");
		GuidewireAutomate("ClaimTab_NewClaim", ClaimTab_NewClaim, "click", "Null");

	}
	/*
	 * -------------------------------------------------------------- menuNavigation
	 * --------------------------------------------------------------
	 */

	@Override
	public void gwContactManagement_TabNavigation(String Tab) throws Throwable {
		switch (Tab) {

		case "x":
			break;

		case "y":
			break;

		case "z":
			break;

		default:
			break;
		}
	}

	@Override
	public void gwContactManagement_MenuNavigation(String Menu) throws Throwable {
		switch (Menu) {

		case "x":
			break;

		case "y":
			break;

		case "z":
			break;

		default:
			break;
		}
	}

	@Override
	public void gwPolicyCenter_TabNavigation(String Tab) throws Throwable {
		switch (Tab) {
		case "NewAccount":
			navigate_AccountTab_NewAccount();
			break;
		case "AccountNumberSearch":
			navigate_AccountTab_AccountNumberSearch(Tab);
			break;
		default:
			break;
		}
	}

	@Override
	public void gwPolicyCenter_MenuNavigation(String Menu) throws Throwable {
		switch (Menu) {
		case "NewAccount":
			GuidewireAutomate("Account", Tab_Account_dd, "click", "Null");
			GuidewireAutomate("NewAccount", AccountTab_NewAccount, "click", "Null");
			GuidewireAutomate_waitForElement(EnterAccountInformation, "visibilityOf", "true");
			Assert.assertEquals(getText_Element(EnterAccountInformation), "Enter Account Information");
			break;
		case "NewPolicy":
			// Navigation to NewPolicy
			GuidewireAutomate("Actions", Menu_Actions, "click", "");
			GuidewireAutomate("NewPolicy", Actions_NewPolicy, "click", "");
			break;
		case "NewSubmission":
			GuidewireAutomate_Validation("Account Summary", AccountSummary_Name, "contains", "Account Summary");
			GuidewireAutomate("Actions", Menu_Actions, "click", "");
			GuidewireAutomate("NewSubmission", Actions_NewSubmission, "click", "");
			GuidewireAutomate_waitForElement(NewSubmission_Header, "visibilityOf", "true");
			Assert.assertEquals(getText_Element(NewSubmission_Header), "New Submissions");

			break;
		default:
			break;
		}
	}

	@Override
	public void gwBillingCenter_TabNavigation(String Tab) throws Throwable {

		try {

			switch (Tab) {

			case "Account":
				navigate_AccountTab();
				break;

			default:
				break;
			}

			oExtentTest.addScreenCaptureFromPath(
					SeleniumWebDriver_Commands.getScreenShot_addScreenCaptureFromPath(driver));
			oExtentTest.log(Status.INFO, "Navigation to New Account is succesful");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void gwBillingCenter_MenuNavigation(String Menu) throws Throwable {
		switch (Menu) {
		case "NewAccount":
			// ------> Verifying the page -
			Assert.assertEquals(getText_Element(AccountSummary), "Accounts");
			GuidewireAutomate("Actions", Menu_Actions, "click", "");
			GuidewireAutomate("NewAccount", Actions_NewAccount, "click", "");
			break;
		case "NewPolicy":
			// Navigation to NewPolicy
			GuidewireAutomate("Actions", Menu_Actions, "click", "");
			GuidewireAutomate("NewPolicy", Actions_NewPolicy, "click", "");
			break;
		case "History":
			GuidewireAutomate("History", AS_HistoryLink, "click", "Null");
			break;
		case "Invoice":
			GuidewireAutomate("Invoices", AS_InvoicesLink, "click", "Null");
			Assert.assertEquals(getText_Element(InvoiceHeader), "Invoices");

			break;
		case "x":
		case "y":
		case "z":

		default:
			break;
		}

	}

	@Override
	public void gwClaimsCenter_MenuNavigation(String strMenuOption) throws Throwable {
		switch (strMenuOption) {

		case "x":
			break;

		case "y":
			break;

		case "z":
			break;

		default:
			break;
		}
	}

	@Override
	public void gwClaimsCenter_TabNavigation(String Tab) throws Throwable {
		// TODO Auto-generated method stub

	}

}
