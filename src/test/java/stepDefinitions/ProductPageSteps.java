package stepDefinitions;

import io.cucumber.java.en.And;
import pageObjects.ProductPage;

import static sharedData.DriverSetup.getDriver;

public class ProductPageSteps {

    ProductPage productPage = new ProductPage(getDriver());

    @And("Click on Add to cart button at the top")
    public void clickOnAddToCartTop() {
        productPage.clickOnAddToCartTop();
    }

    @And("Click on View cart button")
    public void clickOnViewCart() {
        productPage.clickOnViewCartButton();
    }

}
