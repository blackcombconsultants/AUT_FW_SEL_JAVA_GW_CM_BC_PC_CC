package com.pages.Guidewire.ClaimsCenter;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class CC_Matter extends SeleniumWebDriver_Commands {
    public CC_Matter(WebDriver driver, ExtentTest oExtentTest) {
        super(driver, oExtentTest);
    }
    private static By NewMatter_Header = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title' and @role='heading' and text()='New Matter']");
    private static By DefenseSubType = By.xpath("//div[contains(@id,'NewMatterDV-Counsel_DefenseAttorney')]//div[@role='menuitem']");
    private static By DefendentButton = By.xpath("//div[contains(@id,'Defendant-DefendantMenuIcon')]//div[@role='button']");
    private static By Plantiff_vendor = By.xpath("//div[contains(@id,'Plaintiff-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor')]//div[@role='menuitem']//div[@class='gw-label' and text()='New Vendor']");
    private static By NewLegal_Plantiff = By.xpath("//div[contains(@id,'Plaintiff-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal')]//div[@class='gw-label' and text()='New Legal']");
    private static By NewLegal_Defendent = By.xpath("//div[contains(@id,'Defendant-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal')]//div[@class='gw-label' and text()='New Legal']");

    private static By DefenseAttorneyButton = By.xpath("//div[contains(@id,'Counsel_DefenseAttorneyMenuIcon')]//div[@role='button']");
    private static By PlantiffButton = By.xpath("//div[contains(@id,'Plaintiff-PlaintiffMenuIcon')]//div[@role='button']");
    private static By Defendent_vendor = By.xpath("//div[contains(@id,'Defendant-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor')]//div[@role='menuitem']//div[@class='gw-label' and text()='New Vendor']");
    private static By VendorSubType = By.xpath("//div[contains(@id,'NewContactPickerMenuItemSet_CompanyVendor')]//div[@role='menuitem']");
    private static By Defendent_VendorSubType = By.xpath("//div[contains(@id,'Defendant-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_CompanyVendor')]//div[@role='menuitem']");
    //Autor:Misba
    //Date:09/3/2022
    public static void AutoRepairTowingMedicalDoctorisHiddenunderPlantifSubtypes() throws Throwable {

        try {
            GuidewireAutomate_Validation("Header", NewMatter_Header, "contains", "New Matter");

            GuidewireAutomate("Plantiff Button", PlantiffButton, "clickAndwait", "click");

            GuidewireAutomate("plantiff Vendor", Plantiff_vendor, "moveToElement", "moveToElement");

            String TypeList1 = "Autobody Repair Shop ";
            String TypeList2 = " Auto Towing Agency";
            String TypeList3 = "Doctor";
            String TypeList4 ="Medical Care Organization";
            String SubType =getText_Element(VendorSubType);
            if(SubType.equals(TypeList1)&&SubType.equals(TypeList2)&&SubType.equals(TypeList3)&&SubType.equals(TypeList4)){
                oExtentTest.log(Status.FAIL, "plantiff Under Subtype Displayed  " + TypeList1+", "+TypeList2+", "+TypeList3+","+TypeList4 );
            }
            else {
                oExtentTest.log(Status.PASS, " plantiff Under Subtype Vendor Not Displayed  " + TypeList1+", "+TypeList2+", "+TypeList3+","+TypeList4 );
            }

        } catch (NoSuchElementException e) {

            e.printStackTrace();
            throw e;
        }
    }
    //Autor:Misba
    //Date:09/3/2022
    public static void NewLegalandAttorneyishiddeninDefenseAttorneyField() throws Throwable {

        try {
            GuidewireAutomate_Validation("Header", NewMatter_Header, "contains", "New Matter");
            Thread.sleep(2000);
            GuidewireAutomate("Defense Attorney Button", DefenseAttorneyButton, "clickAndwait", "click");

            Thread.sleep(2000);
            String TypeList1 = "New Legal";
            String TypeList2 = "Attorney";
            String SubType =getText_Element(DefenseSubType);
            if(SubType.equals(TypeList1)&&SubType.equals(TypeList2)){
                oExtentTest.log(Status.FAIL, "Defense Attorney Displayed  " + TypeList1+", "+TypeList2 );
            }
            else {
                oExtentTest.log(Status.PASS, "Defense Attorney Not Displayed  " + TypeList1+", "+TypeList2 );
            }

        } catch (NoSuchElementException e) {

            e.printStackTrace();
            throw e;
        }
    }
    //Autor:Misba
    //Date:09/3/2022
    public static void AutoRepairTowingMedicalDoctorisHiddenunderDefendentSubtypes() throws Throwable {

        try {
            GuidewireAutomate_Validation("Header", NewMatter_Header, "contains", "New Matter");

            GuidewireAutomate("Defendent Button", DefendentButton, "clickAndwait", "click");

            GuidewireAutomate("Defendent Vendor", Defendent_vendor, "moveToElement", "moveToElement");

            String TypeList1 = "Autobody Repair Shop ";
            String TypeList2 = " Auto Towing Agency";
            String TypeList3 = "Doctor";
            String TypeList4 ="Medical Care Organization";
            String SubType =getText_Element(Defendent_VendorSubType);
            if(SubType.equals(TypeList1)&&SubType.equals(TypeList2)&&SubType.equals(TypeList3)&&SubType.equals(TypeList4)){
                oExtentTest.log(Status.FAIL, "Defendent Under Subtype Displayed  " + TypeList1+", "+TypeList2+", "+TypeList3+","+TypeList4 );
            }
            else {
                oExtentTest.log(Status.PASS, " Defendent Under Subtype Vendor Not Displayed  " + TypeList1+", "+TypeList2+", "+TypeList3+","+TypeList4 );
            }

        } catch (NoSuchElementException e) {

            e.printStackTrace();
            throw e;
        }
    }
    //Autor:Misba
    //Date:09/3/2022
    public static void NewLegalandAttorneyishiddeninPlantiff() throws Throwable {

        try {
            GuidewireAutomate_Validation("Header", NewMatter_Header, "contains", "New Matter");
            Thread.sleep(2000);
            GuidewireAutomate("Plantiff Button", PlantiffButton, "clickAndwait", "click");
            GuidewireAutomate("New Legal Plantiff", NewLegal_Plantiff, "moveToElement", "moveToElement");

            By Attorney=By.xpath("//div[@class='gw-label' and text()='Attorney']");

            VerifyElementNotExist("Attorney under Legal",Attorney);

        } catch (NoSuchElementException e) {

            e.printStackTrace();
            throw e;
        }
    }
    public static void NewLegalandAttorneyishiddeninDefendent() throws Throwable {

        try {
            GuidewireAutomate_Validation("Header", NewMatter_Header, "contains", "New Matter");
            Thread.sleep(2000);
            GuidewireAutomate("Defendent Button", DefendentButton, "clickAndwait", "click");
            GuidewireAutomate("New Legal Defedent", NewLegal_Defendent, "moveToElement", "moveToElement");

            By Attorney=By.xpath("//div[@class='gw-label' and text()='Attorney']");

            VerifyElementNotExist("Attorney under Legal",Attorney);

        } catch (NoSuchElementException e) {

            e.printStackTrace();
            throw e;
        }
    }
}
