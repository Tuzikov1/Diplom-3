package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import java.time.Duration;


public class ProfilePage {
    private final WebDriver driver;
    //Кнопка "Профиль"
    private By exitButton=By.xpath(".//button[@class='Account_button__14Yp3 text text_type_main-medium text_color_inactive']");
    public ProfilePage(WebDriver driver) {
        this.driver = driver;
    }
    public boolean isDisplayedExitButton() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        return driver.findElement(exitButton).isDisplayed();}

    public void clickExitButton(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(exitButton).click();}
}
