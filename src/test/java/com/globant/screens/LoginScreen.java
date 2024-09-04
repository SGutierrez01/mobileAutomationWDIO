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
    private static final String LOGIN_SCREEN_BTN = "button-login-container";
    private static final String SIGN_UP_SCREEN_BTN = "button-sign-up-container";
    private static final String LOGIN_SUCCESSFUL_TITLE = "android:id/alertTitle";
    private static final String LOGIN_SUCCESSFUL_MESSAGE = "android:id/message";
    private static final String LOGIN_SUCCESSFUL_OK_BTN = "android:id/button1";

    @AndroidFindBy(uiAutomator = LOGIN_TITLE)
    private WebElement loginTitle;

    @AndroidFindBy(accessibility = EMAIL_FIELD)
    private WebElement emailField;

    @AndroidFindBy(accessibility = PASSWORD_FIELD)
    private WebElement passwordField;

    @AndroidFindBy(accessibility = LOGIN_BTN)
    private WebElement loginButton;

    @AndroidFindBy(accessibility = LOGIN_SCREEN_BTN)
    private WebElement loginScreenBtn;

    @AndroidFindBy(accessibility = SIGN_UP_SCREEN_BTN)
    private WebElement signUpScreenButton;

    @AndroidFindBy(id = LOGIN_SUCCESSFUL_TITLE)
    private WebElement loginSuccessful;

    @AndroidFindBy(id = LOGIN_SUCCESSFUL_MESSAGE)
    private WebElement loginSuccessfulMessage;

    @AndroidFindBy(id = LOGIN_SUCCESSFUL_OK_BTN)
    private WebElement loginSuccessfulOkBtn;

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

    public void clickOnLoginBtn() {
        isLoginBtnDisplayed();
        loginButton.click();
    }

    public boolean isSignUpBtnDisplayed() {
        return isElementDisplayed(signUpScreenButton);
    }

    public SignUpScreen clickOnSignUpBtn() {
        isSignUpBtnDisplayed();
        signUpScreenButton.click();
        return new SignUpScreen(driver);
    }

    public boolean isLoginScreenBtnDisplayed() {
        return isElementDisplayed(loginScreenBtn);
    }

    public LoginScreen clickOnLoginScreenBtn() {
        isElementDisplayed(loginScreenBtn);
        loginScreenBtn.click();
        return new LoginScreen(driver);
    }

    public void setEmailInput(String email) {
        isEmailInputDisplayed();
        emailField.sendKeys(email);
    }

    public void setPasswordInput(String password) {
        isPasswordInputDisplayed();
        passwordField.sendKeys(password);
    }

    public boolean isLoginSuccessfulDisplayed() {
        return isElementDisplayed(loginSuccessful);
    }

    public String getLoginSuccessfulTitle() {
        isLoginSuccessfulDisplayed();
        return loginSuccessful.getText();
    }

    public boolean isLoginSuccessfulMessageDisplayed() {
        return isElementDisplayed(loginSuccessfulMessage);
    }

    public String getLoginSuccessfulMessage() {
        isLoginSuccessfulMessageDisplayed();
        return loginSuccessfulMessage.getText();
    }

    public boolean isLoginSuccessfulOkBtnDisplayed() {
        return isElementDisplayed(loginSuccessfulOkBtn);
    }

    public void clickOnLoginSuccessfulOkBtn() {
        isLoginSuccessfulOkBtnDisplayed();
        loginSuccessfulOkBtn.click();
    }
}
