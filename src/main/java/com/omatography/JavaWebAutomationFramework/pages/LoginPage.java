package com.omatography.JavaWebAutomationFramework.pages;


import com.omatography.JavaWebAutomationFramework.base.BasePage;
import com.omatography.JavaWebAutomationFramework.utils.PropertyReaderOptimized;
import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    public LoginPage() {
        super();
    }

    // Page Locators
    By username = By.id("login-username");
    By password = By.id("login-password");
    By signButton = By.id("js-login-btn");

    // Page Actions

    public LoginPage loginToVWO() throws Exception {
        enterInput(username, PropertyReaderOptimized.readKeyO("username"));
        enterInput(password, PropertyReaderOptimized.readKeyO("password"));
        clickElement(signButton);
        return this;
    }

    public DashboardPage afterLogin() {
        return new DashboardPage();
    }


}
