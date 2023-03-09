package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class MainPage {
    private final WebDriver driver;
    //Кнопка "Личный кабинет"
    private By personalCabinet =By.xpath(".//p[@class='AppHeader_header__linkText__3q_va ml-2' and text()='Личный Кабинет']");
    //Кнопка "Войти в аккаунт"
   private By buttonEnterInAccount=By.xpath(".//button[@class='button_button__33qZ0 button_button_type_primary__1O7Bx button_button_size_large__G21Vg']");
    //Кнопка "Конструктор" в хедере страницы
    private By constructorButton=By.xpath(".//p[@class='AppHeader_header__linkText__3q_va ml-2' and text()='Конструктор']");
    //Заголовок конструктора "Соберите бургер"
    private By headerConstructor=By.xpath(".//h1[@class='text text_type_main-large mb-5 mt-10']");
    //Кнопка "Булки" в конструкторе
    private By bunButton=By.xpath(".//span[@class='text text_type_main-default' and text()='Булки']");
    //Кнопка "Соус" в конструкторе
    private By sauceButton=By.xpath(".//span[@class='text text_type_main-default' and text()='Соусы']");
    //Кнопка "Соус" в конструкторе
    private By ingredientsButton=By.xpath(".//span[@class='text text_type_main-default' and text()='Начинки']");
    //Заголовок "булки" в конструкторе
    private By bunHeader=By.xpath(".//h2[@class='text text_type_main-medium mb-6 mt-10'and text()='Булки']");
    //Заголовок "Соусы" в конструкторе
    private By sauceHeader=By.xpath(".//h2[@class='text text_type_main-medium mb-6 mt-10'and text()='Соусы']");
    //Заголовок "булки" в конструкторе
    private By ingredientsHeader=By.xpath(".//h2[@class='text text_type_main-medium mb-6 mt-10'and text()='Начинки']");

    public MainPage(WebDriver driver) {

     this.driver = driver;
    }
    public void openPageAndClickCabinet (){
    openBrowser();
    driver.findElement(personalCabinet).click();}
    public void openPersonalCabinet(){
    driver.findElement(personalCabinet).click();}
    public void openPageAndClickButtonEnterInAccount(){
    openBrowser();
    driver.findElement(buttonEnterInAccount).click();}
    public void clickConstructorButton(){
        driver.findElement(constructorButton).click();
    }
    public void clickBunButton(){
    driver.findElement(bunButton).click();}
    public void clickSauceButton(){
    driver.findElement(sauceButton).click();}
    public void clickIngredientsButton(){
    driver.findElement(ingredientsButton).click();}
    public boolean isDisplayedHeaderConstructor() {return driver.findElement(headerConstructor).isDisplayed();}
    public boolean isDisplayedBunHeader() {return driver.findElement(bunHeader).isDisplayed();}
    public boolean isDisplayedSauceHeader() {return driver.findElement(sauceHeader).isDisplayed();}
    public boolean isDisplayedIngredientsHeader() {return driver.findElement(ingredientsHeader).isDisplayed();}
    public void openBrowser(){driver.get("https://stellarburgers.nomoreparties.site/");}
}
