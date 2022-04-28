package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.w3c.dom.html.HTMLInputElement;

public class SearchLaptopPage extends BasePage {
    public SearchLaptopPage(WebDriver driver) {
        super(driver);
    }

    public WebElement selectListItem() {
        return getElementByXpath("//span[text()='Ноутбук']");
    }
}
