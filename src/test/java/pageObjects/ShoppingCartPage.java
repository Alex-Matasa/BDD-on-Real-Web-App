package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ShoppingCartPage extends BasePage{

    public ShoppingCartPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//button[text()='Remove']/ancestor::div/a/h5")
    private WebElement productName;
    @FindBy(xpath = "//div[@id='js-checkout-button']/descendant::button")
    private WebElement continueToCheckOut;




    public String getAddedProductName() {
        return webElementsMethods.getText(productName);
    }

    public boolean shoppingCartIsNotEmpty(){
        return webElementsMethods.getText(continueToCheckOut).equals("Continue to checkout");
    }













}
