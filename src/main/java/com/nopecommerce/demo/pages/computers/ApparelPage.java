package com.nopecommerce.demo.pages.computers;

import com.nopecommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ApparelPage extends Utility {
    By apparelTitle = By.xpath("//h1[normalize-space()='Apparel']");
    public String getApparelPageTitle(){
        return getTextElement(apparelTitle);
    }

}

