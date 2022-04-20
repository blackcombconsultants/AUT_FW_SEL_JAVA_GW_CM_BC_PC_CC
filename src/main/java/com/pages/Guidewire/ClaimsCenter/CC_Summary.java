package com.pages.Guidewire.ClaimsCenter;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CC_Summary extends SeleniumWebDriver_Commands {
    private static By ReportedDate;

    public CC_Summary(WebDriver driver, ExtentTest oExtentTest) {
        super(driver, oExtentTest);
    }
    private static By Summary_Header = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading']");
    private static By Summary_ReportedDate = By.xpath("//div[@id='ClaimSummary-ClaimSummaryScreen-ReportDate_Input']//div[@class='gw-label']");
    private static By Status_Header = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading']");
    private static By Summary_ExposureSeverityHeader = By.xpath("//tr[contains(@id,'ClaimSummaryExposuresLV-3')]/td[@role='columnheader']");
    private static By Summary_Noticeonly = By.xpath("//div[@id='ClaimStatus-IncidentOnly_Input']//div[@class='gw-label']");
    private static By Edit_Button = By.xpath("//div[@id='ClaimStatus-Edit']//div[@role='button']");
    private static By BordereuClick_Yes = By.xpath("//input[@id='ClaimStatus-BordereauReport_Ext_0']");
    private static By Update_Button = By.xpath("//div[@id='ClaimStatus-Update']//div[@role='button']");
    private static By Validation_Results = By.xpath("//div[@id='wsTabBar-wsTab_0']//div[@role='tab']");
    private static By Error_Msg = By.xpath("//div[@id='WebMessageWorksheet-WebMessageWorksheetScreen-grpMsgs-0-0']");
    private static By Clear_Button = By.xpath("//div[contains(@id,'WebMessageWorksheet_ClearButton')]//div[@role='button']");
    private static By  BordereuReportvalidate = By.xpath("//div[@id='ClaimStatus-BordereauReport_Ext_Input']//div[contains(text(),'Bordereau Report')]");
    private static By  ReportedDateafter_DOL = By.xpath("//div[@id='Claim-ClaimInfoBar-ReportedDate_Ext']");
    private static By Financial_Section= By.xpath("//div[@id='ClaimSummary-ClaimSummaryScreen-8']//div[@role='heading']");

    private static By Financial_ExpensePaid = By.xpath("//div[@id='ClaimSummary-ClaimSummaryScreen-ExpensePaid_Ext_Input']");
    private static By Financial_IndemnityReserve= By.xpath("//div[@id='ClaimSummary-ClaimSummaryScreen-IndemnityReserves_Ext_Input']");
    private static By Financial_ExpenseReserve= By.xpath("//div[@id='ClaimSummary-ClaimSummaryScreen-ExpenseReserves_Ext_Input']");
    private static By Financial_GrossIncurred = By.xpath("//div[@id='ClaimSummary-ClaimSummaryScreen-TotalGrossIncurred_Input']//div[@class='gw-label']");
    private static By Financial_IndemnityPaid= By.xpath("//div[@id='ClaimSummary-ClaimSummaryScreen-IndemnityPaid_Ext_Input']");
    //Author:Misba
    //Date:04/01/2022
    //Description:Paid field isremoved in financial summary
    public static void Summary_PaidFiedRemoved() throws Throwable {
        try {
            GuidewireAutomate_Validation("Screen Header", Summary_Header, "contains", "Summary");
            By PaidField=By.xpath("//div[@class='gw-label' and text()='PaidField']");

            VerifyElementNotExist("Paid Field",PaidField);

        } catch (NoSuchElementException e) {

            e.printStackTrace();
            throw e;
        }
    }
    public static void Summary_NoticeDateRenamedtoReported() throws Throwable {

        try {
            GuidewireAutomate_Validation("Screen Header", Summary_Header, "contains", "Summary");
            GuidewireAutomate_Validation("Notice Date Renamed to Reported Date", Summary_ReportedDate, "contains", "Reported Date");

        } catch (NoSuchElementException e) {

            e.printStackTrace();
            throw e;
        }
    }
    //Author:Misba
    //Date:06/01/2022
    //Description:To verify whether the "Indemnity Reserves" and "Expense Reserves" field are calculated an
    public static void Summary_IndemnityandExpenseReservesareCalculated() throws Throwable {

        try {
            GuidewireAutomate_Validation("Screen Header", Summary_Header, "contains", "Summary");
            GuidewireAutomate_Validation("Financial Section", Financial_Section, "contains", "Financials");
            GuidewireAutomate_Validation("Expense Paid", Financial_ExpensePaid, "contains", "Expense Paid");
            GuidewireAutomate_Validation("Indemnity Reserve calculated", Financial_IndemnityReserve, "contains", "Indemnity Reserves");
            GuidewireAutomate_Validation("ExpenseReserve calculated", Financial_ExpenseReserve, "contains", "Expense Reserves");


        } catch (NoSuchElementException e) {

            e.printStackTrace();
            throw e;
        }
    }
    //Author:Misba
    //Date:07/01/2022
    //Description:To verify whether the "Indemnity paid" and "Expense paid" field are calculated an
    public static void Summary_IndemnityandExpensePaidareCalculated() throws Throwable {

        try {
            GuidewireAutomate_Validation("Screen Header", Summary_Header, "contains", "Summary");
            GuidewireAutomate_Validation("Financial Section", Financial_Section, "contains", "Financials");
            GuidewireAutomate_Validation("Gross Incurred", Financial_GrossIncurred, "contains", "Gross Incurred");
            GuidewireAutomate_Validation("Indemnity Paid Calculated", Financial_IndemnityPaid, "contains", "Indemnity paid");
            GuidewireAutomate_Validation("Expense Paid Calculated", Financial_ExpensePaid, "contains", "Expense Paid");


        } catch (NoSuchElementException e) {

            e.printStackTrace();
            throw e;
        }
    }
    public static void Status_IncidentRenamedtoNotice() throws Throwable {

        try {
            GuidewireAutomate_Validation("Screen Header", Status_Header, "contains", "Status");
            GuidewireAutomate_Validation("Incident only renamed to Notice only", Summary_Noticeonly, "contains", "Notice Only");

        } catch (NoSuchElementException e) {

            e.printStackTrace();
            throw e;
        }
    }
    //Author:Misba
    //Date:05/01/2022
    //Description:To verify whether the "Bordereau Report" field is added below "Incident Only" in Claims Summary Status screen.

    public static void Status_VerifyBordereuReportErrorMessage() throws Throwable {

        try {
            GuidewireAutomate_Validation("Screen Header", Status_Header, "contains", "Status");
            GuidewireAutomate_Validation(" Bordereu Report is below Incident only", BordereuReportvalidate, "contains", "Bordereau Report");

            GuidewireAutomate("Edit Button", Edit_Button, "clickAndwait", "click");
            GuidewireAutomate("Bordereu report click Yes", BordereuClick_Yes, "clickAndwait", "Yes");
            GuidewireAutomate("Update Button", Update_Button, "clickAndwait", "click");
            GuidewireAutomate_Validation("Validation Results", Validation_Results, "contains", "Validation Results");
            GuidewireAutomate_Validation(" Validate Error Msg", Error_Msg, "contains", "Bordereau Report cannot be set to Yes when ");
            GuidewireAutomate("Clear Button", Clear_Button, "clickAndwait", "click");

        } catch (NoSuchElementException e) {

            e.printStackTrace();
            throw e;
        }
    }
    //Author:Misba
    //Date:05/01/2022
    //Description:Lob is not Editable

    public static void Status_VerifyLOBisNotEditable() throws Throwable {

        try {
            GuidewireAutomate_Validation("Screen Header", Status_Header, "contains", "Status");

            WebElement LineOfBusiness = driver.findElement(By.xpath("//div[@id='ClaimStatus-LineOfBusiness']"));


                if(LineOfBusiness.isEnabled()){

                    oExtentTest.log(Status.PASS, "Line Of Business is not Editable");
                }
                else{
                    oExtentTest.log(Status.FAIL, "Line Of Business is Editable");

                }
        } catch (NoSuchElementException e) {

            e.printStackTrace();
            throw e;
        }
    }
    public static void Validate_SummaryHeader() throws Throwable {

        try {
            GuidewireAutomate_Validation("Screen Header", Summary_Header, "contains", "Summary");

        } catch (NoSuchElementException e) {

            e.printStackTrace();
            throw e;
        }
    }
    public static void Summary_SeveritycolumnnexttoAdjustercolumn() throws Throwable {

        try {
            GuidewireAutomate_Validation("Screen Header", Summary_Header, "contains", "Summary");
            List<WebElement> PLC_Headers = getElements(Summary_ExposureSeverityHeader);

            for (int i = 0; i < PLC_Headers.size(); i++) {

                String header4 = PLC_Headers.get(3).getText();
                String header5 = PLC_Headers.get(4).getText();
                String header6 = PLC_Headers.get(5).getText();
                if (header4.equals("Adjuster") && header5.equals("Severity") && header6.equals("Remaining Reserves")) {
                    oExtentTest.log(Status.FAIL, "Incident Severity  is not added after adjuster " + header5 + " column");

                    break;
                } else {
                    oExtentTest.log(Status.PASS, "Incident Severity  is added after adjuster " + header5 + " column");
                    break;
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
            throw e;

        }
    }
    //Author:Misba
    //Date:05/01/2022
    //Description:Storage Section is hidden in claim summary status
    public static void Status_StorageSectionisHidden() throws Throwable {
        try {
            GuidewireAutomate_Validation("Screen Header", Status_Header, "contains", "Status");
            By StorageSection=By.xpath("//div[@class='gw-label' and text()='StorageSection']");

            VerifyElementNotExist("Storage Section",StorageSection);

        } catch (NoSuchElementException e) {

            e.printStackTrace();
            throw e;
        }
    }
    //Author:Misba
    //Date:05/01/2022
    //Description:Divider Bar is hidden in claim summary status
    public static void Status_DividerBarisHidden() throws Throwable {
        try {
            GuidewireAutomate_Validation("Screen Header", Status_Header, "contains", "Status");
            By DividerBar=By.xpath("//div[@class='gw-label' and text()='DividerBar']");

            VerifyElementNotExist("Divider Bar",DividerBar);

        } catch (NoSuchElementException e) {

            e.printStackTrace();
            throw e;
        }
    }
    //Author:Misba
    //Date:05/01/2022
    //Description:covergae in question is hidden in claim summary status
    public static void Status_CoverageinQuestionisHidden() throws Throwable {
        try {
            GuidewireAutomate_Validation("Screen Header", Status_Header, "contains", "Status");
            By CoverageinQuestion=By.xpath("//div[@class='gw-label' and text()='CoverageinQuestion']");

            VerifyElementNotExist("Coverage in Question ",CoverageinQuestion);

        } catch (NoSuchElementException e) {

            e.printStackTrace();
            throw e;
        }
    }

    //Author:Misba
    //Date:05/01/2022
    //Description:One Divider Baris hidden in claim summary status
    public static void Status_OneDividerBarisHidden() throws Throwable {
        try {
            GuidewireAutomate_Validation("Screen Header", Status_Header, "contains", "Status");
            By OneDividerBar=By.xpath("//div[@class='gw-label' and text()='OneDividerBar']");

            VerifyElementNotExist("One Divider Bar",OneDividerBar);

        } catch (NoSuchElementException e) {

            e.printStackTrace();
            throw e;
        }
    }
    //Author:Misba
    //Date:04/01/2022
    //Description:Claim Segment field is hidden
    public static void Summary_ClaimSegmentfieldisHidden() throws Throwable {
        try {
            GuidewireAutomate_Validation("Screen Header", Summary_Header, "contains", "Summary");
            By ClaimSegmentfield=By.xpath("//div[@class='gw-label' and text()='ClaimSegmentfield']");

            VerifyElementNotExist("Claim Segment Field",ClaimSegmentfield);

        } catch (NoSuchElementException e) {

            e.printStackTrace();
            throw e;
        }
    }

    //Author:Misba
    //Date:05/01/2022
    //Description:Reported Field is Hidden
    public static void Status_ReportedDateisHidden() throws Throwable {
        try {
            GuidewireAutomate_Validation("Screen Header", Status_Header, "contains", "Status");
            By ReportedDate=By.xpath("//div[@class='gw-label' and text()='ReportedDate']");

            VerifyElementNotExist("Reported Date",ReportedDate);

        } catch (NoSuchElementException e) {

            e.printStackTrace();
            throw e;
        }
    }
    //Author:Misba
    //Date:04/01/2022
    //Description:Claim Segment field is hidden
    public static void Summary_ReportedDateisaftrDOL() throws Throwable {
        try {
            GuidewireAutomate_Validation("Screen Header", Summary_Header, "contains", "Summary");
            GuidewireAutomate_Validation("Reported Date is after DOL", ReportedDateafter_DOL, "contains", "Reported:");


        } catch (NoSuchElementException e) {

            e.printStackTrace();
            throw e;
        }
    }
}
