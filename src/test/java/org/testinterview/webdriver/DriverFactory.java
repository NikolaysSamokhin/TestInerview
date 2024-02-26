package org.testinterview.webdriver;

import org.openqa.selenium.Platform;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.util.Arrays;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

public class DriverFactory {
    private static final String CHROME_DRIVER_PATH = "src/test/resources/drivers/chromedriver.exe";

    public static WebDriver createInstance() {

        WebDriver driver = null;
        ResourceBundle resource = ResourceBundle.getBundle("config");

        switch (resource.getString("driverType")) {
            case "chrome":
                ChromeOptions options = new ChromeOptions();
                options.setBinary(new File(CHROME_DRIVER_PATH));

                System.setProperty("webdriver.chrome.driver", CHROME_DRIVER_PATH);
                driver = new ChromeDriver();
                break;
            default:
                driver = new ChromeDriver();
                break;
        }

        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        return driver;
    }
}
