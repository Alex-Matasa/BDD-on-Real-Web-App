package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class InstrumentsPage extends BasePage{


    public InstrumentsPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//div[contains(@class, 'card border')]/div[@class='ais-InfiniteHits']")
    private List <WebElement> mainProductsLIst;
    @FindBy(xpath = "//input[@placeholder='0']")
    private WebElement minPrice;
    @FindBy(xpath = "//input[@placeholder='999']")
    private WebElement maxPrice;
    @FindBy(xpath = "//button[text()='Apply']")
    private WebElement applyPriceButton;




    public void clickOnAddToCart(){

        webElementsMethods.clickOn(mainProductsLIst.stream().
                map(element ->element.findElement(By.xpath("/descendant::button[text()='Add to cart']"))).
                toList().get(0));
    }

    public void clickOnFirstProduct(){
        webElementsMethods.clickOn(mainProductsLIst.stream().
                map(element ->element.findElement(By.xpath("/descendant::div[@class='w-100']"))).
                toList().get(0));
    }

    public void setMinPrice(String minValue) {
        webElementsMethods.sendKeys(minPrice, minValue);

    }

    public void setMaxPrice(String maxValue) {
        webElementsMethods.sendKeys(maxPrice, maxValue);

    }

    public void clickOnApplyButton(){
        webElementsMethods.clickOn(applyPriceButton);
    }














}
