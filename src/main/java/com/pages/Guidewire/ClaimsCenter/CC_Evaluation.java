package com.pages.Guidewire.ClaimsCenter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.aventstack.extentreports.ExtentTest;

public class CC_Evaluation extends SeleniumWebDriver_Commands {

	public CC_Evaluation(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);

	}

	private static By Screen_Header                = By.xpath("//div[contains(@id,'ttlBar')]//div[@role='heading']");
	private static By NewEvaluationButton          = By.xpath("//div[contains(@id,'ClaimEvaluationsScreen-CE_Add')]//div[@role='button']");
	private static By LiabilityDistributionSection = By.xpath("//div[contains(@id,'NewEvaluationDV')]//div[text()='Liability Distribution']");

	// New Evaluation Liability Distribution
	private static By NE_LD_Name              = By.xpath("//input[contains(@name,'SettlementCostEstimate_Name')]");
	private static By NE_LD_RelatedTo         = By.xpath("//select[contains(@name,'Note_RelatedTo')]");
	private static By NE_LD_InsuredLiability  = By.xpath("//input[contains(@name,'InsuredLiability')]");
	private static By NE_LD_ClaimantLiability = By.xpath("//input[contains(@name,'ClaimantLiability')]");
	private static By NE_LD_OtherLiability    = By.xpath("//input[contains(@name,'OtherLiability')]");

	// New Evaluation Economic Damages
	private static By NE_EconomicDamagesSection = By.xpath("//div[contains(@id,'NewEvaluationDV')]//div[text()='Economic Damages']");
	private static By NE_ED_HospitalER          = By.xpath("//input[contains(@name,'HospitalER')]");
	private static By NE_ED_TreatingPhysician   = By.xpath("//input[contains(@name,'TreatingPhysician')]");
	private static By NE_ED_PhysicalTherapy     = By.xpath("//input[contains(@name,'PhysicalTherapy')]");
	private static By NE_ED_Diagnostics         = By.xpath("//input[contains(@name,'Diagnostic')]");
	private static By NE_ED_MedicalEquipment    = By.xpath("//input[contains(@name,'MedicalEquipment')]");
	private static By NE_ED_FutureMedical       = By.xpath("//input[contains(@name,'FutureMedical')]");
	private static By NE_ED_ClaimantOutOfPocket = By.xpath("//input[contains(@name,'ClmtOutOfPocket')]");
	private static By NE_ED_Other               = By.xpath("//input[contains(@name,'EconomicDamages_Other')]");
	private static By NE_ED_Total               = By.xpath("//div[contains(@id,'EconomicDamages_Total')]//div[@class='gw-vw--value gw-align-h--left']");

	// New Evaluation Punitive Damages
	private static By NE_PunitiveDamagesSection = By.xpath("//div[contains(@id,'NewEvaluationDV')]//div[text()='Punitive Damages']");
	private static By NE_PD_Low                 = By.xpath("//input[contains(@name,'NonEconomicDamages_Low')]");
	private static By NE_PD_High                = By.xpath("//input[contains(@name,'NonEconomicDamages_High')]");
	private static By NE_PD_Likely              = By.xpath("//input[contains(@name,'NonEconomicDamages_Likely')]");

	// New Evaluation Total Value
	private static By NE_TotalValueSection           = By.xpath("//div[contains(@id,'NewEvaluationDV')]//div[text()='Total Value']");
	private static By NE_TotalValueLow               = By.xpath("//div[contains(@id,'TotalValue_Low')]//div[@class='gw-vw--value gw-align-h--left']");
	private static By NE_TotalValueHigh              = By.xpath("//div[contains(@id,'TotalValue_High')]//div[@class='gw-vw--value gw-align-h--left']");
	private static By NE_TotalValueLikely            = By.xpath("//div[contains(@id,'TotalValue_Likely')]//div[@class='gw-vw--value gw-align-h--left']");
	private static By NE_TotalValueTotal             = By.xpath("//input[contains(@name,'TotalValue_Amount')]");
	private static By NE_TotalValueAvailableReserves = By.xpath("//div[contains(@id,'AvailableReserves')]//div[@class='gw-value-readonly-wrapper']");
	private static By NE_TotalValueNetTotalIncurred  = By.xpath("//div[contains(@id,'TotalIncurredNet')]//div[@class='gw-value-readonly-wrapper']");

	private static By UpdateButton = By.xpath("//div[@id='NewEvaluation-NewEvaluationScreen-Update']//div[@role='button']");

	// Evaluations--------
	private static By EvaluationSection = By.xpath("//div[contains(@id,'DetailViewTitleCardTab')]//div[@role='tab']");

	// Evaluations Liability Distribution
	private static By Evaluations_LiabilityDistributionSection = By.xpath("//div[contains(@id,'ClaimEvaluationDetailDV')]//div[text()='Liability Distribution']");
	private static By LD_Name                                  = By.xpath("//div[contains(@id,'ClaimEvaluationDetailDV-Name')]//div[@class='gw-value-readonly-wrapper']");
	private static By LD_RelatedTo                             = By.xpath("//div[contains(@id,'Note_RelatedTo')]//div[@class='gw-RangeValue']");
	private static By LD_InsuredLiability                      = By.xpath("//div[contains(@id,'InsuredLiability')]//div[@class='gw-value-readonly-wrapper']");
	private static By LD_ClaimantLiability                     = By.xpath("//div[contains(@id,'ClaimantLiability')]//div[@class='gw-value-readonly-wrapper']");
	private static By LD_OtherLiability                        = By.xpath("//div[contains(@id,'OtherLiability')]//div[@class='gw-value-readonly-wrapper']");

	// Evaluations Economic Damages
	private static By Evaluations_EconomicDamages = By.xpath("//div[contains(@id,'ClaimEvaluationDetailDV')]//div[text()='Economic Damages']");
	private static By ED_HospitalER               = By.xpath("//div[contains(@id,'HospitalER')]//div[@class='gw-vw--value gw-align-h--left']");
	private static By ED_TreatingPhysician        = By.xpath("//div[contains(@id,'TreatingPhysician')]//div[@class='gw-vw--value gw-align-h--left']");
	private static By ED_PhysicalTherapy          = By.xpath("//div[contains(@id,'PhysicalTherapy')]//div[@class='gw-vw--value gw-align-h--left']");
	private static By ED_Diagnostics              = By.xpath("//div[contains(@id,'Diagnostic')]//div[@class='gw-vw--value gw-align-h--left']");
	private static By ED_MedicalEquipment         = By.xpath("//div[contains(@id,'MedicalEquipment')]//div[@class='gw-vw--value gw-align-h--left']");
	private static By ED_FutureMedical            = By.xpath("//div[contains(@id,'FutureMedical')]//div[@class='gw-vw--value gw-align-h--left']");
	private static By ED_ClaimantOutOfPocket      = By.xpath("//div[contains(@id,'ClmtOutOfPocket')]//div[@class='gw-vw--value gw-align-h--left']");
	private static By ED_Other                    = By.xpath("//div[contains(@id,'EconomicDamages_Other')]//div[@class='gw-vw--value gw-align-h--left']");
	private static By ED_Total                    = By.xpath("//div[contains(@id,'EconomicDamages_Total')]//div[@class='gw-vw--value gw-align-h--left']");

	// Evaluations Punitive Damages
	private static By Evaluations_PunitiveDamages = By.xpath("//div[contains(@id,'ClaimEvaluationDetailDV')]//div[text()='Punitive Damages']");
	private static By PD_Low                      = By.xpath("//div[contains(@id,'NonEconomicDamages_Low')]//div[@class='gw-vw--value gw-align-h--left']");
	private static By PD_High                     = By.xpath("//div[contains(@id,'NonEconomicDamages_High')]//div[@class='gw-vw--value gw-align-h--left']");
	private static By PD_Likely                   = By.xpath("//div[contains(@id,'NonEconomicDamages_Likely')]//div[@class='gw-vw--value gw-align-h--left']");

	// Evaluations Total Value
	private static By Evaluations_TotalValue = By.xpath("//div[contains(@id,'ClaimEvaluationDetailDV')]//div[text()='Total Value']");
	private static By TV_Low                 = By.xpath("//div[contains(@id,'TotalValue_Low')]//div[@class='gw-vw--value gw-align-h--left']");
	private static By TV_High                = By.xpath("//div[contains(@id,'TotalValue_High')]//div[@class='gw-vw--value gw-align-h--left']");
	private static By TV_Likely              = By.xpath("//div[contains(@id,'TotalValue_Likely')]//div[@class='gw-vw--value gw-align-h--left']");
	private static By TV_Total               = By.xpath("//div[contains(@id,'TotalValue_Amount')]//div[@class='gw-vw--value gw-align-h--left']");
	private static By TV_AvailableReserves   = By.xpath("//div[contains(@id,'TotalValue_AvailableReserves')]//div[@class='gw-value-readonly-wrapper']");
	private static By TV_NetTotalIncurred    = By.xpath("//div[contains(@id,'TotalValue_TotalIncurredNet')]//div[@class='gw-value-readonly-wrapper']");

	private static By EvaluationsCheckBox     = By.xpath("//input[contains(@name,'EditableEvaluationsLV-0-_Checkbox')]");
	private static By EvaluationsDeleteButton = By.xpath("//div[@id='ClaimEvaluations-ClaimEvaluationsScreen-Remove']//div[@role='button']");

	public static void CreateNewEvaluation() throws Throwable {

		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("NewEvaluation");

		try {

			GuidewireAutomate_Validation("Screen Header", Screen_Header, "equals", "Evaluations");
			GuidewireAutomate("Next Button", NewEvaluationButton, "clickAndwait", "clickAndwait");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;

		}

	}
	public static void NE_LiabilityDistribution() throws Throwable {

		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("NewEvaluation");

		try {

			GuidewireAutomate_Validation("Screen Header", Screen_Header, "equals", "New Evaluation");
			GuidewireAutomate_Validation("Liability Distribution Section", LiabilityDistributionSection, "equals", "Liability Distribution");

			GuidewireAutomate("Name", NE_LD_Name, "clearANDsendKeys", lhm_TestCase_Table_Data.get("Name"));
			GuidewireAutomate("Related To", NE_LD_RelatedTo, "selectByVisibleText", lhm_TestCase_Table_Data.get("RelatedTo"));
			GuidewireAutomate("Insured Liability", NE_LD_InsuredLiability, "clearANDsendKeys", lhm_TestCase_Table_Data.get("InsuredLiability"));
			GuidewireAutomate("Claimant Liability", NE_LD_ClaimantLiability, "clearANDsendKeys", lhm_TestCase_Table_Data.get("ClaimantLiability"));
			GuidewireAutomate("Other Liability", NE_LD_OtherLiability, "clearANDsendKeys", lhm_TestCase_Table_Data.get("OtherLiability"));

		} catch (Exception e) {
			e.printStackTrace();
			throw e;

		}

	}
	public static void NE_EconomicDamages() throws Throwable {

		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("NewEvaluation");

		try {

			GuidewireAutomate_Validation("Economic Damages Section", NE_EconomicDamagesSection, "equals", "Economic Damages");
			GuidewireAutomate("Hospital / ER", NE_ED_HospitalER, "clearANDsendKeys", lhm_TestCase_Table_Data.get("HospitalER"));
			GuidewireAutomate("Treating Physician", NE_ED_TreatingPhysician, "clearANDsendKeys", lhm_TestCase_Table_Data.get("TreatingPhysician"));
			GuidewireAutomate("Physical Therapy", NE_ED_PhysicalTherapy, "clearANDsendKeys", lhm_TestCase_Table_Data.get("PhysicalTherapy"));
			GuidewireAutomate("Diagnostics", NE_ED_Diagnostics, "clearANDsendKeys", lhm_TestCase_Table_Data.get("Diagnostics"));
			GuidewireAutomate("Medical Equipment", NE_ED_MedicalEquipment, "clearANDsendKeys", lhm_TestCase_Table_Data.get("MedicalEquipment"));
			GuidewireAutomate("Future Medical", NE_ED_FutureMedical, "clearANDsendKeys", lhm_TestCase_Table_Data.get("FutureMedical"));
			GuidewireAutomate("Claimant Out Of Pocket", NE_ED_ClaimantOutOfPocket, "clearANDsendKeys", lhm_TestCase_Table_Data.get("ClaimantOutOfPocket"));
			GuidewireAutomate("Other", NE_ED_Other, "clearANDsendKeys", lhm_TestCase_Table_Data.get("EDOther"));
			Thread.sleep(2000);
			GuidewireAutomate("Low", NE_PD_Low, "clearANDsendKeys", lhm_TestCase_Table_Data.get("PDLow"));
			GuidewireAutomate("Likely", NE_PD_Likely, "clearANDsendKeys", lhm_TestCase_Table_Data.get("PDLikely"));
			Thread.sleep(2000);

			GuidewireAutomate_Validation("Total", NE_ED_Total, "equals", lhm_TestCase_Table_Data.get("EDTotal"));

		} catch (Exception e) {
			e.printStackTrace();
			throw e;

		}

	}
	public static void NE_PunitiveDamages() throws Throwable {

		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("NewEvaluation");

		try {

			GuidewireAutomate_Validation("Punitive Damages Section", NE_PunitiveDamagesSection, "equals", "Punitive Damages");
			GuidewireAutomate("Low", NE_PD_Low, "clearANDsendKeys", lhm_TestCase_Table_Data.get("PDLow"));
			GuidewireAutomate("High", NE_PD_High, "clearANDsendKeys", lhm_TestCase_Table_Data.get("PDHigh"));
			GuidewireAutomate("Likely", NE_PD_Likely, "clearANDsendKeys", lhm_TestCase_Table_Data.get("PDLikely"));

		} catch (Exception e) {
			e.printStackTrace();
			throw e;

		}

	}

	public static void NE_TotalValue() throws Throwable {

		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("NewEvaluation");

		try {

			GuidewireAutomate_Validation("Total Value Section", NE_TotalValueSection, "equals", "Total Value");
			GuidewireAutomate_Validation("Total Value Low", NE_TotalValueLow, "equals", lhm_TestCase_Table_Data.get("TotalValueLow"));
			GuidewireAutomate_Validation("Total Value High", NE_TotalValueHigh, "equals", lhm_TestCase_Table_Data.get("TotalValueHigh"));
			GuidewireAutomate_Validation("Total Value Likely", NE_TotalValueLikely, "equals", lhm_TestCase_Table_Data.get("TotalValueLikely"));
			GuidewireAutomate("Total Value Total", NE_TotalValueTotal, "clearANDsendKeys", lhm_TestCase_Table_Data.get("TotalValueTotal"));
			GuidewireAutomate_Validation("Total Value Available Reserves", NE_TotalValueAvailableReserves, "equals", lhm_TestCase_Table_Data.get("AvailableReserves"));
			GuidewireAutomate_Validation("Total Value Net Total Incurred", NE_TotalValueNetTotalIncurred, "equals", lhm_TestCase_Table_Data.get("NetTotalIncurred"));

			GuidewireAutomate("Update Button", UpdateButton, "clickAndwait", "clickAndwait");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;

		}

	}
	public static void EvaluationsValidation() throws Throwable {

		lhm_TestCase_Table_Data = CC_Reusables.getData_ClaimsCenter("NewEvaluation");

		try {

			GuidewireAutomate_Validation("Screen Header", Screen_Header, "equals", "Evaluations");

			GuidewireAutomate_Validation("Evaluation Section", EvaluationSection, "equals", lhm_TestCase_Table_Data.get("EvaluationSection"));
			GuidewireAutomate_Validation("Liability Distribution Section", Evaluations_LiabilityDistributionSection, "equals", "Liability Distribution");
			GuidewireAutomate_Validation("Name", LD_Name, "equals", lhm_TestCase_Table_Data.get("Name"));
			GuidewireAutomate_Validation("Related To", LD_RelatedTo, "equals", lhm_TestCase_Table_Data.get("RelatedTo"));
			GuidewireAutomate_Validation("Insured Liability", LD_InsuredLiability, "equals", lhm_TestCase_Table_Data.get("InsuredLiability"));
			GuidewireAutomate_Validation("Claimant Liability", LD_ClaimantLiability, "equals", lhm_TestCase_Table_Data.get("ClaimantLiability"));
			GuidewireAutomate_Validation("Other Liability", LD_OtherLiability, "equals", lhm_TestCase_Table_Data.get("OtherLiability"));

			GuidewireAutomate_Validation("Economic Damages Section", Evaluations_EconomicDamages, "equals", "Economic Damages");
			GuidewireAutomate_Validation("Hospital/ER", ED_HospitalER, "contains", lhm_TestCase_Table_Data.get("HospitalER"));
			GuidewireAutomate_Validation("Treating Physician", ED_TreatingPhysician, "contains", lhm_TestCase_Table_Data.get("TreatingPhysician"));
			GuidewireAutomate_Validation("Physical Therapy", ED_PhysicalTherapy, "contains", lhm_TestCase_Table_Data.get("PhysicalTherapy"));
			GuidewireAutomate_Validation("Diagnostics", ED_Diagnostics, "contains", lhm_TestCase_Table_Data.get("Diagnostics"));
			GuidewireAutomate_Validation("Medical Equipment", ED_MedicalEquipment, "contains", lhm_TestCase_Table_Data.get("MedicalEquipment"));
			GuidewireAutomate_Validation("Future Medical", ED_FutureMedical, "contains", lhm_TestCase_Table_Data.get("FutureMedical"));
			GuidewireAutomate_Validation("Claimant Out Of Pocket", ED_ClaimantOutOfPocket, "contains", lhm_TestCase_Table_Data.get("ClaimantOutOfPocket"));
			GuidewireAutomate_Validation("Other", ED_Other, "contains", lhm_TestCase_Table_Data.get("EDOther"));
			GuidewireAutomate_Validation("Total", ED_Total, "contains", lhm_TestCase_Table_Data.get("EDTotal"));

			GuidewireAutomate_Validation("Punitive Damages Section", Evaluations_PunitiveDamages, "equals", "Punitive Damages");
			GuidewireAutomate_Validation("Low", PD_Low, "contains", lhm_TestCase_Table_Data.get("PDLow"));
			GuidewireAutomate_Validation("High", PD_High, "contains", lhm_TestCase_Table_Data.get("PDHigh"));
			GuidewireAutomate_Validation("Likely", PD_Likely, "contains", lhm_TestCase_Table_Data.get("PDLikely"));

			GuidewireAutomate_Validation("Total Value Section", Evaluations_TotalValue, "equals", "Total Value");
			GuidewireAutomate_Validation("Low", TV_Low, "equals", lhm_TestCase_Table_Data.get("TotalValueLow"));
			GuidewireAutomate_Validation("High", TV_High, "equals", lhm_TestCase_Table_Data.get("TotalValueHigh"));
			GuidewireAutomate_Validation("Likely", TV_Likely, "equals", lhm_TestCase_Table_Data.get("TotalValueLikely"));
			GuidewireAutomate_Validation("Total", TV_Total, "contains", lhm_TestCase_Table_Data.get("TotalValueTotal"));

			GuidewireAutomate_Validation("Available Reserves", TV_AvailableReserves, "equals", lhm_TestCase_Table_Data.get("AvailableReserves"));
			GuidewireAutomate_Validation("Net Total Incurred", TV_NetTotalIncurred, "equals", lhm_TestCase_Table_Data.get("NetTotalIncurred"));

		} catch (Exception e) {
			e.printStackTrace();
			throw e;

		}

	}
	public static void DeleteEvaluation() throws Throwable {

		try {

			GuidewireAutomate("Evaluations Chec kBox", EvaluationsCheckBox, "clickAndwait", "clickAndwait");
			GuidewireAutomate("Evaluations Delete Button", EvaluationsDeleteButton, "clickAndwait", "clickAndwait");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;

		}

	}

}
