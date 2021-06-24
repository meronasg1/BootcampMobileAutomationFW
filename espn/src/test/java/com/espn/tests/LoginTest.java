package com.espn.tests;

import com.core.base.TestBase;
import com.espn.pages.FrontPage;
import com.espn.pages.LoginPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    FrontPage frontPage;
    LoginPage loginPage;

    @BeforeMethod
    public void setUpPOM(){
        frontPage= PageFactory.initElements(driver, FrontPage.class);
        loginPage=PageFactory.initElements(driver, LoginPage.class);
    }

    @Test
    public void validateUserCanLoginUsingValidCredentials(){
        frontPage.clickOnLoginBtn();
        loginPage.typeOnUserNamefield("meronasg1@gmail.com");
        loginPage.typeOnPasswordField("#abcd1234");
        loginPage.clickOnLoginButton();
    }


}
