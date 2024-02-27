package org.testinterview.service;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testinterview.webdriver.DriverManager;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class WaitService extends BaseService {

    private static final int WaitTime = 17;

    public static void waitUntilElementToBeClickable(WebElement element) {
        WebDriver driver = DriverManager.getDriver();
        FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(WaitTime))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class, ElementNotVisibleException.class);

        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void waitUntilElementToBeClickable(String stringXpath) {
        WebDriver driver = DriverManager.getDriver();

        FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(WaitTime))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class, ElementNotVisibleException.class);

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(stringXpath)));
    }

    public static void waitUntilPresenceOfElementLocated(String stringXpath) {
        WebDriver driver = DriverManager.getDriver();

        FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(WaitTime))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class, ElementNotVisibleException.class);

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(stringXpath)));
    }

    public static void waitForVisibilityOfElement(WebElement element) {
         waitForVisibilityOfElement(element, WaitTime);
    }

    public static void waitForVisibilityOfElement(WebElement element, int sec) {
        WebDriver driver = DriverManager.getDriver();

        FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(sec))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);

        wait.until(
                ExpectedConditions.visibilityOf(element));
    }


    public static boolean isElementPresent(WebElement element, int timeout) {
        WebDriver driver = DriverManager.getDriver();

        try {
            WebDriverWait wait = new WebDriverWait(driver, timeout);
            wait.pollingEvery(100, TimeUnit.MILLISECONDS).ignoring(NoSuchElementException.class).until(ExpectedConditions.visibilityOf(element));
            return true;
        } catch (TimeoutException e) {
            return false;
        }
    }

}

