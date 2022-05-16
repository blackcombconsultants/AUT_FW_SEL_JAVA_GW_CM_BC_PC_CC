package com.pages.Guidewire.PolicyCenter;

import com.pages.Guidewire.Tab_Menu_Navigation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;

public class PC_AccountSummary extends SeleniumWebDriver_Commands {

	public PC_AccountSummary(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	private static By AS_Details = By.xpath("//div[@class='gw-TitleSection']/div[@role='heading']/span[text()='Details']");

	private static By AS_D_AccountNo            = By.xpath("//div[contains(@id,'AccountDetailsDetailViewTile_DV-AccountNumber')]//div[@class='gw-value-readonly-wrapper']");
	private static By AS_D_AccountHolder        = By.xpath("//div[contains(@id,'AccountHolder_button')]");
	private static By AS_D_HomeAddress          = By.xpath("//div[contains(@id,'AccountDetailsDetailViewTile_DV-Address')]//div[@class='gw-value-readonly-wrapper']");
	private static By AS_D_Description          = By.xpath("//div[contains(@id,'AccountDetailsDetailViewTile_DV-AddressDescription')]//div[@class='gw-value-readonly-wrapper']");
	private static By AS_D_Status               = By.xpath("//div[contains(@id,'AccountDetailsDetailViewTile_DV-AccountStatus')]//div[@class='gw-value-readonly-wrapper']");
	static By         Screen_HeaderAddress      = By.xpath("//div[contains(@id,'LinkAddressMenu_Input')]//div[@class='gw-label gw-boldLabel']");
	static By         EditAccount_Address1      = By.xpath("//input[contains(@name,'GlobalAddressInputSet-AddressLine1')]");
	private static By AS_CurrentActivities      = By.xpath("//div[@class='gw-TitleSection']/div[@role='heading']/span[text()='Current Activities']");
	private static By AS_PolicyTerms            = By.xpath("//div[@class='gw-TitleSection']/div[@role='heading']/span[text()='Policy Terms']");
	private static By AS_OpenPolicyTransactions = By.xpath("//div[@class='gw-TitleSection']/div[@role='heading']/span[text()='Open Policy Transactions']");
	private static By AS_Claims                 = By.xpath("//div[@class='gw-TitleSection']/div[@role='heading']/span[text()='Claims']");
	private static By AS_Overview               = By.xpath("//div[@class='gw-TitleSection']/div[@role='heading']/span[text()='Overview']");
	private static By AS_Billing                = By.xpath("//div[@class='gw-TitleSection']/div[@role='heading']/span[text()='Billing']");
	private static By AS_Contacts               = By.xpath("//div[@class='gw-TitleSection']/div[@role='heading']/span[text()='Contacts']");
	private static By AS_Producer               = By.xpath("//div[@class='gw-TitleSection']/div[@role='heading']/span[text()='Producer']");
	private static By AS_Locations              = By.xpath("//div[@class='gw-TitleSection']/div[@role='heading']/span[text()='Locations']");
	private static By AS_RelatedAccounts        = By.xpath("//div[@class='gw-TitleSection']/div[@role='heading']/span[text()='Related Accounts']");
	private static By AS_Notes                  = By.xpath("//div[@class='gw-TitleSection']/div[@role='heading']/span[text()='Notes']");


	private static By SB_PolicyNumber                  = By.xpath("//div[contains(@id,'JobWizardInfoBar-PolicyNumber')]//div[@class='gw-label gw-infoValue']");
	private static By SB_ViewYourPolicypreemption                  = By.xpath("//div[contains(@id,'ViewPreemptedPolicy')]//div[@class='gw-action']");
	private static By SB_AccntNumber                  = By.xpath("//div[contains(@id,'JobWizardInfoBar-AccountNumber')]//div[@class='gw-label gw-infoValue']");
	private static By SB_PolicyPreemptionchanged                  = By.xpath("//div[contains(@id,'PanelSet-Warning')]//div[@class='gw-VerbatimWidget--inner']");
	private static By SB_PolicyTransaction                  = By.xpath("//div[contains(@id,'1-Transaction')]//div[@class='gw-vw--value gw-align-h--left']");
	private static By SB_HandlePreemptionChanged                 = By.xpath("//div[contains(@id,'HandlePreemption_DifferencesScreen-1')]//div[@class='gw-VerbatimWidget--inner']");
	private static By PolicyChange_EffectiveDate = By.xpath("//input[contains(@name,'StartPolicyChangeDV-EffectiveDate')]");
	public static void detail_Verify() throws Throwable {

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcelWorkSheet_Fillo("accountSummary", strTestCaseName);
		getStaleElement("Screen Header", PolicyCenter_Resuables_PO.Screen_Header);
		GuidewireAutomate_Validation("Screen Header", PolicyCenter_Resuables_PO.Screen_Header, "contains", "Account Summary");

		GuidewireAutomate_Validation("Details", AS_Details, "equals", "Details");

		strAccountNumber = getText_Element(AS_D_AccountNo);
		strAccountName   = getText_Element(AS_D_AccountHolder);

		GuidewireAutomate_Validation("AccountNo", AS_D_AccountNo, "equals", strAccountNumber);
		GuidewireAutomate_Validation("AccountHolder", AS_D_AccountHolder, "equals", strAccountName);

		GuidewireAutomate_Validation("HomeAddress", AS_D_HomeAddress, "contains", lhm_TestCase_Table_Data.get("AS_D_HomeAddress"));

		// GuidewireAutomate_Validation("Description", AS_D_Description, "contains", strAccountName);
		GuidewireAutomate_Validation("Status", AS_D_Status, "equals", lhm_TestCase_Table_Data.get("AS_D_Status"));

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}
	/*
	 * shanta
	 */
	public static void details_Edit() throws Throwable {
		try {
			lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcelWorkSheet_Fillo("createAccount", strTestCaseName);
			GuidewireAutomate_Validation("Screen Header Address", Screen_HeaderAddress, "equals", "Address");
			GuidewireAutomate("Address1", EditAccount_Address1, "clearANDsendKeys", lhm_TestCase_Table_Data.get("Address1"));

		} catch (Exception e) {
			e.printStackTrace();
			throw e;

		}

	}

	public static void CurrentActivities_Verify() throws Throwable {
		// TODO Auto-generated method stub

	}

	public static void PolicyTerms_Verify() throws Throwable {
		// TODO Auto-generated method stub

	}

	public static void OpenPolicyTransactions_Verify() throws Throwable {
		// TODO Auto-generated method stub

	}

	public static void Claims_Verify() throws Throwable {
		// TODO Auto-generated method stub

	}

	public static void Overview_Verify() throws Throwable {
		// TODO Auto-generated method stub

	}

	public static void Billing_Verify() throws Throwable {
		// TODO Auto-generated method stub

	}

	public static void Contacts_Verify() throws Throwable {
		// TODO Auto-generated method stub

	}

	public static void Producers_Verify() throws Throwable {
		// TODO Auto-generated method stub

	}

	public static void Locations_Verify() throws Throwable {
		// TODO Auto-generated method stub

	}

	public static void RelatedAccounts_Verify() throws Throwable {
		// TODO Auto-generated method stub

	}

	public static void Notes_Verify() throws Throwable {
		// TODO Auto-generated method stub


	}

	public static void accountHolderSummary() throws Throwable {
		// TODO Auto-generated method stub


	}

	public static void accountHolderSummary_Details_Edit() throws Throwable {
		// TODO Auto-generated method stub

	}

	public static void accountHolderSummary_Details_Verify() throws Throwable {
		// TODO Auto-generated method stub

	}

	public static void accountHolderSummary_Policies_Verify() throws Throwable {
		// TODO Auto-generated method stub

	}

	public static void accountHolderSummary_OpenPolicyTransactions_Verify() throws Throwable {
		// TODO Auto-generated method stub

	}

	public static void accountHolderSummary_Claims_Verify() throws Throwable {
		// TODO Auto-generated method stub

	}

	public static void accountHolderSummary_Overview_Verify() throws Throwable {
		// TODO Auto-generated method stub

	}

	public static void accountHolderSummary_Billing_Verify() throws Throwable {
		// TODO Auto-generated method stub

	}

	public static void accountHolderSummary_Notes_Verify() throws Throwable {
		// TODO Auto-generated method stub

	}

	public static void Preemption() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcelWorkSheet_Fillo("policyChange", strTestCaseName);
		try {
			GuidewireAutomate_Validation("Screen Header",  PolicyCenter_Resuables_PO.Screen_Header, "equals", "Start Policy Change");
			for (int i = 1; i <= 3; i++) {
				if (i == 1 || i == 2) {
					GuidewireAutomate("Effective Date", PolicyChange_EffectiveDate, "clearANDsendKeys", lhm_TestCase_Table_Data.get("EffectiveDate" + i));
					PolicyCenter_Resuables.clickButton("Next");
					PolicyCenter_Resuables.clickButton("Quote");
					GuidewireAutomate("Policy Number", SB_PolicyNumber, "clickAndwait", "click");
					Tab_Menu_Navigation.pcMenuNavigation("Change Policy");
					if (i == 3) {
						GuidewireAutomate("Effective Date", PolicyChange_EffectiveDate, "clearANDsendKeys", lhm_TestCase_Table_Data.get("EffectiveDate" + i));
						PolicyCenter_Resuables.clickButton("Next");
						PolicyCenter_Resuables.clickButton("Quote");
						GuidewireAutomate("Accnt Number", SB_AccntNumber, "clickAndwait", "click");
						GuidewireAutomate("Policy Transaction", SB_PolicyTransaction, "clickAndwait", "click");
						PolicyCenter_Resuables.clickButton("Issue Policy");
						GuidewireAutomate("View your Policy changed preemption", SB_ViewYourPolicypreemption, "clickAndwait", "click");
						GuidewireAutomate_Validation("validate policy preemption", SB_PolicyPreemptionchanged, "contains", "Your Policy Change was preempted by Policy Change ");
						PolicyCenter_Resuables.clickButton("Handle Preemption");
						GuidewireAutomate_Validation("Screen Header", PolicyCenter_Resuables_PO.Screen_Header, "contains", "Handle Preemptions");
						GuidewireAutomate_Validation("Handle Preemption Validate", SB_HandlePreemptionChanged, "contains", "Your Policy Change was preempted by Policy Change 0037830719");
					}
				}
			}
			lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
			lhm_TestCase_Table_Data.clear();
		}catch (Exception e){
			e.printStackTrace();
		}
	}

}
