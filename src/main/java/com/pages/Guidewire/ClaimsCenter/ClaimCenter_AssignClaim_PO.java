package com.pages.Guidewire.ClaimsCenter;

import org.openqa.selenium.By;

public interface ClaimCenter_AssignClaim_PO {

	final By Groups_Header  = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading']");
	final By GD_Profile_Tab = By.xpath("//div[contains(@id,'GroupDetail_BasicCardTab')]/div[@role='tab']");
	final By GD_Queues_Tab  = By.xpath("//div[contains(@id,'GroupDetail_QueuesCardTab')]/div[@role='tab']");
	final By GD_Regions_Tab = By.xpath("//div[contains(@id,'GroupDetail_RegionsCardTab')]/div[@role='tab']");

	final By Groups_Name   = By.xpath(" //input[contains(@name,'GroupName')]");
	final By Groups_Search = By.xpath("//div[contains(@id,'SearchLinksInputSet-Search')]");

	/*
	 * 
	 */
	final By Groups_GroupName_Users          = By.xpath("//table[@class='gw-ListViewWidget--table gw-table']//tr[contains(@id,'GroupUsersLV')]//td[contains(@id,'User_Cell')]//div[@class='gw-link gw-label']");
	final By Groups_GroupName_LoadFactor     = By.xpath("//table[@class='gw-ListViewWidget--table gw-table']//tr[contains(@id,'GroupUsersLV')]//td[contains(@id,'LoadFactor_Cell')]//div[@class='gw-value-readonly-wrapper']");
	final By Groups_GroupName_VacationStatus = By.xpath("//table[@class='gw-ListViewWidget--table gw-table']//tr[contains(@id,'GroupUsersLV')]//td[contains(@id,'VacationStatus_Cell')]//div[@class='gw-label']");

	final By Edit_Button = By.xpath("//div[contains(@id,'GroupDetailToolbarButtonSet-Edit')]");

	/*
	 * After Edit
	 */
	final By Groups_GroupName_CheckBox = By
			.xpath("//tr[contains(@id,'GroupUsersLV') and contains(@class,'gw-standard-row')]/td[contains(@class,'gw-impl-cell--CB')]//div[contains(@id,'_Checkbox') and contains(@class,'gw-IteratorEntryCheckBoxWidget')]/input[@type='checkbox']");

	final By Groups_GroupName_Users_Edit                   = By.xpath("//table[@class='gw-ListViewWidget--table gw-table']//tr[contains(@id,'GroupUsersLV')]/td[contains(@id,'GroupUsers_User_Cell')]//select[contains(@name,'GroupUsers_User')]");
	final By Groups_GroupName_LoadFactor_Edit              = By.xpath("//tr[contains(@id,'GroupUsersLV')]//input[contains(@name,'LoadFactor')]");
	final By Groups_GroupName_LoadFactorParameterType_Edit = By.xpath("//tr[contains(@id,'GroupUsersLV')]//select[contains(@name,'LoadFactorType')]");
	final By Groups_GroupName_VacationStatus_Edit          = By.xpath("//tr[contains(@id,'GroupUsersLV')]//select[contains(@name,'VacationStatus')]");
	final By Groups_GroupName_BackupUser                   = By.xpath("//tr[contains(@id,'GroupUsersLV')]//select[contains(@name,'BackupUser')]");
	/*
	 */
	final By Update_Button = By.xpath("//div[contains(@id,'GroupDetailToolbarButtonSet-Update')]/div[@role='button']");

}
