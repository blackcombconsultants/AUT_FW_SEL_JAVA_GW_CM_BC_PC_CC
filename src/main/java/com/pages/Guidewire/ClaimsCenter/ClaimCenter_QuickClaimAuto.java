package com.pages.Guidewire.ClaimsCenter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;

public class ClaimCenter_QuickClaimAuto extends SeleniumWebDriver_Commands implements ClaimCenter_QuickClaimAuto_PO {

	public ClaimCenter_QuickClaimAuto(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
		// TODO Auto-generated constructor stub
	}
	public static void New_QuickClaimAuto() throws Throwable {

		String insuredName = driver
				.findElement(By.xpath("//div[contains(@id,'Insured')]//div[@class='gw-label gw-infoValue']")).getText();

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("QuickClaimAuto",
				strTestCaseName);
		GuidewireAutomate_Validation("Screen Header", QuickClaimAuto_Header, "equals", "Step 2 of 2: Quick Claim Auto");
		GuidewireAutomate("ReportedBy_Name", QCA_ReportedBy_Name, "selectByVisibleText", insuredName);
		GuidewireAutomate("LossCause", QCA_LossDetails_LossCause, "selectByVisibleText",
				lhm_TestCase_Table_Data.get("LossCause"));
		GuidewireAutomate("State", QCA_LossDetails_State, "selectByVisibleText", lhm_TestCase_Table_Data.get("State"));
		GuidewireAutomate("Location", QCA_Location, "selectByVisibleText", lhm_TestCase_Table_Data.get("Location"));

	}

}
