package TestForGoogleChrome;

import org.junit.Assert;
import org.junit.Test;
import util.DataForTestsChrome;


public class RegistrationTest extends DataForTestsChrome {
    @Test
    public void registrationSuccess(){
        mainPage.openPageAndClickCabinet();
        loginPage.clickButtonRegistration();
        registerPage.dataFilingForRegistrationAndApprove(nameForRegistration,emailForRegistration,passwordForRegistration);
       boolean result=loginPage.isDisplayedEnterButton();
        Assert.assertTrue("Не удалось зарегистрироваться", result);

    }
    @Test
    public void registrationWithIncorrectPassword(){
        mainPage.openPageAndClickCabinet();
        loginPage.clickButtonRegistration();
        registerPage.dataFilingForRegistrationAndApprove(nameForRegistration,emailForRegistration,"12345");
        boolean result=registerPage.isDisplayedInputError();
       Assert.assertTrue("Не сработала валидация на длину пароля при регистрации", result);
    }
}
