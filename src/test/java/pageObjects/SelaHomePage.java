package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelaHomePage extends BasePage {
    public SelaHomePage(WebDriver driver) {
        super(driver);
    }

    public void navigation() {
        driver.get("https://www.sela.ru/");
    }

    public WebElement getBtnMenu() {
        return getElementByXpath("//button[@class='header__burger js-header-burger']");
    }

    public WebElement getImgFooter() {
        return getElementByXpath("//div[@class='footer__apps-list']");
    }

    public WebElement getImgSocialList() {
        return getElementByXpath("//div[@class='footer__social-list']");
    }

    public WebElement getImgAppsList() {
        return getElementByXpath("//div[@class='footer__apps-list']");
    }

    public WebElement getUserMenuList() {
        return getElementByXpath("//ul[@class='header__user-menu-list']");
    }

    public WebElement getInputGmail() {
        return getElementByXpath("//input[@class='js-input-email']");
    }
}
