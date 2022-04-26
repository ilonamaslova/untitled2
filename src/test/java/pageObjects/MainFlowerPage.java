package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.w3c.dom.html.HTMLInputElement;

public class MainFlowerPage extends BasePage{
    public MainFlowerPage(WebDriver driver) {
        super(driver);
    }

    public void navigation() {
        driver.get("http://flower.sumy.ua/");
    }

    public WebElement getImg() {
        return getElementByXpath("//img[@alt='Интернет Магазин Flower']");
    }

    public WebElement getElementHome() {
        return getElementByXpath("//a[text()='Главная']");
    }

    public WebElement getElementHowToBuy() {
        return getElementByXpath("//a[text()='Как купить']");
    }

    public WebElement getElementContacts() {
        return getElementByXpath("//a[text()='Контакты']");
    }

    public WebElement clickOnSnowdrop() {
        return getElementByXpath("//a[@href='http://flower.sumy.ua/podsnezhnik-galanthus-galantus/c53']");
    }
}
