package com.pages.Guidewire.ClaimsCenter;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.aventstack.extentreports.ExtentTest;

public class CC_Workplan extends SeleniumWebDriver_Commands {

	private static By WorkPlan_Header = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading']");

	private static By WP_AllActivities                  = By.xpath("//input[contains(@name,'WorkplanLV-_Checkbox')]");
	private static By WP_30DayDairy                     = By.xpath("//div[contains(text(),'30 day diary')]/ancestor::td[contains(@id,'Subject_Cell')]/preceding-sibling::td//input[contains(@name,'Checkbox')]");
	private static By WP_ReviewNewClaim                 = By.xpath("//div[contains(text(),'Review New Claim')]/ancestor::td[contains(@id,'Subject_Cell')]/preceding-sibling::td//input[contains(@name,'Checkbox')]");
	private static By WP_ReviewNewPayment               = By.xpath("//div[contains(text(),'Review and approve new payment')]/ancestor::td[contains(@id,'Subject_Cell')]/preceding-sibling::td//input[contains(@name,'Checkbox')]");
	private static By WP_Sendclaimacknowledgementletter = By.xpath("//div[contains(text(),'Send claim acknowledgement letter')]/ancestor::td[contains(@id,'Subject_Cell')]/preceding-sibling::td//input[contains(@name,'Checkbox')]");
	private static By WP_ReviewReject                   = By.xpath("//div[contains(text(),'Review rejected request')]/ancestor::td[contains(@id,'Subject_Cell')]/preceding-sibling::td//input[contains(@name,'Checkbox')]");

	private static By WP_Assign                    = By.xpath("//div[contains(@id,'ClaimWorkplan_AssignButton')]/div[@role='button']");
	private static By WP_Skip                      = By.xpath("//div[contains(@id,'ClaimWorkplan_SkipButton')]/div[@role='button']");
	private static By WP_Complete                  = By.xpath("//div[contains(@id,'ClaimWorkplan_CompleteButton')]/div[@role='button']");
	private static By WP_Approve                   = By.xpath("//div[contains(@id,'ClaimWorkplan_ApproveButton')]/div[@role='button']");
	private static By WP_Reject                    = By.xpath("//div[contains(@id,'ClaimWorkplan_RejectButton')]/div[@role='button']");
	private static By WorkPlan_subject1            = By.xpath("//div[contains(@id,'Subject_button') and text()='Make initial contact with insured']");
	private static By WorkPlan_AssignedBy          = By.xpath("//div[contains(@id,'WorkplanLV-6-Assigner')]//div[@class='gw-value-readonly-wrapper']");
	private static By WorkPlan_AssignedTo          = By.xpath("//div[contains(@id,'WorkplanLV-6-AssignedUser')]//div[@class='gw-value-readonly-wrapper']");
	private static By AssignedBy                   = By.xpath("//div[contains(@id,'WorkplanLV-1-Assigner')]//div[@class='gw-value-readonly-wrapper']");
	private static By AssignedTo                   = By.xpath("//div[contains(@id,'WorkplanLV-1-AssignedUser')]//div[@class='gw-value-readonly-wrapper']");
	private static By Verify_AssignedBy            = By.xpath("//div[contains(@id,'WorkplanLV-6-Assigner')]//div[@class='gw-value-readonly-wrapper']");
	private static By Verify_AssignedTo            = By.xpath("//div[contains(@id,'WorkplanLV-6-AssignedUser')]//div[@class='gw-value-readonly-wrapper']");
	private static By AssignedB                    = By.xpath("//div[contains(@id,'WorkplanLV-6-Assigner')]//div[@class='gw-value-readonly-wrapper']");
	private static By AssignedT                    = By.xpath("//div[contains(@id,'WorkplanLV-6-AssignedUser')]//div[@class='gw-value-readonly-wrapper']");
	private static By Workplan_ReviewNewClaim      = By.xpath("//div[contains(@id,'WorkplanLV-2-Subject')]//div[@role='button']");
	private static By MediationDate_Link           = By.xpath("//div[contains(@id,'ClaimWorkplan-ClaimWorkplanScreen-WorkplanLV-2-Subject_button')]");
	private static By MediationDate_CompleteButton = By.xpath("//div[contains(@id,'ActivityDetailScreen_CompleteButton')]//div[@role='button']");
	private static By Litigation_Error             = By.xpath("//div[contains(@id,'WebMessageWorksheetScreen-grpMsgs-0-0')]//div[@class='gw-message']");

	/*
	 * final By workplan=By.id("Claim-MenuLinks-Claim_ClaimWorkplan"); final By
	 * subject=By.id("ClaimWorkplan-ClaimWorkplanScreen-WorkplanLV-4-Subject_button"); final By sampleText1=By.xpath("//*[@id='l--2']"); final By
	 * updateLossDecision=By.xpath(
	 * "//*[@id='ActivityDetailWorksheet-ActivityDetailScreen-ActivityDV-ActivityCompensableInputSet-UpdateCompensability']/div/div[2]"); final By
	 * closeWorksheet=By.xpath("//*[@id='ActivityDetailWorksheet-ActivityDetailScreen-Close']/div/div[2]"); final By injuryDuringEmployment=By.id(
	 * "ClaimLossDetails-ClaimLossDetailsScreen-LossDetailsPanelSet-LossDetailsCardCV-LossDetailsDV-CompensabilityFactorsInputSet-Claim_EmploymentInjury_1"
	 * ); final By performingRegularJob=By.id(
	 * "ClaimLossDetails-ClaimLossDetailsScreen-LossDetailsPanelSet-LossDetailsCardCV-LossDetailsDV-CompensabilityFactorsInputSet-InjuredOnRegularJob_1"
	 * ); final By employerQuestionsClaim=By.id(
	 * "ClaimLossDetails-ClaimLossDetailsScreen-LossDetailsPanelSet-LossDetailsCardCV-LossDetailsDV-CompensabilityFactorsInputSet-EmployerQuestionsValidity_1"
	 * ); final By safetyEquipmentProvided=By.id(
	 * "ClaimLossDetails-ClaimLossDetailsScreen-LossDetailsPanelSet-LossDetailsCardCV-LossDetailsDV-CompensabilityFactorsInputSet-SafetyEquipmentProvided_1"
	 * ); final By safetyEquipmentUsed=By.id(
	 * "ClaimLossDetails-ClaimLossDetailsScreen-LossDetailsPanelSet-LossDetailsCardCV-LossDetailsDV-CompensabilityFactorsInputSet-SafetyEquipmentUsed_0"
	 * ); final By drugsInvolved=By.id(
	 * "ClaimLossDetails-ClaimLossDetailsScreen-LossDetailsPanelSet-LossDetailsCardCV-LossDetailsDV-CompensabilityFactorsInputSet-DrugsInvolved_2");
	 * final By sampleTest2=By.id("ClaimLossDetails-ClaimLossDetailsScreen-LossDetailsPanelSet-LossDetailsCardCV-LossDetailsDV-Classification"); final
	 * By compensability=By.name(
	 * "ClaimLossDetails-ClaimLossDetailsScreen-LossDetailsPanelSet-LossDetailsCardCV-LossDetailsDV-CompensabilityFactorsInputSet-CompensableInputSet-CompensableStatus"
	 * ); final By reasonforDecision=By.name(
	 * "ClaimLossDetails-ClaimLossDetailsScreen-LossDetailsPanelSet-LossDetailsCardCV-LossDetailsDV-CompensabilityFactorsInputSet-CompensableInputSet-CompensabilityDecision_BenefitsDecisionReason"
	 * ); final By update=By.xpath("//*[@id='ClaimLossDetails-ClaimLossDetailsScreen-Update']/div/div[2]/div"); final By
	 * workplanCheckBox=By.id("ClaimWorkplan-ClaimWorkplanScreen-WorkplanLV-_Checkbox"); final By
	 * complete=By.id("ClaimWorkplan-ClaimWorkplanScreen-ClaimWorkplan_CompleteButton");
	 */

	public CC_Workplan(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	public static void workPlan() throws Throwable {
		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("workplan");

		try {
			GuidewireAutomate_Validation("Screen Header", WorkPlan_Header, "equals", "Workplan");

			if (lhm_TestCase_Table_Data.get("ReviewNewPayment").equals("Yes")) {
				GuidewireAutomate("ReviewNewPayment", WP_ReviewNewPayment, "clickAndwait", "click");
				GuidewireAutomate("Assign", WP_Assign, "clickAndwait", "click");
				CC_ClaimActions.AssignClaim();
				lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("workplan");

				GuidewireAutomate_Validation("Screen Header", WorkPlan_Header, "equals", "Workplan");
				GuidewireAutomate("ReviewNewPayment", WP_ReviewNewPayment, "clickAndwait", "click");
				GuidewireAutomate("Reject", WP_Reject, "clickAndwait", "click");
				Thread.sleep(500);
				getStaleElement("Review rejected request", WP_ReviewReject);
				GuidewireAutomate("Review rejected request", WP_ReviewReject, "clickAndwait", "click");
				GuidewireAutomate("Complete", WP_Complete, "clickAndwait", "click");
				Thread.sleep(500);
			}

			if (lhm_TestCase_Table_Data.get("30DayDairy").equals("Yes")) {
				GuidewireAutomate("WorkPlan", WP_30DayDairy, "clickAndwait", "click");
				GuidewireAutomate("Complete", WP_Complete, "clickAndwait", "click");
				getStaleElement("ReviewNewClaim", WP_ReviewNewClaim);
			}

			if (lhm_TestCase_Table_Data.get("ReviewNewClaim").equals("Yes")) {
				GuidewireAutomate("ReviewNewClaim", WP_ReviewNewClaim, "clickAndwait", "click");
				GuidewireAutomate("Complete", WP_Complete, "clickAndwait", "click");
				getStaleElement("ReviewNewPayment", WP_ReviewNewPayment);
			}

			if (lhm_TestCase_Table_Data.get("Overiew").equals("Yes")) {
				GuidewireAutomate("Sendclaimacknowledgementletter", WP_Sendclaimacknowledgementletter, "clickAndwait", "click");
				GuidewireAutomate("Assign", WP_Assign, "clickAndwait", "click");
				CC_ClaimActions.AssignClaim();
				lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("workplan");

				GuidewireAutomate_Validation("Screen Header", WorkPlan_Header, "equals", "Workplan");
				GuidewireAutomate("Sendclaimacknowledgementletter", WP_Sendclaimacknowledgementletter, "clickAndwait", "click");
				GuidewireAutomate("Complete", WP_Complete, "clickAndwait", "click");
				Thread.sleep(500);
			}

			if (lhm_TestCase_Table_Data.get("AllActivities").equals("Yes")) {

				GuidewireAutomate("WorkPlan", WP_AllActivities, "clickAndwait", "click");
				GuidewireAutomate("Assign", WP_Assign, "clickAndwait", "click");
				CC_ClaimActions.AssignClaim();

				lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("workplan");
				GuidewireAutomate_Validation("Screen Header", WorkPlan_Header, "equals", "Workplan");
				GuidewireAutomate("WorkPlan", WP_AllActivities, "clickAndwait", "click");
				GuidewireAutomate("Complete", WP_Complete, "clickAndwait", "click");
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	public static void workPlanRejct() throws Throwable {
		GuidewireAutomate_Validation("Screen Header", WorkPlan_Header, "equals", "Workplan");
		GuidewireAutomate("WorkPlan", WP_AllActivities, "clickAndwait", "click");
		GuidewireAutomate("Reject", WP_Reject, "clickAndwait", "click");
		GuidewireAutomate("WorkPlan", WP_AllActivities, "clickAndwait", "click");
		GuidewireAutomate("Complete", WP_Complete, "clickAndwait", "click");
	}
	/*
	 * Owner : Rahul Dixit
	 */
	public static void Verify_WorkplanElements() throws Throwable {
		GuidewireAutomate_Validation("Assigned By", WorkPlan_AssignedBy, "equals", "Peter Parker");
		GuidewireAutomate_Validation("Assigned To", WorkPlan_AssignedTo, "equals", "Stephen Perrella");

	}
	/*
	 * Owner : Rahul Dixit
	 */

	public static void Verify_CheckRoutedToClaimOwnerForApproval() throws Throwable

	{
		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("Workplan");

		GuidewireAutomate_Validation("Assigned By", AssignedB, "equals", lhm_TestCase_Table_Data.get("AssignedBy"));
		GuidewireAutomate_Validation("Assigned To", AssignedT, "equals", lhm_TestCase_Table_Data.get("AssignedTo"));

	}
	/*
	 * Owner : Rahul Dixit
	 */

	public static void Verify_CheckRoutedToSupervisorOfClaimOwningGroup() throws Throwable

	{
		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("Workplan");

		GuidewireAutomate_Validation("Assigned By", AssignedBy, "equals", lhm_TestCase_Table_Data.get("AssignedBy"));
		GuidewireAutomate_Validation("Assigned To", Verify_AssignedTo, "equals", lhm_TestCase_Table_Data.get("AssignedTo"));

	}
	/*
	 * Owner: Rahul Dixit Date: 21/01/2022
	 */
	public static void Verify_ReviewNewClaim() throws Throwable {

		try {

			GuidewireAutomate_Validation("Review New Claim", Workplan_ReviewNewClaim, "equals", "Review claim");
		} catch (NoSuchElementException e) {

			e.printStackTrace();
			throw e;
		}
	}
	/*
	 * Owner : Rahul Dixit
	 */

	public static void VerifyError_LitigationActivityCanNotBeCompleted() throws Throwable

	{
		try {
			GuidewireAutomate("MediationDate_Link", MediationDate_Link, "clickAndwait", "clickAndwait");
			Thread.sleep(2000);
			GuidewireAutomate("MediationDate_CompleteButton", MediationDate_CompleteButton, "clickAndwait", "clickAndwait");

			GuidewireAutomate_Validation("Litigation Activity Error", Litigation_Error, "contains", "cannot be completed");
		} catch (NoSuchElementException e) {

			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Owner : Rahul Dixit
	 */

	public static void Verify_CheckRoutedToSupervisorExposureOwningGroupForApproval() throws Throwable

	{
		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("Workplan");

		GuidewireAutomate_Validation("Assigned By", AssignedBy, "equals", lhm_TestCase_Table_Data.get("AssignedBy"));
		GuidewireAutomate_Validation("Assigned To", AssignedTo, "equals", lhm_TestCase_Table_Data.get("AssignedTo"));

	}

	public static void WorkPlan_NoIndemnityReserve() throws Throwable {

		try {

			By NoIndemnityReserve = By.xpath("//div[@class='gw-label' and text()='No Indemnity Reserve in 10 business days']");
			VerifyElementNotExist("No Indemnity Reserve", NoIndemnityReserve);
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			throw e;
		}
	}
}
