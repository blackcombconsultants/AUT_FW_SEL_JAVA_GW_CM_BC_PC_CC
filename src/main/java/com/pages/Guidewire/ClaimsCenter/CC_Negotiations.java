package com.pages.Guidewire.ClaimsCenter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;

public class CC_Negotiations extends SeleniumWebDriver_Commands {

	public CC_Negotiations(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
		
	}

	private static By Screen_Header = By.xpath("//div[contains(@id,'ttlBar')]//div[@role='heading']");
	private static By NewNegotiationButton = By.xpath("//div[@id='ClaimNegotiations-ClaimNegotiationsScreen-CN_Add']//div[@role='button']");
	
	private static By NN_Name = By.xpath("//input[contains(@name,'NewNegotiationDV-General_Name')]");
	private static By NN_OverallLiabilityAssessment = By.xpath("//input[contains(@name,'General_OverallLiabilityAssessment')]");
	private static By NN_MaximumOffer = By.xpath("//input[contains(@name,'General_MaxOffer')]");
	private static By NN_TargetOffer = By.xpath("//input[contains(@name,'General_TargetOffer')]");
	private static By NN_RationaleForTargetOffer = By.xpath("//textarea[contains(@name,'General_TargetOfferRationale')]");
	private static By NN_RelatedTo = By.xpath("//select[contains(@name,'Note_RelatedTo')]");
	private static By NN_NegotiationContact = By.xpath("//select[contains(@name,'General_NegContact')]");
	private static By NN_DefenseArgument = By.xpath("//textarea[contains(@name,'General_DefenseArgument')]");
	private static By NN_PlaintiffArgument = By.xpath("//textarea[contains(@name,'General_PlaintiffArgument')]");
	private static By NN_SettlementPlan = By.xpath("//textarea[contains(@name,'General_SettlementPlan')]");
	private static By NN_AlternativeSettlementPlan = By.xpath("//textarea[contains(@name,'General_AlternativeToSettlement')]");
	
	//Negotiation Lines
	private static By NN_AddButton = By.xpath("//div[contains(@id,'EditableNegotiationLinesLV_tb-Add')]//div[@role='button']");
	private static By NN_Date = By.xpath("//input[contains(@class,'gw-min-visible gw-DateValueWidget--dateInput')]");
	private static By NN_Type = By.xpath("//select[contains(@name,'EditableNegotiationLinesLV-0-Type')]");
	private static By NN_Amount = By.xpath("//input[contains(@name,'EditableNegotiationLinesLV-0-Amount')]");
	private static By NN_Notes = By.xpath("//input[contains(@name,'EditableNegotiationLinesLV-0-Notes')]");
	
	private static By UpdateButton = By.xpath("//div[@id='NewNegotiation-NewNegotiationScreen-Update']//div[@role='button']");
	
	
	private static By NegotiationTab = By.xpath("//div[contains(@id,'DetailViewTitleCardTab')]//div[@role='tab']");
	private static By Name = By.xpath("//div[contains(@id,'ClaimNegotiationDetailsDV-General_Name')]//div[@class='gw-value-readonly-wrapper']");
	private static By OverallLiabilityAssessment = By.xpath("//div[contains(@id,'General_OverallLiabilityAssessment')]//div[@class='gw-vw--value gw-align-h--left']");
	private static By MaximumOffer = By.xpath("//div[contains(@id,'General_MaxOffer')]//div[@class='gw-vw--value gw-align-h--left']");
	private static By TargetOffer = By.xpath("//div[contains(@id,'General_TargetOffer_Input')]//div[@class='gw-vw--value gw-align-h--left']");
	private static By RationaleForTargetOffer = By.xpath("//div[contains(@id,'General_TargetOfferRationale')]//div[@class='gw-value-readonly-wrapper']");
	private static By RelatedTo = By.xpath("//div[contains(@id,'DetailsDV-Note_RelatedTo')]//div[@class='gw-RangeValue']");
	private static By NegotiationContact = By.xpath("//div[contains(@id,'DetailsDV-General_NegContact')]//div[@class='gw-RangeValue']");
	private static By DefenseArgument = By.xpath("//div[contains(@id,'DetailsDV-General_DefenseArgument')]//div[@class='gw-value-readonly-wrapper']");
	private static By PlaintiffArgument = By.xpath("//div[contains(@id,'DetailsDV-General_PlaintiffArgument')]//div[@class='gw-value-readonly-wrapper']");
	private static By SettlementPlan = By.xpath("//div[contains(@id,'DetailsDV-General_SettlementPlan')]//div[@class='gw-value-readonly-wrapper']");
	private static By AlternativeSettlementPlan = By.xpath("//div[contains(@id,'DetailsDV-General_AlternativeToSettlement')]//div[@class='gw-value-readonly-wrapper']");
	
	//Negotiation Lines
	private static By NL_Date = By.xpath("//div[contains(@id,'0-NegotiationDate')]//div[@class='gw-value-readonly-wrapper']");
	private static By NL_Type = By.xpath("//div[contains(@id,'0-Type')]//div[@class='gw-label']");
	private static By NL_Amount = By.xpath("//div[contains(@id,'0-Amount')]//div[@class='gw-vw--value gw-align-h--right']");
	private static By NL_Notes = By.xpath("//div[contains(@id,'0-Notes')]//div[@class='gw-value-readonly-wrapper']");
	
	private static By NegotiationCheckBox = By.xpath("//div[contains(@id,'EditableNegotiationsLV-0-_Checkbox')]//input[@type='checkbox']");
	private static By DeleteButton = By.xpath("//div[@id='ClaimNegotiations-ClaimNegotiationsScreen-Remove']//div[@role='button']");
	
	
	public static void Negotiation() throws Throwable {
		
		try {
		
			GuidewireAutomate_Validation("Screen Header", Screen_Header, "equals","Negotiations");
			GuidewireAutomate("NewNegotiation Button", NewNegotiationButton, "clickAndwait", "clickAndwait");
			Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
			throw e;

		}

	}
	
	
	public static void NewNegotiation() throws Throwable {
		
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("NewNegotiation", strTestCaseName);
		
		try {
		
			GuidewireAutomate_Validation("Screen Header", Screen_Header, "equals","New Negotiation");
			
			
			GuidewireAutomate("Name", NN_Name, "clearANDsendKeys", lhm_TestCase_Table_Data.get("Name"));
			GuidewireAutomate("Overall Liability Assessment", NN_OverallLiabilityAssessment, "clearANDsendKeys", lhm_TestCase_Table_Data.get("OverallLiabilityAssessment"));
			GuidewireAutomate("Maximum Offer", NN_MaximumOffer, "clearANDsendKeys", lhm_TestCase_Table_Data.get("MaximumOffer"));
			GuidewireAutomate("Target Offer", NN_TargetOffer, "clearANDsendKeys", lhm_TestCase_Table_Data.get("TargetOffer"));
			GuidewireAutomate("Rationale For Target Offer", NN_RationaleForTargetOffer, "clearANDsendKeys", lhm_TestCase_Table_Data.get("RationaleForTargetOffer"));
			GuidewireAutomate("Related To", NN_RelatedTo, "selectByVisibleText", lhm_TestCase_Table_Data.get("RelatedTo"));
			GuidewireAutomate("Negotiation Contact", NN_NegotiationContact, "selectByVisibleText", lhm_TestCase_Table_Data.get("NegotiationContact"));
			GuidewireAutomate("Defense Argument", NN_DefenseArgument, "clearANDsendKeys", lhm_TestCase_Table_Data.get("DefenseArgument"));
			GuidewireAutomate("Plaintiff Argument", NN_PlaintiffArgument, "clearANDsendKeys", lhm_TestCase_Table_Data.get("PlaintiffArgument"));
			GuidewireAutomate("Settlement Plan", NN_SettlementPlan, "clearANDsendKeys", lhm_TestCase_Table_Data.get("SettlementPlan"));
			GuidewireAutomate("Alternative Settlement Plan", NN_AlternativeSettlementPlan, "clearANDsendKeys", lhm_TestCase_Table_Data.get("AlternativeSettlementPlan"));
			
			GuidewireAutomate("Add Button", NN_AddButton, "clickAndwait", "clickAndwait");
			Thread.sleep(2000);
			GuidewireAutomate("Date", NN_Date, "clearANDsendKeys", lhm_TestCase_Table_Data.get("Date"));
			GuidewireAutomate("Type", NN_Type, "selectByVisibleText", lhm_TestCase_Table_Data.get("Type"));
			GuidewireAutomate("Amount", NN_Amount, "clearANDsendKeys", lhm_TestCase_Table_Data.get("Amount"));
			GuidewireAutomate("Notes", NN_Notes, "clearANDsendKeys", lhm_TestCase_Table_Data.get("Notes"));
			
			GuidewireAutomate("Update Button", UpdateButton, "clickAndwait", "clickAndwait");
			Thread.sleep(2000);
			
				
		} catch (Exception e) {
			e.printStackTrace();
			throw e;

		}

	}
public static void ValidateNegotiation() throws Throwable {
		
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("NewNegotiation", strTestCaseName);
		
		try {
		
			GuidewireAutomate_Validation("Screen Header", Screen_Header, "equals","Negotiations");
			GuidewireAutomate_Validation("Negotiation Tab", NegotiationTab, "equals",lhm_TestCase_Table_Data.get("NegotiationTab"));
			GuidewireAutomate_Validation("Name", Name, "equals",lhm_TestCase_Table_Data.get("Name"));
			GuidewireAutomate_Validation("Name", OverallLiabilityAssessment, "contains",lhm_TestCase_Table_Data.get("OverallLiabilityAssessment"));
			GuidewireAutomate_Validation("Maximum Offer", MaximumOffer, "contains",lhm_TestCase_Table_Data.get("MaximumOffer"));
			GuidewireAutomate_Validation("Target Offer", TargetOffer, "contains",lhm_TestCase_Table_Data.get("TargetOffer"));
			GuidewireAutomate_Validation("Rationale For Target Offer", RationaleForTargetOffer, "equals",lhm_TestCase_Table_Data.get("RationaleForTargetOffer"));
			GuidewireAutomate_Validation("Related To", RelatedTo, "equals",lhm_TestCase_Table_Data.get("RelatedTo"));
			GuidewireAutomate_Validation("Negotiation Contact", NegotiationContact, "equals",lhm_TestCase_Table_Data.get("NegotiationContact"));
			GuidewireAutomate_Validation("Defense Argument", DefenseArgument, "equals",lhm_TestCase_Table_Data.get("DefenseArgument"));
			GuidewireAutomate_Validation("Plaintiff Argument", PlaintiffArgument, "equals",lhm_TestCase_Table_Data.get("PlaintiffArgument"));
			GuidewireAutomate_Validation("Settlement Plan", SettlementPlan, "equals",lhm_TestCase_Table_Data.get("SettlementPlan"));
			GuidewireAutomate_Validation("Alternative Settlement Plan", AlternativeSettlementPlan, "equals",lhm_TestCase_Table_Data.get("AlternativeSettlementPlan"));
			
			GuidewireAutomate_Validation("Date", NL_Date, "contains",lhm_TestCase_Table_Data.get("Date"));
			GuidewireAutomate_Validation("Type", NL_Type, "equals",lhm_TestCase_Table_Data.get("Type"));
			GuidewireAutomate_Validation("Amount", NL_Amount, "contains",lhm_TestCase_Table_Data.get("Amount"));
			GuidewireAutomate_Validation("Notes", NL_Notes, "equals",lhm_TestCase_Table_Data.get("Notes"));
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
			throw e;

		}

	}
public static void DeleteNegotiation() throws Throwable {
	
	try {
	
		GuidewireAutomate("Negotiation Check Box", NegotiationCheckBox, "clickAndwait", "clickAndwait");
		GuidewireAutomate("Delete Button", DeleteButton, "clickAndwait", "clickAndwait");
		
	} catch (Exception e) {
		e.printStackTrace();
		throw e;

	}

}
	
	
	
}
