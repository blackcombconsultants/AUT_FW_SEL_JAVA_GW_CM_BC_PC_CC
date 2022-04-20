package com.pages.Guidewire.ClaimsCenter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class CC_Services extends SeleniumWebDriver_Commands {
	public CC_Services(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	private static By MenuCC_Claim_Services = By.xpath("//div[contains(@id,'Claim_ClaimServiceRequests')]//div[@class='gw-label gw-hasIcon' and text()='Services']");
	private static By Menu_ActionsCC        = By.xpath("//div[contains(@id,'ClaimMenuActions')]/div[@role='button']");
	private static By Menu_ActionsServices  = By.xpath("//div[contains(@id,'ClaimMenuActions_NewServiceRequest')]//div[@role='menuitem']");

	// Summary
	private static By Status_Header        = By.xpath("//div[@class='gw-TitleBar--title' and text()='Status']");
	private static By MigratedClaimField   = By.xpath("//div[@id='ClaimStatus-migratedclaim_ext_Input']/div[@class='gw-label' and text()='Migrated Claim']");
	private static By MigratedClaimNonEdit = By.xpath("//div[@id='ClaimStatus-migratedclaim_ext']");
	private static By ClaimStatusEdit      = By.xpath("//div[@id='ClaimStatus-Edit']//div[@role='button']");

	public static void Validate_ServicesVisible() throws Throwable {
		try {
			GuidewireAutomate_Validation("Services", MenuCC_Claim_Services, "equals", "Services");
			GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
			GuidewireAutomate_Validation("Service", Menu_ActionsServices, "equals", "Service");

			oExtentTest.log(Status.INFO, "Services is Diplayed");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	public static void Validate_ServicesNotVisible() throws Throwable {
		try {
			By MenuCC_Claim_Services = By.xpath("//div[contains(@id,'Claim_ClaimServiceRequests')]//div[@class='gw-label gw-hasIcon' and text()='Services']");
			By Menu_ActionsServices  = By.xpath("//div[contains(@id,'ClaimMenuActions_NewServiceRequest')]//div[@role='menuitem']");

			VerifyElementNotExist("Services", MenuCC_Claim_Services);
			GuidewireAutomate("Actions", Menu_ActionsCC, "clickAndwait", "click");
			VerifyElementNotExist("Service", Menu_ActionsServices);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void Validate_Services_MigratedClaimField() throws Throwable {
		try {
			GuidewireAutomate_Validation("Screen Header", Status_Header, "equals", "Status");

			GuidewireAutomate_Validation("Migrated Claim Field", MigratedClaimField, "equals", "Migrated Claim");

			oExtentTest.log(Status.INFO, "Migrated Claim Field is Displayed");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void Verify_CurrencyFieldIsNotEditable() throws Throwable {

		GuidewireAutomate("Claim Status Edit", ClaimStatusEdit, "clickAndwait", "click");

		WebElement MigratedClaimEnabled = getElement(MigratedClaimNonEdit);
		try {
			if (MigratedClaimEnabled.isEnabled()) {
				oExtentTest.log(Status.PASS, "Migrated Claim is not Editable");

			} else {
				oExtentTest.log(Status.FAIL, "MigratedClaim Field is Editable");

			}

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

}
