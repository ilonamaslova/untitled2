package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.w3c.dom.html.HTMLInputElement;

public class PhonePage extends BasePage {
    public PhonePage(WebDriver driver) {
        super(driver);
    }

    public WebElement getTextPhone() {
        return getElementByXpath("//h1");
    }

    public WebElement getBtnMenu() {
        return getElementByXpath("//button[@class='header__button ng-tns-c107-1']");
    }

    public WebElement getBtnLangUA() {
        return getElementByXpath("//span[@class='lang__link lang__link--active ng-star-inserted']");
    }

    public WebElement clickBtnMenu() {
        return getElementByXpath("//button[@id='fat-menu']");
    }
}
