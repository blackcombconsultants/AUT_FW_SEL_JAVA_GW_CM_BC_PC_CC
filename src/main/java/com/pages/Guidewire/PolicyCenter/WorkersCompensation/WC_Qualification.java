package com.pages.Guidewire.PolicyCenter.WorkersCompensation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.aventstack.extentreports.ExtentTest;

public class WC_Qualification extends SeleniumWebDriver_Commands {

	public WC_Qualification(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	/*
	 * Page Objects
	 */
	private static By Qualification_Header = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and text()='Qualification']");

	private static By PreQualification = By.xpath("//div[contains(@class,'gw-boldLabel') and text()='WC Pre-Qualification']");

	private static By QU_DoEmployeesdeepfryfoods                                                 = By.xpath("//input[contains(@name,'QuestionSetLV-0-QuestionModalInput-BooleanRadioInput_NoPost')]/parent::span/following-sibling::span[text()='No']");
	private static By QU_DoesYourbusinesshandlefuelsoranyexplosivematerials                      = By.xpath("//input[contains(@name,'QuestionSetLV-1-QuestionModalInput-BooleanRadioInput_NoPost')]");
	private static By QU_DoanyEmployeesoperatemotorizedvehiclesaspartofnormaljobresponsibilities = By.xpath("//input[contains(@name,'QuestionSetLV-2-QuestionModalInput-BooleanRadioInput_NoPost')]");
	private static By QU_DoesYourbusinessoperate24hoursperday                                    = By.xpath("//input[contains(@name,'QuestionSetLV-3-QuestionModalInput-BooleanRadioInput_NoPost')]");
	private static By QU_Totalannualpayroll                                                      = By.xpath("//input[contains(@name,'QuestionSetLV-4-QuestionModalInput-IntegerFieldInput_NoPost')]");
	private static By QU_IsYourbusinessunionized                                                 = By.xpath("//input[contains(@name,'QuestionSetLV-5-QuestionModalInput-BooleanRadioInput_NoPost')]");

	/*
	 * Methods
	 */
	public static void wcPreQualification(String DataSet) throws Throwable {
		lhm_TestCase_Table_Data = WC_Reusables.getData_WorkersCompensation("qualification", DataSet);

		GuidewireAutomate_Validation("Screen Header", Qualification_Header, "equals", "Qualification");

		GuidewireAutomate_Validation("PA Pre-Qualification", PreQualification, "equals", "WC Pre-Qualification");

		GuidewireAutomate("Do employees deep fry foods?", QU_DoEmployeesdeepfryfoods, "click", lhm_TestCase_Table_Data.get("QU_Deepfryfoods"));
		GuidewireAutomate("Does your business handle fuels or any explosive materials?", QU_DoesYourbusinesshandlefuelsoranyexplosivematerials, "click", lhm_TestCase_Table_Data.get("QU_FuelsExplosivematerials"));
		GuidewireAutomate("Do any employees operate motorized vehicles as part of normal job responsibilities", QU_DoanyEmployeesoperatemotorizedvehiclesaspartofnormaljobresponsibilities, "click",
				lhm_TestCase_Table_Data.get("QU_Operatemotorizedvehicles"));
		GuidewireAutomate("Does your business operate 24 hours/day", QU_DoesYourbusinessoperate24hoursperday, "click", lhm_TestCase_Table_Data.get("QU_DoesYourbusinessoperate24hoursperday"));
		GuidewireAutomate("Total annual payroll", QU_Totalannualpayroll, "click", lhm_TestCase_Table_Data.get("QU_Totalannualpayroll"));
		GuidewireAutomate("Is your business unionized", QU_IsYourbusinessunionized, "click", lhm_TestCase_Table_Data.get("QU_IsYourbusinessunionized"));

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();

	}

}
