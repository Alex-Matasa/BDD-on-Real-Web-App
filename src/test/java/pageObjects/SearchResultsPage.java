package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResultsPage extends BasePage{

    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='row']/div[@class='col-lg-4']")
    private List<WebElement> productsList;

    @FindBy(xpath = "//div[@class='row']/div[@class='col-lg-4']/descendant::span/mark")
    private List<WebElement> productsListNested;

    public boolean rightProductsAreShown(String expectedText) {


        return webElementsMethods.containsText(productsListNested,expectedText);


    }

}
