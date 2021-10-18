package com.pages.Guidewire.ClaimsCenter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;

public class CC_Litigation extends SeleniumWebDriver_Commands {

	public CC_Litigation(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
		
	}
	private static By Screen_Header = By.xpath("//div[@class='gw-TitleBar--title']");
	private static By NewMatterButton = By.xpath("//div[contains(@id,'NewMatterButton')]//div[@role='button']");
	
	private static By MatterType = By.xpath("//select[@name='NewMatter-NewMatterScreen-NewMatterDV-MatterType']");
	private static By Name = By.xpath("//input[@name='NewMatter-NewMatterScreen-NewMatterDV-Matter_Name']");
	private static By CaseNumber = By.xpath("//input[@name='NewMatter-NewMatterScreen-NewMatterDV-Matter_CaseNumber']");
	private static By PlaintiffMenuIcon = By.xpath("//div[contains(@id,'PlaintiffMenuIcon')]/div[@class='gw-action--expand-button']/div[@class='gw-icon gw-icon--expand']");
	private static By PlaintiffNewPerson = By.xpath("//div[contains(@id,'Plaintiff-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewPerson')]//div[text()='New Person']");
	private static By PlaintiffNewVendor = By.xpath("//div[contains(@id,'Plaintiff-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor')]//div[text()='New Vendor']");
	private static By PlaintiffNewCompany = By.xpath("//div[contains(@id,'Plaintiff-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewCompany')]//div[text()='New Company']");
	private static By PlaintiffNewLegal = By.xpath("//div[contains(@id,'Plaintiff-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal')]//div[text()='New Legal']");		
	private static By PlaintiffSearch = By.xpath("//div[contains(@id,'Plaintiff-MenuItem_Search')]//div[@role='menuitem']");
	private static By Plaintiff = By.xpath("//select[@name='NewMatter-NewMatterScreen-NewMatterDV-Plaintiff']");
	
	private static By DefendantMenuIcon = By.xpath("//div[contains(@id,'DefendantMenuIcon')]/div[@class='gw-action--expand-button']/div[@class='gw-icon gw-icon--expand']");
	private static By DefendantNewPerson = By.xpath("//div[contains(@id,'Defendant-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewPerson')]//div[text()='New Person']");
	private static By DefendantNewVendor = By.xpath("//div[contains(@id,'Defendant-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor')]//div[text()='New Vendor']");
	private static By DefendantNewCompany = By.xpath("//div[contains(@id,'Defendant-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewCompany')]//div[text()='New Company']");
	private static By DefendantNewLegal = By.xpath("//div[contains(@id,'Defendant-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal')]//div[text()='New Legal']");
	private static By DefendantSearch = By.xpath("//div[contains(@id,'Defendant-MenuItem_Search')]//div[@role='menuitem']");
	private static By Defendant = By.xpath("//select[@name='NewMatter-NewMatterScreen-NewMatterDV-Defendant']");
	
	
	private static By RelatedToSubrogationYes = By.xpath("//input[contains(@id,'TrialDetails_SubroRelated_0')]");
	private static By RelatedToSubrogationNo = By.xpath("//input[contains(@id,'TrialDetails_SubroRelated_1')]");
	private static By CourtType = By.xpath("//select[@name='NewMatter-NewMatterScreen-NewMatterDV-CourtType']");
	private static By CourtDistrict = By.xpath("//select[@name='NewMatter-NewMatterScreen-NewMatterDV-CourtDistrict']");
	private static By LegalSpecialty = By.xpath("//select[@name='NewMatter-NewMatterScreen-NewMatterDV-LegalSpecialty']");
	private static By PrimaryCause = By.xpath("//select[@name='NewMatter-NewMatterScreen-NewMatterDV-TrialDetails_PrimaryCause']");
	
	private static By PlaintiffAttorney = By.xpath("//select[@name='NewMatter-NewMatterScreen-NewMatterDV-Counsel_PlaintiffAttorney']");
	private static By PlaintiffLawFirm = By.xpath("//select[@name='NewMatter-NewMatterScreen-NewMatterDV-Counsel_PlaintiffLawFirm']");
	private static By DefenseAttorney = By.xpath("//select[@name='NewMatter-NewMatterScreen-NewMatterDV-Counsel_DefenseAttorney']");
	private static By DefenseLawFirm = By.xpath("//select[@name='NewMatter-NewMatterScreen-NewMatterDV-Counsel_DefenseLawFirm']");
	
	private static By Owner = By.xpath("//select[@name='NewMatter-NewMatterScreen-NewMatterDV-Matter_AssignActivity']");
	private static By UpdateButton = By.xpath("//div[@id='NewMatter-NewMatterScreen-Update']//div[@role='button']");
	
	
	
	
	public static void Litigation_Matter() throws Throwable {
		
		try {
			
			GuidewireAutomate_Validation("Header", Screen_Header, "equals","Matters");
			GuidewireAutomate("New Matter Button", NewMatterButton, "clickAndwait", "clickAndwait");
			
				
		} catch (Exception e) {
			e.printStackTrace();
			throw e;

		}

	}
public static void Litigation_NewMatter() throws Throwable {
		
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("Litigation", strTestCaseName);
		
		try {
			
			GuidewireAutomate_Validation("Header", Screen_Header, "equals","New Matter");
		
			GuidewireAutomate_Validation("Matter Type", MatterType, "getOptionscontains",lhm_TestCase_Table_Data.get("MatterTypeDropDown"));
			GuidewireAutomate("Matter Type Select", MatterType, "selectByVisibleText", lhm_TestCase_Table_Data.get("MatterTypeSelect"));
			GuidewireAutomate("Name", Name, "clearANDsendKeys", lhm_TestCase_Table_Data.get("Name"));
			GuidewireAutomate("Case Number", CaseNumber, "clearANDsendKeys", lhm_TestCase_Table_Data.get("CaseNumber"));
			GuidewireAutomate("Plaintiff Menu Icon", PlaintiffMenuIcon, "clickAndwait", "clickAndwait");
			GuidewireAutomate_Validation("Plaintiff New Person", PlaintiffNewPerson, "equals","New Person");
			GuidewireAutomate_Validation("Plaintiff New Vendor", PlaintiffNewVendor, "equals","New Vendor");
			GuidewireAutomate_Validation("Plaintiff New Company", PlaintiffNewCompany, "equals","New Company");
			GuidewireAutomate_Validation("Plaintiff New Legal", PlaintiffNewLegal, "equals","New Legal");
			GuidewireAutomate_Validation("Plaintiff Search", PlaintiffSearch, "equals","Search");
			GuidewireAutomate("Plaintiff Select", Plaintiff, "selectByVisibleText", lhm_TestCase_Table_Data.get("Plaintiff"));
			GuidewireAutomate("Plaintiff Select", Defendant, "selectByVisibleText", lhm_TestCase_Table_Data.get("Defendant"));
			GuidewireAutomate("Related To Subrogation No", RelatedToSubrogationNo, "clickAndwait", "clickAndwait");
			
			GuidewireAutomate("Court Type", CourtType, "selectByVisibleText", lhm_TestCase_Table_Data.get("CourtType"));
			GuidewireAutomate("Court District", CourtDistrict, "selectByVisibleText", lhm_TestCase_Table_Data.get("CourtDistrict"));
			GuidewireAutomate("Legal Specialty", LegalSpecialty, "selectByVisibleText", lhm_TestCase_Table_Data.get("LegalSpecialty"));
			GuidewireAutomate("Primary Cause", PrimaryCause, "selectByVisibleText", lhm_TestCase_Table_Data.get("PrimaryCause"));
			
			GuidewireAutomate("Owner", Owner, "selectByVisibleText", lhm_TestCase_Table_Data.get("Owner"));
			
			GuidewireAutomate("Update Button", UpdateButton, "clickAndwait", "clickAndwait");
			
				
		} catch (Exception e) {
			e.printStackTrace();
			throw e;

		}

	}
	
	
}
