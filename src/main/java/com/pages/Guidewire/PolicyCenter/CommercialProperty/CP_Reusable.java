package com.pages.Guidewire.PolicyCenter.CommercialProperty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.aventstack.extentreports.ExtentTest;

public class CP_Reusable extends SeleniumWebDriver_Commands {

	public CP_Reusable(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);

	}
	private static By LOB_CommercialProperty = By.xpath("//div[text()='Commercial Property']/ancestor::td[contains(@id,'Name_Cell')]/preceding-sibling::td//div[contains(@id,'ProductSelection') and text()='Select']");
	private static By RateButton             = By.xpath("//div[contains(@id,'Rate')]//div[@role='button']");
	private static By FinishQuoteButton      = By.xpath("//div[contains(@id,'FinishQuote')]//div[@role='button']");

	public static void ClickButton(String ButtonName) throws Throwable {
		switch (ButtonName) {
			case "Rate" :
				GuidewireAutomate("Rate Button", RateButton, "clickAndwait", "click");
				break;
			case "Finish Quote" :
				GuidewireAutomate("Finish Quote Button", FinishQuoteButton, "clickAndwait", "click");
				break;

		}

	}

	public static void newSubmission_SelectLOB_CommercialProperty() throws Throwable {
		GuidewireAutomate("LOB_Commercial Property", LOB_CommercialProperty, "clickAndwait", "click");
	}

}
