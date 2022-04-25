package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javax.swing.*;

public class BasketPage extends BasePage {
    public BasketPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getTextForCustomer() {
        return getElementByXpath("//p[text()='ВАШ КОШИК ПОРОЖНІЙ']");
    }
}
