package org.testinterview.tests;

import org.apache.log4j.Logger;
import org.testinterview.objects.User;
import org.testng.annotations.BeforeClass;
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

    @Test
    public void setFullName() throws InterruptedException {
        LOG.info("start 'generateDrafts'");
        Thread.sleep(5000);
    }

}
