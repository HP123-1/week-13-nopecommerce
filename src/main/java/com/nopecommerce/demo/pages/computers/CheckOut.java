package com.nopecommerce.demo.pages.computers;

import com.nopecommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class CheckOut extends Utility {
    By inputFirstName = By.id("BillingNewAddress_FirstName");
    By inputLastName = By.id("BillingNewAddress_LastName");
    By inputEMailAddress = By.id("BillingNewAddress_Email");
    By inputCompanyName = By.id("BillingNewAddress_Company");
    By inputCountyName = By.id("BillingNewAddress_CountryId");
    By inputStateName = By.id("BillingNewAddress_StateProvinceId");
    By inputCityName = By.id("BillingNewAddress_City");
    By inputAddressLineOne = By.id("BillingNewAddress_Address1");
    By inputAddressLineTwo = By.id("BillingNewAddress_Address2");
    By inputZipPostalCode = By.id("BillingNewAddress_ZipPostalCode");
    By inputPhoneNumber = By.id("BillingNewAddress_PhoneNumber");
    By inputFaxNumber = By.id("BillingNewAddress_FaxNumber");
    By clickSaveButton = By.xpath("//button[@onclick='Billing.save()']");
    By shippingMethodSelect = By.id("shippingoption_1");
    By clickOnContinueButton = By.xpath("(//button[@class='button-1 shipping-method-next-step-button'])[1]");
    By selectCreditCardOption = By.id("paymentmethod_1");
    By clickOnCreditCardContinueButton = By.xpath("(//button[@class='button-1 payment-method-next-step-button'])[1]");
    By creditCardDropDownList = By.id("CreditCardType");
    By cardHolderName = By.id("CardholderName");
    By cardHolderNumber = By.id("CardNumber");
    By cardHolderCVVCode = By.id("CardCode");
    By cardHolderExpYearDropDown = By.id("ExpireYear");
    By cardHolderExpMonthDropDown = By.id("ExpireMonth");
    By confirmCreditCardButton = By.xpath("//button[@onclick='PaymentInfo.save()']");
    By verifyCreditCardPayment = By.xpath("//span[contains(text(),'Credit Card')]");
    By verifyAirShippingMethod = By.xpath("//span[contains(text(),'Next Day Air')]");
    By verifyTotalAmount = By.xpath("//span[contains(text(),'$2,950.00')]");
    By clickOnConfirmOrder = By.xpath("//button[contains(text(),'Confirm')]");
    By verifyThankYou = By.xpath("//h1[contains(text(),'Thank you')]");
    By verifyOrderSuccessfulMessage = By.xpath("//div[@class='page checkout-page order-completed-page']//div/strong[contains(text(),'Your order has been successfully processed!')]");
    By clickOnFinalContinueButton = By.xpath("//button[contains(text(),'Continue')]");
    By verifyWelcomeMessage = By.xpath("//h2[contains(text(),'Welcome to our store')]");

    public void basicFormFillUp() {
        doubleClickAndSendKeysOnElement(inputFirstName, "krishna");
        doubleClickAndSendKeysOnElement(inputLastName, "patel");
        doubleClickAndSendKeysOnElement(inputEMailAddress, "abc@yahoo.com");
        doubleClickAndSendKeysOnElement(inputCompanyName, "Jira & Co.");
        selectValueFromdropDown(inputCountyName, "133");
        clickOnElement(inputStateName);
        doubleClickAndSendKeysOnElement(inputCityName, "London");
        doubleClickAndSendKeysOnElement(inputAddressLineOne, "123, Kenton Road");
        doubleClickAndSendKeysOnElement(inputAddressLineTwo, "Nr. Themes PostOffice");
        doubleClickAndSendKeysOnElement(inputZipPostalCode, "887654");
        doubleClickAndSendKeysOnElement(inputPhoneNumber, "07436912345");
        doubleClickAndSendKeysOnElement(inputFaxNumber, "0289998687");
        clickOnElement(clickSaveButton);
    }

    public void setShippingMethodSelect() {
        clickOnElement(shippingMethodSelect);
        clickOnElement(clickOnContinueButton);
    }

    public void selectCreditCardOption() {
        clickOnElement(selectCreditCardOption);
        clickOnElement(clickOnCreditCardContinueButton);
    }

    public void fillCreditCardDetails() {
        selectValueFromdropDown(creditCardDropDownList, "MasterCard");
        doubleClickAndSendKeysOnElement(cardHolderName, "krishna Patel");
        doubleClickAndSendKeysOnElement(cardHolderNumber, "5555555555554444");
        selectValueFromdropDown(cardHolderExpMonthDropDown, "7");
        selectValueFromdropDown(cardHolderExpYearDropDown, "2025");
        doubleClickAndSendKeysOnElement(cardHolderCVVCode, "123");
        clickOnElement(confirmCreditCardButton);
    }

    public String setVerifyCreditCardPayment() {
        return getTextElement(verifyCreditCardPayment);
    }

    public String setVerifyAirShippingMethod() {
        return getTextElement(verifyAirShippingMethod);
    }

    public String setVerifyTotalAmount() {
        return getTextElement(verifyTotalAmount);
    }

    public void setClickOnConfirmOrder() {
        clickOnElement(clickOnConfirmOrder);
    }

    public String setVerifyThankyou() {
        return getTextElement(verifyThankYou);
    }

    public String setVerifyOrderSuccessfulMessage() {
        return getTextElement(verifyOrderSuccessfulMessage);
    }

    public void finalContinueButton() {
        clickOnElement(clickOnFinalContinueButton);
    }

    public String setVerifyWelcomeMessage() {
        return getTextElement(verifyWelcomeMessage);
    }
}