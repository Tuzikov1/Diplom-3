package site.stellarburgers.test.browser.yandex;

import io.qameta.allure.junit4.DisplayName;
import org.junit.Assert;
import org.junit.Test;
import site.stellarburgers.test.data.DataForTestsYandex;


public class EnterInAccountFromDifferentPointsAndExitTest extends DataForTestsYandex {
    @Test
    @DisplayName("Вход в профиль через кнопку Личный кабинет")
    public void enterThroughPersonalCabinet() {
        mainPage.openPageAndClickCabinet();
        loginPage.fillingDataAndClickEnter(EMAIL, PASSWORD);
        mainPage.openPersonalCabinet();
        boolean result = profilePage.isDisplayedExitButton();
        Assert.assertTrue("Не удалось войти в учетную запись", result);
    }

    @Test
    @DisplayName("Вход в профиль через кнопку Войти в аккаунт")
    public void enterThroughButtonEnterInAccount() {
        mainPage.openPageAndClickButtonEnterInAccount();
        loginPage.fillingDataAndClickEnter(EMAIL, PASSWORD);
        mainPage.openPersonalCabinet();
        boolean result = profilePage.isDisplayedExitButton();
        Assert.assertTrue("Не удалось войти в учетную запись", result);

    }

    @Test
    @DisplayName("Вход в профиль через форму регистрации")
    public void enterThroughFormRegistration() {
        mainPage.openPageAndClickCabinet();
        loginPage.clickButtonRegistration();
        registerPage.clickInputEnter();
        loginPage.fillingDataAndClickEnter(EMAIL, PASSWORD);
        mainPage.openPersonalCabinet();
        boolean result = profilePage.isDisplayedExitButton();
        Assert.assertTrue("Не удалось войти в учетную запись", result);
    }

    @Test
    @DisplayName("Вход в профиль через восстановление пароля")
    public void enterThroughForgotPassword() {
        mainPage.openPageAndClickCabinet();
        loginPage.clickForgotPasswordButton();
        forgotPasswordPage.clickButtonEnter();
        loginPage.fillingDataAndClickEnter(EMAIL, PASSWORD);
        mainPage.openPersonalCabinet();
        boolean result = profilePage.isDisplayedExitButton();
        Assert.assertTrue("Не удалось войти в учетную запись", result);
    }

    @Test
    @DisplayName("Выход из личного кабинета")
    public void exitFromPersonalAccount() {
        mainPage.openPageAndClickButtonEnterInAccount();
        loginPage.fillingDataAndClickEnter(EMAIL, PASSWORD);
        mainPage.openPersonalCabinet();
        profilePage.clickExitButton();
        boolean result = loginPage.isDisplayedEnterButton();
        Assert.assertTrue("Не удалось выйти из учетной записи", result);
    }
}
