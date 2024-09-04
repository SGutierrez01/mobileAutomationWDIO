package com.globant.screens;

import com.globant.utils.screen.BaseScreen;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class SignUpScreen extends LoginScreen {

        private static final String EMAIL_FIELD = "input-email";
        private static final String PASSWORD_FIELD = "input-password";
        private static final String PASSWORD_REPEAT_FIELD = "input-repeat-password";
        private static final String SIGN_UP_BTN = "UiSelector().description(\"button-SIGN UP\")";
        private static final String SIGN_UP_SUCCESSFUL_TITLE = "android:id/alertTitle";
        private static final String SIGN_UP_SUCCESSFUL_MESSAGE = "android:id/message";
        private static final String SIGN_UP_SUCCESSFUL_OK_BTN = "android:id/button1";


        @AndroidFindBy(accessibility = EMAIL_FIELD)
        private WebElement emailField;

        @AndroidFindBy(accessibility = PASSWORD_FIELD)
        private WebElement passwordField;

        @AndroidFindBy(accessibility = PASSWORD_REPEAT_FIELD)
        private WebElement passwordRepeatField;

        @AndroidFindBy(uiAutomator = SIGN_UP_BTN)
        private WebElement signUpButton;

        @AndroidFindBy(id = SIGN_UP_SUCCESSFUL_TITLE)
        private WebElement signUpSuccessful;

        @AndroidFindBy(id = SIGN_UP_SUCCESSFUL_MESSAGE)
        private WebElement signUpSuccessfulMessage;

        @AndroidFindBy(id = SIGN_UP_SUCCESSFUL_OK_BTN)
        private WebElement signUpSuccessfulOkBtn;

        public SignUpScreen(AndroidDriver driver) {
            super(driver);
        }

        public boolean isEmailInputDisplayed() {
            return isElementDisplayed(emailField);
        }

        public void setEmailInput(String email) {
            isEmailInputDisplayed();
            emailField.sendKeys(email);
        }

        public boolean isPasswordInputDisplayed() {
            return isElementDisplayed(passwordField);
        }

        public void setPasswordInput(String password) {
            isPasswordInputDisplayed();
            passwordField.sendKeys(password);
        }

        public boolean isPasswordRepeatInputDisplayed() {
            return isElementDisplayed(passwordRepeatField);
        }

        public void setPasswordRepeatInput(String password) {
            isPasswordRepeatInputDisplayed();
            passwordRepeatField.sendKeys(password);
        }

        public boolean isSignUpBtnDisplayed() {
            return isElementDisplayed(signUpButton);
        }

        public void clickOnSignUpSubmitBtn() {
            isSignUpBtnDisplayed();
            signUpButton.click();
        }

        public boolean isSignUpSuccessfulDisplayed() {
            return isElementDisplayed(signUpSuccessful);
        }

        public String getSignUpSuccessfulTitle() {
            isSignUpSuccessfulDisplayed();
            return signUpSuccessful.getText();
        }

        public boolean isSignUpSuccessfulMessageDisplayed() {
            return isElementDisplayed(signUpSuccessfulMessage);
        }

        public boolean isSignUpSuccessfulOkBtnDisplayed() {
            return isElementDisplayed(signUpSuccessfulOkBtn);
        }

        public String getSignUpSuccessfulMessage() {
            isSignUpSuccessfulMessageDisplayed();
            return signUpSuccessfulMessage.getText();
        }

        public void clickOnSignUpSuccessfulOkBtn() {
            isSignUpSuccessfulOkBtnDisplayed();
            signUpSuccessfulOkBtn.click();
        }
}
