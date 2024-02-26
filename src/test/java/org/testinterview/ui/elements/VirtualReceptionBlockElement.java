package org.testinterview.ui.elements;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testinterview.service.WaitService;
import org.testinterview.ui.elements.elementspage.DatePicker;
import org.testinterview.ui.elements.elementspage.DropDown;
import org.testinterview.webdriver.DriverManager;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.TextInput;

@FindBy(xpath = "//form[@class='v-form']")
public class VirtualReceptionBlockElement extends CommonElement{
    @Name("ФИО")
    @FindBy(xpath = "//div[@class='v-input__slot']//input[@aria-label='Ф И О']")
    private TextInput fullNameInput;

    @Name("Контактный телефон")
    @FindBy(xpath = "//div[@class='v-input__slot']//input[@aria-label='Контактный телефон']")
    private TextInput contactPhoneNumberInput;

    @Name("Электронная почта")
    @FindBy(xpath = "//div[@class='v-input__slot']//input[@aria-label='Электронная почта']")
    private TextInput emailInput;

    @Name("Регион")
    @FindBy(xpath = "//div[@class='v-input__slot']//input[@aria-label='Регион']")
    private DropDown regionInput;

    @Name("Адрес")
    @FindBy(xpath = "//div[@class='v-input__slot']//input[@aria-label='Адрес']")
    private TextInput addressInput;

    @Name("Тип субъекта")
    @FindBy(xpath = "//div[@class='v-input__slot']//input[@aria-label='Тип субъекта']")
    private DropDown subjectTypeInput;

    @Name("Пол")
    @FindBy(xpath = "//div[@class='v-input__slot']//input[@aria-label='Пол']")
    private DropDown genderInput;

    @Name("Дата рождения")
    @FindBy(xpath = "//div[@class='v-input__slot']//input[@aria-label='Дата рождения']")
    private DatePicker dateOfBirthInput;

    @Name("Тип обращения")
    @FindBy(xpath = "//div[@class='v-input__slot']//input[@aria-label='Тип обращения']")
    private DropDown typeOfAppealInput;

    @Name("Статус")
    @FindBy(xpath = "//div[@class='v-input__slot']//input[@aria-label='Статус']")
    private DropDown statusInput;

    @Name("Текст обращения")
    @FindBy(xpath = "//div[@class='v-input__slot']//textarea[@aria-label='Текст обращения']")
    private TextInput textOfAppealInput;

    @Name("Отправить")
    @FindBy(xpath = "//form[@class='v-form']//button[.//div[contains(text(), 'Отправить')]]")
    private Button sendButton;

    public void setFullName(String fullName) {
        WaitService.waitForVisibilityOfElement((WebElement) fullNameInput);
        fullNameInput.sendKeys(fullName);
    }

    public void setContactPhoneNumber(String contactPhoneNumber) {
        WaitService.waitForVisibilityOfElement(contactPhoneNumberInput.getWrappedElement());

        contactPhoneNumberInput.clear();
        contactPhoneNumberInput.sendKeys(contactPhoneNumber);
    }

    public void setEmail(String email) {
        WaitService.waitForVisibilityOfElement(emailInput);
        emailInput.sendKeys(email);    }

    public void setRegion(String region) {
        WaitService.waitForVisibilityOfElement(regionInput);
        regionInput.setValue(region);
    }

    public void setAddress(String address) {
        WaitService.waitForVisibilityOfElement(addressInput);

        addressInput.clear();
        addressInput.sendKeys(address);
    }

    public void setSubjectType(String subjectType) {
        WaitService.waitForVisibilityOfElement(addressInput);
        subjectTypeInput.setValue(subjectType);
    }

    public void setGender(String gender) {
        WaitService.waitForVisibilityOfElement(genderInput);

        genderInput.setValue(gender);
    }

    public void setDateOfBirth(String dateOfBirth) {
        WaitService.waitForVisibilityOfElement(dateOfBirthInput);
        dateOfBirthInput.setDate(dateOfBirth);
    }

    public void setTypeOfAppeal(String typeOfAppeal) {
        WaitService.waitForVisibilityOfElement(typeOfAppealInput);
        typeOfAppealInput.setValue(typeOfAppeal);
    }

    public void setStatusInput(String status) {
        WaitService.waitForVisibilityOfElement(statusInput);
        statusInput.setValue(status);
    }

    public void setTextOfAppeal(String textOfAppeal) {
        WaitService.waitForVisibilityOfElement(textOfAppealInput);
        textOfAppealInput.sendKeys(textOfAppeal);
    }

    public void clickOnSendButton() {
        WaitService.waitForVisibilityOfElement(sendButton);
        sendButton.click();
    }
}
