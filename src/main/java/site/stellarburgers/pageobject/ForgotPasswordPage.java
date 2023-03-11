package site.stellarburgers.pageobject;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {
    private final WebDriver driver;
    //Кнопка "Войти"
    private final By buttonEnter = By.xpath(".//a[@class='Auth_link__1fOlj']");

    public ForgotPasswordPage(WebDriver driver) {

        this.driver = driver;
    }

    @Step("Клик по кнопке Вход")
    public void clickButtonEnter() {
        driver.findElement(buttonEnter).click();
    }

}
