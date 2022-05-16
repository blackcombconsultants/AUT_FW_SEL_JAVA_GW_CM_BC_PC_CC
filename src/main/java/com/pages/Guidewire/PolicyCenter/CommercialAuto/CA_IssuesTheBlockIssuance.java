package com.pages.Guidewire.PolicyCenter.CommercialAuto;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.aventstack.extentreports.ExtentTest;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Resuables_PO;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CA_IssuesTheBlockIssuance  extends SeleniumWebDriver_Commands {

    public CA_IssuesTheBlockIssuance(WebDriver driver, ExtentTest oExtentTest) {
        super(driver, oExtentTest);

    }
    //Issuance
    static By IssuanceScreenHeader = By.xpath("//div[@id='UWBlockProgressIssuesPopup-IssuesScreen-PreQuoteIssueTitle']");
    static By DetailsButton = By.xpath("//div[@id='UWBlockProgressIssuesPopup-IssuesScreen-DetailsButton']");
    static By ApproveButton = By.xpath("//div[contains(@id,'RiskEvaluationPanelSet-Approve')]//div[@role='button']");
    static By ApprovalDetailHeader = By.xpath("//div[@id='RiskApprovalDetailsPopup-ttlBar']//div[@class='gw-TitleBar--title']");
    static By OkButton = By.xpath("//div[@id='RiskApprovalDetailsPopup-Update']//div[@role='button']");



    public static void Issuance() throws Throwable {

        try {
       GuidewireAutomate_Validation("IssuanceHeader",IssuanceScreenHeader,"contains","Issues that block Issuance");
       GuidewireAutomate("DetailsButton",DetailsButton,"clickAndwait","click");
       Thread.sleep(2000);
       GuidewireAutomate_Validation("screen Header",PolicyCenter_Resuables_PO.Screen_Header,"contains","Risk Analysis");
       GuidewireAutomate("ApproveButton",ApproveButton,"clickAndwait","click");
       getStaleElement("ApprovalDetailHeader",ApprovalDetailHeader);
       GuidewireAutomate_Validation("ApprovalDetailHeader",ApprovalDetailHeader,"contains","Risk Approval");
       getStaleElement("OkButton",OkButton);
       GuidewireAutomate("OkButton",OkButton,"clickAndwait","click");
       getStaleElement("screen Header",PolicyCenter_Resuables_PO.Screen_Header);
       GuidewireAutomate_Validation("screen Header",PolicyCenter_Resuables_PO.Screen_Header,"contains","Risk");
        } catch (Exception e) {

        }
    }

}