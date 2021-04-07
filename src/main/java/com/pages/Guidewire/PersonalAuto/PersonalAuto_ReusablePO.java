package com.pages.Guidewire.PersonalAuto;

import org.openqa.selenium.By;

public interface PersonalAuto_ReusablePO {

	final By NewSubmisison_Screen_PALOB_Button = By.xpath("//div[contains(@id,'-8-addSubmission')]");

	final By LobPersonalAuto = By.xpath(
			"//div[text()='Personal Auto']/ancestor::td[contains(@id,'Name_Cell')]/preceding-sibling::td//div[contains(@id,'ProductSelection') and text()='Select']");

	final By Offerings_Screen_Header = By.xpath("//div[@class='gw-TitleBar--title']");
	final By Offerings_Screen_Dropdown = By
			.xpath("//select[@name='SubmissionWizard-OfferingScreen-OfferingSelection']");
	
	
	final By Qualification_Screen_Header = By.xpath("div[class='gw-TitleBar--title']");
	final By CurrentlyInsured = By.xpath("//select[contains(@name,'QuestionSetsDV-0-')]");

	void offering() throws Throwable;

	void Qualification() throws Throwable;

}
