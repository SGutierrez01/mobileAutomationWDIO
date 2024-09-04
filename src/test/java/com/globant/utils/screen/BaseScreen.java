package com.globant.utils.screen;

import com.globant.screens.*;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseScreen {

    public static Logger logger;

    protected static final String HOME_SCREEN_BAR_BTN = "Home";
    protected static final String WEBVIEW_SCREEN_BAR_BTN = "Webview";
    protected static final String LOGIN_SCREEN_BAR_BTN = "Login";
    protected static final String FORMS_SCREEN_BAR_BTN = "Forms";
    protected static final String SWIPE_SCREEN_BAR_BTN = "UiSelector().description(\"Swipe\")";
    protected static final String DRAG_AND_DROP_SCREEN_BAR_BTN = "Drag";

    @AndroidFindBy(accessibility = HOME_SCREEN_BAR_BTN)
    protected WebElement homeScreenBarBtn;

    @AndroidFindBy(accessibility = WEBVIEW_SCREEN_BAR_BTN)
    protected WebElement webviewScreenBarBtn;

    @AndroidFindBy(accessibility = LOGIN_SCREEN_BAR_BTN)
    protected WebElement loginScreenBarBtn;

    @AndroidFindBy(accessibility = FORMS_SCREEN_BAR_BTN)
    protected WebElement formsScreenBarBtn;

    @AndroidFindBy(uiAutomator = SWIPE_SCREEN_BAR_BTN)
    protected WebElement swipeScreenBarBtn;

    @AndroidFindBy(accessibility = DRAG_AND_DROP_SCREEN_BAR_BTN)
    protected WebElement dragAndDropScreenBarBtn;

    protected AndroidDriver driver;

    public BaseScreen(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public WebDriverWait setUpWait(long time) {
        return new WebDriverWait(driver, Duration.ofSeconds(time));
    }

    protected boolean isElementDisplayed(WebElement element) {
        try {
            setUpWait(15).until(ExpectedConditions.visibilityOf(element));
            return element.isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public HomeScreen clickOnHomeScreenBarBtn() {
        setUpWait(15).until(ExpectedConditions.elementToBeClickable(homeScreenBarBtn));
        homeScreenBarBtn.click();
        return new HomeScreen(driver);
    }
    
    public WebviewScreen clickOnWebviewScreenBarBtn() {
        setUpWait(15).until(ExpectedConditions.elementToBeClickable(webviewScreenBarBtn));
        webviewScreenBarBtn.click();
        return new WebviewScreen(driver);
    }
    
    public LoginScreen clickOnLoginScreenBarBtn() {
        setUpWait(15).until(ExpectedConditions.elementToBeClickable(loginScreenBarBtn));
        loginScreenBarBtn.click();
        return new LoginScreen(driver);
    }
    
    public FormsScreen clickOnFormsScreenBarBtn() {
        setUpWait(15).until(ExpectedConditions.elementToBeClickable(formsScreenBarBtn));
        formsScreenBarBtn.click();
        return new FormsScreen(driver);
    }
    
    public SwipeScreen clickOnSwipeScreenBarBtn() {
        setUpWait(15).until(ExpectedConditions.elementToBeClickable(swipeScreenBarBtn));
        swipeScreenBarBtn.click();
        return new SwipeScreen(driver);
    }
    
    public DragScreen clickOnDragScreenBarBtn() {
        setUpWait(15).until(ExpectedConditions.elementToBeClickable(dragAndDropScreenBarBtn));
        dragAndDropScreenBarBtn.click();
        return new DragScreen(driver);
    }

    public boolean isHomeScreenBarBtnDisplayed() {
        return isElementDisplayed(homeScreenBarBtn);
    }

    public boolean isWebviewScreenBarBtnDisplayed() {
        return isElementDisplayed(webviewScreenBarBtn);
    }

    public boolean isLoginScreenBarBtnDisplayed() {
        return isElementDisplayed(loginScreenBarBtn);
    }

    public boolean isFormsScreenBarBtnDisplayed() {
        return isElementDisplayed(formsScreenBarBtn);
    }

    public boolean isSwipeScreenBarBtnDisplayed() {
        return isElementDisplayed(swipeScreenBarBtn);
    }

    public boolean isDragScreenBarBtnDisplayed() {
        return isElementDisplayed(dragAndDropScreenBarBtn);
    }

    public void scrollToBottom() {
    }
}
