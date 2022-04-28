package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.BasketMoyoPage;
import pageObjects.MoyoHomePage;
import pageObjects.SignUpPage;
import pageObjects.TVPage;

public class TestMoyoUa extends TestInit{

    @Test
    public void checkAllElements(){
        MoyoHomePage moyoHomePage = new MoyoHomePage(driver);
        moyoHomePage.getNavivation();

        Assert.assertTrue(moyoHomePage.getLogoImg().isDisplayed());
        Assert.assertTrue(moyoHomePage.getBtnPaymentAndDelivery().isDisplayed());
        Assert.assertTrue(driver.getTitle().contains("Moyo.ua"));

        moyoHomePage.getInputSearch().sendKeys("телевизор\n");

        TVPage tvPage = new TVPage(driver);
        tvPage.clickSignUp().click();

        SignUpPage signUpPage = new SignUpPage(driver);
        sleep(1);
        signUpPage.getInput().sendKeys("54543666");
        signUpPage.clickConfirm().click();

        sleep(3);
        Assert.assertTrue(signUpPage.getErrorText().isDisplayed());

        signUpPage.getBtnClose().click();

        moyoHomePage.getBtnBasket().click();

        BasketMoyoPage basketMoyoPage = new BasketMoyoPage(driver);

        sleep(2);
        Assert.assertTrue(basketMoyoPage.getWordBasket().getText().contains("Кошик"));

    }
}
