package com.pages.Guidewire.PolicyCenter.BusinessOwners;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.LinkedHashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.GW_Base;
import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;
import com.pages.Guidewire.Tab_Menu_Navigation;
import com.pages.Guidewire.PolicyCenter.PC_Account;
import com.pages.Guidewire.PolicyCenter.PC_AccountSummary;
import com.pages.Guidewire.PolicyCenter.PC_Bound;
import com.pages.Guidewire.PolicyCenter.PC_PolicySummary;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Resuables;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Resuables_PO;

public class BO_Resuables extends SeleniumWebDriver_Commands {

	public BO_Resuables(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}


	static By NewNote_Topic                      = By.xpath("//select[@name='NewNoteWorksheet-NewNoteScreen-NewNoteDV-Topic']");
	static By NewNote_Text                       = By.xpath("//textarea[@name='NewNoteWorksheet-NewNoteScreen-NewNoteDV-Text']");
	static By NotesScreen                        = By.xpath("//div[@id='PolicyFile-MenuLinks-PolicyFile_PolicyFile_Notes']//div[@class='gw-label gw-hasIcon']");
	static By NotesDetails                       = By.xpath("//div[@id='PolicyFile_Notes-Policy_NotesScreen-NotesLV-0-NoteRowSet-Body']");
	static By NonRenewReason                     = By.xpath("//select[contains(@name,'NonRenewReason')]");
	static By NonRenewExplanation_AddButton      = By.xpath("//div[contains(@id,'SelectedNonRenewalExplanationsLV_tb-Add')]//div[@role='button']");
	static By Select_NonRenewExplanationCheckbox = By.xpath("//input[contains(@name,'NonRenewalExplanationPatternsLV-0-_Checkbox')]");
	static By PreRenewDirection                  = By.xpath("//select[@name='PreRenewalDirectionPage-PreRenewalDirectionScreen-PreRenewalDirection']");
	static By PreRenewReason                     = By.xpath("//select[@name='PreRenewalDirectionPage-PreRenewalDirectionScreen-NonRenewReason']");
	static By PreRenewText                       = By.xpath("//textarea[@name='PreRenewalDirectionPage-PreRenewalDirectionScreen-Text']");
	static By StartReinstatementHeader           = By.xpath("//div[contains(@id,'ReinstatePolicyScreen-ttlBar')]//div[@role='heading']");
	static By AG_Reason                          = By.xpath("//select[@name='ReinstatementWizard-ReinstatementWizard_ReinstatePolicyScreen-ReinstatePolicyDV-ReasonCode']");
	static By LOB_BusinessOwners                 = By.xpath("//div[contains(@id,'ProductSelectionLV-0-addSubmission')]");
	static By Screen_Header                      = By.xpath("//div[@class='gw-TitleBar--title' and @role='heading']");
	// Action
	static By Action                    = By.xpath("//div[@id='gw-west-panel--top-section']/div[contains(@id,'MenuActions')]//div[@role='button']");
	static By Action_ReturnPolicyCenter = By.xpath("//div[contains(@id,'ReturnToApp')]//div[text()='Return to PolicyCenter']");
	static By RenewalRun                = By.xpath("//div[@id='BatchProcessInfo-BatchProcessScreen-BatchProcessesLV-39-RunBatchWithoutNotify']");
	static By Screen_HeaderAddress      = By.xpath("//div[contains(@id,'LinkAddressMenu_Input')]//div[@class='gw-label gw-boldLabel']");
	static By EA_Address1               = By.xpath("//input[contains(@name,'GlobalAddressInputSet-AddressLine1')]");
	static By SPC_Header                = By.xpath("//div[@id='StartPolicyChange-StartPolicyChangeScreen-ttlBar']//div[@role='heading']");
	static By SPC_EffectiveDate         = By.xpath("//input[@name='StartPolicyChange-StartPolicyChangeScreen-StartPolicyChangeDV-EffectiveDate']");
	static By SPC_Description           = By.xpath("//input[@name='StartPolicyChange-StartPolicyChangeScreen-StartPolicyChangeDV-Description']");
	static By SPC_NextButton            = By.xpath("//div[contains(@id,'NewPolicyChange')]//div[@role='button']");
	static By Infobar_PolicyNumberLink  = By.xpath("//div[contains(@id,'JobWizardInfoBar-PolicyNumber')]//div[@class='gw-label gw-infoValue']");
	static By OutOfsequence_Error       = By.xpath("//div[contains(@id,'-Warning')]//div[@class='gw-PanelIteratorEntryWidget gw-styleTag--PanelRefWidget']");
	static By PolicyReviewScreen        = By.xpath("//div[@id='PolicyChangeWizard-PolicyReview']//div[@class='gw-label']");
	static By PR_ChangeConflicts        = By.xpath("//div[contains(@id,'DifferencesScreen-OOSConflictsTab')]//div[@class='gw-label']");
	static By Conflicts_OverrideAll     = By.xpath("//div[contains(@id,'ConflictTableLV_tb-OverrideAll')]//div[@role='button']");
	static By Conflicts_Submit          = By.xpath("//div[contains(@id,'OOSConflictPanelSet-ConflictTableLV-Done')]");
	static By CanCellation_Status       = By.xpath("//div[contains(@id,'CompletedPolicyTransactionsListViewTile_LV-0-Type')]//div[@class='gw-value-readonly-wrapper']");
	static By CPT_Header                = By.xpath("//div[contains(@id,'CompletedPolicyTransactionsListViewTile')]//span[@class='gw-TitleText']");
	static By CPT_Status                = By.xpath("//div[contains(@id,'CompletedPolicyTransactionsListViewTile_LV-TypeHeader')]//div[@class='gw-label']");

	/*
	 * Reinstatement
	 */
	static By Reinstatement_PolicyDetails  = By.xpath("//div[contains(@id,'ReinstatePolicyDV-PolicyInfoInputSet-0')]//div[@class='gw-label gw-boldLabel']");
	static By Reinstatement_TermType       = By.xpath("//div[contains(@id,'ReinstatePolicyDV-PolicyInfoInputSet-TermType')]//div[@class='gw-label'and text()='Annual']");
	static By Reinstatement_TermNumber     = By.xpath("//div[contains(@id,'ReinstatePolicyDV-PolicyInfoInputSet-TermNumber')]//div[@class='gw-value-readonly-wrapper']");
	static By Reinstatement_EffectiveDate  = By.xpath("//div[contains(@id,'PolicyInfoInputSet-EffectiveDate')]//div[@class='gw-value-readonly-wrapper']");
	static By Reinstatement_WrittenDate    = By.xpath("//div[contains(@id,'PolicyInfoInputSet-WrittenDate')]//div[@class='gw-value-readonly-wrapper']");
	static By Reinstatement_AffinityGroup  = By.xpath("//div[contains(@id,'ReinstatePolicyDV-PolicyInfoInputSet-2')]//div[@class='gw-label gw-boldLabel']");
	static By AG_Name                      = By.xpath("//div[contains(@id,'AffinityGroup_Input')]//div[@class='gw-label']");
	static By AG_EDOfReinstatement         = By.xpath("//div[contains(@id,'ReinstatePolicyScreen-ReinstatePolicyDV-ReinstatementDate')]//div[@class='gw-value-readonly-wrapper']");
	static By AG_ReasonDesription          = By.xpath("//textarea[contains(@name,'ReinstatePolicyDV-ReasonDescription')]");
	static By Reinstatement_ExpirationDate = By.xpath("//div[contains(@id,'ExpirationDate')]//div[@class='gw-value-readonly-wrapper']");
	static By EditAccount_Header           = By.xpath("//div[contains(@id,'EditAccountPopup-EditAccountScreen-ttlBar')]//div[@role='heading']");

	// Edit Account-------------------------------------------------

	static By EA_Address2    = By.xpath("//input[contains(@name,'GlobalAddressInputSet-AddressLine2')]");
	static By EA_country     = By.xpath("//select[contains(@name,'GlobalAddressInputSet-Country')]");
	static By EA_Address3    = By.xpath("//input[contains(@name,'GlobalAddressInputSet-AddressLine3')]");
	static By EA_City        = By.xpath("//input[contains(@name,'GlobalAddressInputSet-City')]");
	static By EA_County      = By.xpath("//input[contains(@name,'GlobalAddressInputSet-County')]");
	static By EA_State       = By.xpath("//select[contains(@name,'GlobalAddressInputSet-State')]");
	static By EA_ZipCode     = By.xpath("//input[contains(@name,'GlobalAddressInputSet-PostalCode')]");
	static By EA_AddressType = By.xpath("//select[contains(@name,'EditAccountPopup-EditAccountScreen-AddressType')]");
	static By AS_Edit_Button = By.xpath("//div[contains(@id,'EditAccount')]//div[@role='menuitem']");

	private static By PrimaryNamedInsured_County             = By.xpath("//div[contains(@id,'GlobalAddressInputSet-County')]//div[contains(@class,'gw-value-readonly-wrapper')]");
	private static By PrimaryNamedInsured_AddressType        = By.xpath("//div[contains(@id,'AddressType') and contains(@class,'gw-ValueWidget')]//div[contains(@class,'gw-label')]");
	private static By PrimaryNamedInsured_AddressDescription = By.xpath("//div[contains(@id,'AddressDescription') and contains(@class,'gw-ValueWidget')]//div[contains(@class,'gw-value-readonly-wrapper')]");
	private static By PrimaryNamedInsured_PolicyAddress      = By.xpath("//div[contains(@id,'GlobalAddressInputSet-AddressSummary')]//div[contains(@class,'gw-value-readonly-wrapper')]");

	/*--------------------------------------------------------------------------------------
	 * Methods - Data
	 * --------------------------------------------------------------------------------------
	 */

	public static LinkedHashMap<String, String> getData_BusinessOwners(String strTable) throws Throwable {

		return Selenium_Utils_DataBase.getData_MSExcel_WorkBook_WorkSheet_Fillo(pTestDataFile_BusinessOwners, strTable, strTestCaseName);

	}

	public static LinkedHashMap<String, String> getData_Row_BusinessOwners(String strTable, int SecondKey) throws Throwable {

		return Selenium_Utils_DataBase.getData_MSExcel_WorkBook_WorkSheet_DataSet_Fillo(pTestDataFile_BusinessOwners, strTable, strTestCaseName, SecondKey);

	}

	public static void UpdateData_BusinessOwners(String strTable, String strColumn, String strValue) throws Throwable {

		Selenium_Utils_DataBase.UpdateData_MSExcel_WorkSheet_Column_Fillo(pTestDataFile_BusinessOwners, strTable, strColumn, strValue);

	}

	/*
	 * Owner:Rahul Dixit
	 */
	public static void NewNoteDetails() throws Throwable {
		try {

			lhm_TestCase_Table_Data = getData_BusinessOwners("Notes");
			getStaleElement("Topic", NewNote_Topic);
			GuidewireAutomate("Topic", NewNote_Topic, "selectByVisibleTextAndwait", lhm_TestCase_Table_Data.get("Topic"));
			GuidewireAutomate("Text", NewNote_Text, "clearANDsendKeys", lhm_TestCase_Table_Data.get("Text"));

		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}

	}

	/*
	 * Owner:Rahul Dixit Date : 30-March-2022
	 */
	public static void InfoBarPolicyLink() throws Throwable {
		try {

			GuidewireAutomate("Policy Number Link", Infobar_PolicyNumberLink, "clickAndwait", "clickAndwait");

		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}

	}

	/*
	 * Owner:Rahul Dixit
	 */
	public static void NewNoteVerify() throws Throwable {
		try {

			GuidewireAutomate("Notes Screen", NotesScreen, "clickAndwait", "clickAndwait");
			GuidewireAutomate_Validation("Notes Details", NotesDetails, "contains", "Non Renew");
		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}

	}

	/*
	 * Owner:Rahul Dixit
	 */
	public static void StartReinstatementDetails() throws Throwable {
		try {

			lhm_TestCase_Table_Data = getData_BusinessOwners("Reinstatement");

			GuidewireAutomate_Validation("Start Reinstatement Header", StartReinstatementHeader, "equals", "Start Reinstatement");
			GuidewireAutomate_Validation("Policy Details", Reinstatement_PolicyDetails, "equals", "Policy Details");
			GuidewireAutomate_Validation("Term Type", Reinstatement_TermType, "equals", lhm_TestCase_Table_Data.get("TermType"));
			GuidewireAutomate_Validation("Term Number", Reinstatement_TermNumber, "equals", lhm_TestCase_Table_Data.get("TermNumber"));
			GuidewireAutomate_Validation("Effective Date", Reinstatement_EffectiveDate, "equals", lhm_TestCase_Table_Data.get("Effective Date"));
			GuidewireAutomate_Validation("Expiration Date", Reinstatement_ExpirationDate, "equals", lhm_TestCase_Table_Data.get("Expiration Date"));
			GuidewireAutomate_Validation("Written Date", Reinstatement_WrittenDate, "equals", lhm_TestCase_Table_Data.get("Written Date"));
			GuidewireAutomate_Validation("Affinity Group", Reinstatement_AffinityGroup, "equals", "Affinity Group");
			GuidewireAutomate_Validation("AG_Name", AG_Name, "equals", lhm_TestCase_Table_Data.get("AG_Name"));
			GuidewireAutomate_Validation("Effective Date of Reinstatement", AG_EDOfReinstatement, "equals", lhm_TestCase_Table_Data.get("AG_EDOfReinstatement"));
			getStaleElement("AG_Reason", AG_Reason);
			GuidewireAutomate("AG_Reason", AG_Reason, "selectByVisibleText", lhm_TestCase_Table_Data.get("AG_Reason"));
			GuidewireAutomate("AG_ReasonDescription", AG_ReasonDesription, "clearANDsendKeys", lhm_TestCase_Table_Data.get("AG_ReasonDesription"));
			// getStaleElement();
		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}

	}

	/*
	 * Owner : Rahul Dixit Date : 25-March-2022
	 */
	public static void RobotKey() throws Throwable {

		try {
			Robot oRobot = new Robot();

			oRobot.keyPress(KeyEvent.VK_ALT);
			oRobot.keyPress(KeyEvent.VK_SHIFT);
			oRobot.keyPress(KeyEvent.VK_T);

			// Release key Ctrl+Shift+i
			oRobot.keyRelease(KeyEvent.VK_T);
			oRobot.keyRelease(KeyEvent.VK_SHIFT);
			oRobot.keyRelease(KeyEvent.VK_ALT);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;

		}
	}
	/*
	 * Owner : Rahul Dixit Date : 25-March-2022
	 */
	public static void RunBatch_Renewal() throws Throwable {

		try {
			getStaleElement("Screen Hearder", Screen_Header);
			GuidewireAutomate_Validation("Screen Header", Screen_Header, "equals", "Batch Process Info");
			GuidewireAutomate("Renewal Run", RenewalRun, "clickAndwait", "clickAndwait");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;

		}

	}

	/*
	 * Owner : Rahul Dixit Date : 29-March-2022
	 */
	public static void EditAccount_Address() throws Throwable {

		try {
			lhm_TestCase_Table_Data = getData_BusinessOwners("PolicyInfo");
			getStaleElement("Screen Header", PolicyCenter_Resuables_PO.Screen_Header);
			GuidewireAutomate_Validation("Screen Header", PolicyCenter_Resuables_PO.Screen_Header, "contains", "Account Summary");
			getStaleElement("AS_Edit_Button", AS_Edit_Button);
			GuidewireAutomate("Edit Button", AS_Edit_Button, "clickAndwait", "clickAndwait");
			GuidewireAutomate_Validation("Screen Header", EditAccount_Header, "equals", "Edit Account");
			GuidewireAutomate_Validation("Country", EA_country, "contains", "United States");
			GuidewireAutomate("Address1", EA_Address1, "clearANDsendKeys", lhm_TestCase_Table_Data.get("PrimaryNI_PolicyAddress"));
			// GuidewireAutomate_Validation("Address2",EA_Address2, "equals","South Avenue");
			// GuidewireAutomate_Validation("Address3",EA_Address3, "equals","DownTown");
			GuidewireAutomate_Validation("State", EA_State, "contains", lhm_TestCase_Table_Data.get("PI_PD_BaseState"));

		} catch (Exception e) {
			e.printStackTrace();
			throw e;

		}

	}

	public static void submissionProcess(String Account, String Job) throws Throwable {

		String strEditLock;

		switch (Account) {
			case "New Account" :
				Tab_Menu_Navigation.pcTabNavigation("New Account", "NA");
				PC_Account.createCompanyAccount();

				break;
			case "Account Search" :
				PolicyCenter_Resuables.pcTabNavigation_Acct_Search();
				PC_AccountSummary.detail_Verify();

				break;
			case "Rewrite" :

				break;

			default :
				throw new IOException("No support for Account : " + Account);
		}

		switch (Job) {
			case "Save Draft" :

				// Create Company Account ----------------------------------------------
				PC_Account.createCompanyAccount();

				// Account Summary Details Verify-------------------------------------
				PC_AccountSummary.detail_Verify();

				// New Submission & Select LOB----------------------------------------
				Tab_Menu_Navigation.pcMenuNavigation("New Submission");
				BO_Offering.newSubmission_SelectLOB_Businessowners();

				// Fetching Policy Info ------------------------------------------------
				strAccountName = PolicyCenter_Resuables.infoBar("AccountName");
				strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
				strSubmissionNumber = PolicyCenter_Resuables.infoBar("SubmissionNumber");

				// Offering Screen----------------------------------
				BO_Offering.offering();
				BO_Offering.BOPOfferingQuestions();
				PolicyCenter_Resuables.clickButton("Next");

				// Qualification Screen---------------------------------------------
				BO_Qualification.qualification();
				PolicyCenter_Resuables.clickButton("Next");

				// Policy Info Screen-----------------------------------------------
				BO_PolicyInfo.dateQuoteNeeded();
				BO_PolicyInfo.primaryNamedInsured();
				BO_PolicyInfo.OrganizationType();

				BO_PolicyInfo.affinityGroup();
				BO_PolicyInfo.pi_OfficialID();
				BO_PolicyInfo.policyDetails();
				BO_PolicyInfo.producerOfRecord();
				PolicyCenter_Resuables.clickButton("Next");

				// BusinessOwnersLine Screen--------------------------------------------------
				BO_BusinessOwners_Line.Businessowners();
				BO_BusinessOwners_Line.PropertyCoverage();
				BO_BusinessOwners_Line.OtherIncludedCoverages();
				BO_BusinessOwners_Line.AdditionalCoveragesTab();
				PolicyCenter_Resuables.clickButton("Next");

				// Locations Screen---------------------------------------------------------
				BO_Locations.Locations_Details();
				PolicyCenter_Resuables.clickButton("Next");

				// Building Screen----------------------------------------------------------------
				BO_Building.Buildings();
				BO_Building.buildingDetails();
				BO_Building.ClassCodeSearch();
				BO_Building.BuildingConstruction();
				BO_Building.BuildingImprovement();
				BO_Building.BurglarAlarm();
				PolicyCenter_Resuables.clickButton("Next");

				// Modifiers Screen-----------------------------------------------------------------
				BO_Modifiers.RatingInputs();
				PolicyCenter_Resuables.clickButton("Next");

				// Risk Analysis Screen---------------------------------------------------------
				BO_RiskAnalysis.button_Verify();
				PolicyCenter_Resuables.clickButton("Next");

				BO_PolicyReview.PR_PrimaryInsured();
				PolicyCenter_Resuables.clickButton("Quote");

				// Quote Screen------------------------------------------------------------------
				BO_Quote.quoteDetails();
				PolicyCenter_Resuables.clickButton("Next");

				// Forms Screen------------------------------------------------------------------
				BO_Forms.pa_forms();
				BO_Forms.forms_validate("VERIFY");
				BO_Forms.description_validate("VERIFY");
				PolicyCenter_Resuables.clickButton("Next");

				// Payment Screen--------------------------------------------------------------
				BO_Payment.premiumSummary();
				BO_Payment.payments();
				BO_Payment.invoicing();
				BO_Payment.billing();

				PolicyCenter_Resuables.clickButton("Save Draft");

				strJob = PolicyCenter_Resuables.infoBar("Job");
				strLOB = PolicyCenter_Resuables.infoBar("LOB");
				strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
				strAccountName = PolicyCenter_Resuables.infoBar("AccountName");
				strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
				strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");

				break;

			case "Quote" :

				// New Submission & Select LOB----------------------------------------
				Tab_Menu_Navigation.pcMenuNavigation("New Submission");
				BO_Offering.newSubmission_SelectLOB_Businessowners();

				// Fetching Policy Info ------------------------------------------------
				strAccountName = PolicyCenter_Resuables.infoBar("AccountName");
				strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
				strSubmissionNumber = PolicyCenter_Resuables.infoBar("SubmissionNumber");

				// Offering Screen----------------------------------
				BO_Offering.offering();
				BO_Offering.BOPOfferingQuestions();
				PolicyCenter_Resuables.clickButton("Next");

				// Qualification Screen---------------------------------------------
				BO_Qualification.qualification();
				PolicyCenter_Resuables.clickButton("Next");

				// Policy Info Screen-----------------------------------------------
				BO_PolicyInfo.dateQuoteNeeded();
				BO_PolicyInfo.primaryNamedInsured();
				BO_PolicyInfo.OrganizationType();

				BO_PolicyInfo.affinityGroup();
				BO_PolicyInfo.pi_OfficialID();
				BO_PolicyInfo.policyDetails();
				BO_PolicyInfo.producerOfRecord();
				PolicyCenter_Resuables.clickButton("Next");

				// BusinessOwnersLine Screen--------------------------------------------------
				BO_BusinessOwners_Line.Businessowners();
				BO_BusinessOwners_Line.PropertyCoverage();
				BO_BusinessOwners_Line.OtherIncludedCoverages();
				BO_BusinessOwners_Line.AdditionalCoveragesTab();
				PolicyCenter_Resuables.clickButton("Next");

				// Locations Screen---------------------------------------------------------
				BO_Locations.Locations_Details();
				PolicyCenter_Resuables.clickButton("Next");

				// Building Screen----------------------------------------------------------------
				BO_Building.Buildings();
				BO_Building.buildingDetails();
				BO_Building.ClassCodeSearch();
				BO_Building.BuildingConstruction();
				BO_Building.BuildingImprovement();
				BO_Building.BurglarAlarm();
				PolicyCenter_Resuables.clickButton("Next");

				// Modifiers Screen-----------------------------------------------------------------
				BO_Modifiers.RatingInputs();
				PolicyCenter_Resuables.clickButton("Next");

				// Risk Analysis Screen---------------------------------------------------------
				BO_RiskAnalysis.button_Verify();
				PolicyCenter_Resuables.clickButton("Next");

				BO_PolicyReview.PR_PrimaryInsured();
				PolicyCenter_Resuables.clickButton("Quote");

				// Quote Screen------------------------------------------------------------------
				BO_Quote.quoteDetails();

				strJob = PolicyCenter_Resuables.infoBar("Job");
				strLOB = PolicyCenter_Resuables.infoBar("LOB");
				strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
				strAccountName = PolicyCenter_Resuables.infoBar("AccountName");
				strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
				strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");
				strEditLock = PolicyCenter_Resuables.infoBar("EditLock");
				break;

			case "Bind Only" :

				// New Submission & Select LOB----------------------------------------
				Tab_Menu_Navigation.pcMenuNavigation("New Submission");
				BO_Offering.newSubmission_SelectLOB_Businessowners();

				// Fetching Policy Info ------------------------------------------------
				strAccountName = PolicyCenter_Resuables.infoBar("AccountName");
				strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
				strSubmissionNumber = PolicyCenter_Resuables.infoBar("SubmissionNumber");

				// Offering Screen----------------------------------
				BO_Offering.offering();
				BO_Offering.BOPOfferingQuestions();
				PolicyCenter_Resuables.clickButton("Next");

				// Qualification Screen---------------------------------------------
				BO_Qualification.qualification();
				PolicyCenter_Resuables.clickButton("Next");

				// Policy Info Screen-----------------------------------------------
				BO_PolicyInfo.dateQuoteNeeded();
				BO_PolicyInfo.primaryNamedInsured();
				BO_PolicyInfo.OrganizationType();

				BO_PolicyInfo.affinityGroup();
				BO_PolicyInfo.pi_OfficialID();
				BO_PolicyInfo.policyDetails();
				BO_PolicyInfo.producerOfRecord();
				PolicyCenter_Resuables.clickButton("Next");

				// BusinessOwnersLine Screen--------------------------------------------------
				BO_BusinessOwners_Line.Businessowners();
				BO_BusinessOwners_Line.PropertyCoverage();
				BO_BusinessOwners_Line.OtherIncludedCoverages();
				BO_BusinessOwners_Line.AdditionalCoveragesTab();
				PolicyCenter_Resuables.clickButton("Next");

				// Locations Screen---------------------------------------------------------
				BO_Locations.Locations_Details();
				PolicyCenter_Resuables.clickButton("Next");

				// Building Screen----------------------------------------------------------------
				BO_Building.Buildings();
				BO_Building.buildingDetails();
				BO_Building.ClassCodeSearch();
				BO_Building.BuildingConstruction();
				BO_Building.BuildingImprovement();
				BO_Building.BurglarAlarm();
				PolicyCenter_Resuables.clickButton("Next");

				// Modifiers Screen-----------------------------------------------------------------
				BO_Modifiers.RatingInputs();
				PolicyCenter_Resuables.clickButton("Next");

				// Risk Analysis Screen---------------------------------------------------------
				BO_RiskAnalysis.button_Verify();
				PolicyCenter_Resuables.clickButton("Next");

				BO_PolicyReview.PR_PrimaryInsured();
				PolicyCenter_Resuables.clickButton("Quote");

				// Quote Screen------------------------------------------------------------------
				BO_Quote.quoteDetails();
				PolicyCenter_Resuables.clickButton("Next");

				// Forms Screen------------------------------------------------------------------
				BO_Forms.pa_forms();
				BO_Forms.forms_validate("VERIFY");
				BO_Forms.description_validate("VERIFY");
				PolicyCenter_Resuables.clickButton("Next");

				// Payment Screen--------------------------------------------------------------
				BO_Payment.premiumSummary();
				BO_Payment.payments();
				BO_Payment.invoicing();
				BO_Payment.billing();

				PolicyCenter_Resuables.clickButton("Bind Options");
				PolicyCenter_Resuables.clickButton("Bind Only");
				strJob = PolicyCenter_Resuables.infoBar("Job");
				strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");

				PC_Bound.ViewYourPolicy();
				PC_PolicySummary.detail_Verify();
				PC_PolicySummary.account_Verify();

				break;

			case "Issue Policy" :

				// New Submission & Select LOB----------------------------------------
				Tab_Menu_Navigation.pcMenuNavigation("New Submission");
				BO_Offering.newSubmission_SelectLOB_Businessowners();

				// Fetching Policy Info ------------------------------------------------
				strAccountName = PolicyCenter_Resuables.infoBar("AccountName");
				strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
				strSubmissionNumber = PolicyCenter_Resuables.infoBar("SubmissionNumber");

				// Offering Screen----------------------------------
				BO_Offering.offering();
				BO_Offering.BOPOfferingQuestions();
				PolicyCenter_Resuables.clickButton("Next");

				// Qualification Screen---------------------------------------------
				BO_Qualification.qualification();
				PolicyCenter_Resuables.clickButton("Next");

				GW_Base.strAccountName = PolicyCenter_Resuables.infoBar("AccountName");

				// Policy Info Screen-----------------------------------------------
				BO_PolicyInfo.dateQuoteNeeded();
				BO_PolicyInfo.primaryNamedInsured();
				BO_PolicyInfo.OrganizationType();

				BO_PolicyInfo.affinityGroup();
				BO_PolicyInfo.pi_OfficialID();
				BO_PolicyInfo.policyDetails();
				BO_PolicyInfo.producerOfRecord();
				PolicyCenter_Resuables.clickButton("Next");

				// BusinessOwnersLine Screen--------------------------------------------------
				BO_BusinessOwners_Line.Businessowners();
				BO_BusinessOwners_Line.PropertyCoverage();
				BO_BusinessOwners_Line.OtherIncludedCoverages();
				BO_BusinessOwners_Line.AdditionalCoveragesTab();
				PolicyCenter_Resuables.clickButton("Next");

				// Locations Screen---------------------------------------------------------
				BO_Locations.Locations_Details();
				PolicyCenter_Resuables.clickButton("Next");

				// Building Screen----------------------------------------------------------------
				BO_Building.Buildings();
				BO_Building.buildingDetails();
				BO_Building.ClassCodeSearch();
				BO_Building.BuildingConstruction();
				BO_Building.BuildingImprovement();
				BO_Building.BurglarAlarm();
				PolicyCenter_Resuables.clickButton("Next");

				// Modifiers Screen-----------------------------------------------------------------
				BO_Modifiers.RatingInputs();
				PolicyCenter_Resuables.clickButton("Next");

				// Risk Analysis Screen---------------------------------------------------------
				BO_RiskAnalysis.button_Verify();
				PolicyCenter_Resuables.clickButton("Next");

				BO_PolicyReview.PR_PrimaryInsured();
				PolicyCenter_Resuables.clickButton("Quote");

				// Quote Screen------------------------------------------------------------------
				BO_Quote.quoteDetails();
				PolicyCenter_Resuables.clickButton("Next");

				// Forms Screen------------------------------------------------------------------
				BO_Forms.pa_forms();
				BO_Forms.forms_validate("VERIFY");
				BO_Forms.description_validate("VERIFY");
				PolicyCenter_Resuables.clickButton("Next");

				// Payment Screen--------------------------------------------------------------
				BO_Payment.premiumSummary();
				BO_Payment.payments();
				BO_Payment.invoicing();
				BO_Payment.billing();

				PolicyCenter_Resuables.clickButton("Bind Options");
				PolicyCenter_Resuables.clickButton("Issue Policy");
				strJob = PolicyCenter_Resuables.infoBar("Job");
				strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");

				PC_Bound.ViewYourPolicy();
				PC_PolicySummary.detail_Verify();
				PC_PolicySummary.account_Verify();

				break;

			case "Rewrite" :

				break;

			default :
				throw new IOException("No support for Job : " + Job);
		}

	}
	/*
	 * Owner : Rahul Dixit Date : 29-March-2022
	 */
	public static void StartPolicyChange_Details() throws Throwable {

		try {

			lhm_TestCase_Table_Data = getData_BusinessOwners("ChangePolicy");
			GuidewireAutomate_waitForElement(SPC_Header, "visibilityOfElementLocated", "");
			getStaleElement("SPC_Header", SPC_Header);

			GuidewireAutomate_Validation("Start Policy Change Header", SPC_Header, "equals", "Start Policy Change");
			getStaleElement("Effective Date", SPC_EffectiveDate);
			GuidewireAutomate("Effective Date", SPC_EffectiveDate, "clearANDsendKeys", lhm_TestCase_Table_Data.get("SPC_EffectiveDate"));
			getStaleElement("Effective Date", SPC_EffectiveDate);
			GuidewireAutomate("Effective Date", SPC_EffectiveDate, "clearANDsendKeys", lhm_TestCase_Table_Data.get("SPC_EffectiveDate"));
			GuidewireAutomate("Description", SPC_Description, "clearANDsendKeys", lhm_TestCase_Table_Data.get("SPC_Description"));
			getStaleElement("SPC_NextButton", SPC_NextButton);
			GuidewireAutomate("SPC_NextButton", SPC_NextButton, "clickAndwait", "clickAndwait");
			// GuidewireAutomate_Handle("alertaccept", "NA");
		} catch (Exception e) {

			e.printStackTrace();

			throw e;

		}

	}

	/*
	 * Owner : Rahul Dixit Date : 29-March-2022
	 */
	public static void StartPolicyChangePastDate_Details() throws Throwable {

		try {
			lhm_TestCase_Table_Data = getData_BusinessOwners("ChangePolicy");
			Thread.sleep(3000);
			GuidewireAutomate_Validation("Start Policy Change Header", SPC_Header, "equals", "Start Policy Change");
			getStaleElement("Effective Date", SPC_EffectiveDate);
			GuidewireAutomate("Effective Date", SPC_EffectiveDate, "clearANDsendKeys", lhm_TestCase_Table_Data.get("SPC_EffectiveDatePast"));
			getStaleElement("Effective Date", SPC_EffectiveDate);
			GuidewireAutomate("Effective Date", SPC_EffectiveDate, "clearANDsendKeys", lhm_TestCase_Table_Data.get("SPC_EffectiveDatePast"));
			GuidewireAutomate("Description", SPC_Description, "clearANDsendKeys", lhm_TestCase_Table_Data.get("SPC_Description"));
			getStaleElement("SPC_NextButton", SPC_NextButton);
			GuidewireAutomate("SPC_NextButton", SPC_NextButton, "clickAndwait", "clickAndwait");
			GuidewireAutomate_Handle("alertaccept", "NA");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;

		}

	}

	/*
	 * Owner : Rahul Dixit Date : 01-April-2022
	 */
	public static void Verify_OutOfsequenceError() throws Throwable {
		try {
			GuidewireAutomate_Validation("Out Of Sequence Error", OutOfsequence_Error, "contains", "out-of-sequence ");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;

		}

	}
	/*
	 * Owner : Rahul Dixit Date : 04-April-2022
	 */
	public static void ValidateStatusInCompletePolicyTransaction() throws Throwable {
		try {

			lhm_TestCase_Table_Data = getData_BusinessOwners("PolicySummary");

			GuidewireAutomate_waitForElement(CPT_Header, "visibilityOfElementLocated", "");
			getStaleElement("CPT_Header", CPT_Header);
			GuidewireAutomate_Validation("CPT_Header", CPT_Header, "equals", "Completed Policy Transactions");
			GuidewireAutomate_Validation("CPT_Status", CPT_Status, "equals", "Type");
			getStaleElement("Type", CanCellation_Status);
			GuidewireAutomate_Validation("Type", CanCellation_Status, "contains", lhm_TestCase_Table_Data.get("Status"));

		} catch (Exception e) {

			e.printStackTrace();

			throw e;

		}

	}
	/*
	 * Owner : Rahul Dixit Date : 01-April-2022
	 */
	public static void OverrideChangeConflicts() throws Throwable {
		try {

			GuidewireAutomate("Change Conflicts", PR_ChangeConflicts, "clickAndwait", "clickAndwait");
			GuidewireAutomate("Conflicts_OverrideAll", Conflicts_OverrideAll, "clickAndwait", "clickAndwait");
			getStaleElement("Conflicts_Submit", Conflicts_Submit);
			GuidewireAutomate("Conflicts_Submit", Conflicts_Submit, "clickAndwait", "clickAndwait");
			GuidewireAutomate_Handle("alertaccept", "NA");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;

		}

	}

	/*
	 * Owner : Rahul Dixit Date : 01-April-2022
	 */
	public static void JumpPolicyReviewScreen() throws Throwable {
		try {
			getStaleElement("Policy Review Screen", PolicyReviewScreen);
			GuidewireAutomate("Policy Review Screen", PolicyReviewScreen, "clickAndwait", "clickAndwait");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;

		}

	}

	/*
	 * Owner : Rahul Dixit Date : 25-March-2022
	 */
	public static void ReturnToPolicyCenter() throws Throwable {

		try {

			GuidewireAutomate("Action Run", Action, "clickAndwait", "clickAndwait");
			GuidewireAutomate("Return To Policy Center", Action_ReturnPolicyCenter, "clickAndwait", "clickAndwait");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;

		}

	}
	public static void primaryNamedInsured() throws Throwable {
		lhm_TestCase_Table_Data = getData_BusinessOwners("policyInfo");

		try {
			GuidewireAutomate_Validation("Screen Header", PolicyCenter_Resuables_PO.Screen_Header, "equals", "Policy Info");

			// GuidewireAutomate_Validation("Name", PrimaryNamedInsured_Name, "equals", strAccountName);

			// GuidewireAutomate_Validation("Phone", PrimaryNamedInsured_Phone, "equals",
			// lhm_TestCase_Table_Data.get("PrimaryNI_Phone"));

			GuidewireAutomate_Validation("Policy Address", PrimaryNamedInsured_PolicyAddress, "equals", lhm_TestCase_Table_Data.get("PrimaryNI_PolicyAddress"));
			GuidewireAutomate_Validation("County", PrimaryNamedInsured_County, "equals", lhm_TestCase_Table_Data.get("PrimaryNI_County"));
			GuidewireAutomate_Validation("Address Type", PrimaryNamedInsured_AddressType, "equals", lhm_TestCase_Table_Data.get("PrimaryNI_AddressType"));
			lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
			lhm_TestCase_Table_Data.clear();

		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Owner: Rahul Dixit Date: 23-March-2022
	 */
	public static void PreRenewalDirectionInfo(String Type) throws Throwable {
		lhm_TestCase_Table_Data = getData_BusinessOwners("Renew");

		switch (Type) {

			case "Pre Renewal Data Info" :
				GuidewireAutomate(" Pre Renew Direction", PreRenewDirection, "selectByVisibleText", lhm_TestCase_Table_Data.get("PreRenewDirection"));
				GuidewireAutomate("Non-Renew Reason", PreRenewReason, "selectByVisibleText", lhm_TestCase_Table_Data.get("PreRenewReason"));
				GuidewireAutomate("Pre Renew Text", PreRenewText, "clearANDsendKeys", lhm_TestCase_Table_Data.get("PreRenewText"));

				break;

			case "Selected PreRenewal Explanations" :
				GuidewireAutomate("Add Button", NonRenewExplanation_AddButton, "clickAndwait", "clickAndwait");
				GuidewireAutomate("Non Renew Explanation Checkbox", Select_NonRenewExplanationCheckbox, "clickAndwait", "clickAndwait");
				PolicyCenter_Resuables.clickButton("ADD");
				break;
			default :

				throw new IOException("Case is not Running");

		}

	}
}
