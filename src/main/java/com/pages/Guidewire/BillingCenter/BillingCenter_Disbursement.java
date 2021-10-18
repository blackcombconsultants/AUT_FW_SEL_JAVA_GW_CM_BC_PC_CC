package com.pages.Guidewire.BillingCenter;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;

public class BillingCenter_Disbursement extends SeleniumWebDriver_Commands {

	public BillingCenter_Disbursement(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);

	}
	
private static By Screen_Header = By.xpath("//div[@class='gw-TitleBar--title' and @role='heading']");
	
	//Customer Details
	private static By Account = By.xpath("//div[contains(@id,'account')]//div[@class='gw-value-readonly-wrapper']");
	private static By AccountName = By.xpath("//div[contains(@id,'insured')]//div[@class='gw-value-readonly-wrapper']");
	private static By UnappliedFund = By.xpath("//select[contains(@name,'UnappliedFunds')]");
	
	//Disbursement Info
	private static By Amount = By.xpath("//input[contains(@name,'CreateDisbursementDetailDV-amount')]");
	private static By PaymentDate = By.xpath("//input[contains(@name,'CreateDisbursementDetailDV-effectiveDate')]");
	private static By Reason = By.xpath("//select[contains(@name,'CreateDisbursementDetailDV-reason')]");
	
	//Payee Info
	private static By PayTo = By.xpath("//input[contains(@name,'CreateDisbursementDetailDV-payTo')]");
	private static By MailTo = By.xpath("//input[contains(@name,'CreateDisbursementDetailDV-mailTo')]");
	private static By MailAddress = By.xpath("//textarea[contains(@name,'CreateDisbursementDetailDV-mailToAddress')]"); 
	private static By Memo = By.xpath("//input[contains(@name,'CreateDisbursementDetailDV-memo')]");
	private static By InternalComment = By.xpath("//input[contains(@name,'CreateDisbursementDetailDV-internalComment')]");
	
	private static By FinishButton = By.xpath("//div[@id='AccountCreateDisbursementWizard-Finish']//div[@role='button']");
	private static By DisbursementRun = By.xpath("//div[text()='Disbursement']/ancestor::td/following-sibling::td[contains(@id,'RunBatchWithoutNotifyContent')]//div[contains(@id,'RunBatchWithoutNotify')]");
	private static By AutomaticDisbursementRun = By.xpath("//div[text()='Automatic Disbursement']/ancestor::td/following-sibling::td[contains(@id,'RunBatchWithoutNotifyContent')]//div[contains(@id,'RunBatchWithoutNotify')]");
	
	
	//Disbursements Menu
	private static By DisbursementStatus = By.xpath("//div[contains(@id,'DisbursementDetailsInputSet-status')]//div[@class='gw-RangeValue']");
	private static By DisbursementEditButton = By.xpath("//div[contains(@id,'DisbursementDetailDV_tb-Edit')]//div[@role='button']");
	private static By DisbursementUpdateButton = By.xpath("//div[contains(@id,'DisbursementDetailDV_tb-Update')]//div[@role='button']");
	private static By DisbursementDate = By.xpath("//input[contains(@name,'DisbursementDetailDV-dueDate')]");
	
	
	
	//Action
	private static By Action = By.xpath("//div[@id='gw-west-panel--top-section']/div[contains(@id,'MenuActions')]//div[@role='button']");
	private static By Action_ReturnBillingCenter = By.xpath("//div[contains(@id,'ReturnToApp')]//div[text()='Return to BillingCenter']");
	
	
	
	//Verify Disbursement
	private static By Verify_Account = By.xpath("//div[contains(@id,'AccountNumber')]//div[@class='gw-value-readonly-wrapper']");
	private static By Verify_AccountName = By.xpath("//div[contains(@id,'Account')]//div[@class='gw-value-readonly-wrapper']");
	private static By Verify_UnappliedFund = By.xpath("//div[contains(@id,'UnappliedFund')]//div[@class='gw-value-readonly-wrapper']");
	private static By Verify_Amount = By.xpath("//div[contains(@id,'DisbursementAmount')]//div[@class='gw-value-readonly-wrapper']");
	private static By Verify_PaymentDate = By.xpath("//div[contains(@id,'DueDate')]//div[@class='gw-value-readonly-wrapper']");
	
	

	public static void NewTransaction_Disbursement() throws Throwable {

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("Disbursement",
				strTestCaseName);

		try {

			GuidewireAutomate_Validation("Screen Header", Screen_Header, "equals",
					"Account Disbursement Wizard - Step 1 of 2");
			GuidewireAutomate_Validation("Account", Account, "equals", lhm_TestCase_Table_Data.get("Account"));
			GuidewireAutomate_Validation("Account Name", AccountName, "equals",
					lhm_TestCase_Table_Data.get("AccountName"));

			GuidewireAutomate("Unapplied Fund", UnappliedFund, "selectByVisibleText",
					lhm_TestCase_Table_Data.get("UnappliedFund"));
			GuidewireAutomate("Amount", Amount, "clearANDsendKeys", lhm_TestCase_Table_Data.get("Amount"));
			GuidewireAutomate("Payment Date", PaymentDate, "clearANDsendKeys",
					lhm_TestCase_Table_Data.get("PaymentDate"));
			GuidewireAutomate("Reason", Reason, "selectByVisibleText", lhm_TestCase_Table_Data.get("Reason"));

		} catch (Exception e) {
			e.printStackTrace();
			throw e;

		}

	}

	public static void Verify_Disbursement() throws Throwable {

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("Disbursement",
				strTestCaseName);
	
		try {

			GuidewireAutomate_Validation("Screen Header", Screen_Header, "equals",
					"Account Disbursement Wizard - Step 2 of 2");
			GuidewireAutomate_Validation("Account Name", Verify_AccountName, "equals",
					lhm_TestCase_Table_Data.get("AccountName"));
			GuidewireAutomate_Validation("Account", Verify_Account, "equals", lhm_TestCase_Table_Data.get("Account"));

			GuidewireAutomate_Validation("Unapplied Fund", Verify_UnappliedFund, "equals",
					lhm_TestCase_Table_Data.get("UnappliedFund"));
			GuidewireAutomate_Validation("Amount", Verify_Amount, "contains", lhm_TestCase_Table_Data.get("Amount"));
			GuidewireAutomate_Validation("Payment Date", Verify_PaymentDate, "equals",
					lhm_TestCase_Table_Data.get("PaymentDate"));

			GuidewireAutomate("Finsih Button", FinishButton, "clickAndwait", "clickAndwait");
			Thread.sleep(2000);

			

		} catch (Exception e) {
			e.printStackTrace();
			throw e;

		}

	}
	public static void Disbursement_Status(String Status) throws Throwable {

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("Disbursement",
				strTestCaseName);
	
		try {
			switch (Status) {
			
			case "Approved" :
				GuidewireAutomate_Validation("Screen Header", Screen_Header, "equals", "Disbursements");
				GuidewireAutomate_Validation("Status", DisbursementStatus, "equals", lhm_TestCase_Table_Data.get("DisbursementStatus1"));
				break;
			case "Sent" :
				GuidewireAutomate_Validation("Screen Header", Screen_Header, "equals", "Disbursements");
				GuidewireAutomate_Validation("Status", DisbursementStatus, "equals", lhm_TestCase_Table_Data.get("DisbursementStatus2"));
				break;
			}
		}
			
	catch (Exception e) {
			e.printStackTrace();
			throw e;

		}

	}
	public static void Disbursement_DateModify() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("Disbursement",
				strTestCaseName);
		
		try {

			GuidewireAutomate("Disbursement Edit", DisbursementEditButton, "clickAndwait", "clickAndwait");
			Thread.sleep(2000);
			GuidewireAutomate("Disbursement Due Date", DisbursementDate, "clearANDsendKeys", lhm_TestCase_Table_Data.get("PaymentDate"));
			GuidewireAutomate("Disbursement Update", DisbursementUpdateButton, "clickAndwait", "clickAndwait");
			GuidewireAutomate("Disbursement Update", DisbursementUpdateButton, "clickAndwait", "clickAndwait");
			Thread.sleep(4000);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;

		}

	}
	
	
	public static void RunBatch_Disbursement() throws Throwable {

		try {

			GuidewireAutomate_Validation("Screen Header", Screen_Header, "equals", "Batch Process Info");
			GuidewireAutomate("Disbursement Run", DisbursementRun, "clickAndwait", "clickAndwait");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;

		}

	}
	public static void RunBatch_AutomaticDisbursement() throws Throwable {

		try {

			GuidewireAutomate_Validation("Screen Header", Screen_Header, "equals", "Batch Process Info");
			GuidewireAutomate("Disbursement Run", AutomaticDisbursementRun, "clickAndwait", "clickAndwait");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;

		}

	}
	public static void ReturnToBillingCenter() throws Throwable {

		try {

			GuidewireAutomate("Action Run", Action, "clickAndwait", "clickAndwait");
			GuidewireAutomate("Return To Billing Center", Action_ReturnBillingCenter, "clickAndwait", "clickAndwait");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;

		}

	}
	public static void RobotKey() throws Throwable {

		try {
			Robot oRobot = new Robot();
			
			oRobot.keyPress(KeyEvent.VK_ALT);
			oRobot.keyPress(KeyEvent.VK_SHIFT);
			oRobot.keyPress(KeyEvent.VK_T);

			// Release key Ctrl+Shift+i
			oRobot.keyRelease(KeyEvent.VK_T);
			oRobot.keyRelease(KeyEvent.VK_SHIFT);
			oRobot.keyRelease(KeyEvent.VK_ALT);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;

		}

	}
}
