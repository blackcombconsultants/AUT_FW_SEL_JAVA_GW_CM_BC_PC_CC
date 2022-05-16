package com.pages.Guidewire.PolicyCenter;

import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.pages.Guidewire.Tab_Menu_Navigation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.aventstack.extentreports.ExtentTest;

public class  PC_AccountSummary_Actions extends SeleniumWebDriver_Commands {

	// this is for Actions screen
	static By Menu_Actions   = By.xpath("//div[contains(@id,'MenuActions')]/div[@role='button']/div[2]");
	// add xpath for New Note section
	static By MenuPC_Account_Actions_Create_NewNote = By.xpath("//div[contains(@id,'AccountFileMenuActions_NewNote')]");


	private static By PolicyChangeHeader = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading']");
	private static By PolicyChange_EffectiveDate = By.xpath("//input[contains(@name,'StartPolicyChangeDV-EffectiveDate')]");
	private static By SB_ViewYourPolicy  = By.xpath("//div[contains(@id,'JobCompleteDV-ViewPolicy')]//div[contains(text(),'View your policy')]");
	private static By OutofsequenceMsg = By.xpath("//div[contains(@id,'WarningsPanelSet-0-PanelSet-Warning')]/div[@class='gw-VerbatimWidget--inner']");


	// add xpath for New Document section
	// add xpath for upload documents section
	// add xpath for create from a template section
	// add xpath for New Document section

	// add xpath for New Email Submissions section

	// add xpath for New Submissions section

	// add xpath for New Activity section
	// add xpath for Interviewer section
	// add xpath for New mail section
	// add xpath for Remainder section
	// add xpath for Request section

	// add xpath for Move Policies to this Account section
	// add xpath Rewrite Policies to this Account section
	// add xpath Merge Account into this Account section

	/*
	 * 
	 * Modules
	 * 
	 * void AccountActions_newNote();
	 * 
	 * void AccountActions_newDocument_UploadDocuments();
	 * 
	 * // We elaborate the steps to create new document by uploading documents void AccountActions_newDocument_CreatefromTemplate();
	 * 
	 * // We elaborate the steps to create new document by using the standard template void AccountActions_newEmail();
	 * 
	 * // Elaborate the steps in creating an email void AccountActions_newSubmission(); // Elaborate the steps for starting a new submission from
	 * account summary screen
	 */

	public PC_AccountSummary_Actions(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	public static void AccountActions_newNote() throws Throwable {
		// TODO Auto-generated method stub
		getStaleElement("Actions",Menu_Actions);
		GuidewireAutomate("Actions",Menu_Actions, "clickAndwait", "click");
		GuidewireAutomate("New_Note", MenuPC_Account_Actions_Create_NewNote, "clickAndwait", "click");

	}

	public static void AccountActions_newDocument_UploadDocuments() {
		// TODO Auto-generated method stub

	}

	public static void AccountActions_newDocument_CreatefromTemplate() {
		// TODO Auto-generated method stub

	}

	public static void AccountActions_newEmail() {
		// TODO Auto-generated method stub

	}

	public static void AccountActions_newSubmission() {
		// TODO Auto-generated method stub

	}

	public static void OutoftheSequence() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcelWorkSheet_Fillo("policyChange", strTestCaseName);
		try {
			GuidewireAutomate_Validation("Screen Header", PolicyChangeHeader, "equals", "Start Policy Change");
			for (int i = 1; i <= 3; i++) {
				if (i == 1 || i == 2) {

					GuidewireAutomate("Effective Date", PolicyChange_EffectiveDate, "clearANDsendKeys", lhm_TestCase_Table_Data.get("EffectiveDate"+i));
					PolicyCenter_Resuables.clickButton("Next");
					PolicyCenter_Resuables.clickButton("Quote");
					PolicyCenter_Resuables.clickButton("Issue Policy");
					GuidewireAutomate("View your Policy", SB_ViewYourPolicy, "clickAndwait", "click");
					Tab_Menu_Navigation.pcMenuNavigation("Change Policy");
				}
				if(i==3){
					GuidewireAutomate("Effective Date", PolicyChange_EffectiveDate, "clearANDsendKeys", lhm_TestCase_Table_Data.get("EffectiveDate"+i));
					PolicyCenter_Resuables.clickButton("Next");
					GuidewireAutomate_Handle("alertaccept", "NA");
					GuidewireAutomate_Validation("Warning Message", OutofsequenceMsg, "contains", "Policy Change is an out-of-sequence transaction");

				}

			}


			lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
			lhm_TestCase_Table_Data.clear();

		}catch (Exception e){
			e.printStackTrace();
		}
	}


}
