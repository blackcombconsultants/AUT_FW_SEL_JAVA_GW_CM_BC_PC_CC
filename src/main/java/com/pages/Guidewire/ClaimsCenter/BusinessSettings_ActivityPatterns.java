package com.pages.Guidewire.ClaimsCenter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class BusinessSettings_ActivityPatterns extends SeleniumWebDriver_Commands implements BusinessSettings_ActivityPatterns_PO {

	public BusinessSettings_ActivityPatterns(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	// ----------> validating Header data
	public static void verify_ActivityPatterns_ColumnHeader() throws Throwable {

		// ----> Validating Activity Page Header
		GuidewireAutomate_Validation("Screen Header", ActivityPatterns_Header, "equals", "Activity Patterns");

		// ----> Validating Subject Header
		GuidewireAutomate_Validation("Subject column", AP_Subject_column, "equals", "Subject");

		// ----> Validating Class Header
		GuidewireAutomate_Validation("Class column", AP_Class_column, "equals", "Class");

		// ----> Validating Category Header
		GuidewireAutomate_Validation("Category column", AP_Category_column, "equals", "Category");

		// ----> Validating Type Header
		GuidewireAutomate_Validation("Type column", AP_Type_column, "equals", "Type");

		// ----> Validating Priority Header
		GuidewireAutomate_Validation("Priority column", AP_Priority_column, "equals", "Priority");

		// ----> Validating Mandatory Header
		GuidewireAutomate_Validation("Mandatory column", AP_Mandatory_column, "equals", "Mandatory");

		// ----> Validating Automated Header
		GuidewireAutomate_Validation("Automated column", AP_Automated_column, "equals", "Automated");

		oExtentTest.log(Status.PASS, "The Above columns are listed in order");

	}

	// ----------> validating Sorted By Subject
	public static void verifysortedBySubject() throws Throwable {

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("ActivityPatterns", strTestCaseName);

		ArrayList<String> aSubjects_Expected = new ArrayList<String>();
		aSubjects_Expected.add(lhm_TestCase_Table_Data.get("AP_Subject0"));
		aSubjects_Expected.add(lhm_TestCase_Table_Data.get("AP_Subject1"));
		aSubjects_Expected.add(lhm_TestCase_Table_Data.get("AP_Subject2"));
		Collections.sort(aSubjects_Expected);

		ArrayList<String> aSubjects_Actual = new ArrayList<String>();
		for (int i = 0; i < aSubjects_Expected.size(); i++) {
			By oWebElementSubject = By.xpath("//div[contains(@id,'ActivityPatternsLV-" + i + "-Subject_button')]");
			aSubjects_Actual.add(getText_Element(oWebElementSubject));
		}
		// Collections.sort(aSubjects_Actual);

		if (aSubjects_Actual.equals(aSubjects_Expected)) {
			oExtentTest.log(Status.PASS, "Activity Pattern screen is sorted with Subject " + aSubjects_Expected);
		} else {
			oExtentTest.log(Status.FAIL, "Activity Pattern screen is not sorted with Subject" + aSubjects_Actual);
		}

	}

	// ----------> validating Rows Count
	public static void ActivityPatternsRowsCount() throws Throwable {

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("ActivityPatterns", strTestCaseName);
		List<WebElement> ActivityPatterns = getElements(rowCount);

		int TotalRows = ActivityPatterns.size() - 1;

		String strTotalRows             = String.valueOf(TotalRows);
		String ActivityPatternRowsCount = lhm_TestCase_Table_Data.get("TotalRows");

		if (strTotalRows.equals(lhm_TestCase_Table_Data.get("TotalRows"))) {
			oExtentTest.log(Status.PASS, "Activity Pattern Rows per Page, Actual = [" + strTotalRows + "] Equals Expected=[" + ActivityPatternRowsCount + "]");

		} else {
			oExtentTest.log(Status.FAIL, "Activity Pattern Rows per Page,Actual = [" + strTotalRows + "] Notequals Expected=[" + ActivityPatternRowsCount + "]");
		}

	}

	// ----------> Input for Go Next Page
	public static void goNextPage(String strPageNo) throws Throwable {

		GuidewireAutomate_Validation("Screen Header", ActivityPatterns_Header, "equals", "Activity Patterns");

		switch (strPageNo) {

			case "Page2" :
				GuidewireAutomate(strPageNo, AP_PageNo, "clearsendKeysoJavascriptExecutor", "2");
				GuidewireAutomate_Validation(strPageNo, AP_PageNo, "valueEqualsAssert", "2");

				break;
			case "Page3" :
				GuidewireAutomate(strPageNo, AP_PageNo, "clearsendKeysoJavascriptExecutor", "3");
				GuidewireAutomate_Validation(strPageNo, AP_PageNo, "valueEqualsAssert", "3");

				break;
			case "Page4" :
				GuidewireAutomate(strPageNo, AP_PageNo, "clearsendKeysoJavascriptExecutor", "4");
				GuidewireAutomate_Validation(strPageNo, AP_PageNo, "valueEqualsAssert", "4");

				break;
			case "Page5" :
				GuidewireAutomate(strPageNo, AP_PageNo, "clearsendKeysoJavascriptExecutor", "5");
				GuidewireAutomate_Validation(strPageNo, AP_PageNo, "valueEqualsAssert", "5");

				break;
			case "Page6" :
				GuidewireAutomate(strPageNo, AP_PageNo, "clearsendKeysoJavascriptExecutor", "6");
				GuidewireAutomate_Validation(strPageNo, AP_PageNo, "valueEqualsAssert", "6");

				break;
			case "Page7" :
				GuidewireAutomate(strPageNo, AP_PageNo, "clearsendKeysoJavascriptExecutor", "7");
				GuidewireAutomate_Validation(strPageNo, AP_PageNo, "valueEqualsAssert", "7");

				break;
			case "Page8" :
				GuidewireAutomate(strPageNo, AP_PageNo, "clearsendKeysoJavascriptExecutor", "8");
				GuidewireAutomate_Validation(strPageNo, AP_PageNo, "valueEqualsAssert", "8");

				break;

			default :
				throw new IOException("No support for Page : " + strPageNo);
		}

		oExtentTest.log(Status.PASS, "Navigated to Page No : " + strPageNo);

	}

	// ----------> validating Activities
	public static void ActivityPatterns() throws Throwable {

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("ActivityPatterns", strTestCaseName);

		List<WebElement> ActivityPatterns = getElements(rowCount);

		for (int i = 0; i < ActivityPatterns.size() - 1; i++) {
			By oWebElementSubject   = By.xpath("//div[contains(@id,'ActivityPatternsLV-" + i + "-Subject_button')]");
			By oWebElementClass     = By.xpath("//div[contains(@id,'ActivityPatternsLV-" + i + "-ActivityClass')]");
			By oWebElementCategory  = By.xpath("//div[contains(@id,'ActivityPatternsLV-" + i + "-Category')]");
			By oWebElementType      = By.xpath("//div[contains(@id,'ActivityPatternsLV-" + i + "-Type')]");
			By oWebElementPriority  = By.xpath("//div[contains(@id,'ActivityPatternsLV-" + i + "-Priority')]");
			By oWebElementMandatory = By.xpath("//div[contains(@id,'ActivityPatternsLV-" + i + "-Mandatory')]");
			By oWebElementAutomated = By.xpath("//div[contains(@id,'ActivityPatternsLV-" + i + "-AutomatedOnly')]");

			String strActual_Subject   = getText_Element(oWebElementSubject);
			String strActual_Class     = getText_Element(oWebElementClass);
			String strActual_Category  = getText_Element(oWebElementCategory);
			String strActual_Type      = getText_Element(oWebElementType);
			String strActual_Priority  = getText_Element(oWebElementPriority);
			String strActual_Mandatory = getText_Element(oWebElementMandatory);
			String strActual_Automated = getText_Element(oWebElementAutomated);

			String AP_Subject   = lhm_TestCase_Table_Data.get("AP_Subject" + i);
			String AP_Class     = lhm_TestCase_Table_Data.get("AP_Class" + i);
			String AP_Category  = lhm_TestCase_Table_Data.get("AP_Category" + i);
			String AP_Type      = lhm_TestCase_Table_Data.get("AP_Type" + i);
			String AP_Priority  = lhm_TestCase_Table_Data.get("AP_Priority" + i);
			String AP_Mandatory = lhm_TestCase_Table_Data.get("AP_Mandatory" + i);
			String AP_Automated = lhm_TestCase_Table_Data.get("AP_Automated" + i);

			if ((strActual_Subject.equals(AP_Subject)) && (strActual_Class.equals(AP_Class)) && (strActual_Category.equals(AP_Category)) && (strActual_Type.equals(AP_Type)) && (strActual_Priority.equals(AP_Priority))
					&& (strActual_Mandatory.equals(AP_Mandatory)) && (strActual_Automated.equals(AP_Automated))) {
				Assert.assertEquals(strActual_Subject, AP_Subject);
				Assert.assertEquals(strActual_Subject, AP_Subject);
				Assert.assertEquals(strActual_Subject, AP_Subject);
				Assert.assertEquals(strActual_Subject, AP_Subject);
				Assert.assertEquals(strActual_Subject, AP_Subject);

				oExtentTest.log(Status.PASS,
						"Subject=>Actual = [" + strActual_Subject + "] Equals Expected = [" + AP_Subject + "]" + "<br />" + "Class=>Actual = [" + strActual_Class + "] Equals Expected = [" + AP_Class + "]" + "<br />" + "Category=>Actual = ["
								+ strActual_Category + "] Equals Expected = [" + AP_Category + "]" + "<br />" + "Type=>Actual = [" + strActual_Type + "] Equals Expected = [" + AP_Type + "]" + "<br />" + "Priority=>Actual = [" + strActual_Priority
								+ "] Equals Expected = [" + AP_Priority + "]" + "<br />" + "Mandatory=>Actual = [" + AP_Mandatory + "] Equals Expected = [" + strActual_Mandatory + "]" + "<br />" + "Automated=>Actual = [" + strActual_Automated
								+ "] Equals Expected = [" + AP_Automated + "]");

			} else {

				oExtentTest.log(Status.FAIL,
						"Subject=>Actual = [" + strActual_Subject + "] Equals Expected = [" + AP_Subject + "]" + "<br />" + "Class=>Actual = [" + strActual_Class + "] Equals Expected = [" + AP_Class + "]" + "<br />" + "Category=>Actual = ["
								+ strActual_Category + "] Equals Expected = [" + AP_Category + "]" + "<br />" + "Type=>Actual = [" + strActual_Type + "] Equals Expected = [" + AP_Type + "]" + "<br />" + "Priority=>Actual = [" + strActual_Priority
								+ "] Equals Expected = [" + AP_Priority + "]" + "<br />" + "Mandatory=>Actual = [" + AP_Mandatory + "] Equals Expected = [" + strActual_Mandatory + "]" + "<br />" + "Automated=>Actual = [" + strActual_Automated
								+ "] Equals Expected = [" + AP_Automated + "]");

			}

		}

	}

}
