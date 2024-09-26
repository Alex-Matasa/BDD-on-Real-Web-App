package stepDefinitions;

import io.cucumber.java.en.Given;
import pageObjects.HomePage;

import static sharedData.DriverSetup.getDriver;


public class HomePageSteps{

    HomePage homePage = new HomePage(getDriver());

// loadable component (CUSTOM) - aplicabil in BasePage



    @Given("Access home page")
    public void accessHomePage() {
        homePage.accessHomePage();
        homePage.acceptCookies();
    }










}
