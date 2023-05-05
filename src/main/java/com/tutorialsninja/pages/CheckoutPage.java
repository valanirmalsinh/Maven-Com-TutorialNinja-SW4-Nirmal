package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class CheckoutPage extends Utility {
    By firstName = By.xpath("//input[@id='input-payment-firstname']");
    By lastName = By.xpath("//input[@id='input-payment-lastname']");
    By email= By.xpath("//input[@id='input-payment-email']");
    By telephone = By.xpath("//input[@id='input-payment-telephone']");
    By address = By.xpath("//input[@id='input-payment-address-1']");
    By city = By.xpath("//input[@id='input-payment-city']");
    By postcode =By.xpath("//input[@id='input-payment-postcode']");
    By country = By.xpath("//select[@id='input-payment-country']");
    By state = By.xpath("//select[@id='input-payment-zone']");
    By continueButtonguest =By.xpath("//input[@id='button-guest']");
    By  termsandCondition = By.name("agree");
    By continueButtonpayment = By.xpath("//input[@id='button-payment-method']");
    By warningMessageText = By.xpath("//div[text()='Warning: Payment method required!']");
    By textArea = By.tagName("textarea");

    public void enterFirstname(){
        sendTextToElement(firstName,"Kiara");
    }
    public void enterLastName(){
        sendTextToElement(lastName,"Parikh");
    }
    public void enterEmail(){
        sendTextToElement(email,"kp1309@gmail.com");
    }
    public void enterTelephone(){
      sendTextToElement(telephone,"07878613517");
    }
    public void enterAddress() {
        sendTextToElement(address, "Maven Street");
    }
    public void enterCity(){
       sendTextToElement(city,"London");
    }
    public void enterPostcode(){
       sendTextToElement(postcode,"T12 3NG");
    }
    public void enterCountry(){
     sendTextToElement(country,"United Kingdom");
    }
    public void enterState(){
        sendTextToElement(state,"Stanmore");
    }
    public void clickContinueButtonguest(){
        clickOnElement(continueButtonguest);
    }
    public void enterCommentInTextAea(){
        sendTextToElement(textArea,"Thank You");
    }

    public void checkTermsAndCondtionCheckBox(){
        clickOnElement(termsandCondition);
    }

    public void clickContinueButtonpayment(){
        clickOnElement(continueButtonpayment);
    }

    public String GetWarningMessageText(){
        return getTextFromElement(warningMessageText);
    }
}
