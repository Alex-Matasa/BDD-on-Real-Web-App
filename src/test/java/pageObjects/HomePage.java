package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends BasePage{


    public HomePage(WebDriver driver) {
        super(driver);
    }



    @FindBy(xpath = "//div[@id='cookiescript_accept']")
    private WebElement acceptCookies;


    public void accessHomePage() {
        driver.get("https://www.spitfireaudio.com");

    }


    public void acceptCookies(){
        webElementsMethods.clickOn(acceptCookies);
    }











}
