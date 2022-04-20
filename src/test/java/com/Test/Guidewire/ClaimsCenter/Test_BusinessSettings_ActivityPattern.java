package com.Test.Guidewire.ClaimsCenter;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.Utils.Selenium.GW_GetDriver;
import com.aventstack.extentreports.Status;
import com.pages.Guidewire.ClaimsCenter.BusinessSettings_ActivityPatterns;
import com.pages.Guidewire.ClaimsCenter.CC_Reusables;
public class Test_BusinessSettings_ActivityPattern extends GW_GetDriver {

	@AfterMethod

	public void logoutTemp() throws Throwable {
		CC_Reusables.logout_ClaimsCenter();
	}

	@Test
	public void AUT_ActivityPatterns_Validate_Page1() throws Throwable {

		// --->Login to ClaimCenter with the a user id who has the permission to
		// view
		// "Administration" tab.
		// ---->User Name - su Password - gw

		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" -> "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		/*
		 * "Verify whether the below columns are listed in the following order.
		 * 
		 * Select box Subject Class Category Type Priority Mandatory Automated"
		 */
		BusinessSettings_ActivityPatterns.verify_ActivityPatterns_ColumnHeader();

		/*
		 * Verify whether the "Activity Pattern" screen is sorted by "Subject" by // default.
		 */
		BusinessSettings_ActivityPatterns.verifysortedBySubject();

		/*
		 * // Verify whether the activity patterns are displayed in below order and 15 per page.
		 */
		BusinessSettings_ActivityPatterns.ActivityPatternsRowsCount();

		/*
		 * "Verify whether the below activity pattern is displayed on page 1 with the values displayed on the column.
		 */
		BusinessSettings_ActivityPatterns.ActivityPatterns();
		oExtentTest.log(Status.PASS, "Validate Activity Patterns Page1 is Completed");

	}

	@Test
	public void AUT_ActivityPatterns_Validate_Page2() throws Throwable {

		/*
		 * --->Login to ClaimCenter with the a user id who has the permission to view "Administration" tab. // ---->User Name - su Password - gw
		 */
		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" -> "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Click on the ">" next button on color after "/8" text till page 2.
		BusinessSettings_ActivityPatterns.goNextPage("Page2");

		/*
		 * "Verify whether the below columns are listed in the following order.
		 * 
		 * Select box Subject Class Category Type Priority Mandatory Automated"
		 */
		BusinessSettings_ActivityPatterns.verify_ActivityPatterns_ColumnHeader();

		/*
		 * Verify whether the "Activity Pattern" screen is sorted by "Subject" by default.
		 */
		BusinessSettings_ActivityPatterns.verifysortedBySubject();

		/*
		 * Verify whether the activity patterns are displayed in below order and 15 per page.
		 */
		BusinessSettings_ActivityPatterns.ActivityPatternsRowsCount();

		/*
		 * "Verify whether the below activity pattern is displayed on page 2 with the values displayed on the column.
		 */
		BusinessSettings_ActivityPatterns.ActivityPatterns();
		oExtentTest.log(Status.PASS, "Validate Activity Patterns Page2 is Completed");

	}

	@Test
	public void AUT_ActivityPatterns_Validate_Page3() throws Throwable {

		/*
		 * --->Login to ClaimCenter with the a user id who has the permission to view "Administration" tab. // ---->User Name - su Password - gw
		 */
		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Click on the ">" next button on color after "/8" text till page 3.
		BusinessSettings_ActivityPatterns.goNextPage("Page3");

		/*
		 * "Verify whether the below columns are listed in the following order.
		 * 
		 * Select box Subject Class Category Type Priority Mandatory Automated"
		 */
		BusinessSettings_ActivityPatterns.verify_ActivityPatterns_ColumnHeader();

		/*
		 * Verify whether the "Activity Pattern" screen is sorted by "Subject" by default.
		 */
		BusinessSettings_ActivityPatterns.verifysortedBySubject();

		/*
		 * Verify whether the activity patterns are displayed in below order and 15 per page.
		 */
		BusinessSettings_ActivityPatterns.ActivityPatternsRowsCount();

		/*
		 * "Verify whether the below activity pattern is displayed on page 3 with the values displayed on the column.
		 */
		BusinessSettings_ActivityPatterns.ActivityPatterns();
		oExtentTest.log(Status.PASS, "Validate Activity Patterns Page3 is Completed");

	}

	@Test
	public void AUT_ActivityPatterns_Validate_Page4() throws Throwable {

		/*
		 * --->Login to ClaimCenter with the a user id who has the permission to view "Administration" tab. // ---->User Name - su Password - gw
		 */
		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Click on the ">" next button on color after "/8" text till page 4.
		BusinessSettings_ActivityPatterns.goNextPage("Page4");

		/*
		 * "Verify whether the below columns are listed in the following order.
		 * 
		 * Select box Subject Class Category Type Priority Mandatory Automated"
		 */
		BusinessSettings_ActivityPatterns.verify_ActivityPatterns_ColumnHeader();

		/*
		 * Verify whether the "Activity Pattern" screen is sorted by "Subject" by default.
		 */
		BusinessSettings_ActivityPatterns.verifysortedBySubject();

		/*
		 * Verify whether the activity patterns are displayed in below order and 15 per page.
		 */
		BusinessSettings_ActivityPatterns.ActivityPatternsRowsCount();

		/*
		 * "Verify whether the below activity pattern is displayed on page 4 with the values displayed on the column.
		 */
		BusinessSettings_ActivityPatterns.ActivityPatterns();
		oExtentTest.log(Status.PASS, "Validate Activity Patterns Page4 is Completed");

	}

	@Test
	public void AUT_ActivityPatterns_Validate_Page5() throws Throwable {

		/*
		 * --->Login to ClaimCenter with the a user id who has the permission to view "Administration" tab. // ---->User Name - su Password - gw
		 */
		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Click on the ">" next button on color after "/8" text till page 5.
		BusinessSettings_ActivityPatterns.goNextPage("Page5");

		/*
		 * "Verify whether the below columns are listed in the following order.
		 * 
		 * Select box Subject Class Category Type Priority Mandatory Automated"
		 */
		BusinessSettings_ActivityPatterns.verify_ActivityPatterns_ColumnHeader();

		/*
		 * Verify whether the "Activity Pattern" screen is sorted by "Subject" by default.
		 */
		BusinessSettings_ActivityPatterns.verifysortedBySubject();

		/*
		 * Verify whether the activity patterns are displayed in below order and 15 per page.
		 */
		BusinessSettings_ActivityPatterns.ActivityPatternsRowsCount();

		/*
		 * "Verify whether the below activity pattern is displayed on page 5 with the values displayed on the column.
		 */
		BusinessSettings_ActivityPatterns.ActivityPatterns();
		oExtentTest.log(Status.PASS, "Validate Activity Patterns Page5 is Completed");

	}

	@Test
	public void AUT_ActivityPatterns_Validate_Page6() throws Throwable {

		/*
		 * --->Login to ClaimCenter with the a user id who has the permission to view "Administration" tab. // ---->User Name - su Password - gw
		 */
		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Click on the ">" next button on color after "/8" text till page 6.
		BusinessSettings_ActivityPatterns.goNextPage("Page6");

		/*
		 * "Verify whether the below columns are listed in the following order.
		 * 
		 * Select box Subject Class Category Type Priority Mandatory Automated"
		 */
		BusinessSettings_ActivityPatterns.verify_ActivityPatterns_ColumnHeader();

		/*
		 * Verify whether the "Activity Pattern" screen is sorted by "Subject" by default.
		 */
		BusinessSettings_ActivityPatterns.verifysortedBySubject();

		/*
		 * Verify whether the activity patterns are displayed in below order and 15 per page.
		 */
		BusinessSettings_ActivityPatterns.ActivityPatternsRowsCount();

		/*
		 * "Verify whether the below activity pattern is displayed on page 6 with the values displayed on the column.
		 */
		BusinessSettings_ActivityPatterns.ActivityPatterns();
		oExtentTest.log(Status.PASS, "Validate Activity Patterns Page6 is Completed");

	}

	@Test
	public void AUT_ActivityPatterns_Validate_Page7() throws Throwable {

		/*
		 * --->Login to ClaimCenter with the a user id who has the permission to view "Administration" tab. // ---->User Name - su Password - gw
		 */
		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Click on the ">" next button on color after "/8" text till page 7.
		BusinessSettings_ActivityPatterns.goNextPage("Page7");

		/*
		 * "Verify whether the below columns are listed in the following order.
		 * 
		 * Select box Subject Class Category Type Priority Mandatory Automated"
		 */
		BusinessSettings_ActivityPatterns.verify_ActivityPatterns_ColumnHeader();

		/*
		 * Verify whether the "Activity Pattern" screen is sorted by "Subject" by default.
		 */
		BusinessSettings_ActivityPatterns.verifysortedBySubject();

		/*
		 * Verify whether the activity patterns are displayed in below order and 15 per page.
		 */
		BusinessSettings_ActivityPatterns.ActivityPatternsRowsCount();

		/*
		 * "Verify whether the below activity pattern is displayed on page 7 with the values displayed on the column.
		 */
		BusinessSettings_ActivityPatterns.ActivityPatterns();
		oExtentTest.log(Status.PASS, "Validate Activity Patterns Page7 is Completed");

	}

	@Test
	public void AUT_ActivityPatterns_Validate_Page8() throws Throwable {

		/*
		 * --->Login to ClaimCenter with the a user id who has the permission to view "Administration" tab. // ---->User Name - su Password - gw
		 */
		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Click on the ">" next button on color after "/8" text till page 8.
		BusinessSettings_ActivityPatterns.goNextPage("Page8");

		/*
		 * "Verify whether the below columns are listed in the following order.
		 * 
		 * Select box Subject Class Category Type Priority Mandatory Automated"
		 */
		BusinessSettings_ActivityPatterns.verify_ActivityPatterns_ColumnHeader();

		/*
		 * Verify whether the "Activity Pattern" screen is sorted by "Subject" by default.
		 */
		BusinessSettings_ActivityPatterns.verifysortedBySubject();

		/*
		 * Verify whether the activity patterns are displayed in below order and 15 per page.
		 */
		BusinessSettings_ActivityPatterns.ActivityPatternsRowsCount();

		/*
		 * "Verify whether the below activity pattern is displayed on page 8 with the values displayed on the column.
		 */
		BusinessSettings_ActivityPatterns.ActivityPatterns();
		oExtentTest.log(Status.PASS, "Validate Activity Patterns Page8 is Completed");

	}

	@Test
	public void AUT_ActivityPatternDetail_Validate_3pointcontactEmployee() throws Throwable {

		/*--"Login to ClaimCenter with the a user id who has the permission to view ""Administration"" tab.
		
		User Name - su
		Password - gw"----*/

		CC_Reusables.login_ClaimsCenter_User("SuperUser");
		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 1 of Activity Patterns is displayed

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();

	}

	@Test
	public void AUT_ActivityPatternDetail_Validate_3pointcontactEmployer() throws Throwable {

		/*--"Login to ClaimCenter with the a user id who has the permission to view ""Administration"" tab.
		
		User Name - su
		Password - gw"----*/

		CC_Reusables.login_ClaimsCenter_User("SuperUser");
		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 1 of Activity Patterns is displayed

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();

	}

	@Test
	public void AUT_ActivityPatternDetail_Validate_3pointcontactMedicalProvider() throws Throwable {

		/*--"Login to ClaimCenter with the a user id who has the permission to view ""Administration"" tab.
		
		User Name - su
		Password - gw"----*/

		CC_Reusables.login_ClaimsCenter_User("SuperUser");
		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 1 of Activity Patterns is displayed

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();

	}

	@Test
	public void AUT_ActivityPatternDetail_Validate_30daydiary() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");
		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 1 of Activity Patterns is displayed

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();

	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_60daydiary() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 1 of Activity Patterns is displayed

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();

	}

	@Test
	public void AUT_ActivityPatternDetail_Validate_90daydiary() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 1 of Activity Patterns is displayed

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();

	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Additionallivingexpensesrequired() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 1 of Activity Patterns is displayed

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();

	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_ArbitrationDate() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 1 of Activity Patterns is displayed

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();

	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Assignnursetocase() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 1 of Activity Patterns is displayed

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();

	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_CheckDenied() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 1 of Activity Patterns is displayed

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();

	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Checkonmedicalclearanceforlightdutywork() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 1 of Activity Patterns is displayed

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();

	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Checkwithemployerabouttemplightdutywork() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 1 of Activity Patterns is displayed

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();

	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_ClosedFileReview() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 1 of Activity Patterns is displayed

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();

	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_ConsultAccountregardingfatality() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 1 of Activity Patterns is displayed

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();

	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_ContactUnderwriterregardingincorrectclasscode() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 1 of Activity Patterns is displayed

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();

	}

	// Page 2 of Activity Patterns is displayed
	@Test

	public void AUT_ActivityPatternDetail_Validate_CreateRecoveryemailbill1() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 2 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 2 of Activity Patterns is displayed");
		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();

	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_CreateRecoveryemailbill2() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 2 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 2 of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();

	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_DecisionDateReview() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 2 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 2 of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();

	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Determinecompensability() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 2 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 2 of Activity Patterns is displayed");
		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();

	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Determineifopportunityforrecovery() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 2 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 2 of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();

	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_FileEmployersFirstNotice() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 2 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 2 of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();

	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Followupwithvendorpastexpectedquotecompletiondate() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 2 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 2 of Activity Patterns is displayed");
		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();

	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Followupwithvendorpastexpectedservicecompletiondate() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 2 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 2 of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();

	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Followupwithvendorworknotacceptedintimelymanner() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 2 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 2 of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();

	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Generalreminderdiary() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 2 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 2 of Activity Patterns is displayed");
		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();

	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_GetEmployeesNoticeofInjury() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");
		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 2 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 2 of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();

	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_GetastatementfromHealthandSafetyDept() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 2 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 2 of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();

	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Getastatementfromwitness() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 2 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 2 of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Getaccidentsceneinspected() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 2 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 2 of Activity Patterns is displayed");
		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Getclaimantmedicalreports() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 2 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 2 of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	// Page 3 of Activity Patterns is displayed
	@Test

	public void AUT_ActivityPatternDetail_Validate_Getindependentmedicalexamination() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");
		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 3 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 3 of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Getinitialmedicalreport() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 3 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 3 of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Getlistofdamageditems() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 3 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 3 of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Getpolicereport() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 3 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 3 of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Getpropertyinspected() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 3 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 3 of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Getquoteforrepairsreplacement() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 3 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 3 of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_GetsignedVoluntaryAgreement() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 3 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 3 of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Getvehicleinspected() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 3 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 3 of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Getwagestatementandtaxstatus() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 3 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 3 of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_HearingDate() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 3 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 3 of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_ISOmatchesfound() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 3 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 3 of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Independentappraisal() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 3 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 3 of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Initial30dayfilereview() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 3 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 3 of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Invoicenotautoapproved() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 3 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 3 of Activity Patterns is displayed");
		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Invoicenotautopaid() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 3 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 3 of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	// Page 4 of Activity Patterns is displayed
	@Test

	public void AUT_ActivityPatternDetail_Validate_Legalreview() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");
		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 4 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 4 of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Makeinitialcontactwithclaimant() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 4 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page4  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Makeinitialcontactwithinsured() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 4 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page  4of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Makesettlementoffer() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 4 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_MediationDate() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 1 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 4 of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_MetropolitanReportAvailable() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 4 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 4 of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_MetropolitanReportDeferred() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 4 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 4 of Activity Patterns is displayed");
		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_MetropolitanReportHeld() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 4 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 4 of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_MetropolitanReportInquiryFailed() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 4 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_MetropolitanReportRequestFailed() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 4 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 4 of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_NoMetropolitanReportAvailable() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 4 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page4  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Notifyaccountexpectedcostabovethreshold() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 4 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Notifyreinsurer() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 4 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page4  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Pendingcreaterejected() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 4 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 4 of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Pendingupdaterejected() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 4 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 4  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	// Page 5 Activity pattern displayed
	@Test

	public void AUT_ActivityPatternDetail_Validate_PerformanceReview() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 5 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 5  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Produceclaimstrategynarrative() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 5 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 5  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_PutthirdpartyonnoticeofSubrogationInterest() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 5 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 5  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_RecoverVehicle() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 5 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 5  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_RecoveryDenied() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 5 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 5  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Recurringpaymentstreamending() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 5 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 5  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_ReinsuranceCoverageRetrievalFailed() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 5 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 5  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_RetrieveClaimCompleted() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 5 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 5  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_ReviewAssignment() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 5 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 5  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_ReviewClaimforReinsurance() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 5 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 5  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_ReviewReinsuranceRecoverableandCededReserves() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 5 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 5  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_ReviewallSpecialHandlinginstructions() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 5 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 5  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Reviewandapprovebulkinvoice() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 5 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 5  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Reviewandapprovenewpayment() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 5 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 5  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Reviewandapprovenewrecovery() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 5 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 5  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	// Page 6 Activity Pattern
	@Test

	public void AUT_ActivityPatternDetail_Validate_Reviewandapprovenewrecoveryreservechange() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 6 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 6  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Reviewandapprovequoteforrepairsreplacement() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 6 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 6  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Reviewandapprovereservechange() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 6 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 6  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_ReviewclaimforsubrogationClaimhasbeenreopened() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 6 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 6  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Reviewcoverageinquestion() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 6 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 6  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_ReviewdenialdecisionwithAccountManager() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 6 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 6  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_ReviewforCatastrophe() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 6 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 6  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_ReviewmatterrelatedSpecialHandlinginstructions() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 6 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 6  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_ReviewnegotiationstrategywithAccount() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 6 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 6  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Reviewnewbillreceived() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 6 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 6  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Reviewnewmail() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 6 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 6  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Reviewrejectedrequest() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 6 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 6  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_ReviewsubrogationrecoveryfinancialsAsupplementalpaymentwascreated() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 6 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 6  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Reviewvendorquote() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 6 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 6  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_SIUreferral() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 6 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 6  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	// Page 7 Activity Pattern
	@Test

	public void AUT_ActivityPatternDetail_Validate_SalvageVehicle() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 7 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 7  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Sendclaimacknowledgementletter() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 7 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 7  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Sendletterconfirmingclosureofexposure() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 7 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 7  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Sendreservationofrightsletter() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 7 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 7 of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_SpecialInvestigationClaimEscalation() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 7 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 7  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_SpecialInvestigationClaimReview() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");
		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 7 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 7  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Subrogationstatutedeadlineapproaching() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");
		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 7 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 7  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_TrialDate() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");
		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 7 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 7  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Unabletoclosetheclaimortheexposure() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");
		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 7 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 7  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Unabletoissueastoppayment() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");
		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 7 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 7  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	// -------------------------------------------------------------------
	@Test

	public void AUT_ActivityPatternDetail_Validate_Unabletoissueastoppaymentonbulkcheck() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");
		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 7 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 7  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Unabletovoidthebulkcheck() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");
		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 7 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 7  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Unabletovoidthecheck() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");
		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 7 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 7  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_ValidationandprocessingofBulkInvoiceItemsfailed() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");
		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 7 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 7  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Vendoraskedquestion() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");
		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 7 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 7  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	// -----------------------------------------------------------------------------------------------------------------------
	@Test

	public void AUT_ActivityPatternDetail_Validate_Vendorcanceledworkinstructnewvendor() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");
		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 8 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 8  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Vendorcompletedwork() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");
		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 8 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 8  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Vendordeclinedworkinstructnewvendor() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");
		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 8 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 8  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Vendorworkdelayed() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");
		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 8 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 8  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Verifycoverage() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");
		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 8 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 8  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Verifycoveragedetermineifopportunityforrecovery() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");
		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 8 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 8  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Visitclaimantandassessbacktoworkstatus() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("SuperUser");
		// Navigate to "Administration" ->
		CC_Reusables.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		CC_Reusables.ccMenuNavigation("Activity Patterns");

		// Page 7 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 7  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

}
