package org.testinterview.ui.elements.elementspage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testinterview.service.WaitService;
import ru.yandex.qatools.htmlelements.element.TypifiedElement;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatePicker extends TypifiedElement {

    public DatePicker(WebElement wrappedElement) {
        super(wrappedElement);
    }

    public void setDate(String dateCalendar) {
        Date date = parseDate(dateCalendar);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        WaitService.waitForVisibilityOfElement(getWrappedElement());
        getWrappedElement().click();

        setYear(String.valueOf(calendar.get(Calendar.YEAR)));
        setMonth(getNameOfMonth(calendar.get(Calendar.MONTH)));
        setDay(String.valueOf(calendar.get(Calendar.DAY_OF_MONTH)));
    }

    public void setYear(String year) {
        WebElement webElement = getWrappedElement().findElement(By.xpath(String.format("//ul[contains(@class, 'date-picker-years')]//li[contains(text(), '%s')]", year)));
        webElement.click();
    }

    public void setMonth(String month) {
        WebElement webElement = getWrappedElement().findElement(By.xpath(String.format("//div[contains(@class, 'date-picker-table--month')]//table//tr//button[.//div[contains(text(), 'Янв.')]]", month)));
        webElement.click();
    }

    public void setDay(String day) {
        WebElement webElement = getWrappedElement().findElement(By.xpath(String.format("//ul[contains(@class, 'date-picker-years')]//li[contains(text(), '%s')]", month)));
        webElement.click();
    }

    private String getNameOfMonth(int month) {
        switch (month) {
            case 1:
                return "Янв.";
            case 2:
                return "Фев.";
            case 3:
                return "март";
            case 4:
                return "Апр.";
            case 5:
                return "Май";
            case 6:
                return "Июнь";
            case 7:
                return "Июль";
            case 8:
                return "Авг.";
            case 9:
                return "Сен.";
            case 10:
                return "Окт.";
            case 11:
                return "Ноя.";
            case 12:
                return "Дек.";
        }
        return "";
    }

    private Date parseDate(String date) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd").parse(date);
        } catch (ParseException e) {
            return null;
        }
    }
}
