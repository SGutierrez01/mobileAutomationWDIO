package com.globant.tests;

import com.globant.screens.HomeScreen;
import com.globant.utils.tests.BaseTest;
import org.testng.annotations.Test;

public class NavigationTests extends BaseTest{

    @Test
    public void testNavigation() {
        HomeScreen homeScreen = getHomeScreen();
    }
}
