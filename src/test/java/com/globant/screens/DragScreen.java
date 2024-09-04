package com.globant.screens;

import com.globant.utils.screen.BaseScreen;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class DragScreen extends BaseScreen {

    private static final String DRAG_TITLE = "UiSelector().text(\"Drag and Drop\")";
    private static final String DRAGGABLE_ITEM = "new UiSelector().className(\"android.widget.ImageView\").instance(0)";

    @AndroidFindBy(uiAutomator = DRAG_TITLE)
    private WebElement dragTitle;

    @AndroidFindBy(uiAutomator = DRAGGABLE_ITEM)
    private WebElement draggableItem;

    public DragScreen(AndroidDriver driver) {
        super(driver);
    }

    public boolean isDragTitleDisplayed() {
        return isElementDisplayed(dragTitle);
    }

    public String getDragTitleText() {
        isElementDisplayed(dragTitle);
        return dragTitle.getText();
    }

    public boolean isDraggableItemDisplayed() {
        return isElementDisplayed(draggableItem);
    }
}
