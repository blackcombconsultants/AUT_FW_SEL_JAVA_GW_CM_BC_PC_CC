package com.pages.Guidewire.PolicyCenter.HomeOwners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Resuables_PO;

public class HO_Qualifications extends SeleniumWebDriver_Commands {

	public HO_Qualifications(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}
	private static By QU_Qualification_PolicyType = By.xpath("//select[contains(@name,'HOPCoveragePartType')]");

	private static By QU_Qualification_CoverageForm = By.xpath("//select[contains(@name,'HOPCoverageForm')]");
	private static By QU_PA_PreQualification        = By.xpath("//div[contains(@class,'gw-boldLabel') and text()='HOP Pre-Qualification']");

	private static By QU_Do_you_have_a_dog                     = By.xpath("//input[contains(@id,'QuestionSetLV-0-QuestionModalInput-BooleanRadioInput_1')]");
	private static By QU_Is_this_property_vacant               = By.xpath("//input[contains(@id,'QuestionSetLV-1-QuestionModalInput-BooleanRadioInput_1')]");
	private static By QU_Who_occupies_this_dwelling            = By.xpath("//select[contains(@name,'QuestionSetLV-2-QuestionModalInput-ChoiceSelectInput')]");
	private static By QU_Do_you_occupy_this_dwelling_full_time = By.xpath("//input[contains(@id,'QuestionSetLV-3-QuestionModalInput-BooleanRadioInput_0')]");
	private static By QU_Do_you_have_a_swimming_pool           = By.xpath("//input[contains(@id,'QuestionSetLV-4-QuestionModalInput-BooleanRadioInput_1')]");

	public static void qualification() throws Throwable {

		try {
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcelWorkSheet_Fillo("qualification", strTestCaseName);

			GuidewireAutomate_Validation("Screen Header", PolicyCenter_Resuables_PO.Qualification_Header, "equals", "Qualification");
			GuidewireAutomate("PolicyType", QU_Qualification_PolicyType, "selectByVisibleText", lhm_TestCase_Table_Data.get("PolicyType"));
			Thread.sleep(2000);
			GuidewireAutomate("CoverageForm", QU_Qualification_CoverageForm, "selectByVisibleText", lhm_TestCase_Table_Data.get("CoverageForm"));

			GuidewireAutomate_Validation("HOP Pre-Qualification", QU_PA_PreQualification, "equals", "HOP Pre-Qualification");
			GuidewireAutomate("Do you have a dog", QU_Do_you_have_a_dog, "click", lhm_TestCase_Table_Data.get("DoYouHaveaDog"));
			GuidewireAutomate("Is this property vacant", QU_Is_this_property_vacant, "click", lhm_TestCase_Table_Data.get("ProperyVacant"));
			GuidewireAutomate("Who occupies this dwelling", QU_Who_occupies_this_dwelling, "selectByVisibleText", lhm_TestCase_Table_Data.get("WhoOccupiesThisDwelling"));
			Thread.sleep(2000);
			GuidewireAutomate("Do you occupy this dwelling full time", QU_Do_you_occupy_this_dwelling_full_time, "click", lhm_TestCase_Table_Data.get("DwellingFullTime"));
			GuidewireAutomate(" Do you have a swimming pool", QU_Do_you_have_a_swimming_pool, "click", lhm_TestCase_Table_Data.get("SwimmingPool"));
			lhm_TestCase_Table_Data.clear();

			// oExtentTest.log(Status.PASS, "Search PolicyNumber = [" + strPolicyNumber + "] is succesful");
		} catch (Exception e) {
			// oExtentTest.log(Status.FAIL, "Search PolicyNumber = [" + strPolicyNumber + "] is Unsuccesful");
			e.printStackTrace();
			throw e;
		}

	}

}
