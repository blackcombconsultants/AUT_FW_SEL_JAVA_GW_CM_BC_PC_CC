package com.Test.Guidewire.PolicyCenter;

import com.Utils.Selenium.GW_GetDriver;
import com.pages.Guidewire.GW_CM_PC_BC_CC_Login;
import com.pages.Guidewire.PolicyCenter.PC_Account;
import com.pages.Guidewire.Tab_Menu_Navigation;
import org.testng.annotations.Test;

public class PC_OOS_Process extends GW_GetDriver {
    @Test
    public void AUT_PC_OOS_Process() throws Throwable {

        GW_CM_PC_BC_CC_Login.login_PolicyCenter();




    }
}
