package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javax.swing.*;

public class MenuPage extends BasePage {
    public MenuPage(WebDriver driver) {
        super(driver);
    }


    public WebElement getElementLi() {
        return getElementByXpath("//a[@class='menu-categories__link js-menu-categories__link menu-categories__link_state_hovered']");
    }

    public WebElement getElementLiTelefonyElectronika() {
        return getElementByXpath("//a[@class='menu-categories__link js-menu-categories__link menu-categories__link_state_hovered']");
    }
}
