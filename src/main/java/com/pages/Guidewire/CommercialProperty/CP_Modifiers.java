package com.pages.Guidewire.CommercialProperty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;

public class CP_Modifiers extends SeleniumWebDriver_Commands {

	public CP_Modifiers(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
		
	}

	private static By Modifiers_Header = By.xpath("//div[contains(@id,'ttlBar')]//div[@role='heading']");

	// Rating Inputs
	private static By RatingInputs = By.xpath(
			"//div[contains(@id,'ModifiersScreen')]//div[@class='gw-TitleBar--title' and text()='Rating Inputs']");
	private static By Modifier = By.xpath(
			"//div[contains(@id,'ratingInputName_Input')]//div[@class='gw-label gw-boldLabel' and text()='Modifier']");
	private static By ScheduleRates = By.xpath(
			"//div[contains(@id,'ratingInputName_Input')]//div[@class='gw-value-readonly-wrapper' and text()='Schedule Rates']");

	// Location Inside Premises
	private static By Buildingfeatures = By.xpath("//div[contains(@id,'Category')]//div[@class='gw-value-readonly-wrapper' and text()='Building features']");
	private static By BF_Minimum = By.xpath("//div[contains(text(),'Building features')]//ancestor::td//following-sibling::td[contains(@id,'Minimum_Cell')]//div[@class='gw-value-readonly-wrapper']");
	private static By BF_Maximum = By.xpath("//div[contains(text(),'Building features')]//ancestor::td//following-sibling::td[contains(@id,'Maximum_Cell')]//div[@class='gw-value-readonly-wrapper']");
	private static By BF_CreditDebit = By.xpath("//div[contains(text(),'Building features')]//ancestor::td//following-sibling::td[contains(@id,'CreditDebit_Cell')]//input[contains(@name,'CreditDebit')]");
	private static By BF_Justification = By.xpath("//div[contains(text(),'Building features')]//ancestor::td//following-sibling::td[contains(@id,'Justification_Cell')]//input[contains(@name,'Justification')]");

	public static void RatingInputs() throws Throwable {
		try {
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("Modifiers",
					strTestCaseName);
			GuidewireAutomate_Validation("Screen Header", Modifiers_Header, "equals", "Modifiers");
			GuidewireAutomate_Validation("RatingInputs", RatingInputs, "equals", "Rating Inputs");
			GuidewireAutomate_Validation("Modifier", Modifier, "equals", "Modifier");
			GuidewireAutomate_Validation("Schedule Rates", ScheduleRates, "equals", "Schedule Rates");
			
			GuidewireAutomate_Validation("Building features", Buildingfeatures, "equals", "Building features");
			GuidewireAutomate_Validation("Minimum", BF_Minimum, "equals", lhm_TestCase_Table_Data.get("BF_Minimum"));
			GuidewireAutomate_Validation("Maximum", BF_Maximum, "equals", lhm_TestCase_Table_Data.get("BF_Maximum"));
			GuidewireAutomate("CreditDebit", BF_CreditDebit, "clearANDsendKeys", lhm_TestCase_Table_Data.get("BF_CreditDebit"));
			GuidewireAutomate("Justification", BF_Justification, "clearANDsendKeys", lhm_TestCase_Table_Data.get("BF_Justification"));

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

}
