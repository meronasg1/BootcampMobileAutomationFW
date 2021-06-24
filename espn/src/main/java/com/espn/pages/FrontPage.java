package com.espn.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FrontPage {

    @FindBy(xpath="//android.widget.Button[@text='LOG IN']")
    private WebElement logInBtn;

    public void clickOnLoginBtn(){
        logInBtn.click();
    }
}
