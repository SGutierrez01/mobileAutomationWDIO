package com.globant.tests;

import com.globant.screens.*;
import com.globant.utils.test.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NavigationTest extends BaseTest{

    @Test
    public void testNavigation() {
        HomeScreen homeScreen = getHomeScreen();
        Assert.assertTrue(homeScreen.isHomeImageDisplayed());
        Assert.assertTrue(homeScreen.isHomeTitleDisplayed());
        Assert.assertEquals(homeScreen.getHomeTitleText(), "WEBDRIVER");
        Assert.assertTrue(homeScreen.isWebviewScreenBarBtnDisplayed());

        WebviewScreen webviewScreen = homeScreen.clickOnWebviewScreenBarBtn();
        Assert.assertTrue(webviewScreen.isWebviewTitleDisplayed());
        Assert.assertEquals(webviewScreen.getWebviewTitleText(), "Next-gen browser and mobile automation test framework for Node.js");
        Assert.assertTrue(webviewScreen.isGetStartedBtnDisplayed());
        Assert.assertTrue(webviewScreen.isWhyWebdriverBtnDisplayed());
        Assert.assertTrue(webviewScreen.isViewGithubBtnDisplayed());
        Assert.assertTrue(webviewScreen.isLoginScreenBarBtnDisplayed());

        LoginScreen loginScreen = webviewScreen.clickOnLoginScreenBarBtn();
        Assert.assertTrue(loginScreen.isLoginTitleDisplayed());
        Assert.assertEquals(loginScreen.getLoginTitleText(), "Login / Sign up Form");
        Assert.assertTrue(loginScreen.isEmailInputDisplayed());
        Assert.assertEquals(loginScreen.getEmailInputPlaceholder(), "Email");
        Assert.assertTrue(loginScreen.isPasswordInputDisplayed());
        Assert.assertEquals(loginScreen.getPasswordInputPlaceholder(), "Password");
        Assert.assertTrue(loginScreen.isLoginBtnDisplayed());
        Assert.assertTrue(loginScreen.isSignUpBtnDisplayed());
        Assert.assertTrue(loginScreen.isFormsScreenBarBtnDisplayed());

        FormsScreen formsScreen = loginScreen.clickOnFormsScreenBarBtn();
        Assert.assertTrue(formsScreen.isFormsTitleDisplayed());
        Assert.assertEquals(formsScreen.getFormsTitleText(), "Form components");
        Assert.assertTrue(formsScreen.isInputFieldTitleDisplayed());
        Assert.assertEquals(formsScreen.getInputFieldTitleText(), "Input field:");
        Assert.assertTrue(formsScreen.isInputFieldInputDisplayed());
        Assert.assertTrue(formsScreen.isSwitchTitleDisplayed());
        Assert.assertEquals(formsScreen.getSwitchTitleText(), "Switch:");
        Assert.assertTrue(formsScreen.isSwitchDisplayed());
        Assert.assertTrue(formsScreen.isActiveBtnDisplayed());
        Assert.assertTrue(formsScreen.isInactiveBtnDisplayed());
        Assert.assertTrue(formsScreen.isSwipeScreenBarBtnDisplayed());

        SwipeScreen swipeScreen = formsScreen.clickOnSwipeScreenBarBtn();
        Assert.assertTrue(swipeScreen.isSwipeTitleDisplayed());
        Assert.assertEquals(swipeScreen.getSwipeTitleText(), "Swipe horizontal");
        Assert.assertTrue(swipeScreen.isCarrouselDisplayed());
        Assert.assertTrue(swipeScreen.isCarrouselItemFirstDisplayed());
        Assert.assertTrue(swipeScreen.isDragScreenBarBtnDisplayed());


        DragScreen dragScreen = swipeScreen.clickOnDragScreenBarBtn();
        Assert.assertTrue(dragScreen.isDragTitleDisplayed());
        Assert.assertEquals(dragScreen.getDragTitleText(), "Drag and Drop");
        Assert.assertTrue(dragScreen.isDraggableItemDisplayed());
    }
}
