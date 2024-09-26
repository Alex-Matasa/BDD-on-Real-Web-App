package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pageObjects.CommonPage;
import pageObjects.SearchResultsPage;

import static sharedData.DriverSetup.getDriver;

public class SearchResultsPageSteps {

    SearchResultsPage searchResultsPage = new SearchResultsPage(getDriver());

    @Then("the search results should display products related to {word}")
    public void validateSearchEngine(String text) {
        Assert.assertTrue(searchResultsPage.rightProductsAreShown(text));


    }




}
