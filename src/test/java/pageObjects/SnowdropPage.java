package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.w3c.dom.html.HTMLInputElement;

public class SnowdropPage extends BasePage {
    public SnowdropPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getWordsSnowdrop() {

        return getElementByXpath("//h1");
    }

    public WebElement getCopiright() {
        return getElementByXpath("//div[@class='copy']");
    }

    public WebElement clickOnMuscari() {
        return getElementByXpath("//A[@href='http://flower.sumy.ua/muskari-muscari/c21']");
    }
}
