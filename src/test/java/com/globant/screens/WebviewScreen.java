package com.globant.screens;

import com.globant.utils.screen.BaseScreen;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class WebviewScreen extends BaseScreen {

    private static final String WEBVIEW_TITLE = "UiSelector().text(\"Next-gen browser and mobile automation test framework for Node.js\")";
    private static final String GET_STARTED_BTN = "UiSelector().description(\"Get Started\")";
    private static final String WHY_WEBDRIVER_BTN = "UiSelector().description(\"Why WebdriverIO?\")";
    private static final String VIEW_GITHUB_BTN = "UiSelector().description(\"View on GitHub\")";

    @AndroidFindBy(uiAutomator = WEBVIEW_TITLE)
    private WebElement webviewTitle;
    
    @AndroidFindBy(uiAutomator = GET_STARTED_BTN)
    private WebElement getStartedBtn;

    @AndroidFindBy(uiAutomator = WHY_WEBDRIVER_BTN)
    private WebElement whyWebdriverBtn;

    @AndroidFindBy(uiAutomator = VIEW_GITHUB_BTN)
    private WebElement viewGithubBtn;
    
    public WebviewScreen(AndroidDriver driver) {
        super(driver);
    }

    public boolean isWebviewTitleDisplayed() {
        return isElementDisplayed(webviewTitle);
    }

    public String getWebviewTitleText() {
        isElementDisplayed(webviewTitle);
        return webviewTitle.getText();
    }


    public boolean isGetStartedBtnDisplayed() {
        return isElementDisplayed(getStartedBtn);
    }

    public boolean isWhyWebdriverBtnDisplayed() {
        return isElementDisplayed(whyWebdriverBtn);
    }

    public boolean isViewGithubBtnDisplayed() {
        return isElementDisplayed(viewGithubBtn);
    }
}
