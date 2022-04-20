package com.pages.Guidewire.ClaimsCenter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.aventstack.extentreports.ExtentTest;

public class CC_Email extends SeleniumWebDriver_Commands {

	public CC_Email(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);

	}

	private static By Email_Header   = By.xpath("//div[contains(@id,'wsTabBar-wsTab_0')]//div[contains(@class,'gw-action--inner gw-hasDivider')]");
	private static By Email_Address  = By.xpath("//div[contains(@class,'gw-vw--value')]//input[contains(@name,'ToEmail')]");
	private static By Subject        = By.xpath("//input[contains(@name,'EmailWorksheet-CreateEmailScreen-TextInput0')]");
	private static By Body           = By.xpath("//div[contains(@class,'gw-value')]//textarea[contains(@style,'height:13.1em')]");
	private static By SaveAsDocument = By.xpath("//div[contains(@id,'SaveAsDocument_Input')]//input[contains(@type,'checkbox')]");
	private static By SendEmail      = By.xpath("//div[contains(@id,'ToolbarButton0')]//div[contains(@role,'button')]");

	public static void Emails() throws Throwable {

		// lhm_TestCase_Table_Data = ClaimCenter_Resuables.getData_ClaimsCenter("Emails");

		try {
			GuidewireAutomate_Validation("Email Header", Email_Header, "equals", "Email");
			GuidewireAutomate("Email_Address", Email_Address, "sendKeys", "pankaj.misra@vantagerisk.com");
			GuidewireAutomate("Subject", Subject, "sendKeys", "Test");
			GuidewireAutomate("Body", Body, "sendKeys", "Test");
			GuidewireAutomate("Save As Document", SaveAsDocument, "click", "Save As Document");
			GuidewireAutomate("Send Email", SendEmail, "clickAndwait", "clickAndwait");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;

		}

	}

}
