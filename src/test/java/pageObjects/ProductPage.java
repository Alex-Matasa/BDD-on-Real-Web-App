package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage{

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[text()='Add to cart' and ancestor::nav[@id='js-product-nav']]")
    private WebElement addToCartTop;
    @FindBy(xpath = "//div/a[contains(text(), 'View Cart')]")
    private WebElement viewCart;
    @FindBy(xpath = "//h1[@data-test='product-nav-title']")
    private WebElement productName;




    public void clickOnAddToCartTop(){
        webElementsMethods.clickOn(addToCartTop);

    }

    public void clickOnViewCartButton(){
        webElementsMethods.waitAndClickOn(viewCart);
    }

    public String getProductName() {
        return webElementsMethods.getText(productName);
    }

    // OPW - The Shoe Factory











}
