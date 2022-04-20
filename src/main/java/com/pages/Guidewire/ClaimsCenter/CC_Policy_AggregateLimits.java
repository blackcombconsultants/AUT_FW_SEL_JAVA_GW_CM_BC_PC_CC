package com.pages.Guidewire.ClaimsCenter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class CC_Policy_AggregateLimits extends SeleniumWebDriver_Commands {
	public CC_Policy_AggregateLimits(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	private static By AggregateLimitsHeader       = By.xpath("//div[contains(@id,'ClaimPolicyAggregateLimitsScreen-ttlBar')]//div[@role='heading']");
	private static By AggregateLimitsAddButton    = By.xpath("//div[contains(@id,'ClaimPolicyAggregateLimits_AddButton')]//div[@role='button']");
	private static By AggregateLimitDetailHeader  = By.xpath("//div[contains(@id,'AggregateLimitDetailScreen-ttlBar')]//div[@role='heading']");
	private static By CountTowardsLimitTypeList   = By.xpath("//select[contains(@name,'AggregateLimitDetailDV-aggLimitCalcCriteria')]");
	private static By AggregateLimitDetailAmount  = By.xpath("//input[contains(@name,'AggregateLimit_LimitAmount')]");
	private static By RealizedValue1              = By.xpath("//div[contains(@id,'AggregateLimitsLV-0-AmountUsed')]//div[@class='gw-CurrencyValue--modelValue gw-ActionValueWidget']");
	private static By AggregateLimitCheckBox      = By.xpath("//input[contains(@name,'AggregateLimitsLV-_Checkbox')]");
	private static By AggregateLimitsDeleteButton = By.xpath("//div[contains(@id,'DeleteButton')]//div[@role='button']");
	private static By AggregateType               = By.xpath("//select[contains(@name,'AggregateLimit_ValueType')]");

	private static By TabCC_Claim_dd                 = By.xpath("//div[@id='TabBar-ClaimTab']//div[3]");
	private static By TabCC_Claim_ClaimNumber        = By.xpath("//input[@name='TabBar-ClaimTab-ClaimTab_FindClaim']");
	private static By TabCC_Claim_ClaimNumber_Search = By.xpath("//div[@id='TabBar-ClaimTab-ClaimTab_FindClaim_Button']//span");
	private static By Coverage_Add                   = By.xpath("//div[contains(@id,'AggregateLimitCoveragesLV_tb-Add')]//div[@role='button']");
	private static By AL_CoverageType                = By.xpath("//select[contains(@name,'AggregateLimitCoveragesLV-0-CoverageType')]");

	/*
	 * Author - Pankaj Date - 07/12/2021 Description - Check in Policy-->Aggregate Limit-->"Verify Count Towards Limit Type list"
	 */

	public static void AG_VerifyCountTowardsLimitTypelist() throws Throwable {
		try {

			GuidewireAutomate_Validation("Screen Header", AggregateLimitsHeader, "equals", "Policy: Aggregate Limits");
			GuidewireAutomate("Aggregate Limits Add Button", AggregateLimitsAddButton, "clickAndwait", "click");
			GuidewireAutomate_Validation("Screen Header", AggregateLimitDetailHeader, "equals", "Aggregate Limit Details");
			String CountTowardsLimit = "All Incurred Costs except Legal Expenses";
			String perTypeValues     = getOptions_Element(CountTowardsLimitTypeList);
			if (perTypeValues.contains(CountTowardsLimit)) {
				oExtentTest.log(Status.PASS, "PerTypeList Dropdown contains " + CountTowardsLimit + " Is Available");

			} else {
				oExtentTest.log(Status.PASS, "PerTypeList Dropdown contains " + CountTowardsLimit + " Is Not Available");
			}

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	/*
	 * Author - Pankaj Date - 08/12/2021 Description - Aggregate Limit screen "Create Aggregate Limit"
	 */
	public static void AG_AggregateLimits() throws Throwable {
		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("AggregateLimit");
		try {

			GuidewireAutomate_Validation("Screen Header", AggregateLimitsHeader, "equals", "Policy: Aggregate Limits");
			GuidewireAutomate("Aggregate Limits Add Button", AggregateLimitsAddButton, "clickAndwait", "click");
			GuidewireAutomate_Validation("Screen Header", AggregateLimitDetailHeader, "equals", "Aggregate Limit Details");
			GuidewireAutomate("Amount", AggregateLimitDetailAmount, "clearANDsendKeys", lhm_TestCase_Table_Data.get("AggregateLimitDetailAmount"));
			GuidewireAutomate("Count Towards Limit Type List", CountTowardsLimitTypeList, "selectByVisibleText", lhm_TestCase_Table_Data.get("CountTowardsLimit"));

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	public static void AggregateLimits_AddCoverage() throws Throwable {
		try {
			GuidewireAutomate("Add Button", Coverage_Add, "clickAndwait", "click");

			GuidewireAutomate("Aggregate Limits Add Button", AL_CoverageType, "selectByVisibleText", "Excess Cyber E&O (follow form)");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/*
	 * Author - Pankaj Date - 10/12/2021 Description - Aggregate Limit screen "Check Realized value"
	 */
	public static void AG_VerifyAggregateLimits() throws Throwable {
		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("AggregateLimit");
		try {
			GuidewireAutomate_Validation("Screen Header", AggregateLimitsHeader, "equals", "Policy: Aggregate Limits");
			GuidewireAutomate_Validation("Realized value", RealizedValue1, "equals", lhm_TestCase_Table_Data.get("Realizedvalue"));
			GuidewireAutomate("Check Box", AggregateLimitCheckBox, "clickAndwait", "click");
			GuidewireAutomate("Delete Button", AggregateLimitsDeleteButton, "clickAndwait", "click");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	public static void AG_VerifyAggregateLimitsAndDeductibles() throws Throwable {

		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("AggregateLimit");
		try {

			for (int i = 1; i <= 4; i++) {
				GuidewireAutomate("Claims Tab", TabCC_Claim_dd, "clickAndwait", "click");
				Thread.sleep(1000);
				GuidewireAutomate("Claim Number", TabCC_Claim_ClaimNumber, "clearANDsendKeys", lhm_TestCase_Table_Data.get("ClaimsNumber" + i));
				Thread.sleep(1000);
				GuidewireAutomate("Claim Number Search", TabCC_Claim_ClaimNumber_Search, "clickAndwait", "click");
				Thread.sleep(1000);
				// lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
				// lhm_TestCase_Table_Data.clear();
				CC_Reusables.ccMenuNavigation("Policy Aggregate Limits");
				Thread.sleep(1000);
				GuidewireAutomate_Validation("Screen Header", AggregateLimitsHeader, "equals", "Policy: Aggregate Limits");
				GuidewireAutomate("Aggregate Limits Add Button", AggregateLimitsAddButton, "clickAndwait", "click");
				GuidewireAutomate_Validation("Screen Header", AggregateLimitDetailHeader, "equals", "Aggregate Limit Details");
				Thread.sleep(2000);
				GuidewireAutomate_Validation("Aggregate Type", AggregateType, "getOptionscontains", "Deductible,Limit");

			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

}
