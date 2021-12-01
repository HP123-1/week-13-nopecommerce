package com.nopecommerce.demo.pages.computers;

import com.nopecommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class GiftCardsPage extends Utility {
    By giftCardsPageTitle = By.xpath("//h1[normalize-space()='Gift Cards']");

    public String getGiftPageTitle() {
        return getTextElement(giftCardsPageTitle);
    }
}
