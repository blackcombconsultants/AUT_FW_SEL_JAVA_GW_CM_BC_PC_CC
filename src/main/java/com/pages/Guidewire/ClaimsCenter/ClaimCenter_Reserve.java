package com.pages.Guidewire.ClaimsCenter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class ClaimCenter_Reserve extends SeleniumWebDriver_Commands implements ClaimCenter_Reserve_PO {

	public ClaimCenter_Reserve(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);

	}

	public static void verify_DefaultReserve() throws Throwable {

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_ClaimsCenter("Reserve");

		// List<WebElement> ActivityPatterns = getElements(rowCount);
		int rowNum = Integer.parseInt(lhm_TestCase_Table_Data.get("rowNum"));

		for (int i = 0; i < rowNum; i++) {

			By reserve_Coverage = By.xpath("//div[contains(@id,'EditableReservesLV-" + i + "-Coverage')]");
			By reserve_CostType = By.xpath("//div[contains(@id,'EditableReservesLV-" + i + "-CostType')]");
			By reserve_CostCategory = By.xpath("//div[contains(@id,'EditableReservesLV-" + i + "-CostCategory')]");
			By reserve_CurrentlyAvailable = By
					.xpath("//div[contains(@id,'EditableReservesLV-" + i + "-AvailableReserves')]");
			// Default Reserve Verifying
			oExtentTest.log(Status.INFO,
					"Verifying Row= [" + (i + 1) + "] the defualt Reserve is Created for Coverage ="
							+ lhm_TestCase_Table_Data.get("Coverage" + i) + " and CostTye="
							+ lhm_TestCase_Table_Data.get("CostType" + i));

			GuidewireAutomate_Validation("Reserve Coverage", reserve_Coverage, "equals",
					lhm_TestCase_Table_Data.get("Coverage" + i));
			GuidewireAutomate_Validation("Reserve CostType", reserve_CostType, "equals",
					lhm_TestCase_Table_Data.get("CostType" + i));
			GuidewireAutomate_Validation("Reserve CostCategory", reserve_CostCategory, "equals",
					lhm_TestCase_Table_Data.get("CostCategory" + i));
			GuidewireAutomate_Validation("Reserve CurrentlyAvailable", reserve_CurrentlyAvailable, "equals",
					lhm_TestCase_Table_Data.get("CurrentlyAvailable" + i));

		}

	}

	public static void VerifyCostType_CostCategory() throws Throwable

	{

		int WebElementCostCategory = Integer.parseInt(lhm_TestCase_Table_Data.get("getOptionsSize"));
		int rowNum = Integer.parseInt(lhm_TestCase_Table_Data.get("rowNum"));

		for (int i = rowNum; i <= WebElementCostCategory; i++) {
			By reserve_Exposure = By.xpath("//select[contains(@name,'EditableReservesLV-" + i + "-Exposure')]");
			By reserve_Coverage = By.xpath("//div[contains(@id,'EditableReservesLV-" + i + "-Coverage')]");
			By reserve_CostType = By.xpath("//select[contains(@name,'EditableReservesLV-" + i + "-CostType')]");
			By reserve_CostCategory = By.xpath("//select[contains(@name,'EditableReservesLV-" + i + "-CostCategory')]");
			By Reserve_NewAvailableReserves = By
					.xpath("//input[contains(@name,'EditableReservesLV-" + i + "-NewAmount')]");
			By Reserve_Comments = By.xpath("//input[contains(@name,'EditableReservesLV-" + i + "-Comments')]");

			if (i == 2) {

				GuidewireAutomate("Exposure", reserve_Exposure, "selectByVisibleText",
						lhm_TestCase_Table_Data.get("Exposure"));
				GuidewireAutomate_Validation("Coverage", reserve_Coverage, "equals",
						lhm_TestCase_Table_Data.get("Coverage"));

				GuidewireAutomate_Validation("Verify CostType", reserve_CostType, "getOptionscontains",
						lhm_TestCase_Table_Data.get("CostTypeValues"));

				oExtentTest.log(Status.PASS, "The below list is displayed in the same order for Cost Type field " + "["
						+ lhm_TestCase_Table_Data.get("CostTypeValues") + "]");

				GuidewireAutomate("CostType", reserve_CostType, "selectByVisibleText",
						lhm_TestCase_Table_Data.get("CostType"));

				GuidewireAutomate_Validation("Verify CostCategory", reserve_CostCategory, "getOptionscontains",
						lhm_TestCase_Table_Data.get("CostCategoryValuesrowNum2"));

				GuidewireAutomate("CostCategory", reserve_CostCategory, "selectByVisibleTextAndwait",
						lhm_TestCase_Table_Data.get("CostCategoryDropDownValue2"));

				GuidewireAutomate("NewAvailableReserves", Reserve_NewAvailableReserves, "clearANDsendKeys",
						lhm_TestCase_Table_Data.get("NewAvailableReserves"));
				GuidewireAutomate("Comment", Reserve_Comments, "clearANDsendKeys",
						lhm_TestCase_Table_Data.get("Comment"));

				ClickAddButton();

			} else if (i == 3) {

				SelectExposureVerifyCollison(i);
				GuidewireAutomate_Validation("Verify CostCategory", reserve_CostCategory, "getOptionscontains",
						lhm_TestCase_Table_Data.get("CostCategoryValuesrowNum3"));
				GuidewireAutomate("CostCategory", reserve_CostCategory, "selectByVisibleTextAndwait",
						lhm_TestCase_Table_Data.get("CostCategoryDropDownValue3"));
				AddNewAvailableReserves_Comment(i);

				ClickAddButton();
			} else if (i == 4) {
				SelectExposureVerifyCollison(i);
				if (rowNum == i) {
					GuidewireAutomate_Validation("Verify CostType", reserve_CostType, "getOptionscontains",
							lhm_TestCase_Table_Data.get("CostTypeValues"));

					oExtentTest.log(Status.PASS, "The below list is displayed in the same order for Cost Type field "
							+ "[" + lhm_TestCase_Table_Data.get("CostTypeValues") + "]");
					GuidewireAutomate_Validation("Verify CostCategory", reserve_CostCategory, "getOptionscontains",
							lhm_TestCase_Table_Data.get("CostCategoryValuesrowNum4"));

					GuidewireAutomate("CostCategory", reserve_CostCategory, "selectByVisibleTextAndwait",
							lhm_TestCase_Table_Data.get("CostCategoryDropDownValue4"));
					AddNewAvailableReserves_Comment(i);

				} else {
					GuidewireAutomate_Validation("Verify CostCategory", reserve_CostCategory, "getOptionscontains",
							lhm_TestCase_Table_Data.get("CostCategoryValuesrowNum4"));
					GuidewireAutomate("CostCategory", reserve_CostCategory, "selectByVisibleTextAndwait",
							lhm_TestCase_Table_Data.get("CostCategoryDropDownValue4"));
					AddNewAvailableReserves_Comment(i);

				}

				ClickAddButton();
			} else if (i == 5) {
				SelectExposureVerifyCollison(i);
				GuidewireAutomate_Validation("Verify CostCategory", reserve_CostCategory, "getOptionscontains",
						lhm_TestCase_Table_Data.get("CostCategoryValuesrowNum5"));
				GuidewireAutomate("CostCategory", reserve_CostCategory, "selectByVisibleTextAndwait",
						lhm_TestCase_Table_Data.get("CostCategoryDropDownValue5"));
				AddNewAvailableReserves_Comment(i);

				ClickAddButton();
			} else if (i == 6) {
				SelectExposureVerifyCollison(i);
				GuidewireAutomate_Validation("Verify CostCategory", reserve_CostCategory, "getOptionscontains",
						lhm_TestCase_Table_Data.get("CostCategoryValuesrowNum6"));
				GuidewireAutomate("CostCategory", reserve_CostCategory, "selectByVisibleTextAndwait",
						lhm_TestCase_Table_Data.get("CostCategoryDropDownValue6"));
				AddNewAvailableReserves_Comment(i);

				ClickAddButton();

			} else if (i == 7) {
				SelectExposureVerifyCollison(i);
				GuidewireAutomate_Validation("Verify CostCategory", reserve_CostCategory, "getOptionscontains",
						lhm_TestCase_Table_Data.get("CostCategoryValuesrowNum7"));
				GuidewireAutomate("CostCategory", reserve_CostCategory, "selectByVisibleTextAndwait",
						lhm_TestCase_Table_Data.get("CostCategoryDropDownValue7"));
				AddNewAvailableReserves_Comment(i);

				ClickAddButton();
			} else if (i == 8) {
				SelectExposureVerifyCollison(i);
				GuidewireAutomate_Validation("Verify CostCategory", reserve_CostCategory, "getOptionscontains",
						lhm_TestCase_Table_Data.get("CostCategoryValuesrowNum8"));

				GuidewireAutomate("CostCategory", reserve_CostCategory, "selectByVisibleTextAndwait",
						lhm_TestCase_Table_Data.get("CostCategoryDropDownValue8"));
				AddNewAvailableReserves_Comment(i);

				ClickAddButton();
			} else if (i == 9) {
				SelectExposureVerifyCollison(i);
				GuidewireAutomate_Validation("Verify CostCategory", reserve_CostCategory, "getOptionscontains",
						lhm_TestCase_Table_Data.get("CostCategoryValuesrowNum9"));

				GuidewireAutomate("CostCategory", reserve_CostCategory, "selectByVisibleTextAndwait",
						lhm_TestCase_Table_Data.get("CostCategoryDropDownValue9"));
				AddNewAvailableReserves_Comment(i);

				ClickAddButton();
			} else if (i == 10) {
				SelectExposureVerifyCollison(i);
				GuidewireAutomate_Validation("Verify CostCategory", reserve_CostCategory, "getOptionscontains",
						lhm_TestCase_Table_Data.get("CostCategoryValuesrowNum10"));

				GuidewireAutomate("CostCategory", reserve_CostCategory, "selectByVisibleTextAndwait",
						lhm_TestCase_Table_Data.get("CostCategoryDropDownValue10"));
				AddNewAvailableReserves_Comment(i);

				ClickAddButton();
			} else if (i == 11) {
				SelectExposureVerifyCollison(i);
				GuidewireAutomate_Validation("Verify CostCategory", reserve_CostCategory, "getOptionscontains",
						lhm_TestCase_Table_Data.get("CostCategoryValuesrowNum11"));

				GuidewireAutomate("CostCategory", reserve_CostCategory, "selectByVisibleTextAndwait",
						lhm_TestCase_Table_Data.get("CostCategoryDropDownValue11"));
				AddNewAvailableReserves_Comment(i);

				ClickAddButton();
			} else if (i == 12) {
				SelectExposureVerifyCollison(i);
				GuidewireAutomate_Validation("Verify CostCategory", reserve_CostCategory, "getOptionscontains",
						lhm_TestCase_Table_Data.get("CostCategoryValuesrowNum12"));

				GuidewireAutomate("CostCategory", reserve_CostCategory, "selectByVisibleTextAndwait",
						lhm_TestCase_Table_Data.get("CostCategoryDropDownValue12"));
				AddNewAvailableReserves_Comment(i);

				ClickAddButton();
			} else if (i == 13) {
				SelectExposureVerifyCollison(i);
				GuidewireAutomate_Validation("Verify CostCategory", reserve_CostCategory, "getOptionscontains",
						lhm_TestCase_Table_Data.get("CostCategoryValuesrowNum13"));

				GuidewireAutomate("CostCategory", reserve_CostCategory, "selectByVisibleTextAndwait",
						lhm_TestCase_Table_Data.get("CostCategoryDropDownValue13"));
				AddNewAvailableReserves_Comment(i);

				ClickAddButton();
			} else if (i == 14) {
				SelectExposureVerifyCollison(i);
				GuidewireAutomate_Validation("Verify CostCategory", reserve_CostCategory, "getOptionscontains",
						lhm_TestCase_Table_Data.get("CostCategoryValuesrowNum14"));

				GuidewireAutomate("CostCategory", reserve_CostCategory, "selectByVisibleTextAndwait",
						lhm_TestCase_Table_Data.get("CostCategoryDropDownValue14"));
				AddNewAvailableReserves_Comment(i);

				ClickAddButton();
			} else if (i == 15) {
				SelectExposureVerifyCollison(i);
				GuidewireAutomate_Validation("Verify CostCategory", reserve_CostCategory, "getOptionscontains",
						lhm_TestCase_Table_Data.get("CostCategoryValuesrowNum15"));

				GuidewireAutomate("CostCategory", reserve_CostCategory, "selectByVisibleTextAndwait",
						lhm_TestCase_Table_Data.get("CostCategoryDropDownValue15"));
				AddNewAvailableReserves_Comment(i);

				ClickAddButton();

			}

			else if (i == 16) {
				SelectExposureVerifyCollison(i);
				GuidewireAutomate_Validation("Verify CostCategory", reserve_CostCategory, "getOptionscontains",
						lhm_TestCase_Table_Data.get("CostCategoryValuesrowNum16"));
				GuidewireAutomate("CostCategory", reserve_CostCategory, "selectByVisibleTextAndwait",
						lhm_TestCase_Table_Data.get("CostCategoryDropDownValue16"));
				AddNewAvailableReserves_Comment(i);

				ClickAddButton();

			} else if (i == 17) {
				SelectExposureVerifyCollison(i);
				GuidewireAutomate_Validation("Verify CostCategory", reserve_CostCategory, "getOptionscontains",
						lhm_TestCase_Table_Data.get("CostCategoryValuesrowNum17"));
				GuidewireAutomate("CostCategory", reserve_CostCategory, "selectByVisibleTextAndwait",
						lhm_TestCase_Table_Data.get("CostCategoryDropDownValue17"));
				AddNewAvailableReserves_Comment(i);

				ClickAddButton();

			} else if (i == 18) {
				SelectExposureVerifyCollison(i);
				GuidewireAutomate_Validation("Verify CostCategory", reserve_CostCategory, "getOptionscontains",
						lhm_TestCase_Table_Data.get("CostCategoryValuesrowNum18"));
				GuidewireAutomate("CostCategory", reserve_CostCategory, "selectByVisibleTextAndwait",
						lhm_TestCase_Table_Data.get("CostCategoryDropDownValue18"));
				AddNewAvailableReserves_Comment(i);

				ClickAddButton();

			} else if (i == 19) {
				SelectExposureVerifyCollison(i);
				GuidewireAutomate_Validation("Verify CostCategory", reserve_CostCategory, "getOptionscontains",
						lhm_TestCase_Table_Data.get("CostCategoryValuesrowNum19"));
				GuidewireAutomate("CostCategory", reserve_CostCategory, "selectByVisibleTextAndwait",
						lhm_TestCase_Table_Data.get("CostCategoryDropDownValue19"));
				AddNewAvailableReserves_Comment(i);

				ClickAddButton();

			} else if (i == 20) {
				SelectExposureVerifyCollison(i);
				GuidewireAutomate_Validation("Verify CostCategory", reserve_CostCategory, "getOptionscontains",
						lhm_TestCase_Table_Data.get("CostCategoryValuesrowNum20"));
				GuidewireAutomate("CostCategory", reserve_CostCategory, "selectByVisibleTextAndwait",
						lhm_TestCase_Table_Data.get("CostCategoryDropDownValue20"));
				AddNewAvailableReserves_Comment(i);

				ClickAddButton();

			} else if (i == 21) {
				SelectExposureVerifyCollison(i);
				GuidewireAutomate_Validation("Verify CostCategory", reserve_CostCategory, "getOptionscontains",
						lhm_TestCase_Table_Data.get("CostCategoryValuesrowNum21"));
				GuidewireAutomate("CostCategory", reserve_CostCategory, "selectByVisibleTextAndwait",
						lhm_TestCase_Table_Data.get("CostCategoryDropDownValue21"));
				AddNewAvailableReserves_Comment(i);

				ClickAddButton();

			} else if (i == 22) {
				SelectExposureVerifyCollison(i);
				GuidewireAutomate_Validation("Verify CostCategory", reserve_CostCategory, "getOptionscontains",
						lhm_TestCase_Table_Data.get("CostCategoryValuesrowNum22"));
				GuidewireAutomate("CostCategory", reserve_CostCategory, "selectByVisibleTextAndwait",
						lhm_TestCase_Table_Data.get("CostCategoryDropDownValue22"));
				AddNewAvailableReserves_Comment(i);

				ClickAddButton();

			}

		}

	}

	public static void SelectExposureVerifyCollison(int i) throws Throwable {
		By reserve_Exposure = By.xpath("//select[contains(@name,'EditableReservesLV-" + i + "-Exposure')]");
		By reserve_Coverage = By.xpath("//div[contains(@id,'EditableReservesLV-" + i + "-Coverage')]");
		By reserve_CostType = By.xpath("//select[contains(@name,'EditableReservesLV-" + i + "-CostType')]");
		GuidewireAutomate("Exposure", reserve_Exposure, "selectByVisibleTextAndwait",
				lhm_TestCase_Table_Data.get("Exposure"));
		GuidewireAutomate_Validation("Reserve Coverage", reserve_Coverage, "equals",
				lhm_TestCase_Table_Data.get("Coverage"));
		GuidewireAutomate("CostType", reserve_CostType, "selectByVisibleTextAndwait",
				lhm_TestCase_Table_Data.get("CostType"));
	}

	public static void ClickAddButton() throws Throwable {

		try {
			GuidewireAutomate("Add", Reserve_Add, "clickAndwait", "Click");
		} catch (ElementClickInterceptedException e) {
			GuidewireAutomate("Add", Reserve_Add, "clickAndwait", "Click");

		}

	}

	public static void AddNewAvailableReserves_Comment(int i) throws Throwable {
		By Reserve_NewAvailableReserves = By.xpath("//input[contains(@name,'EditableReservesLV-" + i + "-NewAmount')]");
		By Reserve_Comments = By.xpath("//input[contains(@name,'EditableReservesLV-" + i + "-Comments')]");
		GuidewireAutomate("NewAvailableReserves", Reserve_NewAvailableReserves, "clearANDsendKeys",
				lhm_TestCase_Table_Data.get("NewAvailableReserves"));
		GuidewireAutomate("Comment", Reserve_Comments, "clearANDsendKeys", lhm_TestCase_Table_Data.get("Comment"));
	}

	public static void EditReserves_Save() throws Throwable {
		int WebElementCostCategory = Integer.parseInt(lhm_TestCase_Table_Data.get("getOptionsSize"));
		int lastrow = Integer.parseInt(lhm_TestCase_Table_Data.get("LastRow"));

		if (WebElementCostCategory == lastrow) {
			int getOptionsSize = WebElementCostCategory + 1;
			By reserve_CostCategory = By
					.xpath("//select[contains(@name,'EditableReservesLV-" + getOptionsSize + "-CostCategory')]");
			By reserve_CheckBox = By
					.xpath("//input[contains(@name,'EditableReservesLV-" + getOptionsSize + "-_Checkbox')]");

			GuidewireAutomate("CheckBox", reserve_CheckBox, "click", "NA");

			SelectExposureVerifyCollison(WebElementCostCategory + 1);
			GuidewireAutomate_Validation("Verify CostCategory", reserve_CostCategory, "getOptionscontains", "");

			oExtentTest.log(Status.PASS, "No TypeList Present for CostCategory");
			GuidewireAutomate("Remove", Reserve_Remove, "clickAndwait", "NA");
			Thread.sleep(2000);
			GuidewireAutomate("Save", Reserve_Save, "clickAndwait", "NA");

		}
	}

	public static void EditReserves_ValidationResults() throws Throwable {
		try {
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_ClaimsCenter("asBasicInfo");

			GuidewireAutomate_Validation("ValidationResults Header", EditReserve_ValidationResults, "equals",
					"Validation Results");
			GuidewireAutomate_Validation("Warnings Title", EditReserve_ValidationResults_Warning, "equals",
					"Warnings:");
			GuidewireAutomate_Validation("Warnings First", ValidationResults_Warning_First, "contains",
					"Gross incurred on exposure (2) 1st Party Vehicle - PGNUtwMRX Automation ($2,500.00)");

			String strChoosebyCoverage_Vehicle = lhm_TestCase_Table_Data.get("BI_IV_Select");

			By ValidationResults_Warning_Second = By.xpath(
					"//div[contains(@id,'WebMessageWorksheetScreen-grpMsgs')]//div[@class='gw-message' and contains(text(),'Gross incurred for "
							+ strChoosebyCoverage_Vehicle + "')]");
			GuidewireAutomate_Validation("Warnings Second", ValidationResults_Warning_Second, "contains",
					"Gross incurred for " + strChoosebyCoverage_Vehicle + " ($2,500.00)");
			GuidewireAutomate("Clear", ValidationResults_ClearButton, "clickAndwait", "clickAndwait");
			GuidewireAutomate("Save", Reserve_Save, "clickAndwait", "NA");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void EditReserves_ValidationResultsElectronicEquipment() throws Throwable {
		try {
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_ClaimsCenter("asBasicInfo");
			String strChoosebyCoverage_Vehicle = lhm_TestCase_Table_Data.get("BI_IV_Select");

			GuidewireAutomate_Validation("ValidationResults Header", EditReserve_ValidationResults, "equals",
					"Validation Results");
			GuidewireAutomate_Validation("Warnings Title", EditReserve_ValidationResults_Warning, "equals",
					"Warnings:");

			By ValidationResults_Warning_First = By.xpath(
					"//div[contains(@id,'WebMessageWorksheetScreen-grpMsgs')]//div[@class='gw-message' and contains(text(),'Gross incurred for "
							+ strChoosebyCoverage_Vehicle + "')]");
			GuidewireAutomate_Validation("Warnings First", ValidationResults_Warning_First, "contains",
					"Gross incurred for 2000 Honda Civic");

			GuidewireAutomate("Clear", ValidationResults_ClearButton, "clickAndwait", "clickAndwait");
			GuidewireAutomate("Save", Reserve_Save, "clickAndwait", "NA");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void FinancialsTransactions_VerificationForDefaultReserve() throws Throwable {
		try {
			GuidewireAutomate_Validation("FinancialsTransactions Header", FinancialTranscations_Header, "equals",
					"Financials: Transactions");
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_ClaimsCenter("Reserve");
			int rowNum = Integer.parseInt(lhm_TestCase_Table_Data.get("rowNum"));

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

				String strFinancialsTransactions_CreateDate = getText_Element(FinancialsTransactions_CreateDate);
				String strFinancialsTransactions_Amount = getText_Element(FinancialsTransactions_Amount);
				String strFinancialsTransactions_Coverage = getText_Element(FinancialsTransactions_Coverage);
				String strFinancialsTransactions_CostType = getText_Element(FinancialsTransactions_CostType);
				String strFinancialsTransactions_CostCategory = getText_Element(FinancialsTransactions_CostCategory);
				String strFinancialsTransactions_Status = getText_Element(FinancialsTransactions_Status);

				String FT_CreateDate = lhm_TestCase_Table_Data.get("FT_CreateDate");
				String FT_Amount = lhm_TestCase_Table_Data.get("CurrentlyAvailable" + i);
				String FT_Coverage = lhm_TestCase_Table_Data.get("Coverage" + i);
				String FT_CostType = lhm_TestCase_Table_Data.get("CostType" + i);
				String FT_CostCategory = lhm_TestCase_Table_Data.get("CostCategory" + i);
				String FT_Status = lhm_TestCase_Table_Data.get("FT_Status");

				if ((strFinancialsTransactions_CreateDate.equals(FT_CreateDate))
						&& (strFinancialsTransactions_Amount.equals(FT_Amount))
						&& (strFinancialsTransactions_Coverage.equals(FT_Coverage))
						&& (strFinancialsTransactions_CostType.equals(FT_CostType))
						&& (strFinancialsTransactions_CostCategory.equals(FT_CostCategory))
						&& (strFinancialsTransactions_Status.equals(FT_Status))) {

					oExtentTest.log(Status.PASS,
							"Verifying Row = [" + (i + 1) + "] CreateDate =>Actual = ["
									+ strFinancialsTransactions_CreateDate + "] Equals Expected = [" + FT_CreateDate
									+ "]" + "<br />" + "Amount=>Actual = [" + strFinancialsTransactions_Amount
									+ "] Equals Expected = [" + FT_Amount + "]" + "<br />" + "Category=>Actual = ["
									+ strFinancialsTransactions_Coverage + "] Equals Expected = [" + FT_Coverage + "]"
									+ "<br />" + "CostType=>Actual = [" + strFinancialsTransactions_CostType
									+ "] Equals Expected = [" + FT_CostType + "]" + "<br />"
									+ "CostCategory=>Actual = [" + strFinancialsTransactions_CostCategory
									+ "] Equals Expected = [" + FT_CostCategory + "]" + "<br />" + "Status=>Actual = ["
									+ strFinancialsTransactions_Status + "] Equals Expected = [" + FT_Status + "]");

				} else {
					oExtentTest.log(Status.FAIL,
							"Verifying Row = [" + (i + 1) + "] CreateDate =>Actual = ["
									+ strFinancialsTransactions_CreateDate + "] Equals Expected = [" + FT_CreateDate
									+ "]" + "<br />" + "Amount=>Actual = [" + strFinancialsTransactions_Amount
									+ "] Equals Expected = [" + FT_Amount + "]" + "<br />" + "Category=>Actual = ["
									+ strFinancialsTransactions_Coverage + "] Equals Expected = [" + FT_Coverage + "]"
									+ "<br />" + "CostType=>Actual = [" + strFinancialsTransactions_CostType
									+ "] Equals Expected = [" + FT_CostType + "]" + "<br />"
									+ "CostCategory=>Actual = [" + strFinancialsTransactions_CostCategory
									+ "] Equals Expected = [" + FT_CostCategory + "]" + "<br />" + "Status=>Actual = ["
									+ strFinancialsTransactions_Status + "] Equals Expected = [" + FT_Status + "]");

				}

			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void FinancialsTransactions_Verification() throws Throwable {
		try {
			// GuidewireAutomate_Validation("Screen Header", EditReserve_ValidationResults,
			// "equals",
			// "Validation Results");
			// table[@class='gw-ListViewWidget--table gw-table']/tbody/tr

			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_ClaimsCenter("Reserve");
			int rowNum = Integer.parseInt(lhm_TestCase_Table_Data.get("rowNum"));
			int lastrowNum = Integer.parseInt(lhm_TestCase_Table_Data.get("LastRow"));

			for (int i = rowNum; i <= lastrowNum; i++) {
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

				String strFinancialsTransactions_CreateDate = getText_Element(FinancialsTransactions_CreateDate);
				String strFinancialsTransactions_Amount = getText_Element(FinancialsTransactions_Amount);
				String strFinancialsTransactions_Coverage = getText_Element(FinancialsTransactions_Coverage);
				String strFinancialsTransactions_CostType = getText_Element(FinancialsTransactions_CostType);
				String strFinancialsTransactions_CostCategory = getText_Element(FinancialsTransactions_CostCategory);
				String strFinancialsTransactions_Status = getText_Element(FinancialsTransactions_Status);

				String FT_CreateDate = lhm_TestCase_Table_Data.get("FT_CreateDate");
				String FT_Amount = lhm_TestCase_Table_Data.get("FT_Amount");
				String FT_Coverage = lhm_TestCase_Table_Data.get("Coverage");
				String FT_CostType = lhm_TestCase_Table_Data.get("CostType");
				String FT_CostCategory = lhm_TestCase_Table_Data.get("CostCategoryDropDownValue" + i);
				String FT_Status = lhm_TestCase_Table_Data.get("FT_Status");

				if ((strFinancialsTransactions_CreateDate.equals(FT_CreateDate))
						&& (strFinancialsTransactions_Amount.equals(FT_Amount))
						&& (strFinancialsTransactions_Coverage.equals(FT_Coverage))
						&& (strFinancialsTransactions_CostType.equals(FT_CostType))
						&& (strFinancialsTransactions_CostCategory.equals(FT_CostCategory))
						&& (strFinancialsTransactions_Status.equals(FT_Status))) {

					oExtentTest.log(Status.PASS,
							"Verifying Row = [" + (i + 1) + "] CreateDate =>Actual = ["
									+ strFinancialsTransactions_CreateDate + "] Equals Expected = [" + FT_CreateDate
									+ "]" + "<br />" + "Amount=>Actual = [" + strFinancialsTransactions_Amount
									+ "] Equals Expected = [" + FT_Amount + "]" + "<br />" + "Category=>Actual = ["
									+ strFinancialsTransactions_Coverage + "] Equals Expected = [" + FT_Coverage + "]"
									+ "<br />" + "CostType=>Actual = [" + strFinancialsTransactions_CostType
									+ "] Equals Expected = [" + FT_CostType + "]" + "<br />"
									+ "CostCategory=>Actual = [" + strFinancialsTransactions_CostCategory
									+ "] Equals Expected = [" + FT_CostCategory + "]" + "<br />" + "Status=>Actual = ["
									+ strFinancialsTransactions_Status + "] Equals Expected = [" + FT_Status + "]");

				} else {
					oExtentTest.log(Status.FAIL,
							"CreateDate =>Actual = [" + strFinancialsTransactions_CreateDate + "] Equals Expected = ["
									+ FT_CreateDate + "]" + "<br />" + "Amount=>Actual = ["
									+ strFinancialsTransactions_Amount + "] Equals Expected = [" + FT_Amount + "]"
									+ "<br />" + "Category=>Actual = [" + strFinancialsTransactions_Coverage
									+ "] Equals Expected = [" + FT_Coverage + "]" + "<br />" + "CostType=>Actual = ["
									+ strFinancialsTransactions_CostType + "] Equals Expected = [" + FT_CostType + "]"
									+ "<br />" + "CostCategory=>Actual = [" + strFinancialsTransactions_CostCategory
									+ "] Equals Expected = [" + FT_CostCategory + "]" + "<br />" + "Status=>Actual = ["
									+ strFinancialsTransactions_Status + "] Equals Expected = [" + FT_Status + "]");

				}

				if (i == 14) {
					GuidewireAutomate("NextPage", FinancialTranscations_NextPage, "clickAndwait", "Click");
					Thread.sleep(3000);
					break;
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void FinancialTransaction_NextPageValidation() throws Throwable {
		GuidewireAutomate_Validation("FinancialsTransactions Header", FinancialTranscations_Header, "equals",
				"Financials: Transactions");
		int lastrowNum = Integer.parseInt(lhm_TestCase_Table_Data.get("LastRow"));

		int lastrownum = 14;

		for (int i = 0; i < lastrowNum - 14; i++) {
			lastrownum++;
			By FinancialsTransactions_CreateDate = By.xpath(
					"//div[contains(@id,'ClaimFinancialsTransactionsScreen-TransactionsLV-" + i + "-CreateDate')]");
			By FinancialsTransactions_Amount = By
					.xpath("//div[contains(@id,'ClaimFinancialsTransactionsScreen-TransactionsLV-" + i + "-Amount')]");
			By FinancialsTransactions_Coverage = By.xpath(
					"//div[contains(@id,'ClaimFinancialsTransactionsScreen-TransactionsLV-" + i + "-CoverageType')]");
			By FinancialsTransactions_CostType = By.xpath(
					"//div[contains(@id,'ClaimFinancialsTransactionsScreen-TransactionsLV-" + i + "-CostType')]");
			By FinancialsTransactions_CostCategory = By.xpath(
					"//div[contains(@id,'ClaimFinancialsTransactionsScreen-TransactionsLV-" + i + "-CostCategory')]");
			By FinancialsTransactions_Status = By
					.xpath("//div[contains(@id,'ClaimFinancialsTransactionsScreen-TransactionsLV-" + i + "-Status')]");

			String strFinancialsTransactions_CreateDate = getText_Element(FinancialsTransactions_CreateDate);
			String strFinancialsTransactions_Amount = getText_Element(FinancialsTransactions_Amount);
			String strFinancialsTransactions_Coverage = getText_Element(FinancialsTransactions_Coverage);
			String strFinancialsTransactions_CostType = getText_Element(FinancialsTransactions_CostType);
			String strFinancialsTransactions_CostCategory = getText_Element(FinancialsTransactions_CostCategory);
			String strFinancialsTransactions_Status = getText_Element(FinancialsTransactions_Status);

			String FT_CreateDate = lhm_TestCase_Table_Data.get("FT_CreateDate");
			String FT_Amount = lhm_TestCase_Table_Data.get("FT_Amount");
			String FT_Coverage = lhm_TestCase_Table_Data.get("Coverage");
			String FT_CostType = lhm_TestCase_Table_Data.get("CostType");
			String FT_CostCategory = lhm_TestCase_Table_Data.get("CostCategoryDropDownValue" + lastrownum);
			String FT_Status = lhm_TestCase_Table_Data.get("FT_Status");

			if ((strFinancialsTransactions_CreateDate.equals(FT_CreateDate))
					&& (strFinancialsTransactions_Amount.equals(FT_Amount))
					&& (strFinancialsTransactions_Coverage.equals(FT_Coverage))
					&& (strFinancialsTransactions_CostType.equals(FT_CostType))
					&& (strFinancialsTransactions_CostCategory.equals(FT_CostCategory))
					&& (strFinancialsTransactions_Status.equals(FT_Status))) {

				oExtentTest.log(Status.PASS, "Verifying Row = [" + (lastrownum + 1) + "] CreateDate =>Actual = ["
						+ strFinancialsTransactions_CreateDate + "] Equals Expected = [" + FT_CreateDate + "]"
						+ "<br />" + "Amount=>Actual = [" + strFinancialsTransactions_Amount + "] Equals Expected = ["
						+ FT_Amount + "]" + "<br />" + "Category=>Actual = [" + strFinancialsTransactions_Coverage
						+ "] Equals Expected = [" + FT_Coverage + "]" + "<br />" + "CostType=>Actual = ["
						+ strFinancialsTransactions_CostType + "] Equals Expected = [" + FT_CostType + "]" + "<br />"
						+ "CostCategory=>Actual = [" + strFinancialsTransactions_CostCategory + "] Equals Expected = ["
						+ FT_CostCategory + "]" + "<br />" + "Status=>Actual = [" + strFinancialsTransactions_Status
						+ "] Equals Expected = [" + FT_Status + "]");

			}
		}
	}

	public static void SetCostType_VerifyCostCategory() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_ClaimsCenter("Payment");
		int i = Integer.parseInt(lhm_TestCase_Table_Data.get("DefaultRow"));

		By EditReserves_CheckBox = By.xpath("//input[contains(@name,'EditableReservesLV-" + i + "-_Checkbox')]");
		By reserve_Exposure = By.xpath("//select[contains(@name,'EditableReservesLV-" + i + "-Exposure')]");
		By reserve_Coverage = By.xpath("//div[contains(@id,'EditableReservesLV-" + i + "-Coverage')]");
		By reserve_CostType = By.xpath("//select[contains(@name,'EditableReservesLV-" + i + "-CostType')]");
		By reserve_CostCategory = By.xpath("//select[contains(@name,'EditableReservesLV-" + i + "-CostCategory')]");
		By Reserve_NewAvailableReserves = By.xpath("//input[contains(@name,'EditableReservesLV-" + i + "-NewAmount')]");
		By Reserve_Comments = By.xpath("//input[contains(@name,'EditableReservesLV-" + i + "-Comments')]");

		GuidewireAutomate("EditReserves_CheckBox", EditReserves_CheckBox, "clickAndwait", "Click");
		GuidewireAutomate("Exposure", reserve_Exposure, "selectByVisibleText", lhm_TestCase_Table_Data.get("Exposure"));
		GuidewireAutomate_Validation("Coverage", reserve_Coverage, "equals", lhm_TestCase_Table_Data.get("Coverage"));
		GuidewireAutomate_Validation("Verify CostType", reserve_CostType, "getOptionscontains",
				lhm_TestCase_Table_Data.get("CostTypeValues"));

		oExtentTest.log(Status.PASS, "The below list is displayed in the same order for Cost Type field " + "["
				+ lhm_TestCase_Table_Data.get("CostTypeValues") + "]");

		GuidewireAutomate("CostType", reserve_CostType, "selectByVisibleText", lhm_TestCase_Table_Data.get("CostType"));

		GuidewireAutomate_Validation("Verify CostCategory", reserve_CostCategory, "getOptionscontains",
				lhm_TestCase_Table_Data.get("CostCategoryValues"));

		GuidewireAutomate("CostCategory", reserve_CostCategory, "selectByVisibleTextAndwait",
				lhm_TestCase_Table_Data.get("CostCategory"));

		GuidewireAutomate("NewAvailableReserves", Reserve_NewAvailableReserves, "clearANDsendKeys",
				lhm_TestCase_Table_Data.get("NewAvailableReserves"));
		GuidewireAutomate("Comment", Reserve_Comments, "clearANDsendKeys", lhm_TestCase_Table_Data.get("Comment"));
		GuidewireAutomate("Save", Reserve_Save, "clickAndwait", "NA");

	}

	public static void Verify_DefaultReserve_EachCostType_CostCategory() throws Throwable {

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_ClaimsCenter("Payment");

		// List<WebElement> ActivityPatterns = getElements(rowCount);
		int rowNum = Integer.parseInt(lhm_TestCase_Table_Data.get("DefaultRow"));

		GuidewireAutomate_Validation("Screen Header", EditReserve_Header, "equals", "Edit Reserves");
		for (int i = 0; i < rowNum; i++) {

			By reserve_Coverage = By.xpath("//div[contains(@id,'EditableReservesLV-" + i + "-Coverage')]");
			By reserve_CostType = By.xpath("//div[contains(@id,'EditableReservesLV-" + i + "-CostType')]");
			By reserve_CostCategory = By.xpath("//div[contains(@id,'EditableReservesLV-" + i + "-CostCategory')]");
			By reserve_CurrentlyAvailable = By
					.xpath("//div[contains(@id,'EditableReservesLV-" + i + "-AvailableReserves')]");
			// Default Reserve Verifying
			oExtentTest.log(Status.INFO,
					"Verifying Row= [" + (i + 1) + "] the defualt Reserve is Created for Coverage ="
							+ lhm_TestCase_Table_Data.get("DR_Coverage" + (i + 1)) + " and CostTye="
							+ lhm_TestCase_Table_Data.get("DR_CostType" + (i + 1)));

			GuidewireAutomate_Validation("Reserve Coverage", reserve_Coverage, "equals",
					lhm_TestCase_Table_Data.get("DR_Coverage" + (i + 1)));
			GuidewireAutomate_Validation("Reserve CostType", reserve_CostType, "equals",
					lhm_TestCase_Table_Data.get("DR_CostType" + (i + 1)));
			GuidewireAutomate_Validation("Reserve CostCategory", reserve_CostCategory, "equals",
					lhm_TestCase_Table_Data.get("DR_CostCategory" + (i + 1)));
			GuidewireAutomate_Validation("Reserve CurrentlyAvailable", reserve_CurrentlyAvailable, "equals",
					lhm_TestCase_Table_Data.get("DR_CurrentlyAvailable" + (i + 1)));

		}
	}

	public static void AddingReserve_EachCostCategory() throws Throwable {
		// ---> Verify whether a default reserve is created
		ClaimCenter_Reserve.Verify_DefaultReserve_EachCostType_CostCategory();

		// Set "Cost Type" as "Unspecified Cost Type" and verify whether the
		// "CostCategory" is displayed with the below list and in the same order.
		ClaimCenter_Reserve.SetCostType_VerifyCostCategory();

		// verifying financial transaction-> Reserve should be created successfully.
		CC_NewTransaction_Check.FinancialsTransactions_VerificationForDefaultReserve();

		CC_NewTransaction_Check.FinancialsTransactions_Verification();
	}

}
