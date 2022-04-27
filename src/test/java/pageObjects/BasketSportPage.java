package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasketSportPage extends BasePage {
    public BasketSportPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getTextForCustomer() {
        return getElementByXpath("//h3[text()='В корзине нет товаров']");
    }
}
