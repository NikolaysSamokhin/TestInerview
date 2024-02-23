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
    private ResourceBundle resource = ResourceBundle.getBundle("config");
    private static final Logger LOG = Logger.getLogger(CheckVirtualReceptionSmokeTest.class);

    @BeforeClass
    public void setup() {
        virtualReceptionPage = new VirtualReceptionPage();
    }

    @Test(dataProvider = "smoke-data-provider")
    public void smokeTest(VirtualReceptionForm virtualReceptionForm) throws InterruptedException {
        LOG.info("start ''");

        virtualReceptionPage.setFullName(virtualReceptionForm.getFullName());

    }

    @DataProvider(name = "smoke-data-provider")
    public Object[][] smokeDataProvider(){
        return new Object[][] { { VirtualReceptionGenerator.VirtualReceptionTestDataGenerator()}};
    }
}