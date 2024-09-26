package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

import static sharedData.DriverSetup.cleanupDriver;
import static sharedData.DriverSetup.getDriver;

public class Hooks {

    public WebDriver driver;



    @Before
    public void prepareEnvironment(){
        getDriver();
    }

    @After
    public void clearEnvironment() {
        cleanupDriver();
    }
}
