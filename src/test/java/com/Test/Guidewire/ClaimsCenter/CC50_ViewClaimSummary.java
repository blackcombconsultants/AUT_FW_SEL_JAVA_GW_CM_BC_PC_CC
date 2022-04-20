package com.Test.Guidewire.ClaimsCenter;

import org.testng.annotations.Test;

import com.pages.Guidewire.ClaimsCenter.CC_Reusables;
import com.pages.Guidewire.ClaimsCenter.CC_Summary;

public class CC50_ViewClaimSummary {
	@Test
	public void CC50_TC001_ClaimSummaryPaidFieldisRemoved() throws Throwable {
		// Step1 : User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// Step2 : Choose Exixting Claim
		CC_Reusables.ccTabNavigation("Claim Search", "NA");

		CC_Summary.Summary_PaidFiedRemoved();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();

	}
	@Test
	public void CC50_TC002_IndemnityandExpensePaidareCalculated() throws Throwable {
		// Step1 : User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// Step2 : Choose Exixting Claim
		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		CC_Summary.Summary_IndemnityandExpensePaidareCalculated();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();

	}
	@Test
	public void CC50_TC003_IndemnityandExpenseReservesareCalculated() throws Throwable {
		// Step1 : User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// Step2 : Choose Exixting Claim
		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		CC_Summary.Summary_IndemnityandExpenseReservesareCalculated();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();

	}
	@Test
	public void CC50_TC004_IncidentSeveritycolumnisaddednexttoAdjustercolumn() throws Throwable {
		// Step1 : User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// Step2 : Choose Exixting Claim
		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		CC_Summary.Summary_SeveritycolumnnexttoAdjustercolumn();

		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();

	}
	@Test
	public void CC50_TC005_NoticeDateRenamedtoReported() throws Throwable {
		// Step1 : User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// Step2 : Choose Exixting Claim
		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		CC_Summary.Summary_NoticeDateRenamedtoReported();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();

	}
	@Test
	public void CC50_TC006_StorageSectionandDividerisHidden() throws Throwable {
		// Step1 : User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// Step2 : Choose Exixting Claim
		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		CC_Summary.Validate_SummaryHeader();

		CC_Reusables.ccMenuNavigation("Status");
		CC_Summary.Status_StorageSectionisHidden();
		CC_Summary.Status_DividerBarisHidden();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();

	}
	@Test
	public void CC50_TC007_CoverageinQuestionandoneDividerisHidden() throws Throwable {
		// Step1 : User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// Step2 : Choose Exixting Claim
		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		CC_Summary.Validate_SummaryHeader();
		CC_Reusables.ccMenuNavigation("Status");
		CC_Summary.Status_CoverageinQuestionisHidden();
		CC_Summary.Status_OneDividerBarisHidden();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();

	}

	@Test
	public void CC50_TC008_IncidentonlyRenamedtoNoticeOnly() throws Throwable {
		// Step1 : User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// Step2 : Choose Exixting Claim
		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		CC_Summary.Validate_SummaryHeader();
		CC_Reusables.ccMenuNavigation("Status");

		CC_Summary.Status_IncidentRenamedtoNotice();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();

	}
	/*
	 * @Test public void CC50_TC009_VerifyBordereuReportErrorMessage() throws Throwable { // Step1 : User Logs into GW CC as an Adjuster
	 * ClaimCenter_Resuables.login_ClaimsCenter_User("Adjuster1"); // Step2 : Choose Exixting Claim CC_Resuables.ccTabNavigation("Claim Search",
	 * "NA"); CC_ViewClaimSummary.Validate_SummaryHeader(); CC_Resuables.ccMenuNavigation("Status");
	 * 
	 * CC_ViewClaimSummary.Status_VerifyBordereuReportErrorMessage(); // ----->Logout ClaimCenter
	 * ClaimCenter_Resuables.logout_ClaimsCenterWithAlert();
	 * 
	 * }
	 */
	@Test
	public void CC50_TC010_ClaimSegmentfieldisHidden() throws Throwable {
		// Step1 : User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// Step2 : Choose Exixting Claim
		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		CC_Summary.Summary_ClaimSegmentfieldisHidden();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();

	}
	@Test
	public void CC50_TC011_VerifyLOBisNotEditable() throws Throwable {
		// Step1 : User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// Step2 : Choose Exixting Claim
		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		CC_Summary.Validate_SummaryHeader();
		CC_Reusables.ccMenuNavigation("Status");
		CC_Summary.Status_VerifyLOBisNotEditable();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();

	}
	@Test
	public void CC50_TC012_ReportedDateisHidden() throws Throwable {
		// Step1 : User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// Step2 : Choose Exixting Claim
		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		CC_Summary.Validate_SummaryHeader();
		CC_Reusables.ccMenuNavigation("Status");
		CC_Summary.Status_ReportedDateisHidden();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();

	}
	@Test
	public void CC50_TC013_ReportedDateisDisplayedAftrDOL() throws Throwable {
		// Step1 : User Logs into GW CC as an Adjuster
		CC_Reusables.login_ClaimsCenter_User("Adjuster1");
		// Step2 : Choose Exixting Claim
		CC_Reusables.ccTabNavigation("Claim Search", "NA");
		CC_Summary.Summary_ReportedDateisaftrDOL();
		// ----->Logout ClaimCenter
		CC_Reusables.logout_ClaimsCenter();

	}
}
