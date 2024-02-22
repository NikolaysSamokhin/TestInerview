package org.testinterview.service;

import org.openqa.selenium.WebDriver;
import org.testinterview.webdriver.DriverManager;

public class BaseService {
    protected WebDriver driver;

    public BaseService() {
        if (driver == null) {
            driver = DriverManager.getDriver();
        }
    }
}
