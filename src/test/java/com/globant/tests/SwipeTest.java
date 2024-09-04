package com.globant.tests;

import com.globant.screens.HomeScreen;
import com.globant.screens.SwipeScreen;
import com.globant.utils.test.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SwipeTest extends BaseTest {
    @Test
    private void testSwipe() {
        HomeScreen homeScreen = getHomeScreen();
        Assert.assertTrue(homeScreen.isSwipeScreenBarBtnDisplayed());

        SwipeScreen swipeScreen = homeScreen.clickOnSwipeScreenBarBtn();
        Assert.assertTrue(swipeScreen.isSwipeTitleDisplayed());

        Assert.assertTrue(swipeScreen.isCarrouselDisplayed());

        swipeRightUntilFound(swipeScreen);
        Assert.assertFalse(swipeScreen.isCarrouselFirstItemVisible());
        Assert.assertTrue(swipeScreen.isCarrouselFinalItemDisplayed());

        swipeDownUntilFound(swipeScreen);

        Assert.assertTrue(swipeScreen.isWebdriverLogoDisplayed());
        Assert.assertTrue(swipeScreen.isFoundMeTextDisplayed());
        Assert.assertEquals(swipeScreen.getFoundMeText(), "You found me!!!");
    }

    private void swipeRightUntilFound(SwipeScreen swipeScreen) {
        int attempts = 0;
        while((swipeScreen.isCarrouselFirstItemVisible() || !swipeScreen.isCarrouselFinalItemVisible()) && attempts < 10){
            swipeScreen.scrollRight();
            attempts++;
        }
    }

    private void swipeDownUntilFound(SwipeScreen swipeScreen) {
        int attempts = 0;
        while(!swipeScreen.isWebdriverLogoVisible() && !swipeScreen.isFoundMeTextVisible() && attempts < 10){
            swipeScreen.scrollDown();
            attempts++;
        }
    }
}
