package com.pages.Guidewire.ClaimsCenter;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Reporting_Utils;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class CC_NewClaimWizard extends SeleniumWebDriver_Commands implements CC_NewClaimWizard_PO {

	static String strClaims_AssignedGroup = null;
	static String strClaims_AssignedUser  = null;

	public CC_NewClaimWizard(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	public static void assignClaimProcess(String strClaimType) throws Throwable {

		CC_Reusables.ccTabNavigation("New Claim", "NA");

		switch (strClaimType) {
			case "VerifiedPolicyAuto" :
				ncw_SearchorCreatePolicy_FindPolicy_Search();
				ncw_SearchorCreatePolicy_FindPolicy_NewClaim();
				ncw_SearchorCreatePolicy_FindPolicy_ClaimsHistory();
				CC_Reusables.clickButton("Next");
				ncw_BasicInformation();
				CC_Reusables.clickButton("Next");
				ncw_PossibleDuplicateClaims();
				ncw_AddClaimInformation();
				ncw_Auto_AddClaimInformation_VehiclesPeopleProperty();
				CC_Reusables.clickButton("Next");
				ncw_Services();
				CC_Reusables.clickButton("Next");
				ncw_SaveAndAssignClaim();
				CC_Reusables.clickButton("Finish");
				// ClaimCenter_Resuables.clickButton("Finish");
				ncw_newClaimSaved();
				ncw_ViewtheNewlySavedClaim();
				break;

			case "VerifiedPolicyAutoFirstandFinal" :
				ncw_SearchorCreatePolicy_FindPolicy_Search();
				ncw_SearchorCreatePolicy_FindPolicy_NewClaim();
				ncw_SearchorCreatePolicy_FindPolicy_ClaimsHistory();
				ncw_AutoFirstandFinal();
				break;
			case "QuickClaimAuto" :
				break;

		}
	}

	public static void fnolProcess(String claimAction, String claimStatus) throws Throwable {

		try {
			switch (claimAction) {
				case "Assign Claim" :
					CC_Reusables.ccTabNavigation("Claim Search", "NA");
					CC_Reusables.ccMenuNavigation("Assign Claim");
					CC_ClaimActions.AssignClaim();
					break;
				case "Claim Search" :
					// CC_Resuables.ccTabNavigation("Claim Search", "NA");
					break;
				case "Migration Claim" :

					// NewClaim
					CC_Reusables.ccTabNavigation("New Claim", "NA");
					// ----->Assign Claim
					CC_NewClaimWizard.ncw_SearchorCreatePolicy_FindPolicy_Search();
					CC_NewClaimWizard.ncw_SearchorCreatePolicy_FindPolicy_NewClaim();

					CC_Reusables.clickButton("Next");
					Thread.sleep(10000);
					// CC_Resuables.ccMenuNavigation("Policy General Direct");
					// CC_PolicyGeneral.EditEntirePolicy();

					CC_NewClaimWizard.ncw_BasicInformation();

					CC_Reusables.clickButton("Next");
					CC_NewClaimWizard.ncw_PossibleDuplicateClaims();
					// CC_NewClaimWizard.ncw_AddClaimInformation();
					CC_NewClaimWizard.ncw_AddClaimInformation_LossLocation_OtherLocation();
					CC_NewClaimWizard.ncw_ACI_AddIncident(1);

					CC_Reusables.clickButton("Next");

					CC_NewClaimWizard.ncw_SaveAndAssignClaim_Assign_Exposure();
					CC_ChooseCoverage.newExposure(1);
					CC_Reusables.clickButton("Finish");
					if (CC_Reusables.ValidationResults_Clear()) {
						CC_Reusables.clickButton("Finish");
					}

					CC_NewClaimWizard.ncw_newClaimSaved();
					CC_NewClaimWizard.ncw_ViewtheNewlySavedClaim();

					break;

				case "New Claim" :

					// NewClaim
					CC_Reusables.ccTabNavigation(claimAction, "NA");
					// ----->Assign Claim
					CC_NewClaimWizard.ncw_SearchorCreatePolicy_FindPolicy_Search();
					CC_NewClaimWizard.ncw_SearchorCreatePolicy_FindPolicy_NewClaim();

					CC_Reusables.clickButton("Next");
					CC_Reusables.ccMenuNavigation("Policy General Direct");
					CC_PolicyGeneral.PG_EditEntirePolicy();
					Thread.sleep(2000);
					CC_NewClaimWizard.ncw_CreateUnverifiedPolicy_LevelCoverages();
					CC_Reusables.clickButton("Back");
					Thread.sleep(2000);
					CC_NewClaimWizard.bi_ReportedBy_NewPerson();

					CC_Reusables.clickButton("Next");

					CC_NewClaimWizard.ncw_PossibleDuplicateClaims();

					// CC_NewClaimWizard.ncw_AddClaimInformation();
					CC_NewClaimWizard.ncw_AddClaimInformation_LossLocation_OtherLocation();
					CC_Reusables.clickButton("Next");

					CC_NewClaimWizard.ncw_SaveAndAssignClaim();
					CC_Reusables.clickButton("Finish");
					/*
					 * if (ValidationResults_Clear()){ ClaimCenter_Resuables.clickButton("Finish"); }
					 */
					CC_NewClaimWizard.ncw_newClaimSaved();
					CC_NewClaimWizard.ncw_ViewtheNewlySavedClaim();

					break;

				default :

					break;
			}

			if (claimStatus.equals("Closed")) {

				CC_Reusables.ccMenuNavigation("Exposures");
				CC_ChooseCoverage.CloseExposure(1);

				CC_Reusables.ccMenuNavigation("Close Claim");
				CC_ClaimActions.CloseClaim();
			}

		} catch (NoSuchElementException e) {
			e.printStackTrace();
			throw e;
		}

		// Logout
		// ClaimCenter_Resuables.logout_ClaimsCenter();
	}

	public static void ncw_SearchorCreatePolicy_FindPolicy_Search() throws Throwable {

		try {

			lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("asFindPolicy");

			strPolicyNumber = null;
			strPolicyNumber = lhm_TestCase_Table_Data.get("SCP_PolicyNumber");

			// ------> Verifying the page -
			GuidewireAutomate_Validation("Screen Header", NCW_SearchorCreatePolicy_Header, "contains", "Search or Create Policy");

			GuidewireAutomate("Find Policy", SCP_FindPolicy, "clickAndwait", "click");

			GuidewireAutomate("Policy Number", SCP_FP_PolicyNumber, "clearANDsendKeys", strPolicyNumber);
			// GuidewireAutomate("First Name", SCP_FP_FirstName, "clearANDsendKeys", lhm_TestCase_Table_Data.get("SCP_FP_FirstName"));
			// GuidewireAutomate("Last Name", SCP_FP_LastName, "clearANDsendKeys", lhm_TestCase_Table_Data.get("SCP_FP_LastName"));
			// GuidewireAutomate("Organization Name", SCP_FP_OrganizationName, "clearANDsendKeys",
			// lhm_TestCase_Table_Data.get("SCP_FP_OrganizationName"))
			// GuidewireAutomate_Validation("Policy Type", SCP_FP_PolicyType, "VerifyElementNotExist",
			// lhm_TestCase_Table_Data.get("SCP_FP_PolicyType"));
			getStaleElement("Country", SCP_FP_Country);
			GuidewireAutomate("Country", SCP_FP_Country, "selectByVisibleText", lhm_TestCase_Table_Data.get("SCP_FP_Country"));
			getStaleElement("Country", SCP_FP_Country);
			// GuidewireAutomate("Policy From EDW Yes", SCP_FP_PolicyFromEDW, "clickAndwait", lhm_TestCase_Table_Data.get("SCP_FP_PolicyFromEDW"));

			// Verify Policy should be retrieved and displayed.
			GuidewireAutomate("Search", SP_FP_Search, "clickAndwait", "click");
			getStaleElement("Policy", SCP_FP_PR_Policy);

			// Select
			By UnSelectPolicy = By.xpath("//div[text()='O" + strPolicyNumber + "']/ancestor::td[contains(@id,'PolicyNumber_Cell')]/preceding-sibling::td//div[contains(@id,'-unselectButton')]");
			By Select_Policy  = By.xpath("//div[text()='" + strPolicyNumber + "']/ancestor::td[contains(@id,'PolicyNumber_Cell')]/preceding-sibling::td//div[contains(@id,'PolicyResultLV-0-selectButton')]");
			By Select_OPolicy = By.xpath("//div[text()='O" + strPolicyNumber + "']/ancestor::td[contains(@id,'PolicyNumber_Cell')]/preceding-sibling::td//div[contains(@id,'PolicyResultLV-1-selectButton')]");
			if (IsElementDisplayed("UnSelect", UnSelectPolicy)) {
				System.out.println("O Policy is Displayed");
				strPolicyNumber = "O" + strPolicyNumber;
			} else if ((IsElementDisplayed("Select_Policy", Select_Policy)) & (IsElementDisplayed("Select_OPolicy", Select_OPolicy))) {
				System.out.println("Policy & O Policy is Displayed");
				GuidewireAutomate("Select", Select_OPolicy, "clickAndwait", "click");
				getStaleElement("Policy", SCP_FP_PR_Policy);
				strPolicyNumber = "O" + strPolicyNumber;
			}

			// Verify the values
			GuidewireAutomate_Validation("Policy", SCP_FP_PR_Policy, "equals", strPolicyNumber);
			GuidewireAutomate_Validation("Insured", SCP_FP_PR_Insured, "fetch", lhm_TestCase_Table_Data.get("SCP_FP_PR_Insured"));
			GuidewireAutomate_Validation("EffectiveDate", SCP_FP_PR_EffectiveDate, "fetch", lhm_TestCase_Table_Data.get("SCP_FP_PR_EffectiveDate"));
			GuidewireAutomate_Validation("ExpirationDate", SCP_FP_PR_ExpirationDate, "fetch", lhm_TestCase_Table_Data.get("SCP_FP_PR_ExpirationDate"));
			GuidewireAutomate_Validation("Type", SCP_FP_PR_Type, "fetch", lhm_TestCase_Table_Data.get("SCP_FP_PolicyType"));

			oExtentTest.log(Status.PASS, "Search PolicyNumber = [" + strPolicyNumber + "] is successful");
			oExtentTest.addScreenCaptureFromPath(Selenium_Reporting_Utils.getScreenShot_Robot_createScreenCapture(driver));

		} catch (Exception e) {
			oExtentTest.log(Status.FAIL, "Search PolicyNumber = [" + strPolicyNumber + "] is Unsuccessful");
			e.printStackTrace();
			throw e;
		}
	}

	public static void ncw_SearchorCreatePolicy_FindPolicy_NewClaim() throws Throwable {

		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("asFindPolicy");

		String strSCP_NC_TypeofClaim = lhm_TestCase_Table_Data.get("SCP_TypeOfClaim");

		try {

			GuidewireAutomate_Validation("New Claim", SCP_NewClaim, "equals", "New Claim");

			GuidewireAutomate("MigratedClaim", SCP_NC_MigratedClaim, "clickAndwait", lhm_TestCase_Table_Data.get("SCP_NC_MigratedClaim"));
			if (lhm_TestCase_Table_Data.get("SCP_NC_MigratedClaim").equalsIgnoreCase("Yes")) {
				GuidewireAutomate("PreExisting ClaimNumber", SCP_NC_PreExistingClaimNumber, "clearANDsendKeys", lhm_TestCase_Table_Data.get("SCP_NC_PreExistingClaimNumber"));
				getStaleElement("LossDate", SCP_NC_LossDate);
			}
			GuidewireAutomate("Loss Date", SCP_NC_LossDate, "clearANDsendKeys", lhm_TestCase_Table_Data.get("SCP_NC_LossDate"));
			getStaleElement("Reported Date", BI_RB_DateReported);
			GuidewireAutomate("Reported Date", BI_RB_DateReported, "clearANDsendKeys", lhm_TestCase_Table_Data.get("BI_RB_DateofNotice"));
			GuidewireAutomate("Loss Date", SCP_NC_LossDate, "clearANDsendKeys", lhm_TestCase_Table_Data.get("SCP_NC_LossDate"));
			GuidewireAutomate("Time", SCP_NC_Time, "clearANDsendKeys", lhm_TestCase_Table_Data.get("SCP_NC_Time"));

			By SCP_NC_TypeofClaim = By.xpath("//span[@class='gw-label--inner' and text()='" + strSCP_NC_TypeofClaim + "']/preceding-sibling::span[@class='gw-radio-wrapper']//input[contains(@name,'ClaimMode')]");
			GuidewireAutomate("TypeofClaim = " + strSCP_NC_TypeofClaim, SCP_NC_TypeofClaim, "clickAndwait", "click");

			oExtentTest.log(Status.PASS, "New Claim Type = [" + strSCP_NC_TypeofClaim + "] selection is successful");
			oExtentTest.addScreenCaptureFromPath(Selenium_Reporting_Utils.getScreenShot_Robot_createScreenCapture(driver));

		} catch (Exception e) {
			oExtentTest.log(Status.FAIL, "New Claim Type = [" + strSCP_NC_TypeofClaim + "] selection is successful");
			e.printStackTrace();
			throw e;
		}
	}

	public static void ncw_SearchorCreatePolicy_BasicInformation() throws Throwable {

		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("asFindPolicy");

		try {
			GuidewireAutomate_Validation("New Claim", SCP_NewClaim, "equals", "New Claim");
			GuidewireAutomate("Date Reported", BI_RB_DateReported, "clearANDsendKeys", lhm_TestCase_Table_Data.get("BI_RB_DateofNotice"));
			GuidewireAutomate("LossDate", SCP_NC_LossDate, "clearANDsendKeys", lhm_TestCase_Table_Data.get("SCP_NC_LossDate"));
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void ncw_ViewUnsavedWork() throws Throwable {
		try {
			GuidewireAutomate_Validation("New Claim Wizard", NewClaimWizard, "equals", "New Claim Wizard");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Owner: Rahul Dixit Date : 24/01/22
	 */
	public static void NewMatterInfo() throws Throwable {
		try {
			GuidewireAutomate("Name ", NewMatter_Name, "clearANDsendKeys", "Automation");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

	/*
	 * Owner: Rahul Dixit Date : 11/01/22
	 */
	public static void VerifyPolicyNumberDisplayedAfterInsuredColumn() throws Throwable {

		try {
			List<WebElement> PLC_Headers = getElements(SearchActivities_SearchResult);

			for (int i = 0; i < PLC_Headers.size(); i++) {

				String header1 = PLC_Headers.get(4).getText();
				if (header1.equals("Insured") && PLC_Headers.get(5).getText().equals("Policy Number")) {
					oExtentTest.log(Status.PASS, "Policy Number field is displayed After the Insured Column In Search Activities Screen");
					break;
				} else {
					oExtentTest.log(Status.FAIL, "Policy Number field is Not displayed After the Insured Column In Search Activities Screen");

				}

			}

		} catch (Exception e) {
			e.printStackTrace();
			throw e;

		}

	}

	/*
	 * Owner: Rahul Dixit Date : 24/01/22
	 */
	public static void VerifyLineOfBuisnessDisplayedAfterPolicyNumberColumn() throws Throwable {

		try {
			List<WebElement> PLC_Headers = getElements(SearchActivities_SearchResult);

			for (int i = 0; i < PLC_Headers.size(); i++) {

				String header1 = PLC_Headers.get(5).getText();
				if (header1.equals("Policy Number") && PLC_Headers.get(6).getText().equals("Line Of Business")) {
					oExtentTest.log(Status.PASS, "Buisness field is displayed After the Insured Column In Search Activities Screen");
					break;
				} else {
					oExtentTest.log(Status.FAIL, "Buisness field is Not displayed After the Insured Column In Search Activities Screen");

				}

			}

		} catch (Exception e) {
			e.printStackTrace();
			throw e;

		}

	}

	/*
	 * Owner: Rahul Dixit Date : 11/01/22
	 */
	public static void DeleteDocuments() throws Throwable {
		try {
			GuidewireAutomate(" Checkbox", Doc_Checkbox, "clickAndwait", "clickAndwait");
			GuidewireAutomate("Delete Selected", Doc_Deleteselected, "clickAndwait", "clickAndwait");
			GuidewireAutomate_Handle("alertaccept", "Alert");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Pankaj--17 Jan 2022 Verify Asign Group
	 */
	public static void ncw_newClaimSaved_Verify_ClaimAssignGroup(String strExpected_AssignedGroup) throws Throwable {

		strClaimsNumber = null;

		GuidewireAutomate_Validation("Screen Header", NewClaimSaved_Header, "equals", "New Claim Saved");

		String strActual_AssignedGroup = getText_Element(NCS_AssignedGroup).replace("Assigned Group: ", "");
		if (strActual_AssignedGroup.contains(strExpected_AssignedGroup)) {
			oExtentTest.log(Status.PASS, "ClaimAssign To Group " + strActual_AssignedGroup);
		} else {
			oExtentTest.log(Status.FAIL, "ClaimAssign To Group " + strActual_AssignedGroup);
		}

	}

	public static void ncw_SearchorCreatePolicy_FindPolicy_ClaimsHistory() throws Throwable {

		/*
		 * <All fields should be added> <20-july-2021> <Akula Srikanh>
		 */

		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("asFindPolicy");

		GuidewireAutomate_Validation("Claims History", SCP_ClaimsHistory, "equals", "Claims History");

	}

	public static void ncw_BasicInformation() throws Throwable {

		try {

			lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("asBasicInfo");

			GuidewireAutomate_Validation("Screen Header", NCW_BasicInformation_Header, "contains", "Basic information");

			// Reported By
			GuidewireAutomate_Validation("Section", BI_ReportedBy, "equals", "Reported By");
			GuidewireAutomate("How Reported", BI_RB_HowReported, "selectByVisibleText", lhm_TestCase_Table_Data.get("BI_RB_HowReported"));
			if (getOptions_Element(BI_RB_Name).contains(lhm_TestCase_Table_Data.get("BI_RB_Name"))) {
				GuidewireAutomate("Name", BI_RB_Name, "selectByVisibleText", lhm_TestCase_Table_Data.get("BI_RB_Name"));
				getStaleElement("Relation to Insured", BI_RB_RelationtoInsured);
			} else {
				GuidewireAutomate("Select", ReportedBy, "clickAndwait", "click");
				GuidewireAutomate("NewPerson", ReportedBy_NewPerson, "clickAndwait", "click");

				GuidewireAutomate_Validation("Screen Header", RBNewPerson_Header, "equals", "New Person");
				GuidewireAutomate("First Name", RBNewPerson_Firstname, "clearANDsendKeys", lhm_TestCase_Table_Data.get("RBNewPerson_Firstname"));
				GuidewireAutomate("Last Name", RBNewPerson_Lastname, "clearANDsendKeys", lhm_TestCase_Table_Data.get("RBNewPerson_Lastname"));
				GuidewireAutomate("Tax ID", NP_P_TaxID, "clearANDsendKeys", lhm_TestCase_Table_Data.get("TaxID"));
				CC_Reusables.clickButton("Update");

				GuidewireAutomate_Validation("Screen Header", NCW_BasicInformation_Header, "equals", "Step 2 of 4: Basic information");

			}
			GuidewireAutomate("Relation to Insured", BI_RB_RelationtoInsured, "selectByVisibleText", lhm_TestCase_Table_Data.get("BI_RB_RelationtoInsured"));
			// GuidewireAutomate("Date Reported", BI_RB_DateReported, "clearANDsendKeys", lhm_TestCase_Table_Data.get("BI_RB_DateofNotice"));

			/*
			 * //Verify Date of Birth GuidewireAutomate_Validation("Section", BI_VerifyDateofBirth, "equals", "Verify Date of Birth");
			 * GuidewireAutomate_Validation("Date of Birth", BI_VDOB_DateofBirth, "equals", lhm_TestCase_Table_Data.get("BI_VDOB_DateofBirth"));
			 */

			// Confirm Contact Info
			GuidewireAutomate_Validation("Section", BI_ConfirmContactInfo, "equals", "Confirm Contact Info");
			GuidewireAutomate_Validation("Address", BI_CCI_Address, "equals", lhm_TestCase_Table_Data.get("BI_CCI_Address"));
			GuidewireAutomate_Validation("Work Phone", BI_CCI_WorkPhone, "valueEquals", lhm_TestCase_Table_Data.get("BI_CCI_WorkPhone"));
			GuidewireAutomate_Validation("Home Phone", BI_CCI_HomePhone, "valueEquals", lhm_TestCase_Table_Data.get("BI_CCI_HomePhone"));
			GuidewireAutomate("Mobile", BI_CCI_Mobile, "clearANDsendKeys", lhm_TestCase_Table_Data.get("BI_CCI_Mobile"));
			GuidewireAutomate("Primary Phone", BI_CCI_PrimaryPhone, "selectByVisibleText", lhm_TestCase_Table_Data.get("BI_CCI_PrimaryPhone"));
			GuidewireAutomate("Email", BI_CCI_Email, "clearANDsendKeys", lhm_TestCase_Table_Data.get("BI_CCI_Email"));

			// Insured
			GuidewireAutomate_Validation("Section", BI_Insured, "equals", "Insured");
			GuidewireAutomate_Validation("Name", BI_I_Name, "equals", lhm_TestCase_Table_Data.get("BI_I_Name"));
			GuidewireAutomate_Validation("Address", BI_I_Address, "contains", lhm_TestCase_Table_Data.get("BI_I_Address"));
			GuidewireAutomate_Validation("Primary Phone", BI_I_PrimaryPhone, "equals", lhm_TestCase_Table_Data.get("BI_I_PrimaryPhone"));

			// Main Contact
			GuidewireAutomate_Validation("Section", BI_MainContact, "equals", "Main Contact");
			if (lhm_TestCase_Table_Data.get("BI_MC_SamePerson").equals("Same as reporter")) {
				GuidewireAutomate("Same Person", BI_MC_SamePerson_SameAsReporter, "click", lhm_TestCase_Table_Data.get("BI_MC_SamePerson"));
			} else if (lhm_TestCase_Table_Data.get("BI_MC_SamePerson").equals("Different person")) {
				GuidewireAutomate("Same Person", BI_MC_SamePerson_Differentperson, "click", lhm_TestCase_Table_Data.get("BI_MC_SamePerson"));

				GuidewireAutomate("Name", BI_MC_Name, "selectByVisibleText", lhm_TestCase_Table_Data.get("BI_MC_Name"));
				GuidewireAutomate("Relation to Insured", BI_MC_RelationtoInsured, "selectByVisibleText", lhm_TestCase_Table_Data.get("BI_MC_RelationtoInsured"));
			}

			/*
			 * Involved Vehicle(s)
			 * 
			 * GuidewireAutomate_Validation("Section", BI_InvolvedVehicle, "equals", "Involved Vehicle(s)");
			 * 
			 * String strBI_IV_Select = lhm_TestCase_Table_Data.get("BI_IV_Select"); By BI_IV_Select = By.xpath("//div[@role='heading' and text()='" +
			 * strBI_IV_Select + "']/preceding-sibling::div//input[@type='checkbox']"); GuidewireAutomate("Select = " + strBI_IV_Select, BI_IV_Select,
			 * "clickAndwait", strBI_IV_Select);
			 */

			oExtentTest.log(Status.PASS, "Basic Information is successful");
			oExtentTest.addScreenCaptureFromPath(Selenium_Reporting_Utils.getScreenShot_Robot_createScreenCapture(driver));

		} catch (Exception e) {
			oExtentTest.log(Status.FAIL, "Basic Information is not successful");
			e.printStackTrace();
			throw e;
		}
	}

	public static void bi_ReportedBy_NewPerson() throws Throwable {
		try {
			lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("asBasicInfo");

			GuidewireAutomate_Validation("Screen Header", NCW_BasicInformation_Header, "contains", "Basic information");

			/*
			 * Reported By
			 */
			GuidewireAutomate_Validation("Section", BI_ReportedBy, "equals", "Reported By");
			GuidewireAutomate("How Reported", BI_RB_HowReported, "selectByVisibleText", lhm_TestCase_Table_Data.get("BI_RB_HowReported"));
			GuidewireAutomate("Name Select", ReportedBy, "clickAndwait", "click");
			GuidewireAutomate("ReportedBy_NewPerson", ReportedBy_NewPerson, "clickAndwait", "click");

			GuidewireAutomate_Validation("Screen Header", RBNewPerson_Header, "equals", "New Person");
			GuidewireAutomate("First Name", RBNewPerson_Firstname, "clearANDsendKeys", lhm_TestCase_Table_Data.get("RBNewPerson_Firstname"));
			GuidewireAutomate("Last Name", RBNewPerson_Lastname, "clearANDsendKeys", lhm_TestCase_Table_Data.get("RBNewPerson_Lastname"));
			GuidewireAutomate("Tax ID", NP_P_TaxID, "clearANDsendKeys", lhm_TestCase_Table_Data.get("TaxID"));
			CC_Reusables.clickButton("Update");

			GuidewireAutomate_Validation("Screen Header", NCW_BasicInformation_Header, "equals", "Step 2 of 4: Basic information");

			GuidewireAutomate("Relation to Insured", BI_RB_RelationtoInsured, "selectByVisibleText", lhm_TestCase_Table_Data.get("BI_RB_RelationtoInsured"));
			getStaleElement("Relation to Insured", BI_RB_RelationtoInsured);
			// GuidewireAutomate_Validation("Relation to Insured", BI_RB_RelationtoInsured, "FirstSelectedOptionEquals",
			// lhm_TestCase_Table_Data.get("BI_RB_RelationtoInsured"));
			// GuidewireAutomate("Date Reported", BI_RB_DateReported, "clearANDsendKeys", lhm_TestCase_Table_Data.get("BI_RB_DateofNotice"));

			/*
			 * Confirm Contact Info
			 */
			GuidewireAutomate_Validation("Section", BI_ConfirmContactInfo, "equals", "Confirm Contact Info");
			GuidewireAutomate_Validation("Address", BI_CCI_Address, "equals", lhm_TestCase_Table_Data.get("BI_CCI_Address"));
			GuidewireAutomate_Validation("Work Phone", BI_CCI_WorkPhone, "valueEquals", lhm_TestCase_Table_Data.get("BI_CCI_WorkPhone"));
			GuidewireAutomate_Validation("Home Phone", BI_CCI_HomePhone, "valueEquals", lhm_TestCase_Table_Data.get("BI_CCI_HomePhone"));
			GuidewireAutomate("Mobile", BI_CCI_Mobile, "clearANDsendKeys", lhm_TestCase_Table_Data.get("BI_CCI_Mobile"));
			GuidewireAutomate("Primary Phone", BI_CCI_PrimaryPhone, "selectByVisibleText", lhm_TestCase_Table_Data.get("BI_CCI_PrimaryPhone"));
			GuidewireAutomate("Email", BI_CCI_Email, "clearANDsendKeys", lhm_TestCase_Table_Data.get("BI_CCI_Email"));
			/*
			 * Insured
			 */
			GuidewireAutomate_Validation("Section", BI_Insured, "equals", "Insured");
			GuidewireAutomate_Validation("Name", BI_I_Name, "equals", lhm_TestCase_Table_Data.get("BI_I_Name"));
			GuidewireAutomate_Validation("Address", BI_I_Address, "contains", lhm_TestCase_Table_Data.get("BI_I_Address"));
			GuidewireAutomate_Validation("Primary Phone", BI_I_PrimaryPhone, "equals", lhm_TestCase_Table_Data.get("BI_I_PrimaryPhone"));

			/*
			 * Main Contact
			 */
			GuidewireAutomate_Validation("Section", BI_MainContact, "equals", "Main Contact");
			if (lhm_TestCase_Table_Data.get("BI_MC_SamePerson").equals("Same as reporter")) {
				GuidewireAutomate("Same Person", BI_MC_SamePerson_SameAsReporter, "click", lhm_TestCase_Table_Data.get("BI_MC_SamePerson"));
			} else if (lhm_TestCase_Table_Data.get("BI_MC_SamePerson").equals("Different person")) {
				GuidewireAutomate("Same Person", BI_MC_SamePerson_Differentperson, "click", lhm_TestCase_Table_Data.get("BI_MC_SamePerson"));

				GuidewireAutomate("Name", BI_MC_Name, "selectByVisibleText", lhm_TestCase_Table_Data.get("BI_MC_Name"));
				GuidewireAutomate("Relation to Insured", BI_MC_RelationtoInsured, "selectByVisibleText", lhm_TestCase_Table_Data.get("BI_MC_RelationtoInsured"));
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void basicInformation_InsuredDetailsEdit() throws Throwable {
		try {
			lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("asBasicInfo");
			String Insured     = lhm_TestCase_Table_Data.get("BI_RB_Name");
			By     InsuredName = By.xpath("//div[contains(@id,'Insured_Name')]//div[@role='button' and text()='" + Insured + "']");
			GuidewireAutomate("InsuredName", InsuredName, "clickAndwait", "click");
			// GuidewireAutomate_Validation("Screen Header", InsuredName_Header, "equals",Insured);
			GuidewireAutomate("CompanyName", CompanyName, "clearANDsendKeys", "Automation12");
			CC_Reusables.clickButton("OK");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	// Validating for ExtReporting Date
	// author:Divya
	// date:10/12/2021
	public static void ncw_CreateUnverifiedPolicyVerifyEXTReportingdate() throws Throwable {
		try {
			GuidewireAutomate_Validation("Ext Reporting Section", EXTReportingDate, "equals", "Ext Reporting Date");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void ncw_PossibleDuplicateClaimGenerator() throws Throwable {

		try {
			By DuplicateClaim = By.xpath("//div[@class='gw-label' and text()='Duplicate Claim']");
			VerifyElementNotExist(" Duplicate Claim", DuplicateClaim);
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void BasicInfo_NovalueDateNoticed() throws Throwable {
		GuidewireAutomate_Validation("Screen Header", NCW_BasicInformation_Header, "equals", "Step 2 of 4: Basic information");
		String DateReported = getText_Element(BI_RB_DateReported);
		if (DateReported.isEmpty()) {
			oExtentTest.log(Status.PASS, " No default value for Date of Notice");
		} else {
			oExtentTest.log(Status.PASS, DateReported + "default value for Date of Notice");
		}

	}

	public static void bi_ReportedBy_InsuredName() throws Throwable {

		try {

			lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("asBasicInfo");
			GuidewireAutomate_Validation("Screen Header", NCW_BasicInformation_Header, "equals", "Step 2 of 4: Basic information");
			GuidewireAutomate_Validation("Section", BI_ReportedBy, "equals", "Reported By");

			GuidewireAutomate("Name", BI_RB_Name, "selectByVisibleTextAndwait", lhm_TestCase_Table_Data.get("BI_RB_Name"));
			getStaleElement("Relation to Insured", BI_RB_RelationtoInsured);
			GuidewireAutomate_Validation("Relation to Insured", BI_RB_RelationtoInsured, "FirstSelectedOptionEquals", lhm_TestCase_Table_Data.get("BI_RB_RelationtoInsured"));
			// GuidewireAutomate("Date Reported", BI_RB_DateReported, "clearANDsendKeys", lhm_TestCase_Table_Data.get("BI_RB_DateofNotice"));
			// GuidewireAutomate("Relation to Insured", BI_RB_RelationtoInsured, "selectByVisibleText",
			// lhm_TestCase_Table_Data.get("BI_RB_RelationtoInsured"));

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void bi_ReportedBy_NewPerson_RenamedNoticeReported() throws Throwable {
		try {
			GuidewireAutomate_Validation("Screen Header", NCW_BasicInformation_Header, "equals", "Step 2 of 4: Basic information");

			GuidewireAutomate_Validation("Date Reported", BI_RB_RenamedDateReported, "equals", "Date Reported");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void basicInformation_DateReportedMandatory() throws Throwable {
		WebElement ErrorMessage = getElement(BI_DateReportedMandatoryErrorMsg);

		try {
			if (ErrorMessage.isDisplayed()) {
				oExtentTest.log(Status.PASS, "Date Reported Is Mandatory");
			}
			// GuidewireAutomate_Validation("Date Reported : Missing required", BI_DateReportedMandatoryErrorMsg, "contains", "Date Reported : Missing
			// required");
			else {
				oExtentTest.log(Status.FAIL, "Date Reported Is not Mandatory");
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void basicInfo_verifyDateofbirth() throws Throwable {

		try {

			By DateOfBirth = By.xpath("//div[contains(@class,'gw-boldLabel') and text()='Verify Date of Birth']");

			VerifyElementNotExist("Date Of Birth", DateOfBirth);

		} catch (NoSuchElementException e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Owner :Rahul Dixit
	 */
	public static void ncw_CreateUnverifiedPolicy_ReportedDate() throws Throwable {

		// lhm_TestCase_Table_Data = ClaimCenter_Resuables.getData_ClaimsCenter("asFindPolicy");

		try {
			GuidewireAutomate_Validation("Reported Date", ReportedDate, "equals", "Reported Date");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Owner : Rahul Dixit
	 */
	public static void ncw_CreateUnverifiedPolicy_VerifyReportedDateEditable() throws Throwable {

		WebElement ReportedDate = driver.findElement(By.xpath("//input[contains(@name,'ReportedDate_Ext')]"));

		try {
			if (ReportedDate.isEnabled()) {

				oExtentTest.log(Status.PASS, "Reported date is Editable");

			} else {
				oExtentTest.log(Status.FAIL, "Reported date is not Editable");
			}

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	// Rahul Dixit
	public static void ncw_CreateUnverifiedPolicy_ExtReportedDate() throws Throwable {

		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("asFindPolicy");

		try {
			GuidewireAutomate_Validation("Ext Reporting Date", ExtReportedDate, "equals", "Ext Reporting Date");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Owner : Rahul Dixit
	 */
	public static void ncw_CreateUnverifiedPolicy_VerifyExtReportedDateEditable() throws Throwable {

		WebElement ReportedDate = driver.findElement(By.xpath("//div[contains(@class,'gw-vw--value')]//input[contains(@name,'NewClaimPolicyGeneralDV-ExtendedRepDate_Ext')]"));

		try {
			if (ReportedDate.isEnabled()) {
				oExtentTest.log(Status.PASS, "Ext Reported date is Editable");
			} else {
				oExtentTest.log(Status.FAIL, "Ext Reported date is not Editable");
			}

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Author - Misba Date - 27/11/2021 Description - validate basic information header
	 */
	public static void BasicInformation_Header() throws Throwable {
		try {
			GuidewireAutomate_Validation("Screen Header", NCW_BasicInformation_Header, "equals", "Step 2 of 4: Basic information");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Author - Pankaj Date - 02/12/2021 Description - Check in Add Claim Information screen "Verify primary and secondary Loss cause dropdown"
	 */
	public static void ncw_AddClaimInformation_VerifyPrimaryAndSecondaryLossCauseDropdown() throws Throwable {
		try {
			lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("asAddClaimInfo");

			GuidewireAutomate_Validation("Screen Header", AddClaimInformation_Header, "equals", "Step 3 of 4: Add claim information");
			GuidewireAutomate("What Happened", ACI_WhatHappened, "clearANDsendKeys", lhm_TestCase_Table_Data.get("ACI_WhatHappened"));
			GuidewireAutomate("FirstNoticeSuit Yes", ACI_FirstNoticeSuit_Yes, "clickAndwait", "click");
			GuidewireAutomate("PrimaryLocation", ACI_PrimaryLocation, "clickAndwait", "click");
			GuidewireAutomate_Validation("Primary Loss Cause", ACI_PrimaryLossCauseSelect, "getOptionscontains", lhm_TestCase_Table_Data.get("PrimaryLoss1"));
			for (int i = 1; i <= 18; i++) {
				GuidewireAutomate("Primary Loss Cause", ACI_PrimaryLossCauseSelect, "selectByVisibleText", lhm_TestCase_Table_Data.get("SelectPrimaryLoss" + i));
				getStaleElement("Secondary Loss Cause", ACI_SecondaryLossCauseSecect);
				GuidewireAutomate_Validation("Secondary Loss Cause", ACI_SecondaryLossCauseSecect, "getOptionscontains", lhm_TestCase_Table_Data.get("SecondaryLoss" + i));
				getStaleElement("Secondary Loss Cause", ACI_SecondaryLossCauseSecect);
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Author - Divya Date - 12/12/2021 Description - Check in search or create policy screen "Validate Ext Reporting date not Mandatory"
	 */
	public static void ncw_AddClaimInfo_Verify_ExtReportingdateNotMandatory() throws Throwable {
		String ExtReportingDate = getText_Element(ACI_ExtReportingDate);
		String ErrorMessage     = "Ext Reporting Date";
		try {

			if (ExtReportingDate.contains(ErrorMessage)) {
				oExtentTest.log(Status.PASS, ErrorMessage + " is Mandatory");
			} else {
				oExtentTest.log(Status.PASS, ErrorMessage + " is Not Mandatory");
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Author - Pankaj Date - 01/12/2021 Description - Check in Search and Create Policy screen "Policy-level Coverages"
	 */
	public static void ncw_PolicyGeneral_PolicyLevelCoverages() throws Throwable {
		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("asFindPolicy");

		try {
			GuidewireAutomate_Validation("Policy Level Coverages Section", PolicyLevelCoveragesSection, "equals", "Policy-level Coverages");
			GuidewireAutomate("Policy Level Coverages Form", PolicyLevelCoveragesForm, "selectByVisibleText", lhm_TestCase_Table_Data.get("PLC_Form"));

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void ncw_CreateUnverifiedPolicy_LevelCoverages() throws Throwable {
		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("asFindPolicy");

		try {
			GuidewireAutomate_Validation("Policy Level Coverages Section", PolicyLevelCoveragesSection, "equals", "Policy-level Coverages");
			GuidewireAutomate("Policy Level Coverages Add Button", PolicyLevelCoveragesAddButton, "clickAndwait", "click");
			getStaleElement("Policy Level Coverages Type", PolicyLevelCoveragesTypes);
			GuidewireAutomate_Validation("Policy Level Coverages Type", PolicyLevelCoveragesTypes, "getOptionscontains", lhm_TestCase_Table_Data.get("PLC_Type"));
			getStaleElement("Policy Level Coverages Form", PolicyLevelCoveragesForm);
			GuidewireAutomate_Validation("Policy Level Coverages Form", PolicyLevelCoveragesForm, "getOptionscontains", lhm_TestCase_Table_Data.get("PLC_Form"));
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void ncw_CreateUnverifiedPolicy_VerifyOrganizationBermuda() throws Throwable {

		try {
			GuidewireAutomate_Validation("Organization Select", CUP_Underwriting_Organization, "getOptionscontains", "Vantage Risk Ltd");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void ncw_CreateUnverifiedPolicy_VerifyOrganizationUSA() throws Throwable {

		try {
			GuidewireAutomate_Validation("Organization Select", CUP_Underwriting_Organization, "getOptionscontains", "Superior Specialty Insurance Company,Vantage Risk Ltd,Vantage Risk Specialty Insurance Company");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void ncw_AddClaimInformation_LOB() throws Throwable {
		try {
			lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("asAddClaimInfo");

			GuidewireAutomate("LOB", ACI_LOB, "selectByVisibleText", lhm_TestCase_Table_Data.get("ACI_LOB"));
			getStaleElement("LOB", ACI_LOB);
			// GuidewireAutomate("LOB", ACI_LOB, "selectByVisibleText", lhm_TestCase_Table_Data.get("ACI_LOB"));
			Thread.sleep(500);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void ncw_AddClaimInformation_LOBProfLiabilityvalidate() throws Throwable {
		try {

			GuidewireAutomate_Validation("LOB", ACI_LOBProfLiability, "contains", "Professional Liability");
			getStaleElement("LOB", ACI_LOB);
			// GuidewireAutomate("LOB", ACI_LOB, "selectByVisibleText", lhm_TestCase_Table_Data.get("ACI_LOB"));
			Thread.sleep(500);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void ncw_AddClaimInformation_LOBPollLiabilityvalidate() throws Throwable {
		try {

			GuidewireAutomate_Validation("LOB", ACI_LOBPollutionLiability, "contains", "Pollution Liability");
			getStaleElement("LOB", ACI_LOB);
			// GuidewireAutomate("LOB", ACI_LOB, "selectByVisibleText", lhm_TestCase_Table_Data.get("ACI_LOB"));
			Thread.sleep(500);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void ncw_AddClaimInformation_VerifyDefaultLOB() throws Throwable {
		try {
			lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("asAddClaimInfo");
			GuidewireAutomate_Validation("Screen Header", AddClaimInformation_Header, "equals", "Step 3 of 4: Add claim information");
			GuidewireAutomate_Validation("Default LOB", ACI_DefaultLOB, "equals", lhm_TestCase_Table_Data.get("ACI_DefaultLOB"));
			Thread.sleep(500);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Author - Pankaj Date - 16/12/2021 Description - Add Claim Information Screen --> Liability "Add General Damage"
	 */
	public static void ncw_AddClaimInformation_Liability_AddGeneralDamage() throws Throwable {
		try {
			GuidewireAutomate_Validation("Screen Header", AddClaimInformation_Header, "equals", "Step 3 of 4: Add claim information");

			GuidewireAutomate("Add General Damage", ACI_Liability_AddGeneralDamageButton, "clickAndwait", "click");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void ncw_AddClaimInformation_Liability_AddInjury() throws Throwable {
		try {
			GuidewireAutomate_Validation("Screen Header", AddClaimInformation_Header, "equals", "Step 3 of 4: Add claim information");
			GuidewireAutomate("Add Injury", ACI_Liability_AddInjury, "clickAndwait", "click");
			Thread.sleep(1000);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Author - Pankaj Date - 16/12/2021 Description - Add Claim Information Screen --> Liability "Add General Damage -> Verify Loss party section"
	 */
	public static void ncw_AddClaimInformation_Liability_AddGeneralDamage_VerifyOwnerLossParty() throws Throwable {
		try {
			GuidewireAutomate_Validation("Screen Header", ACI_Liability_NewGeneralDamageHeader, "equals", "New General Damage Incident");
			GuidewireAutomate_Validation("Owner/Loss Party Section", ACI_Liability_GeneralDamageOwnerLossPartySection, "equals", "Owner/Loss Party");
			CC_Reusables.clickButton("OK");
			GuidewireAutomate_Validation("Owner/Loss Party Error ", ACI_Liability_OwnerLossPartyError, "equals", "Owner/Loss Party : Missing required field \"Owner/Loss Party\"");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Author - Pankaj Date - 16/12/2021 Description - Add Claim Information Screen --> Liability "Add General Damage -> Verify Contact Picker"
	 */
	public static void ncw_AddClaimInformation_Liability_AddGeneralDamage_VerifyContactPicker() throws Throwable {
		try {
			// GuidewireAutomate_Validation("Screen Header", ACI_Liability_NewGeneralDamageHeader, "equals", "New General Damage Incident");
			GuidewireAutomate("Contact Picker Button", ACI_LiabilityContactPickerButton, "clickAndwait", "click");
			Thread.sleep(500);
			String           typeListValue1 = "New Person";
			String           typeListValue2 = "New Company";
			String           typeListValue3 = "View Contact Details";
			List<WebElement> perTypeValues  = getElements(ACI_LiabilityContactPicker);
			for (WebElement Contact : perTypeValues) {
				String allContact = Contact.getText();

				if (allContact.contains(typeListValue1) || allContact.contains(typeListValue2) || allContact.contains(typeListValue3)) {

					oExtentTest.log(Status.PASS, "Contact Picker Values " + typeListValue1 + " ," + typeListValue2 + " ," + typeListValue3 + " are Available");
					break;
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Author - Pankaj Date - 16/12/2021 Description - Add Claim Information Screen --> Liability "Add General Damage -> Verify New Person"
	 */
	public static void ncw_AddClaimInformation_Liability_AddGeneralDamage_VerifyContact_NewPerson() throws Throwable {
		try {
			GuidewireAutomate_Validation("Screen Header", ACI_Liability_NewGeneralDamageHeader, "equals", "New General Damage Incident");
			GuidewireAutomate("Contact Picker Button", ACI_LiabilityContactPickerButton, "clickAndwait", "click");
			GuidewireAutomate("Contact New Person", ACI_LiabilityContactNewPerson, "clickAndwait", "click");
			Thread.sleep(500);
			GuidewireAutomate_Validation("Screen Header", ACI_Liability_NewGeneralDamageHeader, "equals", "New Person");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Author - Pankaj Date - 16/12/2021 Description - Add Claim Information Screen --> Liability "Add General Damage -> Verify New Company"
	 */
	public static void ncw_AddClaimInformation_Liability_AddGeneralDamage_VerifyContact_NewCompany() throws Throwable {
		try {
			GuidewireAutomate_Validation("Screen Header", ACI_Liability_NewGeneralDamageHeader, "equals", "New General Damage Incident");
			GuidewireAutomate("Contact Picker Button", ACI_LiabilityContactPickerButton, "clickAndwait", "click");
			GuidewireAutomate("Contact New Company", ACI_LiabilityContactNewCompany, "clickAndwait", "click");
			Thread.sleep(500);
			GuidewireAutomate_Validation("Screen Header", ACI_Liability_NewGeneralDamageHeader, "equals", "New Company");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Author - Pankaj Date - 16/12/2021 Description - Add Claim Information Screen --> Liability "Add General Damage -> Verify Contact Details"
	 */
	public static void ncw_AddClaimInformation_Liability_AddGeneralDamage_VerifyContact_ContactDetails() throws Throwable {

		try {
			GuidewireAutomate_Validation("Screen Header", ACI_Liability_NewGeneralDamageHeader, "equals", "New General Damage Incident");
			GuidewireAutomate("Loss Party Select", ACI_LiabilityLossParty, "selectByVisibleText", "Citi Mortgage");
			GuidewireAutomate("Contact Picker Button", ACI_LiabilityContactPickerButton, "clickAndwait", "click");
			GuidewireAutomate("Contact Details", ACI_LiabilityContactDetails, "clickAndwait", "click");
			Thread.sleep(500);
			GuidewireAutomate_Validation("Screen Header", ACI_Liability_NewGeneralDamageHeader, "equals", "Citi Mortgage");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Author - Pankaj Date - 17/12/2021 Description - Add Claim Information Screen --> Liability "Add General Damage -> Fill all Mandatory field"
	 */
	public static void ncw_AddClaimInformation_Liability_NewGeneralDamage() throws Throwable {

		try {
			GuidewireAutomate_Validation("Screen Header", ACI_Liability_NewGeneralDamageHeader, "equals", "New General Damage Incident");
			GuidewireAutomate("Loss Party Select", ACI_LiabilityLossParty, "selectByVisibleText", "Citi Mortgage");
			GuidewireAutomate("Severity Select", ACI_LiabilitySeverity, "selectByVisibleText", "Minor");
			GuidewireAutomate("Damage Description", ACI_LiabilityDamageDescription, "clearANDsendKeys", "Test");
			CC_Reusables.clickButton("OK");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Author - Pankaj Date - 17/12/2021 Description - Left Menu Parties Involved --> "Verify Contact in parties involved"
	 */
	public static void ncw_AddClaimInformation_PartiesInvolvedVerifyName() throws Throwable {

		try {
			GuidewireAutomate_Validation("Screen Header", ACI_Liability_NewGeneralDamageHeader, "equals", "Parties Involved");
			GuidewireAutomate_Validation("Parties Involved Name", ACI_PartiesInvolvedName, "equals", "Automation");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Author - Pankaj Date - 17/12/2021 Description - Add claim info Screen --> liability--> "Add Property Damage"
	 */
	public static void ncw_AddClaimInformation_Liability_AddPropertyDamage() throws Throwable {

		try {
			GuidewireAutomate_Validation("Screen Header", AddClaimInformation_Header, "equals", "Step 3 of 4: Add claim information");
			GuidewireAutomate("Add Property Damage", ACI_LiabilityPropertyDamageButton, "clickAndwait", "click");
			Thread.sleep(500);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Author - Pankaj Date - 17/12/2021 Description - Add claim info Screen --> liability--> "Add Property Damage-->verify Loss party"
	 */
	public static void ncw_AddClaimInformation_Liability_AddPropertyDamage_LossParty() throws Throwable {

		try {

			GuidewireAutomate_Validation("Screen Header", ACI_Liability_NewGeneralDamageHeader, "equals", "New Property Incident");
			GuidewireAutomate_Validation("Property Damage Loss Party", ACI_LiabilityPropertyDamageLossPartySection, "equals", "Owner/Loss Party");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Author - Pankaj Date - 17/12/2021 Description - Add claim info Screen --> liability--> "Add Vehicle"
	 */
	public static void ncw_AddClaimInformation_Liability_AddPVehicle() throws Throwable {

		try {
			GuidewireAutomate_Validation("Screen Header", AddClaimInformation_Header, "equals", "Step 3 of 4: Add claim information");
			GuidewireAutomate("Add Vehicle", ACI_LiabilityAddVehicleButton, "clickAndwait", "click");
			Thread.sleep(500);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Author - Pankaj Date - 17/12/2021 Description - Add claim info Screen --> liability--> "Add Property Damage-->verify Loss party"
	 */
	public static void ncw_AddClaimInformation_Liability_AddVehicle_LossParty() throws Throwable {

		try {

			GuidewireAutomate_Validation("Screen Header", ACI_Liability_NewGeneralDamageHeader, "equals", "New Vehicle Incident");
			GuidewireAutomate("Loss Party Select", ACI_LiabilityAddVehicleLossParty, "selectByVisibleText", "Third-party liability");
			Thread.sleep(500);
			GuidewireAutomate_Validation("Property Damage Loss Party", ACI_Liability_GeneralDamageOwnerLossPartySection, "equals", "Owner/Loss Party");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Author - Pankaj Date - 16/12/2021 Description - Add Claim Information Screen --> Liability "Add Property Damage -> Verify Contact Picker"
	 */
	public static void ncw_AddClaimInformation_Liability_AddPropertyDamage_VerifyContactPicker() throws Throwable {
		try {
			GuidewireAutomate_Validation("Screen Header", ACI_Liability_NewGeneralDamageHeader, "equals", "New Property Incident");
			GuidewireAutomate("Contact Picker Button", ACI_LiabilityPropertyDamageContactPickerButton, "clickAndwait", "click");
			Thread.sleep(500);
			String           typeListValue1 = "New Person";
			String           typeListValue2 = "New Company";
			String           typeListValue3 = "View Contact Details";
			List<WebElement> perTypeValues  = getElements(ACI_LiabilityPropertyDamageContactPicker);
			for (WebElement Contact : perTypeValues) {
				String allContact = Contact.getText();

				if (allContact.contains(typeListValue1) || allContact.contains(typeListValue2) || allContact.contains(typeListValue3)) {

					oExtentTest.log(Status.PASS, "Contact Picker Values " + typeListValue1 + " ," + typeListValue2 + " ," + typeListValue3 + " are Available");
					break;
				}

			}
		} catch (Exception e) {

		}
	}

	/*
	 * Author - Pankaj Date - 16/12/2021 Description - Add Claim Information Screen --> Liability "Add Vehicle Damage -> Verify Contact Picker"
	 */
	public static void ncw_AddClaimInformation_Liability_AddVehicleDamage_VerifyContactPicker() throws Throwable {
		try {

			GuidewireAutomate("Contact Picker Button", ACI_LiabilityAddVehicleContactPickerButton, "clickAndwait", "click");
			Thread.sleep(500);
			String           typeListValue1 = "New Person";
			String           typeListValue2 = "New Company";
			String           typeListValue3 = "View Contact Details";
			List<WebElement> perTypeValues  = getElements(ACI_LiabilityAddVehicleContactPicker);
			for (WebElement Contact : perTypeValues) {
				String allContact = Contact.getText();

				if (allContact.contains(typeListValue1) || allContact.contains(typeListValue2) || allContact.contains(typeListValue3)) {

					oExtentTest.log(Status.PASS, "Contact Picker Values " + typeListValue1 + " ," + typeListValue2 + " ," + typeListValue3 + " are Available");
					break;
				}

			}
		} catch (Exception e) {

		}
	}

	public static void ncw_PossibleDuplicateClaims() throws Throwable {

		if (IsElementDisplayed("PossibleDuplicateClaims", DC_PossibleDuplicateClaims_Header)) {
			GuidewireAutomate_Validation("Screen Header", DC_PossibleDuplicateClaims_Header, "equals", "Possible Duplicate Claims");
			GuidewireAutomate_Validation("Possible duplicate claims", DC_Possibleduplicateclaimsfound, "contains", "Possible duplicate claims found");

			oExtentTest.log(Status.PASS, "Basic Information is successful");
			oExtentTest.addScreenCaptureFromPath(Selenium_Reporting_Utils.getScreenShot_Robot_createScreenCapture(driver));

			GuidewireAutomate("Close", DC_Close, "clickAndwait", "click");
		}
	}

	public static void ncw_AddClaimInformation() throws Throwable {
		try {
			lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("asAddClaimInfo");

			GuidewireAutomate_Validation("Screen Header", AddClaimInformation_Header, "contains", "Add claim information");

			GuidewireAutomate("What Happened", ACI_WhatHappened, "clearANDsendKeys", lhm_TestCase_Table_Data.get("ACI_WhatHappened"));
			GuidewireAutomate("Loss Cause", ACI_LossCause, "selectByVisibleText", lhm_TestCase_Table_Data.get("ACI_LossCause"));
			getStaleElement("First Notice Suit", ACI_FirstNoticeSuit_Yes);
			GuidewireAutomate("First Notice Suit", ACI_FirstNoticeSuit_Yes, "clickAndwait", "click");

			GuidewireAutomate_Validation("Section", ACI_LossLocation, "contains", "Loss Location");
			GuidewireAutomate("PrimaryLocation", ACI_PrimaryLocation, "clickAndwait", "click");

		} catch (Exception e) {
			oExtentTest.log(Status.FAIL, "Add claim Information is not successful");
			e.printStackTrace();
			throw e;
		}
	}

	public static void ncw_AddClaimInformation_OtherLocation() throws Throwable {
		try {
			lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("asAddClaimInfo");

			GuidewireAutomate_Validation("Screen Header", AddClaimInformation_Header, "equals", "Step 3 of 4: Add claim information");
			GuidewireAutomate("What Happened", ACI_WhatHappened, "clearANDsendKeys", lhm_TestCase_Table_Data.get("ACI_WhatHappened"));
			GuidewireAutomate("Loss Cause", ACI_LossCause, "selectByVisibleText", lhm_TestCase_Table_Data.get("ACI_LossCause"));
			Thread.sleep(500);
			GuidewireAutomate("First Notice Suit Yes", ACI_FirstNoticeSuit_Yes, "clickAndwait", "click");

			GuidewireAutomate_Validation("Section", ACI_LossLocation, "contains", "Loss Location");
			GuidewireAutomate("Other Location", ACI_OtherLocation, "clickAndwait", "click");
			GuidewireAutomate("Address1", ACI_Address1, "clearANDsendKeys", lhm_TestCase_Table_Data.get("Address1"));
			GuidewireAutomate("State", ACI_State, "selectByVisibleText", lhm_TestCase_Table_Data.get("ACI_State"));
			Thread.sleep(500);
			GuidewireAutomate("City", ACI_City, "clearANDsendKeys", lhm_TestCase_Table_Data.get("ACI_City"));

		} catch (Exception e) {
			oExtentTest.log(Status.FAIL, "Add claim Information is not successful");
			e.printStackTrace();
			throw e;
		}
	}

	public static void ncw_AddClaimInformation_LossLocation_OtherLocation() throws Throwable {

		try {

			lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("asAddClaimInfo");

			GuidewireAutomate_Validation("Screen Header", AddClaimInformation_Header, "contains", "Add claim information");

			GuidewireAutomate("What Happened", ACI_WhatHappened, "clearANDsendKeys", lhm_TestCase_Table_Data.get("ACI_WhatHappened"));
			// GuidewireAutomate_Validation("Reported Date", ACI_ReportedDate, "fetch", "fetch");
			// GuidewireAutomate_Validation("Loss Date", ACI_LossDate, "fetch", "fetch");
			// GuidewireAutomate_Validation("LineofBusiness", ACI_LineofBusiness, "fetch", "fetch");
			getStaleElement("Alleged Cause", ACI_AllegedCause);
			GuidewireAutomate("Alleged Cause", ACI_AllegedCause, "selectByVisibleText", lhm_TestCase_Table_Data.get("ACI_AllegedCause"));
			getStaleElement("Detailed Cause", ACI_DetailedCause);
			GuidewireAutomate("Detailed Cause", ACI_DetailedCause, "selectByVisibleText", lhm_TestCase_Table_Data.get("ACI_DetailedCause"));
			// GuidewireAutomate("Incident Only", ACI_IncidentOnly, "click", lhm_TestCase_Table_Data.get("ACI_IncidentOnly"));
			if (lhm_TestCase_Table_Data.get("ACI_NoticeOnly").equalsIgnoreCase("Yes")) {
				GuidewireAutomate("NoticeOnly - Yes", ACI_NoticeOnly_Yes, "click", lhm_TestCase_Table_Data.get("ACI_NoticeOnly"));
			} else {
				GuidewireAutomate("NoticeOnly - No", ACI_NoticeOnly_No, "click", lhm_TestCase_Table_Data.get("ACI_NoticeOnly"));
			}
			if (lhm_TestCase_Table_Data.get("ACI_BordereauReport").equalsIgnoreCase("Yes")) {
				GuidewireAutomate("Bordereau Report - Yes", ACI_BordereauReport_Yes, "click", lhm_TestCase_Table_Data.get("ACI_BordereauReport"));
			} else {
				GuidewireAutomate("Bordereau Report - No", ACI_BordereauReport_No, "click", lhm_TestCase_Table_Data.get("ACI_BordereauReport"));
			}
			if (lhm_TestCase_Table_Data.get("ACI_FirstNoticeSuit").equalsIgnoreCase("Yes")) {
				GuidewireAutomate("First Notice Suit Yes", ACI_FirstNoticeSuit_Yes, "click", lhm_TestCase_Table_Data.get("ACI_FirstNoticeSuit"));
			} else {
				GuidewireAutomate("First Notice Suit No", ACI_FirstNoticeSuit_No, "click", lhm_TestCase_Table_Data.get("ACI_FirstNoticeSuit"));
			}

			GuidewireAutomate_Validation("Section", ACI_LossLocation, "contains", "Loss Location");

			GuidewireAutomate("Other Location", ACI_OtherLocation, "clickAndwait", "click");
			getStaleElement("Location", ACI_Location);
			GuidewireAutomate("Location", ACI_Location, "selectByIndex", "1");

			// GuidewireAutomate("Location", ACI_Location, "selectByVisibleText", lhm_TestCase_Table_Data.get("ACI_Location"));
			getStaleElement("Country", ACI_Country);
			GuidewireAutomate("Country", ACI_Country, "selectByVisibleText", lhm_TestCase_Table_Data.get("ACI_Country"));
			if (!lhm_TestCase_Table_Data.get("ACI_Country").equalsIgnoreCase("Bermuda")) {
				getStaleElement("State", ACI_State);
				GuidewireAutomate("State", ACI_State, "selectByVisibleText", lhm_TestCase_Table_Data.get("ACI_State"));
			}
			getStaleElement("Address1", ACI_Address1);
			GuidewireAutomate("Address1", ACI_Address1, "clearANDsendKeys", lhm_TestCase_Table_Data.get("ACI_Address1"));
			GuidewireAutomate("Address2", ACI_Address2, "clearANDsendKeys", lhm_TestCase_Table_Data.get("ACI_Address2"));
			GuidewireAutomate("Address3", ACI_Address3, "valueEquals", lhm_TestCase_Table_Data.get("ACI_Address3"));
			GuidewireAutomate("City", ACI_City, "clearANDsendKeys", lhm_TestCase_Table_Data.get("ACI_City"));
			if (!lhm_TestCase_Table_Data.get("ACI_Country").equalsIgnoreCase("Bermuda")) {
				GuidewireAutomate("County", ACI_County, "clearANDsendKeys", lhm_TestCase_Table_Data.get("ACI_County"));
			}
			getStaleElement("ZIP Code", ACI_ZIPCode);
			GuidewireAutomate("ZIP Code", ACI_ZIPCode, "clearANDsendKeys", lhm_TestCase_Table_Data.get("ACI_ZIPCode"));
			getStaleElement("Location Description", ACI_LocationDescription);
			GuidewireAutomate("ZIP Code", ACI_ZIPCode, "clearANDsendKeys", lhm_TestCase_Table_Data.get("ACI_ZIPCode"));
			getStaleElement("Location Description", ACI_LocationDescription);
			GuidewireAutomate("Location Description", ACI_LocationDescription, "clearANDsendKeys", lhm_TestCase_Table_Data.get("ACI_LocationDescription"));
			getStaleElement("Location Description", ACI_LocationDescription);
			GuidewireAutomate("Location Code", ACI_LocationCode, "clearANDsendKeys", lhm_TestCase_Table_Data.get("ACI_LocationCode"));
			GuidewireAutomate("Jurisdiction", ACI_Jurisdiction, "selectByVisibleText", lhm_TestCase_Table_Data.get("ACI_Jurisdiction"));

			GuidewireAutomate_Validation("Section", ACI_Incident, "equals", "Incident");

			oExtentTest.log(Status.PASS, "Add claim Information is successful");
			oExtentTest.addScreenCaptureFromPath(Selenium_Reporting_Utils.getScreenShot_Robot_createScreenCapture(driver));

		} catch (Exception e) {
			oExtentTest.log(Status.FAIL, "Add claim Information is not successful");
			e.printStackTrace();
			throw e;
		}
	}

	public static void ncw_Auto_AddClaimInformation_Incident_BodilyInjury(int intRowNO) throws Throwable {

		try {

			lhm_TestCase_Table_Data = CC_Reusables.getData_Row_ClaimsCenter("Incident", intRowNO);

			GuidewireAutomate_Validation("Incident", ACI_Incident, "equals", "Incident");
			GuidewireAutomate("Add Injury", ACI_BodilyInjury, "clickAndwait", "click");

			GuidewireAutomate("Party Type", Incident_PartyType, "selectByVisibleText", lhm_TestCase_Table_Data.get("Incident_PartyType"));
			GuidewireAutomate("First Name", Incident_firstname, "clearANDsendKeys", lhm_TestCase_Table_Data.get("FirstName"));
			GuidewireAutomate("Last Name", Incident_lastname, "clearANDsendKeys", lhm_TestCase_Table_Data.get("LastName"));

			GuidewireAutomate_Validation("Incident", ACI_Injuries, "equals", "Injuries");
			GuidewireAutomate("Loss Party", Incident_Lossparty, "selectByVisibleText", lhm_TestCase_Table_Data.get("LossParty"));
			GuidewireAutomate("Detailed Injury Type", Incident_DetailedInjuryType, "selectByVisibleText", lhm_TestCase_Table_Data.get("Incident_DetailedInjuryType"));
			getStaleElement("Detailed Injury Type", Incident_DetailedInjuryType);
			CC_Reusables.clickButton("OK");

			GuidewireAutomate_Validation("Incident", ACI_Incident, "equals", "Incident");

			By IncidentName = By.xpath("//div[contains(@id,'InjuryIncidentIterator-" + (intRowNO - 1) + "-InjuryName') and contains(@class,'gw-ValueWidget')]//div[@role='button']");
			GuidewireAutomate_Validation("IncidentName", IncidentName, "contains", lhm_TestCase_Table_Data.get("FirstName"));

		} catch (Exception e) {
			oExtentTest.addScreenCaptureFromPath(Selenium_Reporting_Utils.getScreenShot_Robot_createScreenCapture(driver));
			e.printStackTrace();
			throw e;
		}
	}

	public static void ncw_Auto_AddClaimInformation_Incident_GeneralDamage(int intRowNO) throws Throwable {

		try {
			lhm_TestCase_Table_Data = CC_Reusables.getData_Row_ClaimsCenter("Incident", intRowNO);

			GuidewireAutomate_Validation("Section", ACI_Incident, "equals", "Incident");
			GuidewireAutomate("Add General Damge", ACI_AddGeneralDamge, "clickAndwait", "click");

			GuidewireAutomate_Validation("Header", NewGeneralDamageIncident, "equals", "New General Damage Incident");
			String LosspartyName = null;

			switch (lhm_TestCase_Table_Data.get("Incident_PartyType")) {
				case "Person" :
					LosspartyName = lhm_TestCase_Table_Data.get("FirstName") + " " + lhm_TestCase_Table_Data.get("LastName");
					if (getOptions_Element(NGDI_LossParty).contains(LosspartyName)) {
						GuidewireAutomate("Loss Party", NGDI_LossParty, "selectByVisibleText", lhm_TestCase_Table_Data.get("CompanyName"));
						getStaleElement("Loss Party", NGDI_LossParty);
					} else {
						GuidewireAutomate("LossParty", NGDI_LossParty_Picker, "clickAndwait", "click");

						GuidewireAutomate("New Person", NGDI_LossParty_Picker_NewPerson, "clickAndwait", "click");

						GuidewireAutomate_Validation("Screen Header", RBNewPerson_Header, "equals", "New Person");
						GuidewireAutomate("First Name", RBNewPerson_Firstname, "clearANDsendKeys", lhm_TestCase_Table_Data.get("FirstName"));
						GuidewireAutomate("Last Name", RBNewPerson_Lastname, "clearANDsendKeys", lhm_TestCase_Table_Data.get("LastName"));
						// GuidewireAutomate("Tax ID", NP_P_TaxID, "clearANDsendKeys", lhm_TestCase_Table_Data.get("TaxID"));
						CC_Reusables.clickButton("Update");

						GuidewireAutomate_Validation("Header", NewGeneralDamageIncident, "equals", "New General Damage Incident");

					}
					GuidewireAutomate("Damage Description", NGDI_DamageDescription, "clearANDsendKeys", lhm_TestCase_Table_Data.get("DamageDescription"));
					CC_Reusables.clickButton("OK");

					break;
				case "Company" :
					LosspartyName = lhm_TestCase_Table_Data.get("CompanyName");

					if (getOptions_Element(NGDI_LossParty).contains(LosspartyName)) {
						GuidewireAutomate("Loss Party", NGDI_LossParty, "selectByVisibleText", lhm_TestCase_Table_Data.get("CompanyName"));
						getStaleElement("Loss Party", NGDI_LossParty);
					} else {
						GuidewireAutomate("LossParty", NGDI_LossParty_Picker, "clickAndwait", "click");

						GuidewireAutomate("New Company", NGDI_LossParty_Picker_NewCompany, "clickAndwait", "click");
						GuidewireAutomate_Validation("Screen Header", NewCompany_Header, "equals", "New Company");
						GuidewireAutomate("Name", CompanyName, "clearANDsendKeys", LosspartyName);
						// GuidewireAutomate("Tax ID", NP_P_TaxID, "clearANDsendKeys", lhm_TestCase_Table_Data.get("TaxID"));
						CC_Reusables.clickButton("Update");

						GuidewireAutomate_Validation("Header", NewGeneralDamageIncident, "equals", "New General Damage Incident");

					}
					GuidewireAutomate("Damage Description", NGDI_DamageDescription, "clearANDsendKeys", lhm_TestCase_Table_Data.get("DamageDescription"));
					CC_Reusables.clickButton("OK");

					break;
				case "ViewContactDetails" :
					GuidewireAutomate("View Contact Details", NGDI_LossParty_Picker_ViewContactDetails, "clickAndwait", "click");
					break;

			}

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void ncw_Auto_AddClaimInformation_VehiclesPeopleProperty() throws Throwable {

		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("asAddClaimInfo");

		GuidewireAutomate_Validation("Section", ACI_VehiclesPeopleProperty, "equals", "Vehicles, People, & Property");

		GuidewireAutomate_Validation("Add Vehicle", ACI_AddVehicle, "isDisplayed", lhm_TestCase_Table_Data.get("ACI_AddVehicle"));
		GuidewireAutomate_Validation("Add Pedestrian", ACI_AddPedestrian, "isDisplayed", lhm_TestCase_Table_Data.get("ACI_AddPedestrian"));
		GuidewireAutomate_Validation("Add Property Damage", ACI_AddPropertyDamage, "isDisplayed", lhm_TestCase_Table_Data.get("ACI_AddPropertyDamage"));

	}

	public static void ncw_Auto_AddClaimInformation_Vehicles() throws Throwable {

		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("asAddClaimInfo");

		GuidewireAutomate_Validation("Section", ACI_VehiclesPeopleProperty, "equals", "Vehicles, People, & Property");
		GuidewireAutomate_Validation("Add Vehicle", ACI_AddVehicle, "isDisplayed", lhm_TestCase_Table_Data.get("ACI_AddVehicle"));

	}

	public static void ncw_Auto_AddClaimInformation_People() throws Throwable {

		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("asAddClaimInfo");

		GuidewireAutomate_Validation("Section", ACI_VehiclesPeopleProperty, "equals", "Vehicles, People, & Property");
		GuidewireAutomate_Validation("Add Pedestrian", ACI_AddPedestrian, "isDisplayed", lhm_TestCase_Table_Data.get("ACI_AddPedestrian"));

	}

	public static void ncw_Auto_AddClaimInformation_Property() throws Throwable {

		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("asAddClaimInfo");

		GuidewireAutomate_Validation("Section", ACI_VehiclesPeopleProperty, "equals", "Vehicles, People, & Property");
		GuidewireAutomate_Validation("Add Property Damage", ACI_AddPropertyDamage, "isDisplayed", lhm_TestCase_Table_Data.get("ACI_AddPropertyDamage"));

	}

	/*
	 * Author - Pankaj Date - 19/11/2021 Description - Check in Add Claim info screen "What happened is mandatory"
	 */
	public static void ncw_AddClaimInfo_WhatHappenedMandatory() throws Throwable {
		try {
			GuidewireAutomate_Validation("Screen Header", AddClaimInformation_Header, "equals", "Step 3 of 4: Add claim information");
			GuidewireAutomate("FirstNoticeSuit Yes", ACI_FirstNoticeSuit_Yes, "clickAndwait", "click");
			GuidewireAutomate("PrimaryLocation", ACI_PrimaryLocation, "clickAndwait", "click");
			CC_Reusables.clickButton("Next");
			GuidewireAutomate_Validation("What Happened Error Message", ACI_WhatHappenedError, "equals", "What Happened? : Missing required field \"What Happened?\"");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Author - Pankaj Date - 19/11/2021 Description - Check in Add Claim info screen "Validate Loss date field"
	 */
	public static void ncw_AddClaimInfo_LossDate() throws Throwable {
		try {
			GuidewireAutomate_Validation("Screen Header", AddClaimInformation_Header, "equals", "Step 3 of 4: Add claim information");
			GuidewireAutomate_Validation("Loss Date", AI_LossDateField, "equals", "Loss Date");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Author - Pankaj Date - 19/11/2021 Description - Check in Add Claim info screen "Validate Primary and secondary Loss Cause field"
	 */
	public static void ncw_AddClaimInfo_LossCause() throws Throwable {
		try {
			GuidewireAutomate_Validation("Screen Header", AddClaimInformation_Header, "equals", "Step 3 of 4: Add claim information");
			GuidewireAutomate_Validation("Primary Loss Cause", ACI_PrimaryLossCause, "equals", "Primary Loss Cause");
			GuidewireAutomate_Validation("Secondary Loss Cause", ACI_SecondaryLossCause, "equals", "Secondary Loss Cause");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Author - Pankaj Date - 22/11/2021 Description - Check in Add Claim info screen "Validate Primary and secondary Loss Cause Mandatory"
	 */
	public static void ncw_AddClaimInfo_Verify_PrimaryAndSecondaryLossCauseNotMandatory() throws Throwable {
		String PrimaryLossCause   = "Primary Loss Cause";
		String SecondaryLossCause = "Secondary Loss Cause";
		String PrimaryLoss        = getText_Element(ACI_PrimaryLossCauseError);
		String SecondaryLoss      = getText_Element(ACI_SecondaryLossCauseError);
		try {

			if (PrimaryLoss.contains(PrimaryLossCause) && SecondaryLoss.contains(SecondaryLossCause)) {
				oExtentTest.log(Status.PASS, PrimaryLossCause + " and " + SecondaryLossCause + " is Mandatory");
			} else {
				oExtentTest.log(Status.PASS, PrimaryLossCause + " and " + SecondaryLossCause + " is not Mandatory");
			}

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Author - Pankaj Date - 22/11/2021 Description - Check in Add Claim info screen "Validate Notice only field"
	 */
	public static void ncw_AddClaimInfo_NoticeOnlyField() throws Throwable {
		try {
			GuidewireAutomate_Validation("Screen Header", AddClaimInformation_Header, "equals", "Step 3 of 4: Add claim information");
			GuidewireAutomate_Validation("Notice Only Field", AI_NoticeOnlyField, "equals", "Notice Only");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Author - Pankaj Date - 22/11/2021 Description - Check in Add Claim info screen "Validate Radio button replaced with checkBox"
	 */
	public static void ncw_AddClaimInfo_NoticeOnlyRadioButton() throws Throwable {

		try {
			GuidewireAutomate_Validation("Screen Header", AddClaimInformation_Header, "equals", "Step 3 of 4: Add claim information");
			if (driver.findElement(By.xpath("//input[contains(@id,'Status_IncidentReport') and @type='radio']")).isDisplayed()) {
				oExtentTest.log(Status.PASS, "CheckBox replaced with Radio Button");
			} else {
				oExtentTest.log(Status.PASS, "CheckBox not replaced with Radio Button");
			}

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Author - Pankaj Date - 22/11/2021 Description - Check in Add Claim info screen "Validate Bordereau Report Field"
	 */
	public static void ncw_AddClaimInfo_BordereauReportField() throws Throwable {
		try {
			GuidewireAutomate_Validation("Screen Header", AddClaimInformation_Header, "equals", "Step 3 of 4: Add claim information");
			GuidewireAutomate_Validation("Bordereau Report Field", AI_BordereauReportField, "equals", "Bordereau Report");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	/*
	 * Author - Pankaj Date - 23/11/2021 Description - Check in Add Claim info screen "Validate Bordereau Report Default value"
	 */

	public static void ncw_AddClaimInfo_BordereauReportValue() throws Throwable {
		try {
			GuidewireAutomate_Validation("Screen Header", AddClaimInformation_Header, "equals", "Step 3 of 4: Add claim information");
			if (driver.findElement(By.xpath("//input[contains(@id,'BordereauReport_1')]")).isSelected()) {
				oExtentTest.log(Status.PASS, "Bordereau Report default Value is NO");
			}

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Author - Pankaj Date - 23/11/2021 Description - Check in Add Claim info screen "Validate Coverage field removed"
	 */
	public static void ncw_AddClaimInfo_CoverageField() throws Throwable {
		try {
			GuidewireAutomate_Validation("Screen Header", AddClaimInformation_Header, "equals", "Step 3 of 4: Add claim information");

			By Coverage = By.xpath("//div[contains(@id,'Coverage_Input')]");

			VerifyElementNotExist("Coverage in Question field", Coverage);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

	/*
	 * Author - Pankaj Date - 23/11/2021 Description - Check in Add Claim info screen "Validate First Notice Suit And Location Mandatory"
	 */
	public static void ncw_AddClaimInfo_FirstNoticeSuitAndLocationMandatory() throws Throwable {
		try {
			GuidewireAutomate_Validation("Screen Header", AddClaimInformation_Header, "equals", "Step 3 of 4: Add claim information");
			GuidewireAutomate("What Happened", ACI_WhatHappened, "clearANDsendKeys", "Automation");
			CC_Reusables.clickButton("Next");
			GuidewireAutomate_Validation("First Notice Suite Error Message", ACI_FirstNoticeSuitError, "equals", "First Notice Suit? : Missing required field \"First Notice Suit?\"");
			GuidewireAutomate("FirstNoticeSuit Yes", ACI_FirstNoticeSuit_Yes, "clickAndwait", "click");
			CC_Reusables.clickButton("Next");
			GuidewireAutomate_Validation("Loss Location Error Message", ACI_LossLocationError, "equals", "Loss Location : Missing required field \"Loss Location\"");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void ncw_Services() throws Throwable {

		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("asServices");

		GuidewireAutomate_Validation("Screen Header", Services_Header, "equals", "Step 4 of 5: Services");
		GuidewireAutomate_Validation("Section", Services_InvolvedVehicles, "equals", "Involved Vehicles");

		String strVehicleName = lhm_TestCase_Table_Data.get("VehicleName");
		By     VehicleName    = By.xpath("//div[contains(@id,'VehicleName')]/div[contains(@class,'gw-boldLabel') and text()='" + strVehicleName + "']");
		GuidewireAutomate_Validation("Vehicle Name", VehicleName, "isDisplayed", lhm_TestCase_Table_Data.get("VehicleName"));

		oExtentTest.log(Status.PASS, "Services is successful");
		oExtentTest.addScreenCaptureFromPath(Selenium_Reporting_Utils.getScreenShot_Robot_createScreenCapture(driver));

	}

	public static void ncw_SaveAndAssignClaim() throws Throwable {

		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("asSaveAndAssignClaim");

		// ---->Add script to Select a user 09-07-2021 dinesh
		GuidewireAutomate_Validation("Screen Header", SaveAndAssignClaim_Header, "equals", "Step 4 of 4: Save and Assign Claim");
		GuidewireAutomate_Validation("Section", SAC_Assignment, "equals", "Assignment");

		// GuidewireAutomate("CommonAssign", SAC_A_CommonAssign, "clickAndwait", "click");
		// GuidewireAutomate("Assign claim and all exposures to", SAC_A_AssignclaimExposuresto, "selectByVisibleText",
		// lhm_TestCase_Table_Data.get("SAC_A_AssignclaimExposuresto"));

		oExtentTest.log(Status.PASS, "Save and Assign Claim is successful");
		oExtentTest.addScreenCaptureFromPath(Selenium_Reporting_Utils.getScreenShot_Robot_createScreenCapture(driver));
	}

	public static void ncw_SaveAndAssignClaim_Assign_Exposure() throws Throwable {

		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("asSaveAndAssignClaim");

		GuidewireAutomate_Validation("Screen Header", SaveAndAssignClaim_Header, "equals", "Step 4 of 4: Save and Assign Claim");

		GuidewireAutomate_Validation("Section", SAC_Assignment, "equals", "Assignment");

		// GuidewireAutomate("CommonAssign", SAC_A_CommonAssign, "clickAndwait", "click");
		// GuidewireAutomate("Assign claim and all exposures to", SAC_A_AssignclaimExposuresto, "selectByVisibleText",
		// lhm_TestCase_Table_Data.get("SAC_A_AssignclaimExposuresto"));
		if (IsElementDisplayed("Group Assign", SAC_A_AssignToGroup)) {
			GuidewireAutomate("Assign To Group", SAC_A_AssignToGroup, "selectByVisibleText", lhm_TestCase_Table_Data.get("AssignedToGroup"));
			getStaleElement("Assign To Group", SAC_A_AssignToGroup);
			GuidewireAutomate("Assign To User", SAC_A_AssignToUser, "selectByVisibleText", lhm_TestCase_Table_Data.get("AssignedToUser"));
			getStaleElement("Assign To User", SAC_A_AssignToUser);
		} else {
			By AG = By.xpath("//div[contains(@id,'AssignToGroup_Ext') and contains(@class,'gw-ValueWidget')]//div[@class='gw-label']");
			GuidewireAutomate_Validation("AssignedToGroup", AG, "equals", lhm_TestCase_Table_Data.get("AssignedToGroup"));
		}
		GuidewireAutomate("Assign To User", SAC_A_AssignToUser, "selectByVisibleText", lhm_TestCase_Table_Data.get("AssignedToUser"));
		getStaleElement("Assign To User", SAC_A_AssignToUser);
		oExtentTest.log(Status.PASS, "Save and Assign Claim is successful");
		oExtentTest.addScreenCaptureFromPath(Selenium_Reporting_Utils.getScreenShot_Robot_createScreenCapture(driver));
	}

	public static void ncw_SaveAndAssignClaim_ExposureValidation() throws Throwable {

		// GuidewireAutomate_Validation("Exposure", SAC_Exposure, "isDisplayed", "Not displayed");
		VerifyElementNotExist("Exposure", SAC_Exposures);
	}

	public static void ncw_newClaimSaved() throws Throwable {

		strClaimsNumber = null;

		GuidewireAutomate_Validation("Screen Header", NewClaimSaved_Header, "equals", "New Claim Saved");

		GuidewireAutomate_Validation("Claim Saved", NCS_ClaimSaved, "contains", "has been successfully saved");

		strClaimsNumber = getText_Element(NCS_ClaimSaved).substring(6, 17);
		/*
		 * Selenium_Utils_DataBase.UpdateData_ClaimsCenter("searchValues", "ClaimsNumber", strClaimsNumber);
		 * Selenium_Utils_DataBase.UpdateData_ClaimsCenter("asSaveAndAssignClaim", "ClaimsNumber", strClaimsNumber); strClaims_AssignedGroup =
		 * getText_Element(NCS_AssignedGroup).replace("Assigned Group: ", ""); Selenium_Utils_DataBase.UpdateData_ClaimsCenter("asSaveAndAssignClaim",
		 * "AssignedGroup", strClaims_AssignedGroup); strClaims_AssignedUser = getText_Element(NCS_AssignedUser).replace("Assigned User: ", "");
		 * Selenium_Utils_DataBase.UpdateData_ClaimsCenter("asSaveAndAssignClaim", "AssignedToUser", strClaims_AssignedUser);
		 */
		oExtentTest.log(Status.PASS, "New Claim Saved is successful Claim Number = " + strClaimsNumber);
		oExtentTest.addScreenCaptureFromPath(Selenium_Reporting_Utils.getScreenShot_Robot_createScreenCapture(driver));
	}

	public static void ncw_ViewtheNewlySavedClaim() throws Throwable {
		try {
			// GuidewireAutomate_Validation("Screen Header", NewClaimSaved_Header, "equals", "New Claim Saved");

			GuidewireAutomate("ViewtheNewlySavedClaim", NCS_ViewtheNewlySavedClaim, "clickAndwait", "click");

			GuidewireAutomate_Validation("Screen Header", Summary_Header, "equals", "Summary");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Owner : Rahul Dixit
	 */
	public static void LinkDocuments() throws Throwable {
		try {

			GuidewireAutomate("LinkDocumentButton", LinkDocumentButton, "clickAndwait", "click");
			GuidewireAutomate("DocumentSelectButton", DocumentSelectButton, "clickAndwait", "click");
			CC_Reusables.clickButton("Finish");
			getStaleElement("FinishButton", Finish_Button);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

	public static void ncw_newClaimSaved_ClaimNumberVerify(String location) throws Throwable {

		strClaimsNumber = null;
		switch (location) {
			case "Bermuda" :
				String format = "VRL";
				GuidewireAutomate_Validation("Screen Header", NewClaimSaved_Header, "equals", "New Claim Saved");
				GuidewireAutomate_Validation("Claim Saved", NCS_ClaimSaved, "contains", "has been successfully saved");
				strClaimsNumber = getText_Element(NCS_ClaimSaved).substring(6, 17);
				if (strClaimsNumber.contains(format)) {
					oExtentTest.log(Status.PASS, "ClaimNumber is in correct format " + strClaimsNumber);
				} else {
					oExtentTest.log(Status.FAIL, "ClaimNumber is not correct format " + strClaimsNumber);
				}
				break;
			case "USA" :
				String formatUSA = "VGH";
				GuidewireAutomate_Validation("Screen Header", NewClaimSaved_Header, "equals", "New Claim Saved");
				GuidewireAutomate_Validation("Claim Saved", NCS_ClaimSaved, "contains", "has been successfully saved");
				strClaimsNumber = getText_Element(NCS_ClaimSaved).substring(6, 17);
				if (strClaimsNumber.contains(formatUSA)) {
					oExtentTest.log(Status.PASS, "ClaimNumber is in correct format " + strClaimsNumber);
				} else {
					oExtentTest.log(Status.FAIL, "ClaimNumber is not correct format " + strClaimsNumber);
				}
				break;
		}
		strClaims_AssignedGroup = getText_Element(NCS_AssignedGroup).replace("Assigned Group: ", "");
		strClaims_AssignedUser  = getText_Element(NCS_AssignedUser).replace("Assigned User: ", "");

		CC_Reusables.UpdateData_ClaimsCenter("searchValues", "ClaimsNumber", strClaimsNumber);
		CC_Reusables.UpdateData_ClaimsCenter("asSaveAndAssignClaim", "ClaimsNumber", strClaimsNumber);
		CC_Reusables.UpdateData_ClaimsCenter("asSaveAndAssignClaim", "AssignedGroup", strClaims_AssignedGroup);
		CC_Reusables.UpdateData_ClaimsCenter("asSaveAndAssignClaim", "AssignedToUser", strClaims_AssignedUser);

		oExtentTest.log(Status.PASS, "New Claim Saved is successful");
		oExtentTest.addScreenCaptureFromPath(Selenium_Reporting_Utils.getScreenShot_Robot_createScreenCapture(driver));
	}

	public static void DuplicateClaimNumber() throws Throwable {

		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("searchValues");
		String cc1 = lhm_TestCase_Table_Data.get("ClaimsNumber");
		System.out.println(cc1);
	}

	public static void ncw_ClaimAssign_RoundRobin() throws Throwable {

		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("groups");

		String            currentUserAssign = "Terence Mazzon";
		ArrayList<String> rrExpectedUsers   = new ArrayList<String>();

		String[] aExpectedUsers = {"Betty Baker", "Heidi Johnson", "Terence Mazzon", "Isabel Numin", "Carlos Oppley", "Rick Ralston"};

		for (int intUser = 0; intUser < aExpectedUsers.length; intUser++) {

			// ------>Creating New Claim
			CC_NewClaimWizard.assignClaimProcess("VerifiedPolicyAuto");

			GuidewireAutomate_Validation("Screen Header", NewClaimSaved_Header, "equals", "New Claim Saved");

			String strActual_AssignedUser = getText_Element(NCS_AssignedUser).replace("Assigned User: ", "");
			if (strActual_AssignedUser.equals(aExpectedUsers[intUser])) {
				oExtentTest.log(Status.PASS, "ClaimAssign To User " + aExpectedUsers[intUser]);
			} else {
				oExtentTest.log(Status.FAIL, "ClaimAssign To User " + strActual_AssignedUser);
			}
		}

	}

	public static void ncw_newClaimSaved_Verify_ClaimAssignToUser(String strExpected_AssignedUser) throws Throwable {

		strClaimsNumber = null;

		GuidewireAutomate_Validation("Screen Header", NewClaimSaved_Header, "equals", "New Claim Saved");

		String strActual_AssignedUser = getText_Element(NCS_AssignedUser).replace("Assigned User: ", "");
		if (strActual_AssignedUser.equals(strExpected_AssignedUser)) {
			oExtentTest.log(Status.PASS, "ClaimAssign To User " + strActual_AssignedUser);
		} else {
			oExtentTest.log(Status.FAIL, "ClaimAssign To User " + strExpected_AssignedUser);
		}

	}

	public static void ncw_SearchorCreatePolicy_CreateUnverifiedPolicy() throws Throwable {

		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("asFindPolicy");

		strPolicyNumber = null;
		strPolicyNumber = lhm_TestCase_Table_Data.get("SCP_PolicyNumber");
		String strTypeOfClaim = lhm_TestCase_Table_Data.get("SCP_TypeOfClaim");

		// ------> Verifying the page -
		GuidewireAutomate_Validation("Screen Header", NCW_SearchorCreatePolicy_Header, "equals", "Step 1: Search or Create Policy");

		GuidewireAutomate("Create Unverified Policy", CreateUnverifiedPolicy, "clickAndwait", "click");
		GuidewireAutomate("Policy Number", CUP_PolicyNumber, "clearANDsendKeys", strPolicyNumber);
		GuidewireAutomate("Type", CUP_Type, "selectByVisibleTextAndwait", lhm_TestCase_Table_Data.get("SCP_FP_PolicyType"));
		getStaleElement("Type", CUP_Type);
		By TypeOfClaim = By.xpath("//span[@class='gw-label--inner' and text()='" + strTypeOfClaim + "']/preceding-sibling::span[@class='gw-radio-wrapper']//input[contains(@name,'ClaimLossType')]");
		getStaleElement("Type Of Claim", TypeOfClaim);
		GuidewireAutomate("Type Of Claim = " + strTypeOfClaim, TypeOfClaim, "clickAndwait", "click");
		getStaleElement("Loss Date", CUP_LossDate);

		GuidewireAutomate("Loss Date", CUP_LossDate, "clearANDsendKeys", lhm_TestCase_Table_Data.get("SCP_NC_LossDate"));
		GuidewireAutomate("Type", CUP_Type, "selectByVisibleTextAndwait", lhm_TestCase_Table_Data.get("SCP_FP_PolicyType"));
		getStaleElement("Reported Date", CUP_ReportedDate);
		GuidewireAutomate("Reported Date", CUP_ReportedDate, "clearANDsendKeys", lhm_TestCase_Table_Data.get("BI_RB_DateofNotice"));
		// GuidewireAutomate("Time", CUP_Time, "clearANDsendKeys", lhm_TestCase_Table_Data.get("SCP_NC_LossDate"));

	}

	public static void selectPolicy() throws Throwable {

		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("selectPolicy");

		GuidewireAutomate_Validation("Screen Header", PolicyGeneral_Header, "equals", "Policy: General");
		GuidewireAutomate("Select Policy", SelectPolicy, "clickAndwait", "click");
		GuidewireAutomate_Validation("Screen Header", SelectPolicy_Header, "equals", "Select Policy");
		GuidewireAutomate("Policy Number", SP_PolicyNumber, "clearANDsendKeys", lhm_TestCase_Table_Data.get("PolicyNumber"));
		GuidewireAutomate("Search", SP_Search, "clickAndwait", "click");
		GuidewireAutomate("Select", SP_Select, "clickAndwait", "click");

	}

	public static void basicInfo() throws Throwable {

		String insuredName = CC_Reusables.infoBar("InsuredName");

		GuidewireAutomate("Name", BI_RB_Name, "selectByVisibleText", insuredName);

	}

	public static void basicInfoAssignClaim() throws Throwable {

		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("basicInfo");

		String insuredName = CC_Reusables.infoBar("InsuredName");

		GuidewireAutomate("Name", BI_RB_Name, "selectByVisibleText", insuredName);

	}

	public static void ncw_CreateUnverifiedPolicy_BasicInformation() throws Throwable {

		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("asFindPolicy");

		strPolicyNumber = null;
		strPolicyNumber = lhm_TestCase_Table_Data.get("SCP_PolicyNumber");

		GuidewireAutomate_Validation("Basic Information", CUP_BasicInformation, "equals", "Basic Information");

		GuidewireAutomate_Validation("Policy Number", NCW_SearchorCreatePolicy_PolicyNumber, "equals", strPolicyNumber);
		GuidewireAutomate_Validation("Type", NCW_SearchorCreatePolicy_Type, "equals", lhm_TestCase_Table_Data.get("SCP_FP_PolicyType"));
		GuidewireAutomate("Effective Date", CUP_BI_EffectiveDate, "clearANDsendKeys", lhm_TestCase_Table_Data.get("SCP_FP_PR_EffectiveDate"));
		GuidewireAutomate("Expiration Date", CUP_BI_ExpirationDate, "clearANDsendKeys", lhm_TestCase_Table_Data.get("SCP_FP_PR_ExpirationDate"));
		// GuidewireAutomate("Reported Date", CUP_ReportedDate, "clearANDsendKeys", lhm_TestCase_Table_Data.get("BI_RB_DateofNotice"));
		// GuidewireAutomate("Cancellation Date", CUP_BI_ExpirationDate, "clearANDsendKeys", lhm_TestCase_Table_Data.get("CancellationDate"));
		// GuidewireAutomate("Original Effective Date", CUP_BI_ExpirationDate, "clearANDsendKeys",
		// lhm_TestCase_Table_Data.get("OriginalEffectiveDate"));
		// GuidewireAutomate("Status", CUP_BI_ExpirationDate, "selectByVisibleText", lhm_TestCase_Table_Data.get("Status"));
		Thread.sleep(500);
	}

	public static void ncw_CreateUnverifiedPolicy_Insured_Search() throws Throwable {

		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("CUPstep1");

		GuidewireAutomate("Insured Select", CUP_Insured_SelectMenu_Button, "clickAndwait", "click");
		GuidewireAutomate("Search", CUP_Insured_Menu_Search, "clickAndwait", "click");
		// GuidewireAutomate_Validation("Screen Header", PolicyCenter_Resuables_PO.Screen_Header, "equals", "Search Address Book");

		GuidewireAutomate("LastName", NP_P_LastName, "clearANDsendKeys", lhm_TestCase_Table_Data.get("LastName"));
		GuidewireAutomate("TaxID", NP_P_TaxID, "clearANDsendKeys", lhm_TestCase_Table_Data.get("TaxID"));
		GuidewireAutomate("Address1", NP_Address1, "clearANDsendKeys", lhm_TestCase_Table_Data.get("Address1"));

	}

	public static void ncw_CreateUnverifiedPolicy_Insured_NewPerson() throws Throwable {

		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("asFindPolicy");
		GuidewireAutomate("Section", PolicyLevelCoveragesSection, "moveToElement", "moveToElement");
		GuidewireAutomate("Insured", CUP_Insured, "moveToElement", "moveToElement");
		GuidewireAutomate("Insured Select", CUP_Insured_SelectMenu_Button, "clickAndwait", "click");
		Thread.sleep(500);
		GuidewireAutomate("New Person", CUP_Insured_Menu_NewPerson, "clickAndwait", "click");
		Thread.sleep(500);
		GuidewireAutomate_Validation("Screen Header", RBNewPerson_Header, "equals", "New Person");

		GuidewireAutomate_Validation("Section", CUP_NP_ThiscontactisnotlinkedtotheAddressBook, "equals", "This contact is not linked to the Address Book");

		GuidewireAutomate_Validation("Section", CUP_NP_Person, "equals", "Person");
		GuidewireAutomate("First Name", NP_P_FirstName, "clearANDsendKeys", lhm_TestCase_Table_Data.get("SCP_FP_FirstName"));
		GuidewireAutomate("Last Name", NP_P_LastName, "clearANDsendKeys", lhm_TestCase_Table_Data.get("SCP_FP_LastName"));
		GuidewireAutomate("TaxID", NP_P_TaxID, "clearANDsendKeys", lhm_TestCase_Table_Data.get("TaxID"));

	}

	public static void ncw_CUP_Underwriting() throws Throwable {
		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("asFindPolicy");
		GuidewireAutomate_Validation("Section", CUP_Underwriting, "equals", "Underwriting");
		GuidewireAutomate("Organization", CUP_Underwriting_Organization, "selectByVisibleText", lhm_TestCase_Table_Data.get("SCP_FP_OrganizationName"));
	}

	public static void fnol_Search_UnverifiedPolicy_AddVehicle() throws Throwable {

		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("SearchPolicy");

		GuidewireAutomate("AddVehicle", CUP_ANV_AddVehicle, "clickAndwait", "click");

		GuidewireAutomate_Validation("Screen Header", SP_NewVehicle, "equals", "New Vehicle");
		GuidewireAutomate("Make", CUP_ANV_Make, "clearANDsendKeys", lhm_TestCase_Table_Data.get("Make"));
		GuidewireAutomate("Model", CUP_ANV_Model, "clearANDsendKeys", lhm_TestCase_Table_Data.get("Model"));
		GuidewireAutomate("Year", CUP_ANV_Year, "clearANDsendKeys", lhm_TestCase_Table_Data.get("Year"));

		GuidewireAutomate("AddCoverages", CUP_ANV_AddCoverages, "clickAndwait", "click");

		GuidewireAutomate("CoverageType", CUP_ANV_CoverageType, "selectByVisibleText", lhm_TestCase_Table_Data.get("CoverageType"));
		GuidewireAutomate("ExposureLimit", CUP_ANV_ExposureLimit, "clearANDsendKeys", lhm_TestCase_Table_Data.get("ExposureLimit"));
		GuidewireAutomate("IncidentLimit", CUP_ANV_IncidentLimit, "clearANDsendKeys", lhm_TestCase_Table_Data.get("IncidentLimit"));
		GuidewireAutomate("Ok", Ok, "clickAndwait", "click");
	}

	public static void assignClaim() throws Throwable {

		GuidewireAutomate_Validation("Screen Header", Assign_Header, "equals", "Assign");
		GuidewireAutomate("Assign", Assign_Button, "clickAndwait", "click");
		GuidewireAutomate_Validation("Screen Header", CC_Reusables.Summary_Header, "equals", "Summary");

	}

	public static void ncw_AutoFirstandFinal() throws Throwable {

		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("acAutoFirstandFinal");

		String strInsuredName = lhm_TestCase_Table_Data.get("AFF_InsuredName");

		GuidewireAutomate_Validation("Screen Header", NCW_SearchorCreatePolicy_Header, "equals", "Step 1 of 2: Search or Create Policy");
		CC_Reusables.clickButton("Next");
		GuidewireAutomate_Validation("Screen Header", AutoFirstandFinal_Header, "equals", "Step 2 of 2: Auto First and Final");

		By WhoReportedClaim = By
				.xpath("//span[@class='gw-label--inner' and text()='" + lhm_TestCase_Table_Data.get("AFF_WhoreportedClaim") + "']//parent::label[@class='gw-RangeRadioValueWidget--label']//input[contains(@id,'FirstFinalReportedAgencyRadioButton')]");
		GuidewireAutomate("Who Reported Claim", WhoReportedClaim, "clickAndwait", "click");

		GuidewireAutomate("Name", AFF_Insured_Name, "selectByVisibleText", strInsuredName);

		GuidewireAutomate_Validation("Section", AFF_Damage, "equals", "Damage");
		GuidewireAutomate("Loss Description", AFF_Damage_LossDescription, "clearANDsendKeys", lhm_TestCase_Table_Data.get("LossDescription"));

		GuidewireAutomate_Validation("Section", AFF_Claimant, "equals", "Claimant");
		GuidewireAutomate("Name", AFF_ClaimantName, "selectByVisibleText", lhm_TestCase_Table_Data.get("AFF_ClaimantName"));
		GuidewireAutomate("Claimant Type", AFF_ClaimantType, "selectByVisibleText", lhm_TestCase_Table_Data.get("AFF_ClaimantType"));

		GuidewireAutomate("Location", AFF_Location, "selectByVisibleText", lhm_TestCase_Table_Data.get("AFF_Location"));
		GuidewireAutomate("Country", AFF_Country, "selectByVisibleText", lhm_TestCase_Table_Data.get("AFF_Country"));
		GuidewireAutomate("State", AFF_State, "selectByVisibleText", lhm_TestCase_Table_Data.get("AFF_State"));
		GuidewireAutomate("Address1", AFF_Address1, "sendKeys", lhm_TestCase_Table_Data.get("AFF_Address1"));

		RepairShop_Search();

		GuidewireAutomate("Financials Name", AFF_Financials_Name, "selectByVisibleText", strInsuredName);
		GuidewireAutomate_Validation("Screen Header", AutoFirstandFinal_Header, "equals", "Step 2 of 2: Auto First and Final");
		GuidewireAutomate("Financials PayeeType", AFF_Financials_PayeeType, "selectByVisibleTextAndwait", lhm_TestCase_Table_Data.get("PayeeType"));
		GuidewireAutomate("Financials Amount", AFF_Financials_Amount, "clearANDsendKeys", lhm_TestCase_Table_Data.get("FinancialsAmount"));
		GuidewireAutomate("Financials State", AFF_Financials_State, "selectByVisibleText", lhm_TestCase_Table_Data.get("FinancialsState"));
		GuidewireAutomate("Finish_Button", Finish_Button, "clickAndwait", "click");

	}

	public static void RepairShop_Search() throws Throwable {

		String strSABFV_Name = lhm_TestCase_Table_Data.get("SABFV_Name");

		GuidewireAutomate_Validation("Section", AFF_Repair, "equals", "Repair");
		GuidewireAutomate("Repair", AFF_RepairShop_TypeButton, "clickAndwait", "click");
		GuidewireAutomate("Search", AFF_RepairShop_Search, "clickAndwait", "click");

		GuidewireAutomate_Validation("Screen Header", SearchAddressBookForVendors_Header, "equals", "Search Address Book For Vendors");

		GuidewireAutomate("Type", SABFV_Type, "selectByVisibleText", lhm_TestCase_Table_Data.get("SABFV_Type"));
		GuidewireAutomate("Name", SABFV_Name, "clearANDsendKeys", strSABFV_Name);

		GuidewireAutomate("Search", SABFV_Search, "clickAndwait", "click");

		By RepairShop_Select = By.xpath("//div[@class='gw-ActionValueWidget' and text()='" + strSABFV_Name + "']/ancestor::td[contains(@id,'DisplayName_Cell')]/preceding-sibling::td//div[contains(@id,'Select')]/div[@role='button']");
		GuidewireAutomate("selectVendor", RepairShop_Select, "clickAndwait", "click");

	}

	public static void RepairShop_NewAutobodyRepairShop() throws Throwable {

		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("AutoFirstandFinal");

		// ----->Based on Type Of Contact in partiesInvolved we have to select name in line no 164 09-07-2021

		GuidewireAutomate_Validation("Section", AFF_Repair, "equals", "Repair");
		GuidewireAutomate("Repair", AFF_RepairShop_TypeButton, "clickAndwait", "click");
		GuidewireAutomate("NewAutobodyRepairShop", AFF_RepairShop_NewAutobodyRepairShop, "clickAndwait", "click");

		GuidewireAutomate_Validation("Screen Header", NewAutoRepairShop_Header, "equals", "New Auto Repair Shop");

		// String AutoRepairShopName =
		// lhm_TestCase_Table_Data.get("AutoRepairShopName");
		String AutoRepairShopName = "AutoRepairShopName" + getRandomNumeric(5);
		GuidewireAutomate("AutoRepairShop_Name", AFF_AutoRepairShop_Name, "clearANDsendKeys", AutoRepairShopName);

		String TaxID = lhm_TestCase_Table_Data.get("AutoRepairShopTaxID");
		if (TaxID.equalsIgnoreCase("345-34-310")) {
			String NewTaxId = TaxID + getRandomNumeric(1);
			GuidewireAutomate("Comments", AFF_AutoRepairShop_TaxID, "clearANDsendKeys", NewTaxId);
		} else {
			GuidewireAutomate("Comments", AFF_AutoRepairShop_TaxID, "clearANDsendKeys", TaxID);
		}

		GuidewireAutomate("Address1", AFF_AutoRepairShop_Address1, "clearANDsendKeys", lhm_TestCase_Table_Data.get("Address1"));
		GuidewireAutomate("City", AFF_AutoRepairShop_City, "clearANDsendKeys", lhm_TestCase_Table_Data.get("City"));
		GuidewireAutomate("County", AFF_AutoRepairShop_County, "clearANDsendKeys", lhm_TestCase_Table_Data.get("County"));
		GuidewireAutomate("State", AFF_AutoRepairShop_State, "selectByVisibleText", lhm_TestCase_Table_Data.get("AutoRepairShop_State"));
		GuidewireAutomate("ZIPCode", AFF_AutoRepairShop_ZIPCode, "clearANDsendKeys", lhm_TestCase_Table_Data.get("ZIPCode"));
		GuidewireAutomate("Update", Update_Button, "clickAndwait", "click");
		GuidewireAutomate("Update", Update_Button, "clickAndwait", "click");
	}

	public static void RepairShop_NewVendor_Company() throws Throwable {
	}

	public static void RepairShop_NewVendor_Person() throws Throwable {
	}

	public static void RepairShop_NewVendor_ViewContactDetails() throws Throwable {
	}

	public static void New_QuickClaimAuto() throws Throwable {

		String insuredName = driver.findElement(By.xpath("//div[contains(@id,'Insured')]//div[@class='gw-label gw-infoValue']")).getText();

		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("QuickClaimAuto");
		GuidewireAutomate_Validation("Screen Header", QuickClaimAuto_Header, "equals", "Step 2 of 2: Quick Claim Auto");
		GuidewireAutomate("ReportedBy_Name", QCA_ReportedBy_Name, "selectByVisibleText", insuredName);
		GuidewireAutomate("LossCause", QCA_LossDetails_LossCause, "selectByVisibleText", lhm_TestCase_Table_Data.get("LossCause"));
		GuidewireAutomate("State", QCA_LossDetails_State, "selectByVisibleText", lhm_TestCase_Table_Data.get("State"));
		GuidewireAutomate("Location", QCA_Location, "selectByVisibleText", lhm_TestCase_Table_Data.get("Location"));
	}

	public static void Verify_DraftClaimNumber() throws Throwable {
		String format           = "T00000";
		String draftClaimNumber = getText_Element(DraftClaimNumber).substring(0, 11);
		if (draftClaimNumber.startsWith(format)) {
			oExtentTest.log(Status.PASS, "Generated DraftClaimNumber format is " + draftClaimNumber);
		}
	}

	/*
	 * Author - Rahul Dixit Date - 21/12/2021 Description - Add Claim info For search
	 */

	public static void ncw_AddClaimInfo_ForSearch() throws Throwable {
		try {
			lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("asFindPolicy");

			// GuidewireAutomate("select", Select, "clickAndwait","clickAndwait");
			GuidewireAutomate("Reported Date", ReportedDate_Search, "clearANDsendKeys", lhm_TestCase_Table_Data.get("SCP_NC_ReportedDate"));
			GuidewireAutomate(" Loss Date", LossDate_Search, "clearANDsendKeys", lhm_TestCase_Table_Data.get("SCP_NC_LossDate"));
			CC_Reusables.clickButton("Next");
			Thread.sleep(500);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	// Misba
	// 17/12/2021
	// verify the claimants isb/w lob and loss date
	public static void Claimants_Validation() throws Throwable {

		try {
			GuidewireAutomate_Validation("Claims History", SCP_ClaimsHistory, "equals", "Claims History");
			List<WebElement> PLC_Headers = getElements(ClaimHistoryClaimtans_Headers);

			for (int i = 0; i < PLC_Headers.size(); i++) {

				String header3 = PLC_Headers.get(2).getText();
				String header4 = PLC_Headers.get(3).getText();
				String header5 = PLC_Headers.get(4).getText();
				if (header3.equals("Line of Business") && header4.equals("Claimant(s)") && header5.equals("Loss Date")) {
					oExtentTest.log(Status.PASS, "Claimant(s) field is displayed in the 'Claims History' between " + header3 + " and " + header5 + " column");
					break;
				} else {
					oExtentTest.log(Status.FAIL, "Claimant(s) field is not displayed in the 'Claims History' between " + header3 + " and " + header5 + " column");
					break;
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	// Misba
	// 23/12/2021
	// Claimants Separated by ;
	public static void Claimants() throws Throwable {
		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("asFindPolicy");
		try {
			GuidewireAutomate_Validation("Claimants Separated by ;", Claimants, "contains", "John Smith");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	// Divya
	// 23/12/2021
	// CMD/Reported
	public static void Policy() throws Throwable {
		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("asFindPolicy");
		try {
			// GuidewireAutomate("Edit", Edit, "clickAndwait", "click");
			GuidewireAutomate("Effective Date", EffectiveDate, "clearANDsendKeys", lhm_TestCase_Table_Data.get("SCP_FP_PR_EffectiveDate"));
			GuidewireAutomate("Expiration Date", ExpirationDate, "clearANDsendKeys", lhm_TestCase_Table_Data.get("SCP_FP_PR_ExpirationDate"));

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void LossDetails_Dates() throws Throwable {
		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("asFindPolicy");

		try {
			GuidewireAutomate("Reported Date", ReportedDatee, "clearANDsendKeys", lhm_TestCase_Table_Data.get("SCP_NC_ReportedDate"));
			GuidewireAutomate("Loss Date", LossDate, "clearANDsendKeys", lhm_TestCase_Table_Data.get("SCP_NC_LossDate"));
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void LossDates_DifferentValues() throws Throwable {
		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("asFindPolicy");

		try {
			GuidewireAutomate("Reported Date", ReportedDatee, "clearANDsendKeys", lhm_TestCase_Table_Data.get("SCP_NC_ReportedDate"));
			GuidewireAutomate("Loss Date", LossDate, "clearANDsendKeys", "12/23/2018");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void ErrorMessage() throws Throwable {
		try {
			GuidewireAutomate_Validation("warning", ValidationResults_warning, "equals", "Warning: Loss Date or CMD/Reported Date is outside the Coverage Period");
			GuidewireAutomate("Clear", ValidationResults_ClearButton, "clickAndwait", "click");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void ncw_CreateverifiedPolicy_LevelCoverages() throws Throwable {
		// lhm_TestCase_Table_Data = ClaimCenter_Resuables.getData_ClaimsCenter("asFindPolicy");

		try {
			// GuidewireAutomate("Policy Level Coverages Type", PolicyLevelCoveragesTypes_claim, "selectByVisibleText",
			// lhm_TestCase_Table_Data.get("PLC_Type1"));
			GuidewireAutomate("Claim Made", PolicyLevelCoveragesForm_claim, "selectByVisibleText", "Claims Made");

			// GuidewireAutomate("Policy Level Coverages Form", PolicyLevelCoveragesForm_claim, "selectByVisibleText",
			// lhm_TestCase_Table_Data.get("PLC_Form1"));
			GuidewireAutomate("RetroDate", RetroDate, "clearANDsendKeys", "12/20/2018");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	// Misba
	// 30/12/2021
	// CMD/Reported
	public static void Policy_Ext() throws Throwable {
		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("asFindPolicy");
		try {
			// GuidewireAutomate("Edit", Edit, "clickAndwait", "click");
			GuidewireAutomate("Effective Date", EffectiveDate, "clearANDsendKeys", lhm_TestCase_Table_Data.get("SCP_FP_PR_EffectiveDate"));
			GuidewireAutomate("Expiration Date", ExpirationDate, "clearANDsendKeys", lhm_TestCase_Table_Data.get("SCP_FP_PR_ExpirationDate"));
			GuidewireAutomate("Ext Date", ExtDate, "clearANDsendKeys", lhm_TestCase_Table_Data.get("SCP_FP_PR_ExtDate"));

		} catch (Exception e) {
			e.printStackTrace();
			throw e;

		}
	}

	public static void CreateUnverifiedPolicy_LevelCoverages() throws Throwable {
		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("asFindPolicy");

		try {
			GuidewireAutomate_Validation("Policy Level Coverages Section", PolicyLevelCoveragesSection, "equals", "Policy-level Coverages");
			GuidewireAutomate("Policy Level Coverages Add Button", PolicyLevelCoveragesAddButton, "clickAndwait", "click");
			Thread.sleep(500);
			GuidewireAutomate("Policy Level Coverages Type", PolicyLevelCoveragesTypes, "selectByVisibleText", lhm_TestCase_Table_Data.get("PLC_Type1"));
			Thread.sleep(500);
			GuidewireAutomate("Policy Level Coverages Form", PolicyLevelCoveragesForm, "selectByVisibleText", lhm_TestCase_Table_Data.get("PLC_Form1"));
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Owner;Rahul Dixit
	 */
	public static void Verify_LOBNotEditable() throws Throwable {
		try {
			WebElement LOB = driver.findElement(By.xpath("//div[@id='ClaimStatus-LineOfBusiness']//div[@class='gw-label']"));

			if (LOB.isEnabled()) {
				oExtentTest.log(Status.PASS, "LOB is not Editable");
			} else {
				oExtentTest.log(Status.FAIL, "LOB is  Editable");
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Author - Misba Date - 30/12/2021 Description - Warning: Loss Date or CMD/Reported Date is outside the Coverage Period
	 */

	public static void Warning_OutsideCoverage() throws Throwable {
		try {
			GuidewireAutomate_Validation("warning", warning_OutsideCoverage, "equals", "Warning: Loss Date or CMD/Reported Date is outside the Coverage Period");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void CreateUnverifiedPolicy_LevelCoveragesRetro() throws Throwable {
		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("asFindPolicy");

		try {
			GuidewireAutomate_Validation("Policy Level Coverages Section", PolicyLevelCoveragesSection, "equals", "Policy-level Coverages");
			GuidewireAutomate("Policy Level Coverages Add Button", PolicyLevelCoveragesAddButton, "clickAndwait", "click");
			Thread.sleep(500);
			GuidewireAutomate("Policy Level Coverages Type", PolicyLevelCoveragesTypes, "selectByVisibleText", lhm_TestCase_Table_Data.get("PLC_Type1"));
			Thread.sleep(500);
			GuidewireAutomate("Policy Level Coverages Form", PolicyLevelCoveragesForm, "selectByVisibleText", lhm_TestCase_Table_Data.get("PLC_Form1"));
			GuidewireAutomate("RetroDate", RetroDate, "clearANDsendKeys", lhm_TestCase_Table_Data.get("RetroDate"));

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void ncw_SearchorCreatePolicy_CreateUnverifiedPolicyMultiplePolicy() throws Throwable {

		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("asFindPolicy");
		strPolicyNumber         = null;
		String strLossDate     = null;
		String strReportedDate = null;
		strLossDate     = lhm_TestCase_Table_Data.get("SCP_NC_LossDate");
		strReportedDate = lhm_TestCase_Table_Data.get("BI_RB_DateofNotice");
		strPolicyNumber = lhm_TestCase_Table_Data.get("SCP_PolicyNumber");

		for (int i = 1; i <= 4; i++) {
			// NewClaim
			CC_Reusables.ccTabNavigation("New Claim", "NA");

			// ------> Verifying the page -
			GuidewireAutomate_Validation("Screen Header", NCW_SearchorCreatePolicy_Header, "equals", "Step 1: Search or Create Policy");

			GuidewireAutomate("Create Unverified Policy", CreateUnverifiedPolicy, "clickAndwait", "click");
			Thread.sleep(1000);
			GuidewireAutomate("Policy Number", CUP_PolicyNumber, "clearANDsendKeys", strPolicyNumber);
			Thread.sleep(1000);
			if (i == 1) {
				GuidewireAutomate("Type", CUP_Type, "selectByVisibleTextAndwait", "Excess Subcontractor Default Insurance - Project");
				getStaleElement("Type", CUP_Type);
				Thread.sleep(1000);
				GuidewireAutomate("Loss Date", CUP_LossDate, "clearANDsendKeys", strLossDate);
				getStaleElement("Loss Date", CUP_LossDate);
				Thread.sleep(1000);
				GuidewireAutomate("Type", CUP_Type, "selectByVisibleTextAndwait", "Excess Subcontractor Default Insurance - Project");
				getStaleElement("Reported Date", CUP_ReportedDate);
				GuidewireAutomate("Reported Date", CUP_ReportedDate, "clearANDsendKeys", strReportedDate);
			}
			if (i == 2) {
				GuidewireAutomate("Type", CUP_Type, "selectByVisibleTextAndwait", "Excess Subcontractor Default Insurance - Subcontractor");
				getStaleElement("Type", CUP_Type);
				Thread.sleep(1000);
				GuidewireAutomate("Loss Date", CUP_LossDate, "clearANDsendKeys", strLossDate);
				getStaleElement("Loss Date", CUP_LossDate);
				Thread.sleep(1000);
				GuidewireAutomate("Type", CUP_Type, "selectByVisibleTextAndwait", "Excess Subcontractor Default Insurance - Subcontractor");
				getStaleElement("Reported Date", CUP_ReportedDate);
				GuidewireAutomate("Reported Date", CUP_ReportedDate, "clearANDsendKeys", strReportedDate);
			}
			if (i == 3) {
				GuidewireAutomate("Type", CUP_Type, "selectByVisibleTextAndwait", "Subcontractor Default Insurance - Project");
				getStaleElement("Type", CUP_Type);
				Thread.sleep(1000);
				GuidewireAutomate("Loss Date", CUP_LossDate, "clearANDsendKeys", strLossDate);
				getStaleElement("Loss Date", CUP_LossDate);
				Thread.sleep(1000);
				GuidewireAutomate("Type", CUP_Type, "selectByVisibleTextAndwait", "Subcontractor Default Insurance - Project");
				getStaleElement("Reported Date", CUP_ReportedDate);
				GuidewireAutomate("Reported Date", CUP_ReportedDate, "clearANDsendKeys", strReportedDate);
			}
			if (i == 4) {
				GuidewireAutomate("Type", CUP_Type, "selectByVisibleTextAndwait", "Subcontractor Default Insurance - Subcontractor");
				getStaleElement("Type", CUP_Type);
				Thread.sleep(1000);
				GuidewireAutomate("Loss Date", CUP_LossDate, "clearANDsendKeys", strLossDate);
				getStaleElement("Loss Date", CUP_LossDate);
				Thread.sleep(1000);
				GuidewireAutomate("Type", CUP_Type, "selectByVisibleTextAndwait", "Subcontractor Default Insurance - Subcontractor");
				getStaleElement("Reported Date", CUP_ReportedDate);
				GuidewireAutomate("Reported Date", CUP_ReportedDate, "clearANDsendKeys", strReportedDate);
			}
			CC_NewClaimWizard.ncw_CreateUnverifiedPolicy_BasicInformation();
			CC_NewClaimWizard.ncw_CreateUnverifiedPolicy_Insured_NewPerson();
			CC_Reusables.clickButton("Update");
			CC_NewClaimWizard.ncw_CUP_Underwriting();
			CC_Reusables.clickButton("Next");
			CC_NewClaimWizard.bi_ReportedBy_InsuredName();
			CC_Reusables.clickButton("Next");
			CC_NewClaimWizard.ncw_PossibleDuplicateClaims();
			CC_NewClaimWizard.ncw_AddClaimInformation_VerifyDefaultLOB();
			GuidewireAutomate("Cancel", AddClaim_Cancel, "clickAndwait", "click");
			GuidewireAutomate_Handle("alertaccept", "alert");
			Thread.sleep(2000);
		}

	}

	public static void AsAddClaimInfo_LiabilityAddInjury_Injuries() throws Throwable {
		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("asAddClaimInfo");

		try {
			GuidewireAutomate_Validation("Screen Header", ACI_Liability_NewGeneralDamageHeader, "equals", "Injury Incident");
			GuidewireAutomate("General Injury Type", ACI_Liability_AddInjuryGeneralInjuryType, "selectByVisibleTextAndwait", lhm_TestCase_Table_Data.get("GeneralInjuryType"));
			Thread.sleep(1000);
			Select DetailedInjuryType = new Select(driver.findElement(By.xpath("//select[contains(@name,'InjuryIncidentInputSet-DetailedInjuryType')]")));

			List<WebElement> DetailedInjuryType_getOptions = DetailedInjuryType.getOptions();

			for (int i = 0; i < DetailedInjuryType_getOptions.size(); i++) {

				String Type1  = DetailedInjuryType_getOptions.get(4).getText();
				String Type2  = DetailedInjuryType_getOptions.get(17).getText();
				String Type3  = DetailedInjuryType_getOptions.get(24).getText();
				String Type4  = DetailedInjuryType_getOptions.get(39).getText();
				String Type5  = DetailedInjuryType_getOptions.get(41).getText();
				String Type6  = DetailedInjuryType_getOptions.get(43).getText();
				String Type7  = DetailedInjuryType_getOptions.get(52).getText();
				String Type8  = DetailedInjuryType_getOptions.get(57).getText();
				String Type9  = DetailedInjuryType_getOptions.get(59).getText();
				String Type10 = DetailedInjuryType_getOptions.get(65).getText();
				String Type11 = DetailedInjuryType_getOptions.get(79).getText();
				String Type12 = DetailedInjuryType_getOptions.get(82).getText();
				String Type13 = DetailedInjuryType_getOptions.get(83).getText();

				if (Type1.equals("Addiction Including Overdose") && Type2.equals("Cancer") && Type3.equals("Death") && Type4.equals("Hepatitis") && Type5.equals("HIV") && Type6.equals("Immobility") && Type7.equals("Mental stress")
						&& Type8.equals("Other") && Type9.equals("Paraplegia") && Type10.equals("Quadriplegia") && Type11.equals("Systemic Organ Failure") && Type12.equals("Traumatic Brain Injury") && Type13.equals("Unknown")) {
					oExtentTest.log(Status.PASS, Type1 + ", " + Type2 + ", " + Type3 + ", " + Type4 + ", " + Type5 + ", " + Type6 + ", " + Type7 + ", " + Type8 + ", " + Type9 + ", " + Type10 + ", " + Type11 + ", " + Type12 + ", " + Type13
							+ ", values are Displayed in alphabetical order.");
					break;
				} else {
					oExtentTest.log(Status.PASS, Type1 + ", " + Type2 + ", " + Type3 + ", " + Type4 + ", " + Type5 + ", " + Type6 + ", " + Type7 + ", " + Type8 + ", " + Type9 + ", " + Type10 + ", " + Type11 + ", " + Type12 + ", " + Type13
							+ ", values are Displayed not in alphabetical order.");
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Owner : Rahul Dixit Date : 09/02/2022
	 */
	public static void VerifyActivitiesDueIn14Days() throws Throwable {

		try {
			GuidewireAutomate("Activity Filter", ActivityFilter, "selectByVisibleText", "Due within 14 days");
			getStaleElement("Activity Filter", ActivityFilter);
			GuidewireAutomate_Validation("Activities Due In 14 Days", Activity_14DaysDue, "contains", "Due within 14 days");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Owner : Rahul Dixit Date : 09/02/2022
	 */
	public static void VerifyLossDateIsAddedAfterReportedDate() throws Throwable {
		try {
			List<WebElement> PLC_Headers = getElements(Claims_Header);

			for (int i = 0; i < PLC_Headers.size(); i++) {
				String header1 = PLC_Headers.get(6).getText();
				if (header1.equals("Loss Date") && PLC_Headers.get(7).getText().equals("Reported Date")) {
					oExtentTest.log(Status.PASS, "Reported Date Added After Loss Date");
					break;
				} else {
					oExtentTest.log(Status.FAIL, "Reported Date Not Added After Loss Date");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Owner : Rahul Dixit Date : 09/02/2022
	 */
	public static void VerifyAllOpenReviewNewClaimActivity() throws Throwable {

		try {

			GuidewireAutomate_Validation("Review New Claim Activities ", Activity_ReviewNewClaim, "contains", "Review New Claim");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void ncw_CreateUnverifiedPolicy_LevelCoverages_VerifyCurrency() throws Throwable {
		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("asFindPolicy");

		try {
			GuidewireAutomate_Validation("Policy Level Coverages Section", PolicyLevelCoveragesSection, "equals", "Policy-level Coverages");
			GuidewireAutomate("Policy Level Coverages Add Button", PolicyLevelCoveragesAddButton, "clickAndwait", "click");
			Thread.sleep(500);
			GuidewireAutomate_Validation("Policy Level Coverages Currency", PolicyLevelCoveragesCurrency, "getOptionscontains", lhm_TestCase_Table_Data.get("PLC_Currency"));

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void ncw_AddClaimInformation_Bordereau_AsYes() throws Throwable {
		try {

			GuidewireAutomate("Bordereau Report Yes", ACI_BordereauReport_Yes, "clickAndwait", "click");
			getStaleElement("Bordereau Report Yes", ACI_BordereauReport_Yes);
			GuidewireAutomate("Bordereau Report Yes", ACI_BordereauReport_Yes, "clickAndwait", "click");

		} catch (Exception e) {
			GuidewireAutomate("Bordereau Report Yes", ACI_BordereauReport_Yes, "clickAndwait", "click");
		}
	}

	public static void ncw_SaveAndAssignClaimWithGroup() throws Throwable {

		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("asSaveAndAssignClaim");

		// ---->Add script to Select a user 09-07-2021 dinesh
		GuidewireAutomate_Validation("Screen Header", SaveAndAssignClaim_Header, "equals", "Step 4 of 4: Save and Assign Claim");
		GuidewireAutomate_Validation("Section", SAC_Assignment, "equals", "Assignment");

		// GuidewireAutomate("CommonAssign", SAC_A_CommonAssign, "clickAndwait", "click");
		// GuidewireAutomate_Validation("Assign claim and all exposures to", SAC_A_AssignclaimExposuresto, "FirstSelectedOptionEquals",
		// lhm_TestCase_Table_Data.get("SAC_A_AssignclaimExposuresto"));
		GuidewireAutomate("Assign Group", SAC_A_AssignGroup, "selectByVisibleText", lhm_TestCase_Table_Data.get("AssignedToGroup"));

		oExtentTest.log(Status.PASS, "Save and Assign Claim is successful");
		oExtentTest.addScreenCaptureFromPath(Selenium_Reporting_Utils.getScreenShot_Robot_createScreenCapture(driver));
	}

	public static void LOB_CreateUnverfiedPolicy() throws Throwable {
		try {
			// NewClaim
			CC_Reusables.ccTabNavigation("New Claim", "NA");
			// ----->Assign Claim
			CC_NewClaimWizard.ncw_SearchorCreatePolicy_CreateUnverifiedPolicy();
			CC_NewClaimWizard.ncw_CreateUnverifiedPolicy_BasicInformation();
			CC_NewClaimWizard.ncw_CreateUnverifiedPolicy_Insured_NewPerson();
			CC_Reusables.clickButton("Update");
			CC_NewClaimWizard.ncw_CreateUnverifiedPolicy_LevelCoverages();
		} catch (Exception e) {
		}
	}

	public static void LOB_CreateUnverfiedPolicyAssignGroup() throws Throwable {
		try {
			// NewClaim
			CC_Reusables.ccTabNavigation("New Claim", "NA");
			// ----->Assign Claim
			CC_NewClaimWizard.ncw_SearchorCreatePolicy_CreateUnverifiedPolicy();
			CC_NewClaimWizard.ncw_CreateUnverifiedPolicy_BasicInformation();
			CC_NewClaimWizard.ncw_CreateUnverifiedPolicy_Insured_NewPerson();
			CC_Reusables.clickButton("Update");
			CC_NewClaimWizard.ncw_CreateUnverifiedPolicy_LevelCoverages();
			CC_NewClaimWizard.ncw_CUP_Underwriting();
			CC_Reusables.clickButton("Next");
			CC_NewClaimWizard.bi_ReportedBy_InsuredName();
			CC_Reusables.clickButton("Next");
			CC_NewClaimWizard.ncw_PossibleDuplicateClaims();
			CC_NewClaimWizard.ncw_AddClaimInformation_OtherLocation();
			CC_Reusables.clickButton("Next");
			Thread.sleep(1000);
			CC_NewClaimWizard.ncw_SaveAndAssignClaimWithGroup();
			CC_Reusables.clickButton("Finish");
			CC_NewClaimWizard.ncw_ViewtheNewlySavedClaim();
		} catch (Exception e) {
		}
	}

	public static void SearchorCreatePolicy_PropertyQuickClaimShouldNotAppear() throws Throwable {
		try {
			By QuickClaim = By.xpath("//div[@class='gw-label' and text()='QuickClaim']");

			VerifyElementNotExist("QuickClaim", QuickClaim);

		} catch (NoSuchElementException e) {

			e.printStackTrace();
			throw e;
		}
	}

	public static void ncw_CreateUnverifiedPolicy_AddPolicyTypeLevelCoverages() throws Throwable {
		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("asFindPolicy");

		GuidewireAutomate_Validation("Policy Level Coverages Section", PolicyLevelCoveragesSection, "equals", "Policy-level Coverages");

		GuidewireAutomate("Policy Level Coverages Add Button", PolicyLevelCoveragesAddButton, "clickAndwait", "click");
		Thread.sleep(1000);
		try {
			for (int i = 0; i <= 15; i++) {

				By ER_PolicyType = By.xpath("//select[contains(@name,'PolicyCoveragesLV-" + i + "-CoverageType')]");
				GuidewireAutomate("All Coverages Policy Type added", ER_PolicyType, "selectByVisibleText", lhm_TestCase_Table_Data.get("PolicyType" + i));
				Thread.sleep(2000);

				if (i < 15) {
					getStaleElement("Policy Type", ER_PolicyType);
					GuidewireAutomate("Add", PolicyLevelCoveragesAddButton, "clickAndwait", "Click");
				} else {

				}
			}

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	// MIsba
	public static void VerifyAllPolicyLevelCoverageDisplayed() throws Throwable {

		try {
			GuidewireAutomate_Validation("Certified Acts of Terrorism", PC_Certified, "equals", "Certified Acts of Terrorism");
			GuidewireAutomate_Validation("Bankers Professional Liability-GeneralDamage", PC_BankersProfLiability, "equals", "Bankers Professional Liability-GeneralDamage");
			GuidewireAutomate_Validation("Bond-GeneralDamage", PC_Bond, "equals", "Bond-GeneralDamage");
			GuidewireAutomate_Validation("Bond Form 14-GeneralDamage", PC_Bond14, "equals", "Bond Form 14-GeneralDamage");
			GuidewireAutomate_Validation("Bond Form 15-GeneralDamage", PC_Bond15, "equals", "Bond Form 15-GeneralDamage");
			GuidewireAutomate_Validation("Bond Form 24-GeneralDamage", PC_Bond24, "equals", "Bond Form 24-GeneralDamage");
			GuidewireAutomate_Validation("Bond Form 25-GeneralDamage", PC_Bond25, "equals", "Bond Form 25-GeneralDamage");
			GuidewireAutomate_Validation("Directors & Officers Liability-GeneralDamage", PC_Director, "equals", "Directors & Officers Liability-GeneralDamage");
			GuidewireAutomate_Validation("Employment Practices Liability -GeneralDamage", PC_Employment, "equals", "Employment Practices Liability -GeneralDamage");
			GuidewireAutomate_Validation("Errors & Omissions-GeneralDamage", PC_Errors, "equals", "Errors & Omissions-GeneralDamage");
			GuidewireAutomate_Validation("Insurance Companies Liability-GeneralDamage", PC_Insurance, "equals", "Insurance Companies Liability-GeneralDamage");
			GuidewireAutomate_Validation("Investment Management Liability-GeneralDamage", PC_Investment, "equals", "Investment Management Liability-GeneralDamage");
			GuidewireAutomate_Validation("Private Equity Liability-GeneralDamage", PC_Private, "equals", "Private Equity Liability-GeneralDamage");
			GuidewireAutomate_Validation("Security Broker Dealer Liability-GeneralDamage", PC_Security, "equals", "Security Broker Dealer Liability-GeneralDamage");
			GuidewireAutomate_Validation("Side A DIC-GeneralDamage", PC_SideA, "equals", "Side A DIC-GeneralDamage");
			GuidewireAutomate_Validation("Side A Only-GeneralDamage", PC_SideGenral, "equals", "Side A Only-GeneralDamage");
			Thread.sleep(2000);
			// GuidewireAutomate_Validation("Wage & Hour-GeneralDamage", PC_Wage, "equals", "Wage & Hour-GeneralDamage");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void ncw_ACI_AddIncident(int intRowNO) throws Throwable {

		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("Incident");

		switch (lhm_TestCase_Table_Data.get("TypeOfIncident")) {
			case "Bodily Injury" :
				CC_NewClaimWizard.ncw_Auto_AddClaimInformation_Incident_BodilyInjury(intRowNO);
				break;
			case "Property Damage" :

				break;
			case "General Damage" :
				CC_NewClaimWizard.ncw_Auto_AddClaimInformation_Incident_GeneralDamage(intRowNO);
				break;

			default :

		}

	}

	public static void ncw_SaveAndAssignClaim_Assign() throws Throwable {

		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("asSaveAndAssignClaim");

		GuidewireAutomate_Validation("Screen Header", SaveAndAssignClaim_Header, "equals", "Step 4 of 4: Save and Assign Claim");

		GuidewireAutomate_Validation("Section", SAC_Assignment, "equals", "Assignment");

		// GuidewireAutomate("CommonAssign", SAC_A_CommonAssign, "clickAndwait", "click");
		// GuidewireAutomate("Assign claim and all exposures to", SAC_A_AssignclaimExposuresto, "selectByVisibleText",
		// lhm_TestCase_Table_Data.get("SAC_A_AssignclaimExposuresto"));
		GuidewireAutomate("Assign To Group", SAC_A_AssignToGroup, "selectByVisibleText", lhm_TestCase_Table_Data.get("AssignedToGroup"));
		getStaleElement("Assign To User", SAC_A_AssignToUser);
		GuidewireAutomate("Assign To User", SAC_A_AssignToUser, "selectByVisibleText", lhm_TestCase_Table_Data.get("AssignedToUser"));
		getStaleElement("Assign To User", SAC_A_AssignToUser);

		oExtentTest.log(Status.PASS, "Save and Assign Claim is successful");
		oExtentTest.addScreenCaptureFromPath(Selenium_Reporting_Utils.getScreenShot_Robot_createScreenCapture(driver));
	}

	public static void VerifyLiabilityAndPropertyInUnverified() throws Throwable {

		try {
			GuidewireAutomate_Validation("Screen Header", NCW_SearchorCreatePolicy_Header, "equals", "Step 1: Search or Create Policy");

			GuidewireAutomate("Create Unverified Policy", CreateUnverifiedPolicy, "clickAndwait", "click");
			GuidewireAutomate_Validation("Liability", CUP_Liability, "equals", "Liability");
			GuidewireAutomate_Validation("Property", CUP_Property, "equals", "Property");
			oExtentTest.log(Status.PASS, "Liability And Property Displayed");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

	public static void VerifySeverityFieldShouldNotMandatoryInGeneralDamage() throws Throwable {

		try {

			// GuidewireAutomate_Validation("Screen Header", ACI_Liability_NewGeneralDamageHeader, "equals", "New General Damage Incident");
			String Error         = getText_Element(ACI_LiabilitySeverityErrorMsg);
			String SeverityError = "Severity";
			if (Error.contains(SeverityError)) {
				oExtentTest.log(Status.FAIL, "Missing required field " + SeverityError + " Is Mandatory");
			} else {
				oExtentTest.log(Status.PASS, "Missing required field " + SeverityError + " Is Not Mandatory");
			}

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}
}
