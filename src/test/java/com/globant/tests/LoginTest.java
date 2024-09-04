package com.globant.tests;

import com.globant.screens.HomeScreen;
import com.globant.screens.LoginScreen;
import com.globant.utils.data.UserData;
import com.globant.utils.test.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    @Test
    private void testLogin() {
        HomeScreen homeScreen = getHomeScreen();
        Assert.assertTrue(homeScreen.isHomeImageDisplayed());

        LoginScreen loginScreen = homeScreen.clickOnLoginScreenBarBtn();
        Assert.assertTrue(loginScreen.isLoginTitleDisplayed());

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
}
