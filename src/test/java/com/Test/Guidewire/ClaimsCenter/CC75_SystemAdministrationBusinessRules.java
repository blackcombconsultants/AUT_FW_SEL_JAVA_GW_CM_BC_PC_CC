package com.Test.Guidewire.ClaimsCenter;

import org.testng.annotations.Test;

import com.pages.Guidewire.ClaimsCenter.CC_Administration;
import com.pages.Guidewire.ClaimsCenter.CC_Reusables;

public class CC75_SystemAdministrationBusinessRules {
	@Test
	public static void CC75_TC001_BusinessRulesActivityisEnabled() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("Adjuster1");

		CC_Reusables.ccTabNavigation("Administration", "NA");

		CC_Administration.validateHeader();

		CC_Reusables.ccMenuNavigation("Business Rules Direct");

		CC_Reusables.logout_ClaimsCenter();

	}

	@Test
	public static void CC75_TC002_DisabletheOOTBActivityBusinessRules() throws Throwable {

		CC_Reusables.login_ClaimsCenter_User("Adjuster1");

		CC_Reusables.ccTabNavigation("Administration", "NA");

		CC_Administration.validateHeader();
		CC_Reusables.ccMenuNavigation("Business Rules Direct");
		CC_Administration.DisabletheOOTBActivityBusinessRules();
		CC_Reusables.logout_ClaimsCenter();

	}
}
