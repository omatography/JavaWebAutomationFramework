package com.omatography.JavaWebAutomationFramework.vwo.LoginTests;

import com.omatography.JavaWebAutomationFramework.pages.DashboardPage;
import com.omatography.JavaWebAutomationFramework.pages.LoginPage;
import com.omatography.JavaWebAutomationFramework.basetest.BaseTest;
import com.omatography.JavaWebAutomationFramework.driver.DriverManagerTL;
import com.omatography.JavaWebAutomationFramework.utils.PropertyReaderOptimized;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void testLogin() throws Exception {
        DriverManagerTL.getDriver().get(PropertyReaderOptimized.readKeyO("url"));
        DashboardPage dashboardPage = new LoginPage().loginToVWO().afterLogin();
        String expectResult  = dashboardPage.loggedInUserName();
        Assertions.assertThat(expectResult)
                .isNotBlank()
                .isNotNull()
                .contains(PropertyReaderOptimized.readKeyO("expected_username"));
    }
}
