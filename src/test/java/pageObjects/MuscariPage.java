package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.w3c.dom.html.HTMLInputElement;

import javax.swing.*;

public class MuscariPage extends BasePage {
    public MuscariPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getWordsMuscari() {
        return getElementByXpath("//h1");
    }

    public WebElement getPriceFrom() {
        return getElementByXpath("//input[@id='price-from']");
    }

    public WebElement getPriceTo() {
        return getElementByXpath("//input[@id='price-to']");
    }

    public WebElement clickProducerHolland() {
        return getElementByXpath("//label[@for='brand-5']");
    }

    public WebElement clickTuckUp() {
        return getElementByXpath("//button[@class='filter-button do-search']");
    }

    public WebElement getTextForCustomer() {
        return getElementByXpath("//p[text()='По заданным параметрам не найден ни один товар']");
    }
}
