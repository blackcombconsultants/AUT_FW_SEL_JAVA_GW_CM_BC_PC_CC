package com.pages.Guidewire.PolicyCenter;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.pages.Guidewire.PolicyCenter.CommercialAuto.CA_Reusables;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PC_Administration extends SeleniumWebDriver_Commands {
    static Selenium_Utils_DataBase oDB = new Selenium_Utils_DataBase();

    public PC_Administration(WebDriver driver, ExtentTest oExtentTest) {
        super(driver, oExtentTest);
    }

    /*
    * New user
     */
    //Basics
    private static By NewUser_BasicsHeader = By.xpath("//div[contains(@id,'UserDetail_BasicCardTab')]//div[@role='tab']");
    private static By Basics_FirstName = By.xpath("//input[contains(@name,'GlobalPersonNameInputSet-FirstName')]");
    private static By Basics_LastName = By.xpath("//input[contains(@name,'GlobalPersonNameInputSet-LastName')]");
    private static By Basics_UserName = By.xpath("//input[contains(@name,'UserDetailInputSet-Username')]");
    private static By Basics_Password = By.xpath("//input[contains(@name,'UserDetailInputSet-PasswordInputWidget')]");
    private static By Basics_ConfirmPassword = By.xpath("//input[contains(@name,'UserDetailInputSet-ConfirmInputWidget')]");
    private static By Basics_UserType = By.xpath("//select[@name='NewUser-UserDetailScreen-UserDetailDV-UserType']");
    private static By Basics_PrimaryPhone = By.xpath("//select[@name='NewUser-UserDetailScreen-UserDetailDV-PrimaryPhone']");
    private static By Basics_MobilePhone = By.xpath("//input[contains(@name,'CellPhone-GlobalPhoneInputSet-NationalSubscriberNumber')]");

    //Attributes
    private static By NewUser_AttributesHeader = By.xpath("//div[contains(@id,'UserDetail_AttributesCardTab')]//div[@role='tab']");

    //Access
    private static By NewUser_AccessHeader = By.xpath("//div[contains(@id,'UserDetail_AccessCardTab')]//div[@role='tab']");
    private static By Access_AddGroupsButton = By.xpath("//div[contains(@id,'UserDetail_AccessDV-UserGroupsLV_tb-Add')]//div[@role='button']");
    private static By Access_BrowseGroups = By.xpath("//div[contains(@id,'OrganizationGroupTreePopupScreen-ttlBar')]//div[@role='heading']");
    private static By Access_AddGroups = By.xpath("//div[contains(@id,'OrganizationGroupTreePopupPicker-0-1_label')]");
    private static By Access_LoadFactor = By.xpath("//input[contains(@name,'UserGroupsLV-0-LoadFactor')]");

    //Roles
    private static By NewUser_RolesHeader = By.xpath("//div[@id='NewUser-UserDetailScreen-UserDetail_RolesCardTab']//div[@role='tab']");
    private static By Roles_AddButton = By.xpath("//div[@id='NewUser-UserDetailScreen-UserRolesLV_tb-Add']//div[@role='button']");
    private static By Roles_SelectName = By.xpath("//select[@name='NewUser-UserDetailScreen-UserRolesLV-0-RoleName']");

    //profile
    private static By NewUser_ProfileHeader = By.xpath("//div[contains(@id,'UserDetail_ProfileCardTab')]//div[@role='tab']");

    //Region
    private static By NewUser_RegionHeader = By.xpath("//div[contains(@id,'UserDetail_RegionCardTab')]//div[@role='tab']");

    //UW Authority
    private static By NewUser_UWAuthorityHeader = By.xpath("//div[contains(@id,'UserDetail_AuthorityCardTab')]//div[@role='tab']");
    private static By UWAuthority_AddButton = By.xpath("//div[contains(@id,'UserAuthorityLV_tb-Add')]//div[@role='button']");
    private static By UWAuthority_SelectProfileName = By.xpath("//select[@name='NewUser-UserDetailScreen-UserAuthorityLV-0-Name']");
    public static void NewUserBasics() throws Throwable {
        try {
            lhm_TestCase_Table_Data =PolicyCenter_Resuables.getData_PolicyCenter("NewUser");
            GuidewireAutomate_Validation("Screen Header",PolicyCenter_Resuables_PO.Screen_Header,"contains","New User");
            GuidewireAutomate_Validation("Basics Header",NewUser_BasicsHeader,"equals","Basics");
            GuidewireAutomate("FirstName",Basics_FirstName,"clearANDsendKeys",lhm_TestCase_Table_Data.get("Basics_FirstName"));
            GuidewireAutomate("LastName",Basics_LastName,"clearANDsendKeys",lhm_TestCase_Table_Data.get("Basics_LastName"));
            GuidewireAutomate("UserName",Basics_UserName,"clearANDsendKeys",lhm_TestCase_Table_Data.get("Basics_UserName"));
            GuidewireAutomate("Password",Basics_Password,"clearANDsendKeys",lhm_TestCase_Table_Data.get("Basics_Password"));
            GuidewireAutomate("ConfirmPassword",Basics_ConfirmPassword,"clearANDsendKeys",lhm_TestCase_Table_Data.get("Basics_ConfirmPassword"));
            GuidewireAutomate("UserType",Basics_UserType,"selectByVisibleText",lhm_TestCase_Table_Data.get("Basics_UserType"));
            getStaleElement("PrimaryPhone",Basics_PrimaryPhone);
            GuidewireAutomate("PrimaryPhone",Basics_PrimaryPhone,"selectByVisibleText",lhm_TestCase_Table_Data.get("Basics_PrimaryPhone"));
            GuidewireAutomate("MobilePhone",Basics_MobilePhone,"clearANDsendKeys",lhm_TestCase_Table_Data.get("Basics_MobilePhone"));
            oExtentTest.log(Status.PASS, "NewUserBasics is Added");
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static void NewUserAccess() throws Throwable {
        try {
            lhm_TestCase_Table_Data =PolicyCenter_Resuables.getData_PolicyCenter("NewUser");
            getStaleElement("Access Header",NewUser_AccessHeader);
            GuidewireAutomate("Access Header",NewUser_AccessHeader,"clickAndwait","click");
            GuidewireAutomate("Add Button",Access_AddGroupsButton,"clickAndwait","click");
            GuidewireAutomate_Validation("Browse GroupsHeader",Access_BrowseGroups,"contains","Browse Groups");
            GuidewireAutomate("Add Groups",Access_AddGroups,"clickAndwait","click");
            GuidewireAutomate("load factor",Access_LoadFactor,"clearANDsendKeys",lhm_TestCase_Table_Data.get("Access_LoadFactor"));
            oExtentTest.log(Status.PASS, "NewUserAccess is Added");
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
    public static void NewUserRoles() throws Throwable {
        try {
            lhm_TestCase_Table_Data =PolicyCenter_Resuables.getData_PolicyCenter("NewUser");
            getStaleElement("Roles Header",NewUser_RolesHeader);
            GuidewireAutomate("Roles Header",NewUser_RolesHeader,"clickAndwait","click");
            GuidewireAutomate("Add Button",Roles_AddButton,"clickAndwait","click");
            GuidewireAutomate("Select Name",Roles_SelectName,"selectByVisibleText",lhm_TestCase_Table_Data.get("Roles_SelectName"));
            oExtentTest.log(Status.PASS, "NewUserRoles is Added");
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static void NewUserUWAuthority() throws Throwable {
        try {
            lhm_TestCase_Table_Data = PolicyCenter_Resuables.getData_PolicyCenter("NewUser");
            getStaleElement("Roles Header",NewUser_UWAuthorityHeader);
            GuidewireAutomate("Roles Header",NewUser_UWAuthorityHeader,"clickAndwait","click");
            GuidewireAutomate("Add Button",UWAuthority_AddButton,"clickAndwait","click");
            GuidewireAutomate("Select Name",UWAuthority_SelectProfileName,"selectByVisibleText",lhm_TestCase_Table_Data.get("UWAuthority_SelectProfileName"));
            oExtentTest.log(Status.PASS, "NewUserUWAuthority is Added");
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
}
