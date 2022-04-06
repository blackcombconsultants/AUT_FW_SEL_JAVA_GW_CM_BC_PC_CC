package com.pages.Guidewire.PolicyCenter;

import org.openqa.selenium.By;

public interface PolicyCenter_PolicySummary_PO {

	final By PS_Details = By.xpath("//div[@class='gw-TitleSection']/div[@role='heading']/span[text()='Details']");

	final By PS_D_PolicyNumber = By.xpath(
			"//div[contains(@id,'PolicyDetailsDetailViewTile_DV-PolicyNumber')]//div[@class='gw-value-readonly-wrapper']");
	final By PS_D_Product = By.xpath(
			"//div[contains(@id,'PolicyDetailsDetailViewTile_DV-Product')]//div[@class='gw-value-readonly-wrapper']");
	final By PS_D_Offering = By.xpath(
			"//div[contains(@id,'PolicyDetailsDetailViewTile_DV-Offering')]//div[@class='gw-value-readonly-wrapper']");
	final By PS_D_PrimaryNamedInsured = By.xpath(
			"//div[contains(@id,'PolicyDetailsDetailViewTile_DV-PrimaryNamedInsured_button')]");
	final By PS_D_Underwriter = By.xpath(
			"//div[contains(@id,'PolicyDetailsDetailViewTile_DV-Underwriter')]//div[@class='gw-value-readonly-wrapper']");
	final By PS_D_EffectiveDate = By.xpath(
			"//div[contains(@id,'PolicyDetailsDetailViewTile_DV-EffectiveDate')]//div[@class='gw-value-readonly-wrapper']");
	final By PS_D_ExpirationDate = By.xpath(
			"//div[contains(@id,'PolicyDetailsDetailViewTile_DV-ExpirationDate')]//div[@class='gw-value-readonly-wrapper']");

	final By PS_Account = By.xpath("//div[@class='gw-TitleSection']/div[@role='heading']/span[text()='Account']");
	final By PS_TermFinancials = By
			.xpath("//div[@class='gw-TitleSection']/div[@role='heading']/span[text()='Term Financials']");
	final By PS_CurrentActivities = By
			.xpath("//div[@class='gw-TitleSection']/div[@role='heading']/span[text()='Current Activities']");
	final By PS_OpenPolicyTransactions = By
			.xpath("//div[@class='gw-TitleSection']/div[@role='heading']/span[text()='Open Policy Transactions']");
	final By PS_PolicyLink = By.xpath("//div[contains(@id,'PendingPolicyTransactionsListViewTile_LV-0-JobNumber_button')]");
	final By PS_TransactionType = By.xpath("//div[@class='gw-value-readonly-wrapper'][text()='Renewal']");
	final By Ps_TransactionStatus = By.xpath("//div[@class='gw-value-readonly-wrapper'][text()='Non-renewing']");
	final By PS_Renewal_TransactionsType = By.xpath("//td[contains(@id,'PendingPolicyTransactionsListViewTile_LV-0-JobInProgressType_Cell')]");
	final By Ps_Renewal_TransactionStatus = By.xpath("//td[contains(@id,'PendingPolicyTransactionsListViewTile_LV-0-Status_Cell')]");
	final By PS_Claims = By.xpath("//div[@class='gw-TitleSection']/div[@role='heading']/span[text()='Claims']");
	final By PS_CompletedPolicyTransactions = By
			.xpath("//div[@class='gw-TitleSection']/div[@role='heading']/span[text()='Completed Policy Transactions']");
	final  By PS_TransactionsType = By.xpath("//div[contains(@id,'CompletedPolicyTransactionsListViewTile_LV-0-Type')]");
	final By PS_PremiumCost = By.xpath("//div[contains(@id,'CompletedPolicyTransactionsListViewTile_LV-0-Premium')]");
	final By PS_EffectiveDate = By.xpath("//td[contains(@id,'CompletedPolicyTransactionsListViewTile_LV-0-EffectiveDate_Cell')]");
	final By PS_CloseDate = By.xpath("//td[contains(@id,'CompletedPolicyTransactionsListViewTile_LV-0-CloseDate_Cell')]");
	final By PS_Notes = By.xpath("//div[@class='gw-TitleSection']/div[@role='heading']/span[text()='Notes']");
	final By PS_Billing = By.xpath("//div[@class='gw-TitleSection']/div[@role='heading']/span[text()='Billing']");
	final By PS_PaymentSchedule = By
			.xpath("//div[@class='gw-TitleSection']/div[@role='heading']/span[text()='Payment Schedule']");
	final By PS_Contacts = By.xpath("//div[@class='gw-TitleSection']/div[@role='heading']/span[text()='Contacts']");
	final By PS_Producer = By.xpath("//div[@class='gw-TitleSection']/div[@role='heading']/span[text()='Producer']");
    //toolsBilling
	final By Tools_Billing = By.xpath("//div[contains(@id,'PolicyFile_Billing')]/div[@role='menuitem']");
	final By                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              Billing_Name = By.xpath("//div[contains(@id,'BillingScreen-ttlBar')]");
    final By  ViewBillingStatus = By.xpath("//div[contains(@id,'ViewAccount')]");
	final By BillingStatus = By.xpath("//div[contains(@id,'BillingPoliciesLV-1-Status')]//div[contains(text(),'In Good Standing')]");
	final By PolicyNumber = By.xpath("//div[contains(@id,'BillingPoliciesLV-3-PolicyNumber_button')]");
	final By PS_OPT_DataDisplay = By
			.xpath("//div[contains(@id,'PendingPolicyTransactionsListViewTile_LV-0-JobInProgressType')]");
	final By PS_OPT_PolicyNumber = By
			.xpath("//div[contains(@id,'PendingPolicyTransactionsListViewTile_LV-0-JobNumber_button')]");
	final By CPT_Header = By
			.xpath("//div[contains(@id,'CompletedPolicyTransactionsListViewTile')]//span[@class='gw-TitleText']");
	final By CPT_Premium = By
			.xpath("//div[contains(@id,'CompletedPolicyTransactionsListViewTile_LV-0-Premium')]//div[@class='gw-value-readonly-wrapper']");
	final By OPT_Type = By
			.xpath("//div[contains(@id,'PendingPolicyTransactionsListViewTile_LV-0-JobInProgressType')]//div[@class='gw-value-readonly-wrapper']");
	final By OPT_Status = By
			.xpath("//div[contains(@id,'PendingPolicyTransactionsListViewTile_LV-0-Status')]//div[@class='gw-value-readonly-wrapper']");

	final By NodataDisplay = By
			.xpath("//div[contains(@id,'PendingPolicyTransactionsListViewTile_LV')]//div[@class='gw-ListView--empty-info-cell']");
}
