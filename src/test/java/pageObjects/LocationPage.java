package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.w3c.dom.html.HTMLInputElement;

public class LocationPage extends BasePage {
    public LocationPage(WebDriver driver) {
        super(driver);
    }

    public WebElement clickOnPodolsk() {
        return getElementByXpath("//a[text()='Подольск']");
    }
}
