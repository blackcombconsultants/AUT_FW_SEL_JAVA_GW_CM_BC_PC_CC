package com.pages.Guidewire.BillingCenter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;

public class BC_TroubleTickets extends SeleniumWebDriver_Commands {

	public BC_TroubleTickets(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	private static By MyTroubleTickets_Header = By.xpath("//div[@id='DesktopTroubleTickets-DesktopTroubleTicketsScreen-0']");
	private static By New                     = By.xpath("//div[contains(@id,'-NewTroubleTicket')]");
	private static By TroubleTicketWizard     = By.xpath("//div[contains(@id,'-ttlBar')]//div[@class='gw-TitleBar--title']");
	private static By Type                    = By.xpath("//select[contains(@name,'-TicketType')]");
	private static By Subject                 = By.xpath("//input[contains(@name,'-Subject')]");
	private static By Details                 = By.xpath("//textarea[contains(@name,'-DetailedDescription')]");
	private static By Priority                = By.xpath("//select[contains(@name,'-Priority')]");

	private static By AddPolicies     = By.xpath("//div[contains(@id,'TroubleTicketRelatedEntitiesDV_AddPoliciesButton')]//div[@role='button']");
	private static By AccNumberSearch = By.xpath("//input[contains(@name,'AccountNumberCriterion')]");
	private static By Search          = By.xpath("//div[contains(@id,'SearchLinksInputSet-Search')]");
	private static By SelectCheckbox  = By.xpath("//input[contains(@name,'-0-_Checkbox')]");
	private static By SelectPolicies  = By.xpath("//div[contains(@id,'addbutton')]//div[@role='button']");

	private static By HoldTypeCheckbox = By.xpath("//input[contains(@name,'-1-HoldType')]");
	private static By ReleaseDate      = By.xpath("//div[contains(@id,'-1-ReleaseDate')]//input[@type='text']");

	public static void MyTroubleTickets() throws Throwable {
		try {
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcelWorkSheet_Fillo("TroubleTickets", strTestCaseName);
			GuidewireAutomate_Validation("My Trouble Tickets", MyTroubleTickets_Header, "equals", "My Trouble Tickets");

			GuidewireAutomate("New", New, "click", "click");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;

		}
	}

	public static void TroubleTicketWizard1() throws Throwable {
		try {
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcelWorkSheet_Fillo("TroubleTickets", strTestCaseName);
			GuidewireAutomate_Validation("TroubleTicketWizard", TroubleTicketWizard, "equals", "Trouble Ticket Wizard - Step 1 of 5");

			GuidewireAutomate("Type", Type, "selectByVisibleText", lhm_TestCase_Table_Data.get("Type"));
			GuidewireAutomate("Subject", Subject, "sendKeys", "Due Floods");
			GuidewireAutomate("Details", Details, "sendKeys", "Floods");
			GuidewireAutomate("Priority", Priority, "selectByVisibleText", lhm_TestCase_Table_Data.get("Priority"));
		} catch (Exception e) {
			e.printStackTrace();
			throw e;

		}
	}

	public static void TroubleTicketWizard2() throws Throwable {
		try {
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcelWorkSheet_Fillo("TroubleTickets", strTestCaseName);

			GuidewireAutomate_Validation("TroubleTicketWizard", TroubleTicketWizard, "equals", "Trouble Ticket Wizard - Step 2 of 5");
			GuidewireAutomate("AddPolicies", AddPolicies, "click", "click");
			GuidewireAutomate("AccNumberSearch", AccNumberSearch, "sendKeys", lhm_TestCase_Table_Data.get("AccountNumber"));
			GuidewireAutomate("Search", Search, "click", "click");
			GuidewireAutomate("SelectCheckbox", SelectCheckbox, "click", "click");
			GuidewireAutomate("SelectPolicies", SelectPolicies, "click", "click");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;

		}
	}

	public static void TroubleTicketWizard3() throws Throwable {
		try {
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcelWorkSheet_Fillo("TroubleTickets", strTestCaseName);

			GuidewireAutomate_Validation("TroubleTicketWizard", TroubleTicketWizard, "equals", "Trouble Ticket Wizard - Step 3 of 5");
			GuidewireAutomate("HoldTypeCheckbox", HoldTypeCheckbox, "click", "click");
			getStaleElement("ReleaseDate", ReleaseDate);
			GuidewireAutomate("Release Date", ReleaseDate, "sendKeys", lhm_TestCase_Table_Data.get("ReleaseDate"));

		} catch (Exception e) {
			e.printStackTrace();
			throw e;

		}
	}

}
