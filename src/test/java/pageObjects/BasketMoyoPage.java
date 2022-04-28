package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javax.swing.*;

public class BasketMoyoPage extends BasePage {
    public BasketMoyoPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getWordBasket() {
        return getElementByXpath("//div[text()='Кошик']");
    }
}
