package com.globant.screens;

import com.globant.utils.screen.BaseScreen;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class FormsScreen extends BaseScreen {

    private static final String FORMS_TITLE = "UiSelector().text(\"Form components\")";
    private static final String INPUT_FIELD_TITLE = "UiSelector().text(\"Input field:\")";
    private static final String INPUT_FIELD_INPUT = "text-input";
    private static final String SWITCH_TITLE = "UiSelector().text(\"Switch:\")";
    private static final String SWITCH = "switch";
    private static final String ACTIVE_BTN = "button-Active";
    private static final String INACTIVE_BTN = "button-Inactive";

    @AndroidFindBy(uiAutomator = FORMS_TITLE)
    private WebElement formsTitle;

    @AndroidFindBy(uiAutomator = INPUT_FIELD_TITLE)
    private WebElement inputFieldTitle;

    @AndroidFindBy(accessibility = INPUT_FIELD_INPUT)
    private WebElement inputFieldInput;

    @AndroidFindBy(uiAutomator = SWITCH_TITLE)
    private WebElement switchTitle;

    @AndroidFindBy(accessibility = SWITCH)
    private WebElement switchElement;

    @AndroidFindBy(accessibility = ACTIVE_BTN)
    private WebElement activeBtn;

    @AndroidFindBy(accessibility = INACTIVE_BTN)
    private WebElement inactiveBtn;

    public FormsScreen(AndroidDriver driver) {
        super(driver);
    }

    public boolean isFormsTitleDisplayed() {
        return isElementDisplayed(formsTitle);
    }

    public String getFormsTitleText() {
        isElementDisplayed(formsTitle);
        return formsTitle.getText();
    }

    public boolean isInputFieldTitleDisplayed() {
        return isElementDisplayed(inputFieldTitle);
    }

    public String getInputFieldTitleText() {
        isElementDisplayed(inputFieldTitle);
        return inputFieldTitle.getText();
    }

    public boolean isInputFieldInputDisplayed() {
        return isElementDisplayed(inputFieldInput);
    }

    public boolean isSwitchTitleDisplayed() {
        return isElementDisplayed(switchTitle);
    }

    public String getSwitchTitleText() {
        isElementDisplayed(switchTitle);
        return switchTitle.getText();
    }

    public boolean isSwitchDisplayed() {
        return isElementDisplayed(switchElement);
    }

    public boolean isActiveBtnDisplayed() {
        return isElementDisplayed(activeBtn);
    }

    public boolean isInactiveBtnDisplayed() {
        return isElementDisplayed(inactiveBtn);
    }
}
