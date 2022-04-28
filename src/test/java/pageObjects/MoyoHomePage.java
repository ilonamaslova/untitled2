package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.w3c.dom.html.HTMLInputElement;

public class MoyoHomePage extends BasePage {
    public MoyoHomePage(WebDriver driver) {
        super(driver);
    }

    public void getNavivation() {
        driver.get("https://www.moyo.ua/ua/");
    }

    public WebElement getLogoImg() {
        return getElementByXpath("//img[@alt='MOYO Інтернет-магазин']");
    }

    public WebElement getBtnPaymentAndDelivery() {
        return getElementByXpath("//a[text()='Оплата і доставка']");
    }

    public WebElement getInputSearch() {
        return getElementByXpath("//input[@class='js-header-search-input']");
    }

    public WebElement getBtnBasket() {
        return getElementByXpath("//div[@class='header_actions_item header_actions_cart js-cart-btn']");
    }
}
