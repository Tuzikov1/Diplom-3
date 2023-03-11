package site.stellarburgers.pageobject;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
    private final WebDriver driver;
    //Кнопка "Личный кабинет"
    private final By personalCabinet = By.xpath(".//p[@class='AppHeader_header__linkText__3q_va ml-2' and text()='Личный Кабинет']");
    //Кнопка "Войти в аккаунт"
    private final By buttonEnterInAccount = By.xpath(".//button[@class='button_button__33qZ0 button_button_type_primary__1O7Bx button_button_size_large__G21Vg']");
    //Кнопка "Конструктор" в хедере страницы
    private final By constructorButton = By.xpath(".//p[@class='AppHeader_header__linkText__3q_va ml-2' and text()='Конструктор']");
    //Заголовок конструктора "Соберите бургер"
    private final By headerConstructor = By.xpath(".//h1[@class='text text_type_main-large mb-5 mt-10']");
    //Кнопка "Булки" в конструкторе
    private final By bunButton = By.xpath(".//span[@class='text text_type_main-default' and text()='Булки']");
    //Кнопка "Соус" в конструкторе
    private final By sauceButton = By.xpath(".//span[@class='text text_type_main-default' and text()='Соусы']");
    //Кнопка "Соус" в конструкторе
    private final By ingredientsButton = By.xpath(".//span[@class='text text_type_main-default' and text()='Начинки']");
    //Заголовок "булки" в конструкторе
    private final By bunHeader = By.xpath(".//h2[@class='text text_type_main-medium mb-6 mt-10'and text()='Булки']");
    //Заголовок "Соусы" в конструкторе
    private final By sauceHeader = By.xpath(".//h2[@class='text text_type_main-medium mb-6 mt-10'and text()='Соусы']");
    //Заголовок "булки" в конструкторе
    private final By ingredientsHeader = By.xpath(".//h2[@class='text text_type_main-medium mb-6 mt-10'and text()='Начинки']");

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Открытие страницы, клик по ЛК")
    public void openPageAndClickCabinet() {
        openBrowser();
        driver.findElement(personalCabinet).click();
    }

    @Step("Клик по ЛК")
    public void openPersonalCabinet() {
        driver.findElement(personalCabinet).click();
    }

    @Step("Открытие страницы, клик по кнопке вход в аккаунт")
    public void openPageAndClickButtonEnterInAccount() {
        openBrowser();
        driver.findElement(buttonEnterInAccount).click();
    }

    @Step("Клик по кнопке Конструктор")
    public void clickConstructorButton() {
        driver.findElement(constructorButton).click();
    }

    @Step("Конструктор. Клик по Булки")
    public void clickBunButton() {
        driver.findElement(bunButton).click();
    }

    @Step("Конструктор. Клик по Соус")
    public void clickSauceButton() {
        driver.findElement(sauceButton).click();
    }

    @Step("Конструктор. Клик по Начинка")
    public void clickIngredientsButton() {
        driver.findElement(ingredientsButton).click();
    }

    @Step("Проверка отображения Конструктора")
    public boolean isDisplayedHeaderConstructor() {
        return driver.findElement(headerConstructor).isDisplayed();
    }

    @Step("Конструктор. Проверка отображения раздела Булки")
    public boolean isDisplayedBunHeader() {
        return driver.findElement(bunHeader).isDisplayed();
    }

    @Step("Конструктор. Проверка отображения раздела Соус")
    public boolean isDisplayedSauceHeader() {
        return driver.findElement(sauceHeader).isDisplayed();
    }

    @Step("Конструктор. Проверка отображения раздела Начинки")
    public boolean isDisplayedIngredientsHeader() {
        return driver.findElement(ingredientsHeader).isDisplayed();
    }

    @Step("Открытие страницы")
    public void openBrowser() {
        driver.get("https://stellarburgers.nomoreparties.site/");
    }
}
