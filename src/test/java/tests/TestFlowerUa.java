package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.MainFlowerPage;
import pageObjects.MuscariPage;
import pageObjects.SnowdropPage;

public class TestFlowerUa extends TestInit{

    @Test
    public void checkElementsOnSite(){
        MainFlowerPage mainFlowerPage = new MainFlowerPage(driver);
        mainFlowerPage.navigation();

        Assert.assertTrue(mainFlowerPage.getImg().isDisplayed());
        Assert.assertTrue(mainFlowerPage.getElementHome().isDisplayed());
        Assert.assertTrue(driver.getTitle().contains("Flower"));
        Assert.assertTrue(mainFlowerPage.getElementHowToBuy().isDisplayed());
        Assert.assertTrue(mainFlowerPage.getElementContacts().isDisplayed());

        mainFlowerPage.clickOnSnowdrop().click();

        SnowdropPage snowdropPage = new SnowdropPage(driver);

        sleep(4);
        Assert.assertTrue(snowdropPage.getWordsSnowdrop().getText().contains("Подснежник (Galanthus), Галантус"));
        Assert.assertTrue(snowdropPage.getCopiright().isDisplayed());
        snowdropPage.clickOnMuscari().click();

        MuscariPage muscariPage = new MuscariPage(driver);

        sleep(4);
        Assert.assertTrue(muscariPage.getWordsMuscari().getText().contains("Мускари (Muscаri)"));

        muscariPage.getPriceFrom().sendKeys("100");
        muscariPage.getPriceTo().sendKeys("300");
        muscariPage.clickProducerHolland().click();
        muscariPage.clickTuckUp().click();

        sleep(3);
        Assert.assertTrue(muscariPage.getTextForCustomer().getText().contains("По заданным параметрам не найден ни один товар"));

    }
        }
