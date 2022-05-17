package com.pages.Guidewire.PolicyCenter;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PC_RunBatch extends SeleniumWebDriver_Commands {
    public PC_RunBatch(WebDriver driver, ExtentTest oExtentTest) {
        super(driver, oExtentTest);
    }
    //Run Batch
    private static By AccountWithdrawEvaluation = By.xpath("//div[text()='Account Withdraw Evaluation']/ancestor::td/following-sibling::td[contains(@id,'RunBatchWithoutNotifyContent')]//div[contains(@id,'RunBatchWithoutNotify')]");
    private static By AccountHolderCount = By.xpath("//div[text()='AccountHolderCount']/ancestor::td/following-sibling::td[contains(@id,'RunBatchWithoutNotifyContent')]//div[contains(@id,'RunBatchWithoutNotify')]");

    //Internal Tools Menus
    private static By InternalTools = By.xpath("//div[@id='InternalToolsTabBar-UnsupportedToolsTab']//div[@class='gw-label' and text()='Internal Tools']");
    private static By InternalTools_Reload = By.xpath("//div[@id='UnsupportedTools-MenuLinks-UnsupportedTools_Reload']//div[@class='gw-label']");
    private static By InternalTools_ServerPerformance = By.xpath("//div[@id='UnsupportedTools-MenuLinks-UnsupportedTools_ServerPerformance']//div[@class='gw-label']");
    private static By InternalTools_TestingSystemClock = By.xpath("//div[@id='UnsupportedTools-MenuLinks-UnsupportedTools_SystemClock']//div[@class='gw-label']");
    private static By InternalTools_PCSampleData = By.xpath("//div[@id='UnsupportedTools-MenuLinks-UnsupportedTools_PCSampleData']//div[@class='gw-label']");
    private static By InternalTools_ArchivingTest = By.xpath("//div[@id='UnsupportedTools-MenuLinks-UnsupportedTools_PCArchive']//div[@class='gw-label']");
    private static By InternalTools_PurgingQuotesTest = By.xpath("//div[@id='UnsupportedTools-MenuLinks-UnsupportedTools_PCPurge']//div[@class='gw-label']");
    private static By InternalTools_PersonalDataDestructionTests = By.xpath("//div[@id='UnsupportedTools-MenuLinks-UnsupportedTools_PersonalDataDestruction']//div[@class='gw-label']");


    //Reload
    private static By ReloadHeader = By.xpath("//div[@id='Reload-ReloadScreen-ttlBar']//div[@role='heading']");
    private static By ReloadPCFFiles = By.xpath("//div[@id='Reload-ReloadScreen-ReloadDV-PCF']//div[@role='button']");
    private static By ReloadWebTemplates = By.xpath("//div[@id='Reload-ReloadScreen-ReloadDV-GSTemplates']//div[@role='button']");
    private static By ReloadWorkflowEngine = By.xpath("//div[@id='Reload-ReloadScreen-ReloadDV-WorkflowEngine']//div[@role='button']");
    private static By ReloadDisplayNames = By.xpath("//div[@id='Reload-ReloadScreen-ReloadDV-DisplayNames']//div[@role='button']");

    //Server Performance
    private static By ServerPerformanceHeader = By.xpath("//div[@id='ServerPerformance-ServerPerformanceScreen-ttlBar']//div[@role='heading']");
    private static By ServerPerformanceEnableButton = By.xpath("//div[@id='ServerPerformance-ServerPerformanceScreen-EnableButton']//div[@role='button']");

    //Testing System Clock
    private static By TestingSystemClockHeader = By.xpath("//div[@id='SystemClock-SystemClockScreen-ttlBar']//div[@role='heading']");
    private static By TestingSystemClockDate = By.xpath("//input[@name='SystemClock-SystemClockScreen-Date']");
    private static By TestingSystemClockTime = By.xpath("//input[@name='SystemClock-SystemClockScreen-Date_time']");
    private static By TestingSystemClockChangeDateButton = By.xpath("//div[@id='SystemClock-SystemClockScreen-ChangeDate']//div[@role='button']");
    private static By TestingSystemClockAddMinuteButton = By.xpath("//div[@id='SystemClock-SystemClockScreen-AddMinute']//div[@role='button']");
    private static By TestingSystemClockAddHourButton = By.xpath("//div[@id='SystemClock-SystemClockScreen-AddHour']//div[@role='button']");
    private static By TestingSystemClockAddDayButton = By.xpath("//div[@id='SystemClock-SystemClockScreen-AddDay']//div[@role='button']");
    private static By TestingSystemClockAddWeekButton = By.xpath("//div[@id='SystemClock-SystemClockScreen-AddWeek']//div[@role='button']");
    private static By TestingSystemClockAddMonthButton = By.xpath("//div[@id='SystemClock-SystemClockScreen-AddMonth']//div[@role='button']");
    private static By TestingSystemClockAddYearButton = By.xpath("//div[@id='SystemClock-SystemClockScreen-AddYear']//div[@role='button']");

    //Pc Sample Data






}
