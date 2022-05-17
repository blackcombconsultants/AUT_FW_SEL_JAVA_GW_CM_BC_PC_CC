package com.pages.Guidewire.PolicyCenter.InlineMarine;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;

public class IM_CoveragePartSelection extends SeleniumWebDriver_Commands {

	public IM_CoveragePartSelection(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
		// TODO Auto-generated constructor stub
	}


	private static By CoveragePartSelection_Header = By.xpath(
			"//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and text()='Coverage Part Selection']");

	// Add Coverage Part
	private static By AddCoveragePart = By.xpath("//div[contains(@id,'addCoveragePartButton')]/div[@role='button']");

	private static By ACP_AccountsReceivable = By
			.xpath("//div[contains(@id,'eachpart')]//div[@class='gw-label' and text()='Accounts Receivable']");
	private static By ACP_ContractorsEquipment = By
			.xpath("//div[contains(@id,'eachpart')]//div[@class='gw-label' and text()='Contractors Equipment']");

	public static void AddCoveragePart() throws Throwable {
		try {

			GuidewireAutomate_Validation("Screen Header", CoveragePartSelection_Header, "equals",
					"Coverage Part Selection");

			GuidewireAutomate("AddCoveragePart", AddCoveragePart, "clickAndwait", "click");
			GuidewireAutomate("AccountsReceivable", ACP_AccountsReceivable, "clickAndwait", "click");
			Thread.sleep(2000);
			GuidewireAutomate("AddCoveragePart", AddCoveragePart, "clickAndwait", "click");
			GuidewireAutomate("ContractorsEquipment", ACP_ContractorsEquipment, "clickAndwait", "click");

		} catch (Exception e) {

		}
	}

}
