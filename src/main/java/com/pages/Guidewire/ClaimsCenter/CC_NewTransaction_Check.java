package com.pages.Guidewire.ClaimsCenter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;

public class CC_NewTransaction_Check extends SeleniumWebDriver_Commands implements CC_NewTransaction_Check_PO {

	// private static final By FT_CostCategory = null;
	public CC_NewTransaction_Check(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
		// TODO Auto-generated constructor stub
	}

	public static void Enterpayeeinformation() throws Throwable {
		String insuredName = driver
				.findElement(By.xpath("//div[contains(@id,'Insured')]//div[@class='gw-label gw-infoValue']")).getText();
		try {
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("NewTransaction_Check",
					strTestCaseName);
			GuidewireAutomate_Validation("Screen Header", Enterpayeeinformation_Header, "equals",
					"Step 1 of 3: Enter payee information");
			GuidewireAutomate_Validation("Primary Payee", PrimaryPayee, "equals", "Primary Payee");

			GuidewireAutomate("Name", CD_PrimaryPayee_Namee, "selectByVisibleText", insuredName);
			GuidewireAutomate("Next Button", Next_Button, "clickAndwait", "click");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;

		}

	}

	public static void Enterpaymentinformation() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("NewTransaction_Check",
				strTestCaseName);

		try {
			GuidewireAutomate_Validation("Screen Header", Enterpaymentinformation_Header, "equals",
					"Step 2 of 3: Enter payment information");
			GuidewireAutomate("Reserve Line", PD_ReserveLine, "selectByVisibleText",
					lhm_TestCase_Table_Data.get("ReserveLine"));
			GuidewireAutomate_Validation("Coverage", PD_Coverage, "equals", lhm_TestCase_Table_Data.get("Coverage"));

			// Category field below Line Items should be defaulted to <none>.
			GuidewireAutomate_Validation("LineItem Category", PD_LineItem_Category, "FirstSelectedOptionEquals",
					"<none>");

			// Verify whether the below list is displayed in the Category field.
			GuidewireAutomate_Validation("LineItem Category", PD_LineItem_Category, "getOptionscontains",
					lhm_TestCase_Table_Data.get("LineItems_Category"));

			Thread.sleep(2000);
			GuidewireAutomate("Payment Type", PD_PaymentType, "selectByVisibleText",
					lhm_TestCase_Table_Data.get("PaymentType"));
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
			ClaimCenter_Resuables.clickButton("Next");
			ClaimCenter_Resuables.clickButton("Next");
			CC_NewTransaction_Check.Setcheckinstructions();
			ClaimCenter_Resuables.clickButton("Finish");
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
			ClaimCenter_Resuables.clickButton("Next");
			ClaimCenter_Resuables.clickButton("Next");
			CC_NewTransaction_Check.Setcheckinstructions();
			ClaimCenter_Resuables.clickButton("Finish");
			// oExtentTest.log(Status.PASS, "Check is succcesful");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;

		}
	}

	public static void ValidationResults_ClaimCost() throws Throwable {
		try {
			GuidewireAutomate_Validation("Validation Header", Validation_Header, "equals", "Validation Results");
			GuidewireAutomate_Validation("Validation Error", Error_Msg, "contains",
					"There is $500.00 unapplied deductible for");
			GuidewireAutomate("Clear", Clear_Button, "clickAndwait", "click");
			// oExtentTest.log(Status.PASS, "");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;

		}
	}

	public static void AddItems_Mileagereimbursement() throws Throwable {
		try {
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_ClaimsCenter("NewTransaction_Check");

			GuidewireAutomate("LineItem Category", PD_LineItem_Category, "selectByVisibleText",
					lhm_TestCase_Table_Data.get("LineItemCategory_1"));
			GuidewireAutomate("LineItem Category", PD_LineItem_Amount, "clearANDsendKeys",
					lhm_TestCase_Table_Data.get("LineItem_Amount_1"));
		} catch (Exception e) {
			e.printStackTrace();
			throw e;

		}

	}

	public static void AddItem_Others() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_ClaimsCenter("NewTransaction_Check");
		try {
			GuidewireAutomate("LineItem Category", PD_LineItem_Category, "selectByVisibleText",
					lhm_TestCase_Table_Data.get("LineItemCategory_2"));
			GuidewireAutomate("LineItem Category", PD_LineItem_Amount, "clearANDsendKeys",
					lhm_TestCase_Table_Data.get("LineItem_Amount_2"));
		} catch (Exception e) {
			e.printStackTrace();
			throw e;

		}

	}

	public static void Setcheckinstructions() throws Throwable {

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("NewTransaction_Check",
				strTestCaseName);
		try {
			GuidewireAutomate_Validation("Screen Header", Setcheckinstructions_Header, "equals",
					"Step 3 of 3: Set check instructions");

			GuidewireAutomate_Validation("PayToTheOrderOf", SCI_PayToTheOrderOf, "equals",
					lhm_TestCase_Table_Data.get("PayToTheOrderOf"));
			GuidewireAutomate_Validation("Mailing Address", SCI_MailingAddress, "equals",
					lhm_TestCase_Table_Data.get("MailingAddress"));
		} catch (Exception e) {
			e.printStackTrace();
			throw e;

		}

	}

	public static void Check_ValidationResults_RentalReimbursement() throws Throwable {

		try {
			GuidewireAutomate_Validation("ValidationResults Header", ValidationResults_Header, "equals",
					"Validation Results");
			GuidewireAutomate_Validation("Warnings Title", ValidationResults_Warnings_Header, "equals", "Warnings:");
			GuidewireAutomate_Validation("Warnings First", ValidationResults_Warning_First, "contains",
					"This check would cause gross incurred on exposure");
			GuidewireAutomate_Validation("Warnings Second", ValidationResults_Warning_Second, "contains",
					"This check would cause gross incurred on coverage");

			GuidewireAutomate("Clear", Clear_Button, "clickAndwait", "click");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;

		}
	}

	public static void Check_ValidationResults_ElectronicEquipment() throws Throwable {

		try {
			GuidewireAutomate_Validation("ValidationResults Header", ValidationResults_Header, "equals",
					"Validation Results");
			GuidewireAutomate_Validation("Warnings Title", ValidationResults_Warnings_Header, "equals", "Warnings:");
			GuidewireAutomate_Validation("Warnings First", ValidationResults_Warning_Second, "contains",
					"This check would cause gross incurred on coverage");
			GuidewireAutomate("Clear", Clear_Button, "clickAndwait", "click");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;

		}
	}
}
