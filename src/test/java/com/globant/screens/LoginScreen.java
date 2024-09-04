package com.globant.screens;

import com.globant.utils.screen.BaseScreen;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class LoginScreen extends BaseScreen {

    private static final String LOGIN_TITLE = "UiSelector().text(\"Login / Sign up Form\")";
    private static final String EMAIL_FIELD = "input-email";
    private static final String PASSWORD_FIELD = "input-password";
    private static final String LOGIN_BTN = "button-LOGIN";
    private static final String SIGN_UP_BTN = "button-sign-up-container";

    @AndroidFindBy(uiAutomator = LOGIN_TITLE)
    private WebElement loginTitle;

    @AndroidFindBy(accessibility = EMAIL_FIELD)
    private WebElement emailField;

    @AndroidFindBy(accessibility = PASSWORD_FIELD)
    private WebElement passwordField;

    @AndroidFindBy(accessibility = LOGIN_BTN)
    private WebElement loginButton;

    @AndroidFindBy(accessibility = SIGN_UP_BTN)
    private WebElement signUpButton;


    public LoginScreen(AndroidDriver driver) {
        super(driver);
    }

    public boolean isLoginTitleDisplayed() {
        return isElementDisplayed(loginTitle);
    }

    public String getLoginTitleText() {
        isElementDisplayed(loginTitle);
        return loginTitle.getText();
    }

    public boolean isEmailInputDisplayed() {
        return isElementDisplayed(emailField);
    }

    public String getEmailInputPlaceholder() {
        isElementDisplayed(emailField);
        return emailField.getText();
    }

    public boolean isPasswordInputDisplayed() {
        return isElementDisplayed(passwordField);
    }

    public String getPasswordInputPlaceholder() {
        isElementDisplayed(passwordField);
        return passwordField.getText();
    }

    public boolean isLoginBtnDisplayed() {
        return isElementDisplayed(loginButton);
    }

    public boolean isSignUpBtnDisplayed() {
        return isElementDisplayed(signUpButton);
    }

    public SignUpScreen clickOnSignUpBtn() {
        isSignUpBtnDisplayed();
        signUpButton.click();
        return new SignUpScreen(driver);
    }


    public void setEmailInput(String email) {
        isEmailInputDisplayed();
        emailField.sendKeys(email);
    }

    public void setPasswordInput(String password) {
        isPasswordInputDisplayed();
        passwordField.sendKeys(password);
    }
}
