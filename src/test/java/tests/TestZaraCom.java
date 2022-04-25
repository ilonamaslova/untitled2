package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.BasketPage;
import pageObjects.FirstPage;

public class TestZaraCom extends TestInit{

    @Test
    public void checkFirstPageZara(){

        FirstPage firstPage = new FirstPage(driver);

        firstPage.navigation();
        firstPage.clickBtnOne().click();
        firstPage.clickBtn().click();

        Assert.assertTrue(firstPage.getTextPochatiSeans().isDisplayed());
        Assert.assertTrue(firstPage.getTextDopomoga().isDisplayed());
        Assert.assertTrue(firstPage.getTextPoshuk().isDisplayed());
        firstPage.clickBasket().click();

        BasketPage basketPage = new BasketPage(driver);

        sleep(4);
        Assert.assertTrue(basketPage.getTextForCustomer().getText().contains("ВАШ КОШИК ПОРОЖНІЙ"));

    }
}
