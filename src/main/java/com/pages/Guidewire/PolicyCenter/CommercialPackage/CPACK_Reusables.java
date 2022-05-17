package com.pages.Guidewire.PolicyCenter.CommercialPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.aventstack.extentreports.ExtentTest;

public class CPACK_Reusables extends SeleniumWebDriver_Commands {

	public CPACK_Reusables(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}
	private static By LOB_CommercialPackage = By.xpath("//div[text()='Commercial Package']/ancestor::td[contains(@id,'Name_Cell')]/preceding-sibling::td//div[contains(@id,'ProductSelection') and text()='Select']");

	public static void newSubmission_SelectLOB_CommercialPackage() throws Throwable {
		GuidewireAutomate("LOB CommercialPackage", LOB_CommercialPackage, "clickAndwait", "click");
	}

}
