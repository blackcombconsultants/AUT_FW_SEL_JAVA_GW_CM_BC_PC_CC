package com.pages.Guidewire.ClaimsCenter;

import org.openqa.selenium.By;

public interface BusinessSettings_ActivityPatterns_PO {

	final By ActivityPatterns_Header = By.xpath("//div[contains(@id,'ActivityPatternsTitle')]//div[@class='gw-TitleBar--title']");

	// -------> Header (Subject, Class, Category, Type, Priority, Mandatory,
	// Automated
	final By AP_Subject_column   = By.xpath("//div[contains(@id,'SubjectHeader')]//div[contains(@id,'SubjectHeader_inner')]");
	final By AP_Class_column     = By.xpath("//div[contains(@id,'ActivityClassHeader')]//div[contains(@id,'ActivityClassHeader_inner')]");
	final By AP_Category_column  = By.xpath("//div[contains(@id,'CategoryHeader')]//div[contains(@id,'CategoryHeader_inner')]");
	final By AP_Type_column      = By.xpath("//div[contains(@id,'TypeHeader')]//div[contains(@id,'TypeHeader_inner')]");
	final By AP_Priority_column  = By.xpath("//div[contains(@id,'PriorityHeader')]//div[contains(@id,'PriorityHeader_inner')]");
	final By AP_Mandatory_column = By.xpath("//div[contains(@id,'MandatoryHeader')]//div[contains(@id,'MandatoryHeader_inner')]");
	final By AP_Automated_column = By.xpath("//div[contains(@id,'AutomatedOnlyHeader')]//div[contains(@id,'AutomatedOnlyHeader_inner')]");

	// ----->Activity Pattern Activity1
	final By AP_Activity1 = By.xpath("//tr[contains(@id,'ActivityPatternsLV-0-1')]");

	// forActivities Columns in on Page
	final By AP_Subject   = By.xpath("//div[contains(@id,'Subject_button')]");
	final By AP_Class     = By.xpath("//td[contains(@id,'ActivityClass_Cell')]");
	final By AP_Category  = By.xpath("//td[contains(@id,'Category_Cell')]");
	final By AP_Type      = By.xpath("//td[contains(@id,'Type_Cell')]");
	final By AP_Priority  = By.xpath("//td[contains(@id,'Priority_Cell')]");
	final By AP_Mandatory = By.xpath("//td[contains(@id,'Mandatory_Cell')]");
	final By AP_Automated = By.xpath("//td[contains(@id,'AutomatedOnly_Cell')]");

	final By AP_PageNo   = By.xpath("//input[contains(@id,'ActivityPatternsLV-_ListPaging-input')]");
	final By rowCount    = By.xpath("//table/tbody/tr[contains(@id,'ActivityPatternsScreen-ActivityPatternsLV')]");
	final By columnCount = By.xpath("//tr[@id='ActivityPatterns-ActivityPatternsScreen-ActivityPatternsLV-4']/td");

}
