package elementsOfMainPages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class LocatorsMakeOrder {
    WebDriver driver;
    Waits waits;

    //******* Поля для ввода *******
    //поле для ввода имени
    private final By fieldEnterName = By.xpath(".//input[@placeholder='* Имя']");
    //поле для ввода фамилии
    private final By fieldEnterSurname = By.xpath(".//input[@placeholder='* Фамилия']");
    //поле для ввода адреса
    private final By fieldEnterAddress = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");
    //поле для ввода телефона
    private final By fieldEnterPhone = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");
    //поле для ввода метро
    private final By fieldEnterMetro = By.xpath(".//input[@placeholder='* Станция метро']");

    //станция метро Чистые пруды
    private final By itemOfListMetro = By.xpath(".//div[@class='select-search__select']/ul/li[8]");

    //поле для ввода даты
    private final By fieldEnterDate = By.xpath(".//input[@placeholder='* Когда привезти самокат']");
    //поле для выбора срока аренды
    private final By fieldEnterRentalPeriod = By.xpath(".//div[@class='Dropdown-control']");
    //список периодов (5 суток)
    private final By listRentalPeriod = By.xpath(".//div[@class='Dropdown-menu']/div[5]");
    //Заказ оформлен
    private final By orderSuccessCreated = By.xpath(".//div[@class='Order_ModalHeader__3FDaJ' and text() = 'Заказ оформлен']");
    //******** Кнопки ************
    //кнопка ЗАКАЗАТЬ вверху страницы
    private final By buttonMakeOrderTop = By.xpath(".//button[@class='Button_Button__ra12g']");
    //кнопка ЗАКАЗАТЬ внизу страницы
    private final By buttonMakeOrderBottom = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    //кнопка ДАЛЕЕ
    private final By buttonNext = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM' and text()='Далее']");
    //кнопка ДА
    private final By buttonYes = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM' and text()='Да']");

    //конструктор класса
    public LocatorsMakeOrder(WebDriver driver){
        this.driver = driver;
        waits = new Waits(this.driver);
    }
    //*********** Методы ***************
    public void buttonMakeOrderTop_click() {
       driver.findElement(buttonMakeOrderTop).click();
    }


    public void buttonMakeOrderBottom_click(){
        waits.scrollToElement(buttonMakeOrderBottom);
        waits.waitWhileElementToBeClickable(buttonMakeOrderBottom);
        driver.findElement(buttonMakeOrderBottom).click();
    }
    public void buttonNext_click(){
        waits.waitWhileElementToBeClickable(buttonNext);
        driver.findElement(buttonNext).click();
    }
    public void buttonYes_click(){
        waits.waitWhileElementToBeClickable(buttonYes);
        driver.findElement(buttonYes).click();
    }


    public void fieldEnterName_fill(String name){
        driver.findElement(fieldEnterName).clear();
        driver.findElement(fieldEnterName).sendKeys(name);
    }

    public void fieldEnterSurname_fill(String surname){
        driver.findElement(fieldEnterSurname).clear();
        driver.findElement(fieldEnterSurname).sendKeys(surname);
    }

    public void fieldEnterAddress_fill(String address){
        driver.findElement(fieldEnterAddress).clear();
        driver.findElement(fieldEnterAddress).sendKeys(address);
    }

    public void fieldEnterMetro_fill(){
        driver.findElement(fieldEnterMetro).click();
        waits.scrollToElement(itemOfListMetro);
        driver.findElement(itemOfListMetro).click();
    }
    public void fieldEnterPhone_fill(String phone){
        driver.findElement(fieldEnterPhone).clear();
        driver.findElement(fieldEnterPhone).sendKeys(phone);
    }

    public void fieldEnterDate_fill(String date){
        driver.findElement(fieldEnterDate).clear();
        driver.findElement(fieldEnterDate).sendKeys(date);
        driver.findElement(fieldEnterDate).sendKeys(Keys.ENTER);
    }

    public void fieldEnterRentalPeriod_fill(){
        driver.findElement(fieldEnterRentalPeriod).click();
        driver.findElement(listRentalPeriod).click();
    }

    public boolean orderSuccessCreated_isDisplayed(){
        try {
            return driver.findElement(orderSuccessCreated).isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

}
