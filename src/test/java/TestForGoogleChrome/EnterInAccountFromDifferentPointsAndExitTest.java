package TestForGoogleChrome;

import org.junit.Assert;
import org.junit.Test;

import util.DataForTestsChrome;


public class EnterInAccountFromDifferentPointsAndExitTest extends DataForTestsChrome {

    @Test
    public void enterThroughPersonalCabinet(){
        mainPage.openPageAndClickCabinet();
        loginPage.fillingDataAndClickEnter(EMAIL,PASSWORD);
        mainPage.openPersonalCabinet();
        boolean result = profilePage.isDisplayedExitButton();
        Assert.assertTrue("Не удалось войти в учетную запись", result);
    }
    @Test
    public void enterThroughButtonEnterInAccount(){
        mainPage.openPageAndClickButtonEnterInAccount();
        loginPage.fillingDataAndClickEnter(EMAIL,PASSWORD);
        mainPage.openPersonalCabinet();
        boolean result = profilePage.isDisplayedExitButton();
        Assert.assertTrue("Не удалось войти в учетную запись", result);
    }
    @Test
    public void enterThroughFormRegistration(){
        mainPage.openPageAndClickCabinet();
        loginPage.clickButtonRegistration();
        registerPage.clickInputEnter();
        loginPage.fillingDataAndClickEnter(EMAIL,PASSWORD);
        mainPage.openPersonalCabinet();
        boolean result = profilePage.isDisplayedExitButton();
        Assert.assertTrue("Не удалось войти в учетную запись", result);
    }
    @Test
    public void enterThroughForgotPassword(){
        mainPage.openPageAndClickCabinet();
        loginPage.clickForgotPasswordButton();
        forgotPasswordPage.clickButtonEnter();
        loginPage.fillingDataAndClickEnter(EMAIL,PASSWORD);
        mainPage.openPersonalCabinet();
        boolean result = profilePage.isDisplayedExitButton();
        Assert.assertTrue("Не удалось войти в учетную запись", result);
    }
    @Test
    public void exitFromPersonalAccount(){
        mainPage.openPageAndClickButtonEnterInAccount();
        loginPage.fillingDataAndClickEnter(EMAIL,PASSWORD);
        mainPage.openPersonalCabinet();
        profilePage.clickExitButton();
        boolean result = loginPage.isDisplayedEnterButton();
        Assert.assertTrue("Не удалось выйти из учетной записи", result);

    }
}
