package com.espn.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoginPage {

    @FindBy(xpath="//android.widget.EditText[@resource-id='InputLoginValue']")
    private WebElement userNameField;

    public void validateUserNameField(){
       Assert.assertTrue(userNameField.isDisplayed(), "UserName field is not displayed" );
    }
    public void typeOnUserNamefield(String data){
        userNameField.sendKeys(data);
    }

    @FindBy(xpath="//android.widget.EditText[@resource-id='InputPassword']")
    private WebElement passwordField;

    public void typeOnPasswordField(String data){
        passwordField.sendKeys(data);
    }

    @FindBy(xpath="//android.widget.Button[@resource-id='BtnSubmit']")
    private WebElement loginButton;

    public void clickOnLoginButton(){
        loginButton.click();
    }

}
