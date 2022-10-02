import elementsOfMainPages.LocatorsImportantQuestions;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
@RunWith(Parameterized.class)
public class TestImportantQuestions {
    WebDriver driver;
    LocatorsImportantQuestions locImportantQuestion ;
    private final String question;
    private final String answer;
    public TestImportantQuestions(String question, String answer){
        this.question = question;
        this.answer = answer;
    }
    @Parameterized.Parameters
    public static Object[][] getParameters() {
        return new Object[][]{
                {"accordion__heading-0", "accordion__panel-0"},
                {"accordion__heading-1", "accordion__panel-1"},
                {"accordion__heading-2", "accordion__panel-2"},
                {"accordion__heading-3", "accordion__panel-3"},
                {"accordion__heading-4", "accordion__panel-4"},
                {"accordion__heading-5", "accordion__panel-5"},
                {"accordion__heading-6", "accordion__panel-6"},
                {"accordion__heading-7", "accordion__panel-7"}
        };
    }
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
    public void answerShow (){
        locImportantQuestion.question_Click(question);
        Assert.assertTrue(locImportantQuestion.answer_IsDisplayed(answer));
    }

    @After
    public void closeBrowser(){
       driver.quit();
    }
}
