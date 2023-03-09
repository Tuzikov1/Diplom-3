package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
    private final WebDriver driver;

    //Input Name
    private By nameInput=By.xpath(".//form[@class='Auth_form__3qKeq mb-20']/fieldset[1]//descendant::input[@class='text input__textfield text_type_main-default']");
    //Input Email
    private By emailInput=By.xpath(".//form[@class='Auth_form__3qKeq mb-20']/fieldset[2]//descendant::input[@class='text input__textfield text_type_main-default']");
    //Input Password
    private By passwordInput=By.xpath(".//div[@class='input pr-6 pl-6 input_type_password input_size_default']/input[@class='text input__textfield text_type_main-default']");
    //Кнопка "Зарегистрироваться"
    private By registrationButton=By.xpath(".//button[@class='button_button__33qZ0 button_button_type_primary__1O7Bx button_button_size_medium__3zxIa']");
    //Сообщение об ошибки о длине пароля
    private By inputError=By.xpath(".//p[@class='input__error text_type_main-default']");
    //Кнопка "Войти"
    private By inputEnter=By.xpath(".//a[@class='Auth_link__1fOlj']");




    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    public void dataFilingForRegistrationAndApprove(String name,String email,String password){
     driver.findElement(nameInput).sendKeys(name);
     driver.findElement(emailInput).sendKeys(email);
     driver.findElement(passwordInput).sendKeys(password);
     driver.findElement(registrationButton).click();
    }
   public boolean isDisplayedInputError() {return driver.findElement(inputError).isDisplayed();}
    public void clickInputEnter(){
        driver.findElement(inputEnter).click();
    }
}
