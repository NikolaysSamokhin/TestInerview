package org.testinterview.ui.elements;

import org.openqa.selenium.support.FindBy;
import org.testinterview.objects.User;
import org.testinterview.service.WaitService;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.TextInput;

@FindBy(xpath = "//form[@class='v-form']")
public class VirtualReceptionBlock extends CommonElement{
    @Name("ФИО")
    @FindBy(xpath = "//div[@class='v-input__slot']//input[@aria-label='Ф И О']")
    private TextInput fullNameInput;

    public void setFullName(User user) {
        WaitService.waitForVisibilityOfElement(fullNameInput);
        fullNameInput.sendKeys(user.getName());
    }


}
