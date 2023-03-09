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

    @FindBy(xpath = "//div[@class='favorite-mark permanent']/../../..//a[@data-action='menu']")
    public WebElement favoriteActionBtn;

    public WebElement navigateToOption(String optionName){
        return Driver.getDriver().findElement(By.xpath("//ul//li//a//span[.='"+optionName+"']"));
    }

    @FindBy(linkText = "Favorites")
    public WebElement favoritesSubModule;



    @FindBy(xpath = "//tbody//span[.='Helioteca Folder']/..//a[@data-action='menu']")
    public WebElement actionBtn;
    public void addToFavorites(){
        navigateToModule("Files").click();
        actionBtn.click();
        navigateToOption("Favorite");

    }

}
