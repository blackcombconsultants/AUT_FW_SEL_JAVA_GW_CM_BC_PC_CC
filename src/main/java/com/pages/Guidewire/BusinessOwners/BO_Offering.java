package com.pages.Guidewire.BusinessOwners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;

public class BO_Offering extends SeleniumWebDriver_Commands {

	public BO_Offering(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	private static By LobBusiness_owners = By.xpath(
			"//div[text()='Businessowners']/ancestor::td[contains(@id,'Name_Cell')]/preceding-sibling::td//div[contains(@id,'ProductSelection') and text()='Select']");
	private static By Offerings_Header = By.xpath(
			"//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and text()='Offerings']");
	private static By Of_OfferingSelection = By.xpath("//select[contains(@name,'OfferingScreen-OfferingSelection')]");
	private static By BOP_Offering_Questions_Header = By.xpath(
			"//div[contains(@class,'gw-LabelWidget')]/div[contains(@class,'gw-label gw-boldLabel') and text()='BOP Offering Questions']");

	private static By Of_BritishColumbia = By
			.xpath("//input[contains(@id,'QuestionSetLV-0-QuestionModalInput-BooleanRadioInput_1')]");
	private static By Of_PartnersAlliance = By
			.xpath("//input[contains(@id,'QuestionSetLV-1-QuestionModalInput-BooleanRadioInput_1')]");

	public static void newSubmission_SelectLOB_Businessowners() throws Throwable {
		GuidewireAutomate("LOB Businessowners", LobBusiness_owners, "clickAndwait", "click");
	}

	public static void offering() throws Throwable {
		try {
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("offering",
					strTestCaseName);

			GuidewireAutomate_Validation("Screen Header", Offerings_Header, "equals", "Offerings");
			GuidewireAutomate("Offering Selection", Of_OfferingSelection, "selectByVisibleText",
					lhm_TestCase_Table_Data.get("Of_OfferingSelection"));
			lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
			lhm_TestCase_Table_Data.clear();
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void BOPOfferingQuestions() throws Throwable {
		try {
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("offering",
					strTestCaseName);

			GuidewireAutomate_Validation("BOPOfferingQuestions", BOP_Offering_Questions_Header, "equals",
					"BOP Offering Questions");
			GuidewireAutomate("British Columbia", Of_BritishColumbia, "click",
					lhm_TestCase_Table_Data.get("Of_BritishColumbia"));
			GuidewireAutomate("Partners Alliance", Of_PartnersAlliance, "click",
					lhm_TestCase_Table_Data.get("Of_PartnersAlliance"));
			lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
			lhm_TestCase_Table_Data.clear();
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
}
