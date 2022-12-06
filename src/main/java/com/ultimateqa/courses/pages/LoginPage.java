package com.ultimateqa.courses.pages;

import com.ultimateqa.courses.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By clickOnSignLink = By.xpath("//a[contains(text(),'Sign In')]");
    By verifyWelcomeBackText = By.xpath("//h1[contains(text(),'Welcome Back!')]");


    By userNameField = By.id("user[email]");
    By userPasswordField = By.id("user[password]");
    By signinButton = By.xpath("//input[@type='submit']");
    By InvalidCredentialMessage = By.xpath("//li[contains(text(),'Invalid email or password.')]");


    public void clickOnSigninLink() {
        clickOnElement(clickOnSignLink);
    }

    public void clickOnSigninButton() {
        clickOnElement(signinButton);
    }

    public String verifyWelcomeBackTextMessage() {
        return getTextFromElement(verifyWelcomeBackText);
    }

    public void enterInvalidUserName(String userName) {
        sendTextToElement(userNameField, userName);
    }

    public void enterInvalidPassword(String password) {
        sendTextToElement(userPasswordField, password);
    }

    public String verifyInvalidCredentialMessage() {
        return getTextFromElement(InvalidCredentialMessage);
    }
}
