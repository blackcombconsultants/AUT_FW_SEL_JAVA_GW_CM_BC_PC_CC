package com.pages.Guidewire.ClaimsCenter;

import org.openqa.selenium.By;

public interface CC_Admininstration_Groups_PO {

	/*
	 * 
	 */
	final By Groups_Header  = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading']");
	final By GD_Profile_Tab = By.xpath("//div[contains(@id,'GroupDetail_BasicCardTab')]/div[@role='tab']");

	/*
	 * 
	 */
	final By GR_GroupsName = By.xpath(" //input[contains(@name,'GroupName')]");
	final By GR_GroupType  = By.xpath(" //input[contains(@name,'GroupType')]");
	final By GR_Search     = By.xpath("//div[contains(@id,'SearchLinksInputSet-Search')]");
	final By GR_Reset      = By.xpath("//div[contains(@id,'SearchLinksInputSet-Reset')]");

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
	 * 
	 */

	final By G_GN_U_Edit_BackUpUser_SearchUser_Header    = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading']");
	final By G_GN_U_Edit_BackUpUser_SearchUser_FirstName = By.xpath("//input[contains(@name,'FirstName')]");
	final By G_GN_U_Edit_BackUpUser_SearchUser_LastName  = By.xpath("//input[contains(@name,'LastName')]");
	final By G_GN_U_Edit_BackUpUser_SearchUser_Search    = By.xpath("//div[contains(@id,'SearchLinksInputSet-Search')]");
	final By G_GN_U_Edit_BackUpUser_SearchUser_Select    = By.xpath("//div[text()='Andy Applegate']/ancestor::td[contains(@id,'DisplayName_Cell')]/preceding-sibling::td//div[contains(@id,'_Select')]/div[@role='button']");

	/*
	 */
	final By Update_Button = By.xpath("//div[contains(@id,'Update')]/div[@role='button']");

	/*
	 * Queues
	 */
	final By GN_Queues_Tab = By.xpath("//div[contains(@id,'GroupDetail_QueuesCardTab')]/div[@role='tab']");

	final By Queue_Name               = By.xpath("//td[contains(@id,'GroupQueuesLV-0-Name_Cell')]//div[contains(@id,'Name_button')]");
	final By Queue_Description        = By.xpath("//td[contains(@id,'GroupQueuesLV-0-Description_Cell')]//div[contains(@id,'Description')]");
	final By Queue_VisibleInSubgroups = By.xpath("//td[contains(@id,'GroupQueuesLV-0-SubGroupVisible_Cell')]//div[contains(@id,'SubGroupVisible')]");

	/*
	 * Regions
	 */
	final By GN_Regions_Tab = By.xpath("//div[contains(@id,'GroupDetail_RegionsCardTab')]/div[@role='tab']");

	final By GN_Regions_Name         = By.xpath("//tr[contains(@id,'GroupRegionLV')]/td[contains(@id,'Name_Cell')]//div[contains(@id,'Name')]");
	final By GN_Regions_AreasCovered = By.xpath("//tr[contains(@id,'GroupRegionLV')]/td[contains(@id,'Zones_Cell')]//div[contains(@id,'Zones')]");

}
