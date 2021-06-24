package com.tdbank.pages;

import com.core.report.ExtentTestManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage {

    private static Logger LOGGER = Logger.getLogger(HomePage.class);
    @FindBy(xpath="//android.widget.Button[@text='ACCOUNTS']")
    private WebElement accountsBtn;

    public void clickOnAccountsBtn(){
        accountsBtn.click();
        ExtentTestManager.log("Cliked on accounts Button", LOGGER);
    }

    public void validateAccountsBtn(){
        accountsBtn.isDisplayed();
        Assert.assertTrue( accountsBtn.isDisplayed(), "Account button is not displayed");
        ExtentTestManager.log("Validated accounts button", LOGGER);
    }

    @FindBy(xpath="//android.widget.Button[@text='TRANSFER']")
    private WebElement transferBtn;

    public void clickOnTransferBtn(){
        transferBtn.click();
        ExtentTestManager.log("Clicked on transfer Button", LOGGER);
    }
    public void validateTransferBtn(){
        accountsBtn.isDisplayed();
        Assert.assertTrue( transferBtn.isDisplayed(), "Transer button is not displayed");
        ExtentTestManager.log("Validated transfer button", LOGGER);
    }

    @FindBy(xpath="//android.widget.Button[@text='DEPOSIT']")
    private WebElement depositBtn;

    public void clickOnDepositBtn(){
        depositBtn.click();
        ExtentTestManager.log("Clicked on deposit Button", LOGGER);
    }

    public void validatedDepositBtn(){
        depositBtn.isDisplayed();
        Assert.assertTrue( depositBtn.isDisplayed(), "Deposit  button is not displayed");
        ExtentTestManager.log("Validated deposit button", LOGGER);
    }

    @FindBy(xpath="//android.widget.Button[@text='SEND MONEY']")
    private WebElement sendMoneyBtn;

    public void clickOnSendMoneyBtn(){
        sendMoneyBtn.click();
        ExtentTestManager.log("Clicked on send money Button", LOGGER);
    }

    public void validatedSendMoneyBtn(){
        sendMoneyBtn.isDisplayed();
        Assert.assertTrue( sendMoneyBtn.isDisplayed(), "Send money button is not displayed");
        ExtentTestManager.log("Validated send money button", LOGGER);
    }

    @FindBy(xpath="//android.widget.Button[@text='PAY A BILL']")
    private WebElement payABillBtn;

    public void clickOnPayABillBtn(){
        payABillBtn.click();
        ExtentTestManager.log("Clicked on pay a bill Button", LOGGER);
    }

    public void validatedPayABillBtn(){
        payABillBtn.isDisplayed();
        Assert.assertTrue( payABillBtn.isDisplayed(), "Pay a bill button is not displayed");
        ExtentTestManager.log("Validated pay a bill button", LOGGER);
    }

}
