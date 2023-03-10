package com.helioteca.pages;

import com.helioteca.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RemoveFromFavoritesPageRA extends LoginPage {

    @FindBy(css = "a[id='nextcloud']")
    public WebElement homePage;

    public WebElement navigateToModule(String moduleName){
        return Driver.getDriver().findElement(By.xpath("//ul[@id='appmenu']//a[@aria-label='"+moduleName+"']"));
    }

    @FindBy(xpath = "//tbody//span[.='Helioteca']/..//a[@data-action='menu']")
    public WebElement actionBtn;

    public WebElement navigateToOption(String optionName){
        return Driver.getDriver().findElement(By.xpath("//ul//li//a//span[.='"+optionName+"']"));
    }

    public WebElement navigateToSubModule(String submodule){
        return Driver.getDriver().findElement(By.xpath("//ul//li//a[.='"+submodule+"']"));
    }

    @FindBy(xpath = "//table[@class='list-container']//tr[@data-file='Helioteca']")
    public WebElement folderInFavorites;

}
