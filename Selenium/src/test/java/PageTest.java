import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class PageTest {
    private WebDriver driver;
    JavascriptExecutor js;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "./resources/GoogleDriver/chromedriver.exe");
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void pageTest() {
        driver.get("https://playground.learnqa.ru/puzzle/triangle");
        List<WebElement> elements1 = driver.findElements(By.id("show_answ"));
        assert(elements1.size() > 0);
        driver.findElement(By.id("show_answ")).click();
        List<WebElement> elements2 = driver.findElements(By.linkText("Ссылка на ответы"));
        assert(elements2.size() > 0);
        List<WebElement> elements3 = driver.findElements(By.id("hide_answ"));
        assert(elements3.size() > 0);
    }
}
