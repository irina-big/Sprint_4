package elementsOfMainPages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LocatorsImportantQuestions {
    WebDriver driver;
    Waits waits;
    //Вопросы о важном
    private By  question0 = By.id("accordion__heading-0");
    private By  question1 = By.id("accordion__heading-1");
    private By  question2 = By.id("accordion__heading-2");
    private By  question3 = By.id("accordion__heading-3");
    private By  question4 = By.id("accordion__heading-4");
    private By  question5 = By.id("accordion__heading-5");
    private By  question6 = By.id("accordion__heading-6");
    private By  question7 = By.id("accordion__heading-7");

    //Ответы
    private By  answer0 = By.id("accordion__panel-0");
    private By  answer1 = By.id("accordion__panel-1");
    private By  answer2 = By.id("accordion__panel-2");
    private By  answer3 = By.id("accordion__panel-3");
    private By  answer4 = By.id("accordion__panel-4");
    private By  answer5 = By.id("accordion__panel-5");
    private By  answer6 = By.id("accordion__panel-6");
    private By  answer7 = By.id("accordion__panel-7");


    //конструктор класса
    public LocatorsImportantQuestions(WebDriver driver){
        this.driver = driver;
        waits = new Waits(this.driver);
    }
    //Вопрос-ответ 0
    public void question0_Click() {
        waits.scrollToElement(question0);
        waits.waitWhileElementToBeClickable(question0);
        driver.findElement(question0).click();
    }
    public boolean answer0_IsDisplayed(){
        return driver.findElement(answer0).isDisplayed();
    }


    //Вопрос-ответ 1
    public void question1_Click() {
        waits.scrollToElement(question1);
        waits.waitWhileElementToBeClickable(question1);
        driver.findElement(question1).click();
    }
    public boolean answer1_IsDisplayed(){
        return driver.findElement(answer1).isDisplayed();
    }


    //Вопрос-ответ 2
    public void question2_Click() {
        waits.scrollToElement(question2);
        waits.waitWhileElementToBeClickable(question2);
        driver.findElement(question2).click();
    }
    public boolean answer2_IsDisplayed(){
        return driver.findElement(answer2).isDisplayed();
    }

    //Вопрос-ответ 3
    public void question3_Click() {
        waits.scrollToElement(question3);
        waits.waitWhileElementToBeClickable(question3);
        driver.findElement(question3).click();
    }
    public boolean answer3_IsDisplayed(){
        return driver.findElement(answer3).isDisplayed();
    }

    //Вопрос-ответ 4
    public void question4_Click() {
        waits.scrollToElement(question4);
        waits.waitWhileElementToBeClickable(question4);
        driver.findElement(question4).click();
    }
    public boolean answer4_IsDisplayed(){
        return driver.findElement(answer4).isDisplayed();
    }


    //Вопрос-ответ 5
    public void question5_Click() {
        waits.scrollToElement(question5);
        waits.waitWhileElementToBeClickable(question5);
        driver.findElement(question5).click();
    }
    public boolean answer5_IsDisplayed(){
        return driver.findElement(answer5).isDisplayed();
    }

    //Вопрос-ответ 6
    public void question6_Click() {
        waits.scrollToElement(question6);
        waits.waitWhileElementToBeClickable(question6);
        driver.findElement(question6).click();
    }
    public boolean answer6_IsDisplayed(){
        return driver.findElement(answer6).isDisplayed();
    }

    //Вопрос-ответ 7
    public void question7_Click() {
        waits.scrollToElement(question7);
        waits.waitWhileElementToBeClickable(question7);
        driver.findElement(question7).click();
    }
    public boolean answer7_IsDisplayed(){
        return driver.findElement(answer7).isDisplayed();
    }


}
