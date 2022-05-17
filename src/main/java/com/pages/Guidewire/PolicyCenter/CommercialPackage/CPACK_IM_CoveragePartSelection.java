package com.pages.Guidewire.PolicyCenter.CommercialPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;

public class CPACK_IM_CoveragePartSelection extends SeleniumWebDriver_Commands {

	public CPACK_IM_CoveragePartSelection(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);

	}
	private static By Modifiers_Header = By.xpath("//div[contains(@id,'ttlBar')]//div[@role='heading']");

	// Rating Inputs
	private static By RatingInputs = By.xpath("//div[contains(@id,'ModifiersScreen')]//div[@class='gw-TitleBar--title' and text()='Rating Inputs']");
	private static By Modifier     = By.xpath("//div[contains(@id,'ratingInputName_Input')]//div[@class='gw-label gw-boldLabel' and text()='Modifier']");
	private static By PackageIRPM  = By.xpath("//div[contains(@id,'ratingInputName_Input')]//div[@class='gw-value-readonly-wrapper' and text()='Package IRPM']");

	// Location Inside Premises
	private static By Buildingfeatures = By.xpath("//div[contains(@id,'Category')]//div[@class='gw-value-readonly-wrapper' and text()='Building features']");
	private static By BF_Minimum       = By.xpath("//div[contains(text(),'Building features')]//ancestor::td//following-sibling::td[contains(@id,'Minimum_Cell')]//div[@class='gw-value-readonly-wrapper']");
	private static By BF_Maximum       = By.xpath("//div[contains(text(),'Building features')]//ancestor::td//following-sibling::td[contains(@id,'Maximum_Cell')]//div[@class='gw-value-readonly-wrapper']");
	private static By BF_CreditDebit   = By.xpath("//div[contains(text(),'Building features')]//ancestor::td//following-sibling::td[contains(@id,'CreditDebit_Cell')]//input[contains(@name,'CreditDebit')]");
	private static By BF_Justification = By.xpath("//div[contains(text(),'Building features')]//ancestor::td//following-sibling::td[contains(@id,'Justification_Cell')]//input[contains(@name,'Justification')]");

	public static void addCoveragePart() throws Throwable {
		try {
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcelWorkSheet_Fillo("Modifiers_IM", strTestCaseName);
			GuidewireAutomate_Validation("Screen Header", Modifiers_Header, "equals", "Modifiers");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

}
