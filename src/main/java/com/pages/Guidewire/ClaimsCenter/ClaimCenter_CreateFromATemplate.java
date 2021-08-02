package com.pages.Guidewire.ClaimsCenter;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;

public class ClaimCenter_CreateFromATemplate extends SeleniumWebDriver_Commands implements ClaimCenter_CreateFromATemplate_PO {

	public ClaimCenter_CreateFromATemplate(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
		// TODO Auto-generated constructor stub
	}

	public static void addCreateTemplate() throws Throwable {

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("addCreateTemplate", strTestCaseName);
		GuidewireAutomate_Validation("Screen Header", NewDocument_Header, "equals", "New Document");
		GuidewireAutomate("Search", NewDocument_DocumentTemplate_Search, "click", "click");
		// GuidewireAutomate("Type", NewDocument_Type,
		// "selectByVisibleText",lhm_TestCase_Table_Data.get("Type"));
		GuidewireAutomate("LineOfBusiness", NewDocument_LineOfBusiness, "selectByVisibleText", lhm_TestCase_Table_Data.get("LineOfBusiness"));
		GuidewireAutomate("Jurisdiction", NewDocument_Jurisdiction, "selectByVisibleText", lhm_TestCase_Table_Data.get("Jurisdiction"));
		GuidewireAutomate("NewDocument Search", NewDocument_DocumentTemplates_Search, "clickAndwait", "click");

		String StrTemplate = lhm_TestCase_Table_Data.get("Template");
		switch (StrTemplate) {
			case "Acrobat Sample" :
				GuidewireAutomate("Select Acrobat Sample Template ", NewDocument_Select_AcrobatSample, "moveToElement", "click");
				GuidewireAutomate("Select Acrobat Sample Template ", NewDocument_Select_AcrobatSample, "clickAndwait", "click");
				break;
			case "Excel Sample" :
				GuidewireAutomate("Select Excel Sample Template", NewDocument_Select_ExcelSample, "moveToElement", "click");
				GuidewireAutomate("Select Excel Sample Template", NewDocument_Select_ExcelSample, "clickAndwait", "click");
				break;
			case "Gosu CSV Sample" :
				GuidewireAutomate("Select Gosu CSV Sample Template", NewDocument_Select_GosuCSVSample, "moveToElement", "click");
				GuidewireAutomate("Select Gosu CSV Sample Template", NewDocument_Select_GosuCSVSample, "clickAndwait", "click");
				break;
			case "KY" :
				GuidewireAutomate("Select KY Sample Template", NewDocument_Select_KYSample, "moveToElement", "click");
				GuidewireAutomate(" Select KY SampleTemplate", NewDocument_Select_KYSample, "clickAndwait", "click");
				break;
			default :
				throw new IOException("No support for Template : " + StrTemplate);
		}

		GuidewireAutomate("createDocument", NewDocument_CreateDocument, "clickAndwait", "click");

		GuidewireAutomate("Update", NewDocument_Update, "click", "click");
	}

}
