package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    public String getEnv(){
        if (System.getProperty("env") == null){
            return "https://qa2.eatstreet.com";
        }else {
            return "https://" + System.getProperty("env") + ".eatstreet.com";
        }
    }
    public void sleep(int miliseconds){
        try {
            Thread.sleep(miliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public WebElement getElementByXpath(String locator){
        sleep(getSlowMoNun());
        return driver.findElement(By.xpath(locator));
    }

    private int getSlowMoNun() {
        if (System.getProperty("slow_mo") == null){
            return 0;
        }else {
            return Integer.parseInt(System.getProperty("slow_mo"));
        }

    }


}
