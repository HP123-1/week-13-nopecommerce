package com.nopecommerce.demo.pages.electronics;

import com.nopecommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ElectronicRegister extends Utility {
    By register = By.xpath("//button[contains(text(),'Register')]");



    public void ClickOnRegisterButton(){
        clickOnElement(register);
    }
}