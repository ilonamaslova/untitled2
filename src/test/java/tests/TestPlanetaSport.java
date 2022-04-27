package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.BallPage;
import pageObjects.BasketSportPage;
import pageObjects.HomeSportPage;
import pageObjects.TheShopsPage;

public class TestPlanetaSport extends TestInit{

    @Test
    public void checkingElementsOnSite(){
        HomeSportPage homeSportPage = new HomeSportPage(driver);
        homeSportPage.navigation();

        Assert.assertTrue(homeSportPage.getLogo().isDisplayed());

        homeSportPage.clickOnSearch().click();
        homeSportPage.getInputSearch().sendKeys("ball\n");

        BallPage ballPage = new BallPage(driver);

        sleep(2);
        Assert.assertTrue(ballPage.getTextInformation().getText().contains("Информация"));

        ballPage.clickOnPurchase().click();
        ballPage.chickOnTheShops().click();

        TheShopsPage theShopsPage = new TheShopsPage(driver);

        sleep(2);
        Assert.assertTrue(theShopsPage.getIrcutsk().getText().contains("Иркутск"));

//        theShopsPage.clickOnMessage().click();
        theShopsPage.clickOnBasket().click();

        BasketSportPage basketSportPage = new BasketSportPage(driver);

        sleep(2);
        Assert.assertTrue(basketSportPage.getTextForCustomer().getText().contains("В корзине нет товаров"));


    }
}
