package com.nopecommerce.demo.pages.computers;

import com.nopecommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class CellPhone extends Utility {
    By verifyCellTextonPage= By.xpath("//h1[normalize-space()='Cell phones']");


    public String setVerifyCellTextOnPage(){
        return getTextElement(verifyCellTextonPage);
    }

}