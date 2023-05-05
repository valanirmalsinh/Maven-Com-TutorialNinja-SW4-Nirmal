package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class MyAccountRegisterPage extends Utility {

    By firstName = By.name("firstname");

    By lastName = By.name("lastname");

    By email = By.name("email");

    By telephone = By.name("telephone");

    By password = By.id("input-password");
    By confirmPassword = By.id("input-confirm");

    By subscribeRadioButton = By.xpath("(//input[@type='radio'])[2]");
    By privacyPolicyCheckBox = By.name("agree");
    By continueButton = By.xpath("//input[@type='submit']");
    By accountHasBeenCreatedText = By.xpath("//h1[contains(text(),'Your Account Has Been Created!')]");
    By clickContinueButton = By.xpath("//a[contains(text(),'Continue')]");
    By myAccountLink = By.xpath("//span[normalize-space()='My Account']");
    By accountLogoutText = By.xpath("//h1[contains(text(),'Account Logout')]");
    public void enterFirstName(){
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
    public void enterPassword(){
        sendTextToElement(password, "Tango456");
    }
    public void enterConfirmPassword(){
        sendTextToElement(confirmPassword, "Tango456");
    }
    public void selectSubscribeYesRadioButton(){
        clickOnElement(subscribeRadioButton);
    }
    public void clickPrivacyPolicyCheckbox(){
        clickOnElement(privacyPolicyCheckBox);
    }
    public void clickOnContinueButton(){
        clickOnElement(continueButton);
    }
    public String getAccountHasBeenCreatedText(){
        return getTextFromElement(accountHasBeenCreatedText);
    }
    public void clickOnContinueButtonAgain(){
        clickOnElement(clickContinueButton);
    }
    public void clickOnMyAccountLink(){
        clickOnElement(myAccountLink);
    }
    public String getAccountLogoutText(){
        return getTextFromElement(accountLogoutText);
    }

}
