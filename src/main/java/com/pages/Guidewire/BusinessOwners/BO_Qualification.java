package com.pages.Guidewire.BusinessOwners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Resuables_PO;

public class BO_Qualification extends SeleniumWebDriver_Commands {

	public BO_Qualification(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	private static By QU_BO_PreQualification = By
			.xpath("//div[contains(@class,'gw-boldLabel') and text()='BOP Pre-Qualification']");

	private static By QU_nonrenewedduringtheprior3years = By
			.xpath("//input[contains(@id,'QuestionSetLV-0-QuestionModalInput-BooleanRadioInput_NoPost_1')]");
	private static By QU_Hasapplicanthadaforeclosurerepossessionbankruptcyjudgementorlienduringthepastfiveyears = By
			.xpath("//input[contains(@id,'QuestionSetLV-1-QuestionModalInput-BooleanRadioInput_NoPost_1')]");
	private static By QU_Doanycatastropheexposuresexist = By
			.xpath("//input[contains(@id,'QuestionSetLV-2-QuestionModalInput-BooleanRadioInput_NoPost_1')]");
	private static By QU_Duringthelastfiveyears = By
			.xpath("//input[contains(@id,'QuestionSetLV-3-QuestionModalInput-BooleanRadioInput_1')]");
	private static By QU_Havetherebeenanyclaims = By
			.xpath("//input[contains(@id,'QuestionSetLV-4-QuestionModalInput-BooleanRadioInput_NoPost_1')]");
	private static By QU_Doestheapplicanthaveotherpast = By
			.xpath("//input[contains(@id,'QuestionSetLV-5-QuestionModalInput-BooleanRadioInput_1')]");
	private static By QU_Doestheapplicantown = By
			.xpath("//input[contains(@id,'QuestionSetLV-6-QuestionModalInput-BooleanRadioInput_1')]");

	private static By QU_Doanyuncorrectedfirecodeviolationsexist = By
			.xpath("//input[contains(@id,'QuestionSetLV-7-QuestionModalInput-BooleanRadioInput_1')]");

	public static void qualification() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("qualification",
				strTestCaseName);

		GuidewireAutomate_Validation("Screen Header", PolicyCenter_Resuables_PO.Qualification_Header, "equals",
				"Qualification");

		GuidewireAutomate_Validation("BO Pre-Qualification", QU_BO_PreQualification, "equals", "BOP Pre-Qualification");

		GuidewireAutomate(
				"Has any policy or coverage been declined, canceled, or non-renewed during the prior 3 years?",
				QU_nonrenewedduringtheprior3years, "clickAndwait",
				lhm_TestCase_Table_Data.get("QU_nonrenewedduringtheprior3years"));

		GuidewireAutomate(
				"Has applicant had a foreclosure, repossession, bankruptcy, judgement, or lien during the past five years?",
				QU_Hasapplicanthadaforeclosurerepossessionbankruptcyjudgementorlienduringthepastfiveyears, "clickAndwait",
				lhm_TestCase_Table_Data.get(
						"QU_Hasapplicanthadaforeclosure"));

		GuidewireAutomate("Do any catastrophe exposures exist?", QU_Doanycatastropheexposuresexist, "clickAndwait",
				lhm_TestCase_Table_Data.get("QU_Doanycatastropheexposuresexist"));

		/*
		 * GuidewireAutomate(
		 * "During the last five years, has any applicant been convicted of any degree of the crime of arson?"
		 * , QU_Duringthelastfiveyears, "clickAndwait",
		 * lhm_TestCase_Table_Data.get("QU_Duringthelastfiveyears"));
		 * 
		 * GuidewireAutomate(
		 * "Have there been any claims or allegations relating to sexual abuse or molestation allegations, discrimination, or negligent hiring?"
		 * , QU_Havetherebeenanyclaims, "clickAndwait",
		 * lhm_TestCase_Table_Data.get("QU_Havetherebeenanyclaims"));
		 * GuidewireAutomate("Does the applicant have other past or current policies with this company?"
		 * , QU_Doestheapplicanthaveotherpast, "clickAndwait",
		 * lhm_TestCase_Table_Data.get("QU_Doestheapplicanthaveotherpast"));
		 * GuidewireAutomate("Does the applicant own or operate any business not included on this application?"
		 * , QU_Doestheapplicantown, "clickAndwait",
		 * lhm_TestCase_Table_Data.get("QU_Doestheapplicantown"));
		 * GuidewireAutomate("Do any uncorrected fire code violations exist?",
		 * QU_Doanyuncorrectedfirecodeviolationsexist, "clickAndwait",
		 * lhm_TestCase_Table_Data.get("QU_Doanyuncorrectedfirecodeviolationsexist"));
		 */
		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();

	}
}
