package ru.omsu.imit;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    WebDriver driver;
    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "./resources/GoogleDriver/chromedriver.exe");
        driver = new ChromeDriver();
    }
}
