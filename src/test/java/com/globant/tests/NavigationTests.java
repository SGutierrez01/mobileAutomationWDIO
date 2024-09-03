package com.globant.tests;

import com.globant.screens.*;
import com.globant.utils.test.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NavigationTests extends BaseTest{

    @Test
    public void testNavigation() {
        HomeScreen homeScreen = getHomeScreen();
        Assert.assertTrue(homeScreen.isHomeImageDisplayed());
        Assert.assertTrue(homeScreen.isHomeTitleDisplayed());
        Assert.assertEquals(homeScreen.getHomeTitleText(), "WEBDRIVER");
        Assert.assertTrue(homeScreen.isWebviewBarBtnDisplayed());

        WebviewScreen webviewScreen = homeScreen.clickOnWebviewBarBtn();
        Assert.assertTrue(webviewScreen.isWebviewTitleDisplayed());
        Assert.assertEquals(webviewScreen.getWebviewTitleText(), "Next-gen browser and mobile automation test framework for Node.js");
        Assert.assertTrue(webviewScreen.isGetStartedBtnDisplayed());
        Assert.assertEquals(webviewScreen.getGetStartedBtnText(), "Get Started");
        Assert.assertTrue(webviewScreen.isWhyWebdriverBtnDisplayed());
        Assert.assertTrue(webviewScreen.isViewGithubBtnDisplayed());
        Assert.assertTrue(webviewScreen.isLoginBarBtnDisplayed());

        LoginScreen loginScreen = webviewScreen.clickOnLoginBarBtn();
        Assert.assertTrue(loginScreen.isLoginTitleDisplayed());
        Assert.assertEquals(loginScreen.getLoginTitleText(), "Login / Sign up Form");
        Assert.assertTrue(loginScreen.isEmailInputDisplayed());
        Assert.assertEquals(loginScreen.getEmailInputPlaceholder(), "Email");
        Assert.assertTrue(loginScreen.isPasswordInputDisplayed());
        Assert.assertEquals(loginScreen.getPasswordInputPlaceholder(), "Password");
        Assert.assertTrue(loginScreen.isLoginBtnDisplayed());
        Assert.assertEquals(loginScreen.getLoginBtnText(), "Login");
        Assert.assertTrue(loginScreen.isSignUpTextDisplayed());
        Assert.assertTrue(loginScreen.isFormsBarBtnDisplayed());

        FormsScreen formsScreen = loginScreen.clickOnFormsBarBtn();
        Assert.assertTrue(formsScreen.isFormsTitleDisplayed());
        Assert.assertEquals(formsScreen.getFormsTitleText(), "Form Components");
        Assert.assertTrue(formsScreen.isInputFieldTitleDisplayed());
        Assert.assertEquals(formsScreen.getInputFieldTitleText(), "Input Field");
        Assert.assertTrue(formsScreen.isInputFieldInputDisplayed());
        Assert.assertTrue(formsScreen.isSwitchTitleDisplayed());
        Assert.assertEquals(formsScreen.getSwitchTitleText(), "Switch:");
        Assert.assertTrue(formsScreen.isSwitchDisplayed());
        Assert.assertTrue(formsScreen.isActiveBtnDisplayed());
        Assert.assertEquals(formsScreen.getActiveBtnText(), "Active");
        Assert.assertTrue(formsScreen.isInactiveBtnDisplayed());
        Assert.assertEquals(formsScreen.getInactiveBtnText(), "Inactive");
        Assert.assertTrue(formsScreen.isSwipeBarBtnDisplayed());

        SwipeScreen swipeScreen = formsScreen.clickOnSwipeBarBtn();
        Assert.assertTrue(swipeScreen.isSwipeTitleDisplayed());
        Assert.assertEquals(swipeScreen.getSwipeTitleText(), "Swipe horizontal");
        Assert.assertTrue(swipeScreen.isCarrouselDisplayed());
        Assert.assertTrue(swipeScreen.isCarrouselItem1Displayed());
        swipeScreen.scrollToBottom();
        Assert.assertTrue(swipeScreen.isWebdriverLogoDisplayed());
        Assert.assertTrue(swipeScreen.isFoundMeTextDisplayed());
        Assert.assertEquals(swipeScreen.getFoundMeText(), "You found me!!!");
        Assert.assertTrue(swipeScreen.isDragBarBtnDisplayed());


        DragScreen dragScreen = swipeScreen.clickOnDragBarBtn();
        Assert.assertTrue(dragScreen.isDragTitleDisplayed());
        Assert.assertEquals(dragScreen.getDragTitleText(), "Drag and Drop");
        Assert.assertTrue(dragScreen.isDraggableItemDisplayed());
    }
}
