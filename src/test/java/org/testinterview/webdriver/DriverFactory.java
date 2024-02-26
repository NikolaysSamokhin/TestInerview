package org.testinterview.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

public class DriverFactory {
    private static final String CHROME_DRIVER_PATH = "src/test/resources/drivers/chromedriver.exe";

    public static WebDriver createInstance() {

        WebDriver driver = null;
        ResourceBundle resource = ResourceBundle.getBundle("config");

        switch (resource.getString("driverType")) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", CHROME_DRIVER_PATH);
                DesiredCapabilities options = new DesiredCapabilities();
                options.setBrowserName(resource.getString("driverType"));
                driver = new ChromeDriver(options);
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
