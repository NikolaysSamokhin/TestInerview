package org.testinterview.ui.elements;

import org.openqa.selenium.support.FindBy;
import org.testinterview.service.WaitService;
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
    private TextInput regionInput;

    @Name("Адрес")
    @FindBy(xpath = "//div[@class='v-input__slot']//input[@aria-label='Адрес']")
    private TextInput addressInput;

    @Name("Тип субъекта")
    @FindBy(xpath = "//div[@class='v-input__slot']//input[@aria-label='Тип субъекта']")
    private TextInput subjectTypeInput;

    @Name("Пол")
    @FindBy(xpath = "//div[@class='v-input__slot']//input[@aria-label='Пол']")
    private TextInput genderInput;

    @Name("Дата рождения")
    @FindBy(xpath = "//div[@class='v-input__slot']//input[@aria-label='Дата рождения']")
    private TextInput dateOfBirthInput;

    @Name("Тип обращения")
    @FindBy(xpath = "//div[@class='v-input__slot']//input[@aria-label='Тип обращения']")
    private TextInput typeOfAppealInput;

    @Name("Статус")
    @FindBy(xpath = "//div[@class='v-input__slot']//input[@aria-label='Статус']")
    private TextInput statusInput;

    @Name("Текст обращения")
    @FindBy(xpath = "//div[@class='v-input__slot']//input[@aria-label='Текст обращения']")
    private TextInput textOfAppealInput;

    @Name("Текст обращения")
    @FindBy(xpath = "//button[.//div[contains(text(), 'Отправить')]]")
    private Button sendButton;

    public void setFullName(String fullName) {
        WaitService.waitForVisibilityOfElement(fullNameInput);
        fullNameInput.sendKeys(fullName);
    }

    public void setContactPhoneNumber(String contactPhoneNumber) {
        WaitService.waitForVisibilityOfElement(contactPhoneNumberInput);
        contactPhoneNumberInput.sendKeys(contactPhoneNumber);
    }

    public void setEmail(String email) {
        WaitService.waitForVisibilityOfElement(emailInput);
        emailInput.sendKeys(email);    }

    public void setRegion(String region) {
        WaitService.waitForVisibilityOfElement(regionInput);
        regionInput.sendKeys(region);
    }

    public void setAddress(String address) {
        WaitService.waitForVisibilityOfElement(addressInput);
        addressInput.sendKeys(address);
    }

    public void setSubjectType(String subjectType) {
        WaitService.waitForVisibilityOfElement(addressInput);
        subjectTypeInput.sendKeys(subjectType);
    }

    public void setGender(String gender) {
        WaitService.waitForVisibilityOfElement(genderInput);
        genderInput.sendKeys(gender);
    }

    public void setDateOfBirth(TextInput dateOfBirthInput) {
        this.dateOfBirthInput = dateOfBirthInput;
    }

    public void setTypeOfAppealInput(TextInput typeOfAppealInput) {
        this.typeOfAppealInput = typeOfAppealInput;
    }

    public void setStatusInput(TextInput statusInput) {
        this.statusInput = statusInput;
    }

    public void setTextOfAppealInput(TextInput textOfAppealInput) {
        this.textOfAppealInput = textOfAppealInput;
    }

    public void setSendButton(Button sendButton) {
        this.sendButton = sendButton;
    }
}
