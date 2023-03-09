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
//
//    public WebElement navigateToOption(String optionName){
//        return Driver.getDriver().findElement(By.xpath("//tr/td//a[@data-action='"+optionName+"']"));
//    }
//
//    @FindBy(id = "commentsTabView")
//    public WebElement commentTabBtn;
//
//    @FindBy(xpath = "//div[@class='message']")
//    public WebElement inputBox;
//
//    @FindBy(xpath = "//div[@class='message']/following-sibling::input")
//    public WebElement submitBtn;
//
//    public WebElement displayedComment(String comment){
//        return Driver.getDriver().findElement(By.xpath("//ul[@class='comments']//li//div[.='"+comment+"']"));
//    }

}
