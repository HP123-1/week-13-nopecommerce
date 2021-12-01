package com.nopecommerce.demo.pages.computers;

import com.nopecommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ElectronicsPage extends Utility {
    By electronicsPageTitle = By.xpath("//h1[normalize-space()='Electronics']");


    public String getElectronicsPageTitle() {

        return getTextElement(electronicsPageTitle);
    }
}
