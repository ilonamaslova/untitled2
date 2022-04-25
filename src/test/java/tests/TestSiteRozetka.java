package tests;

import org.checkerframework.checker.units.qual.A;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.MainPage;
import pageObjects.MenuPage;
import pageObjects.PhonePage;

public class TestSiteRozetka extends TestInit{

    @Test
    public void checkElementsMainPage(){
        MainPage mainPage = new MainPage(driver);

        mainPage.navigation();

        Assert.assertTrue(mainPage.getMenuBtn().isDisplayed());
        Assert.assertTrue(mainPage.getLogoRozetka().isDisplayed());
        Assert.assertTrue(mainPage.getSearchBtn().isDisplayed());
        mainPage.getInputText().sendKeys("phone\n");

        PhonePage phonePage = new PhonePage(driver);

        Assert.assertTrue(phonePage.getTextPhone().getText().contains("«phone»"));
        Assert.assertTrue(phonePage.getBtnMenu().isDisplayed());
        Assert.assertTrue(phonePage.getBtnLangUA().isDisplayed());
        phonePage.clickBtnMenu().click();

        MenuPage menuPage = new MenuPage(driver);

        Assert.assertTrue(menuPage.getElementLi().isDisplayed());
        Assert.assertTrue(menuPage.getElementLiTelefonyElectronika().isDisplayed());
    }
}
