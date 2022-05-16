package com.pages.Guidewire.PolicyCenter.CommercialAuto;

import com.pages.Guidewire.PolicyCenter.PolicyCenter_Resuables_PO;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.aventstack.extentreports.ExtentTest;

public class CA_StateInfo extends SeleniumWebDriver_Commands {

	public CA_StateInfo(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);

	}

	private static By SateInfoHeader = By.xpath("//div[contains(@id,'BAStateInfoScreen-ttlBar')]//div[@role='heading']");

	private static By StateInfoState = By.xpath("//td[contains(@id,'States_Cell')]//div[contains(@id,'States')]");

	// Coverages Tab
	private static By StateInfoCoverages                           = By.xpath("//div[contains(@id,'CoveragesCardTab')]//div[@class='gw-label' and text()='Coverages']");
	private static By StateInfoCoveragesCommercialAutoOwnedHeading = By.xpath("//div[contains(@id,'BAStateCoveragesPanelSet')]//div[@role='heading' and @class='gw-TitleBar--title']");

	// Additional Coverages
	private static By AdditionalCoverages                   = By.xpath("//div[contains(@id,'AdditionalCoveragesCardTab')]//div[@role='tab']");
	private static By AdditionalCoveragesAddCoveragesButton = By.xpath("//div[contains(@id,'AdditionalCoveragesDV_tb-Add')]//div[@role='button']");

	// Exclusions & Conditions
	private static By ExclusionsAndConditions       = By.xpath("//div[contains(@id,'ExclusionsAndConditionsCardTab')]//div[@role='tab']");
	private static By ExclusionsAndConditionsButton = By.xpath("//div[contains(@id,'AddExclusionsOrCondition')]//div[@role='button']");

	// State Rating
	private static By StateRating = By.xpath("//div[contains(@id,'ModifierCardTab')]//div[@role='tab']");

	public static void Stateinfo() throws Throwable {
		try {
			lhm_TestCase_Table_Data = CA_Reusables.getData_CommercialAuto("CA_StateInfo");

			GuidewireAutomate_Validation("State Info Header", PolicyCenter_Resuables_PO.Screen_Header, "contains", "State Info");
			GuidewireAutomate_Validation("State", StateInfoState, "equals", lhm_TestCase_Table_Data.get("CA_State"));;

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void StateinfoCoverages() throws Throwable {
		try {

			GuidewireAutomate_Validation("Coverages", StateInfoCoverages, "equals", "Coverages");
			GuidewireAutomate("Coverages Button", StateInfoCoverages, "clickAndwait", "click");
			GuidewireAutomate_Validation("Commercial Auto Owned Header", StateInfoCoveragesCommercialAutoOwnedHeading, "equals", "Commercial Auto Owned Vehicle Group By State");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void StateinfoAdditionalCoverages() throws Throwable {
		try {

			GuidewireAutomate_Validation("Additional Coverages", AdditionalCoverages, "equals", "Additional Coverages");
			GuidewireAutomate("Additional Coverages Button", AdditionalCoverages, "clickAndwait", "click");
			GuidewireAutomate("Add Coverages Button", AdditionalCoveragesAddCoveragesButton, "clickAndwait", "click");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

	public static void StateinfoExclusionsAndConditions() throws Throwable {
		try {
			GuidewireAutomate_Validation("Exclusions & Conditions", ExclusionsAndConditions, "equals", "Exclusions & Conditions");
			GuidewireAutomate("Exclusions & Conditions Button", ExclusionsAndConditions, "clickAndwait", "click");
			GuidewireAutomate("Add Exclusions or Conditions Button", ExclusionsAndConditionsButton, "clickAndwait", "click");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

	public static void StateinfoStateRating() throws Throwable {
		try {
			lhm_TestCase_Table_Data = CA_Reusables.getData_CommercialAuto("CA_StateInfo");
			GuidewireAutomate_Validation("State Rating", StateRating, "equals", "State Rating");
			GuidewireAutomate("State Rating Button", StateRating, "clickAndwait", "click");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

}
