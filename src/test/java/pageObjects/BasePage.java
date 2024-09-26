package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import userActions.WebElementsMethods;

public class BasePage {

    protected WebDriver driver;
    protected WebElementsMethods webElementsMethods;


    public BasePage(WebDriver driver) {
        this.driver = driver;
        webElementsMethods = new WebElementsMethods();
        PageFactory.initElements(driver, this);
    }





}
