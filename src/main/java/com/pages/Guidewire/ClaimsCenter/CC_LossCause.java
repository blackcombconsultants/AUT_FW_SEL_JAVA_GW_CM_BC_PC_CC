package com.pages.Guidewire.ClaimsCenter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.aventstack.extentreports.ExtentTest;

public class CC_LossCause extends SeleniumWebDriver_Commands {
	private static String DropdownCount;

	public CC_LossCause(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}
	private static By AddClaimInformation_Header = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and text()='Step 3 of 4: Add claim information']");

	private static By ACI_WhatHappened = By.xpath("//textarea[contains(@name,'Description')]");

	private static By ACI_LossCause                = By.xpath("//select[contains(@name,'LossCause')]");
	private static By ACI_PrimaryLossCauseSelect   = By.xpath("//select[contains(@name,'Primary_LossCause')]");
	private static By ACI_SecondaryLossCauseSecect = By.xpath("//select[contains(@name,'Secondary_LossCause')]");
	private static By ACI_Address1                 = By.xpath("//input[contains(@name,'GlobalAddressInputSet-AddressLine1')]");
	private static By ACI_State                    = By.xpath("//select[contains(@name,'GlobalAddressInputSet-State')]");
	private static By ACI_City                     = By.xpath("//input[contains(@name,'GlobalAddressInputSet-City')]");

	private static By ACI_OtherLocation       = By.xpath("//div[contains(@id,'OtherLocationChoice_Choice')]//div[@role='radio']");
	private static By ACI_FirstNoticeSuit_Yes = By.xpath("//input[contains(@id,'FirstNoticeSuit_0')]");

	public static void ncw_AddClaimInformation_LossCause() throws Throwable {
		try {
			lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("LossCause");

			GuidewireAutomate_Validation("Screen Header", AddClaimInformation_Header, "equals", "Step 3 of 4: Add claim information");
			GuidewireAutomate("What Happened", ACI_WhatHappened, "clearANDsendKeys", lhm_TestCase_Table_Data.get("ACI_WhatHappened"));

			GuidewireAutomate("First Notice Suit Yes", ACI_FirstNoticeSuit_Yes, "clickAndwait", "click");
			String DropdownCount = lhm_TestCase_Table_Data.get("TotalDropdown");
			int    m             = Integer.parseInt(DropdownCount);
			for (int i = 1; i <= m; i++) {
				GuidewireAutomate("Primary Loss Cause", ACI_PrimaryLossCauseSelect, "selectByVisibleText", lhm_TestCase_Table_Data.get("SelectPrimaryLoss" + i));
				Thread.sleep(500);
				GuidewireAutomate_Validation("Secondary Loss Cause", ACI_SecondaryLossCauseSecect, "getOptionscontains", lhm_TestCase_Table_Data.get("SecondaryLoss" + i));
				Thread.sleep(500);
			}

		} catch (Exception e) {

		}
	}
}
