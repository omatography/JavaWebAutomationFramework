package com.omatography.JavaWebAutomationFramework.base;

import com.omatography.JavaWebAutomationFramework.driver.DriverManagerTL;
import com.omatography.JavaWebAutomationFramework.utils.InitBrowser;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;

public class ConfigTestBase extends InitBrowser {

    @BeforeMethod
    protected void setUp() throws MalformedURLException {
        DriverManagerTL.init();
    }

    @AfterMethod
    protected void tearDown(){
        DriverManagerTL.down();
    }

}
