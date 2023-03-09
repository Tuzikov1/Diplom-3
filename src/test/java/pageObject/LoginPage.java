package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class LoginPage {
    private final WebDriver driver;
    //Инпут Email
    private By emailInput=By.xpath(".//input[@class='text input__textfield text_type_main-default' and @type='text']");
    //Инпут Password
    private By passwordInput=By.xpath(".//input[@class='text input__textfield text_type_main-default' and @type='password']");
    //Кнопка "Войти"
    private By enterButton=By.xpath(".//button[@class='button_button__33qZ0 button_button_type_primary__1O7Bx button_button_size_medium__3zxIa']");
    //Кнопка "Зарегистрироваться"
    private By registerButton =By.className("Auth_link__1fOlj");
    //Кнопка "Восстановить пароль"
    private By forgotPasswordButton=By.xpath(".//a[@class='Auth_link__1fOlj' and text()='Восстановить пароль']");


    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickButtonRegistration(){
        driver.findElement(registerButton).click();
    }
    public void clickForgotPasswordButton(){
        driver.findElement(forgotPasswordButton).click();
    }

    public boolean isDisplayedEnterButton() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        return driver.findElement(enterButton).isDisplayed();}

    public void fillingDataAndClickEnter(String email, String password){
        driver.findElement(emailInput).sendKeys(email);
        driver.findElement(passwordInput).sendKeys(password);
        driver.findElement(enterButton).click();}

}
