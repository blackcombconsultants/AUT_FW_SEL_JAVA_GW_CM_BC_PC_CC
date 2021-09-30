package com.pages.Guidewire.InlineMarine;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Resuables_PO;

public class IM_Quote extends SeleniumWebDriver_Commands {

	public IM_Quote(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
		// TODO Auto-generated constructor stub
	}

	public static By QU_PrimaryNamedInsured = By
			.xpath("//div[contains(@id,'Quote_SummaryDV-Insured')]//div[@class='gw-value-readonly-wrapper']");
	public static By QU_Address = By.xpath(
			"//div[contains(@id,'GlobalAddressInputSet-AddressSummary')]//div[@class='gw-value-readonly-wrapper']");
	public static By QU_County = By
			.xpath("//div[contains(@id,'GlobalAddressInputSet-County')]//div[@class='gw-value-readonly-wrapper']");
	public static By QU_AddressType = By.xpath(
			"//div[contains(@id,'PolicyAddressDisplayInputSet-AddressType') and contains(@class,'gw-ValueWidget')]//div[@class='gw-label']");
	public static By QU_AddressDescription = By.xpath(
			"//div[contains(@id,'AddressDescription') and contains(@class,'gw-ValueWidget')]//div[@class='gw-value-readonly-wrapper']");

	public static void QuoteDetails() throws Throwable {
		try {
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("quote", strTestCaseName);

			GuidewireAutomate_Validation("Screen Header", PolicyCenter_Resuables_PO.Quote_Header, "equals", "Quote");
			GuidewireAutomate_Validation("Primary Named Insured", QU_PrimaryNamedInsured, "equals", strAccountName);
		//	GuidewireAutomate_Validation("Address", QU_Address, "contains", lhm_TestCase_Table_Data.get("QU_Address"));
			GuidewireAutomate_Validation("County", QU_County, "equals", lhm_TestCase_Table_Data.get("QU_County"));
			GuidewireAutomate_Validation("Address Type", QU_AddressType, "equals",
					lhm_TestCase_Table_Data.get("QU_AddressType"));
			
		} catch (Exception e) {

		}
	}

	

}
