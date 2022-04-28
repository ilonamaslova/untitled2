package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.w3c.dom.html.HTMLInputElement;

public class TVPage extends BasePage {
    public TVPage(WebDriver driver) {
        super(driver);
    }


    public WebElement clickSignUp() {
        return getElementByXpath("//div[@class='header_cabinet_link js-auth-modal-show']");
    }
}
