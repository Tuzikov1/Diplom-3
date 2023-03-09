package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {
    private final WebDriver driver;
    //Кнопка "Войти"
    private By buttonEnter=By.xpath(".//a[@class='Auth_link__1fOlj']");


    public ForgotPasswordPage(WebDriver driver) {

        this.driver = driver;
    }

    public void clickButtonEnter(){
        driver.findElement(buttonEnter).click();
    }

}
