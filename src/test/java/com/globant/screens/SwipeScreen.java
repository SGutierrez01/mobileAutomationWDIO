package com.globant.screens;

import com.globant.utils.screen.BaseScreen;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SwipeScreen extends BaseScreen {

    private static final String SWIPE_TITLE = "UiSelector().text(\"Swipe horizontal\")";
    private static final String CARROUSEL = "UiSelector().className(\"android.view.ViewGroup\").instance(9)";
    private static final String CARROUSEL_ITEM1 = "__CAROUSEL_ITEM_0_READY__";
    private static final String WEBDRIVER_LOGO = "WebdriverIO logo";
    private static final String FOUND_ME_TEXT = "UiSelector().text(\"You found me!!!\")";

    @AndroidFindBy(uiAutomator = SWIPE_TITLE)
    private WebElement swipeTitle;

    @AndroidFindBy(uiAutomator = CARROUSEL)
    private WebElement carrousel;

    @AndroidFindBy(id = CARROUSEL_ITEM1)
    private WebElement carrouselItem1;

    @AndroidFindBy(accessibility = WEBDRIVER_LOGO)
    private WebElement webdriverLogo;

    @AndroidFindBy(uiAutomator = FOUND_ME_TEXT)
    private WebElement foundMeText;

    public SwipeScreen(AndroidDriver driver) {
        super(driver);
    }

    public boolean isSwipeTitleDisplayed() {
        return isElementDisplayed(swipeTitle);
    }

    public String getSwipeTitleText() {
        isElementDisplayed(swipeTitle);
        return swipeTitle.getText();
    }

    public boolean isCarrouselDisplayed() {
        return isElementDisplayed(carrousel);
    }

    public boolean isCarrouselItem1Displayed() {
        return isElementDisplayed(carrouselItem1);
    }

    public boolean isWebdriverLogoVisible() {
        return isElementVisible(webdriverLogo);
    }

    public boolean isWebdriverLogoDisplayed() {
        return isElementDisplayed(webdriverLogo);
    }

    public boolean isFoundMeTextDisplayed() {
        return isElementDisplayed(foundMeText);
    }

    public boolean isFoundMeTextVisible() {
        return isElementVisible(foundMeText);
    }

    public String getFoundMeText() {
        isElementDisplayed(foundMeText);
        return foundMeText.getText();
    }
}
