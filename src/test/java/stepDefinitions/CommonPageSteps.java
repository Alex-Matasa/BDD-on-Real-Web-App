package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pageObjects.CommonPage;

import static sharedData.DriverSetup.getDriver;

public class CommonPageSteps {

    CommonPage commonPage = new CommonPage(getDriver());

    @When("Click on Shop")
    public void clickOnShop() {
        commonPage.headerMenuClick("Shop");
    }

    @When("the user searches for {word}")
    public void search(String text) {
        commonPage.searchForAProduct(text);
    }




}
