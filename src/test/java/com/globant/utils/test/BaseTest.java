package com.globant.utils.test;

import com.globant.screens.HomeScreen;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

public class BaseTest {
    private static final String PROPERTIES_FILE = "src/test/resources/config.properties";
    private static final Properties properties = new Properties();
    private static AndroidDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void environmentSetup() {
        loadProperties();
        UiAutomator2Options capabilities = new UiAutomator2Options();
        setUpCapabilities(capabilities);
        try {
            driver = new AndroidDriver(new URL(properties.getProperty("appiumServer")), capabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public void loadProperties() {
        try {
            properties.load(Files.newInputStream(Paths.get(PROPERTIES_FILE)));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void setUpCapabilities(UiAutomator2Options capabilities) {
        capabilities.setPlatformName(getCapability("platformName"));
        capabilities.setDeviceName(getCapability("deviceName"));
        capabilities.setAppPackage(getCapability("appPackage"));
        capabilities.setAppActivity(getCapability("appActivity"));
        capabilities.setCapability("appium:disableIdLocatorAutocompletion", true);
    }

    public static String getCapability(String capability) {
        return properties.getProperty(capability);
    }

    protected HomeScreen getHomeScreen() {
        return new HomeScreen(driver);
    }
}
