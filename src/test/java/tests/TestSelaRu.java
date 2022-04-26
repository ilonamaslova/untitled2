package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.SelaHomePage;

public class TestSelaRu extends TestInit{

    @Test
    public void checkElementsOnSite(){
        SelaHomePage selaHomePage = new SelaHomePage(driver);
        selaHomePage.navigation();

        Assert.assertTrue(selaHomePage.getBtnMenu().isDisplayed());
        Assert.assertTrue(selaHomePage.getImgFooter().isDisplayed());
        Assert.assertTrue(selaHomePage.getImgSocialList().isDisplayed());
        Assert.assertTrue(selaHomePage.getImgAppsList().isDisplayed());
        Assert.assertTrue(selaHomePage.getUserMenuList().isDisplayed());

        selaHomePage.getInputGmail().sendKeys("thththtddh\n");
    }
}
