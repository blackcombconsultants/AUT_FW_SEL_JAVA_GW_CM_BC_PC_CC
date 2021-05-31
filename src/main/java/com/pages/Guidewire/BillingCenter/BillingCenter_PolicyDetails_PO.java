package com.pages.Guidewire.BillingCenter;

import org.openqa.selenium.By;

public interface BillingCenter_PolicyDetails_PO {

	final By PolicyDetails_Header=By.xpath("//div[@id='PolicyDetailSummary-PolicyDetailSummaryScreen-ttlBar']//div[ @class='gw-TitleBar--title']");

	/*
	 * PD-Policy Basics
	 */
	final By PD_PB_PolicyNumber=By.xpath("//div[contains(@id,'PolicyDetailDV-PolicyNumber')]//div[@class='gw-value-readonly-wrapper']");
	final By PD_PB_AssignedRisk=By.xpath("//div[contains(@id,'PolicyDetailDV-AssignedRisk')]//div[@class='gw-value']//div[@class='gw-label']");
	final By PD_PB_EffectiveDate=By.xpath("//div[contains(@id,'PolicyDetailDV-PolicyPerEffDate')]//div[@class='gw-value']//div[@class='gw-value-readonly-wrapper']");
	final By PD_PB_ExpirationDate=By.xpath("//div[contains(@id,'PolicyDetailDV-PolicyPerExpirDate')]//div[@class='gw-value']//div[@class='gw-value-readonly-wrapper']");
	final By PD_PB_ClosureStatus=By.xpath("//div[contains(@id,'PolicyDetailDV-ClosureStatus')]//div[@class='gw-value']//div[@class='gw-label']");
	final By PD_PB_RequireFinalAudit=By.xpath("//div[contains(@id,'PolicyDetailDV-RequireFinalAudit')]//div[@class='gw-value']//div[@class='gw-label']");
	final By PD_PB_CancellationStatus=By.xpath("//div[contains(@id,'PolicyDetailDV-CancellationStatus')]//div[@class='gw-value']//div[@class='gw-label']");
	
	/*
	 * PD-Charges
	 */
	final By PD_C_PremiumCharges=By.xpath("//div[contains(@id,'PolicyDetailDV-PolicyCharges')]//div[@class='gw-value']//div[@class='gw-value-readonly-wrapper']");
	final By PD_C_Total=By.xpath("//div[contains(@id,'PolicyDetailDV-TotalCharges')]//div[@class='gw-value']//div[@class='gw-value-readonly-wrapper']");

	/*
	 * PD-Payments
	 */
	final By PD_P_PaymentPlan=By.xpath("//div[contains(@id,'PolicyDetailDV-PaymentPlan')]//div[@class='gw-value']//div[@class='gw-ActionValueWidget']");
	

	
	/*
	 * PD-Earnings
	 */
	final By PD_E_EarnedPremium=By.xpath("//div[contains(@id,'EarnedPremium')]//div[@class='gw-value']//div[@class='gw-value-readonly-wrapper']");
	final By PD_E_EarnedBalance=By.xpath("//div[contains(@id,'EarnedBalance')]//div[@class='gw-value']//div[@class='gw-value-readonly-wrapper']");
	
	/*
	 * PD-Full Pay Discount
	 */
	final By PD_FPD_Eligible=By.xpath("//div[contains(@id,'PolicyDetailDV-Eligible')]//div[@class='gw-value']//div[@class='gw-label']");

	/*
	 * PD-Policy Equity
	 */
   final By  PD_PE_PolicyEquity=By.xpath("//div[@id='PolicyDetailSummary-PolicyDetailSummaryScreen-PolicyDetailDV-PolicyEquity']//div[@class='gw-value-readonly-wrapper']");
   final By  PD_PE_EquityPercent=By.xpath("//div[contains(@id,'PolicyEquityPercentage')]//div[@class='gw-value']//div[@class='gw-value-readonly-wrapper']");
   final By  PD_PE_PaidThrough=By.xpath("//div[@id='PolicyDetailSummary-PolicyDetailSummaryScreen-PolicyDetailDV-PaidThruDate']//div[@class='gw-value-readonly-wrapper']");
   final By  PD_PE_DaysTillPaidThroughDate=By.xpath("//div[@id='PolicyDetailSummary-PolicyDetailSummaryScreen-PolicyDetailDV-DaysTillPaidThruDate']//div[@class='gw-value-readonly-wrapper']");
   final By  PD_PE_EnableEquityWarnings=By.xpath("//div[contains(@id,'EnableEquityWarnings')]//div[@class='gw-value']//div[@class='gw-label']");
   final By  PD_PE_MinEquityDays=By.xpath("//div[contains(@id,'PolicyDetailDV-EquityBuffer')]//div[@class='gw-value']//div[@class='gw-value-readonly-wrapper']");
   /*
	 * PD-History
	 */
   final By  PD_H_InitialInception=By.xpath("//div[contains(@id,'PolicyDetailDV-InitialInception')]//div[@class='gw-value']//div[@class='gw-value-readonly-wrapper']");
   final By  PD_H_TermNumber=By.xpath("//div[contains(@id,'PolicyDetailDV-TermNumber')]//div[@class='gw-value']//div[@class='gw-value-readonly-wrapper']");






}
