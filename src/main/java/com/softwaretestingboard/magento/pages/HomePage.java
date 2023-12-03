package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By womenTab = By.xpath("//span[contains(text(),'Women')]");
    By topsInWomenDropdown = By.xpath("//li[contains(@class,'nav-2-1 ')]/child::a");
    By jacketsInTops = By.xpath("//li[contains(@class,'nav-2-1 ')]/child::ul/child::li[1]/child::a");
    By mensTab = By.xpath("//span[normalize-space()='Men']");
    By bottomsInMensDropdown = By.xpath("//a[@id='ui-id-18']");
    By pantsInBottoms = By.xpath("//a[@id='ui-id-23']//span[contains(text(),'Pants')]");
    By gearTab = By.xpath("//span[normalize-space()='Gear']");
    By bagsInGear = By.xpath("//span[normalize-space()='Bags']");



    public void mouseHoverOnWomenTab(){
        waitUntilVisibilityOfElementLocated(womenTab,5);
        mouseHoverToElement(womenTab);
    }

    public void mouseHoverOnTopsInWomenTab(){
        waitUntilVisibilityOfElementLocated(topsInWomenDropdown,5);
        mouseHoverToElement(topsInWomenDropdown);
    }

    public void mouseHoverAndClickOnJacketsInWomen(){
        waitUntilVisibilityOfElementLocated(jacketsInTops,5);
        mouseHoverToElementAndClick(jacketsInTops);
    }

    public void mouseHoverOnMensTab(){
        waitUntilVisibilityOfElementLocated(womenTab,5);
        mouseHoverToElement(mensTab);
    }

    public void mouseHoverOnBottomsInMensTab(){
        waitUntilVisibilityOfElementLocated(bottomsInMensDropdown,5);
        mouseHoverToElement(bottomsInMensDropdown);
    }

    public void mouseHoverAndClickOnPantsInBottoms(){
        waitUntilVisibilityOfElementLocated(pantsInBottoms,5);
        mouseHoverToElementAndClick(pantsInBottoms);
    }

    public void mouseHoverOnGearTab(){
        waitUntilVisibilityOfElementLocated(gearTab,5);
        mouseHoverToElement(gearTab);
    }

    public void mouseHoverAndClickOnBagsInGear(){
        waitUntilVisibilityOfElementLocated(bagsInGear,5);
        mouseHoverToElementAndClick(bagsInGear);
    }
}