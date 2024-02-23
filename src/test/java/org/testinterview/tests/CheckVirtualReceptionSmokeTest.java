package org.testinterview.tests;

import org.apache.log4j.Logger;
import org.testinterview.generators.VirtualReceptionGenerator;
import org.testinterview.objects.User;
import org.testinterview.ui.pages.VirtualReceptionPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ResourceBundle;

public class CheckVirtualReceptionSmokeTest extends BaseTest{
    private ResourceBundle resource = ResourceBundle.getBundle("config");
    private static final Logger LOG = Logger.getLogger(CheckVirtualReceptionSmokeTest.class);

    private User user;

    @BeforeClass
    public void setup() {
        user = new User("TestName","LastName","SecondName");
    }

    @Test(dataProvider = "smoke-data-provider")
    public void smokeTest(User userc) throws InterruptedException {
        LOG.info("start ''");
        Thread.sleep(5000);
        VirtualReceptionPage virtualReceptionPage = new VirtualReceptionPage();
        virtualReceptionPage.SetFullName(userc);
        Thread.sleep(5000);
    }

    @DataProvider(name = "smoke-data-provider")
    public Object[][] smokeDataProvider(){
        return new Object[][] { { VirtualReceptionGenerator.VirtualReceptionTestDataGenerator()}};
    }
}
