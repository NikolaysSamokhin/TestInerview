package org.testinterview.tests;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testinterview.webdriver.DriverFactory;
import org.testinterview.webdriver.DriverManager;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.ResourceBundle;

public class BaseTest {
    private static final Logger LOG = Logger.getLogger(BaseTest.class);
    protected WebDriver driver;
    protected ResourceBundle resource = ResourceBundle.getBundle("config");

    @BeforeTest
    public void startBrowser() {
        LOG.warn("start 'startBrowser'");

        WebDriver driver = DriverFactory.createInstance();
        DriverManager.setDriver(driver);

        LOG.warn("startBrowser 'delete old screenshots'");

        driver.get(resource.getString("mainURL"));

        LOG.warn("finish 'startBrowser'");
    }

    @AfterTest
    public void closeBrowser() {
        LOG.warn("start 'closeBrowser'");
        DriverManager.removeDriver();
        LOG.warn("finish 'closeBrowser'");
    }

    public WebDriver getDriver() {
        return this.driver;
    }
}
