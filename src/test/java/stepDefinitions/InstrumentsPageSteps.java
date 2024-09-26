package stepDefinitions;

import io.cucumber.java.en.And;
import pageObjects.InstrumentsPage;

import static sharedData.DriverSetup.getDriver;

public class InstrumentsPageSteps{

    InstrumentsPage instrumentsPage = new InstrumentsPage(getDriver());


    @And("Click on first product from the list")
    public void clickOnFirstProductFromTheList() {
        instrumentsPage.clickOnFirstProduct();
    }



}
