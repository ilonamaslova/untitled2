package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.w3c.dom.html.HTMLInputElement;

public class BallPage extends BasePage {
    public BallPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getTextInformation() {
        return getElementByXpath("//div[text()='Информация']");
    }

    public WebElement clickOnPurchase() {
        return getElementByXpath("//div[text()='Покупки']");
    }

    public WebElement chickOnTheShops() {
        return getElementByXpath("//a[text()='Магазины']");
    }
}
