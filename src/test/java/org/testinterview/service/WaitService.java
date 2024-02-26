package org.testinterview.service;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testinterview.webdriver.DriverManager;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class WaitService extends BaseService{

    public static void waitUntilElementToBeClickable(WebElement element) {
        WebDriver driver = DriverManager.getDriver();
        FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(17))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class, ElementNotVisibleException.class);

        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void waitUntilElementToBeClickable(String stringXpath) {
        WebDriver driver = DriverManager.getDriver();

        FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(17))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class, ElementNotVisibleException.class);

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(stringXpath)));
    }

    public static void waitUntilPresenceOfElementLocated(String stringXpath) {
        WebDriver driver = DriverManager.getDriver();

        FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(17))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class, ElementNotVisibleException.class);

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(stringXpath)));
    }

    public static void waitForVisibilityOfElement(WebElement element) {
        WebDriver driver = DriverManager.getDriver();

        FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(17))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class, ElementNotVisibleException.class);

        wait.until(
                ExpectedConditions.visibilityOf(element));
    }

}
