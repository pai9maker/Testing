package ru.omsu.imit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PageObject {
    WebDriver driver;
    WebDriverWait wait;

    public PageObject(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void open(){
        driver.get("https://playground.learnqa.ru/puzzle/triangle");
    }

    @FindBy(id = "show_answ")
    private WebElement showAnswer;
    @FindBy(linkText = "Ссылка на ответы")
    private WebElement answerLink;
    @FindBy(id = "hide_answ")
    private WebElement hideAnswer;

    public boolean isShowAnswerButtonExist(){
        return showAnswer.isDisplayed();
    }

    public boolean isLinkForAnswerExist(){
        showAnswer.click();
        wait.until(ExpectedConditions.elementToBeClickable(answerLink));
        return answerLink.isDisplayed();
    }

    public boolean isHideAnswerButtonExist(){
        return hideAnswer.isDisplayed();
    }

}
