package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.w3c.dom.html.HTMLInputElement;

public class FirstPage extends BasePage {
    public FirstPage(WebDriver driver) {
        super(driver);
    }

    public void navigation() {
        driver.get("https://www.zara.com/ua/");
    }

    public WebElement clickBtn() {
        return getElementByXpath("//button[@class='button geolocation-modal__button']");
    }

    public WebElement clickBtnOne() {
        return getElementByXpath("//button[@id='onetrust-accept-btn-handler']");
    }

    public WebElement getTextPochatiSeans() {
        return getElementByXpath("//span[text()='ПОЧАТИ СЕАНС']");
    }

    public WebElement getTextDopomoga() {
        return getElementByXpath("//span[text()='ДОПОМОГА']");
    }

    public WebElement getTextPoshuk() {
        return getElementByXpath("//span[text()='Пошук']");
    }

    public WebElement clickBasket() {
        return getElementByXpath("//span[@class='layout-header-links__cart-items-count']");
    }
}
