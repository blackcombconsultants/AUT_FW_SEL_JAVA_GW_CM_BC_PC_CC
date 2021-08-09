package com.Test.Guidewire.ClaimsCenter;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.Utils.Selenium.GW_GetDriver;
import com.aventstack.extentreports.Status;
import com.pages.Guidewire.GW_CM_PC_BC_CC_Login;
import com.pages.Guidewire.Tab_Menu_Navigation;
import com.pages.Guidewire.ClaimsCenter.BusinessSettings_ActivityPatterns;
public class Test_BusinessSettings_ActivityPattern extends GW_GetDriver {

	@AfterMethod

	public void logoutTemp() throws Throwable {
		GW_CM_PC_BC_CC_Login.logout_ClaimsCenter();
	}

	@Test
	public void AUT_ActivityPatterns_Validate_Page1() throws Throwable {

		// --->Login to ClaimCenter with the a user id who has the permission to
		// view
		// "Administration" tab.
		// ---->User Name - su Password - gw

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" -> "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		/*
		 * "Verify whether the below columns are listed in the following order.
		 * 
		 * Select box Subject Class Category Type Priority Mandatory Automated"
		 */
		BusinessSettings_ActivityPatterns.verify_ActivityPatterns_ColumnHeader();

		/*
		 * Verify whether the "Activity Pattern" screen is sorted by "Subject"
		 * by // default.
		 */
		BusinessSettings_ActivityPatterns.verifysortedBySubject();

		/*
		 * // Verify whether the activity patterns are displayed in below order
		 * and 15 per page.
		 */
		BusinessSettings_ActivityPatterns.ActivityPatternsRowsCount();

		/*
		 * "Verify whether the below activity pattern is displayed on page 1
		 * with the values displayed on the column.
		 */
		BusinessSettings_ActivityPatterns.ActivityPatterns();
		oExtentTest.log(Status.PASS, "Validate Activity Patterns Page1 is Completed");

	}

	@Test
	public void AUT_ActivityPatterns_Validate_Page2() throws Throwable {

		/*
		 * --->Login to ClaimCenter with the a user id who has the permission to
		 * view "Administration" tab. // ---->User Name - su Password - gw
		 */
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" -> "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Click on the ">" next button on color after "/8" text till page 2.
		BusinessSettings_ActivityPatterns.goNextPage("Page2");

		/*
		 * "Verify whether the below columns are listed in the following order.
		 * 
		 * Select box Subject Class Category Type Priority Mandatory Automated"
		 */
		BusinessSettings_ActivityPatterns.verify_ActivityPatterns_ColumnHeader();

		/*
		 * Verify whether the "Activity Pattern" screen is sorted by "Subject"
		 * by default.
		 */
		BusinessSettings_ActivityPatterns.verifysortedBySubject();

		/*
		 * Verify whether the activity patterns are displayed in below order and
		 * 15 per page.
		 */
		BusinessSettings_ActivityPatterns.ActivityPatternsRowsCount();

		/*
		 * "Verify whether the below activity pattern is displayed on page 2
		 * with the values displayed on the column.
		 */
		BusinessSettings_ActivityPatterns.ActivityPatterns();
		oExtentTest.log(Status.PASS, "Validate Activity Patterns Page2 is Completed");

	}

	@Test
	public void AUT_ActivityPatterns_Validate_Page3() throws Throwable {

		/*
		 * --->Login to ClaimCenter with the a user id who has the permission to
		 * view "Administration" tab. // ---->User Name - su Password - gw
		 */
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Click on the ">" next button on color after "/8" text till page 3.
		BusinessSettings_ActivityPatterns.goNextPage("Page3");

		/*
		 * "Verify whether the below columns are listed in the following order.
		 * 
		 * Select box Subject Class Category Type Priority Mandatory Automated"
		 */
		BusinessSettings_ActivityPatterns.verify_ActivityPatterns_ColumnHeader();

		/*
		 * Verify whether the "Activity Pattern" screen is sorted by "Subject"
		 * by default.
		 */
		BusinessSettings_ActivityPatterns.verifysortedBySubject();

		/*
		 * Verify whether the activity patterns are displayed in below order and
		 * 15 per page.
		 */
		BusinessSettings_ActivityPatterns.ActivityPatternsRowsCount();

		/*
		 * "Verify whether the below activity pattern is displayed on page 3
		 * with the values displayed on the column.
		 */
		BusinessSettings_ActivityPatterns.ActivityPatterns();
		oExtentTest.log(Status.PASS, "Validate Activity Patterns Page3 is Completed");

	}

	@Test
	public void AUT_ActivityPatterns_Validate_Page4() throws Throwable {

		/*
		 * --->Login to ClaimCenter with the a user id who has the permission to
		 * view "Administration" tab. // ---->User Name - su Password - gw
		 */
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Click on the ">" next button on color after "/8" text till page 4.
		BusinessSettings_ActivityPatterns.goNextPage("Page4");

		/*
		 * "Verify whether the below columns are listed in the following order.
		 * 
		 * Select box Subject Class Category Type Priority Mandatory Automated"
		 */
		BusinessSettings_ActivityPatterns.verify_ActivityPatterns_ColumnHeader();

		/*
		 * Verify whether the "Activity Pattern" screen is sorted by "Subject"
		 * by default.
		 */
		BusinessSettings_ActivityPatterns.verifysortedBySubject();

		/*
		 * Verify whether the activity patterns are displayed in below order and
		 * 15 per page.
		 */
		BusinessSettings_ActivityPatterns.ActivityPatternsRowsCount();

		/*
		 * "Verify whether the below activity pattern is displayed on page 4
		 * with the values displayed on the column.
		 */
		BusinessSettings_ActivityPatterns.ActivityPatterns();
		oExtentTest.log(Status.PASS, "Validate Activity Patterns Page4 is Completed");

	}

	@Test
	public void AUT_ActivityPatterns_Validate_Page5() throws Throwable {

		/*
		 * --->Login to ClaimCenter with the a user id who has the permission to
		 * view "Administration" tab. // ---->User Name - su Password - gw
		 */
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Click on the ">" next button on color after "/8" text till page 5.
		BusinessSettings_ActivityPatterns.goNextPage("Page5");

		/*
		 * "Verify whether the below columns are listed in the following order.
		 * 
		 * Select box Subject Class Category Type Priority Mandatory Automated"
		 */
		BusinessSettings_ActivityPatterns.verify_ActivityPatterns_ColumnHeader();

		/*
		 * Verify whether the "Activity Pattern" screen is sorted by "Subject"
		 * by default.
		 */
		BusinessSettings_ActivityPatterns.verifysortedBySubject();

		/*
		 * Verify whether the activity patterns are displayed in below order and
		 * 15 per page.
		 */
		BusinessSettings_ActivityPatterns.ActivityPatternsRowsCount();

		/*
		 * "Verify whether the below activity pattern is displayed on page 5
		 * with the values displayed on the column.
		 */
		BusinessSettings_ActivityPatterns.ActivityPatterns();
		oExtentTest.log(Status.PASS, "Validate Activity Patterns Page5 is Completed");

	}

	@Test
	public void AUT_ActivityPatterns_Validate_Page6() throws Throwable {

		/*
		 * --->Login to ClaimCenter with the a user id who has the permission to
		 * view "Administration" tab. // ---->User Name - su Password - gw
		 */
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Click on the ">" next button on color after "/8" text till page 6.
		BusinessSettings_ActivityPatterns.goNextPage("Page6");

		/*
		 * "Verify whether the below columns are listed in the following order.
		 * 
		 * Select box Subject Class Category Type Priority Mandatory Automated"
		 */
		BusinessSettings_ActivityPatterns.verify_ActivityPatterns_ColumnHeader();

		/*
		 * Verify whether the "Activity Pattern" screen is sorted by "Subject"
		 * by default.
		 */
		BusinessSettings_ActivityPatterns.verifysortedBySubject();

		/*
		 * Verify whether the activity patterns are displayed in below order and
		 * 15 per page.
		 */
		BusinessSettings_ActivityPatterns.ActivityPatternsRowsCount();

		/*
		 * "Verify whether the below activity pattern is displayed on page 6
		 * with the values displayed on the column.
		 */
		BusinessSettings_ActivityPatterns.ActivityPatterns();
		oExtentTest.log(Status.PASS, "Validate Activity Patterns Page6 is Completed");

	}

	@Test
	public void AUT_ActivityPatterns_Validate_Page7() throws Throwable {

		/*
		 * --->Login to ClaimCenter with the a user id who has the permission to
		 * view "Administration" tab. // ---->User Name - su Password - gw
		 */
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Click on the ">" next button on color after "/8" text till page 7.
		BusinessSettings_ActivityPatterns.goNextPage("Page7");

		/*
		 * "Verify whether the below columns are listed in the following order.
		 * 
		 * Select box Subject Class Category Type Priority Mandatory Automated"
		 */
		BusinessSettings_ActivityPatterns.verify_ActivityPatterns_ColumnHeader();

		/*
		 * Verify whether the "Activity Pattern" screen is sorted by "Subject"
		 * by default.
		 */
		BusinessSettings_ActivityPatterns.verifysortedBySubject();

		/*
		 * Verify whether the activity patterns are displayed in below order and
		 * 15 per page.
		 */
		BusinessSettings_ActivityPatterns.ActivityPatternsRowsCount();

		/*
		 * "Verify whether the below activity pattern is displayed on page 7
		 * with the values displayed on the column.
		 */
		BusinessSettings_ActivityPatterns.ActivityPatterns();
		oExtentTest.log(Status.PASS, "Validate Activity Patterns Page7 is Completed");

	}

	@Test
	public void AUT_ActivityPatterns_Validate_Page8() throws Throwable {

		/*
		 * --->Login to ClaimCenter with the a user id who has the permission to
		 * view "Administration" tab. // ---->User Name - su Password - gw
		 */
		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Click on the ">" next button on color after "/8" text till page 8.
		BusinessSettings_ActivityPatterns.goNextPage("Page8");

		/*
		 * "Verify whether the below columns are listed in the following order.
		 * 
		 * Select box Subject Class Category Type Priority Mandatory Automated"
		 */
		BusinessSettings_ActivityPatterns.verify_ActivityPatterns_ColumnHeader();

		/*
		 * Verify whether the "Activity Pattern" screen is sorted by "Subject"
		 * by default.
		 */
		BusinessSettings_ActivityPatterns.verifysortedBySubject();

		/*
		 * Verify whether the activity patterns are displayed in below order and
		 * 15 per page.
		 */
		BusinessSettings_ActivityPatterns.ActivityPatternsRowsCount();

		/*
		 * "Verify whether the below activity pattern is displayed on page 8
		 * with the values displayed on the column.
		 */
		BusinessSettings_ActivityPatterns.ActivityPatterns();
		oExtentTest.log(Status.PASS, "Validate Activity Patterns Page8 is Completed");

	}

	@Test
	public void AUT_ActivityPatternDetail_Validate_3pointcontactEmployee() throws Throwable {

		/*--"Login to ClaimCenter with the a user id who has the permission to view ""Administration"" tab.
		
		User Name - su
		Password - gw"----*/

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");
		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 1 of Activity Patterns is displayed

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();

	}

	@Test
	public void AUT_ActivityPatternDetail_Validate_3pointcontactEmployer() throws Throwable {

		/*--"Login to ClaimCenter with the a user id who has the permission to view ""Administration"" tab.
		
		User Name - su
		Password - gw"----*/

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");
		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 1 of Activity Patterns is displayed

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();

	}

	@Test
	public void AUT_ActivityPatternDetail_Validate_3pointcontactMedicalProvider() throws Throwable {

		/*--"Login to ClaimCenter with the a user id who has the permission to view ""Administration"" tab.
		
		User Name - su
		Password - gw"----*/

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");
		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 1 of Activity Patterns is displayed

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();

	}

	@Test
	public void AUT_ActivityPatternDetail_Validate_30daydiary() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");
		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 1 of Activity Patterns is displayed

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();

	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_60daydiary() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 1 of Activity Patterns is displayed

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();

	}

	@Test
	public void AUT_ActivityPatternDetail_Validate_90daydiary() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 1 of Activity Patterns is displayed

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();

	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Additionallivingexpensesrequired() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 1 of Activity Patterns is displayed

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();

	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_ArbitrationDate() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 1 of Activity Patterns is displayed

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();

	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Assignnursetocase() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 1 of Activity Patterns is displayed

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();

	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_CheckDenied() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 1 of Activity Patterns is displayed

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();

	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Checkonmedicalclearanceforlightdutywork() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 1 of Activity Patterns is displayed

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();

	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Checkwithemployerabouttemplightdutywork() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 1 of Activity Patterns is displayed

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();

	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_ClosedFileReview() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 1 of Activity Patterns is displayed

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();

	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_ConsultAccountregardingfatality() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 1 of Activity Patterns is displayed

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();

	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_ContactUnderwriterregardingincorrectclasscode() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 1 of Activity Patterns is displayed

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();

	}

	// Page 2 of Activity Patterns is displayed
	@Test

	public void AUT_ActivityPatternDetail_Validate_CreateRecoveryemailbill1() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 2 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 2 of Activity Patterns is displayed");
		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();

	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_CreateRecoveryemailbill2() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 2 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 2 of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();

	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_DecisionDateReview() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 2 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 2 of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();

	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Determinecompensability() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 2 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 2 of Activity Patterns is displayed");
		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();

	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Determineifopportunityforrecovery() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 2 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 2 of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();

	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_FileEmployersFirstNotice() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 2 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 2 of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();

	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Followupwithvendorpastexpectedquotecompletiondate() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 2 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 2 of Activity Patterns is displayed");
		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();

	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Followupwithvendorpastexpectedservicecompletiondate() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 2 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 2 of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();

	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Followupwithvendorworknotacceptedintimelymanner() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 2 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 2 of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();

	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Generalreminderdiary() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 2 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 2 of Activity Patterns is displayed");
		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();

	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_GetEmployeesNoticeofInjury() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");
		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 2 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 2 of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();

	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_GetastatementfromHealthandSafetyDept() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 2 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 2 of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();

	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Getastatementfromwitness() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 2 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 2 of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Getaccidentsceneinspected() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 2 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 2 of Activity Patterns is displayed");
		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Getclaimantmedicalreports() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 2 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 2 of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	// Page 3 of Activity Patterns is displayed
	@Test

	public void AUT_ActivityPatternDetail_Validate_Getindependentmedicalexamination() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");
		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 3 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 3 of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Getinitialmedicalreport() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 3 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 3 of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Getlistofdamageditems() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 3 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 3 of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Getpolicereport() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 3 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 3 of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Getpropertyinspected() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 3 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 3 of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Getquoteforrepairsreplacement() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 3 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 3 of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_GetsignedVoluntaryAgreement() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 3 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 3 of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Getvehicleinspected() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 3 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 3 of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Getwagestatementandtaxstatus() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 3 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 3 of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_HearingDate() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 3 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 3 of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_ISOmatchesfound() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 3 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 3 of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Independentappraisal() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 3 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 3 of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Initial30dayfilereview() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 3 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 3 of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Invoicenotautoapproved() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 3 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 3 of Activity Patterns is displayed");
		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Invoicenotautopaid() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 3 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 3 of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	// Page 4 of Activity Patterns is displayed
	@Test

	public void AUT_ActivityPatternDetail_Validate_Legalreview() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");
		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 4 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 4 of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Makeinitialcontactwithclaimant() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 4 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page4  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Makeinitialcontactwithinsured() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 4 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page  4of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Makesettlementoffer() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 4 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_MediationDate() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 1 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 4 of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_MetropolitanReportAvailable() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 4 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 4 of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_MetropolitanReportDeferred() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 4 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 4 of Activity Patterns is displayed");
		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_MetropolitanReportHeld() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 4 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 4 of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_MetropolitanReportInquiryFailed() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 4 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_MetropolitanReportRequestFailed() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 4 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 4 of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_NoMetropolitanReportAvailable() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 4 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page4  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Notifyaccountexpectedcostabovethreshold() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 4 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Notifyreinsurer() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 4 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page4  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Pendingcreaterejected() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 4 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 4 of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Pendingupdaterejected() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 4 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 4  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	// Page 5 Activity pattern displayed
	@Test

	public void AUT_ActivityPatternDetail_Validate_PerformanceReview() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 5 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 5  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Produceclaimstrategynarrative() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 5 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 5  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_PutthirdpartyonnoticeofSubrogationInterest() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 5 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 5  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_RecoverVehicle() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 5 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 5  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_RecoveryDenied() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 5 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 5  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Recurringpaymentstreamending() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 5 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 5  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_ReinsuranceCoverageRetrievalFailed() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 5 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 5  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_RetrieveClaimCompleted() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 5 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 5  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_ReviewAssignment() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 5 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 5  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_ReviewClaimforReinsurance() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 5 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 5  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_ReviewReinsuranceRecoverableandCededReserves() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 5 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 5  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_ReviewallSpecialHandlinginstructions() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 5 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 5  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Reviewandapprovebulkinvoice() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 5 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 5  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Reviewandapprovenewpayment() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 5 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 5  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Reviewandapprovenewrecovery() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 5 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 5  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	// Page 6 Activity Pattern
	@Test

	public void AUT_ActivityPatternDetail_Validate_Reviewandapprovenewrecoveryreservechange() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 6 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 6  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Reviewandapprovequoteforrepairsreplacement() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 6 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 6  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Reviewandapprovereservechange() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 6 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 6  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_ReviewclaimforsubrogationClaimhasbeenreopened() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 6 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 6  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Reviewcoverageinquestion() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 6 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 6  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_ReviewdenialdecisionwithAccountManager() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 6 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 6  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_ReviewforCatastrophe() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 6 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 6  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_ReviewmatterrelatedSpecialHandlinginstructions() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 6 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 6  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_ReviewnegotiationstrategywithAccount() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 6 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 6  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Reviewnewbillreceived() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 6 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 6  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Reviewnewmail() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 6 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 6  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Reviewrejectedrequest() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 6 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 6  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_ReviewsubrogationrecoveryfinancialsAsupplementalpaymentwascreated() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 6 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 6  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Reviewvendorquote() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 6 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 6  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_SIUreferral() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 6 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 6  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	// Page 7 Activity Pattern
	@Test

	public void AUT_ActivityPatternDetail_Validate_SalvageVehicle() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 7 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 7  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Sendclaimacknowledgementletter() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 7 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 7  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Sendletterconfirmingclosureofexposure() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 7 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 7  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Sendreservationofrightsletter() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 7 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 7 of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_SpecialInvestigationClaimEscalation() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");

		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 7 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 7  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_SpecialInvestigationClaimReview() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");
		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 7 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 7  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Subrogationstatutedeadlineapproaching() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");
		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 7 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 7  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_TrialDate() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");
		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 7 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 7  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Unabletoclosetheclaimortheexposure() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");
		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 7 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 7  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Unabletoissueastoppayment() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");
		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 7 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 7  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	// -------------------------------------------------------------------
	@Test

	public void AUT_ActivityPatternDetail_Validate_Unabletoissueastoppaymentonbulkcheck() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");
		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 7 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 7  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Unabletovoidthebulkcheck() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");
		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 7 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 7  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Unabletovoidthecheck() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");
		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 7 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 7  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_ValidationandprocessingofBulkInvoiceItemsfailed() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");
		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 7 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 7  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Vendoraskedquestion() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");
		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 7 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 7  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	// -----------------------------------------------------------------------------------------------------------------------
	@Test

	public void AUT_ActivityPatternDetail_Validate_Vendorcanceledworkinstructnewvendor() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");
		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 8 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 8  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Vendorcompletedwork() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");
		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 8 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 8  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Vendordeclinedworkinstructnewvendor() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");
		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 8 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 8  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Vendorworkdelayed() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");
		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 8 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 8  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Verifycoverage() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");
		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 8 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 8  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Verifycoveragedetermineifopportunityforrecovery() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");
		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 8 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 8  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

	@Test

	public void AUT_ActivityPatternDetail_Validate_Visitclaimantandassessbacktoworkstatus() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_ClaimsCenter_User("SuperUser");
		// Navigate to "Administration" ->
		Tab_Menu_Navigation.ccTabNavigation("Administration", "NA");

		// Navigate to "Business Settings" ->

		// Navigate to "Activity Patterns" ->
		Tab_Menu_Navigation.ccMenuNavigation("Activity Patterns");

		// Page 7 of Activity Patterns is displayed
		oExtentTest.log(Status.PASS, "Page 7  of Activity Patterns is displayed");

		BusinessSettings_ActivityPatterns.VerifyActivityPatterns();
	}

}
