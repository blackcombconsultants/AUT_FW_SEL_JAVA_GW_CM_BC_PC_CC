package com.pages.Guidewire.ClaimsCenter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class CC_Financials extends SeleniumWebDriver_Commands {

	private static By FinancialTranscations_Header    = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and contains(text(),'Financials: Transactions')]");
	private static By FinancialTranscations_RowCount  = By.xpath("//table[@class='gw-ListViewWidget--table gw-table']/tbody/tr");
	private static By FinancialTranscations_NextPage  = By.xpath("//div[contains(@id,'TransactionsLV-_ListPaging-next')]");
	private static By FinancialTranscations_Reserver1 = By.xpath("//div[contains(@id,'TransactionsLV-0-TType')]//div[@class='gw-link gw-label']");
	private static By FT_CreateDate                   = By.xpath("//div[contains(@id,'ClaimFinancialsTransactionsScreen-TransactionsLV-2-CreateDate')]");
	private static By FT_Amount                       = By.xpath("//div[contains(@id,'ClaimFinancialsTransactionsScreen-TransactionsLV-2-Amount')]");
	private static By FT_Coverage                     = By.xpath("//div[contains(@id,'ClaimFinancialsTransactionsScreen-TransactionsLV-2-CoverageType')]");
	private static By FT_CostType                     = By.xpath("//div[contains(@id,'ClaimFinancialsTransactionsScreen-TransactionsLV-2-CostType')]");
	private static By FT_CostCategory                 = By.xpath("//div[contains(@id,'ClaimFinancialsTransactionsScreen-TransactionsLV-2-CostCategory')]");
	private static By FT_Status                       = By.xpath("//div[contains(@id,'ClaimFinancialsTransactionsScreen-TransactionsLV-2-Status')]");

	// Financial Checks
	private static By FinancialChecks_Header = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and contains(text(),'Financials: Checks')]");

	private static By FinancialChecks_PayTo_1  = By.xpath("//div[contains(@id,'ClaimFinancialsChecksScreen-ChecksLV-0-PayTo')]//div[@class='gw-value-readonly-wrapper']");
	private static By FinancialChecks_Status_1 = By.xpath("//div[contains(@id,'ClaimFinancialsChecksScreen-ChecksLV-0-Status')]//div[@class='gw-label']");
	private static By FinancialChecks_PayTo_2  = By.xpath("//div[contains(@id,'ClaimFinancialsChecksScreen-ChecksLV-1-PayTo')]//div[@class='gw-value-readonly-wrapper']");
	private static By FinancialChecks_Status_2 = By.xpath("//div[contains(@id,'ClaimFinancialsChecksScreen-ChecksLV-1-Status')]//div[@class='gw-label']");

	public CC_Financials(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	public static void FT_DefaultReserve_Verify() throws Throwable {

		// Financial Transcations

		try {
			lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("Reserve");

			GuidewireAutomate_Validation("FinancialsTransactions Header", FinancialTranscations_Header, "equals", "Financials: Transactions");
			int intRowNum_DefaultReserve = Integer.parseInt(lhm_TestCase_Table_Data.get("rowNum"));

			for (int i = 0; i < intRowNum_DefaultReserve; i++) {
				By FT_CreateDate   = By.xpath("//div[contains(@id,'ClaimFinancialsTransactionsScreen-TransactionsLV-" + i + "-CreateDate')]");
				By FT_Amount       = By.xpath("//div[contains(@id,'ClaimFinancialsTransactionsScreen-TransactionsLV-" + i + "-Amount')]");
				By FT_Coverage     = By.xpath("//div[contains(@id,'ClaimFinancialsTransactionsScreen-TransactionsLV-" + i + "-CoverageType')]");
				By FT_CostType     = By.xpath("//div[contains(@id,'ClaimFinancialsTransactionsScreen-TransactionsLV-" + i + "-CostType')]");
				By FT_CostCategory = By.xpath("//div[contains(@id,'ClaimFinancialsTransactionsScreen-TransactionsLV-" + i + "-CostCategory')]");
				By FT_Status       = By.xpath("//div[contains(@id,'ClaimFinancialsTransactionsScreen-TransactionsLV-" + i + "-Status')]");

				String Actual_FT_CreateDate   = getText_Element(FT_CreateDate);
				String Actual_FT_Amount       = getText_Element(FT_Amount);
				String Actual_FT_Coverage     = getText_Element(FT_Coverage);
				String Actual_FT_CostType     = getText_Element(FT_CostType);
				String Actual_FT_CostCategory = getText_Element(FT_CostCategory);
				String Actual_FT_Status       = getText_Element(FT_Status);

				String Expected_FT_CreateDate   = lhm_TestCase_Table_Data.get("FT_CreateDate");
				String Expected_FT_Amount       = lhm_TestCase_Table_Data.get("CurrentlyAvailable" + i);
				String Expected_FT_Coverage     = lhm_TestCase_Table_Data.get("Coverage" + i);
				String Expected_FT_CostType     = lhm_TestCase_Table_Data.get("CostType" + i);
				String Expected_FT_CostCategory = lhm_TestCase_Table_Data.get("CostCategory" + i);
				String Expected_FT_Status       = lhm_TestCase_Table_Data.get("FT_Status");

				if ((Actual_FT_CreateDate.equals(Expected_FT_CreateDate)) && (Actual_FT_Amount.equals(Expected_FT_Amount)) && (Actual_FT_Coverage.equals(Expected_FT_Coverage)) && (Actual_FT_CostType.equals(Expected_FT_CostType))
						&& (Actual_FT_CostCategory.equals(Expected_FT_CostCategory)) && (Actual_FT_Status.equals(Expected_FT_Status))) {

					oExtentTest.log(Status.PASS,
							"Verifying DefaultReserve Row = [" + (i + 1) + "]" + "<br />" + "CreateDate=>Actual = [" + Actual_FT_CreateDate + "] <Equals> Expected = [" + Expected_FT_CreateDate + "]" + "<br />" + "Amount=>Actual = ["
									+ Actual_FT_Amount + "] <Equals> Expected = [" + Expected_FT_Amount + "]" + "<br />" + "Category=>Actual = [" + Actual_FT_Coverage + "] <Equals> Expected = [" + Expected_FT_Coverage + "]" + "<br />"
									+ "CostType=>Actual = [" + Actual_FT_CostType + "] <Equals> Expected = [" + Expected_FT_CostType + "]" + "<br />" + "CostCategory=>Actual = [" + Actual_FT_CostCategory + "] <Equals> Expected = ["
									+ Expected_FT_CostCategory + "]" + "<br />" + "Status=>Actual = [" + Actual_FT_Status + "] <Equals> Expected = [" + Expected_FT_Status + "]");
				} else {
					oExtentTest.log(Status.FAIL,
							"Verifying DefaultReserve Row = [" + (i + 1) + "]" + "<br />" + "CreateDate=>Actual = [" + Actual_FT_CreateDate + "] <Equals> Expected = [" + Expected_FT_CreateDate + "]" + "<br />" + "Amount=>Actual = ["
									+ Actual_FT_Amount + "] <Equals> Expected = [" + Expected_FT_Amount + "]" + "<br />" + "Category=>Actual = [" + Actual_FT_Coverage + "] <Equals> Expected = [" + Expected_FT_Coverage + "]" + "<br />"
									+ "CostType=>Actual = [" + Actual_FT_CostType + "] <Equals> Expected = [" + Expected_FT_CostType + "]" + "<br />" + "CostCategory=>Actual = [" + Actual_FT_CostCategory + "] <Equals> Expected = ["
									+ Expected_FT_CostCategory + "]" + "<br />" + "Status=>Actual = [" + Actual_FT_Status + "] <Equals> Expected = [" + Expected_FT_Status + "]");
				}

			}

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void FT_DefaultReserve_Verify_Payment() throws Throwable {

		// Financial Transcations

		try {
			lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("Payment");

			GuidewireAutomate_Validation("FinancialsTransactions Header", FinancialTranscations_Header, "equals", "Financials: Transactions");
			int intRowNum_DefaultReserve = Integer.parseInt(lhm_TestCase_Table_Data.get("DefaultRow"));

			for (int i = 0; i < intRowNum_DefaultReserve; i++) {
				By FT_CreateDate   = By.xpath("//div[contains(@id,'ClaimFinancialsTransactionsScreen-TransactionsLV-" + i + "-CreateDate')]");
				By FT_Amount       = By.xpath("//div[contains(@id,'ClaimFinancialsTransactionsScreen-TransactionsLV-" + i + "-Amount')]");
				By FT_Coverage     = By.xpath("//div[contains(@id,'ClaimFinancialsTransactionsScreen-TransactionsLV-" + i + "-CoverageType')]");
				By FT_CostType     = By.xpath("//div[contains(@id,'ClaimFinancialsTransactionsScreen-TransactionsLV-" + i + "-CostType')]");
				By FT_CostCategory = By.xpath("//div[contains(@id,'ClaimFinancialsTransactionsScreen-TransactionsLV-" + i + "-CostCategory')]");
				By FT_Status       = By.xpath("//div[contains(@id,'ClaimFinancialsTransactionsScreen-TransactionsLV-" + i + "-Status')]");

				String Actual_FT_CreateDate   = getText_Element(FT_CreateDate);
				String Actual_FT_Amount       = getText_Element(FT_Amount);
				String Actual_FT_Coverage     = getText_Element(FT_Coverage);
				String Actual_FT_CostType     = getText_Element(FT_CostType);
				String Actual_FT_CostCategory = getText_Element(FT_CostCategory);
				String Actual_FT_Status       = getText_Element(FT_Status);

				String Expected_FT_CreateDate   = lhm_TestCase_Table_Data.get("FT_CreateDate");
				String Expected_FT_Amount       = lhm_TestCase_Table_Data.get("DR_CurrentlyAvailable" + (i + 1));
				String Expected_FT_Coverage     = lhm_TestCase_Table_Data.get("DR_Coverage" + (i + 1));
				String Expected_FT_CostType     = lhm_TestCase_Table_Data.get("DR_CostType" + (i + 1));
				String Expected_FT_CostCategory = lhm_TestCase_Table_Data.get("DR_CostCategory" + (i + 1));
				String Expected_FT_Status       = lhm_TestCase_Table_Data.get("FT_Status");

				if ((Actual_FT_CreateDate.equals(Expected_FT_CreateDate)) && (Actual_FT_Amount.equals(Expected_FT_Amount)) && (Actual_FT_Coverage.equals(Expected_FT_Coverage)) && (Actual_FT_CostType.equals(Expected_FT_CostType))
						&& (Actual_FT_CostCategory.equals(Expected_FT_CostCategory)) && (Actual_FT_Status.equals(Expected_FT_Status))) {

					oExtentTest.log(Status.PASS,
							"Verifying DefaultReserve Row = [" + (i + 1) + "]" + "<br />" + "CreateDate=>Actual = [" + Actual_FT_CreateDate + "] <Equals> Expected = [" + Expected_FT_CreateDate + "]" + "<br />" + "Amount=>Actual = ["
									+ Actual_FT_Amount + "] <Equals> Expected = [" + Expected_FT_Amount + "]" + "<br />" + "Category=>Actual = [" + Actual_FT_Coverage + "] <Equals> Expected = [" + Expected_FT_Coverage + "]" + "<br />"
									+ "CostType=>Actual = [" + Actual_FT_CostType + "] <Equals> Expected = [" + Expected_FT_CostType + "]" + "<br />" + "CostCategory=>Actual = [" + Actual_FT_CostCategory + "] <Equals> Expected = ["
									+ Expected_FT_CostCategory + "]" + "<br />" + "Status=>Actual = [" + Actual_FT_Status + "] <Equals> Expected = [" + Expected_FT_Status + "]");
				} else {
					oExtentTest.log(Status.FAIL,
							"Verifying DefaultReserve Row = [" + (i + 1) + "]" + "<br />" + "CreateDate=>Actual = [" + Actual_FT_CreateDate + "] <Equals> Expected = [" + Expected_FT_CreateDate + "]" + "<br />" + "Amount=>Actual = ["
									+ Actual_FT_Amount + "] <Equals> Expected = [" + Expected_FT_Amount + "]" + "<br />" + "Category=>Actual = [" + Actual_FT_Coverage + "] <Equals> Expected = [" + Expected_FT_Coverage + "]" + "<br />"
									+ "CostType=>Actual = [" + Actual_FT_CostType + "] <Equals> Expected = [" + Expected_FT_CostType + "]" + "<br />" + "CostCategory=>Actual = [" + Actual_FT_CostCategory + "] <Equals> Expected = ["
									+ Expected_FT_CostCategory + "]" + "<br />" + "Status=>Actual = [" + Actual_FT_Status + "] <Equals> Expected = [" + Expected_FT_Status + "]");
				}

			}

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void FT_AllItems_Verify() throws Throwable {
		try {

			lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("Reserve");

			int rowNum     = Integer.parseInt(lhm_TestCase_Table_Data.get("rowNum"));
			int lastrowNum = Integer.parseInt(lhm_TestCase_Table_Data.get("LastRow"));

			for (int i = rowNum; i <= lastrowNum; i++) {
				By FT_CreateDate   = By.xpath("//div[contains(@id,'ClaimFinancialsTransactionsScreen-TransactionsLV-" + i + "-CreateDate')]");
				By FT_Amount       = By.xpath("//div[contains(@id,'ClaimFinancialsTransactionsScreen-TransactionsLV-" + i + "-Amount')]");
				By FT_Coverage     = By.xpath("//div[contains(@id,'ClaimFinancialsTransactionsScreen-TransactionsLV-" + i + "-CoverageType')]");
				By FT_CostType     = By.xpath("//div[contains(@id,'ClaimFinancialsTransactionsScreen-TransactionsLV-" + i + "-CostType')]");
				By FT_CostCategory = By.xpath("//div[contains(@id,'ClaimFinancialsTransactionsScreen-TransactionsLV-" + i + "-CostCategory')]");
				By FT_Status       = By.xpath("//div[contains(@id,'ClaimFinancialsTransactionsScreen-TransactionsLV-" + i + "-Status')]");

				String Actual_FT_CreateDate   = getText_Element(FT_CreateDate);
				String Actual_FT_Amount       = getText_Element(FT_Amount);
				String Actual_FT_Coverage     = getText_Element(FT_Coverage);
				String Actual_FT_CostType     = getText_Element(FT_CostType);
				String Actual_FT_CostCategory = getText_Element(FT_CostCategory);
				String Actual_FT_Status       = getText_Element(FT_Status);

				String Expected_FT_CreateDate   = lhm_TestCase_Table_Data.get("FT_CreateDate");
				String Expected_FT_Amount       = lhm_TestCase_Table_Data.get("FT_Amount");
				String Expected_FT_Coverage     = lhm_TestCase_Table_Data.get("Coverage");
				String Expected_FT_CostType     = lhm_TestCase_Table_Data.get("CostType");
				String Expected_FT_CostCategory = lhm_TestCase_Table_Data.get("CostCategoryDropDownValue" + i);
				String Expected_FT_Status       = lhm_TestCase_Table_Data.get("FT_Status");

				if ((Actual_FT_CreateDate.equals(Expected_FT_CreateDate)) && (Actual_FT_Amount.equals(Expected_FT_Amount)) && (Actual_FT_Coverage.equals(Expected_FT_Coverage)) && (Actual_FT_CostType.equals(Expected_FT_CostType))
						&& (Actual_FT_CostCategory.equals(Expected_FT_CostCategory)) && (Actual_FT_Status.equals(Expected_FT_Status))) {

					oExtentTest.log(Status.PASS,
							"Verifying Row = [" + (i + 1) + "]" + "<br />" + "CreateDate=>Actual = [" + Actual_FT_CreateDate + "] <Equals> Expected = [" + Expected_FT_CreateDate + "]" + "<br />" + "Amount=>Actual = [" + Actual_FT_Amount
									+ "] <Equals> Expected = [" + Expected_FT_Amount + "]" + "<br />" + "Category=>Actual = [" + Actual_FT_Coverage + "] <Equals> Expected = [" + Expected_FT_Coverage + "]" + "<br />" + "CostType=>Actual = ["
									+ Actual_FT_CostType + "] <Equals> Expected = [" + Expected_FT_CostType + "]" + "<br />" + "CostCategory=>Actual = [" + Actual_FT_CostCategory + "] <Equals> Expected = [" + Expected_FT_CostCategory + "]" + "<br />"
									+ "Status=>Actual = [" + Actual_FT_Status + "] <Equals> Expected = [" + Expected_FT_Status + "]");
				} else {
					oExtentTest.log(Status.FAIL,
							"Verifying Row = [" + (i + 1) + "]" + "<br />" + "CreateDate=>Actual = [" + Actual_FT_CreateDate + "] <Equals> Expected = [" + Expected_FT_CreateDate + "]" + "<br />" + "Amount=>Actual = [" + Actual_FT_Amount
									+ "] <Equals> Expected = [" + Expected_FT_Amount + "]" + "<br />" + "Category=>Actual = [" + Actual_FT_Coverage + "] <Equals> Expected = [" + Expected_FT_Coverage + "]" + "<br />" + "CostType=>Actual = ["
									+ Actual_FT_CostType + "] <Equals> Expected = [" + Expected_FT_CostType + "]" + "<br />" + "CostCategory=>Actual = [" + Actual_FT_CostCategory + "] <Equals> Expected = [" + Expected_FT_CostCategory + "]" + "<br />"
									+ "Status=>Actual = [" + Actual_FT_Status + "] <Equals> Expected = [" + Expected_FT_Status + "]");
				}

				if (i == 14) {
					GuidewireAutomate("NextPage", FinancialTranscations_NextPage, "clickAndwait", "click");
					FT_AllItems_NextPage_Verify();
					break;
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void FT_AllItems_NextPage_Verify() throws Throwable {
		GuidewireAutomate_Validation("FinancialsTransactions Header", FinancialTranscations_Header, "equals", "Financials: Transactions");
		int lastrowNum = Integer.parseInt(lhm_TestCase_Table_Data.get("LastRow"));

		int lastrownum = 14;

		for (int i = 0; i < lastrowNum - 14; i++) {
			lastrownum++;
			By FT_CreateDate   = By.xpath("//div[contains(@id,'ClaimFinancialsTransactionsScreen-TransactionsLV-" + i + "-CreateDate')]");
			By FT_Amount       = By.xpath("//div[contains(@id,'ClaimFinancialsTransactionsScreen-TransactionsLV-" + i + "-Amount')]");
			By FT_Coverage     = By.xpath("//div[contains(@id,'ClaimFinancialsTransactionsScreen-TransactionsLV-" + i + "-CoverageType')]");
			By FT_CostType     = By.xpath("//div[contains(@id,'ClaimFinancialsTransactionsScreen-TransactionsLV-" + i + "-CostType')]");
			By FT_CostCategory = By.xpath("//div[contains(@id,'ClaimFinancialsTransactionsScreen-TransactionsLV-" + i + "-CostCategory')]");
			By FT_Status       = By.xpath("//div[contains(@id,'ClaimFinancialsTransactionsScreen-TransactionsLV-" + i + "-Status')]");

			String Actual_FT_CreateDate   = getText_Element(FT_CreateDate);
			String Actual_FT_Amount       = getText_Element(FT_Amount);
			String Actual_FT_Coverage     = getText_Element(FT_Coverage);
			String Actual_FT_CostType     = getText_Element(FT_CostType);
			String Actual_FT_CostCategory = getText_Element(FT_CostCategory);
			String Actual_FT_Status       = getText_Element(FT_Status);

			String Expected_FT_CreateDate   = lhm_TestCase_Table_Data.get("FT_CreateDate");
			String Expected_FT_Amount       = lhm_TestCase_Table_Data.get("FT_Amount");
			String Expected_FT_Coverage     = lhm_TestCase_Table_Data.get("Coverage");
			String Expected_FT_CostType     = lhm_TestCase_Table_Data.get("CostType");
			String Expected_FT_CostCategory = lhm_TestCase_Table_Data.get("CostCategoryDropDownValue" + lastrownum);
			String Expected_FT_Status       = lhm_TestCase_Table_Data.get("FT_Status");

			if ((Actual_FT_CreateDate.equals(Expected_FT_CreateDate)) && (Actual_FT_Amount.equals(Expected_FT_Amount)) && (Actual_FT_Coverage.equals(Expected_FT_Coverage)) && (Actual_FT_CostType.equals(Expected_FT_CostType))
					&& (Actual_FT_CostCategory.equals(Expected_FT_CostCategory)) && (Actual_FT_Status.equals(Expected_FT_Status))) {

				oExtentTest.log(Status.PASS,
						"Verifying Row = [" + (i + 1) + "]" + "<br />" + "CreateDate=>Actual = [" + Actual_FT_CreateDate + "] <Equals> Expected = [" + Expected_FT_CreateDate + "]" + "<br />" + "Amount=>Actual = [" + Actual_FT_Amount
								+ "] <Equals> Expected = [" + Expected_FT_Amount + "]" + "<br />" + "Category=>Actual = [" + Actual_FT_Coverage + "] <Equals> Expected = [" + Expected_FT_Coverage + "]" + "<br />" + "CostType=>Actual = ["
								+ Actual_FT_CostType + "] <Equals> Expected = [" + Expected_FT_CostType + "]" + "<br />" + "CostCategory=>Actual = [" + Actual_FT_CostCategory + "] <Equals> Expected = [" + Expected_FT_CostCategory + "]" + "<br />"
								+ "Status=>Actual = [" + Actual_FT_Status + "] <Equals> Expected = [" + Expected_FT_Status + "]");
			} else {
				oExtentTest.log(Status.FAIL,
						"Verifying Row = [" + (i + 1) + "]" + "<br />" + "CreateDate=>Actual = [" + Actual_FT_CreateDate + "] <Equals> Expected = [" + Expected_FT_CreateDate + "]" + "<br />" + "Amount=>Actual = [" + Actual_FT_Amount
								+ "] <Equals> Expected = [" + Expected_FT_Amount + "]" + "<br />" + "Category=>Actual = [" + Actual_FT_Coverage + "] <Equals> Expected = [" + Expected_FT_Coverage + "]" + "<br />" + "CostType=>Actual = ["
								+ Actual_FT_CostType + "] <Equals> Expected = [" + Expected_FT_CostType + "]" + "<br />" + "CostCategory=>Actual = [" + Actual_FT_CostCategory + "] <Equals> Expected = [" + Expected_FT_CostCategory + "]" + "<br />"
								+ "Status=>Actual = [" + Actual_FT_Status + "] <Equals> Expected = [" + Expected_FT_Status + "]");
			}
		}
	}

	public static void FT_Item_Verify() throws Throwable {
		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("Payment");
		try {
			int i = Integer.parseInt(lhm_TestCase_Table_Data.get("DefaultRow"));

			By FT_CreateDate   = By.xpath("//div[contains(@id,'ClaimFinancialsTransactionsScreen-TransactionsLV-" + i + "-CreateDate')]");
			By FT_Amount       = By.xpath("//div[contains(@id,'ClaimFinancialsTransactionsScreen-TransactionsLV-" + i + "-Amount')]");
			By FT_Coverage     = By.xpath("//div[contains(@id,'ClaimFinancialsTransactionsScreen-TransactionsLV-" + i + "-CoverageType')]");
			By FT_CostType     = By.xpath("//div[contains(@id,'ClaimFinancialsTransactionsScreen-TransactionsLV-" + i + "-CostType')]");
			By FT_CostCategory = By.xpath("//div[contains(@id,'ClaimFinancialsTransactionsScreen-TransactionsLV-" + i + "-CostCategory')]");
			By FT_Status       = By.xpath("//div[contains(@id,'ClaimFinancialsTransactionsScreen-TransactionsLV-" + i + "-Status')]");
			oExtentTest.log(Status.INFO, "Verifying Row= [" + (i + 1) + "] the FinancialsTransactions Screen ");

			String Actual_FT_CreateDate   = getText_Element(FT_CreateDate);
			String Actual_FT_Amount       = getText_Element(FT_Amount);
			String Actual_FT_Coverage     = getText_Element(FT_Coverage);
			String Actual_FT_CostType     = getText_Element(FT_CostType);
			String Actual_FT_CostCategory = getText_Element(FT_CostCategory);
			String Actual_FT_Status       = getText_Element(FT_Status);

			String Expected_FT_CreateDate   = lhm_TestCase_Table_Data.get("FT_CreateDate");
			String Expected_FT_Amount       = lhm_TestCase_Table_Data.get("FT_Amount");
			String Expected_FT_Coverage     = lhm_TestCase_Table_Data.get("Coverage");
			String Expected_FT_CostType     = lhm_TestCase_Table_Data.get("CostType");
			String Expected_FT_CostCategory = lhm_TestCase_Table_Data.get("CostCategory");
			String Expected_FT_Status       = lhm_TestCase_Table_Data.get("FT_Status");

			if ((Actual_FT_CreateDate.equals(Expected_FT_CreateDate)) && (Actual_FT_Amount.equals(Expected_FT_Amount)) && (Actual_FT_Coverage.equals(Expected_FT_Coverage)) && (Actual_FT_CostType.equals(Expected_FT_CostType))
					&& (Actual_FT_CostCategory.equals(Expected_FT_CostCategory)) && (Actual_FT_Status.equals(Expected_FT_Status))) {

				oExtentTest.log(Status.PASS,
						"Verifying Row = [" + (i + 1) + "]" + "<br />" + "CreateDate=>Actual = [" + Actual_FT_CreateDate + "] <Equals> Expected = [" + Expected_FT_CreateDate + "]" + "<br />" + "Amount=>Actual = [" + Actual_FT_Amount
								+ "] <Equals> Expected = [" + Expected_FT_Amount + "]" + "<br />" + "Category=>Actual = [" + Actual_FT_Coverage + "] <Equals> Expected = [" + Expected_FT_Coverage + "]" + "<br />" + "CostType=>Actual = ["
								+ Actual_FT_CostType + "] <Equals> Expected = [" + Expected_FT_CostType + "]" + "<br />" + "CostCategory=>Actual = [" + Actual_FT_CostCategory + "] <Equals> Expected = [" + Expected_FT_CostCategory + "]" + "<br />"
								+ "Status=>Actual = [" + Actual_FT_Status + "] <Equals> Expected = [" + Expected_FT_Status + "]");
			} else {
				oExtentTest.log(Status.FAIL,
						"Verifying Row = [" + (i + 1) + "]" + "<br />" + "CreateDate=>Actual = [" + Actual_FT_CreateDate + "] <Equals> Expected = [" + Expected_FT_CreateDate + "]" + "<br />" + "Amount=>Actual = [" + Actual_FT_Amount
								+ "] <Equals> Expected = [" + Expected_FT_Amount + "]" + "<br />" + "Category=>Actual = [" + Actual_FT_Coverage + "] <Equals> Expected = [" + Expected_FT_Coverage + "]" + "<br />" + "CostType=>Actual = ["
								+ Actual_FT_CostType + "] <Equals> Expected = [" + Expected_FT_CostType + "]" + "<br />" + "CostCategory=>Actual = [" + Actual_FT_CostCategory + "] <Equals> Expected = [" + Expected_FT_CostCategory + "]" + "<br />"
								+ "Status=>Actual = [" + Actual_FT_Status + "] <Equals> Expected = [" + Expected_FT_Status + "]");
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void FinancialsChecks_Verification_1() throws Throwable {

		try {
			GuidewireAutomate_Validation("FinancialChecks Header", FinancialChecks_Header, "equals", "Financials: Checks");

			lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("NewTransaction_Check");

			GuidewireAutomate_Validation("FinancialChecks PayTo", FinancialChecks_PayTo_1, "equals", lhm_TestCase_Table_Data.get("PayToTheOrderOf"));
			GuidewireAutomate_Validation("FinancialChecks Status", FinancialChecks_Status_1, "equals", lhm_TestCase_Table_Data.get("Status"));
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

	public static void FinancialsChecks_Verification_2() throws Throwable {
		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("NewTransaction_Check");
		try {
			GuidewireAutomate_Validation("FinancialChecks Header", FinancialChecks_Header, "equals", "Financials: Checks");

			GuidewireAutomate_Validation("FinancialChecks PayTo", FinancialChecks_PayTo_2, "equals", lhm_TestCase_Table_Data.get("PayToTheOrderOf"));
			GuidewireAutomate_Validation("FinancialChecks Status", FinancialChecks_Status_2, "equals", lhm_TestCase_Table_Data.get("Status"));
		} catch (Exception e) {
			e.printStackTrace();
			throw e;

		}

	}

	// Author:Pankaj
	// Date:23/01/2022
	public static void FinancialsTransactions_Reserve1() throws Throwable {
		try {

			GuidewireAutomate_Validation("Screen Header", FinancialTranscations_Header, "equals", "Financials: Transactions");
			GuidewireAutomate("Reserve ", FinancialTranscations_Reserver1, "clickAndwait", "click");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

}
