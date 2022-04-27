package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.w3c.dom.html.HTMLInputElement;

public class HomeSportPage extends BasePage {
    public HomeSportPage(WebDriver driver) {
        super(driver);
    }

    public void navigation() {
        driver.get("https://www.planeta-sport.ru/");
    }

    public WebElement getLogo() {
        return getElementByXpath("//a[@class='main-logo']");
    }

    public WebElement clickOnSearch() {
        return getElementByXpath("//div[@class='top-menu__search-wrap js-search']");
    }

    public WebElement getInputSearch() {
        return getElementByXpath("//input[@id='title-search-input-menu']");
    }
}
