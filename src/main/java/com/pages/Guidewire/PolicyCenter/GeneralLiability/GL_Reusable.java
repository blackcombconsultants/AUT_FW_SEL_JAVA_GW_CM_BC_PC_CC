package com.pages.Guidewire.PolicyCenter.GeneralLiability;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.aventstack.extentreports.ExtentTest;

public class GL_Reusable extends SeleniumWebDriver_Commands {

	public GL_Reusable(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);

	}

	private static By LOB_GeneralLiability = By.xpath(
			"//div[text()='General Liability']/ancestor::td[contains(@id,'Name_Cell')]/preceding-sibling::td//div[contains(@id,'ProductSelection') and text()='Select']");

	public static void newSubmission_SelectLOB_GeneralLiability() throws Throwable {
		GuidewireAutomate("LOB GeneralLiability", LOB_GeneralLiability, "clickAndwait", "click");
	}
}
