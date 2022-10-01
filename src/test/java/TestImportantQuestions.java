import elementsOfMainPages.LocatorsImportantQuestions;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestImportantQuestions {
    WebDriver driver;
    LocatorsImportantQuestions locImportantQuestion ;
    @Before
    public void startDriver(){
        // драйвер для браузера Chrome
        driver = new ChromeDriver();
        // драйвер для браузера FireFox
        // driver = new FirefoxDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        locImportantQuestion = new LocatorsImportantQuestions(driver);
    }
    @Test
    public void answerZeroShow (){
        locImportantQuestion.question0_Click();
        Assert.assertTrue(locImportantQuestion.answer0_IsDisplayed());
    }
    @Test
    public void answerOneShow (){
        locImportantQuestion.question1_Click();
        Assert.assertTrue(locImportantQuestion.answer1_IsDisplayed());
    }
    @Test
    public void answerTwoShow (){
        locImportantQuestion.question2_Click();
        Assert.assertTrue(locImportantQuestion.answer2_IsDisplayed());
    }

    @Test
    public void answerThreeShow (){
        locImportantQuestion.question3_Click();
        Assert.assertTrue(locImportantQuestion.answer3_IsDisplayed());
    }

    @Test
    public void answerFourShow (){
        locImportantQuestion.question4_Click();
        Assert.assertTrue(locImportantQuestion.answer4_IsDisplayed());
    }
    @Test
    public void answerFiveShow (){
        locImportantQuestion.question5_Click();
        Assert.assertTrue(locImportantQuestion.answer5_IsDisplayed());
    }

    @Test
    public void answerSixShow (){
        locImportantQuestion.question6_Click();
        Assert.assertTrue(locImportantQuestion.answer6_IsDisplayed());
    }

    @Test
    public void answerSevenShow (){
        locImportantQuestion.question7_Click();
        Assert.assertTrue(locImportantQuestion.answer7_IsDisplayed());
    }

    @After
    public void closeBrowser(){
       driver.quit();
    }
}
