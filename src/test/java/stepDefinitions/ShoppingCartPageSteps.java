package stepDefinitions;

import io.cucumber.java.en.Then;
import org.testng.Assert;
import pageObjects.ShoppingCartPage;

import static sharedData.DriverSetup.getDriver;

public class ShoppingCartPageSteps {

    ShoppingCartPage shoppingCartPage = new ShoppingCartPage(getDriver());

    @Then("The added product is visible on Shopping cart page")
    public void theProductIsAdded() {
        Assert.assertTrue(shoppingCartPage.shoppingCartIsNotEmpty());
    }


}
