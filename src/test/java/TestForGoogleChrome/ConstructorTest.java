package TestForGoogleChrome;

import org.junit.Assert;
import org.junit.Test;

import util.DataForTestsChrome;


public class ConstructorTest extends DataForTestsChrome {
    @Test
    public void enterInConstructorFromPersonalCabinet() {
        mainPage.openPageAndClickCabinet();
        loginPage.fillingDataAndClickEnter(EMAIL,PASSWORD);
        mainPage.openPersonalCabinet();
        mainPage.clickConstructorButton();
        boolean result = mainPage.isDisplayedHeaderConstructor();
        Assert.assertTrue("Не удалось перейти в конструктор из личного кабинета", result);

    }
    @Test
    public void goToSectionSauces() {
        mainPage.openBrowser();
        mainPage.clickSauceButton();
        boolean result=mainPage.isDisplayedSauceHeader();
        Assert.assertTrue("В конструкторе не осуществлен переход к разделу Соусы", result);
    }
    @Test
    public void goToSectionIngredients() {
        mainPage.openBrowser();
        mainPage.clickIngredientsButton();
        boolean result=mainPage.isDisplayedIngredientsHeader();
        Assert.assertTrue("В конструкторе не осуществлен переход к разделу Начинки", result);
    }
    @Test
    public void goToSectionBun() {
        mainPage.openBrowser();
        mainPage.clickIngredientsButton();
        mainPage.clickBunButton();
        boolean resultBun=mainPage.isDisplayedIngredientsHeader();
        Assert.assertTrue("В конструкторе не осуществлен переход к разделу Булки", resultBun);
    }
}
