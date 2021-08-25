package com.pages.Guidewire.ClaimsCenter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.pages.Guidewire.Tab_Menu_Navigation;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.io.IOException;
import java.util.List;

public class CC_NewTransaction_Check extends SeleniumWebDriver_Commands implements ClaimCenter_CreateManualCheck_PO {

	// private static final By FT_CostCategory = null;
	public CC_NewTransaction_Check(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
		// TODO Auto-generated constructor stub
	}

	public static void Enterpayeeinformation() throws Throwable {
		String insuredName = driver
				.findElement(By.xpath("//div[contains(@id,'Insured')]//div[@class='gw-label gw-infoValue']")).getText();

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("NewTransaction_Check",
				strTestCaseName);
		GuidewireAutomate_Validation("Screen Header", Enterpayeeinformation_Header, "equals",
				"Step 1 of 3: Enter payee information");
		GuidewireAutomate_Validation("Primary Payee", PrimaryPayee, "equals", "Primary Payee");

		GuidewireAutomate("Name", CD_PrimaryPayee_Namee, "selectByVisibleText", insuredName);
		GuidewireAutomate("Next Button", Next_Button, "click", "click");

		Thread.sleep(2000);
	}

	public static void Enterpaymentinformation() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("NewTransaction_Check",
				strTestCaseName);

		GuidewireAutomate_Validation("Screen Header", Enterpaymentinformation_Header, "equals",
				"Step 2 of 3: Enter payment information");
		GuidewireAutomate("Reserve Line", PD_ReserveLine, "selectByVisibleText",
				lhm_TestCase_Table_Data.get("ReserveLine"));
		GuidewireAutomate_Validation("Coverage", PD_Coverage, "equals", lhm_TestCase_Table_Data.get("Coverage"));

		// Category field below Line Items should be defaulted to <none>.
		GuidewireAutomate_Validation("LineItem Category", PD_LineItem_Category, "FirstSelectedOptionEquals", "<none>");

		// Verify whether the below list is displayed in the Category field.
		GuidewireAutomate_Validation("LineItem Category", PD_LineItem_Category, "getOptionsEquals",
				"<none>,Mileage reimbursement,Other");

		Thread.sleep(2000);
		GuidewireAutomate("Payment Type", PD_PaymentType, "selectByVisibleText",
				lhm_TestCase_Table_Data.get("PaymentType"));

	}

	public static void CreatingCheck_LineItem() throws Throwable {
		
		CC_NewTransaction_Check.Enterpayeeinformation();
		CC_NewTransaction_Check.Enterpaymentinformation();
		CC_NewTransaction_Check.AddItems_Mileagereimbursement();
		ClaimCenter_Resuables.clickButton("Next");
		ClaimCenter_Resuables.clickButton("Next");

		CC_NewTransaction_Check.Setcheckinstructions();
		ClaimCenter_Resuables.clickButton("Finish");
		CC_NewTransaction_Check.FinancialsChecks_Verification_1();

		// Click on Action-Check-Adding Other LineItem

		Tab_Menu_Navigation.ccMenuNavigation("Check");
		CC_NewTransaction_Check.Enterpayeeinformation();
		CC_NewTransaction_Check.Enterpaymentinformation();
		CC_NewTransaction_Check.AddItem_Others();
		ClaimCenter_Resuables.clickButton("Next");
		ClaimCenter_Resuables.clickButton("Next");

		CC_NewTransaction_Check.Setcheckinstructions();
		ClaimCenter_Resuables.clickButton("Finish");
		CC_NewTransaction_Check.FinancialsChecks_Verification_2();
	}

	public static void AddItems_Mileagereimbursement() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_ClaimsCenter("NewTransaction_Check");

		GuidewireAutomate("LineItem Category", PD_LineItem_Category, "selectByVisibleText",
				lhm_TestCase_Table_Data.get("LineItemCategory_1"));
		GuidewireAutomate("LineItem Category", PD_LineItem_Amount, "clearANDsendKeys",
				lhm_TestCase_Table_Data.get("LineItem_Amount_1"));
	}

	public static void AddItem_Others() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_ClaimsCenter("NewTransaction_Check");

		GuidewireAutomate("LineItem Category", PD_LineItem_Category, "selectByVisibleText",
				lhm_TestCase_Table_Data.get("LineItemCategory_2"));
		GuidewireAutomate("LineItem Category", PD_LineItem_Amount, "clearANDsendKeys",
				lhm_TestCase_Table_Data.get("LineItem_Amount_2"));
	}

	public static void Setcheckinstructions() throws Throwable {

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("NewTransaction_Check",
				strTestCaseName);

		GuidewireAutomate_Validation("Screen Header", Setcheckinstructions_Header, "equals",
				"Step 3 of 3: Set check instructions");

		GuidewireAutomate_Validation("PayToTheOrderOf", SCI_PayToTheOrderOf, "equals",
				lhm_TestCase_Table_Data.get("PayToTheOrderOf"));
		GuidewireAutomate_Validation("Mailing Address", SCI_MailingAddress, "equals",
				lhm_TestCase_Table_Data.get("MailingAddress"));

	}

	public static void FinancialsTransactions_VerificationForDefaultReserve() throws Throwable {
		try {
			GuidewireAutomate_Validation("FinancialsTransactions Header", FinancialTranscations_Header, "equals",
					"Financials: Transactions");
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_ClaimsCenter("Payment");
			int rowNum = Integer.parseInt(lhm_TestCase_Table_Data.get("DefaultRow"));

			for (int i = 0; i < rowNum; i++) {
				By FinancialsTransactions_CreateDate = By.xpath(
						"//div[contains(@id,'ClaimFinancialsTransactionsScreen-TransactionsLV-" + i + "-CreateDate')]");
				By FinancialsTransactions_Amount = By.xpath(
						"//div[contains(@id,'ClaimFinancialsTransactionsScreen-TransactionsLV-" + i + "-Amount')]");
				By FinancialsTransactions_Coverage = By
						.xpath("//div[contains(@id,'ClaimFinancialsTransactionsScreen-TransactionsLV-" + i
								+ "-CoverageType')]");
				By FinancialsTransactions_CostType = By.xpath(
						"//div[contains(@id,'ClaimFinancialsTransactionsScreen-TransactionsLV-" + i + "-CostType')]");
				By FinancialsTransactions_CostCategory = By
						.xpath("//div[contains(@id,'ClaimFinancialsTransactionsScreen-TransactionsLV-" + i
								+ "-CostCategory')]");
				By FinancialsTransactions_Status = By.xpath(
						"//div[contains(@id,'ClaimFinancialsTransactionsScreen-TransactionsLV-" + i + "-Status')]");

				oExtentTest.log(Status.INFO, "Verifying Row= [" + (i + 1) + "] the FinancialsTransactions Screen ");

				GuidewireAutomate_Validation("CreateDate", FinancialsTransactions_CreateDate, "equals",
						lhm_TestCase_Table_Data.get("FT_CreateDate"));
				GuidewireAutomate_Validation("Amount", FinancialsTransactions_Amount, "equals",
						lhm_TestCase_Table_Data.get("DR_CurrentlyAvailable" + (i + 1)));
				GuidewireAutomate_Validation("Coverage", FinancialsTransactions_Coverage, "equals",
						lhm_TestCase_Table_Data.get("DR_Coverage" + (i + 1)));
				GuidewireAutomate_Validation("CostType", FinancialsTransactions_CostType, "equals",
						lhm_TestCase_Table_Data.get("DR_CostType" + (i + 1)));
				GuidewireAutomate_Validation("CostCategory", FinancialsTransactions_CostCategory, "equals",
						lhm_TestCase_Table_Data.get("DR_CostCategory" + (i + 1)));
				GuidewireAutomate_Validation("Status", FinancialsTransactions_Status, "equals",
						lhm_TestCase_Table_Data.get("FT_Status"));

			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void FinancialsTransactions_Verification() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_ClaimsCenter("Payment");
		int i = Integer.parseInt(lhm_TestCase_Table_Data.get("DefaultRow"));
		By FinancialsTransactions_CreateDate = By
				.xpath("//div[contains(@id,'ClaimFinancialsTransactionsScreen-TransactionsLV-" + i + "-CreateDate')]");
		By FinancialsTransactions_Amount = By
				.xpath("//div[contains(@id,'ClaimFinancialsTransactionsScreen-TransactionsLV-" + i + "-Amount')]");
		By FinancialsTransactions_Coverage = By.xpath(
				"//div[contains(@id,'ClaimFinancialsTransactionsScreen-TransactionsLV-" + i + "-CoverageType')]");
		By FinancialsTransactions_CostType = By
				.xpath("//div[contains(@id,'ClaimFinancialsTransactionsScreen-TransactionsLV-" + i + "-CostType')]");
		By FinancialsTransactions_CostCategory = By.xpath(
				"//div[contains(@id,'ClaimFinancialsTransactionsScreen-TransactionsLV-" + i + "-CostCategory')]");
		By FinancialsTransactions_Status = By
				.xpath("//div[contains(@id,'ClaimFinancialsTransactionsScreen-TransactionsLV-" + i + "-Status')]");
		oExtentTest.log(Status.INFO, "Verifying Row= [" + (i + 1) + "] the FinancialsTransactions Screen ");

		GuidewireAutomate_Validation("CreateDate", FinancialsTransactions_CreateDate, "equals",
				lhm_TestCase_Table_Data.get("FT_CreateDate"));
		GuidewireAutomate_Validation("Amount", FinancialsTransactions_Amount, "equals",
				lhm_TestCase_Table_Data.get("FT_Amount"));
		GuidewireAutomate_Validation("Coverage", FinancialsTransactions_Coverage, "equals",
				lhm_TestCase_Table_Data.get("Coverage"));
		GuidewireAutomate_Validation("CostType", FinancialsTransactions_CostType, "equals",
				lhm_TestCase_Table_Data.get("CostType"));
		GuidewireAutomate_Validation("CostCategory", FinancialsTransactions_CostCategory, "equals",
				lhm_TestCase_Table_Data.get("CostCategory"));
		GuidewireAutomate_Validation("Status", FinancialsTransactions_Status, "equals",
				lhm_TestCase_Table_Data.get("FT_Status"));
	}

	public static void FinancialsChecks_Verification_1() throws Throwable {
		GuidewireAutomate_Validation("FinancialChecks Header", FinancialChecks_Header, "equals", "Financials: Checks");

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_ClaimsCenter("NewTransaction_Check");

		GuidewireAutomate_Validation("FinancialChecks PayTo", FinancialChecks_PayTo_1, "equals",
				lhm_TestCase_Table_Data.get("PayToTheOrderOf"));
		GuidewireAutomate_Validation("FinancialChecks Status", FinancialChecks_Status_1, "equals",
				lhm_TestCase_Table_Data.get("Status"));
	}

	public static void FinancialsChecks_Verification_2() throws Throwable {
		GuidewireAutomate_Validation("FinancialChecks Header", FinancialChecks_Header, "equals", "Financials: Checks");

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_ClaimsCenter("NewTransaction_Check");

		GuidewireAutomate_Validation("FinancialChecks PayTo", FinancialChecks_PayTo_2, "equals",
				lhm_TestCase_Table_Data.get("PayToTheOrderOf"));
		GuidewireAutomate_Validation("FinancialChecks Status", FinancialChecks_Status_2, "equals",
				lhm_TestCase_Table_Data.get("Status"));
	}

}
