package com.pages.Guidewire.PolicyCenter.CommercialPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;

public class CPACK_Offering extends SeleniumWebDriver_Commands {

	public CPACK_Offering(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	private static By Offerings_Header     = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and text()='Offerings']");
	private static By Of_OfferingSelection = By.xpath("//select[contains(@name,'OfferingScreen-OfferingSelection')]");
	private static By CPP_Offering         = By.xpath("//div[contains(@class,'gw-LabelWidget')]/div[contains(@class,'gw-label gw-boldLabel') and text()='CPP Offering']");

	private static By Of_Doallbuildingshave   = By.xpath("//input[contains(@id,'QuestionSetLV-0-QuestionModalInput-BooleanRadioInput_1')]");
	private static By Of_Arethereregular      = By.xpath("//input[contains(@id,'QuestionSetLV-1-QuestionModalInput-BooleanRadioInput_1')]");
	private static By Of_valueoutdoorsigns    = By.xpath("//input[contains(@id,'QuestionSetLV-2-QuestionModalInput-BooleanRadioInput_1')]");
	private static By Of_Isaccountsreceivable = By.xpath("//input[contains(@id,'QuestionSetLV-3-QuestionModalInput-BooleanRadioInput_1')]");
	private static By Of_Areanyflammable      = By.xpath("//input[contains(@id,'QuestionSetLV-4-QuestionModalInput-BooleanRadioInput_1')]");
	private static By Of_Arethereanypending   = By.xpath("//input[contains(@id,'QuestionSetLV-5-QuestionModalInput-BooleanRadioInput_1')]");

	public static void offering() throws Throwable {
		try {
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcelWorkSheet_Fillo("offering", strTestCaseName);

			GuidewireAutomate_Validation("Screen Header", Offerings_Header, "equals", "Offerings");
			GuidewireAutomate("Offering Selection", Of_OfferingSelection, "selectByVisibleText", lhm_TestCase_Table_Data.get("Of_OfferingSelection"));
			lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
			lhm_TestCase_Table_Data.clear();
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void CPPOfferingQuestions() throws Throwable {
		try {
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcelWorkSheet_Fillo("offering", strTestCaseName);

			GuidewireAutomate_Validation("CPP Offering", CPP_Offering, "equals", "CPP Offering");
			GuidewireAutomate("Do all buildings have", Of_Doallbuildingshave, "click", lhm_TestCase_Table_Data.get("Of_Doallbuildingshave"));

			GuidewireAutomate("Are there regular", Of_Arethereregular, "click", lhm_TestCase_Table_Data.get("Of_Arethereregular"));

			GuidewireAutomate("value out door signs", Of_valueoutdoorsigns, "click", lhm_TestCase_Table_Data.get("Of_valueoutdoorsigns"));

			GuidewireAutomate("Is accounts receivable", Of_Isaccountsreceivable, "click", lhm_TestCase_Table_Data.get("Of_Isaccountsreceivable"));

			GuidewireAutomate("Are any flammable", Of_Areanyflammable, "click", lhm_TestCase_Table_Data.get("Of_Areanyflammable"));
			GuidewireAutomate("Are there any pending", Of_Arethereanypending, "click", lhm_TestCase_Table_Data.get("Of_Arethereanypending"));
			lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
			lhm_TestCase_Table_Data.clear();
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
}
