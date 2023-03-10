package com.helioteca.pages;

import com.helioteca.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_DY {
    public LoginPage_DY(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy (id ="user")
    public WebElement userName;


    @FindBy(id ="password")
    public WebElement password;


    @FindBy(id ="submit-form")
    public WebElement loginBtn;

    @FindBy(className = "warning wrongPasswordMsg")
    public WebElement wrongMsg;

    }

