package com.pages.Guidewire.GeneralLiability;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;

public class GL_Modifiers extends SeleniumWebDriver_Commands {

	public GL_Modifiers(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
		// TODO Auto-generated constructor stub
	}

	private static By Modifiers_Header = By.xpath(
			"//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and text()='Modifiers']");

	// Rating Inputs
	private static By RatingInputs = By.xpath(
			"//div[contains(@id,'ModifiersScreen')]//div[@class='gw-TitleBar--title' and text()='Rating Inputs'] ");
	private static By Modifier = By.xpath(
			"//div[contains(@id,'ratingInputName_Input')]//div[@class='gw-label gw-boldLabel' and text()='Modifier'] ");
	private static By GLScheduleModifier = By.xpath(
			"//div[contains(@id,'ratingInputName_Input')]//div[@class='gw-value-readonly-wrapper' and text()='GL Schedule Modifier'] ");

	// Location Inside Premises
	private static By RI_LocationInsidePremises = By.xpath(
			"//div[contains(@id,'Category')]//div[@class='gw-value-readonly-wrapper' and text()='Location - Inside Premises']");
	private static By RI_LIP_Minimum = By.xpath(
			"//div[contains(text(),'Location - Inside Premises')]//ancestor::td//following-sibling::td[contains(@id,'Minimum_Cell')]//div[@class='gw-value-readonly-wrapper']");
	private static By RI_LIP_Maximum = By.xpath(
			"//div[contains(text(),'Location - Inside Premises')]//ancestor::td//following-sibling::td[contains(@id,'Maximum_Cell')]//div[@class='gw-value-readonly-wrapper']");
	private static By RI_LIP_CreditDebit = By.xpath(
			"//div[contains(text(),'Location - Inside Premises')]//ancestor::td//following-sibling::td[contains(@id,'CreditDebit_Cell')]//input[contains(@name,'CreditDebit')]");
	private static By RI_LIP_Justification = By.xpath(
			"//div[contains(text(),'Location - Inside Premises')]//ancestor::td//following-sibling::td[contains(@id,'Justification_Cell')]//input[contains(@name,'Justification')]");

	public static void RatingInputs() throws Throwable {
		try {
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("Modifiers",
					strTestCaseName);
			GuidewireAutomate_Validation("Screen Header", Modifiers_Header, "equals", "Modifiers");
			GuidewireAutomate_Validation("RatingInputs", RatingInputs, "equals", "Rating Inputs");
			GuidewireAutomate_Validation("Modifier", Modifier, "equals", "Modifier");
			GuidewireAutomate_Validation("GLScheduleModifier", GLScheduleModifier, "equals", "GL Schedule Modifier");
			GuidewireAutomate_Validation("LocationInsidePremises", RI_LocationInsidePremises, "equals", lhm_TestCase_Table_Data.get("RI_LocationInsidePremises"));
			GuidewireAutomate_Validation("Minimum", RI_LIP_Minimum, "equals", lhm_TestCase_Table_Data.get("RI_LIP_Minimum"));
			GuidewireAutomate_Validation("Maximum", RI_LIP_Maximum, "equals", lhm_TestCase_Table_Data.get("RI_LIP_Maximum"));
			GuidewireAutomate("CreditDebit", RI_LIP_CreditDebit, "clearANDsendKeys", lhm_TestCase_Table_Data.get("RI_LIP_CreditDebit"));
			GuidewireAutomate("Justification", RI_LIP_Justification, "clearANDsendKeys", lhm_TestCase_Table_Data.get("RI_LIP_Justification"));

		} catch (Exception e) {

		}
	}

}
