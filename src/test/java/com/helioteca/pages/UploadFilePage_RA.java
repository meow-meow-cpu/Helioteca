package com.helioteca.pages;

import com.helioteca.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UploadFilePage_RA extends LoginPage{


    public static WebElement navigateToModule(String moduleName){
        return Driver.getDriver().findElement(By.xpath("//ul//li//a[@aria-label='" + moduleName + "']"));
    }

}
