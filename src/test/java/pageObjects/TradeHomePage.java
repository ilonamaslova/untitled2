package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.w3c.dom.html.HTMLInputElement;

public class TradeHomePage extends BasePage {
    public TradeHomePage(WebDriver driver) {
        super(driver);
    }

    public void getNavigation() {
        driver.get("https://www.onlinetrade.ru/");
    }

    public WebElement clickOnLocation() {
        return getElementByXpath("//div[@class='header__mainlinks__geo']");
    }

    public WebElement getBtnCatalog() {
        return getElementByXpath("//a[@class='header__button header__buttonCatalog  js__catalogLine__mainLink ']");
    }

    public WebElement getLogo() {
        return getElementByXpath("//img[@id='logo']");
    }

    public WebElement getInput() {
        return getElementByXpath("//input[@class='header__search__inputText js__header__search__inputText']");
    }
}
