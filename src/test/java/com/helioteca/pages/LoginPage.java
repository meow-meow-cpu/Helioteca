package com.helioteca.pages;


import com.helioteca.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {                                            //!!!!!!!!!!change locators!!!!!!!!!!!!!!

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy()                       //Kamran
    public WebElement userName;



    @FindBy(id="password")                       //Emily
    public WebElement password;

    @FindBy()                       //Rauf
    public WebElement loginBtn;

    @FindBy()                       //Renita
    public WebElement wrongMsg;


    public void login(String userNameStr, String passwordStr) {
        userName.sendKeys(userNameStr);
        password.sendKeys(passwordStr);
        loginBtn.click();
        // verification that we logged
    }

}
