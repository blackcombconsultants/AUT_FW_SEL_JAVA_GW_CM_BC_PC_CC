package com.pages.Guidewire.PolicyCenter;

import java.util.Date;
import java.util.LinkedHashMap;

import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.pages.Guidewire.GW_CM_PC_BC_CC_TabNavigation;

public class PolicyCenter_Resuables extends SeleniumWebDriver_Commands implements PolicyCenter_Resuables_PO {

	LinkedHashMap<String, String> lhm_TestCase_Table_Data1;

	public PolicyCenter_Resuables(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	/*
	 * --------------------------------------------------------------
	 * searchResultsMessage
	 * --------------------------------------------------------------
	 */
	// checking search result message
	public static String gettext_SearchAccountResultsMessage() throws Throwable {
		return getText_Element(SearchAccountResults_Msg);
	}

	public static void clickButton(String ButtonName) throws Throwable {
		switch (ButtonName) {
		case "Search":
			GuidewireAutomate("Search", Search_Button, "clickAndwait", "");
			break;
		case "Reset":
			GuidewireAutomate("Reset", Reset_Button, "clickAndwait", "");
			break;
		case "OK":
			GuidewireAutomate("OK", OK_Button, "clickAndwait", "");
			break;
		case "Update":
			GuidewireAutomate("Update", Update_Button, "clickAndwait", "");
			break;
		case "Cancel":
			GuidewireAutomate("Cancel", Cancel_Button, "clickAndwait", "");
			break;
		case "Back":
			GuidewireAutomate("Back", Back_Button, "clickAndwait", "");
			break;
		case "Next":
			GuidewireAutomate("Next", Next_Button, "clickAndwait", "");
			break;
		case "Release Lock":
			GuidewireAutomate("Release Lock", ReleaseLock_Button, "clickAndwait", "");
			break;
		case "Edit Policy Transaction":
			GuidewireAutomate("Edit Policy Transaction", EditPolicyTransaction_Button, "clickAndwait", "");
			GuidewireAutomate_Handle("alertaccept", "NA");
			break;
		case "Quote":
			GuidewireAutomate("Quote", Quote_Button, "clickAndwait", "");
			break;
		case "Save Draft":
			GuidewireAutomate("Save Draft", SaveDraft_Button, "clickAndwait", "");
			break;
		case "Versions":
			GuidewireAutomate("Versions", Versions_Button, "clickAndwait", "");
			break;
		case "Start Multi Version":
			GuidewireAutomate("Start Multi Version", Start_MultiVersion_Button, "clickAndwait", "");
			break;
		case "Start Side By Side":
			GuidewireAutomate("Start Side By Side", Start_SideBySide_Button, "clickAndwait", "");
			break;
		case "Bind Options":
			GuidewireAutomate("Bind Options", BindOptions_Button, "click", "");
			break;
		case "Bind Only":
			GuidewireAutomate("Bind Only", BindOptions_BindOnly_Button, "clickAndwait", "");
			GuidewireAutomate_Handle("alertaccept", "NA");
			GuidewireAutomate_Validation("Infobar Job", InfoBar_Job, "equals", "Submission (Bound)");
			break;
		case "Issue Policy":
			GuidewireAutomate("Issue Policy", Bindoptions_IssuePolicy_Button, "clickAndwait", "");
			break;
		case "Withdraw Transaction":
			GuidewireAutomate("Withdraw Transaction", CloseOptions_WithdrawTransaction_Button, "click", "");
			break;
		case "Decline":
			GuidewireAutomate("Decline", CloseOptions_Decline_Button, "clickAndwait", "");
			break;
		case "Not Taken":
			GuidewireAutomate("Not Taken", CloseOptions_NotTaken_Button, "clickAndwait", "");
			break;
		case "Print Quote":
			GuidewireAutomate("Print Quote", PrintQuote_Button, "clickAndwait", "");
			break;
		case "Withdraw Transaction1":
			GuidewireAutomate("Withdraw Transaction", WithdrawTransaction_Button, "clickAndwait", "");
			break;

		default:
			break;
		}
	}

	public static String infoBar(String strLabel) throws Throwable {
		String strInfobar = null;

		switch (strLabel) {
		case "Job":
			strInfobar = getText_Element(InfoBar_Job);
			Selenium_Utils_DataBase.UpdateData_MSExcel_WorkSheet_Fillo("searchValues", "Job", strInfobar);
			break;
		case "SubmissionNumber":
			strInfobar = getText_Element(InfoBar_SubmissionNumber);
			strInfobar = strInfobar.substring(11, strInfobar.length());
			Selenium_Utils_DataBase.UpdateData_MSExcel_WorkSheet_Fillo("searchValues", "SubmissionNumber", strInfobar);
			break;
		case "Workflow":
			strInfobar = getText_Element(InfoBar_Workflow);
			Selenium_Utils_DataBase.UpdateData_MSExcel_WorkSheet_Fillo("searchValues", "Workflow", strInfobar);
			break;
		case "LOB":
			strInfobar = getText_Element(InfoBar_LOB);
			Selenium_Utils_DataBase.UpdateData_MSExcel_WorkSheet_Fillo("searchValues", "LOB", strInfobar);
			break;
		case "EffectiveDate":
			strInfobar = getText_Element(InfoBar_EffectiveDate);
			break;
		case "AccountName":
			strInfobar = getText_Element(InfoBar_AccountName);
			Selenium_Utils_DataBase.UpdateData_MSExcel_WorkSheet_Fillo("searchValues", "AccountName", strInfobar);
			break;
		case "AccountNumber":
			strInfobar = getText_Element(InfoBar_AccountNumber);
			Selenium_Utils_DataBase.UpdateData_MSExcel_WorkSheet_Fillo("searchValues", "AccountNumber", strInfobar);
			break;
		case "PolicyNumber":
			strInfobar = getText_Element(InfoBar_PolicyNumber);
			Selenium_Utils_DataBase.UpdateData_MSExcel_WorkSheet_Fillo("searchValues", "PolicyNumber", strInfobar);
			break;
		case "EditLock":
			strInfobar = getText_Element(InfoBar_EditLock);
			break;
		case "Underwriter":
			strInfobar = getText_Element(InfoBar_Underwriter);
			break;
		default:
			break;
		}
		oExtentTest.log(Status.INFO, " Fetched from Info Bar => " + strLabel + " = " + strInfobar);
		return strInfobar;
	}

	public static void pcTabNavigation_Acct_Search() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("searchValues",
				strTestCaseName);

		strAccountNumber = lhm_TestCase_Table_Data.get("AccountNumber");

		GW_CM_PC_BC_CC_TabNavigation.pcTabNavigation("Acct Search", strAccountNumber);

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();

	}

	public static void pcTabNavigation_Sub_Search() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("searchValues",
				strTestCaseName);

		strSubmissionNumber = lhm_TestCase_Table_Data.get("SubmissionNumber");

		GW_CM_PC_BC_CC_TabNavigation.pcTabNavigation("Sub Search", strSubmissionNumber);

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();

	}

	public static void pcTabNavigation_Policy_Search() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("searchValues",
				strTestCaseName);

		strPolicyNumber = lhm_TestCase_Table_Data.get("PolicyNumber");

		GW_CM_PC_BC_CC_TabNavigation.pcTabNavigation("Policy Search", strPolicyNumber);

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();

	}

	public static void pcTabNavigation_Contact_Search() throws Throwable {
		// TODO Auto-generated method stub

	}

	public static void newSubmissions_Edit() throws Throwable {

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("newSubmissions",
				strTestCaseName);

		/*
		 * Select Producer
		 */
		GuidewireAutomate_Validation("Select Producer", PolicyCenter_Account.PC_SelectProducer, "equals",
				"Select Producer");

		PolicyCenter_Account.organizations(
				Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("organizations", strTestCaseName));
		PolicyCenter_Account.select_SearchResult(
				Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("organizations", strTestCaseName));

		/*
		 * Product Offers
		 */
		GuidewireAutomate_Validation("Product Offers", PolicyCenter_Account.PC_ProductOffers, "equals",
				"Product Offers");

		GuidewireAutomate("Single or Multiple Policies", NS_PO_SingleorMultiplePolicies, "click",
				lhm_TestCase_Table_Data.get("NS_PO_SingleorMultiplePolicies"));
		GuidewireAutomate("Quote Type", NS_PO_QuoteType, "selectByVisibleText",
				lhm_TestCase_Table_Data.get("NS_PO_QuoteType"));
		GuidewireAutomate("Default Base State", NS_PO_DefaultBaseState, "selectByVisibleText",
				lhm_TestCase_Table_Data.get("NS_PO_DefaultBaseState"));
		GuidewireAutomate("Default Effective Date", NS_PO_DefaultEffectiveDate, "clearAndsendKeys",
				lhm_TestCase_Table_Data.get("NS_PO_DefaultEffectiveDate"));

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();

	}

	public static void newSubmissions_Verify() throws Throwable {

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("newSubmissions",
				strTestCaseName);

		/*
		 * Select Producer
		 */
		GuidewireAutomate_Validation("Select Producer", PolicyCenter_Account.PC_SelectProducer, "equals",
				"Select Producer");

		/*
		 * Product Offers
		 */
		GuidewireAutomate_Validation("Organization", PolicyCenter_Account.CA_SP_Organization, "valueEquals",
				lhm_TestCase_Table_Data.get("NS_PO_Organization"));
		GuidewireAutomate_Validation("Producer Code", PolicyCenter_Account.CA_SP_ProducerCode,
				"FirstSelectedOptionEquals", lhm_TestCase_Table_Data.get("NS_PO_ProducerCode"));

		GuidewireAutomate_Validation("Quote Type", NS_PO_QuoteType, "FirstSelectedOptionEquals",
				lhm_TestCase_Table_Data.get("NS_PO_QuoteType"));
		GuidewireAutomate_Validation("Default Base State", NS_PO_DefaultBaseState, "FirstSelectedOptionEquals",
				lhm_TestCase_Table_Data.get("NS_PO_DefaultBaseState"));
		GuidewireAutomate_Validation("Default Effective Date", NS_PO_DefaultEffectiveDate, "valueEquals",
				sdf_ddMMMyyyy_GW1.format(new Date()));

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();

	}

	public static void offering() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("offering", strTestCaseName);

		GuidewireAutomate_Validation("Screen Header", Offerings_Header, "equals", "Offerings");
		GuidewireAutomate("Offering Selection", Of_OfferingSelection, "selectByVisibleText",
				lhm_TestCase_Table_Data.get("Of_OfferingSelection"));

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	public static void RiskApprovalManger() throws Throwable {
		// TODO Auto-generated method stub

	}

	public static void startPolicyChange() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("PolicyChange",
				strTestCaseName);
		GuidewireAutomate_Validation("Screen Header", SPC_ScreenHeader, "equals", "Start Policy Change");
		GuidewireAutomate("EffectiveDate", SPC_EffectiveDate, "clearANDsendKeys",
				lhm_TestCase_Table_Data.get("PA_PC_EffectiveDate"));

		GuidewireAutomate("Description", SPC_Description, "clearANDsendKeys",
				lhm_TestCase_Table_Data.get("PA_PC_Description"));

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	public static void startCancellationForPolicy() throws Throwable {

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("CancelPolicy",
				strTestCaseName);

		GuidewireAutomate("Source", SCFP_Source, "selectByVisibleText", lhm_TestCase_Table_Data.get("PA_CP_Source"));
		Thread.sleep(2000);
		GuidewireAutomate("Reason", SCFP_Reason, "selectByVisibleTextAndwait",
				lhm_TestCase_Table_Data.get("PA_CP_Reason"));
		GuidewireAutomate("ReasonDescription", SCFP_ReasonDescription, "clearANDsendKeys",
				lhm_TestCase_Table_Data.get("PA_CP_Reason _Description"));
		GuidewireAutomate_Validation("RefundMethod", SCFP_RefundMethod, "equals",
				lhm_TestCase_Table_Data.get("PA_CP_Refund_Method"));

		GuidewireAutomate("StartCancellation", StartCancellation_Button, "click", "");

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();

	}

	public static void Confirmation() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("Confirmation",
				strTestCaseName);
		GuidewireAutomate_Validation("Screen Header", PolicyCenter_Resuables_PO.Screen_Header, "equals",
				"Confirmation");
		GuidewireAutomate_Validation("PolicyNumber", SCFP_PolicyNumber, "equals",
				lhm_TestCase_Table_Data.get("PA_CP_PolicyNumber"));
		GuidewireAutomate_Validation("Primary_Named_Insured", SCFP_Primary_Named_Insured, "equals",
				lhm_TestCase_Table_Data.get("PA_CP_Primary_Name_ Insured"));
		GuidewireAutomate_Validation("Address", SCFP_Address, "equals", lhm_TestCase_Table_Data.get("PA_CP_Address"));
		GuidewireAutomate_Validation("County", SCFP_County, "equals", lhm_TestCase_Table_Data.get("PA_CP_County"));
		GuidewireAutomate_Validation("Address_Type", SCFP_Address_Type, "equals",
				lhm_TestCase_Table_Data.get("PA_CP_Address _Type"));
		GuidewireAutomate_Validation("Address_Description", SCFP_Address_Description, "equals",
				lhm_TestCase_Table_Data.get("PA_CP_Address Description"));

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();

	}

	public static void CancellationBound() throws Throwable {
		// TODO Auto-generated method stub

	}

	public static void startReinstatement_PolicyDetails() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("StartReinstatement",
				strTestCaseName);

		GuidewireAutomate_Validation("Screen Header", PolicyCenter_Resuables_PO.Screen_Header, "equals",
				"Start Reinstatement");
		GuidewireAutomate_Validation("PolicyDetails", SR_PolicyDetails, "equals", "Policy Details");
		GuidewireAutomate_Validation("TermType", SR_PD_TermType, "equals",
				lhm_TestCase_Table_Data.get("PA_SR_Term _Type"));
		GuidewireAutomate_Validation("TermNumber", SR_PD_TermNumber, "equals",
				lhm_TestCase_Table_Data.get("PA_SR_Term _Number"));
		GuidewireAutomate_Validation("EffectiveDate", SR_PD_EffectiveDate, "equals",
				lhm_TestCase_Table_Data.get("PA_SR_Effective_Date"));
		GuidewireAutomate_Validation("ExpirationDate", SR_PD_ExpirationDate, "equals",
				lhm_TestCase_Table_Data.get("PA_SR_Expiration_Date"));
		GuidewireAutomate_Validation("WrittenDate", SR_PD_WrittenDate, "equals",
				lhm_TestCase_Table_Data.get("PA_SR_Written_Date"));

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();

	}

	public static void startReinstatement_AffinityGroup() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("StartReinstatement",
				strTestCaseName);

		GuidewireAutomate_Validation("AffinityGroup", SR_AffinityGroup, "equals", "Affinity Group");
		GuidewireAutomate_Validation("ReinstatementDate", SR_AG_ReinstatementDate, "equals",
				lhm_TestCase_Table_Data.get("PA_SR_Effective_Date_of_Reinstatement"));
		GuidewireAutomate("ReasonCode", SR_AG_ReasonCode, "selectByVisibleTextAndwait",
				lhm_TestCase_Table_Data.get("PA_SR_Reason"));
		GuidewireAutomate("ReasonDescription", SR_AG_ReasonDescription, "clearANDsendKeys",
				lhm_TestCase_Table_Data.get("PA_SR_Reason_Description"));

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();

	}

}
