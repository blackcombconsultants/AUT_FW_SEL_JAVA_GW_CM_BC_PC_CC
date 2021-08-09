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

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_ClaimsCenter("ActivityPatterns");

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

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_ClaimsCenter("ActivityPatterns");

		List<WebElement> ActivityPatterns         = getElements(rowCount);
		int              TotalRows                = ActivityPatterns.size() - 1;
		String           strTotalRows             = String.valueOf(TotalRows);
		String           ActivityPatternRowsCount = lhm_TestCase_Table_Data.get("TotalRows");

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

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_ClaimsCenter("ActivityPatterns");

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

	public static void VerifyActivityPatterns() throws Throwable {

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_ClaimsCenter("ActivityPatternDetail");

		/*------
		  Validation for Activity Patterns
		 --- ---*/

		String PageNo = lhm_TestCase_Table_Data.get("page");

		GuidewireAutomate_Validation("Screen Header", ActivityPatterns_Header, "equals", "Activity Patterns");

		GuidewireAutomate("Page No ", BusinessSettings_ActivityPatterns_PO.AP_PageNo, "clearsendKeysoJavascriptExecutor", lhm_TestCase_Table_Data.get("page"));
		GuidewireAutomate_Validation("Page No ", BusinessSettings_ActivityPatterns_PO.AP_PageNo, "valueEqualsAssert", lhm_TestCase_Table_Data.get("page"));
		oExtentTest.log(Status.PASS, "Navigated to Page No : " + lhm_TestCase_Table_Data.get("page"));

		// Validation for Activity Patterns subject
		String strSubject     = lhm_TestCase_Table_Data.get("Subject");
		By     CurrentSubject = By.xpath("//div[contains(@id,'Subject_button') and contains(text(),'" + strSubject + "')]");
		GuidewireAutomate_Validation("Activity Pattern Subject ", CurrentSubject, "equals", strSubject);

		GuidewireAutomate("Activity Pattern Subject : " + strSubject, CurrentSubject, "clickAndwait", "click");

		/*------
		  Validation for Activity Pattern Details 
		 --- ---*/
		switch (strSubject) {
			// Page 1 of Activity Patterns is displayed
			case "3-point contact - Employee" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - 3-point contact - Employee");
				break;
			case "3-point contact - Employer" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - 3-point contact - Employer");
				break;
			case "3-point contact - Medical Provider" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - 3-point contact - Medical Provider");
				break;
			case "30 day diary" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - 30 day diary");
				break;
			case "60 day diary" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - 60 day diary");
				break;
			case "90 day diary" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - 90 day diary");
				break;
			case "Additional living expenses required" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - Additional living expenses required");
				break;
			case "Arbitration Date" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - Arbitration Date");
				break;
			case "Assign nurse to case" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - Assign nurse to case");
				break;
			case "Check Denied" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - Check Denied");
				break;
			case "Check on medical clearance for light duty work" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - Check on medical clearance for light duty work");
				break;
			case "Check with employer about temp light duty work" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - Check with employer about temp light duty work");
				break;
			case "Closed File Review" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - Closed File Review");
				break;
			case "Consult Account regarding fatality" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - Consult Account regarding fatality");
				break;
			case "Contact Underwriter regarding incorrect class code" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - Contact Underwriter regarding incorrect class code");
				break;
			// page 2 Activity Pattern displayed
			case "Create Recovery email bill1" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - Create Recovery email bill1");
				break;
			case "Create Recovery email bill2" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - Create Recovery email bill2");
				break;
			case "Decision Date Review" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - Decision Date Review");
				break;
			case "Determine compensability" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - Determine compensability");
				break;
			case "Determine if opportunity for recovery" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - Determine if opportunity for recovery");
				break;
			case "File Employer's First Notice" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - File Employer's First Notice");
				break;
			case "Follow up with vendor - past expected quote completion date" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - Follow up with vendor - past expected quote completion date");
				break;
			case "Follow up with vendor - past expected service completion date" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - Follow up with vendor - past expected service completion date");
				break;
			case "Follow up with vendor - work not accepted in timely manner" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - Follow up with vendor - work not accepted in timely manner");
				break;
			case "General reminder (diary)" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - General reminder (diary)");
				break;
			case "Get Employee's Notice of Injury" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - Get Employee's Notice of Injury");
				break;
			case "Get a statement from Health and Safety Dept" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - Get a statement from Health and Safety Dept");
				break;
			case "Get a statement from witness" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - Get a statement from witness");
				break;
			case "Get accident scene inspected" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - Get accident scene inspected");
				break;
			case "Get claimant medical reports" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - Get claimant medical reports");
				break;
			// page 3 Activity pattern Displayed
			case "Get independent medical examination" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - Get independent medical examination");
				break;
			case "Get initial medical report" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - Get initial medical report");
				break;
			case "Get list of damaged items" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - Get list of damaged items");
				break;
			case "Get police report" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - Get police report");
				break;
			case "Get property inspected" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - Get property inspected");
				break;
			case "Get quote for repairs/replacement" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - Get quote for repairs/replacement");
				break;
			case "Get signed Voluntary Agreement" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - Get signed Voluntary Agreement");
				break;
			case "Get vehicle inspected" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - Get vehicle inspected");
				break;
			case "Get wage statement and tax status" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - Get wage statement and tax status");
				break;
			case "Hearing Date" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - Hearing Date");
				break;
			case "ISO matches found" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - ISO matches found");
				break;
			case "Independent appraisal" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - Independent appraisal");
				break;
			case "Initial 30 day file review" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - Initial 30 day file review");
				break;
			case "Invoice not auto-approved" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - Invoice not auto-approved");
				break;
			case "Invoice not auto-paid" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - Invoice not auto-paid");
				break;
			// page 4 Activity pattern Displayed
			case "Legal review" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - Legal review");
				break;
			case "Make initial contact with claimant" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - Make initial contact with claimant");
				break;
			case "Make initial contact with insured" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - Make initial contact with insured");
				break;
			case "Make settlement offer" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - Make settlement offer");
				break;
			case "Mediation Date" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - Mediation Date");
				break;
			case "Metropolitan Report Available" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - Metropolitan Report Available");
				break;
			case "Metropolitan Report Deferred" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - Metropolitan Report Deferred");
				break;
			case "Metropolitan Report Held" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - Metropolitan Report Held");
				break;
			case "Metropolitan Report Inquiry Failed" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - Metropolitan Report Inquiry Failed");
				break;
			case "Metropolitan Report Request Failed" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - Metropolitan Report Request Failed");
				break;
			case "No Metropolitan Report Available" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - No Metropolitan Report Available");
				break;
			case "Notify account - expected cost above threshold" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - Notify account - expected cost above threshold");
				break;
			case "Notify reinsurer" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - Notify reinsurer");
				break;
			case "Pending create rejected" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - Pending create rejected");
				break;
			case "Pending update rejected" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - Pending update rejected");
				break;
			// page 5 Activity pattern Displayed
			case "Performance Review" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - Performance Review");
				break;
			case "Produce claim strategy narrative" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - Produce claim strategy narrative");
				break;
			case "Put third party on notice of Subrogation Interest" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - Put third party on notice of Subrogation Interest");
				break;
			case "Recover Vehicle" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - Recover Vehicle");
				break;
			case "Recovery Denied" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - Recovery Denied");
				break;
			case "Recurring payment stream ending" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - Recurring payment stream ending");
				break;
			case "Reinsurance Coverage Retrieval Failed" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - Reinsurance Coverage Retrieval Failed");
				break;
			case "Retrieve Claim Completed" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - Retrieve Claim Completed");
				break;
			case "Review Assignment" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - Review Assignment");
				break;
			case "Review Claim for Reinsurance" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - Review Claim for Reinsurance");
				break;
			case "Review Reinsurance Recoverable and Ceded Reserves" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - Review Reinsurance Recoverable and Ceded Reserves");
				break;
			case "Review all Special Handling instructions" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - Review all Special Handling instructions");
				break;
			case "Review and approve bulk invoice" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - Review and approve bulk invoice");
				break;
			case "Review and approve new payment" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - Review and approve new payment");
				break;
			case "Review and approve new recovery" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - Review and approve new recovery");
				break;
			// Page 6 Activity Pattern
			case "Review and approve new recovery reserve change" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - Review and approve new recovery reserve change");
				break;
			case "Review and approve quote for repairs/replacement" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - Review and approve quote for repairs/replacement");
				break;
			case "Review and approve reserve change" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - Review and approve reserve change");
				break;
			case "Review claim for subrogation. Claim has been reopened." :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - Review claim for subrogation. Claim has been reopened.");
				break;
			case "Review coverage in question" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - Review coverage in question");
				break;
			case "Review denial decision with Account Manager" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - Review denial decision with Account Manager");
				break;
			case "Review for Catastrophe" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - Review for Catastrophe");
				break;
			case "Review matter-related Special Handling instructions" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - Review matter-related Special Handling instructions");
				break;
			case "Review negotiation strategy with Account" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - Review negotiation strategy with Account");
				break;
			case "Review new bill received" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - Review new bill received");
				break;
			case "Review new mail" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - Review new mail");
				break;
			case "Review rejected request" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - Review rejected request");
				break;
			case "Review subrogation recovery financials. A supplemental payment was created." :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - Review subrogation recovery financials. A supplemental payment was created.");
				break;
			case "Review vendor quote" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - Review vendor quote");
				break;
			case "SIU referral" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - SIU referral");
				break;
			// Page 7 Activity Pattern
			case "Salvage Vehicle" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - Salvage Vehicle");
				break;
			case "Send claim acknowledgement letter" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - Send claim acknowledgement letter");
				break;
			case "Send letter confirming closure of exposure" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - Send letter confirming closure of exposure");
				break;
			case "Send reservation of rights letter" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - Send reservation of rights letter");
				break;
			case "Special Investigation Claim Escalation" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - Special Investigation Claim Escalation");
				break;
			case "Special Investigation Claim Review" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - Special Investigation Claim Review");
				break;
			case "Subrogation statute deadline approaching" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - Subrogation statute deadline approaching");
				break;
			case "Trial Date" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - Trial Date");
				break;
			case "Unable to close the claim or the exposure" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - Unable to close the claim or the exposure");
				break;
			case "Unable to issue a stop payment" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - Unable to issue a stop payment");
				break;
			case "Unable to issue a stop payment on bulk check" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - Unable to issue a stop payment on bulk check");
				break;
			case "Unable to void the bulk check" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - Unable to void the bulk check");
				break;
			case "Unable to void the check" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - Unable to void the check");
				break;
			case "Validation and processing of Bulk Invoice Items failed" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - Validation and processing of Bulk Invoice Items failed");
				break;
			case "Vendor asked question" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - Vendor asked question");
				break;
			// Page 8 Activity Pattern
			case "Vendor canceled work- instruct new vendor" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - Vendor canceled work- instruct new vendor");
				break;
			case "Vendor completed work" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - Vendor completed work");
				break;
			case "Vendor declined work- instruct new vendor" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - Vendor declined work- instruct new vendor");
				break;
			case "Vendor work delayed" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - Vendor work delayed");
				break;
			case "Verify coverage" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - Verify coverage");
				break;
			case "Verify coverage & determine if opportunity for recovery" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - Verify coverage & determine if opportunity for recovery");
				break;
			case "Visit claimant and assess back-to-work status" :
				GuidewireAutomate_Validation("ScreenHeader", ActivityPatternDetails_Header, "equals", "Activity Pattern Detail - Visit claimant and assess back-to-work status");
				break;
			default :
				throw new IOException("No support for Subject : " + strSubject);
		}

		// Activity Patterns
		GuidewireAutomate_Validation("Activity Pattern", APD_ActivityPattern, "equals", "Activity Pattern");

		GuidewireAutomate_Validation("Subject", APD_AP_Subject, "equals", strSubject);
		GuidewireAutomate_Validation("ShortSubject", APD_AP_ShortSubject, "equals", lhm_TestCase_Table_Data.get("ShortSubject"));
		GuidewireAutomate_Validation("Class", APD_AP_Class, "equals", lhm_TestCase_Table_Data.get("Class"));
		GuidewireAutomate_Validation("Type", APD_AP_Type, "equals", lhm_TestCase_Table_Data.get("Type"));
		GuidewireAutomate_Validation("Category", APD_AP_Category, "equals", lhm_TestCase_Table_Data.get("Category"));
		GuidewireAutomate_Validation("Code", APD_AP_Code, "equals", lhm_TestCase_Table_Data.get("Code"));
		GuidewireAutomate_Validation("Priority", APD_AP_Priority, "equals", lhm_TestCase_Table_Data.get("Priority"));
		GuidewireAutomate_Validation("Mandatory", APD_AP_Mandatory, "equals", lhm_TestCase_Table_Data.get("Mandatory"));
		GuidewireAutomate_Validation("Calender Importance", APD_AP_CalenderImportance, "equals", lhm_TestCase_Table_Data.get("CalendarImportance"));
		GuidewireAutomate_Validation("Claim losstype", APD_AP_ClaimLossType, "equals", lhm_TestCase_Table_Data.get("ClaimLossType"));
		GuidewireAutomate_Validation("Automated", APD_AP_AutomatedOnly, "equals", lhm_TestCase_Table_Data.get("AutomatedOnly"));
		GuidewireAutomate_Validation("AvailableForClosedClaim", APD_AP_AvailableForClosedClaim, "equals", lhm_TestCase_Table_Data.get("AvailableForClosedClaim"));
		GuidewireAutomate_Validation("ExternallyOwned", APD_AP_ExternallyOwned, "equals", lhm_TestCase_Table_Data.get("ExternallyOwned"));
		GuidewireAutomate_Validation("DocumentTemplate", APD_AP_DocumentTemplate, "equals", lhm_TestCase_Table_Data.get("DocumentTemplate"));
		GuidewireAutomate_Validation("EmailTemplate", APD_AP_EmailTemplate, "equals", lhm_TestCase_Table_Data.get("EmailTemplate"));
		GuidewireAutomate_Validation("Recurring", APD_AP_Recurring, "equals", lhm_TestCase_Table_Data.get("Recurring"));
		GuidewireAutomate_Validation("Description", APD_AP_Description, "equals", lhm_TestCase_Table_Data.get("Description"));

		// Activity Patterns Dates
		GuidewireAutomate_Validation("ActivityPatternDates", APD_ActivityPatternDates, "equals", "Activity Pattern Dates");

		GuidewireAutomate_Validation("Target Days", APD_APDates_Target, "equals", lhm_TestCase_Table_Data.get("TargetDays"));
		GuidewireAutomate_Validation("Target Hours", APD_APDates_TargetHours, "equals", lhm_TestCase_Table_Data.get("TargetHours"));
		GuidewireAutomate_Validation("Target StartPoint", APD_APDates_TargetStartPoint, "equals", lhm_TestCase_Table_Data.get("TargetStartPoint"));
		GuidewireAutomate_Validation("Target IncludeDays", APD_APDates_TargetIncludeTheseDays, "equals", lhm_TestCase_Table_Data.get("IncludeTheseDays"));
		GuidewireAutomate_Validation("Target BusinessCalendarType", APD_APDates_TargetBusinesscalendarType, "equals", lhm_TestCase_Table_Data.get("BusinessCalendarType"));

		GuidewireAutomate_Validation("Escalation Days", APD_APDates_EscalationDays, "equals", lhm_TestCase_Table_Data.get("Escalation_Days"));
		GuidewireAutomate_Validation("Escalation Hours", APD_APDates_EscalationHours, "equals", lhm_TestCase_Table_Data.get("Escalation_Hours"));
		GuidewireAutomate_Validation("Escalation startpoint", APD_APDates_EscalationStartPoint, "equals", lhm_TestCase_Table_Data.get("Escalation_StartPoint"));
		GuidewireAutomate_Validation("Escalation IncludeTheseDays", APD_APDates_EscalationIncludeTheseDays, "equals", lhm_TestCase_Table_Data.get("Escalation_IncludeTheseDays"));
		GuidewireAutomate_Validation("Escalation BusinessCalendarType", APD_APDates_EscalationBusinesscalendarType, "equals", lhm_TestCase_Table_Data.get("Escalation_BusinessCalendarType"));

	}

}
