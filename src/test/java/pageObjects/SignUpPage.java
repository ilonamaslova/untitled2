package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.w3c.dom.html.HTMLInputElement;

public class SignUpPage extends BasePage {
    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getInput() {
        return getElementByXpath("//input[@id='js-auth-input-field']");
    }

    public WebElement clickConfirm() {
        return getElementByXpath("//button[@class='btn js-auth-form-submit']");
    }

    public WebElement getErrorText() {
        return getElementByXpath("//div[@class='input_error-text']");
    }

    public WebElement getBtnClose() {
        return getElementByXpath("//div[@class='login-form_close js-auth-modal-close']");
    }
}
