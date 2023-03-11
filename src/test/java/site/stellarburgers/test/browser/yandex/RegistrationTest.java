package site.stellarburgers.test.browser.yandex;

import io.qameta.allure.junit4.DisplayName;
import org.junit.Assert;
import org.junit.Test;
import site.stellarburgers.test.data.DataForTestsYandex;


public class RegistrationTest extends DataForTestsYandex {
    @Test
    @DisplayName("Успешная регистрация")
    public void registrationSuccess() {
        mainPage.openPageAndClickCabinet();
        loginPage.clickButtonRegistration();
        registerPage.dataFilingForRegistrationAndApprove(nameForRegistration, emailForRegistration, passwordForRegistration);
        boolean result = loginPage.isDisplayedEnterButton();
        Assert.assertTrue("Не удалось зарегистрироваться", result);
    }

    @Test
    @DisplayName("Регистрация с некорректным паролем")
    public void registrationWithIncorrectPassword() {
        mainPage.openPageAndClickCabinet();
        loginPage.clickButtonRegistration();
        registerPage.dataFilingForRegistrationAndApprove(nameForRegistration, emailForRegistration, "12345");
        boolean result = registerPage.isDisplayedInputError();
        Assert.assertTrue("Не сработала валидация на длину пароля при регистрации", result);

    }
}
