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
	final By PS_Claims = By.xpath("//div[@class='gw-TitleSection']/div[@role='heading']/span[text()='Claims']");
	final By PS_CompletedPolicyTransactions = By
			.xpath("//div[@class='gw-TitleSection']/div[@role='heading']/span[text()='Completed Policy Transactions']");
	final By PS_Notes = By.xpath("//div[@class='gw-TitleSection']/div[@role='heading']/span[text()='Notes']");
	final By PS_Billing = By.xpath("//div[@class='gw-TitleSection']/div[@role='heading']/span[text()='Billing']");
	final By PS_PaymentSchedule = By
			.xpath("//div[@class='gw-TitleSection']/div[@role='heading']/span[text()='Payment Schedule']");
	final By PS_Contacts = By.xpath("//div[@class='gw-TitleSection']/div[@role='heading']/span[text()='Contacts']");
	final By PS_Producer = By.xpath("//div[@class='gw-TitleSection']/div[@role='heading']/span[text()='Producer']");


}
