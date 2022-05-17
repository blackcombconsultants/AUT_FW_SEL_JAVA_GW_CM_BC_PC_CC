package com.Test.Guidewire.PolicyCenter;

import com.Utils.Selenium.GW_GetDriver;
import com.pages.Guidewire.GW_CM_PC_BC_CC_Login;
import com.pages.Guidewire.PolicyCenter.PC_Account;
import com.pages.Guidewire.Tab_Menu_Navigation;
import org.testng.annotations.Test;

public class GW_PC_Account_Company extends GW_GetDriver {
    @Test
    public void AUT_CreateNewCompanyAccount() throws Throwable {

        GW_CM_PC_BC_CC_Login.login_PolicyCenter();
        Tab_Menu_Navigation.pcTabNavigation("New Account", "NA");
        PC_Account.createCompanyAccount();
        GW_CM_PC_BC_CC_Login.logout_PolicyCenter();

    }
}
