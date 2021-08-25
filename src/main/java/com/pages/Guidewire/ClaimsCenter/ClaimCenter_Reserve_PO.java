package com.pages.Guidewire.ClaimsCenter;

import org.openqa.selenium.By;

public interface ClaimCenter_Reserve_PO {

	final By Reserve_Exposure = By.xpath("//select[contains(@name,'Exposure')]");
	final By Reserve_Coverage = By
			.xpath("//td[contains(@id,'Coverage_Cell')]//div[contains(@id,'Coverage')]//div[@class='gw-label']");
	final By Reserve_Add = By.xpath("//div[contains(@id,'Add')]/div[@role='button']");
	final By Reserve_CostType = By.xpath("//select[contains(@name,'CostType')]");
	final By Reserve_CostCategory = By.xpath("//select[contains(@name,'CostCategory')]");

	final By Reserve_NewAvailableReserves = By.xpath("//input[contains(@name,'EditableReservesLV-2-NewAmount')]");
	final By Reserve_Comments = By.xpath("//input[contains(@name,'EditableReservesLV-2-Comments')]");

	final By Reserve_Remove = By.xpath("//div[contains(@id,'NewReserveSetScreen-Remove')]/div[@role='button']");

	final By Reserve_Save = By
			.xpath("//div[contains(@id,'NewReserveSet-NewReserveSetScreen-Update')]/div[@role='button']");

	final By EditReserve_Header=By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and contains(text(),'Edit Reserves')]");
	// div[contains(@id,'NewReserveSetScreen-Remove')]/div[@role='button']

	// Validation Results
	// validate Error Message
	final By EditReserve_ValidationResults = By
			.xpath("//div[contains(@id,'wsTabBar')]//div[@class='gw-label' and text()='Validation Results']");
	final By EditReserve_ValidationResults_Warning = By
			.xpath("//div[contains(@id,'WebMessageWorksheetScreen')]//div[text()='Warnings:']");
	final By ValidationResults_Warning_First = By.xpath(
			"//div[contains(@id,'WebMessageWorksheetScreen-grpMsgs-0-0')]//div[@class='gw-message' and contains(text(),'Gross incurred on exposure (2) 1st Party Vehicle - PGNUtwMRX Automation')]");
	final By ValidationResults_Warning_Second = By.xpath(
			"//div[contains(@id,'WebMessageWorksheetScreen-grpMsgs-0-1')]//div[@class='gw-message' and contains(text(),'Gross incurred for 2002 Acura RL ($2,500.00)')]");

	final By ValidationResults_ClearButton = By
			.xpath("//div[contains(@id,'WebMessageWorksheet_ClearButton')]//div[@role='button']");

	// Financial Transcations

	final By FinancialTranscations_RowCount = By.xpath("//table[@class='gw-ListViewWidget--table gw-table']/tbody/tr");
	final By FinancialTranscations_Header = By.xpath(
			"//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and contains(text(),'Financials: Transactions')]");
	final By FinancialTranscations_NextPage = By.xpath("//div[contains(@id,'TransactionsLV-_ListPaging-next')]");
}
