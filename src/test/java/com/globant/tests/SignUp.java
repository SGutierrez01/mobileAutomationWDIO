package com.globant.tests;

import com.globant.screens.HomeScreen;
import com.globant.screens.LoginScreen;
import com.globant.screens.SignUpScreen;
import com.globant.utils.test.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignUp extends BaseTest {
    @Test
    private void testSignUp() {
        HomeScreen homeScreen = getHomeScreen();
        Assert.assertTrue(homeScreen.isHomeImageDisplayed());

        LoginScreen loginScreen = homeScreen.clickOnLoginScreenBarBtn();
        Assert.assertTrue(loginScreen.isLoginTitleDisplayed());

        SignUpScreen signUpScreen = loginScreen.clickOnSignUpBtn();

        Assert.assertTrue(signUpScreen.isEmailInputDisplayed());
        signUpScreen.setEmailInput("test@test.com");

        Assert.assertTrue(signUpScreen.isPasswordInputDisplayed());
        signUpScreen.setPasswordInput("password");

        Assert.assertTrue(signUpScreen.isPasswordRepeatInputDisplayed());
        signUpScreen.setPasswordRepeatInput("password");

        Assert.assertTrue(signUpScreen.isSignUpBtnDisplayed());
        signUpScreen.clickOnSignUpSubmitBtn();

        Assert.assertTrue(signUpScreen.isSignUpSuccessfulDisplayed());
        Assert.assertEquals(signUpScreen.getSignUpSuccessfulTitle(), "Signed Up!");
        Assert.assertTrue(signUpScreen.isSignUpSuccessfulMessageDisplayed());
        Assert.assertEquals(signUpScreen.getSignUpSuccessfulMessage(), "You successfully signed up!");
        Assert.assertTrue(signUpScreen.isSignUpSuccessfulOkBtnDisplayed());
        signUpScreen.clickOnSignUpSuccessfulOkBtn();

        Assert.assertTrue(loginScreen.isLoginTitleDisplayed());
    }
}
