package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.w3c.dom.html.HTMLInputElement;

public class TheShopsPage extends BasePage{
    public TheShopsPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getIrcutsk() {
        return getElementByXpath("//a[text()='Иркутск']");
    }

    public WebElement clickOnBasket() {
        return getElementByXpath("//div[@id='cartBlock']");
    }

    public WebElement clickOnMessage() {
        return getElementByXpath("//div[@class='backdrop-close']");
    }
}
