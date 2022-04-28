package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LaptopPage;
import pageObjects.LocationPage;
import pageObjects.SearchLaptopPage;
import pageObjects.TradeHomePage;

public class TestTradeRu extends TestInit{

    @Test
    public void checkingRandomElement(){

        TradeHomePage tradeHomePage = new TradeHomePage(driver);
        tradeHomePage.getNavigation();
        tradeHomePage.clickOnLocation().click();

        LocationPage locationPage = new LocationPage(driver);
        sleep(2);
        locationPage.clickOnPodolsk().click();

        Assert.assertTrue(tradeHomePage.getBtnCatalog().isDisplayed());
        Assert.assertTrue(tradeHomePage.getLogo().isDisplayed());
        Assert.assertTrue(driver.getTitle().contains("Интернет-магазин"));

        tradeHomePage.getInput().sendKeys("ноутбук\n");

         SearchLaptopPage searchLaptopPage = new SearchLaptopPage(driver);

         sleep(1);
         searchLaptopPage.selectListItem().click();

         LaptopPage laptopPage = new LaptopPage(driver);

         sleep(2);
         Assert.assertTrue(laptopPage.getWordLaptop().getText().contains("Ноутбуки"));


    }
}
