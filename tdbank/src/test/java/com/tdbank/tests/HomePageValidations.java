package com.tdbank.tests;

import com.core.base.TestBase;
import com.gargoylesoftware.htmlunit.Page;
import com.tdbank.pages.HomePage;
import com.tdbank.pages.LoginPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageValidations extends TestBase {

    HomePage homePage;
    LoginPage loginPage;

    @BeforeMethod
    public void setUpPOM(){
        homePage = PageFactory.initElements(driver, HomePage.class);
        loginPage = PageFactory.initElements(driver, LoginPage.class);
    }

    @Test
    public void validateThatUserCanClickOnAccountsButton(){
//        homePage.validateAccountsBtn();
        homePage.clickOnAccountsBtn();
//        loginPage.validateUserIsInLoginPage();
    }

    @Test(enabled = false)
    public void validateThatUserCanClickOnTransferButton(){
        homePage.validateTransferBtn();
        homePage.clickOnTransferBtn();
        loginPage.validateUserIsInLoginPage();
    }

    @Test(enabled = false)
    public void validateThatUserCanClickOnDepositButton(){
        homePage.validatedDepositBtn();
        homePage.clickOnDepositBtn();
        loginPage.validateUserIsInLoginPage();
    }

    @Test(enabled = false)
    public void validateThatUserCanClickOnSendMoneyButton(){
        homePage.validatedSendMoneyBtn();
        homePage.clickOnSendMoneyBtn();
        loginPage.validateUserIsInLoginPage();
    }

    @Test(enabled = false)
    public void validateThatUserCanClickOnPayABillButton(){
        homePage.validatedPayABillBtn();
        homePage.clickOnPayABillBtn();
        loginPage.validateUserIsInLoginPage();
    }


}
