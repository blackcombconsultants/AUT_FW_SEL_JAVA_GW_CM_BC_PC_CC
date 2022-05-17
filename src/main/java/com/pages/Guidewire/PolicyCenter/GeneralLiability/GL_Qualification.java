package com.pages.Guidewire.PolicyCenter.GeneralLiability;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Resuables_PO;

public class GL_Qualification extends SeleniumWebDriver_Commands {

	public GL_Qualification(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
		// TODO Auto-generated constructor stub
	}


	private static By QU_GL_PreQualification = By.xpath(
			"//div[contains(@id,'PreQualQuestionSetsDV-QuestionSetsDV-0-1')]/div[@class='gw-label gw-boldLabel']");

	private static By QU_GL_Are_any_medicalfacilitiesprovided_or_medicalprofessionals_employed_or_contracted = By
			.xpath("//input[contains(@id,'QuestionSetLV-0-QuestionModalInput-BooleanRadioInput_NoPost_1')]");
	private static By QU_GL_Have_you_or_anyaffiliatedcompany_manufactured_anyproducts_used_bythe_aerospaceindustry = By
			.xpath("//input[contains(@id,'QuestionSetLV-1-QuestionModalInput-BooleanRadioInput_NoPost_1')]");
	private static By QU_GL_Inaddition_to_disclosedClaimHistory_have_you_paid_anydirectsettlements_related_to_businessactivities_or_products = By
			.xpath("//input[contains(@id,'QuestionSetLV-2-QuestionModalInput-BooleanRadioInput_NoPost_1')]");
	private static By QU_GL_Are_there_anypending_suits_or_anticipated_legalaction_related_to_businessactivities_or_products = By
			.xpath("//input[contains(@id,'QuestionSetLV-3-QuestionModalInput-BooleanRadioInput_NoPost_1')]");

	public static void qualification() throws Throwable {
		try {

			GuidewireAutomate_Validation("Screen Header", PolicyCenter_Resuables_PO.Qualification_Header, "equals",
					"Qualification");
			GuidewireAutomate_Validation("Pre-Qualification", QU_GL_PreQualification, "equals", "GL PreQualification");

			GuidewireAutomate("Are any medical facilities provided",
					QU_GL_Are_any_medicalfacilitiesprovided_or_medicalprofessionals_employed_or_contracted, "click",
					"click");

			GuidewireAutomate(
					"Have you or any affiliated company manufactured any products used by the aerospace industry?",
					QU_GL_Have_you_or_anyaffiliatedcompany_manufactured_anyproducts_used_bythe_aerospaceindustry,
					"click", "click");

			GuidewireAutomate(
					"In addition to disclosed Claim History, have you paid any direct settlements related to business activities or products?",
					QU_GL_Inaddition_to_disclosedClaimHistory_have_you_paid_anydirectsettlements_related_to_businessactivities_or_products,
					"click", "click");

			GuidewireAutomate(
					"Are there any pending suits or anticipated legal action related to business activities or products?",
					QU_GL_Are_there_anypending_suits_or_anticipated_legalaction_related_to_businessactivities_or_products,
					"click", "click");

			lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
			lhm_TestCase_Table_Data.clear();
		} catch (Exception e) {

		}
	}
}
