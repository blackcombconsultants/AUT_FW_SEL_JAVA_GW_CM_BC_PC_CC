package com.pages.Guidewire.PolicyCenter.BusinessOwners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.aventstack.extentreports.ExtentTest;

public class BO_Modifiers extends SeleniumWebDriver_Commands {

	public BO_Modifiers(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	private static By Modifiers_Header = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and text()='Modifiers']");


	// Rating Inputs
	private static By RatingInputs = By.xpath("//div[contains(@id,'ModifiersScreen')]//div[@class='gw-TitleBar--title' and text()='Rating Inputs'] ");
	/*
	 * private static By RI_Modifier = By.xpath(
	 * "//div[contains(@id,'ratingInputName_Input')]//div[@class='gw-label gw-boldLabel' and text()='Modifier'] " ); private static By
	 * ConditionalSurcharge = By.xpath(
	 * "//div[contains(@id,'ratingInputName_Input')]//div[@class='gw-value-readonly-wrapper' and text()='Conditional Surcharge'] " ); private static
	 * By Considerationsrelatedtopolicyexpenses = By.
	 * xpath("//div[contains(@id,'Category')]//div[@class='gw-value-readonly-wrapper' and text()='Considerations related to policy expenses']" );
	 * private static By CreditDebit = By.xpath( "//input[contains(@name,'ScheduleRateDV-0-ScheduleRateLV-0-CreditDebit')]");
	 */

	private static By Modifier             = By.xpath("//div[contains(@id,'ScheduleRateDV-1-ratingInputName_Input')]//div[@class='gw-label gw-boldLabel' and text()='Modifier'] ");
	private static By ScheduleModifier     = By.xpath("//div[contains(@id,'ratingInputName_Input')]//div[@class='gw-value-readonly-wrapper' and text()='Schedule Rates'] ");
	private static By RI_Buildingfeatures  = By.xpath("//div[contains(@id,'Category')]//div[@class='gw-value-readonly-wrapper' and text()='Building features']");
	private static By RI_LIP_Minimum       = By.xpath("//div[contains(text(),'Building features')]//ancestor::td//following-sibling::td[contains(@id,'Minimum_Cell')]//div[@class='gw-value-readonly-wrapper']");
	private static By RI_LIP_Maximum       = By.xpath("//div[contains(text(),'Building features')]//ancestor::td//following-sibling::td[contains(@id,'Maximum_Cell')]//div[@class='gw-value-readonly-wrapper']");
	private static By RI_LIP_CreditDebit   = By.xpath("//div[contains(text(),'Building features')]//ancestor::td//following-sibling::td[contains(@id,'CreditDebit_Cell')]//input[contains(@name,'CreditDebit')]");
	private static By RI_LIP_Justification = By.xpath("//div[contains(text(),'Building features')]//ancestor::td//following-sibling::td[contains(@id,'Justification_Cell')]//input[contains(@name,'Justification')]");

	public static void RatingInputs() throws Throwable {
		try {
			lhm_TestCase_Table_Data = BO_Resuables.getData_BusinessOwners("Modifiers");
			GuidewireAutomate_Validation("Screen Header", Modifiers_Header, "equals", "Modifiers");
			GuidewireAutomate_Validation("RatingInputs", RatingInputs, "equals", "Rating Inputs");
			GuidewireAutomate_Validation("Modifier", Modifier, "equals", "Modifier");
			GuidewireAutomate_Validation("ScheduleModifier", ScheduleModifier, "equals", "Schedule Rates");
			GuidewireAutomate_Validation("Building features", RI_Buildingfeatures, "equals", lhm_TestCase_Table_Data.get("RI_Buildingfeatures"));
			GuidewireAutomate_Validation("Minimum", RI_LIP_Minimum, "equals", lhm_TestCase_Table_Data.get("RI_LIP_Minimum"));
			GuidewireAutomate_Validation("Maximum", RI_LIP_Maximum, "equals", lhm_TestCase_Table_Data.get("RI_LIP_Maximum"));
			GuidewireAutomate("CreditDebit", RI_LIP_CreditDebit, "clearANDsendKeys", lhm_TestCase_Table_Data.get("RI_LIP_CreditDebit"));
			GuidewireAutomate("Justification", RI_LIP_Justification, "clearANDsendKeys", lhm_TestCase_Table_Data.get("RI_LIP_Justification"));

		} catch (Exception e) {

		}
	}

}
