package sharedData;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class DriverSetup {

    private static WebDriver driver;


    private static WebDriver createDriver() {
        driver = null;

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-search-engine-choice-screen");
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        return driver;
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            driver = createDriver();
        }

        return driver;
    }

    public static void cleanupDriver() {
        driver.quit();
        driver = null;
    }


}
