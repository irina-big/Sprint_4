import elementsOfMainPages.LocatorsImportantQuestions;
import elementsOfMainPages.LocatorsMakeOrder;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

@RunWith(Parameterized.class)
public class TestMakeOrder {
        WebDriver driver;
        LocatorsMakeOrder locMakeOrder ;
        private final String name;
        private final String surname;
        private final String address;
        private final String phone;
        private final String date;

    public TestMakeOrder(String name, String surname,String address, String phone, String date) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.phone = phone;
        this.date = date;
    }
    @Parameterized.Parameters
    public static Object[][] getParameters() {
        return new Object[][] {
                {"Иван", "Петров", "проспект Космонавтов, 89", "89286665544", "23.10.2022"},
                {"Анна", "Снегова", "ул. Звездная, 8", "89286665544", "10.10.2022"},
                {"Вероника","Кознюк","ул. Тверская, 239","89110002233","23.10.2022"}
        };
    }
    @Before
        public void startDriver(){
            driver = new ChromeDriver();
            // driver = new FirefoxDriver();
            driver.get("https://qa-scooter.praktikum-services.ru/");
            locMakeOrder = new LocatorsMakeOrder(driver);
        }
    @Test
    public void testMakeOrderTop(){
        locMakeOrder.buttonMakeOrderTop_click();
        locMakeOrder.fieldEnterName_fill(name);
        locMakeOrder.fieldEnterSurname_fill(surname);
        locMakeOrder.fieldEnterAddress_fill(address);
        locMakeOrder.fieldEnterPhone_fill(phone);
        locMakeOrder.fieldEnterMetro_fill();
        locMakeOrder.buttonNext_click();
        locMakeOrder.fieldEnterDate_fill(date);
        locMakeOrder.fieldEnterRentalPeriod_fill();
        locMakeOrder.buttonMakeOrderBottom_click();
        locMakeOrder.buttonYes_click();
        Assert.assertTrue(locMakeOrder.orderSuccessCreated_isDisplayed());
    }
    @Test
    public void testMakeOrderBottom(){
        locMakeOrder.buttonMakeOrderBottom_click();
        locMakeOrder.fieldEnterName_fill(name);
        locMakeOrder.fieldEnterSurname_fill(surname);
        locMakeOrder.fieldEnterAddress_fill(address);
        locMakeOrder.fieldEnterPhone_fill(phone);
        locMakeOrder.fieldEnterMetro_fill();
        locMakeOrder.buttonNext_click();
        locMakeOrder.fieldEnterDate_fill(date);
        locMakeOrder.fieldEnterRentalPeriod_fill();
        locMakeOrder.buttonMakeOrderBottom_click();
        locMakeOrder.buttonYes_click();
        Assert.assertTrue(locMakeOrder.orderSuccessCreated_isDisplayed());
    }
       @After
       public void closeBrowser(){
         driver.quit();
       }
    }



