package com.pages.Guidewire.ClaimsCenter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;

public class CC_Financials_Summary extends SeleniumWebDriver_Commands {

	public CC_Financials_Summary(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
		// TODO Auto-generated constructor stub
	}

	private static By FinancialsSummary_Header = By.xpath(
			"//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and text()='Financials: Summary']");

	private static By FS_View = By.xpath("//select[contains(@name,'FinancialsSummaryRangeInput')]");

	private static By ClaimCost_UnspecifiedCostCategory = By.xpath("//div[contains(@id,'FinancialsSummaryLabel')]//div[text()='Unspecified Cost Category USD']/ancestor::td/following-sibling::td[contains(@id,'ts_Cell')]//div[contains(@id,'tsMenuIcon')]//div[@class='gw-action--expand-button']");
	private static By ClaimCost_UnspecifiedCostCategory_EditReserve = By.xpath("//div[contains(@id,'FinancialsSummaryLabel')]//div[text()='Unspecified Cost Category USD']/ancestor::td/following-sibling::td[contains(@id,'ts_Cell')]//div[contains(@id,'EditReserve')]//div[@role='menuitem']");
	private static By ClaimCost_UnspecifiedCostCategory_QuickCheck = By.xpath("//div[contains(@id,'FinancialsSummaryLabel')]//div[text()='Unspecified Cost Category USD']/ancestor::td/following-sibling::td[contains(@id,'ts_Cell')]//div[contains(@id,'QuickCheck')]//div[@role='menuitem']");
	private static By ClaimCost_UnspecifiedCostCategory_CreateCheck = By.xpath("//div[contains(@id,'FinancialsSummaryLabel')]//div[text()='Unspecified Cost Category USD']/ancestor::td/following-sibling::td[contains(@id,'ts_Cell')]//div[contains(@id,'CreateCheck')]//div[@role='menuitem']");
	
	//Auto Body USD
	private static By ClaimCost_AutoBodyUSDButton = By.xpath("//div[contains(@id,'FinancialsSummaryLabel')]//div[text()='Auto body USD']/ancestor::td/following-sibling::td[contains(@id,'ts_Cell')]//div[contains(@id,'tsMenuIcon')]//div[@class='gw-icon gw-icon--expand']");
	private static By ClaimCost_AutoBodyUSD_EditReserve = By.xpath("//div[contains(@id,'FinancialsSummaryLabel')]//div[text()='Auto body USD']/ancestor::td/following-sibling::td[contains(@id,'ts_Cell')]//div[contains(@id,'EditReserve')]//div[@role='menuitem']//div[@class='gw-label']");
	private static By ClaimCost_AutoBodyUSD_QuickCheck = By.xpath("//div[contains(@id,'FinancialsSummaryLabel')]//div[text()='Auto body USD']/ancestor::td/following-sibling::td[contains(@id,'ts_Cell')]//div[contains(@id,'QuickCheck')]//div[@role='menuitem']//div[@class='gw-label']");
	private static By ClaimCost_AutoBodyUSD_CreateCheck = By.xpath("//div[contains(@id,'FinancialsSummaryLabel')]//div[text()='Auto body USD']/ancestor::td/following-sibling::td[contains(@id,'ts_Cell')]//div[contains(@id,'CreateCheck')]//div[@role='menuitem']//div[@class='gw-label']");
	
	
	
	public static void FinancialsSummary(String menu) throws Throwable {
		try {
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("FinancialsSummary",
					strTestCaseName);
			GuidewireAutomate_Validation("Screen Header", FinancialsSummary_Header, "equals", "Financials: Summary");
			GuidewireAutomate_Validation("View", FS_View, "FirstSelectedOptionEquals", lhm_TestCase_Table_Data.get("FS_View"));
			GuidewireAutomate("ClaimCost_UnspecifiedCostCategory", ClaimCost_UnspecifiedCostCategory, "clickAndwait", "click");
			switch (menu) {
			case "Edit Reserve":
				GuidewireAutomate("Edit Reserve", ClaimCost_UnspecifiedCostCategory_EditReserve, "clickAndwait",
						"click");

				break;
			case "Quick Check":
				GuidewireAutomate("Quick Check", ClaimCost_UnspecifiedCostCategory_QuickCheck, "clickAndwait", "click");

				break;
			case "Create Check":
				GuidewireAutomate("Create Check", ClaimCost_UnspecifiedCostCategory_CreateCheck, "clickAndwait",
						"click");

				break;
			}
		} catch (Exception e) {

		}
	}
	
	
	public static void FinancialsSummaryAutoBodyUSD(String menu) throws Throwable {
		try {
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("FinancialsSummary",
					strTestCaseName);
			GuidewireAutomate_Validation("Screen Header", FinancialsSummary_Header, "equals", "Financials: Summary");
			GuidewireAutomate_Validation("View", FS_View, "FirstSelectedOptionEquals", lhm_TestCase_Table_Data.get("FS_View"));
			GuidewireAutomate("Claim Cost Auto Body USD Button", ClaimCost_AutoBodyUSDButton, "clickAndwait", "click");
			switch (menu) {
			case "Edit Reserve":
				GuidewireAutomate("Edit Reserve", ClaimCost_AutoBodyUSD_EditReserve, "clickAndwait","click");

				break;
			case "Quick Check":
				GuidewireAutomate("Quick Check", ClaimCost_AutoBodyUSD_QuickCheck, "clickAndwait", "click");

				break;
			case "Create Check":
				GuidewireAutomate("Create Check", ClaimCost_AutoBodyUSD_CreateCheck, "clickAndwait",
						"click");

				break;
			}
		} catch (Exception e) {

		}
	}
	
}
