package org.testinterview.dataproviders;

import org.testinterview.objects.User;
import org.testng.annotations.DataProvider;

public class SmokeTestsDataProvider {
    @DataProvider(name = "smoke-data-provider")
    public Object[][] smokeDataProvider(){
        return new Object[][] { {new User("3333", "3434343", "34343455555")}};
    }
}
