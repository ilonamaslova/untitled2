package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage extends BasePage {
    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void navigation() {
        driver.get("https://rozetka.com.ua/ua/");
    }

    public WebElement getMenuBtn() {
        return getElementByXpath("//button[@id='fat-menu']");
    }

    public WebElement getLogoRozetka() {
        return getElementByXpath("//img[@alt='Rozetka Logo']");
    }

    public WebElement getSearchBtn() {
        return getElementByXpath("//button[@class='button button_color_green button_size_medium search-form__submit ng-star-inserted']");
    }

    public WebElement getInputText() {
        return getElementByXpath("//input[@class='search-form__input ng-untouched ng-pristine ng-valid']");
    }
}
