package org.testinterview.tests;

import org.apache.log4j.Logger;
import org.testinterview.generators.VirtualReceptionGenerator;
import org.testinterview.objects.VirtualReceptionForm;
import org.testinterview.ui.pages.VirtualReceptionPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ResourceBundle;

public class CheckVirtualReceptionSmokeTest extends BaseTest{
    private VirtualReceptionPage virtualReceptionPage;
    private static final Logger LOG = Logger.getLogger(CheckVirtualReceptionSmokeTest.class);

    @BeforeClass
    public void setup() {
        virtualReceptionPage = new VirtualReceptionPage();
    }

    @Test(dataProvider = "smoke-data-provider")
    public void smokeTest(VirtualReceptionForm virtualReceptionForm) throws InterruptedException {
        LOG.info("start ''");

        virtualReceptionPage
                .setFullName(virtualReceptionForm.getFullName())
                .setContactPhoneNumber(virtualReceptionForm.getContactPhoneNumber())
                .setRegion(virtualReceptionForm.getRegion())
                .setEmail(virtualReceptionForm.getEmail())
                .setAddress(virtualReceptionForm.getAddress())
                .setSubjectType(virtualReceptionForm.getSubjectType())
                .setGender(virtualReceptionForm.getGender())
                .setDateOfBirth(virtualReceptionForm.getDateOfBirth())
                .setTypeOfAppeal(virtualReceptionForm.getTypeOfAppeal())
                .setStatusInput(virtualReceptionForm.getStatus())
                .setTextOfAppeal(virtualReceptionForm.getTextOfAppeal())
                .clickOnSendButton();

        Thread.sleep(5000);
    }

    @DataProvider(name = "smoke-data-provider")
    public Object[][] smokeDataProvider(){
        return new Object[][] { { VirtualReceptionGenerator.VirtualReceptionTestDataGenerator()}};
    }
}