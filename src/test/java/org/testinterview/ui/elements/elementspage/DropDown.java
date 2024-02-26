package org.testinterview.ui.elements.elementspage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testinterview.service.WaitService;
import org.testinterview.webdriver.DriverManager;
import ru.yandex.qatools.htmlelements.element.TypifiedElement;

public class DropDown extends TypifiedElement {
    private final JavascriptExecutor javascriptExecutor;

    public DropDown(WebElement wrappedElement) {
        super(wrappedElement);
        this.javascriptExecutor = (JavascriptExecutor) DriverManager.getDriver();
    }

    public void setValue(String value) {
        WaitService.waitForVisibilityOfElement(getWrappedElement());
        javascriptExecutor.executeScript("arguments[0].click();", getWrappedElement());

        WaitService.waitUntilPresenceOfElementLocated(String.format("//div[contains(@class,'select-list')]" +
                "//div[@role='listitem']//div[contains(text(), '%s')]", value));

        WebElement webElement = getWrappedElement().findElement(By.xpath(String
                .format("//div[contains(@class,'select-list')]//div[@role='listitem']" +
                        "//div[contains(text(), '%s')]", value)));

        javascriptExecutor.executeScript("arguments[0].click();", webElement);
    }
}
