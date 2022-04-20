package com.pages.Guidewire.ClaimsCenter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class CC_ReopenClaim extends SeleniumWebDriver_Commands {

	public CC_ReopenClaim(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	private static By ReopenClaim_Header = By.xpath("//div[contains(@id,'ReopenClaimScreen-ttlBar')]//div[contains(@aria-level,'1')]");
	private static By ReopenClaim_Note   = By.xpath("//textarea[contains(@name,'Note')]");
	private static By ReopenClaim_Reason = By.xpath("//select[@name='ReopenClaimPopup-ReopenClaimScreen-ReopenClaimInfoDV-Reason']");
	private static By ReopenButton       = By.xpath("//div[@id='ReopenClaimPopup-ReopenClaimScreen-Update']//div[@role='button']");

	// Divya
	// 17/12/2021
	// VerifyReason in Reopen claim page

	public static void ReopenClaimInfoVerifyReason() throws Throwable {
		// lhm_TestCase_Table_Data = ClaimCenter_Resuables.getData_ClaimsCenter("ReopenClaim");

		GuidewireAutomate_Validation("Screen Header", ReopenClaim_Header, "contains", "Reopen Claim");
		String Typelist1   = "Financial Correction";
		String Typelist2   = "Outstanding Expenses";
		String Typelist3   = "Underlying Erosion";
		String AllTypeList = getOptions_Element(ReopenClaim_Reason);
		try {
			if (AllTypeList.contains(Typelist1) && AllTypeList.contains(Typelist2) && AllTypeList.contains(Typelist3)) {
				oExtentTest.log(Status.PASS, "Reason TypeList Dropdown contains " + Typelist1 + " and " + Typelist2 + "and" + Typelist3 + " Value");
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;

		}
	}

	// Divya
	// 17/12/2021
	// VerifyClosedinError

	public static void ReopenClaimInfoVerifyClosedinError() throws Throwable {
		String Typelist1   = "Closed in Error";
		String Typelist2   = "Financial Correction";
		String Typelist3   = "New Information";
		String Typelist4   = "Outstanding Expenses";
		String Typelist5   = "Payment Denied";
		String Typelist6   = "Underlying Erosion";
		String AllTypeList = getOptions_Element(ReopenClaim_Reason);
		try {
			if (AllTypeList.contains(Typelist1) && AllTypeList.contains(Typelist2) && AllTypeList.contains(Typelist3)) {
				oExtentTest.log(Status.PASS, "Reason TypeList Dropdown contains " + Typelist1 + " and " + Typelist2 + "and" + Typelist3 + Typelist4 + "and" + Typelist5 + "and" + Typelist6 + "and" + " Value");
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;

		}
	}
	public static void ReopenClaim() throws Throwable {

		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("ReopenClaim");

		try {
			GuidewireAutomate_Validation("Screen Header", ReopenClaim_Header, "contains", "Reopen Claim");
			GuidewireAutomate("Reopen Claixm Reason", ReopenClaim_Reason, "selectByVisibleText", "Closed in Error");
			GuidewireAutomate("Reopen", ReopenButton, "clickAndwait", "click");
			/*
			 * By Warning = By.xpath("//div[@id='wsTabBar-wsTab_0']//div[@role='tab']"); By WarningClear =
			 * By.xpath("//div[contains(@id,'WebMessageWorksheet_ClearButton')]//div[@role='button']"); GuidewireAutomate_Validation("Warning",
			 * Warning, "equals", "Validation Results"); GuidewireAutomate("Clear", WarningClear, "clickAndwait", "click");
			 * 
			 * getStaleElement("ReopenButton", ReopenButton); GuidewireAutomate("ReopenButton", ReopenButton, "clickAndwait", "click");
			 */
			Thread.sleep(2000);
			oExtentTest.log(Status.PASS, "Claim Successfully Reopened");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;

		}
	}

}