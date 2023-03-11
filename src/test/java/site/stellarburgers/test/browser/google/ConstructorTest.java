package site.stellarburgers.test.browser.google;

import io.qameta.allure.junit4.DisplayName;
import org.junit.Assert;
import org.junit.Test;
import site.stellarburgers.test.data.DataForTestsChrome;

public class ConstructorTest extends DataForTestsChrome {
    @Test
    @DisplayName("Вход в конструктор через личный кабинет")
    public void enterInConstructorFromPersonalCabinet() {
        mainPage.openPageAndClickCabinet();
        loginPage.fillingDataAndClickEnter(EMAIL, PASSWORD);
        mainPage.openPersonalCabinet();
        mainPage.clickConstructorButton();
        boolean result = mainPage.isDisplayedHeaderConstructor();
        Assert.assertTrue("Не удалось перейти в конструктор из личного кабинета", result);

    }

    @Test
    @DisplayName("Конструктор. Переход к разделу соусы")
    public void goToSectionSauces() {
        mainPage.openBrowser();
        mainPage.clickSauceButton();
        boolean result = mainPage.isDisplayedSauceHeader();
        Assert.assertTrue("В конструкторе не осуществлен переход к разделу Соусы", result);
    }

    @Test
    @DisplayName("Конструктор. Переход к разделу начинка")
    public void goToSectionIngredients() {
        mainPage.openBrowser();
        mainPage.clickIngredientsButton();
        boolean result = mainPage.isDisplayedIngredientsHeader();
        Assert.assertTrue("В конструкторе не осуществлен переход к разделу Начинки", result);
    }

    @Test
    @DisplayName("Конструктор. Переход к разделу булка")
    public void goToSectionBun() {
        mainPage.openBrowser();
        mainPage.clickIngredientsButton();
        mainPage.clickBunButton();
        boolean resultBun = mainPage.isDisplayedBunHeader();
        Assert.assertTrue("В конструкторе не осуществлен переход к разделу Булки", resultBun);
    }
}
