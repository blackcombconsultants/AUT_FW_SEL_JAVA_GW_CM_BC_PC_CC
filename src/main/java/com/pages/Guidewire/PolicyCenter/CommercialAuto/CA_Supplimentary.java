package com.pages.Guidewire.PolicyCenter.CommercialAuto;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.aventstack.extentreports.ExtentTest;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Resuables_PO;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CA_Supplimentary extends SeleniumWebDriver_Commands {
    public CA_Supplimentary(WebDriver driver, ExtentTest oExtentTest) {
        super(driver, oExtentTest);
    }
    private static By QU_CA_GeneralQuestions = By.xpath("//div[contains(@class,'gw-boldLabel') and text()='General Questions']");

    private static By CA_Applicantsubsdiaryentity = By.xpath("//input[contains(@id,'QuestionSetLV-0-QuestionModalInput-BooleanRadioInput_1')]");
//misba

    public static void CA_Supplimentary_GQ() throws Throwable {
    try{
    lhm_TestCase_Table_Data=CA_Reusables.getData_CommercialAuto("Supplimentary");
    GuidewireAutomate_Validation("Screen Header", PolicyCenter_Resuables_PO.Screen_Header, "equals", "Supplemental (Step 10 of 12)");
    GuidewireAutomate_Validation("CA GeneralQuestions", QU_CA_GeneralQuestions, "equals", "General Questions");
    GuidewireAutomate("Is the Applicant a subsidary of another Entity?", CA_Applicantsubsdiaryentity, "clickAndwait", lhm_TestCase_Table_Data.get("CA_Applicantsubsdiaryentity"));
    }catch (Exception e){
    e.printStackTrace();
    throw e;
 }

    }
}
