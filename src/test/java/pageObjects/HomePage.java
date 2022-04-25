package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.w3c.dom.html.HTMLInputElement;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public WebElement clickBtnGotIn() {
        return getElementByXpath("//button[@class='btn']");
    }

    public WebElement getLogo() {

        return getElementByXpath("//img[@class='logo-alternate']");
    }

    public WebElement getSignInBtn(){
        return getElementByXpath("//a[@id='menu-signin']");
    }

    public WebElement getSearchInput(){
        return getElementByXpath("//input[@id='input-food-search']");
    }

    public void navigate() {
        driver.get(getEnv());
    }


}
