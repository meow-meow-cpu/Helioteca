package com.helioteca.pages;


import com.helioteca.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {                                            //!!!!!!!!!!change locators!!!!!!!!!!!!!!

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy (id ="user")
    public WebElement userName;


    @FindBy(id ="password")
    public WebElement password;


    @FindBy(id ="submit-form")
   public WebElement loginBtn;

    @FindBy(xpath = "//p[@class='warning wrongPasswordMsg']")
    public WebElement wrongMsg;

  // @FindBy(className = "warning_wrongPasswordMsg")
   // public WebElement wrongMsg;
    
    public void login(String userNameStr, String passwordStr) {
        userName.sendKeys(userNameStr);
        password.sendKeys(passwordStr);
        loginBtn.click();
        // verification that we logged
    }



}
