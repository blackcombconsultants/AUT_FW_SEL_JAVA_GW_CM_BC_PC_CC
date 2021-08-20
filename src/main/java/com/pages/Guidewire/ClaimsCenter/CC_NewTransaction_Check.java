package com.pages.Guidewire.ClaimsCenter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.io.IOException;
import java.util.List;

public class CC_NewTransaction_Check extends SeleniumWebDriver_Commands implements ClaimCenter_CreateManualCheck_PO {

	//private static final By FT_CostCategory = null;
	public CC_NewTransaction_Check(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
		// TODO Auto-generated constructor stub
	}
	
	public static void Enterpayeeinformation() throws Throwable {
		String insuredName = driver.findElement(By.xpath("//div[contains(@id,'Insured')]//div[@class='gw-label gw-infoValue']")).getText();

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("NewTransaction_Check", strTestCaseName);
		GuidewireAutomate_Validation("Screen Header", Enterpayeeinformation_Header, "equals", "Step 1 of 3: Enter payee information");
		GuidewireAutomate_Validation("Primary Payee",PrimaryPayee , "equals", "Primary Payee");

		GuidewireAutomate("Name", CD_PrimaryPayee_Namee, "selectByVisibleText", insuredName);
		GuidewireAutomate("Next Button", Next_Button, "click", "click");

		Thread.sleep(2000);
	}

	public static void Enterpaymentinformation() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("NewTransaction_Check", strTestCaseName);

		GuidewireAutomate_Validation("Screen Header", Enterpaymentinformation_Header, "equals", "Step 2 of 3: Enter payment information");
		GuidewireAutomate("Reserve Line", PD_ReserveLine, "selectByVisibleText", lhm_TestCase_Table_Data.get("ReserveLine"));

         Thread.sleep(2000);
		GuidewireAutomate("Payment Type", PD_PaymentType, "selectByVisibleText", lhm_TestCase_Table_Data.get("PaymentType"));

		GuidewireAutomate("LineItem Category", PD_LineItem_Category, "selectByVisibleText", lhm_TestCase_Table_Data.get("LineItemCategory_0"));
		GuidewireAutomate("LineItem Category", PD_LineItem_Category, "selectByVisibleText", lhm_TestCase_Table_Data.get("LineItemCategory_1"));
        GuidewireAutomate("LineItem Amount", PD_LineItem_Amount, "clearANDsendKeys", lhm_TestCase_Table_Data.get("LineItemAmount_0"));

        GuidewireAutomate("LineItem Amount", PD_LineItem_Amount, "clearANDsendKeys", lhm_TestCase_Table_Data.get("LineItemAmount_1"));
    	GuidewireAutomate("Next Button", Next_Button, "clickAndwait", "click");

        Thread.sleep(2000);
	}
		// * GuidewireAutomate("PD_CheckBox", PD_CheckBox, "clickAndwait", "");
		 
		// * GuidewireAutomate("PD_Remove", PD_Remove, "click", "");
		 
		
	
	public static void Setcheckinstructions() throws Throwable {

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("NewTransaction_Check", strTestCaseName);
       
		GuidewireAutomate_Validation("Screen Header", Setcheckinstructions_Header, "equals", "Step 3 of 3: Set check instructions");
		//GuidewireAutomate_Validation("Gross Amount", SI_GrossAmount, "fetch", lhm_TestCase_Table_Data.get("GrossAmount"));
		//GuidewireAutomate_Validation("Net Amount", SI_NetAmount, "fetch", lhm_TestCase_Table_Data.get("NetAmount"));
		GuidewireAutomate("Finish_Button", Finish_Button, "click", "click");
		GuidewireAutomate_Validation("Screen Header", PD_Financial_Checks, "equals", "Financials: Checks");
	}
   

					
		

    public static void FinancialsTransactions() throws Throwable{
		/*
		 * lhm_TestCase_Table_Data =
		 * Selenium_Utils_DataBase.getData_ClaimsCenter("FinancialsTransactions");
		 * 
		 * // By strActualCostType =
		 * By.xpath("//td[contains(@id,'TransactionsLV-"+strTotalRows+"-CostType')]");
		 * 
		 * By strActualCostCategory =
		 * By.xpath("//td[contains(@id,'TransactionsLV-"+strTotalRows+"-CostCategory')]"
		 * ); String FT_CostCategory = lhm_TestCase_Table_Data.get("FT_CostCategory" +
		 * strTotalRows);
		 * 
		 * 
		 * By FinancialTransaction = By.xpath(
		 * "//tr[contains(@id,'ClaimFinancialsTransactionsScreen-TransactionsLV')]");
		 * 
		 * List<WebElement> olist_CostCategory = getElements(FinancialTransaction); int
		 * TotalRow = olist_CostCategory.size(); String strTotalRows =
		 * String.valueOf(TotalRow);
		 * 
		 * By strActualCreatedate =
		 * By.xpath("//td[contains(@id,'TransactionsLV-"+strTotalRows+
		 * "-CreateDate_Cell')]"); By strActualAmount =
		 * By.xpath("//td[contains(@id,'TransactionsLV-"+strTotalRows+"-Amount_Cell')]")
		 * ; By strActualExposure =
		 * By.xpath("//td[contains(@id,'TransactionsLV-"+strTotalRows+
		 * "-Exposure_Cell')]"); By strActualCoverage =
		 * By.xpath("//td[contains(@id,'TransactionsLV-"+strTotalRows+"-CoverageType')]"
		 * ); By strActualCostType =
		 * By.xpath("//td[contains(@id,'TransactionsLV-"+strTotalRows+"-CostType')]");
		 * By strActualStatus =
		 * By.xpath("//td[contains(@id,'TransactionsLV-"+strTotalRows+"-Status')]"); By
		 * strActualUser =
		 * By.xpath("//td[contains(@id,'TransactionsLV-"+strTotalRows+"-User')]");
		 * 
		 * By strActualCostCategory =
		 * By.xpath("//td[contains(@id,'TransactionsLV-"+strTotalRows+"-CostCategory')]"
		 * );
		 * 
		 * 
		 * 
		 * String FT_Createdate = lhm_TestCase_Table_Data.get("FT_Createdate" +
		 * strTotalRows); String FT_Amount = lhm_TestCase_Table_Data.get("FT_Amount" +
		 * strTotalRows); String FT_Exposure = lhm_TestCase_Table_Data.get("FT_Exposure"
		 * + strTotalRows); String FT_Coverage =
		 * lhm_TestCase_Table_Data.get("FT_Coverage" + strTotalRows); String FT_CostType
		 * = lhm_TestCase_Table_Data.get("FT_CostType" + strTotalRows); String
		 * FT_CostCategory = lhm_TestCase_Table_Data.get("FT_CostCategory" +
		 * strTotalRows); String FT_Status = lhm_TestCase_Table_Data.get("FT_Status" +
		 * strTotalRows); String FT_User = lhm_TestCase_Table_Data.get("FT_User" +
		 * strTotalRows);
		 * 
		 * 
		 * if ((strActualCreatedate.equals(FT_Createdate)) &&
		 * (strActualAmount.equals(FT_Amount)) &&
		 * (strActualExposure.equals(FT_Exposure)) &&
		 * (strActualCoverage.equals(FT_Coverage)) &&
		 * (strActualCostType.equals(FT_CostType)) &&
		 * (strActualCostCategory.equals(FT_CostCategory)) &&
		 * (strActualStatus.equals(FT_Status)) && (strActualUser.equals(FT_User))) {
		 * 
		 * Assert.assertEquals(strActualCreatedate, FT_Createdate);
		 * Assert.assertEquals(strActualAmount, FT_Amount);
		 * Assert.assertEquals(strActualExposure, FT_Exposure);
		 * Assert.assertEquals(strActualCoverage, FT_Coverage);
		 * Assert.assertEquals(strActualCostType, FT_CostType);
		 * Assert.assertEquals(strActualCostCategory, FT_CostCategory);
		 * Assert.assertEquals(strActualStatus, FT_Status);
		 * Assert.assertEquals(strActualUser, FT_User);
		 * 
		 * oExtentTest.log(Status.PASS, "Createdate=>Actual = [" + strActualCreatedate +
		 * "] Equals Expected = [" + FT_Createdate + "]" + "<br />" +
		 * "Amount=>Actual = [" + strActualAmount + "] Equals Expected = [" + FT_Amount
		 * + "]" + "<br />" + "Exposure=>Actual = [" + strActualExposure +
		 * "] Equals Expected = [" + FT_Exposure + "]" + "<br />" +
		 * "Coverage=>Actual = [" + strActualCoverage + "] Equals Expected = [" +
		 * FT_Coverage + "]" + "<br />" + "CostType=>Actual = [" + strActualCostType +
		 * "] Equals Expected = [" + FT_CostType + "]" + "<br />" +
		 * "CostCategory=>Actual = [" + strActualCostCategory + "] Equals Expected = ["
		 * + FT_CostCategory + "]" + "<br />" + "Status=>Actual = [" + strActualStatus +
		 * "] Equals Expected = [" + FT_Status + "]" + "<br/>" + "User=>Actual = [" +
		 * strActualUser + "] Equals Expected = [" + FT_User + "]");
		 * 
		 * }else {
		 * 
		 * oExtentTest.log(Status.FAIL, "Createdate=>Actual = [" + strActualCreatedate +
		 * "] Equals Expected = [" + FT_Createdate + "]" + "<br />" +
		 * "Amount=>Actual = [" + strActualAmount + "] Equals Expected = [" + FT_Amount
		 * + "]" + "<br />" + "Exposure=>Actual = [" + strActualExposure +
		 * "] Equals Expected = [" + FT_Exposure + "]" + "<br />" +
		 * "Coverage=>Actual = [" + strActualCoverage + "] Equals Expected = [" +
		 * FT_Coverage + "]" + "<br />" + "CostType=>Actual = [" + strActualCostType +
		 * "] Equals Expected = [" + FT_CostType + "]" + "<br />" +
		 * "CostCategory=>Actual = [" + strActualCostCategory + "] Equals Expected = ["
		 * + FT_CostCategory + "]" + "<br />" + "Status=>Actual = [" + strActualStatus +
		 * "] Equals Expected = [" + FT_Status + "]" + "<br/>" + "User=>Actual = [" +
		 * strActualUser + "] Equals Expected = [" + FT_User + "]");
		 * 
		 * }
		 */      
    }
	
	
}
