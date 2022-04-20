package com.pages.Guidewire.PolicyCenter.InlineMarine;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.aventstack.extentreports.ExtentTest;

public class IM_Reusable extends SeleniumWebDriver_Commands {

	public IM_Reusable(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);

	}

	private static By LOB_InlineMarine = By.xpath(
			"//div[text()='Inland Marine']/ancestor::td[contains(@id,'Name_Cell')]/preceding-sibling::td//div[contains(@id,'ProductSelection') and text()='Select']");

	public static void newSubmission_SelectLOB_InlineMarine() throws Throwable {
		GuidewireAutomate("LOB GeneralLiability", LOB_InlineMarine, "clickAndwait", "click");
	}
}
