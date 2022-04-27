package com.Test.Guidewire.PolicyCenter;

import com.Utils.Selenium.GW_GetDriver;
import com.pages.Guidewire.GW_CM_PC_BC_CC_Login;
import com.pages.Guidewire.Tab_Menu_Navigation;
import org.testng.annotations.Test;

public class Test_ADL_CommunityModel extends GW_GetDriver {


    @Test
    public void AUT_PC_ActivitiesAndQueues() throws Throwable {

    }
    @Test
    public void AUT_PC_UWRules() throws Throwable {

    }
    @Test
    public void AUT_PC_ProducerManagementSystem() throws Throwable {

    }
    @Test
    public void AUT_PC_AffinityGroups() throws Throwable {

    }
    @Test
    public void AUT_PC_UserAndGroups() throws Throwable {

    }
    @Test
    public void AUT_PC_UserProfile() throws Throwable {

    }
    @Test
    public void AUT_PC_RolesAndPermission() throws Throwable {

    }
    //admin-user and settings----

    @Test
    public void AUT_PC_Admin_UserAndSecurity_Users() throws Throwable {


    }
    @Test
    public void AUT_PC_Admin_UserAndSecurity_NewUsers() throws Throwable {
        // login to pc
        GW_CM_PC_BC_CC_Login.login_PolicyCenter_User("SuperUser");
        Tab_Menu_Navigation.pcTabNavigation("UsersAndSecurity","");
        Tab_Menu_Navigation.pcMenuNavigation("NewUser");


    }

    @Test
    public void AUT_PC_Admin_UserAndSettings_Groups() throws Throwable {

    }
    @Test
    public void AUT_PC_Admin_UserAndSettings_Roles() throws Throwable {

    }
    @Test
    public void AUT_PC_Admin_UserAndSettings_Regions() throws Throwable {

    }
    @Test
    public void AUT_PC_Admin_UserAndSettings_Organisations() throws Throwable {

    }
    @Test
    public void AUT_PC_Admin_UserAndSettings_ProducerCodes() throws Throwable {

    }
    @Test
    public void AUT_PC_Admin_UserAndSettings_AuthorityProfiles() throws Throwable {

    }
    @Test
    public void AUT_PC_Admin_UserAndSettings_Attributes() throws Throwable {

    }
    @Test
    public void AUT_PC_Admin_UserAndSettings_AffinityGroups() throws Throwable {

    }

    //Admin-business settings

    @Test
    public void AUT_PC_Admin_BusinessSettings_ActivityPatterns() throws Throwable {

    }
    @Test
    public void AUT_PC_Admin_BusinessSettings_Holidays() throws Throwable {

    }
    @Test
    public void AUT_PC_Admin_BusinessSettings_BusinessRules() throws Throwable {

    }
    @Test
    public void AUT_PC_Admin_BusinessSettings_PolicyFromPatterns() throws Throwable {

    }
    @Test
    public void AUT_PC_Admin_BusinessSettings_PolicyHold() throws Throwable {

    }
    //Admin-Monitoring
    @Test
    public void AUT_PC_Admin_Monitoring_Messages() throws Throwable {

    }
    @Test
    public void AUT_PC_Admin_Monitoring_MessagesQueues() throws Throwable {

    }
    @Test
    public void AUT_PC_Admin_Monitoring_Workflow() throws Throwable {

    }
    @Test
    public void AUT_PC_Admin_Monitoring_Workflow_Statistics() throws Throwable {

    }
   //Admin-utilities

    @Test
    public void AUT_PC_Admin_Utilities_ImportData() throws Throwable {

    }
    @Test
    public void AUT_PC_Admin_Utilities_ExportData() throws Throwable {

    }
    @Test
    public void AUT_PC_Admin_Utilities_ScriptParameters() throws Throwable {

    }
    @Test
    public void AUT_PC_Admin_Utilities_SpreadSheetExportFormat() throws Throwable {

    }
    @Test
    public void AUT_PC_Admin_Utilities_DataChange() throws Throwable {

    }
    @Test
    public void AUT_PC_Admin_Utilities_RuntimeProperties() throws Throwable {

    }
    @Test
    public void AUT_PC_Admin_Utilities_InboundFiles() throws Throwable {

    }
    @Test
    public void AUT_PC_Admin_Utilities_OutboundFiles() throws Throwable {

    }
    //Actions-new transactions
    @Test
    public void AUT_PC_Actions_NewUsers() throws Throwable {

    }
    @Test
    public void AUT_PC_Actions_NewGroup() throws Throwable {

    }
    @Test
    public void AUT_PC_Actions_NewOrganization() throws Throwable {

    }
    @Test
    public void AUT_PC_Actions_NewProducerCode() throws Throwable {

    }
    @Test
    public void AUT_PC_Actions_NewAffinityGroup() throws Throwable {

    }
    @Test
    public void AUT_PC_SearchEditAndUpdateFunctionalities() throws Throwable {

    }


}
