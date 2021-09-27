package com.pages.Guidewire.HomeOwners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class HO_Modifiers extends SeleniumWebDriver_Commands {

	public HO_Modifiers(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	private static By HO_Modifiers_Screen_titlebar = By
			.xpath("//div[contains(@id,'HOPModifiersScreen-ttlBar')]//div[1]//div");
	/***
	 * POLICY
	 */
	private static By HO_Mod_Policy = By.xpath("//div[@role='heading' and text()='Policy']");
	private static By HO_Mod_MultiPolicy = By.xpath(
			"  //div[@class='gw-label' and text()='Multi Policy']/parent::div //input[@type='radio' and @value='false']");
	private static By HO_Mod_Professional = By.xpath(
			"//div[@class='gw-label' and text()='Professional']/parent::div//select[contains(@name,'TypeKeyModifier')]");
	private static By HO_Mod_Loyalty = By.xpath(
			"//div[@class='gw-label' and text()='Loyalty']/parent::div//select[contains(@name,'TypeKeyModifier')]");
	/***
	 * DWELLING
	 */
	private static By HO_Mod_Dwelling = By.xpath("//div[@role='heading' and text()='Dwelling']");
	private static By HO_Mod_MannedSecurity = By.xpath(
			"//div[@class='gw-label' and text()='Manned Security']/parent::div //input[@type='radio' and @value='false']");

	private static By HO_Mod_InternetOfThings = By.xpath(
			" //div[@class='gw-label' and text()='Internet Of Things']/parent::div //input[@type='radio' and @value='false']");

	public static void ModifiersPolicyDetails() throws Throwable {

		try {
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("Modifiers",
					strTestCaseName);

			GuidewireAutomate_Validation("Screen Header", HO_Modifiers_Screen_titlebar, "equals", "Modifiers");
			GuidewireAutomate_Validation("Mod Policy", HO_Mod_Policy, "equals", "Policy");
			GuidewireAutomate("Mod MultiPolicy", HO_Mod_MultiPolicy, "click",lhm_TestCase_Table_Data.get("MOD_MultiPolicy"));
			//GuidewireAutomate("Mod Professional", HO_Mod_Professional, "selectByVisibleText", lhm_TestCase_Table_Data.get("Professional"));
			//GuidewireAutomate("Mod Loyalty", HO_Mod_Loyalty, "selectByVisibleText", lhm_TestCase_Table_Data.get("Loyalty"));

			lhm_TestCase_Table_Data.clear();

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void ModifiersDwellingDetails() throws Throwable {

		try {
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("Modifiers",
					strTestCaseName);

			GuidewireAutomate_Validation("Screen Header", HO_Modifiers_Screen_titlebar, "equals", "Modifiers");

			GuidewireAutomate("Mod Dwelling", HO_Mod_Dwelling,"click",lhm_TestCase_Table_Data.get("MOD_Dwelling"));
			GuidewireAutomate("Mod MannedSecurity", HO_Mod_MannedSecurity,"click",lhm_TestCase_Table_Data.get("MOD_MannedSecurity"));
			GuidewireAutomate("Mod InternetOfThings", HO_Mod_InternetOfThings,"click",lhm_TestCase_Table_Data.get("MOD_InternetOfThings"));

			lhm_TestCase_Table_Data.clear();

		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}
}
