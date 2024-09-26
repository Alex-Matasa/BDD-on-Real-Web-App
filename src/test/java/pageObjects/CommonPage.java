package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CommonPage extends BasePage{

    public CommonPage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//ul[@class='header-menu']/li/a")
    private List<WebElement> headerMenu;
    @FindBy(xpath = "//title[@id='cart']/ancestor::button")
    private WebElement cart;
    @FindBy(xpath = "//input[@id='inputSearch']")
    private WebElement searchField;
    @FindBy(xpath = "//input[@data-test='search-input']")
    private WebElement searchInput;


    public void headerMenuClick(String itemName) {
        webElementsMethods.clickOn(headerMenu, itemName);
    }

    public void searchForAProduct(String text) {
        webElementsMethods.clickOn(searchField);
        webElementsMethods.sendKeys(searchInput, text);

    }





}
