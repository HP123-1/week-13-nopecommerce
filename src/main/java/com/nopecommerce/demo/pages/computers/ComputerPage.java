package com.nopecommerce.demo.pages.computers;

import com.nopecommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ComputerPage extends Utility {
    By computerPageTitle = By.xpath("//h1[normalize-space()='Computers']");
    By selectDesktopOption = By.xpath("//li[@class='active last']//a[normalize-space()='Desktops']");
    By selectShortByMenu = By.xpath("//select[@id='products-orderby']");
    By selectComputerOption = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']");

    public String getComputerPageTitle() {
        return getTextElement(computerPageTitle);
    }


    public void selectDesktopOption() {
        mouseHoverToElement(selectComputerOption);
        clickOnElement(selectDesktopOption);
        clickOnElement(selectShortByMenu);
    }
}

