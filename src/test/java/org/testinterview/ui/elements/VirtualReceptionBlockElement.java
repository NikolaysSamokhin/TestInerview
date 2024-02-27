package org.testinterview.ui.elements;

import org.openqa.selenium.support.FindBy;
import org.testinterview.constants.ErrorMessagesText;
import org.testinterview.service.WaitService;
import org.testinterview.ui.elements.elementspage.DatePicker;
import org.testinterview.ui.elements.elementspage.DropDown;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.TextBlock;
import ru.yandex.qatools.htmlelements.element.TextInput;

@FindBy(xpath = "//form[@class='v-form']")
public class VirtualReceptionBlockElement extends CommonElement {

    @Name("ФИО")
    @FindBy(xpath = "//div[contains(@class, 'v-input__control')]//input[@aria-label='Ф И О']")
    private TextBlock title;
    @Name("ФИО")
    @FindBy(xpath = "//div[contains(@class, 'v-input__control')]//input[@aria-label='Ф И О']")
    private TextInput fullNameInput;

    @Name("Контактный телефон")
    @FindBy(xpath = "//div[contains(@class, 'v-input__control')]//input[@aria-label='Контактный телефон']")
    private TextInput contactPhoneNumberInput;

    @Name("Электронная почта")
    @FindBy(xpath = "//div[contains(@class, 'v-input__control')]//input[@aria-label='Электронная почта']")
    private TextInput emailInput;

    @Name("Регион")
    @FindBy(xpath = "//div[contains(@class, 'v-input__control')]//input[@aria-label='Регион']")
    private DropDown regionInput;

    @Name("Адрес")
    @FindBy(xpath = "//div[contains(@class, 'v-input__control')]//input[@aria-label='Адрес']")
    private TextInput addressInput;

    @Name("Тип субъекта")
    @FindBy(xpath = "//div[contains(@class, 'v-input__control')]//input[@aria-label='Тип субъекта']")
    private DropDown subjectTypeInput;

    @Name("Пол")
    @FindBy(xpath = "//div[contains(@class, 'v-input__control')]//input[@aria-label='Пол']")
    private DropDown genderInput;

    @Name("Дата рождения")
    @FindBy(xpath = "//div[contains(@class, 'v-input__control')]//input[@aria-label='Дата рождения']")
    private DatePicker dateOfBirthInput;

    @Name("Тип обращения")
    @FindBy(xpath = "//div[contains(@class, 'v-input__control')]//input[@aria-label='Тип обращения']")
    private DropDown typeOfAppealInput;

    @Name("Статус")
    @FindBy(xpath = "//div[contains(@class, 'v-input__control')]//input[@aria-label='Статус']")
    private DropDown statusInput;

    @Name("Текст обращения")
    @FindBy(xpath = "//div[contains(@class, 'v-input__control')]//textarea[@aria-label='Текст обращения']")
    private TextInput textOfAppealInput;

    @Name("Отправить")
    @FindBy(xpath = "//form[@class='v-form']//button[.//div[contains(text(), 'Отправить')]]")
    private Button sendButton;

    //Error messages
    @Name("Error Message Full Name Incorrect Value")
    @FindBy(xpath = "//div[contains(@class, 'v-input__control') and .//input[@aria-label='Ф И О']]//div[contains(@class, 'v-messages__message')]")
    private TextInput fullNameIncorrectValueErrorMessage;

    @Name("Error Message Phone Number")
    @FindBy(xpath = "//div[contains(@class, 'v-input__control') and .//input[@aria-label='Контактный телефон']]" +
            "//div[contains(@class, 'v-messages__message')]")
    private TextInput contactPhoneNumberErrorMessage;

    @Name("Error Message Email")
    @FindBy(xpath = "//div[contains(@class, 'v-input__control') and .//input[@aria-label='Электронная почта']]" +
            "//div[contains(@class, 'v-messages__message')]")
    private TextInput emailErrorMessage;

    @Name("Region Error Message")
    @FindBy(xpath = "//div[contains(@class, 'v-input__control') and .//input[@aria-label='Регион']]" +
            "//div[contains(@class, 'v-messages__message')]")
    private DropDown regionErrorMessage;

    @Name("Address Error Message")
    @FindBy(xpath = "//div[contains(@class, 'v-input__control') and .//input[@aria-label='Адрес']]" +
            "//div[contains(@class, 'v-messages__message')]")
    private TextInput addressErrorMessage;

    @Name("Subject Type Error Message")
    @FindBy(xpath = "//div[contains(@class, 'v-input__control') and .//input[@aria-label='Тип субъекта']]" +
            "//div[contains(@class, 'v-messages__message')]")
    private DropDown subjectTypeErrorMessage;

    @Name("Gender Error Message")
    @FindBy(xpath = "//div[contains(@class, 'v-input__control') and .//input[@aria-label='Пол']]" +
            "//div[contains(@class, 'v-messages__message')]")
    private DropDown genderErrorMessage;

    @Name("Date Of Birth")
    @FindBy(xpath = "//div[contains(@class, 'v-input__control') and .//input[@aria-label='Дата рождения']]" +
            "//div[contains(@class, 'v-messages__message')]")
    private DatePicker dateOfBirthErrorMessage;

    @Name("Type Of Appeal Error Message")
    @FindBy(xpath = "//div[contains(@class, 'v-input__control') and .//input[@aria-label='Тип обращения']]" +
            "//div[contains(@class, 'v-messages__message')]")
    private DropDown typeOfAppealErrorMessage;

    @Name("Status Error Message")
    @FindBy(xpath = "//div[contains(@class, 'v-input__control') and .//input[@aria-label='Статус']]" +
            "//div[contains(@class, 'v-messages__message')]")
    private DropDown statusErrorMessage;

    @Name("Text Of Appeal Error Message")
    @FindBy(xpath = "//div[contains(@class, 'v-input__control') and .//input[@aria-label='Текст обращения']]" +
            "//div[contains(@class, 'v-messages__message')]")
    private TextInput textOfAppealErrorMessage;

    public void setFullName(String fullName) {
        WaitService.waitForVisibilityOfElement(fullNameInput);

        fullNameInput.sendKeys(fullName);
    }

    public void setContactPhoneNumber(String contactPhoneNumber) {
        WaitService.waitForVisibilityOfElement(contactPhoneNumberInput.getWrappedElement());

        contactPhoneNumberInput.clear();
        contactPhoneNumberInput.sendKeys(contactPhoneNumber);
    }

    public void setEmail(String email) {
        WaitService.waitForVisibilityOfElement(emailInput);

        emailInput.sendKeys(email);
    }

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

    public String getFullNameErrorMessage() {
        if(WaitService.isElementPresent(fullNameIncorrectValueErrorMessage, 2)){
            return fullNameIncorrectValueErrorMessage.getText();
        }

        return "";
    }

    public String getContactPhoneNumberErrorMessage() {
        if(WaitService.isElementPresent(contactPhoneNumberErrorMessage, 1)){
            return contactPhoneNumberErrorMessage.getText();
        }

        return "";
    }

    public String getEmailErrorMessage() {
       if(WaitService.isElementPresent(emailErrorMessage, 1)){
           return emailErrorMessage.getText();
       }

        return "";
    }

    public String getRegionErrorMessage() {

        if(WaitService.isElementPresent(regionErrorMessage, 1)){
            return regionErrorMessage.getText();
        }

        return "";
    }

    public String getAddressErrorMessage() {
        if(WaitService.isElementPresent(addressErrorMessage, 1)){
            return addressErrorMessage.getText();
        }

        return "";
    }

    public String getSubjectTypeErrorMessage() {
        if(WaitService.isElementPresent(subjectTypeErrorMessage, 1)){
            return subjectTypeErrorMessage.getText();
        }

        return "";
    }

    public String getStatusErrorMessage() {
        if(WaitService.isElementPresent(statusErrorMessage, 1)){
            return statusErrorMessage.getText();
        }

        return "";
    }

    public String getGenderErrorMessage() {
        if(WaitService.isElementPresent(genderErrorMessage, 1)){
            return genderErrorMessage.getText();
        }

        return "";
    }

    public String getDateOfBirthErrorMessage() {
        if(WaitService.isElementPresent(dateOfBirthErrorMessage, 1)){
            return dateOfBirthErrorMessage.getText();
        }

        return "";
    }

    public String getTypeOfAppealErrorMessage() {
        if(WaitService.isElementPresent(typeOfAppealErrorMessage, 1)){
            return typeOfAppealErrorMessage.getText();
        }

        return "";
    }

    public String getTextOfAppealErrorMessage() {
        if(WaitService.isElementPresent(textOfAppealErrorMessage, 1)){
            return textOfAppealErrorMessage.getText();
        }

        return "";
    }
}
