package com.helioteca.pages;

import com.helioteca.utilities.BrowserUtils;
import com.helioteca.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UploadFilePage_RA extends LoginPage{

    @FindBy(css = "a[id='nextcloud']")
    public WebElement dashboardPage;

    public WebElement navigateToModule(String moduleName){
        return Driver.getDriver().findElement(By.xpath("//ul//li//a[@aria-label='" + moduleName + "']"));
    }

    @FindBy(xpath = "//span[@class='icon icon-add']")
    public WebElement uploadIconBtn;

    @FindBy(xpath = "//input[@type='file']")
    public WebElement uploadFileOpt;

    @FindBy(xpath = "//span[.='UploadFile_RA']")
    public WebElement uploadedFile;

//    @FindBy(xpath = "//tbody//tr[@data-file='Helioteca_Upload_File.txt']/td")
//    public WebElement uploadedFileCheckBox;
//
//    @FindBy(xpath = "//span[.='Actions']")
//    public WebElement actionsBtn;
//
//    @FindBy(xpath = "//ul//li//span[.='Delete']")
//    public WebElement deleteOptionBtn;
//
//    public void deleteUploadedFile(){
//        uploadedFileCheckBox.click();
//        BrowserUtils.sleep(1);
//        actionsBtn.click();
//        BrowserUtils.sleep(1);
//        deleteOptionBtn.click();
//        BrowserUtils.sleep(1);
//    }



}
