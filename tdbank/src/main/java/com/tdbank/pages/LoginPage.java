package com.tdbank.pages;

import com.core.report.ExtentTestManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoginPage {

    private static final Logger LOGGER =Logger.getLogger(LoginPage.class);

    @FindBy(xpath="")
    private WebElement logoFromLoginPage;

    public void validateUserIsInLoginPage(){
        Assert.assertTrue(logoFromLoginPage.isDisplayed(), "Login page is not displayed");
        ExtentTestManager.log("Validated login page", LOGGER);
    }

}
