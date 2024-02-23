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

        dateOfBirthInput.clear();
        contactPhoneNumberInput.sendKeys(contactPhoneNumber);
    }

    public void setEmail(String email) {
        WaitService.waitForVisibilityOfElement(emailInput);

        dateOfBirthInput.clear();
        emailInput.sendKeys(email);    }

    public void setRegion(String region) {
        WaitService.waitForVisibilityOfElement(regionInput);

        dateOfBirthInput.clear();
        regionInput.sendKeys(region);
    }

    public void setAddress(String address) {
        WaitService.waitForVisibilityOfElement(addressInput);

        dateOfBirthInput.clear();
        addressInput.sendKeys(address);
    }

    public void setSubjectType(String subjectType) {
        WaitService.waitForVisibilityOfElement(addressInput);
        dateOfBirthInput.clear();

        subjectTypeInput.sendKeys(subjectType);
    }

    public void setGender(String gender) {
        WaitService.waitForVisibilityOfElement(genderInput);
        dateOfBirthInput.clear();

        genderInput.sendKeys(gender);
    }

    public void setDateOfBirth(String dateOfBirth) {
        WaitService.waitForVisibilityOfElement(dateOfBirthInput);
        dateOfBirthInput.clear();

        dateOfBirthInput.sendKeys(dateOfBirth);
    }

    public void setTypeOfAppeal(String typeOfAppeal) {
        WaitService.waitForVisibilityOfElement(typeOfAppealInput);
        typeOfAppealInput.sendKeys(typeOfAppeal);
    }

    public void setStatusInput(String status) {
        WaitService.waitForVisibilityOfElement(statusInput);
        statusInput.sendKeys(status);
    }

    public void setTextOfAppeal(String textOfAppeal) {
        WaitService.waitForVisibilityOfElement(textOfAppealInput);
        statusInput.sendKeys(textOfAppeal);
    }

    public void ClickOnSendButton() {
        WaitService.waitUntilElementToBeClickable(sendButton);
        sendButton.click();
    }
}
