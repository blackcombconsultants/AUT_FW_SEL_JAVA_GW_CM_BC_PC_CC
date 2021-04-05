package com.pages.Guidewire.WorkersCompensation;

import org.openqa.selenium.By;

public interface WC_Options_PO {
	final By add_Optn_btn=By.xpath("//*[@id='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoverageOptionsScreen-WCOptionsPanelSet-OptionIteratorButton']/div[1]");
	final By subMenu=By.xpath("//*[@id='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoverageOptionsScreen-WCOptionsPanelSet-OptionIteratorButton-0-CurrentOption']/div/div[2]");
	final By submenu1=By.xpath("//*[@id='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoverageOptionsScreen-WCOptionsPanelSet-OptionIteratorButton']/div[3]/div");
	final By fl_WC_Act=By.name("SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoverageOptionsScreen-WCOptionsPanelSet-WCOptionCardPanelSet-WCFederalLiabilityInputSet-GoverningAct");
	final By fl_WC_Accident=By.name("SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoverageOptionsScreen-WCOptionsPanelSet-WCOptionCardPanelSet-WCFederalLiabilityInputSet-FedEmpLiabLimit");
	final By fl_WC_Disease_Lmt=By.name("SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoverageOptionsScreen-WCOptionsPanelSet-WCOptionCardPanelSet-WCFederalLiabilityInputSet-FELADiseaseLimit");
	final By fl_add_Get_Row_Count=By.xpath("//*[@id='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoverageOptionsScreen-WCOptionsPanelSet-WCOptionCardPanelSet-WCFederalLiabilityInputSet-WCLine_WCCovEmpLV']//table/tbody/tr/td[1]");
	final By RefClick=By.xpath("//*[@id='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoverageOptionsScreen-WCOptionsPanelSet-WCOptionCardPanelSet-WCFederalLiabilityInputSet-WCLine_WCCovEmpLV']/div/div[1]");
	final By fl_Add=By.xpath("//*[@id='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoverageOptionsScreen-WCOptionsPanelSet-WCOptionCardPanelSet-WCFederalLiabilityInputSet-WCLine_WCCovEmpLV_tb-Add']/div/div[2]/div");
	final By location=By.name("SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoverageOptionsScreen-WCOptionsPanelSet-WCOptionCardPanelSet-WCFederalLiabilityInputSet-WCLine_WCCovEmpLV-0-Loc");
	final By classCode=By.name("SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoverageOptionsScreen-WCOptionsPanelSet-WCOptionCardPanelSet-WCFederalLiabilityInputSet-WCLine_WCCovEmpLV-0-ClassCode");;
	final By employee=By.name("SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoverageOptionsScreen-WCOptionsPanelSet-WCOptionCardPanelSet-WCFederalLiabilityInputSet-WCLine_WCCovEmpLV-0-NumEmployees");;
	final By basis=By.name("SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoverageOptionsScreen-WCOptionsPanelSet-WCOptionCardPanelSet-WCFederalLiabilityInputSet-WCLine_WCCovEmpLV-0-AnnualRenum");;
	final By classCodeSearchButton=By.id("SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoverageOptionsScreen-WCOptionsPanelSet-WCOptionCardPanelSet-WCFederalLiabilityInputSet-WCLine_WCCovEmpLV-0-ClassCode-SelectClassCode");
	final By classCodeSearch=By.name("WCClassCodeSearchPopup-WCClassCodeSearchScreen-WCClassCodeSearchDV-Code");
	final By classCodeSearchIcon=By.id("WCClassCodeSearchPopup-WCClassCodeSearchScreen-WCClassCodeSearchDV-SearchAndResetInputSet-SearchLinksInputSet-Search");
	final By searchResult=By.id("WCClassCodeSearchPopup-WCClassCodeSearchScreen-ClassCodeSearchResultsLV-0-_Select");
}
