package com.helioteca.pages;

import com.helioteca.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilesPage_KA extends BasePage{

    public FilesPage_KA(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath ="//*[@id=\"appmenu\"]/li[1]/a")
    public WebElement filesBtn;

    @FindBy(xpath = "//button[@class='settings-button']")
    public WebElement settingBtn;

    @FindBy(xpath = "//*[@id=\"files-setting-richworkspace\"]/label")
    public WebElement checkBox1;

    @FindBy(xpath = "//*[@id=\"recommendations-setting-enabled\"]/label")
    public WebElement checkBox2;

    @FindBy(xpath = "//*[@id=\"files-setting-showhidden\"]/label")
    public WebElement checkBox3;






}
