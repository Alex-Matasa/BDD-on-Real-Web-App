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




    @And("set max value {word}")
    public void setMaxValueMaxValue(String maxValue) {
        instrumentsPage.setMaxPrice(maxValue);
    }

    @And("set min value {word}")
    public void setMinValueMinValue(String minValue) {
        instrumentsPage.setMinPrice(minValue);
    }

    @And("clickOnApply")
    public void clickonapply() {
        instrumentsPage.clickOnApplyButton();
    }
}
