package elementsOfMainPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LocatorsImportantQuestions {
    WebDriver driver;
    Waits waits;
    //Вопросы и ответы о важном переместились в параметры теста

    //конструктор класса
    public LocatorsImportantQuestions(WebDriver driver){
        this.driver = driver;
        waits = new Waits(this.driver);
    }

    //  Вопрос - ответ

    public void question_Click(String question) {
        By element = By.id(question);
        waits.scrollToElement(element);
        waits.waitWhileElementToBeClickable(element);
        driver.findElement(element).click();
    }
    public boolean answer_IsDisplayed(String answer){
        By element = By.id(answer);
        return driver.findElement(element).isDisplayed();
    }
}
