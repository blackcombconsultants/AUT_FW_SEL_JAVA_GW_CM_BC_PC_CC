package com.pages.Guidewire.ClaimsCenter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;

public class CC_Notes extends SeleniumWebDriver_Commands{

	public CC_Notes(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	
	}
private static By NotesHeader = By.xpath("//div[@id='ClaimNotes-NotesSearchScreen-ttlBar']//div[@role='heading']");
private static By NoteHeader = By.xpath("//div[@id='wsTabBar']//div[@role='menuitem']");
private static By FindNoteTemplateHeader = By.xpath("//div[contains(@id,'PickNoteTemplateScreen-ttlBar')]//div[@role='heading']");


//Buttons
private static By NewNoteButton = By.xpath("//div[@id='ClaimNotes-NotesSearchScreen-NotesSearchScreen_NewNote']//div[@role='button']");
private static By UpdateButton = By.xpath("//div[@id='NewNoteWorksheet-NewNoteScreen-Update']//div[@role='button']");
private static By CancelButton = By.xpath("//div[@id='NewNoteWorksheet-NewNoteScreen-Cancel']//div[@role='button']");
private static By UseTemplateButton =  By.xpath("//div[@id='NewNoteWorksheet-NewNoteScreen-NewNoteWorksheet_UseTemplateButton']//div[@role='button']");

//New Note Section
private static By NewNoteTopic = By.xpath("//select[@name='NewNoteWorksheet-NewNoteScreen-NoteDetailDV-Topic']");
private static By NewNoteSecurityType = By.xpath("//select[@name='NewNoteWorksheet-NewNoteScreen-NoteDetailDV-SecurityType']");
private static By NewNoteSubject = By.xpath("//input[@name='NewNoteWorksheet-NewNoteScreen-NoteDetailDV-Subject']");
private static By NewNoteRelatedTo = By.xpath("//select[@name='NewNoteWorksheet-NewNoteScreen-NoteDetailDV-RelatedTo']");
private static By NewNoteConfidentialYes = By.xpath("//input[@id='NewNoteWorksheet-NewNoteScreen-NoteDetailDV-Confidential_0']");
private static By NewNoteConfidentialNo = By.xpath("//input[@id='NewNoteWorksheet-NewNoteScreen-NoteDetailDV-Confidential_1']");
private static By NewNoteText = By.xpath("//textarea[@name='NewNoteWorksheet-NewNoteScreen-NoteDetailDV-Body']");


//Note Template Section
private static By FindNoteTemplateTopic = By.xpath("//select[contains(@name,'NoteTemplateSearchDV-Topic')]");
private static By FindNoteTemplateType = By.xpath("//select[contains(@name,'NoteTemplateSearchDV-Type')]");
private static By FindNoteTemplateLineOfBusiness = By.xpath("//select[contains(@name,'NoteTemplateSearchDV-LossType')]");
private static By FindNoteTemplateSearchButton = By.xpath("//div[contains(@id,'NoteTemplateSearchDV-SearchAndResetInputSet-SearchLinksInputSet-Search') and @role='button']");
private static By FindNoteTemplateSelectButton = By.xpath("//div[contains(@id,'NoteTemplateSearchResultLV-0-_Select')]//div[@role='button']");


//Edit Notes
private static By EditButton = By.xpath("//div[contains(@id,'ClaimNotesLV-0-EditLink') and @role='button']");
private static By EditNoteHeader = By.xpath("//div[contains(@id,'EditNote-EditNoteScreen')]//div[@role='heading']");
private static By EditNoteTopic = By.xpath("//select[@name='EditNote-EditNoteScreen-NoteDetailDV-Topic']");
private static By EditNoteSecurityType = By.xpath("//select[@name='EditNote-EditNoteScreen-NoteDetailDV-SecurityType']");
private static By EditNoteRelatedTo = By.xpath("//select[@name='EditNote-EditNoteScreen-NoteDetailDV-RelatedTo']");
private static By EditNoteConfidentialYes = By.xpath("//input[@id='EditNote-EditNoteScreen-NoteDetailDV-Confidential_0']");
private static By EditNoteConfidentialNo = By.xpath("//input[@id='EditNote-EditNoteScreen-NoteDetailDV-Confidential_1']");
private static By EditNoteText = By.xpath("//textarea[@name='EditNote-EditNoteScreen-NoteDetailDV-Body']");
private static By EditNoteUpdateButton = By.xpath("//div[@id='EditNote-EditNoteScreen-Update']//div[@role='button']");



public static void CreateANewNote() throws Throwable{
	try {
	
	lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("CC_Notes",
			strTestCaseName);
	
	GuidewireAutomate_Validation("Notes Header", NotesHeader, "equals", "Notes");
	GuidewireAutomate("New Note Button", NewNoteButton, "clickAndwait", "clickAndwait");
	
	GuidewireAutomate_Validation("Note Header", NoteHeader, "equals", "Note");
	GuidewireAutomate_Validation("Verify Topic", NewNoteTopic, "getOptionscontains",lhm_TestCase_Table_Data.get("TopicDropDown"));
	GuidewireAutomate("Topic", NewNoteTopic, "selectByVisibleText", lhm_TestCase_Table_Data.get("TopicSelect"));
	
	GuidewireAutomate_Validation("Verify Security Type", NewNoteSecurityType, "getOptionscontains",lhm_TestCase_Table_Data.get("SecurityType"));
	GuidewireAutomate("Security Type", NewNoteSecurityType, "selectByVisibleText", lhm_TestCase_Table_Data.get("SecurityTypeSelect"));
	
	GuidewireAutomate("Related To", NewNoteRelatedTo, "selectByVisibleText", lhm_TestCase_Table_Data.get("RelatedToSelect"));
	
	GuidewireAutomate("Confidential", NewNoteConfidentialNo, "clickAndwait", "clickAndwait");
	
	GuidewireAutomate("Text", NewNoteText, "clearANDsendKeys", "Notes Test Comment");
	
	GuidewireAutomate("Update Button", UpdateButton, "clickAndwait", "clickAndwait");
	
	}catch (Exception e) {
		e.printStackTrace();
		throw e;
	
	
	}
}
	public static void CreateANewNoteFromTemplate() throws Throwable{
		try {
		
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("CC_Notes",
				strTestCaseName);
		
		GuidewireAutomate_Validation("Notes Header", NotesHeader, "equals", "Notes");
		GuidewireAutomate("New Note Button", NewNoteButton, "clickAndwait", "clickAndwait");
		
		GuidewireAutomate_Validation("Note Header", NoteHeader, "equals", "Note");
		
		GuidewireAutomate("Use Template Button", UseTemplateButton, "clickAndwait", "clickAndwait");
		GuidewireAutomate_Validation("Find Note Templates Header", FindNoteTemplateHeader, "equals", "Find Note Template");
		
		GuidewireAutomate_Validation("Verify Topic", FindNoteTemplateTopic, "getOptionscontains",lhm_TestCase_Table_Data.get("TopicDropDown"));
		GuidewireAutomate("Topic", FindNoteTemplateTopic, "selectByVisibleText", lhm_TestCase_Table_Data.get("TopicSelect"));
		
		GuidewireAutomate_Validation("Verify Type", FindNoteTemplateType, "getOptionscontains",lhm_TestCase_Table_Data.get("FindNoteTemplateType"));
		GuidewireAutomate("Type", FindNoteTemplateType, "selectByVisibleText", lhm_TestCase_Table_Data.get("FindNoteTemplateTypeSelect"));
		
		GuidewireAutomate_Validation("Verify Line of Business", FindNoteTemplateLineOfBusiness, "getOptionscontains",lhm_TestCase_Table_Data.get("FindNoteTemplateLOB"));
		GuidewireAutomate("Line of Business", FindNoteTemplateLineOfBusiness, "selectByVisibleText", lhm_TestCase_Table_Data.get("FindNoteTemplateLOBSelect"));
		
		GuidewireAutomate("Search Button", FindNoteTemplateSearchButton, "clickAndwait", "clickAndwait");
		
		GuidewireAutomate("Select Button", FindNoteTemplateSelectButton, "clickAndwait", "clickAndwait");
		
		GuidewireAutomate_Validation("Notes Header", NotesHeader, "equals", "Notes");
		
		GuidewireAutomate("Update Button", UpdateButton, "clickAndwait", "clickAndwait");
		
		}catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	
	}

	public static void CreateANewNoteAndCancel() throws Throwable{
		try {
		
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("CC_Notes",
				strTestCaseName);
		
		GuidewireAutomate_Validation("Notes Header", NotesHeader, "equals", "Notes");
		GuidewireAutomate("New Note Button", NewNoteButton, "clickAndwait", "clickAndwait");
		
		GuidewireAutomate_Validation("Note Header", NoteHeader, "equals", "Note");
		GuidewireAutomate_Validation("Verify Topic", NewNoteTopic, "getOptionscontains",lhm_TestCase_Table_Data.get("TopicDropDown"));
		GuidewireAutomate("Topic", NewNoteTopic, "selectByVisibleText", lhm_TestCase_Table_Data.get("TopicSelect"));
		
		GuidewireAutomate_Validation("Verify Security Type", NewNoteSecurityType, "getOptionscontains",lhm_TestCase_Table_Data.get("SecurityType"));
		GuidewireAutomate("Security Type", NewNoteSecurityType, "selectByVisibleText", lhm_TestCase_Table_Data.get("SecurityTypeSelect"));
		
		GuidewireAutomate("Related To", NewNoteRelatedTo, "selectByVisibleText", lhm_TestCase_Table_Data.get("RelatedToSelect"));
		
		GuidewireAutomate("Confidential", NewNoteConfidentialNo, "clickAndwait", "clickAndwait");
		
		GuidewireAutomate("Text", NewNoteText, "clearANDsendKeys", "Notes Test Comment");
		
		GuidewireAutomate("Cancel Button", CancelButton, "clickAndwait", "clickAndwait");
		
		}catch (Exception e) {
			e.printStackTrace();
			throw e;
		
		
		}
	}	

	public static void EditAnExistingNote() throws Throwable{
		try {
		
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("CC_Notes",
				strTestCaseName);
		
		GuidewireAutomate_Validation("Notes Header", NotesHeader, "equals", "Notes");
		
		GuidewireAutomate("Edit Button", EditButton, "clickAndwait", "clickAndwait");
		GuidewireAutomate_Validation("Edit Note Header", EditNoteHeader, "equals", "Edit Note");
		
		
		GuidewireAutomate_Validation("Verify Topic", EditNoteTopic, "getOptionscontains",lhm_TestCase_Table_Data.get("TopicDropDown"));
		GuidewireAutomate("Topic", EditNoteTopic, "selectByVisibleText", lhm_TestCase_Table_Data.get("TopicSelect"));
		
		GuidewireAutomate_Validation("Verify Security Type", EditNoteSecurityType, "getOptionscontains",lhm_TestCase_Table_Data.get("SecurityType"));
		GuidewireAutomate("Security Type", EditNoteSecurityType, "selectByVisibleText", lhm_TestCase_Table_Data.get("SecurityTypeSelect"));
		
		GuidewireAutomate("Related To", EditNoteRelatedTo, "selectByVisibleText", lhm_TestCase_Table_Data.get("RelatedToSelect"));
		
		GuidewireAutomate("Confidential", EditNoteConfidentialNo, "clickAndwait", "clickAndwait");
		
		GuidewireAutomate("Text", EditNoteText, "clearANDsendKeys", "Multiple line Items");
		
		GuidewireAutomate("Update Button", EditNoteUpdateButton, "clickAndwait", "clickAndwait");
		
		}catch (Exception e) {
			e.printStackTrace();
			throw e;
		
		
		}
	}
	
}
