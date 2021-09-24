package com.pages.Guidewire.CommercialAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.aventstack.extentreports.ExtentTest;

public class CA_Modifiers extends SeleniumWebDriver_Commands {

	public CA_Modifiers(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	
	}

	
private static By ModifiersHeader = By.xpath("//div[contains(@id,'ttlBar')]//div[@role='heading']");
private static By RatingInputsHeader =  By.xpath("//div[contains(@id,'ModifiersScreen')]//div[@role='heading' and text()='Rating Inputs']");
private static By LiabilityRatesSection =  By.xpath("//div[contains(@id,'ratingInputName')]//div[text()='Liability Rates']");
private static By PhysicalDamageRatesSection = By.xpath("//div[contains(@id,'ratingInputName')]//div[text()='Physical Damage Rates']");


public static void Modifiers() throws Throwable {
	
	try {
		
		GuidewireAutomate_Validation("Modifiers Header", ModifiersHeader, "equals", "Modifiers");
		GuidewireAutomate_Validation("Rating Inputs Header", RatingInputsHeader, "equals", "Rating Inputs");
		
		
	}
	catch (Exception e) {
		e.printStackTrace();
		throw e;
	
	
	}
}

public static void LiabilityRates() throws Throwable {
	
	try {
		
		GuidewireAutomate_Validation("Liability Rates Section", LiabilityRatesSection, "equals", "Liability Rates");
		
		
	}
	catch (Exception e) {
		e.printStackTrace();
		throw e;
	
	
	}
}

public static void PhysicalDamageRates() throws Throwable {
	
	try {
		
		GuidewireAutomate_Validation("Physical Damage Rates Section", PhysicalDamageRatesSection, "equals", "Physical Damage Rates");
		
		
	}
	catch (Exception e) {
		e.printStackTrace();
		throw e;
	
	
	}
}


	
}
