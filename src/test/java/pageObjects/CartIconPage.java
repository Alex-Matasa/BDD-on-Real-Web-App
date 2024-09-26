package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartIconPage extends BasePage{

    public CartIconPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[text()='View cart']")
    private WebElement viewCart;

    public void clickOnViewCart() {
        webElementsMethods.clickOn(viewCart);
    }


}
