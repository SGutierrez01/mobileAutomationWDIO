package com.globant.screens;

import com.globant.utils.screen.BaseScreen;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class HomeScreen extends BaseScreen {

    private static final String HOME_IMAGE = "UiSelector().className(\"android.widget.ImageView\").instance(0)\n";
    private static final String HOME_TITLE = "UiSelector().text(\"WEBDRIVER\")";

    @AndroidFindBy(uiAutomator = HOME_IMAGE)
    private WebElement homeImage;

    @AndroidFindBy(uiAutomator = HOME_TITLE)
    private WebElement homeTitle;

    public HomeScreen(AndroidDriver driver) {
        super(driver);
    }

    public boolean isHomeImageDisplayed() {
        return isElementDisplayed(homeImage);
    }

    public boolean isHomeTitleDisplayed() {
        return isElementDisplayed(homeTitle);
    }

    public String getHomeTitleText() {
        isElementDisplayed(homeTitle);
        return homeTitle.getText();
    }
}
