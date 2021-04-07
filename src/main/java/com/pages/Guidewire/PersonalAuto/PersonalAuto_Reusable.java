package com.pages.Guidewire.PersonalAuto;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.aventstack.extentreports.ExtentTest;

public class PersonalAuto_Reusable extends SeleniumWebDriver_Commands implements PersonalAuto_ReusablePO {

	public PersonalAuto_Reusable(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	public String getHeader_Offerings() throws Throwable {
		return getText_Element(Offerings_Screen_Dropdown);
	}

	public String getHeader_Qualification() throws Throwable {
		return getText_Element(Qualification_Screen_Header);
	}

	public void NewSubmisisons_SelectLOB() throws Throwable {
		GuidewireAutomate("Lob PersonalAuto", LobPersonalAuto, "click", "");

	}

	@Override

	public void Qualification() throws Throwable {
		Assert.assertEquals(getHeader_Qualification(), "Qualifications");
		GuidewireAutomate("CurrentlyInsured", CurrentlyInsured, "selectByVisibleText", "No - New Driver");
	}

	@Override
	public void offering() throws Throwable {
		Assert.assertEquals(getHeader_Offerings(), "Offerings");
		GuidewireAutomate("Offerings_Screen_Dropdown", Offerings_Screen_Dropdown, "selectByVisibleText",
				"Basic Program");
	}
}
