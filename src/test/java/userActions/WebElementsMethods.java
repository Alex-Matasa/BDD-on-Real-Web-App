package userActions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static sharedData.DriverSetup.getDriver;

public class WebElementsMethods {

    private WebDriver driver;
    JavascriptExecutor jsExecutor = (JavascriptExecutor) getDriver();
    WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(15));



    public void clickOn(WebElement webElement) {
        webElement.click();
    }

    public void clickOnJSE(WebElement webElement) {
        jsExecutor.executeScript("arguments[0].click();", webElement);
    }

    public void clickOn(List<WebElement> list, String text) {
        list.stream().filter(s -> s.getText().equals(text)).findFirst().orElse(null).click();
    }

    public void waitAndClickOn (WebElement webElement) {
        wait.until(ExpectedConditions.visibilityOf (webElement)).click();
    }

    public String getText (WebElement webElement) {

        wait.until(ExpectedConditions.visibilityOf(webElement));
        return webElement.getText();

    }

    public void sendKeys (WebElement webElement, String text) {
        webElement.sendKeys(text);
    }

    public boolean containsText(List <WebElement> webElementList, String expectedText) {
        return webElementList.stream()
                .map(WebElement::getText)
                .allMatch(text ->text.toLowerCase().contains(expectedText));
    }

    public boolean containsText(WebElement webElement, String expectedText) {
        return webElement.getText().toLowerCase().contains(expectedText);
    }





    public void getTextForAll(List <WebElement> webElementList) {
        webElementList
                .forEach(element -> System.out.println(element.getText()));
    }






}
