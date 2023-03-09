package util;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pageObject.*;

import java.util.Random;

public class DataForTestsChrome {
    protected static WebDriver driver;
    //Данные зарегистрированного пользователя для входа
    protected final String EMAIL = "test1991@ya.ru";
    protected final String PASSWORD = "Glacier23";
    //Данные для регистрации
    protected String nameForRegistration = "Ivan Petrov" + new Random().nextInt(999);
    protected String emailForRegistration = "family" + new Random().nextInt(999) + "@mail.ru";
    protected String passwordForRegistration = "Password" + new Random().nextInt(999);
    //Создание объектов Page
    protected MainPage mainPage;
    protected LoginPage loginPage;
    protected ProfilePage profilePage;
    protected RegisterPage registerPage;
    protected ForgotPasswordPage forgotPasswordPage;

    @Before
    public void setUp() {
        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--remote-allow-origins=*","--headless");
        driver = new ChromeDriver(ops);
        mainPage = new MainPage(driver);
        loginPage = new LoginPage(driver);
        profilePage = new ProfilePage(driver);
        registerPage = new RegisterPage(driver);
        forgotPasswordPage = new ForgotPasswordPage(driver);
    }
    @After
    public void closeChrome() {

        driver.quit();
    }
}

