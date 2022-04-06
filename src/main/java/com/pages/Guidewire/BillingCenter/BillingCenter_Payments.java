package com.pages.Guidewire.BillingCenter;

import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;
import java.awt.event.KeyEvent;



import org.openqa.selenium.Keys;

public class BillingCenter_Payments extends SeleniumWebDriver_Commands {

	public BillingCenter_Payments(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
		// TODO Auto-generated constructor stub
	}

	private static By ADirectBillPayment_Header = By.xpath("//div[contains(@id,'ttlBar')]//div[@role='heading']");
	private static By Amount = By.xpath("//input[contains(@name,'PaymentDetailsDV-Amount')]");
	private static By PaymentInstrument = By.xpath("//select[contains(@name,'-PaymentInstrument')]");
	private static By ExecuteWithoutDistribution_button = By
			.xpath("//div[contains(@id,'ExecuteWithoutDistribution')]//div[@role='button']");

	private static By Payment_Header = By.xpath("//div[contains(@id,'ttlBar')]//div[@role='heading']");


	private static By Amount1 = By.xpath("//input[contains(@name,'NewSuspensePaymentDV-amount')]");

	private static By NewSuspensePayment_Header = By.xpath("//div[@id='NewSuspensePayment-NewSuspensePaymentScreen-0']//div[@class='gw-TitleBar--title']");
	private static By PaymentDate = By.xpath("//input[contains(@name,'-paymentDate')]");
	private static By NewPayment = By.xpath("//div[contains(@id,'-NewPayment')]//div[@role='button']");


	public static void DirectBillPayments() throws Throwable {
		try {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("payment",
				strTestCaseName);
		GuidewireAutomate_Validation("Direct Bill Payment", ADirectBillPayment_Header, "equals", "Direct Bill Payment");

		GuidewireAutomate("Amount", Amount, "sendKeys", lhm_TestCase_Table_Data.get("Amount"));
		GuidewireAutomate("PaymentInstrument", PaymentInstrument, "moveToElement", "moveToElement");

		GuidewireAutomate("PaymentInstrument", PaymentInstrument, "selectByVisibleText", lhm_TestCase_Table_Data.get("PaymentInstrument"));
		GuidewireAutomate("Execute Without Distribution", ExecuteWithoutDistribution_button, "clickAndwait", "click");
	

	}catch (Exception e) {
		e.printStackTrace();
		throw e;
	
		
	}
	}
	public static void Payments() throws Throwable {
		try {
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("payment",
					strTestCaseName);
	GuidewireAutomate_Validation("Payments", Payment_Header, "equals", "Payments");
	}catch (Exception e) {
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
	public static void SuspensePaymentProcess() throws Throwable {
		try {
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("payment",
					strTestCaseName);

			getStaleElement("New Payment",NewPayment);
			GuidewireAutomate("New Payment", NewPayment, "click", "click");
			GuidewireAutomate_Validation("New Suspense Payment", NewSuspensePayment_Header, "equals", "New Suspense Payment");
			getStaleElement("Payment Date",PaymentDate);
			GuidewireAutomate("Payment Date", PaymentDate,"sendKeys", lhm_TestCase_Table_Data.get("PaymentDate"));
			GuidewireAutomate("Amount1", Amount1, "sendKeys", lhm_TestCase_Table_Data.get("Amount"));
			//GuidewireAutomate("PaymentInstrument", PaymentInstrument, "moveToElement", "moveToElement");
			GuidewireAutomate("PaymentInstrument", PaymentInstrument, "selectByVisibleText", lhm_TestCase_Table_Data.get("PaymentInstrument"));
			//GuidewireAutomate_Validation(oWebDriverWait.until(ExpectedConditions.visibilityOf(getElement(PaymentDate)));
		}catch (Exception e) {
			e.printStackTrace();
			throw e;


		}
	}


}
