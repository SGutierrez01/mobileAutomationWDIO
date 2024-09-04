package com.globant.tests;

import com.globant.screens.HomeScreen;
import com.globant.screens.LoginScreen;
import com.globant.screens.SignUpScreen;
import com.globant.utils.data.UserData;
import com.globant.utils.test.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void testLogin() {
        HomeScreen homeScreen = getHomeScreen();
        Assert.assertTrue(homeScreen.isHomeImageDisplayed());

        LoginScreen loginScreen = homeScreen.clickOnLoginScreenBarBtn();
        Assert.assertTrue(loginScreen.isLoginTitleDisplayed());

        if(UserData.email == null) {
            loginScreen = signUpNewUser(loginScreen);
        }

        Assert.assertTrue(loginScreen.isEmailInputDisplayed());
        loginScreen.setEmailInput(UserData.email);

        Assert.assertTrue(loginScreen.isPasswordInputDisplayed());
        loginScreen.setPasswordInput(UserData.password);

        Assert.assertTrue(loginScreen.isLoginBtnDisplayed());
        loginScreen.clickOnLoginBtn();

        Assert.assertTrue(loginScreen.isLoginSuccessfulDisplayed());
        Assert.assertEquals(loginScreen.getLoginSuccessfulTitle(), "Success");
        Assert.assertTrue(loginScreen.isLoginSuccessfulMessageDisplayed());
        Assert.assertEquals(loginScreen.getLoginSuccessfulMessage(), "You are logged in!");

        Assert.assertTrue(loginScreen.isLoginSuccessfulOkBtnDisplayed());
        loginScreen.clickOnLoginSuccessfulOkBtn();

        Assert.assertTrue(loginScreen.isLoginTitleDisplayed());
    }

    private LoginScreen signUpNewUser(LoginScreen loginScreen) {
        SignUpScreen signUpScreen = loginScreen.clickOnSignUpBtn();
        Assert.assertTrue(signUpScreen.isEmailInputDisplayed());

        String email = getRandomEmail();
        signUpScreen.setEmailInput(email);
        UserData.email = email;

        Assert.assertTrue(signUpScreen.isPasswordInputDisplayed());
        signUpScreen.setPasswordInput(UserData.password);

        Assert.assertTrue(signUpScreen.isPasswordRepeatInputDisplayed());
        signUpScreen.setPasswordRepeatInput(UserData.password);

        Assert.assertTrue(signUpScreen.isSignUpBtnDisplayed());
        signUpScreen.clickOnSignUpSubmitBtn();

        Assert.assertTrue(signUpScreen.isSignUpSuccessfulDisplayed());
        Assert.assertEquals(signUpScreen.getSignUpSuccessfulTitle(), "Signed Up!");
        Assert.assertTrue(signUpScreen.isSignUpSuccessfulMessageDisplayed());
        Assert.assertEquals(signUpScreen.getSignUpSuccessfulMessage(), "You successfully signed up!");
        Assert.assertTrue(signUpScreen.isSignUpSuccessfulOkBtnDisplayed());
        signUpScreen.clickOnSignUpSuccessfulOkBtn();

        Assert.assertTrue(loginScreen.isLoginScreenBtnDisplayed());
        return loginScreen.clickOnLoginScreenBtn();
    }
}
