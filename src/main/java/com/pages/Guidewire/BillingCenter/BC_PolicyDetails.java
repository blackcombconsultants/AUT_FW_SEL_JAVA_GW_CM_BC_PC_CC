package com.pages.Guidewire.BillingCenter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.aventstack.extentreports.ExtentTest;

public class BC_PolicyDetails extends SeleniumWebDriver_Commands {

	private static By PolicyDetails_Header = By.xpath("//div[@id='PolicyDetailSummary-PolicyDetailSummaryScreen-ttlBar']//div[ @class='gw-TitleBar--title']");

	/*
	 * PD-Policy Basics
	 */
	private static By PD_PB_PolicyNumber       = By.xpath("//div[contains(@id,'PolicyDetailDV-PolicyNumber')]//div[@class='gw-value-readonly-wrapper']");
	private static By PD_PB_AssignedRisk       = By.xpath("//div[contains(@id,'PolicyDetailDV-AssignedRisk')]//div[@class='gw-value']//div[@class='gw-label']");
	private static By PD_PB_EffectiveDate      = By.xpath("//div[contains(@id,'PolicyDetailDV-PolicyPerEffDate')]//div[@class='gw-value']//div[@class='gw-value-readonly-wrapper']");
	private static By PD_PB_ExpirationDate     = By.xpath("//div[contains(@id,'PolicyDetailDV-PolicyPerExpirDate')]//div[@class='gw-value']//div[@class='gw-value-readonly-wrapper']");
	private static By PD_PB_ClosureStatus      = By.xpath("//div[contains(@id,'PolicyDetailDV-ClosureStatus')]//div[@class='gw-value']//div[@class='gw-label']");
	private static By PD_PB_RequireFinalAudit  = By.xpath("//div[contains(@id,'PolicyDetailDV-RequireFinalAudit')]//div[@class='gw-value']//div[@class='gw-label']");
	private static By PD_PB_CancellationStatus = By.xpath("//div[contains(@id,'PolicyDetailDV-CancellationStatus')]//div[@class='gw-value']//div[@class='gw-label']");

	/*
	 * PD-Charges
	 */
	private static By PD_C_PremiumCharges = By.xpath("//div[contains(@id,'PolicyDetailDV-PolicyCharges')]//div[@class='gw-value']//div[@class='gw-value-readonly-wrapper']");
	private static By PD_C_Total          = By.xpath("//div[contains(@id,'PolicyDetailDV-TotalCharges')]//div[@class='gw-value']//div[@class='gw-value-readonly-wrapper']");

	/*
	 * PD-Payments
	 */
	private static By PD_P_PaymentPlan = By.xpath("//div[contains(@id,'PolicyDetailDV-PaymentPlan')]//div[@class='gw-value']//div[@class='gw-ActionValueWidget']");

	/*
	 * PD-Earnings
	 */
	private static By PD_E_EarnedPremium = By.xpath("//div[contains(@id,'EarnedPremium')]//div[@class='gw-value']//div[@class='gw-value-readonly-wrapper']");
	private static By PD_E_EarnedBalance = By.xpath("//div[contains(@id,'EarnedBalance')]//div[@class='gw-value']//div[@class='gw-value-readonly-wrapper']");

	/*
	 * PD-Full Pay Discount
	 */
	private static By PD_FPD_Eligible = By.xpath("//div[contains(@id,'PolicyDetailDV-Eligible')]//div[@class='gw-value']//div[@class='gw-label']");

	/*
	 * PD-Policy Equity
	 */
	private static By PD_PE_PolicyEquity            = By.xpath("//div[@id='PolicyDetailSummary-PolicyDetailSummaryScreen-PolicyDetailDV-PolicyEquity']//div[@class='gw-value-readonly-wrapper']");
	private static By PD_PE_EquityPercent           = By.xpath("//div[contains(@id,'PolicyEquityPercentage')]//div[@class='gw-value']//div[@class='gw-value-readonly-wrapper']");
	private static By PD_PE_PaidThrough             = By.xpath("//div[@id='PolicyDetailSummary-PolicyDetailSummaryScreen-PolicyDetailDV-PaidThruDate']//div[@class='gw-value-readonly-wrapper']");
	private static By PD_PE_DaysTillPaidThroughDate = By.xpath("//div[@id='PolicyDetailSummary-PolicyDetailSummaryScreen-PolicyDetailDV-DaysTillPaidThruDate']//div[@class='gw-value-readonly-wrapper']");
	private static By PD_PE_EnableEquityWarnings    = By.xpath("//div[contains(@id,'EnableEquityWarnings')]//div[@class='gw-value']//div[@class='gw-label']");
	private static By PD_PE_MinEquityDays           = By.xpath("//div[contains(@id,'PolicyDetailDV-EquityBuffer')]//div[@class='gw-value']//div[@class='gw-value-readonly-wrapper']");
	/*
	 * PD-History
	 */
	private static By PD_H_InitialInception = By.xpath("//div[contains(@id,'PolicyDetailDV-InitialInception')]//div[@class='gw-value']//div[@class='gw-value-readonly-wrapper']");
	private static By PD_H_TermNumber       = By.xpath("//div[contains(@id,'PolicyDetailDV-TermNumber')]//div[@class='gw-value']//div[@class='gw-value-readonly-wrapper']");

	public BC_PolicyDetails(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	public static void PD_PolicyBasics_Verify() throws Throwable {
		lhm_TestCase_Table_Data = BC_Resuables.getData_BillingCenter("PolicyDetails");

		GuidewireAutomate_Validation("Screen Header", PolicyDetails_Header, "equals", "Policy Details");

		GuidewireAutomate_Validation("Policy Number", PD_PB_PolicyNumber, "equals", lhm_TestCase_Table_Data.get("TD_PolicyNumber"));
		GuidewireAutomate_Validation("Assigned Risk", PD_PB_AssignedRisk, "equals", lhm_TestCase_Table_Data.get("TD_AssignedRisk"));
		GuidewireAutomate_Validation("Expiration Date", PD_PB_ExpirationDate, "equals", lhm_TestCase_Table_Data.get("TD_ExpirationDate"));
		GuidewireAutomate_Validation("Closure Status", PD_PB_ClosureStatus, "equals", lhm_TestCase_Table_Data.get("TD_ClosureStatus"));
		GuidewireAutomate_Validation("Require Final Audit", PD_PB_RequireFinalAudit, "equals", lhm_TestCase_Table_Data.get("TD_RequireFinalAudit"));
		GuidewireAutomate_Validation("Cancellation Status", PD_PB_CancellationStatus, "equals", lhm_TestCase_Table_Data.get("TD_CancellationStatus"));
		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	public static void PD_Charges_Verify() throws Throwable {
		lhm_TestCase_Table_Data = BC_Resuables.getData_BillingCenter("PolicyDetails");

		GuidewireAutomate_Validation("Premium Charges", PD_C_PremiumCharges, "equals", lhm_TestCase_Table_Data.get("TD_PremiumCharges"));
		GuidewireAutomate_Validation("Charges Total", PD_C_Total, "equals", lhm_TestCase_Table_Data.get("TD_Total"));
	}

}
